package p400r3;

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
import androidx.core.view.C0625o0;
import java.util.Arrays;

/* JADX INFO: renamed from: r3.c */
/* JADX INFO: loaded from: classes.dex */
public class C10782c {

    /* JADX INFO: renamed from: x */
    public static final Interpolator f38413x = new a();

    /* JADX INFO: renamed from: a */
    public int f38414a;

    /* JADX INFO: renamed from: b */
    public int f38415b;

    /* JADX INFO: renamed from: d */
    public float[] f38417d;

    /* JADX INFO: renamed from: e */
    public float[] f38418e;

    /* JADX INFO: renamed from: f */
    public float[] f38419f;

    /* JADX INFO: renamed from: g */
    public float[] f38420g;

    /* JADX INFO: renamed from: h */
    public int[] f38421h;

    /* JADX INFO: renamed from: i */
    public int[] f38422i;

    /* JADX INFO: renamed from: j */
    public int[] f38423j;

    /* JADX INFO: renamed from: k */
    public int f38424k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f38425l;

    /* JADX INFO: renamed from: m */
    public float f38426m;

    /* JADX INFO: renamed from: n */
    public float f38427n;

    /* JADX INFO: renamed from: o */
    public int f38428o;

    /* JADX INFO: renamed from: p */
    public final int f38429p;

    /* JADX INFO: renamed from: q */
    public int f38430q;

    /* JADX INFO: renamed from: r */
    public OverScroller f38431r;

    /* JADX INFO: renamed from: s */
    public final c f38432s;

    /* JADX INFO: renamed from: t */
    public View f38433t;

    /* JADX INFO: renamed from: u */
    public boolean f38434u;

    /* JADX INFO: renamed from: v */
    public final ViewGroup f38435v;

    /* JADX INFO: renamed from: c */
    public int f38416c = -1;

    /* JADX INFO: renamed from: w */
    public final Runnable f38436w = new b();

    /* JADX INFO: renamed from: r3.c$a */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: r3.c$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C10782c.this.m41073E(0);
        }
    }

    /* JADX INFO: renamed from: r3.c$c */
    public static abstract class c {
        /* JADX INFO: renamed from: a */
        public abstract int mo12015a(@NonNull View view, int i10, int i11);

        /* JADX INFO: renamed from: b */
        public abstract int mo12016b(@NonNull View view, int i10, int i11);

        /* JADX INFO: renamed from: c */
        public int m41102c(int i10) {
            return i10;
        }

        /* JADX INFO: renamed from: d */
        public int mo12017d(@NonNull View view) {
            return 0;
        }

        /* JADX INFO: renamed from: e */
        public int mo12167e(@NonNull View view) {
            return 0;
        }

        /* JADX INFO: renamed from: f */
        public void m41103f(int i10, int i11) {
        }

        /* JADX INFO: renamed from: g */
        public boolean m41104g(int i10) {
            return false;
        }

        /* JADX INFO: renamed from: h */
        public void m41105h(int i10, int i11) {
        }

        /* JADX INFO: renamed from: i */
        public void mo12018i(@NonNull View view, int i10) {
        }

        /* JADX INFO: renamed from: j */
        public abstract void mo12019j(int i10);

        /* JADX INFO: renamed from: k */
        public abstract void mo12020k(@NonNull View view, int i10, int i11, int i12, int i13);

        /* JADX INFO: renamed from: l */
        public abstract void mo12021l(@NonNull View view, float f10, float f11);

        /* JADX INFO: renamed from: m */
        public abstract boolean mo12022m(@NonNull View view, int i10);
    }

    public C10782c(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f38435v = viewGroup;
        this.f38432s = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f38429p = i10;
        this.f38428o = i10;
        this.f38415b = viewConfiguration.getScaledTouchSlop();
        this.f38426m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f38427n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f38431r = new OverScroller(context, f38413x);
    }

    /* JADX INFO: renamed from: l */
    public static C10782c m41067l(@NonNull ViewGroup viewGroup, float f10, @NonNull c cVar) {
        C10782c c10782cM41068m = m41068m(viewGroup, cVar);
        c10782cM41068m.f38415b = (int) (c10782cM41068m.f38415b * (1.0f / f10));
        return c10782cM41068m;
    }

    /* JADX INFO: renamed from: m */
    public static C10782c m41068m(@NonNull ViewGroup viewGroup, @NonNull c cVar) {
        return new C10782c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* JADX INFO: renamed from: A */
    public final void m41069A() {
        this.f38425l.computeCurrentVelocity(1000, this.f38426m);
        m41089n(m41082e(this.f38425l.getXVelocity(this.f38416c), this.f38427n, this.f38426m), m41082e(this.f38425l.getYVelocity(this.f38416c), this.f38427n, this.f38426m));
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
    /* JADX INFO: renamed from: B */
    public final void m41070B(float f10, float f11, int i10) {
        int i11;
        boolean zM41080c = m41080c(f10, f11, i10, 1);
        ?? r8 = zM41080c;
        if (m41080c(f11, f10, i10, 4)) {
            r8 = (zM41080c ? 1 : 0) | 4;
        }
        ?? r10 = r8;
        if (m41080c(f10, f11, i10, 2)) {
            r10 = (r8 == true ? 1 : 0) | 2;
        }
        ?? r11 = r10;
        if (m41080c(f11, f10, i10, 8)) {
            i11 = (r10 == true ? 1 : 0) | 8;
        }
        if (r11 == 0) {
            r11 = i11;
            return;
        }
        r11 = i11;
        int[] iArr = this.f38422i;
        iArr[i10] = (iArr[i10] | r11) == true ? 1 : 0;
        this.f38432s.m41103f(r11, i10);
    }

    /* JADX INFO: renamed from: C */
    public final void m41071C(float f10, float f11, int i10) {
        m41092q(i10);
        float[] fArr = this.f38417d;
        this.f38419f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f38418e;
        this.f38420g[i10] = f11;
        fArr2[i10] = f11;
        this.f38421h[i10] = m41095t((int) f10, (int) f11);
        this.f38424k |= 1 << i10;
    }

    /* JADX INFO: renamed from: D */
    public final void m41072D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (m41099x(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f38419f[pointerId] = x10;
                this.f38420g[pointerId] = y10;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m41073E(int i10) {
        this.f38435v.removeCallbacks(this.f38436w);
        if (this.f38414a != i10) {
            this.f38414a = i10;
            this.f38432s.mo12019j(i10);
            if (this.f38414a == 0) {
                this.f38433t = null;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m41074F(int i10, int i11) {
        if (this.f38434u) {
            return m41094s(i10, i11, (int) this.f38425l.getXVelocity(this.f38416c), (int) this.f38425l.getYVelocity(this.f38416c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    /* JADX INFO: renamed from: G */
    public boolean m41075G(@NonNull MotionEvent motionEvent) {
        View viewM41093r;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m41078a();
        }
        if (this.f38425l == null) {
            this.f38425l = VelocityTracker.obtain();
        }
        this.f38425l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m41071C(x10, y10, pointerId);
            View viewM41093r2 = m41093r((int) x10, (int) y10);
            if (viewM41093r2 == this.f38433t && this.f38414a == 2) {
                m41077I(viewM41093r2, pointerId);
            }
            int i10 = this.f38421h[pointerId];
            int i11 = this.f38430q;
            if ((i10 & i11) != 0) {
                this.f38432s.m41105h(i10 & i11, pointerId);
            }
        } else if (actionMasked == 1) {
            m41078a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m41078a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                m41071C(x11, y11, pointerId2);
                int i12 = this.f38414a;
                if (i12 == 0) {
                    int i13 = this.f38421h[pointerId2];
                    int i14 = this.f38430q;
                    if ((i13 & i14) != 0) {
                        this.f38432s.m41105h(i13 & i14, pointerId2);
                    }
                } else if (i12 == 2 && (viewM41093r = m41093r((int) x11, (int) y11)) == this.f38433t) {
                    m41077I(viewM41093r, pointerId2);
                }
            } else if (actionMasked == 6) {
                m41085h(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f38417d != null && this.f38418e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i15 = 0; i15 < pointerCount; i15++) {
                int pointerId3 = motionEvent.getPointerId(i15);
                if (m41099x(pointerId3)) {
                    float x12 = motionEvent.getX(i15);
                    float y12 = motionEvent.getY(i15);
                    float f10 = x12 - this.f38417d[pointerId3];
                    float f11 = y12 - this.f38418e[pointerId3];
                    View viewM41093r3 = m41093r((int) x12, (int) y12);
                    boolean z10 = viewM41093r3 != null && m41081d(viewM41093r3, f10, f11);
                    if (!z10) {
                        m41070B(f10, f11, pointerId3);
                        if (this.f38414a != 1) {
                            break;
                        }
                    } else {
                        int left = viewM41093r3.getLeft();
                        int i16 = (int) f10;
                        int iMo12015a = this.f38432s.mo12015a(viewM41093r3, left + i16, i16);
                        int top = viewM41093r3.getTop();
                        int i17 = (int) f11;
                        int iMo12016b = this.f38432s.mo12016b(viewM41093r3, top + i17, i17);
                        int iMo12017d = this.f38432s.mo12017d(viewM41093r3);
                        int iMo12167e = this.f38432s.mo12167e(viewM41093r3);
                        if ((iMo12017d == 0 || (iMo12017d > 0 && iMo12015a == left)) && (iMo12167e == 0 || (iMo12167e > 0 && iMo12016b == top))) {
                            break;
                        }
                        m41070B(f10, f11, pointerId3);
                        if (this.f38414a != 1 || (z10 && m41077I(viewM41093r3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m41072D(motionEvent);
        }
        return this.f38414a == 1;
    }

    /* JADX INFO: renamed from: H */
    public boolean m41076H(@NonNull View view, int i10, int i11) {
        this.f38433t = view;
        this.f38416c = -1;
        boolean zM41094s = m41094s(i10, i11, 0, 0);
        if (!zM41094s && this.f38414a == 0 && this.f38433t != null) {
            this.f38433t = null;
        }
        return zM41094s;
    }

    /* JADX INFO: renamed from: I */
    public boolean m41077I(View view, int i10) {
        if (view == this.f38433t && this.f38416c == i10) {
            return true;
        }
        if (view == null || !this.f38432s.mo12022m(view, i10)) {
            return false;
        }
        this.f38416c = i10;
        m41079b(view, i10);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m41078a() {
        this.f38416c = -1;
        m41084g();
        VelocityTracker velocityTracker = this.f38425l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f38425l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m41079b(@NonNull View view, int i10) {
        if (view.getParent() == this.f38435v) {
            this.f38433t = view;
            this.f38416c = i10;
            this.f38432s.mo12018i(view, i10);
            m41073E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f38435v + ")");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m41080c(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f38421h[i10] & i11) == i11 && (this.f38430q & i11) != 0 && (this.f38423j[i10] & i11) != i11 && (this.f38422i[i10] & i11) != i11) {
            int i12 = this.f38415b;
            if (fAbs > i12 || fAbs2 > i12) {
                if (fAbs < fAbs2 * 0.5f && this.f38432s.m41104g(i11)) {
                    int[] iArr = this.f38423j;
                    iArr[i10] = iArr[i10] | i11;
                    return false;
                }
                if ((this.f38422i[i10] & i11) == 0 && fAbs > this.f38415b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m41081d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f38432s.mo12017d(view) > 0;
        boolean z11 = this.f38432s.mo12167e(view) > 0;
        if (z10 && z11) {
            float f12 = (f10 * f10) + (f11 * f11);
            int i10 = this.f38415b;
            return f12 > ((float) (i10 * i10));
        }
        if (z10) {
            return Math.abs(f10) > ((float) this.f38415b);
        }
        return z11 && Math.abs(f11) > ((float) this.f38415b);
    }

    /* JADX INFO: renamed from: e */
    public final float m41082e(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return 0.0f;
        }
        if (fAbs > f12) {
            return f10 > 0.0f ? f12 : -f12;
        }
        return f10;
    }

    /* JADX INFO: renamed from: f */
    public final int m41083f(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        if (iAbs > i12) {
            return i10 > 0 ? i12 : -i12;
        }
        return i10;
    }

    /* JADX INFO: renamed from: g */
    public final void m41084g() {
        float[] fArr = this.f38417d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f38418e, 0.0f);
        Arrays.fill(this.f38419f, 0.0f);
        Arrays.fill(this.f38420g, 0.0f);
        Arrays.fill(this.f38421h, 0);
        Arrays.fill(this.f38422i, 0);
        Arrays.fill(this.f38423j, 0);
        this.f38424k = 0;
    }

    /* JADX INFO: renamed from: h */
    public final void m41085h(int i10) {
        if (this.f38417d == null || !m41098w(i10)) {
            return;
        }
        this.f38417d[i10] = 0.0f;
        this.f38418e[i10] = 0.0f;
        this.f38419f[i10] = 0.0f;
        this.f38420g[i10] = 0.0f;
        this.f38421h[i10] = 0;
        this.f38422i[i10] = 0;
        this.f38423j[i10] = 0;
        this.f38424k = (~(1 << i10)) & this.f38424k;
    }

    /* JADX INFO: renamed from: i */
    public final int m41086i(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f38435v.getWidth();
        float f10 = width / 2;
        float fM41090o = f10 + (m41090o(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fM41090o / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: j */
    public final int m41087j(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int iM41083f = m41083f(i12, (int) this.f38427n, (int) this.f38426m);
        int iM41083f2 = m41083f(i13, (int) this.f38427n, (int) this.f38426m);
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        int iAbs3 = Math.abs(iM41083f);
        int iAbs4 = Math.abs(iM41083f2);
        int i14 = iAbs3 + iAbs4;
        int i15 = iAbs + iAbs2;
        if (iM41083f != 0) {
            f10 = iAbs3;
            f11 = i14;
        } else {
            f10 = iAbs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (iM41083f2 != 0) {
            f12 = iAbs4;
            f13 = i14;
        } else {
            f12 = iAbs2;
            f13 = i15;
        }
        return (int) ((m41086i(i10, iM41083f, this.f38432s.mo12017d(view)) * f14) + (m41086i(i11, iM41083f2, this.f38432s.mo12167e(view)) * (f12 / f13)));
    }

    /* JADX INFO: renamed from: k */
    public boolean m41088k(boolean z10) {
        if (this.f38414a == 2) {
            boolean zComputeScrollOffset = this.f38431r.computeScrollOffset();
            int currX = this.f38431r.getCurrX();
            int currY = this.f38431r.getCurrY();
            int left = currX - this.f38433t.getLeft();
            int top = currY - this.f38433t.getTop();
            if (left != 0) {
                C0625o0.m3011W(this.f38433t, left);
            }
            if (top != 0) {
                C0625o0.m3012X(this.f38433t, top);
            }
            if (left != 0 || top != 0) {
                this.f38432s.mo12020k(this.f38433t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f38431r.getFinalX() && currY == this.f38431r.getFinalY()) {
                this.f38431r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z10) {
                    this.f38435v.post(this.f38436w);
                } else {
                    m41073E(0);
                }
            }
        }
        return this.f38414a == 2;
    }

    /* JADX INFO: renamed from: n */
    public final void m41089n(float f10, float f11) {
        this.f38434u = true;
        this.f38432s.mo12021l(this.f38433t, f10, f11);
        this.f38434u = false;
        if (this.f38414a == 1) {
            m41073E(0);
        }
    }

    /* JADX INFO: renamed from: o */
    public final float m41090o(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    /* JADX INFO: renamed from: p */
    public final void m41091p(int i10, int i11, int i12, int i13) {
        int left = this.f38433t.getLeft();
        int top = this.f38433t.getTop();
        if (i12 != 0) {
            i10 = this.f38432s.mo12015a(this.f38433t, i10, i12);
            C0625o0.m3011W(this.f38433t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f38432s.mo12016b(this.f38433t, i11, i13);
            C0625o0.m3012X(this.f38433t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f38432s.mo12020k(this.f38433t, i14, i15, i14 - left, i15 - top);
    }

    /* JADX INFO: renamed from: q */
    public final void m41092q(int i10) {
        float[] fArr = this.f38417d;
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
                float[] fArr6 = this.f38418e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f38419f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f38420g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f38421h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f38422i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f38423j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f38417d = fArr2;
            this.f38418e = fArr3;
            this.f38419f = fArr4;
            this.f38420g = fArr5;
            this.f38421h = iArr;
            this.f38422i = iArr2;
            this.f38423j = iArr3;
        }
    }

    /* JADX INFO: renamed from: r */
    public View m41093r(int i10, int i11) {
        for (int childCount = this.f38435v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f38435v.getChildAt(this.f38432s.m41102c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m41094s(int i10, int i11, int i12, int i13) {
        int left = this.f38433t.getLeft();
        int top = this.f38433t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f38431r.abortAnimation();
            m41073E(0);
            return false;
        }
        this.f38431r.startScroll(left, top, i14, i15, m41087j(this.f38433t, i14, i15, i12, i13));
        m41073E(2);
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final int m41095t(int i10, int i11) {
        int i12 = i10 < this.f38435v.getLeft() + this.f38428o ? 1 : 0;
        if (i11 < this.f38435v.getTop() + this.f38428o) {
            i12 |= 4;
        }
        if (i10 > this.f38435v.getRight() - this.f38428o) {
            i12 |= 2;
        }
        return i11 > this.f38435v.getBottom() - this.f38428o ? i12 | 8 : i12;
    }

    /* JADX INFO: renamed from: u */
    public int m41096u() {
        return this.f38415b;
    }

    /* JADX INFO: renamed from: v */
    public boolean m41097v(int i10, int i11) {
        return m41100y(this.f38433t, i10, i11);
    }

    /* JADX INFO: renamed from: w */
    public boolean m41098w(int i10) {
        return ((1 << i10) & this.f38424k) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m41099x(int i10) {
        if (m41098w(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: y */
    public boolean m41100y(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    /* JADX INFO: renamed from: z */
    public void m41101z(@NonNull MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m41078a();
        }
        if (this.f38425l == null) {
            this.f38425l = VelocityTracker.obtain();
        }
        this.f38425l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM41093r = m41093r((int) x10, (int) y10);
            m41071C(x10, y10, pointerId);
            m41077I(viewM41093r, pointerId);
            int i12 = this.f38421h[pointerId];
            int i13 = this.f38430q;
            if ((i12 & i13) != 0) {
                this.f38432s.m41105h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f38414a == 1) {
                m41069A();
            }
            m41078a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f38414a == 1) {
                if (m41099x(this.f38416c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f38416c);
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f38419f;
                    int i14 = this.f38416c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.f38420g[i14]);
                    m41091p(this.f38433t.getLeft() + i15, this.f38433t.getTop() + i16, i15, i16);
                    m41072D(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (m41099x(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f38417d[pointerId2];
                    float f11 = y12 - this.f38418e[pointerId2];
                    m41070B(f10, f11, pointerId2);
                    if (this.f38414a != 1) {
                        View viewM41093r2 = m41093r((int) x12, (int) y12);
                        if (m41081d(viewM41093r2, f10, f11) && m41077I(viewM41093r2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            m41072D(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f38414a == 1) {
                m41089n(0.0f, 0.0f);
            }
            m41078a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            m41071C(x13, y13, pointerId3);
            if (this.f38414a != 0) {
                if (m41097v((int) x13, (int) y13)) {
                    m41077I(this.f38433t, pointerId3);
                    return;
                }
                return;
            } else {
                m41077I(m41093r((int) x13, (int) y13), pointerId3);
                int i17 = this.f38421h[pointerId3];
                int i18 = this.f38430q;
                if ((i17 & i18) != 0) {
                    this.f38432s.m41105h(i17 & i18, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f38414a == 1 && pointerId4 == this.f38416c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f38416c) {
                    View viewM41093r3 = m41093r((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f38433t;
                    if (viewM41093r3 == view && m41077I(view, pointerId5)) {
                        i10 = this.f38416c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                m41069A();
            }
        }
        m41085h(pointerId4);
    }
}
