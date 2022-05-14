package com.naufalfakhrizakaria_19102074.pertemuan6

object DataSample {
    private val namaSample= arrayOf (
        "Baturaden",
        "Small World",
        "Watu Jajar",
        "Small World",
        "Watu Jajar"
    )

    private val deskripsiSample= arrayOf (
        "Desa wisata yang ada di Banyumas",
        "Miniatur dunia",
        "Pemandangan indah dari atas bukit",
        "Miniatur dunia",
        "Pemandangan indah dari atas bukit"
    )

    private val gambarSample= intArrayOf (
        R.drawable.baturaden_1,
        R.drawable.smallworld_1,
        R.drawable.watu_meja1,
        R.drawable.smallworld_1,
        R.drawable.watu_meja1
    )

    private val latSample= doubleArrayOf (
        -7.322898,
        -7.322898,
        -7.322898,
        -7.322898,
        -7.322898
    )

    private val longSample= doubleArrayOf (
        109.18544,
        109.18544,
        109.18544,
        109.18544,
        109.18544
    )

    val listData: ArrayList<DataClassWisata>
    get(){
        val listDataku = arrayListOf<DataClassWisata>()
        for(position in namaSample.indices){
            val data = DataClassWisata()
            data.namaWisata = namaSample[position]
            data.deskripsi = deskripsiSample[position]
            data.sampleImage = gambarSample[position]
            data.lat = latSample[position]
            data.long = longSample[position]
            listDataku.add(data)
        }
        return listDataku
    }
}