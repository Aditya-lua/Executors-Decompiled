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
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.l;
import java.util.ArrayList;
import q.f1;
import q.o0;
import q.q;

/* JADX INFO: loaded from: classes.dex */
public class a extends androidx.appcompat.view.menu.a implements androidx.core.view.b.a {
    public c A;
    public b B;
    public final f C;
    public int D;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f1053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f1054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1062t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1063u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1064v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final SparseBooleanArray f1066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f1067y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0023a f1068z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    public class C0023a extends h {
        public C0023a(Context context, l lVar, View view) {
            super(context, lVar, view, false, i.a.f18740m);
            if (!((g) lVar.getItem()).l()) {
                View view2 = a.this.f1053k;
                f(view2 == null ? (View) a.this.f692i : view2);
            }
            j(a.this.C);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            a aVar = a.this;
            aVar.f1068z = null;
            aVar.D = 0;
            super.e();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public p.f a() {
            C0023a c0023a = a.this.f1068z;
            if (c0023a != null) {
                return c0023a.c();
            }
            return null;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f1071a;

        public c(e eVar) {
            this.f1071a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f686c != null) {
                a.this.f686c.d();
            }
            View view = (View) a.this.f692i;
            if (view != null && view.getWindowToken() != null && this.f1071a.m()) {
                a.this.f1067y = this.f1071a;
            }
            a.this.A = null;
        }
    }

    public class d extends q implements ActionMenuView.a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.a$d$a, reason: collision with other inner class name */
        public class C0024a extends o0 {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ a f1073j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0024a(View view, a aVar) {
                super(view);
                this.f1073j = aVar;
            }

            @Override // q.o0
            public p.f b() {
                e eVar = a.this.f1067y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // q.o0
            public boolean c() {
                a.this.L();
                return true;
            }

            @Override // q.o0
            public boolean d() {
                a aVar = a.this;
                if (aVar.A != null) {
                    return false;
                }
                aVar.C();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, i.a.f18739l);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            f1.a(this, getContentDescription());
            setOnTouchListener(new C0024a(this, a.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.L();
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
                q2.a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class e extends h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, i.a.f18740m);
            h(8388613);
            j(a.this.C);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            if (a.this.f686c != null) {
                a.this.f686c.close();
            }
            a.this.f1067y = null;
            super.e();
        }
    }

    public class f implements i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof l) {
                eVar.D().e(false);
            }
            i.a aVarN = a.this.n();
            if (aVarN != null) {
                aVarN.b(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(@NonNull androidx.appcompat.view.menu.e eVar) {
            if (eVar == a.this.f686c) {
                return false;
            }
            a.this.D = ((l) eVar).getItem().getItemId();
            i.a aVarN = a.this.n();
            if (aVarN != null) {
                return aVarN.c(eVar);
            }
            return false;
        }
    }

    public a(Context context) {
        super(context, i.g.f18823c, i.g.b);
        this.f1066x = new SparseBooleanArray();
        this.C = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View A(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f692i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof j.a) && ((j.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable B() {
        d dVar = this.f1053k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1055m) {
            return this.f1054l;
        }
        return null;
    }

    public boolean C() {
        Object obj;
        c cVar = this.A;
        if (cVar != null && (obj = this.f692i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.A = null;
            return true;
        }
        e eVar = this.f1067y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean D() {
        C0023a c0023a = this.f1068z;
        if (c0023a == null) {
            return false;
        }
        c0023a.b();
        return true;
    }

    public boolean E() {
        return this.A != null || F();
    }

    public boolean F() {
        e eVar = this.f1067y;
        return eVar != null && eVar.d();
    }

    public void G(Configuration configuration) {
        if (!this.f1061s) {
            this.f1060r = o.a.b(this.b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f686c;
        if (eVar != null) {
            eVar.L(true);
        }
    }

    public void H(boolean z10) {
        this.f1064v = z10;
    }

    public void I(ActionMenuView actionMenuView) {
        this.f692i = actionMenuView;
        actionMenuView.a(this.f686c);
    }

    public void J(Drawable drawable) {
        d dVar = this.f1053k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f1055m = true;
            this.f1054l = drawable;
        }
    }

    public void K(boolean z10) {
        this.f1056n = z10;
        this.f1057o = true;
    }

    public boolean L() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f1056n || F() || (eVar = this.f686c) == null || this.f692i == null || this.A != null || eVar.z().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.b, this.f686c, this.f1053k, true));
        this.A = cVar;
        ((View) this.f692i).post(cVar);
        return true;
    }

    @Override // androidx.core.view.b.a
    public void a(boolean z10) {
        if (z10) {
            super.e(null);
            return;
        }
        androidx.appcompat.view.menu.e eVar = this.f686c;
        if (eVar != null) {
            eVar.e(false);
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        z();
        super.b(eVar, z10);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        boolean z10 = false;
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        l lVar2 = lVar;
        while (lVar2.f0() != this.f686c) {
            lVar2 = (l) lVar2.f0();
        }
        View viewA = A(lVar2.getItem());
        if (viewA == null) {
            return false;
        }
        this.D = lVar.getItem().getItemId();
        int size = lVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = lVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
        }
        C0023a c0023a = new C0023a(this.b, lVar, viewA);
        this.f1068z = c0023a;
        c0023a.g(z10);
        this.f1068z.k();
        super.e(lVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void f(boolean z10) {
        super.f(z10);
        ((View) this.f692i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f686c;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList<g> arrayListS = eVar.s();
            int size = arrayListS.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.core.view.b bVarA = arrayListS.get(i10).a();
                if (bVarA != null) {
                    bVarA.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f686c;
        ArrayList<g> arrayListZ = eVar2 != null ? eVar2.z() : null;
        if (this.f1056n && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z11 = !arrayListZ.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f1053k == null) {
                this.f1053k = new d(this.f685a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1053k.getParent();
            if (viewGroup != this.f692i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1053k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f692i;
                actionMenuView.addView(this.f1053k, actionMenuView.D());
            }
        } else {
            d dVar = this.f1053k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f692i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f1053k);
                }
            }
        }
        ((ActionMenuView) this.f692i).setOverflowReserved(this.f1056n);
    }

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
    @Override // androidx.appcompat.view.menu.i
    public boolean g() {
        ArrayList<g> arrayListE;
        int size;
        int i10;
        int iJ;
        ?? r10;
        a aVar = this;
        androidx.appcompat.view.menu.e eVar = aVar.f686c;
        View view = null;
        ?? r11 = 0;
        if (eVar != null) {
            arrayListE = eVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i11 = aVar.f1060r;
        int i12 = aVar.f1059q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.f692i;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            g gVar = arrayListE.get(i15);
            if (gVar.o()) {
                i13++;
            } else if (gVar.n()) {
                i14++;
            } else {
                z10 = true;
            }
            if (aVar.f1064v && gVar.isActionViewExpanded()) {
                i11 = 0;
            }
        }
        if (aVar.f1056n && (z10 || i14 + i13 > i11)) {
            i11--;
        }
        int i16 = i11 - i13;
        SparseBooleanArray sparseBooleanArray = aVar.f1066x;
        sparseBooleanArray.clear();
        if (aVar.f1062t) {
            int i17 = aVar.f1065w;
            iJ = i12 / i17;
            i10 = i17 + ((i12 % i17) / iJ);
        } else {
            i10 = 0;
            iJ = 0;
        }
        int i18 = 0;
        int i19 = 0;
        ?? r12 = aVar;
        while (i18 < size) {
            g gVar2 = arrayListE.get(i18);
            if (gVar2.o()) {
                View viewO = r12.o(gVar2, view, viewGroup);
                if (r12.f1062t) {
                    iJ -= ActionMenuView.J(viewO, i10, iJ, iMakeMeasureSpec, r11);
                } else {
                    viewO.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewO.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                r10 = r11;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z11 = sparseBooleanArray.get(groupId2);
                boolean z12 = (i16 > 0 || z11) && i12 > 0 && (!r12.f1062t || iJ > 0);
                boolean z13 = z12;
                if (z12) {
                    View viewO2 = r12.o(gVar2, null, viewGroup);
                    if (r12.f1062t) {
                        int iJ2 = ActionMenuView.J(viewO2, i10, iJ, iMakeMeasureSpec, 0);
                        iJ -= iJ2;
                        if (iJ2 == 0) {
                            z13 = false;
                        }
                    } else {
                        viewO2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z14 = z13;
                    int measuredWidth2 = viewO2.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z12 = z14 & (!r12.f1062t ? i12 + i19 <= 0 : i12 < 0);
                }
                if (z12 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z11) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i20 = 0; i20 < i18; i20++) {
                        g gVar3 = arrayListE.get(i20);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i16++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z12) {
                    i16--;
                }
                gVar2.u(z12);
                r10 = 0;
            } else {
                r10 = r11;
                gVar2.u(r10);
            }
            i18++;
            r11 = r10;
            size = size;
            view = null;
            r12 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void i(@NonNull Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        o.a aVarB = o.a.b(context);
        if (!this.f1057o) {
            this.f1056n = aVarB.h();
        }
        if (!this.f1063u) {
            this.f1058p = aVarB.c();
        }
        if (!this.f1061s) {
            this.f1060r = aVarB.d();
        }
        int measuredWidth = this.f1058p;
        if (this.f1056n) {
            if (this.f1053k == null) {
                d dVar = new d(this.f685a);
                this.f1053k = dVar;
                if (this.f1055m) {
                    dVar.setImageDrawable(this.f1054l);
                    this.f1054l = null;
                    this.f1055m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1053k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1053k.getMeasuredWidth();
        } else {
            this.f1053k = null;
        }
        this.f1059q = measuredWidth;
        this.f1065w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public void k(g gVar, j.a aVar) {
        aVar.c(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f692i);
        if (this.B == null) {
            this.B = new b();
        }
        actionMenuItemView.setPopupCallback(this.B);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean m(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1053k) {
            return false;
        }
        return super.m(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View o(g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.o(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public j p(ViewGroup viewGroup) {
        j jVar = this.f692i;
        j jVarP = super.p(viewGroup);
        if (jVar != jVarP) {
            ((ActionMenuView) jVarP).setPresenter(this);
        }
        return jVarP;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean r(int i10, g gVar) {
        return gVar.l();
    }

    public boolean z() {
        return C() | D();
    }
}
