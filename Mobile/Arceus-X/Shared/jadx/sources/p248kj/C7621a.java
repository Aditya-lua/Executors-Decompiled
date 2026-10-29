package p248kj;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kj.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Landroid/net/Uri;", "", "appDomain", "", "a", "(Landroid/net/Uri;Ljava/lang/String;)Z", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7621a {
    /* JADX INFO: renamed from: a */
    public static final boolean m31500a(@NotNull Uri uri, @NotNull String appDomain) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(appDomain, "appDomain");
        if (Intrinsics.m31980c(uri.getScheme(), "https")) {
            if (!Intrinsics.m31980c(uri.getHost(), appDomain)) {
                String host = uri.getHost();
                if (host != null) {
                    if (C7797x.m32293D(host, "." + appDomain, false, 2, null)) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
