package dw;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import ew.e;
import ew.g;
import ew.p;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import mv.a0;
import mv.b0;
import mv.f0;
import mv.g0;
import mv.h0;
import mv.i0;
import mv.k;
import mv.y;
import mv.z;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.collections.q0;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\b\u0018\u0000 \b2\u00020\u0001:\u0003\u001f\u0019\u001cB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010#R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010(\"\u0004\b\u0007\u0010)¨\u0006*"}, d2 = {"Ldw/a;", "Lmv/a0;", "Ldw/a$c;", "logger", "<init>", "(Ldw/a$c;)V", "Ldw/a$b;", "level", "e", "(Ldw/a$b;)Ldw/a;", "Lmv/a0$a;", "chain", "Lmv/h0;", "intercept", "(Lmv/a0$a;)Lmv/h0;", "Lmv/z;", "url", BuildConfig.FLAVOR, "d", "(Lmv/z;)Ljava/lang/String;", "Lmv/y;", "headers", BuildConfig.FLAVOR, "i", BuildConfig.FLAVOR, "c", "(Lmv/y;I)V", BuildConfig.FLAVOR, "a", "(Lmv/y;)Z", Payload.RESPONSE, "b", "(Lmv/h0;)Z", "Ldw/a$c;", BuildConfig.FLAVOR, "Ljava/util/Set;", "headersToRedact", "queryParamsNameToRedact", "Ldw/a$b;", "getLevel", "()Ldw/a$b;", "(Ldw/a$b;)V", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public volatile Set<String> headersToRedact;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public volatile Set<String> queryParamsNameToRedact;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public volatile b level;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Ldw/a$b;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        NONE,
        BASIC,
        HEADERS,
        BODY;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ hu.a f12978f = hu.b.a(a());
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Ldw/a$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;)V", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        void a(@NotNull String message);
    }

    public a(@NotNull c logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        this.headersToRedact = q0.d();
        this.queryParamsNameToRedact = q0.d();
        this.level = b.NONE;
    }

    public final boolean a(y headers) {
        String strA = headers.a("Content-Encoding");
        return (strA == null || x.E(strA, "identity", true) || x.E(strA, "gzip", true)) ? false : true;
    }

    public final boolean b(h0 response) {
        b0 f24653d = response.getBody().getMediaType();
        return f24653d != null && Intrinsics.c(f24653d.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), Text.type) && Intrinsics.c(f24653d.getSubtype(), "event-stream");
    }

    public final void c(y headers, int i10) {
        String strG = this.headersToRedact.contains(headers.c(i10)) ? "██" : headers.g(i10);
        this.logger.a(headers.c(i10) + ": " + strG);
    }

    @NotNull
    public final String d(@NotNull z url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.queryParamsNameToRedact.isEmpty() || url.q() == 0) {
            return url.getUrl();
        }
        z.a aVarQ = url.j().q(null);
        int iQ = url.q();
        for (int i10 = 0; i10 < iQ; i10++) {
            String strO = url.o(i10);
            aVarQ.a(strO, this.queryParamsNameToRedact.contains(strO) ? "██" : url.p(i10));
        }
        return aVarQ.toString();
    }

    @NotNull
    public final a e(@NotNull b level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.level = level;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x010b A[LOOP:0: B:42:0x0109->B:43:0x010b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0117  */
    @Override // mv.a0
    @NotNull
    public h0 intercept(@NotNull a0.a chain) throws Exception {
        String string;
        boolean z10;
        char c10;
        Long l10;
        int size;
        int i10;
        Long lValueOf;
        Intrinsics.checkNotNullParameter(chain, "chain");
        b bVar = this.level;
        f0 request = chain.getRequest();
        if (bVar == b.NONE) {
            return chain.a(request);
        }
        boolean z11 = bVar == b.BODY;
        boolean z12 = z11 || bVar == b.HEADERS;
        g0 body = request.getBody();
        k kVarB = chain.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--> ");
        sb2.append(request.getMethod());
        sb2.append(' ');
        sb2.append(d(request.getUrl()));
        if (kVarB != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(' ');
            sb3.append(kVarB.getProtocol());
            string = sb3.toString();
        } else {
            string = BuildConfig.FLAVOR;
        }
        sb2.append(string);
        String string2 = sb2.toString();
        if (!z12 && body != null) {
            string2 = string2 + " (" + body.a() + "-byte body)";
        }
        this.logger.a(string2);
        if (z12) {
            y headers = request.getHeaders();
            if (body != null) {
                b0 f24606c = body.getMediaType();
                if (f24606c != null && headers.a("Content-Type") == null) {
                    this.logger.a("Content-Type: " + f24606c);
                }
                if (body.a() != -1 && headers.a("Content-Length") == null) {
                    this.logger.a("Content-Length: " + body.a());
                }
                size = headers.size();
                for (i10 = 0; i10 < size; i10++) {
                    c(headers, i10);
                }
                if (z11 != 0 || body == null) {
                    z10 = z11;
                    this.logger.a("--> END " + request.getMethod());
                } else {
                    if (a(request.getHeaders())) {
                        this.logger.a("--> END " + request.getMethod() + " (encoded body omitted)");
                    } else if (body.f()) {
                        this.logger.a("--> END " + request.getMethod() + " (duplex request body omitted)");
                    } else if (body.g()) {
                        this.logger.a("--> END " + request.getMethod() + " (one-shot body omitted)");
                    } else {
                        e eVar = new e();
                        body.h(eVar);
                        if (x.E("gzip", headers.a("Content-Encoding"), true)) {
                            lValueOf = Long.valueOf(eVar.getSize());
                            p pVar = new p(eVar);
                            try {
                                eVar = new e();
                                eVar.h3(pVar);
                                lu.c.a(pVar, null);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    lu.c.a(pVar, th2);
                                    throw th3;
                                }
                            }
                        } else {
                            lValueOf = null;
                        }
                        Charset charsetA = nv.b.a(body.getMediaType());
                        this.logger.a(BuildConfig.FLAVOR);
                        z10 = z11;
                        if (!nv.c.a(eVar, 16L)) {
                            this.logger.a("--> END " + request.getMethod() + " (binary " + body.a() + "-byte body omitted)");
                        } else if (lValueOf != null) {
                            this.logger.a("--> END " + request.getMethod() + " (" + eVar.getSize() + "-byte, " + lValueOf.longValue() + "-gzipped-byte body)");
                        } else {
                            this.logger.a(eVar.C2(charsetA));
                            this.logger.a("--> END " + request.getMethod() + " (" + body.a() + "-byte body)");
                        }
                    }
                    z10 = z11;
                }
            } else {
                z12 = z12;
            }
            size = headers.size();
            while (i10 < size) {
                c(headers, i10);
            }
            if (z11 != 0) {
                z10 = z11;
                this.logger.a("--> END " + request.getMethod());
            } else {
                z10 = z11;
                this.logger.a("--> END " + request.getMethod());
            }
        } else {
            z12 = z12;
            request = request;
            z10 = z11;
        }
        long jNanoTime = System.nanoTime();
        try {
            h0 h0VarA = chain.a(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            i0 body2 = h0VarA.getBody();
            Intrinsics.checkNotNull(body2);
            long contentLength = body2.getContentLength();
            String str = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
            c cVar = this.logger;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<-- " + h0VarA.getCode());
            if (h0VarA.getMessage().length() > 0) {
                StringBuilder sb5 = new StringBuilder();
                c10 = ' ';
                sb5.append(' ');
                sb5.append(h0VarA.getMessage());
                sb4.append(sb5.toString());
            } else {
                c10 = ' ';
            }
            sb4.append(c10 + d(h0VarA.getRequest().getUrl()) + " (" + millis + "ms");
            if (!z12) {
                sb4.append(", " + str + " body");
            }
            sb4.append(")");
            cVar.a(sb4.toString());
            if (z12) {
                y headers2 = h0VarA.getHeaders();
                int size2 = headers2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c(headers2, i11);
                }
                if (z10 && sv.e.b(h0VarA)) {
                    if (a(h0VarA.getHeaders())) {
                        this.logger.a("<-- END HTTP (encoded body omitted)");
                        return h0VarA;
                    }
                    if (b(h0VarA)) {
                        this.logger.a("<-- END HTTP (streaming)");
                        return h0VarA;
                    }
                    g source = body2.getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String();
                    source.request(Long.MAX_VALUE);
                    long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                    e eVarL = source.getBufferField();
                    if (x.E("gzip", headers2.a("Content-Encoding"), true)) {
                        Long lValueOf2 = Long.valueOf(eVarL.getSize());
                        p pVar2 = new p(eVarL.clone());
                        try {
                            eVarL = new e();
                            eVarL.h3(pVar2);
                            lu.c.a(pVar2, null);
                            l10 = lValueOf2;
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                lu.c.a(pVar2, th4);
                                throw th5;
                            }
                        }
                    } else {
                        l10 = null;
                    }
                    Charset charsetA2 = nv.b.a(body2.getMediaType());
                    if (!nv.c.a(eVarL, 16L)) {
                        this.logger.a(BuildConfig.FLAVOR);
                        this.logger.a("<-- END HTTP (" + millis2 + "ms, binary " + eVarL.getSize() + "-byte body omitted)");
                        return h0VarA;
                    }
                    if (contentLength != 0) {
                        this.logger.a(BuildConfig.FLAVOR);
                        this.logger.a(eVarL.clone().C2(charsetA2));
                    }
                    c cVar2 = this.logger;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("<-- END HTTP (" + millis2 + "ms, " + eVarL.getSize() + "-byte");
                    if (l10 != null) {
                        sb6.append(", " + l10.longValue() + "-gzipped-byte");
                    }
                    sb6.append(" body)");
                    cVar2.a(sb6.toString());
                    return h0VarA;
                }
                this.logger.a("<-- END HTTP");
            }
            return h0VarA;
        } catch (Exception e10) {
            long millis3 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            c cVar3 = this.logger;
            StringBuilder sb7 = new StringBuilder();
            sb7.append("<-- HTTP FAILED: " + e10 + '.');
            sb7.append(' ' + d(request.getUrl()) + " (" + millis3 + "ms)");
            cVar3.a(sb7.toString());
            throw e10;
        }
    }
}
