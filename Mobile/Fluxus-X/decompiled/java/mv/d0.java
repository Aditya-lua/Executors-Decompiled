package mv;

import backtraceio.library.services.BacktraceMetrics;
import com.github.luben.zstd.BuildConfig;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0002\u0012\u001dB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00168\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0007¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R\u0017\u0010*\u001a\u00020%8\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010/\u001a\u00020+8\u0007¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0017\u00102\u001a\u00020+8\u0007¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R\u0017\u00107\u001a\u0002038\u0007¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b0\u00106R\u0017\u0010:\u001a\u00020+8\u0007¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b9\u0010.R\u0017\u0010=\u001a\u00020+8\u0007¢\u0006\f\n\u0004\b;\u0010,\u001a\u0004\b<\u0010.R\u0017\u0010C\u001a\u00020>8\u0007¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010H\u001a\u0004\u0018\u00010D8\u0007¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b4\u0010GR\u0017\u0010N\u001a\u00020I8\u0007¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010T\u001a\u0004\u0018\u00010O8\u0007¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010Y\u001a\u00020U8\u0007¢\u0006\f\n\u0004\bA\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010[\u001a\u0002038\u0007¢\u0006\f\n\u0004\b\u0018\u00105\u001a\u0004\bZ\u00106R\u0017\u0010`\u001a\u00020\\8\u0007¢\u0006\f\n\u0004\bL\u0010]\u001a\u0004\b^\u0010_R\u0016\u0010c\u001a\u0004\u0018\u00010a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010bR\u0019\u0010h\u001a\u0004\u0018\u00010d8\u0007¢\u0006\f\n\u0004\b1\u0010e\u001a\u0004\bf\u0010gR\u001d\u0010j\u001a\b\u0012\u0004\u0012\u00020i0\u001b8\u0007¢\u0006\f\n\u0004\b9\u0010\u001e\u001a\u0004\bP\u0010 R\u001d\u0010m\u001a\b\u0012\u0004\u0012\u00020k0\u001b8\u0007¢\u0006\f\n\u0004\b<\u0010\u001e\u001a\u0004\bl\u0010 R\u0017\u0010s\u001a\u00020n8\u0007¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0017\u0010x\u001a\u00020t8\u0007¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\b?\u0010wR\u0019\u0010|\u001a\u0004\u0018\u00010y8\u0007¢\u0006\f\n\u0004\bq\u0010z\u001a\u0004\b;\u0010{R\u0017\u0010\u007f\u001a\u00020}8\u0007¢\u0006\f\n\u0004\b\u001f\u0010^\u001a\u0004\b8\u0010~R\u0019\u0010\u0081\u0001\u001a\u00020}8\u0007¢\u0006\r\n\u0005\b\u0080\u0001\u0010^\u001a\u0004\bE\u0010~R\u0019\u0010\u0083\u0001\u001a\u00020}8\u0007¢\u0006\r\n\u0004\b#\u0010^\u001a\u0005\b\u0082\u0001\u0010~R\u0019\u0010\u0085\u0001\u001a\u00020}8\u0007¢\u0006\r\n\u0004\b\u0014\u0010^\u001a\u0005\b\u0084\u0001\u0010~R\u001a\u0010\u0087\u0001\u001a\u00020}8\u0007¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010^\u001a\u0005\b\u0086\u0001\u0010~R\u0019\u0010\u0089\u0001\u001a\u00020}8\u0007¢\u0006\r\n\u0004\bl\u0010^\u001a\u0005\b\u0088\u0001\u0010~R\u001c\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0007¢\u0006\u000f\n\u0005\bR\u0010\u008b\u0001\u001a\u0006\b\u0080\u0001\u0010\u008c\u0001R\u001e\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\bZ\u0010\u008f\u0001\u001a\u0005\bo\u0010\u0090\u0001R\u001e\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\bW\u0010\u0093\u0001\u001a\u0005\bu\u0010\u0094\u0001R\u001c\u0010\u0099\u0001\u001a\u00030\u0096\u00018\u0007¢\u0006\u000f\n\u0006\b\u0082\u0001\u0010\u0097\u0001\u001a\u0005\bJ\u0010\u0098\u0001R\u0014\u0010\u009b\u0001\u001a\u00020a8G¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u009a\u0001¨\u0006\u009c\u0001"}, d2 = {"Lmv/d0;", "Lmv/e$a;", BuildConfig.FLAVOR, "Lmv/d0$a;", "builder", "<init>", "(Lmv/d0$a;)V", "()V", BuildConfig.FLAVOR, "K", "Lmv/z;", "url", "Lmv/a;", "e", "(Lmv/z;)Lmv/a;", "Lmv/f0;", "request", "Lmv/e;", "a", "(Lmv/f0;)Lmv/e;", "A", "()Lmv/d0$a;", "Lmv/q;", "Lmv/q;", "o", "()Lmv/q;", "dispatcher", BuildConfig.FLAVOR, "Lmv/a0;", "b", "Ljava/util/List;", "x", "()Ljava/util/List;", "interceptors", "c", "z", "networkInterceptors", "Lmv/s$d;", "d", "Lmv/s$d;", "q", "()Lmv/s$d;", "eventListenerFactory", BuildConfig.FLAVOR, "Z", "H", "()Z", "retryOnConnectionFailure", "f", "r", "fastFallback", "Lmv/b;", "g", "Lmv/b;", "()Lmv/b;", "authenticator", "h", "s", "followRedirects", "i", "t", "followSslRedirects", "Lmv/o;", "j", "Lmv/o;", "n", "()Lmv/o;", "cookieJar", "Lmv/c;", "k", "Lmv/c;", "()Lmv/c;", "cache", "Lmv/r;", "l", "Lmv/r;", "p", "()Lmv/r;", "dns", "Ljava/net/Proxy;", "m", "Ljava/net/Proxy;", "D", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "Ljava/net/ProxySelector;", "F", "()Ljava/net/ProxySelector;", "proxySelector", "E", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "Ljavax/net/SocketFactory;", "I", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "N", "()Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Lmv/m;", "connectionSpecs", "Lmv/e0;", "C", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "u", "Ljavax/net/ssl/HostnameVerifier;", "w", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lmv/h;", "v", "Lmv/h;", "()Lmv/h;", "certificatePinner", "Lbw/c;", "Lbw/c;", "()Lbw/c;", "certificateChainCleaner", BuildConfig.FLAVOR, "()I", "callTimeoutMillis", "y", "connectTimeoutMillis", "G", "readTimeoutMillis", "M", "writeTimeoutMillis", "B", "pingIntervalMillis", "L", "webSocketCloseTimeout", BuildConfig.FLAVOR, "J", "()J", "minWebSocketMessageToCompress", "Lrv/s;", "Lrv/s;", "()Lrv/s;", "routeDatabase", "Lqv/d;", "Lqv/d;", "()Lqv/d;", "taskRunner", "Lmv/l;", "Lmv/l;", "()Lmv/l;", "connectionPool", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class d0 implements e.a {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final List<e0> I = nv.q.l(e0.HTTP_2, e0.HTTP_1_1);

    @NotNull
    public static final List<m> J = nv.q.l(m.f24743i, m.f24745k);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final int writeTimeoutMillis;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final int pingIntervalMillis;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final int webSocketCloseTimeout;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final long minWebSocketMessageToCompress;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final rv.s routeDatabase;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final qv.d taskRunner;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public final l connectionPool;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final q dispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<a0> interceptors;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<a0> networkInterceptors;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s.d eventListenerFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean retryOnConnectionFailure;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean fastFallback;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b authenticator;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final boolean followRedirects;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final boolean followSslRedirects;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o cookieJar;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final c cache;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r dns;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Proxy proxy;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ProxySelector proxySelector;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b proxyAuthenticator;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SocketFactory socketFactory;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final SSLSocketFactory sslSocketFactoryOrNull;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final X509TrustManager x509TrustManager;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<m> connectionSpecs;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<e0> protocols;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HostnameVerifier hostnameVerifier;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h certificatePinner;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final bw.c certificateChainCleaner;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final int callTimeoutMillis;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final int connectTimeoutMillis;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final int readTimeoutMillis;

    /* JADX INFO: renamed from: mv.d0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lmv/d0$b;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "Lmv/e0;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lmv/m;", "DEFAULT_CONNECTION_SPECS", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<m> a() {
            return d0.J;
        }

        @NotNull
        public final List<e0> b() {
            return d0.I;
        }

        public Companion() {
        }
    }

    public d0(@NotNull a builder) {
        ProxySelector proxySelector;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.dispatcher = builder.getDispatcher();
        this.interceptors = nv.q.v(builder.C());
        this.networkInterceptors = nv.q.v(builder.E());
        this.eventListenerFactory = builder.getEventListenerFactory();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure();
        this.fastFallback = builder.getFastFallback();
        this.authenticator = builder.getAuthenticator();
        this.followRedirects = builder.getFollowRedirects();
        this.followSslRedirects = builder.getFollowSslRedirects();
        this.cookieJar = builder.getCookieJar();
        this.cache = builder.getCache();
        this.dns = builder.getDns();
        this.proxy = builder.getProxy();
        if (builder.getProxy() != null) {
            proxySelector = zv.a.f39520a;
        } else {
            proxySelector = builder.getProxySelector();
            if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
                proxySelector = zv.a.f39520a;
            }
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = builder.getProxyAuthenticator();
        this.socketFactory = builder.getSocketFactory();
        List<m> listT = builder.t();
        this.connectionSpecs = listT;
        this.protocols = builder.G();
        this.hostnameVerifier = builder.getHostnameVerifier();
        this.callTimeoutMillis = builder.getCallTimeout();
        this.connectTimeoutMillis = builder.getConnectTimeout();
        this.readTimeoutMillis = builder.getReadTimeout();
        this.writeTimeoutMillis = builder.getWriteTimeout();
        this.pingIntervalMillis = builder.getPingInterval();
        this.webSocketCloseTimeout = builder.getWebSocketCloseTimeout();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress();
        rv.s routeDatabase = builder.getRouteDatabase();
        this.routeDatabase = routeDatabase == null ? new rv.s() : routeDatabase;
        qv.d taskRunner = builder.getTaskRunner();
        this.taskRunner = taskRunner == null ? qv.d.f30482m : taskRunner;
        l connectionPool = builder.getConnectionPool();
        if (connectionPool == null) {
            connectionPool = new l();
            builder.U(connectionPool);
        }
        this.connectionPool = connectionPool;
        List<m> list = listT;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = h.f24611d;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((m) it.next()).getIsTls()) {
                    if (builder.getSslSocketFactoryOrNull() != null) {
                        this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull();
                        bw.c certificateChainCleaner = builder.getCertificateChainCleaner();
                        Intrinsics.checkNotNull(certificateChainCleaner);
                        this.certificateChainCleaner = certificateChainCleaner;
                        X509TrustManager x509TrustManagerOrNull = builder.getX509TrustManagerOrNull();
                        Intrinsics.checkNotNull(x509TrustManagerOrNull);
                        this.x509TrustManager = x509TrustManagerOrNull;
                        this.certificatePinner = builder.getCertificatePinner().g(certificateChainCleaner);
                    } else {
                        okhttp3.internal.platform.c.Companion aVar = okhttp3.internal.platform.c.INSTANCE;
                        X509TrustManager x509TrustManagerQ = aVar.e().q();
                        this.x509TrustManager = x509TrustManagerQ;
                        this.sslSocketFactoryOrNull = aVar.e().p(x509TrustManagerQ);
                        bw.c cVarA = bw.c.INSTANCE.a(x509TrustManagerQ);
                        this.certificateChainCleaner = cVarA;
                        this.certificatePinner = builder.getCertificatePinner().g(cVarA);
                    }
                }
            }
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = h.f24611d;
        }
        K();
    }

    @NotNull
    public a A() {
        return new a(this);
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @NotNull
    public final List<e0> C() {
        return this.protocols;
    }

    @Nullable
    /* JADX INFO: renamed from: D, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @NotNull
    /* JADX INFO: renamed from: E, reason: from getter */
    public final b getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @NotNull
    /* JADX INFO: renamed from: F, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @NotNull
    public final SSLSocketFactory J() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final void K() {
        List<a0> list = this.interceptors;
        Intrinsics.d(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
        }
        List<a0> list2 = this.networkInterceptors;
        Intrinsics.d(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        List<m> list3 = this.connectionSpecs;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((m) it.next()).getIsTls()) {
                    if (this.sslSocketFactoryOrNull == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.certificateChainCleaner == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.sslSocketFactoryOrNull != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.certificateChainCleaner != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.c(this.certificatePinner, h.f24611d)) {
            throw new IllegalStateException("Check failed.");
        }
        Unit unit = Unit.f21506a;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final int getWebSocketCloseTimeout() {
        return this.webSocketCloseTimeout;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @Nullable
    /* JADX INFO: renamed from: N, reason: from getter */
    public final X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    @Override // mv.e.a
    @NotNull
    public e a(@NotNull f0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new rv.m(this, request, false);
    }

    @NotNull
    public final mv.a e(@NotNull z url) {
        SSLSocketFactory sSLSocketFactoryJ;
        HostnameVerifier hostnameVerifier;
        h hVar;
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.i()) {
            sSLSocketFactoryJ = J();
            hostnameVerifier = this.hostnameVerifier;
            hVar = this.certificatePinner;
        } else {
            sSLSocketFactoryJ = null;
            hostnameVerifier = null;
            hVar = null;
        }
        return new mv.a(url.getHost(), url.getPort(), this.dns, this.socketFactory, sSLSocketFactoryJ, hostnameVerifier, hVar, this.proxyAuthenticator, this.proxy, this.protocols, this.connectionSpecs, this.proxySelector);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getAuthenticator() {
        return this.authenticator;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final c getCache() {
        return this.cache;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final bw.c getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final h getCertificatePinner() {
        return this.certificatePinner;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final l getConnectionPool() {
        return this.connectionPool;
    }

    @NotNull
    public final List<m> m() {
        return this.connectionSpecs;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final o getCookieJar() {
        return this.cookieJar;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final q getDispatcher() {
        return this.dispatcher;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final r getDns() {
        return this.dns;
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final s.d getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getFastFallback() {
        return this.fastFallback;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    @NotNull
    /* JADX INFO: renamed from: u, reason: from getter */
    public final rv.s getRouteDatabase() {
        return this.routeDatabase;
    }

    @NotNull
    /* JADX INFO: renamed from: v, reason: from getter */
    public final qv.d getTaskRunner() {
        return this.taskRunner;
    }

    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @NotNull
    public final List<a0> x() {
        return this.interceptors;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    @NotNull
    public final List<a0> z() {
        return this.networkInterceptors;
    }

    @Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u001d\u0010,\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u001d\u00102\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u001d\u00104\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200¢\u0006\u0004\b4\u00103J\u001d\u00105\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200¢\u0006\u0004\b5\u00103J\u001d\u00106\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200¢\u0006\u0004\b6\u00103J\r\u00107\u001a\u00020\u0004¢\u0006\u0004\b7\u00108R\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR \u0010G\u001a\b\u0012\u0004\u0012\u00020\u000f0C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u0010D\u001a\u0004\bE\u0010FR \u0010I\u001a\b\u0012\u0004\u0012\u00020\u000f0C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010D\u001a\u0004\bH\u0010FR\"\u0010P\u001a\u00020J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010V\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Y\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010Q\u001a\u0004\bW\u0010S\"\u0004\bX\u0010UR\"\u0010`\u001a\u00020Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010\u0019\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010Q\u001a\u0004\ba\u0010S\"\u0004\bb\u0010UR\"\u0010e\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010Q\u001a\u0004\bc\u0010S\"\u0004\bd\u0010UR\"\u0010\u001d\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010!\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010%\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010{\u001a\u0004\u0018\u00010u8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR(\u0010\u0083\u0001\u001a\u0004\u0018\u00010|8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010\u0087\u0001\u001a\u00020Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010[\u001a\u0005\b\u0085\u0001\u0010]\"\u0005\b\u0086\u0001\u0010_R*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R+\u0010\u0096\u0001\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u009c\u0001\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b?\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R/\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030\u009e\u00010\u009d\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u009f\u0001\u0010D\u001a\u0005\b\u009f\u0001\u0010F\"\u0006\b \u0001\u0010¡\u0001R.\u0010¦\u0001\u001a\n\u0012\u0005\u0012\u00030£\u00010\u009d\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bg\u0010D\u001a\u0005\b¤\u0001\u0010F\"\u0006\b¥\u0001\u0010¡\u0001R)\u0010\u00ad\u0001\u001a\u00030§\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b:\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R)\u0010³\u0001\u001a\u00030®\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bq\u0010¯\u0001\u001a\u0006\b\u0089\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R+\u0010¹\u0001\u001a\u0005\u0018\u00010´\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bL\u0010µ\u0001\u001a\u0006\b\u0084\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R(\u0010¾\u0001\u001a\u00030º\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bW\u0010\u0085\u0001\u001a\u0005\b}\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R)\u0010À\u0001\u001a\u00030º\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\ba\u0010\u0085\u0001\u001a\u0006\b\u0090\u0001\u0010»\u0001\"\u0006\b¿\u0001\u0010½\u0001R)\u0010Ã\u0001\u001a\u00030º\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bc\u0010\u0085\u0001\u001a\u0006\bÁ\u0001\u0010»\u0001\"\u0006\bÂ\u0001\u0010½\u0001R*\u0010Æ\u0001\u001a\u00030º\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010\u0085\u0001\u001a\u0006\bÄ\u0001\u0010»\u0001\"\u0006\bÅ\u0001\u0010½\u0001R)\u0010É\u0001\u001a\u00030º\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bE\u0010\u0085\u0001\u001a\u0006\bÇ\u0001\u0010»\u0001\"\u0006\bÈ\u0001\u0010½\u0001R*\u0010Í\u0001\u001a\u00030º\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÊ\u0001\u0010\u0085\u0001\u001a\u0006\bË\u0001\u0010»\u0001\"\u0006\bÌ\u0001\u0010½\u0001R'\u0010Ñ\u0001\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\bH\u0010\u007f\u001a\u0006\bÊ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R,\u0010Ø\u0001\u001a\u0005\u0018\u00010Ò\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÇ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R,\u0010ß\u0001\u001a\u0005\u0018\u00010Ù\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001¨\u0006à\u0001"}, d2 = {"Lmv/d0$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/d0;", "okHttpClient", "(Lmv/d0;)V", "Lmv/q;", "dispatcher", "i", "(Lmv/q;)Lmv/d0$a;", "Lmv/l;", "connectionPool", "g", "(Lmv/l;)Lmv/d0$a;", "Lmv/a0;", "interceptor", "a", "(Lmv/a0;)Lmv/d0$a;", "b", "Lmv/s;", "eventListener", "k", "(Lmv/s;)Lmv/d0$a;", BuildConfig.FLAVOR, "followRedirects", "l", "(Z)Lmv/d0$a;", "Lmv/o;", "cookieJar", "h", "(Lmv/o;)Lmv/d0$a;", "Lmv/c;", "cache", "d", "(Lmv/c;)Lmv/d0$a;", "Lmv/r;", "dns", "j", "(Lmv/r;)Lmv/d0$a;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "V", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lmv/d0$a;", BuildConfig.FLAVOR, "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "e", "(JLjava/util/concurrent/TimeUnit;)Lmv/d0$a;", "f", "T", "W", "c", "()Lmv/d0;", "Lmv/q;", "v", "()Lmv/q;", "setDispatcher$okhttp", "(Lmv/q;)V", "Lmv/l;", "s", "()Lmv/l;", "U", "(Lmv/l;)V", BuildConfig.FLAVOR, "Ljava/util/List;", "C", "()Ljava/util/List;", "interceptors", "E", "networkInterceptors", "Lmv/s$d;", "Lmv/s$d;", "x", "()Lmv/s$d;", "setEventListenerFactory$okhttp", "(Lmv/s$d;)V", "eventListenerFactory", "Z", "L", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "retryOnConnectionFailure", "y", "setFastFallback$okhttp", "fastFallback", "Lmv/b;", "Lmv/b;", "m", "()Lmv/b;", "setAuthenticator$okhttp", "(Lmv/b;)V", "authenticator", "z", "setFollowRedirects$okhttp", "A", "setFollowSslRedirects$okhttp", "followSslRedirects", "Lmv/o;", "u", "()Lmv/o;", "setCookieJar$okhttp", "(Lmv/o;)V", "Lmv/c;", "n", "()Lmv/c;", "setCache$okhttp", "(Lmv/c;)V", "Lmv/r;", "w", "()Lmv/r;", "setDns$okhttp", "(Lmv/r;)V", "Ljava/net/Proxy;", "Ljava/net/Proxy;", "H", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "proxy", "Ljava/net/ProxySelector;", "o", "Ljava/net/ProxySelector;", "J", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "proxySelector", "p", "I", "setProxyAuthenticator$okhttp", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "q", "Ljavax/net/SocketFactory;", "N", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "socketFactory", "r", "Ljavax/net/ssl/SSLSocketFactory;", "O", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "S", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", BuildConfig.FLAVOR, "Lmv/m;", "t", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "connectionSpecs", "Lmv/e0;", "G", "setProtocols$okhttp", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "B", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "hostnameVerifier", "Lmv/h;", "Lmv/h;", "()Lmv/h;", "setCertificatePinner$okhttp", "(Lmv/h;)V", "certificatePinner", "Lbw/c;", "Lbw/c;", "()Lbw/c;", "setCertificateChainCleaner$okhttp", "(Lbw/c;)V", "certificateChainCleaner", BuildConfig.FLAVOR, "()I", "setCallTimeout$okhttp", "(I)V", "callTimeout", "setConnectTimeout$okhttp", "connectTimeout", "K", "setReadTimeout$okhttp", "readTimeout", "R", "setWriteTimeout$okhttp", "writeTimeout", "F", "setPingInterval$okhttp", "pingInterval", "D", "Q", "setWebSocketCloseTimeout$okhttp", "webSocketCloseTimeout", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "minWebSocketMessageToCompress", "Lrv/s;", "Lrv/s;", "M", "()Lrv/s;", "setRouteDatabase$okhttp", "(Lrv/s;)V", "routeDatabase", "Lqv/d;", "Lqv/d;", "P", "()Lqv/d;", "setTaskRunner$okhttp", "(Lqv/d;)V", "taskRunner", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        public int readTimeout;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        public int writeTimeout;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        public int pingInterval;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        public int webSocketCloseTimeout;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        public long minWebSocketMessageToCompress;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        @Nullable
        public rv.s routeDatabase;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        @Nullable
        public qv.d taskRunner;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public q dispatcher;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public l connectionPool;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<a0> interceptors;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<a0> networkInterceptors;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public s.d eventListenerFactory;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public boolean retryOnConnectionFailure;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public boolean fastFallback;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public b authenticator;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public boolean followRedirects;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public boolean followSslRedirects;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public o cookieJar;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public c cache;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public r dns;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Proxy proxy;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public ProxySelector proxySelector;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public b proxyAuthenticator;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public SocketFactory socketFactory;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SSLSocketFactory sslSocketFactoryOrNull;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public X509TrustManager x509TrustManagerOrNull;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public List<m> connectionSpecs;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public List<? extends e0> protocols;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public HostnameVerifier hostnameVerifier;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public h certificatePinner;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public bw.c certificateChainCleaner;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        public int callTimeout;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        public int connectTimeout;

        public a() {
            this.dispatcher = new q();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = nv.q.c(s.NONE);
            this.retryOnConnectionFailure = true;
            this.fastFallback = true;
            b bVar = b.b;
            this.authenticator = bVar;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = o.b;
            this.dns = r.b;
            this.proxyAuthenticator = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault(...)");
            this.socketFactory = socketFactory;
            Companion companion = d0.INSTANCE;
            this.connectionSpecs = companion.a();
            this.protocols = companion.b();
            this.hostnameVerifier = bw.d.f4602a;
            this.certificatePinner = h.f24611d;
            this.connectTimeout = BacktraceMetrics.defaultTimeBetweenRetriesMs;
            this.readTimeout = BacktraceMetrics.defaultTimeBetweenRetriesMs;
            this.writeTimeout = BacktraceMetrics.defaultTimeBetweenRetriesMs;
            this.webSocketCloseTimeout = 60000;
            this.minWebSocketMessageToCompress = 1024L;
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final boolean getFollowSslRedirects() {
            return this.followSslRedirects;
        }

        @NotNull
        /* JADX INFO: renamed from: B, reason: from getter */
        public final HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        @NotNull
        public final List<a0> C() {
            return this.interceptors;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final long getMinWebSocketMessageToCompress() {
            return this.minWebSocketMessageToCompress;
        }

        @NotNull
        public final List<a0> E() {
            return this.networkInterceptors;
        }

        /* JADX INFO: renamed from: F, reason: from getter */
        public final int getPingInterval() {
            return this.pingInterval;
        }

        @NotNull
        public final List<e0> G() {
            return this.protocols;
        }

        @Nullable
        /* JADX INFO: renamed from: H, reason: from getter */
        public final Proxy getProxy() {
            return this.proxy;
        }

        @NotNull
        /* JADX INFO: renamed from: I, reason: from getter */
        public final b getProxyAuthenticator() {
            return this.proxyAuthenticator;
        }

        @Nullable
        /* JADX INFO: renamed from: J, reason: from getter */
        public final ProxySelector getProxySelector() {
            return this.proxySelector;
        }

        /* JADX INFO: renamed from: K, reason: from getter */
        public final int getReadTimeout() {
            return this.readTimeout;
        }

        /* JADX INFO: renamed from: L, reason: from getter */
        public final boolean getRetryOnConnectionFailure() {
            return this.retryOnConnectionFailure;
        }

        @Nullable
        /* JADX INFO: renamed from: M, reason: from getter */
        public final rv.s getRouteDatabase() {
            return this.routeDatabase;
        }

        @NotNull
        /* JADX INFO: renamed from: N, reason: from getter */
        public final SocketFactory getSocketFactory() {
            return this.socketFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: O, reason: from getter */
        public final SSLSocketFactory getSslSocketFactoryOrNull() {
            return this.sslSocketFactoryOrNull;
        }

        @Nullable
        /* JADX INFO: renamed from: P, reason: from getter */
        public final qv.d getTaskRunner() {
            return this.taskRunner;
        }

        /* JADX INFO: renamed from: Q, reason: from getter */
        public final int getWebSocketCloseTimeout() {
            return this.webSocketCloseTimeout;
        }

        /* JADX INFO: renamed from: R, reason: from getter */
        public final int getWriteTimeout() {
            return this.writeTimeout;
        }

        @Nullable
        /* JADX INFO: renamed from: S, reason: from getter */
        public final X509TrustManager getX509TrustManagerOrNull() {
            return this.x509TrustManagerOrNull;
        }

        @NotNull
        public final a T(long timeout, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.readTimeout = nv.q.g("timeout", timeout, unit);
            return this;
        }

        public final void U(@Nullable l lVar) {
            this.connectionPool = lVar;
        }

        @NotNull
        public final a V(@NotNull SSLSocketFactory sslSocketFactory, @NotNull X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            if (!Intrinsics.c(sslSocketFactory, this.sslSocketFactoryOrNull) || !Intrinsics.c(trustManager, this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = bw.c.INSTANCE.a(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        @NotNull
        public final a W(long timeout, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.writeTimeout = nv.q.g("timeout", timeout, unit);
            return this;
        }

        @NotNull
        public final a a(@NotNull a0 interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        @NotNull
        public final a b(@NotNull a0 interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.networkInterceptors.add(interceptor);
            return this;
        }

        @NotNull
        public final d0 c() {
            return new d0(this);
        }

        @NotNull
        public final a d(@Nullable c cache) {
            this.cache = cache;
            return this;
        }

        @NotNull
        public final a e(long timeout, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.callTimeout = nv.q.g("timeout", timeout, unit);
            return this;
        }

        @NotNull
        public final a f(long timeout, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.connectTimeout = nv.q.g("timeout", timeout, unit);
            return this;
        }

        @NotNull
        public final a g(@NotNull l connectionPool) {
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            this.connectionPool = connectionPool;
            return this;
        }

        @NotNull
        public final a h(@NotNull o cookieJar) {
            Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
            this.cookieJar = cookieJar;
            return this;
        }

        @NotNull
        public final a i(@NotNull q dispatcher) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            this.dispatcher = dispatcher;
            return this;
        }

        @NotNull
        public final a j(@NotNull r dns) {
            Intrinsics.checkNotNullParameter(dns, "dns");
            if (!Intrinsics.c(dns, this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        @NotNull
        public final a k(@NotNull s eventListener) {
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            this.eventListenerFactory = nv.q.c(eventListener);
            return this;
        }

        @NotNull
        public final a l(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: m, reason: from getter */
        public final b getAuthenticator() {
            return this.authenticator;
        }

        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public final c getCache() {
            return this.cache;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final int getCallTimeout() {
            return this.callTimeout;
        }

        @Nullable
        /* JADX INFO: renamed from: p, reason: from getter */
        public final bw.c getCertificateChainCleaner() {
            return this.certificateChainCleaner;
        }

        @NotNull
        /* JADX INFO: renamed from: q, reason: from getter */
        public final h getCertificatePinner() {
            return this.certificatePinner;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        @Nullable
        /* JADX INFO: renamed from: s, reason: from getter */
        public final l getConnectionPool() {
            return this.connectionPool;
        }

        @NotNull
        public final List<m> t() {
            return this.connectionSpecs;
        }

        @NotNull
        /* JADX INFO: renamed from: u, reason: from getter */
        public final o getCookieJar() {
            return this.cookieJar;
        }

        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public final q getDispatcher() {
            return this.dispatcher;
        }

        @NotNull
        /* JADX INFO: renamed from: w, reason: from getter */
        public final r getDns() {
            return this.dns;
        }

        @NotNull
        /* JADX INFO: renamed from: x, reason: from getter */
        public final s.d getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final boolean getFastFallback() {
            return this.fastFallback;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final boolean getFollowRedirects() {
            return this.followRedirects;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull d0 okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.getDispatcher();
            this.connectionPool = okHttpClient.getConnectionPool();
            p001kotlin.collections.u.z(this.interceptors, okHttpClient.x());
            p001kotlin.collections.u.z(this.networkInterceptors, okHttpClient.z());
            this.eventListenerFactory = okHttpClient.getEventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.getRetryOnConnectionFailure();
            this.fastFallback = okHttpClient.getFastFallback();
            this.authenticator = okHttpClient.getAuthenticator();
            this.followRedirects = okHttpClient.getFollowRedirects();
            this.followSslRedirects = okHttpClient.getFollowSslRedirects();
            this.cookieJar = okHttpClient.getCookieJar();
            this.cache = okHttpClient.getCache();
            this.dns = okHttpClient.getDns();
            this.proxy = okHttpClient.getProxy();
            this.proxySelector = okHttpClient.getProxySelector();
            this.proxyAuthenticator = okHttpClient.getProxyAuthenticator();
            this.socketFactory = okHttpClient.getSocketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.getX509TrustManager();
            this.connectionSpecs = okHttpClient.m();
            this.protocols = okHttpClient.C();
            this.hostnameVerifier = okHttpClient.getHostnameVerifier();
            this.certificatePinner = okHttpClient.getCertificatePinner();
            this.certificateChainCleaner = okHttpClient.getCertificateChainCleaner();
            this.callTimeout = okHttpClient.getCallTimeoutMillis();
            this.connectTimeout = okHttpClient.getConnectTimeoutMillis();
            this.readTimeout = okHttpClient.getReadTimeoutMillis();
            this.writeTimeout = okHttpClient.getWriteTimeoutMillis();
            this.pingInterval = okHttpClient.getPingIntervalMillis();
            this.webSocketCloseTimeout = okHttpClient.getWebSocketCloseTimeout();
            this.minWebSocketMessageToCompress = okHttpClient.getMinWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
            this.taskRunner = okHttpClient.getTaskRunner();
        }
    }

    public d0() {
        this(new a());
    }
}
