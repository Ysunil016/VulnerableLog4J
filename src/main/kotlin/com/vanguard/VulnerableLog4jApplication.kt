package com.vanguard

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VulnerableLog4jApplication

fun main(args: Array<String>) {
  runApplication<VulnerableLog4jApplication>(*args)
}
