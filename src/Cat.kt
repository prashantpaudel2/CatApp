class Cat (val name: String, var age: Int, var weight: Int, val eat: String) {

    fun walk() {
        weight--
    }

    override fun toString(): String {
        return "Name: $name Age: $age"
    }
    fun eat(){
      weight++
    }

}
