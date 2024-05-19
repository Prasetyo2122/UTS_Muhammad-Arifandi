package com.example.pnjutstimuhammad_arifandi1.data.entity

import androidx.room.Entity
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(tableName = "user_table") // Menambahkan nama tabel
data class User(
    @PrimaryKey(autoGenerate = true) var nim: Int? = null,
    @ColumnInfo(name = "Nama_Alumni") var Nama_Alumni: String?, // Mengubah penamaan variabel sesuai konvensi Kotlin
    @ColumnInfo(name = "Tempat_Lahir") var Tempat_Lahir: String?,
    @ColumnInfo(name = "Tanggal_Lahir") var Tanggal_Lahir: String?,
    @ColumnInfo(name = "Alamat") var Alamat: String?,
    @ColumnInfo(name = "Agama") var Agama: String?,
    @ColumnInfo(name = "Telephone") var Telephone: String?,
    @ColumnInfo(name = "Tahun_Masuk") var Tahun_Masuk: String?,
    @ColumnInfo(name = "Tahun_Lulus") var Tahun_Lulus: String?,
    @ColumnInfo(name = "Pekerjaan") var Pekerjaan: String?,
    @ColumnInfo(name = "Jabatan") var Jabatan: String?
)
