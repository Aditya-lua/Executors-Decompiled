package okhttp3.logging;

import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C7702q0;
import kotlin.collections.C7708u;
import kotlin.jvm.internal.C7737g0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.IsProbablyUtf8Kt;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p477ut.C11958c;
import p560xu.C12924e;
import p560xu.C12952s;
import p560xu.InterfaceC12928g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 *2\u00020\u0001:\u0003()*B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\u001f\u0010\u0012\u001a\u00020\u00102\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0013\"\u00020\b¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\r\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eJ\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u00020\u000b@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\n\u0010\u000e¨\u0006+"}, m31665d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "headersToRedact", "", "", "queryParamsNameToRedact", "level", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getLevel", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "redactHeader", "", "name", "redactQueryParams", "", "([Ljava/lang/String;)V", "setLevel", "-deprecated_level", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "redactUrl", "url", "Lokhttp3/HttpUrl;", "redactUrl$logging_interceptor", "logHeader", "headers", "Lokhttp3/Headers;", "i", "", "bodyHasUnknownEncoding", "", "bodyIsStreaming", Payload.RESPONSE, "Level", "Logger", "Companion", "logging-interceptor"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class HttpLoggingInterceptor implements Interceptor {

    @NotNull
    private volatile Set<String> headersToRedact;

    @NotNull
    private volatile Level level;

    @NotNull
    private final Logger logger;

    @NotNull
    private volatile Set<String> queryParamsNameToRedact;

    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m31665d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "logging-interceptor"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY;

        private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

        @NotNull
        public static InterfaceC10707a<Level> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m31665d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "log", "", "message", "", "Companion", "logging-interceptor"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface Logger {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @NotNull
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0007"}, m31665d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "<init>", "()V", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DefaultLogger", "logging-interceptor"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m31665d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "()V", "log", "", "message", "", "logging-interceptor"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(@NotNull String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    Platform.log$default(Platform.INSTANCE.get(), message, 0, null, 6, null);
                }
            }

            private Companion() {
            }
        }

        void log(@NotNull String message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || C7797x.m32294E(str, "identity", true) || C7797x.m32294E(str, "gzip", true)) ? false : true;
    }

    private final boolean bodyIsStreaming(Response response) {
        MediaType mediaType = response.body().getMediaType();
        return mediaType != null && Intrinsics.m31980c(mediaType.type(), Text.type) && Intrinsics.m31980c(mediaType.subtype(), "event-stream");
    }

    private final void logHeader(Headers headers, int i10) {
        String strValue = this.headersToRedact.contains(headers.name(i10)) ? "██" : headers.value(i10);
        this.logger.log(headers.name(i10) + ": " + strValue);
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_level, reason: not valid java name and from getter */
    public final Level getLevel() {
        return this.level;
    }

    @NotNull
    public final Level getLevel() {
        return this.level;
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: 32, (wrap okhttp3.Protocol:INVOKE) */
    /* JADX WARN: Code duplicated, block: B:43:0x010b A[LOOP:0: B:42:0x0109->B:43:0x010b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0117  */
    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws Exception {
        String string;
        boolean z10;
        char c10;
        Long l10;
        int size;
        int i10;
        Long lValueOf;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z11 = level == Level.BODY;
        boolean z12 = z11 || level == Level.HEADERS;
        RequestBody requestBodyBody = request.body();
        Connection connection = chain.connection();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--> ");
        sb2.append(request.method());
        sb2.append(' ');
        sb2.append(redactUrl$logging_interceptor(request.url()));
        if (connection != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(' ');
            sb3.append(connection.getProtocol());
            string = sb3.toString();
        } else {
            string = "";
        }
        sb2.append(string);
        String string2 = sb2.toString();
        if (!z12 && requestBodyBody != null) {
            string2 = string2 + " (" + requestBodyBody.contentLength() + "-byte body)";
        }
        this.logger.log(string2);
        if (z12) {
            Headers headers = request.headers();
            if (requestBodyBody != null) {
                MediaType mediaType = requestBodyBody.getMediaType();
                if (mediaType != null && headers.get("Content-Type") == null) {
                    this.logger.log("Content-Type: " + mediaType);
                }
                if (requestBodyBody.contentLength() != -1 && headers.get("Content-Length") == null) {
                    this.logger.log("Content-Length: " + requestBodyBody.contentLength());
                }
                size = headers.size();
                for (i10 = 0; i10 < size; i10++) {
                    logHeader(headers, i10);
                }
                if (z11 != 0 || requestBodyBody == null) {
                    z10 = z11;
                    this.logger.log("--> END " + request.method());
                } else {
                    if (bodyHasUnknownEncoding(request.headers())) {
                        this.logger.log("--> END " + request.method() + " (encoded body omitted)");
                    } else if (requestBodyBody.isDuplex()) {
                        this.logger.log("--> END " + request.method() + " (duplex request body omitted)");
                    } else if (requestBodyBody.isOneShot()) {
                        this.logger.log("--> END " + request.method() + " (one-shot body omitted)");
                    } else {
                        C12924e c12924e = new C12924e();
                        requestBodyBody.writeTo(c12924e);
                        if (C7797x.m32294E("gzip", headers.get("Content-Encoding"), true)) {
                            lValueOf = Long.valueOf(c12924e.getSize());
                            C12952s c12952s = new C12952s(c12924e);
                            try {
                                c12924e = new C12924e();
                                c12924e.mo48028g2(c12952s);
                                C11958c.m44629a(c12952s, null);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    C11958c.m44629a(c12952s, th2);
                                    throw th3;
                                }
                            }
                        } else {
                            lValueOf = null;
                        }
                        Charset charsetCharsetOrUtf8 = Internal.charsetOrUtf8(requestBodyBody.getMediaType());
                        this.logger.log("");
                        z10 = z11;
                        if (!IsProbablyUtf8Kt.isProbablyUtf8(c12924e, 16L)) {
                            this.logger.log("--> END " + request.method() + " (binary " + requestBodyBody.contentLength() + "-byte body omitted)");
                        } else if (lValueOf != null) {
                            this.logger.log("--> END " + request.method() + " (" + c12924e.getSize() + "-byte, " + lValueOf.longValue() + "-gzipped-byte body)");
                        } else {
                            this.logger.log(c12924e.mo48059z2(charsetCharsetOrUtf8));
                            this.logger.log("--> END " + request.method() + " (" + requestBodyBody.contentLength() + "-byte body)");
                        }
                    }
                    z10 = z11;
                }
            } else {
                z12 = z12;
            }
            size = headers.size();
            while (i10 < size) {
                logHeader(headers, i10);
            }
            if (z11 != 0) {
                z10 = z11;
                this.logger.log("--> END " + request.method());
            } else {
                z10 = z11;
                this.logger.log("--> END " + request.method());
            }
        } else {
            z12 = z12;
            request = request;
            z10 = z11;
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBodyBody = responseProceed.body();
            Intrinsics.checkNotNull(responseBodyBody);
            long contentLength = responseBodyBody.getContentLength();
            String str = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
            Logger logger = this.logger;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<-- " + responseProceed.code());
            if (responseProceed.message().length() > 0) {
                StringBuilder sb5 = new StringBuilder();
                c10 = ' ';
                sb5.append(' ');
                sb5.append(responseProceed.message());
                sb4.append(sb5.toString());
            } else {
                c10 = ' ';
            }
            sb4.append(c10 + redactUrl$logging_interceptor(responseProceed.request().url()) + " (" + millis + "ms");
            if (!z12) {
                sb4.append(", " + str + " body");
            }
            sb4.append(")");
            logger.log(sb4.toString());
            if (z12) {
                Headers headers2 = responseProceed.headers();
                int size2 = headers2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    logHeader(headers2, i11);
                }
                if (z10 && HttpHeaders.promisesBody(responseProceed)) {
                    if (bodyHasUnknownEncoding(responseProceed.headers())) {
                        this.logger.log("<-- END HTTP (encoded body omitted)");
                        return responseProceed;
                    }
                    if (bodyIsStreaming(responseProceed)) {
                        this.logger.log("<-- END HTTP (streaming)");
                        return responseProceed;
                    }
                    InterfaceC12928g source = responseBodyBody.getSource();
                    source.request(Long.MAX_VALUE);
                    long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                    C12924e bufferField = source.getBufferField();
                    if (C7797x.m32294E("gzip", headers2.get("Content-Encoding"), true)) {
                        Long lValueOf2 = Long.valueOf(bufferField.getSize());
                        C12952s c12952s2 = new C12952s(bufferField.clone());
                        try {
                            bufferField = new C12924e();
                            bufferField.mo48028g2(c12952s2);
                            C11958c.m44629a(c12952s2, null);
                            l10 = lValueOf2;
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                C11958c.m44629a(c12952s2, th4);
                                throw th5;
                            }
                        }
                    } else {
                        l10 = null;
                    }
                    Charset charsetCharsetOrUtf9 = Internal.charsetOrUtf8(responseBodyBody.getMediaType());
                    if (!IsProbablyUtf8Kt.isProbablyUtf8(bufferField, 16L)) {
                        this.logger.log("");
                        this.logger.log("<-- END HTTP (" + millis2 + "ms, binary " + bufferField.getSize() + "-byte body omitted)");
                        return responseProceed;
                    }
                    if (contentLength != 0) {
                        this.logger.log("");
                        this.logger.log(bufferField.clone().mo48059z2(charsetCharsetOrUtf9));
                    }
                    Logger logger2 = this.logger;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("<-- END HTTP (" + millis2 + "ms, " + bufferField.getSize() + "-byte");
                    if (l10 != null) {
                        sb6.append(", " + l10.longValue() + "-gzipped-byte");
                    }
                    sb6.append(" body)");
                    logger2.log(sb6.toString());
                    return responseProceed;
                }
                this.logger.log("<-- END HTTP");
            }
            return responseProceed;
        } catch (Exception e10) {
            long millis3 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            Logger logger3 = this.logger;
            StringBuilder sb7 = new StringBuilder();
            sb7.append("<-- HTTP FAILED: " + e10 + '.');
            sb7.append(' ' + redactUrl$logging_interceptor(request.url()) + " (" + millis3 + "ms)");
            logger3.log(sb7.toString());
            throw e10;
        }
    }

    public final void level(@NotNull Level level) {
        Intrinsics.checkNotNullParameter(level, "<set-?>");
        this.level = level;
    }

    public final void redactHeader(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        TreeSet treeSet = new TreeSet(C7797x.m32296G(C7737g0.f29434a));
        C7708u.m31931z(treeSet, this.headersToRedact);
        treeSet.add(name);
        this.headersToRedact = treeSet;
    }

    public final void redactQueryParams(@NotNull String... name) {
        Intrinsics.checkNotNullParameter(name, "name");
        TreeSet treeSet = new TreeSet(C7797x.m32296G(C7737g0.f29434a));
        C7708u.m31931z(treeSet, this.queryParamsNameToRedact);
        C7708u.m31920A(treeSet, name);
        this.queryParamsNameToRedact = treeSet;
    }

    @NotNull
    public final String redactUrl$logging_interceptor(@NotNull HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.queryParamsNameToRedact.isEmpty() || url.querySize() == 0) {
            return url.getUrl();
        }
        HttpUrl.Builder builderQuery = url.newBuilder().query(null);
        int iQuerySize = url.querySize();
        for (int i10 = 0; i10 < iQuerySize; i10++) {
            String strQueryParameterName = url.queryParameterName(i10);
            builderQuery.addEncodedQueryParameter(strQueryParameterName, this.queryParamsNameToRedact.contains(strQueryParameterName) ? "██" : url.queryParameterValue(i10));
        }
        return builderQuery.toString();
    }

    @NotNull
    public final HttpLoggingInterceptor setLevel(@NotNull Level level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.level = level;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public HttpLoggingInterceptor(@NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        this.headersToRedact = C7702q0.m31908d();
        this.queryParamsNameToRedact = C7702q0.m31908d();
        this.level = Level.NONE;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
      (wrap okhttp3.logging.HttpLoggingInterceptor$Logger:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap okhttp3.logging.HttpLoggingInterceptor$Logger:0x0004: SGET  A[WRAPPED] (LINE:7) okhttp3.logging.HttpLoggingInterceptor.Logger.DEFAULT okhttp3.logging.HttpLoggingInterceptor$Logger) : (r1v0 okhttp3.logging.HttpLoggingInterceptor$Logger))
     A[MD:(okhttp3.logging.HttpLoggingInterceptor$Logger):void (m)] (LINE:8) call: okhttp3.logging.HttpLoggingInterceptor.<init>(okhttp3.logging.HttpLoggingInterceptor$Logger):void type: THIS */
    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Logger.DEFAULT : logger);
    }
}
