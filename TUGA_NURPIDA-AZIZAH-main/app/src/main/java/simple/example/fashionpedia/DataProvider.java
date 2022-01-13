package simple.example.fashionpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.fashionpedia.model.Fashion;
import simple.example.fashionpedia.model.Gamis;
import simple.example.fashionpedia.model.Hijab;
import simple.example.fashionpedia.model.Mukenah;

public class DataProvider {
    private static List<Fashion> fashions = new ArrayList<>();

    private static List<Gamis> initDataGamis(Context ctx) {
        List<Gamis> gamiss = new ArrayList<>();
        gamiss.add(new Gamis(ctx.getString(R.string.lengan_lonceng_merek), ctx.getString(R.string.lengan_lonceng_model),
                ctx.getString(R.string.lengan_lonceng_deskripsi), R.drawable.gamis_1));
        gamiss.add(new Gamis(ctx.getString(R.string.marwah_two_tone_merek), ctx.getString(R.string.marwah_two_tone_model),
                ctx.getString(R.string.marwah_two_tone_deskripsi), R.drawable.gamis_2));
        gamiss.add(new Gamis(ctx.getString(R.string.maxi_dress_merek), ctx.getString(R.string.maxi_dress_model),
                ctx.getString(R.string.maxi_dress_deskripsi), R.drawable.gamis_3));
        gamiss.add(new Gamis(ctx.getString(R.string.flowy_polos_merek), ctx.getString(R.string.flowy_polos__model),
                ctx.getString(R.string.flowy_polos_deskripsi), R.drawable.gamis_4));
        gamiss.add(new Gamis(ctx.getString(R.string.motif_stripes_merek), ctx.getString(R.string.motif_stripes_model),
                ctx.getString(R.string.motif_stripes_deskripsi), R.drawable.gamis_5));
        gamiss.add(new Gamis(ctx.getString(R.string.simpel_timeless_merek), ctx.getString(R.string.simpel_timeless_model),
                ctx.getString(R.string.simpel_timeless_deskripsi), R.drawable.gamis_6));
        return gamiss;
    }

    private static List<Hijab> initDataHijab(Context ctx) {
        List<Hijab> hijabs = new ArrayList<>();
        hijabs.add(new Hijab(ctx.getString(R.string.pasmina_merek), ctx.getString(R.string.pasmina_model),
                ctx.getString(R.string.pasmina_deskripsi), R.drawable.hijab_1));
        hijabs.add(new Hijab(ctx.getString(R.string.bergo_sport_merek), ctx.getString(R.string.bergo_sport_model),
                ctx.getString(R.string.bergo_sport_deskripsi), R.drawable.hijab_2));
        hijabs.add(new Hijab(ctx.getString(R.string.instan_syaria_merek), ctx.getString(R.string.instan_syaria_model),
                ctx.getString(R.string.instan_syaria_deskripsi), R.drawable.hijab_3));
        hijabs.add(new Hijab(ctx.getString(R.string.segitempat_merek), ctx.getString(R.string.segiempat_syari_model),
                ctx.getString(R.string.segitempat_deskripsi), R.drawable.hijab_4));
        hijabs.add(new Hijab(ctx.getString(R.string.bergo_non_pet_merek), ctx.getString(R.string.bergo_non_pet_model),
                ctx.getString(R.string.bergo_non_pet_deskripsi), R.drawable.hijab_5));
        hijabs.add(new Hijab(ctx.getString(R.string.segiempat_syari_merek), ctx.getString(R.string.segiempat_syari_model),
                ctx.getString(R.string.segiempat_syari_deskripsi), R.drawable.hijab_6));
        return hijabs;
    }
    private static List<Mukenah> initDataMukenah(Context ctx) {
        List<Mukenah> mukenahs = new ArrayList<>();
        mukenahs.add(new Mukenah(ctx.getString(R.string.maxmar_printing_merek), ctx.getString(R.string.maxmar_printing_model),
                ctx.getString(R.string.maxmar_printing_deskripsi), R.drawable.mukenah_1));
        mukenahs.add(new Mukenah(ctx.getString(R.string.rayon_renda_merek), ctx.getString(R.string.rayon_renda_model),
                ctx.getString(R.string.rayon_renda_deskripsi), R.drawable.mukenah_2));
        mukenahs.add(new Mukenah(ctx.getString(R.string.katun_printing_merek), ctx.getString(R.string.katun_printing_model),
                ctx.getString(R.string.katun_printing_deskripsi), R.drawable.mukenah_3));
        mukenahs.add(new Mukenah(ctx.getString(R.string.katun_rayon_merek), ctx.getString(R.string.katun_rayon_model),
                ctx.getString(R.string.katun_rayon_deskripsi), R.drawable.mukenah_4));
        mukenahs.add(new Mukenah(ctx.getString(R.string.katun_jumbo_merek), ctx.getString(R.string.katun_jumbo_model),
                ctx.getString(R.string.katun_jumbo_deskripsi), R.drawable.mukenah_5));
        mukenahs.add(new Mukenah(ctx.getString(R.string.bordir_renda_merek), ctx.getString(R.string.bordir_renda_model),
                ctx.getString(R.string.bordir_renda_deskripsi), R.drawable.mukenah_6));
        return mukenahs;
    }


    private static void initAllFashions(Context ctx) {
        fashions.addAll(initDataGamis(ctx));
        fashions.addAll(initDataHijab(ctx));
        fashions.addAll(initDataMukenah(ctx));
    }

    public static List<Fashion> getAllFashion(Context ctx) {
        if (fashions.size() == 0) {
            initAllFashions(ctx);
        }
        return  fashions;
    }

    public static List<Fashion> getFashionsByTipe(Context ctx, String model) {
        List<Fashion> fashionsByType = new ArrayList<>();
        if (fashions.size() == 0) {
            initAllFashions(ctx);
        }
        for (Fashion h : fashions) {
            if (h.getModel().equals(model)) {
                fashionsByType.add(h);
            }
        }
        return fashionsByType;
    }

}
