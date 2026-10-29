package r3;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.List;
import w1.k;
import y2.p;
import y2.q;
import y2.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends androidx.core.view.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Rect f29736n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final r3.b.a<p> f29737o = new C0527a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final r3.b.InterfaceC0528b<k<p>, p> f29738p = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f29743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f29744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f29745j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f29739d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f29740e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f29741f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f29742g = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29746k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29747l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29748m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: r3.a$a, reason: collision with other inner class name */
    public class C0527a implements r3.b.a<p> {
        @Override // r3.b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p pVar, Rect rect) {
            pVar.j(rect);
        }
    }

    public class b implements r3.b.InterfaceC0528b<k<p>, p> {
        @Override // r3.b.InterfaceC0528b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public p a(k<p> kVar, int i10) {
            return kVar.k(i10);
        }

        @Override // r3.b.InterfaceC0528b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(k<p> kVar) {
            return kVar.j();
        }
    }

    public class c extends q {
        public c() {
        }

        @Override // y2.q
        public p b(int i10) {
            return p.a0(a.this.H(i10));
        }

        @Override // y2.q
        public p d(int i10) {
            int i11 = i10 == 2 ? a.this.f29746k : a.this.f29747l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // y2.q
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.P(i10, i11, bundle);
        }
    }

    public a(@NonNull View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f29744i = view;
        this.f29743h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (o0.x(view) == 0) {
            o0.w0(view, 1);
        }
    }

    public static Rect D(@NonNull View view, int i10, @NonNull Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i10 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i10 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    public static int F(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    public final int A() {
        return this.f29747l;
    }

    public abstract int B(float f10, float f11);

    public abstract void C(List<Integer> list);

    public final boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f29744i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f29744i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    public final boolean G(int i10, Rect rect) {
        p pVar;
        k<p> kVarY = y();
        int i11 = this.f29747l;
        p pVarE = i11 == Integer.MIN_VALUE ? null : kVarY.e(i11);
        if (i10 == 1 || i10 == 2) {
            pVar = (p) r3.b.d(kVarY, f29738p, f29737o, pVarE, i10, o0.z(this.f29744i) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i12 = this.f29747l;
            if (i12 != Integer.MIN_VALUE) {
                z(i12, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f29744i, i10, rect2);
            }
            pVar = (p) r3.b.c(kVarY, f29738p, f29737o, pVarE, rect2, i10);
        }
        return T(pVar != null ? kVarY.h(kVarY.f(pVar)) : Integer.MIN_VALUE);
    }

    @NonNull
    public p H(int i10) {
        return i10 == -1 ? u() : t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f29747l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    public abstract boolean J(int i10, int i11, Bundle bundle);

    public void K(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void L(int i10, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    public abstract void M(@NonNull p pVar);

    public abstract void N(int i10, @NonNull p pVar);

    public abstract void O(int i10, boolean z10);

    public boolean P(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? Q(i10, i11, bundle) : R(i11, bundle);
    }

    public final boolean Q(int i10, int i11, Bundle bundle) {
        if (i11 == 1) {
            return T(i10);
        }
        if (i11 == 2) {
            return o(i10);
        }
        if (i11 != 64) {
            return i11 != 128 ? J(i10, i11, bundle) : n(i10);
        }
        return S(i10);
    }

    public final boolean R(int i10, Bundle bundle) {
        return o0.b0(this.f29744i, i10, bundle);
    }

    public final boolean S(int i10) {
        int i11;
        if (!this.f29743h.isEnabled() || !this.f29743h.isTouchExplorationEnabled() || (i11 = this.f29746k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f29746k = i10;
        this.f29744i.invalidate();
        U(i10, 32768);
        return true;
    }

    public final boolean T(int i10) {
        int i11;
        if ((!this.f29744i.isFocused() && !this.f29744i.requestFocus()) || (i11 = this.f29747l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f29747l = i10;
        O(i10, true);
        U(i10, 8);
        return true;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f29743h.isEnabled() || (parent = this.f29744i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f29744i, q(i10, i11));
    }

    public final void V(int i10) {
        int i11 = this.f29748m;
        if (i11 == i10) {
            return;
        }
        this.f29748m = i10;
        U(i10, 128);
        U(i11, Barcode.FORMAT_QR_CODE);
    }

    @Override // androidx.core.view.a
    public q b(View view) {
        if (this.f29745j == null) {
            this.f29745j = new c();
        }
        return this.f29745j;
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void g(View view, p pVar) {
        super.g(view, pVar);
        M(pVar);
    }

    public final boolean n(int i10) {
        if (this.f29746k != i10) {
            return false;
        }
        this.f29746k = Integer.MIN_VALUE;
        this.f29744i.invalidate();
        U(i10, 65536);
        return true;
    }

    public final boolean o(int i10) {
        if (this.f29747l != i10) {
            return false;
        }
        this.f29747l = Integer.MIN_VALUE;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean p() {
        int i10 = this.f29747l;
        return i10 != Integer.MIN_VALUE && J(i10, 16, null);
    }

    public final AccessibilityEvent q(int i10, int i11) {
        return i10 != -1 ? r(i10, i11) : s(i11);
    }

    public final AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        p pVarH = H(i10);
        accessibilityEventObtain.getText().add(pVarH.B());
        accessibilityEventObtain.setContentDescription(pVarH.s());
        accessibilityEventObtain.setScrollable(pVarH.T());
        accessibilityEventObtain.setPassword(pVarH.S());
        accessibilityEventObtain.setEnabled(pVarH.L());
        accessibilityEventObtain.setChecked(pVarH.I());
        L(i10, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(pVarH.p());
        r.c(accessibilityEventObtain, this.f29744i, i10);
        accessibilityEventObtain.setPackageName(this.f29744i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent s(int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        this.f29744i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    @NonNull
    public final p t(int i10) {
        p pVarY = p.Y();
        pVarY.r0(true);
        pVarY.t0(true);
        pVarY.l0("android.view.View");
        Rect rect = f29736n;
        pVarY.g0(rect);
        pVarY.h0(rect);
        pVarY.C0(this.f29744i);
        N(i10, pVarY);
        if (pVarY.B() == null && pVarY.s() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        pVarY.j(this.f29740e);
        if (this.f29740e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iH = pVarY.h();
        if ((iH & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iH & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        pVarY.A0(this.f29744i.getContext().getPackageName());
        pVarY.I0(this.f29744i, i10);
        if (this.f29746k == i10) {
            pVarY.e0(true);
            pVarY.a(128);
        } else {
            pVarY.e0(false);
            pVarY.a(64);
        }
        boolean z10 = this.f29747l == i10;
        if (z10) {
            pVarY.a(2);
        } else if (pVarY.N()) {
            pVarY.a(1);
        }
        pVarY.u0(z10);
        this.f29744i.getLocationOnScreen(this.f29742g);
        pVarY.k(this.f29739d);
        if (this.f29739d.equals(rect)) {
            pVarY.j(this.f29739d);
            if (pVarY.b != -1) {
                p pVarY2 = p.Y();
                for (int i11 = pVarY.b; i11 != -1; i11 = pVarY2.b) {
                    pVarY2.D0(this.f29744i, -1);
                    pVarY2.g0(f29736n);
                    N(i11, pVarY2);
                    pVarY2.j(this.f29740e);
                    Rect rect2 = this.f29739d;
                    Rect rect3 = this.f29740e;
                    rect2.offset(rect3.left, rect3.top);
                }
                pVarY2.c0();
            }
            this.f29739d.offset(this.f29742g[0] - this.f29744i.getScrollX(), this.f29742g[1] - this.f29744i.getScrollY());
        }
        if (this.f29744i.getLocalVisibleRect(this.f29741f)) {
            this.f29741f.offset(this.f29742g[0] - this.f29744i.getScrollX(), this.f29742g[1] - this.f29744i.getScrollY());
            if (this.f29739d.intersect(this.f29741f)) {
                pVarY.h0(this.f29739d);
                if (E(this.f29739d)) {
                    pVarY.M0(true);
                }
            }
        }
        return pVarY;
    }

    @NonNull
    public final p u() {
        p pVarZ = p.Z(this.f29744i);
        o0.Z(this.f29744i, pVarZ);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (pVarZ.o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVarZ.c(this.f29744i, ((Integer) arrayList.get(i10)).intValue());
        }
        return pVarZ;
    }

    public final boolean v(@NonNull MotionEvent motionEvent) {
        if (this.f29743h.isEnabled() && this.f29743h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.f29748m == Integer.MIN_VALUE) {
                    return false;
                }
                V(Integer.MIN_VALUE);
                return true;
            }
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            if (iB != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public final boolean w(@NonNull KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int iF = F(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i10 < repeatCount && G(iF, null)) {
                                    i10++;
                                    z10 = true;
                                }
                                return z10;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                p();
                                return true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    p();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return G(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return G(1, null);
                }
            }
        }
        return false;
    }

    public final int x() {
        return this.f29746k;
    }

    public final k<p> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        k<p> kVar = new k<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            kVar.i(arrayList.get(i10).intValue(), t(arrayList.get(i10).intValue()));
        }
        return kVar;
    }

    public final void z(int i10, Rect rect) {
        H(i10).j(rect);
    }
}
