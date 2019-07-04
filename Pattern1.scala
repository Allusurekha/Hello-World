object Pattern1 {
  var i = 1
  var j = 0

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 6) {
      for (j <- 1 to i) {
        if (i == 5)
          println("*" * j)

      }
      println(" ")
    }
  }
}

   /* while (i < 6) {
      while (j < i) {
        if (i == 5)
          println(" *" * j)
        j = j + 1
      }
      i = i + 1
      j = 0
      println(" ")
    }
  }
}*/
