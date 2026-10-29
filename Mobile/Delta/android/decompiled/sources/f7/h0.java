package f7;

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
    public static final Executor V = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new s7.f());
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
    public f7.a M;
    public final ValueAnimator.AnimatorUpdateListener N;
    public final Semaphore O;
    public Handler P;
    public Runnable Q;
    public final Runnable R;
    public float S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f16359a;
    public final s7.h b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f16363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<a> f16364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k7.b f16365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f16366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k7.a f16367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map<String, Typeface> f16368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f16369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j0 f16370m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16371n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16372o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o7.c f16373p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16374q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f16375r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16376s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f16377t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16378u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16379v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x0 f16380w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16381x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Matrix f16382y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Bitmap f16383z;

    public interface a {
        void a(i iVar);
    }

    public enum b {
        NONE,
        PLAY,
        RESUME
    }

    public h0() {
        s7.h hVar = new s7.h();
        this.b = hVar;
        this.f16360c = true;
        this.f16361d = false;
        this.f16362e = false;
        this.f16363f = b.NONE;
        this.f16364g = new ArrayList<>();
        this.f16370m = new j0();
        this.f16371n = false;
        this.f16372o = true;
        this.f16374q = 255;
        this.f16379v = false;
        this.f16380w = x0.AUTOMATIC;
        this.f16381x = false;
        this.f16382y = new Matrix();
        this.J = new float[9];
        this.L = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: f7.b0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h0.g(this.f16340a, valueAnimator);
            }
        };
        this.N = animatorUpdateListener;
        this.O = new Semaphore(1);
        this.R = new Runnable() { // from class: f7.c0
            @Override // java.lang.Runnable
            public final void run() {
                h0.k(this.f16341a);
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
        o7.c cVar = h0Var.f16373p;
        if (cVar != null) {
            cVar.M(h0Var.b.o());
        }
    }

    public static /* synthetic */ void k(final h0 h0Var) {
        o7.c cVar = h0Var.f16373p;
        if (cVar == null) {
            return;
        }
        try {
            h0Var.O.acquire();
            cVar.M(h0Var.b.o());
            if (T && h0Var.L) {
                if (h0Var.P == null) {
                    h0Var.P = new Handler(Looper.getMainLooper());
                    h0Var.Q = new Runnable() { // from class: f7.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            h0.n(this.f16495a);
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
        boolean zA = this.f16370m.a(i0Var, z10);
        if (this.f16359a == null || !zA) {
            return;
        }
        t();
    }

    @Deprecated
    public void A0(boolean z10) {
        this.f16361d = z10;
    }

    public void B() {
        this.f16364g.clear();
        this.b.n();
        if (isVisible()) {
            return;
        }
        this.f16363f = b.NONE;
    }

    public void B0(c cVar) {
        k7.b bVar = this.f16365h;
        if (bVar != null) {
            bVar.d(cVar);
        }
    }

    public final void C(int i10, int i11) {
        Bitmap bitmap = this.f16383z;
        if (bitmap == null || bitmap.getWidth() < i10 || this.f16383z.getHeight() < i11) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f16383z = bitmapCreateBitmap;
            this.A.setBitmap(bitmapCreateBitmap);
            this.L = true;
            return;
        }
        if (this.f16383z.getWidth() > i10 || this.f16383z.getHeight() > i11) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f16383z, 0, 0, i10, i11);
            this.f16383z = bitmapCreateBitmap2;
            this.A.setBitmap(bitmapCreateBitmap2);
            this.L = true;
        }
    }

    public void C0(String str) {
        this.f16366i = str;
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
        this.D = new g7.a();
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
    }

    public void D0(boolean z10) {
        this.f16371n = z10;
    }

    public f7.a E() {
        f7.a aVar = this.M;
        return aVar != null ? aVar : e.d();
    }

    public void E0(final int i10) {
        if (this.f16359a == null) {
            this.f16364g.add(new a() { // from class: f7.s
                @Override // f7.h0.a
                public final void a(i iVar) {
                    this.f16454a.E0(i10);
                }
            });
        } else {
            this.b.K(i10 + 0.99f);
        }
    }

    public boolean F() {
        return E() == f7.a.ENABLED;
    }

    public void F0(final String str) {
        i iVar = this.f16359a;
        if (iVar == null) {
            this.f16364g.add(new a() { // from class: f7.z
                @Override // f7.h0.a
                public final void a(i iVar2) {
                    this.f16500a.F0(str);
                }
            });
            return;
        }
        l7.h hVarL = iVar.l(str);
        if (hVarL != null) {
            E0((int) (hVarL.b + hVarL.f22981c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public Bitmap G(String str) {
        k7.b bVarN = N();
        if (bVarN != null) {
            return bVarN.a(str);
        }
        return null;
    }

    public void G0(final float f10) {
        i iVar = this.f16359a;
        if (iVar == null) {
            this.f16364g.add(new a() { // from class: f7.v
                @Override // f7.h0.a
                public final void a(i iVar2) {
                    this.f16468a.G0(f10);
                }
            });
        } else {
            this.b.K(s7.j.i(iVar.p(), this.f16359a.f(), f10));
        }
    }

    public boolean H() {
        return this.f16379v;
    }

    public void H0(final int i10, final int i11) {
        if (this.f16359a == null) {
            this.f16364g.add(new a() { // from class: f7.w
                @Override // f7.h0.a
                public final void a(i iVar) {
                    this.f16470a.H0(i10, i11);
                }
            });
        } else {
            this.b.N(i10, i11 + 0.99f);
        }
    }

    public boolean I() {
        return this.f16372o;
    }

    public void I0(final String str) {
        i iVar = this.f16359a;
        if (iVar == null) {
            this.f16364g.add(new a() { // from class: f7.r
                @Override // f7.h0.a
                public final void a(i iVar2) {
                    this.f16452a.I0(str);
                }
            });
            return;
        }
        l7.h hVarL = iVar.l(str);
        if (hVarL != null) {
            int i10 = (int) hVarL.b;
            H0(i10, ((int) hVarL.f22981c) + i10);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public i J() {
        return this.f16359a;
    }

    public void J0(final int i10) {
        if (this.f16359a == null) {
            this.f16364g.add(new a() { // from class: f7.t
                @Override // f7.h0.a
                public final void a(i iVar) {
                    this.f16460a.J0(i10);
                }
            });
        } else {
            this.b.O(i10);
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
        i iVar = this.f16359a;
        if (iVar == null) {
            this.f16364g.add(new a() { // from class: f7.a0
                @Override // f7.h0.a
                public final void a(i iVar2) {
                    this.f16339a.K0(str);
                }
            });
            return;
        }
        l7.h hVarL = iVar.l(str);
        if (hVarL != null) {
            J0((int) hVarL.b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public final k7.a L() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f16367j == null) {
            k7.a aVar = new k7.a(getCallback(), null);
            this.f16367j = aVar;
            String str = this.f16369l;
            if (str != null) {
                aVar.c(str);
            }
        }
        return this.f16367j;
    }

    public void L0(final float f10) {
        i iVar = this.f16359a;
        if (iVar == null) {
            this.f16364g.add(new a() { // from class: f7.e0
                @Override // f7.h0.a
                public final void a(i iVar2) {
                    this.f16354a.L0(f10);
                }
            });
        } else {
            J0((int) s7.j.i(iVar.p(), this.f16359a.f(), f10));
        }
    }

    public int M() {
        return (int) this.b.p();
    }

    public void M0(boolean z10) {
        if (this.f16376s == z10) {
            return;
        }
        this.f16376s = z10;
        o7.c cVar = this.f16373p;
        if (cVar != null) {
            cVar.K(z10);
        }
    }

    public final k7.b N() {
        k7.b bVar = this.f16365h;
        if (bVar != null && !bVar.b(K())) {
            this.f16365h = null;
        }
        if (this.f16365h == null) {
            this.f16365h = new k7.b(getCallback(), this.f16366i, null, this.f16359a.j());
        }
        return this.f16365h;
    }

    public void N0(boolean z10) {
        this.f16375r = z10;
        i iVar = this.f16359a;
        if (iVar != null) {
            iVar.v(z10);
        }
    }

    public String O() {
        return this.f16366i;
    }

    public void O0(final float f10) {
        if (this.f16359a == null) {
            this.f16364g.add(new a() { // from class: f7.f0
                @Override // f7.h0.a
                public final void a(i iVar) {
                    this.f16356a.O0(f10);
                }
            });
            return;
        }
        if (e.h()) {
            e.b("Drawable#setProgress");
        }
        this.b.J(this.f16359a.h(f10));
        if (e.h()) {
            e.c("Drawable#setProgress");
        }
    }

    public k0 P(String str) {
        i iVar = this.f16359a;
        if (iVar == null) {
            return null;
        }
        return iVar.j().get(str);
    }

    public void P0(x0 x0Var) {
        this.f16380w = x0Var;
        w();
    }

    public boolean Q() {
        return this.f16371n;
    }

    public void Q0(int i10) {
        this.b.setRepeatCount(i10);
    }

    public l7.h R() {
        Iterator<String> it = U.iterator();
        l7.h hVarL = null;
        while (it.hasNext()) {
            hVarL = this.f16359a.l(it.next());
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
        return this.b.r();
    }

    public void S0(boolean z10) {
        this.f16362e = z10;
    }

    public float T() {
        return this.b.s();
    }

    public void T0(float f10) {
        this.b.P(f10);
    }

    public u0 U() {
        i iVar = this.f16359a;
        if (iVar != null) {
            return iVar.n();
        }
        return null;
    }

    public void U0(z0 z0Var) {
    }

    public float V() {
        return this.b.o();
    }

    public void V0(boolean z10) {
        this.b.Q(z10);
    }

    public x0 W() {
        return this.f16381x ? x0.SOFTWARE : x0.HARDWARE;
    }

    public final boolean W0() {
        i iVar = this.f16359a;
        if (iVar == null) {
            return false;
        }
        float f10 = this.S;
        float fO = this.b.o();
        this.S = fO;
        return Math.abs(fO - f10) * iVar.d() >= 50.0f;
    }

    public int X() {
        return this.b.getRepeatCount();
    }

    public boolean X0() {
        return this.f16368k == null && this.f16359a.c().j() > 0;
    }

    @SuppressLint({"WrongConstant"})
    public int Y() {
        return this.b.getRepeatMode();
    }

    public float Z() {
        return this.b.t();
    }

    public z0 a0() {
        return null;
    }

    public Typeface b0(l7.c cVar) {
        Map<String, Typeface> map = this.f16368k;
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
        k7.a aVarL = L();
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
        s7.h hVar = this.b;
        if (hVar == null) {
            return false;
        }
        return hVar.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        float fP;
        float fO;
        o7.c cVar = this.f16373p;
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
                    if ((fP > fO ? 1 : (fP == fO ? 0 : -1)) == 0) {
                        return;
                    }
                }
            } finally {
                if (e.h()) {
                    e.c("Drawable#draw");
                }
                if (zF) {
                    this.O.release();
                    if (cVar.P() != this.b.o()) {
                        V.execute(this.R);
                    }
                }
            }
        }
        if (e.h()) {
            e.b("Drawable#draw");
        }
        if (zF && W0()) {
            O0(this.b.o());
        }
        if (this.f16362e) {
            try {
                if (this.f16381x) {
                    m0(canvas, cVar);
                } else {
                    z(canvas);
                }
            } catch (Throwable th2) {
                s7.e.b("Lottie crashed in draw!", th2);
            }
        } else if (this.f16381x) {
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
        b bVar = this.f16363f;
        return bVar == b.PLAY || bVar == b.RESUME;
    }

    public boolean f0() {
        return this.f16377t;
    }

    public boolean g0() {
        return this.f16378u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f16374q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        i iVar = this.f16359a;
        if (iVar == null) {
            return -1;
        }
        return iVar.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        i iVar = this.f16359a;
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
        return this.f16370m.b(i0Var);
    }

    public void i0() {
        this.f16364g.clear();
        this.b.w();
        if (isVisible()) {
            return;
        }
        this.f16363f = b.NONE;
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
        if (this.f16373p == null) {
            this.f16364g.add(new a() { // from class: f7.d0
                @Override // f7.h0.a
                public final void a(i iVar) {
                    this.f16343a.j0();
                }
            });
            return;
        }
        w();
        if (s(K()) || X() == 0) {
            if (isVisible()) {
                this.b.x();
                this.f16363f = b.NONE;
            } else {
                this.f16363f = b.PLAY;
            }
        }
        if (s(K())) {
            return;
        }
        l7.h hVarR = R();
        if (hVarR != null) {
            z0((int) hVarR.b);
        } else {
            z0((int) (Z() < 0.0f ? T() : S()));
        }
        this.b.n();
        if (isVisible()) {
            return;
        }
        this.f16363f = b.NONE;
    }

    public void k0() {
        this.b.removeAllListeners();
    }

    public void l0() {
        this.b.removeAllUpdateListeners();
        this.b.addUpdateListener(this.N);
    }

    public final void m0(Canvas canvas, o7.c cVar) {
        if (this.f16359a == null || cVar == null) {
            return;
        }
        D();
        canvas.getMatrix(this.I);
        canvas.getClipBounds(this.B);
        x(this.B, this.C);
        this.I.mapRect(this.C);
        y(this.C, this.B);
        if (this.f16372o) {
            this.H.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.e(this.H, null, false);
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
            this.f16382y.set(this.I);
            this.f16382y.preScale(fWidth, fHeight);
            Matrix matrix = this.f16382y;
            RectF rectF2 = this.H;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f16382y.postScale(1.0f / f10, 1.0f / f11);
            this.f16383z.eraseColor(0);
            this.A.setMatrix(s7.m.f30547a);
            this.A.scale(f10, f11);
            cVar.i(this.A, this.f16382y, this.f16374q, null);
            this.I.invert(this.K);
            this.K.mapRect(this.G, this.H);
            y(this.G, this.F);
        }
        this.E.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f16383z, this.E, this.F, this.D);
    }

    public List<l7.e> n0(l7.e eVar) {
        if (this.f16373p == null) {
            s7.e.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.f16373p.h(eVar, 0, arrayList, new l7.e(new String[0]));
        return arrayList;
    }

    public void o0() {
        if (this.f16373p == null) {
            this.f16364g.add(new a() { // from class: f7.y
                @Override // f7.h0.a
                public final void a(i iVar) {
                    this.f16499a.o0();
                }
            });
            return;
        }
        w();
        if (s(K()) || X() == 0) {
            if (isVisible()) {
                this.b.D();
                this.f16363f = b.NONE;
            } else {
                this.f16363f = b.RESUME;
            }
        }
        if (s(K())) {
            return;
        }
        z0((int) (Z() < 0.0f ? T() : S()));
        this.b.n();
        if (isVisible()) {
            return;
        }
        this.f16363f = b.NONE;
    }

    public final void p0(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }

    public void q(Animator.AnimatorListener animatorListener) {
        this.b.addListener(animatorListener);
    }

    public void q0(boolean z10) {
        this.f16377t = z10;
    }

    public <T> void r(final l7.e eVar, final T t8, final t7.c<T> cVar) {
        o7.c cVar2 = this.f16373p;
        if (cVar2 == null) {
            this.f16364g.add(new a() { // from class: f7.u
                @Override // f7.h0.a
                public final void a(i iVar) {
                    this.f16461a.r(eVar, t8, cVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == l7.e.f22977c) {
            cVar2.c(t8, cVar);
        } else if (eVar.d() != null) {
            eVar.d().c(t8, cVar);
        } else {
            List<l7.e> listN0 = n0(eVar);
            for (int i10 = 0; i10 < listN0.size(); i10++) {
                listN0.get(i10).d().c(t8, cVar);
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
        this.f16378u = z10;
    }

    public boolean s(Context context) {
        if (this.f16361d) {
            return true;
        }
        return this.f16360c && e.f().a(context) == j7.a.STANDARD_MOTION;
    }

    public void s0(f7.a aVar) {
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
        this.f16374q = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        s7.e.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            b bVar = this.f16363f;
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
                this.f16363f = b.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f16363f = b.NONE;
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
        i iVar = this.f16359a;
        if (iVar == null) {
            return;
        }
        o7.c cVar = new o7.c(this, q7.v.a(iVar), iVar.k(), iVar);
        this.f16373p = cVar;
        if (this.f16376s) {
            cVar.K(true);
        }
        this.f16373p.Q(this.f16372o);
    }

    public void t0(boolean z10) {
        if (z10 != this.f16379v) {
            this.f16379v = z10;
            invalidateSelf();
        }
    }

    public void u() {
        this.f16364g.clear();
        this.b.cancel();
        if (isVisible()) {
            return;
        }
        this.f16363f = b.NONE;
    }

    public void u0(boolean z10) {
        if (z10 != this.f16372o) {
            this.f16372o = z10;
            o7.c cVar = this.f16373p;
            if (cVar != null) {
                cVar.Q(z10);
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
                this.f16363f = b.NONE;
            }
        }
        this.f16359a = null;
        this.f16373p = null;
        this.f16365h = null;
        this.S = -3.4028235E38f;
        this.b.k();
        invalidateSelf();
    }

    public boolean v0(i iVar) {
        if (this.f16359a == iVar) {
            return false;
        }
        this.L = true;
        v();
        this.f16359a = iVar;
        t();
        this.b.G(iVar);
        O0(this.b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f16364g).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.a(iVar);
            }
            it.remove();
        }
        this.f16364g.clear();
        iVar.v(this.f16375r);
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
        i iVar = this.f16359a;
        if (iVar == null) {
            return;
        }
        this.f16381x = this.f16380w.b(Build.VERSION.SDK_INT, iVar.q(), iVar.m());
    }

    public void w0(String str) {
        this.f16369l = str;
        k7.a aVarL = L();
        if (aVarL != null) {
            aVarL.c(str);
        }
    }

    public final void x(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void x0(f7.b bVar) {
        k7.a aVar = this.f16367j;
        if (aVar != null) {
            aVar.d(bVar);
        }
    }

    public final void y(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public void y0(Map<String, Typeface> map) {
        if (map == this.f16368k) {
            return;
        }
        this.f16368k = map;
        invalidateSelf();
    }

    public final void z(Canvas canvas) {
        o7.c cVar = this.f16373p;
        i iVar = this.f16359a;
        if (cVar == null || iVar == null) {
            return;
        }
        this.f16382y.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float fWidth = bounds.width() / iVar.b().width();
            float fHeight = bounds.height() / iVar.b().height();
            this.f16382y.preTranslate(bounds.left, bounds.top);
            this.f16382y.preScale(fWidth, fHeight);
        }
        cVar.i(canvas, this.f16382y, this.f16374q, null);
    }

    public void z0(final int i10) {
        if (this.f16359a == null) {
            this.f16364g.add(new a() { // from class: f7.g0
                @Override // f7.h0.a
                public final void a(i iVar) {
                    this.f16357a.z0(i10);
                }
            });
        } else {
            this.b.J(i10);
        }
    }
}
