package f2;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class j extends ConstraintLayout implements w {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static boolean f16121v0;
    public Interpolator A;
    public float B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public HashMap<View, g> G;
    public long H;
    public float I;
    public float J;
    public float K;
    public long L;
    public float M;
    public boolean N;
    public boolean O;
    public c P;
    public int Q;
    public boolean R;
    public f2.b S;
    public boolean T;
    public float U;
    public float V;
    public long W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f16122a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f16123b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ArrayList<h> f16124c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ArrayList<h> f16125d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ArrayList<h> f16126e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public CopyOnWriteArrayList<c> f16127f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f16128g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f16129h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f16130i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f16131j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f16132k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f16133l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public b f16134m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Runnable f16135n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int[] f16136o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f16137p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f16138q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f16139r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public d f16140s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f16141t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ArrayList<Integer> f16142u0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Interpolator f16143z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f16134m0.a();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f16145a = Float.NaN;
        public float b = Float.NaN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16146c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16147d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f16148e = "motion.progress";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f16149f = "motion.velocity";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f16150g = "motion.StartState";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f16151h = "motion.EndState";

        public b() {
        }

        public void a() {
            int i10 = this.f16146c;
            if (i10 != -1 || this.f16147d != -1) {
                if (i10 == -1) {
                    j.this.R(this.f16147d);
                } else {
                    int i11 = this.f16147d;
                    if (i11 == -1) {
                        j.this.O(i10, -1, -1);
                    } else {
                        j.this.P(i10, i11);
                    }
                }
                j.this.setState(d.SETUP);
            }
            if (Float.isNaN(this.b)) {
                if (Float.isNaN(this.f16145a)) {
                    return;
                }
                j.this.setProgress(this.f16145a);
            } else {
                j.this.N(this.f16145a, this.b);
                this.f16145a = Float.NaN;
                this.b = Float.NaN;
                this.f16146c = -1;
                this.f16147d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f16145a);
            bundle.putFloat("motion.velocity", this.b);
            bundle.putInt("motion.StartState", this.f16146c);
            bundle.putInt("motion.EndState", this.f16147d);
            return bundle;
        }

        public void c() {
            this.f16147d = j.this.E;
            this.f16146c = j.this.C;
            this.b = j.this.getVelocity();
            this.f16145a = j.this.getProgress();
        }

        public void d(int i10) {
            this.f16147d = i10;
        }

        public void e(float f10) {
            this.f16145a = f10;
        }

        public void f(int i10) {
            this.f16146c = i10;
        }

        public void g(Bundle bundle) {
            this.f16145a = bundle.getFloat("motion.progress");
            this.b = bundle.getFloat("motion.velocity");
            this.f16146c = bundle.getInt("motion.StartState");
            this.f16147d = bundle.getInt("motion.EndState");
        }

        public void h(float f10) {
            this.b = f10;
        }
    }

    public interface c {
        void a(j jVar, int i10, int i11);

        void b(j jVar, int i10);

        void c(j jVar, int i10, int i11, float f10);
    }

    public enum d {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public void G(float f10) {
    }

    public void H(boolean z10) {
        boolean z11;
        int i10;
        float interpolation;
        boolean z12;
        if (this.L == -1) {
            this.L = getNanoTime();
        }
        float f10 = this.K;
        if (f10 > 0.0f && f10 < 1.0f) {
            this.D = -1;
        }
        boolean z13 = false;
        if (this.f16123b0 || (this.O && (z10 || this.M != f10))) {
            float fSignum = Math.signum(this.M - f10);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.f16143z;
            float f11 = !(interpolator instanceof i) ? (((nanoTime - this.L) * fSignum) * 1.0E-9f) / this.I : 0.0f;
            float f12 = this.K + f11;
            if (this.N) {
                f12 = this.M;
            }
            if ((fSignum <= 0.0f || f12 < this.M) && (fSignum > 0.0f || f12 > this.M)) {
                z11 = false;
            } else {
                f12 = this.M;
                this.O = false;
                z11 = true;
            }
            this.K = f12;
            this.J = f12;
            this.L = nanoTime;
            if (interpolator == null || z11) {
                this.B = f11;
            } else {
                if (this.R) {
                    interpolation = interpolator.getInterpolation((nanoTime - this.H) * 1.0E-9f);
                    Interpolator interpolator2 = this.f16143z;
                    if (interpolator2 == null) {
                        throw null;
                    }
                    this.K = interpolation;
                    this.L = nanoTime;
                    if (interpolator2 instanceof i) {
                        float fA = ((i) interpolator2).a();
                        this.B = fA;
                        Math.abs(fA);
                        if (fA > 0.0f && interpolation >= 1.0f) {
                            this.K = 1.0f;
                            this.O = false;
                            interpolation = 1.0f;
                        }
                        if (fA < 0.0f && interpolation <= 0.0f) {
                            this.K = 0.0f;
                            this.O = false;
                            f12 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f12);
                    Interpolator interpolator3 = this.f16143z;
                    if (interpolator3 instanceof i) {
                        this.B = ((i) interpolator3).a();
                    } else {
                        this.B = ((interpolator3.getInterpolation(f12 + f11) - interpolation) * fSignum) / f11;
                    }
                }
                f12 = interpolation;
            }
            if (Math.abs(this.B) > 1.0E-5f) {
                setState(d.MOVING);
            }
            if ((fSignum > 0.0f && f12 >= this.M) || (fSignum <= 0.0f && f12 <= this.M)) {
                f12 = this.M;
                this.O = false;
            }
            if (f12 >= 1.0f || f12 <= 0.0f) {
                this.O = false;
                setState(d.FINISHED);
            }
            int childCount = getChildCount();
            this.f16123b0 = false;
            long nanoTime2 = getNanoTime();
            this.f16132k0 = f12;
            Interpolator interpolator4 = this.A;
            float interpolation2 = interpolator4 == null ? f12 : interpolator4.getInterpolation(f12);
            Interpolator interpolator5 = this.A;
            if (interpolator5 != null) {
                float interpolation3 = interpolator5.getInterpolation((fSignum / this.I) + f12);
                this.B = interpolation3;
                this.B = interpolation3 - this.A.getInterpolation(f12);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = this.G.get(childAt);
                if (gVar != null) {
                    this.f16123b0 = gVar.c(childAt, interpolation2, nanoTime2, null) | this.f16123b0;
                }
            }
            boolean z14 = (fSignum > 0.0f && f12 >= this.M) || (fSignum <= 0.0f && f12 <= this.M);
            if (!this.f16123b0 && !this.O && z14) {
                setState(d.FINISHED);
            }
            if (this.f16131j0) {
                requestLayout();
            }
            boolean z15 = (!z14) | this.f16123b0;
            this.f16123b0 = z15;
            if (f12 <= 0.0f && (i10 = this.C) != -1 && this.D != i10) {
                this.D = i10;
                throw null;
            }
            if (f12 >= 1.0d) {
                int i12 = this.D;
                int i13 = this.E;
                if (i12 != i13) {
                    this.D = i13;
                    throw null;
                }
            }
            if (z15 || this.O) {
                invalidate();
            } else if ((fSignum > 0.0f && f12 == 1.0f) || (fSignum < 0.0f && f12 == 0.0f)) {
                setState(d.FINISHED);
            }
            if (!this.f16123b0 && !this.O && ((fSignum > 0.0f && f12 == 1.0f) || (fSignum < 0.0f && f12 == 0.0f))) {
                L();
            }
        }
        float f13 = this.K;
        if (f13 < 1.0f) {
            if (f13 <= 0.0f) {
                int i14 = this.D;
                int i15 = this.C;
                z12 = i14 != i15;
                this.D = i15;
            }
            this.f16141t0 |= z13;
            if (z13 && !this.f16133l0) {
                requestLayout();
            }
            this.J = this.K;
        }
        int i16 = this.D;
        int i17 = this.E;
        z12 = i16 != i17;
        this.D = i17;
        z13 = z12;
        this.f16141t0 |= z13;
        if (z13) {
            requestLayout();
        }
        this.J = this.K;
    }

    public final void I() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.P == null && ((copyOnWriteArrayList = this.f16127f0) == null || copyOnWriteArrayList.isEmpty())) || this.f16129h0 == this.J) {
            return;
        }
        if (this.f16128g0 != -1) {
            K();
            this.f16130i0 = true;
        }
        this.f16128g0 = -1;
        float f10 = this.J;
        this.f16129h0 = f10;
        c cVar = this.P;
        if (cVar != null) {
            cVar.c(this, this.C, this.E, f10);
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.f16127f0;
        if (copyOnWriteArrayList2 != null) {
            Iterator<c> it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                it.next().c(this, this.C, this.E, this.J);
            }
        }
        this.f16130i0 = true;
    }

    public void J() {
        int iIntValue;
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.P != null || ((copyOnWriteArrayList = this.f16127f0) != null && !copyOnWriteArrayList.isEmpty())) && this.f16128g0 == -1) {
            this.f16128g0 = this.D;
            if (this.f16142u0.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList<Integer> arrayList = this.f16142u0;
                iIntValue = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i10 = this.D;
            if (iIntValue != i10 && i10 != -1) {
                this.f16142u0.add(Integer.valueOf(i10));
            }
        }
        M();
        Runnable runnable = this.f16135n0;
        if (runnable != null) {
            runnable.run();
            this.f16135n0 = null;
        }
        int[] iArr = this.f16136o0;
        if (iArr == null || this.f16137p0 <= 0) {
            return;
        }
        R(iArr[0]);
        int[] iArr2 = this.f16136o0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.f16137p0--;
    }

    public final void K() {
        c cVar = this.P;
        if (cVar != null) {
            cVar.a(this, this.C, this.E);
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f16127f0;
        if (copyOnWriteArrayList != null) {
            Iterator<c> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.C, this.E);
            }
        }
    }

    public void L() {
    }

    public final void M() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if (this.P == null && ((copyOnWriteArrayList = this.f16127f0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        int i10 = 0;
        this.f16130i0 = false;
        ArrayList<Integer> arrayList = this.f16142u0;
        int size = arrayList.size();
        while (i10 < size) {
            Integer num = arrayList.get(i10);
            i10++;
            Integer num2 = num;
            c cVar = this.P;
            if (cVar != null) {
                cVar.b(this, num2.intValue());
            }
            CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.f16127f0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<c> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().b(this, num2.intValue());
                }
            }
        }
        this.f16142u0.clear();
    }

    public void N(float f10, float f11) {
        if (!isAttachedToWindow()) {
            if (this.f16134m0 == null) {
                this.f16134m0 = new b();
            }
            this.f16134m0.e(f10);
            this.f16134m0.h(f11);
            return;
        }
        setProgress(f10);
        setState(d.MOVING);
        this.B = f11;
        if (f11 != 0.0f) {
            G(f11 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f10 == 0.0f || f10 == 1.0f) {
                return;
            }
            G(f10 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void O(int i10, int i11, int i12) {
        setState(d.SETUP);
        this.D = i10;
        this.C = -1;
        this.E = -1;
        g2.a aVar = this.f1499k;
        if (aVar != null) {
            aVar.d(i10, i11, i12);
        }
    }

    public void P(int i10, int i11) {
        if (isAttachedToWindow()) {
            return;
        }
        if (this.f16134m0 == null) {
            this.f16134m0 = new b();
        }
        this.f16134m0.f(i10);
        this.f16134m0.d(i11);
    }

    public void Q() {
        G(1.0f);
        this.f16135n0 = null;
    }

    public void R(int i10) {
        if (isAttachedToWindow()) {
            S(i10, -1, -1);
            return;
        }
        if (this.f16134m0 == null) {
            this.f16134m0 = new b();
        }
        this.f16134m0.d(i10);
    }

    public void S(int i10, int i11, int i12) {
        T(i10, i11, i12, -1);
    }

    public void T(int i10, int i11, int i12, int i13) {
        int i14 = this.D;
        if (i14 == i10) {
            return;
        }
        if (this.C == i10) {
            G(0.0f);
            if (i13 > 0) {
                this.I = i13 / 1000.0f;
                return;
            }
            return;
        }
        if (this.E == i10) {
            G(1.0f);
            if (i13 > 0) {
                this.I = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.E = i10;
        if (i14 != -1) {
            P(i14, i10);
            G(1.0f);
            this.K = 0.0f;
            Q();
            if (i13 > 0) {
                this.I = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.R = false;
        this.M = 1.0f;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = getNanoTime();
        this.H = getNanoTime();
        this.N = false;
        this.f16143z = null;
        if (i13 == -1) {
            throw null;
        }
        this.C = -1;
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ArrayList<h> arrayList = this.f16126e0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                h hVar = arrayList.get(i10);
                i10++;
                hVar.w(canvas);
            }
        }
        H(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.D;
    }

    public ArrayList<l.a> getDefinedTransitions() {
        return null;
    }

    public f2.b getDesignTool() {
        if (this.S == null) {
            this.S = new f2.b(this);
        }
        return this.S;
    }

    public int getEndState() {
        return this.E;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.K;
    }

    public l getScene() {
        return null;
    }

    public int getStartState() {
        return this.C;
    }

    public float getTargetPosition() {
        return this.M;
    }

    public Bundle getTransitionState() {
        if (this.f16134m0 == null) {
            this.f16134m0 = new b();
        }
        this.f16134m0.c();
        return this.f16134m0.b();
    }

    public long getTransitionTimeMs() {
        return (long) (this.I * 1000.0f);
    }

    public float getVelocity() {
        return this.B;
    }

    @Override // androidx.core.view.v
    public void i(@NonNull View view, @NonNull View view2, int i10, int i11) {
        this.W = getNanoTime();
        this.f16122a0 = 0.0f;
        this.U = 0.0f;
        this.V = 0.0f;
    }

    @Override // androidx.core.view.v
    public void j(@NonNull View view, int i10) {
    }

    @Override // androidx.core.view.v
    public void k(@NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
    }

    @Override // androidx.core.view.w
    public void m(@NonNull View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.T || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.T = false;
    }

    @Override // androidx.core.view.v
    public void n(@NonNull View view, int i10, int i11, int i12, int i13, int i14) {
    }

    @Override // androidx.core.view.v
    public boolean o(@NonNull View view, @NonNull View view2, int i10, int i11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f16138q0 = display.getRotation();
        }
        L();
        b bVar = this.f16134m0;
        if (bVar != null) {
            if (this.f16139r0) {
                post(new a());
            } else {
                bVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f16133l0 = true;
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } finally {
            this.f16133l0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(@NonNull View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(@NonNull View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof h) {
            h hVar = (h) view;
            if (this.f16127f0 == null) {
                this.f16127f0 = new CopyOnWriteArrayList<>();
            }
            this.f16127f0.add(hVar);
            if (hVar.v()) {
                if (this.f16124c0 == null) {
                    this.f16124c0 = new ArrayList<>();
                }
                this.f16124c0.add(hVar);
            }
            if (hVar.u()) {
                if (this.f16125d0 == null) {
                    this.f16125d0 = new ArrayList<>();
                }
                this.f16125d0.add(hVar);
            }
            if (hVar.t()) {
                if (this.f16126e0 == null) {
                    this.f16126e0 = new ArrayList<>();
                }
                this.f16126e0.add(hVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<h> arrayList = this.f16124c0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<h> arrayList2 = this.f16125d0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    public void setDebugMode(int i10) {
        this.Q = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f16139r0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.F = z10;
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<h> arrayList = this.f16125d0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f16125d0.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<h> arrayList = this.f16124c0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f16124c0.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f16134m0 == null) {
                this.f16134m0 = new b();
            }
            this.f16134m0.e(f10);
            return;
        }
        if (f10 <= 0.0f) {
            if (this.K == 1.0f && this.D == this.E) {
                setState(d.MOVING);
            }
            this.D = this.C;
            if (this.K == 0.0f) {
                setState(d.FINISHED);
                return;
            }
            return;
        }
        if (f10 < 1.0f) {
            this.D = -1;
            setState(d.MOVING);
            return;
        }
        if (this.K == 0.0f && this.D == this.C) {
            setState(d.MOVING);
        }
        this.D = this.E;
        if (this.K == 1.0f) {
            setState(d.FINISHED);
        }
    }

    public void setScene(l lVar) {
        t();
        throw null;
    }

    public void setStartState(int i10) {
        if (isAttachedToWindow()) {
            this.D = i10;
            return;
        }
        if (this.f16134m0 == null) {
            this.f16134m0 = new b();
        }
        this.f16134m0.f(i10);
        this.f16134m0.d(i10);
    }

    public void setState(d dVar) {
        d dVar2 = d.FINISHED;
        if (dVar == dVar2 && this.D == -1) {
            return;
        }
        d dVar3 = this.f16140s0;
        this.f16140s0 = dVar;
        d dVar4 = d.MOVING;
        if (dVar3 == dVar4 && dVar == dVar4) {
            I();
        }
        int iOrdinal = dVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && dVar == dVar2) {
                J();
                return;
            }
            return;
        }
        if (dVar == dVar4) {
            I();
        }
        if (dVar == dVar2) {
            J();
        }
    }

    public void setTransition(int i10) {
    }

    public void setTransitionDuration(int i10) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.P = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f16134m0 == null) {
            this.f16134m0 = new b();
        }
        this.f16134m0.g(bundle);
        if (isAttachedToWindow()) {
            this.f16134m0.a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return f2.a.a(context, this.C) + "->" + f2.a.a(context, this.E) + " (pos:" + this.K + " Dpos/Dt:" + this.B;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void v(int i10) {
        this.f1499k = null;
    }

    public void setTransition(l.a aVar) {
        throw null;
    }
}
