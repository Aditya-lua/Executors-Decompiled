package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public final class CompoundButtonCompat {
    private static final String TAG = "CompoundButtonCompat";
    private static Field sButtonDrawableField;
    private static boolean sButtonDrawableFieldFetched;

    private CompoundButtonCompat() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.widget.CompoundButton */
    /* JADX WARN: Multi-variable type inference failed */
    public static void setButtonTintList(@NonNull CompoundButton compoundButton, @Nullable ColorStateList tint) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(tint);
        } else if (compoundButton instanceof TintableCompoundButton) {
            ((TintableCompoundButton) compoundButton).setSupportButtonTintList(tint);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.widget.CompoundButton */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static ColorStateList getButtonTintList(@NonNull CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintList();
        }
        if (compoundButton instanceof TintableCompoundButton) {
            return ((TintableCompoundButton) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.widget.CompoundButton */
    /* JADX WARN: Multi-variable type inference failed */
    public static void setButtonTintMode(@NonNull CompoundButton compoundButton, @Nullable PorterDuff.Mode tintMode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(tintMode);
        } else if (compoundButton instanceof TintableCompoundButton) {
            ((TintableCompoundButton) compoundButton).setSupportButtonTintMode(tintMode);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.widget.CompoundButton */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static PorterDuff.Mode getButtonTintMode(@NonNull CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintMode();
        }
        if (compoundButton instanceof TintableCompoundButton) {
            return ((TintableCompoundButton) compoundButton).getSupportButtonTintMode();
        }
        return null;
    }

    @Nullable
    public static Drawable getButtonDrawable(@NonNull CompoundButton button) {
        if (Build.VERSION.SDK_INT >= 23) {
            return button.getButtonDrawable();
        }
        if (!sButtonDrawableFieldFetched) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                sButtonDrawableField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i(TAG, "Failed to retrieve mButtonDrawable field", e10);
            }
            sButtonDrawableFieldFetched = true;
        }
        Field field = sButtonDrawableField;
        if (field != null) {
            try {
                return (Drawable) field.get(button);
            } catch (IllegalAccessException e11) {
                Log.i(TAG, "Failed to get button drawable via reflection", e11);
                sButtonDrawableField = null;
            }
        }
        return null;
    }
}
