package p400r3;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.core.view.C0582a;
import androidx.core.view.C0625o0;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.List;
import p504w1.C12287k;
import p564y2.C13017p;
import p564y2.C13018q;
import p564y2.C13019r;

/* JADX INFO: renamed from: r3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10780a extends C0582a {

    /* JADX INFO: renamed from: n */
    public static final Rect f38395n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, EditorInfoCompat.IME_FLAG_FORCE_ASCII, EditorInfoCompat.IME_FLAG_FORCE_ASCII);

    /* JADX INFO: renamed from: o */
    public static final C10781b.a<C13017p> f38396o = new a();

    /* JADX INFO: renamed from: p */
    public static final C10781b.b<C12287k<C13017p>, C13017p> f38397p = new b();

    /* JADX INFO: renamed from: h */
    public final AccessibilityManager f38402h;

    /* JADX INFO: renamed from: i */
    public final View f38403i;

    /* JADX INFO: renamed from: j */
    public c f38404j;

    /* JADX INFO: renamed from: d */
    public final Rect f38398d = new Rect();

    /* JADX INFO: renamed from: e */
    public final Rect f38399e = new Rect();

    /* JADX INFO: renamed from: f */
    public final Rect f38400f = new Rect();

    /* JADX INFO: renamed from: g */
    public final int[] f38401g = new int[2];

    /* JADX INFO: renamed from: k */
    public int f38405k = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

    /* JADX INFO: renamed from: l */
    public int f38406l = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

    /* JADX INFO: renamed from: m */
    public int f38407m = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

    /* JADX INFO: renamed from: r3.a$a */
    public class a implements C10781b.a<C13017p> {
        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Landroid/graphics/Rect;)V */
        @Override // p400r3.C10781b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo41043a(C13017p c13017p, Rect rect) {
            c13017p.m48403j(rect);
        }
    }

    /* JADX INFO: renamed from: r3.a$b */
    public class b implements C10781b.b<C12287k<C13017p>, C13017p> {
        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;I)Ljava/lang/Object; */
        @Override // p400r3.C10781b.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C13017p mo41045a(C12287k<C13017p> c12287k, int i10) {
            return c12287k.m45638k(i10);
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;)I */
        @Override // p400r3.C10781b.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int mo41046b(C12287k<C13017p> c12287k) {
            return c12287k.m45637j();
        }
    }

    /* JADX INFO: renamed from: r3.a$c */
    public class c extends C13018q {
        public c() {
        }

        @Override // p564y2.C13018q
        /* JADX INFO: renamed from: b */
        public C13017p mo41049b(int i10) {
            return C13017p.m48345a0(AbstractC10780a.this.m41019H(i10));
        }

        @Override // p564y2.C13018q
        /* JADX INFO: renamed from: d */
        public C13017p mo41050d(int i10) {
            int i11 = i10 == 2 ? AbstractC10780a.this.f38405k : AbstractC10780a.this.f38406l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return mo41049b(i11);
        }

        @Override // p564y2.C13018q
        /* JADX INFO: renamed from: f */
        public boolean mo41051f(int i10, int i11, Bundle bundle) {
            return AbstractC10780a.this.m41023P(i10, i11, bundle);
        }
    }

    public AbstractC10780a(@NonNull View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f38403i = view;
        this.f38402h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (C0625o0.m3061x(view) == 0) {
            C0625o0.m3060w0(view, 1);
        }
    }

    /* JADX INFO: renamed from: D */
    public static Rect m41014D(@NonNull View view, int i10, @NonNull Rect rect) {
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

    /* JADX INFO: renamed from: F */
    public static int m41015F(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    /* JADX INFO: renamed from: A */
    public final int m41016A() {
        return this.f38406l;
    }

    /* JADX INFO: renamed from: B */
    public abstract int mo12409B(float f10, float f11);

    /* JADX INFO: renamed from: C */
    public abstract void mo12410C(List<Integer> list);

    /* JADX INFO: renamed from: E */
    public final boolean m41017E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f38403i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f38403i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m41018G(int i10, Rect rect) {
        C13017p c13017p;
        C12287k<C13017p> c12287kM41041y = m41041y();
        int i11 = this.f38406l;
        int iM45635h = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        C13017p c13017pM45633e = i11 == Integer.MIN_VALUE ? null : c12287kM41041y.m45633e(i11);
        if (i10 == 1 || i10 == 2) {
            c13017p = (C13017p) C10781b.m41055d(c12287kM41041y, f38397p, f38396o, c13017pM45633e, i10, C0625o0.m3065z(this.f38403i) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i12 = this.f38406l;
            if (i12 != Integer.MIN_VALUE) {
                m41042z(i12, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m41014D(this.f38403i, i10, rect2);
            }
            c13017p = (C13017p) C10781b.m41054c(c12287kM41041y, f38397p, f38396o, c13017pM45633e, rect2, i10);
        }
        if (c13017p != null) {
            iM45635h = c12287kM41041y.m45635h(c12287kM41041y.m45634f(c13017p));
        }
        return m41027T(iM45635h);
    }

    @NonNull
    /* JADX INFO: renamed from: H */
    public C13017p m41019H(int i10) {
        return i10 == -1 ? m41037u() : m41036t(i10);
    }

    /* JADX INFO: renamed from: I */
    public final void m41020I(boolean z10, int i10, Rect rect) {
        int i11 = this.f38406l;
        if (i11 != Integer.MIN_VALUE) {
            m41031o(i11);
        }
        if (z10) {
            m41018G(i10, rect);
        }
    }

    /* JADX INFO: renamed from: J */
    public abstract boolean mo12411J(int i10, int i11, Bundle bundle);

    /* JADX INFO: renamed from: K */
    public void m41021K(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: L */
    public void m41022L(int i10, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: M */
    public abstract void mo12412M(@NonNull C13017p c13017p);

    /* JADX INFO: renamed from: N */
    public abstract void mo12413N(int i10, @NonNull C13017p c13017p);

    /* JADX INFO: renamed from: O */
    public abstract void mo12414O(int i10, boolean z10);

    /* JADX INFO: renamed from: P */
    public boolean m41023P(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? m41024Q(i10, i11, bundle) : m41025R(i11, bundle);
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m41024Q(int i10, int i11, Bundle bundle) {
        if (i11 == 1) {
            return m41027T(i10);
        }
        if (i11 == 2) {
            return m41031o(i10);
        }
        if (i11 != 64) {
            return i11 != 128 ? mo12411J(i10, i11, bundle) : m41030n(i10);
        }
        return m41026S(i10);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m41025R(int i10, Bundle bundle) {
        return C0625o0.m3018b0(this.f38403i, i10, bundle);
    }

    /* JADX INFO: renamed from: S */
    public final boolean m41026S(int i10) {
        int i11;
        if (!this.f38402h.isEnabled() || !this.f38402h.isTouchExplorationEnabled() || (i11 = this.f38405k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            m41030n(i11);
        }
        this.f38405k = i10;
        this.f38403i.invalidate();
        m41028U(i10, 32768);
        return true;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m41027T(int i10) {
        int i11;
        if ((!this.f38403i.isFocused() && !this.f38403i.requestFocus()) || (i11 = this.f38406l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            m41031o(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f38406l = i10;
        mo12414O(i10, true);
        m41028U(i10, 8);
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m41028U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f38402h.isEnabled() || (parent = this.f38403i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f38403i, m41033q(i10, i11));
    }

    /* JADX INFO: renamed from: V */
    public final void m41029V(int i10) {
        int i11 = this.f38407m;
        if (i11 == i10) {
            return;
        }
        this.f38407m = i10;
        m41028U(i10, 128);
        m41028U(i11, 256);
    }

    @Override // androidx.core.view.C0582a
    /* JADX INFO: renamed from: b */
    public C13018q mo2795b(View view) {
        if (this.f38404j == null) {
            this.f38404j = new c();
        }
        return this.f38404j;
    }

    @Override // androidx.core.view.C0582a
    /* JADX INFO: renamed from: f */
    public void mo2798f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2798f(view, accessibilityEvent);
        m41021K(accessibilityEvent);
    }

    @Override // androidx.core.view.C0582a
    /* JADX INFO: renamed from: g */
    public void mo2799g(View view, C13017p c13017p) {
        super.mo2799g(view, c13017p);
        mo12412M(c13017p);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m41030n(int i10) {
        if (this.f38405k != i10) {
            return false;
        }
        this.f38405k = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.f38403i.invalidate();
        m41028U(i10, 65536);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m41031o(int i10) {
        if (this.f38406l != i10) {
            return false;
        }
        this.f38406l = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        mo12414O(i10, false);
        m41028U(i10, 8);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m41032p() {
        int i10 = this.f38406l;
        return i10 != Integer.MIN_VALUE && mo12411J(i10, 16, null);
    }

    /* JADX INFO: renamed from: q */
    public final AccessibilityEvent m41033q(int i10, int i11) {
        return i10 != -1 ? m41034r(i10, i11) : m41035s(i11);
    }

    /* JADX INFO: renamed from: r */
    public final AccessibilityEvent m41034r(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        C13017p c13017pM41019H = m41019H(i10);
        accessibilityEventObtain.getText().add(c13017pM41019H.m48351B());
        accessibilityEventObtain.setContentDescription(c13017pM41019H.m48420s());
        accessibilityEventObtain.setScrollable(c13017pM41019H.m48382T());
        accessibilityEventObtain.setPassword(c13017pM41019H.m48381S());
        accessibilityEventObtain.setEnabled(c13017pM41019H.m48371L());
        accessibilityEventObtain.setChecked(c13017pM41019H.m48365I());
        m41022L(i10, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(c13017pM41019H.m48415p());
        C13019r.m48461c(accessibilityEventObtain, this.f38403i, i10);
        accessibilityEventObtain.setPackageName(this.f38403i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    /* JADX INFO: renamed from: s */
    public final AccessibilityEvent m41035s(int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        this.f38403i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public final C13017p m41036t(int i10) {
        C13017p c13017pM48343Y = C13017p.m48343Y();
        c13017pM48343Y.m48419r0(true);
        c13017pM48343Y.m48423t0(true);
        c13017pM48343Y.m48408l0("android.view.View");
        Rect rect = f38395n;
        c13017pM48343Y.m48398g0(rect);
        c13017pM48343Y.m48400h0(rect);
        c13017pM48343Y.m48354C0(this.f38403i);
        mo12413N(i10, c13017pM48343Y);
        if (c13017pM48343Y.m48351B() == null && c13017pM48343Y.m48420s() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        c13017pM48343Y.m48403j(this.f38399e);
        if (this.f38399e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iM48399h = c13017pM48343Y.m48399h();
        if ((iM48399h & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iM48399h & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        c13017pM48343Y.m48350A0(this.f38403i.getContext().getPackageName());
        c13017pM48343Y.m48366I0(this.f38403i, i10);
        if (this.f38405k == i10) {
            c13017pM48343Y.m48395e0(true);
            c13017pM48343Y.m48387a(128);
        } else {
            c13017pM48343Y.m48395e0(false);
            c13017pM48343Y.m48387a(64);
        }
        boolean z10 = this.f38406l == i10;
        if (z10) {
            c13017pM48343Y.m48387a(2);
        } else if (c13017pM48343Y.m48375N()) {
            c13017pM48343Y.m48387a(1);
        }
        c13017pM48343Y.m48425u0(z10);
        this.f38403i.getLocationOnScreen(this.f38401g);
        c13017pM48343Y.m48405k(this.f38398d);
        if (this.f38398d.equals(rect)) {
            c13017pM48343Y.m48403j(this.f38398d);
            if (c13017pM48343Y.f46039b != -1) {
                C13017p c13017pM48343Y2 = C13017p.m48343Y();
                for (int i11 = c13017pM48343Y.f46039b; i11 != -1; i11 = c13017pM48343Y2.f46039b) {
                    c13017pM48343Y2.m48356D0(this.f38403i, -1);
                    c13017pM48343Y2.m48398g0(f38395n);
                    mo12413N(i11, c13017pM48343Y2);
                    c13017pM48343Y2.m48403j(this.f38399e);
                    Rect rect2 = this.f38398d;
                    Rect rect3 = this.f38399e;
                    rect2.offset(rect3.left, rect3.top);
                }
                c13017pM48343Y2.m48391c0();
            }
            this.f38398d.offset(this.f38401g[0] - this.f38403i.getScrollX(), this.f38401g[1] - this.f38403i.getScrollY());
        }
        if (this.f38403i.getLocalVisibleRect(this.f38400f)) {
            this.f38400f.offset(this.f38401g[0] - this.f38403i.getScrollX(), this.f38401g[1] - this.f38403i.getScrollY());
            if (this.f38398d.intersect(this.f38400f)) {
                c13017pM48343Y.m48400h0(this.f38398d);
                if (m41017E(this.f38398d)) {
                    c13017pM48343Y.m48374M0(true);
                }
            }
        }
        return c13017pM48343Y;
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public final C13017p m41037u() {
        C13017p c13017pM48344Z = C13017p.m48344Z(this.f38403i);
        C0625o0.m3014Z(this.f38403i, c13017pM48344Z);
        ArrayList arrayList = new ArrayList();
        mo12410C(arrayList);
        if (c13017pM48344Z.m48413o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c13017pM48344Z.m48390c(this.f38403i, ((Integer) arrayList.get(i10)).intValue());
        }
        return c13017pM48344Z;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m41038v(@NonNull MotionEvent motionEvent) {
        if (this.f38402h.isEnabled() && this.f38402h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.f38407m == Integer.MIN_VALUE) {
                    return false;
                }
                m41029V(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                return true;
            }
            int iMo12409B = mo12409B(motionEvent.getX(), motionEvent.getY());
            m41029V(iMo12409B);
            if (iMo12409B != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX INFO: renamed from: w */
    public final boolean m41039w(@NonNull KeyEvent keyEvent) {
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
                                int iM41015F = m41015F(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i10 < repeatCount && m41018G(iM41015F, null)) {
                                    i10++;
                                    z10 = true;
                                }
                                return z10;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                m41032p();
                                return true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    m41032p();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return m41018G(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m41018G(1, null);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final int m41040x() {
        return this.f38405k;
    }

    /* JADX INFO: renamed from: y */
    public final C12287k<C13017p> m41041y() {
        ArrayList arrayList = new ArrayList();
        mo12410C(arrayList);
        C12287k<C13017p> c12287k = new C12287k<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c12287k.m45636i(arrayList.get(i10).intValue(), m41036t(arrayList.get(i10).intValue()));
        }
        return c12287k;
    }

    /* JADX INFO: renamed from: z */
    public final void m41042z(int i10, Rect rect) {
        m41019H(i10).m48403j(rect);
    }
}
