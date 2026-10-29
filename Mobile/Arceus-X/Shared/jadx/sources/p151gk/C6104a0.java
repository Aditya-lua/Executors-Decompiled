package p151gk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.roblox.client.personasdk.BuildConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7347n;
import p229jt.C7348o;

/* JADX INFO: renamed from: gk.a0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Landroid/content/Context;", "", "d", "(Landroid/content/Context;)Z", "c", "", "deeplinkUriFormat", "webUriFormat", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z", "uri", "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "utils_googleRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6104a0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m27001a(Context context, String str) {
        Object objM30460b;
        boolean z10;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(1208483840);
            if (BuildConfig.STORE_PACKAGE.length() > 0) {
                intent.setPackage(BuildConfig.STORE_PACKAGE);
            }
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
            if (listQueryIntentActivities.isEmpty()) {
                z10 = false;
            } else {
                context.startActivity(intent);
                z10 = true;
            }
            objM30460b = C7347n.m30460b(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        Throwable thM30463e = C7347n.m30463e(objM30460b);
        if (thM30463e != null) {
            C6124q.m27061f("PackageUtils", "Error while trying to launch activity using URI " + str, thM30463e);
            objM30460b = Boolean.FALSE;
        }
        return ((Boolean) objM30460b).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m27002b(Context context, String str, String str2) {
        Locale locale = Locale.ROOT;
        String str3 = String.format(locale, str, Arrays.copyOf(new Object[]{context.getPackageName()}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        String str4 = String.format(locale, str2, Arrays.copyOf(new Object[]{context.getPackageName()}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        return m27001a(context, str3) || m27001a(context, str4);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m27003c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return m27002b(context, "https://spdmteam.com/%s", "https://spdmteam.com/%s");
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m27004d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return m27002b(context, "https://spdmteam.com/%s", "https://spdmteam.com/%s");
    }
}
