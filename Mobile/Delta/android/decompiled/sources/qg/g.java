package qg;

import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pg.b f29860a;
    public pg.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pg.c f29861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29862d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f29863e;

    public static boolean b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public b a() {
        return this.f29863e;
    }

    public void c(pg.a aVar) {
        this.b = aVar;
    }

    public void d(int i10) {
        this.f29862d = i10;
    }

    public void e(b bVar) {
        this.f29863e = bVar;
    }

    public void f(pg.b bVar) {
        this.f29860a = bVar;
    }

    public void g(pg.c cVar) {
        this.f29861c = cVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(MlKitException.CODE_SCANNER_UNAVAILABLE);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f29860a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.b);
        sb2.append("\n version: ");
        sb2.append(this.f29861c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f29862d);
        if (this.f29863e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f29863e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
