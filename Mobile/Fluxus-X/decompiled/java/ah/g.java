package ah;

import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zg.b f458a;
    public zg.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zg.c f459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f460d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f461e;

    public static boolean b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public b a() {
        return this.f461e;
    }

    public void c(zg.a aVar) {
        this.b = aVar;
    }

    public void d(int i10) {
        this.f460d = i10;
    }

    public void e(b bVar) {
        this.f461e = bVar;
    }

    public void f(zg.b bVar) {
        this.f458a = bVar;
    }

    public void g(zg.c cVar) {
        this.f459c = cVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(MlKitException.CODE_SCANNER_UNAVAILABLE);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f458a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.b);
        sb2.append("\n version: ");
        sb2.append(this.f459c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f460d);
        if (this.f461e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f461e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
