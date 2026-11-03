package j;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.a1;
import androidx.core.view.b1;
import androidx.core.view.o0;
import androidx.core.view.y0;
import androidx.core.view.z0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import q.f0;

/* JADX INFO: loaded from: classes.dex */
public class t extends j.a implements ActionBarOverlayLayout.d {
    public static final Interpolator E = new AccelerateInterpolator();
    public static final Interpolator F = new DecelerateInterpolator();
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f21553a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f21554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarOverlayLayout f21555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContainer f21556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f0 f21557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActionBarContextView f21558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f21559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.appcompat.widget.c f21560i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f21563l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f21564m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o.b f21565n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o.b.a f21566o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f21567p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f21569r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f21572u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21573v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21574w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o.h f21576y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f21577z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<Object> f21561j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21562k = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<j.a.b> f21568q = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f21570s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f21571t = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f21575x = true;
    public final z0 B = new a();
    public final z0 C = new b();
    public final b1 D = new c();

    public class a extends a1 {
        public a() {
        }

        @Override // androidx.core.view.z0
        public void b(View view) {
            View view2;
            t tVar = t.this;
            if (tVar.f21571t && (view2 = tVar.f21559h) != null) {
                view2.setTranslationY(0.0f);
                t.this.f21556e.setTranslationY(0.0f);
            }
            t.this.f21556e.setVisibility(8);
            t.this.f21556e.setTransitioning(false);
            t tVar2 = t.this;
            tVar2.f21576y = null;
            tVar2.x();
            ActionBarOverlayLayout actionBarOverlayLayout = t.this.f21555d;
            if (actionBarOverlayLayout != null) {
                o0.j0(actionBarOverlayLayout);
            }
        }
    }

    public class b extends a1 {
        public b() {
        }

        @Override // androidx.core.view.z0
        public void b(View view) {
            t tVar = t.this;
            tVar.f21576y = null;
            tVar.f21556e.requestLayout();
        }
    }

    public class c implements b1 {
        public c() {
        }

        @Override // androidx.core.view.b1
        public void a(View view) {
            ((View) t.this.f21556e.getParent()).invalidate();
        }
    }

    public class d extends o.b implements androidx.appcompat.view.menu.e.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f21581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.appcompat.view.menu.e f21582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public o.b.a f21583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public WeakReference<View> f21584f;

        public d(Context context, o.b.a aVar) {
            this.f21581c = context;
            this.f21583e = aVar;
            androidx.appcompat.view.menu.e eVarT = new androidx.appcompat.view.menu.e(context).T(1);
            this.f21582d = eVarT;
            eVarT.S(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
            o.b.a aVar = this.f21583e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
            if (this.f21583e == null) {
                return;
            }
            k();
            t.this.f21558g.l();
        }

        @Override // o.b
        public void c() {
            t tVar = t.this;
            if (tVar.f21564m != this) {
                return;
            }
            if (t.w(tVar.f21572u, tVar.f21573v, false)) {
                this.f21583e.b(this);
            } else {
                t tVar2 = t.this;
                tVar2.f21565n = this;
                tVar2.f21566o = this.f21583e;
            }
            this.f21583e = null;
            t.this.v(false);
            t.this.f21558g.g();
            t tVar3 = t.this;
            tVar3.f21555d.setHideOnContentScrollEnabled(tVar3.A);
            t.this.f21564m = null;
        }

        @Override // o.b
        public View d() {
            WeakReference<View> weakReference = this.f21584f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // o.b
        public Menu e() {
            return this.f21582d;
        }

        @Override // o.b
        public MenuInflater f() {
            return new o.g(this.f21581c);
        }

        @Override // o.b
        public CharSequence g() {
            return t.this.f21558g.getSubtitle();
        }

        @Override // o.b
        public CharSequence i() {
            return t.this.f21558g.getTitle();
        }

        @Override // o.b
        public void k() {
            if (t.this.f21564m != this) {
                return;
            }
            this.f21582d.e0();
            try {
                this.f21583e.d(this, this.f21582d);
            } finally {
                this.f21582d.d0();
            }
        }

        @Override // o.b
        public boolean l() {
            return t.this.f21558g.j();
        }

        @Override // o.b
        public void m(View view) {
            t.this.f21558g.setCustomView(view);
            this.f21584f = new WeakReference<>(view);
        }

        @Override // o.b
        public void n(int i10) {
            o(t.this.f21553a.getResources().getString(i10));
        }

        @Override // o.b
        public void o(CharSequence charSequence) {
            t.this.f21558g.setSubtitle(charSequence);
        }

        @Override // o.b
        public void q(int i10) {
            r(t.this.f21553a.getResources().getString(i10));
        }

        @Override // o.b
        public void r(CharSequence charSequence) {
            t.this.f21558g.setTitle(charSequence);
        }

        @Override // o.b
        public void s(boolean z10) {
            super.s(z10);
            t.this.f21558g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f21582d.e0();
            try {
                return this.f21583e.a(this, this.f21582d);
            } finally {
                this.f21582d.d0();
            }
        }
    }

    public t(Activity activity, boolean z10) {
        this.f21554c = activity;
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (z10) {
            return;
        }
        this.f21559h = decorView.findViewById(R.id.content);
    }

    public static boolean w(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f0 A(View view) {
        if (view instanceof f0) {
            return (f0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    public int B() {
        return this.f21557f.j();
    }

    public final void C() {
        if (this.f21574w) {
            this.f21574w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f21555d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    public final void D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(i.f.f20085q);
        this.f21555d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f21557f = A(view.findViewById(i.f.f20070a));
        this.f21558g = (ActionBarContextView) view.findViewById(i.f.f20074f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(i.f.f20071c);
        this.f21556e = actionBarContainer;
        f0 f0Var = this.f21557f;
        if (f0Var == null || this.f21558g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f21553a = f0Var.getContext();
        boolean z10 = (this.f21557f.s() & 4) != 0;
        if (z10) {
            this.f21563l = true;
        }
        o.a aVarB = o.a.b(this.f21553a);
        J(aVarB.a() || z10);
        H(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f21553a.obtainStyledAttributes(null, i.j.f20134a, i.a.f20003c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.f20183k, false)) {
            I(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.j.f20173i, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void E(boolean z10) {
        F(z10 ? 4 : 0, 4);
    }

    public void F(int i10, int i11) {
        int iS = this.f21557f.s();
        if ((i11 & 4) != 0) {
            this.f21563l = true;
        }
        this.f21557f.i((i10 & i11) | ((~i11) & iS));
    }

    public void G(float f10) {
        o0.u0(this.f21556e, f10);
    }

    public final void H(boolean z10) {
        this.f21569r = z10;
        if (z10) {
            this.f21556e.setTabContainer(null);
            this.f21557f.p(this.f21560i);
        } else {
            this.f21557f.p(null);
            this.f21556e.setTabContainer(this.f21560i);
        }
        boolean z11 = B() == 2;
        androidx.appcompat.widget.c cVar = this.f21560i;
        if (cVar != null) {
            if (z11) {
                cVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f21555d;
                if (actionBarOverlayLayout != null) {
                    o0.j0(actionBarOverlayLayout);
                }
            } else {
                cVar.setVisibility(8);
            }
        }
        this.f21557f.n(!this.f21569r && z11);
        this.f21555d.setHasNonEmbeddedTabs(!this.f21569r && z11);
    }

    public void I(boolean z10) {
        if (z10 && !this.f21555d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z10;
        this.f21555d.setHideOnContentScrollEnabled(z10);
    }

    public void J(boolean z10) {
        this.f21557f.l(z10);
    }

    public final boolean K() {
        return this.f21556e.isLaidOut();
    }

    public final void L() {
        if (this.f21574w) {
            return;
        }
        this.f21574w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f21555d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        M(false);
    }

    public final void M(boolean z10) {
        if (w(this.f21572u, this.f21573v, this.f21574w)) {
            if (this.f21575x) {
                return;
            }
            this.f21575x = true;
            z(z10);
            return;
        }
        if (this.f21575x) {
            this.f21575x = false;
            y(z10);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f21573v) {
            this.f21573v = false;
            M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f21571t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f21573v) {
            return;
        }
        this.f21573v = true;
        M(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        o.h hVar = this.f21576y;
        if (hVar != null) {
            hVar.a();
            this.f21576y = null;
        }
    }

    @Override // j.a
    public boolean g() {
        f0 f0Var = this.f21557f;
        if (f0Var == null || !f0Var.h()) {
            return false;
        }
        this.f21557f.collapseActionView();
        return true;
    }

    @Override // j.a
    public void h(boolean z10) {
        if (z10 == this.f21567p) {
            return;
        }
        this.f21567p = z10;
        int size = this.f21568q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f21568q.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // j.a
    public int i() {
        return this.f21557f.s();
    }

    @Override // j.a
    public Context j() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.f21553a.getTheme().resolveAttribute(i.a.f20007g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.b = new ContextThemeWrapper(this.f21553a, i10);
            } else {
                this.b = this.f21553a;
            }
        }
        return this.b;
    }

    @Override // j.a
    public void k() {
        if (this.f21572u) {
            return;
        }
        this.f21572u = true;
        M(false);
    }

    @Override // j.a
    public void m(Configuration configuration) {
        H(o.a.b(this.f21553a).g());
    }

    @Override // j.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f21564m;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f21570s = i10;
    }

    @Override // j.a
    public void r(boolean z10) {
        if (this.f21563l) {
            return;
        }
        E(z10);
    }

    @Override // j.a
    public void s(boolean z10) {
        o.h hVar;
        this.f21577z = z10;
        if (z10 || (hVar = this.f21576y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // j.a
    public void t(CharSequence charSequence) {
        this.f21557f.setWindowTitle(charSequence);
    }

    @Override // j.a
    public o.b u(o.b.a aVar) {
        d dVar = this.f21564m;
        if (dVar != null) {
            dVar.c();
        }
        this.f21555d.setHideOnContentScrollEnabled(false);
        this.f21558g.k();
        d dVar2 = new d(this.f21558g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f21564m = dVar2;
        dVar2.k();
        this.f21558g.h(dVar2);
        v(true);
        return dVar2;
    }

    public void v(boolean z10) {
        y0 y0VarK;
        y0 y0VarF;
        if (z10) {
            L();
        } else {
            C();
        }
        if (!K()) {
            if (z10) {
                this.f21557f.r(4);
                this.f21558g.setVisibility(0);
                return;
            } else {
                this.f21557f.r(0);
                this.f21558g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            y0VarF = this.f21557f.k(4, 100L);
            y0VarK = this.f21558g.f(0, 200L);
        } else {
            y0VarK = this.f21557f.k(0, 200L);
            y0VarF = this.f21558g.f(8, 100L);
        }
        o.h hVar = new o.h();
        hVar.d(y0VarF, y0VarK);
        hVar.h();
    }

    public void x() {
        o.b.a aVar = this.f21566o;
        if (aVar != null) {
            aVar.b(this.f21565n);
            this.f21565n = null;
            this.f21566o = null;
        }
    }

    public void y(boolean z10) {
        View view;
        o.h hVar = this.f21576y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f21570s != 0 || (!this.f21577z && !z10)) {
            this.B.b(null);
            return;
        }
        this.f21556e.setAlpha(1.0f);
        this.f21556e.setTransitioning(true);
        o.h hVar2 = new o.h();
        float f10 = -this.f21556e.getHeight();
        if (z10) {
            int[] iArr = {0, 0};
            this.f21556e.getLocationInWindow(iArr);
            f10 -= iArr[1];
        }
        y0 y0VarL = o0.e(this.f21556e).l(f10);
        y0VarL.j(this.D);
        hVar2.c(y0VarL);
        if (this.f21571t && (view = this.f21559h) != null) {
            hVar2.c(o0.e(view).l(f10));
        }
        hVar2.f(E);
        hVar2.e(250L);
        hVar2.g(this.B);
        this.f21576y = hVar2;
        hVar2.h();
    }

    public void z(boolean z10) {
        View view;
        View view2;
        o.h hVar = this.f21576y;
        if (hVar != null) {
            hVar.a();
        }
        this.f21556e.setVisibility(0);
        if (this.f21570s == 0 && (this.f21577z || z10)) {
            this.f21556e.setTranslationY(0.0f);
            float f10 = -this.f21556e.getHeight();
            if (z10) {
                int[] iArr = {0, 0};
                this.f21556e.getLocationInWindow(iArr);
                f10 -= iArr[1];
            }
            this.f21556e.setTranslationY(f10);
            o.h hVar2 = new o.h();
            y0 y0VarL = o0.e(this.f21556e).l(0.0f);
            y0VarL.j(this.D);
            hVar2.c(y0VarL);
            if (this.f21571t && (view2 = this.f21559h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(o0.e(this.f21559h).l(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250L);
            hVar2.g(this.C);
            this.f21576y = hVar2;
            hVar2.h();
        } else {
            this.f21556e.setAlpha(1.0f);
            this.f21556e.setTranslationY(0.0f);
            if (this.f21571t && (view = this.f21559h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f21555d;
        if (actionBarOverlayLayout != null) {
            o0.j0(actionBarOverlayLayout);
        }
    }

    public t(Dialog dialog) {
        D(dialog.getWindow().getDecorView());
    }
}
