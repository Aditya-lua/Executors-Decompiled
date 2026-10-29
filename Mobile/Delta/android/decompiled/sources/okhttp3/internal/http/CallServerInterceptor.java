package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import jt.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.TrailersSource;
import okhttp3.internal.UnreadableResponseBody;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import xu.b0;
import xu.f;
import xu.g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "", "code", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CallServerInterceptor implements Interceptor {

    @NotNull
    public static final CallServerInterceptor INSTANCE = new CallServerInterceptor();

    private CallServerInterceptor() {
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int code) {
        if (code == 100) {
            return true;
        }
        return 102 <= code && code < 200;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00aa A[Catch: IOException -> 0x007b, TRY_LEAVE, TryCatch #3 {IOException -> 0x007b, blocks: (B:21:0x0066, B:23:0x006c, B:34:0x00a4, B:36:0x00aa, B:26:0x007d, B:27:0x008c, B:29:0x0099), top: B:105:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:94:0x020a  */
    /* JADX WARN: Code duplicated, block: B:96:0x020e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [okhttp3.Response$Builder] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, okhttp3.Response$Builder] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        boolean z10;
        ?? r8;
        IOException iOException;
        ?? responseHeaders;
        Response responseBuild;
        Response.Builder builder;
        Intrinsics.checkNotNullParameter(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        final Exchange exchange = realInterceptorChain.getExchange();
        Intrinsics.checkNotNull(exchange);
        Request request = realInterceptorChain.getRequest();
        RequestBody requestBodyBody = request.body();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = false;
        ?? r10 = (!HttpMethod.permitsRequestBody(request.method()) || requestBodyBody == null) ? 0 : 1;
        boolean zE = x.E("upgrade", request.header("Connection"), true);
        try {
            exchange.writeRequestHeaders(request);
            try {
                if (r10 != 0) {
                    if (x.E("100-continue", request.header("Expect"), true)) {
                        exchange.flushRequest();
                        Response.Builder responseHeaders2 = exchange.readResponseHeaders(true);
                        try {
                            exchange.responseHeadersStart();
                            z10 = false;
                            builder = responseHeaders2;
                        } catch (IOException e10) {
                            e = e10;
                            z10 = true;
                            r8 = responseHeaders2;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            if (!exchange.getHasFailure()) {
                                throw e;
                            }
                            ?? r17 = r8;
                            iOException = e;
                            responseHeaders = r17;
                        }
                    } else {
                        z10 = true;
                        builder = null;
                    }
                    if (builder != null) {
                        exchange.noRequestBody();
                        if (!exchange.getConnection$okhttp().isMultiplexed$okhttp()) {
                            r10 = builder;
                            exchange.noNewExchangesOnConnection();
                            r10 = builder;
                        }
                    } else if (requestBodyBody.isDuplex()) {
                        exchange.flushRequest();
                        requestBodyBody.writeTo(b0.b(exchange.createRequestBody(request, true)));
                    } else {
                        f fVarB = b0.b(exchange.createRequestBody(request, false));
                        requestBodyBody.writeTo(fVarB);
                        fVarB.close();
                    }
                } else {
                    exchange.noRequestBody();
                    z10 = true;
                    r10 = 0;
                }
                if (requestBodyBody != null) {
                    r10 = builder;
                    if (!requestBodyBody.isDuplex()) {
                        r10 = builder;
                        r10 = builder;
                        r10 = builder;
                        exchange.finishRequest();
                    }
                } else {
                    r10 = builder;
                    r10 = builder;
                    r10 = builder;
                    exchange.finishRequest();
                }
                r10 = builder;
                responseHeaders = r10;
                iOException = null;
            } catch (IOException e11) {
                e = e11;
                r8 = r10;
            }
        } catch (IOException e12) {
            e = e12;
            z10 = true;
            r8 = 0;
        }
        if (responseHeaders == 0) {
            try {
                responseHeaders = exchange.readResponseHeaders(false);
                Intrinsics.checkNotNull(responseHeaders);
                if (z10) {
                    exchange.responseHeadersStart();
                    z10 = false;
                }
            } catch (IOException e13) {
                e = e13;
                if (iOException != null) {
                    throw e;
                }
                a.a(iOException, e);
                throw iOException;
            }
        }
        Response responseBuild2 = responseHeaders.request(request).handshake(exchange.getConnection$okhttp().getHandshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int iCode = responseBuild2.code();
        while (shouldIgnoreAndWaitForRealResponse(iCode)) {
            try {
                Response.Builder responseHeaders3 = exchange.readResponseHeaders(z11);
                Intrinsics.checkNotNull(responseHeaders3);
                if (z10) {
                    exchange.responseHeadersStart();
                }
                responseBuild2 = responseHeaders3.request(request).handshake(exchange.getConnection$okhttp().getHandshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                iCode = responseBuild2.code();
                z11 = false;
            } catch (IOException e14) {
                e = e14;
                if (iOException != null) {
                    throw e;
                }
                a.a(iOException, e);
                throw iOException;
            }
        }
        exchange.responseHeadersEnd(responseBuild2);
        boolean z12 = iCode == 101;
        if (z12 && exchange.getConnection$okhttp().isMultiplexed$okhttp()) {
            throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
        }
        boolean z13 = z12 && x.E("upgrade", Response.header$default(responseBuild2, "Connection", null, 2, null), true);
        if (zE && z13) {
            responseBuild = responseBuild2.newBuilder().body(new UnreadableResponseBody(responseBuild2.body().getMediaType(), responseBuild2.body().getContentLength())).socket(exchange.upgradeToSocket()).build();
        } else {
            final ResponseBody responseBodyOpenResponseBody = exchange.openResponseBody(responseBuild2);
            responseBuild = responseBuild2.newBuilder().body(responseBodyOpenResponseBody).trailers(new TrailersSource() { // from class: okhttp3.internal.http.CallServerInterceptor.intercept.1
                @Override // okhttp3.TrailersSource
                public Headers get() {
                    g source = responseBodyOpenResponseBody.getBodySource();
                    if (source.isOpen()) {
                        _UtilJvmKt.skipAll(source);
                    }
                    Headers headersPeek = peek();
                    if (headersPeek != null) {
                        return headersPeek;
                    }
                    throw new IllegalStateException("null trailers after exhausting response body?!");
                }

                @Override // okhttp3.TrailersSource
                public Headers peek() {
                    return exchange.peekTrailers();
                }
            }).build();
        }
        if (x.E("close", responseBuild.request().header("Connection"), true) || x.E("close", Response.header$default(responseBuild, "Connection", null, 2, null), true)) {
            exchange.noNewExchangesOnConnection();
        }
        if ((iCode != 204 && iCode != 205) || responseBuild.body().getContentLength() <= 0) {
            return responseBuild;
        }
        throw new ProtocolException("HTTP " + iCode + " had non-zero Content-Length: " + responseBuild.body().getContentLength());
    }
}
