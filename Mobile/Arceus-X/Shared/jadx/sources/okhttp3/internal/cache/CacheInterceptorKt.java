package okhttp3.internal.cache;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.internal.http.HttpMethod;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u0002"}, m31665d2 = {"requestForCache", "Lokhttp3/Request;", "okhttp"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class CacheInterceptorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Request requestForCache(Request request) {
        HttpUrl cacheUrlOverride = request.getCacheUrlOverride();
        if (cacheUrlOverride != null) {
            return (HttpMethod.INSTANCE.isCacheable(request.method()) || Intrinsics.m31980c(request.method(), "POST")) ? request.newBuilder().get().url(cacheUrlOverride).cacheUrlOverride(null).build() : request;
        }
        return request;
    }
}
