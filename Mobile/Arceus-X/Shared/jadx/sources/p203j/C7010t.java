package p203j;

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
import androidx.appcompat.view.menu.C0415e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0485c;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0584a1;
import androidx.core.view.C0625o0;
import androidx.core.view.C0645y0;
import androidx.core.view.InterfaceC0587b1;
import androidx.core.view.InterfaceC0647z0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p181i.C6589a;
import p181i.C6594f;
import p181i.C6598j;
import p316o.AbstractC9609b;
import p316o.C9608a;
import p316o.C9614g;
import p316o.C9615h;
import p365q.InterfaceC10371f0;

/* JADX INFO: renamed from: j.t */
/* JADX INFO: loaded from: classes.dex */
public class C7010t extends AbstractC6991a implements ActionBarOverlayLayout.InterfaceC0428d {

    /* JADX INFO: renamed from: E */
    public static final Interpolator f27414E = new AccelerateInterpolator();

    /* JADX INFO: renamed from: F */
    public static final Interpolator f27415F = new DecelerateInterpolator();

    /* JADX INFO: renamed from: A */
    public boolean f27416A;

    /* JADX INFO: renamed from: a */
    public Context f27420a;

    /* JADX INFO: renamed from: b */
    public Context f27421b;

    /* JADX INFO: renamed from: c */
    public Activity f27422c;

    /* JADX INFO: renamed from: d */
    public ActionBarOverlayLayout f27423d;

    /* JADX INFO: renamed from: e */
    public ActionBarContainer f27424e;

    /* JADX INFO: renamed from: f */
    public InterfaceC10371f0 f27425f;

    /* JADX INFO: renamed from: g */
    public ActionBarContextView f27426g;

    /* JADX INFO: renamed from: h */
    public View f27427h;

    /* JADX INFO: renamed from: i */
    public C0485c f27428i;

    /* JADX INFO: renamed from: l */
    public boolean f27431l;

    /* JADX INFO: renamed from: m */
    public d f27432m;

    /* JADX INFO: renamed from: n */
    public AbstractC9609b f27433n;

    /* JADX INFO: renamed from: o */
    public AbstractC9609b.a f27434o;

    /* JADX INFO: renamed from: p */
    public boolean f27435p;

    /* JADX INFO: renamed from: r */
    public boolean f27437r;

    /* JADX INFO: renamed from: u */
    public boolean f27440u;

    /* JADX INFO: renamed from: v */
    public boolean f27441v;

    /* JADX INFO: renamed from: w */
    public boolean f27442w;

    /* JADX INFO: renamed from: y */
    public C9615h f27444y;

    /* JADX INFO: renamed from: z */
    public boolean f27445z;

    /* JADX INFO: renamed from: j */
    public ArrayList<Object> f27429j = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    public int f27430k = -1;

    /* JADX INFO: renamed from: q */
    public ArrayList<AbstractC6991a.b> f27436q = new ArrayList<>();

    /* JADX INFO: renamed from: s */
    public int f27438s = 0;

    /* JADX INFO: renamed from: t */
    public boolean f27439t = true;

    /* JADX INFO: renamed from: x */
    public boolean f27443x = true;

    /* JADX INFO: renamed from: B */
    public final InterfaceC0647z0 f27417B = new a();

    /* JADX INFO: renamed from: C */
    public final InterfaceC0647z0 f27418C = new b();

    /* JADX INFO: renamed from: D */
    public final InterfaceC0587b1 f27419D = new c();

    /* JADX INFO: renamed from: j.t$a */
    public class a extends C0584a1 {
        public a() {
        }

        @Override // androidx.core.view.InterfaceC0647z0
        /* JADX INFO: renamed from: b */
        public void mo2028b(View view) {
            View view2;
            C7010t c7010t = C7010t.this;
            if (c7010t.f27439t && (view2 = c7010t.f27427h) != null) {
                view2.setTranslationY(0.0f);
                C7010t.this.f27424e.setTranslationY(0.0f);
            }
            C7010t.this.f27424e.setVisibility(8);
            C7010t.this.f27424e.setTransitioning(false);
            C7010t c7010t2 = C7010t.this;
            c7010t2.f27444y = null;
            c7010t2.m29655x();
            ActionBarOverlayLayout actionBarOverlayLayout = C7010t.this.f27423d;
            if (actionBarOverlayLayout != null) {
                C0625o0.m3034j0(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: renamed from: j.t$b */
    public class b extends C0584a1 {
        public b() {
        }

        @Override // androidx.core.view.InterfaceC0647z0
        /* JADX INFO: renamed from: b */
        public void mo2028b(View view) {
            C7010t c7010t = C7010t.this;
            c7010t.f27444y = null;
            c7010t.f27424e.requestLayout();
        }
    }

    /* JADX INFO: renamed from: j.t$c */
    public class c implements InterfaceC0587b1 {
        public c() {
        }

        @Override // androidx.core.view.InterfaceC0587b1
        /* JADX INFO: renamed from: a */
        public void mo2817a(View view) {
            ((View) C7010t.this.f27424e.getParent()).invalidate();
        }
    }

    /* JADX INFO: renamed from: j.t$d */
    public class d extends AbstractC9609b implements C0415e.a {

        /* JADX INFO: renamed from: c */
        public final Context f27449c;

        /* JADX INFO: renamed from: d */
        public final C0415e f27450d;

        /* JADX INFO: renamed from: e */
        public AbstractC9609b.a f27451e;

        /* JADX INFO: renamed from: f */
        public WeakReference<View> f27452f;

        public d(Context context, AbstractC9609b.a aVar) {
            this.f27449c = context;
            this.f27451e = aVar;
            C0415e c0415eM1619T = new C0415e(context).m1619T(1);
            this.f27450d = c0415eM1619T;
            c0415eM1619T.mo1618S(this);
        }

        @Override // androidx.appcompat.view.menu.C0415e.a
        /* JADX INFO: renamed from: a */
        public boolean mo1656a(@NonNull C0415e c0415e, @NonNull MenuItem menuItem) {
            AbstractC9609b.a aVar = this.f27451e;
            if (aVar != null) {
                return aVar.mo29574c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0415e.a
        /* JADX INFO: renamed from: b */
        public void mo1657b(@NonNull C0415e c0415e) {
            if (this.f27451e == null) {
                return;
            }
            mo29664k();
            C7010t.this.f27426g.m1715l();
        }

        @Override // p316o.AbstractC9609b
        /* JADX INFO: renamed from: c */
        public void mo29658c() {
            C7010t c7010t = C7010t.this;
            if (c7010t.f27432m != this) {
                return;
            }
            if (C7010t.m29640w(c7010t.f27440u, c7010t.f27441v, false)) {
                this.f27451e.mo29573b(this);
            } else {
                C7010t c7010t2 = C7010t.this;
                c7010t2.f27433n = this;
                c7010t2.f27434o = this.f27451e;
            }
            this.f27451e = null;
            C7010t.this.m29654v(false);
            C7010t.this.f27426g.m1710g();
            C7010t c7010t3 = C7010t.this;
            c7010t3.f27423d.setHideOnContentScrollEnabled(c7010t3.f27416A);
            C7010t.this.f27432m = null;
        }

        @Override // p316o.AbstractC9609b
        /* JADX INFO: renamed from: d */
        public View mo29659d() {
            WeakReference<View> weakReference = this.f27452f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p316o.AbstractC9609b
        /* JADX INFO: renamed from: e */
        public Menu mo29660e() {
            return this.f27450d;
        }

        @Override // p316o.AbstractC9609b
        /* JADX INFO: renamed from: f */
        public MenuInflater mo29661f() {
            return new C9614g(this.f27449c);
        }

        @Override // p316o.AbstractC9609b
        /* JADX INFO: renamed from: g */
        public CharSequence mo29662g() {
            return C7010t.this.f27426g.getSubtitle();
        }

        @Override // p316o.AbstractC9609b
        /* JADX INFO: renamed from: i */
        public CharSequence mo29663i() {
            return C7010t.this.f27426g.getTitle();
        }

        @Override // p316o.AbstractC9609b
        /* JADX INFO: renamed from: k */
        public void mo29664k() {
            if (C7010t.this.f27432m != this) {
                return;
            }
            this.f27450d.m1635e0();
            try {
                this.f27451e.mo29575d(this, this.f27450d);
            } finally {
                this.f27450d.m1633d0();
            }
        }

        @Override // p316o.AbstractC9609b
        /* JADX INFO: renamed from: l */
        public boolean mo29665l() {
            return C7010t.this.f27426g.m1713j();
        }

        @Override // p316o.AbstractC9609b
        /* JADX INFO: renamed from: m */
        public void mo29666m(View view) {
            C7010t.this.f27426g.setCustomView(view);
            this.f27452f = new WeakReference<>(view);
        }

        @Override // p316o.AbstractC9609b
        /* JADX INFO: renamed from: n */
        public void mo29667n(int i10) {
            mo29668o(C7010t.this.f27420a.getResources().getString(i10));
        }

        @Override // p316o.AbstractC9609b
        /* JADX INFO: renamed from: o */
        public void mo29668o(CharSequence charSequence) {
            C7010t.this.f27426g.setSubtitle(charSequence);
        }

        @Override // p316o.AbstractC9609b
        /* JADX INFO: renamed from: q */
        public void mo29669q(int i10) {
            mo29670r(C7010t.this.f27420a.getResources().getString(i10));
        }

        @Override // p316o.AbstractC9609b
        /* JADX INFO: renamed from: r */
        public void mo29670r(CharSequence charSequence) {
            C7010t.this.f27426g.setTitle(charSequence);
        }

        @Override // p316o.AbstractC9609b
        /* JADX INFO: renamed from: s */
        public void mo29671s(boolean z10) {
            super.mo29671s(z10);
            C7010t.this.f27426g.setTitleOptional(z10);
        }

        /* JADX INFO: renamed from: t */
        public boolean m29672t() {
            this.f27450d.m1635e0();
            try {
                return this.f27451e.mo29572a(this, this.f27450d);
            } finally {
                this.f27450d.m1633d0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7010t(Activity activity, boolean z10) {
        this.f27422c = activity;
        View decorView = activity.getWindow().getDecorView();
        m29644D(decorView);
        if (z10) {
            return;
        }
        this.f27427h = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m29640w(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final InterfaceC10371f0 m29641A(View view) {
        if (view instanceof InterfaceC10371f0) {
            return (InterfaceC10371f0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    /* JADX INFO: renamed from: B */
    public int m29642B() {
        return this.f27425f.mo2010j();
    }

    /* JADX INFO: renamed from: C */
    public final void m29643C() {
        if (this.f27442w) {
            this.f27442w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f27423d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m29653M(false);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m29644D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C6594f.f25150q);
        this.f27423d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f27425f = m29641A(view.findViewById(C6594f.f25134a));
        this.f27426g = (ActionBarContextView) view.findViewById(C6594f.f25139f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C6594f.f25136c);
        this.f27424e = actionBarContainer;
        InterfaceC10371f0 interfaceC10371f0 = this.f27425f;
        if (interfaceC10371f0 == null || this.f27426g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f27420a = interfaceC10371f0.getContext();
        boolean z10 = (this.f27425f.mo2019s() & 4) != 0;
        if (z10) {
            this.f27431l = true;
        }
        C9608a c9608aM37910b = C9608a.m37910b(this.f27420a);
        m29650J(c9608aM37910b.m37911a() || z10);
        m29648H(c9608aM37910b.m37916g());
        TypedArray typedArrayObtainStyledAttributes = this.f27420a.obtainStyledAttributes(null, C6598j.f25326a, C6589a.f25024c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(C6598j.f25376k, false)) {
            m29649I(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6598j.f25366i, 0);
        if (dimensionPixelSize != 0) {
            m29647G(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: E */
    public void m29645E(boolean z10) {
        m29646F(z10 ? 4 : 0, 4);
    }

    /* JADX INFO: renamed from: F */
    public void m29646F(int i10, int i11) {
        int iMo2019s = this.f27425f.mo2019s();
        if ((i11 & 4) != 0) {
            this.f27431l = true;
        }
        this.f27425f.mo2009i((i10 & i11) | ((~i11) & iMo2019s));
    }

    /* JADX INFO: renamed from: G */
    public void m29647G(float f10) {
        C0625o0.m3056u0(this.f27424e, f10);
    }

    /* JADX INFO: renamed from: H */
    public final void m29648H(boolean z10) {
        this.f27437r = z10;
        if (z10) {
            this.f27424e.setTabContainer(null);
            this.f27425f.mo2016p(this.f27428i);
        } else {
            this.f27425f.mo2016p(null);
            this.f27424e.setTabContainer(this.f27428i);
        }
        boolean z11 = m29642B() == 2;
        C0485c c0485c = this.f27428i;
        if (c0485c != null) {
            if (z11) {
                c0485c.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f27423d;
                if (actionBarOverlayLayout != null) {
                    C0625o0.m3034j0(actionBarOverlayLayout);
                }
            } else {
                c0485c.setVisibility(8);
            }
        }
        this.f27425f.mo2014n(!this.f27437r && z11);
        this.f27423d.setHasNonEmbeddedTabs(!this.f27437r && z11);
    }

    /* JADX INFO: renamed from: I */
    public void m29649I(boolean z10) {
        if (z10 && !this.f27423d.m1742x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f27416A = z10;
        this.f27423d.setHideOnContentScrollEnabled(z10);
    }

    /* JADX INFO: renamed from: J */
    public void m29650J(boolean z10) {
        this.f27425f.mo2012l(z10);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m29651K() {
        return this.f27424e.isLaidOut();
    }

    /* JADX INFO: renamed from: L */
    public final void m29652L() {
        if (this.f27442w) {
            return;
        }
        this.f27442w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f27423d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m29653M(false);
    }

    /* JADX INFO: renamed from: M */
    public final void m29653M(boolean z10) {
        if (m29640w(this.f27440u, this.f27441v, this.f27442w)) {
            if (this.f27443x) {
                return;
            }
            this.f27443x = true;
            m29657z(z10);
            return;
        }
        if (this.f27443x) {
            this.f27443x = false;
            m29656y(z10);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0428d
    /* JADX INFO: renamed from: a */
    public void mo1745a() {
        if (this.f27441v) {
            this.f27441v = false;
            m29653M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0428d
    /* JADX INFO: renamed from: b */
    public void mo1746b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0428d
    /* JADX INFO: renamed from: c */
    public void mo1747c(boolean z10) {
        this.f27439t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0428d
    /* JADX INFO: renamed from: d */
    public void mo1748d() {
        if (this.f27441v) {
            return;
        }
        this.f27441v = true;
        m29653M(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0428d
    /* JADX INFO: renamed from: e */
    public void mo1749e() {
        C9615h c9615h = this.f27444y;
        if (c9615h != null) {
            c9615h.m37941a();
            this.f27444y = null;
        }
    }

    @Override // p203j.AbstractC6991a
    /* JADX INFO: renamed from: g */
    public boolean mo29425g() {
        InterfaceC10371f0 interfaceC10371f0 = this.f27425f;
        if (interfaceC10371f0 == null || !interfaceC10371f0.mo2008h()) {
            return false;
        }
        this.f27425f.collapseActionView();
        return true;
    }

    @Override // p203j.AbstractC6991a
    /* JADX INFO: renamed from: h */
    public void mo29426h(boolean z10) {
        if (z10 == this.f27435p) {
            return;
        }
        this.f27435p = z10;
        int size = this.f27436q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f27436q.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // p203j.AbstractC6991a
    /* JADX INFO: renamed from: i */
    public int mo29427i() {
        return this.f27425f.mo2019s();
    }

    @Override // p203j.AbstractC6991a
    /* JADX INFO: renamed from: j */
    public Context mo29428j() {
        if (this.f27421b == null) {
            TypedValue typedValue = new TypedValue();
            this.f27420a.getTheme().resolveAttribute(C6589a.f25028g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f27421b = new ContextThemeWrapper(this.f27420a, i10);
            } else {
                this.f27421b = this.f27420a;
            }
        }
        return this.f27421b;
    }

    @Override // p203j.AbstractC6991a
    /* JADX INFO: renamed from: k */
    public void mo29429k() {
        if (this.f27440u) {
            return;
        }
        this.f27440u = true;
        m29653M(false);
    }

    @Override // p203j.AbstractC6991a
    /* JADX INFO: renamed from: m */
    public void mo29431m(Configuration configuration) {
        m29648H(C9608a.m37910b(this.f27420a).m37916g());
    }

    @Override // p203j.AbstractC6991a
    /* JADX INFO: renamed from: o */
    public boolean mo29433o(int i10, KeyEvent keyEvent) {
        Menu menuMo29660e;
        d dVar = this.f27432m;
        if (dVar == null || (menuMo29660e = dVar.mo29660e()) == null) {
            return false;
        }
        menuMo29660e.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuMo29660e.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0428d
    public void onWindowVisibilityChanged(int i10) {
        this.f27438s = i10;
    }

    @Override // p203j.AbstractC6991a
    /* JADX INFO: renamed from: r */
    public void mo29436r(boolean z10) {
        if (this.f27431l) {
            return;
        }
        m29645E(z10);
    }

    @Override // p203j.AbstractC6991a
    /* JADX INFO: renamed from: s */
    public void mo29437s(boolean z10) {
        C9615h c9615h;
        this.f27445z = z10;
        if (z10 || (c9615h = this.f27444y) == null) {
            return;
        }
        c9615h.m37941a();
    }

    @Override // p203j.AbstractC6991a
    /* JADX INFO: renamed from: t */
    public void mo29438t(CharSequence charSequence) {
        this.f27425f.setWindowTitle(charSequence);
    }

    @Override // p203j.AbstractC6991a
    /* JADX INFO: renamed from: u */
    public AbstractC9609b mo29439u(AbstractC9609b.a aVar) {
        d dVar = this.f27432m;
        if (dVar != null) {
            dVar.mo29658c();
        }
        this.f27423d.setHideOnContentScrollEnabled(false);
        this.f27426g.m1714k();
        d dVar2 = new d(this.f27426g.getContext(), aVar);
        if (!dVar2.m29672t()) {
            return null;
        }
        this.f27432m = dVar2;
        dVar2.mo29664k();
        this.f27426g.m1711h(dVar2);
        m29654v(true);
        return dVar2;
    }

    /* JADX INFO: renamed from: v */
    public void m29654v(boolean z10) {
        C0645y0 c0645y0Mo2011k;
        C0645y0 c0645y0Mo1709f;
        if (z10) {
            m29652L();
        } else {
            m29643C();
        }
        if (!m29651K()) {
            if (z10) {
                this.f27425f.mo2018r(4);
                this.f27426g.setVisibility(0);
                return;
            } else {
                this.f27425f.mo2018r(0);
                this.f27426g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            c0645y0Mo1709f = this.f27425f.mo2011k(4, 100L);
            c0645y0Mo2011k = this.f27426g.mo1709f(0, 200L);
        } else {
            c0645y0Mo2011k = this.f27425f.mo2011k(0, 200L);
            c0645y0Mo1709f = this.f27426g.mo1709f(8, 100L);
        }
        C9615h c9615h = new C9615h();
        c9615h.m37944d(c0645y0Mo1709f, c0645y0Mo2011k);
        c9615h.m37948h();
    }

    /* JADX INFO: renamed from: x */
    public void m29655x() {
        AbstractC9609b.a aVar = this.f27434o;
        if (aVar != null) {
            aVar.mo29573b(this.f27433n);
            this.f27433n = null;
            this.f27434o = null;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m29656y(boolean z10) {
        View view;
        C9615h c9615h = this.f27444y;
        if (c9615h != null) {
            c9615h.m37941a();
        }
        if (this.f27438s != 0 || (!this.f27445z && !z10)) {
            this.f27417B.mo2028b(null);
            return;
        }
        this.f27424e.setAlpha(1.0f);
        this.f27424e.setTransitioning(true);
        C9615h c9615h2 = new C9615h();
        float f10 = -this.f27424e.getHeight();
        if (z10) {
            int[] iArr = {0, 0};
            this.f27424e.getLocationInWindow(iArr);
            f10 -= iArr[1];
        }
        C0645y0 c0645y0M3235l = C0625o0.m3023e(this.f27424e).m3235l(f10);
        c0645y0M3235l.m3233j(this.f27419D);
        c9615h2.m37943c(c0645y0M3235l);
        if (this.f27439t && (view = this.f27427h) != null) {
            c9615h2.m37943c(C0625o0.m3023e(view).m3235l(f10));
        }
        c9615h2.m37946f(f27414E);
        c9615h2.m37945e(250L);
        c9615h2.m37947g(this.f27417B);
        this.f27444y = c9615h2;
        c9615h2.m37948h();
    }

    /* JADX INFO: renamed from: z */
    public void m29657z(boolean z10) {
        View view;
        View view2;
        C9615h c9615h = this.f27444y;
        if (c9615h != null) {
            c9615h.m37941a();
        }
        this.f27424e.setVisibility(0);
        if (this.f27438s == 0 && (this.f27445z || z10)) {
            this.f27424e.setTranslationY(0.0f);
            float f10 = -this.f27424e.getHeight();
            if (z10) {
                int[] iArr = {0, 0};
                this.f27424e.getLocationInWindow(iArr);
                f10 -= iArr[1];
            }
            this.f27424e.setTranslationY(f10);
            C9615h c9615h2 = new C9615h();
            C0645y0 c0645y0M3235l = C0625o0.m3023e(this.f27424e).m3235l(0.0f);
            c0645y0M3235l.m3233j(this.f27419D);
            c9615h2.m37943c(c0645y0M3235l);
            if (this.f27439t && (view2 = this.f27427h) != null) {
                view2.setTranslationY(f10);
                c9615h2.m37943c(C0625o0.m3023e(this.f27427h).m3235l(0.0f));
            }
            c9615h2.m37946f(f27415F);
            c9615h2.m37945e(250L);
            c9615h2.m37947g(this.f27418C);
            this.f27444y = c9615h2;
            c9615h2.m37948h();
        } else {
            this.f27424e.setAlpha(1.0f);
            this.f27424e.setTranslationY(0.0f);
            if (this.f27439t && (view = this.f27427h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f27418C.mo2028b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f27423d;
        if (actionBarOverlayLayout != null) {
            C0625o0.m3034j0(actionBarOverlayLayout);
        }
    }

    public C7010t(Dialog dialog) {
        m29644D(dialog.getWindow().getDecorView());
    }
}
