package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.k;
import androidx.core.view.o0;
import androidx.core.view.v;
import androidx.core.view.w;
import androidx.core.view.x;
import androidx.core.view.y;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements v, w {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f1701u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Class<?>[] f1702v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ThreadLocal<Map<String, Constructor<c>>> f1703w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Comparator<View> f1704x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final x2.d<Rect> f1705y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<View> f1706a;
    public final i2.a<View> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<View> f1707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<View> f1708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f1709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f1710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f1711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f1714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f1715k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f1716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g f1717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1718n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public WindowInsetsCompat f1719o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1720p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f1721q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1722r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public y f1723s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f1724t;

    public class a implements y {
        public a() {
        }

        @Override // androidx.core.view.y
        public WindowInsetsCompat K(View view, WindowInsetsCompat windowInsetsCompat) {
            return CoordinatorLayout.this.W(windowInsetsCompat);
        }
    }

    public interface b {
        @NonNull
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull Rect rect, boolean z10) {
            return false;
        }

        public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull Parcelable parcelable) {
        }

        public Parcelable C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean D(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, @NonNull View view2, int i10) {
            return false;
        }

        public boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, @NonNull View view2, int i10, int i11) {
            if (i11 == 0) {
                return D(coordinatorLayout, v5, view, view2, i10);
            }
            return false;
        }

        @Deprecated
        public void F(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view) {
        }

        public void G(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10) {
            if (i10 == 0) {
                F(coordinatorLayout, v5, view);
            }
        }

        public boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean e(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
            return h(coordinatorLayout, v5) > 0.0f;
        }

        public boolean f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull Rect rect) {
            return false;
        }

        public int g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
            return -16777216;
        }

        public float h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5) {
            return 0.0f;
        }

        public boolean i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view) {
            return false;
        }

        @NonNull
        public WindowInsetsCompat j(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public void k(@NonNull f fVar) {
        }

        public boolean l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view) {
            return false;
        }

        public void m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view) {
        }

        public void n() {
        }

        public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10) {
            return false;
        }

        public boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean r(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, float f10, float f11) {
            return false;
        }

        @Deprecated
        public void t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, @NonNull int[] iArr) {
        }

        public void u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
            if (i12 == 0) {
                t(coordinatorLayout, v5, view, i10, i11, iArr);
            }
        }

        @Deprecated
        public void v(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, int i12, int i13) {
        }

        @Deprecated
        public void w(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                v(coordinatorLayout, v5, view, i10, i11, i12, i13);
            }
        }

        public void x(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            w(coordinatorLayout, v5, view, i10, i11, i12, i13, i14);
        }

        @Deprecated
        public void y(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, @NonNull View view2, int i10) {
        }

        public void z(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull View view, @NonNull View view2, int i10, int i11) {
            if (i11 == 0) {
                y(coordinatorLayout, v5, view, view2, i10);
            }
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1722r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1722r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    public static class h implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fL = o0.L(view);
            float fL2 = o0.L(view2);
            if (fL > fL2) {
                return -1;
            }
            return fL < fL2 ? 1 : 0;
        }
    }

    static {
        Package r8 = CoordinatorLayout.class.getPackage();
        f1701u = r8 != null ? r8.getName() : null;
        f1704x = new h();
        f1702v = new Class[]{Context.class, AttributeSet.class};
        f1703w = new ThreadLocal<>();
        f1705y = new x2.f(12);
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h2.a.f18512a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f1701u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = f1703w;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f1702v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    public static void O(@NonNull Rect rect) {
        rect.setEmpty();
        f1705y.a(rect);
    }

    public static int R(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int S(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    public static int T(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    @NonNull
    public static Rect a() {
        Rect rectB = f1705y.b();
        return rectB == null ? new Rect() : rectB;
    }

    private static int c(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    public final boolean A(View view) {
        return this.b.j(view);
    }

    public boolean B(@NonNull View view, int i10, int i11) {
        Rect rectA = a();
        t(view, rectA);
        try {
            return rectA.contains(i10, i11);
        } finally {
            O(rectA);
        }
    }

    public final void C(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f1719o != null && o0.w(this) && !o0.w(view)) {
            rectA.left += this.f1719o.getSystemWindowInsetLeft();
            rectA.top += this.f1719o.getSystemWindowInsetTop();
            rectA.right -= this.f1719o.getSystemWindowInsetRight();
            rectA.bottom -= this.f1719o.getSystemWindowInsetBottom();
        }
        Rect rectA2 = a();
        k.a(S(fVar.f1729c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i10);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        O(rectA);
        O(rectA2);
    }

    public final void D(View view, View view2, int i10) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            t(view2, rectA);
            u(view, i10, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            O(rectA);
            O(rectA2);
        }
    }

    public final void E(View view, int i10, int i11) {
        int i12;
        f fVar = (f) view.getLayoutParams();
        int iB = k.b(T(fVar.f1729c), i11);
        int i13 = iB & 7;
        int i14 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int iW = w(i10) - measuredWidth;
        if (i13 == 1) {
            iW += measuredWidth / 2;
        } else if (i13 == 5) {
            iW += measuredWidth;
        }
        if (i14 != 16) {
            i12 = i14 != 80 ? 0 : measuredHeight;
        } else {
            i12 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iW, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i12, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    public final void F(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (o0.R(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarF == null || !cVarF.f(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            O(rectA2);
            if (rectA.isEmpty()) {
                O(rectA);
                return;
            }
            int iB = k.b(fVar.f1734h, i10);
            boolean z12 = true;
            if ((iB & 48) != 48 || (i15 = (rectA.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f1736j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                V(view, i16 - i15);
                z10 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f1736j) < (i14 = rect.bottom)) {
                V(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                V(view, 0);
            }
            if ((iB & 3) != 3 || (i12 = (rectA.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f1735i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                U(view, i13 - i12);
                z11 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f1735i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                U(view, width - i11);
            }
            if (!z12) {
                U(view, 0);
            }
            O(rectA);
        }
    }

    public void G(View view, int i10) {
        c cVarF;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f1737k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            t(fVar.f1737k, rectA);
            q(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            v(view, i10, rectA, rectA3, fVar, measuredWidth, measuredHeight);
            boolean z10 = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            d(fVar, rectA3, measuredWidth, measuredHeight);
            int i11 = rectA3.left - rectA2.left;
            int i12 = rectA3.top - rectA2.top;
            if (i11 != 0) {
                o0.W(view, i11);
            }
            if (i12 != 0) {
                o0.X(view, i12);
            }
            if (z10 && (cVarF = fVar.f()) != null) {
                cVarF.l(this, view, fVar.f1737k);
            }
            O(rectA);
            O(rectA2);
            O(rectA3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    public final void H(int i10) {
        int i11;
        c cVarF;
        boolean zL;
        int iZ = o0.z(this);
        int size = this.f1706a.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        for (int i12 = 0; i12 < size; i12++) {
            View view = this.f1706a.get(i12);
            f fVar = (f) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (fVar.f1738l == this.f1706a.get(i13)) {
                        G(view, iZ);
                    }
                }
                q(view, true, rectA2);
                if (fVar.f1733g != 0 && !rectA2.isEmpty()) {
                    int iB = k.b(fVar.f1733g, iZ);
                    int i14 = iB & 112;
                    if (i14 == 48) {
                        rectA.top = Math.max(rectA.top, rectA2.bottom);
                    } else if (i14 == 80) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rectA2.top);
                    }
                    int i15 = iB & 7;
                    if (i15 == 3) {
                        rectA.left = Math.max(rectA.left, rectA2.right);
                    } else if (i15 == 5) {
                        rectA.right = Math.max(rectA.right, getWidth() - rectA2.left);
                    }
                }
                if (fVar.f1734h != 0 && view.getVisibility() == 0) {
                    F(view, rectA, iZ);
                }
                if (i10 != 2) {
                    x(view, rectA3);
                    if (!rectA3.equals(rectA2)) {
                        N(view, rectA2);
                        for (i11 = i12 + 1; i11 < size; i11++) {
                            View view2 = this.f1706a.get(i11);
                            f fVar2 = (f) view2.getLayoutParams();
                            cVarF = fVar2.f();
                            if (cVarF == null && cVarF.i(this, view2, view)) {
                                if (i10 == 0 && fVar2.g()) {
                                    fVar2.k();
                                } else {
                                    if (i10 != 2) {
                                        zL = cVarF.l(this, view2, view);
                                    } else {
                                        cVarF.m(this, view2, view);
                                        zL = true;
                                    }
                                    if (i10 == 1) {
                                        fVar2.p(zL);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i11 < size) {
                        View view3 = this.f1706a.get(i11);
                        f fVar3 = (f) view3.getLayoutParams();
                        cVarF = fVar3.f();
                        if (cVarF == null) {
                        }
                    }
                }
            }
        }
        O(rectA);
        O(rectA2);
        O(rectA3);
    }

    public void I(@NonNull View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f1737k;
        if (view2 != null) {
            D(view, view2, i10);
            return;
        }
        int i11 = fVar.f1731e;
        if (i11 >= 0) {
            E(view, i11, i10);
        } else {
            C(view, i10);
        }
    }

    public void J(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    public final boolean L(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1707c;
        z(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zO = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            if (!(zO || z10) || actionMasked == 0) {
                if (!zO && cVarF != null) {
                    if (i10 == 0) {
                        zO = cVarF.o(this, view, motionEvent);
                    } else if (i10 == 1) {
                        zO = cVarF.H(this, view, motionEvent);
                    }
                    if (zO) {
                        this.f1715k = view;
                    }
                }
                boolean zC = fVar.c();
                boolean zI = fVar.i(this, view);
                z10 = zI && !zC;
                if (zI && !z10) {
                    break;
                }
            } else if (cVarF != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    cVarF.o(this, view, motionEventObtain);
                } else if (i10 == 1) {
                    cVarF.H(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zO;
    }

    public final void M() {
        this.f1706a.clear();
        this.b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVarY = y(childAt);
            fVarY.d(this, childAt);
            this.b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (fVarY.b(this, childAt, childAt2)) {
                        if (!this.b.d(childAt2)) {
                            this.b.b(childAt2);
                        }
                        this.b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1706a.addAll(this.b.i());
        Collections.reverse(this.f1706a);
    }

    public void N(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    public void P() {
        if (this.f1713i && this.f1717m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1717m);
        }
        this.f1718n = false;
    }

    public final void Q(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (cVarF != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    cVarF.o(this, childAt, motionEventObtain);
                } else {
                    cVarF.H(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).m();
        }
        this.f1715k = null;
        this.f1712h = false;
    }

    public final void U(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f1735i;
        if (i11 != i10) {
            o0.W(view, i10 - i11);
            fVar.f1735i = i10;
        }
    }

    public final void V(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f1736j;
        if (i11 != i10) {
            o0.X(view, i10 - i11);
            fVar.f1736j = i10;
        }
    }

    public final WindowInsetsCompat W(WindowInsetsCompat windowInsetsCompat) {
        if (x2.b.a(this.f1719o, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.f1719o = windowInsetsCompat;
        boolean z10 = false;
        boolean z11 = windowInsetsCompat != null && windowInsetsCompat.getSystemWindowInsetTop() > 0;
        this.f1720p = z11;
        if (!z11 && getBackground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        WindowInsetsCompat windowInsetsCompatE = e(windowInsetsCompat);
        requestLayout();
        return windowInsetsCompatE;
    }

    public final void X() {
        if (!o0.w(this)) {
            o0.A0(this, null);
            return;
        }
        if (this.f1723s == null) {
            this.f1723s = new a();
        }
        o0.A0(this, this.f1723s);
        setSystemUiVisibility(1280);
    }

    public void b() {
        if (this.f1713i) {
            if (this.f1717m == null) {
                this.f1717m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1717m);
        }
        this.f1718n = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final void d(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f1728a;
        if (cVar != null) {
            float fH = cVar.h(this, view);
            if (fH > 0.0f) {
                if (this.f1709e == null) {
                    this.f1709e = new Paint();
                }
                this.f1709e.setColor(fVar.f1728a.g(this, view));
                this.f1709e.setAlpha(c(Math.round(fH * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f1709e);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1721q;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final WindowInsetsCompat e(WindowInsetsCompat windowInsetsCompat) {
        c cVarF;
        if (windowInsetsCompat.isConsumed()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (o0.w(childAt) && (cVarF = ((f) childAt.getLayoutParams()).f()) != null) {
                windowInsetsCompat = cVarF.j(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.isConsumed()) {
                    return windowInsetsCompat;
                }
            }
        }
        return windowInsetsCompat;
    }

    public void f(@NonNull View view) {
        List listG = this.b.g(view);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < listG.size(); i10++) {
            View view2 = (View) listG.get(i10);
            c cVarF = ((f) view2.getLayoutParams()).f();
            if (cVarF != null) {
                cVarF.l(this, view2, view);
            }
        }
    }

    public void g() {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (A(getChildAt(i10))) {
                z10 = true;
                break;
            }
        }
        if (z10 != this.f1718n) {
            if (z10) {
                b();
            } else {
                P();
            }
        }
    }

    public final List<View> getDependencySortedChildren() {
        M();
        return Collections.unmodifiableList(this.f1706a);
    }

    public final WindowInsetsCompat getLastWindowInsets() {
        return this.f1719o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1724t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f1721q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // androidx.core.view.v
    public void i(View view, View view2, int i10, int i11) {
        c cVarF;
        View view3;
        View view4;
        int i12;
        int i13;
        this.f1724t.c(view, view2, i10, i11);
        this.f1716l = view2;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i11) && (cVarF = fVar.f()) != null) {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
                cVarF.z(this, childAt, view3, view4, i12, i13);
            } else {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
            }
            i14++;
            view = view3;
            view2 = view4;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // androidx.core.view.v
    public void j(View view, int i10) {
        this.f1724t.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i10)) {
                c cVarF = fVar.f();
                if (cVarF != null) {
                    cVarF.G(this, childAt, view, i10);
                }
                fVar.l(i10);
                fVar.k();
            }
        }
        this.f1716l = null;
    }

    @Override // androidx.core.view.v
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        c cVarF;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i12) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.f1710f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.u(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f1710f;
                    iMax = i10 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f1710f;
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            H(1);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.w
    public void m(@NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        c cVarF;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i14) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.f1710f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.x(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f1710f;
                    iMax = i12 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f1710f;
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z10) {
            H(1);
        }
    }

    @Override // androidx.core.view.v
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f1711g);
    }

    @Override // androidx.core.view.v
    public boolean o(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarF = fVar.f();
                if (cVarF != null) {
                    boolean zE = cVarF.E(this, childAt, view, view2, i10, i11);
                    z10 |= zE;
                    fVar.r(i11, zE);
                } else {
                    fVar.r(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.f1718n) {
            if (this.f1717m == null) {
                this.f1717m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1717m);
        }
        if (this.f1719o == null && o0.w(this)) {
            o0.j0(this);
        }
        this.f1713i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.f1718n && this.f1717m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1717m);
        }
        View view = this.f1716l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1713i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1720p || this.f1721q == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.f1719o;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f1721q.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f1721q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Q(true);
        }
        boolean zL = L(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zL;
        }
        Q(true);
        return zL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVarF;
        int iZ = o0.z(this);
        int size = this.f1706a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f1706a.get(i14);
            if (view.getVisibility() != 8 && ((cVarF = ((f) view.getLayoutParams()).f()) == null || !cVarF.p(this, view, iZ))) {
                I(view, iZ);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        c cVarF;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        View view;
        int i22;
        int i23;
        boolean zQ;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.M();
        coordinatorLayout.g();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int iZ = o0.z(coordinatorLayout);
        boolean z10 = iZ == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i24 = paddingLeft + paddingRight;
        int i25 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z11 = coordinatorLayout.f1719o != null && o0.w(coordinatorLayout);
        int size3 = coordinatorLayout.f1706a.size();
        int i26 = 0;
        int iCombineMeasuredStates = 0;
        while (i26 < size3) {
            View view2 = coordinatorLayout.f1706a.get(i26);
            int i27 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i17 = size3;
                i13 = i26;
                i18 = paddingLeft;
                i15 = iZ;
                suggestedMinimumWidth = i27;
                i22 = paddingRight;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i28 = fVar.f1731e;
                if (i28 < 0 || mode == 0) {
                    i12 = suggestedMinimumHeight;
                } else {
                    int iW = coordinatorLayout.w(i28);
                    int iB = k.b(T(fVar.f1729c), iZ) & 7;
                    i12 = suggestedMinimumHeight;
                    if ((iB != 3 || z10) && !(iB == 5 && z10)) {
                        if ((iB == 5 && !z10) || (iB == 3 && z10)) {
                            iMax = Math.max(0, iW - paddingLeft);
                        }
                        if (z11 || o0.w(view2)) {
                            iMakeMeasureSpec = i10;
                            iMakeMeasureSpec2 = i11;
                        } else {
                            int systemWindowInsetLeft = coordinatorLayout.f1719o.getSystemWindowInsetLeft() + coordinatorLayout.f1719o.getSystemWindowInsetRight();
                            int systemWindowInsetTop = coordinatorLayout.f1719o.getSystemWindowInsetTop() + coordinatorLayout.f1719o.getSystemWindowInsetBottom();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - systemWindowInsetLeft, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - systemWindowInsetTop, mode2);
                        }
                        cVarF = fVar.f();
                        if (cVarF != null) {
                            i17 = size3;
                            int i29 = iMakeMeasureSpec;
                            view = view2;
                            int i30 = i12;
                            i15 = iZ;
                            i16 = i30;
                            i18 = paddingLeft;
                            i19 = i27;
                            i22 = paddingRight;
                            i23 = iCombineMeasuredStates;
                            int i31 = iMakeMeasureSpec2;
                            zQ = cVarF.q(this, view, i29, i14, i31, 0);
                            i21 = i29;
                            i20 = i31;
                            if (zQ) {
                                coordinatorLayout = this;
                            }
                            suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int iMax2 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                            suggestedMinimumHeight = iMax2;
                        } else {
                            int i32 = i12;
                            i15 = iZ;
                            i16 = i32;
                            i17 = size3;
                            i18 = paddingLeft;
                            i19 = i27;
                            i20 = iMakeMeasureSpec2;
                            i21 = iMakeMeasureSpec;
                            view = view2;
                            i22 = paddingRight;
                            i23 = iCombineMeasuredStates;
                        }
                        View view3 = view;
                        coordinatorLayout = this;
                        coordinatorLayout.J(view3, i21, i14, i20, 0);
                        view = view3;
                        suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax3 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                        suggestedMinimumHeight = iMax3;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iW);
                    }
                    int i33 = i26;
                    i14 = iMax;
                    i13 = i33;
                    if (z11) {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    }
                    cVarF = fVar.f();
                    if (cVarF != null) {
                        i17 = size3;
                        int i210 = iMakeMeasureSpec;
                        view = view2;
                        int i34 = i12;
                        i15 = iZ;
                        i16 = i34;
                        i18 = paddingLeft;
                        i19 = i27;
                        i22 = paddingRight;
                        i23 = iCombineMeasuredStates;
                        int i35 = iMakeMeasureSpec2;
                        zQ = cVarF.q(this, view, i210, i14, i35, 0);
                        i21 = i210;
                        i20 = i35;
                        if (zQ) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax4 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                        suggestedMinimumHeight = iMax4;
                    } else {
                        int i36 = i12;
                        i15 = iZ;
                        i16 = i36;
                        i17 = size3;
                        i18 = paddingLeft;
                        i19 = i27;
                        i20 = iMakeMeasureSpec2;
                        i21 = iMakeMeasureSpec;
                        view = view2;
                        i22 = paddingRight;
                        i23 = iCombineMeasuredStates;
                    }
                    View view4 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.J(view4, i21, i14, i20, 0);
                    view = view4;
                    suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax5 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                    suggestedMinimumHeight = iMax5;
                }
                i13 = i26;
                i14 = 0;
                if (z11) {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                } else {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                }
                cVarF = fVar.f();
                if (cVarF != null) {
                    i17 = size3;
                    int i211 = iMakeMeasureSpec;
                    view = view2;
                    int i37 = i12;
                    i15 = iZ;
                    i16 = i37;
                    i18 = paddingLeft;
                    i19 = i27;
                    i22 = paddingRight;
                    i23 = iCombineMeasuredStates;
                    int i38 = iMakeMeasureSpec2;
                    zQ = cVarF.q(this, view, i211, i14, i38, 0);
                    i21 = i211;
                    i20 = i38;
                    if (zQ) {
                        coordinatorLayout = this;
                    }
                    suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax6 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                    suggestedMinimumHeight = iMax6;
                } else {
                    int i39 = i12;
                    i15 = iZ;
                    i16 = i39;
                    i17 = size3;
                    i18 = paddingLeft;
                    i19 = i27;
                    i20 = iMakeMeasureSpec2;
                    i21 = iMakeMeasureSpec;
                    view = view2;
                    i22 = paddingRight;
                    i23 = iCombineMeasuredStates;
                }
                View view5 = view;
                coordinatorLayout = this;
                coordinatorLayout.J(view5, i21, i14, i20, 0);
                view = view5;
                suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int iMax7 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                suggestedMinimumHeight = iMax7;
            }
            i26 = i13 + 1;
            paddingLeft = i18;
            paddingRight = i22;
            iZ = i15;
            size3 = i17;
        }
        int i40 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i10, (-16777216) & i40), View.resolveSizeAndState(suggestedMinimumHeight, i11, i40 << 16));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c cVarF;
        View view2;
        float f12;
        float f13;
        boolean z11;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zR = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f12 = f10;
                f13 = f11;
                z11 = z10;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z11 = z10;
                    zR |= cVarF.r(this, childAt, view2, f12, f13, z11);
                } else {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z11 = z10;
                }
            }
            i10++;
            view = view2;
            f10 = f12;
            f11 = f13;
            z10 = z11;
        }
        if (zR) {
            H(1);
        }
        return zR;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        c cVarF;
        View view2;
        float f12;
        float f13;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zS = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f12 = f10;
                f13 = f11;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    zS |= cVarF.s(this, childAt, view2, f12, f13);
                } else {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                }
            }
            i10++;
            view = view2;
            f10 = f12;
            f11 = f13;
        }
        return zS;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray<Parcelable> sparseArray = savedState.f1725c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVarF = y(childAt).f();
            if (id2 != -1 && cVarF != null && (parcelable2 = sparseArray.get(id2)) != null) {
                cVarF.B(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableC;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (id2 != -1 && cVarF != null && (parcelableC = cVarF.C(this, childAt)) != null) {
                sparseArray.append(id2, parcelableC);
            }
        }
        savedState.f1725c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zL;
        boolean zH;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1715k == null) {
            zL = L(motionEvent, 1);
            if (!zL) {
                zH = false;
            }
            motionEventObtain = null;
            if (this.f1715k == null) {
                zH |= super.onTouchEvent(motionEvent);
            } else if (zL) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zH;
            }
            Q(false);
            return zH;
        }
        zL = false;
        c cVarF = ((f) this.f1715k.getLayoutParams()).f();
        if (cVarF != null) {
            zH = cVarF.H(this, this.f1715k, motionEvent);
        } else {
            zH = false;
        }
        motionEventObtain = null;
        if (this.f1715k == null) {
            zH |= super.onTouchEvent(motionEvent);
        } else if (zL) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        Q(false);
        return zH;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public void q(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @NonNull
    public List<View> r(@NonNull View view) {
        List<View> listH = this.b.h(view);
        this.f1708d.clear();
        if (listH != null) {
            this.f1708d.addAll(listH);
        }
        return this.f1708d;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVarF = ((f) view.getLayoutParams()).f();
        if (cVarF == null || !cVarF.A(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f1712h) {
            return;
        }
        Q(false);
        this.f1712h = true;
    }

    @NonNull
    public List<View> s(@NonNull View view) {
        List listG = this.b.g(view);
        this.f1708d.clear();
        if (listG != null) {
            this.f1708d.addAll(listG);
        }
        return this.f1708d;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1722r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1721q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f1721q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f1721q.setState(getDrawableState());
                }
                q2.a.m(this.f1721q, o0.z(this));
                this.f1721q.setVisible(getVisibility() == 0, false);
                this.f1721q.setCallback(this);
            }
            o0.d0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? l2.b.f(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f1721q;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f1721q.setVisible(z10, false);
    }

    public void t(View view, Rect rect) {
        i2.b.a(this, view, rect);
    }

    public void u(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        v(view, i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    public final void v(View view, int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int iWidth;
        int iHeight;
        int iB = k.b(R(fVar.f1729c), i10);
        int iB2 = k.b(S(fVar.f1730d), i10);
        int i13 = iB & 7;
        int i14 = iB & 112;
        int i15 = iB2 & 7;
        int i16 = iB2 & 112;
        if (i15 != 1) {
            iWidth = i15 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i16 != 16) {
            iHeight = i16 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i13 == 1) {
            iWidth -= i11 / 2;
        } else if (i13 != 5) {
            iWidth -= i11;
        }
        if (i14 == 16) {
            iHeight -= i12 / 2;
        } else if (i14 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1721q;
    }

    public final int w(int i10) {
        int[] iArr = this.f1714j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    public void x(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f y(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.o(dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            fVar.b = true;
        }
        return fVar;
    }

    public final void z(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = f1704x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet, int i10) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i10);
        this.f1706a = new ArrayList();
        this.b = new i2.a<>();
        this.f1707c = new ArrayList();
        this.f1708d = new ArrayList();
        this.f1710f = new int[2];
        this.f1711g = new int[2];
        this.f1724t = new x(this);
        TypedArray typedArrayObtainStyledAttributes = i10 == 0 ? context.obtainStyledAttributes(attributeSet, h2.c.b, 0, h2.b.f18513a) : context.obtainStyledAttributes(attributeSet, h2.c.b, i10, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i10 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, h2.c.b, attributeSet, typedArrayObtainStyledAttributes, 0, h2.b.f18513a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, h2.c.b, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(h2.c.f18515c, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f1714j = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f1714j.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = coordinatorLayout.f1714j;
                iArr[i11] = (int) (iArr[i11] * f10);
            }
        }
        coordinatorLayout.f1721q = typedArrayObtainStyledAttributes.getDrawable(h2.c.f18516d);
        typedArrayObtainStyledAttributes.recycle();
        X();
        super.setOnHierarchyChangeListener(new e());
        if (o0.x(this) == 0) {
            o0.w0(this, 1);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SparseArray<Parcelable> f1725c;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f1725c = new SparseArray<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f1725c.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f1725c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f1725c.keyAt(i11);
                parcelableArr[i11] = this.f1725c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f1728a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1732f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1733g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1734h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1735i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1736j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public View f1737k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public View f1738l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f1739m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f1740n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f1741o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f1742p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Rect f1743q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f1744r;

        public f(int i10, int i11) {
            super(i10, i11);
            this.b = false;
            this.f1729c = 0;
            this.f1730d = 0;
            this.f1731e = -1;
            this.f1732f = -1;
            this.f1733g = 0;
            this.f1734h = 0;
            this.f1743q = new Rect();
        }

        public boolean a() {
            return this.f1737k == null && this.f1732f != -1;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f1738l || s(view2, o0.z(coordinatorLayout))) {
                return true;
            }
            c cVar = this.f1728a;
            return cVar != null && cVar.i(coordinatorLayout, view, view2);
        }

        public boolean c() {
            if (this.f1728a == null) {
                this.f1739m = false;
            }
            return this.f1739m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f1732f == -1) {
                this.f1738l = null;
                this.f1737k = null;
                return null;
            }
            if (this.f1737k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f1737k;
        }

        public int e() {
            return this.f1732f;
        }

        public c f() {
            return this.f1728a;
        }

        public boolean g() {
            return this.f1742p;
        }

        public Rect h() {
            return this.f1743q;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f1739m;
            if (z10) {
                return true;
            }
            c cVar = this.f1728a;
            boolean zE = (cVar != null ? cVar.e(coordinatorLayout, view) : false) | z10;
            this.f1739m = zE;
            return zE;
        }

        public boolean j(int i10) {
            if (i10 == 0) {
                return this.f1740n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f1741o;
        }

        public void k() {
            this.f1742p = false;
        }

        public void l(int i10) {
            r(i10, false);
        }

        public void m() {
            this.f1739m = false;
        }

        public final void n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f1732f);
            this.f1737k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f1738l = null;
                    this.f1737k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f1732f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f1738l = null;
                this.f1737k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f1738l = null;
                    this.f1737k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f1738l = viewFindViewById;
        }

        public void o(c cVar) {
            c cVar2 = this.f1728a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.n();
                }
                this.f1728a = cVar;
                this.f1744r = null;
                this.b = true;
                if (cVar != null) {
                    cVar.k(this);
                }
            }
        }

        public void p(boolean z10) {
            this.f1742p = z10;
        }

        public void q(Rect rect) {
            this.f1743q.set(rect);
        }

        public void r(int i10, boolean z10) {
            if (i10 == 0) {
                this.f1740n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f1741o = z10;
            }
        }

        public final boolean s(View view, int i10) {
            int iB = k.b(((f) view.getLayoutParams()).f1733g, i10);
            return iB != 0 && (k.b(this.f1734h, i10) & iB) == iB;
        }

        public final boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f1737k.getId() != this.f1732f) {
                return false;
            }
            View view2 = this.f1737k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f1738l = null;
                    this.f1737k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f1738l = view2;
            return true;
        }

        public f(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = false;
            this.f1729c = 0;
            this.f1730d = 0;
            this.f1731e = -1;
            this.f1732f = -1;
            this.f1733g = 0;
            this.f1734h = 0;
            this.f1743q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h2.c.f18517e);
            this.f1729c = typedArrayObtainStyledAttributes.getInteger(h2.c.f18518f, 0);
            this.f1732f = typedArrayObtainStyledAttributes.getResourceId(h2.c.f18519g, -1);
            this.f1730d = typedArrayObtainStyledAttributes.getInteger(h2.c.f18520h, 0);
            this.f1731e = typedArrayObtainStyledAttributes.getInteger(h2.c.f18524l, -1);
            this.f1733g = typedArrayObtainStyledAttributes.getInt(h2.c.f18523k, 0);
            this.f1734h = typedArrayObtainStyledAttributes.getInt(h2.c.f18522j, 0);
            int i10 = h2.c.f18521i;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i10);
            this.b = zHasValue;
            if (zHasValue) {
                this.f1728a = CoordinatorLayout.K(context, attributeSet, typedArrayObtainStyledAttributes.getString(i10));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f1728a;
            if (cVar != null) {
                cVar.k(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.b = false;
            this.f1729c = 0;
            this.f1730d = 0;
            this.f1731e = -1;
            this.f1732f = -1;
            this.f1733g = 0;
            this.f1734h = 0;
            this.f1743q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = false;
            this.f1729c = 0;
            this.f1730d = 0;
            this.f1731e = -1;
            this.f1732f = -1;
            this.f1733g = 0;
            this.f1734h = 0;
            this.f1743q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = false;
            this.f1729c = 0;
            this.f1730d = 0;
            this.f1731e = -1;
            this.f1732f = -1;
            this.f1733g = 0;
            this.f1734h = 0;
            this.f1743q = new Rect();
        }
    }
}
