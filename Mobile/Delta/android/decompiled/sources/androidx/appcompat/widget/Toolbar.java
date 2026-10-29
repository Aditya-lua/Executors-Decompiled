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
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.core.view.k;
import androidx.core.view.o;
import androidx.core.view.o0;
import androidx.core.view.p;
import androidx.core.view.r;
import androidx.customview.view.AbsSavedState;
import i.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import q.a1;
import q.b0;
import q.e1;
import q.f0;
import q.g1;
import q.q;
import q.t0;

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
    public i.a M;
    public androidx.appcompat.view.menu.e.a N;
    public boolean O;
    public OnBackInvokedCallback P;
    public OnBackInvokedDispatcher Q;
    public boolean R;
    public final Runnable S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionMenuView f1210a;
    public TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f1211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageButton f1212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f1213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f1215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageButton f1216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f1217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f1218j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1219k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1221m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1222n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1223o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1224p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1225q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1226r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1227s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t0 f1228t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1229u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1230v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1231w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f1232x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f1233y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f1234z;

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
            Toolbar.this.S();
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
            if (!Toolbar.this.f1210a.H()) {
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
            return new OnBackInvokedCallback() { // from class: q.d1
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

    public class f implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f1241a;
        public androidx.appcompat.view.menu.g b;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.i
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1216h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1216h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1216h);
            }
            Toolbar.this.f1217i = gVar.getActionView();
            this.b = gVar;
            ViewParent parent2 = Toolbar.this.f1217i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1217i);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f20874a = (toolbar4.f1222n & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.b = 2;
                toolbar4.f1217i.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1217i);
            }
            Toolbar.this.J();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f1217i;
            if (callback instanceof o.c) {
                ((o.c) callback).onActionViewExpanded();
            }
            Toolbar.this.T();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean e(l lVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public void f(boolean z10) {
            if (this.b != null) {
                androidx.appcompat.view.menu.e eVar = this.f1241a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f1241a.getItem(i10) == this.b) {
                            return;
                        }
                    }
                }
                h(this.f1241a, this.b);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean h(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f1217i;
            if (callback instanceof o.c) {
                ((o.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1217i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1216h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1217i = null;
            toolbar3.a();
            this.b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.T();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1241a;
            if (eVar2 != null && (gVar = this.b) != null) {
                eVar2.f(gVar);
            }
            this.f1241a = eVar;
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

    public final boolean A(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f1210a;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean C() {
        ActionMenuView actionMenuView = this.f1210a;
        return actionMenuView != null && actionMenuView.H();
    }

    public final int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    public final int E(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int F(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void G(View view, int i10, int i11, int i12, int i13, int i14) {
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

    public final void H() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.G.b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final void I() {
        removeCallbacks(this.S);
        post(this.S);
    }

    public void J() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).b != 2 && childAt != this.f1210a) {
                removeViewAt(childCount);
                this.E.add(childAt);
            }
        }
    }

    public void K(int i10, int i11) {
        h();
        this.f1228t.e(i10, i11);
    }

    public void L(int i10, int i11) {
        h();
        this.f1228t.g(i10, i11);
    }

    public void M(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.a aVar) {
        if (eVar == null && this.f1210a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarL = this.f1210a.L();
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
            eVar.c(aVar, this.f1218j);
            eVar.c(this.L, this.f1218j);
        } else {
            aVar.i(this.f1218j, null);
            this.L.i(this.f1218j, null);
            aVar.f(true);
            this.L.f(true);
        }
        this.f1210a.setPopupTheme(this.f1219k);
        this.f1210a.setPresenter(aVar);
        this.K = aVar;
        T();
    }

    public void N(Context context, int i10) {
        this.f1221m = i10;
        TextView textView = this.f1211c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void O(Context context, int i10) {
        this.f1220l = i10;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public final boolean P() {
        if (!this.O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (Q(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean Q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    @Override // androidx.core.view.o
    public void R(@NonNull r rVar) {
        this.G.f(rVar);
    }

    public boolean S() {
        ActionMenuView actionMenuView = this.f1210a;
        return actionMenuView != null && actionMenuView.N();
    }

    public void T() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z10 = w() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.R;
            if (z10 && this.Q == null) {
                if (this.P == null) {
                    this.P = e.b(new Runnable() { // from class: q.b1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f28933a.e();
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
                if (gVar.b == 0 && Q(childAt) && p(gVar.f20874a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.b == 0 && Q(childAt2) && p(gVar2.f20874a) == iB) {
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
        if (!z10 || this.f1217i == null) {
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
        return getVisibility() == 0 && (actionMenuView = this.f1210a) != null && actionMenuView.I();
    }

    public void e() {
        f fVar = this.L;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1210a;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    public void g() {
        if (this.f1216h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, i.a.P);
            this.f1216h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1214f);
            this.f1216h.setContentDescription(this.f1215g);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f20874a = (this.f1222n & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.b = 2;
            this.f1216h.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f1216h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1216h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1216h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        t0 t0Var = this.f1228t;
        if (t0Var != null) {
            return t0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1230v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        t0 t0Var = this.f1228t;
        if (t0Var != null) {
            return t0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        t0 t0Var = this.f1228t;
        if (t0Var != null) {
            return t0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        t0 t0Var = this.f1228t;
        if (t0Var != null) {
            return t0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1229u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarL;
        ActionMenuView actionMenuView = this.f1210a;
        return (actionMenuView == null || (eVarL = actionMenuView.L()) == null || !eVarL.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1230v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1229u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1213e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1213e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1210a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1212d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1212d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1212d;
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
        return this.f1210a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1218j;
    }

    public int getPopupTheme() {
        return this.f1219k;
    }

    public CharSequence getSubtitle() {
        return this.f1233y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1211c;
    }

    public CharSequence getTitle() {
        return this.f1232x;
    }

    public int getTitleMarginBottom() {
        return this.f1227s;
    }

    public int getTitleMarginEnd() {
        return this.f1225q;
    }

    public int getTitleMarginStart() {
        return this.f1224p;
    }

    public int getTitleMarginTop() {
        return this.f1226r;
    }

    public final TextView getTitleTextView() {
        return this.b;
    }

    public f0 getWrapper() {
        if (this.J == null) {
            this.J = new androidx.appcompat.widget.d(this, true);
        }
        return this.J;
    }

    public final void h() {
        if (this.f1228t == null) {
            this.f1228t = new t0();
        }
    }

    public final void i() {
        if (this.f1213e == null) {
            this.f1213e = new q(getContext());
        }
    }

    public final void j() {
        k();
        if (this.f1210a.L() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f1210a.getMenu();
            if (this.L == null) {
                this.L = new f();
            }
            this.f1210a.setExpandedActionViewsExclusive(true);
            eVar.c(this.L, this.f1218j);
            T();
        }
    }

    public final void k() {
        if (this.f1210a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1210a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1219k);
            this.f1210a.setOnMenuItemClickListener(this.I);
            this.f1210a.M(this.M, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f20874a = (this.f1222n & 112) | 8388613;
            this.f1210a.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f1210a, false);
        }
    }

    public final void l() {
        if (this.f1212d == null) {
            this.f1212d = new AppCompatImageButton(getContext(), null, i.a.P);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f20874a = (this.f1222n & 112) | 8388611;
            this.f1212d.setLayoutParams(gVarGenerateDefaultLayoutParams);
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
        if (layoutParams instanceof j.a.C0368a) {
            return new g((j.a.C0368a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
        T();
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
        int iD;
        int iE;
        int iMax;
        int iMin;
        boolean zQ;
        boolean zQ2;
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
        int iD2;
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
        if (Q(this.f1212d)) {
            if (z12) {
                iE = E(this.f1212d, i33, iArr, iMin2);
                iD = paddingLeft;
            } else {
                iD = D(this.f1212d, paddingLeft, iArr, iMin2);
            }
            if (Q(this.f1216h)) {
                if (z12) {
                    iE = E(this.f1216h, iE, iArr, iMin2);
                } else {
                    iD = D(this.f1216h, iD, iArr, iMin2);
                }
            }
            if (Q(this.f1210a)) {
                if (z12) {
                    iD = D(this.f1210a, iD, iArr, iMin2);
                } else {
                    iE = E(this.f1210a, iE, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iD);
            iArr[1] = Math.max(0, currentContentInsetRight - (i33 - iE));
            iMax = Math.max(iD, currentContentInsetLeft);
            iMin = Math.min(iE, i33 - currentContentInsetRight);
            if (Q(this.f1217i)) {
                if (z12) {
                    iMin = E(this.f1217i, iMin, iArr, iMin2);
                } else {
                    iMax = D(this.f1217i, iMax, iArr, iMin2);
                }
            }
            if (Q(this.f1213e)) {
                if (z12) {
                    iMin = E(this.f1213e, iMin, iArr, iMin2);
                } else {
                    iMax = D(this.f1213e, iMax, iArr, iMin2);
                }
            }
            zQ = Q(this.b);
            zQ2 = Q(this.f1211c);
            if (zQ) {
                g gVar3 = (g) this.b.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.b.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (zQ2) {
                g gVar4 = (g) this.f1211c.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) gVar4).topMargin + this.f1211c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin;
            }
            if (!zQ || zQ2) {
                if (zQ) {
                    textView = this.b;
                } else {
                    textView = this.f1211c;
                }
                if (zQ2) {
                    textView2 = this.f1211c;
                } else {
                    textView2 = this.b;
                }
                gVar = (g) textView.getLayoutParams();
                gVar2 = (g) textView2.getLayoutParams();
                i14 = measuredHeight;
                z11 = (!zQ && this.b.getMeasuredWidth() > 0) || (zQ2 && this.f1211c.getMeasuredWidth() > 0);
                i15 = this.f1231w & 112;
                i16 = iMax;
                if (i15 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f1226r;
                } else if (i15 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                    i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                    i25 = this.f1226r;
                    if (iMax2 < i24 + i25) {
                        iMax2 = i24 + i25;
                    } else {
                        i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                        i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                        i28 = this.f1227s;
                        if (i26 < i27 + i28) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f1227s) - i14;
                }
                if (z12) {
                    if (z11) {
                        i21 = this.f1224p;
                    } else {
                        i21 = 0;
                    }
                    int i34 = i21 - iArr[1];
                    iMin -= Math.max(0, i34);
                    iArr[1] = Math.max(0, -i34);
                    if (zQ) {
                        g gVar5 = (g) this.b.getLayoutParams();
                        int measuredWidth = iMin - this.b.getMeasuredWidth();
                        int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i22 = measuredWidth - this.f1225q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                    } else {
                        i22 = iMin;
                    }
                    if (zQ2) {
                        int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1211c.getLayoutParams())).topMargin;
                        this.f1211c.layout(iMin - this.f1211c.getMeasuredWidth(), i35, iMin, this.f1211c.getMeasuredHeight() + i35);
                        i23 = iMin - this.f1225q;
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
                        i17 = this.f1224p;
                    } else {
                        i17 = 0;
                    }
                    i18 = 0;
                    int i36 = i17 - iArr[0];
                    iMax = i16 + Math.max(0, i36);
                    iArr[0] = Math.max(0, -i36);
                    if (zQ) {
                        g gVar6 = (g) this.b.getLayoutParams();
                        int measuredWidth2 = this.b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i19 = measuredWidth2 + this.f1225q;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i19 = iMax;
                    }
                    if (zQ2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1211c.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.f1211c.getMeasuredWidth() + iMax;
                        this.f1211c.layout(iMax, i37, measuredWidth3, this.f1211c.getMeasuredHeight() + i37);
                        i20 = measuredWidth3 + this.f1225q;
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
            iD2 = iMax;
            for (i29 = i18; i29 < size; i29++) {
                iD2 = D(this.D.get(i29), iD2, iArr, iMin2);
            }
            b(this.D, 5);
            size2 = this.D.size();
            for (i30 = i18; i30 < size2; i30++) {
                iMin = E(this.D.get(i30), iMin, iArr, iMin2);
            }
            b(this.D, 1);
            int iV = v(this.D, iArr);
            i31 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iV / 2);
            i32 = iV + i31;
            if (i31 >= iD2) {
                if (i32 > iMin) {
                    iD2 = i31 - (i32 - iMin);
                } else {
                    iD2 = i31;
                }
            }
            size3 = this.D.size();
            while (i18 < size3) {
                iD2 = D(this.D.get(i18), iD2, iArr, iMin2);
                i18++;
            }
            this.D.clear();
        }
        iD = paddingLeft;
        iE = i33;
        if (Q(this.f1216h)) {
            if (z12) {
                iE = E(this.f1216h, iE, iArr, iMin2);
            } else {
                iD = D(this.f1216h, iD, iArr, iMin2);
            }
        }
        if (Q(this.f1210a)) {
            if (z12) {
                iD = D(this.f1210a, iD, iArr, iMin2);
            } else {
                iE = E(this.f1210a, iE, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iD);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i33 - iE));
        iMax = Math.max(iD, currentContentInsetLeft2);
        iMin = Math.min(iE, i33 - currentContentInsetRight2);
        if (Q(this.f1217i)) {
            if (z12) {
                iMin = E(this.f1217i, iMin, iArr, iMin2);
            } else {
                iMax = D(this.f1217i, iMax, iArr, iMin2);
            }
        }
        if (Q(this.f1213e)) {
            if (z12) {
                iMin = E(this.f1213e, iMin, iArr, iMin2);
            } else {
                iMax = D(this.f1213e, iMax, iArr, iMin2);
            }
        }
        zQ = Q(this.b);
        zQ2 = Q(this.f1211c);
        if (zQ) {
            g gVar7 = (g) this.b.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) gVar7).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar7).topMargin + this.b.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (zQ2) {
            g gVar8 = (g) this.f1211c.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) gVar8).topMargin + this.f1211c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar8).bottomMargin;
        }
        if (zQ) {
            if (zQ) {
                textView = this.b;
            } else {
                textView = this.f1211c;
            }
            if (zQ2) {
                textView2 = this.f1211c;
            } else {
                textView2 = this.b;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i14 = measuredHeight;
            if (zQ) {
            }
            i15 = this.f1231w & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f1226r;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i25 = this.f1226r;
                if (iMax2 < i24 + i25) {
                    iMax2 = i24 + i25;
                } else {
                    i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i28 = this.f1227s;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f1227s) - i14;
            }
            if (z12) {
                if (z11) {
                    i21 = this.f1224p;
                } else {
                    i21 = 0;
                }
                int i38 = i21 - iArr[1];
                iMin -= Math.max(0, i38);
                iArr[1] = Math.max(0, -i38);
                if (zQ) {
                    g gVar9 = (g) this.b.getLayoutParams();
                    int measuredWidth4 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight4 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i22 = measuredWidth4 - this.f1225q;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) gVar9).bottomMargin;
                } else {
                    i22 = iMin;
                }
                if (zQ2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1211c.getLayoutParams())).topMargin;
                    this.f1211c.layout(iMin - this.f1211c.getMeasuredWidth(), i39, iMin, this.f1211c.getMeasuredHeight() + i39);
                    i23 = iMin - this.f1225q;
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
                    i17 = this.f1224p;
                } else {
                    i17 = 0;
                }
                i18 = 0;
                int i310 = i17 - iArr[0];
                iMax = i16 + Math.max(0, i310);
                iArr[0] = Math.max(0, -i310);
                if (zQ) {
                    g gVar10 = (g) this.b.getLayoutParams();
                    int measuredWidth5 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i19 = measuredWidth5 + this.f1225q;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) gVar10).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zQ2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1211c.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.f1211c.getMeasuredWidth() + iMax;
                    this.f1211c.layout(iMax, i311, measuredWidth6, this.f1211c.getMeasuredHeight() + i311);
                    i20 = measuredWidth6 + this.f1225q;
                } else {
                    i20 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i19, i20);
                }
            }
        } else {
            if (zQ) {
                textView = this.b;
            } else {
                textView = this.f1211c;
            }
            if (zQ2) {
                textView2 = this.f1211c;
            } else {
                textView2 = this.b;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i14 = measuredHeight;
            if (zQ) {
            }
            i15 = this.f1231w & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f1226r;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i25 = this.f1226r;
                if (iMax2 < i24 + i25) {
                    iMax2 = i24 + i25;
                } else {
                    i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i28 = this.f1227s;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f1227s) - i14;
            }
            if (z12) {
                if (z11) {
                    i21 = this.f1224p;
                } else {
                    i21 = 0;
                }
                int i312 = i21 - iArr[1];
                iMin -= Math.max(0, i312);
                iArr[1] = Math.max(0, -i312);
                if (zQ) {
                    g gVar11 = (g) this.b.getLayoutParams();
                    int measuredWidth7 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight6 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i22 = measuredWidth7 - this.f1225q;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) gVar11).bottomMargin;
                } else {
                    i22 = iMin;
                }
                if (zQ2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1211c.getLayoutParams())).topMargin;
                    this.f1211c.layout(iMin - this.f1211c.getMeasuredWidth(), i313, iMin, this.f1211c.getMeasuredHeight() + i313);
                    i23 = iMin - this.f1225q;
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
                    i17 = this.f1224p;
                } else {
                    i17 = 0;
                }
                i18 = 0;
                int i314 = i17 - iArr[0];
                iMax = i16 + Math.max(0, i314);
                iArr[0] = Math.max(0, -i314);
                if (zQ) {
                    g gVar12 = (g) this.b.getLayoutParams();
                    int measuredWidth8 = this.b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i19 = measuredWidth8 + this.f1225q;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) gVar12).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zQ2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f1211c.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.f1211c.getMeasuredWidth() + iMax;
                    this.f1211c.layout(iMax, i315, measuredWidth9, this.f1211c.getMeasuredHeight() + i315);
                    i20 = measuredWidth9 + this.f1225q;
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
        iD2 = iMax;
        while (i29 < size) {
            iD2 = D(this.D.get(i29), iD2, iArr, iMin2);
        }
        b(this.D, 5);
        size2 = this.D.size();
        while (i30 < size2) {
            iMin = E(this.D.get(i30), iMin, iArr, iMin2);
        }
        b(this.D, 1);
        int iV2 = v(this.D, iArr);
        i31 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iV2 / 2);
        i32 = iV2 + i31;
        if (i31 >= iD2) {
            if (i32 > iMin) {
                iD2 = i31 - (i32 - iMin);
            } else {
                iD2 = i31;
            }
        }
        size3 = this.D.size();
        while (i18 < size3) {
            iD2 = D(this.D.get(i18), iD2, iArr, iMin2);
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
        boolean zB = g1.b(this);
        int i12 = !zB ? 1 : 0;
        if (Q(this.f1212d)) {
            G(this.f1212d, i10, 0, i11, 0, this.f1223o);
            measuredWidth = this.f1212d.getMeasuredWidth() + s(this.f1212d);
            iMax = Math.max(0, this.f1212d.getMeasuredHeight() + t(this.f1212d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1212d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (Q(this.f1216h)) {
            G(this.f1216h, i10, 0, i11, 0, this.f1223o);
            measuredWidth = this.f1216h.getMeasuredWidth() + s(this.f1216h);
            iMax = Math.max(iMax, this.f1216h.getMeasuredHeight() + t(this.f1216h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1216h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (Q(this.f1210a)) {
            G(this.f1210a, i10, iMax3, i11, 0, this.f1223o);
            measuredWidth2 = this.f1210a.getMeasuredWidth() + s(this.f1210a);
            iMax = Math.max(iMax, this.f1210a.getMeasuredHeight() + t(this.f1210a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1210a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (Q(this.f1217i)) {
            iArr = iArr2;
            iMax4 += F(this.f1217i, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f1217i.getMeasuredHeight() + t(this.f1217i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1217i.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (Q(this.f1213e)) {
            iMax4 += F(this.f1213e, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f1213e.getMeasuredHeight() + t(this.f1213e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1213e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).b == 0 && Q(childAt)) {
                iMax4 += F(childAt, i10, iMax4, i11, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i14 = iMax4;
        int i15 = this.f1226r + this.f1227s;
        int i16 = this.f1224p + this.f1225q;
        if (Q(this.b)) {
            F(this.b, i10, i14 + i16, i11, i15, iArr);
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
        if (Q(this.f1211c)) {
            iMax2 = Math.max(iMax2, F(this.f1211c, i10, i14 + i16, i11, i15 + measuredHeight, iArr));
            measuredHeight += this.f1211c.getMeasuredHeight() + t(this.f1211c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1211c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i14 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), P() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.f1210a;
        androidx.appcompat.view.menu.e eVarL = actionMenuView != null ? actionMenuView.L() : null;
        int i10 = savedState.f1235c;
        if (i10 != 0 && this.L != null && eVarL != null && (menuItemFindItem = eVarL.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f1236d) {
            I();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.f1228t.f(i10 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.L;
        if (fVar != null && (gVar = fVar.b) != null) {
            savedState.f1235c = gVar.getItemId();
        }
        savedState.f1236d = C();
        return savedState;
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
        int iR = r(gVar.f20874a);
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
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f1231w & 112;
    }

    public final int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            T();
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
        if (i10 != this.f1230v) {
            this.f1230v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1229u) {
            this.f1229u = i10;
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
        this.f1212d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1210a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1219k != i10) {
            this.f1219k = i10;
            if (i10 == 0) {
                this.f1218j = getContext();
            } else {
                this.f1218j = new ContextThemeWrapper(getContext(), i10);
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
        this.f1227s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1225q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1224p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1226r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int v(List<View> list, int[] iArr) {
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

    public boolean w() {
        f fVar = this.L;
        return (fVar == null || fVar.b == null) ? false : true;
    }

    public boolean x() {
        ActionMenuView actionMenuView = this.f1210a;
        return actionMenuView != null && actionMenuView.F();
    }

    public void y(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void z() {
        ArrayList<MenuItem> arrayList = this.H;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            MenuItem menuItem = arrayList.get(i10);
            i10++;
            getMenu().removeItem(menuItem.getItemId());
        }
        H();
    }

    public static class g extends j.a.C0368a {
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
            this.f20874a = 8388627;
        }

        public g(g gVar) {
            super((j.a.C0368a) gVar);
            this.b = 0;
            this.b = gVar.b;
        }

        public g(j.a.C0368a c0368a) {
            super(c0368a);
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
        this.f1231w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.G = new p(new Runnable() { // from class: q.c1
            @Override // java.lang.Runnable
            public final void run() {
                this.f28965a.z();
            }
        });
        this.H = new ArrayList<>();
        this.I = new a();
        this.S = new b();
        Context context2 = getContext();
        int[] iArr = j.f20046f3;
        a1 a1VarV = a1.v(context2, attributeSet, iArr, i10, 0);
        o0.k0(this, context, iArr, attributeSet, a1VarV.r(), i10, 0);
        this.f1220l = a1VarV.n(j.H3, 0);
        this.f1221m = a1VarV.n(j.f20141y3, 0);
        this.f1231w = a1VarV.l(j.f20051g3, this.f1231w);
        this.f1222n = a1VarV.l(j.f20056h3, 48);
        int iE = a1VarV.e(j.B3, 0);
        int i11 = j.G3;
        iE = a1VarV.s(i11) ? a1VarV.e(i11, iE) : iE;
        this.f1227s = iE;
        this.f1226r = iE;
        this.f1225q = iE;
        this.f1224p = iE;
        int iE2 = a1VarV.e(j.E3, -1);
        if (iE2 >= 0) {
            this.f1224p = iE2;
        }
        int iE3 = a1VarV.e(j.D3, -1);
        if (iE3 >= 0) {
            this.f1225q = iE3;
        }
        int iE4 = a1VarV.e(j.F3, -1);
        if (iE4 >= 0) {
            this.f1226r = iE4;
        }
        int iE5 = a1VarV.e(j.C3, -1);
        if (iE5 >= 0) {
            this.f1227s = iE5;
        }
        this.f1223o = a1VarV.f(j.f20111s3, -1);
        int iE6 = a1VarV.e(j.f20091o3, Integer.MIN_VALUE);
        int iE7 = a1VarV.e(j.f20071k3, Integer.MIN_VALUE);
        int iF = a1VarV.f(j.f20081m3, 0);
        int iF2 = a1VarV.f(j.f20086n3, 0);
        h();
        this.f1228t.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f1228t.g(iE6, iE7);
        }
        this.f1229u = a1VarV.e(j.f20096p3, Integer.MIN_VALUE);
        this.f1230v = a1VarV.e(j.f20076l3, Integer.MIN_VALUE);
        this.f1214f = a1VarV.g(j.f20066j3);
        this.f1215g = a1VarV.p(j.f20061i3);
        CharSequence charSequenceP = a1VarV.p(j.A3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = a1VarV.p(j.f20136x3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f1218j = getContext();
        setPopupTheme(a1VarV.n(j.f20131w3, 0));
        Drawable drawableG = a1VarV.g(j.f20126v3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = a1VarV.p(j.f20121u3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = a1VarV.g(j.f20101q3);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = a1VarV.p(j.f20106r3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        int i12 = j.I3;
        if (a1VarV.s(i12)) {
            setTitleTextColor(a1VarV.c(i12));
        }
        int i13 = j.f20146z3;
        if (a1VarV.s(i13)) {
            setSubtitleTextColor(a1VarV.c(i13));
        }
        int i14 = j.f20116t3;
        if (a1VarV.s(i14)) {
            y(a1VarV.n(i14, 0));
        }
        a1VarV.x();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1216h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1216h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1216h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1214f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!A(this.f1213e)) {
                c(this.f1213e, true);
            }
        } else {
            ImageView imageView = this.f1213e;
            if (imageView != null && A(imageView)) {
                removeView(this.f1213e);
                this.E.remove(this.f1213e);
            }
        }
        ImageView imageView2 = this.f1213e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1213e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1212d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            e1.a(this.f1212d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!A(this.f1212d)) {
                c(this.f1212d, true);
            }
        } else {
            ImageButton imageButton = this.f1212d;
            if (imageButton != null && A(imageButton)) {
                removeView(this.f1212d);
                this.E.remove(this.f1212d);
            }
        }
        ImageButton imageButton2 = this.f1212d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1211c;
            if (textView != null && A(textView)) {
                removeView(this.f1211c);
                this.E.remove(this.f1211c);
            }
        } else {
            if (this.f1211c == null) {
                Context context = getContext();
                b0 b0Var = new b0(context);
                this.f1211c = b0Var;
                b0Var.setSingleLine();
                this.f1211c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1221m;
                if (i10 != 0) {
                    this.f1211c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1211c.setTextColor(colorStateList);
                }
            }
            if (!A(this.f1211c)) {
                c(this.f1211c, true);
            }
        }
        TextView textView2 = this.f1211c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1233y = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f1211c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.b;
            if (textView != null && A(textView)) {
                removeView(this.b);
                this.E.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                b0 b0Var = new b0(context);
                this.b = b0Var;
                b0Var.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1220l;
                if (i10 != 0) {
                    this.b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1234z;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!A(this.b)) {
                c(this.b, true);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1232x = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f1234z = colorStateList;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1235c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1236d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1235c = parcel.readInt();
            this.f1236d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1235c);
            parcel.writeInt(this.f1236d ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
