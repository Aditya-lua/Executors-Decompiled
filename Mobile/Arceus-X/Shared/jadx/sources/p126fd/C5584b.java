package p126fd;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: fd.b */
/* JADX INFO: loaded from: classes2.dex */
public class C5584b {

    /* JADX INFO: renamed from: a */
    public static final boolean f21377a = true;

    /* JADX INFO: renamed from: b */
    public static final int[] f21378b = {R.attr.state_pressed};

    /* JADX INFO: renamed from: c */
    public static final int[] f21379c = {R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f21380d = {R.attr.state_focused};

    /* JADX INFO: renamed from: e */
    public static final int[] f21381e = {R.attr.state_hovered};

    /* JADX INFO: renamed from: f */
    public static final int[] f21382f = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: g */
    public static final int[] f21383g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: h */
    public static final int[] f21384h = {R.attr.state_selected, R.attr.state_focused};

    /* JADX INFO: renamed from: i */
    public static final int[] f21385i = {R.attr.state_selected, R.attr.state_hovered};

    /* JADX INFO: renamed from: j */
    public static final int[] f21386j = {R.attr.state_selected};

    /* JADX INFO: renamed from: k */
    public static final int[] f21387k = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: l */
    public static final String f21388l = C5584b.class.getSimpleName();

    @NonNull
    /* JADX INFO: renamed from: a */
    public static ColorStateList m25241a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f21387k, 0)) != 0) {
            Log.w(f21388l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m25242b(@NonNull int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
