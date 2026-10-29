package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import q.g1;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.b implements androidx.appcompat.view.menu.e.b, j {
    public e A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.appcompat.view.menu.e f1052p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f1053q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1054r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1055s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public androidx.appcompat.widget.a f1056t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i.a f1057u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.appcompat.view.menu.e.a f1058v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1059w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1060x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1061y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1062z;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements i.a {
        @Override // androidx.appcompat.view.menu.i.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(@NonNull androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends androidx.appcompat.widget.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1063a;

        @ViewDebug.ExportedProperty
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f1064c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1065d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1066e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1067f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f1063a = cVar.f1063a;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f1063a = false;
        }
    }

    public class d implements androidx.appcompat.view.menu.e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.A;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.e.a aVar = ActionMenuView.this.f1058v;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    public static int J(View view, int i10, int i11, int i12, int i13) {
        int i14;
        c cVar = (c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = false;
        boolean z11 = actionMenuItemView != null && actionMenuItemView.s();
        if (i11 > 0) {
            i14 = 2;
            if (!z11 || i11 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i15 = measuredWidth / i10;
                if (measuredWidth % i10 != 0) {
                    i15++;
                }
                if (!z11 || i15 >= 2) {
                    i14 = i15;
                }
            } else {
                i14 = 0;
            }
        } else {
            i14 = 0;
        }
        if (!cVar.f1063a && z11) {
            z10 = true;
        }
        cVar.f1065d = z10;
        cVar.b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), iMakeMeasureSpec);
        return i14;
    }

    @Override // androidx.appcompat.widget.b
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.b
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c D() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f1063a = true;
        return cVarGenerateDefaultLayoutParams;
    }

    public boolean E(int i10) {
        boolean zA = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            zA = ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? zA : ((a) childAt2).b() | zA;
    }

    public boolean F() {
        androidx.appcompat.widget.a aVar = this.f1056t;
        return aVar != null && aVar.C();
    }

    public boolean G() {
        androidx.appcompat.widget.a aVar = this.f1056t;
        return aVar != null && aVar.E();
    }

    public boolean H() {
        androidx.appcompat.widget.a aVar = this.f1056t;
        return aVar != null && aVar.F();
    }

    public boolean I() {
        return this.f1055s;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    public final void K(int i10, int i11) {
        long j10;
        int i12;
        boolean z10;
        ?? r8;
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i14 = size - paddingLeft;
        int i15 = this.f1061y;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = i15 + (i17 / i16);
        int childCount = getChildCount();
        int iMax = 0;
        int i19 = 0;
        boolean z11 = false;
        int i20 = 0;
        int iMax2 = 0;
        int i21 = 0;
        long j11 = 0;
        while (i19 < childCount) {
            View childAt = getChildAt(i19);
            int i22 = size2;
            if (childAt.getVisibility() == 8) {
                i13 = i18;
            } else {
                boolean z12 = childAt instanceof ActionMenuItemView;
                i20++;
                if (z12) {
                    int i23 = this.f1062z;
                    r8 = 0;
                    childAt.setPadding(i23, 0, i23, 0);
                } else {
                    r8 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f1067f = r8;
                cVar.f1064c = r8;
                cVar.b = r8;
                cVar.f1065d = r8;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r8;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r8;
                cVar.f1066e = z12 && ((ActionMenuItemView) childAt).s();
                int iJ = J(childAt, i18, cVar.f1063a ? 1 : i16, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iJ);
                i13 = i18;
                if (cVar.f1065d) {
                    i21++;
                }
                if (cVar.f1063a) {
                    z11 = true;
                }
                i16 -= iJ;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iJ == 1) {
                    j11 |= (long) (1 << i19);
                }
            }
            i19++;
            size2 = i22;
            i18 = i13;
        }
        int i24 = size2;
        int i25 = i18;
        char c10 = 2;
        boolean z13 = z11 && i20 == 2;
        boolean z14 = false;
        while (true) {
            if (i21 <= 0 || i16 <= 0) {
                j10 = 1;
                break;
            }
            int i26 = Integer.MAX_VALUE;
            long j12 = 0;
            char c11 = c10;
            int i27 = 0;
            int i28 = 0;
            j10 = 1;
            while (i28 < childCount) {
                c cVar2 = (c) getChildAt(i28).getLayoutParams();
                boolean z15 = z13;
                if (cVar2.f1065d) {
                    int i29 = cVar2.b;
                    if (i29 < i26) {
                        j12 = 1 << i28;
                        i26 = i29;
                        i27 = 1;
                    } else if (i29 == i26) {
                        j12 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                z13 = z15;
            }
            boolean z16 = z13;
            j11 |= j12;
            if (i27 > i16) {
                break;
            }
            int i30 = i26 + 1;
            int i31 = 0;
            while (i31 < childCount) {
                View childAt2 = getChildAt(i31);
                c cVar3 = (c) childAt2.getLayoutParams();
                long j13 = 1 << i31;
                if ((j12 & j13) == 0) {
                    if (cVar3.b == i30) {
                        j11 |= j13;
                    }
                    i31 = i31;
                } else {
                    if (!z16 || !cVar3.f1066e) {
                        z10 = true;
                    } else if (i16 == 1) {
                        int i32 = this.f1062z;
                        z10 = true;
                        childAt2.setPadding(i32 + i25, 0, i32, 0);
                    } else {
                        z10 = true;
                    }
                    cVar3.b++;
                    cVar3.f1067f = z10;
                    i16--;
                }
                i31++;
            }
            c10 = c11;
            z13 = z16;
            z14 = true;
        }
        boolean z17 = !z11 && i20 == 1;
        if (i16 <= 0 || j11 == 0 || (i16 >= i20 - 1 && !z17 && iMax2 <= 1)) {
            i12 = 0;
        } else {
            float fBitCount = Long.bitCount(j11);
            if (z17) {
                i12 = 0;
            } else {
                if ((j11 & j10) != 0) {
                    i12 = 0;
                    if (!((c) getChildAt(0).getLayoutParams()).f1066e) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i12 = 0;
                }
                int i33 = childCount - 1;
                if ((j11 & ((long) (1 << i33))) != 0 && !((c) getChildAt(i33).getLayoutParams()).f1066e) {
                    fBitCount -= 0.5f;
                }
            }
            int i34 = fBitCount > 0.0f ? (int) ((i16 * i25) / fBitCount) : i12;
            boolean z18 = z14;
            for (int i35 = i12; i35 < childCount; i35++) {
                if ((j11 & ((long) (1 << i35))) != 0) {
                    View childAt3 = getChildAt(i35);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1064c = i34;
                        cVar4.f1067f = true;
                        if (i35 == 0 && !cVar4.f1066e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i34) / 2;
                        }
                        z18 = true;
                    } else if (cVar4.f1063a) {
                        cVar4.f1064c = i34;
                        cVar4.f1067f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i34) / 2;
                        z18 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z14 = z18;
        }
        if (z14) {
            for (int i36 = i12; i36 < childCount; i36++) {
                View childAt4 = getChildAt(i36);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f1067f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.b * i25) + cVar5.f1064c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i14, mode != 1073741824 ? iMax : i24);
    }

    public androidx.appcompat.view.menu.e L() {
        return this.f1052p;
    }

    public void M(i.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.f1057u = aVar;
        this.f1058v = aVar2;
    }

    public boolean N() {
        androidx.appcompat.widget.a aVar = this.f1056t;
        return aVar != null && aVar.L();
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(androidx.appcompat.view.menu.e eVar) {
        this.f1052p = eVar;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean b(g gVar) {
        return this.f1052p.M(gVar, 0);
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1052p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f1052p = eVar;
            eVar.S(new d());
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.f1056t = aVar;
            aVar.K(true);
            androidx.appcompat.widget.a aVar2 = this.f1056t;
            i.a bVar = this.f1057u;
            if (bVar == null) {
                bVar = new b();
            }
            aVar2.d(bVar);
            this.f1052p.c(this.f1056t, this.f1053q);
            this.f1056t.I(this);
        }
        return this.f1052p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1056t.B();
    }

    public int getPopupTheme() {
        return this.f1054r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.f1056t;
        if (aVar != null) {
            aVar.f(false);
            if (this.f1056t.F()) {
                this.f1056t.C();
                this.f1056t.L();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f1059w) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean zB = g1.b(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1063a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (E(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    E(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1063a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1063a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = i27 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = this.f1059w;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f1059w = z11;
        if (z10 != z11) {
            this.f1060x = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f1059w && (eVar = this.f1052p) != null && size != this.f1060x) {
            this.f1060x = size;
            eVar.L(true);
        }
        int childCount = getChildCount();
        if (this.f1059w && childCount > 0) {
            K(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            c cVar = (c) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f1056t.H(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1056t.J(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f1055s = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f1054r != i10) {
            this.f1054r = i10;
            if (i10 == 0) {
                this.f1053q = getContext();
            } else {
                this.f1053q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.f1056t = aVar;
        aVar.I(this);
    }

    public void z() {
        androidx.appcompat.widget.a aVar = this.f1056t;
        if (aVar != null) {
            aVar.z();
        }
    }

    public ActionMenuView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f1061y = (int) (56.0f * f10);
        this.f1062z = (int) (f10 * 4.0f);
        this.f1053q = context;
        this.f1054r = 0;
    }
}
