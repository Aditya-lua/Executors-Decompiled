package r3;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Interpolator f29752x = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29753a;
    public int b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f29755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f29756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f29757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f29758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f29759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f29760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f29761j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f29763l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f29764m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f29765n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29766o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f29767p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f29768q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public OverScroller f29769r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0529c f29770s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f29771t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f29772u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f29773v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29754c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Runnable f29774w = new b();

    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E(0);
        }
    }

    /* JADX INFO: renamed from: r3.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0529c {
        public abstract int a(@NonNull View view, int i10, int i11);

        public abstract int b(@NonNull View view, int i10, int i11);

        public int c(int i10) {
            return i10;
        }

        public int d(@NonNull View view) {
            return 0;
        }

        public int e(@NonNull View view) {
            return 0;
        }

        public void f(int i10, int i11) {
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public void i(@NonNull View view, int i10) {
        }

        public abstract void j(int i10);

        public abstract void k(@NonNull View view, int i10, int i11, int i12, int i13);

        public abstract void l(@NonNull View view, float f10, float f11);

        public abstract boolean m(@NonNull View view, int i10);
    }

    public c(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull AbstractC0529c abstractC0529c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0529c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f29773v = viewGroup;
        this.f29770s = abstractC0529c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f29767p = i10;
        this.f29766o = i10;
        this.b = viewConfiguration.getScaledTouchSlop();
        this.f29764m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f29765n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f29769r = new OverScroller(context, f29752x);
    }

    public static c l(@NonNull ViewGroup viewGroup, float f10, @NonNull AbstractC0529c abstractC0529c) {
        c cVarM = m(viewGroup, abstractC0529c);
        cVarM.b = (int) (cVarM.b * (1.0f / f10));
        return cVarM;
    }

    public static c m(@NonNull ViewGroup viewGroup, @NonNull AbstractC0529c abstractC0529c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0529c);
    }

    public final void A() {
        this.f29763l.computeCurrentVelocity(1000, this.f29764m);
        n(e(this.f29763l.getXVelocity(this.f29754c), this.f29765n, this.f29764m), e(this.f29763l.getYVelocity(this.f29754c), this.f29765n, this.f29764m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [r3.c$c] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void B(float f10, float f11, int i10) {
        int i11;
        boolean zC = c(f10, f11, i10, 1);
        ?? r8 = zC;
        if (c(f11, f10, i10, 4)) {
            r8 = (zC ? 1 : 0) | 4;
        }
        ?? r10 = r8;
        if (c(f10, f11, i10, 2)) {
            r10 = (r8 == true ? 1 : 0) | 2;
        }
        ?? r11 = r10;
        if (c(f11, f10, i10, 8)) {
            i11 = (r10 == true ? 1 : 0) | 8;
        }
        if (r11 == 0) {
            r11 = i11;
            return;
        }
        r11 = i11;
        int[] iArr = this.f29760i;
        iArr[i10] = (iArr[i10] | r11) == true ? 1 : 0;
        this.f29770s.f(r11, i10);
    }

    public final void C(float f10, float f11, int i10) {
        q(i10);
        float[] fArr = this.f29755d;
        this.f29757f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f29756e;
        this.f29758g[i10] = f11;
        fArr2[i10] = f11;
        this.f29759h[i10] = t((int) f10, (int) f11);
        this.f29762k |= 1 << i10;
    }

    public final void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (x(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f29757f[pointerId] = x10;
                this.f29758g[pointerId] = y10;
            }
        }
    }

    public void E(int i10) {
        this.f29773v.removeCallbacks(this.f29774w);
        if (this.f29753a != i10) {
            this.f29753a = i10;
            this.f29770s.j(i10);
            if (this.f29753a == 0) {
                this.f29771t = null;
            }
        }
    }

    public boolean F(int i10, int i11) {
        if (this.f29772u) {
            return s(i10, i11, (int) this.f29763l.getXVelocity(this.f29754c), (int) this.f29763l.getYVelocity(this.f29754c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    public boolean G(@NonNull MotionEvent motionEvent) {
        View viewR;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f29763l == null) {
            this.f29763l = VelocityTracker.obtain();
        }
        this.f29763l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            C(x10, y10, pointerId);
            View viewR2 = r((int) x10, (int) y10);
            if (viewR2 == this.f29771t && this.f29753a == 2) {
                I(viewR2, pointerId);
            }
            int i10 = this.f29759h[pointerId];
            int i11 = this.f29768q;
            if ((i10 & i11) != 0) {
                this.f29770s.h(i10 & i11, pointerId);
            }
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                C(x11, y11, pointerId2);
                int i12 = this.f29753a;
                if (i12 == 0) {
                    int i13 = this.f29759h[pointerId2];
                    int i14 = this.f29768q;
                    if ((i13 & i14) != 0) {
                        this.f29770s.h(i13 & i14, pointerId2);
                    }
                } else if (i12 == 2 && (viewR = r((int) x11, (int) y11)) == this.f29771t) {
                    I(viewR, pointerId2);
                }
            } else if (actionMasked == 6) {
                h(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f29755d != null && this.f29756e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i15 = 0; i15 < pointerCount; i15++) {
                int pointerId3 = motionEvent.getPointerId(i15);
                if (x(pointerId3)) {
                    float x12 = motionEvent.getX(i15);
                    float y12 = motionEvent.getY(i15);
                    float f10 = x12 - this.f29755d[pointerId3];
                    float f11 = y12 - this.f29756e[pointerId3];
                    View viewR3 = r((int) x12, (int) y12);
                    boolean z10 = viewR3 != null && d(viewR3, f10, f11);
                    if (!z10) {
                        B(f10, f11, pointerId3);
                        if (this.f29753a != 1) {
                            break;
                        }
                    } else {
                        int left = viewR3.getLeft();
                        int i16 = (int) f10;
                        int iA = this.f29770s.a(viewR3, left + i16, i16);
                        int top = viewR3.getTop();
                        int i17 = (int) f11;
                        int iB = this.f29770s.b(viewR3, top + i17, i17);
                        int iD = this.f29770s.d(viewR3);
                        int iE = this.f29770s.e(viewR3);
                        if ((iD == 0 || (iD > 0 && iA == left)) && (iE == 0 || (iE > 0 && iB == top))) {
                            break;
                        }
                        B(f10, f11, pointerId3);
                        if (this.f29753a != 1 || (z10 && I(viewR3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            D(motionEvent);
        }
        return this.f29753a == 1;
    }

    public boolean H(@NonNull View view, int i10, int i11) {
        this.f29771t = view;
        this.f29754c = -1;
        boolean zS = s(i10, i11, 0, 0);
        if (!zS && this.f29753a == 0 && this.f29771t != null) {
            this.f29771t = null;
        }
        return zS;
    }

    public boolean I(View view, int i10) {
        if (view == this.f29771t && this.f29754c == i10) {
            return true;
        }
        if (view == null || !this.f29770s.m(view, i10)) {
            return false;
        }
        this.f29754c = i10;
        b(view, i10);
        return true;
    }

    public void a() {
        this.f29754c = -1;
        g();
        VelocityTracker velocityTracker = this.f29763l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f29763l = null;
        }
    }

    public void b(@NonNull View view, int i10) {
        if (view.getParent() == this.f29773v) {
            this.f29771t = view;
            this.f29754c = i10;
            this.f29770s.i(view, i10);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f29773v + ")");
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f29759h[i10] & i11) == i11 && (this.f29768q & i11) != 0 && (this.f29761j[i10] & i11) != i11 && (this.f29760i[i10] & i11) != i11) {
            int i12 = this.b;
            if (fAbs > i12 || fAbs2 > i12) {
                if (fAbs < fAbs2 * 0.5f && this.f29770s.g(i11)) {
                    int[] iArr = this.f29761j;
                    iArr[i10] = iArr[i10] | i11;
                    return false;
                }
                if ((this.f29760i[i10] & i11) == 0 && fAbs > this.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f29770s.d(view) > 0;
        boolean z11 = this.f29770s.e(view) > 0;
        if (z10 && z11) {
            float f12 = (f10 * f10) + (f11 * f11);
            int i10 = this.b;
            return f12 > ((float) (i10 * i10));
        }
        if (z10) {
            return Math.abs(f10) > ((float) this.b);
        }
        return z11 && Math.abs(f11) > ((float) this.b);
    }

    public final float e(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return 0.0f;
        }
        if (fAbs > f12) {
            return f10 > 0.0f ? f12 : -f12;
        }
        return f10;
    }

    public final int f(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        if (iAbs > i12) {
            return i10 > 0 ? i12 : -i12;
        }
        return i10;
    }

    public final void g() {
        float[] fArr = this.f29755d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f29756e, 0.0f);
        Arrays.fill(this.f29757f, 0.0f);
        Arrays.fill(this.f29758g, 0.0f);
        Arrays.fill(this.f29759h, 0);
        Arrays.fill(this.f29760i, 0);
        Arrays.fill(this.f29761j, 0);
        this.f29762k = 0;
    }

    public final void h(int i10) {
        if (this.f29755d == null || !w(i10)) {
            return;
        }
        this.f29755d[i10] = 0.0f;
        this.f29756e[i10] = 0.0f;
        this.f29757f[i10] = 0.0f;
        this.f29758g[i10] = 0.0f;
        this.f29759h[i10] = 0;
        this.f29760i[i10] = 0;
        this.f29761j[i10] = 0;
        this.f29762k = (~(1 << i10)) & this.f29762k;
    }

    public final int i(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f29773v.getWidth();
        float f10 = width / 2;
        float fO = f10 + (o(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fO / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public final int j(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int iF = f(i12, (int) this.f29765n, (int) this.f29764m);
        int iF2 = f(i13, (int) this.f29765n, (int) this.f29764m);
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        int iAbs3 = Math.abs(iF);
        int iAbs4 = Math.abs(iF2);
        int i14 = iAbs3 + iAbs4;
        int i15 = iAbs + iAbs2;
        if (iF != 0) {
            f10 = iAbs3;
            f11 = i14;
        } else {
            f10 = iAbs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (iF2 != 0) {
            f12 = iAbs4;
            f13 = i14;
        } else {
            f12 = iAbs2;
            f13 = i15;
        }
        return (int) ((i(i10, iF, this.f29770s.d(view)) * f14) + (i(i11, iF2, this.f29770s.e(view)) * (f12 / f13)));
    }

    public boolean k(boolean z10) {
        if (this.f29753a == 2) {
            boolean zComputeScrollOffset = this.f29769r.computeScrollOffset();
            int currX = this.f29769r.getCurrX();
            int currY = this.f29769r.getCurrY();
            int left = currX - this.f29771t.getLeft();
            int top = currY - this.f29771t.getTop();
            if (left != 0) {
                o0.W(this.f29771t, left);
            }
            if (top != 0) {
                o0.X(this.f29771t, top);
            }
            if (left != 0 || top != 0) {
                this.f29770s.k(this.f29771t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f29769r.getFinalX() && currY == this.f29769r.getFinalY()) {
                this.f29769r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z10) {
                    this.f29773v.post(this.f29774w);
                } else {
                    E(0);
                }
            }
        }
        return this.f29753a == 2;
    }

    public final void n(float f10, float f11) {
        this.f29772u = true;
        this.f29770s.l(this.f29771t, f10, f11);
        this.f29772u = false;
        if (this.f29753a == 1) {
            E(0);
        }
    }

    public final float o(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public final void p(int i10, int i11, int i12, int i13) {
        int left = this.f29771t.getLeft();
        int top = this.f29771t.getTop();
        if (i12 != 0) {
            i10 = this.f29770s.a(this.f29771t, i10, i12);
            o0.W(this.f29771t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f29770s.b(this.f29771t, i11, i13);
            o0.X(this.f29771t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f29770s.k(this.f29771t, i14, i15, i14 - left, i15 - top);
    }

    public final void q(int i10) {
        float[] fArr = this.f29755d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f29756e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f29757f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f29758g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f29759h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f29760i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f29761j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f29755d = fArr2;
            this.f29756e = fArr3;
            this.f29757f = fArr4;
            this.f29758g = fArr5;
            this.f29759h = iArr;
            this.f29760i = iArr2;
            this.f29761j = iArr3;
        }
    }

    public View r(int i10, int i11) {
        for (int childCount = this.f29773v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f29773v.getChildAt(this.f29770s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean s(int i10, int i11, int i12, int i13) {
        int left = this.f29771t.getLeft();
        int top = this.f29771t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f29769r.abortAnimation();
            E(0);
            return false;
        }
        this.f29769r.startScroll(left, top, i14, i15, j(this.f29771t, i14, i15, i12, i13));
        E(2);
        return true;
    }

    public final int t(int i10, int i11) {
        int i12 = i10 < this.f29773v.getLeft() + this.f29766o ? 1 : 0;
        if (i11 < this.f29773v.getTop() + this.f29766o) {
            i12 |= 4;
        }
        if (i10 > this.f29773v.getRight() - this.f29766o) {
            i12 |= 2;
        }
        return i11 > this.f29773v.getBottom() - this.f29766o ? i12 | 8 : i12;
    }

    public int u() {
        return this.b;
    }

    public boolean v(int i10, int i11) {
        return y(this.f29771t, i10, i11);
    }

    public boolean w(int i10) {
        return ((1 << i10) & this.f29762k) != 0;
    }

    public final boolean x(int i10) {
        if (w(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean y(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void z(@NonNull MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f29763l == null) {
            this.f29763l = VelocityTracker.obtain();
        }
        this.f29763l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewR = r((int) x10, (int) y10);
            C(x10, y10, pointerId);
            I(viewR, pointerId);
            int i12 = this.f29759h[pointerId];
            int i13 = this.f29768q;
            if ((i12 & i13) != 0) {
                this.f29770s.h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f29753a == 1) {
                A();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f29753a == 1) {
                if (x(this.f29754c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f29754c);
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f29757f;
                    int i14 = this.f29754c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.f29758g[i14]);
                    p(this.f29771t.getLeft() + i15, this.f29771t.getTop() + i16, i15, i16);
                    D(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (x(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f29755d[pointerId2];
                    float f11 = y12 - this.f29756e[pointerId2];
                    B(f10, f11, pointerId2);
                    if (this.f29753a != 1) {
                        View viewR2 = r((int) x12, (int) y12);
                        if (d(viewR2, f10, f11) && I(viewR2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            D(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f29753a == 1) {
                n(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            C(x13, y13, pointerId3);
            if (this.f29753a != 0) {
                if (v((int) x13, (int) y13)) {
                    I(this.f29771t, pointerId3);
                    return;
                }
                return;
            } else {
                I(r((int) x13, (int) y13), pointerId3);
                int i17 = this.f29759h[pointerId3];
                int i18 = this.f29768q;
                if ((i17 & i18) != 0) {
                    this.f29770s.h(i17 & i18, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f29753a == 1 && pointerId4 == this.f29754c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f29754c) {
                    View viewR3 = r((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f29771t;
                    if (viewR3 == view && I(view, pointerId5)) {
                        i10 = this.f29754c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                A();
            }
        }
        h(pointerId4);
    }
}
