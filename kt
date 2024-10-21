// Definisi class Produk
class Produk(
    val nama: String, 
    val harga: Double, 
    var stok: Int
) {
    // Fungsi untuk menampilkan detail produk
    fun tampilkanDetailProduk() {
        println("Nama Produk: $nama")
        println("Harga Produk: Rp$harga")
        println("Stok Produk: $stok")
    }
    
    // Fungsi untuk mengurangi stok saat produk dibeli
    fun beliProduk(jumlah: Int) {
        if (jumlah <= stok) {
            stok -= jumlah
            println("Berhasil membeli $jumlah $nama.")
            println("Stok tersisa: $stok")
        } else {
            println("Stok tidak mencukupi. Stok saat ini: $stok")
        }
    }
}

// Fungsi main
fun main() {
    // Membuat objek produk
    val produk1 = Produk("Laptop", 15000000.0, 10)
    
    // Menampilkan detail produk
    produk1.tampilkanDetailProduk()
    
    // Simulasi pembelian produk
    produk1.beliProduk(3)
    
    // Menampilkan detail produk setelah pembelian
    produk1.tampilkanDetailProduk()
}
