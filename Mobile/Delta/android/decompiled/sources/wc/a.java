package wc;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.core.graphics.c;
import dd.b;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f34159f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34160a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f34163e;

    public a(@NonNull Context context) {
        this(b.b(context, hc.b.f18794s, false), tc.a.b(context, hc.b.f18793r, 0), tc.a.b(context, hc.b.f18792q, 0), tc.a.b(context, hc.b.f18790o, 0), context.getResources().getDisplayMetrics().density);
    }

    public float a(float f10) {
        float f11 = this.f34163e;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float fA = a(f10);
        int iAlpha = Color.alpha(i10);
        int iJ = tc.a.j(c.l(i10, 255), this.b, fA);
        if (fA > 0.0f && (i11 = this.f34161c) != 0) {
            iJ = tc.a.i(iJ, c.l(i11, f34159f));
        }
        return c.l(iJ, iAlpha);
    }

    public int c(int i10, float f10) {
        return (this.f34160a && e(i10)) ? b(i10, f10) : i10;
    }

    public boolean d() {
        return this.f34160a;
    }

    public final boolean e(int i10) {
        return c.l(i10, 255) == this.f34162d;
    }

    public a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f34160a = z10;
        this.b = i10;
        this.f34161c = i11;
        this.f34162d = i12;
        this.f34163e = f10;
    }
}
