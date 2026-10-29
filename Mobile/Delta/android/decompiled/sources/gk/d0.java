package gk;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Landroid/net/Uri;", "", "paramName", "c", "(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;", "", "a", "(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/Boolean;", "b", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d0 {
    @Nullable
    public static final Boolean a(@NotNull Uri uri, @NotNull String paramName) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        String strB = b(uri, paramName);
        if (strB == null) {
            return null;
        }
        return StringsKt.o1(strB);
    }

    public static final String b(Uri uri, String str) {
        try {
            return uri.getQueryParameter(str);
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Nullable
    public static final String c(@NotNull Uri uri, @NotNull String paramName) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        String strB = b(uri, paramName);
        if (strB == null || strB.length() <= 0) {
            return null;
        }
        return strB;
    }
}
