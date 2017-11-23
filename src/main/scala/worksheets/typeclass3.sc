trait Displayable[A] {
  def display(a: A): Unit
}

case class MyClass(text: String)

def display[A](a: A)(implicit myTypeclass: Displayable[A]): Unit = myTypeclass.display(a)


val myClass = MyClass("hello")

implicit val myClassTCInst: Displayable[MyClass] = myCustomClass => println(myCustomClass.text)

display(myClass)