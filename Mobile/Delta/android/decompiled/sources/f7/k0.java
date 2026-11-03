package f7;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17006a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f17010f;

    public k0(int i10, int i11, String str, String str2, String str3) {
        this.f17006a = i10;
        this.b = i11;
        this.f17007c = str;
        this.f17008d = str2;
        this.f17009e = str3;
    }

    public k0 a(float f10) {
        k0 k0Var = new k0((int) (this.f17006a * f10), (int) (this.b * f10), this.f17007c, this.f17008d, this.f17009e);
        Bitmap bitmap = this.f17010f;
        if (bitmap != null) {
            k0Var.g(Bitmap.createScaledBitmap(bitmap, k0Var.f17006a, k0Var.b, true));
        }
        return k0Var;
    }

    public Bitmap b() {
        return this.f17010f;
    }

    public String c() {
        return this.f17008d;
    }

    public int d() {
        return this.b;
    }

    public String e() {
        return this.f17007c;
    }

    public int f() {
        return this.f17006a;
    }

    public void g(Bitmap bitmap) {
        this.f17010f = bitmap;
    }
}
