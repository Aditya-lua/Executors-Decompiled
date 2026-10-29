package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.C0415e;
import androidx.appcompat.view.menu.C0417g;
import androidx.appcompat.view.menu.InterfaceC0419i;
import androidx.appcompat.view.menu.SubMenuC0422l;
import androidx.core.view.C0614k;
import androidx.core.view.C0625o0;
import androidx.core.view.C0626p;
import androidx.core.view.GravityCompat;
import androidx.core.view.InterfaceC0624o;
import androidx.core.view.InterfaceC0630r;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p181i.C6589a;
import p181i.C6598j;
import p203j.AbstractC6991a;
import p232k.C7399a;
import p316o.C9614g;
import p316o.InterfaceC9610c;
import p365q.C10357a1;
import p365q.C10359b0;
import p365q.C10369e1;
import p365q.C10375g1;
import p365q.C10395q;
import p365q.C10402t0;
import p365q.InterfaceC10371f0;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0624o {

    /* JADX INFO: renamed from: A */
    public ColorStateList f1581A;

    /* JADX INFO: renamed from: B */
    public boolean f1582B;

    /* JADX INFO: renamed from: C */
    public boolean f1583C;

    /* JADX INFO: renamed from: D */
    public final ArrayList<View> f1584D;

    /* JADX INFO: renamed from: E */
    public final ArrayList<View> f1585E;

    /* JADX INFO: renamed from: F */
    public final int[] f1586F;

    /* JADX INFO: renamed from: G */
    public final C0626p f1587G;

    /* JADX INFO: renamed from: H */
    public ArrayList<MenuItem> f1588H;

    /* JADX INFO: renamed from: I */
    public final ActionMenuView.InterfaceC0435e f1589I;

    /* JADX INFO: renamed from: J */
    public C0486d f1590J;

    /* JADX INFO: renamed from: K */
    public C0483a f1591K;

    /* JADX INFO: renamed from: L */
    public C0479f f1592L;

    /* JADX INFO: renamed from: M */
    public InterfaceC0419i.a f1593M;

    /* JADX INFO: renamed from: N */
    public C0415e.a f1594N;

    /* JADX INFO: renamed from: O */
    public boolean f1595O;

    /* JADX INFO: renamed from: P */
    public OnBackInvokedCallback f1596P;

    /* JADX INFO: renamed from: Q */
    public OnBackInvokedDispatcher f1597Q;

    /* JADX INFO: renamed from: R */
    public boolean f1598R;

    /* JADX INFO: renamed from: S */
    public final Runnable f1599S;

    /* JADX INFO: renamed from: a */
    public ActionMenuView f1600a;

    /* JADX INFO: renamed from: b */
    public TextView f1601b;

    /* JADX INFO: renamed from: c */
    public TextView f1602c;

    /* JADX INFO: renamed from: d */
    public ImageButton f1603d;

    /* JADX INFO: renamed from: e */
    public ImageView f1604e;

    /* JADX INFO: renamed from: f */
    public Drawable f1605f;

    /* JADX INFO: renamed from: g */
    public CharSequence f1606g;

    /* JADX INFO: renamed from: h */
    public ImageButton f1607h;

    /* JADX INFO: renamed from: i */
    public View f1608i;

    /* JADX INFO: renamed from: j */
    public Context f1609j;

    /* JADX INFO: renamed from: k */
    public int f1610k;

    /* JADX INFO: renamed from: l */
    public int f1611l;

    /* JADX INFO: renamed from: m */
    public int f1612m;

    /* JADX INFO: renamed from: n */
    public int f1613n;

    /* JADX INFO: renamed from: o */
    public int f1614o;

    /* JADX INFO: renamed from: p */
    public int f1615p;

    /* JADX INFO: renamed from: q */
    public int f1616q;

    /* JADX INFO: renamed from: r */
    public int f1617r;

    /* JADX INFO: renamed from: s */
    public int f1618s;

    /* JADX INFO: renamed from: t */
    public C10402t0 f1619t;

    /* JADX INFO: renamed from: u */
    public int f1620u;

    /* JADX INFO: renamed from: v */
    public int f1621v;

    /* JADX INFO: renamed from: w */
    public int f1622w;

    /* JADX INFO: renamed from: x */
    public CharSequence f1623x;

    /* JADX INFO: renamed from: y */
    public CharSequence f1624y;

    /* JADX INFO: renamed from: z */
    public ColorStateList f1625z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0474a implements ActionMenuView.InterfaceC0435e {
        public C0474a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0435e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f1587G.m3139d(menuItem)) {
                return true;
            }
            Toolbar.this.getClass();
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$b */
    public class RunnableC0475b implements Runnable {
        public RunnableC0475b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m1909S();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$c */
    public class C0476c implements C0415e.a {
        public C0476c() {
        }

        @Override // androidx.appcompat.view.menu.C0415e.a
        /* JADX INFO: renamed from: a */
        public boolean mo1656a(@NonNull C0415e c0415e, @NonNull MenuItem menuItem) {
            C0415e.a aVar = Toolbar.this.f1594N;
            return aVar != null && aVar.mo1656a(c0415e, menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0415e.a
        /* JADX INFO: renamed from: b */
        public void mo1657b(@NonNull C0415e c0415e) {
            if (!Toolbar.this.f1600a.m1758H()) {
                Toolbar.this.f1587G.m3140e(c0415e);
            }
            C0415e.a aVar = Toolbar.this.f1594N;
            if (aVar != null) {
                aVar.mo1657b(c0415e);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$d */
    public class ViewOnClickListenerC0477d implements View.OnClickListener {
        public ViewOnClickListenerC0477d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m1915e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0478e {
        /* JADX INFO: renamed from: a */
        public static OnBackInvokedDispatcher m1940a(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public static OnBackInvokedCallback m1941b(@NonNull final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: q.d1
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        /* JADX INFO: renamed from: c */
        public static void m1942c(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        /* JADX INFO: renamed from: d */
        public static void m1943d(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$f */
    public class C0479f implements InterfaceC0419i {

        /* JADX INFO: renamed from: a */
        public C0415e f1632a;

        /* JADX INFO: renamed from: b */
        public C0417g f1633b;

        public C0479f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0419i
        /* JADX INFO: renamed from: b */
        public void mo1553b(C0415e c0415e, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0419i
        /* JADX INFO: renamed from: c */
        public boolean mo1554c(C0415e c0415e, C0417g c0417g) {
            Toolbar.this.m1917g();
            ViewParent parent = Toolbar.this.f1607h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1607h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1607h);
            }
            Toolbar.this.f1608i = c0417g.getActionView();
            this.f1633b = c0417g;
            ViewParent parent2 = Toolbar.this.f1608i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1608i);
                }
                C0480g c0480gGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                c0480gGenerateDefaultLayoutParams.f27268a = (toolbar4.f1613n & 112) | GravityCompat.START;
                c0480gGenerateDefaultLayoutParams.f1635b = 2;
                toolbar4.f1608i.setLayoutParams(c0480gGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1608i);
            }
            Toolbar.this.m1900J();
            Toolbar.this.requestLayout();
            c0417g.m1681r(true);
            KeyEvent.Callback callback = Toolbar.this.f1608i;
            if (callback instanceof InterfaceC9610c) {
                ((InterfaceC9610c) callback).onActionViewExpanded();
            }
            Toolbar.this.m1910T();
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0419i
        /* JADX INFO: renamed from: e */
        public boolean mo1556e(SubMenuC0422l subMenuC0422l) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0419i
        /* JADX INFO: renamed from: f */
        public void mo1557f(boolean z10) {
            if (this.f1633b != null) {
                C0415e c0415e = this.f1632a;
                if (c0415e != null) {
                    int size = c0415e.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f1632a.getItem(i10) == this.f1633b) {
                            return;
                        }
                    }
                }
                mo1558h(this.f1632a, this.f1633b);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0419i
        /* JADX INFO: renamed from: g */
        public boolean mo1575g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0419i
        /* JADX INFO: renamed from: h */
        public boolean mo1558h(C0415e c0415e, C0417g c0417g) {
            KeyEvent.Callback callback = Toolbar.this.f1608i;
            if (callback instanceof InterfaceC9610c) {
                ((InterfaceC9610c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1608i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1607h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1608i = null;
            toolbar3.m1911a();
            this.f1633b = null;
            Toolbar.this.requestLayout();
            c0417g.m1681r(false);
            Toolbar.this.m1910T();
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0419i
        /* JADX INFO: renamed from: i */
        public void mo1559i(Context context, C0415e c0415e) {
            C0417g c0417g;
            C0415e c0415e2 = this.f1632a;
            if (c0415e2 != null && (c0417g = this.f1633b) != null) {
                c0415e2.mo1636f(c0417g);
            }
            this.f1632a = c0415e;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$h */
    public interface InterfaceC0481h {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Toolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6589a.f25021Q);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C9614g(getContext());
    }

    /* JADX INFO: renamed from: A */
    public final boolean m1891A(View view) {
        return view.getParent() == this || this.f1585E.contains(view);
    }

    /* JADX INFO: renamed from: B */
    public boolean m1892B() {
        ActionMenuView actionMenuView = this.f1600a;
        return actionMenuView != null && actionMenuView.m1757G();
    }

    /* JADX INFO: renamed from: C */
    public boolean m1893C() {
        ActionMenuView actionMenuView = this.f1600a;
        return actionMenuView != null && actionMenuView.m1758H();
    }

    /* JADX INFO: renamed from: D */
    public final int m1894D(View view, int i10, int[] iArr, int i11) {
        C0480g c0480g = (C0480g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) c0480g).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iM1928q = m1928q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM1928q, iMax + measuredWidth, view.getMeasuredHeight() + iM1928q);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) c0480g).rightMargin;
    }

    /* JADX INFO: renamed from: E */
    public final int m1895E(View view, int i10, int[] iArr, int i11) {
        C0480g c0480g = (C0480g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) c0480g).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iM1928q = m1928q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM1928q, iMax, view.getMeasuredHeight() + iM1928q);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0480g).leftMargin);
    }

    /* JADX INFO: renamed from: F */
    public final int m1896F(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: G */
    public final void m1897G(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: H */
    public final void m1898H() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f1587G.m3137b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1588H = currentMenuItems2;
    }

    /* JADX INFO: renamed from: I */
    public final void m1899I() {
        removeCallbacks(this.f1599S);
        post(this.f1599S);
    }

    /* JADX INFO: renamed from: J */
    public void m1900J() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0480g) childAt.getLayoutParams()).f1635b != 2 && childAt != this.f1600a) {
                removeViewAt(childCount);
                this.f1585E.add(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m1901K(int i10, int i11) {
        m1918h();
        this.f1619t.m40035e(i10, i11);
    }

    /* JADX INFO: renamed from: L */
    public void m1902L(int i10, int i11) {
        m1918h();
        this.f1619t.m40037g(i10, i11);
    }

    /* JADX INFO: renamed from: M */
    public void m1903M(C0415e c0415e, C0483a c0483a) {
        if (c0415e == null && this.f1600a == null) {
            return;
        }
        m1921k();
        C0415e c0415eM1761L = this.f1600a.m1761L();
        if (c0415eM1761L == c0415e) {
            return;
        }
        if (c0415eM1761L != null) {
            c0415eM1761L.m1615P(this.f1591K);
            c0415eM1761L.m1615P(this.f1592L);
        }
        if (this.f1592L == null) {
            this.f1592L = new C0479f();
        }
        c0483a.m1960H(true);
        if (c0415e != null) {
            c0415e.m1630c(c0483a, this.f1609j);
            c0415e.m1630c(this.f1592L, this.f1609j);
        } else {
            c0483a.mo1559i(this.f1609j, null);
            this.f1592L.mo1559i(this.f1609j, null);
            c0483a.mo1557f(true);
            this.f1592L.mo1557f(true);
        }
        this.f1600a.setPopupTheme(this.f1610k);
        this.f1600a.setPresenter(c0483a);
        this.f1591K = c0483a;
        m1910T();
    }

    /* JADX INFO: renamed from: N */
    public void m1904N(Context context, int i10) {
        this.f1612m = i10;
        TextView textView = this.f1602c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m1905O(Context context, int i10) {
        this.f1611l = i10;
        TextView textView = this.f1601b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    /* JADX INFO: renamed from: P */
    public final boolean m1906P() {
        if (!this.f1595O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (m1907Q(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m1907Q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    @Override // androidx.core.view.InterfaceC0624o
    /* JADX INFO: renamed from: R */
    public void mo1908R(@NonNull InterfaceC0630r interfaceC0630r) {
        this.f1587G.m3141f(interfaceC0630r);
    }

    /* JADX INFO: renamed from: S */
    public boolean m1909S() {
        ActionMenuView actionMenuView = this.f1600a;
        return actionMenuView != null && actionMenuView.m1763N();
    }

    /* JADX INFO: renamed from: T */
    public void m1910T() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM1940a = C0478e.m1940a(this);
            boolean z10 = m1933w() && onBackInvokedDispatcherM1940a != null && isAttachedToWindow() && this.f1598R;
            if (z10 && this.f1597Q == null) {
                if (this.f1596P == null) {
                    this.f1596P = C0478e.m1941b(new Runnable() { // from class: q.b1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37253a.m1915e();
                        }
                    });
                }
                C0478e.m1942c(onBackInvokedDispatcherM1940a, this.f1596P);
                this.f1597Q = onBackInvokedDispatcherM1940a;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f1597Q) == null) {
                return;
            }
            C0478e.m1943d(onBackInvokedDispatcher, this.f1596P);
            this.f1597Q = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1911a() {
        for (int size = this.f1585E.size() - 1; size >= 0; size--) {
            addView(this.f1585E.get(size));
        }
        this.f1585E.clear();
    }

    /* JADX INFO: renamed from: b */
    public final void m1912b(List<View> list, int i10) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iM2930b = C0614k.m2930b(i10, getLayoutDirection());
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                C0480g c0480g = (C0480g) childAt.getLayoutParams();
                if (c0480g.f1635b == 0 && m1907Q(childAt) && m1927p(c0480g.f27268a) == iM2930b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            C0480g c0480g2 = (C0480g) childAt2.getLayoutParams();
            if (c0480g2.f1635b == 0 && m1907Q(childAt2) && m1927p(c0480g2.f27268a) == iM2930b) {
                list.add(childAt2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1913c(View view, boolean z10) {
        C0480g c0480gGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c0480gGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            c0480gGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0480g) layoutParams;
        }
        c0480gGenerateLayoutParams.f1635b = 1;
        if (!z10 || this.f1608i == null) {
            addView(view, c0480gGenerateLayoutParams);
        } else {
            view.setLayoutParams(c0480gGenerateLayoutParams);
            this.f1585E.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0480g);
    }

    /* JADX INFO: renamed from: d */
    public boolean m1914d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1600a) != null && actionMenuView.m1759I();
    }

    /* JADX INFO: renamed from: e */
    public void m1915e() {
        C0479f c0479f = this.f1592L;
        C0417g c0417g = c0479f == null ? null : c0479f.f1633b;
        if (c0417g != null) {
            c0417g.collapseActionView();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1916f() {
        ActionMenuView actionMenuView = this.f1600a;
        if (actionMenuView != null) {
            actionMenuView.m1767z();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m1917g() {
        if (this.f1607h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, C6589a.f25020P);
            this.f1607h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1605f);
            this.f1607h.setContentDescription(this.f1606g);
            C0480g c0480gGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0480gGenerateDefaultLayoutParams.f27268a = (this.f1613n & 112) | GravityCompat.START;
            c0480gGenerateDefaultLayoutParams.f1635b = 2;
            this.f1607h.setLayoutParams(c0480gGenerateDefaultLayoutParams);
            this.f1607h.setOnClickListener(new ViewOnClickListenerC0477d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1607h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1607h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C10402t0 c10402t0 = this.f1619t;
        if (c10402t0 != null) {
            return c10402t0.m40031a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1621v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C10402t0 c10402t0 = this.f1619t;
        if (c10402t0 != null) {
            return c10402t0.m40032b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C10402t0 c10402t0 = this.f1619t;
        if (c10402t0 != null) {
            return c10402t0.m40033c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C10402t0 c10402t0 = this.f1619t;
        if (c10402t0 != null) {
            return c10402t0.m40034d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1620u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0415e c0415eM1761L;
        ActionMenuView actionMenuView = this.f1600a;
        return (actionMenuView == null || (c0415eM1761L = actionMenuView.m1761L()) == null || !c0415eM1761L.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1621v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1620u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1604e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1604e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1920j();
        return this.f1600a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1603d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1603d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1603d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C0483a getOuterActionMenuPresenter() {
        return this.f1591K;
    }

    public Drawable getOverflowIcon() {
        m1920j();
        return this.f1600a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1609j;
    }

    public int getPopupTheme() {
        return this.f1610k;
    }

    public CharSequence getSubtitle() {
        return this.f1624y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1602c;
    }

    public CharSequence getTitle() {
        return this.f1623x;
    }

    public int getTitleMarginBottom() {
        return this.f1618s;
    }

    public int getTitleMarginEnd() {
        return this.f1616q;
    }

    public int getTitleMarginStart() {
        return this.f1615p;
    }

    public int getTitleMarginTop() {
        return this.f1617r;
    }

    public final TextView getTitleTextView() {
        return this.f1601b;
    }

    public InterfaceC10371f0 getWrapper() {
        if (this.f1590J == null) {
            this.f1590J = new C0486d(this, true);
        }
        return this.f1590J;
    }

    /* JADX INFO: renamed from: h */
    public final void m1918h() {
        if (this.f1619t == null) {
            this.f1619t = new C10402t0();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1919i() {
        if (this.f1604e == null) {
            this.f1604e = new C10395q(getContext());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1920j() {
        m1921k();
        if (this.f1600a.m1761L() == null) {
            C0415e c0415e = (C0415e) this.f1600a.getMenu();
            if (this.f1592L == null) {
                this.f1592L = new C0479f();
            }
            this.f1600a.setExpandedActionViewsExclusive(true);
            c0415e.m1630c(this.f1592L, this.f1609j);
            m1910T();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1921k() {
        if (this.f1600a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1600a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1610k);
            this.f1600a.setOnMenuItemClickListener(this.f1589I);
            this.f1600a.m1762M(this.f1593M, new C0476c());
            C0480g c0480gGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0480gGenerateDefaultLayoutParams.f27268a = (this.f1613n & 112) | GravityCompat.END;
            this.f1600a.setLayoutParams(c0480gGenerateDefaultLayoutParams);
            m1913c(this.f1600a, false);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1922l() {
        if (this.f1603d == null) {
            this.f1603d = new AppCompatImageButton(getContext(), null, C6589a.f25020P);
            C0480g c0480gGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0480gGenerateDefaultLayoutParams.f27268a = (this.f1613n & 112) | GravityCompat.START;
            this.f1603d.setLayoutParams(c0480gGenerateDefaultLayoutParams);
        }
    }

    @Override // androidx.core.view.InterfaceC0624o
    /* JADX INFO: renamed from: l0 */
    public void mo1923l0(@NonNull InterfaceC0630r interfaceC0630r) {
        this.f1587G.m3136a(interfaceC0630r);
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C0480g generateDefaultLayoutParams() {
        return new C0480g(-2, -2);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C0480g generateLayoutParams(AttributeSet attributeSet) {
        return new C0480g(getContext(), attributeSet);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C0480g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0480g) {
            return new C0480g((C0480g) layoutParams);
        }
        if (layoutParams instanceof AbstractC6991a.a) {
            return new C0480g((AbstractC6991a.a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0480g((ViewGroup.MarginLayoutParams) layoutParams) : new C0480g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1910T();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1599S);
        m1910T();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1583C = false;
        }
        if (!this.f1583C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1583C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1583C = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0280  */
    /* JADX WARN: Code duplicated, block: B:102:0x0283  */
    /* JADX WARN: Code duplicated, block: B:105:0x0297 A[LOOP:0: B:104:0x0295->B:105:0x0297, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b5 A[LOOP:1: B:107:0x02b3->B:108:0x02b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02df  */
    /* JADX WARN: Code duplicated, block: B:114:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ec A[LOOP:2: B:116:0x02ea->B:117:0x02ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:72:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code duplicated, block: B:88:0x0215  */
    /* JADX WARN: Code duplicated, block: B:90:0x021e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0220  */
    /* JADX WARN: Code duplicated, block: B:93:0x0224  */
    /* JADX WARN: Code duplicated, block: B:96:0x0238  */
    /* JADX WARN: Code duplicated, block: B:97:0x025b  */
    /* JADX WARN: Code duplicated, block: B:99:0x025e  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iM1894D;
        int iM1895E;
        int iMax;
        int iMin;
        boolean zM1907Q;
        boolean zM1907Q2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        C0480g c0480g;
        C0480g c0480g2;
        int i14;
        boolean z11;
        int i15;
        int i16;
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int iMax2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int size;
        int iM1894D2;
        int i29;
        int size2;
        int i30;
        int i31;
        int i32;
        int size3;
        boolean z12 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i33 = width - paddingRight;
        int[] iArr = this.f1586F;
        iArr[1] = 0;
        iArr[0] = 0;
        int iM2978A = C0625o0.m2978A(this);
        int iMin2 = iM2978A >= 0 ? Math.min(iM2978A, i13 - i11) : 0;
        if (m1907Q(this.f1603d)) {
            if (z12) {
                iM1895E = m1895E(this.f1603d, i33, iArr, iMin2);
                iM1894D = paddingLeft;
            } else {
                iM1894D = m1894D(this.f1603d, paddingLeft, iArr, iMin2);
            }
            if (m1907Q(this.f1607h)) {
                if (z12) {
                    iM1895E = m1895E(this.f1607h, iM1895E, iArr, iMin2);
                } else {
                    iM1894D = m1894D(this.f1607h, iM1894D, iArr, iMin2);
                }
            }
            if (m1907Q(this.f1600a)) {
                if (z12) {
                    iM1894D = m1894D(this.f1600a, iM1894D, iArr, iMin2);
                } else {
                    iM1895E = m1895E(this.f1600a, iM1895E, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM1894D);
            iArr[1] = Math.max(0, currentContentInsetRight - (i33 - iM1895E));
            iMax = Math.max(iM1894D, currentContentInsetLeft);
            iMin = Math.min(iM1895E, i33 - currentContentInsetRight);
            if (m1907Q(this.f1608i)) {
                if (z12) {
                    iMin = m1895E(this.f1608i, iMin, iArr, iMin2);
                } else {
                    iMax = m1894D(this.f1608i, iMax, iArr, iMin2);
                }
            }
            if (m1907Q(this.f1604e)) {
                if (z12) {
                    iMin = m1895E(this.f1604e, iMin, iArr, iMin2);
                } else {
                    iMax = m1894D(this.f1604e, iMax, iArr, iMin2);
                }
            }
            zM1907Q = m1907Q(this.f1601b);
            zM1907Q2 = m1907Q(this.f1602c);
            if (zM1907Q) {
                C0480g c0480g3 = (C0480g) this.f1601b.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) c0480g3).bottomMargin + ((ViewGroup.MarginLayoutParams) c0480g3).topMargin + this.f1601b.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (zM1907Q2) {
                C0480g c0480g4 = (C0480g) this.f1602c.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) c0480g4).topMargin + this.f1602c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0480g4).bottomMargin;
            }
            if (!zM1907Q || zM1907Q2) {
                if (zM1907Q) {
                    textView = this.f1601b;
                } else {
                    textView = this.f1602c;
                }
                if (zM1907Q2) {
                    textView2 = this.f1602c;
                } else {
                    textView2 = this.f1601b;
                }
                c0480g = (C0480g) textView.getLayoutParams();
                c0480g2 = (C0480g) textView2.getLayoutParams();
                i14 = measuredHeight;
                z11 = (!zM1907Q && this.f1601b.getMeasuredWidth() > 0) || (zM1907Q2 && this.f1602c.getMeasuredWidth() > 0);
                i15 = this.f1622w & 112;
                i16 = iMax;
                if (i15 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0480g).topMargin + this.f1617r;
                } else if (i15 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                    i24 = ((ViewGroup.MarginLayoutParams) c0480g).topMargin;
                    i25 = this.f1617r;
                    if (iMax2 < i24 + i25) {
                        iMax2 = i24 + i25;
                    } else {
                        i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                        i27 = ((ViewGroup.MarginLayoutParams) c0480g).bottomMargin;
                        i28 = this.f1618s;
                        if (i26 < i27 + i28) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c0480g2).bottomMargin + i28) - i26));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0480g2).bottomMargin) - this.f1618s) - i14;
                }
                if (z12) {
                    if (z11) {
                        i21 = this.f1615p;
                    } else {
                        i21 = 0;
                    }
                    int i34 = i21 - iArr[1];
                    iMin -= Math.max(0, i34);
                    iArr[1] = Math.max(0, -i34);
                    if (zM1907Q) {
                        C0480g c0480g5 = (C0480g) this.f1601b.getLayoutParams();
                        int measuredWidth = iMin - this.f1601b.getMeasuredWidth();
                        int measuredHeight2 = this.f1601b.getMeasuredHeight() + paddingTop;
                        this.f1601b.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i22 = measuredWidth - this.f1616q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c0480g5).bottomMargin;
                    } else {
                        i22 = iMin;
                    }
                    if (zM1907Q2) {
                        int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0480g) this.f1602c.getLayoutParams())).topMargin;
                        this.f1602c.layout(iMin - this.f1602c.getMeasuredWidth(), i35, iMin, this.f1602c.getMeasuredHeight() + i35);
                        i23 = iMin - this.f1616q;
                    } else {
                        i23 = iMin;
                    }
                    if (z11) {
                        iMin = Math.min(i22, i23);
                    }
                    iMax = i16;
                    i18 = 0;
                } else {
                    if (z11) {
                        i17 = this.f1615p;
                    } else {
                        i17 = 0;
                    }
                    i18 = 0;
                    int i36 = i17 - iArr[0];
                    iMax = i16 + Math.max(0, i36);
                    iArr[0] = Math.max(0, -i36);
                    if (zM1907Q) {
                        C0480g c0480g6 = (C0480g) this.f1601b.getLayoutParams();
                        int measuredWidth2 = this.f1601b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f1601b.getMeasuredHeight() + paddingTop;
                        this.f1601b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i19 = measuredWidth2 + this.f1616q;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c0480g6).bottomMargin;
                    } else {
                        i19 = iMax;
                    }
                    if (zM1907Q2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0480g) this.f1602c.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.f1602c.getMeasuredWidth() + iMax;
                        this.f1602c.layout(iMax, i37, measuredWidth3, this.f1602c.getMeasuredHeight() + i37);
                        i20 = measuredWidth3 + this.f1616q;
                    } else {
                        i20 = iMax;
                    }
                    if (z11) {
                        iMax = Math.max(i19, i20);
                    }
                }
            } else {
                i18 = 0;
            }
            m1912b(this.f1584D, 3);
            size = this.f1584D.size();
            iM1894D2 = iMax;
            for (i29 = i18; i29 < size; i29++) {
                iM1894D2 = m1894D(this.f1584D.get(i29), iM1894D2, iArr, iMin2);
            }
            m1912b(this.f1584D, 5);
            size2 = this.f1584D.size();
            for (i30 = i18; i30 < size2; i30++) {
                iMin = m1895E(this.f1584D.get(i30), iMin, iArr, iMin2);
            }
            m1912b(this.f1584D, 1);
            int iM1932v = m1932v(this.f1584D, iArr);
            i31 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iM1932v / 2);
            i32 = iM1932v + i31;
            if (i31 >= iM1894D2) {
                if (i32 > iMin) {
                    iM1894D2 = i31 - (i32 - iMin);
                } else {
                    iM1894D2 = i31;
                }
            }
            size3 = this.f1584D.size();
            while (i18 < size3) {
                iM1894D2 = m1894D(this.f1584D.get(i18), iM1894D2, iArr, iMin2);
                i18++;
            }
            this.f1584D.clear();
        }
        iM1894D = paddingLeft;
        iM1895E = i33;
        if (m1907Q(this.f1607h)) {
            if (z12) {
                iM1895E = m1895E(this.f1607h, iM1895E, iArr, iMin2);
            } else {
                iM1894D = m1894D(this.f1607h, iM1894D, iArr, iMin2);
            }
        }
        if (m1907Q(this.f1600a)) {
            if (z12) {
                iM1894D = m1894D(this.f1600a, iM1894D, iArr, iMin2);
            } else {
                iM1895E = m1895E(this.f1600a, iM1895E, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM1894D);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i33 - iM1895E));
        iMax = Math.max(iM1894D, currentContentInsetLeft2);
        iMin = Math.min(iM1895E, i33 - currentContentInsetRight2);
        if (m1907Q(this.f1608i)) {
            if (z12) {
                iMin = m1895E(this.f1608i, iMin, iArr, iMin2);
            } else {
                iMax = m1894D(this.f1608i, iMax, iArr, iMin2);
            }
        }
        if (m1907Q(this.f1604e)) {
            if (z12) {
                iMin = m1895E(this.f1604e, iMin, iArr, iMin2);
            } else {
                iMax = m1894D(this.f1604e, iMax, iArr, iMin2);
            }
        }
        zM1907Q = m1907Q(this.f1601b);
        zM1907Q2 = m1907Q(this.f1602c);
        if (zM1907Q) {
            C0480g c0480g7 = (C0480g) this.f1601b.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) c0480g7).bottomMargin + ((ViewGroup.MarginLayoutParams) c0480g7).topMargin + this.f1601b.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (zM1907Q2) {
            C0480g c0480g8 = (C0480g) this.f1602c.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) c0480g8).topMargin + this.f1602c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0480g8).bottomMargin;
        }
        if (zM1907Q) {
            if (zM1907Q) {
                textView = this.f1601b;
            } else {
                textView = this.f1602c;
            }
            if (zM1907Q2) {
                textView2 = this.f1602c;
            } else {
                textView2 = this.f1601b;
            }
            c0480g = (C0480g) textView.getLayoutParams();
            c0480g2 = (C0480g) textView2.getLayoutParams();
            i14 = measuredHeight;
            if (zM1907Q) {
            }
            i15 = this.f1622w & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0480g).topMargin + this.f1617r;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i24 = ((ViewGroup.MarginLayoutParams) c0480g).topMargin;
                i25 = this.f1617r;
                if (iMax2 < i24 + i25) {
                    iMax2 = i24 + i25;
                } else {
                    i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) c0480g).bottomMargin;
                    i28 = this.f1618s;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c0480g2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0480g2).bottomMargin) - this.f1618s) - i14;
            }
            if (z12) {
                if (z11) {
                    i21 = this.f1615p;
                } else {
                    i21 = 0;
                }
                int i38 = i21 - iArr[1];
                iMin -= Math.max(0, i38);
                iArr[1] = Math.max(0, -i38);
                if (zM1907Q) {
                    C0480g c0480g9 = (C0480g) this.f1601b.getLayoutParams();
                    int measuredWidth4 = iMin - this.f1601b.getMeasuredWidth();
                    int measuredHeight4 = this.f1601b.getMeasuredHeight() + paddingTop;
                    this.f1601b.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i22 = measuredWidth4 - this.f1616q;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c0480g9).bottomMargin;
                } else {
                    i22 = iMin;
                }
                if (zM1907Q2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0480g) this.f1602c.getLayoutParams())).topMargin;
                    this.f1602c.layout(iMin - this.f1602c.getMeasuredWidth(), i39, iMin, this.f1602c.getMeasuredHeight() + i39);
                    i23 = iMin - this.f1616q;
                } else {
                    i23 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i22, i23);
                }
                iMax = i16;
                i18 = 0;
            } else {
                if (z11) {
                    i17 = this.f1615p;
                } else {
                    i17 = 0;
                }
                i18 = 0;
                int i310 = i17 - iArr[0];
                iMax = i16 + Math.max(0, i310);
                iArr[0] = Math.max(0, -i310);
                if (zM1907Q) {
                    C0480g c0480g10 = (C0480g) this.f1601b.getLayoutParams();
                    int measuredWidth5 = this.f1601b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f1601b.getMeasuredHeight() + paddingTop;
                    this.f1601b.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i19 = measuredWidth5 + this.f1616q;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c0480g10).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zM1907Q2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0480g) this.f1602c.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.f1602c.getMeasuredWidth() + iMax;
                    this.f1602c.layout(iMax, i311, measuredWidth6, this.f1602c.getMeasuredHeight() + i311);
                    i20 = measuredWidth6 + this.f1616q;
                } else {
                    i20 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i19, i20);
                }
            }
        } else {
            if (zM1907Q) {
                textView = this.f1601b;
            } else {
                textView = this.f1602c;
            }
            if (zM1907Q2) {
                textView2 = this.f1602c;
            } else {
                textView2 = this.f1601b;
            }
            c0480g = (C0480g) textView.getLayoutParams();
            c0480g2 = (C0480g) textView2.getLayoutParams();
            i14 = measuredHeight;
            if (zM1907Q) {
            }
            i15 = this.f1622w & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0480g).topMargin + this.f1617r;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i24 = ((ViewGroup.MarginLayoutParams) c0480g).topMargin;
                i25 = this.f1617r;
                if (iMax2 < i24 + i25) {
                    iMax2 = i24 + i25;
                } else {
                    i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) c0480g).bottomMargin;
                    i28 = this.f1618s;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c0480g2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0480g2).bottomMargin) - this.f1618s) - i14;
            }
            if (z12) {
                if (z11) {
                    i21 = this.f1615p;
                } else {
                    i21 = 0;
                }
                int i312 = i21 - iArr[1];
                iMin -= Math.max(0, i312);
                iArr[1] = Math.max(0, -i312);
                if (zM1907Q) {
                    C0480g c0480g11 = (C0480g) this.f1601b.getLayoutParams();
                    int measuredWidth7 = iMin - this.f1601b.getMeasuredWidth();
                    int measuredHeight6 = this.f1601b.getMeasuredHeight() + paddingTop;
                    this.f1601b.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i22 = measuredWidth7 - this.f1616q;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c0480g11).bottomMargin;
                } else {
                    i22 = iMin;
                }
                if (zM1907Q2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0480g) this.f1602c.getLayoutParams())).topMargin;
                    this.f1602c.layout(iMin - this.f1602c.getMeasuredWidth(), i313, iMin, this.f1602c.getMeasuredHeight() + i313);
                    i23 = iMin - this.f1616q;
                } else {
                    i23 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i22, i23);
                }
                iMax = i16;
                i18 = 0;
            } else {
                if (z11) {
                    i17 = this.f1615p;
                } else {
                    i17 = 0;
                }
                i18 = 0;
                int i314 = i17 - iArr[0];
                iMax = i16 + Math.max(0, i314);
                iArr[0] = Math.max(0, -i314);
                if (zM1907Q) {
                    C0480g c0480g12 = (C0480g) this.f1601b.getLayoutParams();
                    int measuredWidth8 = this.f1601b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f1601b.getMeasuredHeight() + paddingTop;
                    this.f1601b.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i19 = measuredWidth8 + this.f1616q;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c0480g12).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zM1907Q2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0480g) this.f1602c.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.f1602c.getMeasuredWidth() + iMax;
                    this.f1602c.layout(iMax, i315, measuredWidth9, this.f1602c.getMeasuredHeight() + i315);
                    i20 = measuredWidth9 + this.f1616q;
                } else {
                    i20 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i19, i20);
                }
            }
        }
        m1912b(this.f1584D, 3);
        size = this.f1584D.size();
        iM1894D2 = iMax;
        while (i29 < size) {
            iM1894D2 = m1894D(this.f1584D.get(i29), iM1894D2, iArr, iMin2);
        }
        m1912b(this.f1584D, 5);
        size2 = this.f1584D.size();
        while (i30 < size2) {
            iMin = m1895E(this.f1584D.get(i30), iMin, iArr, iMin2);
        }
        m1912b(this.f1584D, 1);
        int iM1932v2 = m1932v(this.f1584D, iArr);
        i31 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iM1932v2 / 2);
        i32 = iM1932v2 + i31;
        if (i31 >= iM1894D2) {
            if (i32 > iMin) {
                iM1894D2 = i31 - (i32 - iMin);
            } else {
                iM1894D2 = i31;
            }
        }
        size3 = this.f1584D.size();
        while (i18 < size3) {
            iM1894D2 = m1894D(this.f1584D.get(i18), iM1894D2, iArr, iMin2);
            i18++;
        }
        this.f1584D.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.f1586F;
        boolean zM39840b = C10375g1.m39840b(this);
        int i12 = !zM39840b ? 1 : 0;
        if (m1907Q(this.f1603d)) {
            m1897G(this.f1603d, i10, 0, i11, 0, this.f1614o);
            measuredWidth = this.f1603d.getMeasuredWidth() + m1930s(this.f1603d);
            iMax = Math.max(0, this.f1603d.getMeasuredHeight() + m1931t(this.f1603d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1603d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m1907Q(this.f1607h)) {
            m1897G(this.f1607h, i10, 0, i11, 0, this.f1614o);
            measuredWidth = this.f1607h.getMeasuredWidth() + m1930s(this.f1607h);
            iMax = Math.max(iMax, this.f1607h.getMeasuredHeight() + m1931t(this.f1607h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1607h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zM39840b ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (m1907Q(this.f1600a)) {
            m1897G(this.f1600a, i10, iMax3, i11, 0, this.f1614o);
            measuredWidth2 = this.f1600a.getMeasuredWidth() + m1930s(this.f1600a);
            iMax = Math.max(iMax, this.f1600a.getMeasuredHeight() + m1931t(this.f1600a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1600a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (m1907Q(this.f1608i)) {
            iArr = iArr2;
            iMax4 += m1896F(this.f1608i, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f1608i.getMeasuredHeight() + m1931t(this.f1608i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1608i.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (m1907Q(this.f1604e)) {
            iMax4 += m1896F(this.f1604e, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f1604e.getMeasuredHeight() + m1931t(this.f1604e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1604e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((C0480g) childAt.getLayoutParams()).f1635b == 0 && m1907Q(childAt)) {
                iMax4 += m1896F(childAt, i10, iMax4, i11, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + m1931t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i14 = iMax4;
        int i15 = this.f1617r + this.f1618s;
        int i16 = this.f1615p + this.f1616q;
        if (m1907Q(this.f1601b)) {
            m1896F(this.f1601b, i10, i14 + i16, i11, i15, iArr);
            int measuredWidth3 = this.f1601b.getMeasuredWidth() + m1930s(this.f1601b);
            int measuredHeight2 = this.f1601b.getMeasuredHeight() + m1931t(this.f1601b);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1601b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (m1907Q(this.f1602c)) {
            iMax2 = Math.max(iMax2, m1896F(this.f1602c, i10, i14 + i16, i11, i15 + measuredHeight, iArr));
            measuredHeight += this.f1602c.getMeasuredHeight() + m1931t(this.f1602c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1602c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i14 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), m1906P() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m3321a());
        ActionMenuView actionMenuView = this.f1600a;
        C0415e c0415eM1761L = actionMenuView != null ? actionMenuView.m1761L() : null;
        int i10 = savedState.f1626c;
        if (i10 != 0 && this.f1592L != null && c0415eM1761L != null && (menuItemFindItem = c0415eM1761L.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f1627d) {
            m1899I();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        m1918h();
        this.f1619t.m40036f(i10 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0417g c0417g;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0479f c0479f = this.f1592L;
        if (c0479f != null && (c0417g = c0479f.f1633b) != null) {
            savedState.f1626c = c0417g.getItemId();
        }
        savedState.f1627d = m1893C();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1582B = false;
        }
        if (!this.f1582B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1582B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1582B = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final int m1927p(int i10) {
        int layoutDirection = getLayoutDirection();
        int iM2930b = C0614k.m2930b(i10, layoutDirection) & 7;
        if (iM2930b == 1 || iM2930b == 3 || iM2930b == 5) {
            return iM2930b;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    /* JADX INFO: renamed from: q */
    public final int m1928q(View view, int i10) {
        C0480g c0480g = (C0480g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int iM1929r = m1929r(c0480g.f27268a);
        if (iM1929r == 48) {
            return getPaddingTop() - i11;
        }
        if (iM1929r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0480g).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) c0480g).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) c0480g).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: r */
    public final int m1929r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f1622w & 112;
    }

    /* JADX INFO: renamed from: s */
    public final int m1930s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f1598R != z10) {
            this.f1598R = z10;
            m1910T();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCollapseIcon(int i10) {
        setCollapseIcon(C7399a.m30679b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f1595O = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 != this.f1621v) {
            this.f1621v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i10 != this.f1620u) {
            this.f1620u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLogo(int i10) {
        setLogo(C7399a.m30679b(getContext(), i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNavigationIcon(int i10) {
        setNavigationIcon(C7399a.m30679b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1922l();
        this.f1603d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0481h interfaceC0481h) {
    }

    public void setOverflowIcon(Drawable drawable) {
        m1920j();
        this.f1600a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1610k != i10) {
            this.f1610k = i10;
            if (i10 == 0) {
                this.f1609j = getContext();
            } else {
                this.f1609j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f1618s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1616q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1615p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1617r = i10;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    /* JADX INFO: renamed from: t */
    public final int m1931t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: v */
    public final int m1932v(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = list.get(i12);
            C0480g c0480g = (C0480g) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) c0480g).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) c0480g).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    /* JADX INFO: renamed from: w */
    public boolean m1933w() {
        C0479f c0479f = this.f1592L;
        return (c0479f == null || c0479f.f1633b == null) ? false : true;
    }

    /* JADX INFO: renamed from: x */
    public boolean m1934x() {
        ActionMenuView actionMenuView = this.f1600a;
        return actionMenuView != null && actionMenuView.m1756F();
    }

    /* JADX INFO: renamed from: y */
    public void mo1935y(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    /* JADX INFO: renamed from: z */
    public void m1936z() {
        ArrayList<MenuItem> arrayList = this.f1588H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            MenuItem menuItem = arrayList.get(i10);
            i10++;
            getMenu().removeItem(menuItem.getItemId());
        }
        m1898H();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0480g extends AbstractC6991a.a {

        /* JADX INFO: renamed from: b */
        public int f1635b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0480g(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1635b = 0;
        }

        /* JADX INFO: renamed from: a */
        public void m1944a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0480g(int i10, int i11) {
            super(i10, i11);
            this.f1635b = 0;
            this.f27268a = 8388627;
        }

        public C0480g(C0480g c0480g) {
            super((AbstractC6991a.a) c0480g);
            this.f1635b = 0;
            this.f1635b = c0480g.f1635b;
        }

        public C0480g(AbstractC6991a.a aVar) {
            super(aVar);
            this.f1635b = 0;
        }

        public C0480g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1635b = 0;
            m1944a(marginLayoutParams);
        }

        public C0480g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1635b = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Toolbar(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1622w = 8388627;
        this.f1584D = new ArrayList<>();
        this.f1585E = new ArrayList<>();
        this.f1586F = new int[2];
        this.f1587G = new C0626p(new Runnable() { // from class: q.c1
            @Override // java.lang.Runnable
            public final void run() {
                this.f37289a.m1936z();
            }
        });
        this.f1588H = new ArrayList<>();
        this.f1589I = new C0474a();
        this.f1599S = new RunnableC0475b();
        Context context2 = getContext();
        int[] iArr = C6598j.f25355f3;
        C10357a1 c10357a1M39728v = C10357a1.m39728v(context2, attributeSet, iArr, i10, 0);
        C0625o0.m3036k0(this, context, iArr, attributeSet, c10357a1M39728v.m39746r(), i10, 0);
        this.f1611l = c10357a1M39728v.m39742n(C6598j.f25241H3, 0);
        this.f1612m = c10357a1M39728v.m39742n(C6598j.f25450y3, 0);
        this.f1622w = c10357a1M39728v.m39740l(C6598j.f25360g3, this.f1622w);
        this.f1613n = c10357a1M39728v.m39740l(C6598j.f25365h3, 48);
        int iM39733e = c10357a1M39728v.m39733e(C6598j.f25211B3, 0);
        int i11 = C6598j.f25236G3;
        iM39733e = c10357a1M39728v.m39747s(i11) ? c10357a1M39728v.m39733e(i11, iM39733e) : iM39733e;
        this.f1618s = iM39733e;
        this.f1617r = iM39733e;
        this.f1616q = iM39733e;
        this.f1615p = iM39733e;
        int iM39733e2 = c10357a1M39728v.m39733e(C6598j.f25226E3, -1);
        if (iM39733e2 >= 0) {
            this.f1615p = iM39733e2;
        }
        int iM39733e3 = c10357a1M39728v.m39733e(C6598j.f25221D3, -1);
        if (iM39733e3 >= 0) {
            this.f1616q = iM39733e3;
        }
        int iM39733e4 = c10357a1M39728v.m39733e(C6598j.f25231F3, -1);
        if (iM39733e4 >= 0) {
            this.f1617r = iM39733e4;
        }
        int iM39733e5 = c10357a1M39728v.m39733e(C6598j.f25216C3, -1);
        if (iM39733e5 >= 0) {
            this.f1618s = iM39733e5;
        }
        this.f1614o = c10357a1M39728v.m39734f(C6598j.f25420s3, -1);
        int iM39733e6 = c10357a1M39728v.m39733e(C6598j.f25400o3, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        int iM39733e7 = c10357a1M39728v.m39733e(C6598j.f25380k3, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        int iM39734f = c10357a1M39728v.m39734f(C6598j.f25390m3, 0);
        int iM39734f2 = c10357a1M39728v.m39734f(C6598j.f25395n3, 0);
        m1918h();
        this.f1619t.m40035e(iM39734f, iM39734f2);
        if (iM39733e6 != Integer.MIN_VALUE || iM39733e7 != Integer.MIN_VALUE) {
            this.f1619t.m40037g(iM39733e6, iM39733e7);
        }
        this.f1620u = c10357a1M39728v.m39733e(C6598j.f25405p3, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        this.f1621v = c10357a1M39728v.m39733e(C6598j.f25385l3, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        this.f1605f = c10357a1M39728v.m39735g(C6598j.f25375j3);
        this.f1606g = c10357a1M39728v.m39744p(C6598j.f25370i3);
        CharSequence charSequenceM39744p = c10357a1M39728v.m39744p(C6598j.f25206A3);
        if (!TextUtils.isEmpty(charSequenceM39744p)) {
            setTitle(charSequenceM39744p);
        }
        CharSequence charSequenceM39744p2 = c10357a1M39728v.m39744p(C6598j.f25445x3);
        if (!TextUtils.isEmpty(charSequenceM39744p2)) {
            setSubtitle(charSequenceM39744p2);
        }
        this.f1609j = getContext();
        setPopupTheme(c10357a1M39728v.m39742n(C6598j.f25440w3, 0));
        Drawable drawableM39735g = c10357a1M39728v.m39735g(C6598j.f25435v3);
        if (drawableM39735g != null) {
            setNavigationIcon(drawableM39735g);
        }
        CharSequence charSequenceM39744p3 = c10357a1M39728v.m39744p(C6598j.f25430u3);
        if (!TextUtils.isEmpty(charSequenceM39744p3)) {
            setNavigationContentDescription(charSequenceM39744p3);
        }
        Drawable drawableM39735g2 = c10357a1M39728v.m39735g(C6598j.f25410q3);
        if (drawableM39735g2 != null) {
            setLogo(drawableM39735g2);
        }
        CharSequence charSequenceM39744p4 = c10357a1M39728v.m39744p(C6598j.f25415r3);
        if (!TextUtils.isEmpty(charSequenceM39744p4)) {
            setLogoDescription(charSequenceM39744p4);
        }
        int i12 = C6598j.f25246I3;
        if (c10357a1M39728v.m39747s(i12)) {
            setTitleTextColor(c10357a1M39728v.m39731c(i12));
        }
        int i13 = C6598j.f25455z3;
        if (c10357a1M39728v.m39747s(i13)) {
            setSubtitleTextColor(c10357a1M39728v.m39731c(i13));
        }
        int i14 = C6598j.f25425t3;
        if (c10357a1M39728v.m39747s(i14)) {
            mo1935y(c10357a1M39728v.m39742n(i14, 0));
        }
        c10357a1M39728v.m39749x();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1917g();
        }
        ImageButton imageButton = this.f1607h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m1917g();
            this.f1607h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1607h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1605f);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m1919i();
            if (!m1891A(this.f1604e)) {
                m1913c(this.f1604e, true);
            }
        } else {
            ImageView imageView = this.f1604e;
            if (imageView != null && m1891A(imageView)) {
                removeView(this.f1604e);
                this.f1585E.remove(this.f1604e);
            }
        }
        ImageView imageView2 = this.f1604e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1919i();
        }
        ImageView imageView = this.f1604e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1922l();
        }
        ImageButton imageButton = this.f1603d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C10369e1.m39834a(this.f1603d, charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1922l();
            if (!m1891A(this.f1603d)) {
                m1913c(this.f1603d, true);
            }
        } else {
            ImageButton imageButton = this.f1603d;
            if (imageButton != null && m1891A(imageButton)) {
                removeView(this.f1603d);
                this.f1585E.remove(this.f1603d);
            }
        }
        ImageButton imageButton2 = this.f1603d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1602c;
            if (textView != null && m1891A(textView)) {
                removeView(this.f1602c);
                this.f1585E.remove(this.f1602c);
            }
        } else {
            if (this.f1602c == null) {
                Context context = getContext();
                C10359b0 c10359b0 = new C10359b0(context);
                this.f1602c = c10359b0;
                c10359b0.setSingleLine();
                this.f1602c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1612m;
                if (i10 != 0) {
                    this.f1602c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1581A;
                if (colorStateList != null) {
                    this.f1602c.setTextColor(colorStateList);
                }
            }
            if (!m1891A(this.f1602c)) {
                m1913c(this.f1602c, true);
            }
        }
        TextView textView2 = this.f1602c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1624y = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f1581A = colorStateList;
        TextView textView = this.f1602c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1601b;
            if (textView != null && m1891A(textView)) {
                removeView(this.f1601b);
                this.f1585E.remove(this.f1601b);
            }
        } else {
            if (this.f1601b == null) {
                Context context = getContext();
                C10359b0 c10359b0 = new C10359b0(context);
                this.f1601b = c10359b0;
                c10359b0.setSingleLine();
                this.f1601b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1611l;
                if (i10 != 0) {
                    this.f1601b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1625z;
                if (colorStateList != null) {
                    this.f1601b.setTextColor(colorStateList);
                }
            }
            if (!m1891A(this.f1601b)) {
                m1913c(this.f1601b, true);
            }
        }
        TextView textView2 = this.f1601b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1623x = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f1625z = colorStateList;
        TextView textView = this.f1601b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0473a();

        /* JADX INFO: renamed from: c */
        public int f1626c;

        /* JADX INFO: renamed from: d */
        public boolean f1627d;

        /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        public class C0473a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1626c = parcel.readInt();
            this.f1627d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1626c);
            parcel.writeInt(this.f1627d ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
