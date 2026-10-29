package p101ed;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: ed.b */
/* JADX INFO: loaded from: classes2.dex */
public class C5049b {
    /* JADX INFO: renamed from: a */
    public static TypedValue m23730a(@NonNull Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m23731b(@NonNull Context context, int i10, boolean z10) {
        TypedValue typedValueM23730a = m23730a(context, i10);
        if (typedValueM23730a == null || typedValueM23730a.type != 18) {
            return z10;
        }
        return typedValueM23730a.data != 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m23732c(@NonNull Context context, int i10, int i11) {
        TypedValue typedValueM23730a = m23730a(context, i10);
        return (typedValueM23730a == null || typedValueM23730a.type != 16) ? i11 : typedValueM23730a.data;
    }

    /* JADX INFO: renamed from: d */
    public static int m23733d(@NonNull Context context, int i10, @NonNull String str) {
        return m23734e(context, i10, str).data;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static TypedValue m23734e(@NonNull Context context, int i10, @NonNull String str) {
        TypedValue typedValueM23730a = m23730a(context, i10);
        if (typedValueM23730a != null) {
            return typedValueM23730a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static TypedValue m23735f(@NonNull View view, int i10) {
        return m23734e(view.getContext(), i10, view.getClass().getCanonicalName());
    }
}
