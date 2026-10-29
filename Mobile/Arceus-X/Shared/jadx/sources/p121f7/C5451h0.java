package p121f7;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p147g7.C6047a;
import p211j7.EnumC7035a;
import p240k7.C7487a;
import p240k7.C7488b;
import p266l7.C8004c;
import p266l7.C8006e;
import p266l7.C8009h;
import p324o7.C9710c;
import p373q7.C10475v;
import p431s7.C11189e;
import p431s7.C11194j;
import p431s7.C11197m;
import p431s7.ChoreographerFrameCallbackC11192h;
import p431s7.ThreadFactoryC11190f;
import p444t7.C11552c;

/* JADX INFO: renamed from: f7.h0 */
/* JADX INFO: loaded from: classes3.dex */
public class C5451h0 extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: T */
    public static final boolean f21052T = false;

    /* JADX INFO: renamed from: U */
    public static final List<String> f21053U = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");

    /* JADX INFO: renamed from: V */
    public static final Executor f21054V = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC11190f());

    /* JADX INFO: renamed from: A */
    public Canvas f21055A;

    /* JADX INFO: renamed from: B */
    public Rect f21056B;

    /* JADX INFO: renamed from: C */
    public RectF f21057C;

    /* JADX INFO: renamed from: D */
    public Paint f21058D;

    /* JADX INFO: renamed from: E */
    public Rect f21059E;

    /* JADX INFO: renamed from: F */
    public Rect f21060F;

    /* JADX INFO: renamed from: G */
    public RectF f21061G;

    /* JADX INFO: renamed from: H */
    public RectF f21062H;

    /* JADX INFO: renamed from: I */
    public Matrix f21063I;

    /* JADX INFO: renamed from: J */
    public float[] f21064J;

    /* JADX INFO: renamed from: K */
    public Matrix f21065K;

    /* JADX INFO: renamed from: L */
    public boolean f21066L;

    /* JADX INFO: renamed from: M */
    public EnumC5436a f21067M;

    /* JADX INFO: renamed from: N */
    public final ValueAnimator.AnimatorUpdateListener f21068N;

    /* JADX INFO: renamed from: O */
    public final Semaphore f21069O;

    /* JADX INFO: renamed from: P */
    public Handler f21070P;

    /* JADX INFO: renamed from: Q */
    public Runnable f21071Q;

    /* JADX INFO: renamed from: R */
    public final Runnable f21072R;

    /* JADX INFO: renamed from: S */
    public float f21073S;

    /* JADX INFO: renamed from: a */
    public C5452i f21074a;

    /* JADX INFO: renamed from: b */
    public final ChoreographerFrameCallbackC11192h f21075b;

    /* JADX INFO: renamed from: c */
    public boolean f21076c;

    /* JADX INFO: renamed from: d */
    public boolean f21077d;

    /* JADX INFO: renamed from: e */
    public boolean f21078e;

    /* JADX INFO: renamed from: f */
    public b f21079f;

    /* JADX INFO: renamed from: g */
    public final ArrayList<a> f21080g;

    /* JADX INFO: renamed from: h */
    public C7488b f21081h;

    /* JADX INFO: renamed from: i */
    public String f21082i;

    /* JADX INFO: renamed from: j */
    public C7487a f21083j;

    /* JADX INFO: renamed from: k */
    public Map<String, Typeface> f21084k;

    /* JADX INFO: renamed from: l */
    public String f21085l;

    /* JADX INFO: renamed from: m */
    public final C5455j0 f21086m;

    /* JADX INFO: renamed from: n */
    public boolean f21087n;

    /* JADX INFO: renamed from: o */
    public boolean f21088o;

    /* JADX INFO: renamed from: p */
    public C9710c f21089p;

    /* JADX INFO: renamed from: q */
    public int f21090q;

    /* JADX INFO: renamed from: r */
    public boolean f21091r;

    /* JADX INFO: renamed from: s */
    public boolean f21092s;

    /* JADX INFO: renamed from: t */
    public boolean f21093t;

    /* JADX INFO: renamed from: u */
    public boolean f21094u;

    /* JADX INFO: renamed from: v */
    public boolean f21095v;

    /* JADX INFO: renamed from: w */
    public EnumC5483x0 f21096w;

    /* JADX INFO: renamed from: x */
    public boolean f21097x;

    /* JADX INFO: renamed from: y */
    public final Matrix f21098y;

    /* JADX INFO: renamed from: z */
    public Bitmap f21099z;

    /* JADX INFO: renamed from: f7.h0$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo24920a(C5452i c5452i);
    }

    /* JADX INFO: renamed from: f7.h0$b */
    public enum b {
        NONE,
        PLAY,
        RESUME
    }

    public C5451h0() {
        ChoreographerFrameCallbackC11192h choreographerFrameCallbackC11192h = new ChoreographerFrameCallbackC11192h();
        this.f21075b = choreographerFrameCallbackC11192h;
        this.f21076c = true;
        this.f21077d = false;
        this.f21078e = false;
        this.f21079f = b.NONE;
        this.f21080g = new ArrayList<>();
        this.f21086m = new C5455j0();
        this.f21087n = false;
        this.f21088o = true;
        this.f21090q = 255;
        this.f21095v = false;
        this.f21096w = EnumC5483x0.AUTOMATIC;
        this.f21097x = false;
        this.f21098y = new Matrix();
        this.f21064J = new float[9];
        this.f21066L = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: f7.b0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C5451h0.m24938g(this.f21027a, valueAnimator);
            }
        };
        this.f21068N = animatorUpdateListener;
        this.f21069O = new Semaphore(1);
        this.f21072R = new Runnable() { // from class: f7.c0
            @Override // java.lang.Runnable
            public final void run() {
                C5451h0.m24942k(this.f21028a);
            }
        };
        this.f21073S = -3.4028235E38f;
        choreographerFrameCallbackC11192h.addUpdateListener(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m24938g(C5451h0 c5451h0, ValueAnimator valueAnimator) {
        if (c5451h0.m24958F()) {
            c5451h0.invalidateSelf();
            return;
        }
        C9710c c9710c = c5451h0.f21089p;
        if (c9710c != null) {
            c9710c.mo38350M(c5451h0.f21075b.m42172o());
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m24942k(final C5451h0 c5451h0) {
        C9710c c9710c = c5451h0.f21089p;
        if (c9710c == null) {
            return;
        }
        try {
            c5451h0.f21069O.acquire();
            c9710c.mo38350M(c5451h0.f21075b.m42172o());
            if (f21052T && c5451h0.f21066L) {
                if (c5451h0.f21070P == null) {
                    c5451h0.f21070P = new Handler(Looper.getMainLooper());
                    c5451h0.f21071Q = new Runnable() { // from class: f7.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5451h0.m24945n(this.f21249a);
                        }
                    };
                }
                c5451h0.f21070P.post(c5451h0.f21071Q);
            }
        } catch (InterruptedException unused) {
        } finally {
            c5451h0.f21069O.release();
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m24945n(C5451h0 c5451h0) {
        Drawable.Callback callback = c5451h0.getCallback();
        if (callback != null) {
            callback.invalidateDrawable(c5451h0);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m24948A(EnumC5453i0 enumC5453i0, boolean z10) {
        boolean zM25058a = this.f21086m.m25058a(enumC5453i0, z10);
        if (this.f21074a == null || !zM25058a) {
            return;
        }
        m25020t();
    }

    @Deprecated
    /* JADX INFO: renamed from: A0 */
    public void m24949A0(boolean z10) {
        this.f21077d = z10;
    }

    /* JADX INFO: renamed from: B */
    public void m24950B() {
        this.f21080g.clear();
        this.f21075b.m42171n();
        if (isVisible()) {
            return;
        }
        this.f21079f = b.NONE;
    }

    /* JADX INFO: renamed from: B0 */
    public void m24951B0(InterfaceC5440c interfaceC5440c) {
        C7488b c7488b = this.f21081h;
        if (c7488b != null) {
            c7488b.m31124d(interfaceC5440c);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m24952C(int i10, int i11) {
        Bitmap bitmap = this.f21099z;
        if (bitmap == null || bitmap.getWidth() < i10 || this.f21099z.getHeight() < i11) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f21099z = bitmapCreateBitmap;
            this.f21055A.setBitmap(bitmapCreateBitmap);
            this.f21066L = true;
            return;
        }
        if (this.f21099z.getWidth() > i10 || this.f21099z.getHeight() > i11) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f21099z, 0, 0, i10, i11);
            this.f21099z = bitmapCreateBitmap2;
            this.f21055A.setBitmap(bitmapCreateBitmap2);
            this.f21066L = true;
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m24953C0(String str) {
        this.f21082i = str;
    }

    /* JADX INFO: renamed from: D */
    public final void m24954D() {
        if (this.f21055A != null) {
            return;
        }
        this.f21055A = new Canvas();
        this.f21062H = new RectF();
        this.f21063I = new Matrix();
        this.f21065K = new Matrix();
        this.f21056B = new Rect();
        this.f21057C = new RectF();
        this.f21058D = new C6047a();
        this.f21059E = new Rect();
        this.f21060F = new Rect();
        this.f21061G = new RectF();
    }

    /* JADX INFO: renamed from: D0 */
    public void m24955D0(boolean z10) {
        this.f21087n = z10;
    }

    /* JADX INFO: renamed from: E */
    public EnumC5436a m24956E() {
        EnumC5436a enumC5436a = this.f21067M;
        return enumC5436a != null ? enumC5436a : C5444e.m24925d();
    }

    /* JADX INFO: renamed from: E0 */
    public void m24957E0(final int i10) {
        if (this.f21074a == null) {
            this.f21080g.add(new a() { // from class: f7.s
                @Override // p121f7.C5451h0.a
                /* JADX INFO: renamed from: a */
                public final void mo24920a(C5452i c5452i) {
                    this.f21200a.m24957E0(i10);
                }
            });
        } else {
            this.f21075b.m42163K(i10 + 0.99f);
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m24958F() {
        return m24956E() == EnumC5436a.ENABLED;
    }

    /* JADX INFO: renamed from: F0 */
    public void m24959F0(final String str) {
        C5452i c5452i = this.f21074a;
        if (c5452i == null) {
            this.f21080g.add(new a() { // from class: f7.z
                @Override // p121f7.C5451h0.a
                /* JADX INFO: renamed from: a */
                public final void mo24920a(C5452i c5452i2) {
                    this.f21255a.m24959F0(str);
                }
            });
            return;
        }
        C8009h c8009hM25046l = c5452i.m25046l(str);
        if (c8009hM25046l != null) {
            m24957E0((int) (c8009hM25046l.f29963b + c8009hM25046l.f29964c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* JADX INFO: renamed from: G */
    public Bitmap m24960G(String str) {
        C7488b c7488bM24974N = m24974N();
        if (c7488bM24974N != null) {
            return c7488bM24974N.m31121a(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: G0 */
    public void m24961G0(final float f10) {
        C5452i c5452i = this.f21074a;
        if (c5452i == null) {
            this.f21080g.add(new a() { // from class: f7.v
                @Override // p121f7.C5451h0.a
                /* JADX INFO: renamed from: a */
                public final void mo24920a(C5452i c5452i2) {
                    this.f21219a.m24961G0(f10);
                }
            });
        } else {
            this.f21075b.m42163K(C11194j.m42191i(c5452i.m25050p(), this.f21074a.m25040f(), f10));
        }
    }

    /* JADX INFO: renamed from: H */
    public boolean m24962H() {
        return this.f21095v;
    }

    /* JADX INFO: renamed from: H0 */
    public void m24963H0(final int i10, final int i11) {
        if (this.f21074a == null) {
            this.f21080g.add(new a() { // from class: f7.w
                @Override // p121f7.C5451h0.a
                /* JADX INFO: renamed from: a */
                public final void mo24920a(C5452i c5452i) {
                    this.f21222a.m24963H0(i10, i11);
                }
            });
        } else {
            this.f21075b.m42164N(i10, i11 + 0.99f);
        }
    }

    /* JADX INFO: renamed from: I */
    public boolean m24964I() {
        return this.f21088o;
    }

    /* JADX INFO: renamed from: I0 */
    public void m24965I0(final String str) {
        C5452i c5452i = this.f21074a;
        if (c5452i == null) {
            this.f21080g.add(new a() { // from class: f7.r
                @Override // p121f7.C5451h0.a
                /* JADX INFO: renamed from: a */
                public final void mo24920a(C5452i c5452i2) {
                    this.f21197a.m24965I0(str);
                }
            });
            return;
        }
        C8009h c8009hM25046l = c5452i.m25046l(str);
        if (c8009hM25046l != null) {
            int i10 = (int) c8009hM25046l.f29963b;
            m24963H0(i10, ((int) c8009hM25046l.f29964c) + i10);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    /* JADX INFO: renamed from: J */
    public C5452i m24966J() {
        return this.f21074a;
    }

    /* JADX INFO: renamed from: J0 */
    public void m24967J0(final int i10) {
        if (this.f21074a == null) {
            this.f21080g.add(new a() { // from class: f7.t
                @Override // p121f7.C5451h0.a
                /* JADX INFO: renamed from: a */
                public final void mo24920a(C5452i c5452i) {
                    this.f21208a.m24967J0(i10);
                }
            });
        } else {
            this.f21075b.m42165O(i10);
        }
    }

    /* JADX INFO: renamed from: K */
    public final Context m24968K() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: K0 */
    public void m24969K0(final String str) {
        C5452i c5452i = this.f21074a;
        if (c5452i == null) {
            this.f21080g.add(new a() { // from class: f7.a0
                @Override // p121f7.C5451h0.a
                /* JADX INFO: renamed from: a */
                public final void mo24920a(C5452i c5452i2) {
                    this.f21025a.m24969K0(str);
                }
            });
            return;
        }
        C8009h c8009hM25046l = c5452i.m25046l(str);
        if (c8009hM25046l != null) {
            m24967J0((int) c8009hM25046l.f29963b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* JADX INFO: renamed from: L */
    public final C7487a m24970L() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f21083j == null) {
            C7487a c7487a = new C7487a(getCallback(), null);
            this.f21083j = c7487a;
            String str = this.f21085l;
            if (str != null) {
                c7487a.m31118c(str);
            }
        }
        return this.f21083j;
    }

    /* JADX INFO: renamed from: L0 */
    public void m24971L0(final float f10) {
        C5452i c5452i = this.f21074a;
        if (c5452i == null) {
            this.f21080g.add(new a() { // from class: f7.e0
                @Override // p121f7.C5451h0.a
                /* JADX INFO: renamed from: a */
                public final void mo24920a(C5452i c5452i2) {
                    this.f21042a.m24971L0(f10);
                }
            });
        } else {
            m24967J0((int) C11194j.m42191i(c5452i.m25050p(), this.f21074a.m25040f(), f10));
        }
    }

    /* JADX INFO: renamed from: M */
    public int m24972M() {
        return (int) this.f21075b.m42173p();
    }

    /* JADX INFO: renamed from: M0 */
    public void m24973M0(boolean z10) {
        if (this.f21092s == z10) {
            return;
        }
        this.f21092s = z10;
        C9710c c9710c = this.f21089p;
        if (c9710c != null) {
            c9710c.mo38348K(z10);
        }
    }

    /* JADX INFO: renamed from: N */
    public final C7488b m24974N() {
        C7488b c7488b = this.f21081h;
        if (c7488b != null && !c7488b.m31122b(m24968K())) {
            this.f21081h = null;
        }
        if (this.f21081h == null) {
            this.f21081h = new C7488b(getCallback(), this.f21082i, null, this.f21074a.m25044j());
        }
        return this.f21081h;
    }

    /* JADX INFO: renamed from: N0 */
    public void m24975N0(boolean z10) {
        this.f21091r = z10;
        C5452i c5452i = this.f21074a;
        if (c5452i != null) {
            c5452i.m25056v(z10);
        }
    }

    /* JADX INFO: renamed from: O */
    public String m24976O() {
        return this.f21082i;
    }

    /* JADX INFO: renamed from: O0 */
    public void m24977O0(final float f10) {
        if (this.f21074a == null) {
            this.f21080g.add(new a() { // from class: f7.f0
                @Override // p121f7.C5451h0.a
                /* JADX INFO: renamed from: a */
                public final void mo24920a(C5452i c5452i) {
                    this.f21046a.m24977O0(f10);
                }
            });
            return;
        }
        if (C5444e.m24929h()) {
            C5444e.m24923b("Drawable#setProgress");
        }
        this.f21075b.m42162J(this.f21074a.m25042h(f10));
        if (C5444e.m24929h()) {
            C5444e.m24924c("Drawable#setProgress");
        }
    }

    /* JADX INFO: renamed from: P */
    public C5457k0 m24978P(String str) {
        C5452i c5452i = this.f21074a;
        if (c5452i == null) {
            return null;
        }
        return c5452i.m25044j().get(str);
    }

    /* JADX INFO: renamed from: P0 */
    public void m24979P0(EnumC5483x0 enumC5483x0) {
        this.f21096w = enumC5483x0;
        m25026w();
    }

    /* JADX INFO: renamed from: Q */
    public boolean m24980Q() {
        return this.f21087n;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m24981Q0(int i10) {
        this.f21075b.setRepeatCount(i10);
    }

    /* JADX INFO: renamed from: R */
    public C8009h m24982R() {
        Iterator<String> it = f21053U.iterator();
        C8009h c8009hM25046l = null;
        while (it.hasNext()) {
            c8009hM25046l = this.f21074a.m25046l(it.next());
            if (c8009hM25046l != null) {
                break;
            }
        }
        return c8009hM25046l;
    }

    /* JADX INFO: renamed from: R0 */
    public void m24983R0(int i10) {
        this.f21075b.setRepeatMode(i10);
    }

    /* JADX INFO: renamed from: S */
    public float m24984S() {
        return this.f21075b.m42175r();
    }

    /* JADX INFO: renamed from: S0 */
    public void m24985S0(boolean z10) {
        this.f21078e = z10;
    }

    /* JADX INFO: renamed from: T */
    public float m24986T() {
        return this.f21075b.m42176s();
    }

    /* JADX INFO: renamed from: T0 */
    public void m24987T0(float f10) {
        this.f21075b.m42166P(f10);
    }

    /* JADX INFO: renamed from: U */
    public C5477u0 m24988U() {
        C5452i c5452i = this.f21074a;
        if (c5452i != null) {
            return c5452i.m25048n();
        }
        return null;
    }

    /* JADX INFO: renamed from: U0 */
    public void m24989U0(C5487z0 c5487z0) {
    }

    /* JADX INFO: renamed from: V */
    public float m24990V() {
        return this.f21075b.m42172o();
    }

    /* JADX INFO: renamed from: V0 */
    public void m24991V0(boolean z10) {
        this.f21075b.m42167Q(z10);
    }

    /* JADX INFO: renamed from: W */
    public EnumC5483x0 m24992W() {
        return this.f21097x ? EnumC5483x0.SOFTWARE : EnumC5483x0.HARDWARE;
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m24993W0() {
        C5452i c5452i = this.f21074a;
        if (c5452i == null) {
            return false;
        }
        float f10 = this.f21073S;
        float fM42172o = this.f21075b.m42172o();
        this.f21073S = fM42172o;
        return Math.abs(fM42172o - f10) * c5452i.m25038d() >= 50.0f;
    }

    /* JADX INFO: renamed from: X */
    public int m24994X() {
        return this.f21075b.getRepeatCount();
    }

    /* JADX INFO: renamed from: X0 */
    public boolean m24995X0() {
        return this.f21084k == null && this.f21074a.m25037c().m45637j() > 0;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: Y */
    public int m24996Y() {
        return this.f21075b.getRepeatMode();
    }

    /* JADX INFO: renamed from: Z */
    public float m24997Z() {
        return this.f21075b.m42177t();
    }

    /* JADX INFO: renamed from: a0 */
    public C5487z0 m24998a0() {
        return null;
    }

    /* JADX INFO: renamed from: b0 */
    public Typeface m24999b0(C8004c c8004c) {
        Map<String, Typeface> map = this.f21084k;
        if (map != null) {
            String strM33068a = c8004c.m33068a();
            if (map.containsKey(strM33068a)) {
                return map.get(strM33068a);
            }
            String strM33069b = c8004c.m33069b();
            if (map.containsKey(strM33069b)) {
                return map.get(strM33069b);
            }
            String str = c8004c.m33068a() + "-" + c8004c.m33070c();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C7487a c7487aM24970L = m24970L();
        if (c7487aM24970L != null) {
            return c7487aM24970L.m31117b(c8004c);
        }
        return null;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m25000c0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (parent instanceof ViewGroup) {
            return !((ViewGroup) parent).getClipChildren();
        }
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m25001d0() {
        ChoreographerFrameCallbackC11192h choreographerFrameCallbackC11192h = this.f21075b;
        if (choreographerFrameCallbackC11192h == null) {
            return false;
        }
        return choreographerFrameCallbackC11192h.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        float fM38369P;
        float fM42172o;
        C9710c c9710c = this.f21089p;
        if (c9710c == null) {
            return;
        }
        boolean zM24958F = m24958F();
        if (zM24958F) {
            try {
                this.f21069O.acquire();
            } catch (InterruptedException unused) {
                if (!zM24958F) {
                    return;
                } else {
                    if ((fM38369P > fM42172o ? 1 : (fM38369P == fM42172o ? 0 : -1)) == 0) {
                        return;
                    }
                }
            } finally {
                if (C5444e.m24929h()) {
                    C5444e.m24924c("Drawable#draw");
                }
                if (zM24958F) {
                    this.f21069O.release();
                    if (c9710c.m38369P() != this.f21075b.m42172o()) {
                        f21054V.execute(this.f21072R);
                    }
                }
            }
        }
        if (C5444e.m24929h()) {
            C5444e.m24923b("Drawable#draw");
        }
        if (zM24958F && m24993W0()) {
            m24977O0(this.f21075b.m42172o());
        }
        if (this.f21078e) {
            try {
                if (this.f21097x) {
                    m25010m0(canvas, c9710c);
                } else {
                    m25032z(canvas);
                }
            } catch (Throwable th2) {
                C11189e.m42152b("Lottie crashed in draw!", th2);
            }
        } else if (this.f21097x) {
            m25010m0(canvas, c9710c);
        } else {
            m25032z(canvas);
        }
        this.f21066L = false;
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m25002e0() {
        if (isVisible()) {
            return this.f21075b.isRunning();
        }
        b bVar = this.f21079f;
        return bVar == b.PLAY || bVar == b.RESUME;
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m25003f0() {
        return this.f21093t;
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m25004g0() {
        return this.f21094u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f21090q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C5452i c5452i = this.f21074a;
        if (c5452i == null) {
            return -1;
        }
        return c5452i.m25036b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C5452i c5452i = this.f21074a;
        if (c5452i == null) {
            return -1;
        }
        return c5452i.m25036b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m25005h0(EnumC5453i0 enumC5453i0) {
        return this.f21086m.m25059b(enumC5453i0);
    }

    /* JADX INFO: renamed from: i0 */
    public void m25006i0() {
        this.f21080g.clear();
        this.f21075b.m42179w();
        if (isVisible()) {
            return;
        }
        this.f21079f = b.NONE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f21066L) {
            return;
        }
        this.f21066L = true;
        if ((!f21052T || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return m25001d0();
    }

    /* JADX INFO: renamed from: j0 */
    public void m25007j0() {
        if (this.f21089p == null) {
            this.f21080g.add(new a() { // from class: f7.d0
                @Override // p121f7.C5451h0.a
                /* JADX INFO: renamed from: a */
                public final void mo24920a(C5452i c5452i) {
                    this.f21030a.m25007j0();
                }
            });
            return;
        }
        m25026w();
        if (m25018s(m24968K()) || m24994X() == 0) {
            if (isVisible()) {
                this.f21075b.m42180x();
                this.f21079f = b.NONE;
            } else {
                this.f21079f = b.PLAY;
            }
        }
        if (m25018s(m24968K())) {
            return;
        }
        C8009h c8009hM24982R = m24982R();
        if (c8009hM24982R != null) {
            m25033z0((int) c8009hM24982R.f29963b);
        } else {
            m25033z0((int) (m24997Z() < 0.0f ? m24986T() : m24984S()));
        }
        this.f21075b.m42171n();
        if (isVisible()) {
            return;
        }
        this.f21079f = b.NONE;
    }

    /* JADX INFO: renamed from: k0 */
    public void m25008k0() {
        this.f21075b.removeAllListeners();
    }

    /* JADX INFO: renamed from: l0 */
    public void m25009l0() {
        this.f21075b.removeAllUpdateListeners();
        this.f21075b.addUpdateListener(this.f21068N);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m25010m0(Canvas canvas, C9710c c9710c) {
        if (this.f21074a == null || c9710c == null) {
            return;
        }
        m24954D();
        canvas.getMatrix(this.f21063I);
        canvas.getClipBounds(this.f21056B);
        m25028x(this.f21056B, this.f21057C);
        this.f21063I.mapRect(this.f21057C);
        m25030y(this.f21057C, this.f21056B);
        if (this.f21088o) {
            this.f21062H.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            c9710c.mo27578e(this.f21062H, null, false);
        }
        this.f21063I.mapRect(this.f21062H);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        m25013p0(this.f21062H, fWidth, fHeight);
        if (!m25000c0()) {
            RectF rectF = this.f21062H;
            Rect rect = this.f21056B;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.f21062H.width());
        int iCeil2 = (int) Math.ceil(this.f21062H.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        m24952C(iCeil, iCeil2);
        if (this.f21066L) {
            this.f21063I.getValues(this.f21064J);
            float[] fArr = this.f21064J;
            float f10 = fArr[0];
            float f11 = fArr[4];
            this.f21098y.set(this.f21063I);
            this.f21098y.preScale(fWidth, fHeight);
            Matrix matrix = this.f21098y;
            RectF rectF2 = this.f21062H;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f21098y.postScale(1.0f / f10, 1.0f / f11);
            this.f21099z.eraseColor(0);
            this.f21055A.setMatrix(C11197m.f39524a);
            this.f21055A.scale(f10, f11);
            c9710c.mo27581i(this.f21055A, this.f21098y, this.f21090q, null);
            this.f21063I.invert(this.f21065K);
            this.f21065K.mapRect(this.f21061G, this.f21062H);
            m25030y(this.f21061G, this.f21060F);
        }
        this.f21059E.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f21099z, this.f21059E, this.f21060F, this.f21058D);
    }

    /* JADX INFO: renamed from: n0 */
    public List<C8006e> m25011n0(C8006e c8006e) {
        if (this.f21089p == null) {
            C11189e.m42153c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.f21089p.mo27580h(c8006e, 0, arrayList, new C8006e(new String[0]));
        return arrayList;
    }

    /* JADX INFO: renamed from: o0 */
    public void m25012o0() {
        if (this.f21089p == null) {
            this.f21080g.add(new a() { // from class: f7.y
                @Override // p121f7.C5451h0.a
                /* JADX INFO: renamed from: a */
                public final void mo24920a(C5452i c5452i) {
                    this.f21254a.m25012o0();
                }
            });
            return;
        }
        m25026w();
        if (m25018s(m24968K()) || m24994X() == 0) {
            if (isVisible()) {
                this.f21075b.m42159D();
                this.f21079f = b.NONE;
            } else {
                this.f21079f = b.RESUME;
            }
        }
        if (m25018s(m24968K())) {
            return;
        }
        m25033z0((int) (m24997Z() < 0.0f ? m24986T() : m24984S()));
        this.f21075b.m42171n();
        if (isVisible()) {
            return;
        }
        this.f21079f = b.NONE;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m25013p0(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }

    /* JADX INFO: renamed from: q */
    public void m25014q(Animator.AnimatorListener animatorListener) {
        this.f21075b.addListener(animatorListener);
    }

    /* JADX INFO: renamed from: q0 */
    public void m25015q0(boolean z10) {
        this.f21093t = z10;
    }

    /* JADX INFO: renamed from: r */
    public <T> void m25016r(final C8006e c8006e, final T t8, final C11552c<T> c11552c) {
        C9710c c9710c = this.f21089p;
        if (c9710c == null) {
            this.f21080g.add(new a() { // from class: f7.u
                @Override // p121f7.C5451h0.a
                /* JADX INFO: renamed from: a */
                public final void mo24920a(C5452i c5452i) {
                    this.f21210a.m25016r(c8006e, t8, c11552c);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (c8006e == C8006e.f29957c) {
            c9710c.mo27577c(t8, c11552c);
        } else if (c8006e.m33079d() != null) {
            c8006e.m33079d().mo27577c(t8, c11552c);
        } else {
            List<C8006e> listM25011n0 = m25011n0(c8006e);
            for (int i10 = 0; i10 < listM25011n0.size(); i10++) {
                listM25011n0.get(i10).m33079d().mo27577c(t8, c11552c);
            }
            zIsEmpty = true ^ listM25011n0.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t8 == InterfaceC5465o0.f21149E) {
                m24977O0(m24990V());
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m25017r0(boolean z10) {
        this.f21094u = z10;
    }

    /* JADX INFO: renamed from: s */
    public boolean m25018s(Context context) {
        if (this.f21077d) {
            return true;
        }
        return this.f21076c && C5444e.m24927f().mo29734a(context) == EnumC7035a.STANDARD_MOTION;
    }

    /* JADX INFO: renamed from: s0 */
    public void m25019s0(EnumC5436a enumC5436a) {
        this.f21067M = enumC5436a;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f21090q = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        C11189e.m42153c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            b bVar = this.f21079f;
            if (bVar == b.PLAY) {
                m25007j0();
                return visible;
            }
            if (bVar == b.RESUME) {
                m25012o0();
                return visible;
            }
        } else {
            if (this.f21075b.isRunning()) {
                m25006i0();
                this.f21079f = b.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f21079f = b.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        m25007j0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        m24950B();
    }

    /* JADX INFO: renamed from: t */
    public final void m25020t() {
        C5452i c5452i = this.f21074a;
        if (c5452i == null) {
            return;
        }
        C9710c c9710c = new C9710c(this, C10475v.m40268a(c5452i), c5452i.m25045k(), c5452i);
        this.f21089p = c9710c;
        if (this.f21092s) {
            c9710c.mo38348K(true);
        }
        this.f21089p.m38370Q(this.f21088o);
    }

    /* JADX INFO: renamed from: t0 */
    public void m25021t0(boolean z10) {
        if (z10 != this.f21095v) {
            this.f21095v = z10;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m25022u() {
        this.f21080g.clear();
        this.f21075b.cancel();
        if (isVisible()) {
            return;
        }
        this.f21079f = b.NONE;
    }

    /* JADX INFO: renamed from: u0 */
    public void m25023u0(boolean z10) {
        if (z10 != this.f21088o) {
            this.f21088o = z10;
            C9710c c9710c = this.f21089p;
            if (c9710c != null) {
                c9710c.m38370Q(z10);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    /* JADX INFO: renamed from: v */
    public void m25024v() {
        if (this.f21075b.isRunning()) {
            this.f21075b.cancel();
            if (!isVisible()) {
                this.f21079f = b.NONE;
            }
        }
        this.f21074a = null;
        this.f21089p = null;
        this.f21081h = null;
        this.f21073S = -3.4028235E38f;
        this.f21075b.m42170k();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: v0 */
    public boolean m25025v0(C5452i c5452i) {
        if (this.f21074a == c5452i) {
            return false;
        }
        this.f21066L = true;
        m25024v();
        this.f21074a = c5452i;
        m25020t();
        this.f21075b.m42161G(c5452i);
        m24977O0(this.f21075b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f21080g).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.mo24920a(c5452i);
            }
            it.remove();
        }
        this.f21080g.clear();
        c5452i.m25056v(this.f21091r);
        m25026w();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m25026w() {
        C5452i c5452i = this.f21074a;
        if (c5452i == null) {
            return;
        }
        this.f21097x = this.f21096w.m25127b(Build.VERSION.SDK_INT, c5452i.m25051q(), c5452i.m25047m());
    }

    /* JADX INFO: renamed from: w0 */
    public void m25027w0(String str) {
        this.f21085l = str;
        C7487a c7487aM24970L = m24970L();
        if (c7487aM24970L != null) {
            c7487aM24970L.m31118c(str);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m25028x(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: x0 */
    public void m25029x0(C5438b c5438b) {
        C7487a c7487a = this.f21083j;
        if (c7487a != null) {
            c7487a.m31119d(c5438b);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m25030y(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX INFO: renamed from: y0 */
    public void m25031y0(Map<String, Typeface> map) {
        if (map == this.f21084k) {
            return;
        }
        this.f21084k = map;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: z */
    public final void m25032z(Canvas canvas) {
        C9710c c9710c = this.f21089p;
        C5452i c5452i = this.f21074a;
        if (c9710c == null || c5452i == null) {
            return;
        }
        this.f21098y.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float fWidth = bounds.width() / c5452i.m25036b().width();
            float fHeight = bounds.height() / c5452i.m25036b().height();
            this.f21098y.preTranslate(bounds.left, bounds.top);
            this.f21098y.preScale(fWidth, fHeight);
        }
        c9710c.mo27581i(canvas, this.f21098y, this.f21090q, null);
    }

    /* JADX INFO: renamed from: z0 */
    public void m25033z0(final int i10) {
        if (this.f21074a == null) {
            this.f21080g.add(new a() { // from class: f7.g0
                @Override // p121f7.C5451h0.a
                /* JADX INFO: renamed from: a */
                public final void mo24920a(C5452i c5452i) {
                    this.f21048a.m25033z0(i10);
                }
            });
        } else {
            this.f21075b.m42162J(i10);
        }
    }
}
