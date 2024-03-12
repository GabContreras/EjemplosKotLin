package gabriel.contreras.myapplicationfdsfasdfasdfasdf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.NullPointerException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //1- Variables

        var dia: String
        var edad: Int= 24
        var velocidad: Double
        var temperatura: Float = 30.9f

        //2- Valores (Constantes)

        val numeroPi: Double = 3.141592
        val DUI: String= "01234567-4"
        val fechaNacimiento: String = "29 de julio del 99"

        //3 - Variables nulas
        var telefono: Int? = null //el simbolo "?" comprueba si la variable es nula, al tenerlo, esta variable puede contener valores nulos
        //PERO!!!!!!!!!!!!!!!!!!!!! primero comprueba si es nulo o no, para que la aplicación no se cierre.

        //4  Clases
        //5 Funciones
        //5.1 Funciones con retorno

        //C#
        //public Int multiplicar(Int num1, Int num2){
        //}

        //6- Objetos
        // en C# es:
        // Calculadora cal= new Calculadora();

        val objCalculadora = Calculadora()
        objCalculadora.sumar( 2,4)


        val objCalc = Calculadora()
        objCalc.sumar(2,4)
        println()

        val DiegoJ = Usuario()

        DiegoJ.darlike()
        DiegoJ.follow()

        val objGabriela = Usuario()
        objGabriela.follow()
        objGabriela.darlike()



        val objConectar = Conexion()
        objConectar.conectarDB()


        //7. Arrays
        val listado = arrayOf("leche","pan",23,"harina")


    }

    //4- Clases
    //Ejemplos de clases
    class Personas{

    }
    class Animales{

    }
    class newUser{

        val nombre: String? = null
    }
    class Conexión{
        val nombreDB: String? = null
    }
}