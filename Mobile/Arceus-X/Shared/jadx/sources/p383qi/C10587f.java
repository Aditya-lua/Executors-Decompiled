package p383qi;

import java.util.ArrayList;
import p151gk.C6127t;

/* JADX INFO: renamed from: qi.f */
/* JADX INFO: loaded from: classes2.dex */
public class C10587f {

    /* JADX INFO: renamed from: c */
    public static ArrayList<C10587f> f37989c;

    /* JADX INFO: renamed from: d */
    public static C10587f f37990d = new C10587f("en_us", "en");

    /* JADX INFO: renamed from: e */
    public static C10587f f37991e = new C10587f("es_es", "es");

    /* JADX INFO: renamed from: f */
    public static C10587f f37992f = new C10587f("fr_fr", "fr");

    /* JADX INFO: renamed from: g */
    public static C10587f f37993g = new C10587f("it_it", "it");

    /* JADX INFO: renamed from: a */
    public String f37994a;

    /* JADX INFO: renamed from: b */
    public String f37995b;

    static {
        ArrayList<C10587f> arrayList = new ArrayList<>();
        f37989c = arrayList;
        arrayList.add(f37990d);
        f37989c.add(f37991e);
        f37989c.add(f37992f);
        f37989c.add(f37993g);
        f37989c.add(new C10587f("de_de", "de"));
        f37989c.add(new C10587f("id_id", "id"));
        f37989c.add(new C10587f("ja_jp", "ja"));
        f37989c.add(new C10587f("ko_kr", "ko"));
        f37989c.add(new C10587f("pt_br", "pt"));
        f37989c.add(new C10587f("ru_ru", "ru"));
        f37989c.add(new C10587f("th_th", "th"));
        f37989c.add(new C10587f("tr_tr", "tr"));
        f37989c.add(new C10587f("vi_vn", "vi"));
        f37989c.add(new C10587f("zh_tw", "zh_TW"));
        if (C6127t.m27094j()) {
            f37989c.add(new C10587f("zh_cjv", "zh_CN"));
        } else {
            f37989c.add(new C10587f("zh_cn", "zh_CN"));
        }
    }

    public C10587f(String str, String str2) {
        this.f37994a = str;
        this.f37995b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static C10587f m40604a(String str) {
        ArrayList<C10587f> arrayList = f37989c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            C10587f c10587f = arrayList.get(i10);
            i10++;
            C10587f c10587f2 = c10587f;
            if (c10587f2.m40606c().equals(str) || c10587f2.m40606c().equals(str.split("_")[0])) {
                return c10587f2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C10587f m40605b(String str) {
        ArrayList<C10587f> arrayList = f37989c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            C10587f c10587f = arrayList.get(i10);
            i10++;
            C10587f c10587f2 = c10587f;
            if (c10587f2.m40607d().equals(str)) {
                return c10587f2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public String m40606c() {
        return this.f37995b;
    }

    /* JADX INFO: renamed from: d */
    public String m40607d() {
        return this.f37994a;
    }

    public String toString() {
        return "LocaleValue{'" + this.f37994a + "','" + this.f37995b + "'}";
    }
}
