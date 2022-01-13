package simple.example.fashionpedia.model;

import java.io.Serializable;

public class Fashion implements Serializable {
        private String model;
        private String merek;
        private String kain;
        private String deskripsi;
        private int drawableRes;

        public Fashion(String model, String merek, String kain, String deskripsi, int drawableRes) {
            this.model = model;
            this.merek = merek;
            this.kain = kain;
            this.deskripsi = deskripsi;
            this.drawableRes = drawableRes;
        }

    public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getMerek() {
            return merek;
        }

        public void setMerek(String merek) {
            this.merek = merek;
        }

        public String getKain() {
            return kain;
        }

        public void setkain(String kain) {
            this.kain = kain;
        }

        public String getDeskripsi() {
            return deskripsi;
        }

        public void setDeskripsi(String deskripsi) {
            this.deskripsi = deskripsi;
        }

        public int getDrawableRes() {
            return drawableRes;
        }

        public void setDrawableRes(int drawableRes) {
            this.drawableRes = drawableRes;
        }

}
