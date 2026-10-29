package jc;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.k;
import androidx.core.view.o0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends c<View> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f21248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f21249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21251g;

    public b() {
        this.f21248d = new Rect();
        this.f21249e = new Rect();
        this.f21250f = 0;
    }

    public static int R(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // jc.c
    public void J(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
        View viewL = L(coordinatorLayout.r(view));
        if (viewL == null) {
            super.J(coordinatorLayout, view, i10);
            this.f21250f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f21248d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewL.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewL.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && o0.w(coordinatorLayout) && !o0.w(view)) {
            rect.left += lastWindowInsets.getSystemWindowInsetLeft();
            rect.right -= lastWindowInsets.getSystemWindowInsetRight();
        }
        Rect rect2 = this.f21249e;
        k.a(R(fVar.f1729c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        int iM = M(viewL);
        view.layout(rect2.left, rect2.top - iM, rect2.right, rect2.bottom - iM);
        this.f21250f = rect2.top - viewL.getBottom();
    }

    public abstract View L(List<View> list);

    public final int M(View view) {
        if (this.f21251g == 0) {
            return 0;
        }
        float fN = N(view);
        int i10 = this.f21251g;
        return s2.a.c((int) (fN * i10), 0, i10);
    }

    public float N(View view) {
        return 1.0f;
    }

    public final int O() {
        return this.f21251g;
    }

    public int P(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    public final int Q() {
        return this.f21250f;
    }

    public final void S(int i10) {
        this.f21251g = i10;
    }

    public boolean T() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10, int i11, int i12, int i13) {
        View viewL;
        WindowInsetsCompat lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (viewL = L(coordinatorLayout.r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (o0.w(viewL) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.getSystemWindowInsetTop() + lastWindowInsets.getSystemWindowInsetBottom();
        }
        int iP = size + P(viewL);
        int measuredHeight = viewL.getMeasuredHeight();
        if (T()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iP -= measuredHeight;
        }
        coordinatorLayout.J(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iP, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21248d = new Rect();
        this.f21249e = new Rect();
        this.f21250f = 0;
    }
}
