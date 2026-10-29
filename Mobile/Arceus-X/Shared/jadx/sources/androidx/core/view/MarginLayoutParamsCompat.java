package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class MarginLayoutParamsCompat {
    public static int getMarginStart(ViewGroup.MarginLayoutParams lp2) {
        if (Build.VERSION.SDK_INT >= 17) {
            return lp2.getMarginStart();
        }
        return lp2.leftMargin;
    }

    public static int getMarginEnd(ViewGroup.MarginLayoutParams lp2) {
        if (Build.VERSION.SDK_INT >= 17) {
            return lp2.getMarginEnd();
        }
        return lp2.rightMargin;
    }

    public static void setMarginStart(ViewGroup.MarginLayoutParams lp2, int marginStart) {
        if (Build.VERSION.SDK_INT >= 17) {
            lp2.setMarginStart(marginStart);
        } else {
            lp2.leftMargin = marginStart;
        }
    }

    public static void setMarginEnd(ViewGroup.MarginLayoutParams lp2, int marginEnd) {
        if (Build.VERSION.SDK_INT >= 17) {
            lp2.setMarginEnd(marginEnd);
        } else {
            lp2.rightMargin = marginEnd;
        }
    }

    public static boolean isMarginRelative(ViewGroup.MarginLayoutParams lp2) {
        if (Build.VERSION.SDK_INT >= 17) {
            return lp2.isMarginRelative();
        }
        return false;
    }

    public static int getLayoutDirection(ViewGroup.MarginLayoutParams lp2) {
        int result;
        if (Build.VERSION.SDK_INT >= 17) {
            result = lp2.getLayoutDirection();
        } else {
            result = 0;
        }
        if (result != 0 && result != 1) {
            return 0;
        }
        return result;
    }

    public static void setLayoutDirection(ViewGroup.MarginLayoutParams lp2, int layoutDirection) {
        if (Build.VERSION.SDK_INT >= 17) {
            lp2.setLayoutDirection(layoutDirection);
        }
    }

    public static void resolveLayoutDirection(ViewGroup.MarginLayoutParams lp2, int layoutDirection) {
        if (Build.VERSION.SDK_INT >= 17) {
            lp2.resolveLayoutDirection(layoutDirection);
        }
    }

    private MarginLayoutParamsCompat() {
    }
}
