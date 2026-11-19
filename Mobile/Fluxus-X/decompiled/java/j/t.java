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
import q.g0;

/* JADX INFO: loaded from: classes.dex */
public class t extends j.a implements ActionBarOverlayLayout.d {
    public static final Interpolator E = new AccelerateInterpolator();
    public static final Interpolator F = new DecelerateInterpolator();
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f19945a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f19946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarOverlayLayout f19947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContainer f19948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g0 f19949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActionBarContextView f19950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f19951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.appcompat.widget.c f19952i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f19955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f19956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o.b f19957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o.b.a f19958o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f19959p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f19961r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f19964u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f19965v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f19966w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o.h f19968y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f19969z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<Object> f19953j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19954k = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<j.a.b> f19960q = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f19962s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f19963t = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f19967x = true;
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
            if (tVar.f19963t && (view2 = tVar.f19951h) != null) {
                view2.setTranslationY(0.0f);
                t.this.f19948e.setTranslationY(0.0f);
            }
            t.this.f19948e.setVisibility(8);
            t.this.f19948e.setTransitioning(false);
            t tVar2 = t.this;
            tVar2.f19968y = null;
            tVar2.x();
            ActionBarOverlayLayout actionBarOverlayLayout = t.this.f19947d;
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
            tVar.f19968y = null;
            tVar.f19948e.requestLayout();
        }
    }

    public class c implements b1 {
        public c() {
        }

        @Override // androidx.core.view.b1
        public void a(View view) {
            ((View) t.this.f19948e.getParent()).invalidate();
        }
    }

    public class d extends o.b implements androidx.appcompat.view.menu.e.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f19973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.appcompat.view.menu.e f19974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public o.b.a f19975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public WeakReference<View> f19976f;

        public d(Context context, o.b.a aVar) {
            this.f19973c = context;
            this.f19975e = aVar;
            androidx.appcompat.view.menu.e eVarT = new androidx.appcompat.view.menu.e(context).T(1);
            this.f19974d = eVarT;
            eVarT.S(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
            o.b.a aVar = this.f19975e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
            if (this.f19975e == null) {
                return;
            }
            k();
            t.this.f19950g.l();
        }

        @Override // o.b
        public void c() {
            t tVar = t.this;
            if (tVar.f19956m != this) {
                return;
            }
            if (t.w(tVar.f19964u, tVar.f19965v, false)) {
                this.f19975e.b(this);
            } else {
                t tVar2 = t.this;
                tVar2.f19957n = this;
                tVar2.f19958o = this.f19975e;
            }
            this.f19975e = null;
            t.this.v(false);
            t.this.f19950g.g();
            t tVar3 = t.this;
            tVar3.f19947d.setHideOnContentScrollEnabled(tVar3.A);
            t.this.f19956m = null;
        }

        @Override // o.b
        public View d() {
            WeakReference<View> weakReference = this.f19976f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // o.b
        public Menu e() {
            return this.f19974d;
        }

        @Override // o.b
        public MenuInflater f() {
            return new o.g(this.f19973c);
        }

        @Override // o.b
        public CharSequence g() {
            return t.this.f19950g.getSubtitle();
        }

        @Override // o.b
        public CharSequence i() {
            return t.this.f19950g.getTitle();
        }

        @Override // o.b
        public void k() {
            if (t.this.f19956m != this) {
                return;
            }
            this.f19974d.e0();
            try {
                this.f19975e.d(this, this.f19974d);
            } finally {
                this.f19974d.d0();
            }
        }

        @Override // o.b
        public boolean l() {
            return t.this.f19950g.j();
        }

        @Override // o.b
        public void m(View view) {
            t.this.f19950g.setCustomView(view);
            this.f19976f = new WeakReference<>(view);
        }

        @Override // o.b
        public void n(int i10) {
            o(t.this.f19945a.getResources().getString(i10));
        }

        @Override // o.b
        public void o(CharSequence charSequence) {
            t.this.f19950g.setSubtitle(charSequence);
        }

        @Override // o.b
        public void q(int i10) {
            r(t.this.f19945a.getResources().getString(i10));
        }

        @Override // o.b
        public void r(CharSequence charSequence) {
            t.this.f19950g.setTitle(charSequence);
        }

        @Override // o.b
        public void s(boolean z10) {
            super.s(z10);
            t.this.f19950g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f19974d.e0();
            try {
                return this.f19975e.a(this, this.f19974d);
            } finally {
                this.f19974d.d0();
            }
        }
    }

    public t(Activity activity, boolean z10) {
        this.f19946c = activity;
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (z10) {
            return;
        }
        this.f19951h = decorView.findViewById(R.id.content);
    }

    public static boolean w(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g0 A(View view) {
        if (view instanceof g0) {
            return (g0) view;
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
        return this.f19949f.j();
    }

    public final void C() {
        if (this.f19966w) {
            this.f19966w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f19947d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    public final void D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(i.f.f18812q);
        this.f19947d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f19949f = A(view.findViewById(i.f.f18797a));
        this.f19950g = (ActionBarContextView) view.findViewById(i.f.f18801f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(i.f.f18798c);
        this.f19948e = actionBarContainer;
        g0 g0Var = this.f19949f;
        if (g0Var == null || this.f19950g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f19945a = g0Var.getContext();
        boolean z10 = (this.f19949f.s() & 4) != 0;
        if (z10) {
            this.f19955l = true;
        }
        o.a aVarB = o.a.b(this.f19945a);
        J(aVarB.a() || z10);
        H(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f19945a.obtainStyledAttributes(null, i.j.f18861a, i.a.f18730c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.f18910k, false)) {
            I(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.j.f18900i, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void E(boolean z10) {
        F(z10 ? 4 : 0, 4);
    }

    public void F(int i10, int i11) {
        int iS = this.f19949f.s();
        if ((i11 & 4) != 0) {
            this.f19955l = true;
        }
        this.f19949f.i((i10 & i11) | ((~i11) & iS));
    }

    public void G(float f10) {
        o0.u0(this.f19948e, f10);
    }

    public final void H(boolean z10) {
        this.f19961r = z10;
        if (z10) {
            this.f19948e.setTabContainer(null);
            this.f19949f.p(this.f19952i);
        } else {
            this.f19949f.p(null);
            this.f19948e.setTabContainer(this.f19952i);
        }
        boolean z11 = B() == 2;
        androidx.appcompat.widget.c cVar = this.f19952i;
        if (cVar != null) {
            if (z11) {
                cVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f19947d;
                if (actionBarOverlayLayout != null) {
                    o0.j0(actionBarOverlayLayout);
                }
            } else {
                cVar.setVisibility(8);
            }
        }
        this.f19949f.n(!this.f19961r && z11);
        this.f19947d.setHasNonEmbeddedTabs(!this.f19961r && z11);
    }

    public void I(boolean z10) {
        if (z10 && !this.f19947d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z10;
        this.f19947d.setHideOnContentScrollEnabled(z10);
    }

    public void J(boolean z10) {
        this.f19949f.l(z10);
    }

    public final boolean K() {
        return this.f19948e.isLaidOut();
    }

    public final void L() {
        if (this.f19966w) {
            return;
        }
        this.f19966w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f19947d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        M(false);
    }

    public final void M(boolean z10) {
        if (w(this.f19964u, this.f19965v, this.f19966w)) {
            if (this.f19967x) {
                return;
            }
            this.f19967x = true;
            z(z10);
            return;
        }
        if (this.f19967x) {
            this.f19967x = false;
            y(z10);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f19965v) {
            this.f19965v = false;
            M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f19963t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f19965v) {
            return;
        }
        this.f19965v = true;
        M(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        o.h hVar = this.f19968y;
        if (hVar != null) {
            hVar.a();
            this.f19968y = null;
        }
    }

    @Override // j.a
    public boolean g() {
        g0 g0Var = this.f19949f;
        if (g0Var == null || !g0Var.h()) {
            return false;
        }
        this.f19949f.collapseActionView();
        return true;
    }

    @Override // j.a
    public void h(boolean z10) {
        if (z10 == this.f19959p) {
            return;
        }
        this.f19959p = z10;
        int size = this.f19960q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19960q.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // j.a
    public int i() {
        return this.f19949f.s();
    }

    @Override // j.a
    public Context j() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.f19945a.getTheme().resolveAttribute(i.a.f18734g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.b = new ContextThemeWrapper(this.f19945a, i10);
            } else {
                this.b = this.f19945a;
            }
        }
        return this.b;
    }

    @Override // j.a
    public void k() {
        if (this.f19964u) {
            return;
        }
        this.f19964u = true;
        M(false);
    }

    @Override // j.a
    public void m(Configuration configuration) {
        H(o.a.b(this.f19945a).g());
    }

    @Override // j.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f19956m;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f19962s = i10;
    }

    @Override // j.a
    public void r(boolean z10) {
        if (this.f19955l) {
            return;
        }
        E(z10);
    }

    @Override // j.a
    public void s(boolean z10) {
        o.h hVar;
        this.f19969z = z10;
        if (z10 || (hVar = this.f19968y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // j.a
    public void t(CharSequence charSequence) {
        this.f19949f.setWindowTitle(charSequence);
    }

    @Override // j.a
    public o.b u(o.b.a aVar) {
        d dVar = this.f19956m;
        if (dVar != null) {
            dVar.c();
        }
        this.f19947d.setHideOnContentScrollEnabled(false);
        this.f19950g.k();
        d dVar2 = new d(this.f19950g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f19956m = dVar2;
        dVar2.k();
        this.f19950g.h(dVar2);
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
                this.f19949f.r(4);
                this.f19950g.setVisibility(0);
                return;
            } else {
                this.f19949f.r(0);
                this.f19950g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            y0VarF = this.f19949f.k(4, 100L);
            y0VarK = this.f19950g.f(0, 200L);
        } else {
            y0VarK = this.f19949f.k(0, 200L);
            y0VarF = this.f19950g.f(8, 100L);
        }
        o.h hVar = new o.h();
        hVar.d(y0VarF, y0VarK);
        hVar.h();
    }

    public void x() {
        o.b.a aVar = this.f19958o;
        if (aVar != null) {
            aVar.b(this.f19957n);
            this.f19957n = null;
            this.f19958o = null;
        }
    }

    public void y(boolean z10) {
        View view;
        o.h hVar = this.f19968y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f19962s != 0 || (!this.f19969z && !z10)) {
            this.B.b(null);
            return;
        }
        this.f19948e.setAlpha(1.0f);
        this.f19948e.setTransitioning(true);
        o.h hVar2 = new o.h();
        float f10 = -this.f19948e.getHeight();
        if (z10) {
            int[] iArr = {0, 0};
            this.f19948e.getLocationInWindow(iArr);
            f10 -= iArr[1];
        }
        y0 y0VarL = o0.e(this.f19948e).l(f10);
        y0VarL.j(this.D);
        hVar2.c(y0VarL);
        if (this.f19963t && (view = this.f19951h) != null) {
            hVar2.c(o0.e(view).l(f10));
        }
        hVar2.f(E);
        hVar2.e(250L);
        hVar2.g(this.B);
        this.f19968y = hVar2;
        hVar2.h();
    }

    public void z(boolean z10) {
        View view;
        View view2;
        o.h hVar = this.f19968y;
        if (hVar != null) {
            hVar.a();
        }
        this.f19948e.setVisibility(0);
        if (this.f19962s == 0 && (this.f19969z || z10)) {
            this.f19948e.setTranslationY(0.0f);
            float f10 = -this.f19948e.getHeight();
            if (z10) {
                int[] iArr = {0, 0};
                this.f19948e.getLocationInWindow(iArr);
                f10 -= iArr[1];
            }
            this.f19948e.setTranslationY(f10);
            o.h hVar2 = new o.h();
            y0 y0VarL = o0.e(this.f19948e).l(0.0f);
            y0VarL.j(this.D);
            hVar2.c(y0VarL);
            if (this.f19963t && (view2 = this.f19951h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(o0.e(this.f19951h).l(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250L);
            hVar2.g(this.C);
            this.f19968y = hVar2;
            hVar2.h();
        } else {
            this.f19948e.setAlpha(1.0f);
            this.f19948e.setTranslationY(0.0f);
            if (this.f19963t && (view = this.f19951h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f19947d;
        if (actionBarOverlayLayout != null) {
            o0.j0(actionBarOverlayLayout);
        }
    }

    public t(Dialog dialog) {
        D(dialog.getWindow().getDecorView());
    }
}
