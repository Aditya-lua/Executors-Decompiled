package p342or;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: or.t1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a%\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"", "baseUrl", "oneTimeLinkCode", "componentName", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "ui_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9992t1 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m38774a(@NotNull String baseUrl, @NotNull String oneTimeLinkCode, @NotNull String componentName) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(oneTimeLinkCode, "oneTimeLinkCode");
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        String string = Uri.parse(baseUrl).buildUpon().appendQueryParameter("code", oneTimeLinkCode).appendQueryParameter("component", componentName).build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
