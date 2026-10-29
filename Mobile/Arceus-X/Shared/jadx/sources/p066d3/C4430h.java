package p066d3;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: d3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C4430h {

    /* JADX INFO: renamed from: d3.h$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m22292a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setOverlapAnchor(z10);
        }

        /* JADX INFO: renamed from: b */
        public static void m22293b(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m22289a(PopupWindow popupWindow, boolean z10) {
        a.m22292a(popupWindow, z10);
    }

    /* JADX INFO: renamed from: b */
    public static void m22290b(PopupWindow popupWindow, int i10) {
        a.m22293b(popupWindow, i10);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static void m22291c(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
        popupWindow.showAsDropDown(view, i10, i11, i12);
    }
}
