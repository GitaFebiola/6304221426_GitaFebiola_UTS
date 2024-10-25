package id.ac.polbeng.gitafebiola.uts
//Gita Febiola 6304221426
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.gitafebiola.uts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLuas.setOnClickListener {
            LuasBalok()
        }

        binding.btnVolume.setOnClickListener {
            VolumeBalok()
        }
    }

    @SuppressLint("SetTextI18n")
    private fun LuasBalok() {
        val panjang = binding.inputPanjang.text.toString().toDoubleOrNull()
        val lebar = binding.inputLebar.text.toString().toDoubleOrNull()
        val tinggi = binding.inputTinggi.text.toString().toDoubleOrNull()

        if (panjang == null || lebar == null || tinggi == null) {
            binding.txtResult.text = "Input tidak valid"
            return
        }

        val luas = 2*(panjang*lebar + panjang*tinggi + lebar*tinggi)

        binding.txtResult.text = "Luas permukaan balok: $luas cm^2"
    }

    @SuppressLint("SetTextI18n")
    private fun VolumeBalok() {
        val panjang = binding.inputPanjang.text.toString().toDoubleOrNull()
        val lebar = binding.inputLebar.text.toString().toDoubleOrNull()
        val tinggi = binding.inputTinggi.text.toString().toDoubleOrNull()

        if (panjang == null || lebar == null || tinggi == null) {
            binding.txtResult.text = "Input tidak valid"
            return
        }

        val volume = panjang*lebar*tinggi

        binding.txtResult.text = "Volume balok: $volume cm^3"
    }
}
