package ariefhermawan.k_super_keyword;

class Vehicle {
    String name;

    boolean needsOil() {
        return false;
    }

    boolean hasICEEngine() {
        return false;
    }

    int getTotalTyre() {
        return 0;
    }
}

class MobilMPVICE extends Vehicle {
    String name;
    boolean needsOil;
    boolean hasICEEngine;
    int totalTyre;

    MobilMPVICE(String name, boolean needsOil, boolean hasICEEngine, int getTotalTyre) {
        this.name = name;
        this.needsOil = needsOil;
        this.hasICEEngine = hasICEEngine;
        this.totalTyre = getTotalTyre;
    }

    MobilMPVICE(String name, boolean needsOil, boolean hasICEEngine) {
        this(name, needsOil, hasICEEngine, 0);
    }

    MobilMPVICE(String name, boolean needsOil) {
        this(name, needsOil, false, 0);
    }

    MobilMPVICE(String name) {
        this(name, false, false, 0);
    }

    MobilMPVICE() {
        this(null, false, false, 0);
    }

    String name() {
        return this.name;
    }

    void name(String name) {
        this.name = name;
    }

    String parentName() {
        /**
        if (super.name == null) {
            return super.name = "Belum Ada";
        } else {
            return super.name;
        }
        */
        if (super.name == null) return super.name = "Belum Ada";
        else return super.name;

    }

    void parentName(String name) {
        super.name = name;
    }

    boolean needsOil() {
        return this.needsOil;
    }

    boolean hasICEEngine() {
        return this.hasICEEngine;
    }

    int totalTyre() {
        return this.totalTyre;
    }

    void lihatProperties() {
        System.out.println("\t" + "Mobil " + this.name);
        System.out.println("\t\t" + "Butuh Oli? " + this.needsOil());
        System.out.println("\t\t" + "Punya mesin Pembakaran dalam? " + this.hasICEEngine());
        System.out.println("\t\t" + "Jumlah roda " + this.getTotalTyre());
        System.out.println("\t" + "Nama parent " + this.parentName());
    }
}

class MobilMPVICEToyota extends MobilMPVICE {
    float ukuranMesin = 0;
    int jumlahSilinder = 0;

    /// Constructors Function
    MobilMPVICEToyota(float ukuranMesin, int jumlahSilinder, String name) {
        this.jumlahSilinder = jumlahSilinder;
        this.ukuranMesin = ukuranMesin;
        super.name = name;
    }

    MobilMPVICEToyota(float ukuranMesin, int jumlahSilinder) {
        this(ukuranMesin, jumlahSilinder, "Belum ada");
    }

    MobilMPVICEToyota(float ukuranMesin) {
        this(ukuranMesin, 0, "Belum ada");
    }

    MobilMPVICEToyota() {
        this(0, 0, "Belum ada");
    }

    /// Non-Constructors Function
    float getEngineDisplacement() {
        return this.ukuranMesin;
    }

    int getTotalEngineCylinder() {
        return this.jumlahSilinder;
    }

    void lihatProperties() {
        this.lihatParentProperties();
        System.out.println("\t\t\t" + "Ukuran mesin: " + this.getEngineDisplacement());
        System.out.println("\t\t\t" + "Jumlah ruang bakar: " + this.getTotalEngineCylinder());
    }

    void lihatParentProperties() {
        super.lihatProperties();
    }
}

class InstantiateObject {
    public static void main(String[] args) {
        /// Class MobilMPVICE
        {
            MobilMPVICE mpv = new MobilMPVICE();
            mpv.name = "Mobil MPV ICE";
            mpv.lihatProperties();
        }

        /// Class MobilMPVICEToyota
        {
            MobilMPVICEToyota innova = new MobilMPVICEToyota((float) 2.4, 4, "Innova");
            innova.lihatProperties();

            MobilMPVICEToyota mpvLagi = new MobilMPVICEToyota((float) 2.0, 4);
            mpvLagi.lihatProperties();

            MobilMPVICEToyota mpvLagiLagi = new MobilMPVICEToyota((float) 2.0);
            mpvLagiLagi.lihatProperties();

            MobilMPVICEToyota mpvLagiDanLagi = new MobilMPVICEToyota();
            mpvLagiDanLagi.lihatProperties();
            mpvLagiDanLagi.lihatParentProperties();
        }
    }
}