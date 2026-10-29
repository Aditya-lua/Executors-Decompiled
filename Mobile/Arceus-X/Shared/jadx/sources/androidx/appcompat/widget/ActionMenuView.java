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
import androidx.appcompat.view.menu.C0415e;
import androidx.appcompat.view.menu.C0417g;
import androidx.appcompat.view.menu.InterfaceC0419i;
import androidx.appcompat.view.menu.InterfaceC0420j;
import androidx.core.view.inputmethod.EditorInfoCompat;
import p365q.C10375g1;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends C0484b implements C0415e.b, InterfaceC0420j {

    /* JADX INFO: renamed from: A */
    public InterfaceC0435e f1360A;

    /* JADX INFO: renamed from: p */
    public C0415e f1361p;

    /* JADX INFO: renamed from: q */
    public Context f1362q;

    /* JADX INFO: renamed from: r */
    public int f1363r;

    /* JADX INFO: renamed from: s */
    public boolean f1364s;

    /* JADX INFO: renamed from: t */
    public C0483a f1365t;

    /* JADX INFO: renamed from: u */
    public InterfaceC0419i.a f1366u;

    /* JADX INFO: renamed from: v */
    public C0415e.a f1367v;

    /* JADX INFO: renamed from: w */
    public boolean f1368w;

    /* JADX INFO: renamed from: x */
    public int f1369x;

    /* JADX INFO: renamed from: y */
    public int f1370y;

    /* JADX INFO: renamed from: z */
    public int f1371z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface InterfaceC0431a {
        /* JADX INFO: renamed from: a */
        boolean mo1535a();

        /* JADX INFO: renamed from: b */
        boolean mo1536b();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0432b implements InterfaceC0419i.a {
        @Override // androidx.appcompat.view.menu.InterfaceC0419i.a
        /* JADX INFO: renamed from: b */
        public void mo1659b(@NonNull C0415e c0415e, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0419i.a
        /* JADX INFO: renamed from: c */
        public boolean mo1660c(@NonNull C0415e c0415e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0433c extends C0484b.a {

        /* JADX INFO: renamed from: a */
        @ViewDebug.ExportedProperty
        public boolean f1372a;

        /* JADX INFO: renamed from: b */
        @ViewDebug.ExportedProperty
        public int f1373b;

        /* JADX INFO: renamed from: c */
        @ViewDebug.ExportedProperty
        public int f1374c;

        /* JADX INFO: renamed from: d */
        @ViewDebug.ExportedProperty
        public boolean f1375d;

        /* JADX INFO: renamed from: e */
        @ViewDebug.ExportedProperty
        public boolean f1376e;

        /* JADX INFO: renamed from: f */
        public boolean f1377f;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0433c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0433c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0433c(C0433c c0433c) {
            super((ViewGroup.LayoutParams) c0433c);
            this.f1372a = c0433c.f1372a;
        }

        public C0433c(int i10, int i11) {
            super(i10, i11);
            this.f1372a = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C0434d implements C0415e.a {
        public C0434d() {
        }

        @Override // androidx.appcompat.view.menu.C0415e.a
        /* JADX INFO: renamed from: a */
        public boolean mo1656a(@NonNull C0415e c0415e, @NonNull MenuItem menuItem) {
            InterfaceC0435e interfaceC0435e = ActionMenuView.this.f1360A;
            return interfaceC0435e != null && interfaceC0435e.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0415e.a
        /* JADX INFO: renamed from: b */
        public void mo1657b(@NonNull C0415e c0415e) {
            C0415e.a aVar = ActionMenuView.this.f1367v;
            if (aVar != null) {
                aVar.mo1657b(c0415e);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface InterfaceC0435e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX INFO: renamed from: J */
    public static int m1750J(View view, int i10, int i11, int i12, int i13) {
        int i14;
        C0433c c0433c = (C0433c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = false;
        boolean z11 = actionMenuItemView != null && actionMenuItemView.m1539s();
        if (i11 > 0) {
            i14 = 2;
            if (!z11 || i11 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, EditorInfoCompat.IME_FLAG_FORCE_ASCII), iMakeMeasureSpec);
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
        if (!c0433c.f1372a && z11) {
            z10 = true;
        }
        c0433c.f1375d = z10;
        c0433c.f1373b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), iMakeMeasureSpec);
        return i14;
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    /* JADX DEBUG: Method merged with bridge method: k()Landroidx/appcompat/widget/b$a; */
    @Override // androidx.appcompat.widget.C0484b
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C0433c generateDefaultLayoutParams() {
        C0433c c0433c = new C0433c(-2, -2);
        ((LinearLayout.LayoutParams) c0433c).gravity = 16;
        return c0433c;
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    /* JADX DEBUG: Method merged with bridge method: l(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/b$a; */
    @Override // androidx.appcompat.widget.C0484b
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public C0433c generateLayoutParams(AttributeSet attributeSet) {
        return new C0433c(getContext(), attributeSet);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams; */
    /* JADX DEBUG: Method merged with bridge method: m(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/b$a; */
    @Override // androidx.appcompat.widget.C0484b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C0433c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0433c c0433c = layoutParams instanceof C0433c ? new C0433c((C0433c) layoutParams) : new C0433c(layoutParams);
        if (((LinearLayout.LayoutParams) c0433c).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0433c).gravity = 16;
        }
        return c0433c;
    }

    /* JADX INFO: renamed from: D */
    public C0433c m1754D() {
        C0433c c0433cGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        c0433cGenerateDefaultLayoutParams.f1372a = true;
        return c0433cGenerateDefaultLayoutParams;
    }

    /* JADX INFO: renamed from: E */
    public boolean m1755E(int i10) {
        boolean zMo1535a = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof InterfaceC0431a)) {
            zMo1535a = ((InterfaceC0431a) childAt).mo1535a();
        }
        return (i10 <= 0 || !(childAt2 instanceof InterfaceC0431a)) ? zMo1535a : ((InterfaceC0431a) childAt2).mo1536b() | zMo1535a;
    }

    /* JADX INFO: renamed from: F */
    public boolean m1756F() {
        C0483a c0483a = this.f1365t;
        return c0483a != null && c0483a.m1955C();
    }

    /* JADX INFO: renamed from: G */
    public boolean m1757G() {
        C0483a c0483a = this.f1365t;
        return c0483a != null && c0483a.m1957E();
    }

    /* JADX INFO: renamed from: H */
    public boolean m1758H() {
        C0483a c0483a = this.f1365t;
        return c0483a != null && c0483a.m1958F();
    }

    /* JADX INFO: renamed from: I */
    public boolean m1759I() {
        return this.f1364s;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX INFO: renamed from: K */
    public final void m1760K(int i10, int i11) {
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
        int i15 = this.f1370y;
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
                    int i23 = this.f1371z;
                    r8 = 0;
                    childAt.setPadding(i23, 0, i23, 0);
                } else {
                    r8 = 0;
                }
                C0433c c0433c = (C0433c) childAt.getLayoutParams();
                c0433c.f1377f = r8;
                c0433c.f1374c = r8;
                c0433c.f1373b = r8;
                c0433c.f1375d = r8;
                ((LinearLayout.LayoutParams) c0433c).leftMargin = r8;
                ((LinearLayout.LayoutParams) c0433c).rightMargin = r8;
                c0433c.f1376e = z12 && ((ActionMenuItemView) childAt).m1539s();
                int iM1750J = m1750J(childAt, i18, c0433c.f1372a ? 1 : i16, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iM1750J);
                i13 = i18;
                if (c0433c.f1375d) {
                    i21++;
                }
                if (c0433c.f1372a) {
                    z11 = true;
                }
                i16 -= iM1750J;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iM1750J == 1) {
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
                C0433c c0433c2 = (C0433c) getChildAt(i28).getLayoutParams();
                boolean z15 = z13;
                if (c0433c2.f1375d) {
                    int i29 = c0433c2.f1373b;
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
                C0433c c0433c3 = (C0433c) childAt2.getLayoutParams();
                long j13 = 1 << i31;
                if ((j12 & j13) == 0) {
                    if (c0433c3.f1373b == i30) {
                        j11 |= j13;
                    }
                    i31 = i31;
                } else {
                    if (!z16 || !c0433c3.f1376e) {
                        z10 = true;
                    } else if (i16 == 1) {
                        int i32 = this.f1371z;
                        z10 = true;
                        childAt2.setPadding(i32 + i25, 0, i32, 0);
                    } else {
                        z10 = true;
                    }
                    c0433c3.f1373b++;
                    c0433c3.f1377f = z10;
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
                    if (!((C0433c) getChildAt(0).getLayoutParams()).f1376e) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i12 = 0;
                }
                int i33 = childCount - 1;
                if ((j11 & ((long) (1 << i33))) != 0 && !((C0433c) getChildAt(i33).getLayoutParams()).f1376e) {
                    fBitCount -= 0.5f;
                }
            }
            int i34 = fBitCount > 0.0f ? (int) ((i16 * i25) / fBitCount) : i12;
            boolean z18 = z14;
            for (int i35 = i12; i35 < childCount; i35++) {
                if ((j11 & ((long) (1 << i35))) != 0) {
                    View childAt3 = getChildAt(i35);
                    C0433c c0433c4 = (C0433c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0433c4.f1374c = i34;
                        c0433c4.f1377f = true;
                        if (i35 == 0 && !c0433c4.f1376e) {
                            ((LinearLayout.LayoutParams) c0433c4).leftMargin = (-i34) / 2;
                        }
                        z18 = true;
                    } else if (c0433c4.f1372a) {
                        c0433c4.f1374c = i34;
                        c0433c4.f1377f = true;
                        ((LinearLayout.LayoutParams) c0433c4).rightMargin = (-i34) / 2;
                        z18 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) c0433c4).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount - 1) {
                            ((LinearLayout.LayoutParams) c0433c4).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z14 = z18;
        }
        if (z14) {
            for (int i36 = i12; i36 < childCount; i36++) {
                View childAt4 = getChildAt(i36);
                C0433c c0433c5 = (C0433c) childAt4.getLayoutParams();
                if (c0433c5.f1377f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0433c5.f1373b * i25) + c0433c5.f1374c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i14, mode != 1073741824 ? iMax : i24);
    }

    /* JADX INFO: renamed from: L */
    public C0415e m1761L() {
        return this.f1361p;
    }

    /* JADX INFO: renamed from: M */
    public void m1762M(InterfaceC0419i.a aVar, C0415e.a aVar2) {
        this.f1366u = aVar;
        this.f1367v = aVar2;
    }

    /* JADX INFO: renamed from: N */
    public boolean m1763N() {
        C0483a c0483a = this.f1365t;
        return c0483a != null && c0483a.m1964L();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0420j
    /* JADX INFO: renamed from: a */
    public void mo1545a(C0415e c0415e) {
        this.f1361p = c0415e;
    }

    @Override // androidx.appcompat.view.menu.C0415e.b
    /* JADX INFO: renamed from: b */
    public boolean mo1546b(C0417g c0417g) {
        return this.f1361p.m1612M(c0417g, 0);
    }

    @Override // androidx.appcompat.widget.C0484b, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0433c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1361p == null) {
            Context context = getContext();
            C0415e c0415e = new C0415e(context);
            this.f1361p = c0415e;
            c0415e.mo1618S(new C0434d());
            C0483a c0483a = new C0483a(context);
            this.f1365t = c0483a;
            c0483a.m1963K(true);
            C0483a c0483a2 = this.f1365t;
            InterfaceC0419i.a c0432b = this.f1366u;
            if (c0432b == null) {
                c0432b = new C0432b();
            }
            c0483a2.mo1555d(c0432b);
            this.f1361p.m1630c(this.f1365t, this.f1362q);
            this.f1365t.m1961I(this);
        }
        return this.f1361p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1365t.m1954B();
    }

    public int getPopupTheme() {
        return this.f1363r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0483a c0483a = this.f1365t;
        if (c0483a != null) {
            c0483a.mo1557f(false);
            if (this.f1365t.m1958F()) {
                this.f1365t.m1955C();
                this.f1365t.m1964L();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1767z();
    }

    @Override // androidx.appcompat.widget.C0484b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f1368w) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean zM39840b = C10375g1.m39840b(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                C0433c c0433c = (C0433c) childAt.getLayoutParams();
                if (c0433c.f1372a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m1755E(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM39840b) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0433c).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0433c).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0433c).leftMargin) + ((LinearLayout.LayoutParams) c0433c).rightMargin;
                    m1755E(i18);
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
        if (zM39840b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                C0433c c0433c2 = (C0433c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0433c2.f1372a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) c0433c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0433c2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            C0433c c0433c3 = (C0433c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0433c3.f1372a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) c0433c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = i27 + measuredWidth4 + ((LinearLayout.LayoutParams) c0433c3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.C0484b, android.view.View
    public void onMeasure(int i10, int i11) {
        C0415e c0415e;
        boolean z10 = this.f1368w;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f1368w = z11;
        if (z10 != z11) {
            this.f1369x = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f1368w && (c0415e = this.f1361p) != null && size != this.f1369x) {
            this.f1369x = size;
            c0415e.m1611L(true);
        }
        int childCount = getChildCount();
        if (this.f1368w && childCount > 0) {
            m1760K(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            C0433c c0433c = (C0433c) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) c0433c).rightMargin = 0;
            ((LinearLayout.LayoutParams) c0433c).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f1365t.m1960H(z10);
    }

    public void setOnMenuItemClickListener(InterfaceC0435e interfaceC0435e) {
        this.f1360A = interfaceC0435e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1365t.m1962J(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f1364s = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f1363r != i10) {
            this.f1363r = i10;
            if (i10 == 0) {
                this.f1362q = getContext();
            } else {
                this.f1362q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(C0483a c0483a) {
        this.f1365t = c0483a;
        c0483a.m1961I(this);
    }

    /* JADX INFO: renamed from: z */
    public void m1767z() {
        C0483a c0483a = this.f1365t;
        if (c0483a != null) {
            c0483a.m1966z();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ActionMenuView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f1370y = (int) (56.0f * f10);
        this.f1371z = (int) (f10 * 4.0f);
        this.f1362q = context;
        this.f1363r = 0;
    }
}
