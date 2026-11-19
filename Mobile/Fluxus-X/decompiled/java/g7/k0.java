package g7;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17489a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f17493f;

    public k0(int i10, int i11, String str, String str2, String str3) {
        this.f17489a = i10;
        this.b = i11;
        this.f17490c = str;
        this.f17491d = str2;
        this.f17492e = str3;
    }

    public k0 a(float f10) {
        k0 k0Var = new k0((int) (this.f17489a * f10), (int) (this.b * f10), this.f17490c, this.f17491d, this.f17492e);
        Bitmap bitmap = this.f17493f;
        if (bitmap != null) {
            k0Var.g(Bitmap.createScaledBitmap(bitmap, k0Var.f17489a, k0Var.b, true));
        }
        return k0Var;
    }

    public Bitmap b() {
        return this.f17493f;
    }

    public String c() {
        return this.f17491d;
    }

    public int d() {
        return this.b;
    }

    public String e() {
        return this.f17490c;
    }

    public int f() {
        return this.f17489a;
    }

    public void g(Bitmap bitmap) {
        this.f17493f = bitmap;
    }
}
