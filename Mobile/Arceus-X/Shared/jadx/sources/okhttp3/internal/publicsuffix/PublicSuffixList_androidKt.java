package okhttp3.internal.publicsuffix;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"Default", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "Lokhttp3/internal/publicsuffix/PublicSuffixList$Companion;", "getDefault", "(Lokhttp3/internal/publicsuffix/PublicSuffixList$Companion;)Lokhttp3/internal/publicsuffix/PublicSuffixList;", "okhttp"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class PublicSuffixList_androidKt {
    @NotNull
    public static final PublicSuffixList getDefault(@NotNull PublicSuffixList.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return new AssetPublicSuffixList(null, 1, null);
    }
}
