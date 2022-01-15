package com.vanguard

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class VulnerableController {

  val logger: Logger = LoggerFactory.getLogger(VulnerableController::class.java)

  @GetMapping("/")
  fun defaultRoute(@RequestParam name: String) {
    logger.info("Logging {}", name)
  }

}