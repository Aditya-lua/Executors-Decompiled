package f7;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16410a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f16414f;

    public k0(int i10, int i11, String str, String str2, String str3) {
        this.f16410a = i10;
        this.b = i11;
        this.f16411c = str;
        this.f16412d = str2;
        this.f16413e = str3;
    }

    public k0 a(float f10) {
        k0 k0Var = new k0((int) (this.f16410a * f10), (int) (this.b * f10), this.f16411c, this.f16412d, this.f16413e);
        Bitmap bitmap = this.f16414f;
        if (bitmap != null) {
            k0Var.g(Bitmap.createScaledBitmap(bitmap, k0Var.f16410a, k0Var.b, true));
        }
        return k0Var;
    }

    public Bitmap b() {
        return this.f16414f;
    }

    public String c() {
        return this.f16412d;
    }

    public int d() {
        return this.b;
    }

    public String e() {
        return this.f16411c;
    }

    public int f() {
        return this.f16410a;
    }

    public void g(Bitmap bitmap) {
        this.f16414f = bitmap;
    }
}
