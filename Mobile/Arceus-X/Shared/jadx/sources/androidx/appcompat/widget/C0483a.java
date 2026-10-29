package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.AbstractC0411a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0415e;
import androidx.appcompat.view.menu.C0417g;
import androidx.appcompat.view.menu.C0418h;
import androidx.appcompat.view.menu.InterfaceC0419i;
import androidx.appcompat.view.menu.InterfaceC0420j;
import androidx.appcompat.view.menu.SubMenuC0422l;
import androidx.core.view.AbstractC0585b;
import androidx.core.view.GravityCompat;
import java.util.ArrayList;
import p181i.C6589a;
import p181i.C6595g;
import p316o.C9608a;
import p346p.InterfaceC10082f;
import p365q.AbstractViewOnTouchListenerC10390n0;
import p365q.C10369e1;
import p365q.C10395q;
import p368q2.C10425a;

/* JADX INFO: renamed from: androidx.appcompat.widget.a */
/* JADX INFO: loaded from: classes.dex */
public class C0483a extends AbstractC0411a implements AbstractC0585b.a {

    /* JADX INFO: renamed from: A */
    public c f1640A;

    /* JADX INFO: renamed from: B */
    public b f1641B;

    /* JADX INFO: renamed from: C */
    public final f f1642C;

    /* JADX INFO: renamed from: D */
    public int f1643D;

    /* JADX INFO: renamed from: k */
    public d f1644k;

    /* JADX INFO: renamed from: l */
    public Drawable f1645l;

    /* JADX INFO: renamed from: m */
    public boolean f1646m;

    /* JADX INFO: renamed from: n */
    public boolean f1647n;

    /* JADX INFO: renamed from: o */
    public boolean f1648o;

    /* JADX INFO: renamed from: p */
    public int f1649p;

    /* JADX INFO: renamed from: q */
    public int f1650q;

    /* JADX INFO: renamed from: r */
    public int f1651r;

    /* JADX INFO: renamed from: s */
    public boolean f1652s;

    /* JADX INFO: renamed from: t */
    public boolean f1653t;

    /* JADX INFO: renamed from: u */
    public boolean f1654u;

    /* JADX INFO: renamed from: v */
    public boolean f1655v;

    /* JADX INFO: renamed from: w */
    public int f1656w;

    /* JADX INFO: renamed from: x */
    public final SparseBooleanArray f1657x;

    /* JADX INFO: renamed from: y */
    public e f1658y;

    /* JADX INFO: renamed from: z */
    public a f1659z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a */
    public class a extends C0418h {
        public a(Context context, SubMenuC0422l subMenuC0422l, View view) {
            super(context, subMenuC0422l, view, false, C6589a.f25034m);
            if (!((C0417g) subMenuC0422l.getItem()).m1675l()) {
                View view2 = C0483a.this.f1644k;
                m1695f(view2 == null ? (View) C0483a.this.f1141i : view2);
            }
            m1699j(C0483a.this.f1642C);
        }

        @Override // androidx.appcompat.view.menu.C0418h
        /* JADX INFO: renamed from: e */
        public void mo1694e() {
            C0483a c0483a = C0483a.this;
            c0483a.f1659z = null;
            c0483a.f1643D = 0;
            super.mo1694e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$b */
    public class b extends ActionMenuItemView.AbstractC0410b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0410b
        /* JADX INFO: renamed from: a */
        public InterfaceC10082f mo1544a() {
            a aVar = C0483a.this.f1659z;
            if (aVar != null) {
                return aVar.m1692c();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public e f1662a;

        public c(e eVar) {
            this.f1662a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0483a.this.f1135c != null) {
                C0483a.this.f1135c.m1632d();
            }
            View view = (View) C0483a.this.f1141i;
            if (view != null && view.getWindowToken() != null && this.f1662a.m1702m()) {
                C0483a.this.f1658y = this.f1662a;
            }
            C0483a.this.f1640A = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$d */
    public class d extends C10395q implements ActionMenuView.InterfaceC0431a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.a$d$a */
        public class a extends AbstractViewOnTouchListenerC10390n0 {

            /* JADX INFO: renamed from: j */
            public final /* synthetic */ C0483a f1665j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view, C0483a c0483a) {
                super(view);
                this.f1665j = c0483a;
            }

            @Override // p365q.AbstractViewOnTouchListenerC10390n0
            /* JADX INFO: renamed from: b */
            public InterfaceC10082f mo1542b() {
                e eVar = C0483a.this.f1658y;
                if (eVar == null) {
                    return null;
                }
                return eVar.m1692c();
            }

            @Override // p365q.AbstractViewOnTouchListenerC10390n0
            /* JADX INFO: renamed from: c */
            public boolean mo1543c() {
                C0483a.this.m1964L();
                return true;
            }

            @Override // p365q.AbstractViewOnTouchListenerC10390n0
            /* JADX INFO: renamed from: d */
            public boolean mo1773d() {
                C0483a c0483a = C0483a.this;
                if (c0483a.f1640A != null) {
                    return false;
                }
                c0483a.m1955C();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, C6589a.f25033l);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C10369e1.m39834a(this, getContentDescription());
            setOnTouchListener(new a(this, C0483a.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0431a
        /* JADX INFO: renamed from: a */
        public boolean mo1535a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0431a
        /* JADX INFO: renamed from: b */
        public boolean mo1536b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0483a.this.m1964L();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C10425a.m40115l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$e */
    public class e extends C0418h {
        public e(Context context, C0415e c0415e, View view, boolean z10) {
            super(context, c0415e, view, z10, C6589a.f25034m);
            m1697h(GravityCompat.END);
            m1699j(C0483a.this.f1642C);
        }

        @Override // androidx.appcompat.view.menu.C0418h
        /* JADX INFO: renamed from: e */
        public void mo1694e() {
            if (C0483a.this.f1135c != null) {
                C0483a.this.f1135c.close();
            }
            C0483a.this.f1658y = null;
            super.mo1694e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$f */
    public class f implements InterfaceC0419i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0419i.a
        /* JADX INFO: renamed from: b */
        public void mo1659b(@NonNull C0415e c0415e, boolean z10) {
            if (c0415e instanceof SubMenuC0422l) {
                c0415e.mo1603D().m1634e(false);
            }
            InterfaceC0419i.a aVarM1564n = C0483a.this.m1564n();
            if (aVarM1564n != null) {
                aVarM1564n.mo1659b(c0415e, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0419i.a
        /* JADX INFO: renamed from: c */
        public boolean mo1660c(@NonNull C0415e c0415e) {
            if (c0415e == C0483a.this.f1135c) {
                return false;
            }
            C0483a.this.f1643D = ((SubMenuC0422l) c0415e).getItem().getItemId();
            InterfaceC0419i.a aVarM1564n = C0483a.this.m1564n();
            if (aVarM1564n != null) {
                return aVarM1564n.mo1660c(c0415e);
            }
            return false;
        }
    }

    public C0483a(Context context) {
        super(context, C6595g.f25162c, C6595g.f25161b);
        this.f1657x = new SparseBooleanArray();
        this.f1642C = new f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final View m1953A(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1141i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof InterfaceC0420j.a) && ((InterfaceC0420j.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public Drawable m1954B() {
        d dVar = this.f1644k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1646m) {
            return this.f1645l;
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public boolean m1955C() {
        Object obj;
        c cVar = this.f1640A;
        if (cVar != null && (obj = this.f1141i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f1640A = null;
            return true;
        }
        e eVar = this.f1658y;
        if (eVar == null) {
            return false;
        }
        eVar.m1691b();
        return true;
    }

    /* JADX INFO: renamed from: D */
    public boolean m1956D() {
        a aVar = this.f1659z;
        if (aVar == null) {
            return false;
        }
        aVar.m1691b();
        return true;
    }

    /* JADX INFO: renamed from: E */
    public boolean m1957E() {
        return this.f1640A != null || m1958F();
    }

    /* JADX INFO: renamed from: F */
    public boolean m1958F() {
        e eVar = this.f1658y;
        return eVar != null && eVar.m1693d();
    }

    /* JADX INFO: renamed from: G */
    public void m1959G(Configuration configuration) {
        if (!this.f1652s) {
            this.f1651r = C9608a.m37910b(this.f1134b).m37913d();
        }
        C0415e c0415e = this.f1135c;
        if (c0415e != null) {
            c0415e.m1611L(true);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m1960H(boolean z10) {
        this.f1655v = z10;
    }

    /* JADX INFO: renamed from: I */
    public void m1961I(ActionMenuView actionMenuView) {
        this.f1141i = actionMenuView;
        actionMenuView.mo1545a(this.f1135c);
    }

    /* JADX INFO: renamed from: J */
    public void m1962J(Drawable drawable) {
        d dVar = this.f1644k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f1646m = true;
            this.f1645l = drawable;
        }
    }

    /* JADX INFO: renamed from: K */
    public void m1963K(boolean z10) {
        this.f1647n = z10;
        this.f1648o = true;
    }

    /* JADX INFO: renamed from: L */
    public boolean m1964L() {
        C0415e c0415e;
        if (!this.f1647n || m1958F() || (c0415e = this.f1135c) == null || this.f1141i == null || this.f1640A != null || c0415e.m1655z().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f1134b, this.f1135c, this.f1644k, true));
        this.f1640A = cVar;
        ((View) this.f1141i).post(cVar);
        return true;
    }

    @Override // androidx.core.view.AbstractC0585b.a
    /* JADX INFO: renamed from: a */
    public void mo1965a(boolean z10) {
        if (z10) {
            super.mo1556e(null);
            return;
        }
        C0415e c0415e = this.f1135c;
        if (c0415e != null) {
            c0415e.m1634e(false);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0411a, androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: b */
    public void mo1553b(C0415e c0415e, boolean z10) {
        m1966z();
        super.mo1553b(c0415e, z10);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0411a, androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: e */
    public boolean mo1556e(SubMenuC0422l subMenuC0422l) {
        boolean z10 = false;
        if (!subMenuC0422l.hasVisibleItems()) {
            return false;
        }
        SubMenuC0422l subMenuC0422l2 = subMenuC0422l;
        while (subMenuC0422l2.m1705f0() != this.f1135c) {
            subMenuC0422l2 = (SubMenuC0422l) subMenuC0422l2.m1705f0();
        }
        View viewM1953A = m1953A(subMenuC0422l2.getItem());
        if (viewM1953A == null) {
            return false;
        }
        this.f1643D = subMenuC0422l.getItem().getItemId();
        int size = subMenuC0422l.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = subMenuC0422l.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
        }
        a aVar = new a(this.f1134b, subMenuC0422l, viewM1953A);
        this.f1659z = aVar;
        aVar.m1696g(z10);
        this.f1659z.m1700k();
        super.mo1556e(subMenuC0422l);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0411a, androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: f */
    public void mo1557f(boolean z10) {
        super.mo1557f(z10);
        ((View) this.f1141i).requestLayout();
        C0415e c0415e = this.f1135c;
        boolean z11 = false;
        if (c0415e != null) {
            ArrayList<C0417g> arrayListM1648s = c0415e.m1648s();
            int size = arrayListM1648s.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC0585b abstractC0585bMo1665a = arrayListM1648s.get(i10).mo1665a();
                if (abstractC0585bMo1665a != null) {
                    abstractC0585bMo1665a.m2812i(this);
                }
            }
        }
        C0415e c0415e2 = this.f1135c;
        ArrayList<C0417g> arrayListM1655z = c0415e2 != null ? c0415e2.m1655z() : null;
        if (this.f1647n && arrayListM1655z != null) {
            int size2 = arrayListM1655z.size();
            if (size2 == 1) {
                z11 = !arrayListM1655z.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f1644k == null) {
                this.f1644k = new d(this.f1133a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1644k.getParent();
            if (viewGroup != this.f1141i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1644k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1141i;
                actionMenuView.addView(this.f1644k, actionMenuView.m1754D());
            }
        } else {
            d dVar = this.f1644k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f1141i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f1644k);
                }
            }
        }
        ((ActionMenuView) this.f1141i).setOverflowReserved(this.f1647n);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:103:0x013b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.a] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: g */
    public boolean mo1575g() {
        ArrayList<C0417g> arrayListM1604E;
        int size;
        int i10;
        int iM1750J;
        ?? r8;
        C0483a c0483a = this;
        C0415e c0415e = c0483a.f1135c;
        View view = null;
        ?? r10 = 0;
        if (c0415e != null) {
            arrayListM1604E = c0415e.m1604E();
            size = arrayListM1604E.size();
        } else {
            arrayListM1604E = null;
            size = 0;
        }
        int i11 = c0483a.f1651r;
        int i12 = c0483a.f1650q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0483a.f1141i;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            C0417g c0417g = arrayListM1604E.get(i15);
            if (c0417g.m1678o()) {
                i13++;
            } else if (c0417g.m1677n()) {
                i14++;
            } else {
                z10 = true;
            }
            if (c0483a.f1655v && c0417g.isActionViewExpanded()) {
                i11 = 0;
            }
        }
        if (c0483a.f1647n && (z10 || i14 + i13 > i11)) {
            i11--;
        }
        int i16 = i11 - i13;
        SparseBooleanArray sparseBooleanArray = c0483a.f1657x;
        sparseBooleanArray.clear();
        if (c0483a.f1653t) {
            int i17 = c0483a.f1656w;
            iM1750J = i12 / i17;
            i10 = i17 + ((i12 % i17) / iM1750J);
        } else {
            i10 = 0;
            iM1750J = 0;
        }
        int i18 = 0;
        int i19 = 0;
        ?? r11 = c0483a;
        while (i18 < size) {
            C0417g c0417g2 = arrayListM1604E.get(i18);
            if (c0417g2.m1678o()) {
                View viewMo1565o = r11.mo1565o(c0417g2, view, viewGroup);
                if (r11.f1653t) {
                    iM1750J -= ActionMenuView.m1750J(viewMo1565o, i10, iM1750J, iMakeMeasureSpec, r10);
                } else {
                    viewMo1565o.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewMo1565o.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                int groupId = c0417g2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c0417g2.m1684u(true);
                r8 = r10;
            } else if (c0417g2.m1677n()) {
                int groupId2 = c0417g2.getGroupId();
                boolean z11 = sparseBooleanArray.get(groupId2);
                boolean z12 = (i16 > 0 || z11) && i12 > 0 && (!r11.f1653t || iM1750J > 0);
                boolean z13 = z12;
                if (z12) {
                    View viewMo1565o2 = r11.mo1565o(c0417g2, null, viewGroup);
                    if (r11.f1653t) {
                        int iM1750J2 = ActionMenuView.m1750J(viewMo1565o2, i10, iM1750J, iMakeMeasureSpec, 0);
                        iM1750J -= iM1750J2;
                        if (iM1750J2 == 0) {
                            z13 = false;
                        }
                    } else {
                        viewMo1565o2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z14 = z13;
                    int measuredWidth2 = viewMo1565o2.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z12 = z14 & (!r11.f1653t ? i12 + i19 <= 0 : i12 < 0);
                }
                if (z12 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z11) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i20 = 0; i20 < i18; i20++) {
                        C0417g c0417g3 = arrayListM1604E.get(i20);
                        if (c0417g3.getGroupId() == groupId2) {
                            if (c0417g3.m1675l()) {
                                i16++;
                            }
                            c0417g3.m1684u(false);
                        }
                    }
                }
                if (z12) {
                    i16--;
                }
                c0417g2.m1684u(z12);
                r8 = 0;
            } else {
                r8 = r10;
                c0417g2.m1684u(r8);
            }
            i18++;
            r10 = r8;
            size = size;
            view = null;
            r11 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0411a, androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: i */
    public void mo1559i(@NonNull Context context, C0415e c0415e) {
        super.mo1559i(context, c0415e);
        Resources resources = context.getResources();
        C9608a c9608aM37910b = C9608a.m37910b(context);
        if (!this.f1648o) {
            this.f1647n = c9608aM37910b.m37917h();
        }
        if (!this.f1654u) {
            this.f1649p = c9608aM37910b.m37912c();
        }
        if (!this.f1652s) {
            this.f1651r = c9608aM37910b.m37913d();
        }
        int measuredWidth = this.f1649p;
        if (this.f1647n) {
            if (this.f1644k == null) {
                d dVar = new d(this.f1133a);
                this.f1644k = dVar;
                if (this.f1646m) {
                    dVar.setImageDrawable(this.f1645l);
                    this.f1645l = null;
                    this.f1646m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1644k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1644k.getMeasuredWidth();
        } else {
            this.f1644k = null;
        }
        this.f1650q = measuredWidth;
        this.f1656w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0411a
    /* JADX INFO: renamed from: k */
    public void mo1561k(C0417g c0417g, InterfaceC0420j.a aVar) {
        aVar.mo1537c(c0417g, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1141i);
        if (this.f1641B == null) {
            this.f1641B = new b();
        }
        actionMenuItemView.setPopupCallback(this.f1641B);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0411a
    /* JADX INFO: renamed from: m */
    public boolean mo1563m(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1644k) {
            return false;
        }
        return super.mo1563m(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0411a
    /* JADX INFO: renamed from: o */
    public View mo1565o(C0417g c0417g, View view, ViewGroup viewGroup) {
        View actionView = c0417g.getActionView();
        if (actionView == null || c0417g.m1673j()) {
            actionView = super.mo1565o(c0417g, view, viewGroup);
        }
        actionView.setVisibility(c0417g.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0411a
    /* JADX INFO: renamed from: p */
    public InterfaceC0420j mo1566p(ViewGroup viewGroup) {
        InterfaceC0420j interfaceC0420j = this.f1141i;
        InterfaceC0420j interfaceC0420jMo1566p = super.mo1566p(viewGroup);
        if (interfaceC0420j != interfaceC0420jMo1566p) {
            ((ActionMenuView) interfaceC0420jMo1566p).setPresenter(this);
        }
        return interfaceC0420jMo1566p;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0411a
    /* JADX INFO: renamed from: r */
    public boolean mo1568r(int i10, C0417g c0417g) {
        return c0417g.m1675l();
    }

    /* JADX INFO: renamed from: z */
    public boolean m1966z() {
        return m1955C() | m1956D();
    }
}
