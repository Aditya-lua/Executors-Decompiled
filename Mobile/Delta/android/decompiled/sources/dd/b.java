package dd;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static TypedValue a(@NonNull Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(@NonNull Context context, int i10, boolean z10) {
        TypedValue typedValueA = a(context, i10);
        if (typedValueA == null || typedValueA.type != 18) {
            return z10;
        }
        return typedValueA.data != 0;
    }

    public static int c(@NonNull Context context, int i10, int i11) {
        TypedValue typedValueA = a(context, i10);
        return (typedValueA == null || typedValueA.type != 16) ? i11 : typedValueA.data;
    }

    public static int d(@NonNull Context context, int i10, @NonNull String str) {
        return e(context, i10, str).data;
    }

    @NonNull
    public static TypedValue e(@NonNull Context context, int i10, @NonNull String str) {
        TypedValue typedValueA = a(context, i10);
        if (typedValueA != null) {
            return typedValueA;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    @NonNull
    public static TypedValue f(@NonNull View view, int i10) {
        return e(view.getContext(), i10, view.getClass().getCanonicalName());
    }
}
