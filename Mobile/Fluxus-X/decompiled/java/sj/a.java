package sj;

import android.net.Uri;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/net/Uri;", BuildConfig.FLAVOR, "appDomain", BuildConfig.FLAVOR, "a", "(Landroid/net/Uri;Ljava/lang/String;)Z", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final boolean a(@NotNull Uri uri, @NotNull String appDomain) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(appDomain, "appDomain");
        if (Intrinsics.c(uri.getScheme(), "https")) {
            if (!Intrinsics.c(uri.getHost(), appDomain)) {
                String host = uri.getHost();
                if (host != null) {
                    if (x.D(host, "." + appDomain, false, 2, null)) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
