package bn;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lbn/n;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "packageName", BuildConfig.FLAVOR, "sdkInt", "Lbn/n$a;", "starter", "c", "(Ljava/lang/String;ILbn/n$a;)Ljava/lang/String;", "Landroid/content/Intent;", "b", "(Ljava/lang/String;I)Landroid/content/Intent;", "a", "(Ljava/lang/String;)Landroid/content/Intent;", "intent", BuildConfig.FLAVOR, "d", "(Lbn/n$a;Landroid/content/Intent;)Z", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n f4480a = new n();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lbn/n$a;", BuildConfig.FLAVOR, "Landroid/content/Intent;", "intent", BuildConfig.FLAVOR, "a", "(Landroid/content/Intent;)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void a(@NotNull Intent intent);
    }

    @NotNull
    public static final String c(@NotNull String packageName, int sdkInt, @NotNull a starter) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(starter, "starter");
        n nVar = f4480a;
        if (nVar.d(starter, nVar.b(packageName, sdkInt))) {
            return "OPENED_NOTIFICATION_SETTINGS";
        }
        if (nVar.d(starter, nVar.a(packageName))) {
            return "OPENED_APP_SETTINGS";
        }
        Log.e("NotificationSettingsLauncher", "Could not open notification settings or app details settings");
        return "FAILED";
    }

    public final Intent a(String packageName) {
        Intent intentAddFlags = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", packageName, null)).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        return intentAddFlags;
    }

    public final Intent b(String packageName, int sdkInt) {
        Intent intentPutExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", packageName);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        if (sdkInt >= 28) {
            intentPutExtra.addFlags(268435456);
        }
        return intentPutExtra;
    }

    public final boolean d(a starter, Intent intent) {
        try {
            starter.a(intent);
            return true;
        } catch (RuntimeException e10) {
            Log.w("NotificationSettingsLauncher", "Could not start " + intent.getAction() + ": " + e10);
            return false;
        }
    }
}
