package p066d3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* JADX INFO: renamed from: d3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4425c {

    /* JADX INFO: renamed from: d3.c$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m22261a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* JADX INFO: renamed from: b */
        public static void m22262b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static Drawable m22258a(CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    /* JADX INFO: renamed from: b */
    public static void m22259b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        a.m22261a(checkedTextView, colorStateList);
    }

    /* JADX INFO: renamed from: c */
    public static void m22260c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        a.m22262b(checkedTextView, mode);
    }
}
