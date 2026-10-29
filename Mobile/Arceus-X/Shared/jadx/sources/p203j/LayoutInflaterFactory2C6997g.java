package p203j;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.C0413c;
import androidx.appcompat.view.menu.C0415e;
import androidx.appcompat.view.menu.InterfaceC0419i;
import androidx.appcompat.view.menu.InterfaceC0420j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.view.C0584a1;
import androidx.core.view.C0617l;
import androidx.core.view.C0620m;
import androidx.core.view.C0625o0;
import androidx.core.view.C0645y0;
import androidx.core.view.InterfaceC0644y;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0980s;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import p066d3.C4430h;
import p181i.C6589a;
import p181i.C6591c;
import p181i.C6594f;
import p181i.C6595g;
import p181i.C6597i;
import p181i.C6598j;
import p232k.C7399a;
import p235k2.C7410b;
import p235k2.C7417i;
import p261l2.C7975b;
import p298n2.C8870h;
import p316o.AbstractC9609b;
import p316o.C9611d;
import p316o.C9612e;
import p316o.C9613f;
import p316o.C9614g;
import p316o.WindowCallbackC9616i;
import p365q.C10357a1;
import p365q.C10372f1;
import p365q.C10375g1;
import p365q.C10383k;
import p365q.InterfaceC10368e0;
import p456u2.C11781j;
import p504w1.C12286j;

/* JADX INFO: renamed from: j.g */
/* JADX INFO: loaded from: classes.dex */
public class LayoutInflaterFactory2C6997g extends AbstractC6995e implements C0415e.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: j0 */
    public static final C12286j<String, Integer> f27289j0 = new C12286j<>();

    /* JADX INFO: renamed from: k0 */
    public static final boolean f27290k0 = false;

    /* JADX INFO: renamed from: l0 */
    public static final int[] f27291l0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: m0 */
    public static final boolean f27292m0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: A */
    public boolean f27293A;

    /* JADX INFO: renamed from: B */
    public ViewGroup f27294B;

    /* JADX INFO: renamed from: C */
    public TextView f27295C;

    /* JADX INFO: renamed from: D */
    public View f27296D;

    /* JADX INFO: renamed from: E */
    public boolean f27297E;

    /* JADX INFO: renamed from: F */
    public boolean f27298F;

    /* JADX INFO: renamed from: G */
    public boolean f27299G;

    /* JADX INFO: renamed from: H */
    public boolean f27300H;

    /* JADX INFO: renamed from: I */
    public boolean f27301I;

    /* JADX INFO: renamed from: J */
    public boolean f27302J;

    /* JADX INFO: renamed from: K */
    public boolean f27303K;

    /* JADX INFO: renamed from: L */
    public boolean f27304L;

    /* JADX INFO: renamed from: M */
    public q[] f27305M;

    /* JADX INFO: renamed from: N */
    public q f27306N;

    /* JADX INFO: renamed from: O */
    public boolean f27307O;

    /* JADX INFO: renamed from: P */
    public boolean f27308P;

    /* JADX INFO: renamed from: Q */
    public boolean f27309Q;

    /* JADX INFO: renamed from: R */
    public boolean f27310R;

    /* JADX INFO: renamed from: S */
    public Configuration f27311S;

    /* JADX INFO: renamed from: T */
    public int f27312T;

    /* JADX INFO: renamed from: U */
    public int f27313U;

    /* JADX INFO: renamed from: V */
    public int f27314V;

    /* JADX INFO: renamed from: W */
    public boolean f27315W;

    /* JADX INFO: renamed from: X */
    public n f27316X;

    /* JADX INFO: renamed from: Y */
    public n f27317Y;

    /* JADX INFO: renamed from: Z */
    public boolean f27318Z;

    /* JADX INFO: renamed from: a0 */
    public int f27319a0;

    /* JADX INFO: renamed from: b0 */
    public final Runnable f27320b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f27321c0;

    /* JADX INFO: renamed from: d0 */
    public Rect f27322d0;

    /* JADX INFO: renamed from: e0 */
    public Rect f27323e0;

    /* JADX INFO: renamed from: f0 */
    public C7004n f27324f0;

    /* JADX INFO: renamed from: g0 */
    public C7006p f27325g0;

    /* JADX INFO: renamed from: h0 */
    public OnBackInvokedDispatcher f27326h0;

    /* JADX INFO: renamed from: i0 */
    public OnBackInvokedCallback f27327i0;

    /* JADX INFO: renamed from: j */
    public final Object f27328j;

    /* JADX INFO: renamed from: k */
    public final Context f27329k;

    /* JADX INFO: renamed from: l */
    public Window f27330l;

    /* JADX INFO: renamed from: m */
    public l f27331m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC6993c f27332n;

    /* JADX INFO: renamed from: o */
    public AbstractC6991a f27333o;

    /* JADX INFO: renamed from: p */
    public MenuInflater f27334p;

    /* JADX INFO: renamed from: q */
    public CharSequence f27335q;

    /* JADX INFO: renamed from: r */
    public InterfaceC10368e0 f27336r;

    /* JADX INFO: renamed from: s */
    public f f27337s;

    /* JADX INFO: renamed from: t */
    public r f27338t;

    /* JADX INFO: renamed from: u */
    public AbstractC9609b f27339u;

    /* JADX INFO: renamed from: v */
    public ActionBarContextView f27340v;

    /* JADX INFO: renamed from: w */
    public PopupWindow f27341w;

    /* JADX INFO: renamed from: x */
    public Runnable f27342x;

    /* JADX INFO: renamed from: y */
    public C0645y0 f27343y;

    /* JADX INFO: renamed from: z */
    public boolean f27344z;

    /* JADX INFO: renamed from: j.g$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C6997g layoutInflaterFactory2C6997g = LayoutInflaterFactory2C6997g.this;
            if ((layoutInflaterFactory2C6997g.f27319a0 & 1) != 0) {
                layoutInflaterFactory2C6997g.m29552f0(0);
            }
            LayoutInflaterFactory2C6997g layoutInflaterFactory2C6997g2 = LayoutInflaterFactory2C6997g.this;
            if ((layoutInflaterFactory2C6997g2.f27319a0 & 4096) != 0) {
                layoutInflaterFactory2C6997g2.m29552f0(108);
            }
            LayoutInflaterFactory2C6997g layoutInflaterFactory2C6997g3 = LayoutInflaterFactory2C6997g.this;
            layoutInflaterFactory2C6997g3.f27318Z = false;
            layoutInflaterFactory2C6997g3.f27319a0 = 0;
        }
    }

    /* JADX INFO: renamed from: j.g$b */
    public class b implements InterfaceC0644y {
        public b() {
        }

        @Override // androidx.core.view.InterfaceC0644y
        /* JADX INFO: renamed from: K */
        public WindowInsetsCompat mo460K(View view, WindowInsetsCompat windowInsetsCompat) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int iM29548c1 = LayoutInflaterFactory2C6997g.this.m29548c1(windowInsetsCompat, null);
            if (systemWindowInsetTop != iM29548c1) {
                windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), iM29548c1, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
            }
            return C0625o0.m3013Y(view, windowInsetsCompat);
        }
    }

    /* JADX INFO: renamed from: j.g$c */
    public class c implements ContentFrameLayout.InterfaceC0451a {
        public c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0451a
        /* JADX INFO: renamed from: a */
        public void mo1813a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0451a
        public void onDetachedFromWindow() {
            LayoutInflaterFactory2C6997g.this.m29549d0();
        }
    }

    /* JADX INFO: renamed from: j.g$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: j.g$d$a */
        public class a extends C0584a1 {
            public a() {
            }

            @Override // androidx.core.view.InterfaceC0647z0
            /* JADX INFO: renamed from: b */
            public void mo2028b(View view) {
                LayoutInflaterFactory2C6997g.this.f27340v.setAlpha(1.0f);
                LayoutInflaterFactory2C6997g.this.f27343y.m3230g(null);
                LayoutInflaterFactory2C6997g.this.f27343y = null;
            }

            @Override // androidx.core.view.C0584a1, androidx.core.view.InterfaceC0647z0
            /* JADX INFO: renamed from: c */
            public void mo2029c(View view) {
                LayoutInflaterFactory2C6997g.this.f27340v.setVisibility(0);
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C6997g layoutInflaterFactory2C6997g = LayoutInflaterFactory2C6997g.this;
            layoutInflaterFactory2C6997g.f27341w.showAtLocation(layoutInflaterFactory2C6997g.f27340v, 55, 0, 0);
            LayoutInflaterFactory2C6997g.this.m29553g0();
            if (!LayoutInflaterFactory2C6997g.this.m29526R0()) {
                LayoutInflaterFactory2C6997g.this.f27340v.setAlpha(1.0f);
                LayoutInflaterFactory2C6997g.this.f27340v.setVisibility(0);
            } else {
                LayoutInflaterFactory2C6997g.this.f27340v.setAlpha(0.0f);
                LayoutInflaterFactory2C6997g layoutInflaterFactory2C6997g2 = LayoutInflaterFactory2C6997g.this;
                layoutInflaterFactory2C6997g2.f27343y = C0625o0.m3023e(layoutInflaterFactory2C6997g2.f27340v).m3225b(1.0f);
                LayoutInflaterFactory2C6997g.this.f27343y.m3230g(new a());
            }
        }
    }

    /* JADX INFO: renamed from: j.g$e */
    public class e extends C0584a1 {
        public e() {
        }

        @Override // androidx.core.view.InterfaceC0647z0
        /* JADX INFO: renamed from: b */
        public void mo2028b(View view) {
            LayoutInflaterFactory2C6997g.this.f27340v.setAlpha(1.0f);
            LayoutInflaterFactory2C6997g.this.f27343y.m3230g(null);
            LayoutInflaterFactory2C6997g.this.f27343y = null;
        }

        @Override // androidx.core.view.C0584a1, androidx.core.view.InterfaceC0647z0
        /* JADX INFO: renamed from: c */
        public void mo2029c(View view) {
            LayoutInflaterFactory2C6997g.this.f27340v.setVisibility(0);
            if (LayoutInflaterFactory2C6997g.this.f27340v.getParent() instanceof View) {
                C0625o0.m3034j0((View) LayoutInflaterFactory2C6997g.this.f27340v.getParent());
            }
        }
    }

    /* JADX INFO: renamed from: j.g$f */
    public final class f implements InterfaceC0419i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0419i.a
        /* JADX INFO: renamed from: b */
        public void mo1659b(@NonNull C0415e c0415e, boolean z10) {
            LayoutInflaterFactory2C6997g.this.m29535W(c0415e);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0419i.a
        /* JADX INFO: renamed from: c */
        public boolean mo1660c(@NonNull C0415e c0415e) {
            Window.Callback callbackM29564s0 = LayoutInflaterFactory2C6997g.this.m29564s0();
            if (callbackM29564s0 == null) {
                return true;
            }
            callbackM29564s0.onMenuOpened(108, c0415e);
            return true;
        }
    }

    /* JADX INFO: renamed from: j.g$g */
    public class g implements AbstractC9609b.a {

        /* JADX INFO: renamed from: a */
        public AbstractC9609b.a f27352a;

        /* JADX INFO: renamed from: j.g$g$a */
        public class a extends C0584a1 {
            public a() {
            }

            @Override // androidx.core.view.InterfaceC0647z0
            /* JADX INFO: renamed from: b */
            public void mo2028b(View view) {
                LayoutInflaterFactory2C6997g.this.f27340v.setVisibility(8);
                LayoutInflaterFactory2C6997g layoutInflaterFactory2C6997g = LayoutInflaterFactory2C6997g.this;
                PopupWindow popupWindow = layoutInflaterFactory2C6997g.f27341w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C6997g.f27340v.getParent() instanceof View) {
                    C0625o0.m3034j0((View) LayoutInflaterFactory2C6997g.this.f27340v.getParent());
                }
                LayoutInflaterFactory2C6997g.this.f27340v.m1714k();
                LayoutInflaterFactory2C6997g.this.f27343y.m3230g(null);
                LayoutInflaterFactory2C6997g layoutInflaterFactory2C6997g2 = LayoutInflaterFactory2C6997g.this;
                layoutInflaterFactory2C6997g2.f27343y = null;
                C0625o0.m3034j0(layoutInflaterFactory2C6997g2.f27294B);
            }
        }

        public g(AbstractC9609b.a aVar) {
            this.f27352a = aVar;
        }

        @Override // p316o.AbstractC9609b.a
        /* JADX INFO: renamed from: a */
        public boolean mo29572a(AbstractC9609b abstractC9609b, Menu menu) {
            return this.f27352a.mo29572a(abstractC9609b, menu);
        }

        @Override // p316o.AbstractC9609b.a
        /* JADX INFO: renamed from: b */
        public void mo29573b(AbstractC9609b abstractC9609b) {
            this.f27352a.mo29573b(abstractC9609b);
            LayoutInflaterFactory2C6997g layoutInflaterFactory2C6997g = LayoutInflaterFactory2C6997g.this;
            if (layoutInflaterFactory2C6997g.f27341w != null) {
                layoutInflaterFactory2C6997g.f27330l.getDecorView().removeCallbacks(LayoutInflaterFactory2C6997g.this.f27342x);
            }
            LayoutInflaterFactory2C6997g layoutInflaterFactory2C6997g2 = LayoutInflaterFactory2C6997g.this;
            if (layoutInflaterFactory2C6997g2.f27340v != null) {
                layoutInflaterFactory2C6997g2.m29553g0();
                LayoutInflaterFactory2C6997g layoutInflaterFactory2C6997g3 = LayoutInflaterFactory2C6997g.this;
                layoutInflaterFactory2C6997g3.f27343y = C0625o0.m3023e(layoutInflaterFactory2C6997g3.f27340v).m3225b(0.0f);
                LayoutInflaterFactory2C6997g.this.f27343y.m3230g(new a());
            }
            LayoutInflaterFactory2C6997g layoutInflaterFactory2C6997g4 = LayoutInflaterFactory2C6997g.this;
            InterfaceC6993c interfaceC6993c = layoutInflaterFactory2C6997g4.f27332n;
            if (interfaceC6993c != null) {
                interfaceC6993c.mo29449M(layoutInflaterFactory2C6997g4.f27339u);
            }
            LayoutInflaterFactory2C6997g layoutInflaterFactory2C6997g5 = LayoutInflaterFactory2C6997g.this;
            layoutInflaterFactory2C6997g5.f27339u = null;
            C0625o0.m3034j0(layoutInflaterFactory2C6997g5.f27294B);
            LayoutInflaterFactory2C6997g.this.m29544a1();
        }

        @Override // p316o.AbstractC9609b.a
        /* JADX INFO: renamed from: c */
        public boolean mo29574c(AbstractC9609b abstractC9609b, MenuItem menuItem) {
            return this.f27352a.mo29574c(abstractC9609b, menuItem);
        }

        @Override // p316o.AbstractC9609b.a
        /* JADX INFO: renamed from: d */
        public boolean mo29575d(AbstractC9609b abstractC9609b, Menu menu) {
            C0625o0.m3034j0(LayoutInflaterFactory2C6997g.this.f27294B);
            return this.f27352a.mo29575d(abstractC9609b, menu);
        }
    }

    /* JADX INFO: renamed from: j.g$h */
    public static class h {
        /* JADX INFO: renamed from: a */
        public static boolean m29576a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        /* JADX INFO: renamed from: b */
        public static String m29577b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: renamed from: j.g$i */
    public static class i {
        /* JADX INFO: renamed from: a */
        public static void m29578a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        /* JADX INFO: renamed from: b */
        public static C11781j m29579b(Configuration configuration) {
            return C11781j.m44069b(configuration.getLocales().toLanguageTags());
        }

        /* JADX INFO: renamed from: c */
        public static void m29580c(C11781j c11781j) {
            LocaleList.setDefault(LocaleList.forLanguageTags(c11781j.m44075g()));
        }

        /* JADX INFO: renamed from: d */
        public static void m29581d(Configuration configuration, C11781j c11781j) {
            configuration.setLocales(LocaleList.forLanguageTags(c11781j.m44075g()));
        }
    }

    /* JADX INFO: renamed from: j.g$j */
    public static class j {
        /* JADX INFO: renamed from: a */
        public static void m29582a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    /* JADX INFO: renamed from: j.g$k */
    public static class k {
        /* JADX INFO: renamed from: a */
        public static OnBackInvokedDispatcher m29583a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* JADX INFO: renamed from: b */
        public static OnBackInvokedCallback m29584b(Object obj, final LayoutInflaterFactory2C6997g layoutInflaterFactory2C6997g) {
            Objects.requireNonNull(layoutInflaterFactory2C6997g);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: j.j
                public final void onBackInvoked() {
                    layoutInflaterFactory2C6997g.m29505A0();
                }
            };
            C6999i.m29601a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        /* JADX INFO: renamed from: c */
        public static void m29585c(Object obj, Object obj2) {
            C6999i.m29601a(obj).unregisterOnBackInvokedCallback(C6998h.m29600a(obj2));
        }
    }

    /* JADX INFO: renamed from: j.g$l */
    public class l extends WindowCallbackC9616i {

        /* JADX INFO: renamed from: b */
        public boolean f27355b;

        /* JADX INFO: renamed from: c */
        public boolean f27356c;

        /* JADX INFO: renamed from: d */
        public boolean f27357d;

        public l(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: renamed from: b */
        public boolean m29586b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f27356c = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f27356c = false;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m29587c(Window.Callback callback) {
            try {
                this.f27355b = true;
                callback.onContentChanged();
            } finally {
                this.f27355b = false;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m29588d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f27357d = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f27357d = false;
            }
        }

        @Override // p316o.WindowCallbackC9616i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f27356c) {
                return m37950a().dispatchKeyEvent(keyEvent);
            }
            return LayoutInflaterFactory2C6997g.this.m29551e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p316o.WindowCallbackC9616i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflaterFactory2C6997g.this.m29508D0(keyEvent.getKeyCode(), keyEvent);
        }

        /* JADX INFO: renamed from: e */
        public final ActionMode m29589e(ActionMode.Callback callback) {
            C9613f.a aVar = new C9613f.a(LayoutInflaterFactory2C6997g.this.f27329k, callback);
            AbstractC9609b abstractC9609bM29532U0 = LayoutInflaterFactory2C6997g.this.m29532U0(aVar);
            if (abstractC9609bM29532U0 != null) {
                return aVar.m37927e(abstractC9609bM29532U0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f27355b) {
                m37950a().onContentChanged();
            }
        }

        @Override // p316o.WindowCallbackC9616i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof C0415e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // p316o.WindowCallbackC9616i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            return super.onCreatePanelView(i10);
        }

        @Override // p316o.WindowCallbackC9616i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            LayoutInflaterFactory2C6997g.this.m29511G0(i10);
            return true;
        }

        @Override // p316o.WindowCallbackC9616i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f27357d) {
                m37950a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                LayoutInflaterFactory2C6997g.this.m29512H0(i10);
            }
        }

        @Override // p316o.WindowCallbackC9616i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            C0415e c0415e = menu instanceof C0415e ? (C0415e) menu : null;
            if (i10 == 0 && c0415e == null) {
                return false;
            }
            if (c0415e != null) {
                c0415e.m1629b0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            if (c0415e != null) {
                c0415e.m1629b0(false);
            }
            return zOnPreparePanel;
        }

        @Override // p316o.WindowCallbackC9616i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            C0415e c0415e;
            q qVarM29562q0 = LayoutInflaterFactory2C6997g.this.m29562q0(0, true);
            if (qVarM29562q0 == null || (c0415e = qVarM29562q0.f27376j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, c0415e, i10);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // p316o.WindowCallbackC9616i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (LayoutInflaterFactory2C6997g.this.m29570y0() && i10 == 0) ? m29589e(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    /* JADX INFO: renamed from: j.g$m */
    public class m extends n {

        /* JADX INFO: renamed from: c */
        public final PowerManager f27359c;

        public m(Context context) {
            super();
            this.f27359c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // p203j.LayoutInflaterFactory2C6997g.n
        /* JADX INFO: renamed from: b */
        public IntentFilter mo29590b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // p203j.LayoutInflaterFactory2C6997g.n
        /* JADX INFO: renamed from: c */
        public int mo29591c() {
            return h.m29576a(this.f27359c) ? 2 : 1;
        }

        @Override // p203j.LayoutInflaterFactory2C6997g.n
        /* JADX INFO: renamed from: d */
        public void mo29592d() {
            LayoutInflaterFactory2C6997g.this.m29523Q();
        }
    }

    /* JADX INFO: renamed from: j.g$n */
    public abstract class n {

        /* JADX INFO: renamed from: a */
        public BroadcastReceiver f27361a;

        /* JADX INFO: renamed from: j.g$n$a */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                n.this.mo29592d();
            }
        }

        public n() {
        }

        /* JADX INFO: renamed from: a */
        public void m29593a() {
            BroadcastReceiver broadcastReceiver = this.f27361a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C6997g.this.f27329k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f27361a = null;
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract IntentFilter mo29590b();

        /* JADX INFO: renamed from: c */
        public abstract int mo29591c();

        /* JADX INFO: renamed from: d */
        public abstract void mo29592d();

        /* JADX INFO: renamed from: e */
        public void m29594e() {
            m29593a();
            IntentFilter intentFilterMo29590b = mo29590b();
            if (intentFilterMo29590b == null || intentFilterMo29590b.countActions() == 0) {
                return;
            }
            if (this.f27361a == null) {
                this.f27361a = new a();
            }
            LayoutInflaterFactory2C6997g.this.f27329k.registerReceiver(this.f27361a, intentFilterMo29590b);
        }
    }

    /* JADX INFO: renamed from: j.g$o */
    public class o extends n {

        /* JADX INFO: renamed from: c */
        public final C7009s f27364c;

        public o(C7009s c7009s) {
            super();
            this.f27364c = c7009s;
        }

        @Override // p203j.LayoutInflaterFactory2C6997g.n
        /* JADX INFO: renamed from: b */
        public IntentFilter mo29590b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // p203j.LayoutInflaterFactory2C6997g.n
        /* JADX INFO: renamed from: c */
        public int mo29591c() {
            return this.f27364c.m29637d() ? 2 : 1;
        }

        @Override // p203j.LayoutInflaterFactory2C6997g.n
        /* JADX INFO: renamed from: d */
        public void mo29592d() {
            LayoutInflaterFactory2C6997g.this.m29523Q();
        }
    }

    /* JADX INFO: renamed from: j.g$p */
    public class p extends ContentFrameLayout {
        public p(Context context) {
            super(context);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m29595b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C6997g.this.m29551e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m29595b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflaterFactory2C6997g.this.m29539Y(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(C7399a.m30679b(getContext(), i10));
        }
    }

    /* JADX INFO: renamed from: j.g$q */
    public static final class q {

        /* JADX INFO: renamed from: a */
        public int f27367a;

        /* JADX INFO: renamed from: b */
        public int f27368b;

        /* JADX INFO: renamed from: c */
        public int f27369c;

        /* JADX INFO: renamed from: d */
        public int f27370d;

        /* JADX INFO: renamed from: e */
        public int f27371e;

        /* JADX INFO: renamed from: f */
        public int f27372f;

        /* JADX INFO: renamed from: g */
        public ViewGroup f27373g;

        /* JADX INFO: renamed from: h */
        public View f27374h;

        /* JADX INFO: renamed from: i */
        public View f27375i;

        /* JADX INFO: renamed from: j */
        public C0415e f27376j;

        /* JADX INFO: renamed from: k */
        public C0413c f27377k;

        /* JADX INFO: renamed from: l */
        public Context f27378l;

        /* JADX INFO: renamed from: m */
        public boolean f27379m;

        /* JADX INFO: renamed from: n */
        public boolean f27380n;

        /* JADX INFO: renamed from: o */
        public boolean f27381o;

        /* JADX INFO: renamed from: p */
        public boolean f27382p;

        /* JADX INFO: renamed from: q */
        public boolean f27383q = false;

        /* JADX INFO: renamed from: r */
        public boolean f27384r;

        /* JADX INFO: renamed from: s */
        public Bundle f27385s;

        public q(int i10) {
            this.f27367a = i10;
        }

        /* JADX INFO: renamed from: a */
        public InterfaceC0420j m29596a(InterfaceC0419i.a aVar) {
            if (this.f27376j == null) {
                return null;
            }
            if (this.f27377k == null) {
                C0413c c0413c = new C0413c(this.f27378l, C6595g.f25171l);
                this.f27377k = c0413c;
                c0413c.mo1555d(aVar);
                this.f27376j.m1628b(this.f27377k);
            }
            return this.f27377k.m1592j(this.f27373g);
        }

        /* JADX INFO: renamed from: b */
        public boolean m29597b() {
            if (this.f27374h == null) {
                return false;
            }
            return this.f27375i != null || this.f27377k.m1591a().getCount() > 0;
        }

        /* JADX INFO: renamed from: c */
        public void m29598c(C0415e c0415e) {
            C0413c c0413c;
            C0415e c0415e2 = this.f27376j;
            if (c0415e == c0415e2) {
                return;
            }
            if (c0415e2 != null) {
                c0415e2.m1615P(this.f27377k);
            }
            this.f27376j = c0415e;
            if (c0415e == null || (c0413c = this.f27377k) == null) {
                return;
            }
            c0415e.m1628b(c0413c);
        }

        /* JADX INFO: renamed from: d */
        public void m29599d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(C6589a.f25022a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                themeNewTheme.applyStyle(i10, true);
            }
            themeNewTheme.resolveAttribute(C6589a.f25012H, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                themeNewTheme.applyStyle(i11, true);
            } else {
                themeNewTheme.applyStyle(C6597i.f25199a, true);
            }
            C9611d c9611d = new C9611d(context, 0);
            c9611d.getTheme().setTo(themeNewTheme);
            this.f27378l = c9611d;
            TypedArray typedArrayObtainStyledAttributes = c9611d.obtainStyledAttributes(C6598j.f25203A0);
            this.f27368b = typedArrayObtainStyledAttributes.getResourceId(C6598j.f25218D0, 0);
            this.f27372f = typedArrayObtainStyledAttributes.getResourceId(C6598j.f25213C0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: j.g$r */
    public final class r implements InterfaceC0419i.a {
        public r() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0419i.a
        /* JADX INFO: renamed from: b */
        public void mo1659b(@NonNull C0415e c0415e, boolean z10) {
            C0415e c0415eMo1603D = c0415e.mo1603D();
            boolean z11 = c0415eMo1603D != c0415e;
            LayoutInflaterFactory2C6997g layoutInflaterFactory2C6997g = LayoutInflaterFactory2C6997g.this;
            if (z11) {
                c0415e = c0415eMo1603D;
            }
            q qVarM29556j0 = layoutInflaterFactory2C6997g.m29556j0(c0415e);
            if (qVarM29556j0 != null) {
                if (!z11) {
                    LayoutInflaterFactory2C6997g.this.m29541Z(qVarM29556j0, z10);
                } else {
                    LayoutInflaterFactory2C6997g.this.m29533V(qVarM29556j0.f27367a, qVarM29556j0, c0415eMo1603D);
                    LayoutInflaterFactory2C6997g.this.m29541Z(qVarM29556j0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0419i.a
        /* JADX INFO: renamed from: c */
        public boolean mo1660c(@NonNull C0415e c0415e) {
            Window.Callback callbackM29564s0;
            if (c0415e != c0415e.mo1603D()) {
                return true;
            }
            LayoutInflaterFactory2C6997g layoutInflaterFactory2C6997g = LayoutInflaterFactory2C6997g.this;
            if (!layoutInflaterFactory2C6997g.f27299G || (callbackM29564s0 = layoutInflaterFactory2C6997g.m29564s0()) == null || LayoutInflaterFactory2C6997g.this.f27310R) {
                return true;
            }
            callbackM29564s0.onMenuOpened(108, c0415e);
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LayoutInflaterFactory2C6997g(Activity activity, InterfaceC6993c interfaceC6993c) {
        this(activity, null, interfaceC6993c, activity);
    }

    @NonNull
    /* JADX INFO: renamed from: k0 */
    public static Configuration m29504k0(@NonNull Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            i.m29578a(configuration, configuration2, configuration3);
            int i14 = configuration.touchscreen;
            int i15 = configuration2.touchscreen;
            if (i14 != i15) {
                configuration3.touchscreen = i15;
            }
            int i16 = configuration.keyboard;
            int i17 = configuration2.keyboard;
            if (i16 != i17) {
                configuration3.keyboard = i17;
            }
            int i18 = configuration.keyboardHidden;
            int i19 = configuration2.keyboardHidden;
            if (i18 != i19) {
                configuration3.keyboardHidden = i19;
            }
            int i20 = configuration.navigation;
            int i21 = configuration2.navigation;
            if (i20 != i21) {
                configuration3.navigation = i21;
            }
            int i22 = configuration.navigationHidden;
            int i23 = configuration2.navigationHidden;
            if (i22 != i23) {
                configuration3.navigationHidden = i23;
            }
            int i24 = configuration.orientation;
            int i25 = configuration2.orientation;
            if (i24 != i25) {
                configuration3.orientation = i25;
            }
            int i26 = configuration.screenLayout & 15;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 15)) {
                configuration3.screenLayout |= i27 & 15;
            }
            int i28 = configuration.screenLayout & 192;
            int i29 = configuration2.screenLayout;
            if (i28 != (i29 & 192)) {
                configuration3.screenLayout |= i29 & 192;
            }
            int i30 = configuration.screenLayout & 48;
            int i31 = configuration2.screenLayout;
            if (i30 != (i31 & 48)) {
                configuration3.screenLayout |= i31 & 48;
            }
            int i32 = configuration.screenLayout & 768;
            int i33 = configuration2.screenLayout;
            if (i32 != (i33 & 768)) {
                configuration3.screenLayout |= i33 & 768;
            }
            j.m29582a(configuration, configuration2, configuration3);
            int i34 = configuration.uiMode & 15;
            int i35 = configuration2.uiMode;
            if (i34 != (i35 & 15)) {
                configuration3.uiMode |= i35 & 15;
            }
            int i36 = configuration.uiMode & 48;
            int i37 = configuration2.uiMode;
            if (i36 != (i37 & 48)) {
                configuration3.uiMode |= i37 & 48;
            }
            int i38 = configuration.screenWidthDp;
            int i39 = configuration2.screenWidthDp;
            if (i38 != i39) {
                configuration3.screenWidthDp = i39;
            }
            int i40 = configuration.screenHeightDp;
            int i41 = configuration2.screenHeightDp;
            if (i40 != i41) {
                configuration3.screenHeightDp = i41;
            }
            int i42 = configuration.smallestScreenWidthDp;
            int i43 = configuration2.smallestScreenWidthDp;
            if (i42 != i43) {
                configuration3.smallestScreenWidthDp = i43;
            }
            int i44 = configuration.densityDpi;
            int i45 = configuration2.densityDpi;
            if (i44 != i45) {
                configuration3.densityDpi = i45;
            }
        }
        return configuration3;
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: A */
    public void mo29474A(Bundle bundle) {
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m29505A0() {
        boolean z10 = this.f27307O;
        this.f27307O = false;
        q qVarM29562q0 = m29562q0(0, false);
        if (qVarM29562q0 != null && qVarM29562q0.f27381o) {
            if (!z10) {
                m29541Z(qVarM29562q0, true);
            }
            return true;
        }
        AbstractC9609b abstractC9609b = this.f27339u;
        if (abstractC9609b != null) {
            abstractC9609b.mo29658c();
            return true;
        }
        AbstractC6991a abstractC6991aMo29491r = mo29491r();
        return abstractC6991aMo29491r != null && abstractC6991aMo29491r.mo29425g();
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: B */
    public void mo29475B() {
        m29521P(true, false);
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m29506B0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.f27307O = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            m29507C0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: C */
    public void mo29476C() {
        AbstractC6991a abstractC6991aMo29491r = mo29491r();
        if (abstractC6991aMo29491r != null) {
            abstractC6991aMo29491r.mo29437s(false);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m29507C0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        q qVarM29562q0 = m29562q0(i10, true);
        if (qVarM29562q0.f27381o) {
            return false;
        }
        return m29517M0(qVarM29562q0, keyEvent);
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m29508D0(int i10, KeyEvent keyEvent) {
        AbstractC6991a abstractC6991aMo29491r = mo29491r();
        if (abstractC6991aMo29491r != null && abstractC6991aMo29491r.mo29433o(i10, keyEvent)) {
            return true;
        }
        q qVar = this.f27306N;
        if (qVar != null && m29516L0(qVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            q qVar2 = this.f27306N;
            if (qVar2 != null) {
                qVar2.f27380n = true;
            }
            return true;
        }
        if (this.f27306N == null) {
            q qVarM29562q0 = m29562q0(0, true);
            m29517M0(qVarM29562q0, keyEvent);
            boolean zM29516L0 = m29516L0(qVarM29562q0, keyEvent.getKeyCode(), keyEvent, 1);
            qVarM29562q0.f27379m = false;
            if (zM29516L0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m29509E0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                m29510F0(0, keyEvent);
                return true;
            }
        } else if (m29505A0()) {
            return true;
        }
        return false;
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: F */
    public boolean mo29477F(int i10) {
        int iM29520O0 = m29520O0(i10);
        if (this.f27303K && iM29520O0 == 108) {
            return false;
        }
        if (this.f27299G && iM29520O0 == 1) {
            this.f27299G = false;
        }
        if (iM29520O0 == 1) {
            m29536W0();
            this.f27303K = true;
            return true;
        }
        if (iM29520O0 == 2) {
            m29536W0();
            this.f27297E = true;
            return true;
        }
        if (iM29520O0 == 5) {
            m29536W0();
            this.f27298F = true;
            return true;
        }
        if (iM29520O0 == 10) {
            m29536W0();
            this.f27301I = true;
            return true;
        }
        if (iM29520O0 == 108) {
            m29536W0();
            this.f27299G = true;
            return true;
        }
        if (iM29520O0 != 109) {
            return this.f27330l.requestFeature(iM29520O0);
        }
        m29536W0();
        this.f27300H = true;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX INFO: renamed from: F0 */
    public final boolean m29510F0(int i10, KeyEvent keyEvent) {
        boolean zM29517M0;
        InterfaceC10368e0 interfaceC10368e0;
        if (this.f27339u != null) {
            return false;
        }
        boolean zMo1720b = true;
        q qVarM29562q0 = m29562q0(i10, true);
        if (i10 != 0 || (interfaceC10368e0 = this.f27336r) == null || !interfaceC10368e0.mo1719a() || ViewConfiguration.get(this.f27329k).hasPermanentMenuKey()) {
            boolean z10 = qVarM29562q0.f27381o;
            if (z10 || qVarM29562q0.f27380n) {
                m29541Z(qVarM29562q0, true);
                zMo1720b = z10;
            } else if (qVarM29562q0.f27379m) {
                if (qVarM29562q0.f27384r) {
                    qVarM29562q0.f27379m = false;
                    zM29517M0 = m29517M0(qVarM29562q0, keyEvent);
                } else {
                    zM29517M0 = true;
                }
                if (zM29517M0) {
                    m29514J0(qVarM29562q0, keyEvent);
                } else {
                    zMo1720b = false;
                }
            } else {
                zMo1720b = false;
            }
        } else if (this.f27336r.mo1723e()) {
            zMo1720b = this.f27336r.mo1720b();
        } else if (this.f27310R || !m29517M0(qVarM29562q0, keyEvent)) {
            zMo1720b = false;
        } else {
            zMo1720b = this.f27336r.mo1721c();
        }
        if (zMo1720b) {
            AudioManager audioManager = (AudioManager) this.f27329k.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return zMo1720b;
            }
            Log.w("AppCompatDelegate", "Couldn't get audio manager");
        }
        return zMo1720b;
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: G */
    public void mo29478G(int i10) {
        m29554h0();
        ViewGroup viewGroup = (ViewGroup) this.f27294B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f27329k).inflate(i10, viewGroup);
        this.f27331m.m29587c(this.f27330l.getCallback());
    }

    /* JADX INFO: renamed from: G0 */
    public void m29511G0(int i10) {
        AbstractC6991a abstractC6991aMo29491r;
        if (i10 != 108 || (abstractC6991aMo29491r = mo29491r()) == null) {
            return;
        }
        abstractC6991aMo29491r.mo29426h(true);
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: H */
    public void mo29479H(View view) {
        m29554h0();
        ViewGroup viewGroup = (ViewGroup) this.f27294B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f27331m.m29587c(this.f27330l.getCallback());
    }

    /* JADX INFO: renamed from: H0 */
    public void m29512H0(int i10) {
        if (i10 == 108) {
            AbstractC6991a abstractC6991aMo29491r = mo29491r();
            if (abstractC6991aMo29491r != null) {
                abstractC6991aMo29491r.mo29426h(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            q qVarM29562q0 = m29562q0(i10, true);
            if (qVarM29562q0.f27381o) {
                m29541Z(qVarM29562q0, false);
            }
        }
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: I */
    public void mo29480I(View view, ViewGroup.LayoutParams layoutParams) {
        m29554h0();
        ViewGroup viewGroup = (ViewGroup) this.f27294B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f27331m.m29587c(this.f27330l.getCallback());
    }

    /* JADX INFO: renamed from: I0 */
    public void m29513I0(ViewGroup viewGroup) {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: J */
    public void mo29481J(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.mo29481J(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f27326h0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f27327i0) != null) {
            k.m29585c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f27327i0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f27328j;
            if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                this.f27326h0 = onBackInvokedDispatcher;
            } else {
                this.f27326h0 = k.m29583a((Activity) this.f27328j);
            }
        } else {
            this.f27326h0 = onBackInvokedDispatcher;
        }
        m29544a1();
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: J0 */
    public final void m29514J0(q qVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (qVar.f27381o || this.f27310R) {
            return;
        }
        if (qVar.f27367a == 0 && (this.f27329k.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackM29564s0 = m29564s0();
        if (callbackM29564s0 != null && !callbackM29564s0.onMenuOpened(qVar.f27367a, qVar.f27376j)) {
            m29541Z(qVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f27329k.getSystemService("window");
        if (windowManager != null && m29517M0(qVar, keyEvent)) {
            ViewGroup viewGroup = qVar.f27373g;
            if (viewGroup != null && !qVar.f27383q) {
                View view = qVar.f27375i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                }
                qVar.f27380n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, qVar.f27370d, qVar.f27371e, PointerIconCompat.TYPE_HAND, 8519680, -3);
                layoutParams2.gravity = qVar.f27369c;
                layoutParams2.windowAnimations = qVar.f27372f;
                windowManager.addView(qVar.f27373g, layoutParams2);
                qVar.f27381o = true;
                if (qVar.f27367a == 0) {
                    m29544a1();
                }
            }
            if (viewGroup == null) {
                if (!m29567v0(qVar) || qVar.f27373g == null) {
                    return;
                }
            } else if (qVar.f27383q && viewGroup.getChildCount() > 0) {
                qVar.f27373g.removeAllViews();
            }
            if (!m29566u0(qVar) || !qVar.m29597b()) {
                qVar.f27383q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = qVar.f27374h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            qVar.f27373g.setBackgroundResource(qVar.f27368b);
            ViewParent parent = qVar.f27374h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(qVar.f27374h);
            }
            qVar.f27373g.addView(qVar.f27374h, layoutParams3);
            if (!qVar.f27374h.hasFocus()) {
                qVar.f27374h.requestFocus();
            }
            i10 = -2;
            qVar.f27380n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i10, -2, qVar.f27370d, qVar.f27371e, PointerIconCompat.TYPE_HAND, 8519680, -3);
            layoutParams4.gravity = qVar.f27369c;
            layoutParams4.windowAnimations = qVar.f27372f;
            windowManager.addView(qVar.f27373g, layoutParams4);
            qVar.f27381o = true;
            if (qVar.f27367a == 0) {
                m29544a1();
            }
        }
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: K */
    public void mo29482K(int i10) {
        this.f27313U = i10;
    }

    /* JADX INFO: renamed from: K0 */
    public final AbstractC6991a m29515K0() {
        return this.f27333o;
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: L */
    public final void mo29483L(CharSequence charSequence) {
        this.f27335q = charSequence;
        InterfaceC10368e0 interfaceC10368e0 = this.f27336r;
        if (interfaceC10368e0 != null) {
            interfaceC10368e0.setWindowTitle(charSequence);
            return;
        }
        if (m29515K0() != null) {
            m29515K0().mo29438t(charSequence);
            return;
        }
        TextView textView = this.f27295C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m29516L0(q qVar, int i10, KeyEvent keyEvent, int i11) {
        C0415e c0415e;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((qVar.f27379m || m29517M0(qVar, keyEvent)) && (c0415e = qVar.f27376j) != null) {
            zPerformShortcut = c0415e.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.f27336r == null) {
            m29541Z(qVar, true);
        }
        return zPerformShortcut;
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m29517M0(q qVar, KeyEvent keyEvent) {
        InterfaceC10368e0 interfaceC10368e0;
        InterfaceC10368e0 interfaceC10368e1;
        InterfaceC10368e0 interfaceC10368e2;
        if (this.f27310R) {
            return false;
        }
        if (qVar.f27379m) {
            return true;
        }
        q qVar2 = this.f27306N;
        if (qVar2 != null && qVar2 != qVar) {
            m29541Z(qVar2, false);
        }
        Window.Callback callbackM29564s0 = m29564s0();
        if (callbackM29564s0 != null) {
            qVar.f27375i = callbackM29564s0.onCreatePanelView(qVar.f27367a);
        }
        int i10 = qVar.f27367a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (interfaceC10368e2 = this.f27336r) != null) {
            interfaceC10368e2.mo1724f();
        }
        if (qVar.f27375i == null) {
            if (z10) {
                m29515K0();
            }
            C0415e c0415e = qVar.f27376j;
            if (c0415e == null || qVar.f27384r) {
                if (c0415e == null && (!m29568w0(qVar) || qVar.f27376j == null)) {
                    return false;
                }
                if (z10 && this.f27336r != null) {
                    if (this.f27337s == null) {
                        this.f27337s = new f();
                    }
                    this.f27336r.mo1722d(qVar.f27376j, this.f27337s);
                }
                qVar.f27376j.m1635e0();
                if (!callbackM29564s0.onCreatePanelMenu(qVar.f27367a, qVar.f27376j)) {
                    qVar.m29598c(null);
                    if (z10 && (interfaceC10368e0 = this.f27336r) != null) {
                        interfaceC10368e0.mo1722d(null, this.f27337s);
                    }
                    return false;
                }
                qVar.f27384r = false;
            }
            qVar.f27376j.m1635e0();
            Bundle bundle = qVar.f27385s;
            if (bundle != null) {
                qVar.f27376j.m1616Q(bundle);
                qVar.f27385s = null;
            }
            if (!callbackM29564s0.onPreparePanel(0, qVar.f27375i, qVar.f27376j)) {
                if (z10 && (interfaceC10368e1 = this.f27336r) != null) {
                    interfaceC10368e1.mo1722d(null, this.f27337s);
                }
                qVar.f27376j.m1633d0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            qVar.f27382p = z11;
            qVar.f27376j.setQwertyMode(z11);
            qVar.f27376j.m1633d0();
        }
        qVar.f27379m = true;
        qVar.f27380n = false;
        this.f27306N = qVar;
        return true;
    }

    /* JADX INFO: renamed from: N0 */
    public final void m29518N0(boolean z10) {
        InterfaceC10368e0 interfaceC10368e0 = this.f27336r;
        if (interfaceC10368e0 == null || !interfaceC10368e0.mo1719a() || (ViewConfiguration.get(this.f27329k).hasPermanentMenuKey() && !this.f27336r.mo1725g())) {
            q qVarM29562q0 = m29562q0(0, true);
            qVarM29562q0.f27383q = true;
            m29541Z(qVarM29562q0, false);
            m29514J0(qVarM29562q0, null);
            return;
        }
        Window.Callback callbackM29564s0 = m29564s0();
        if (this.f27336r.mo1723e() && z10) {
            this.f27336r.mo1720b();
            if (this.f27310R) {
                return;
            }
            callbackM29564s0.onPanelClosed(108, m29562q0(0, true).f27376j);
            return;
        }
        if (callbackM29564s0 == null || this.f27310R) {
            return;
        }
        if (this.f27318Z && (this.f27319a0 & 1) != 0) {
            this.f27330l.getDecorView().removeCallbacks(this.f27320b0);
            this.f27320b0.run();
        }
        q qVarM29562q1 = m29562q0(0, true);
        C0415e c0415e = qVarM29562q1.f27376j;
        if (c0415e == null || qVarM29562q1.f27384r || !callbackM29564s0.onPreparePanel(0, qVarM29562q1.f27375i, c0415e)) {
            return;
        }
        callbackM29564s0.onMenuOpened(108, qVarM29562q1.f27376j);
        this.f27336r.mo1721c();
    }

    /* JADX INFO: renamed from: O */
    public final boolean m29519O(boolean z10) {
        return m29521P(z10, true);
    }

    /* JADX INFO: renamed from: O0 */
    public final int m29520O0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m29521P(boolean z10, boolean z11) {
        if (this.f27310R) {
            return false;
        }
        int iM29531U = m29531U();
        int iM29571z0 = m29571z0(this.f27329k, iM29531U);
        C11781j c11781jM29529T = Build.VERSION.SDK_INT < 33 ? m29529T(this.f27329k) : null;
        if (!z11 && c11781jM29529T != null) {
            c11781jM29529T = m29561p0(this.f27329k.getResources().getConfiguration());
        }
        boolean zM29542Z0 = m29542Z0(iM29571z0, c11781jM29529T, z10);
        if (iM29531U == 0) {
            m29560o0(this.f27329k).m29594e();
        } else {
            n nVar = this.f27316X;
            if (nVar != null) {
                nVar.m29593a();
            }
        }
        if (iM29531U == 3) {
            m29559n0(this.f27329k).m29594e();
            return zM29542Z0;
        }
        n nVar2 = this.f27317Y;
        if (nVar2 != null) {
            nVar2.m29593a();
        }
        return zM29542Z0;
    }

    /* JADX INFO: renamed from: P0 */
    public void m29522P0(Configuration configuration, @NonNull C11781j c11781j) {
        i.m29581d(configuration, c11781j);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m29523Q() {
        return m29519O(true);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m29524Q0(C11781j c11781j) {
        i.m29580c(c11781j);
    }

    /* JADX INFO: renamed from: R */
    public final void m29525R() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f27294B.findViewById(R.id.content);
        View decorView = this.f27330l.getDecorView();
        contentFrameLayout.m1812a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f27329k.obtainStyledAttributes(C6598j.f25203A0);
        typedArrayObtainStyledAttributes.getValue(C6598j.f25263M0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(C6598j.f25268N0, contentFrameLayout.getMinWidthMinor());
        int i10 = C6598j.f25253K0;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = C6598j.f25258L0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            typedArrayObtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = C6598j.f25243I0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            typedArrayObtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = C6598j.f25248J0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            typedArrayObtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX INFO: renamed from: R0 */
    public final boolean m29526R0() {
        ViewGroup viewGroup;
        return this.f27293A && (viewGroup = this.f27294B) != null && viewGroup.isLaidOut();
    }

    /* JADX INFO: renamed from: S */
    public final void m29527S(@NonNull Window window) {
        if (this.f27330l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof l) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        l lVar = new l(callback);
        this.f27331m = lVar;
        window.setCallback(lVar);
        C10357a1 c10357a1M39727u = C10357a1.m39727u(this.f27329k, null, f27291l0);
        Drawable drawableM39736h = c10357a1M39727u.m39736h(0);
        if (drawableM39736h != null) {
            window.setBackgroundDrawable(drawableM39736h);
        }
        c10357a1M39727u.m39749x();
        this.f27330l = window;
        if (Build.VERSION.SDK_INT < 33 || this.f27326h0 != null) {
            return;
        }
        mo29481J(null);
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m29528S0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f27330l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* JADX INFO: renamed from: T */
    public C11781j m29529T(@NonNull Context context) {
        C11781j c11781jM29472q;
        if (Build.VERSION.SDK_INT >= 33 || (c11781jM29472q = AbstractC6995e.m29472q()) == null) {
            return null;
        }
        C11781j c11781jM29561p0 = m29561p0(context.getApplicationContext().getResources().getConfiguration());
        C11781j c11781jM29631b = C7007q.m29631b(c11781jM29472q, c11781jM29561p0);
        return c11781jM29631b.m44073e() ? c11781jM29561p0 : c11781jM29631b;
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m29530T0() {
        if (this.f27326h0 == null) {
            return false;
        }
        q qVarM29562q0 = m29562q0(0, false);
        return (qVarM29562q0 != null && qVarM29562q0.f27381o) || this.f27339u != null;
    }

    /* JADX INFO: renamed from: U */
    public final int m29531U() {
        int i10 = this.f27312T;
        return i10 != -100 ? i10 : AbstractC6995e.m29470m();
    }

    /* JADX INFO: renamed from: U0 */
    public AbstractC9609b m29532U0(@NonNull AbstractC9609b.a aVar) {
        InterfaceC6993c interfaceC6993c;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC9609b abstractC9609b = this.f27339u;
        if (abstractC9609b != null) {
            abstractC9609b.mo29658c();
        }
        g gVar = new g(aVar);
        AbstractC6991a abstractC6991aMo29491r = mo29491r();
        if (abstractC6991aMo29491r != null) {
            AbstractC9609b abstractC9609bMo29439u = abstractC6991aMo29491r.mo29439u(gVar);
            this.f27339u = abstractC9609bMo29439u;
            if (abstractC9609bMo29439u != null && (interfaceC6993c = this.f27332n) != null) {
                interfaceC6993c.mo29457x(abstractC9609bMo29439u);
            }
        }
        if (this.f27339u == null) {
            this.f27339u = m29534V0(gVar);
        }
        m29544a1();
        return this.f27339u;
    }

    /* JADX INFO: renamed from: V */
    public void m29533V(int i10, q qVar, Menu menu) {
        if (menu == null) {
            if (qVar == null && i10 >= 0) {
                q[] qVarArr = this.f27305M;
                if (i10 < qVarArr.length) {
                    qVar = qVarArr[i10];
                }
            }
            if (qVar != null) {
                menu = qVar.f27376j;
            }
        }
        if ((qVar == null || qVar.f27381o) && !this.f27310R) {
            this.f27331m.m29588d(this.f27330l.getCallback(), i10, menu);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public AbstractC9609b m29534V0(@NonNull AbstractC9609b.a aVar) {
        AbstractC9609b abstractC9609bMo29450s;
        Context c9611d;
        InterfaceC6993c interfaceC6993c;
        m29553g0();
        AbstractC9609b abstractC9609b = this.f27339u;
        if (abstractC9609b != null) {
            abstractC9609b.mo29658c();
        }
        if (!(aVar instanceof g)) {
            aVar = new g(aVar);
        }
        InterfaceC6993c interfaceC6993c2 = this.f27332n;
        if (interfaceC6993c2 == null || this.f27310R) {
            abstractC9609bMo29450s = null;
        } else {
            try {
                abstractC9609bMo29450s = interfaceC6993c2.mo29450s(aVar);
            } catch (AbstractMethodError unused) {
                abstractC9609bMo29450s = null;
            }
        }
        if (abstractC9609bMo29450s != null) {
            this.f27339u = abstractC9609bMo29450s;
        } else {
            if (this.f27340v == null) {
                if (this.f27302J) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f27329k.getTheme();
                    theme.resolveAttribute(C6589a.f25027f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f27329k.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        c9611d = new C9611d(this.f27329k, 0);
                        c9611d.getTheme().setTo(themeNewTheme);
                    } else {
                        c9611d = this.f27329k;
                    }
                    this.f27340v = new ActionBarContextView(c9611d);
                    PopupWindow popupWindow = new PopupWindow(c9611d, (AttributeSet) null, C6589a.f25030i);
                    this.f27341w = popupWindow;
                    C4430h.m22290b(popupWindow, 2);
                    this.f27341w.setContentView(this.f27340v);
                    this.f27341w.setWidth(-1);
                    c9611d.getTheme().resolveAttribute(C6589a.f25023b, typedValue, true);
                    this.f27340v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, c9611d.getResources().getDisplayMetrics()));
                    this.f27341w.setHeight(-2);
                    this.f27342x = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f27294B.findViewById(C6594f.f25141h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m29557l0()));
                        this.f27340v = (ActionBarContextView) viewStubCompat.m1945a();
                    }
                }
            }
            if (this.f27340v != null) {
                m29553g0();
                this.f27340v.m1714k();
                C9612e c9612e = new C9612e(this.f27340v.getContext(), this.f27340v, aVar, this.f27341w == null);
                if (aVar.mo29572a(c9612e, c9612e.mo29660e())) {
                    c9612e.mo29664k();
                    this.f27340v.m1711h(c9612e);
                    this.f27339u = c9612e;
                    if (m29526R0()) {
                        this.f27340v.setAlpha(0.0f);
                        C0645y0 c0645y0M3225b = C0625o0.m3023e(this.f27340v).m3225b(1.0f);
                        this.f27343y = c0645y0M3225b;
                        c0645y0M3225b.m3230g(new e());
                    } else {
                        this.f27340v.setAlpha(1.0f);
                        this.f27340v.setVisibility(0);
                        if (this.f27340v.getParent() instanceof View) {
                            C0625o0.m3034j0((View) this.f27340v.getParent());
                        }
                    }
                    if (this.f27341w != null) {
                        this.f27330l.getDecorView().post(this.f27342x);
                    }
                } else {
                    this.f27339u = null;
                }
            }
        }
        AbstractC9609b abstractC9609b2 = this.f27339u;
        if (abstractC9609b2 != null && (interfaceC6993c = this.f27332n) != null) {
            interfaceC6993c.mo29457x(abstractC9609b2);
        }
        m29544a1();
        return this.f27339u;
    }

    /* JADX INFO: renamed from: W */
    public void m29535W(@NonNull C0415e c0415e) {
        if (this.f27304L) {
            return;
        }
        this.f27304L = true;
        this.f27336r.mo1730l();
        Window.Callback callbackM29564s0 = m29564s0();
        if (callbackM29564s0 != null && !this.f27310R) {
            callbackM29564s0.onPanelClosed(108, c0415e);
        }
        this.f27304L = false;
    }

    /* JADX INFO: renamed from: W0 */
    public final void m29536W0() {
        if (this.f27293A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m29537X() {
        n nVar = this.f27316X;
        if (nVar != null) {
            nVar.m29593a();
        }
        n nVar2 = this.f27317Y;
        if (nVar2 != null) {
            nVar2.m29593a();
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final ActivityC6992b m29538X0() {
        for (Context baseContext = this.f27329k; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof ActivityC6992b) {
                return (ActivityC6992b) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Y */
    public void m29539Y(int i10) {
        m29541Z(m29562q0(i10, true), true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y0 */
    public final void m29540Y0(Configuration configuration) {
        Activity activity = (Activity) this.f27328j;
        if (activity instanceof InterfaceC0980s) {
            if (((InterfaceC0980s) activity).mo4656a().getState().m4945b(AbstractC0966l.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f27309Q || this.f27310R) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m29541Z(q qVar, boolean z10) {
        ViewGroup viewGroup;
        InterfaceC10368e0 interfaceC10368e0;
        if (z10 && qVar.f27367a == 0 && (interfaceC10368e0 = this.f27336r) != null && interfaceC10368e0.mo1723e()) {
            m29535W(qVar.f27376j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f27329k.getSystemService("window");
        if (windowManager != null && qVar.f27381o && (viewGroup = qVar.f27373g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                m29533V(qVar.f27367a, qVar, null);
            }
        }
        qVar.f27379m = false;
        qVar.f27380n = false;
        qVar.f27381o = false;
        qVar.f27374h = null;
        qVar.f27383q = true;
        if (this.f27306N == qVar) {
            this.f27306N = null;
        }
        if (qVar.f27367a == 0) {
            m29544a1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX INFO: renamed from: Z0 */
    public final boolean m29542Z0(int i10, C11781j c11781j, boolean z10) {
        boolean z11;
        Configuration configurationM29543a0 = m29543a0(this.f27329k, i10, c11781j, null, false);
        int iM29558m0 = m29558m0(this.f27329k);
        Configuration configuration = this.f27311S;
        if (configuration == null) {
            configuration = this.f27329k.getResources().getConfiguration();
        }
        int i11 = configuration.uiMode & 48;
        int i12 = configurationM29543a0.uiMode & 48;
        C11781j c11781jM29561p0 = m29561p0(configuration);
        C11781j c11781jM29561p1 = c11781j == null ? null : m29561p0(configurationM29543a0);
        int i13 = i11 != i12 ? 512 : 0;
        if (c11781jM29561p1 != null && !c11781jM29561p0.equals(c11781jM29561p1)) {
            i13 |= 8196;
        }
        boolean z12 = true;
        if (((~iM29558m0) & i13) != 0 && z10 && this.f27308P && (f27292m0 || this.f27309Q)) {
            Object obj = this.f27328j;
            if (!(obj instanceof Activity) || ((Activity) obj).isChild()) {
                z11 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i13 & 8192) != 0) {
                    ((Activity) this.f27328j).getWindow().getDecorView().setLayoutDirection(configurationM29543a0.getLayoutDirection());
                }
                C7410b.m30696t((Activity) this.f27328j);
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (z11 || i13 == 0) {
            z12 = z11;
        } else {
            m29546b1(i12, c11781jM29561p1, (i13 & iM29558m0) == i13, null);
        }
        if (z12) {
            Object obj2 = this.f27328j;
            if (obj2 instanceof ActivityC6992b) {
                if ((i13 & 512) != 0) {
                    ((ActivityC6992b) obj2).m29458x1(i10);
                }
                if ((i13 & 4) != 0) {
                    ((ActivityC6992b) this.f27328j).m29456w1(c11781j);
                }
            }
        }
        if (c11781jM29561p1 != null) {
            m29524Q0(m29561p0(this.f27329k.getResources().getConfiguration()));
        }
        return z12;
    }

    @Override // androidx.appcompat.view.menu.C0415e.a
    /* JADX INFO: renamed from: a */
    public boolean mo1656a(@NonNull C0415e c0415e, @NonNull MenuItem menuItem) {
        q qVarM29556j0;
        Window.Callback callbackM29564s0 = m29564s0();
        if (callbackM29564s0 == null || this.f27310R || (qVarM29556j0 = m29556j0(c0415e.mo1603D())) == null) {
            return false;
        }
        return callbackM29564s0.onMenuItemSelected(qVarM29556j0.f27367a, menuItem);
    }

    @NonNull
    /* JADX INFO: renamed from: a0 */
    public final Configuration m29543a0(@NonNull Context context, int i10, C11781j c11781j, Configuration configuration, boolean z10) {
        int i11;
        if (i10 == 1) {
            i11 = 16;
        } else if (i10 != 2) {
            i11 = z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i11 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (c11781j != null) {
            m29522P0(configuration2, c11781j);
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: a1 */
    public void m29544a1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zM29530T0 = m29530T0();
            if (zM29530T0 && this.f27327i0 == null) {
                this.f27327i0 = k.m29584b(this.f27326h0, this);
            } else {
                if (zM29530T0 || (onBackInvokedCallback = this.f27327i0) == null) {
                    return;
                }
                k.m29585c(this.f27326h0, onBackInvokedCallback);
                this.f27327i0 = null;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.C0415e.a
    /* JADX INFO: renamed from: b */
    public void mo1657b(@NonNull C0415e c0415e) {
        m29518N0(true);
    }

    /* JADX INFO: renamed from: b0 */
    public final ViewGroup m29545b0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f27329k.obtainStyledAttributes(C6598j.f25203A0);
        int i10 = C6598j.f25228F0;
        if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C6598j.f25273O0, false)) {
            mo29477F(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i10, false)) {
            mo29477F(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C6598j.f25233G0, false)) {
            mo29477F(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C6598j.f25238H0, false)) {
            mo29477F(10);
        }
        this.f27302J = typedArrayObtainStyledAttributes.getBoolean(C6598j.f25208B0, false);
        typedArrayObtainStyledAttributes.recycle();
        m29555i0();
        this.f27330l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f27329k);
        if (this.f27303K) {
            viewGroup = this.f27301I ? (ViewGroup) layoutInflaterFrom.inflate(C6595g.f25176q, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(C6595g.f25175p, (ViewGroup) null);
        } else if (this.f27302J) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(C6595g.f25167h, (ViewGroup) null);
            this.f27300H = false;
            this.f27299G = false;
        } else if (this.f27299G) {
            TypedValue typedValue = new TypedValue();
            this.f27329k.getTheme().resolveAttribute(C6589a.f25027f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C9611d(this.f27329k, typedValue.resourceId) : this.f27329k).inflate(C6595g.f25177r, (ViewGroup) null);
            InterfaceC10368e0 interfaceC10368e0 = (InterfaceC10368e0) viewGroup.findViewById(C6594f.f25150q);
            this.f27336r = interfaceC10368e0;
            interfaceC10368e0.setWindowCallback(m29564s0());
            if (this.f27300H) {
                this.f27336r.mo1726h(109);
            }
            if (this.f27297E) {
                this.f27336r.mo1726h(2);
            }
            if (this.f27298F) {
                this.f27336r.mo1726h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f27299G + ", windowActionBarOverlay: " + this.f27300H + ", android:windowIsFloating: " + this.f27302J + ", windowActionModeOverlay: " + this.f27301I + ", windowNoTitle: " + this.f27303K + " }");
        }
        C0625o0.m2979A0(viewGroup, new b());
        if (this.f27336r == null) {
            this.f27295C = (TextView) viewGroup.findViewById(C6594f.f25130R);
        }
        C10375g1.m39841c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C6594f.f25135b);
        ViewGroup viewGroup2 = (ViewGroup) this.f27330l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f27330l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m29546b1(int i10, C11781j c11781j, boolean z10, Configuration configuration) {
        Resources resources = this.f27329k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (c11781j != null) {
            m29522P0(configuration2, c11781j);
        }
        resources.updateConfiguration(configuration2, null);
        int i11 = this.f27313U;
        if (i11 != 0) {
            this.f27329k.setTheme(i11);
            this.f27329k.getTheme().applyStyle(this.f27313U, true);
        }
        if (z10 && (this.f27328j instanceof Activity)) {
            m29540Y0(configuration2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    public View m29547c0(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean z10;
        if (this.f27324f0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f27329k.obtainStyledAttributes(C6598j.f25203A0);
            String string = typedArrayObtainStyledAttributes.getString(C6598j.f25223E0);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f27324f0 = new C7004n();
            } else {
                try {
                    this.f27324f0 = (C7004n) this.f27329k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f27324f0 = new C7004n();
                }
            }
        }
        boolean z11 = f27290k0;
        boolean zM29528S0 = false;
        if (z11) {
            if (this.f27325g0 == null) {
                this.f27325g0 = new C7006p();
            }
            if (this.f27325g0.m29629a(attributeSet)) {
                z10 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zM29528S0 = m29528S0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zM29528S0 = true;
                }
                z10 = zM29528S0;
            }
        } else {
            z10 = zM29528S0;
        }
        return this.f27324f0.m29619r(view, str, context, attributeSet, z10, z11, true, C10372f1.m39837c());
    }

    /* JADX INFO: renamed from: c1 */
    public final int m29548c1(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        int systemWindowInsetTop;
        boolean z10;
        boolean z11;
        if (windowInsetsCompat != null) {
            systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        } else {
            systemWindowInsetTop = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f27340v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f27340v.getLayoutParams();
            boolean z12 = true;
            if (this.f27340v.isShown()) {
                if (this.f27322d0 == null) {
                    this.f27322d0 = new Rect();
                    this.f27323e0 = new Rect();
                }
                Rect rect2 = this.f27322d0;
                Rect rect3 = this.f27323e0;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                }
                C10375g1.m39839a(this.f27294B, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                WindowInsetsCompat windowInsetsCompatM2988F = C0625o0.m2988F(this.f27294B);
                int systemWindowInsetLeft = windowInsetsCompatM2988F == null ? 0 : windowInsetsCompatM2988F.getSystemWindowInsetLeft();
                int systemWindowInsetRight = windowInsetsCompatM2988F == null ? 0 : windowInsetsCompatM2988F.getSystemWindowInsetRight();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.f27296D != null) {
                    View view = this.f27296D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != systemWindowInsetLeft || marginLayoutParams2.rightMargin != systemWindowInsetRight) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = systemWindowInsetLeft;
                            marginLayoutParams2.rightMargin = systemWindowInsetRight;
                            this.f27296D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f27329k);
                    this.f27296D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = systemWindowInsetLeft;
                    layoutParams.rightMargin = systemWindowInsetRight;
                    this.f27294B.addView(this.f27296D, -1, layoutParams);
                }
                View view3 = this.f27296D;
                z12 = view3 != null;
                if (z12 && view3.getVisibility() != 0) {
                    m29550d1(this.f27296D);
                }
                if (!this.f27301I && z12) {
                    systemWindowInsetTop = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.f27340v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f27296D;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return systemWindowInsetTop;
    }

    /* JADX INFO: renamed from: d0 */
    public void m29549d0() {
        C0415e c0415e;
        InterfaceC10368e0 interfaceC10368e0 = this.f27336r;
        if (interfaceC10368e0 != null) {
            interfaceC10368e0.mo1730l();
        }
        if (this.f27341w != null) {
            this.f27330l.getDecorView().removeCallbacks(this.f27342x);
            if (this.f27341w.isShowing()) {
                try {
                    this.f27341w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f27341w = null;
        }
        m29553g0();
        q qVarM29562q0 = m29562q0(0, false);
        if (qVarM29562q0 == null || (c0415e = qVarM29562q0.f27376j) == null) {
            return;
        }
        c0415e.close();
    }

    /* JADX INFO: renamed from: d1 */
    public final void m29550d1(View view) {
        view.setBackgroundColor((C0625o0.m2998K(view) & 8192) != 0 ? C7975b.m33005c(this.f27329k, C6591c.f25050b) : C7975b.m33005c(this.f27329k, C6591c.f25049a));
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: e */
    public void mo29484e(View view, ViewGroup.LayoutParams layoutParams) {
        m29554h0();
        ((ViewGroup) this.f27294B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f27331m.m29587c(this.f27330l.getCallback());
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m29551e0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f27328j;
        if (((obj instanceof C0617l.a) || (obj instanceof DialogC7002l)) && (decorView = this.f27330l.getDecorView()) != null && C0617l.m2936d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f27331m.m29586b(this.f27330l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m29506B0(keyCode, keyEvent) : m29509E0(keyCode, keyEvent);
    }

    /* JADX INFO: renamed from: f0 */
    public void m29552f0(int i10) {
        q qVarM29562q0;
        q qVarM29562q1 = m29562q0(i10, true);
        if (qVarM29562q1.f27376j != null) {
            Bundle bundle = new Bundle();
            qVarM29562q1.f27376j.m1617R(bundle);
            if (bundle.size() > 0) {
                qVarM29562q1.f27385s = bundle;
            }
            qVarM29562q1.f27376j.m1635e0();
            qVarM29562q1.f27376j.clear();
        }
        qVarM29562q1.f27384r = true;
        qVarM29562q1.f27383q = true;
        if ((i10 != 108 && i10 != 0) || this.f27336r == null || (qVarM29562q0 = m29562q0(0, false)) == null) {
            return;
        }
        qVarM29562q0.f27379m = false;
        m29517M0(qVarM29562q0, null);
    }

    @Override // p203j.AbstractC6995e
    @NonNull
    /* JADX INFO: renamed from: g */
    public Context mo29486g(@NonNull Context context) {
        Context context2;
        this.f27308P = true;
        int iM29571z0 = m29571z0(context, m29531U());
        if (AbstractC6995e.m29473u(context)) {
            AbstractC6995e.m29464N(context);
        }
        C11781j c11781jM29529T = m29529T(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(m29543a0(context2, iM29571z0, c11781jM29529T, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof C9611d) {
            try {
                ((C9611d) context2).m37922a(m29543a0(context2, iM29571z0, c11781jM29529T, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f27292m0) {
            return super.mo29486g(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationM29543a0 = m29543a0(context2, iM29571z0, c11781jM29529T, !configuration2.equals(configuration3) ? m29504k0(configuration2, configuration3) : null, true);
        C9611d c9611d = new C9611d(context2, C6597i.f25200b);
        c9611d.m37922a(configurationM29543a0);
        try {
            if (context2.getTheme() != null) {
                C8870h.g.m35682a(c9611d.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.mo29486g(c9611d);
    }

    /* JADX INFO: renamed from: g0 */
    public void m29553g0() {
        C0645y0 c0645y0 = this.f27343y;
        if (c0645y0 != null) {
            c0645y0.m3226c();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m29554h0() {
        if (this.f27293A) {
            return;
        }
        this.f27294B = m29545b0();
        CharSequence charSequenceM29563r0 = m29563r0();
        if (!TextUtils.isEmpty(charSequenceM29563r0)) {
            InterfaceC10368e0 interfaceC10368e0 = this.f27336r;
            if (interfaceC10368e0 != null) {
                interfaceC10368e0.setWindowTitle(charSequenceM29563r0);
            } else if (m29515K0() != null) {
                m29515K0().mo29438t(charSequenceM29563r0);
            } else {
                TextView textView = this.f27295C;
                if (textView != null) {
                    textView.setText(charSequenceM29563r0);
                }
            }
        }
        m29525R();
        m29513I0(this.f27294B);
        this.f27293A = true;
        q qVarM29562q0 = m29562q0(0, false);
        if (this.f27310R) {
            return;
        }
        if (qVarM29562q0 == null || qVarM29562q0.f27376j == null) {
            m29569x0(108);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m29555i0() {
        if (this.f27330l == null) {
            Object obj = this.f27328j;
            if (obj instanceof Activity) {
                m29527S(((Activity) obj).getWindow());
            }
        }
        if (this.f27330l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: j */
    public <T extends View> T mo29487j(int i10) {
        m29554h0();
        return (T) this.f27330l.findViewById(i10);
    }

    /* JADX INFO: renamed from: j0 */
    public q m29556j0(Menu menu) {
        q[] qVarArr = this.f27305M;
        int length = qVarArr != null ? qVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            q qVar = qVarArr[i10];
            if (qVar != null && qVar.f27376j == menu) {
                return qVar;
            }
        }
        return null;
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: l */
    public Context mo29488l() {
        return this.f27329k;
    }

    /* JADX INFO: renamed from: l0 */
    public final Context m29557l0() {
        AbstractC6991a abstractC6991aMo29491r = mo29491r();
        Context contextMo29428j = abstractC6991aMo29491r != null ? abstractC6991aMo29491r.mo29428j() : null;
        return contextMo29428j == null ? this.f27329k : contextMo29428j;
    }

    /* JADX INFO: renamed from: m0 */
    public final int m29558m0(Context context) {
        if (!this.f27315W && (this.f27328j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f27328j.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f27314V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f27314V = 0;
            }
        }
        this.f27315W = true;
        return this.f27314V;
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: n */
    public int mo29489n() {
        return this.f27312T;
    }

    /* JADX INFO: renamed from: n0 */
    public final n m29559n0(@NonNull Context context) {
        if (this.f27317Y == null) {
            this.f27317Y = new m(context);
        }
        return this.f27317Y;
    }

    /* JADX INFO: renamed from: o0 */
    public final n m29560o0(@NonNull Context context) {
        if (this.f27316X == null) {
            this.f27316X = new o(C7009s.m29634a(context));
        }
        return this.f27316X;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m29547c0(view, str, context, attributeSet);
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: p */
    public MenuInflater mo29490p() {
        if (this.f27334p == null) {
            m29565t0();
            AbstractC6991a abstractC6991a = this.f27333o;
            this.f27334p = new C9614g(abstractC6991a != null ? abstractC6991a.mo29428j() : this.f27329k);
        }
        return this.f27334p;
    }

    /* JADX INFO: renamed from: p0 */
    public C11781j m29561p0(Configuration configuration) {
        return i.m29579b(configuration);
    }

    /* JADX INFO: renamed from: q0 */
    public q m29562q0(int i10, boolean z10) {
        q[] qVarArr = this.f27305M;
        if (qVarArr == null || qVarArr.length <= i10) {
            q[] qVarArr2 = new q[i10 + 1];
            if (qVarArr != null) {
                System.arraycopy(qVarArr, 0, qVarArr2, 0, qVarArr.length);
            }
            this.f27305M = qVarArr2;
            qVarArr = qVarArr2;
        }
        q qVar = qVarArr[i10];
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(i10);
        qVarArr[i10] = qVar2;
        return qVar2;
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: r */
    public AbstractC6991a mo29491r() {
        m29565t0();
        return this.f27333o;
    }

    /* JADX INFO: renamed from: r0 */
    public final CharSequence m29563r0() {
        Object obj = this.f27328j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f27335q;
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: s */
    public void mo29492s() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f27329k);
        if (layoutInflaterFrom.getFactory() == null) {
            C0620m.m2967a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C6997g) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final Window.Callback m29564s0() {
        return this.f27330l.getCallback();
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: t */
    public void mo29493t() {
        if (m29515K0() == null || mo29491r().m29430l()) {
            return;
        }
        m29569x0(0);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m29565t0() {
        m29554h0();
        if (this.f27299G && this.f27333o == null) {
            Object obj = this.f27328j;
            if (obj instanceof Activity) {
                this.f27333o = new C7010t((Activity) this.f27328j, this.f27300H);
            } else if (obj instanceof Dialog) {
                this.f27333o = new C7010t((Dialog) this.f27328j);
            }
            AbstractC6991a abstractC6991a = this.f27333o;
            if (abstractC6991a != null) {
                abstractC6991a.mo29436r(this.f27321c0);
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m29566u0(q qVar) {
        View view = qVar.f27375i;
        if (view != null) {
            qVar.f27374h = view;
            return true;
        }
        if (qVar.f27376j == null) {
            return false;
        }
        if (this.f27338t == null) {
            this.f27338t = new r();
        }
        View view2 = (View) qVar.m29596a(this.f27338t);
        qVar.f27374h = view2;
        return view2 != null;
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: v */
    public void mo29494v(Configuration configuration) {
        AbstractC6991a abstractC6991aMo29491r;
        if (this.f27299G && this.f27293A && (abstractC6991aMo29491r = mo29491r()) != null) {
            abstractC6991aMo29491r.mo29431m(configuration);
        }
        C10383k.m39862b().m39869g(this.f27329k);
        this.f27311S = new Configuration(this.f27329k.getResources().getConfiguration());
        m29521P(false, false);
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m29567v0(q qVar) {
        qVar.m29599d(m29557l0());
        qVar.f27373g = new p(qVar.f27378l);
        qVar.f27369c = 81;
        return true;
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: w */
    public void mo29495w(Bundle bundle) {
        String strM30733c;
        this.f27308P = true;
        m29519O(false);
        m29555i0();
        Object obj = this.f27328j;
        if (obj instanceof Activity) {
            try {
                strM30733c = C7417i.m30733c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strM30733c = null;
            }
            if (strM30733c != null) {
                AbstractC6991a abstractC6991aM29515K0 = m29515K0();
                if (abstractC6991aM29515K0 == null) {
                    this.f27321c0 = true;
                } else {
                    abstractC6991aM29515K0.mo29436r(true);
                }
            }
            AbstractC6995e.m29466d(this);
        }
        this.f27311S = new Configuration(this.f27329k.getResources().getConfiguration());
        this.f27309Q = true;
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m29568w0(q qVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f27329k;
        int i10 = qVar.f27367a;
        if ((i10 == 0 || i10 == 108) && this.f27336r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C6589a.f25027f, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(C6589a.f25028g, typedValue, true);
            } else {
                theme.resolveAttribute(C6589a.f25028g, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                C9611d c9611d = new C9611d(context, 0);
                c9611d.getTheme().setTo(themeNewTheme);
                context = c9611d;
            }
        }
        C0415e c0415e = new C0415e(context);
        c0415e.mo1618S(this);
        qVar.m29598c(c0415e);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: x */
    public void mo29496x() {
        if (this.f27328j instanceof Activity) {
            AbstractC6995e.m29461D(this);
        }
        if (this.f27318Z) {
            this.f27330l.getDecorView().removeCallbacks(this.f27320b0);
        }
        this.f27310R = true;
        if (this.f27312T != -100) {
            Object obj = this.f27328j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f27289j0.put(this.f27328j.getClass().getName(), Integer.valueOf(this.f27312T));
            } else {
                f27289j0.remove(this.f27328j.getClass().getName());
            }
        } else {
            f27289j0.remove(this.f27328j.getClass().getName());
        }
        AbstractC6991a abstractC6991a = this.f27333o;
        if (abstractC6991a != null) {
            abstractC6991a.m29432n();
        }
        m29537X();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m29569x0(int i10) {
        this.f27319a0 = (1 << i10) | this.f27319a0;
        if (this.f27318Z) {
            return;
        }
        C0625o0.m3024e0(this.f27330l.getDecorView(), this.f27320b0);
        this.f27318Z = true;
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: y */
    public void mo29497y(Bundle bundle) {
        m29554h0();
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m29570y0() {
        return this.f27344z;
    }

    @Override // p203j.AbstractC6995e
    /* JADX INFO: renamed from: z */
    public void mo29498z() {
        AbstractC6991a abstractC6991aMo29491r = mo29491r();
        if (abstractC6991aMo29491r != null) {
            abstractC6991aMo29491r.mo29437s(true);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public int m29571z0(@NonNull Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return m29560o0(context).mo29591c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return m29559n0(context).mo29591c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public LayoutInflaterFactory2C6997g(Dialog dialog, InterfaceC6993c interfaceC6993c) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC6993c, dialog);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public LayoutInflaterFactory2C6997g(Context context, Window window, InterfaceC6993c interfaceC6993c, Object obj) {
        C12286j<String, Integer> c12286j;
        Integer num;
        ActivityC6992b activityC6992bM29538X0;
        this.f27343y = null;
        this.f27344z = true;
        this.f27312T = -100;
        this.f27320b0 = new a();
        this.f27329k = context;
        this.f27332n = interfaceC6993c;
        this.f27328j = obj;
        if (this.f27312T == -100 && (obj instanceof Dialog) && (activityC6992bM29538X0 = m29538X0()) != null) {
            this.f27312T = activityC6992bM29538X0.m29451s1().mo29489n();
        }
        if (this.f27312T == -100 && (num = (c12286j = f27289j0).get(obj.getClass().getName())) != null) {
            this.f27312T = num.intValue();
            c12286j.remove(obj.getClass().getName());
        }
        if (window != null) {
            m29527S(window);
        }
        C10383k.m39864h();
    }
}
