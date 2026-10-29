package j;

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
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a1;
import androidx.core.view.o0;
import androidx.core.view.y;
import androidx.core.view.y0;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import q.e0;
import q.f1;
import q.g1;

/* JADX INFO: loaded from: classes.dex */
public class g extends j.e implements androidx.appcompat.view.menu.e.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final w1.j<String, Integer> f20890j0 = new w1.j<>();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final boolean f20891k0 = false;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int[] f20892l0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final boolean f20893m0 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public q[] M;
    public q N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public Configuration S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public n X;
    public n Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f20894a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Runnable f20895b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f20896c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Rect f20897d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Rect f20898e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public j.n f20899f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public j.p f20900g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public OnBackInvokedDispatcher f20901h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public OnBackInvokedCallback f20902i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f20903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f20904k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Window f20905l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f20906m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j.c f20907n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j.a f20908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuInflater f20909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f20910q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e0 f20911r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f20912s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r f20913t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o.b f20914u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ActionBarContextView f20915v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PopupWindow f20916w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Runnable f20917x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public y0 f20918y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f20919z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            if ((gVar.f20894a0 & 1) != 0) {
                gVar.f0(0);
            }
            g gVar2 = g.this;
            if ((gVar2.f20894a0 & Barcode.FORMAT_AZTEC) != 0) {
                gVar2.f0(108);
            }
            g gVar3 = g.this;
            gVar3.Z = false;
            gVar3.f20894a0 = 0;
        }
    }

    public class b implements y {
        public b() {
        }

        @Override // androidx.core.view.y
        public WindowInsetsCompat K(View view, WindowInsetsCompat windowInsetsCompat) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int iC1 = g.this.c1(windowInsetsCompat, null);
            if (systemWindowInsetTop != iC1) {
                windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), iC1, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
            }
            return o0.Y(view, windowInsetsCompat);
        }
    }

    public class c implements ContentFrameLayout.a {
        public c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            g.this.d0();
        }
    }

    public class d implements Runnable {

        public class a extends a1 {
            public a() {
            }

            @Override // androidx.core.view.z0
            public void b(View view) {
                g.this.f20915v.setAlpha(1.0f);
                g.this.f20918y.g(null);
                g.this.f20918y = null;
            }

            @Override // androidx.core.view.a1, androidx.core.view.z0
            public void c(View view) {
                g.this.f20915v.setVisibility(0);
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.f20916w.showAtLocation(gVar.f20915v, 55, 0, 0);
            g.this.g0();
            if (!g.this.R0()) {
                g.this.f20915v.setAlpha(1.0f);
                g.this.f20915v.setVisibility(0);
            } else {
                g.this.f20915v.setAlpha(0.0f);
                g gVar2 = g.this;
                gVar2.f20918y = o0.e(gVar2.f20915v).b(1.0f);
                g.this.f20918y.g(new a());
            }
        }
    }

    public class e extends a1 {
        public e() {
        }

        @Override // androidx.core.view.z0
        public void b(View view) {
            g.this.f20915v.setAlpha(1.0f);
            g.this.f20918y.g(null);
            g.this.f20918y = null;
        }

        @Override // androidx.core.view.a1, androidx.core.view.z0
        public void c(View view) {
            g.this.f20915v.setVisibility(0);
            if (g.this.f20915v.getParent() instanceof View) {
                o0.j0((View) g.this.f20915v.getParent());
            }
        }
    }

    public final class f implements androidx.appcompat.view.menu.i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar, boolean z10) {
            g.this.W(eVar);
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(@NonNull androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackS0 = g.this.s0();
            if (callbackS0 == null) {
                return true;
            }
            callbackS0.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: j.g$g, reason: collision with other inner class name */
    public class C0370g implements o.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o.b.a f20927a;

        /* JADX INFO: renamed from: j.g$g$a */
        public class a extends a1 {
            public a() {
            }

            @Override // androidx.core.view.z0
            public void b(View view) {
                g.this.f20915v.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.f20916w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.f20915v.getParent() instanceof View) {
                    o0.j0((View) g.this.f20915v.getParent());
                }
                g.this.f20915v.k();
                g.this.f20918y.g(null);
                g gVar2 = g.this;
                gVar2.f20918y = null;
                o0.j0(gVar2.B);
            }
        }

        public C0370g(o.b.a aVar) {
            this.f20927a = aVar;
        }

        @Override // o.b.a
        public boolean a(o.b bVar, Menu menu) {
            return this.f20927a.a(bVar, menu);
        }

        @Override // o.b.a
        public void b(o.b bVar) {
            this.f20927a.b(bVar);
            g gVar = g.this;
            if (gVar.f20916w != null) {
                gVar.f20905l.getDecorView().removeCallbacks(g.this.f20917x);
            }
            g gVar2 = g.this;
            if (gVar2.f20915v != null) {
                gVar2.g0();
                g gVar3 = g.this;
                gVar3.f20918y = o0.e(gVar3.f20915v).b(0.0f);
                g.this.f20918y.g(new a());
            }
            g gVar4 = g.this;
            j.c cVar = gVar4.f20907n;
            if (cVar != null) {
                cVar.M(gVar4.f20914u);
            }
            g gVar5 = g.this;
            gVar5.f20914u = null;
            o0.j0(gVar5.B);
            g.this.a1();
        }

        @Override // o.b.a
        public boolean c(o.b bVar, MenuItem menuItem) {
            return this.f20927a.c(bVar, menuItem);
        }

        @Override // o.b.a
        public boolean d(o.b bVar, Menu menu) {
            o0.j0(g.this.B);
            return this.f20927a.d(bVar, menu);
        }
    }

    public static class h {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    public static class i {
        public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static u2.j b(Configuration configuration) {
            return u2.j.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(u2.j jVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(jVar.g()));
        }

        public static void d(Configuration configuration, u2.j jVar) {
            configuration.setLocales(LocaleList.forLanguageTags(jVar.g()));
        }
    }

    public static class j {
        public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
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

    public static class k {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, final g gVar) {
            Objects.requireNonNull(gVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: j.j
                public final void onBackInvoked() {
                    gVar.A0();
                }
            };
            j.i.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        public static void c(Object obj, Object obj2) {
            j.i.a(obj).unregisterOnBackInvokedCallback(j.h.a(obj2));
        }
    }

    public class l extends o.i {
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f20929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f20930d;

        public l(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f20929c = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f20929c = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.b = true;
                callback.onContentChanged();
            } finally {
                this.b = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f20930d = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f20930d = false;
            }
        }

        @Override // o.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f20929c) {
                return a().dispatchKeyEvent(keyEvent);
            }
            return g.this.e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // o.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || g.this.D0(keyEvent.getKeyCode(), keyEvent);
        }

        public final ActionMode e(ActionMode.Callback callback) {
            o.f.a aVar = new o.f.a(g.this.f20904k, callback);
            o.b bVarU0 = g.this.U0(aVar);
            if (bVarU0 != null) {
                return aVar.e(bVarU0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.b) {
                a().onContentChanged();
            }
        }

        @Override // o.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // o.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            return super.onCreatePanelView(i10);
        }

        @Override // o.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            g.this.G0(i10);
            return true;
        }

        @Override // o.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f20930d) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                g.this.H0(i10);
            }
        }

        @Override // o.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.b0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            if (eVar != null) {
                eVar.b0(false);
            }
            return zOnPreparePanel;
        }

        @Override // o.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            q qVarQ0 = g.this.q0(0, true);
            if (qVarQ0 == null || (eVar = qVarQ0.f20947j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // o.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (g.this.y0() && i10 == 0) ? e(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    public class m extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PowerManager f20932c;

        public m(Context context) {
            super();
            this.f20932c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // j.g.n
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // j.g.n
        public int c() {
            return h.a(this.f20932c) ? 2 : 1;
        }

        @Override // j.g.n
        public void d() {
            g.this.Q();
        }
    }

    public abstract class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BroadcastReceiver f20934a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                n.this.d();
            }
        }

        public n() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f20934a;
            if (broadcastReceiver != null) {
                try {
                    g.this.f20904k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f20934a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f20934a == null) {
                this.f20934a = new a();
            }
            g.this.f20904k.registerReceiver(this.f20934a, intentFilterB);
        }
    }

    public class o extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s f20936c;

        public o(s sVar) {
            super();
            this.f20936c = sVar;
        }

        @Override // j.g.n
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // j.g.n
        public int c() {
            return this.f20936c.d() ? 2 : 1;
        }

        @Override // j.g.n
        public void d() {
            g.this.Q();
        }
    }

    public class p extends ContentFrameLayout {
        public p(Context context) {
            super(context);
        }

        public final boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            g.this.Y(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(k.a.b(getContext(), i10));
        }
    }

    public static final class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20939a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20941d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f20942e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f20943f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ViewGroup f20944g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public View f20945h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public View f20946i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f20947j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public androidx.appcompat.view.menu.c f20948k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Context f20949l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f20950m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f20951n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f20952o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f20953p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f20954q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f20955r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Bundle f20956s;

        public q(int i10) {
            this.f20939a = i10;
        }

        public androidx.appcompat.view.menu.j a(androidx.appcompat.view.menu.i.a aVar) {
            if (this.f20947j == null) {
                return null;
            }
            if (this.f20948k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f20949l, i.g.f19989l);
                this.f20948k = cVar;
                cVar.d(aVar);
                this.f20947j.b(this.f20948k);
            }
            return this.f20948k.j(this.f20944g);
        }

        public boolean b() {
            if (this.f20945h == null) {
                return false;
            }
            return this.f20946i != null || this.f20948k.a().getCount() > 0;
        }

        public void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f20947j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.P(this.f20948k);
            }
            this.f20947j = eVar;
            if (eVar == null || (cVar = this.f20948k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(i.a.f19886a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                themeNewTheme.applyStyle(i10, true);
            }
            themeNewTheme.resolveAttribute(i.a.H, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                themeNewTheme.applyStyle(i11, true);
            } else {
                themeNewTheme.applyStyle(i.i.f20016a, true);
            }
            o.d dVar = new o.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f20949l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(i.j.A0);
            this.b = typedArrayObtainStyledAttributes.getResourceId(i.j.D0, 0);
            this.f20943f = typedArrayObtainStyledAttributes.getResourceId(i.j.C0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final class r implements androidx.appcompat.view.menu.i.a {
        public r() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e eVarD = eVar.D();
            boolean z11 = eVarD != eVar;
            g gVar = g.this;
            if (z11) {
                eVar = eVarD;
            }
            q qVarJ0 = gVar.j0(eVar);
            if (qVarJ0 != null) {
                if (!z11) {
                    g.this.Z(qVarJ0, z10);
                } else {
                    g.this.V(qVarJ0.f20939a, qVarJ0, eVarD);
                    g.this.Z(qVarJ0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(@NonNull androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackS0;
            if (eVar != eVar.D()) {
                return true;
            }
            g gVar = g.this;
            if (!gVar.G || (callbackS0 = gVar.s0()) == null || g.this.R) {
                return true;
            }
            callbackS0.onMenuOpened(108, eVar);
            return true;
        }
    }

    public g(Activity activity, j.c cVar) {
        this(activity, null, cVar, activity);
    }

    @NonNull
    public static Configuration k0(@NonNull Configuration configuration, Configuration configuration2) {
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
            i.a(configuration, configuration2, configuration3);
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
            j.a(configuration, configuration2, configuration3);
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

    @Override // j.e
    public void A(Bundle bundle) {
    }

    public boolean A0() {
        boolean z10 = this.O;
        this.O = false;
        q qVarQ0 = q0(0, false);
        if (qVarQ0 != null && qVarQ0.f20952o) {
            if (!z10) {
                Z(qVarQ0, true);
            }
            return true;
        }
        o.b bVar = this.f20914u;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        j.a aVarR = r();
        return aVarR != null && aVarR.g();
    }

    @Override // j.e
    public void B() {
        P(true, false);
    }

    public boolean B0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.O = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            C0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // j.e
    public void C() {
        j.a aVarR = r();
        if (aVarR != null) {
            aVarR.s(false);
        }
    }

    public final boolean C0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        q qVarQ0 = q0(i10, true);
        if (qVarQ0.f20952o) {
            return false;
        }
        return M0(qVarQ0, keyEvent);
    }

    public boolean D0(int i10, KeyEvent keyEvent) {
        j.a aVarR = r();
        if (aVarR != null && aVarR.o(i10, keyEvent)) {
            return true;
        }
        q qVar = this.N;
        if (qVar != null && L0(qVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            q qVar2 = this.N;
            if (qVar2 != null) {
                qVar2.f20951n = true;
            }
            return true;
        }
        if (this.N == null) {
            q qVarQ0 = q0(0, true);
            M0(qVarQ0, keyEvent);
            boolean zL0 = L0(qVarQ0, keyEvent.getKeyCode(), keyEvent, 1);
            qVarQ0.f20950m = false;
            if (zL0) {
                return true;
            }
        }
        return false;
    }

    public boolean E0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                F0(0, keyEvent);
                return true;
            }
        } else if (A0()) {
            return true;
        }
        return false;
    }

    @Override // j.e
    public boolean F(int i10) {
        int iO0 = O0(i10);
        if (this.K && iO0 == 108) {
            return false;
        }
        if (this.G && iO0 == 1) {
            this.G = false;
        }
        if (iO0 == 1) {
            W0();
            this.K = true;
            return true;
        }
        if (iO0 == 2) {
            W0();
            this.E = true;
            return true;
        }
        if (iO0 == 5) {
            W0();
            this.F = true;
            return true;
        }
        if (iO0 == 10) {
            W0();
            this.I = true;
            return true;
        }
        if (iO0 == 108) {
            W0();
            this.G = true;
            return true;
        }
        if (iO0 != 109) {
            return this.f20905l.requestFeature(iO0);
        }
        W0();
        this.H = true;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    public final boolean F0(int i10, KeyEvent keyEvent) {
        boolean zM0;
        e0 e0Var;
        if (this.f20914u != null) {
            return false;
        }
        boolean zB = true;
        q qVarQ0 = q0(i10, true);
        if (i10 != 0 || (e0Var = this.f20911r) == null || !e0Var.a() || ViewConfiguration.get(this.f20904k).hasPermanentMenuKey()) {
            boolean z10 = qVarQ0.f20952o;
            if (z10 || qVarQ0.f20951n) {
                Z(qVarQ0, true);
                zB = z10;
            } else if (qVarQ0.f20950m) {
                if (qVarQ0.f20955r) {
                    qVarQ0.f20950m = false;
                    zM0 = M0(qVarQ0, keyEvent);
                } else {
                    zM0 = true;
                }
                if (zM0) {
                    J0(qVarQ0, keyEvent);
                } else {
                    zB = false;
                }
            } else {
                zB = false;
            }
        } else if (this.f20911r.e()) {
            zB = this.f20911r.b();
        } else if (this.R || !M0(qVarQ0, keyEvent)) {
            zB = false;
        } else {
            zB = this.f20911r.c();
        }
        if (zB) {
            AudioManager audioManager = (AudioManager) this.f20904k.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return zB;
            }
            Log.w("AppCompatDelegate", "Couldn't get audio manager");
        }
        return zB;
    }

    @Override // j.e
    public void G(int i10) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f20904k).inflate(i10, viewGroup);
        this.f20906m.c(this.f20905l.getCallback());
    }

    public void G0(int i10) {
        j.a aVarR;
        if (i10 != 108 || (aVarR = r()) == null) {
            return;
        }
        aVarR.h(true);
    }

    @Override // j.e
    public void H(View view) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f20906m.c(this.f20905l.getCallback());
    }

    public void H0(int i10) {
        if (i10 == 108) {
            j.a aVarR = r();
            if (aVarR != null) {
                aVarR.h(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            q qVarQ0 = q0(i10, true);
            if (qVarQ0.f20952o) {
                Z(qVarQ0, false);
            }
        }
    }

    @Override // j.e
    public void I(View view, ViewGroup.LayoutParams layoutParams) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f20906m.c(this.f20905l.getCallback());
    }

    public void I0(ViewGroup viewGroup) {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // j.e
    public void J(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.J(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f20901h0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f20902i0) != null) {
            k.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f20902i0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f20903j;
            if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                this.f20901h0 = onBackInvokedDispatcher;
            } else {
                this.f20901h0 = k.a((Activity) this.f20903j);
            }
        } else {
            this.f20901h0 = onBackInvokedDispatcher;
        }
        a1();
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public final void J0(q qVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (qVar.f20952o || this.R) {
            return;
        }
        if (qVar.f20939a == 0 && (this.f20904k.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackS0 = s0();
        if (callbackS0 != null && !callbackS0.onMenuOpened(qVar.f20939a, qVar.f20947j)) {
            Z(qVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f20904k.getSystemService("window");
        if (windowManager != null && M0(qVar, keyEvent)) {
            ViewGroup viewGroup = qVar.f20944g;
            if (viewGroup != null && !qVar.f20954q) {
                View view = qVar.f20946i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                }
                qVar.f20951n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, qVar.f20941d, qVar.f20942e, 1002, 8519680, -3);
                layoutParams2.gravity = qVar.f20940c;
                layoutParams2.windowAnimations = qVar.f20943f;
                windowManager.addView(qVar.f20944g, layoutParams2);
                qVar.f20952o = true;
                if (qVar.f20939a == 0) {
                    a1();
                }
            }
            if (viewGroup == null) {
                if (!v0(qVar) || qVar.f20944g == null) {
                    return;
                }
            } else if (qVar.f20954q && viewGroup.getChildCount() > 0) {
                qVar.f20944g.removeAllViews();
            }
            if (!u0(qVar) || !qVar.b()) {
                qVar.f20954q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = qVar.f20945h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            qVar.f20944g.setBackgroundResource(qVar.b);
            ViewParent parent = qVar.f20945h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(qVar.f20945h);
            }
            qVar.f20944g.addView(qVar.f20945h, layoutParams3);
            if (!qVar.f20945h.hasFocus()) {
                qVar.f20945h.requestFocus();
            }
            i10 = -2;
            qVar.f20951n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i10, -2, qVar.f20941d, qVar.f20942e, 1002, 8519680, -3);
            layoutParams4.gravity = qVar.f20940c;
            layoutParams4.windowAnimations = qVar.f20943f;
            windowManager.addView(qVar.f20944g, layoutParams4);
            qVar.f20952o = true;
            if (qVar.f20939a == 0) {
                a1();
            }
        }
    }

    @Override // j.e
    public void K(int i10) {
        this.U = i10;
    }

    public final j.a K0() {
        return this.f20908o;
    }

    @Override // j.e
    public final void L(CharSequence charSequence) {
        this.f20910q = charSequence;
        e0 e0Var = this.f20911r;
        if (e0Var != null) {
            e0Var.setWindowTitle(charSequence);
            return;
        }
        if (K0() != null) {
            K0().t(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final boolean L0(q qVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((qVar.f20950m || M0(qVar, keyEvent)) && (eVar = qVar.f20947j) != null) {
            zPerformShortcut = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.f20911r == null) {
            Z(qVar, true);
        }
        return zPerformShortcut;
    }

    public final boolean M0(q qVar, KeyEvent keyEvent) {
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        if (this.R) {
            return false;
        }
        if (qVar.f20950m) {
            return true;
        }
        q qVar2 = this.N;
        if (qVar2 != null && qVar2 != qVar) {
            Z(qVar2, false);
        }
        Window.Callback callbackS0 = s0();
        if (callbackS0 != null) {
            qVar.f20946i = callbackS0.onCreatePanelView(qVar.f20939a);
        }
        int i10 = qVar.f20939a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (e0Var3 = this.f20911r) != null) {
            e0Var3.f();
        }
        if (qVar.f20946i == null) {
            if (z10) {
                K0();
            }
            androidx.appcompat.view.menu.e eVar = qVar.f20947j;
            if (eVar == null || qVar.f20955r) {
                if (eVar == null && (!w0(qVar) || qVar.f20947j == null)) {
                    return false;
                }
                if (z10 && this.f20911r != null) {
                    if (this.f20912s == null) {
                        this.f20912s = new f();
                    }
                    this.f20911r.d(qVar.f20947j, this.f20912s);
                }
                qVar.f20947j.e0();
                if (!callbackS0.onCreatePanelMenu(qVar.f20939a, qVar.f20947j)) {
                    qVar.c(null);
                    if (z10 && (e0Var = this.f20911r) != null) {
                        e0Var.d(null, this.f20912s);
                    }
                    return false;
                }
                qVar.f20955r = false;
            }
            qVar.f20947j.e0();
            Bundle bundle = qVar.f20956s;
            if (bundle != null) {
                qVar.f20947j.Q(bundle);
                qVar.f20956s = null;
            }
            if (!callbackS0.onPreparePanel(0, qVar.f20946i, qVar.f20947j)) {
                if (z10 && (e0Var2 = this.f20911r) != null) {
                    e0Var2.d(null, this.f20912s);
                }
                qVar.f20947j.d0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            qVar.f20953p = z11;
            qVar.f20947j.setQwertyMode(z11);
            qVar.f20947j.d0();
        }
        qVar.f20950m = true;
        qVar.f20951n = false;
        this.N = qVar;
        return true;
    }

    public final void N0(boolean z10) {
        e0 e0Var = this.f20911r;
        if (e0Var == null || !e0Var.a() || (ViewConfiguration.get(this.f20904k).hasPermanentMenuKey() && !this.f20911r.g())) {
            q qVarQ0 = q0(0, true);
            qVarQ0.f20954q = true;
            Z(qVarQ0, false);
            J0(qVarQ0, null);
            return;
        }
        Window.Callback callbackS0 = s0();
        if (this.f20911r.e() && z10) {
            this.f20911r.b();
            if (this.R) {
                return;
            }
            callbackS0.onPanelClosed(108, q0(0, true).f20947j);
            return;
        }
        if (callbackS0 == null || this.R) {
            return;
        }
        if (this.Z && (this.f20894a0 & 1) != 0) {
            this.f20905l.getDecorView().removeCallbacks(this.f20895b0);
            this.f20895b0.run();
        }
        q qVarQ1 = q0(0, true);
        androidx.appcompat.view.menu.e eVar = qVarQ1.f20947j;
        if (eVar == null || qVarQ1.f20955r || !callbackS0.onPreparePanel(0, qVarQ1.f20946i, eVar)) {
            return;
        }
        callbackS0.onMenuOpened(108, qVarQ1.f20947j);
        this.f20911r.c();
    }

    public final boolean O(boolean z10) {
        return P(z10, true);
    }

    public final int O0(int i10) {
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

    public final boolean P(boolean z10, boolean z11) {
        if (this.R) {
            return false;
        }
        int iU = U();
        int iZ0 = z0(this.f20904k, iU);
        u2.j jVarT = Build.VERSION.SDK_INT < 33 ? T(this.f20904k) : null;
        if (!z11 && jVarT != null) {
            jVarT = p0(this.f20904k.getResources().getConfiguration());
        }
        boolean zZ0 = Z0(iZ0, jVarT, z10);
        if (iU == 0) {
            o0(this.f20904k).e();
        } else {
            n nVar = this.X;
            if (nVar != null) {
                nVar.a();
            }
        }
        if (iU == 3) {
            n0(this.f20904k).e();
            return zZ0;
        }
        n nVar2 = this.Y;
        if (nVar2 != null) {
            nVar2.a();
        }
        return zZ0;
    }

    public void P0(Configuration configuration, @NonNull u2.j jVar) {
        i.d(configuration, jVar);
    }

    public boolean Q() {
        return O(true);
    }

    public void Q0(u2.j jVar) {
        i.c(jVar);
    }

    public final void R() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.B.findViewById(R.id.content);
        View decorView = this.f20905l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f20904k.obtainStyledAttributes(i.j.A0);
        typedArrayObtainStyledAttributes.getValue(i.j.M0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(i.j.N0, contentFrameLayout.getMinWidthMinor());
        int i10 = i.j.K0;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = i.j.L0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            typedArrayObtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = i.j.I0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            typedArrayObtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = i.j.J0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            typedArrayObtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final boolean R0() {
        ViewGroup viewGroup;
        return this.A && (viewGroup = this.B) != null && viewGroup.isLaidOut();
    }

    public final void S(@NonNull Window window) {
        if (this.f20905l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof l) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        l lVar = new l(callback);
        this.f20906m = lVar;
        window.setCallback(lVar);
        q.a1 a1VarU = q.a1.u(this.f20904k, null, f20892l0);
        Drawable drawableH = a1VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        a1VarU.x();
        this.f20905l = window;
        if (Build.VERSION.SDK_INT < 33 || this.f20901h0 != null) {
            return;
        }
        J(null);
    }

    public final boolean S0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f20905l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    public u2.j T(@NonNull Context context) {
        u2.j jVarQ;
        if (Build.VERSION.SDK_INT >= 33 || (jVarQ = j.e.q()) == null) {
            return null;
        }
        u2.j jVarP0 = p0(context.getApplicationContext().getResources().getConfiguration());
        u2.j jVarB = j.q.b(jVarQ, jVarP0);
        return jVarB.e() ? jVarP0 : jVarB;
    }

    public boolean T0() {
        if (this.f20901h0 == null) {
            return false;
        }
        q qVarQ0 = q0(0, false);
        return (qVarQ0 != null && qVarQ0.f20952o) || this.f20914u != null;
    }

    public final int U() {
        int i10 = this.T;
        return i10 != -100 ? i10 : j.e.m();
    }

    public o.b U0(@NonNull o.b.a aVar) {
        j.c cVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        o.b bVar = this.f20914u;
        if (bVar != null) {
            bVar.c();
        }
        C0370g c0370g = new C0370g(aVar);
        j.a aVarR = r();
        if (aVarR != null) {
            o.b bVarU = aVarR.u(c0370g);
            this.f20914u = bVarU;
            if (bVarU != null && (cVar = this.f20907n) != null) {
                cVar.x(bVarU);
            }
        }
        if (this.f20914u == null) {
            this.f20914u = V0(c0370g);
        }
        a1();
        return this.f20914u;
    }

    public void V(int i10, q qVar, Menu menu) {
        if (menu == null) {
            if (qVar == null && i10 >= 0) {
                q[] qVarArr = this.M;
                if (i10 < qVarArr.length) {
                    qVar = qVarArr[i10];
                }
            }
            if (qVar != null) {
                menu = qVar.f20947j;
            }
        }
        if ((qVar == null || qVar.f20952o) && !this.R) {
            this.f20906m.d(this.f20905l.getCallback(), i10, menu);
        }
    }

    public o.b V0(@NonNull o.b.a aVar) {
        o.b bVarS;
        Context dVar;
        j.c cVar;
        g0();
        o.b bVar = this.f20914u;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof C0370g)) {
            aVar = new C0370g(aVar);
        }
        j.c cVar2 = this.f20907n;
        if (cVar2 == null || this.R) {
            bVarS = null;
        } else {
            try {
                bVarS = cVar2.s(aVar);
            } catch (AbstractMethodError unused) {
                bVarS = null;
            }
        }
        if (bVarS != null) {
            this.f20914u = bVarS;
        } else {
            if (this.f20915v == null) {
                if (this.J) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f20904k.getTheme();
                    theme.resolveAttribute(i.a.f19890f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f20904k.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new o.d(this.f20904k, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f20904k;
                    }
                    this.f20915v = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, i.a.f19893i);
                    this.f20916w = popupWindow;
                    d3.h.b(popupWindow, 2);
                    this.f20916w.setContentView(this.f20915v);
                    this.f20916w.setWidth(-1);
                    dVar.getTheme().resolveAttribute(i.a.b, typedValue, true);
                    this.f20915v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f20916w.setHeight(-2);
                    this.f20917x = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.B.findViewById(i.f.f19960h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(l0()));
                        this.f20915v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f20915v != null) {
                g0();
                this.f20915v.k();
                o.e eVar = new o.e(this.f20915v.getContext(), this.f20915v, aVar, this.f20916w == null);
                if (aVar.a(eVar, eVar.e())) {
                    eVar.k();
                    this.f20915v.h(eVar);
                    this.f20914u = eVar;
                    if (R0()) {
                        this.f20915v.setAlpha(0.0f);
                        y0 y0VarB = o0.e(this.f20915v).b(1.0f);
                        this.f20918y = y0VarB;
                        y0VarB.g(new e());
                    } else {
                        this.f20915v.setAlpha(1.0f);
                        this.f20915v.setVisibility(0);
                        if (this.f20915v.getParent() instanceof View) {
                            o0.j0((View) this.f20915v.getParent());
                        }
                    }
                    if (this.f20916w != null) {
                        this.f20905l.getDecorView().post(this.f20917x);
                    }
                } else {
                    this.f20914u = null;
                }
            }
        }
        o.b bVar2 = this.f20914u;
        if (bVar2 != null && (cVar = this.f20907n) != null) {
            cVar.x(bVar2);
        }
        a1();
        return this.f20914u;
    }

    public void W(@NonNull androidx.appcompat.view.menu.e eVar) {
        if (this.L) {
            return;
        }
        this.L = true;
        this.f20911r.l();
        Window.Callback callbackS0 = s0();
        if (callbackS0 != null && !this.R) {
            callbackS0.onPanelClosed(108, eVar);
        }
        this.L = false;
    }

    public final void W0() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void X() {
        n nVar = this.X;
        if (nVar != null) {
            nVar.a();
        }
        n nVar2 = this.Y;
        if (nVar2 != null) {
            nVar2.a();
        }
    }

    public final j.b X0() {
        for (Context baseContext = this.f20904k; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof j.b) {
                return (j.b) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public void Y(int i10) {
        Z(q0(i10, true), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y0(Configuration configuration) {
        Activity activity = (Activity) this.f20903j;
        if (activity instanceof androidx.p000lifecycle.s) {
            if (((androidx.p000lifecycle.s) activity).a().getState().b(androidx.lifecycle.l.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.Q || this.R) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    public void Z(q qVar, boolean z10) {
        ViewGroup viewGroup;
        e0 e0Var;
        if (z10 && qVar.f20939a == 0 && (e0Var = this.f20911r) != null && e0Var.e()) {
            W(qVar.f20947j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f20904k.getSystemService("window");
        if (windowManager != null && qVar.f20952o && (viewGroup = qVar.f20944g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                V(qVar.f20939a, qVar, null);
            }
        }
        qVar.f20950m = false;
        qVar.f20951n = false;
        qVar.f20952o = false;
        qVar.f20945h = null;
        qVar.f20954q = true;
        if (this.N == qVar) {
            this.N = null;
        }
        if (qVar.f20939a == 0) {
            a1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    public final boolean Z0(int i10, u2.j jVar, boolean z10) {
        boolean z11;
        Configuration configurationA0 = a0(this.f20904k, i10, jVar, null, false);
        int iM0 = m0(this.f20904k);
        Configuration configuration = this.S;
        if (configuration == null) {
            configuration = this.f20904k.getResources().getConfiguration();
        }
        int i11 = configuration.uiMode & 48;
        int i12 = configurationA0.uiMode & 48;
        u2.j jVarP0 = p0(configuration);
        u2.j jVarP1 = jVar == null ? null : p0(configurationA0);
        int i13 = i11 != i12 ? Barcode.FORMAT_UPC_A : 0;
        if (jVarP1 != null && !jVarP0.equals(jVarP1)) {
            i13 |= 8196;
        }
        boolean z12 = true;
        if (((~iM0) & i13) != 0 && z10 && this.P && (f20893m0 || this.Q)) {
            Object obj = this.f20903j;
            if (!(obj instanceof Activity) || ((Activity) obj).isChild()) {
                z11 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i13 & 8192) != 0) {
                    ((Activity) this.f20903j).getWindow().getDecorView().setLayoutDirection(configurationA0.getLayoutDirection());
                }
                k2.b.t((Activity) this.f20903j);
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (z11 || i13 == 0) {
            z12 = z11;
        } else {
            b1(i12, jVarP1, (i13 & iM0) == i13, null);
        }
        if (z12) {
            Object obj2 = this.f20903j;
            if (obj2 instanceof j.b) {
                if ((i13 & Barcode.FORMAT_UPC_A) != 0) {
                    ((j.b) obj2).x1(i10);
                }
                if ((i13 & 4) != 0) {
                    ((j.b) this.f20903j).w1(jVar);
                }
            }
        }
        if (jVarP1 != null) {
            Q0(p0(this.f20904k.getResources().getConfiguration()));
        }
        return z12;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
        q qVarJ0;
        Window.Callback callbackS0 = s0();
        if (callbackS0 == null || this.R || (qVarJ0 = j0(eVar.D())) == null) {
            return false;
        }
        return callbackS0.onMenuItemSelected(qVarJ0.f20939a, menuItem);
    }

    @NonNull
    public final Configuration a0(@NonNull Context context, int i10, u2.j jVar, Configuration configuration, boolean z10) {
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
        if (jVar != null) {
            P0(configuration2, jVar);
        }
        return configuration2;
    }

    public void a1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zT0 = T0();
            if (zT0 && this.f20902i0 == null) {
                this.f20902i0 = k.b(this.f20901h0, this);
            } else {
                if (zT0 || (onBackInvokedCallback = this.f20902i0) == null) {
                    return;
                }
                k.c(this.f20901h0, onBackInvokedCallback);
                this.f20902i0 = null;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
        N0(true);
    }

    public final ViewGroup b0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f20904k.obtainStyledAttributes(i.j.A0);
        int i10 = i.j.F0;
        if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.O0, false)) {
            F(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i10, false)) {
            F(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.G0, false)) {
            F(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.H0, false)) {
            F(10);
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(i.j.B0, false);
        typedArrayObtainStyledAttributes.recycle();
        i0();
        this.f20905l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f20904k);
        if (this.K) {
            viewGroup = this.I ? (ViewGroup) layoutInflaterFrom.inflate(i.g.f19994q, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(i.g.f19993p, (ViewGroup) null);
        } else if (this.J) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(i.g.f19985h, (ViewGroup) null);
            this.H = false;
            this.G = false;
        } else if (this.G) {
            TypedValue typedValue = new TypedValue();
            this.f20904k.getTheme().resolveAttribute(i.a.f19890f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new o.d(this.f20904k, typedValue.resourceId) : this.f20904k).inflate(i.g.f19995r, (ViewGroup) null);
            e0 e0Var = (e0) viewGroup.findViewById(i.f.f19969q);
            this.f20911r = e0Var;
            e0Var.setWindowCallback(s0());
            if (this.H) {
                this.f20911r.h(109);
            }
            if (this.E) {
                this.f20911r.h(2);
            }
            if (this.F) {
                this.f20911r.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.J + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.K + " }");
        }
        o0.A0(viewGroup, new b());
        if (this.f20911r == null) {
            this.C = (TextView) viewGroup.findViewById(i.f.R);
        }
        g1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(i.f.b);
        ViewGroup viewGroup2 = (ViewGroup) this.f20905l.findViewById(R.id.content);
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
        this.f20905l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    public final void b1(int i10, u2.j jVar, boolean z10, Configuration configuration) {
        Resources resources = this.f20904k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (jVar != null) {
            P0(configuration2, jVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i11 = this.U;
        if (i11 != 0) {
            this.f20904k.setTheme(i11);
            this.f20904k.getTheme().applyStyle(this.U, true);
        }
        if (z10 && (this.f20903j instanceof Activity)) {
            Y0(configuration2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View c0(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean z10;
        if (this.f20899f0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f20904k.obtainStyledAttributes(i.j.A0);
            String string = typedArrayObtainStyledAttributes.getString(i.j.E0);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f20899f0 = new j.n();
            } else {
                try {
                    this.f20899f0 = (j.n) this.f20904k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f20899f0 = new j.n();
                }
            }
        }
        boolean z11 = f20891k0;
        boolean zS0 = false;
        if (z11) {
            if (this.f20900g0 == null) {
                this.f20900g0 = new j.p();
            }
            if (this.f20900g0.a(attributeSet)) {
                z10 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zS0 = S0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zS0 = true;
                }
                z10 = zS0;
            }
        } else {
            z10 = zS0;
        }
        return this.f20899f0.r(view, str, context, attributeSet, z10, z11, true, f1.c());
    }

    public final int c1(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        int systemWindowInsetTop;
        boolean z10;
        boolean z11;
        if (windowInsetsCompat != null) {
            systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        } else {
            systemWindowInsetTop = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f20915v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f20915v.getLayoutParams();
            boolean z12 = true;
            if (this.f20915v.isShown()) {
                if (this.f20897d0 == null) {
                    this.f20897d0 = new Rect();
                    this.f20898e0 = new Rect();
                }
                Rect rect2 = this.f20897d0;
                Rect rect3 = this.f20898e0;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                }
                g1.a(this.B, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                WindowInsetsCompat windowInsetsCompatF = o0.F(this.B);
                int systemWindowInsetLeft = windowInsetsCompatF == null ? 0 : windowInsetsCompatF.getSystemWindowInsetLeft();
                int systemWindowInsetRight = windowInsetsCompatF == null ? 0 : windowInsetsCompatF.getSystemWindowInsetRight();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.D != null) {
                    View view = this.D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != systemWindowInsetLeft || marginLayoutParams2.rightMargin != systemWindowInsetRight) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = systemWindowInsetLeft;
                            marginLayoutParams2.rightMargin = systemWindowInsetRight;
                            this.D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f20904k);
                    this.D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = systemWindowInsetLeft;
                    layoutParams.rightMargin = systemWindowInsetRight;
                    this.B.addView(this.D, -1, layoutParams);
                }
                View view3 = this.D;
                z12 = view3 != null;
                if (z12 && view3.getVisibility() != 0) {
                    d1(this.D);
                }
                if (!this.I && z12) {
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
                this.f20915v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.D;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return systemWindowInsetTop;
    }

    public void d0() {
        androidx.appcompat.view.menu.e eVar;
        e0 e0Var = this.f20911r;
        if (e0Var != null) {
            e0Var.l();
        }
        if (this.f20916w != null) {
            this.f20905l.getDecorView().removeCallbacks(this.f20917x);
            if (this.f20916w.isShowing()) {
                try {
                    this.f20916w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f20916w = null;
        }
        g0();
        q qVarQ0 = q0(0, false);
        if (qVarQ0 == null || (eVar = qVarQ0.f20947j) == null) {
            return;
        }
        eVar.close();
    }

    public final void d1(View view) {
        view.setBackgroundColor((o0.K(view) & 8192) != 0 ? l2.b.c(this.f20904k, i.c.b) : l2.b.c(this.f20904k, i.c.f19912a));
    }

    @Override // j.e
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        h0();
        ((ViewGroup) this.B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f20906m.c(this.f20905l.getCallback());
    }

    public boolean e0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f20903j;
        if (((obj instanceof androidx.core.view.l.a) || (obj instanceof j.l)) && (decorView = this.f20905l.getDecorView()) != null && androidx.core.view.l.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f20906m.b(this.f20905l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? B0(keyCode, keyEvent) : E0(keyCode, keyEvent);
    }

    public void f0(int i10) {
        q qVarQ0;
        q qVarQ1 = q0(i10, true);
        if (qVarQ1.f20947j != null) {
            Bundle bundle = new Bundle();
            qVarQ1.f20947j.R(bundle);
            if (bundle.size() > 0) {
                qVarQ1.f20956s = bundle;
            }
            qVarQ1.f20947j.e0();
            qVarQ1.f20947j.clear();
        }
        qVarQ1.f20955r = true;
        qVarQ1.f20954q = true;
        if ((i10 != 108 && i10 != 0) || this.f20911r == null || (qVarQ0 = q0(0, false)) == null) {
            return;
        }
        qVarQ0.f20950m = false;
        M0(qVarQ0, null);
    }

    @Override // j.e
    @NonNull
    public Context g(@NonNull Context context) {
        Context context2;
        this.P = true;
        int iZ0 = z0(context, U());
        if (j.e.u(context)) {
            j.e.N(context);
        }
        u2.j jVarT = T(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(a0(context2, iZ0, jVarT, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof o.d) {
            try {
                ((o.d) context2).a(a0(context2, iZ0, jVarT, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f20893m0) {
            return super.g(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationA0 = a0(context2, iZ0, jVarT, !configuration2.equals(configuration3) ? k0(configuration2, configuration3) : null, true);
        o.d dVar = new o.d(context2, i.i.b);
        dVar.a(configurationA0);
        try {
            if (context2.getTheme() != null) {
                n2.h.g.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.g(dVar);
    }

    public void g0() {
        y0 y0Var = this.f20918y;
        if (y0Var != null) {
            y0Var.c();
        }
    }

    public final void h0() {
        if (this.A) {
            return;
        }
        this.B = b0();
        CharSequence charSequenceR0 = r0();
        if (!TextUtils.isEmpty(charSequenceR0)) {
            e0 e0Var = this.f20911r;
            if (e0Var != null) {
                e0Var.setWindowTitle(charSequenceR0);
            } else if (K0() != null) {
                K0().t(charSequenceR0);
            } else {
                TextView textView = this.C;
                if (textView != null) {
                    textView.setText(charSequenceR0);
                }
            }
        }
        R();
        I0(this.B);
        this.A = true;
        q qVarQ0 = q0(0, false);
        if (this.R) {
            return;
        }
        if (qVarQ0 == null || qVarQ0.f20947j == null) {
            x0(108);
        }
    }

    public final void i0() {
        if (this.f20905l == null) {
            Object obj = this.f20903j;
            if (obj instanceof Activity) {
                S(((Activity) obj).getWindow());
            }
        }
        if (this.f20905l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // j.e
    public <T extends View> T j(int i10) {
        h0();
        return (T) this.f20905l.findViewById(i10);
    }

    public q j0(Menu menu) {
        q[] qVarArr = this.M;
        int length = qVarArr != null ? qVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            q qVar = qVarArr[i10];
            if (qVar != null && qVar.f20947j == menu) {
                return qVar;
            }
        }
        return null;
    }

    @Override // j.e
    public Context l() {
        return this.f20904k;
    }

    public final Context l0() {
        j.a aVarR = r();
        Context contextJ = aVarR != null ? aVarR.j() : null;
        return contextJ == null ? this.f20904k : contextJ;
    }

    public final int m0(Context context) {
        if (!this.W && (this.f20903j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f20903j.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.V = 0;
            }
        }
        this.W = true;
        return this.V;
    }

    @Override // j.e
    public int n() {
        return this.T;
    }

    public final n n0(@NonNull Context context) {
        if (this.Y == null) {
            this.Y = new m(context);
        }
        return this.Y;
    }

    public final n o0(@NonNull Context context) {
        if (this.X == null) {
            this.X = new o(s.a(context));
        }
        return this.X;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return c0(view, str, context, attributeSet);
    }

    @Override // j.e
    public MenuInflater p() {
        if (this.f20909p == null) {
            t0();
            j.a aVar = this.f20908o;
            this.f20909p = new o.g(aVar != null ? aVar.j() : this.f20904k);
        }
        return this.f20909p;
    }

    public u2.j p0(Configuration configuration) {
        return i.b(configuration);
    }

    public q q0(int i10, boolean z10) {
        q[] qVarArr = this.M;
        if (qVarArr == null || qVarArr.length <= i10) {
            q[] qVarArr2 = new q[i10 + 1];
            if (qVarArr != null) {
                System.arraycopy(qVarArr, 0, qVarArr2, 0, qVarArr.length);
            }
            this.M = qVarArr2;
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

    @Override // j.e
    public j.a r() {
        t0();
        return this.f20908o;
    }

    public final CharSequence r0() {
        Object obj = this.f20903j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f20910q;
    }

    @Override // j.e
    public void s() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f20904k);
        if (layoutInflaterFrom.getFactory() == null) {
            androidx.core.view.m.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof g) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final Window.Callback s0() {
        return this.f20905l.getCallback();
    }

    @Override // j.e
    public void t() {
        if (K0() == null || r().l()) {
            return;
        }
        x0(0);
    }

    public final void t0() {
        h0();
        if (this.G && this.f20908o == null) {
            Object obj = this.f20903j;
            if (obj instanceof Activity) {
                this.f20908o = new t((Activity) this.f20903j, this.H);
            } else if (obj instanceof Dialog) {
                this.f20908o = new t((Dialog) this.f20903j);
            }
            j.a aVar = this.f20908o;
            if (aVar != null) {
                aVar.r(this.f20896c0);
            }
        }
    }

    public final boolean u0(q qVar) {
        View view = qVar.f20946i;
        if (view != null) {
            qVar.f20945h = view;
            return true;
        }
        if (qVar.f20947j == null) {
            return false;
        }
        if (this.f20913t == null) {
            this.f20913t = new r();
        }
        View view2 = (View) qVar.a(this.f20913t);
        qVar.f20945h = view2;
        return view2 != null;
    }

    @Override // j.e
    public void v(Configuration configuration) {
        j.a aVarR;
        if (this.G && this.A && (aVarR = r()) != null) {
            aVarR.m(configuration);
        }
        q.k.b().g(this.f20904k);
        this.S = new Configuration(this.f20904k.getResources().getConfiguration());
        P(false, false);
    }

    public final boolean v0(q qVar) {
        qVar.d(l0());
        qVar.f20944g = new p(qVar.f20949l);
        qVar.f20940c = 81;
        return true;
    }

    @Override // j.e
    public void w(Bundle bundle) {
        String strC;
        this.P = true;
        O(false);
        i0();
        Object obj = this.f20903j;
        if (obj instanceof Activity) {
            try {
                strC = k2.i.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                j.a aVarK0 = K0();
                if (aVarK0 == null) {
                    this.f20896c0 = true;
                } else {
                    aVarK0.r(true);
                }
            }
            j.e.d(this);
        }
        this.S = new Configuration(this.f20904k.getResources().getConfiguration());
        this.Q = true;
    }

    public final boolean w0(q qVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f20904k;
        int i10 = qVar.f20939a;
        if ((i10 == 0 || i10 == 108) && this.f20911r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(i.a.f19890f, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(i.a.f19891g, typedValue, true);
            } else {
                theme.resolveAttribute(i.a.f19891g, typedValue, true);
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
                o.d dVar = new o.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.S(this);
        qVar.c(eVar);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    @Override // j.e
    public void x() {
        if (this.f20903j instanceof Activity) {
            j.e.D(this);
        }
        if (this.Z) {
            this.f20905l.getDecorView().removeCallbacks(this.f20895b0);
        }
        this.R = true;
        if (this.T != -100) {
            Object obj = this.f20903j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f20890j0.put(this.f20903j.getClass().getName(), Integer.valueOf(this.T));
            } else {
                f20890j0.remove(this.f20903j.getClass().getName());
            }
        } else {
            f20890j0.remove(this.f20903j.getClass().getName());
        }
        j.a aVar = this.f20908o;
        if (aVar != null) {
            aVar.n();
        }
        X();
    }

    public final void x0(int i10) {
        this.f20894a0 = (1 << i10) | this.f20894a0;
        if (this.Z) {
            return;
        }
        o0.e0(this.f20905l.getDecorView(), this.f20895b0);
        this.Z = true;
    }

    @Override // j.e
    public void y(Bundle bundle) {
        h0();
    }

    public boolean y0() {
        return this.f20919z;
    }

    @Override // j.e
    public void z() {
        j.a aVarR = r();
        if (aVarR != null) {
            aVarR.s(true);
        }
    }

    public int z0(@NonNull Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return o0(context).c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return n0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    public g(Dialog dialog, j.c cVar) {
        this(dialog.getContext(), dialog.getWindow(), cVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public g(Context context, Window window, j.c cVar, Object obj) {
        w1.j<String, Integer> jVar;
        Integer num;
        j.b bVarX0;
        this.f20918y = null;
        this.f20919z = true;
        this.T = -100;
        this.f20895b0 = new a();
        this.f20904k = context;
        this.f20907n = cVar;
        this.f20903j = obj;
        if (this.T == -100 && (obj instanceof Dialog) && (bVarX0 = X0()) != null) {
            this.T = bVarX0.s1().n();
        }
        if (this.T == -100 && (num = (jVar = f20890j0).get(obj.getClass().getName())) != null) {
            this.T = num.intValue();
            jVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            S(window);
        }
        q.k.h();
    }
}
