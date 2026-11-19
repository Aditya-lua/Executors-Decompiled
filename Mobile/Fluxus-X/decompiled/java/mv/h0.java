package mv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import java.io.Closeable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001.B\u008d\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001e\u001a\u00020\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b'\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b;\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b2\u0010ER\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007¢\u0006\f\n\u0004\b>\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bM\u0010J\u001a\u0004\b9\u0010LR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bN\u0010J\u001a\u0004\bO\u0010LR\u0017\u0010\u0016\u001a\u00020\u00158\u0007¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u0017\u001a\u00020\u00158\u0007¢\u0006\f\n\u0004\b \u0010Q\u001a\u0004\bT\u0010SR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0001X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bC\u0010WR\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010XR$\u0010_\u001a\u0004\u0018\u00010Y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0017\u0010c\u001a\u00020`8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010e\u001a\u00020`8\u0006¢\u0006\f\n\u0004\bK\u0010b\u001a\u0004\be\u0010dR\u0011\u0010f\u001a\u00020Y8G¢\u0006\u0006\u001a\u0004\b6\u0010\\¨\u0006g"}, d2 = {"Lmv/h0;", "Ljava/io/Closeable;", "Lmv/f0;", "request", "Lmv/e0;", "protocol", BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, "code", "Lmv/x;", "handshake", "Lmv/y;", "headers", "Lmv/i0;", "body", "Lew/k0;", "socket", "networkResponse", "cacheResponse", "priorResponse", BuildConfig.FLAVOR, "sentRequestAtMillis", "receivedResponseAtMillis", "Lrv/h;", "exchange", "Lmv/l0;", "trailersSource", "<init>", "(Lmv/f0;Lmv/e0;Ljava/lang/String;ILmv/x;Lmv/y;Lmv/i0;Lew/k0;Lmv/h0;Lmv/h0;Lmv/h0;JJLrv/h;Lmv/l0;)V", "name", "defaultValue", "m", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lmv/h0$a;", "s", "()Lmv/h0$a;", BuildConfig.FLAVOR, "Lmv/i;", "e", "()Ljava/util/List;", BuildConfig.FLAVOR, "close", "()V", "toString", "()Ljava/lang/String;", "a", "Lmv/f0;", "z", "()Lmv/f0;", "b", "Lmv/e0;", "w", "()Lmv/e0;", "c", "Ljava/lang/String;", "p", "d", "I", "f", "()I", "Lmv/x;", "h", "()Lmv/x;", "Lmv/y;", "o", "()Lmv/y;", "g", "Lmv/i0;", "()Lmv/i0;", "Lew/k0;", "E", "()Lew/k0;", "i", "Lmv/h0;", "r", "()Lmv/h0;", "j", "k", "u", "l", "J", "A", "()J", "y", "n", "Lrv/h;", "()Lrv/h;", "Lmv/l0;", "Lmv/d;", "Lmv/d;", "getLazyCacheControl$okhttp", "()Lmv/d;", "setLazyCacheControl$okhttp", "(Lmv/d;)V", "lazyCacheControl", BuildConfig.FLAVOR, "q", "Z", "isSuccessful", "()Z", "isRedirect", "cacheControl", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f0 request;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final e0 protocol;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final int code;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final x handshake;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y headers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i0 body;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ew.k0 socket;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final h0 networkResponse;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final h0 cacheResponse;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final h0 priorResponse;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final long sentRequestAtMillis;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final long receivedResponseAtMillis;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final rv.h exchange;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public l0 trailersSource;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d lazyCacheControl;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final boolean isSuccessful;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final boolean isRedirect;

    public h0(@NotNull f0 request, @NotNull e0 protocol, @NotNull String message, int i10, @Nullable x xVar, @NotNull y headers, @NotNull i0 body, @Nullable ew.k0 k0Var, @Nullable h0 h0Var, @Nullable h0 h0Var2, @Nullable h0 h0Var3, long j10, long j11, @Nullable rv.h hVar, @NotNull l0 trailersSource) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(trailersSource, "trailersSource");
        this.request = request;
        this.protocol = protocol;
        this.message = message;
        this.code = i10;
        this.handshake = xVar;
        this.headers = headers;
        this.body = body;
        this.socket = k0Var;
        this.networkResponse = h0Var;
        this.cacheResponse = h0Var2;
        this.priorResponse = h0Var3;
        this.sentRequestAtMillis = j10;
        this.receivedResponseAtMillis = j11;
        this.exchange = hVar;
        this.trailersSource = trailersSource;
        boolean z10 = true;
        this.isSuccessful = 200 <= i10 && i10 < 300;
        if (i10 != 307 && i10 != 308) {
            switch (i10) {
                case MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE /* 300 */:
                case MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE /* 301 */:
                case 302:
                case 303:
                    break;
                default:
                    z10 = false;
                    break;
            }
        }
        this.isRedirect = z10;
    }

    public static /* synthetic */ String n(h0 h0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return h0Var.m(str, str2);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @Nullable
    /* JADX INFO: renamed from: E, reason: from getter */
    public final ew.k0 getSocket() {
        return this.socket;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final i0 getBody() {
        return this.body;
    }

    @NotNull
    public final d c() {
        d dVar = this.lazyCacheControl;
        if (dVar != null) {
            return dVar;
        }
        d dVarA = d.INSTANCE.a(this.headers);
        this.lazyCacheControl = dVarA;
        return dVarA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.body.close();
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final h0 getCacheResponse() {
        return this.cacheResponse;
    }

    @NotNull
    public final List<i> e() {
        String str;
        y yVar = this.headers;
        int i10 = this.code;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return p001kotlin.collections.p.k();
            }
            str = "Proxy-Authenticate";
        }
        return sv.e.a(yVar, str);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final rv.h getExchange() {
        return this.exchange;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final x getHandshake() {
        return this.handshake;
    }

    /* JADX INFO: renamed from: isSuccessful, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    @Nullable
    public final String k(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return n(this, name, null, 2, null);
    }

    @Nullable
    public final String m(@NotNull String name, @Nullable String defaultValue) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strA = this.headers.a(name);
        return strA == null ? defaultValue : strA;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final y getHeaders() {
        return this.headers;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: r, reason: from getter */
    public final h0 getNetworkResponse() {
        return this.networkResponse;
    }

    @NotNull
    public final a s() {
        return new a(this);
    }

    @NotNull
    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.getUrl() + '}';
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final h0 getPriorResponse() {
        return this.priorResponse;
    }

    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public final e0 getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @NotNull
    /* JADX INFO: renamed from: z, reason: from getter */
    public final f0 getRequest() {
        return this.request;
    }

    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b'\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J!\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b3\u00101J\u0019\u00105\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b5\u00101J\u0017\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00002\u0006\u0010>\u001a\u00020:H\u0016¢\u0006\u0004\b?\u0010=J\u0017\u0010B\u001a\u00020\t2\u0006\u0010A\u001a\u00020@H\u0000¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0004H\u0016¢\u0006\u0004\bD\u0010ER$\u0010\r\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010$\u001a\u00020_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010(\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010,\u001a\u0004\u0018\u00010+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u0010/\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010o\u001a\u0004\bp\u0010E\"\u0004\bq\u0010\u0006R$\u00102\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010o\u001a\u0004\br\u0010E\"\u0004\bs\u0010\u0006R$\u00104\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010o\u001a\u0004\bt\u0010E\"\u0004\bu\u0010\u0006R\"\u0010;\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010>\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010v\u001a\u0004\b{\u0010x\"\u0004\b|\u0010zR%\u0010A\u001a\u0004\u0018\u00010@8\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b5\u0010}\u001a\u0004\b~\u0010\u007f\"\u0005\b\u0080\u0001\u0010CR'\u00107\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u0086\u0001"}, d2 = {"Lmv/h0$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/h0;", Payload.RESPONSE, "(Lmv/h0;)V", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "e", "(Ljava/lang/String;Lmv/h0;)V", "Lmv/f0;", "request", "q", "(Lmv/f0;)Lmv/h0$a;", "Lmv/e0;", "protocol", "o", "(Lmv/e0;)Lmv/h0$a;", BuildConfig.FLAVOR, "code", "f", "(I)Lmv/h0$a;", "message", "l", "(Ljava/lang/String;)Lmv/h0$a;", "Lmv/x;", "handshake", "h", "(Lmv/x;)Lmv/h0$a;", "value", "i", "(Ljava/lang/String;Ljava/lang/String;)Lmv/h0$a;", "a", "Lmv/y;", "headers", "j", "(Lmv/y;)Lmv/h0$a;", "Lmv/i0;", "body", "b", "(Lmv/i0;)Lmv/h0$a;", "Lew/k0;", "socket", "s", "(Lew/k0;)Lmv/h0$a;", "networkResponse", "m", "(Lmv/h0;)Lmv/h0$a;", "cacheResponse", "d", "priorResponse", "n", "Lmv/l0;", "trailersSource", "t", "(Lmv/l0;)Lmv/h0$a;", BuildConfig.FLAVOR, "sentRequestAtMillis", "r", "(J)Lmv/h0$a;", "receivedResponseAtMillis", "p", "Lrv/h;", "exchange", "k", "(Lrv/h;)V", "c", "()Lmv/h0;", "Lmv/f0;", "getRequest$okhttp", "()Lmv/f0;", "setRequest$okhttp", "(Lmv/f0;)V", "Lmv/e0;", "getProtocol$okhttp", "()Lmv/e0;", "setProtocol$okhttp", "(Lmv/e0;)V", "I", "g", "()I", "setCode$okhttp", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "Lmv/x;", "getHandshake$okhttp", "()Lmv/x;", "setHandshake$okhttp", "(Lmv/x;)V", "Lmv/y$a;", "Lmv/y$a;", "getHeaders$okhttp", "()Lmv/y$a;", "setHeaders$okhttp", "(Lmv/y$a;)V", "Lmv/i0;", "getBody$okhttp", "()Lmv/i0;", "setBody$okhttp", "(Lmv/i0;)V", "Lew/k0;", "getSocket$okhttp", "()Lew/k0;", "setSocket$okhttp", "(Lew/k0;)V", "Lmv/h0;", "getNetworkResponse$okhttp", "setNetworkResponse$okhttp", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "Lrv/h;", "getExchange$okhttp", "()Lrv/h;", "setExchange$okhttp", "Lmv/l0;", "getTrailersSource$okhttp", "()Lmv/l0;", "setTrailersSource$okhttp", "(Lmv/l0;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public f0 request;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public e0 protocol;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int code;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String message;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public x handshake;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public y.a headers;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public i0 body;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public ew.k0 socket;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public h0 networkResponse;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public h0 cacheResponse;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public h0 priorResponse;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public long sentRequestAtMillis;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        public long receivedResponseAtMillis;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public rv.h exchange;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public l0 trailersSource;

        public a() {
            this.code = -1;
            this.body = i0.f24648c;
            this.trailersSource = l0.b;
            this.headers = new y.a();
        }

        @NotNull
        public a a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.a(name, value);
            return this;
        }

        @NotNull
        public a b(@NotNull i0 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            this.body = body;
            return this;
        }

        @NotNull
        public h0 c() {
            int i10 = this.code;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            f0 f0Var = this.request;
            if (f0Var == null) {
                throw new IllegalStateException("request == null");
            }
            e0 e0Var = this.protocol;
            if (e0Var == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.message;
            if (str != null) {
                return new h0(f0Var, e0Var, str, i10, this.handshake, this.headers.f(), this.body, this.socket, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange, this.trailersSource);
            }
            throw new IllegalStateException("message == null");
        }

        @NotNull
        public a d(@Nullable h0 cacheResponse) {
            e("cacheResponse", cacheResponse);
            this.cacheResponse = cacheResponse;
            return this;
        }

        public final void e(String name, h0 response) {
            if (response != null) {
                if (response.getNetworkResponse() != null) {
                    throw new IllegalArgumentException((name + ".networkResponse != null").toString());
                }
                if (response.getCacheResponse() != null) {
                    throw new IllegalArgumentException((name + ".cacheResponse != null").toString());
                }
                if (response.getPriorResponse() == null) {
                    return;
                }
                throw new IllegalArgumentException((name + ".priorResponse != null").toString());
            }
        }

        @NotNull
        public a f(int code) {
            this.code = code;
            return this;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @NotNull
        public a h(@Nullable x handshake) {
            this.handshake = handshake;
            return this;
        }

        @NotNull
        public a i(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.j(name, value);
            return this;
        }

        @NotNull
        public a j(@NotNull y headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers.e();
            return this;
        }

        public final void k(@NotNull rv.h exchange) {
            Intrinsics.checkNotNullParameter(exchange, "exchange");
            this.exchange = exchange;
        }

        @NotNull
        public a l(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            return this;
        }

        @NotNull
        public a m(@Nullable h0 networkResponse) {
            e("networkResponse", networkResponse);
            this.networkResponse = networkResponse;
            return this;
        }

        @NotNull
        public a n(@Nullable h0 priorResponse) {
            this.priorResponse = priorResponse;
            return this;
        }

        @NotNull
        public a o(@NotNull e0 protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        @NotNull
        public a p(long receivedResponseAtMillis) {
            this.receivedResponseAtMillis = receivedResponseAtMillis;
            return this;
        }

        @NotNull
        public a q(@NotNull f0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
            return this;
        }

        @NotNull
        public a r(long sentRequestAtMillis) {
            this.sentRequestAtMillis = sentRequestAtMillis;
            return this;
        }

        @NotNull
        public a s(@NotNull ew.k0 socket) {
            Intrinsics.checkNotNullParameter(socket, "socket");
            this.socket = socket;
            return this;
        }

        @NotNull
        public a t(@NotNull l0 trailersSource) {
            Intrinsics.checkNotNullParameter(trailersSource, "trailersSource");
            this.trailersSource = trailersSource;
            return this;
        }

        public a(@NotNull h0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.code = -1;
            this.body = i0.f24648c;
            this.trailersSource = l0.b;
            this.request = response.getRequest();
            this.protocol = response.getProtocol();
            this.code = response.getCode();
            this.message = response.getMessage();
            this.handshake = response.getHandshake();
            this.headers = response.getHeaders().e();
            this.body = response.getBody();
            this.socket = response.getSocket();
            this.networkResponse = response.getNetworkResponse();
            this.cacheResponse = response.getCacheResponse();
            this.priorResponse = response.getPriorResponse();
            this.sentRequestAtMillis = response.getSentRequestAtMillis();
            this.receivedResponseAtMillis = response.getReceivedResponseAtMillis();
            this.exchange = response.getExchange();
            this.trailersSource = response.trailersSource;
        }
    }
}
