package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import p206j2.C7023e;

/* JADX INFO: renamed from: androidx.core.view.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0635t0 {

    /* JADX INFO: renamed from: a */
    public static final WindowInsets f2480a = WindowInsetsCompat.CONSUMED.toWindowInsets();

    /* JADX INFO: renamed from: b */
    public static boolean f2481b = false;

    /* JADX INFO: renamed from: androidx.core.view.t0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static boolean m3179a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ WindowInsets m3176a(WindowInsets[] windowInsetsArr, View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
        windowInsetsArr[0] = onApplyWindowInsetsListener != null ? onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets) : view.onApplyWindowInsets(windowInsets);
        return f2480a;
    }

    /* JADX INFO: renamed from: b */
    public static WindowInsets m3177b(View view, WindowInsets windowInsets) {
        Object tag = view.getTag(C7023e.f27494M);
        Object tag2 = view.getTag(C7023e.f27502U);
        final View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = tag instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag : tag2 instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag2 : null;
        final WindowInsets[] windowInsetsArr = {f2480a};
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.s0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets2) {
                return C0635t0.m3176a(windowInsetsArr, onApplyWindowInsetsListener, view2, windowInsets2);
            }
        });
        view.dispatchApplyWindowInsets(windowInsets);
        Object tag3 = view.getTag(C7023e.f27493L);
        if (tag3 instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag3;
        }
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        WindowInsets windowInsets2 = windowInsetsArr[0];
        if (windowInsets2 != null && !windowInsets2.isConsumed() && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                m3177b(viewGroup.getChildAt(i10), windowInsetsArr[0]);
            }
        }
        WindowInsets windowInsets3 = windowInsetsArr[0];
        return windowInsets3 != null ? windowInsets3 : f2480a;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3178c(ViewGroup viewGroup) {
        return a.m3179a(viewGroup);
    }
}
