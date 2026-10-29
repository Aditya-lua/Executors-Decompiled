package qi;

import gk.s;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ArrayList<f> f29410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f f29411d = new f("en_us", "en");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static f f29412e = new f("es_es", "es");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static f f29413f = new f("fr_fr", "fr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static f f29414g = new f("it_it", "it");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29415a;
    public String b;

    static {
        ArrayList<f> arrayList = new ArrayList<>();
        f29410c = arrayList;
        arrayList.add(f29411d);
        f29410c.add(f29412e);
        f29410c.add(f29413f);
        f29410c.add(f29414g);
        f29410c.add(new f("de_de", "de"));
        f29410c.add(new f("id_id", "id"));
        f29410c.add(new f("ja_jp", "ja"));
        f29410c.add(new f("ko_kr", "ko"));
        f29410c.add(new f("pt_br", "pt"));
        f29410c.add(new f("ru_ru", "ru"));
        f29410c.add(new f("th_th", "th"));
        f29410c.add(new f("tr_tr", "tr"));
        f29410c.add(new f("vi_vn", "vi"));
        f29410c.add(new f("zh_tw", "zh_TW"));
        if (s.j()) {
            f29410c.add(new f("zh_cjv", "zh_CN"));
        } else {
            f29410c.add(new f("zh_cn", "zh_CN"));
        }
    }

    public f(String str, String str2) {
        this.f29415a = str;
        this.b = str2;
    }

    public static f a(String str) {
        ArrayList<f> arrayList = f29410c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            f fVar = arrayList.get(i10);
            i10++;
            f fVar2 = fVar;
            if (fVar2.c().equals(str) || fVar2.c().equals(str.split("_")[0])) {
                return fVar2;
            }
        }
        return null;
    }

    public static f b(String str) {
        ArrayList<f> arrayList = f29410c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            f fVar = arrayList.get(i10);
            i10++;
            f fVar2 = fVar;
            if (fVar2.d().equals(str)) {
                return fVar2;
            }
        }
        return null;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.f29415a;
    }

    public String toString() {
        return "LocaleValue{'" + this.f29415a + "','" + this.b + "'}";
    }
}
