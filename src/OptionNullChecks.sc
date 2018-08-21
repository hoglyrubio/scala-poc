val employees = Set("Hogly", "Ruth", "Juan", "Daniela", "Santi")

employees.find(_ == "Ruth")
employees.find(_ == "Ruth").get

employees.find(_ == "other")
employees.find(_ == "other").getOrElse("default")
employees.find(_ == "other").get
