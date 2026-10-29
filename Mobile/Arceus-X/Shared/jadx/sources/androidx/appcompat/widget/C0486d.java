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
import androidx.appcompat.view.menu.C0415e;
import androidx.appcompat.view.menu.InterfaceC0419i;
import androidx.core.view.C0584a1;
import androidx.core.view.C0625o0;
import androidx.core.view.C0645y0;
import p181i.C6589a;
import p181i.C6593e;
import p181i.C6594f;
import p181i.C6596h;
import p181i.C6598j;
import p232k.C7399a;
import p346p.C10077a;
import p365q.C10357a1;
import p365q.InterfaceC10371f0;

/* JADX INFO: renamed from: androidx.appcompat.widget.d */
/* JADX INFO: loaded from: classes.dex */
public class C0486d implements InterfaceC10371f0 {

    /* JADX INFO: renamed from: a */
    public Toolbar f1704a;

    /* JADX INFO: renamed from: b */
    public int f1705b;

    /* JADX INFO: renamed from: c */
    public View f1706c;

    /* JADX INFO: renamed from: d */
    public View f1707d;

    /* JADX INFO: renamed from: e */
    public Drawable f1708e;

    /* JADX INFO: renamed from: f */
    public Drawable f1709f;

    /* JADX INFO: renamed from: g */
    public Drawable f1710g;

    /* JADX INFO: renamed from: h */
    public boolean f1711h;

    /* JADX INFO: renamed from: i */
    public CharSequence f1712i;

    /* JADX INFO: renamed from: j */
    public CharSequence f1713j;

    /* JADX INFO: renamed from: k */
    public CharSequence f1714k;

    /* JADX INFO: renamed from: l */
    public Window.Callback f1715l;

    /* JADX INFO: renamed from: m */
    public boolean f1716m;

    /* JADX INFO: renamed from: n */
    public C0483a f1717n;

    /* JADX INFO: renamed from: o */
    public int f1718o;

    /* JADX INFO: renamed from: p */
    public int f1719p;

    /* JADX INFO: renamed from: q */
    public Drawable f1720q;

    /* JADX INFO: renamed from: androidx.appcompat.widget.d$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final C10077a f1721a;

        public a() {
            this.f1721a = new C10077a(C0486d.this.f1704a.getContext(), 0, R.id.home, 0, 0, C0486d.this.f1712i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0486d c0486d = C0486d.this;
            Window.Callback callback = c0486d.f1715l;
            if (callback == null || !c0486d.f1716m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1721a);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.d$b */
    public class b extends C0584a1 {

        /* JADX INFO: renamed from: a */
        public boolean f1723a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f1724b;

        public b(int i10) {
            this.f1724b = i10;
        }

        @Override // androidx.core.view.C0584a1, androidx.core.view.InterfaceC0647z0
        /* JADX INFO: renamed from: a */
        public void mo2027a(View view) {
            this.f1723a = true;
        }

        @Override // androidx.core.view.InterfaceC0647z0
        /* JADX INFO: renamed from: b */
        public void mo2028b(View view) {
            if (this.f1723a) {
                return;
            }
            C0486d.this.f1704a.setVisibility(this.f1724b);
        }

        @Override // androidx.core.view.C0584a1, androidx.core.view.InterfaceC0647z0
        /* JADX INFO: renamed from: c */
        public void mo2029c(View view) {
            C0486d.this.f1704a.setVisibility(0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0486d(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, C6596h.f25181a, C6593e.f25100n);
    }

    /* JADX INFO: renamed from: A */
    public void m1994A(Drawable drawable) {
        this.f1710g = drawable;
        m1999F();
    }

    /* JADX INFO: renamed from: B */
    public void m1995B(CharSequence charSequence) {
        this.f1713j = charSequence;
        if ((this.f1705b & 8) != 0) {
            this.f1704a.setSubtitle(charSequence);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m1996C(CharSequence charSequence) {
        this.f1711h = true;
        m1997D(charSequence);
    }

    /* JADX INFO: renamed from: D */
    public final void m1997D(CharSequence charSequence) {
        this.f1712i = charSequence;
        if ((this.f1705b & 8) != 0) {
            this.f1704a.setTitle(charSequence);
            if (this.f1711h) {
                C0625o0.m3046p0(this.f1704a.getRootView(), charSequence);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m1998E() {
        if ((this.f1705b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1714k)) {
                this.f1704a.setNavigationContentDescription(this.f1719p);
            } else {
                this.f1704a.setNavigationContentDescription(this.f1714k);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m1999F() {
        if ((this.f1705b & 4) == 0) {
            this.f1704a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f1704a;
        Drawable drawable = this.f1710g;
        if (drawable == null) {
            drawable = this.f1720q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* JADX INFO: renamed from: G */
    public final void m2000G() {
        Drawable drawable;
        int i10 = this.f1705b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1709f) == null) {
            drawable = this.f1708e;
        }
        this.f1704a.setLogo(drawable);
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: a */
    public boolean mo2001a() {
        return this.f1704a.m1914d();
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: b */
    public boolean mo2002b() {
        return this.f1704a.m1934x();
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: c */
    public boolean mo2003c() {
        return this.f1704a.m1909S();
    }

    @Override // p365q.InterfaceC10371f0
    public void collapseActionView() {
        this.f1704a.m1915e();
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: d */
    public void mo2004d(Menu menu, InterfaceC0419i.a aVar) {
        if (this.f1717n == null) {
            C0483a c0483a = new C0483a(this.f1704a.getContext());
            this.f1717n = c0483a;
            c0483a.m1567q(C6594f.f25140g);
        }
        this.f1717n.mo1555d(aVar);
        this.f1704a.m1903M((C0415e) menu, this.f1717n);
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: e */
    public boolean mo2005e() {
        return this.f1704a.m1893C();
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: f */
    public void mo2006f() {
        this.f1716m = true;
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: g */
    public boolean mo2007g() {
        return this.f1704a.m1892B();
    }

    @Override // p365q.InterfaceC10371f0
    public Context getContext() {
        return this.f1704a.getContext();
    }

    @Override // p365q.InterfaceC10371f0
    public CharSequence getTitle() {
        return this.f1704a.getTitle();
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: h */
    public boolean mo2008h() {
        return this.f1704a.m1933w();
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: i */
    public void mo2009i(int i10) {
        View view;
        int i11 = this.f1705b ^ i10;
        this.f1705b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    m1998E();
                }
                m1999F();
            }
            if ((i11 & 3) != 0) {
                m2000G();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1704a.setTitle(this.f1712i);
                    this.f1704a.setSubtitle(this.f1713j);
                } else {
                    this.f1704a.setTitle((CharSequence) null);
                    this.f1704a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f1707d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1704a.addView(view);
            } else {
                this.f1704a.removeView(view);
            }
        }
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: j */
    public int mo2010j() {
        return this.f1718o;
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: k */
    public C0645y0 mo2011k(int i10, long j10) {
        return C0625o0.m3023e(this.f1704a).m3225b(i10 == 0 ? 1.0f : 0.0f).m3228e(j10).m3230g(new b(i10));
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: l */
    public void mo2012l(boolean z10) {
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: m */
    public void mo2013m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: n */
    public void mo2014n(boolean z10) {
        this.f1704a.setCollapsible(z10);
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: o */
    public void mo2015o() {
        this.f1704a.m1916f();
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: p */
    public void mo2016p(C0485c c0485c) {
        View view = this.f1706c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1704a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1706c);
            }
        }
        this.f1706c = c0485c;
        if (c0485c == null || this.f1718o != 2) {
            return;
        }
        this.f1704a.addView(c0485c, 0);
        Toolbar.C0480g c0480g = (Toolbar.C0480g) this.f1706c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0480g).width = -2;
        ((ViewGroup.MarginLayoutParams) c0480g).height = -2;
        c0480g.f27268a = 8388691;
        c0485c.setAllowCollapse(true);
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: q */
    public void mo2017q(int i10) {
        m2024x(i10 != 0 ? C7399a.m30679b(getContext(), i10) : null);
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: r */
    public void mo2018r(int i10) {
        this.f1704a.setVisibility(i10);
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: s */
    public int mo2019s() {
        return this.f1705b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p365q.InterfaceC10371f0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? C7399a.m30679b(getContext(), i10) : null);
    }

    @Override // p365q.InterfaceC10371f0
    public void setWindowCallback(Window.Callback callback) {
        this.f1715l = callback;
    }

    @Override // p365q.InterfaceC10371f0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1711h) {
            return;
        }
        m1997D(charSequence);
    }

    @Override // p365q.InterfaceC10371f0
    /* JADX INFO: renamed from: t */
    public void mo2020t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* JADX INFO: renamed from: u */
    public final int m2021u() {
        if (this.f1704a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1720q = this.f1704a.getNavigationIcon();
        return 15;
    }

    /* JADX INFO: renamed from: v */
    public void m2022v(View view) {
        View view2 = this.f1707d;
        if (view2 != null && (this.f1705b & 16) != 0) {
            this.f1704a.removeView(view2);
        }
        this.f1707d = view;
        if (view == null || (this.f1705b & 16) == 0) {
            return;
        }
        this.f1704a.addView(view);
    }

    /* JADX INFO: renamed from: w */
    public void m2023w(int i10) {
        if (i10 == this.f1719p) {
            return;
        }
        this.f1719p = i10;
        if (TextUtils.isEmpty(this.f1704a.getNavigationContentDescription())) {
            m2025y(this.f1719p);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m2024x(Drawable drawable) {
        this.f1709f = drawable;
        m2000G();
    }

    /* JADX INFO: renamed from: y */
    public void m2025y(int i10) {
        m2026z(i10 == 0 ? null : getContext().getString(i10));
    }

    /* JADX INFO: renamed from: z */
    public void m2026z(CharSequence charSequence) {
        this.f1714k = charSequence;
        m1998E();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0486d(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1718o = 0;
        this.f1719p = 0;
        this.f1704a = toolbar;
        this.f1712i = toolbar.getTitle();
        this.f1713j = toolbar.getSubtitle();
        this.f1711h = this.f1712i != null;
        this.f1710g = toolbar.getNavigationIcon();
        C10357a1 c10357a1M39728v = C10357a1.m39728v(toolbar.getContext(), null, C6598j.f25326a, C6589a.f25024c, 0);
        this.f1720q = c10357a1M39728v.m39735g(C6598j.f25381l);
        if (z10) {
            CharSequence charSequenceM39744p = c10357a1M39728v.m39744p(C6598j.f25411r);
            if (!TextUtils.isEmpty(charSequenceM39744p)) {
                m1996C(charSequenceM39744p);
            }
            CharSequence charSequenceM39744p2 = c10357a1M39728v.m39744p(C6598j.f25401p);
            if (!TextUtils.isEmpty(charSequenceM39744p2)) {
                m1995B(charSequenceM39744p2);
            }
            Drawable drawableM39735g = c10357a1M39728v.m39735g(C6598j.f25391n);
            if (drawableM39735g != null) {
                m2024x(drawableM39735g);
            }
            Drawable drawableM39735g2 = c10357a1M39728v.m39735g(C6598j.f25386m);
            if (drawableM39735g2 != null) {
                setIcon(drawableM39735g2);
            }
            if (this.f1710g == null && (drawable = this.f1720q) != null) {
                m1994A(drawable);
            }
            mo2009i(c10357a1M39728v.m39739k(C6598j.f25361h, 0));
            int iM39742n = c10357a1M39728v.m39742n(C6598j.f25356g, 0);
            if (iM39742n != 0) {
                m2022v(LayoutInflater.from(this.f1704a.getContext()).inflate(iM39742n, (ViewGroup) this.f1704a, false));
                mo2009i(this.f1705b | 16);
            }
            int iM39741m = c10357a1M39728v.m39741m(C6598j.f25371j, 0);
            if (iM39741m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1704a.getLayoutParams();
                layoutParams.height = iM39741m;
                this.f1704a.setLayoutParams(layoutParams);
            }
            int iM39733e = c10357a1M39728v.m39733e(C6598j.f25351f, -1);
            int iM39733e2 = c10357a1M39728v.m39733e(C6598j.f25346e, -1);
            if (iM39733e >= 0 || iM39733e2 >= 0) {
                this.f1704a.m1902L(Math.max(iM39733e, 0), Math.max(iM39733e2, 0));
            }
            int iM39742n2 = c10357a1M39728v.m39742n(C6598j.f25416s, 0);
            if (iM39742n2 != 0) {
                Toolbar toolbar2 = this.f1704a;
                toolbar2.m1905O(toolbar2.getContext(), iM39742n2);
            }
            int iM39742n3 = c10357a1M39728v.m39742n(C6598j.f25406q, 0);
            if (iM39742n3 != 0) {
                Toolbar toolbar3 = this.f1704a;
                toolbar3.m1904N(toolbar3.getContext(), iM39742n3);
            }
            int iM39742n4 = c10357a1M39728v.m39742n(C6598j.f25396o, 0);
            if (iM39742n4 != 0) {
                this.f1704a.setPopupTheme(iM39742n4);
            }
        } else {
            this.f1705b = m2021u();
        }
        c10357a1M39728v.m39749x();
        m2023w(i10);
        this.f1714k = this.f1704a.getNavigationContentDescription();
        this.f1704a.setNavigationOnClickListener(new a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p365q.InterfaceC10371f0
    public void setIcon(Drawable drawable) {
        this.f1708e = drawable;
        m2000G();
    }
}
