package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: androidx.core.view.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0641w0 {

    /* JADX INFO: renamed from: androidx.core.view.w0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static boolean m3212a(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
            return viewParent.onNestedFling(view, f10, f11, z10);
        }

        /* JADX INFO: renamed from: b */
        public static boolean m3213b(ViewParent viewParent, View view, float f10, float f11) {
            return viewParent.onNestedPreFling(view, f10, f11);
        }

        /* JADX INFO: renamed from: c */
        public static void m3214c(ViewParent viewParent, View view, int i10, int i11, int[] iArr) {
            viewParent.onNestedPreScroll(view, i10, i11, iArr);
        }

        /* JADX INFO: renamed from: d */
        public static void m3215d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13) {
            viewParent.onNestedScroll(view, i10, i11, i12, i13);
        }

        /* JADX INFO: renamed from: e */
        public static void m3216e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.onNestedScrollAccepted(view, view2, i10);
        }

        /* JADX INFO: renamed from: f */
        public static boolean m3217f(ViewParent viewParent, View view, View view2, int i10) {
            return viewParent.onStartNestedScroll(view, view2, i10);
        }

        /* JADX INFO: renamed from: g */
        public static void m3218g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3205a(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
        try {
            return a.m3212a(viewParent, view, f10, f11, z10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3206b(ViewParent viewParent, View view, float f10, float f11) {
        try {
            return a.m3213b(viewParent, view, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3207c(ViewParent viewParent, View view, int i10, int i11, int[] iArr, int i12) {
        if (viewParent instanceof InterfaceC0638v) {
            ((InterfaceC0638v) viewParent).mo1729k(view, i10, i11, iArr, i12);
            return;
        }
        if (i12 == 0) {
            try {
                a.m3214c(viewParent, view, i10, i11, iArr);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e10);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3208d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (viewParent instanceof InterfaceC0640w) {
            ((InterfaceC0640w) viewParent).mo1731m(view, i10, i11, i12, i13, i14, iArr);
            return;
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (viewParent instanceof InterfaceC0638v) {
            ((InterfaceC0638v) viewParent).mo1732n(view, i10, i11, i12, i13, i14);
            return;
        }
        if (i14 == 0) {
            try {
                a.m3215d(viewParent, view, i10, i11, i12, i13);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e10);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3209e(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof InterfaceC0638v) {
            ((InterfaceC0638v) viewParent).mo1727i(view, view2, i10, i11);
            return;
        }
        if (i11 == 0) {
            try {
                a.m3216e(viewParent, view, view2, i10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e10);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m3210f(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof InterfaceC0638v) {
            return ((InterfaceC0638v) viewParent).mo1733o(view, view2, i10, i11);
        }
        if (i11 != 0) {
            return false;
        }
        try {
            return a.m3217f(viewParent, view, view2, i10);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m3211g(ViewParent viewParent, View view, int i10) {
        if (viewParent instanceof InterfaceC0638v) {
            ((InterfaceC0638v) viewParent).mo1728j(view, i10);
            return;
        }
        if (i10 == 0) {
            try {
                a.m3218g(viewParent, view);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e10);
            }
        }
    }
}
