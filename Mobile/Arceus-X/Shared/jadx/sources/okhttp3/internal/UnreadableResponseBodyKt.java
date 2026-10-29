package okhttp3.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, m31665d2 = {"stripBody", "Lokhttp3/Response;", "okhttp"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class UnreadableResponseBodyKt {
    @NotNull
    public static final Response stripBody(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        return response.newBuilder().body(new UnreadableResponseBody(response.body().getMediaType(), response.body().getContentLength())).build();
    }
}
