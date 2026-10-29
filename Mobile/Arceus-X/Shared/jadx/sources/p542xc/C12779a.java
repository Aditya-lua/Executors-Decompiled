package p542xc;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.core.graphics.C0546c;
import p101ed.C5049b;
import p194ic.C6738b;
import p463uc.C11840a;

/* JADX INFO: renamed from: xc.a */
/* JADX INFO: loaded from: classes2.dex */
public class C12779a {

    /* JADX INFO: renamed from: f */
    public static final int f45510f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a */
    public final boolean f45511a;

    /* JADX INFO: renamed from: b */
    public final int f45512b;

    /* JADX INFO: renamed from: c */
    public final int f45513c;

    /* JADX INFO: renamed from: d */
    public final int f45514d;

    /* JADX INFO: renamed from: e */
    public final float f45515e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12779a(@NonNull Context context) {
        this(C5049b.m23731b(context, C6738b.f25912s, false), C11840a.m44226b(context, C6738b.f25911r, 0), C11840a.m44226b(context, C6738b.f25910q, 0), C11840a.m44226b(context, C6738b.f25908o, 0), context.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: a */
    public float m47639a(float f10) {
        float f11 = this.f45515e;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* JADX INFO: renamed from: b */
    public int m47640b(int i10, float f10) {
        int i11;
        float fM47639a = m47639a(f10);
        int iAlpha = Color.alpha(i10);
        int iM44234j = C11840a.m44234j(C0546c.m2678l(i10, 255), this.f45512b, fM47639a);
        if (fM47639a > 0.0f && (i11 = this.f45513c) != 0) {
            iM44234j = C11840a.m44233i(iM44234j, C0546c.m2678l(i11, f45510f));
        }
        return C0546c.m2678l(iM44234j, iAlpha);
    }

    /* JADX INFO: renamed from: c */
    public int m47641c(int i10, float f10) {
        return (this.f45511a && m47643e(i10)) ? m47640b(i10, f10) : i10;
    }

    /* JADX INFO: renamed from: d */
    public boolean m47642d() {
        return this.f45511a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m47643e(int i10) {
        return C0546c.m2678l(i10, 255) == this.f45514d;
    }

    public C12779a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f45511a = z10;
        this.f45512b = i10;
        this.f45513c = i11;
        this.f45514d = i12;
        this.f45515e = f10;
    }
}
