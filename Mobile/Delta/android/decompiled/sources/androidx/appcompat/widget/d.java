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
    public Toolbar f1146a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f1147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f1148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f1149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f1151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f1153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f1154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f1155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Window.Callback f1156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public androidx.appcompat.widget.a f1158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1159o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f1161q;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p.a f1162a;

        public a() {
            this.f1162a = new p.a(d.this.f1146a.getContext(), 0, R.id.home, 0, 0, d.this.f1153i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            Window.Callback callback = dVar.f1156l;
            if (callback == null || !dVar.f1157m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1162a);
        }
    }

    public class b extends a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1163a = false;
        public final /* synthetic */ int b;

        public b(int i10) {
            this.b = i10;
        }

        @Override // androidx.core.view.a1, androidx.core.view.z0
        public void a(View view) {
            this.f1163a = true;
        }

        @Override // androidx.core.view.z0
        public void b(View view) {
            if (this.f1163a) {
                return;
            }
            d.this.f1146a.setVisibility(this.b);
        }

        @Override // androidx.core.view.a1, androidx.core.view.z0
        public void c(View view) {
            d.this.f1146a.setVisibility(0);
        }
    }

    public d(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, h.f20115a, e.f20057n);
    }

    public void A(Drawable drawable) {
        this.f1151g = drawable;
        F();
    }

    public void B(CharSequence charSequence) {
        this.f1154j = charSequence;
        if ((this.b & 8) != 0) {
            this.f1146a.setSubtitle(charSequence);
        }
    }

    public void C(CharSequence charSequence) {
        this.f1152h = true;
        D(charSequence);
    }

    public final void D(CharSequence charSequence) {
        this.f1153i = charSequence;
        if ((this.b & 8) != 0) {
            this.f1146a.setTitle(charSequence);
            if (this.f1152h) {
                o0.p0(this.f1146a.getRootView(), charSequence);
            }
        }
    }

    public final void E() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1155k)) {
                this.f1146a.setNavigationContentDescription(this.f1160p);
            } else {
                this.f1146a.setNavigationContentDescription(this.f1155k);
            }
        }
    }

    public final void F() {
        if ((this.b & 4) == 0) {
            this.f1146a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f1146a;
        Drawable drawable = this.f1151g;
        if (drawable == null) {
            drawable = this.f1161q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void G() {
        Drawable drawable;
        int i10 = this.b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1150f) == null) {
            drawable = this.f1149e;
        }
        this.f1146a.setLogo(drawable);
    }

    @Override // q.f0
    public boolean a() {
        return this.f1146a.d();
    }

    @Override // q.f0
    public boolean b() {
        return this.f1146a.w();
    }

    @Override // q.f0
    public boolean c() {
        return this.f1146a.R();
    }

    @Override // q.f0
    public void collapseActionView() {
        this.f1146a.e();
    }

    @Override // q.f0
    public void d(Menu menu, i.a aVar) {
        if (this.f1158n == null) {
            androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(this.f1146a.getContext());
            this.f1158n = aVar2;
            aVar2.q(f.f20075g);
        }
        this.f1158n.d(aVar);
        this.f1146a.L((androidx.appcompat.view.menu.e) menu, this.f1158n);
    }

    @Override // q.f0
    public boolean e() {
        return this.f1146a.B();
    }

    @Override // q.f0
    public void f() {
        this.f1157m = true;
    }

    @Override // q.f0
    public boolean g() {
        return this.f1146a.A();
    }

    @Override // q.f0
    public Context getContext() {
        return this.f1146a.getContext();
    }

    @Override // q.f0
    public CharSequence getTitle() {
        return this.f1146a.getTitle();
    }

    @Override // q.f0
    public boolean h() {
        return this.f1146a.v();
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
                    this.f1146a.setTitle(this.f1153i);
                    this.f1146a.setSubtitle(this.f1154j);
                } else {
                    this.f1146a.setTitle((CharSequence) null);
                    this.f1146a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f1148d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1146a.addView(view);
            } else {
                this.f1146a.removeView(view);
            }
        }
    }

    @Override // q.f0
    public int j() {
        return this.f1159o;
    }

    @Override // q.f0
    public y0 k(int i10, long j10) {
        return o0.e(this.f1146a).b(i10 == 0 ? 1.0f : 0.0f).e(j10).g(new b(i10));
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
        this.f1146a.setCollapsible(z10);
    }

    @Override // q.f0
    public void o() {
        this.f1146a.f();
    }

    @Override // q.f0
    public void p(c cVar) {
        View view = this.f1147c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1146a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1147c);
            }
        }
        this.f1147c = cVar;
        if (cVar == null || this.f1159o != 2) {
            return;
        }
        this.f1146a.addView(cVar, 0);
        Toolbar.g gVar = (Toolbar.g) this.f1147c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.f21447a = 8388691;
        cVar.setAllowCollapse(true);
    }

    @Override // q.f0
    public void q(int i10) {
        x(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    @Override // q.f0
    public void r(int i10) {
        this.f1146a.setVisibility(i10);
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
        this.f1156l = callback;
    }

    @Override // q.f0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1152h) {
            return;
        }
        D(charSequence);
    }

    @Override // q.f0
    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final int u() {
        if (this.f1146a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1161q = this.f1146a.getNavigationIcon();
        return 15;
    }

    public void v(View view) {
        View view2 = this.f1148d;
        if (view2 != null && (this.b & 16) != 0) {
            this.f1146a.removeView(view2);
        }
        this.f1148d = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.f1146a.addView(view);
    }

    public void w(int i10) {
        if (i10 == this.f1160p) {
            return;
        }
        this.f1160p = i10;
        if (TextUtils.isEmpty(this.f1146a.getNavigationContentDescription())) {
            y(this.f1160p);
        }
    }

    public void x(Drawable drawable) {
        this.f1150f = drawable;
        G();
    }

    public void y(int i10) {
        z(i10 == 0 ? null : getContext().getString(i10));
    }

    public void z(CharSequence charSequence) {
        this.f1155k = charSequence;
        E();
    }

    public d(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1159o = 0;
        this.f1160p = 0;
        this.f1146a = toolbar;
        this.f1153i = toolbar.getTitle();
        this.f1154j = toolbar.getSubtitle();
        this.f1152h = this.f1153i != null;
        this.f1151g = toolbar.getNavigationIcon();
        q.a1 a1VarV = q.a1.v(toolbar.getContext(), null, j.f20134a, i.a.f20003c, 0);
        this.f1161q = a1VarV.g(j.f20188l);
        if (z10) {
            CharSequence charSequenceP = a1VarV.p(j.f20218r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                C(charSequenceP);
            }
            CharSequence charSequenceP2 = a1VarV.p(j.f20208p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                B(charSequenceP2);
            }
            Drawable drawableG = a1VarV.g(j.f20198n);
            if (drawableG != null) {
                x(drawableG);
            }
            Drawable drawableG2 = a1VarV.g(j.f20193m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f1151g == null && (drawable = this.f1161q) != null) {
                A(drawable);
            }
            i(a1VarV.k(j.f20168h, 0));
            int iN = a1VarV.n(j.f20163g, 0);
            if (iN != 0) {
                v(LayoutInflater.from(this.f1146a.getContext()).inflate(iN, (ViewGroup) this.f1146a, false));
                i(this.b | 16);
            }
            int iM = a1VarV.m(j.f20178j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1146a.getLayoutParams();
                layoutParams.height = iM;
                this.f1146a.setLayoutParams(layoutParams);
            }
            int iE = a1VarV.e(j.f20158f, -1);
            int iE2 = a1VarV.e(j.f20153e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f1146a.K(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = a1VarV.n(j.f20223s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f1146a;
                toolbar2.N(toolbar2.getContext(), iN2);
            }
            int iN3 = a1VarV.n(j.f20213q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f1146a;
                toolbar3.M(toolbar3.getContext(), iN3);
            }
            int iN4 = a1VarV.n(j.f20203o, 0);
            if (iN4 != 0) {
                this.f1146a.setPopupTheme(iN4);
            }
        } else {
            this.b = u();
        }
        a1VarV.x();
        w(i10);
        this.f1155k = this.f1146a.getNavigationContentDescription();
        this.f1146a.setNavigationOnClickListener(new a());
    }

    @Override // q.f0
    public void setIcon(Drawable drawable) {
        this.f1149e = drawable;
        G();
    }
}
