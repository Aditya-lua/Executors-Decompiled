package p116f2;

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
import androidx.core.view.InterfaceC0640w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p142g2.C5966a;

/* JADX INFO: renamed from: f2.j */
/* JADX INFO: loaded from: classes.dex */
public class C5324j extends ConstraintLayout implements InterfaceC0640w {

    /* JADX INFO: renamed from: v0 */
    public static boolean f20710v0;

    /* JADX INFO: renamed from: A */
    public Interpolator f20711A;

    /* JADX INFO: renamed from: B */
    public float f20712B;

    /* JADX INFO: renamed from: C */
    public int f20713C;

    /* JADX INFO: renamed from: D */
    public int f20714D;

    /* JADX INFO: renamed from: E */
    public int f20715E;

    /* JADX INFO: renamed from: F */
    public boolean f20716F;

    /* JADX INFO: renamed from: G */
    public HashMap<View, C5321g> f20717G;

    /* JADX INFO: renamed from: H */
    public long f20718H;

    /* JADX INFO: renamed from: I */
    public float f20719I;

    /* JADX INFO: renamed from: J */
    public float f20720J;

    /* JADX INFO: renamed from: K */
    public float f20721K;

    /* JADX INFO: renamed from: L */
    public long f20722L;

    /* JADX INFO: renamed from: M */
    public float f20723M;

    /* JADX INFO: renamed from: N */
    public boolean f20724N;

    /* JADX INFO: renamed from: O */
    public boolean f20725O;

    /* JADX INFO: renamed from: P */
    public c f20726P;

    /* JADX INFO: renamed from: Q */
    public int f20727Q;

    /* JADX INFO: renamed from: R */
    public boolean f20728R;

    /* JADX INFO: renamed from: S */
    public C5316b f20729S;

    /* JADX INFO: renamed from: T */
    public boolean f20730T;

    /* JADX INFO: renamed from: U */
    public float f20731U;

    /* JADX INFO: renamed from: V */
    public float f20732V;

    /* JADX INFO: renamed from: W */
    public long f20733W;

    /* JADX INFO: renamed from: a0 */
    public float f20734a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f20735b0;

    /* JADX INFO: renamed from: c0 */
    public ArrayList<C5322h> f20736c0;

    /* JADX INFO: renamed from: d0 */
    public ArrayList<C5322h> f20737d0;

    /* JADX INFO: renamed from: e0 */
    public ArrayList<C5322h> f20738e0;

    /* JADX INFO: renamed from: f0 */
    public CopyOnWriteArrayList<c> f20739f0;

    /* JADX INFO: renamed from: g0 */
    public int f20740g0;

    /* JADX INFO: renamed from: h0 */
    public float f20741h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f20742i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f20743j0;

    /* JADX INFO: renamed from: k0 */
    public float f20744k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f20745l0;

    /* JADX INFO: renamed from: m0 */
    public b f20746m0;

    /* JADX INFO: renamed from: n0 */
    public Runnable f20747n0;

    /* JADX INFO: renamed from: o0 */
    public int[] f20748o0;

    /* JADX INFO: renamed from: p0 */
    public int f20749p0;

    /* JADX INFO: renamed from: q0 */
    public int f20750q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f20751r0;

    /* JADX INFO: renamed from: s0 */
    public d f20752s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f20753t0;

    /* JADX INFO: renamed from: u0 */
    public ArrayList<Integer> f20754u0;

    /* JADX INFO: renamed from: z */
    public Interpolator f20755z;

    /* JADX INFO: renamed from: f2.j$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5324j.this.f20746m0.m24658a();
        }
    }

    /* JADX INFO: renamed from: f2.j$b */
    public class b {

        /* JADX INFO: renamed from: a */
        public float f20757a = Float.NaN;

        /* JADX INFO: renamed from: b */
        public float f20758b = Float.NaN;

        /* JADX INFO: renamed from: c */
        public int f20759c = -1;

        /* JADX INFO: renamed from: d */
        public int f20760d = -1;

        /* JADX INFO: renamed from: e */
        public final String f20761e = "motion.progress";

        /* JADX INFO: renamed from: f */
        public final String f20762f = "motion.velocity";

        /* JADX INFO: renamed from: g */
        public final String f20763g = "motion.StartState";

        /* JADX INFO: renamed from: h */
        public final String f20764h = "motion.EndState";

        public b() {
        }

        /* JADX INFO: renamed from: a */
        public void m24658a() {
            int i10 = this.f20759c;
            if (i10 != -1 || this.f20760d != -1) {
                if (i10 == -1) {
                    C5324j.this.m24655R(this.f20760d);
                } else {
                    int i11 = this.f20760d;
                    if (i11 == -1) {
                        C5324j.this.m24652O(i10, -1, -1);
                    } else {
                        C5324j.this.m24653P(i10, i11);
                    }
                }
                C5324j.this.setState(d.SETUP);
            }
            if (Float.isNaN(this.f20758b)) {
                if (Float.isNaN(this.f20757a)) {
                    return;
                }
                C5324j.this.setProgress(this.f20757a);
            } else {
                C5324j.this.m24651N(this.f20757a, this.f20758b);
                this.f20757a = Float.NaN;
                this.f20758b = Float.NaN;
                this.f20759c = -1;
                this.f20760d = -1;
            }
        }

        /* JADX INFO: renamed from: b */
        public Bundle m24659b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f20757a);
            bundle.putFloat("motion.velocity", this.f20758b);
            bundle.putInt("motion.StartState", this.f20759c);
            bundle.putInt("motion.EndState", this.f20760d);
            return bundle;
        }

        /* JADX INFO: renamed from: c */
        public void m24660c() {
            this.f20760d = C5324j.this.f20715E;
            this.f20759c = C5324j.this.f20713C;
            this.f20758b = C5324j.this.getVelocity();
            this.f20757a = C5324j.this.getProgress();
        }

        /* JADX INFO: renamed from: d */
        public void m24661d(int i10) {
            this.f20760d = i10;
        }

        /* JADX INFO: renamed from: e */
        public void m24662e(float f10) {
            this.f20757a = f10;
        }

        /* JADX INFO: renamed from: f */
        public void m24663f(int i10) {
            this.f20759c = i10;
        }

        /* JADX INFO: renamed from: g */
        public void m24664g(Bundle bundle) {
            this.f20757a = bundle.getFloat("motion.progress");
            this.f20758b = bundle.getFloat("motion.velocity");
            this.f20759c = bundle.getInt("motion.StartState");
            this.f20760d = bundle.getInt("motion.EndState");
        }

        /* JADX INFO: renamed from: h */
        public void m24665h(float f10) {
            this.f20758b = f10;
        }
    }

    /* JADX INFO: renamed from: f2.j$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo24632a(C5324j c5324j, int i10, int i11);

        /* JADX INFO: renamed from: b */
        void mo24633b(C5324j c5324j, int i10);

        /* JADX INFO: renamed from: c */
        void mo24634c(C5324j c5324j, int i10, int i11, float f10);
    }

    /* JADX INFO: renamed from: f2.j$d */
    public enum d {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* JADX INFO: renamed from: G */
    public void m24644G(float f10) {
    }

    /* JADX INFO: renamed from: H */
    public void m24645H(boolean z10) {
        boolean z11;
        int i10;
        float interpolation;
        boolean z12;
        if (this.f20722L == -1) {
            this.f20722L = getNanoTime();
        }
        float f10 = this.f20721K;
        if (f10 > 0.0f && f10 < 1.0f) {
            this.f20714D = -1;
        }
        boolean z13 = false;
        if (this.f20735b0 || (this.f20725O && (z10 || this.f20723M != f10))) {
            float fSignum = Math.signum(this.f20723M - f10);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.f20755z;
            float f11 = !(interpolator instanceof AbstractInterpolatorC5323i) ? (((nanoTime - this.f20722L) * fSignum) * 1.0E-9f) / this.f20719I : 0.0f;
            float f12 = this.f20721K + f11;
            if (this.f20724N) {
                f12 = this.f20723M;
            }
            if ((fSignum <= 0.0f || f12 < this.f20723M) && (fSignum > 0.0f || f12 > this.f20723M)) {
                z11 = false;
            } else {
                f12 = this.f20723M;
                this.f20725O = false;
                z11 = true;
            }
            this.f20721K = f12;
            this.f20720J = f12;
            this.f20722L = nanoTime;
            if (interpolator == null || z11) {
                this.f20712B = f11;
            } else {
                if (this.f20728R) {
                    interpolation = interpolator.getInterpolation((nanoTime - this.f20718H) * 1.0E-9f);
                    Interpolator interpolator2 = this.f20755z;
                    if (interpolator2 == null) {
                        throw null;
                    }
                    this.f20721K = interpolation;
                    this.f20722L = nanoTime;
                    if (interpolator2 instanceof AbstractInterpolatorC5323i) {
                        float fM24640a = ((AbstractInterpolatorC5323i) interpolator2).m24640a();
                        this.f20712B = fM24640a;
                        Math.abs(fM24640a);
                        if (fM24640a > 0.0f && interpolation >= 1.0f) {
                            this.f20721K = 1.0f;
                            this.f20725O = false;
                            interpolation = 1.0f;
                        }
                        if (fM24640a < 0.0f && interpolation <= 0.0f) {
                            this.f20721K = 0.0f;
                            this.f20725O = false;
                            f12 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f12);
                    Interpolator interpolator3 = this.f20755z;
                    if (interpolator3 instanceof AbstractInterpolatorC5323i) {
                        this.f20712B = ((AbstractInterpolatorC5323i) interpolator3).m24640a();
                    } else {
                        this.f20712B = ((interpolator3.getInterpolation(f12 + f11) - interpolation) * fSignum) / f11;
                    }
                }
                f12 = interpolation;
            }
            if (Math.abs(this.f20712B) > 1.0E-5f) {
                setState(d.MOVING);
            }
            if ((fSignum > 0.0f && f12 >= this.f20723M) || (fSignum <= 0.0f && f12 <= this.f20723M)) {
                f12 = this.f20723M;
                this.f20725O = false;
            }
            if (f12 >= 1.0f || f12 <= 0.0f) {
                this.f20725O = false;
                setState(d.FINISHED);
            }
            int childCount = getChildCount();
            this.f20735b0 = false;
            long nanoTime2 = getNanoTime();
            this.f20744k0 = f12;
            Interpolator interpolator4 = this.f20711A;
            float interpolation2 = interpolator4 == null ? f12 : interpolator4.getInterpolation(f12);
            Interpolator interpolator5 = this.f20711A;
            if (interpolator5 != null) {
                float interpolation3 = interpolator5.getInterpolation((fSignum / this.f20719I) + f12);
                this.f20712B = interpolation3;
                this.f20712B = interpolation3 - this.f20711A.getInterpolation(f12);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                C5321g c5321g = this.f20717G.get(childAt);
                if (c5321g != null) {
                    this.f20735b0 = c5321g.m24631c(childAt, interpolation2, nanoTime2, null) | this.f20735b0;
                }
            }
            boolean z14 = (fSignum > 0.0f && f12 >= this.f20723M) || (fSignum <= 0.0f && f12 <= this.f20723M);
            if (!this.f20735b0 && !this.f20725O && z14) {
                setState(d.FINISHED);
            }
            if (this.f20743j0) {
                requestLayout();
            }
            boolean z15 = (!z14) | this.f20735b0;
            this.f20735b0 = z15;
            if (f12 <= 0.0f && (i10 = this.f20713C) != -1 && this.f20714D != i10) {
                this.f20714D = i10;
                throw null;
            }
            if (f12 >= 1.0d) {
                int i12 = this.f20714D;
                int i13 = this.f20715E;
                if (i12 != i13) {
                    this.f20714D = i13;
                    throw null;
                }
            }
            if (z15 || this.f20725O) {
                invalidate();
            } else if ((fSignum > 0.0f && f12 == 1.0f) || (fSignum < 0.0f && f12 == 0.0f)) {
                setState(d.FINISHED);
            }
            if (!this.f20735b0 && !this.f20725O && ((fSignum > 0.0f && f12 == 1.0f) || (fSignum < 0.0f && f12 == 0.0f))) {
                m24649L();
            }
        }
        float f13 = this.f20721K;
        if (f13 < 1.0f) {
            if (f13 <= 0.0f) {
                int i14 = this.f20714D;
                int i15 = this.f20713C;
                z12 = i14 != i15;
                this.f20714D = i15;
            }
            this.f20753t0 |= z13;
            if (z13 && !this.f20745l0) {
                requestLayout();
            }
            this.f20720J = this.f20721K;
        }
        int i16 = this.f20714D;
        int i17 = this.f20715E;
        z12 = i16 != i17;
        this.f20714D = i17;
        z13 = z12;
        this.f20753t0 |= z13;
        if (z13) {
            requestLayout();
        }
        this.f20720J = this.f20721K;
    }

    /* JADX INFO: renamed from: I */
    public final void m24646I() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.f20726P == null && ((copyOnWriteArrayList = this.f20739f0) == null || copyOnWriteArrayList.isEmpty())) || this.f20741h0 == this.f20720J) {
            return;
        }
        if (this.f20740g0 != -1) {
            m24648K();
            this.f20742i0 = true;
        }
        this.f20740g0 = -1;
        float f10 = this.f20720J;
        this.f20741h0 = f10;
        c cVar = this.f20726P;
        if (cVar != null) {
            cVar.mo24634c(this, this.f20713C, this.f20715E, f10);
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.f20739f0;
        if (copyOnWriteArrayList2 != null) {
            Iterator<c> it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                it.next().mo24634c(this, this.f20713C, this.f20715E, this.f20720J);
            }
        }
        this.f20742i0 = true;
    }

    /* JADX INFO: renamed from: J */
    public void m24647J() {
        int iIntValue;
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.f20726P != null || ((copyOnWriteArrayList = this.f20739f0) != null && !copyOnWriteArrayList.isEmpty())) && this.f20740g0 == -1) {
            this.f20740g0 = this.f20714D;
            if (this.f20754u0.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList<Integer> arrayList = this.f20754u0;
                iIntValue = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i10 = this.f20714D;
            if (iIntValue != i10 && i10 != -1) {
                this.f20754u0.add(Integer.valueOf(i10));
            }
        }
        m24650M();
        Runnable runnable = this.f20747n0;
        if (runnable != null) {
            runnable.run();
            this.f20747n0 = null;
        }
        int[] iArr = this.f20748o0;
        if (iArr == null || this.f20749p0 <= 0) {
            return;
        }
        m24655R(iArr[0]);
        int[] iArr2 = this.f20748o0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.f20749p0--;
    }

    /* JADX INFO: renamed from: K */
    public final void m24648K() {
        c cVar = this.f20726P;
        if (cVar != null) {
            cVar.mo24632a(this, this.f20713C, this.f20715E);
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f20739f0;
        if (copyOnWriteArrayList != null) {
            Iterator<c> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().mo24632a(this, this.f20713C, this.f20715E);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m24649L() {
    }

    /* JADX INFO: renamed from: M */
    public final void m24650M() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if (this.f20726P == null && ((copyOnWriteArrayList = this.f20739f0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        int i10 = 0;
        this.f20742i0 = false;
        ArrayList<Integer> arrayList = this.f20754u0;
        int size = arrayList.size();
        while (i10 < size) {
            Integer num = arrayList.get(i10);
            i10++;
            Integer num2 = num;
            c cVar = this.f20726P;
            if (cVar != null) {
                cVar.mo24633b(this, num2.intValue());
            }
            CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.f20739f0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<c> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().mo24633b(this, num2.intValue());
                }
            }
        }
        this.f20754u0.clear();
    }

    /* JADX INFO: renamed from: N */
    public void m24651N(float f10, float f11) {
        if (!isAttachedToWindow()) {
            if (this.f20746m0 == null) {
                this.f20746m0 = new b();
            }
            this.f20746m0.m24662e(f10);
            this.f20746m0.m24665h(f11);
            return;
        }
        setProgress(f10);
        setState(d.MOVING);
        this.f20712B = f11;
        if (f11 != 0.0f) {
            m24644G(f11 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f10 == 0.0f || f10 == 1.0f) {
                return;
            }
            m24644G(f10 > 0.5f ? 1.0f : 0.0f);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m24652O(int i10, int i11, int i12) {
        setState(d.SETUP);
        this.f20714D = i10;
        this.f20713C = -1;
        this.f20715E = -1;
        C5966a c5966a = this.f1941k;
        if (c5966a != null) {
            c5966a.m26771d(i10, i11, i12);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m24653P(int i10, int i11) {
        if (isAttachedToWindow()) {
            return;
        }
        if (this.f20746m0 == null) {
            this.f20746m0 = new b();
        }
        this.f20746m0.m24663f(i10);
        this.f20746m0.m24661d(i11);
    }

    /* JADX INFO: renamed from: Q */
    public void m24654Q() {
        m24644G(1.0f);
        this.f20747n0 = null;
    }

    /* JADX INFO: renamed from: R */
    public void m24655R(int i10) {
        if (isAttachedToWindow()) {
            m24656S(i10, -1, -1);
            return;
        }
        if (this.f20746m0 == null) {
            this.f20746m0 = new b();
        }
        this.f20746m0.m24661d(i10);
    }

    /* JADX INFO: renamed from: S */
    public void m24656S(int i10, int i11, int i12) {
        m24657T(i10, i11, i12, -1);
    }

    /* JADX INFO: renamed from: T */
    public void m24657T(int i10, int i11, int i12, int i13) {
        int i14 = this.f20714D;
        if (i14 == i10) {
            return;
        }
        if (this.f20713C == i10) {
            m24644G(0.0f);
            if (i13 > 0) {
                this.f20719I = i13 / 1000.0f;
                return;
            }
            return;
        }
        if (this.f20715E == i10) {
            m24644G(1.0f);
            if (i13 > 0) {
                this.f20719I = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.f20715E = i10;
        if (i14 != -1) {
            m24653P(i14, i10);
            m24644G(1.0f);
            this.f20721K = 0.0f;
            m24654Q();
            if (i13 > 0) {
                this.f20719I = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.f20728R = false;
        this.f20723M = 1.0f;
        this.f20720J = 0.0f;
        this.f20721K = 0.0f;
        this.f20722L = getNanoTime();
        this.f20718H = getNanoTime();
        this.f20724N = false;
        this.f20755z = null;
        if (i13 == -1) {
            throw null;
        }
        this.f20713C = -1;
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ArrayList<C5322h> arrayList = this.f20738e0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                C5322h c5322h = arrayList.get(i10);
                i10++;
                c5322h.m24638w(canvas);
            }
        }
        m24645H(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.f20714D;
    }

    public ArrayList<C5326l.a> getDefinedTransitions() {
        return null;
    }

    public C5316b getDesignTool() {
        if (this.f20729S == null) {
            this.f20729S = new C5316b(this);
        }
        return this.f20729S;
    }

    public int getEndState() {
        return this.f20715E;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f20721K;
    }

    public C5326l getScene() {
        return null;
    }

    public int getStartState() {
        return this.f20713C;
    }

    public float getTargetPosition() {
        return this.f20723M;
    }

    public Bundle getTransitionState() {
        if (this.f20746m0 == null) {
            this.f20746m0 = new b();
        }
        this.f20746m0.m24660c();
        return this.f20746m0.m24659b();
    }

    public long getTransitionTimeMs() {
        return (long) (this.f20719I * 1000.0f);
    }

    public float getVelocity() {
        return this.f20712B;
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: i */
    public void mo1727i(@NonNull View view, @NonNull View view2, int i10, int i11) {
        this.f20733W = getNanoTime();
        this.f20734a0 = 0.0f;
        this.f20731U = 0.0f;
        this.f20732V = 0.0f;
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: j */
    public void mo1728j(@NonNull View view, int i10) {
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: k */
    public void mo1729k(@NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
    }

    @Override // androidx.core.view.InterfaceC0640w
    /* JADX INFO: renamed from: m */
    public void mo1731m(@NonNull View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.f20730T || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.f20730T = false;
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: n */
    public void mo1732n(@NonNull View view, int i10, int i11, int i12, int i13, int i14) {
    }

    @Override // androidx.core.view.InterfaceC0638v
    /* JADX INFO: renamed from: o */
    public boolean mo1733o(@NonNull View view, @NonNull View view2, int i10, int i11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f20750q0 = display.getRotation();
        }
        m24649L();
        b bVar = this.f20746m0;
        if (bVar != null) {
            if (this.f20751r0) {
                post(new a());
            } else {
                bVar.m24658a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f20745l0 = true;
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } finally {
            this.f20745l0 = false;
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
        if (view instanceof C5322h) {
            C5322h c5322h = (C5322h) view;
            if (this.f20739f0 == null) {
                this.f20739f0 = new CopyOnWriteArrayList<>();
            }
            this.f20739f0.add(c5322h);
            if (c5322h.m24637v()) {
                if (this.f20736c0 == null) {
                    this.f20736c0 = new ArrayList<>();
                }
                this.f20736c0.add(c5322h);
            }
            if (c5322h.m24636u()) {
                if (this.f20737d0 == null) {
                    this.f20737d0 = new ArrayList<>();
                }
                this.f20737d0.add(c5322h);
            }
            if (c5322h.m24635t()) {
                if (this.f20738e0 == null) {
                    this.f20738e0 = new ArrayList<>();
                }
                this.f20738e0.add(c5322h);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<C5322h> arrayList = this.f20736c0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<C5322h> arrayList2 = this.f20737d0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    public void setDebugMode(int i10) {
        this.f20727Q = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f20751r0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.f20716F = z10;
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<C5322h> arrayList = this.f20737d0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f20737d0.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<C5322h> arrayList = this.f20736c0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f20736c0.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f20746m0 == null) {
                this.f20746m0 = new b();
            }
            this.f20746m0.m24662e(f10);
            return;
        }
        if (f10 <= 0.0f) {
            if (this.f20721K == 1.0f && this.f20714D == this.f20715E) {
                setState(d.MOVING);
            }
            this.f20714D = this.f20713C;
            if (this.f20721K == 0.0f) {
                setState(d.FINISHED);
                return;
            }
            return;
        }
        if (f10 < 1.0f) {
            this.f20714D = -1;
            setState(d.MOVING);
            return;
        }
        if (this.f20721K == 0.0f && this.f20714D == this.f20713C) {
            setState(d.MOVING);
        }
        this.f20714D = this.f20715E;
        if (this.f20721K == 1.0f) {
            setState(d.FINISHED);
        }
    }

    public void setScene(C5326l c5326l) {
        m2458t();
        throw null;
    }

    public void setStartState(int i10) {
        if (isAttachedToWindow()) {
            this.f20714D = i10;
            return;
        }
        if (this.f20746m0 == null) {
            this.f20746m0 = new b();
        }
        this.f20746m0.m24663f(i10);
        this.f20746m0.m24661d(i10);
    }

    public void setState(d dVar) {
        d dVar2 = d.FINISHED;
        if (dVar == dVar2 && this.f20714D == -1) {
            return;
        }
        d dVar3 = this.f20752s0;
        this.f20752s0 = dVar;
        d dVar4 = d.MOVING;
        if (dVar3 == dVar4 && dVar == dVar4) {
            m24646I();
        }
        int iOrdinal = dVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && dVar == dVar2) {
                m24647J();
                return;
            }
            return;
        }
        if (dVar == dVar4) {
            m24646I();
        }
        if (dVar == dVar2) {
            m24647J();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTransition(int i10) {
    }

    public void setTransitionDuration(int i10) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.f20726P = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f20746m0 == null) {
            this.f20746m0 = new b();
        }
        this.f20746m0.m24664g(bundle);
        if (isAttachedToWindow()) {
            this.f20746m0.m24658a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return C5315a.m24625a(context, this.f20713C) + "->" + C5315a.m24625a(context, this.f20715E) + " (pos:" + this.f20721K + " Dpos/Dt:" + this.f20712B;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* JADX INFO: renamed from: v */
    public void mo2460v(int i10) {
        this.f1941k = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setTransition(C5326l.a aVar) {
        throw null;
    }
}
