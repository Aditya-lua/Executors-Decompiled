package p151gk;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gk.e0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\u0004¨\u0006\t"}, m31665d2 = {"Landroid/net/Uri;", "", "paramName", "c", "(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;", "", "a", "(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/Boolean;", "b", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6112e0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Boolean m27025a(@NotNull Uri uri, @NotNull String paramName) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        String strM27026b = m27026b(uri, paramName);
        if (strM27026b == null) {
            return null;
        }
        return StringsKt.m32181o1(strM27026b);
    }

    /* JADX INFO: renamed from: b */
    public static final String m27026b(Uri uri, String str) {
        try {
            return uri.getQueryParameter(str);
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String m27027c(@NotNull Uri uri, @NotNull String paramName) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        String strM27026b = m27026b(uri, paramName);
        if (strM27026b == null || strM27026b.length() <= 0) {
            return null;
        }
        return strM27026b;
    }
}
