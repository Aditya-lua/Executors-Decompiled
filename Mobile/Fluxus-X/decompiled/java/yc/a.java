package yc;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.core.graphics.c;
import fd.b;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f37714f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37715a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f37718e;

    public a(@NonNull Context context) {
        this(b.b(context, jc.b.f20304s, false), vc.a.b(context, jc.b.f20303r, 0), vc.a.b(context, jc.b.f20302q, 0), vc.a.b(context, jc.b.f20300o, 0), context.getResources().getDisplayMetrics().density);
    }

    public float a(float f10) {
        float f11 = this.f37718e;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float fA = a(f10);
        int iAlpha = Color.alpha(i10);
        int iJ = vc.a.j(c.l(i10, 255), this.b, fA);
        if (fA > 0.0f && (i11 = this.f37716c) != 0) {
            iJ = vc.a.i(iJ, c.l(i11, f37714f));
        }
        return c.l(iJ, iAlpha);
    }

    public int c(int i10, float f10) {
        return (this.f37715a && e(i10)) ? b(i10, f10) : i10;
    }

    public boolean d() {
        return this.f37715a;
    }

    public final boolean e(int i10) {
        return c.l(i10, 255) == this.f37717d;
    }

    public a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f37715a = z10;
        this.b = i10;
        this.f37716c = i11;
        this.f37717d = i12;
        this.f37718e = f10;
    }
}
