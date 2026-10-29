package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import backtraceio.library.services.BacktraceMetrics;

/* JADX INFO: renamed from: androidx.recyclerview.widget.l */
/* JADX INFO: loaded from: classes.dex */
public class C1061l extends RecyclerView.AbstractC1013a0 {

    /* JADX INFO: renamed from: k */
    @SuppressLint({"UnknownNullness"})
    public PointF f4306k;

    /* JADX INFO: renamed from: l */
    public final DisplayMetrics f4307l;

    /* JADX INFO: renamed from: n */
    public float f4309n;

    /* JADX INFO: renamed from: i */
    public final LinearInterpolator f4304i = new LinearInterpolator();

    /* JADX INFO: renamed from: j */
    public final DecelerateInterpolator f4305j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: m */
    public boolean f4308m = false;

    /* JADX INFO: renamed from: o */
    public int f4310o = 0;

    /* JADX INFO: renamed from: p */
    public int f4311p = 0;

    @SuppressLint({"UnknownNullness"})
    public C1061l(Context context) {
        this.f4307l = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: A */
    public final float m5987A() {
        if (!this.f4308m) {
            this.f4309n = mo5993v(this.f4307l);
            this.f4308m = true;
        }
        return this.f4309n;
    }

    /* JADX INFO: renamed from: B */
    public int m5988B() {
        PointF pointF = this.f4306k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.y;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: C */
    public void m5989C(RecyclerView.AbstractC1013a0.a aVar) {
        PointF pointFMo5368a = mo5368a(m5373f());
        if (pointFMo5368a == null || (pointFMo5368a.x == 0.0f && pointFMo5368a.y == 0.0f)) {
            aVar.m5387b(m5373f());
            m5385r();
            return;
        }
        m5376i(pointFMo5368a);
        this.f4306k = pointFMo5368a;
        this.f4310o = (int) (pointFMo5368a.x * 10000.0f);
        this.f4311p = (int) (pointFMo5368a.y * 10000.0f);
        aVar.m5389d((int) (this.f4310o * 1.2f), (int) (this.f4311p * 1.2f), (int) (mo5995x(BacktraceMetrics.defaultTimeBetweenRetriesMs) * 1.2f), this.f4304i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1013a0
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: l */
    public void mo5379l(int i10, int i11, RecyclerView.C1015b0 c1015b0, RecyclerView.AbstractC1013a0.a aVar) {
        if (m5370c() == 0) {
            m5385r();
            return;
        }
        this.f4310o = m5996y(this.f4310o, i10);
        int iM5996y = m5996y(this.f4311p, i11);
        this.f4311p = iM5996y;
        if (this.f4310o == 0 && iM5996y == 0) {
            m5989C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1013a0
    /* JADX INFO: renamed from: m */
    public void mo5380m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1013a0
    /* JADX INFO: renamed from: n */
    public void mo5381n() {
        this.f4311p = 0;
        this.f4310o = 0;
        this.f4306k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1013a0
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: o */
    public void mo5382o(View view, RecyclerView.C1015b0 c1015b0, RecyclerView.AbstractC1013a0.a aVar) {
        int iMo5991t = mo5991t(view, m5997z());
        int iMo5992u = mo5992u(view, m5988B());
        int iM5994w = m5994w((int) Math.sqrt((iMo5991t * iMo5991t) + (iMo5992u * iMo5992u)));
        if (iM5994w > 0) {
            aVar.m5389d(-iMo5991t, -iMo5992u, iM5994w, this.f4305j);
        }
    }

    /* JADX INFO: renamed from: s */
    public int m5990s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: t */
    public int mo5991t(View view, int i10) {
        RecyclerView.AbstractC1034q abstractC1034qM5372e = m5372e();
        if (abstractC1034qM5372e == null || !abstractC1034qM5372e.mo5191p()) {
            return 0;
        }
        RecyclerView.C1035r c1035r = (RecyclerView.C1035r) view.getLayoutParams();
        return m5990s(abstractC1034qM5372e.m5584V(view) - ((ViewGroup.MarginLayoutParams) c1035r).leftMargin, abstractC1034qM5372e.m5588Y(view) + ((ViewGroup.MarginLayoutParams) c1035r).rightMargin, abstractC1034qM5372e.m5606i0(), abstractC1034qM5372e.m5627s0() - abstractC1034qM5372e.m5608j0(), i10);
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: u */
    public int mo5992u(View view, int i10) {
        RecyclerView.AbstractC1034q abstractC1034qM5372e = m5372e();
        if (abstractC1034qM5372e == null || !abstractC1034qM5372e.mo5193q()) {
            return 0;
        }
        RecyclerView.C1035r c1035r = (RecyclerView.C1035r) view.getLayoutParams();
        return m5990s(abstractC1034qM5372e.m5589Z(view) - ((ViewGroup.MarginLayoutParams) c1035r).topMargin, abstractC1034qM5372e.m5581T(view) + ((ViewGroup.MarginLayoutParams) c1035r).bottomMargin, abstractC1034qM5372e.m5611k0(), abstractC1034qM5372e.m5592b0() - abstractC1034qM5372e.m5604h0(), i10);
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: v */
    public float mo5993v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: w */
    public int m5994w(int i10) {
        return (int) Math.ceil(((double) mo5995x(i10)) / 0.3356d);
    }

    /* JADX INFO: renamed from: x */
    public int mo5995x(int i10) {
        return (int) Math.ceil(Math.abs(i10) * m5987A());
    }

    /* JADX INFO: renamed from: y */
    public final int m5996y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    /* JADX INFO: renamed from: z */
    public int m5997z() {
        PointF pointF = this.f4306k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.x;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }
}
