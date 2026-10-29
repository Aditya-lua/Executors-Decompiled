package gk;

import android.content.Context;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroid/content/Context;", "", "d", "(Landroid/content/Context;)Z", "c", "", "deeplinkUriFormat", "webUriFormat", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z", "uri", "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "utils_googleRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class z {
    public static native boolean a(Context context, String str);

    public static final boolean b(Context context, String str, String str2) {
        Locale locale = Locale.ROOT;
        String str3 = String.format(locale, str, Arrays.copyOf(new Object[]{context.getPackageName()}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        String str4 = String.format(locale, str2, Arrays.copyOf(new Object[]{context.getPackageName()}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        return a(context, str3) || a(context, str4);
    }

    public static final boolean c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return b(context, "market://details?id=%s", "https://play.google.com/store/apps/details?id=%s");
    }

    public static final boolean d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return b(context, "market://details?id=%s", "https://play.google.com/store/apps/details?id=%s");
    }
}
