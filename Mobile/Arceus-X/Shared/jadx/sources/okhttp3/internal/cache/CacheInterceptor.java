package okhttp3.internal.cache;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.UnreadableResponseBodyKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p560xu.C12919b0;
import p560xu.C12924e;
import p560xu.C12953s0;
import p560xu.InterfaceC12926f;
import p560xu.InterfaceC12928g;
import p560xu.InterfaceC12947p0;
import p560xu.InterfaceC12951r0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0002R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m31665d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/Interceptor;", "cache", "Lokhttp3/Cache;", "<init>", "(Lokhttp3/Cache;)V", "getCache$okhttp", "()Lokhttp3/Cache;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "cacheWritingResponse", "cacheRequest", "Lokhttp3/internal/cache/CacheRequest;", Payload.RESPONSE, "Companion", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class CacheInterceptor implements Interceptor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Cache cache;

    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\r"}, m31665d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", "", "<init>", "()V", "combine", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "isEndToEnd", "", "fieldName", "", "isContentSpecificHeader", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.cache.CacheInterceptor.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Headers combine(Headers cachedHeaders, Headers networkHeaders) {
            Headers.Builder builder = new Headers.Builder();
            int size = cachedHeaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strName = cachedHeaders.name(i10);
                String strValue = cachedHeaders.value(i10);
                if ((!C7797x.m32294E("Warning", strName, true) || !C7797x.m32309T(strValue, "1", false, 2, null)) && (isContentSpecificHeader(strName) || !isEndToEnd(strName) || networkHeaders.get(strName) == null)) {
                    builder.addLenient$okhttp(strName, strValue);
                }
            }
            int size2 = networkHeaders.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strName2 = networkHeaders.name(i11);
                if (!isContentSpecificHeader(strName2) && isEndToEnd(strName2)) {
                    builder.addLenient$okhttp(strName2, networkHeaders.value(i11));
                }
            }
            return builder.build();
        }

        private final boolean isContentSpecificHeader(String fieldName) {
            return C7797x.m32294E("Content-Length", fieldName, true) || C7797x.m32294E("Content-Encoding", fieldName, true) || C7797x.m32294E("Content-Type", fieldName, true);
        }

        private final boolean isEndToEnd(String fieldName) {
            return (C7797x.m32294E("Connection", fieldName, true) || C7797x.m32294E("Keep-Alive", fieldName, true) || C7797x.m32294E("Proxy-Authenticate", fieldName, true) || C7797x.m32294E("Proxy-Authorization", fieldName, true) || C7797x.m32294E("TE", fieldName, true) || C7797x.m32294E("Trailers", fieldName, true) || C7797x.m32294E("Transfer-Encoding", fieldName, true) || C7797x.m32294E("Upgrade", fieldName, true)) ? false : true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public CacheInterceptor(@Nullable Cache cache) {
        this.cache = cache;
    }

    private final Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) {
        if (cacheRequest == null) {
            return response;
        }
        InterfaceC12947p0 body = cacheRequest.getBody();
        final InterfaceC12928g source = response.body().getBodySource();
        final InterfaceC12926f interfaceC12926fM47960b = C12919b0.m47960b(body);
        InterfaceC12951r0 interfaceC12951r0 = new InterfaceC12951r0() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            private boolean cacheRequestClosed;

            @Override // p560xu.InterfaceC12951r0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                if (!this.cacheRequestClosed && !_UtilJvmKt.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                source.close();
            }

            @Override // p560xu.InterfaceC12951r0
            public long read(C12924e sink, long byteCount) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                try {
                    long j10 = source.read(sink, byteCount);
                    if (j10 != -1) {
                        sink.m48026f(interfaceC12926fM47960b.getBufferField(), sink.getSize() - j10, j10);
                        interfaceC12926fM47960b.mo48034j0();
                        return j10;
                    }
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        interfaceC12926fM47960b.close();
                    }
                    return -1L;
                } catch (IOException e10) {
                    if (this.cacheRequestClosed) {
                        throw e10;
                    }
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                    throw e10;
                }
            }

            @Override // p560xu.InterfaceC12951r0
            /* JADX INFO: renamed from: timeout */
            public C12953s0 getTimeout() {
                return source.getTimeout();
            }
        };
        return response.newBuilder().body(new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), response.body().getContentLength(), C12919b0.m47961c(interfaceC12951r0))).build();
    }

    @Nullable
    /* JADX INFO: renamed from: getCache$okhttp, reason: from getter */
    public final Cache getCache() {
        return this.cache;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        EventListener eventListener;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Call call = chain.call();
        Cache cache = this.cache;
        Response response = cache != null ? cache.get$okhttp(CacheInterceptorKt.requestForCache(chain.request())) : null;
        CacheStrategy cacheStrategyCompute = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).compute();
        Request networkRequest = cacheStrategyCompute.getNetworkRequest();
        Response cacheResponse = cacheStrategyCompute.getCacheResponse();
        Cache cache2 = this.cache;
        if (cache2 != null) {
            cache2.trackResponse$okhttp(cacheStrategyCompute);
        }
        RealCall realCall = call instanceof RealCall ? (RealCall) call : null;
        if (realCall == null || (eventListener = realCall.getEventListener()) == null) {
            eventListener = EventListener.NONE;
        }
        if (response != null && cacheResponse == null) {
            _UtilCommonKt.closeQuietly(response.body());
        }
        if (networkRequest == null && cacheResponse == null) {
            Response responseBuild = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            eventListener.satisfactionFailure(call, responseBuild);
            return responseBuild;
        }
        if (networkRequest == null) {
            Intrinsics.checkNotNull(cacheResponse);
            Response responseBuild2 = cacheResponse.newBuilder().cacheResponse(UnreadableResponseBodyKt.stripBody(cacheResponse)).build();
            eventListener.cacheHit(call, responseBuild2);
            return responseBuild2;
        }
        if (cacheResponse != null) {
            eventListener.cacheConditionalHit(call, cacheResponse);
        } else if (this.cache != null) {
            eventListener.cacheMiss(call);
        }
        try {
            Response responseProceed = chain.proceed(networkRequest);
            if (responseProceed == null && response != null) {
                _UtilCommonKt.closeQuietly(response.body());
            }
            if (cacheResponse != null) {
                if (responseProceed != null && responseProceed.code() == 304) {
                    Response responseBuild3 = cacheResponse.newBuilder().headers(INSTANCE.combine(cacheResponse.headers(), responseProceed.headers())).sentRequestAtMillis(responseProceed.sentRequestAtMillis()).receivedResponseAtMillis(responseProceed.receivedResponseAtMillis()).cacheResponse(UnreadableResponseBodyKt.stripBody(cacheResponse)).networkResponse(UnreadableResponseBodyKt.stripBody(responseProceed)).build();
                    responseProceed.body().close();
                    Cache cache3 = this.cache;
                    Intrinsics.checkNotNull(cache3);
                    cache3.trackConditionalCacheHit$okhttp();
                    this.cache.update$okhttp(cacheResponse, responseBuild3);
                    eventListener.cacheHit(call, responseBuild3);
                    return responseBuild3;
                }
                _UtilCommonKt.closeQuietly(cacheResponse.body());
            }
            Intrinsics.checkNotNull(responseProceed);
            Response responseBuild4 = responseProceed.newBuilder().cacheResponse(cacheResponse != null ? UnreadableResponseBodyKt.stripBody(cacheResponse) : null).networkResponse(UnreadableResponseBodyKt.stripBody(responseProceed)).build();
            if (this.cache != null) {
                Request requestRequestForCache = CacheInterceptorKt.requestForCache(networkRequest);
                if (HttpHeaders.promisesBody(responseBuild4) && CacheStrategy.INSTANCE.isCacheable(responseBuild4, requestRequestForCache)) {
                    Response responseCacheWritingResponse = cacheWritingResponse(this.cache.put$okhttp(responseBuild4.newBuilder().request(requestRequestForCache).build()), responseBuild4);
                    if (cacheResponse != null) {
                        eventListener.cacheMiss(call);
                    }
                    return responseCacheWritingResponse;
                }
                if (HttpMethod.invalidatesCache(networkRequest.method())) {
                    try {
                        this.cache.remove$okhttp(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return responseBuild4;
        } catch (Throwable th2) {
            if (response != null) {
                _UtilCommonKt.closeQuietly(response.body());
            }
            throw th2;
        }
    }
}
