package p246kd;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import p368q2.C10425a;

/* JADX INFO: renamed from: kd.s */
/* JADX INFO: loaded from: classes2.dex */
public class C7561s {
    /* JADX INFO: renamed from: a */
    public static void m31252a(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = C10425a.m40121r(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                C10425a.m40118o(drawable, colorStateList);
            } else {
                C10425a.m40118o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(m31254c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                C10425a.m40119p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ImageView.ScaleType m31253b(int i10) {
        if (i10 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i10 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i10 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i10 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i10 != 5) {
            return i10 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    /* JADX INFO: renamed from: c */
    public static int[] m31254c(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: d */
    public static void m31255d(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(m31254c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = C10425a.m40121r(drawable).mutate();
        C10425a.m40118o(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: e */
    public static void m31256e(@NonNull CheckableImageButton checkableImageButton) {
    }

    /* JADX INFO: renamed from: f */
    public static void m31257f(@NonNull CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zM3002N = C0625o0.m3002N(checkableImageButton);
        boolean z10 = onLongClickListener != null;
        boolean z11 = zM3002N || z10;
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(zM3002N);
        checkableImageButton.setPressable(zM3002N);
        checkableImageButton.setLongClickable(z10);
        C0625o0.m3060w0(checkableImageButton, z11 ? 1 : 2);
    }

    /* JADX INFO: renamed from: g */
    public static void m31258g(@NonNull CheckableImageButton checkableImageButton, int i10) {
        checkableImageButton.setMinimumWidth(i10);
        checkableImageButton.setMinimumHeight(i10);
    }

    /* JADX INFO: renamed from: h */
    public static void m31259h(@NonNull CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m31257f(checkableImageButton, onLongClickListener);
    }

    /* JADX INFO: renamed from: i */
    public static void m31260i(@NonNull CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m31257f(checkableImageButton, onLongClickListener);
    }

    /* JADX INFO: renamed from: j */
    public static void m31261j(@NonNull CheckableImageButton checkableImageButton, @NonNull ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }
}
