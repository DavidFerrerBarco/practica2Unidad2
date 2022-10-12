package david.ferrer.practica2unidad2

import android.app.Presentation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import david.ferrer.practica2unidad2.ui.theme.Practica2Unidad2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                imagenArbol()
                Presentation("Usuario")
                Spacer(modifier = Modifier.height(25.dp))
                Descripcion()
                Boton()
            }
        }
    }

    @Composable
    fun Presentation(name: String){
        Text(
            text = "Saludos $name",
            fontSize = 30.sp,
            color = Color.Black,
            fontFamily = nuevaFuente,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
    }

    @Composable
    fun Descripcion(){
        Text(
            text = "Nuestra organización se encarga en la reforestación de todos aquellos bosques que han sufrido. Por cada persona que se registre en nuestra página, plantamos 20 árboles en apoyo al planeta. De ti depende restaurar el ecosistema. ¡¡INGRESA CUANTO ANTES!!",
            color = Color.Black,
            fontSize = 20.sp,
            fontFamily = nuevaFuente,
            modifier = Modifier.width(300.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold
        )
    }

    val nuevaFuente = FontFamily(
        Font(R.font.mifuente)
    )

    @Composable
    fun imagenArbol(){
        Image(
            painter = painterResource(R.drawable.arbol),
            contentDescription ="Soy el arbol centenario" ,
            modifier = Modifier.height(150.dp)
        )
    }

    @Composable
    fun Boton(){
        Spacer(modifier = Modifier.padding(80.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "PULSE AQUÍ")
        }
    }

}