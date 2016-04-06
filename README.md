# spring-junit-handson
This is a practice project to learn and understand Spring framework.
This repository is:

1. A spring repository with dynamic functionalities added and removed through build.gradle. 
2. updated with basic test routines that are written with Junit libraries and spring test framework.

In the first commit we have auto wiring aspects of spring tested. Look at the 
@Component, @Configuration, @ComponentScan, and @Autowired being demonstrated in:

```java
/*
https://raw.githubusercontent.com/aksinghdce/spring-junit-handson/master/src/main/java/com/eagree/CDPlayer.java
https://www.evernote.com/shard/s479/sh/1b8dfa27-18ab-4a91-9b68-14ab6b961af2/8202a7686ab489a1c980551adfc9b15e
*/
package com.eagree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  @Autowired
  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  @Autowired
  public void play() {
    cd.play();
  }

}
```

The autowire functionality of Spring is tested with Junit test routine. Please note the usage of SystemOutRule

```java
package com.eagree;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {

  @Rule
  public final SystemOutRule log = new SystemOutRule();

  
  @Autowired
  private CompactDisc cd;
  
  @Autowired
  private MediaPlayer player;
  
  
  @Test
  public void cdShouldNotBeNull() {
    assertNotNull(cd);
  }
  
  @Test
  public void playerShouldNotBeNull() {
	  assertNotNull(player);
  }

  @Test
  public void play() {
	  log.enableLog();
    player.play();
    assertEquals(
        "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n", 
        log.getLog());
  }

}
```
