package androidx.camera.view;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.PreviewView;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.p000lifecycle.d0;
import g0.a2;
import g0.f1;
import g0.r1;
import g0.v1;
import g0.v2;
import g0.y2;
import java.util.concurrent.atomic.AtomicReference;
import n0.o0;
import n0.p0;
import p0.a0;
import p0.z;
import p1.f0;
import p1.i;
import p1.t;
import p1.x;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f1406p = c.PERFORMANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f1407a;
    public androidx.camera.view.c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f1408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.camera.view.b f1409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0<e> f1411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<androidx.camera.view.a> f1412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i f1413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x f1414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q1.a f1415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o0 f1416k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MotionEvent f1417l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f1418m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View.OnLayoutChangeListener f1419n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a2.c f1420o;

    public class a implements a2.c {
        public a() {
        }

        public static /* synthetic */ void c(a aVar, androidx.camera.view.a aVar2, p0 p0Var) {
            if (t.a(PreviewView.this.f1412g, aVar2, null)) {
                aVar2.i(e.IDLE);
            }
            aVar2.f();
            p0Var.b().d(aVar2);
        }

        public static /* synthetic */ void d(a aVar, p0 p0Var, v2 v2Var, v2.h hVar) {
            PreviewView previewView;
            androidx.camera.view.c cVar;
            aVar.getClass();
            r1.a("PreviewView", "Preview transformation info updated. " + hVar);
            PreviewView.this.f1409d.r(hVar, v2Var.q(), p0Var.k().i() == 0);
            if (hVar.d() == -1 || ((cVar = (previewView = PreviewView.this).b) != null && (cVar instanceof androidx.camera.view.d))) {
                PreviewView.this.f1410e = true;
            } else {
                previewView.f1410e = false;
            }
            PreviewView.this.e();
        }

        @Override // g0.a2.c
        public void a(final v2 v2Var) {
            androidx.camera.view.c dVar;
            if (!z.d()) {
                l2.b.i(PreviewView.this.getContext()).execute(new Runnable() { // from class: p1.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreviewView.this.f1420o.a(v2Var);
                    }
                });
                return;
            }
            r1.a("PreviewView", "Surface requested by Preview.");
            final p0 p0VarM = v2Var.m();
            PreviewView.this.f1416k = p0VarM.k();
            PreviewView.this.f1414i.g(p0VarM.k().h());
            v2Var.x(l2.b.i(PreviewView.this.getContext()), new v2.i() { // from class: p1.v
                @Override // g0.v2.i
                public final void a(v2.h hVar) {
                    PreviewView.a.d(this.f28192a, p0VarM, v2Var, hVar);
                }
            });
            PreviewView previewView = PreviewView.this;
            if (!PreviewView.f(previewView.b, v2Var, previewView.f1407a)) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.g(v2Var, previewView2.f1407a)) {
                    PreviewView previewView3 = PreviewView.this;
                    dVar = new androidx.camera.view.e(previewView3, previewView3.f1409d);
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    dVar = new androidx.camera.view.d(previewView4, previewView4.f1409d);
                }
                previewView2.b = dVar;
            }
            o0 o0VarK = p0VarM.k();
            PreviewView previewView5 = PreviewView.this;
            final androidx.camera.view.a aVar = new androidx.camera.view.a(o0VarK, previewView5.f1411f, previewView5.b);
            PreviewView.this.f1412g.set(aVar);
            p0VarM.b().c(l2.b.i(PreviewView.this.getContext()), aVar);
            PreviewView.this.b.g(v2Var, new androidx.camera.view.c.a() { // from class: p1.w
                @Override // androidx.camera.view.c.a
                public final void a() {
                    PreviewView.a.c(this.f28194a, aVar, p0VarM);
                }
            });
            PreviewView previewView6 = PreviewView.this;
            if (previewView6.indexOfChild(previewView6.f1408c) == -1) {
                PreviewView previewView7 = PreviewView.this;
                previewView7.addView(previewView7.f1408c);
            }
            PreviewView.this.getClass();
        }
    }

    public class b implements DisplayManager.DisplayListener {
        public b() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            Display defaultDisplay = PreviewView.this.getDefaultDisplay();
            if (defaultDisplay == null || defaultDisplay.getDisplayId() != i10) {
                return;
            }
            PreviewView.this.e();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    public enum c {
        PERFORMANCE(0),
        COMPATIBLE(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1425a;

        c(int i10) {
            this.f1425a = i10;
        }

        public static c b(int i10) {
            for (c cVar : values()) {
                if (cVar.f1425a == i10) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i10);
        }

        public int c() {
            return this.f1425a;
        }
    }

    public enum d {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1432a;

        d(int i10) {
            this.f1432a = i10;
        }

        public static d b(int i10) {
            for (d dVar : values()) {
                if (dVar.f1432a == i10) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i10);
        }

        public int c() {
            return this.f1432a;
        }
    }

    public enum e {
        IDLE,
        STREAMING
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ boolean a(PreviewView previewView, q1.a.c cVar) {
        if (!(cVar instanceof q1.a.c.C0513c)) {
            previewView.getClass();
            return true;
        }
        i iVar = previewView.f1413h;
        if (iVar == null) {
            return true;
        }
        iVar.A(((q1.a.c.C0513c) cVar).getIncrementalScaleFactor());
        return true;
    }

    public static /* synthetic */ void b(PreviewView previewView, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        previewView.getClass();
        if (i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) {
            return;
        }
        previewView.e();
        previewView.c(true);
    }

    public static boolean f(androidx.camera.view.c cVar, v2 v2Var, c cVar2) {
        return (cVar instanceof androidx.camera.view.d) && !g(v2Var, cVar2);
    }

    public static boolean g(v2 v2Var, c cVar) {
        boolean zEquals = v2Var.m().k().u().equals("androidx.camera.camera2.legacy");
        boolean z10 = (s1.b.b(SurfaceViewStretchedQuirk.class) == null && s1.b.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (zEquals || z10) {
            return true;
        }
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService("display");
    }

    private f1.j getScreenFlashInternal() {
        return this.f1408c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i10 = 1;
        if (iOrdinal != 1) {
            i10 = 2;
            if (iOrdinal != 2) {
                i10 = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i10;
    }

    private void setScreenFlashUiInfo(f1.j jVar) {
        i iVar = this.f1413h;
        if (iVar == null) {
            r1.a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
        } else {
            iVar.H(new r1.a(r1.a.EnumC0526a.PREVIEW_VIEW, jVar));
        }
    }

    public final void c(boolean z10) {
        z.b();
        y2 viewPort = getViewPort();
        if (this.f1413h == null || viewPort == null || !isAttachedToWindow()) {
            return;
        }
        try {
            this.f1413h.c(getSurfaceProvider(), viewPort);
        } catch (IllegalStateException e10) {
            if (!z10) {
                throw e10;
            }
            r1.d("PreviewView", e10.toString(), e10);
        }
    }

    @SuppressLint({"WrongConstant"})
    public y2 d(int i10) {
        z.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new y2.a(new Rational(getWidth(), getHeight()), i10).c(getViewPortScaleType()).b(getLayoutDirection()).a();
    }

    public void e() {
        z.b();
        if (this.b != null) {
            j();
            this.b.h();
        }
        this.f1414i.f(new Size(getWidth(), getHeight()), getLayoutDirection());
        i iVar = this.f1413h;
        if (iVar != null) {
            iVar.V(getSensorToViewTransform());
        }
    }

    public Bitmap getBitmap() {
        z.b();
        androidx.camera.view.c cVar = this.b;
        if (cVar == null) {
            return null;
        }
        return cVar.a();
    }

    public i getController() {
        z.b();
        return this.f1413h;
    }

    public Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        return display != null ? display : getDisplay();
    }

    public c getImplementationMode() {
        z.b();
        return this.f1407a;
    }

    public v1 getMeteringPointFactory() {
        z.b();
        return this.f1414i;
    }

    public t1.b getOutputTransform() {
        Matrix matrixJ;
        z.b();
        try {
            matrixJ = this.f1409d.j(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixJ = null;
        }
        Rect rectI = this.f1409d.i();
        if (matrixJ == null || rectI == null) {
            r1.a("PreviewView", "Transform info is not ready");
            return null;
        }
        matrixJ.preConcat(a0.b(rectI));
        if (this.b instanceof androidx.camera.view.e) {
            matrixJ.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            r1.l("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new t1.b(matrixJ, new Size(rectI.width(), rectI.height()));
    }

    public androidx.p000lifecycle.a0<e> getPreviewStreamState() {
        return this.f1411f;
    }

    public d getScaleType() {
        z.b();
        return this.f1409d.g();
    }

    public f1.j getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        z.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return this.f1409d.h(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public a2.c getSurfaceProvider() {
        z.b();
        return this.f1420o;
    }

    public y2 getViewPort() {
        z.b();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        return d(defaultDisplay.getRotation());
    }

    public void h() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.f1418m, new Handler(Looper.getMainLooper()));
    }

    public void i() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f1418m);
    }

    public void j() {
        Display defaultDisplay;
        o0 o0Var;
        if (!this.f1410e || (defaultDisplay = getDefaultDisplay()) == null || (o0Var = this.f1416k) == null) {
            return;
        }
        this.f1409d.o(o0Var.w(defaultDisplay.getRotation()), defaultDisplay.getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            h();
        }
        addOnLayoutChangeListener(this.f1419n);
        androidx.camera.view.c cVar = this.b;
        if (cVar != null) {
            cVar.d();
        }
        c(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f1419n);
        androidx.camera.view.c cVar = this.b;
        if (cVar != null) {
            cVar.e();
        }
        i iVar = this.f1413h;
        if (iVar != null) {
            iVar.d();
        }
        if (isInEditMode()) {
            return;
        }
        i();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1413h == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z10 = motionEvent.getPointerCount() == 1;
        boolean z11 = motionEvent.getAction() == 1;
        boolean z12 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout());
        if (!z10 || !z11 || !z12) {
            return this.f1415j.f(motionEvent) || super.onTouchEvent(motionEvent);
        }
        this.f1417l = motionEvent;
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f1413h != null) {
            MotionEvent motionEvent = this.f1417l;
            float x10 = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.f1417l;
            this.f1413h.B(this.f1414i, x10, motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f);
        }
        this.f1417l = null;
        return super.performClick();
    }

    public void setController(i iVar) {
        z.b();
        i iVar2 = this.f1413h;
        if (iVar2 != null && iVar2 != iVar) {
            iVar2.d();
            setScreenFlashUiInfo(null);
        }
        this.f1413h = iVar;
        c(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(c cVar) {
        z.b();
        this.f1407a = cVar;
        c cVar2 = c.PERFORMANCE;
    }

    public void setScaleType(d dVar) {
        z.b();
        this.f1409d.q(dVar);
        e();
        c(false);
    }

    public void setScreenFlashOverlayColor(int i10) {
        this.f1408c.setBackgroundColor(i10);
    }

    public void setScreenFlashWindow(Window window) {
        z.b();
        this.f1408c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        c cVar = f1406p;
        this.f1407a = cVar;
        androidx.camera.view.b bVar = new androidx.camera.view.b();
        this.f1409d = bVar;
        this.f1410e = true;
        this.f1411f = new d0<>(e.IDLE);
        this.f1412g = new AtomicReference<>();
        this.f1414i = new x(bVar);
        this.f1418m = new b();
        this.f1419n = new View.OnLayoutChangeListener() { // from class: p1.r
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                PreviewView.b(this.f28189a, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        this.f1420o = new a();
        z.b();
        Resources.Theme theme = context.getTheme();
        int[] iArr = p1.a0.f28119a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        androidx.core.view.o0.k0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, i11);
        try {
            setScaleType(d.b(typedArrayObtainStyledAttributes.getInteger(p1.a0.f28120c, bVar.g().c())));
            setImplementationMode(c.b(typedArrayObtainStyledAttributes.getInteger(p1.a0.b, cVar.c())));
            typedArrayObtainStyledAttributes.recycle();
            this.f1415j = new q1.a(context, new q1.a.b() { // from class: p1.s
                @Override // q1.a.b
                public final boolean a(q1.a.c cVar2) {
                    return PreviewView.a(this.f28190a, cVar2);
                }
            });
            if (getBackground() == null) {
                setBackgroundColor(l2.b.c(getContext(), R.color.black));
            }
            f0 f0Var = new f0(context);
            this.f1408c = f0Var;
            f0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
