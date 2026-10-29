package okhttp3;

import com.appsflyer.sdk_base.referrer.Payload;
import hu.InterfaceC6567c;
import java.net.URL;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import okhttp3.internal.EmptyTags;
import okhttp3.internal.IsProbablyUtf8Kt;
import okhttp3.internal.Tags;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http.GzipRequestBody;
import okhttp3.internal.http.HttpMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p560xu.C12924e;
import yt.C13450a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001?B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0004\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0010J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\t\u0010\u0014J\u001e\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0015\u0018\u0001*\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0015*\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u0018\u0010\u001bJ\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0018\u0010\u0017J%\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00152\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u0018\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b$\u0010%J\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010+\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010#J\u0019\u0010/\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b/\u00100R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b\u0007\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b\u000b\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b\t\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b\r\u0010'R\u0019\u00105\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b5\u0010!R\u001a\u00107\u001a\u0002068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010+\u001a\u00020(8G¢\u0006\u0006\u001a\u0004\b+\u0010*¨\u0006@"}, m31665d2 = {"Lokhttp3/Request;", "", "Lokhttp3/Request$Builder;", "builder", "<init>", "(Lokhttp3/Request$Builder;)V", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/Headers;", "headers", "", "method", "Lokhttp3/RequestBody;", "body", "(Lokhttp3/HttpUrl;Lokhttp3/Headers;Ljava/lang/String;Lokhttp3/RequestBody;)V", "shellEscape", "(Ljava/lang/String;)Ljava/lang/String;", "name", "header", "", "(Ljava/lang/String;)Ljava/util/List;", "T", "reifiedTag", "()Ljava/lang/Object;", "tag", "Lhu/c;", Payload.TYPE, "(Lhu/c;)Ljava/lang/Object;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "newBuilder", "()Lokhttp3/Request$Builder;", "-deprecated_url", "()Lokhttp3/HttpUrl;", "-deprecated_method", "()Ljava/lang/String;", "-deprecated_headers", "()Lokhttp3/Headers;", "-deprecated_body", "()Lokhttp3/RequestBody;", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "toString", "", "includeBody", "toCurl", "(Z)Ljava/lang/String;", "Lokhttp3/HttpUrl;", "Ljava/lang/String;", "Lokhttp3/Headers;", "Lokhttp3/RequestBody;", "cacheUrlOverride", "Lokhttp3/internal/Tags;", "tags", "Lokhttp3/internal/Tags;", "getTags$okhttp", "()Lokhttp3/internal/Tags;", "lazyCacheControl", "Lokhttp3/CacheControl;", "isHttps", "()Z", "Builder", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class Request {

    @Nullable
    private final RequestBody body;

    @Nullable
    private final HttpUrl cacheUrlOverride;

    @NotNull
    private final Headers headers;

    @Nullable
    private CacheControl lazyCacheControl;

    @NotNull
    private final String method;

    @NotNull
    private final Tags tags;

    @NotNull
    private final HttpUrl url;

    @Metadata(m31664d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\rJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\b\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u00020\u00002\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\b#\u0010\"J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010\"J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010\"J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010\"J!\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b'\u0010(J&\u0010*\u001a\u00020\u0000\"\n\b\u0000\u0010)\u0018\u0001*\u00020\u00012\b\u0010*\u001a\u0004\u0018\u00018\u0000H\u0087\b¢\u0006\u0004\b+\u0010,J/\u0010*\u001a\u00020\u0000\"\b\b\u0000\u0010)*\u00020\u00012\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-2\b\u0010*\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b*\u0010/J\u0019\u0010*\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b*\u0010,J/\u0010*\u001a\u00020\u0000\"\u0004\b\u0000\u0010)2\u000e\u0010.\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u0000002\b\u0010*\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b*\u00101J\u0017\u00102\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b2\u0010\fJ\r\u00103\u001a\u00020\u0000¢\u0006\u0004\b3\u0010\u001dJ\u000f\u00104\u001a\u00020\u0004H\u0016¢\u0006\u0004\b4\u00105R$\u0010\b\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010'\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0017\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u00102\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00106\u001a\u0004\bK\u00108\"\u0004\bL\u0010:R\"\u0010N\u001a\u00020M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006T"}, m31665d2 = {"Lokhttp3/Request$Builder;", "", "<init>", "()V", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;)V", "", "url", "canonicalUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/HttpUrl;", "(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;", "(Ljava/lang/String;)Lokhttp3/Request$Builder;", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/Request$Builder;", "name", "value", "header", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;", "addHeader", "removeHeader", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;)Lokhttp3/Request$Builder;", "Lokhttp3/CacheControl;", "cacheControl", "(Lokhttp3/CacheControl;)Lokhttp3/Request$Builder;", "get", "()Lokhttp3/Request$Builder;", "head", "Lokhttp3/RequestBody;", "body", "post", "(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", "delete", "put", "patch", "query", "method", "(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", "T", "tag", "reifiedTag", "(Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Lhu/c;", Payload.TYPE, "(Lhu/c;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "Ljava/lang/Class;", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "cacheUrlOverride", "gzip", "build", "()Lokhttp3/Request;", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "getCacheUrlOverride$okhttp", "setCacheUrlOverride$okhttp", "Lokhttp3/internal/Tags;", "tags", "Lokhttp3/internal/Tags;", "getTags$okhttp", "()Lokhttp3/internal/Tags;", "setTags$okhttp", "(Lokhttp3/internal/Tags;)V", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static class Builder {

        @Nullable
        private RequestBody body;

        @Nullable
        private HttpUrl cacheUrlOverride;

        @NotNull
        private Headers.Builder headers;

        @NotNull
        private String method;

        @NotNull
        private Tags tags;

        @Nullable
        private HttpUrl url;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder() {
            this.tags = EmptyTags.INSTANCE;
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        private final String canonicalUrl(String url) {
            if (C7797x.m32307R(url, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String strSubstring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                return sb2.toString();
            }
            if (!C7797x.m32307R(url, "wss:", true)) {
                return url;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("https:");
            String strSubstring2 = url.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            sb3.append(strSubstring2);
            return sb3.toString();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i10 & 1) != 0) {
                requestBody = RequestBody.EMPTY;
            }
            return builder.delete(requestBody);
        }

        @NotNull
        public Builder addHeader(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.add(name, value);
            return this;
        }

        @NotNull
        public Request build() {
            return new Request(this);
        }

        @NotNull
        public Builder cacheControl(@NotNull CacheControl cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        @NotNull
        public final Builder cacheUrlOverride(@Nullable HttpUrl cacheUrlOverride) {
            this.cacheUrlOverride = cacheUrlOverride;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @NotNull
        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        @NotNull
        public Builder get() {
            return method("GET", null);
        }

        @Nullable
        /* JADX INFO: renamed from: getBody$okhttp, reason: from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        @Nullable
        /* JADX INFO: renamed from: getCacheUrlOverride$okhttp, reason: from getter */
        public final HttpUrl getCacheUrlOverride() {
            return this.cacheUrlOverride;
        }

        @NotNull
        /* JADX INFO: renamed from: getHeaders$okhttp, reason: from getter */
        public final Headers.Builder getHeaders() {
            return this.headers;
        }

        @NotNull
        /* JADX INFO: renamed from: getMethod$okhttp, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        @NotNull
        /* JADX INFO: renamed from: getTags$okhttp, reason: from getter */
        public final Tags getTags() {
            return this.tags;
        }

        @Nullable
        /* JADX INFO: renamed from: getUrl$okhttp, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }

        @NotNull
        public final Builder gzip() {
            RequestBody requestBody = this.body;
            if (requestBody == null) {
                throw new IllegalStateException("cannot gzip a request that has no body");
            }
            String str = this.headers.get("Content-Encoding");
            if (str == null) {
                this.headers.add("Content-Encoding", "gzip");
                this.body = new GzipRequestBody(requestBody);
                return this;
            }
            throw new IllegalStateException(("Content-Encoding already set: " + str).toString());
        }

        @NotNull
        public Builder head() {
            return method("HEAD", null);
        }

        @NotNull
        public Builder header(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.set(name, value);
            return this;
        }

        @NotNull
        public Builder headers(@NotNull Headers headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        @NotNull
        public Builder method(@NotNull String method, @Nullable RequestBody body) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (body == null) {
                if (HttpMethod.requiresRequestBody(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!HttpMethod.permitsRequestBody(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.method = method;
            this.body = body;
            return this;
        }

        @NotNull
        public Builder patch(@NotNull RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return method("PATCH", body);
        }

        @NotNull
        public Builder post(@NotNull RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return method("POST", body);
        }

        @NotNull
        public Builder put(@NotNull RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return method("PUT", body);
        }

        @NotNull
        public Builder query(@NotNull RequestBody body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return method("QUERY", body);
        }

        public final /* synthetic */ <T> Builder reifiedTag(T tag) {
            Intrinsics.m31986i(4, "T");
            return tag(C7731d0.m32002b(Object.class), tag);
        }

        @NotNull
        public Builder removeHeader(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        public final void setBody$okhttp(@Nullable RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setCacheUrlOverride$okhttp(@Nullable HttpUrl httpUrl) {
            this.cacheUrlOverride = httpUrl;
        }

        public final void setHeaders$okhttp(@NotNull Headers.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(@NotNull Tags tags) {
            Intrinsics.checkNotNullParameter(tags, "<set-?>");
            this.tags = tags;
        }

        public final void setUrl$okhttp(@Nullable HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @NotNull
        public final <T> Builder tag(@NotNull InterfaceC6567c<T> type, @Nullable T tag) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.tags = this.tags.plus(type, tag);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @NotNull
        public Builder url(@NotNull HttpUrl url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @NotNull
        public Builder delete(@Nullable RequestBody body) {
            return method("DELETE", body);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @NotNull
        public Builder tag(@Nullable Object tag) {
            return tag((InterfaceC6567c<Object>) C7731d0.m32002b(Object.class), tag);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @NotNull
        public Builder url(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return url(HttpUrl.INSTANCE.get(canonicalUrl(url)));
        }

        @NotNull
        public <T> Builder tag(@NotNull Class<? super T> type, @Nullable T tag) {
            Intrinsics.checkNotNullParameter(type, "type");
            return tag(C13450a.m49050c(type), tag);
        }

        @NotNull
        public Builder url(@NotNull URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return url(companion.get(string));
        }

        public Builder(@NotNull Request request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.tags = EmptyTags.INSTANCE;
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            this.tags = request.getTags();
            this.headers = request.headers().newBuilder();
            this.cacheUrlOverride = request.getCacheUrlOverride();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Request(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        HttpUrl url = builder.getUrl();
        if (url == null) {
            throw new IllegalStateException("url == null");
        }
        this.url = url;
        this.method = builder.getMethod();
        this.headers = builder.getHeaders().build();
        this.body = builder.getBody();
        this.cacheUrlOverride = builder.getCacheUrlOverride();
        this.tags = builder.getTags();
    }

    private final String shellEscape(String str) {
        return '\'' + C7797x.m32303N(str, "'", "'\\''", false, 4, null) + '\'';
    }

    public static /* synthetic */ String toCurl$default(Request request, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return request.toCurl(z10);
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final RequestBody getBody() {
        return this.body;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m50929deprecated_cacheControl() {
        return cacheControl();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_method, reason: not valid java name and from getter */
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name and from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    @Nullable
    public final RequestBody body() {
        return this.body;
    }

    @NotNull
    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.INSTANCE.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    @Nullable
    /* JADX INFO: renamed from: cacheUrlOverride, reason: from getter */
    public final HttpUrl getCacheUrlOverride() {
        return this.cacheUrlOverride;
    }

    @NotNull
    /* JADX INFO: renamed from: getTags$okhttp, reason: from getter */
    public final Tags getTags() {
        return this.tags;
    }

    @Nullable
    public final String header(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.get(name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NotNull
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    @NotNull
    public final String method() {
        return this.method;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final /* synthetic */ <T> T reifiedTag() {
        Intrinsics.m31986i(4, "T");
        return (T) tag(C7731d0.m32002b(Object.class));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Nullable
    public final <T> T tag(@NotNull InterfaceC6567c<T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return (T) C13450a.m49048a(type).cast(this.tags.get(type));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NotNull
    public final String toCurl() {
        return toCurl$default(this, false, 1, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Request{method=");
        sb2.append(this.method);
        sb2.append(", url=");
        sb2.append(this.url);
        if (this.headers.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Pair<? extends String, ? extends String> pair : this.headers) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C7699p.m31901t();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String strM31671a = pair2.m31671a();
                String strM31672b = pair2.m31672b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(strM31671a);
                sb2.append(':');
                if (_UtilCommonKt.isSensitiveHeader(strM31671a)) {
                    strM31672b = "██";
                }
                sb2.append(strM31672b);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!Intrinsics.m31980c(this.tags, EmptyTags.INSTANCE)) {
            sb2.append(", tags=");
            sb2.append(this.tags);
        }
        sb2.append('}');
        return sb2.toString();
    }

    @NotNull
    public final HttpUrl url() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @NotNull
    public final List<String> headers(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.values(name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Nullable
    public final <T> T tag(@NotNull Class<? extends T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return (T) tag(C13450a.m49050c(type));
    }

    /* JADX DEBUG: Class process forced to load method for inline: okhttp3.internal.IsProbablyUtf8Kt.isProbablyUtf8$default(xu.g, long, int, java.lang.Object):boolean */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @NotNull
    public final String toCurl(boolean includeBody) {
        MediaType mediaTypeContentType;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("curl " + shellEscape(this.url.getUrl()));
        RequestBody requestBody = this.body;
        String string = (requestBody == null || (mediaTypeContentType = requestBody.getContentType()) == null) ? null : mediaTypeContentType.toString();
        if (!Intrinsics.m31980c(this.method, (!includeBody || this.body == null) ? "GET" : "POST")) {
            sb2.append(" \\\n  -X " + shellEscape(this.method));
        }
        for (Pair<? extends String, ? extends String> pair : this.headers) {
            String strM31671a = pair.m31671a();
            String strM31672b = pair.m31672b();
            if (string == null || !C7797x.m32294E(strM31671a, "Content-Type", true)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" \\\n  -H ");
                sb3.append(shellEscape(strM31671a + ": " + strM31672b));
                sb2.append(sb3.toString());
            }
        }
        if (string != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(" \\\n  -H ");
            sb4.append(shellEscape("Content-Type: " + string));
            sb2.append(sb4.toString());
        }
        if (includeBody && this.body != null) {
            C12924e c12924e = new C12924e();
            this.body.writeTo(c12924e);
            if (IsProbablyUtf8Kt.isProbablyUtf8$default(c12924e, 0L, 1, null)) {
                sb2.append(" \\\n  --data " + shellEscape(c12924e.mo48008R2()));
            } else {
                sb2.append(" \\\n  --data-binary " + shellEscape(c12924e.mo47997F2().mo48106r()));
            }
        }
        return sb2.toString();
    }

    @Nullable
    public final Object tag() {
        return tag(C7731d0.m32002b(Object.class));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
      (r1v0 okhttp3.HttpUrl)
      (wrap okhttp3.Headers:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap okhttp3.Headers:0x0009: INVOKE 
      (wrap okhttp3.Headers$Companion:0x0004: SGET  A[WRAPPED] (LINE:9) okhttp3.Headers.Companion okhttp3.Headers$Companion)
      (wrap java.lang.String[]:0x0007: NEW_ARRAY (0 int) A[WRAPPED] type: java.lang.String[])
     VIRTUAL call: okhttp3.Headers.Companion.of(java.lang.String[]):okhttp3.Headers A[MD:(java.lang.String[]):okhttp3.Headers VARARG (m), VARARG_CALL, WRAPPED] (LINE:9)) : (r2v0 okhttp3.Headers))
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x000d: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (" ") : (r3v0 java.lang.String))
      (wrap okhttp3.RequestBody:?: TERNARY null = ((wrap int:0x0013: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null okhttp3.RequestBody) : (r4v0 okhttp3.RequestBody))
     A[MD:(okhttp3.HttpUrl, okhttp3.Headers, java.lang.String, okhttp3.RequestBody):void (m)] (LINE:11) call: okhttp3.Request.<init>(okhttp3.HttpUrl, okhttp3.Headers, java.lang.String, okhttp3.RequestBody):void type: THIS */
    public /* synthetic */ Request(HttpUrl httpUrl, Headers headers, String str, RequestBody requestBody, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpUrl, (i10 & 2) != 0 ? Headers.INSTANCE.m38578of(new String[0]) : headers, (i10 & 4) != 0 ? "\u0000" : str, (i10 & 8) != 0 ? null : requestBody);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Request(@NotNull HttpUrl url, @NotNull Headers headers, @NotNull String method, @Nullable RequestBody requestBody) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(method, "method");
        Builder builderHeaders = new Builder().url(url).headers(headers);
        if (Intrinsics.m31980c(method, "\u0000")) {
            if (requestBody != null) {
                method = "POST";
            } else {
                method = "GET";
            }
        }
        this(builderHeaders.method(method, requestBody));
    }
}
