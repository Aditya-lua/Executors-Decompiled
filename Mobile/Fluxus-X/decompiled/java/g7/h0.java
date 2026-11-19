package g7;

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

/* JADX INFO: loaded from: classes3.dex */
public class h0 extends Drawable implements Drawable.Callback, Animatable {
    public static final boolean T = false;
    public static final List<String> U = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    public static final Executor V = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new t7.f());
    public Canvas A;
    public Rect B;
    public RectF C;
    public Paint D;
    public Rect E;
    public Rect F;
    public RectF G;
    public RectF H;
    public Matrix I;
    public float[] J;
    public Matrix K;
    public boolean L;
    public g7.a M;
    public final ValueAnimator.AnimatorUpdateListener N;
    public final Semaphore O;
    public Handler P;
    public Runnable Q;
    public final Runnable R;
    public float S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f17438a;
    public final t7.h b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f17442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<a> f17443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l7.b f17444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f17445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l7.a f17446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map<String, Typeface> f17447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f17448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j0 f17449m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17450n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17451o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p7.c f17452p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17453q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f17454r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17455s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f17456t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17457u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f17458v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x0 f17459w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f17460x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Matrix f17461y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Bitmap f17462z;

    public interface a {
        void a(i iVar);
    }

    public enum b {
        NONE,
        PLAY,
        RESUME
    }

    public h0() {
        t7.h hVar = new t7.h();
        this.b = hVar;
        this.f17439c = true;
        this.f17440d = false;
        this.f17441e = false;
        this.f17442f = b.NONE;
        this.f17443g = new ArrayList<>();
        this.f17449m = new j0();
        this.f17450n = false;
        this.f17451o = true;
        this.f17453q = 255;
        this.f17458v = false;
        this.f17459w = x0.AUTOMATIC;
        this.f17460x = false;
        this.f17461y = new Matrix();
        this.J = new float[9];
        this.L = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: g7.b0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h0.g(this.f17419a, valueAnimator);
            }
        };
        this.N = animatorUpdateListener;
        this.O = new Semaphore(1);
        this.R = new Runnable() { // from class: g7.c0
            @Override // java.lang.Runnable
            public final void run() {
                h0.k(this.f17420a);
            }
        };
        this.S = -3.4028235E38f;
        hVar.addUpdateListener(animatorUpdateListener);
    }

    public static /* synthetic */ void g(h0 h0Var, ValueAnimator valueAnimator) {
        if (h0Var.F()) {
            h0Var.invalidateSelf();
            return;
        }
        p7.c cVar = h0Var.f17452p;
        if (cVar != null) {
            cVar.N(h0Var.b.q());
        }
    }

    public static /* synthetic */ void k(final h0 h0Var) {
        p7.c cVar = h0Var.f17452p;
        if (cVar == null) {
            return;
        }
        try {
            h0Var.O.acquire();
            cVar.N(h0Var.b.q());
            if (T && h0Var.L) {
                if (h0Var.P == null) {
                    h0Var.P = new Handler(Looper.getMainLooper());
                    h0Var.Q = new Runnable() { // from class: g7.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            h0.n(this.f17574a);
                        }
                    };
                }
                h0Var.P.post(h0Var.Q);
            }
        } catch (InterruptedException unused) {
        } finally {
            h0Var.O.release();
        }
    }

    public static /* synthetic */ void n(h0 h0Var) {
        Drawable.Callback callback = h0Var.getCallback();
        if (callback != null) {
            callback.invalidateDrawable(h0Var);
        }
    }

    public void A(i0 i0Var, boolean z10) {
        boolean zA = this.f17449m.a(i0Var, z10);
        if (this.f17438a == null || !zA) {
            return;
        }
        t();
    }

    @Deprecated
    public void A0(boolean z10) {
        this.f17440d = z10;
    }

    public void B() {
        this.f17443g.clear();
        this.b.p();
        if (isVisible()) {
            return;
        }
        this.f17442f = b.NONE;
    }

    public void B0(c cVar) {
        l7.b bVar = this.f17444h;
        if (bVar != null) {
            bVar.d(cVar);
        }
    }

    public final void C(int i10, int i11) {
        Bitmap bitmap = this.f17462z;
        if (bitmap == null || bitmap.getWidth() < i10 || this.f17462z.getHeight() < i11) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f17462z = bitmapCreateBitmap;
            this.A.setBitmap(bitmapCreateBitmap);
            this.L = true;
            return;
        }
        if (this.f17462z.getWidth() > i10 || this.f17462z.getHeight() > i11) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f17462z, 0, 0, i10, i11);
            this.f17462z = bitmapCreateBitmap2;
            this.A.setBitmap(bitmapCreateBitmap2);
            this.L = true;
        }
    }

    public void C0(String str) {
        this.f17445i = str;
    }

    public final void D() {
        if (this.A != null) {
            return;
        }
        this.A = new Canvas();
        this.H = new RectF();
        this.I = new Matrix();
        this.K = new Matrix();
        this.B = new Rect();
        this.C = new RectF();
        this.D = new h7.a();
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
    }

    public void D0(boolean z10) {
        this.f17450n = z10;
    }

    public g7.a E() {
        g7.a aVar = this.M;
        return aVar != null ? aVar : e.d();
    }

    public void E0(final int i10) {
        if (this.f17438a == null) {
            this.f17443g.add(new a() { // from class: g7.s
                @Override // g7.h0.a
                public final void a(i iVar) {
                    this.f17533a.E0(i10);
                }
            });
        } else {
            this.b.M(i10 + 0.99f);
        }
    }

    public boolean F() {
        return E() == g7.a.ENABLED;
    }

    public void F0(final String str) {
        i iVar = this.f17438a;
        if (iVar == null) {
            this.f17443g.add(new a() { // from class: g7.z
                @Override // g7.h0.a
                public final void a(i iVar2) {
                    this.f17579a.F0(str);
                }
            });
            return;
        }
        m7.h hVarL = iVar.l(str);
        if (hVarL != null) {
            E0((int) (hVarL.b + hVarL.f22966c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public Bitmap G(String str) {
        l7.b bVarN = N();
        if (bVarN != null) {
            return bVarN.a(str);
        }
        return null;
    }

    public void G0(final float f10) {
        i iVar = this.f17438a;
        if (iVar == null) {
            this.f17443g.add(new a() { // from class: g7.v
                @Override // g7.h0.a
                public final void a(i iVar2) {
                    this.f17547a.G0(f10);
                }
            });
        } else {
            this.b.M(t7.j.i(iVar.p(), this.f17438a.f(), f10));
        }
    }

    public boolean H() {
        return this.f17458v;
    }

    public void H0(final int i10, final int i11) {
        if (this.f17438a == null) {
            this.f17443g.add(new a() { // from class: g7.w
                @Override // g7.h0.a
                public final void a(i iVar) {
                    this.f17549a.H0(i10, i11);
                }
            });
        } else {
            this.b.O(i10, i11 + 0.99f);
        }
    }

    public boolean I() {
        return this.f17451o;
    }

    public void I0(final String str) {
        i iVar = this.f17438a;
        if (iVar == null) {
            this.f17443g.add(new a() { // from class: g7.r
                @Override // g7.h0.a
                public final void a(i iVar2) {
                    this.f17531a.I0(str);
                }
            });
            return;
        }
        m7.h hVarL = iVar.l(str);
        if (hVarL != null) {
            int i10 = (int) hVarL.b;
            H0(i10, ((int) hVarL.f22966c) + i10);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public i J() {
        return this.f17438a;
    }

    public void J0(final int i10) {
        if (this.f17438a == null) {
            this.f17443g.add(new a() { // from class: g7.t
                @Override // g7.h0.a
                public final void a(i iVar) {
                    this.f17539a.J0(i10);
                }
            });
        } else {
            this.b.P(i10);
        }
    }

    public final Context K() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public void K0(final String str) {
        i iVar = this.f17438a;
        if (iVar == null) {
            this.f17443g.add(new a() { // from class: g7.a0
                @Override // g7.h0.a
                public final void a(i iVar2) {
                    this.f17418a.K0(str);
                }
            });
            return;
        }
        m7.h hVarL = iVar.l(str);
        if (hVarL != null) {
            J0((int) hVarL.b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public final l7.a L() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f17446j == null) {
            l7.a aVar = new l7.a(getCallback(), null);
            this.f17446j = aVar;
            String str = this.f17448l;
            if (str != null) {
                aVar.c(str);
            }
        }
        return this.f17446j;
    }

    public void L0(final float f10) {
        i iVar = this.f17438a;
        if (iVar == null) {
            this.f17443g.add(new a() { // from class: g7.e0
                @Override // g7.h0.a
                public final void a(i iVar2) {
                    this.f17433a.L0(f10);
                }
            });
        } else {
            J0((int) t7.j.i(iVar.p(), this.f17438a.f(), f10));
        }
    }

    public int M() {
        return (int) this.b.r();
    }

    public void M0(boolean z10) {
        if (this.f17455s == z10) {
            return;
        }
        this.f17455s = z10;
        p7.c cVar = this.f17452p;
        if (cVar != null) {
            cVar.L(z10);
        }
    }

    public final l7.b N() {
        l7.b bVar = this.f17444h;
        if (bVar != null && !bVar.b(K())) {
            this.f17444h = null;
        }
        if (this.f17444h == null) {
            this.f17444h = new l7.b(getCallback(), this.f17445i, null, this.f17438a.j());
        }
        return this.f17444h;
    }

    public void N0(boolean z10) {
        this.f17454r = z10;
        i iVar = this.f17438a;
        if (iVar != null) {
            iVar.v(z10);
        }
    }

    public String O() {
        return this.f17445i;
    }

    public void O0(final float f10) {
        if (this.f17438a == null) {
            this.f17443g.add(new a() { // from class: g7.f0
                @Override // g7.h0.a
                public final void a(i iVar) {
                    this.f17435a.O0(f10);
                }
            });
            return;
        }
        if (e.h()) {
            e.b("Drawable#setProgress");
        }
        this.b.J(this.f17438a.h(f10));
        if (e.h()) {
            e.c("Drawable#setProgress");
        }
    }

    public k0 P(String str) {
        i iVar = this.f17438a;
        if (iVar == null) {
            return null;
        }
        return iVar.j().get(str);
    }

    public void P0(x0 x0Var) {
        this.f17459w = x0Var;
        w();
    }

    public boolean Q() {
        return this.f17450n;
    }

    public void Q0(int i10) {
        this.b.setRepeatCount(i10);
    }

    public m7.h R() {
        Iterator<String> it = U.iterator();
        m7.h hVarL = null;
        while (it.hasNext()) {
            hVarL = this.f17438a.l(it.next());
            if (hVarL != null) {
                break;
            }
        }
        return hVarL;
    }

    public void R0(int i10) {
        this.b.setRepeatMode(i10);
    }

    public float S() {
        return this.b.t();
    }

    public void S0(boolean z10) {
        this.f17441e = z10;
    }

    public float T() {
        return this.b.u();
    }

    public void T0(float f10) {
        this.b.R(f10);
    }

    public u0 U() {
        i iVar = this.f17438a;
        if (iVar != null) {
            return iVar.n();
        }
        return null;
    }

    public void U0(z0 z0Var) {
    }

    public float V() {
        return this.b.q();
    }

    public void V0(boolean z10) {
        this.b.S(z10);
    }

    public x0 W() {
        return this.f17460x ? x0.SOFTWARE : x0.HARDWARE;
    }

    public final boolean W0() {
        i iVar = this.f17438a;
        if (iVar == null) {
            return false;
        }
        float f10 = this.S;
        float fQ = this.b.q();
        this.S = fQ;
        return Math.abs(fQ - f10) * iVar.d() >= 50.0f;
    }

    public int X() {
        return this.b.getRepeatCount();
    }

    public boolean X0() {
        return this.f17447k == null && this.f17438a.c().l() > 0;
    }

    @SuppressLint({"WrongConstant"})
    public int Y() {
        return this.b.getRepeatMode();
    }

    public float Z() {
        return this.b.v();
    }

    public z0 a0() {
        return null;
    }

    public Typeface b0(m7.c cVar) {
        Map<String, Typeface> map = this.f17447k;
        if (map != null) {
            String strA = cVar.a();
            if (map.containsKey(strA)) {
                return map.get(strA);
            }
            String strB = cVar.b();
            if (map.containsKey(strB)) {
                return map.get(strB);
            }
            String str = cVar.a() + "-" + cVar.c();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        l7.a aVarL = L();
        if (aVarL != null) {
            return aVarL.b(cVar);
        }
        return null;
    }

    public final boolean c0() {
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

    public boolean d0() {
        t7.h hVar = this.b;
        if (hVar == null) {
            return false;
        }
        return hVar.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        float fQ;
        float fQ2;
        p7.c cVar = this.f17452p;
        if (cVar == null) {
            return;
        }
        boolean zF = F();
        if (zF) {
            try {
                this.O.acquire();
            } catch (InterruptedException unused) {
                if (!zF) {
                    return;
                } else {
                    if ((fQ > fQ2 ? 1 : (fQ == fQ2 ? 0 : -1)) == 0) {
                        return;
                    }
                }
            } finally {
                if (e.h()) {
                    e.c("Drawable#draw");
                }
                if (zF) {
                    this.O.release();
                    if (cVar.Q() != this.b.q()) {
                        V.execute(this.R);
                    }
                }
            }
        }
        if (e.h()) {
            e.b("Drawable#draw");
        }
        if (zF && W0()) {
            O0(this.b.q());
        }
        if (this.f17441e) {
            try {
                if (this.f17460x) {
                    m0(canvas, cVar);
                } else {
                    z(canvas);
                }
            } catch (Throwable th2) {
                t7.e.b("Lottie crashed in draw!", th2);
            }
        } else if (this.f17460x) {
            m0(canvas, cVar);
        } else {
            z(canvas);
        }
        this.L = false;
    }

    public boolean e0() {
        if (isVisible()) {
            return this.b.isRunning();
        }
        b bVar = this.f17442f;
        return bVar == b.PLAY || bVar == b.RESUME;
    }

    public boolean f0() {
        return this.f17456t;
    }

    public boolean g0() {
        return this.f17457u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f17453q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        i iVar = this.f17438a;
        if (iVar == null) {
            return -1;
        }
        return iVar.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        i iVar = this.f17438a;
        if (iVar == null) {
            return -1;
        }
        return iVar.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h0(i0 i0Var) {
        return this.f17449m.b(i0Var);
    }

    public void i0() {
        this.f17443g.clear();
        this.b.y();
        if (isVisible()) {
            return;
        }
        this.f17442f = b.NONE;
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
        if (this.L) {
            return;
        }
        this.L = true;
        if ((!T || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return d0();
    }

    public void j0() {
        if (this.f17452p == null) {
            this.f17443g.add(new a() { // from class: g7.d0
                @Override // g7.h0.a
                public final void a(i iVar) {
                    this.f17422a.j0();
                }
            });
            return;
        }
        w();
        if (s(K()) || X() == 0) {
            if (isVisible()) {
                this.b.z();
                this.f17442f = b.NONE;
            } else {
                this.f17442f = b.PLAY;
            }
        }
        if (s(K())) {
            return;
        }
        m7.h hVarR = R();
        if (hVarR != null) {
            z0((int) hVarR.b);
        } else {
            z0((int) (Z() < 0.0f ? T() : S()));
        }
        this.b.p();
        if (isVisible()) {
            return;
        }
        this.f17442f = b.NONE;
    }

    public void k0() {
        this.b.removeAllListeners();
    }

    public void l0() {
        this.b.removeAllUpdateListeners();
        this.b.addUpdateListener(this.N);
    }

    public final void m0(Canvas canvas, p7.c cVar) {
        if (this.f17438a == null || cVar == null) {
            return;
        }
        D();
        canvas.getMatrix(this.I);
        canvas.getClipBounds(this.B);
        x(this.B, this.C);
        this.I.mapRect(this.C);
        y(this.C, this.B);
        if (this.f17451o) {
            this.H.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.g(this.H, null, false);
        }
        this.I.mapRect(this.H);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        p0(this.H, fWidth, fHeight);
        if (!c0()) {
            RectF rectF = this.H;
            Rect rect = this.B;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.H.width());
        int iCeil2 = (int) Math.ceil(this.H.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        C(iCeil, iCeil2);
        if (this.L) {
            this.I.getValues(this.J);
            float[] fArr = this.J;
            float f10 = fArr[0];
            float f11 = fArr[4];
            this.f17461y.set(this.I);
            this.f17461y.preScale(fWidth, fHeight);
            Matrix matrix = this.f17461y;
            RectF rectF2 = this.H;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f17461y.postScale(1.0f / f10, 1.0f / f11);
            this.f17462z.eraseColor(0);
            this.A.setMatrix(t7.m.f32200a);
            this.A.scale(f10, f11);
            cVar.d(this.A, this.f17461y, this.f17453q, null);
            this.I.invert(this.K);
            this.K.mapRect(this.G, this.H);
            y(this.G, this.F);
        }
        this.E.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f17462z, this.E, this.F, this.D);
    }

    public List<m7.e> n0(m7.e eVar) {
        if (this.f17452p == null) {
            t7.e.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.f17452p.c(eVar, 0, arrayList, new m7.e(new String[0]));
        return arrayList;
    }

    public void o0() {
        if (this.f17452p == null) {
            this.f17443g.add(new a() { // from class: g7.y
                @Override // g7.h0.a
                public final void a(i iVar) {
                    this.f17578a.o0();
                }
            });
            return;
        }
        w();
        if (s(K()) || X() == 0) {
            if (isVisible()) {
                this.b.F();
                this.f17442f = b.NONE;
            } else {
                this.f17442f = b.RESUME;
            }
        }
        if (s(K())) {
            return;
        }
        z0((int) (Z() < 0.0f ? T() : S()));
        this.b.p();
        if (isVisible()) {
            return;
        }
        this.f17442f = b.NONE;
    }

    public final void p0(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }

    public void q(Animator.AnimatorListener animatorListener) {
        this.b.addListener(animatorListener);
    }

    public void q0(boolean z10) {
        this.f17456t = z10;
    }

    public <T> void r(final m7.e eVar, final T t8, final u7.c<T> cVar) {
        p7.c cVar2 = this.f17452p;
        if (cVar2 == null) {
            this.f17443g.add(new a() { // from class: g7.u
                @Override // g7.h0.a
                public final void a(i iVar) {
                    this.f17540a.r(eVar, t8, cVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == m7.e.f22962c) {
            cVar2.e(t8, cVar);
        } else if (eVar.d() != null) {
            eVar.d().e(t8, cVar);
        } else {
            List<m7.e> listN0 = n0(eVar);
            for (int i10 = 0; i10 < listN0.size(); i10++) {
                listN0.get(i10).d().e(t8, cVar);
            }
            zIsEmpty = true ^ listN0.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t8 == o0.E) {
                O0(V());
            }
        }
    }

    public void r0(boolean z10) {
        this.f17457u = z10;
    }

    public boolean s(Context context) {
        if (this.f17440d) {
            return true;
        }
        return this.f17439c && e.f().a(context) == k7.a.STANDARD_MOTION;
    }

    public void s0(g7.a aVar) {
        this.M = aVar;
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
        this.f17453q = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        t7.e.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            b bVar = this.f17442f;
            if (bVar == b.PLAY) {
                j0();
                return visible;
            }
            if (bVar == b.RESUME) {
                o0();
                return visible;
            }
        } else {
            if (this.b.isRunning()) {
                i0();
                this.f17442f = b.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f17442f = b.NONE;
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
        j0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        B();
    }

    public final void t() {
        i iVar = this.f17438a;
        if (iVar == null) {
            return;
        }
        p7.c cVar = new p7.c(this, r7.v.a(iVar), iVar.k(), iVar);
        this.f17452p = cVar;
        if (this.f17455s) {
            cVar.L(true);
        }
        this.f17452p.R(this.f17451o);
    }

    public void t0(boolean z10) {
        if (z10 != this.f17458v) {
            this.f17458v = z10;
            invalidateSelf();
        }
    }

    public void u() {
        this.f17443g.clear();
        this.b.cancel();
        if (isVisible()) {
            return;
        }
        this.f17442f = b.NONE;
    }

    public void u0(boolean z10) {
        if (z10 != this.f17451o) {
            this.f17451o = z10;
            p7.c cVar = this.f17452p;
            if (cVar != null) {
                cVar.R(z10);
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

    public void v() {
        if (this.b.isRunning()) {
            this.b.cancel();
            if (!isVisible()) {
                this.f17442f = b.NONE;
            }
        }
        this.f17438a = null;
        this.f17452p = null;
        this.f17444h = null;
        this.S = -3.4028235E38f;
        this.b.o();
        invalidateSelf();
    }

    public boolean v0(i iVar) {
        if (this.f17438a == iVar) {
            return false;
        }
        this.L = true;
        v();
        this.f17438a = iVar;
        t();
        this.b.H(iVar);
        O0(this.b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f17443g).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.a(iVar);
            }
            it.remove();
        }
        this.f17443g.clear();
        iVar.v(this.f17454r);
        w();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void w() {
        i iVar = this.f17438a;
        if (iVar == null) {
            return;
        }
        this.f17460x = this.f17459w.b(Build.VERSION.SDK_INT, iVar.q(), iVar.m());
    }

    public void w0(String str) {
        this.f17448l = str;
        l7.a aVarL = L();
        if (aVarL != null) {
            aVarL.c(str);
        }
    }

    public final void x(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void x0(g7.b bVar) {
        l7.a aVar = this.f17446j;
        if (aVar != null) {
            aVar.d(bVar);
        }
    }

    public final void y(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public void y0(Map<String, Typeface> map) {
        if (map == this.f17447k) {
            return;
        }
        this.f17447k = map;
        invalidateSelf();
    }

    public final void z(Canvas canvas) {
        p7.c cVar = this.f17452p;
        i iVar = this.f17438a;
        if (cVar == null || iVar == null) {
            return;
        }
        this.f17461y.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float fWidth = bounds.width() / iVar.b().width();
            float fHeight = bounds.height() / iVar.b().height();
            this.f17461y.preTranslate(bounds.left, bounds.top);
            this.f17461y.preScale(fWidth, fHeight);
        }
        cVar.d(canvas, this.f17461y, this.f17453q, null);
    }

    public void z0(final int i10) {
        if (this.f17438a == null) {
            this.f17443g.add(new a() { // from class: g7.g0
                @Override // g7.h0.a
                public final void a(i iVar) {
                    this.f17436a.z0(i10);
                }
            });
        } else {
            this.b.J(i10);
        }
    }
}
