package p066d3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: d3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C4426d {

    /* JADX INFO: renamed from: d3.d$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static ColorStateList m22268a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* JADX INFO: renamed from: b */
        public static PorterDuff.Mode m22269b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* JADX INFO: renamed from: c */
        public static void m22270c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* JADX INFO: renamed from: d */
        public static void m22271d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: d3.d$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Drawable m22272a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m22263a(CompoundButton compoundButton) {
        return b.m22272a(compoundButton);
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m22264b(CompoundButton compoundButton) {
        return a.m22268a(compoundButton);
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m22265c(CompoundButton compoundButton) {
        return a.m22269b(compoundButton);
    }

    /* JADX INFO: renamed from: d */
    public static void m22266d(CompoundButton compoundButton, ColorStateList colorStateList) {
        a.m22270c(compoundButton, colorStateList);
    }

    /* JADX INFO: renamed from: e */
    public static void m22267e(CompoundButton compoundButton, PorterDuff.Mode mode) {
        a.m22271d(compoundButton, mode);
    }
}
