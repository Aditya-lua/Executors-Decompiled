package mv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\b&\u0018\u0000 ^2\u00020\u0001:\u0003_`aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\bJ!\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J1\u0010+\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J9\u0010/\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b5\u00104J\u0017\u00106\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b6\u0010\bJ\u001f\u00109\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010\bJ\u001f\u0010>\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bB\u0010\bJ\u001f\u0010E\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010\bJ\u001f\u0010H\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\bH\u0010?J\u001f\u0010I\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\bI\u0010AJ\u0017\u0010J\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bJ\u0010\bJ\u001f\u0010K\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\bK\u0010AJ\u0017\u0010L\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bL\u0010\bJ\u001f\u0010M\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bM\u0010FJ\u001f\u0010N\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bN\u0010FJ\u0017\u0010O\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bO\u0010\bJ\u001f\u0010Q\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010P\u001a\u00020CH\u0016¢\u0006\u0004\bQ\u0010FJ'\u0010U\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010R\u001a\u00020-2\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ)\u0010Y\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010W\u001a\u00020C2\b\u0010X\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\bY\u0010ZJ\u0018\u0010\\\u001a\u00020\u00002\u0006\u0010[\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\\\u0010]¨\u0006b"}, d2 = {"Lmv/s;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/e;", "call", BuildConfig.FLAVOR, "callStart", "(Lmv/e;)V", "Lmv/q;", "dispatcher", "dispatcherQueueStart", "(Lmv/e;Lmv/q;)V", "dispatcherQueueEnd", "Lmv/z;", "url", "proxySelectStart", "(Lmv/e;Lmv/z;)V", BuildConfig.FLAVOR, "Ljava/net/Proxy;", "proxies", "proxySelectEnd", "(Lmv/e;Lmv/z;Ljava/util/List;)V", BuildConfig.FLAVOR, "domainName", "dnsStart", "(Lmv/e;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(Lmv/e;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "(Lmv/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "secureConnectStart", "Lmv/x;", "handshake", "secureConnectEnd", "(Lmv/e;Lmv/x;)V", "Lmv/e0;", "protocol", "connectEnd", "(Lmv/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lmv/e0;)V", "Ljava/io/IOException;", "ioe", "connectFailed", "(Lmv/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lmv/e0;Ljava/io/IOException;)V", "Lmv/k;", "connection", "connectionAcquired", "(Lmv/e;Lmv/k;)V", "connectionReleased", "requestHeadersStart", "Lmv/f0;", "request", "requestHeadersEnd", "(Lmv/e;Lmv/f0;)V", "requestBodyStart", BuildConfig.FLAVOR, "byteCount", "requestBodyEnd", "(Lmv/e;J)V", "requestFailed", "(Lmv/e;Ljava/io/IOException;)V", "responseHeadersStart", "Lmv/h0;", Payload.RESPONSE, "responseHeadersEnd", "(Lmv/e;Lmv/h0;)V", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "exception", BuildConfig.FLAVOR, "retry", "retryDecision", "(Lmv/e;Ljava/io/IOException;Z)V", "networkResponse", "nextRequest", "followUpDecision", "(Lmv/e;Lmv/h0;Lmv/f0;)V", "other", "plus", "(Lmv/s;)Lmv/s;", "Companion", "d", "c", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class s {

    @NotNull
    public static final s NONE = new b();

    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010\nJ!\u0010)\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J1\u0010-\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00152\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J9\u00101\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00152\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b7\u00106J\u0017\u00108\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u0010\nJ\u001f\u0010;\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010\nJ\u001f\u0010@\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bD\u0010\nJ\u001f\u0010G\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bI\u0010\nJ\u001f\u0010J\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bJ\u0010AJ\u001f\u0010K\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\bK\u0010CJ\u0017\u0010L\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bL\u0010\nJ\u001f\u0010M\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\bM\u0010CJ\u0017\u0010N\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bN\u0010\nJ\u001f\u0010O\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bO\u0010HJ\u001f\u0010P\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bP\u0010HJ\u0017\u0010Q\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bQ\u0010\nJ\u001f\u0010S\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010R\u001a\u00020EH\u0016¢\u0006\u0004\bS\u0010HJ'\u0010W\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010T\u001a\u00020/2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ)\u0010[\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020E2\b\u0010Z\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b[\u0010\\R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`¨\u0006a"}, d2 = {"Lmv/s$a;", "Lmv/s;", BuildConfig.FLAVOR, "eventListeners", "<init>", "([Lmv/s;)V", "Lmv/e;", "call", BuildConfig.FLAVOR, "callStart", "(Lmv/e;)V", "Lmv/q;", "dispatcher", "dispatcherQueueStart", "(Lmv/e;Lmv/q;)V", "dispatcherQueueEnd", "Lmv/z;", "url", "proxySelectStart", "(Lmv/e;Lmv/z;)V", BuildConfig.FLAVOR, "Ljava/net/Proxy;", "proxies", "proxySelectEnd", "(Lmv/e;Lmv/z;Ljava/util/List;)V", BuildConfig.FLAVOR, "domainName", "dnsStart", "(Lmv/e;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(Lmv/e;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "connectStart", "(Lmv/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "secureConnectStart", "Lmv/x;", "handshake", "secureConnectEnd", "(Lmv/e;Lmv/x;)V", "Lmv/e0;", "protocol", "connectEnd", "(Lmv/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lmv/e0;)V", "Ljava/io/IOException;", "ioe", "connectFailed", "(Lmv/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lmv/e0;Ljava/io/IOException;)V", "Lmv/k;", "connection", "connectionAcquired", "(Lmv/e;Lmv/k;)V", "connectionReleased", "requestHeadersStart", "Lmv/f0;", "request", "requestHeadersEnd", "(Lmv/e;Lmv/f0;)V", "requestBodyStart", BuildConfig.FLAVOR, "byteCount", "requestBodyEnd", "(Lmv/e;J)V", "requestFailed", "(Lmv/e;Ljava/io/IOException;)V", "responseHeadersStart", "Lmv/h0;", Payload.RESPONSE, "responseHeadersEnd", "(Lmv/e;Lmv/h0;)V", "responseBodyStart", "responseBodyEnd", "responseFailed", "callEnd", "callFailed", "canceled", "satisfactionFailure", "cacheHit", "cacheMiss", "cachedResponse", "cacheConditionalHit", "exception", BuildConfig.FLAVOR, "retry", "retryDecision", "(Lmv/e;Ljava/io/IOException;Z)V", "networkResponse", "nextRequest", "followUpDecision", "(Lmv/e;Lmv/h0;Lmv/f0;)V", "b", "[Lmv/s;", "a", "()[Lmv/s;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends s {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final s[] eventListeners;

        public a(@NotNull s[] eventListeners) {
            Intrinsics.checkNotNullParameter(eventListeners, "eventListeners");
            this.eventListeners = eventListeners;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final s[] getEventListeners() {
            return this.eventListeners;
        }

        @Override // mv.s
        public void cacheConditionalHit(@NotNull e call, @NotNull h0 cachedResponse) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
            for (s sVar : this.eventListeners) {
                sVar.cacheConditionalHit(call, cachedResponse);
            }
        }

        @Override // mv.s
        public void cacheHit(@NotNull e call, @NotNull h0 response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            for (s sVar : this.eventListeners) {
                sVar.cacheHit(call, response);
            }
        }

        @Override // mv.s
        public void cacheMiss(@NotNull e call) {
            Intrinsics.checkNotNullParameter(call, "call");
            for (s sVar : this.eventListeners) {
                sVar.cacheMiss(call);
            }
        }

        @Override // mv.s
        public void callEnd(@NotNull e call) {
            Intrinsics.checkNotNullParameter(call, "call");
            for (s sVar : this.eventListeners) {
                sVar.callEnd(call);
            }
        }

        @Override // mv.s
        public void callFailed(@NotNull e call, @NotNull IOException ioe) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            for (s sVar : this.eventListeners) {
                sVar.callFailed(call, ioe);
            }
        }

        @Override // mv.s
        public void callStart(@NotNull e call) {
            Intrinsics.checkNotNullParameter(call, "call");
            for (s sVar : this.eventListeners) {
                sVar.callStart(call);
            }
        }

        @Override // mv.s
        public void canceled(@NotNull e call) {
            Intrinsics.checkNotNullParameter(call, "call");
            for (s sVar : this.eventListeners) {
                sVar.canceled(call);
            }
        }

        @Override // mv.s
        public void connectEnd(@NotNull e call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable e0 protocol) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            for (s sVar : this.eventListeners) {
                sVar.connectEnd(call, inetSocketAddress, proxy, protocol);
            }
        }

        @Override // mv.s
        public void connectFailed(@NotNull e call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable e0 protocol, @NotNull IOException ioe) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            for (s sVar : this.eventListeners) {
                sVar.connectFailed(call, inetSocketAddress, proxy, protocol, ioe);
            }
        }

        @Override // mv.s
        public void connectStart(@NotNull e call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            for (s sVar : this.eventListeners) {
                sVar.connectStart(call, inetSocketAddress, proxy);
            }
        }

        @Override // mv.s
        public void connectionAcquired(@NotNull e call, @NotNull k connection) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(connection, "connection");
            for (s sVar : this.eventListeners) {
                sVar.connectionAcquired(call, connection);
            }
        }

        @Override // mv.s
        public void connectionReleased(@NotNull e call, @NotNull k connection) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(connection, "connection");
            for (s sVar : this.eventListeners) {
                sVar.connectionReleased(call, connection);
            }
        }

        @Override // mv.s
        public void dispatcherQueueEnd(@NotNull e call, @NotNull q dispatcher) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            for (s sVar : this.eventListeners) {
                sVar.dispatcherQueueEnd(call, dispatcher);
            }
        }

        @Override // mv.s
        public void dispatcherQueueStart(@NotNull e call, @NotNull q dispatcher) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            for (s sVar : this.eventListeners) {
                sVar.dispatcherQueueStart(call, dispatcher);
            }
        }

        @Override // mv.s
        public void dnsEnd(@NotNull e call, @NotNull String domainName, @NotNull List<InetAddress> inetAddressList) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(domainName, "domainName");
            Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
            for (s sVar : this.eventListeners) {
                sVar.dnsEnd(call, domainName, inetAddressList);
            }
        }

        @Override // mv.s
        public void dnsStart(@NotNull e call, @NotNull String domainName) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(domainName, "domainName");
            for (s sVar : this.eventListeners) {
                sVar.dnsStart(call, domainName);
            }
        }

        @Override // mv.s
        public void followUpDecision(@NotNull e call, @NotNull h0 networkResponse, @Nullable f0 nextRequest) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
            for (s sVar : this.eventListeners) {
                sVar.followUpDecision(call, networkResponse, nextRequest);
            }
        }

        @Override // mv.s
        public void proxySelectEnd(@NotNull e call, @NotNull z url, @NotNull List<Proxy> proxies) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(proxies, "proxies");
            for (s sVar : this.eventListeners) {
                sVar.proxySelectEnd(call, url, proxies);
            }
        }

        @Override // mv.s
        public void proxySelectStart(@NotNull e call, @NotNull z url) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(url, "url");
            for (s sVar : this.eventListeners) {
                sVar.proxySelectStart(call, url);
            }
        }

        @Override // mv.s
        public void requestBodyEnd(@NotNull e call, long byteCount) {
            Intrinsics.checkNotNullParameter(call, "call");
            for (s sVar : this.eventListeners) {
                sVar.requestBodyEnd(call, byteCount);
            }
        }

        @Override // mv.s
        public void requestBodyStart(@NotNull e call) {
            Intrinsics.checkNotNullParameter(call, "call");
            for (s sVar : this.eventListeners) {
                sVar.requestBodyStart(call);
            }
        }

        @Override // mv.s
        public void requestFailed(@NotNull e call, @NotNull IOException ioe) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            for (s sVar : this.eventListeners) {
                sVar.requestFailed(call, ioe);
            }
        }

        @Override // mv.s
        public void requestHeadersEnd(@NotNull e call, @NotNull f0 request) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(request, "request");
            for (s sVar : this.eventListeners) {
                sVar.requestHeadersEnd(call, request);
            }
        }

        @Override // mv.s
        public void requestHeadersStart(@NotNull e call) {
            Intrinsics.checkNotNullParameter(call, "call");
            for (s sVar : this.eventListeners) {
                sVar.requestHeadersStart(call);
            }
        }

        @Override // mv.s
        public void responseBodyEnd(@NotNull e call, long byteCount) {
            Intrinsics.checkNotNullParameter(call, "call");
            for (s sVar : this.eventListeners) {
                sVar.responseBodyEnd(call, byteCount);
            }
        }

        @Override // mv.s
        public void responseBodyStart(@NotNull e call) {
            Intrinsics.checkNotNullParameter(call, "call");
            for (s sVar : this.eventListeners) {
                sVar.responseBodyStart(call);
            }
        }

        @Override // mv.s
        public void responseFailed(@NotNull e call, @NotNull IOException ioe) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            for (s sVar : this.eventListeners) {
                sVar.responseFailed(call, ioe);
            }
        }

        @Override // mv.s
        public void responseHeadersEnd(@NotNull e call, @NotNull h0 response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            for (s sVar : this.eventListeners) {
                sVar.responseHeadersEnd(call, response);
            }
        }

        @Override // mv.s
        public void responseHeadersStart(@NotNull e call) {
            Intrinsics.checkNotNullParameter(call, "call");
            for (s sVar : this.eventListeners) {
                sVar.responseHeadersStart(call);
            }
        }

        @Override // mv.s
        public void retryDecision(@NotNull e call, @NotNull IOException exception, boolean retry) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(exception, "exception");
            for (s sVar : this.eventListeners) {
                sVar.retryDecision(call, exception, retry);
            }
        }

        @Override // mv.s
        public void satisfactionFailure(@NotNull e call, @NotNull h0 response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            for (s sVar : this.eventListeners) {
                sVar.satisfactionFailure(call, response);
            }
        }

        @Override // mv.s
        public void secureConnectEnd(@NotNull e call, @Nullable x handshake) {
            Intrinsics.checkNotNullParameter(call, "call");
            for (s sVar : this.eventListeners) {
                sVar.secureConnectEnd(call, handshake);
            }
        }

        @Override // mv.s
        public void secureConnectStart(@NotNull e call) {
            Intrinsics.checkNotNullParameter(call, "call");
            for (s sVar : this.eventListeners) {
                sVar.secureConnectStart(call);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"mv/s$b", "Lmv/s;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends s {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lmv/s$d;", BuildConfig.FLAVOR, "Lmv/e;", "call", "Lmv/s;", "a", "(Lmv/e;)Lmv/s;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d {
        @NotNull
        s a(@NotNull e call);
    }

    public void cacheConditionalHit(@NotNull e call, @NotNull h0 cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    public void cacheHit(@NotNull e call, @NotNull h0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void cacheMiss(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void callEnd(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void callFailed(@NotNull e call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void callStart(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void canceled(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void connectEnd(@NotNull e call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable e0 protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void connectFailed(@NotNull e call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable e0 protocol, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void connectStart(@NotNull e call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void connectionAcquired(@NotNull e call, @NotNull k connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void connectionReleased(@NotNull e call, @NotNull k connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void dispatcherQueueEnd(@NotNull e call, @NotNull q dispatcher) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
    }

    public void dispatcherQueueStart(@NotNull e call, @NotNull q dispatcher) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
    }

    public void dnsEnd(@NotNull e call, @NotNull String domainName, @NotNull List<InetAddress> inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    public void dnsStart(@NotNull e call, @NotNull String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
    }

    public void followUpDecision(@NotNull e call, @NotNull h0 networkResponse, @Nullable f0 nextRequest) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
    }

    @NotNull
    public final s plus(@NotNull s other) {
        Intrinsics.checkNotNullParameter(other, "other");
        s sVar = NONE;
        if (this == sVar) {
            return other;
        }
        s[] eventListeners = this instanceof a ? ((a) this).getEventListeners() : new s[]{this};
        if (other == sVar) {
            return this;
        }
        return new a((s[]) p001kotlin.collections.l.x(eventListeners, other instanceof a ? ((a) other).getEventListeners() : new s[]{other}));
    }

    public void proxySelectEnd(@NotNull e call, @NotNull z url, @NotNull List<Proxy> proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public void proxySelectStart(@NotNull e call, @NotNull z url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public void requestBodyEnd(@NotNull e call, long byteCount) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void requestBodyStart(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void requestFailed(@NotNull e call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void requestHeadersEnd(@NotNull e call, @NotNull f0 request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public void requestHeadersStart(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseBodyEnd(@NotNull e call, long byteCount) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseBodyStart(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseFailed(@NotNull e call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void responseHeadersEnd(@NotNull e call, @NotNull h0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void responseHeadersStart(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void retryDecision(@NotNull e call, @NotNull IOException exception, boolean retry) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(exception, "exception");
    }

    public void satisfactionFailure(@NotNull e call, @NotNull h0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void secureConnectEnd(@NotNull e call, @Nullable x handshake) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void secureConnectStart(@NotNull e call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }
}
