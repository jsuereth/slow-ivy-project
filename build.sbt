import Helper._

val p1 = complexProject("p1")

val p2 = complexProject("p2").dependsOn(p1)

val p3 = complexProject("p3").dependsOn(p1)

val p4 = complexProject("p4").dependsOn(p1,p3)

val p5 = complexProject("p5").dependsOn(p4)

val p6 = complexProject("p6").dependsOn(p3,p4)

val p7 = complexProject("p7").dependsOn(p1)

val p8 = complexProject("p8").dependsOn(p6,p7)

val p9 = complexProject("p9").dependsOn(p5)

val p10 = complexProject("p10").dependsOn(p7,p8,p9)
