package rps

class Category {
    String name

    static constraints = {
        name(blank:false, unique: true)
    }

    String toString() {
        name
    }
}
