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
import q.f0;

/* JADX INFO: loaded from: classes.dex */
public class d implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f1301a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f1302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f1303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f1304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f1306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f1308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f1309j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f1310k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Window.Callback f1311l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1312m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public androidx.appcompat.widget.a f1313n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1314o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1315p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f1316q;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p.a f1317a;

        public a() {
            this.f1317a = new p.a(d.this.f1301a.getContext(), 0, R.id.home, 0, 0, d.this.f1308i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            Window.Callback callback = dVar.f1311l;
            if (callback == null || !dVar.f1312m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1317a);
        }
    }

    public class b extends a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1318a = false;
        public final /* synthetic */ int b;

        public b(int i10) {
            this.b = i10;
        }

        @Override // androidx.core.view.a1, androidx.core.view.z0
        public void a(View view) {
            this.f1318a = true;
        }

        @Override // androidx.core.view.z0
        public void b(View view) {
            if (this.f1318a) {
                return;
            }
            d.this.f1301a.setVisibility(this.b);
        }

        @Override // androidx.core.view.a1, androidx.core.view.z0
        public void c(View view) {
            d.this.f1301a.setVisibility(0);
        }
    }

    public d(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, h.f19999a, e.f19941n);
    }

    public void A(Drawable drawable) {
        this.f1306g = drawable;
        F();
    }

    public void B(CharSequence charSequence) {
        this.f1309j = charSequence;
        if ((this.b & 8) != 0) {
            this.f1301a.setSubtitle(charSequence);
        }
    }

    public void C(CharSequence charSequence) {
        this.f1307h = true;
        D(charSequence);
    }

    public final void D(CharSequence charSequence) {
        this.f1308i = charSequence;
        if ((this.b & 8) != 0) {
            this.f1301a.setTitle(charSequence);
            if (this.f1307h) {
                o0.p0(this.f1301a.getRootView(), charSequence);
            }
        }
    }

    public final void E() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1310k)) {
                this.f1301a.setNavigationContentDescription(this.f1315p);
            } else {
                this.f1301a.setNavigationContentDescription(this.f1310k);
            }
        }
    }

    public final void F() {
        if ((this.b & 4) == 0) {
            this.f1301a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f1301a;
        Drawable drawable = this.f1306g;
        if (drawable == null) {
            drawable = this.f1316q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void G() {
        Drawable drawable;
        int i10 = this.b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1305f) == null) {
            drawable = this.f1304e;
        }
        this.f1301a.setLogo(drawable);
    }

    @Override // q.f0
    public boolean a() {
        return this.f1301a.d();
    }

    @Override // q.f0
    public boolean b() {
        return this.f1301a.x();
    }

    @Override // q.f0
    public boolean c() {
        return this.f1301a.S();
    }

    @Override // q.f0
    public void collapseActionView() {
        this.f1301a.e();
    }

    @Override // q.f0
    public void d(Menu menu, i.a aVar) {
        if (this.f1313n == null) {
            androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(this.f1301a.getContext());
            this.f1313n = aVar2;
            aVar2.q(f.f19959g);
        }
        this.f1313n.d(aVar);
        this.f1301a.M((androidx.appcompat.view.menu.e) menu, this.f1313n);
    }

    @Override // q.f0
    public boolean e() {
        return this.f1301a.C();
    }

    @Override // q.f0
    public void f() {
        this.f1312m = true;
    }

    @Override // q.f0
    public boolean g() {
        return this.f1301a.B();
    }

    @Override // q.f0
    public Context getContext() {
        return this.f1301a.getContext();
    }

    @Override // q.f0
    public CharSequence getTitle() {
        return this.f1301a.getTitle();
    }

    @Override // q.f0
    public boolean h() {
        return this.f1301a.w();
    }

    @Override // q.f0
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
                    this.f1301a.setTitle(this.f1308i);
                    this.f1301a.setSubtitle(this.f1309j);
                } else {
                    this.f1301a.setTitle((CharSequence) null);
                    this.f1301a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f1303d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1301a.addView(view);
            } else {
                this.f1301a.removeView(view);
            }
        }
    }

    @Override // q.f0
    public int j() {
        return this.f1314o;
    }

    @Override // q.f0
    public y0 k(int i10, long j10) {
        return o0.e(this.f1301a).b(i10 == 0 ? 1.0f : 0.0f).e(j10).g(new b(i10));
    }

    @Override // q.f0
    public void l(boolean z10) {
    }

    @Override // q.f0
    public void m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // q.f0
    public void n(boolean z10) {
        this.f1301a.setCollapsible(z10);
    }

    @Override // q.f0
    public void o() {
        this.f1301a.f();
    }

    @Override // q.f0
    public void p(c cVar) {
        View view = this.f1302c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1301a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1302c);
            }
        }
        this.f1302c = cVar;
        if (cVar == null || this.f1314o != 2) {
            return;
        }
        this.f1301a.addView(cVar, 0);
        Toolbar.g gVar = (Toolbar.g) this.f1302c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.f20874a = 8388691;
        cVar.setAllowCollapse(true);
    }

    @Override // q.f0
    public void q(int i10) {
        x(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    @Override // q.f0
    public void r(int i10) {
        this.f1301a.setVisibility(i10);
    }

    @Override // q.f0
    public int s() {
        return this.b;
    }

    @Override // q.f0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    @Override // q.f0
    public void setWindowCallback(Window.Callback callback) {
        this.f1311l = callback;
    }

    @Override // q.f0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1307h) {
            return;
        }
        D(charSequence);
    }

    @Override // q.f0
    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final int u() {
        if (this.f1301a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1316q = this.f1301a.getNavigationIcon();
        return 15;
    }

    public void v(View view) {
        View view2 = this.f1303d;
        if (view2 != null && (this.b & 16) != 0) {
            this.f1301a.removeView(view2);
        }
        this.f1303d = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.f1301a.addView(view);
    }

    public void w(int i10) {
        if (i10 == this.f1315p) {
            return;
        }
        this.f1315p = i10;
        if (TextUtils.isEmpty(this.f1301a.getNavigationContentDescription())) {
            y(this.f1315p);
        }
    }

    public void x(Drawable drawable) {
        this.f1305f = drawable;
        G();
    }

    public void y(int i10) {
        z(i10 == 0 ? null : getContext().getString(i10));
    }

    public void z(CharSequence charSequence) {
        this.f1310k = charSequence;
        E();
    }

    public d(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1314o = 0;
        this.f1315p = 0;
        this.f1301a = toolbar;
        this.f1308i = toolbar.getTitle();
        this.f1309j = toolbar.getSubtitle();
        this.f1307h = this.f1308i != null;
        this.f1306g = toolbar.getNavigationIcon();
        q.a1 a1VarV = q.a1.v(toolbar.getContext(), null, j.f20018a, i.a.f19887c, 0);
        this.f1316q = a1VarV.g(j.f20072l);
        if (z10) {
            CharSequence charSequenceP = a1VarV.p(j.f20102r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                C(charSequenceP);
            }
            CharSequence charSequenceP2 = a1VarV.p(j.f20092p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                B(charSequenceP2);
            }
            Drawable drawableG = a1VarV.g(j.f20082n);
            if (drawableG != null) {
                x(drawableG);
            }
            Drawable drawableG2 = a1VarV.g(j.f20077m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f1306g == null && (drawable = this.f1316q) != null) {
                A(drawable);
            }
            i(a1VarV.k(j.f20052h, 0));
            int iN = a1VarV.n(j.f20047g, 0);
            if (iN != 0) {
                v(LayoutInflater.from(this.f1301a.getContext()).inflate(iN, (ViewGroup) this.f1301a, false));
                i(this.b | 16);
            }
            int iM = a1VarV.m(j.f20062j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1301a.getLayoutParams();
                layoutParams.height = iM;
                this.f1301a.setLayoutParams(layoutParams);
            }
            int iE = a1VarV.e(j.f20042f, -1);
            int iE2 = a1VarV.e(j.f20037e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f1301a.L(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = a1VarV.n(j.f20107s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f1301a;
                toolbar2.O(toolbar2.getContext(), iN2);
            }
            int iN3 = a1VarV.n(j.f20097q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f1301a;
                toolbar3.N(toolbar3.getContext(), iN3);
            }
            int iN4 = a1VarV.n(j.f20087o, 0);
            if (iN4 != 0) {
                this.f1301a.setPopupTheme(iN4);
            }
        } else {
            this.b = u();
        }
        a1VarV.x();
        w(i10);
        this.f1310k = this.f1301a.getNavigationContentDescription();
        this.f1301a.setNavigationOnClickListener(new a());
    }

    @Override // q.f0
    public void setIcon(Drawable drawable) {
        this.f1304e = drawable;
        G();
    }
}
