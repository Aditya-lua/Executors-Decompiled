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
import androidx.core.view.C0625o0;
import androidx.p616lifecycle.AbstractC0940a0;
import androidx.p616lifecycle.C0949d0;
import java.util.concurrent.atomic.AtomicReference;
import p140g0.AbstractC5947v1;
import p140g0.C5864a2;
import p140g0.C5883f1;
import p140g0.C5931r1;
import p140g0.C5948v2;
import p140g0.C5960y2;
import p261l2.C7975b;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8804p0;
import p347p0.C10085a0;
import p347p0.C10110z;
import p348p1.AbstractC10127i;
import p348p1.C10112a0;
import p348p1.C10122f0;
import p348p1.C10146t;
import p348p1.C10150x;
import p367q1.C10424a;
import p398r1.C10776a;
import p425s1.C11160b;
import p438t1.C11470b;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    /* JADX INFO: renamed from: p */
    public static final EnumC0501c f1834p = EnumC0501c.PERFORMANCE;

    /* JADX INFO: renamed from: a */
    public EnumC0501c f1835a;

    /* JADX INFO: renamed from: b */
    public AbstractC0506c f1836b;

    /* JADX INFO: renamed from: c */
    public final C10122f0 f1837c;

    /* JADX INFO: renamed from: d */
    public final C0505b f1838d;

    /* JADX INFO: renamed from: e */
    public boolean f1839e;

    /* JADX INFO: renamed from: f */
    public final C0949d0<EnumC0503e> f1840f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference<C0504a> f1841g;

    /* JADX INFO: renamed from: h */
    public AbstractC10127i f1842h;

    /* JADX INFO: renamed from: i */
    public C10150x f1843i;

    /* JADX INFO: renamed from: j */
    public final C10424a f1844j;

    /* JADX INFO: renamed from: k */
    public InterfaceC8799o0 f1845k;

    /* JADX INFO: renamed from: l */
    public MotionEvent f1846l;

    /* JADX INFO: renamed from: m */
    public final C0500b f1847m;

    /* JADX INFO: renamed from: n */
    public final View.OnLayoutChangeListener f1848n;

    /* JADX INFO: renamed from: o */
    public final C5864a2.c f1849o;

    /* JADX INFO: renamed from: androidx.camera.view.PreviewView$a */
    public class C0499a implements C5864a2.c {
        public C0499a() {
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m2354c(C0499a c0499a, C0504a c0504a, InterfaceC8804p0 interfaceC8804p0) {
            if (C10146t.m39085a(PreviewView.this.f1841g, c0504a, null)) {
                c0504a.m2372i(EnumC0503e.IDLE);
            }
            c0504a.m2369f();
            interfaceC8804p0.mo6693b().mo34019d(c0504a);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m2355d(C0499a c0499a, InterfaceC8804p0 interfaceC8804p0, C5948v2 c5948v2, C5948v2.h hVar) {
            PreviewView previewView;
            AbstractC0506c abstractC0506c;
            c0499a.getClass();
            C5931r1.m26561a("PreviewView", "Preview transformation info updated. " + hVar);
            PreviewView.this.f1838d.m2392r(hVar, c5948v2.m26655q(), interfaceC8804p0.mo6698k().mo26583i() == 0);
            if (hVar.mo26512d() == -1 || ((abstractC0506c = (previewView = PreviewView.this).f1836b) != null && (abstractC0506c instanceof C0507d))) {
                PreviewView.this.f1839e = true;
            } else {
                previewView.f1839e = false;
            }
            PreviewView.this.m2349e();
        }

        @Override // p140g0.C5864a2.c
        /* JADX INFO: renamed from: a */
        public void mo2356a(final C5948v2 c5948v2) {
            AbstractC0506c c0507d;
            if (!C10110z.m39010d()) {
                C7975b.m33011i(PreviewView.this.getContext()).execute(new Runnable() { // from class: p1.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreviewView.this.f1849o.mo2356a(c5948v2);
                    }
                });
                return;
            }
            C5931r1.m26561a("PreviewView", "Surface requested by Preview.");
            final InterfaceC8804p0 interfaceC8804p0M26651m = c5948v2.m26651m();
            PreviewView.this.f1845k = interfaceC8804p0M26651m.mo6698k();
            PreviewView.this.f1843i.m39087g(interfaceC8804p0M26651m.mo6698k().mo35046h());
            c5948v2.m26662x(C7975b.m33011i(PreviewView.this.getContext()), new C5948v2.i() { // from class: p1.v
                @Override // p140g0.C5948v2.i
                /* JADX INFO: renamed from: a */
                public final void mo24343a(C5948v2.h hVar) {
                    PreviewView.C0499a.m2355d(this.f36506a, interfaceC8804p0M26651m, c5948v2, hVar);
                }
            });
            PreviewView previewView = PreviewView.this;
            if (!PreviewView.m2345f(previewView.f1836b, c5948v2, previewView.f1835a)) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.m2346g(c5948v2, previewView2.f1835a)) {
                    PreviewView previewView3 = PreviewView.this;
                    c0507d = new C0508e(previewView3, previewView3.f1838d);
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    c0507d = new C0507d(previewView4, previewView4.f1838d);
                }
                previewView2.f1836b = c0507d;
            }
            InterfaceC8799o0 interfaceC8799o0Mo6698k = interfaceC8804p0M26651m.mo6698k();
            PreviewView previewView5 = PreviewView.this;
            final C0504a c0504a = new C0504a(interfaceC8799o0Mo6698k, previewView5.f1840f, previewView5.f1836b);
            PreviewView.this.f1841g.set(c0504a);
            interfaceC8804p0M26651m.mo6693b().mo34018c(C7975b.m33011i(PreviewView.this.getContext()), c0504a);
            PreviewView.this.f1836b.mo2400g(c5948v2, new AbstractC0506c.a() { // from class: p1.w
                @Override // androidx.camera.view.AbstractC0506c.a
                /* JADX INFO: renamed from: a */
                public final void mo2403a() {
                    PreviewView.C0499a.m2354c(this.f36509a, c0504a, interfaceC8804p0M26651m);
                }
            });
            PreviewView previewView6 = PreviewView.this;
            if (previewView6.indexOfChild(previewView6.f1837c) == -1) {
                PreviewView previewView7 = PreviewView.this;
                previewView7.addView(previewView7.f1837c);
            }
            PreviewView.this.getClass();
        }
    }

    /* JADX INFO: renamed from: androidx.camera.view.PreviewView$b */
    public class C0500b implements DisplayManager.DisplayListener {
        public C0500b() {
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
            PreviewView.this.m2349e();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* JADX INFO: renamed from: androidx.camera.view.PreviewView$c */
    public enum EnumC0501c {
        PERFORMANCE(0),
        COMPATIBLE(1);


        /* JADX INFO: renamed from: a */
        public final int f1855a;

        EnumC0501c(int i10) {
            this.f1855a = i10;
        }

        /* JADX INFO: renamed from: b */
        public static EnumC0501c m2358b(int i10) {
            for (EnumC0501c enumC0501c : values()) {
                if (enumC0501c.f1855a == i10) {
                    return enumC0501c;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i10);
        }

        /* JADX INFO: renamed from: c */
        public int m2359c() {
            return this.f1855a;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.view.PreviewView$d */
    public enum EnumC0502d {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);


        /* JADX INFO: renamed from: a */
        public final int f1863a;

        EnumC0502d(int i10) {
            this.f1863a = i10;
        }

        /* JADX INFO: renamed from: b */
        public static EnumC0502d m2361b(int i10) {
            for (EnumC0502d enumC0502d : values()) {
                if (enumC0502d.f1863a == i10) {
                    return enumC0502d;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i10);
        }

        /* JADX INFO: renamed from: c */
        public int m2362c() {
            return this.f1863a;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.view.PreviewView$e */
    public enum EnumC0503e {
        IDLE,
        STREAMING
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m2343a(PreviewView previewView, C10424a.c cVar) {
        if (!(cVar instanceof C10424a.c.C14233c)) {
            previewView.getClass();
            return true;
        }
        AbstractC10127i abstractC10127i = previewView.f1842h;
        if (abstractC10127i == null) {
            return true;
        }
        abstractC10127i.m39028A(((C10424a.c.C14233c) cVar).getIncrementalScaleFactor());
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2344b(PreviewView previewView, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        previewView.getClass();
        if (i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) {
            return;
        }
        previewView.m2349e();
        previewView.m2347c(true);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m2345f(AbstractC0506c abstractC0506c, C5948v2 c5948v2, EnumC0501c enumC0501c) {
        return (abstractC0506c instanceof C0507d) && !m2346g(c5948v2, enumC0501c);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2346g(C5948v2 c5948v2, EnumC0501c enumC0501c) {
        boolean zEquals = c5948v2.m26651m().mo6698k().mo26585u().equals("androidx.camera.camera2.legacy");
        boolean z10 = (C11160b.m42056b(SurfaceViewStretchedQuirk.class) == null && C11160b.m42056b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (zEquals || z10) {
            return true;
        }
        int iOrdinal = enumC0501c.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + enumC0501c);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService("display");
    }

    private C5883f1.j getScreenFlashInternal() {
        return this.f1837c.getScreenFlash();
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

    private void setScreenFlashUiInfo(C5883f1.j jVar) {
        AbstractC10127i abstractC10127i = this.f1842h;
        if (abstractC10127i == null) {
            C5931r1.m26561a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
        } else {
            abstractC10127i.m39035H(new C10776a(C10776a.a.PREVIEW_VIEW, jVar));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2347c(boolean z10) {
        C10110z.m39008b();
        C5960y2 viewPort = getViewPort();
        if (this.f1842h == null || viewPort == null || !isAttachedToWindow()) {
            return;
        }
        try {
            this.f1842h.m39051c(getSurfaceProvider(), viewPort);
        } catch (IllegalStateException e10) {
            if (!z10) {
                throw e10;
            }
            C5931r1.m26564d("PreviewView", e10.toString(), e10);
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: d */
    public C5960y2 m2348d(int i10) {
        C10110z.m39008b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new C5960y2.a(new Rational(getWidth(), getHeight()), i10).m26757c(getViewPortScaleType()).m26756b(getLayoutDirection()).m26755a();
    }

    /* JADX INFO: renamed from: e */
    public void m2349e() {
        C10110z.m39008b();
        if (this.f1836b != null) {
            m2352j();
            this.f1836b.m2401h();
        }
        this.f1843i.m39086f(new Size(getWidth(), getHeight()), getLayoutDirection());
        AbstractC10127i abstractC10127i = this.f1842h;
        if (abstractC10127i != null) {
            abstractC10127i.m39049V(getSensorToViewTransform());
        }
    }

    public Bitmap getBitmap() {
        C10110z.m39008b();
        AbstractC0506c abstractC0506c = this.f1836b;
        if (abstractC0506c == null) {
            return null;
        }
        return abstractC0506c.m2394a();
    }

    public AbstractC10127i getController() {
        C10110z.m39008b();
        return this.f1842h;
    }

    public Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        return display != null ? display : getDisplay();
    }

    public EnumC0501c getImplementationMode() {
        C10110z.m39008b();
        return this.f1835a;
    }

    public AbstractC5947v1 getMeteringPointFactory() {
        C10110z.m39008b();
        return this.f1843i;
    }

    public C11470b getOutputTransform() {
        Matrix matrixM2385j;
        C10110z.m39008b();
        try {
            matrixM2385j = this.f1838d.m2385j(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixM2385j = null;
        }
        Rect rectM2384i = this.f1838d.m2384i();
        if (matrixM2385j == null || rectM2384i == null) {
            C5931r1.m26561a("PreviewView", "Transform info is not ready");
            return null;
        }
        matrixM2385j.preConcat(C10085a0.m38874b(rectM2384i));
        if (this.f1836b instanceof C0508e) {
            matrixM2385j.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            C5931r1.m26572l("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new C11470b(matrixM2385j, new Size(rectM2384i.width(), rectM2384i.height()));
    }

    public AbstractC0940a0<EnumC0503e> getPreviewStreamState() {
        return this.f1840f;
    }

    public EnumC0502d getScaleType() {
        C10110z.m39008b();
        return this.f1838d.m2382g();
    }

    public C5883f1.j getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        C10110z.m39008b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return this.f1838d.m2383h(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public C5864a2.c getSurfaceProvider() {
        C10110z.m39008b();
        return this.f1849o;
    }

    public C5960y2 getViewPort() {
        C10110z.m39008b();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        return m2348d(defaultDisplay.getRotation());
    }

    /* JADX INFO: renamed from: h */
    public void m2350h() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.f1847m, new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: renamed from: i */
    public void m2351i() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f1847m);
    }

    /* JADX INFO: renamed from: j */
    public void m2352j() {
        Display defaultDisplay;
        InterfaceC8799o0 interfaceC8799o0;
        if (!this.f1839e || (defaultDisplay = getDefaultDisplay()) == null || (interfaceC8799o0 = this.f1845k) == null) {
            return;
        }
        this.f1838d.m2390o(interfaceC8799o0.mo6751w(defaultDisplay.getRotation()), defaultDisplay.getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            m2350h();
        }
        addOnLayoutChangeListener(this.f1848n);
        AbstractC0506c abstractC0506c = this.f1836b;
        if (abstractC0506c != null) {
            abstractC0506c.mo2397d();
        }
        m2347c(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f1848n);
        AbstractC0506c abstractC0506c = this.f1836b;
        if (abstractC0506c != null) {
            abstractC0506c.mo2398e();
        }
        AbstractC10127i abstractC10127i = this.f1842h;
        if (abstractC10127i != null) {
            abstractC10127i.m39052d();
        }
        if (isInEditMode()) {
            return;
        }
        m2351i();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1842h == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z10 = motionEvent.getPointerCount() == 1;
        boolean z11 = motionEvent.getAction() == 1;
        boolean z12 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout());
        if (!z10 || !z11 || !z12) {
            return this.f1844j.m40102f(motionEvent) || super.onTouchEvent(motionEvent);
        }
        this.f1846l = motionEvent;
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f1842h != null) {
            MotionEvent motionEvent = this.f1846l;
            float x10 = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.f1846l;
            this.f1842h.m39029B(this.f1843i, x10, motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f);
        }
        this.f1846l = null;
        return super.performClick();
    }

    public void setController(AbstractC10127i abstractC10127i) {
        C10110z.m39008b();
        AbstractC10127i abstractC10127i2 = this.f1842h;
        if (abstractC10127i2 != null && abstractC10127i2 != abstractC10127i) {
            abstractC10127i2.m39052d();
            setScreenFlashUiInfo(null);
        }
        this.f1842h = abstractC10127i;
        m2347c(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(EnumC0501c enumC0501c) {
        C10110z.m39008b();
        this.f1835a = enumC0501c;
        EnumC0501c enumC0501c2 = EnumC0501c.PERFORMANCE;
    }

    public void setScaleType(EnumC0502d enumC0502d) {
        C10110z.m39008b();
        this.f1838d.m2391q(enumC0502d);
        m2349e();
        m2347c(false);
    }

    public void setScreenFlashOverlayColor(int i10) {
        this.f1837c.setBackgroundColor(i10);
    }

    public void setScreenFlashWindow(Window window) {
        C10110z.m39008b();
        this.f1837c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public PreviewView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        EnumC0501c enumC0501c = f1834p;
        this.f1835a = enumC0501c;
        C0505b c0505b = new C0505b();
        this.f1838d = c0505b;
        this.f1839e = true;
        this.f1840f = new C0949d0<>(EnumC0503e.IDLE);
        this.f1841g = new AtomicReference<>();
        this.f1843i = new C10150x(c0505b);
        this.f1847m = new C0500b();
        this.f1848n = new View.OnLayoutChangeListener() { // from class: p1.r
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                PreviewView.m2344b(this.f36502a, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        this.f1849o = new C0499a();
        C10110z.m39008b();
        Resources.Theme theme = context.getTheme();
        int[] iArr = C10112a0.f36397a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        C0625o0.m3036k0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, i11);
        try {
            setScaleType(EnumC0502d.m2361b(typedArrayObtainStyledAttributes.getInteger(C10112a0.f36399c, c0505b.m2382g().m2362c())));
            setImplementationMode(EnumC0501c.m2358b(typedArrayObtainStyledAttributes.getInteger(C10112a0.f36398b, enumC0501c.m2359c())));
            typedArrayObtainStyledAttributes.recycle();
            this.f1844j = new C10424a(context, new C10424a.b() { // from class: p1.s
                @Override // p367q1.C10424a.b
                /* JADX INFO: renamed from: a */
                public final boolean mo39084a(C10424a.c cVar) {
                    return PreviewView.m2343a(this.f36503a, cVar);
                }
            });
            if (getBackground() == null) {
                setBackgroundColor(C7975b.m33005c(getContext(), R.color.black));
            }
            C10122f0 c10122f0 = new C10122f0(context);
            this.f1837c = c10122f0;
            c10122f0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
