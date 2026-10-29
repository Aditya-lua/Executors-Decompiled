package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.MenuItem;
import p399r2.InterfaceMenuItemC10778b;

/* JADX INFO: renamed from: androidx.core.view.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0628q {

    /* JADX INFO: renamed from: androidx.core.view.q$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static MenuItem m3150a(MenuItem menuItem, char c10, int i10) {
            return menuItem.setAlphabeticShortcut(c10, i10);
        }

        /* JADX INFO: renamed from: b */
        public static MenuItem m3151b(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        /* JADX INFO: renamed from: c */
        public static MenuItem m3152c(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        /* JADX INFO: renamed from: d */
        public static MenuItem m3153d(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        /* JADX INFO: renamed from: e */
        public static MenuItem m3154e(MenuItem menuItem, char c10, int i10) {
            return menuItem.setNumericShortcut(c10, i10);
        }

        /* JADX INFO: renamed from: f */
        public static MenuItem m3155f(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: renamed from: a */
    public static MenuItem m3143a(MenuItem menuItem, AbstractC0585b abstractC0585b) {
        if (menuItem instanceof InterfaceMenuItemC10778b) {
            return ((InterfaceMenuItemC10778b) menuItem).mo1666b(abstractC0585b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* JADX INFO: renamed from: b */
    public static void m3144b(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof InterfaceMenuItemC10778b) {
            ((InterfaceMenuItemC10778b) menuItem).setAlphabeticShortcut(c10, i10);
        } else {
            a.m3150a(menuItem, c10, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3145c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC10778b) {
            ((InterfaceMenuItemC10778b) menuItem).setContentDescription(charSequence);
        } else {
            a.m3151b(menuItem, charSequence);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3146d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC10778b) {
            ((InterfaceMenuItemC10778b) menuItem).setIconTintList(colorStateList);
        } else {
            a.m3152c(menuItem, colorStateList);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3147e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC10778b) {
            ((InterfaceMenuItemC10778b) menuItem).setIconTintMode(mode);
        } else {
            a.m3153d(menuItem, mode);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3148f(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof InterfaceMenuItemC10778b) {
            ((InterfaceMenuItemC10778b) menuItem).setNumericShortcut(c10, i10);
        } else {
            a.m3154e(menuItem, c10, i10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m3149g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC10778b) {
            ((InterfaceMenuItemC10778b) menuItem).setTooltipText(charSequence);
        } else {
            a.m3155f(menuItem, charSequence);
        }
    }
}
