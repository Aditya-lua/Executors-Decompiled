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

/* JADX INFO: loaded from: classes.dex */
public class l extends RecyclerView.a0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    public PointF f3272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f3273l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f3275n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f3270i = new LinearInterpolator();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f3271j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3274m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3276o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3277p = 0;

    @SuppressLint({"UnknownNullness"})
    public l(Context context) {
        this.f3273l = context.getResources().getDisplayMetrics();
    }

    public final float A() {
        if (!this.f3274m) {
            this.f3275n = v(this.f3273l);
            this.f3274m = true;
        }
        return this.f3275n;
    }

    public int B() {
        PointF pointF = this.f3272k;
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
    public void C(RecyclerView.a0.a aVar) {
        PointF pointFA = a(f());
        if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(pointFA);
        this.f3272k = pointFA;
        this.f3276o = (int) (pointFA.x * 10000.0f);
        this.f3277p = (int) (pointFA.y * 10000.0f);
        aVar.d((int) (this.f3276o * 1.2f), (int) (this.f3277p * 1.2f), (int) (x(BacktraceMetrics.defaultTimeBetweenRetriesMs) * 1.2f), this.f3270i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    @SuppressLint({"UnknownNullness"})
    public void l(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f3276o = y(this.f3276o, i10);
        int iY = y(this.f3277p, i11);
        this.f3277p = iY;
        if (this.f3276o == 0 && iY == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    public void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    public void n() {
        this.f3277p = 0;
        this.f3276o = 0;
        this.f3272k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    @SuppressLint({"UnknownNullness"})
    public void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        int iT = t(view, z());
        int iU = u(view, B());
        int iW = w((int) Math.sqrt((iT * iT) + (iU * iU)));
        if (iW > 0) {
            aVar.d(-iT, -iU, iW, this.f3271j);
        }
    }

    public int s(int i10, int i11, int i12, int i13, int i14) {
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
    public int t(View view, int i10) {
        RecyclerView.q qVarE = e();
        if (qVarE == null || !qVarE.p()) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        return s(qVarE.V(view) - ((ViewGroup.MarginLayoutParams) rVar).leftMargin, qVarE.Y(view) + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, qVarE.i0(), qVarE.s0() - qVarE.j0(), i10);
    }

    @SuppressLint({"UnknownNullness"})
    public int u(View view, int i10) {
        RecyclerView.q qVarE = e();
        if (qVarE == null || !qVarE.q()) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        return s(qVarE.Z(view) - ((ViewGroup.MarginLayoutParams) rVar).topMargin, qVarE.T(view) + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin, qVarE.k0(), qVarE.b0() - qVarE.h0(), i10);
    }

    @SuppressLint({"UnknownNullness"})
    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int w(int i10) {
        return (int) Math.ceil(((double) x(i10)) / 0.3356d);
    }

    public int x(int i10) {
        return (int) Math.ceil(Math.abs(i10) * A());
    }

    public final int y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    public int z() {
        PointF pointF = this.f3272k;
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
