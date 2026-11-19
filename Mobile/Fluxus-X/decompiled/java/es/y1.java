package es;

import android.net.Uri;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a%\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {BuildConfig.FLAVOR, "baseUrl", "oneTimeLinkCode", "componentName", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class y1 {
    @NotNull
    public static final String a(@NotNull String baseUrl, @NotNull String oneTimeLinkCode, @NotNull String componentName) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(oneTimeLinkCode, "oneTimeLinkCode");
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        String string = Uri.parse(baseUrl).buildUpon().appendQueryParameter("code", oneTimeLinkCode).appendQueryParameter("component", componentName).build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
