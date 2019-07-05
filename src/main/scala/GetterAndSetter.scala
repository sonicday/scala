class Person() {
  // Private age variable, renamed to _age
  private var _age = 0

  // Getter
  def age = _age

  // Setter
  // translates to def age_$eq(value: Int): Unit = _age = if (value.$greater(30)) 30 else value;
  def age$eq(value: Int): Unit = _age = 2000

  // translates to def age$eq(value: Int): Unit = _age = 2000
  def age_= (value:Int):Unit = _age = if(value > 30) 30 else value

}

object GetterAndSetter {
  def main(args: Array[String]): Unit = {
    val person = new Person()
    // translates to person.age = 99;
    person.age = 99
    // yields 30
    println(person.age)

    // translates to person.age = 99;
    person.age=99
    // yields 30
    println(person.age)

    // translates to person.age$eq(99);
    person.age$eq(99)
    // yields 2000
    println(person.age)
  }
}
