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
    public Context f20980a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f20981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarOverlayLayout f20982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContainer f20983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f0 f20984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActionBarContextView f20985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f20986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.appcompat.widget.c f20987i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f20991m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o.b f20992n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o.b.a f20993o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f20994p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f20996r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f20999u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21000v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21001w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o.h f21003y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f21004z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<Object> f20988j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20989k = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<j.a.b> f20995q = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20997s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f20998t = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f21002x = true;
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
            if (tVar.f20998t && (view2 = tVar.f20986h) != null) {
                view2.setTranslationY(0.0f);
                t.this.f20983e.setTranslationY(0.0f);
            }
            t.this.f20983e.setVisibility(8);
            t.this.f20983e.setTransitioning(false);
            t tVar2 = t.this;
            tVar2.f21003y = null;
            tVar2.x();
            ActionBarOverlayLayout actionBarOverlayLayout = t.this.f20982d;
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
            tVar.f21003y = null;
            tVar.f20983e.requestLayout();
        }
    }

    public class c implements b1 {
        public c() {
        }

        @Override // androidx.core.view.b1
        public void a(View view) {
            ((View) t.this.f20983e.getParent()).invalidate();
        }
    }

    public class d extends o.b implements androidx.appcompat.view.menu.e.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f21008c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.appcompat.view.menu.e f21009d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public o.b.a f21010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public WeakReference<View> f21011f;

        public d(Context context, o.b.a aVar) {
            this.f21008c = context;
            this.f21010e = aVar;
            androidx.appcompat.view.menu.e eVarT = new androidx.appcompat.view.menu.e(context).T(1);
            this.f21009d = eVarT;
            eVarT.S(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
            o.b.a aVar = this.f21010e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
            if (this.f21010e == null) {
                return;
            }
            k();
            t.this.f20985g.l();
        }

        @Override // o.b
        public void c() {
            t tVar = t.this;
            if (tVar.f20991m != this) {
                return;
            }
            if (t.w(tVar.f20999u, tVar.f21000v, false)) {
                this.f21010e.b(this);
            } else {
                t tVar2 = t.this;
                tVar2.f20992n = this;
                tVar2.f20993o = this.f21010e;
            }
            this.f21010e = null;
            t.this.v(false);
            t.this.f20985g.g();
            t tVar3 = t.this;
            tVar3.f20982d.setHideOnContentScrollEnabled(tVar3.A);
            t.this.f20991m = null;
        }

        @Override // o.b
        public View d() {
            WeakReference<View> weakReference = this.f21011f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // o.b
        public Menu e() {
            return this.f21009d;
        }

        @Override // o.b
        public MenuInflater f() {
            return new o.g(this.f21008c);
        }

        @Override // o.b
        public CharSequence g() {
            return t.this.f20985g.getSubtitle();
        }

        @Override // o.b
        public CharSequence i() {
            return t.this.f20985g.getTitle();
        }

        @Override // o.b
        public void k() {
            if (t.this.f20991m != this) {
                return;
            }
            this.f21009d.e0();
            try {
                this.f21010e.d(this, this.f21009d);
            } finally {
                this.f21009d.d0();
            }
        }

        @Override // o.b
        public boolean l() {
            return t.this.f20985g.j();
        }

        @Override // o.b
        public void m(View view) {
            t.this.f20985g.setCustomView(view);
            this.f21011f = new WeakReference<>(view);
        }

        @Override // o.b
        public void n(int i10) {
            o(t.this.f20980a.getResources().getString(i10));
        }

        @Override // o.b
        public void o(CharSequence charSequence) {
            t.this.f20985g.setSubtitle(charSequence);
        }

        @Override // o.b
        public void q(int i10) {
            r(t.this.f20980a.getResources().getString(i10));
        }

        @Override // o.b
        public void r(CharSequence charSequence) {
            t.this.f20985g.setTitle(charSequence);
        }

        @Override // o.b
        public void s(boolean z10) {
            super.s(z10);
            t.this.f20985g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f21009d.e0();
            try {
                return this.f21010e.a(this, this.f21009d);
            } finally {
                this.f21009d.d0();
            }
        }
    }

    public t(Activity activity, boolean z10) {
        this.f20981c = activity;
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (z10) {
            return;
        }
        this.f20986h = decorView.findViewById(R.id.content);
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
        return this.f20984f.j();
    }

    public final void C() {
        if (this.f21001w) {
            this.f21001w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f20982d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    public final void D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(i.f.f19969q);
        this.f20982d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f20984f = A(view.findViewById(i.f.f19954a));
        this.f20985g = (ActionBarContextView) view.findViewById(i.f.f19958f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(i.f.f19955c);
        this.f20983e = actionBarContainer;
        f0 f0Var = this.f20984f;
        if (f0Var == null || this.f20985g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f20980a = f0Var.getContext();
        boolean z10 = (this.f20984f.s() & 4) != 0;
        if (z10) {
            this.f20990l = true;
        }
        o.a aVarB = o.a.b(this.f20980a);
        J(aVarB.a() || z10);
        H(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f20980a.obtainStyledAttributes(null, i.j.f20018a, i.a.f19887c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.f20067k, false)) {
            I(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.j.f20057i, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void E(boolean z10) {
        F(z10 ? 4 : 0, 4);
    }

    public void F(int i10, int i11) {
        int iS = this.f20984f.s();
        if ((i11 & 4) != 0) {
            this.f20990l = true;
        }
        this.f20984f.i((i10 & i11) | ((~i11) & iS));
    }

    public void G(float f10) {
        o0.u0(this.f20983e, f10);
    }

    public final void H(boolean z10) {
        this.f20996r = z10;
        if (z10) {
            this.f20983e.setTabContainer(null);
            this.f20984f.p(this.f20987i);
        } else {
            this.f20984f.p(null);
            this.f20983e.setTabContainer(this.f20987i);
        }
        boolean z11 = B() == 2;
        androidx.appcompat.widget.c cVar = this.f20987i;
        if (cVar != null) {
            if (z11) {
                cVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f20982d;
                if (actionBarOverlayLayout != null) {
                    o0.j0(actionBarOverlayLayout);
                }
            } else {
                cVar.setVisibility(8);
            }
        }
        this.f20984f.n(!this.f20996r && z11);
        this.f20982d.setHasNonEmbeddedTabs(!this.f20996r && z11);
    }

    public void I(boolean z10) {
        if (z10 && !this.f20982d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z10;
        this.f20982d.setHideOnContentScrollEnabled(z10);
    }

    public void J(boolean z10) {
        this.f20984f.l(z10);
    }

    public final boolean K() {
        return this.f20983e.isLaidOut();
    }

    public final void L() {
        if (this.f21001w) {
            return;
        }
        this.f21001w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f20982d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        M(false);
    }

    public final void M(boolean z10) {
        if (w(this.f20999u, this.f21000v, this.f21001w)) {
            if (this.f21002x) {
                return;
            }
            this.f21002x = true;
            z(z10);
            return;
        }
        if (this.f21002x) {
            this.f21002x = false;
            y(z10);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f21000v) {
            this.f21000v = false;
            M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f20998t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f21000v) {
            return;
        }
        this.f21000v = true;
        M(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        o.h hVar = this.f21003y;
        if (hVar != null) {
            hVar.a();
            this.f21003y = null;
        }
    }

    @Override // j.a
    public boolean g() {
        f0 f0Var = this.f20984f;
        if (f0Var == null || !f0Var.h()) {
            return false;
        }
        this.f20984f.collapseActionView();
        return true;
    }

    @Override // j.a
    public void h(boolean z10) {
        if (z10 == this.f20994p) {
            return;
        }
        this.f20994p = z10;
        int size = this.f20995q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f20995q.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // j.a
    public int i() {
        return this.f20984f.s();
    }

    @Override // j.a
    public Context j() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.f20980a.getTheme().resolveAttribute(i.a.f19891g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.b = new ContextThemeWrapper(this.f20980a, i10);
            } else {
                this.b = this.f20980a;
            }
        }
        return this.b;
    }

    @Override // j.a
    public void k() {
        if (this.f20999u) {
            return;
        }
        this.f20999u = true;
        M(false);
    }

    @Override // j.a
    public void m(Configuration configuration) {
        H(o.a.b(this.f20980a).g());
    }

    @Override // j.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f20991m;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f20997s = i10;
    }

    @Override // j.a
    public void r(boolean z10) {
        if (this.f20990l) {
            return;
        }
        E(z10);
    }

    @Override // j.a
    public void s(boolean z10) {
        o.h hVar;
        this.f21004z = z10;
        if (z10 || (hVar = this.f21003y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // j.a
    public void t(CharSequence charSequence) {
        this.f20984f.setWindowTitle(charSequence);
    }

    @Override // j.a
    public o.b u(o.b.a aVar) {
        d dVar = this.f20991m;
        if (dVar != null) {
            dVar.c();
        }
        this.f20982d.setHideOnContentScrollEnabled(false);
        this.f20985g.k();
        d dVar2 = new d(this.f20985g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f20991m = dVar2;
        dVar2.k();
        this.f20985g.h(dVar2);
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
                this.f20984f.r(4);
                this.f20985g.setVisibility(0);
                return;
            } else {
                this.f20984f.r(0);
                this.f20985g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            y0VarF = this.f20984f.k(4, 100L);
            y0VarK = this.f20985g.f(0, 200L);
        } else {
            y0VarK = this.f20984f.k(0, 200L);
            y0VarF = this.f20985g.f(8, 100L);
        }
        o.h hVar = new o.h();
        hVar.d(y0VarF, y0VarK);
        hVar.h();
    }

    public void x() {
        o.b.a aVar = this.f20993o;
        if (aVar != null) {
            aVar.b(this.f20992n);
            this.f20992n = null;
            this.f20993o = null;
        }
    }

    public void y(boolean z10) {
        View view;
        o.h hVar = this.f21003y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f20997s != 0 || (!this.f21004z && !z10)) {
            this.B.b(null);
            return;
        }
        this.f20983e.setAlpha(1.0f);
        this.f20983e.setTransitioning(true);
        o.h hVar2 = new o.h();
        float f10 = -this.f20983e.getHeight();
        if (z10) {
            int[] iArr = {0, 0};
            this.f20983e.getLocationInWindow(iArr);
            f10 -= iArr[1];
        }
        y0 y0VarL = o0.e(this.f20983e).l(f10);
        y0VarL.j(this.D);
        hVar2.c(y0VarL);
        if (this.f20998t && (view = this.f20986h) != null) {
            hVar2.c(o0.e(view).l(f10));
        }
        hVar2.f(E);
        hVar2.e(250L);
        hVar2.g(this.B);
        this.f21003y = hVar2;
        hVar2.h();
    }

    public void z(boolean z10) {
        View view;
        View view2;
        o.h hVar = this.f21003y;
        if (hVar != null) {
            hVar.a();
        }
        this.f20983e.setVisibility(0);
        if (this.f20997s == 0 && (this.f21004z || z10)) {
            this.f20983e.setTranslationY(0.0f);
            float f10 = -this.f20983e.getHeight();
            if (z10) {
                int[] iArr = {0, 0};
                this.f20983e.getLocationInWindow(iArr);
                f10 -= iArr[1];
            }
            this.f20983e.setTranslationY(f10);
            o.h hVar2 = new o.h();
            y0 y0VarL = o0.e(this.f20983e).l(0.0f);
            y0VarL.j(this.D);
            hVar2.c(y0VarL);
            if (this.f20998t && (view2 = this.f20986h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(o0.e(this.f20986h).l(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250L);
            hVar2.g(this.C);
            this.f21003y = hVar2;
            hVar2.h();
        } else {
            this.f20983e.setAlpha(1.0f);
            this.f20983e.setTranslationY(0.0f);
            if (this.f20998t && (view = this.f20986h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f20982d;
        if (actionBarOverlayLayout != null) {
            o0.j0(actionBarOverlayLayout);
        }
    }

    public t(Dialog dialog) {
        D(dialog.getWindow().getDecorView());
    }
}
