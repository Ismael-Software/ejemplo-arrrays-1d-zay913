class Persona:
    def __init__(self, nombre, apaterno, edad):
        self.nombre = nombre
        self.apaterno = apaterno
        self.edad = edad

    def saludar(self):
        print("¡HOLA!")

    def mostrarInfo(self):
        print("Nombre:", self.nombre, "Apellido:", self.apaterno, "Edad:", self.edad)
        print("-------------------")

    def comer(self):
        print("Estoy comiendo")

profesor = Persona("Luis", "Gress", 25)
alumno = Persona("Zayuri", "Vargas", 17)
vendedor = Persona("Jamileth", "Mayorga", 20)

profesor.saludar()
profesor.comer()
profesor.mostrarInfo()

alumno.saludar()
alumno.comer()
alumno.mostrarInfo()

vendedor.saludar()
vendedor.comer()
vendedor.mostrarInfo()

