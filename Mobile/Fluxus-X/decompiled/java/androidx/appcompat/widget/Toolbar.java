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
import androidx.appcompat.view.menu.l;
import androidx.core.view.k;
import androidx.core.view.o;
import androidx.core.view.o0;
import androidx.core.view.p;
import androidx.core.view.r;
import i.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import q.b1;
import q.c0;
import q.f1;
import q.g0;
import q.h1;
import q.q;
import q.u0;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements o {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList<View> D;
    public final ArrayList<View> E;
    public final int[] F;
    public final p G;
    public ArrayList<MenuItem> H;
    public final ActionMenuView.e I;
    public androidx.appcompat.widget.d J;
    public androidx.appcompat.widget.a K;
    public f L;
    public androidx.appcompat.view.menu.i.a M;
    public androidx.appcompat.view.menu.e.a N;
    public boolean O;
    public OnBackInvokedCallback P;
    public OnBackInvokedDispatcher Q;
    public boolean R;
    public final Runnable S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionMenuView f1017a;
    public TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f1018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageButton f1019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f1020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f1022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageButton f1023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f1024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f1025j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1026k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1028m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1029n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1030o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1031p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1032q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1033r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1034s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public u0 f1035t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1036u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1037v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1038w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f1039x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f1040y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f1041z;

    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.G.d(menuItem)) {
                return true;
            }
            Toolbar.this.getClass();
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.R();
        }
    }

    public class c implements androidx.appcompat.view.menu.e.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
            androidx.appcompat.view.menu.e.a aVar = Toolbar.this.N;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f1017a.H()) {
                Toolbar.this.G.e(eVar);
            }
            androidx.appcompat.view.menu.e.a aVar = Toolbar.this.N;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    public static class e {
        public static OnBackInvokedDispatcher a(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        public static OnBackInvokedCallback b(@NonNull final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: q.e1
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        public static void c(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class f implements androidx.appcompat.view.menu.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f1046a;
        public androidx.appcompat.view.menu.g b;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.i
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1023h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1023h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1023h);
            }
            Toolbar.this.f1024i = gVar.getActionView();
            this.b = gVar;
            ViewParent parent2 = Toolbar.this.f1024i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1024i);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f19839a = (toolbar4.f1029n & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.b = 2;
                toolbar4.f1024i.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1024i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f1024i;
            if (callback instanceof o.c) {
                ((o.c) callback).onActionViewExpanded();
            }
            Toolbar.this.S();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean e(l lVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public void f(boolean z10) {
            if (this.b != null) {
                androidx.appcompat.view.menu.e eVar = this.f1046a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f1046a.getItem(i10) == this.b) {
                            return;
                        }
                    }
                }
                h(this.f1046a, this.b);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean h(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f1024i;
            if (callback instanceof o.c) {
                ((o.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1024i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1023h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1024i = null;
            toolbar3.a();
            this.b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.S();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1046a;
            if (eVar2 != null && (gVar = this.b) != null) {
                eVar2.f(gVar);
            }
            this.f1046a = eVar;
        }
    }

    public interface h {
    }

    public Toolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.Q);
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
        return new o.g(getContext());
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f1017a;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f1017a;
        return actionMenuView != null && actionMenuView.H();
    }

    public final int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    public final int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void F(View view, int i10, int i11, int i12, int i13, int i14) {
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

    public final void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.G.b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final void H() {
        removeCallbacks(this.S);
        post(this.S);
    }

    public void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).b != 2 && childAt != this.f1017a) {
                removeViewAt(childCount);
                this.E.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f1035t.e(i10, i11);
    }

    public void K(int i10, int i11) {
        h();
        this.f1035t.g(i10, i11);
    }

    public void L(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.a aVar) {
        if (eVar == null && this.f1017a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarL = this.f1017a.L();
        if (eVarL == eVar) {
            return;
        }
        if (eVarL != null) {
            eVarL.P(this.K);
            eVarL.P(this.L);
        }
        if (this.L == null) {
            this.L = new f();
        }
        aVar.H(true);
        if (eVar != null) {
            eVar.c(aVar, this.f1025j);
            eVar.c(this.L, this.f1025j);
        } else {
            aVar.i(this.f1025j, null);
            this.L.i(this.f1025j, null);
            aVar.f(true);
            this.L.f(true);
        }
        this.f1017a.setPopupTheme(this.f1026k);
        this.f1017a.setPresenter(aVar);
        this.K = aVar;
        S();
    }

    public void M(Context context, int i10) {
        this.f1028m = i10;
        TextView textView = this.f1018c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f1027l = i10;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public final boolean O() {
        if (!this.O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    @Override // androidx.core.view.o
    public void Q(@NonNull r rVar) {
        this.G.f(rVar);
    }

    public boolean R() {
        ActionMenuView actionMenuView = this.f1017a;
        return actionMenuView != null && actionMenuView.N();
    }

    public void S() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z10 = v() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.R;
            if (z10 && this.Q == null) {
                if (this.P == null) {
                    this.P = e.b(new Runnable() { // from class: q.c1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f29492a.e();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.P);
                this.Q = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.Q) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.P);
            this.Q = null;
        }
    }

    public void a() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            addView(this.E.get(size));
        }
        this.E.clear();
    }

    public final void b(List<View> list, int i10) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iB = k.b(i10, getLayoutDirection());
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.b == 0 && P(childAt) && p(gVar.f19839a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.b == 0 && P(childAt2) && p(gVar2.f19839a) == iB) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z10) {
        g gVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            gVarGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        }
        gVarGenerateLayoutParams.b = 1;
        if (!z10 || this.f1024i == null) {
            addView(view, gVarGenerateLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateLayoutParams);
            this.E.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1017a) != null && actionMenuView.I();
    }

    public void e() {
        f fVar = this.L;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1017a;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    public void g() {
        if (this.f1023h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, i.a.P);
            this.f1023h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1021f);
            this.f1023h.setContentDescription(this.f1022g);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f19839a = (this.f1029n & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.b = 2;
            this.f1023h.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f1023h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1023h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1023h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        u0 u0Var = this.f1035t;
        if (u0Var != null) {
            return u0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1037v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        u0 u0Var = this.f1035t;
        if (u0Var != null) {
            return u0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        u0 u0Var = this.f1035t;
        if (u0Var != null) {
            return u0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        u0 u0Var = this.f1035t;
        if (u0Var != null) {
            return u0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1036u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarL;
        ActionMenuView actionMenuView = this.f1017a;
        return (actionMenuView == null || (eVarL = actionMenuView.L()) == null || !eVarL.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1037v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1036u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1020e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1020e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1017a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1019d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1019d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1019d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1017a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1025j;
    }

    public int getPopupTheme() {
        return this.f1026k;
    }

    public CharSequence getSubtitle() {
        return this.f1040y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1018c;
    }

    public CharSequence getTitle() {
        return this.f1039x;
    }

    public int getTitleMarginBottom() {
        return this.f1034s;
    }

    public int getTitleMarginEnd() {
        return this.f1032q;
    }

    public int getTitleMarginStart() {
        return this.f1031p;
    }

    public int getTitleMarginTop() {
        return this.f1033r;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public g0 getWrapper() {
        if (this.J == null) {
            this.J = new androidx.appcompat.widget.d(this, true);
        }
        return this.J;
    }

    public final void h() {
        if (this.f1035t == null) {
            this.f1035t = new u0();
        }
    }

    public final void i() {
        if (this.f1020e == null) {
            this.f1020e = new q(getContext());
        }
    }

    public final void j() {
        k();
        if (this.f1017a.L() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f1017a.getMenu();
            if (this.L == null) {
                this.L = new f();
            }
            this.f1017a.setExpandedActionViewsExclusive(true);
            eVar.c(this.L, this.f1025j);
            S();
        }
    }

    public final void k() {
        if (this.f1017a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1017a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1026k);
            this.f1017a.setOnMenuItemClickListener(this.I);
            this.f1017a.M(this.M, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f19839a = (this.f1029n & 112) | 8388613;
            this.f1017a.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f1017a, false);
        }
    }

    public final void l() {
        if (this.f1019d == null) {
            this.f1019d = new AppCompatImageButton(getContext(), null, i.a.P);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f19839a = (this.f1029n & 112) | 8388611;
            this.f1019d.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    @Override // androidx.core.view.o
    public void l0(@NonNull r rVar) {
        this.G.a(rVar);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof j.a.C0372a) {
            return new g((j.a.C0372a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        S();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
        S();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
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
        int iC;
        int iD;
        int iMax;
        int iMin;
        boolean zP;
        boolean zP2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        g gVar;
        g gVar2;
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
        int iC2;
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
        int[] iArr = this.F;
        iArr[1] = 0;
        iArr[0] = 0;
        int iA = o0.A(this);
        int iMin2 = iA >= 0 ? Math.min(iA, i13 - i11) : 0;
        if (P(this.f1019d)) {
            if (z12) {
                iD = D(this.f1019d, i33, iArr, iMin2);
                iC = paddingLeft;
            } else {
                iC = C(this.f1019d, paddingLeft, iArr, iMin2);
            }
            if (P(this.f1023h)) {
                if (z12) {
                    iD = D(this.f1023h, iD, iArr, iMin2);
                } else {
                    iC = C(this.f1023h, iC, iArr, iMin2);
                }
            }
            if (P(this.f1017a)) {
                if (z12) {
                    iC = C(this.f1017a, iC, iArr, iMin2);
                } else {
                    iD = D(this.f1017a, iD, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iC);
            iArr[1] = Math.max(0, currentContentInsetRight - (i33 - iD));
            iMax = Math.max(iC, currentContentInsetLeft);
            iMin = Math.min(iD, i33 - currentContentInsetRight);
            if (P(this.f1024i)) {
                if (z12) {
                    iMin = D(this.f1024i, iMin, iArr, iMin2);
                } else {
                    iMax = C(this.f1024i, iMax, iArr, iMin2);
                }
            }
            if (P(this.f1020e)) {
                if (z12) {
                    iMin = D(this.f1020e, iMin, iArr, iMin2);
                } else {
                    iMax = C(this.f1020e, iMax, iArr, iMin2);
                }
            }
            zP = P(this.b);
            zP2 = P(this.f1018c);
            if (zP) {
                g gVar3 = (g) this.b.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.b.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (zP2) {
                g gVar4 = (g) this.f1018c.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) gVar4).topMargin + this.f1018c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin;
            }
            if (!zP || zP2) {
                if (zP) {
                    textView = this.b;
                } else {
                    textView = this.f1018c;
                }
                if (zP2) {
                    textView2 = this.f1018c;
                } else {
                    textView2 = this.b;
                }
                gVar = (g) textView.getLayoutParams();
                gVar2 = (g) textView2.getLayoutParams();
                i14 = measuredHeight;
                z11 = (!zP && this.b.getMeasuredWidth() > 0) || (zP2 && this.f1018c.getMeasuredWidth() > 0);
                i15 = this.f1038w & 112;
                i16 = iMax;
                if (i15 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f1033r;
                } else if (i15 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                    i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                    i25 = this.f1033r;
                    if (iMax2 < i24 + i25) {
                        iMax2 = i24 + i25;
                    } else {
                        i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                        i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                        i28 = this.f1034s;
                        if (i26 < i27 + i28) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f1034s) - i14;
                }
                if (z12) {
                    if (z11) {
                        i21 = this.f1031p;
                    } else {
                        i21 = 0;
                    }
                    int i34 = i21 - iArr[1];
                    iMin -= Math.max(0, i34);
                    iArr[1] = Math.max(0, -i34);
                    if (zP) {
                        g gVar5 = (g) this.b.getLayoutParams();
                        int measuredWidth = iMin - this.b.getMeasuredWidth();
                        int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i22 = measuredWidth - this.f1032q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                    } else {
                        i22 = iMin;
                    }
                    if (zP2) {
                        int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1018c.getLayoutParams())).topMargin;
                        this.f1018c.layout(iMin - this.f1018c.getMeasuredWidth(), i35, iMin, this.f1018c.getMeasuredHeight() + i35);
                        i23 = iMin - this.f1032q;
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
                        i17 = this.f1031p;
                    } else {
                        i17 = 0;
                    }
                    i18 = 0;
                    int i36 = i17 - iArr[0];
                    iMax = i16 + Math.max(0, i36);
                    iArr[0] = Math.max(0, -i36);
                    if (zP) {
                        g gVar6 = (g) this.b.getLayoutParams();
                        int measuredWidth2 = this.b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i19 = measuredWidth2 + this.f1032q;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i19 = iMax;
                    }
                    if (zP2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1018c.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.f1018c.getMeasuredWidth() + iMax;
                        this.f1018c.layout(iMax, i37, measuredWidth3, this.f1018c.getMeasuredHeight() + i37);
                        i20 = measuredWidth3 + this.f1032q;
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
            b(this.D, 3);
            size = this.D.size();
            iC2 = iMax;
            for (i29 = i18; i29 < size; i29++) {
                iC2 = C(this.D.get(i29), iC2, iArr, iMin2);
            }
            b(this.D, 5);
            size2 = this.D.size();
            for (i30 = i18; i30 < size2; i30++) {
                iMin = D(this.D.get(i30), iMin, iArr, iMin2);
            }
            b(this.D, 1);
            int iU = u(this.D, iArr);
            i31 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iU / 2);
            i32 = iU + i31;
            if (i31 >= iC2) {
                if (i32 > iMin) {
                    iC2 = i31 - (i32 - iMin);
                } else {
                    iC2 = i31;
                }
            }
            size3 = this.D.size();
            while (i18 < size3) {
                iC2 = C(this.D.get(i18), iC2, iArr, iMin2);
                i18++;
            }
            this.D.clear();
        }
        iC = paddingLeft;
        iD = i33;
        if (P(this.f1023h)) {
            if (z12) {
                iD = D(this.f1023h, iD, iArr, iMin2);
            } else {
                iC = C(this.f1023h, iC, iArr, iMin2);
            }
        }
        if (P(this.f1017a)) {
            if (z12) {
                iC = C(this.f1017a, iC, iArr, iMin2);
            } else {
                iD = D(this.f1017a, iD, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iC);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i33 - iD));
        iMax = Math.max(iC, currentContentInsetLeft2);
        iMin = Math.min(iD, i33 - currentContentInsetRight2);
        if (P(this.f1024i)) {
            if (z12) {
                iMin = D(this.f1024i, iMin, iArr, iMin2);
            } else {
                iMax = C(this.f1024i, iMax, iArr, iMin2);
            }
        }
        if (P(this.f1020e)) {
            if (z12) {
                iMin = D(this.f1020e, iMin, iArr, iMin2);
            } else {
                iMax = C(this.f1020e, iMax, iArr, iMin2);
            }
        }
        zP = P(this.b);
        zP2 = P(this.f1018c);
        if (zP) {
            g gVar7 = (g) this.b.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) gVar7).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar7).topMargin + this.b.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (zP2) {
            g gVar8 = (g) this.f1018c.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) gVar8).topMargin + this.f1018c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar8).bottomMargin;
        }
        if (zP) {
            if (zP) {
                textView = this.b;
            } else {
                textView = this.f1018c;
            }
            if (zP2) {
                textView2 = this.f1018c;
            } else {
                textView2 = this.b;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i14 = measuredHeight;
            if (zP) {
            }
            i15 = this.f1038w & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f1033r;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i25 = this.f1033r;
                if (iMax2 < i24 + i25) {
                    iMax2 = i24 + i25;
                } else {
                    i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i28 = this.f1034s;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f1034s) - i14;
            }
            if (z12) {
                if (z11) {
                    i21 = this.f1031p;
                } else {
                    i21 = 0;
                }
                int i38 = i21 - iArr[1];
                iMin -= Math.max(0, i38);
                iArr[1] = Math.max(0, -i38);
                if (zP) {
                    g gVar9 = (g) this.b.getLayoutParams();
                    int measuredWidth4 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight4 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i22 = measuredWidth4 - this.f1032q;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) gVar9).bottomMargin;
                } else {
                    i22 = iMin;
                }
                if (zP2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1018c.getLayoutParams())).topMargin;
                    this.f1018c.layout(iMin - this.f1018c.getMeasuredWidth(), i39, iMin, this.f1018c.getMeasuredHeight() + i39);
                    i23 = iMin - this.f1032q;
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
                    i17 = this.f1031p;
                } else {
                    i17 = 0;
                }
                i18 = 0;
                int i310 = i17 - iArr[0];
                iMax = i16 + Math.max(0, i310);
                iArr[0] = Math.max(0, -i310);
                if (zP) {
                    g gVar10 = (g) this.b.getLayoutParams();
                    int measuredWidth5 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i19 = measuredWidth5 + this.f1032q;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) gVar10).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zP2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1018c.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.f1018c.getMeasuredWidth() + iMax;
                    this.f1018c.layout(iMax, i311, measuredWidth6, this.f1018c.getMeasuredHeight() + i311);
                    i20 = measuredWidth6 + this.f1032q;
                } else {
                    i20 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i19, i20);
                }
            }
        } else {
            if (zP) {
                textView = this.b;
            } else {
                textView = this.f1018c;
            }
            if (zP2) {
                textView2 = this.f1018c;
            } else {
                textView2 = this.b;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i14 = measuredHeight;
            if (zP) {
            }
            i15 = this.f1038w & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f1033r;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i25 = this.f1033r;
                if (iMax2 < i24 + i25) {
                    iMax2 = i24 + i25;
                } else {
                    i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i28 = this.f1034s;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f1034s) - i14;
            }
            if (z12) {
                if (z11) {
                    i21 = this.f1031p;
                } else {
                    i21 = 0;
                }
                int i312 = i21 - iArr[1];
                iMin -= Math.max(0, i312);
                iArr[1] = Math.max(0, -i312);
                if (zP) {
                    g gVar11 = (g) this.b.getLayoutParams();
                    int measuredWidth7 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight6 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i22 = measuredWidth7 - this.f1032q;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) gVar11).bottomMargin;
                } else {
                    i22 = iMin;
                }
                if (zP2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1018c.getLayoutParams())).topMargin;
                    this.f1018c.layout(iMin - this.f1018c.getMeasuredWidth(), i313, iMin, this.f1018c.getMeasuredHeight() + i313);
                    i23 = iMin - this.f1032q;
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
                    i17 = this.f1031p;
                } else {
                    i17 = 0;
                }
                i18 = 0;
                int i314 = i17 - iArr[0];
                iMax = i16 + Math.max(0, i314);
                iArr[0] = Math.max(0, -i314);
                if (zP) {
                    g gVar12 = (g) this.b.getLayoutParams();
                    int measuredWidth8 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i19 = measuredWidth8 + this.f1032q;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) gVar12).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zP2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1018c.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.f1018c.getMeasuredWidth() + iMax;
                    this.f1018c.layout(iMax, i315, measuredWidth9, this.f1018c.getMeasuredHeight() + i315);
                    i20 = measuredWidth9 + this.f1032q;
                } else {
                    i20 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i19, i20);
                }
            }
        }
        b(this.D, 3);
        size = this.D.size();
        iC2 = iMax;
        while (i29 < size) {
            iC2 = C(this.D.get(i29), iC2, iArr, iMin2);
        }
        b(this.D, 5);
        size2 = this.D.size();
        while (i30 < size2) {
            iMin = D(this.D.get(i30), iMin, iArr, iMin2);
        }
        b(this.D, 1);
        int iU2 = u(this.D, iArr);
        i31 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iU2 / 2);
        i32 = iU2 + i31;
        if (i31 >= iC2) {
            if (i32 > iMin) {
                iC2 = i31 - (i32 - iMin);
            } else {
                iC2 = i31;
            }
        }
        size3 = this.D.size();
        while (i18 < size3) {
            iC2 = C(this.D.get(i18), iC2, iArr, iMin2);
            i18++;
        }
        this.D.clear();
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
        int[] iArr2 = this.F;
        boolean zB = h1.b(this);
        int i12 = !zB ? 1 : 0;
        if (P(this.f1019d)) {
            F(this.f1019d, i10, 0, i11, 0, this.f1030o);
            measuredWidth = this.f1019d.getMeasuredWidth() + s(this.f1019d);
            iMax = Math.max(0, this.f1019d.getMeasuredHeight() + t(this.f1019d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1019d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (P(this.f1023h)) {
            F(this.f1023h, i10, 0, i11, 0, this.f1030o);
            measuredWidth = this.f1023h.getMeasuredWidth() + s(this.f1023h);
            iMax = Math.max(iMax, this.f1023h.getMeasuredHeight() + t(this.f1023h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1023h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (P(this.f1017a)) {
            F(this.f1017a, i10, iMax3, i11, 0, this.f1030o);
            measuredWidth2 = this.f1017a.getMeasuredWidth() + s(this.f1017a);
            iMax = Math.max(iMax, this.f1017a.getMeasuredHeight() + t(this.f1017a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1017a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (P(this.f1024i)) {
            iArr = iArr2;
            iMax4 += E(this.f1024i, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f1024i.getMeasuredHeight() + t(this.f1024i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1024i.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (P(this.f1020e)) {
            iMax4 += E(this.f1020e, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f1020e.getMeasuredHeight() + t(this.f1020e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1020e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).b == 0 && P(childAt)) {
                iMax4 += E(childAt, i10, iMax4, i11, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i14 = iMax4;
        int i15 = this.f1033r + this.f1034s;
        int i16 = this.f1031p + this.f1032q;
        if (P(this.b)) {
            E(this.b, i10, i14 + i16, i11, i15, iArr);
            int measuredWidth3 = this.b.getMeasuredWidth() + s(this.b);
            int measuredHeight2 = this.b.getMeasuredHeight() + t(this.b);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (P(this.f1018c)) {
            iMax2 = Math.max(iMax2, E(this.f1018c, i10, i14 + i16, i11, i15 + measuredHeight, iArr));
            measuredHeight += this.f1018c.getMeasuredHeight() + t(this.f1018c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1018c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i14 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), O() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f1017a;
        androidx.appcompat.view.menu.e eVarL = actionMenuView != null ? actionMenuView.L() : null;
        int i10 = iVar.f1048c;
        if (i10 != 0 && this.L != null && eVarL != null && (menuItemFindItem = eVarL.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f1049d) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.f1035t.f(i10 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.L;
        if (fVar != null && (gVar = fVar.b) != null) {
            iVar.f1048c = gVar.getItemId();
        }
        iVar.f1049d = B();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public final int p(int i10) {
        int layoutDirection = getLayoutDirection();
        int iB = k.b(i10, layoutDirection) & 7;
        if (iB == 1 || iB == 3 || iB == 5) {
            return iB;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    public final int q(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int iR = r(gVar.f19839a);
        if (iR == 48) {
            return getPaddingTop() - i11;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    public final int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f1038w & 112;
    }

    public final int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            S();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(k.a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.O = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1037v) {
            this.f1037v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1036u) {
            this.f1036u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(k.a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(k.a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1019d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1017a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1026k != i10) {
            this.f1026k = i10;
            if (i10 == 0) {
                this.f1025j = getContext();
            } else {
                this.f1025j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f1034s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1032q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1031p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1033r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
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

    public boolean v() {
        f fVar = this.L;
        return (fVar == null || fVar.b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1017a;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        ArrayList<MenuItem> arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            MenuItem menuItem = arrayList.get(i10);
            i10++;
            getMenu().removeItem(menuItem.getItemId());
        }
        G();
    }

    public final boolean z(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public static class g extends j.a.C0372a {
        public int b;

        public g(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.b = 0;
            this.f19839a = 8388627;
        }

        public g(g gVar) {
            super((j.a.C0372a) gVar);
            this.b = 0;
            this.b = gVar.b;
        }

        public g(j.a.C0372a c0372a) {
            super(c0372a);
            this.b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }
    }

    public Toolbar(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1038w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.G = new p(new Runnable() { // from class: q.d1
            @Override // java.lang.Runnable
            public final void run() {
                this.f29508a.y();
            }
        });
        this.H = new ArrayList<>();
        this.I = new a();
        this.S = new b();
        b1 b1VarV = b1.v(getContext(), attributeSet, j.f18889f3, i10, 0);
        o0.k0(this, context, j.f18889f3, attributeSet, b1VarV.r(), i10, 0);
        this.f1027l = b1VarV.n(j.H3, 0);
        this.f1028m = b1VarV.n(j.f18984y3, 0);
        this.f1038w = b1VarV.l(j.f18894g3, this.f1038w);
        this.f1029n = b1VarV.l(j.f18899h3, 48);
        int iE = b1VarV.e(j.B3, 0);
        iE = b1VarV.s(j.G3) ? b1VarV.e(j.G3, iE) : iE;
        this.f1034s = iE;
        this.f1033r = iE;
        this.f1032q = iE;
        this.f1031p = iE;
        int iE2 = b1VarV.e(j.E3, -1);
        if (iE2 >= 0) {
            this.f1031p = iE2;
        }
        int iE3 = b1VarV.e(j.D3, -1);
        if (iE3 >= 0) {
            this.f1032q = iE3;
        }
        int iE4 = b1VarV.e(j.F3, -1);
        if (iE4 >= 0) {
            this.f1033r = iE4;
        }
        int iE5 = b1VarV.e(j.C3, -1);
        if (iE5 >= 0) {
            this.f1034s = iE5;
        }
        this.f1030o = b1VarV.f(j.f18954s3, -1);
        int iE6 = b1VarV.e(j.f18934o3, Integer.MIN_VALUE);
        int iE7 = b1VarV.e(j.f18914k3, Integer.MIN_VALUE);
        int iF = b1VarV.f(j.f18924m3, 0);
        int iF2 = b1VarV.f(j.f18929n3, 0);
        h();
        this.f1035t.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f1035t.g(iE6, iE7);
        }
        this.f1036u = b1VarV.e(j.f18939p3, Integer.MIN_VALUE);
        this.f1037v = b1VarV.e(j.f18919l3, Integer.MIN_VALUE);
        this.f1021f = b1VarV.g(j.f18909j3);
        this.f1022g = b1VarV.p(j.f18904i3);
        CharSequence charSequenceP = b1VarV.p(j.A3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = b1VarV.p(j.f18979x3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f1025j = getContext();
        setPopupTheme(b1VarV.n(j.f18974w3, 0));
        Drawable drawableG = b1VarV.g(j.f18969v3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = b1VarV.p(j.f18964u3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = b1VarV.g(j.f18944q3);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = b1VarV.p(j.f18949r3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        if (b1VarV.s(j.I3)) {
            setTitleTextColor(b1VarV.c(j.I3));
        }
        if (b1VarV.s(j.f18989z3)) {
            setSubtitleTextColor(b1VarV.c(j.f18989z3));
        }
        if (b1VarV.s(j.f18959t3)) {
            x(b1VarV.n(j.f18959t3, 0));
        }
        b1VarV.x();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1023h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1023h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1023h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1021f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f1020e)) {
                c(this.f1020e, true);
            }
        } else {
            ImageView imageView = this.f1020e;
            if (imageView != null && z(imageView)) {
                removeView(this.f1020e);
                this.E.remove(this.f1020e);
            }
        }
        ImageView imageView2 = this.f1020e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1020e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1019d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            f1.a(this.f1019d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f1019d)) {
                c(this.f1019d, true);
            }
        } else {
            ImageButton imageButton = this.f1019d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f1019d);
                this.E.remove(this.f1019d);
            }
        }
        ImageButton imageButton2 = this.f1019d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1018c;
            if (textView != null && z(textView)) {
                removeView(this.f1018c);
                this.E.remove(this.f1018c);
            }
        } else {
            if (this.f1018c == null) {
                Context context = getContext();
                c0 c0Var = new c0(context);
                this.f1018c = c0Var;
                c0Var.setSingleLine();
                this.f1018c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1028m;
                if (i10 != 0) {
                    this.f1018c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1018c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1018c)) {
                c(this.f1018c, true);
            }
        }
        TextView textView2 = this.f1018c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1040y = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f1018c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.b;
            if (textView != null && z(textView)) {
                removeView(this.b);
                this.E.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                c0 c0Var = new c0(context);
                this.b = c0Var;
                c0Var.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1027l;
                if (i10 != 0) {
                    this.b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1041z;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!z(this.b)) {
                c(this.b, true);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1039x = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f1041z = colorStateList;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class i extends r3.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1049d;

        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1048c = parcel.readInt();
            this.f1049d = parcel.readInt() != 0;
        }

        @Override // r3.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1048c);
            parcel.writeInt(this.f1049d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
