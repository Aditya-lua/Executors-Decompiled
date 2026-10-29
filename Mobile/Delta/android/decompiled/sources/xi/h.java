package xi;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "robuxOnlyUrl", "b", "(Ljava/lang/String;)Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    @NotNull
    public static final String a() {
        return c(null, 1, null);
    }

    @NotNull
    public static final String b(@NotNull String robuxOnlyUrl) {
        Intrinsics.checkNotNullParameter(robuxOnlyUrl, "robuxOnlyUrl");
        String string = Uri.parse(robuxOnlyUrl).buildUpon().appendQueryParameter("showHeader", "true").build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String c(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = a1.E0();
            Intrinsics.checkNotNullExpressionValue(str, "robuxOnlyUrl(...)");
        }
        return b(str);
    }
}
