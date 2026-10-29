package p245kc;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0614k;
import androidx.core.view.C0625o0;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;
import p426s2.C11162a;

/* JADX INFO: renamed from: kc.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7539b extends C7540c<View> {

    /* JADX INFO: renamed from: d */
    public final Rect f28899d;

    /* JADX INFO: renamed from: e */
    public final Rect f28900e;

    /* JADX INFO: renamed from: f */
    public int f28901f;

    /* JADX INFO: renamed from: g */
    public int f28902g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC7539b() {
        this.f28899d = new Rect();
        this.f28900e = new Rect();
        this.f28901f = 0;
    }

    /* JADX INFO: renamed from: R */
    public static int m31184R(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // p245kc.C7540c
    /* JADX INFO: renamed from: J */
    public void mo31185J(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
        View viewMo11971L = mo11971L(coordinatorLayout.m2585r(view));
        if (viewMo11971L == null) {
            super.mo31185J(coordinatorLayout, view, i10);
            this.f28901f = 0;
            return;
        }
        CoordinatorLayout.C0527f c0527f = (CoordinatorLayout.C0527f) view.getLayoutParams();
        Rect rect = this.f28899d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0527f).leftMargin, viewMo11971L.getBottom() + ((ViewGroup.MarginLayoutParams) c0527f).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0527f).rightMargin, ((coordinatorLayout.getHeight() + viewMo11971L.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0527f).bottomMargin);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && C0625o0.m3059w(coordinatorLayout) && !C0625o0.m3059w(view)) {
            rect.left += lastWindowInsets.getSystemWindowInsetLeft();
            rect.right -= lastWindowInsets.getSystemWindowInsetRight();
        }
        Rect rect2 = this.f28900e;
        C0614k.m2929a(m31184R(c0527f.f2248c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        int iM31186M = m31186M(viewMo11971L);
        view.layout(rect2.left, rect2.top - iM31186M, rect2.right, rect2.bottom - iM31186M);
        this.f28901f = rect2.top - viewMo11971L.getBottom();
    }

    /* JADX INFO: renamed from: L */
    public abstract View mo11971L(List<View> list);

    /* JADX INFO: renamed from: M */
    public final int m31186M(View view) {
        if (this.f28902g == 0) {
            return 0;
        }
        float fMo11972N = mo11972N(view);
        int i10 = this.f28902g;
        return C11162a.m42060c((int) (fMo11972N * i10), 0, i10);
    }

    /* JADX INFO: renamed from: N */
    public float mo11972N(View view) {
        return 1.0f;
    }

    /* JADX INFO: renamed from: O */
    public final int m31187O() {
        return this.f28902g;
    }

    /* JADX INFO: renamed from: P */
    public int mo11973P(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: Q */
    public final int m31188Q() {
        return this.f28901f;
    }

    /* JADX INFO: renamed from: S */
    public final void m31189S(int i10) {
        this.f28902g = i10;
    }

    /* JADX INFO: renamed from: T */
    public boolean mo12890T() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: q */
    public boolean mo2617q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10, int i11, int i12, int i13) {
        View viewMo11971L;
        WindowInsetsCompat lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (viewMo11971L = mo11971L(coordinatorLayout.m2585r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C0625o0.m3059w(viewMo11971L) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.getSystemWindowInsetTop() + lastWindowInsets.getSystemWindowInsetBottom();
        }
        int iMo11973P = size + mo11973P(viewMo11971L);
        int measuredHeight = viewMo11971L.getMeasuredHeight();
        if (mo12890T()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iMo11973P -= measuredHeight;
        }
        coordinatorLayout.m2566J(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iMo11973P, i14 == -1 ? 1073741824 : EditorInfoCompat.IME_FLAG_FORCE_ASCII), i13);
        return true;
    }

    public AbstractC7539b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28899d = new Rect();
        this.f28900e = new Rect();
        this.f28901f = 0;
    }
}
