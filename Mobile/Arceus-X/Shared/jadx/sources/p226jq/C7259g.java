package p226jq;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import androidx.p616lifecycle.InterfaceC0980s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p203j.ActivityC6992b;

/* JADX INFO: renamed from: jq.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0006\u001a\u0011\u0010\u0012\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0006\"\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0007*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\t\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\n*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, m31665d2 = {"Landroid/content/Context;", "", "b", "(Landroid/content/Context;)Ljava/lang/String;", "", "e", "(Landroid/content/Context;)Z", "Lj/b;", "h", "(Landroid/content/Context;)Lj/b;", "Landroidx/lifecycle/s;", "i", "(Landroid/content/Context;)Landroidx/lifecycle/s;", "", "d", "(Landroid/content/Context;)V", "j", "g", "f", "a", "activity", "c", "lifecycleOwner", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7259g {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final ActivityC6992b m30267a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context instanceof ActivityC6992b) {
            return (ActivityC6992b) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        return m30267a(baseContext);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m30268b(@NotNull Context context) {
        String string;
        Intrinsics.checkNotNullParameter(context, "<this>");
        int i10 = context.getApplicationInfo().labelRes;
        if (i10 == 0) {
            try {
                CharSequence charSequence = context.getApplicationInfo().nonLocalizedLabel;
                return (charSequence == null || (string = charSequence.toString()) == null) ? context.getApplicationInfo().loadLabel(context.getPackageManager()).toString() : string;
            } catch (PackageManager.NameNotFoundException unused) {
                return "";
            }
        }
        String string2 = context.getString(i10);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final InterfaceC0980s m30269c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return m30267a(context);
    }

    /* JADX INFO: renamed from: d */
    public static final void m30270d(@NotNull Context context) {
        View currentFocus;
        Intrinsics.checkNotNullParameter(context, "<this>");
        ActivityC6992b activityC6992bM30267a = m30267a(context);
        if (activityC6992bM30267a == null || (currentFocus = activityC6992bM30267a.getCurrentFocus()) == null) {
            return;
        }
        Object systemService = context.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m30271e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m30272f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m30273g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.m31981d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return ((AccessibilityManager) systemService).isEnabled();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final ActivityC6992b m30274h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        ActivityC6992b activityC6992bM30267a = m30267a(context);
        if (activityC6992bM30267a != null) {
            return activityC6992bM30267a;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final InterfaceC0980s m30275i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        ActivityC6992b activityC6992bM30267a = m30267a(context);
        if (activityC6992bM30267a != null) {
            return activityC6992bM30267a;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: renamed from: j */
    public static final void m30276j(@NotNull Context context) {
        View currentFocus;
        Intrinsics.checkNotNullParameter(context, "<this>");
        ActivityC6992b activityC6992bM30267a = m30267a(context);
        if (activityC6992bM30267a == null || (currentFocus = activityC6992bM30267a.getCurrentFocus()) == null) {
            return;
        }
        Object systemService = context.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(currentFocus, 1);
        }
    }
}
