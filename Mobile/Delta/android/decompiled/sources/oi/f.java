package oi;

import ek.t;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ArrayList<f> f27914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f f27915d = new f("en_us", "en");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static f f27916e = new f("es_es", "es");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static f f27917f = new f("fr_fr", "fr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static f f27918g = new f("it_it", "it");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27919a;
    public String b;

    static {
        ArrayList<f> arrayList = new ArrayList<>();
        f27914c = arrayList;
        arrayList.add(f27915d);
        f27914c.add(f27916e);
        f27914c.add(f27917f);
        f27914c.add(f27918g);
        f27914c.add(new f("de_de", "de"));
        f27914c.add(new f("id_id", "id"));
        f27914c.add(new f("ja_jp", "ja"));
        f27914c.add(new f("ko_kr", "ko"));
        f27914c.add(new f("pt_br", "pt"));
        f27914c.add(new f("ru_ru", "ru"));
        f27914c.add(new f("th_th", "th"));
        f27914c.add(new f("tr_tr", "tr"));
        f27914c.add(new f("vi_vn", "vi"));
        f27914c.add(new f("zh_tw", "zh_TW"));
        if (t.j()) {
            f27914c.add(new f("zh_cjv", "zh_CN"));
        } else {
            f27914c.add(new f("zh_cn", "zh_CN"));
        }
    }

    public f(String str, String str2) {
        this.f27919a = str;
        this.b = str2;
    }

    public static f a(String str) {
        ArrayList<f> arrayList = f27914c;
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
        ArrayList<f> arrayList = f27914c;
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
        return this.f27919a;
    }

    public String toString() {
        return "LocaleValue{'" + this.f27919a + "','" + this.b + "'}";
    }
}
