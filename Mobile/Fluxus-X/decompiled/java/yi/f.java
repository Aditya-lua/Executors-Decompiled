package yi;

import java.util.ArrayList;
import ok.t;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ArrayList<f> f37888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f f37889d = new f("en_us", "en");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static f f37890e = new f("es_es", "es");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static f f37891f = new f("fr_fr", "fr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static f f37892g = new f("it_it", "it");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37893a;
    public String b;

    static {
        ArrayList<f> arrayList = new ArrayList<>();
        f37888c = arrayList;
        arrayList.add(f37889d);
        f37888c.add(f37890e);
        f37888c.add(f37891f);
        f37888c.add(f37892g);
        f37888c.add(new f("de_de", "de"));
        f37888c.add(new f("id_id", "id"));
        f37888c.add(new f("ja_jp", "ja"));
        f37888c.add(new f("ko_kr", "ko"));
        f37888c.add(new f("pt_br", "pt"));
        f37888c.add(new f("ru_ru", "ru"));
        f37888c.add(new f("th_th", "th"));
        f37888c.add(new f("tr_tr", "tr"));
        f37888c.add(new f("vi_vn", "vi"));
        f37888c.add(new f("zh_tw", "zh_TW"));
        if (t.j()) {
            f37888c.add(new f("zh_cjv", "zh_CN"));
        } else {
            f37888c.add(new f("zh_cn", "zh_CN"));
        }
    }

    public f(String str, String str2) {
        this.f37893a = str;
        this.b = str2;
    }

    public static f a(String str) {
        ArrayList<f> arrayList = f37888c;
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
        ArrayList<f> arrayList = f37888c;
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
        return this.f37893a;
    }

    public String toString() {
        return "LocaleValue{'" + this.f37893a + "','" + this.b + "'}";
    }
}
