package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.i;
import androidx.core.view.a1;
import androidx.core.view.o0;
import androidx.core.view.y0;
import i.e;
import i.f;
import i.h;
import i.j;
import q.b1;
import q.g0;

/* JADX INFO: loaded from: classes.dex */
public class d implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f1108a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f1109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f1110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f1111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f1113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f1115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f1116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f1117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Window.Callback f1118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public androidx.appcompat.widget.a f1120n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1121o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1122p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f1123q;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p.a f1124a;

        public a() {
            this.f1124a = new p.a(d.this.f1108a.getContext(), 0, R.id.home, 0, 0, d.this.f1115i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            Window.Callback callback = dVar.f1118l;
            if (callback == null || !dVar.f1119m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1124a);
        }
    }

    public class b extends a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1125a = false;
        public final /* synthetic */ int b;

        public b(int i10) {
            this.b = i10;
        }

        @Override // androidx.core.view.a1, androidx.core.view.z0
        public void a(View view) {
            this.f1125a = true;
        }

        @Override // androidx.core.view.z0
        public void b(View view) {
            if (this.f1125a) {
                return;
            }
            d.this.f1108a.setVisibility(this.b);
        }

        @Override // androidx.core.view.a1, androidx.core.view.z0
        public void c(View view) {
            d.this.f1108a.setVisibility(0);
        }
    }

    public d(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, h.f18842a, e.f18784n);
    }

    public void A(Drawable drawable) {
        this.f1113g = drawable;
        F();
    }

    public void B(CharSequence charSequence) {
        this.f1116j = charSequence;
        if ((this.b & 8) != 0) {
            this.f1108a.setSubtitle(charSequence);
        }
    }

    public void C(CharSequence charSequence) {
        this.f1114h = true;
        D(charSequence);
    }

    public final void D(CharSequence charSequence) {
        this.f1115i = charSequence;
        if ((this.b & 8) != 0) {
            this.f1108a.setTitle(charSequence);
            if (this.f1114h) {
                o0.p0(this.f1108a.getRootView(), charSequence);
            }
        }
    }

    public final void E() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1117k)) {
                this.f1108a.setNavigationContentDescription(this.f1122p);
            } else {
                this.f1108a.setNavigationContentDescription(this.f1117k);
            }
        }
    }

    public final void F() {
        if ((this.b & 4) == 0) {
            this.f1108a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f1108a;
        Drawable drawable = this.f1113g;
        if (drawable == null) {
            drawable = this.f1123q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void G() {
        Drawable drawable;
        int i10 = this.b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1112f) == null) {
            drawable = this.f1111e;
        }
        this.f1108a.setLogo(drawable);
    }

    @Override // q.g0
    public boolean a() {
        return this.f1108a.d();
    }

    @Override // q.g0
    public boolean b() {
        return this.f1108a.w();
    }

    @Override // q.g0
    public boolean c() {
        return this.f1108a.R();
    }

    @Override // q.g0
    public void collapseActionView() {
        this.f1108a.e();
    }

    @Override // q.g0
    public void d(Menu menu, i.a aVar) {
        if (this.f1120n == null) {
            androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(this.f1108a.getContext());
            this.f1120n = aVar2;
            aVar2.q(f.f18802g);
        }
        this.f1120n.d(aVar);
        this.f1108a.L((androidx.appcompat.view.menu.e) menu, this.f1120n);
    }

    @Override // q.g0
    public boolean e() {
        return this.f1108a.B();
    }

    @Override // q.g0
    public void f() {
        this.f1119m = true;
    }

    @Override // q.g0
    public boolean g() {
        return this.f1108a.A();
    }

    @Override // q.g0
    public Context getContext() {
        return this.f1108a.getContext();
    }

    @Override // q.g0
    public CharSequence getTitle() {
        return this.f1108a.getTitle();
    }

    @Override // q.g0
    public boolean h() {
        return this.f1108a.v();
    }

    @Override // q.g0
    public void i(int i10) {
        View view;
        int i11 = this.b ^ i10;
        this.b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    E();
                }
                F();
            }
            if ((i11 & 3) != 0) {
                G();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1108a.setTitle(this.f1115i);
                    this.f1108a.setSubtitle(this.f1116j);
                } else {
                    this.f1108a.setTitle((CharSequence) null);
                    this.f1108a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f1110d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1108a.addView(view);
            } else {
                this.f1108a.removeView(view);
            }
        }
    }

    @Override // q.g0
    public int j() {
        return this.f1121o;
    }

    @Override // q.g0
    public y0 k(int i10, long j10) {
        return o0.e(this.f1108a).b(i10 == 0 ? 1.0f : 0.0f).e(j10).g(new b(i10));
    }

    @Override // q.g0
    public void l(boolean z10) {
    }

    @Override // q.g0
    public void m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // q.g0
    public void n(boolean z10) {
        this.f1108a.setCollapsible(z10);
    }

    @Override // q.g0
    public void o() {
        this.f1108a.f();
    }

    @Override // q.g0
    public void p(c cVar) {
        View view = this.f1109c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1108a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1109c);
            }
        }
        this.f1109c = cVar;
        if (cVar == null || this.f1121o != 2) {
            return;
        }
        this.f1108a.addView(cVar, 0);
        Toolbar.g gVar = (Toolbar.g) this.f1109c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.f19839a = 8388691;
        cVar.setAllowCollapse(true);
    }

    @Override // q.g0
    public void q(int i10) {
        x(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    @Override // q.g0
    public void r(int i10) {
        this.f1108a.setVisibility(i10);
    }

    @Override // q.g0
    public int s() {
        return this.b;
    }

    @Override // q.g0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    @Override // q.g0
    public void setWindowCallback(Window.Callback callback) {
        this.f1118l = callback;
    }

    @Override // q.g0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1114h) {
            return;
        }
        D(charSequence);
    }

    @Override // q.g0
    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final int u() {
        if (this.f1108a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1123q = this.f1108a.getNavigationIcon();
        return 15;
    }

    public void v(View view) {
        View view2 = this.f1110d;
        if (view2 != null && (this.b & 16) != 0) {
            this.f1108a.removeView(view2);
        }
        this.f1110d = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.f1108a.addView(view);
    }

    public void w(int i10) {
        if (i10 == this.f1122p) {
            return;
        }
        this.f1122p = i10;
        if (TextUtils.isEmpty(this.f1108a.getNavigationContentDescription())) {
            y(this.f1122p);
        }
    }

    public void x(Drawable drawable) {
        this.f1112f = drawable;
        G();
    }

    public void y(int i10) {
        z(i10 == 0 ? null : getContext().getString(i10));
    }

    public void z(CharSequence charSequence) {
        this.f1117k = charSequence;
        E();
    }

    public d(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1121o = 0;
        this.f1122p = 0;
        this.f1108a = toolbar;
        this.f1115i = toolbar.getTitle();
        this.f1116j = toolbar.getSubtitle();
        this.f1114h = this.f1115i != null;
        this.f1113g = toolbar.getNavigationIcon();
        b1 b1VarV = b1.v(toolbar.getContext(), null, j.f18861a, i.a.f18730c, 0);
        this.f1123q = b1VarV.g(j.f18915l);
        if (z10) {
            CharSequence charSequenceP = b1VarV.p(j.f18945r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                C(charSequenceP);
            }
            CharSequence charSequenceP2 = b1VarV.p(j.f18935p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                B(charSequenceP2);
            }
            Drawable drawableG = b1VarV.g(j.f18925n);
            if (drawableG != null) {
                x(drawableG);
            }
            Drawable drawableG2 = b1VarV.g(j.f18920m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f1113g == null && (drawable = this.f1123q) != null) {
                A(drawable);
            }
            i(b1VarV.k(j.f18895h, 0));
            int iN = b1VarV.n(j.f18890g, 0);
            if (iN != 0) {
                v(LayoutInflater.from(this.f1108a.getContext()).inflate(iN, (ViewGroup) this.f1108a, false));
                i(this.b | 16);
            }
            int iM = b1VarV.m(j.f18905j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1108a.getLayoutParams();
                layoutParams.height = iM;
                this.f1108a.setLayoutParams(layoutParams);
            }
            int iE = b1VarV.e(j.f18885f, -1);
            int iE2 = b1VarV.e(j.f18880e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f1108a.K(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = b1VarV.n(j.f18950s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f1108a;
                toolbar2.N(toolbar2.getContext(), iN2);
            }
            int iN3 = b1VarV.n(j.f18940q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f1108a;
                toolbar3.M(toolbar3.getContext(), iN3);
            }
            int iN4 = b1VarV.n(j.f18930o, 0);
            if (iN4 != 0) {
                this.f1108a.setPopupTheme(iN4);
            }
        } else {
            this.b = u();
        }
        b1VarV.x();
        w(i10);
        this.f1117k = this.f1108a.getNavigationContentDescription();
        this.f1108a.setNavigationOnClickListener(new a());
    }

    @Override // q.g0
    public void setIcon(Drawable drawable) {
        this.f1111e = drawable;
        G();
    }
}
