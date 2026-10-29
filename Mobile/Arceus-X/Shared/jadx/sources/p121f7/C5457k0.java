package p121f7;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: f7.k0 */
/* JADX INFO: loaded from: classes3.dex */
public class C5457k0 {

    /* JADX INFO: renamed from: a */
    public final int f21131a;

    /* JADX INFO: renamed from: b */
    public final int f21132b;

    /* JADX INFO: renamed from: c */
    public final String f21133c;

    /* JADX INFO: renamed from: d */
    public final String f21134d;

    /* JADX INFO: renamed from: e */
    public final String f21135e;

    /* JADX INFO: renamed from: f */
    public Bitmap f21136f;

    public C5457k0(int i10, int i11, String str, String str2, String str3) {
        this.f21131a = i10;
        this.f21132b = i11;
        this.f21133c = str;
        this.f21134d = str2;
        this.f21135e = str3;
    }

    /* JADX INFO: renamed from: a */
    public C5457k0 m25060a(float f10) {
        C5457k0 c5457k0 = new C5457k0((int) (this.f21131a * f10), (int) (this.f21132b * f10), this.f21133c, this.f21134d, this.f21135e);
        Bitmap bitmap = this.f21136f;
        if (bitmap != null) {
            c5457k0.m25066g(Bitmap.createScaledBitmap(bitmap, c5457k0.f21131a, c5457k0.f21132b, true));
        }
        return c5457k0;
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m25061b() {
        return this.f21136f;
    }

    /* JADX INFO: renamed from: c */
    public String m25062c() {
        return this.f21134d;
    }

    /* JADX INFO: renamed from: d */
    public int m25063d() {
        return this.f21132b;
    }

    /* JADX INFO: renamed from: e */
    public String m25064e() {
        return this.f21133c;
    }

    /* JADX INFO: renamed from: f */
    public int m25065f() {
        return this.f21131a;
    }

    /* JADX INFO: renamed from: g */
    public void m25066g(Bitmap bitmap) {
        this.f21136f = bitmap;
    }
}
