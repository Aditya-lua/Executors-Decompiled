package p548xi;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg.C11295a1;

/* JADX INFO: renamed from: xi.h */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"", "robuxOnlyUrl", "b", "(Ljava/lang/String;)Ljava/lang/String;", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12841h {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m47816a() {
        return m47818c(null, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m47817b(@NotNull String robuxOnlyUrl) {
        Intrinsics.checkNotNullParameter(robuxOnlyUrl, "robuxOnlyUrl");
        String string = Uri.parse(robuxOnlyUrl).buildUpon().appendQueryParameter("showHeader", "true").build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m47818c(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = C11295a1.m42391E0();
            Intrinsics.checkNotNullExpressionValue(str, "robuxOnlyUrl(...)");
        }
        return m47817b(str);
    }
}
