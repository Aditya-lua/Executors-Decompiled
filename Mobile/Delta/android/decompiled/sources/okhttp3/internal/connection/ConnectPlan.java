package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import kotlin.text.x;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionSpec;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xu.s0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001RB\u0093\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ2\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u000eH\u0002J\b\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u000209H\u0016J\b\u0010;\u001a\u00020<H\u0002J\r\u0010=\u001a\u000209H\u0000¢\u0006\u0002\b>J\u0018\u0010?\u001a\u00020<2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0002J\n\u0010D\u001a\u0004\u0018\u00010\u0019H\u0002J#\u0010E\u001a\u00020\u00002\f\u0010F\u001a\b\u0012\u0004\u0012\u00020C0\u00162\u0006\u0010@\u001a\u00020AH\u0000¢\u0006\u0002\bGJ%\u0010H\u001a\u0004\u0018\u00010\u00002\f\u0010F\u001a\b\u0012\u0004\u0012\u00020C0\u00162\u0006\u0010@\u001a\u00020AH\u0000¢\u0006\u0002\bIJ\b\u0010J\u001a\u000205H\u0016J\u001a\u0010K\u001a\u00020<2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\b\u0010N\u001a\u00020<H\u0016J\b\u0010O\u001a\u00020<H\u0016J\b\u0010P\u001a\u00020\u0001H\u0016J\u0006\u0010Q\u001a\u00020<R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010\u001b\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010)\u001a\u0004\u0018\u00010(X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082.¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010%¨\u0006S"}, d2 = {"Lokhttp3/internal/connection/ConnectPlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "readTimeoutMillis", "", "writeTimeoutMillis", "socketConnectTimeoutMillis", "socketReadTimeoutMillis", "pingIntervalMillis", "retryOnConnectionFailure", "", "call", "Lokhttp3/internal/connection/RealCall;", "routePlanner", "Lokhttp3/internal/connection/RealRoutePlanner;", "route", "Lokhttp3/Route;", "routes", "", "attempt", "tunnelRequest", "Lokhttp3/Request;", "connectionSpecIndex", "isTlsFallback", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;IIIIIZLokhttp3/internal/connection/RealCall;Lokhttp3/internal/connection/RealRoutePlanner;Lokhttp3/Route;Ljava/util/List;ILokhttp3/Request;IZ)V", "getRoute", "()Lokhttp3/Route;", "getRoutes$okhttp", "()Ljava/util/List;", "getConnectionSpecIndex$okhttp", "()I", "isTlsFallback$okhttp", "()Z", "canceled", "rawSocket", "Ljava/net/Socket;", "javaNetSocket", "getJavaNetSocket$okhttp", "()Ljava/net/Socket;", "setJavaNetSocket$okhttp", "(Ljava/net/Socket;)V", "handshake", "Lokhttp3/Handshake;", "protocol", "Lokhttp3/Protocol;", "socket", "Lokhttp3/internal/connection/BufferedSocket;", "connection", "Lokhttp3/internal/connection/RealConnection;", "isReady", "copy", "connectTcp", "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTlsEtc", "connectSocket", "", "connectTunnel", "connectTunnel$okhttp", "connectTls", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "connectionSpec", "Lokhttp3/ConnectionSpec;", "createTunnel", "planWithCurrentOrInitialConnectionSpec", "connectionSpecs", "planWithCurrentOrInitialConnectionSpec$okhttp", "nextConnectionSpec", "nextConnectionSpec$okhttp", "handleSuccess", "trackFailure", "e", "Ljava/io/IOException;", "noNewExchanges", "cancel", "retry", "closeQuietly", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConnectPlan implements RoutePlanner.Plan, ExchangeCodec.Carrier {
    private static final int MAX_TUNNEL_ATTEMPTS = 21;

    @NotNull
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private final int attempt;

    @NotNull
    private final RealCall call;
    private volatile boolean canceled;

    @Nullable
    private RealConnection connection;

    @NotNull
    private final RealConnectionPool connectionPool;
    private final int connectionSpecIndex;

    @Nullable
    private Handshake handshake;
    private final boolean isTlsFallback;

    @Nullable
    private Socket javaNetSocket;
    private final int pingIntervalMillis;

    @Nullable
    private Protocol protocol;

    @Nullable
    private Socket rawSocket;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;

    @NotNull
    private final Route route;

    @NotNull
    private final RealRoutePlanner routePlanner;

    @Nullable
    private final List<Route> routes;
    private BufferedSocket socket;
    private final int socketConnectTimeoutMillis;
    private final int socketReadTimeoutMillis;

    @NotNull
    private final TaskRunner taskRunner;

    @Nullable
    private final Request tunnelRequest;
    private final int writeTimeoutMillis;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConnectPlan(@NotNull TaskRunner taskRunner, @NotNull RealConnectionPool connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z10, @NotNull RealCall call, @NotNull RealRoutePlanner routePlanner, @NotNull Route route, @Nullable List<Route> list, int i15, @Nullable Request request, int i16, boolean z11) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
        Intrinsics.checkNotNullParameter(route, "route");
        this.taskRunner = taskRunner;
        this.connectionPool = connectionPool;
        this.readTimeoutMillis = i10;
        this.writeTimeoutMillis = i11;
        this.socketConnectTimeoutMillis = i12;
        this.socketReadTimeoutMillis = i13;
        this.pingIntervalMillis = i14;
        this.retryOnConnectionFailure = z10;
        this.call = call;
        this.routePlanner = routePlanner;
        this.route = route;
        this.routes = list;
        this.attempt = i15;
        this.tunnelRequest = request;
        this.connectionSpecIndex = i16;
        this.isTlsFallback = z11;
    }

    private final void connectSocket() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = getRoute().proxy().type();
        int i10 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            socketCreateSocket = getRoute().address().socketFactory().createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(getRoute().proxy());
        }
        this.rawSocket = socketCreateSocket;
        if (this.canceled) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.socketReadTimeoutMillis);
        try {
            Platform.INSTANCE.get().connectSocket(socketCreateSocket, getRoute().socketAddress(), this.socketConnectTimeoutMillis);
            try {
                this.socket = BufferedSocketKt.asBufferedSocket(socketCreateSocket);
            } catch (NullPointerException e10) {
                if (Intrinsics.c(e10.getMessage(), NPE_THROW_WITH_NULL)) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + getRoute().socketAddress());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    private final void connectTls(SSLSocket sslSocket, ConnectionSpec connectionSpec) {
        final Address address = getRoute().address();
        try {
            if (connectionSpec.supportsTlsExtensions()) {
                Platform.INSTANCE.get().configureTlsExtensions(sslSocket, address.url().host(), address.protocols());
            }
            sslSocket.startHandshake();
            SSLSession session = sslSocket.getSession();
            Handshake.Companion companion = Handshake.INSTANCE;
            Intrinsics.checkNotNull(session);
            final Handshake handshake = companion.get(session);
            HostnameVerifier hostnameVerifier = address.hostnameVerifier();
            Intrinsics.checkNotNull(hostnameVerifier);
            if (hostnameVerifier.verify(address.url().host(), session)) {
                final CertificatePinner certificatePinner = address.certificatePinner();
                Intrinsics.checkNotNull(certificatePinner);
                final Handshake handshake2 = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new Function0() { // from class: okhttp3.internal.connection.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConnectPlan.connectTls$lambda$0(certificatePinner, handshake, address);
                    }
                });
                this.handshake = handshake2;
                certificatePinner.check$okhttp(address.url().host(), new Function0() { // from class: okhttp3.internal.connection.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConnectPlan.connectTls$lambda$1(handshake2);
                    }
                });
                String selectedProtocol = connectionSpec.supportsTlsExtensions() ? Platform.INSTANCE.get().getSelectedProtocol(sslSocket) : null;
                this.javaNetSocket = sslSocket;
                this.socket = BufferedSocketKt.asBufferedSocket(sslSocket);
                this.protocol = selectedProtocol != null ? Protocol.INSTANCE.get(selectedProtocol) : Protocol.HTTP_1_1;
                Platform.INSTANCE.get().afterHandshake(sslSocket);
                return;
            }
            List<Certificate> listPeerCertificates = handshake.peerCertificates();
            if (listPeerCertificates.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
            }
            Certificate certificate = listPeerCertificates.get(0);
            Intrinsics.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) certificate;
            throw new SSLPeerUnverifiedException(r.p("\n            |Hostname " + address.url().host() + " not verified:\n            |    certificate: " + CertificatePinner.INSTANCE.pin(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate) + "\n            ", null, 1, null));
        } catch (Throwable th2) {
            Platform.INSTANCE.get().afterHandshake(sslSocket);
            _UtilJvmKt.closeQuietly(sslSocket);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List connectTls$lambda$0(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        CertificateChainCleaner certificateChainCleaner = certificatePinner.getCertificateChainCleaner();
        Intrinsics.checkNotNull(certificateChainCleaner);
        return certificateChainCleaner.clean(handshake.peerCertificates(), address.url().host());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List connectTls$lambda$1(Handshake handshake) {
        List<Certificate> listPeerCertificates = handshake.peerCertificates();
        ArrayList arrayList = new ArrayList(q.u(listPeerCertificates, 10));
        for (Certificate certificate : listPeerCertificates) {
            Intrinsics.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    private final ConnectPlan copy(int attempt, Request tunnelRequest, int connectionSpecIndex, boolean isTlsFallback) {
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this.routePlanner, getRoute(), this.routes, attempt, tunnelRequest, connectionSpecIndex, isTlsFallback);
    }

    public static /* synthetic */ ConnectPlan copy$default(ConnectPlan connectPlan, int i10, Request request, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = connectPlan.attempt;
        }
        if ((i12 & 2) != 0) {
            request = connectPlan.tunnelRequest;
        }
        if ((i12 & 4) != 0) {
            i11 = connectPlan.connectionSpecIndex;
        }
        if ((i12 & 8) != 0) {
            z10 = connectPlan.isTlsFallback;
        }
        return connectPlan.copy(i10, request, i11, z10);
    }

    private final Request createTunnel() throws IOException {
        Request request = this.tunnelRequest;
        Intrinsics.checkNotNull(request);
        String str = "CONNECT " + _UtilJvmKt.toHostHeader(getRoute().address().url(), true) + " HTTP/1.1";
        while (true) {
            BufferedSocket bufferedSocket = this.socket;
            if (bufferedSocket == null) {
                Intrinsics.u("socket");
                bufferedSocket = null;
            }
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, bufferedSocket);
            BufferedSocket bufferedSocket2 = this.socket;
            if (bufferedSocket2 == null) {
                Intrinsics.u("socket");
                bufferedSocket2 = null;
            }
            s0 timeout = bufferedSocket2.getSource().getTimeout();
            long j10 = this.readTimeoutMillis;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeout.timeout(j10, timeUnit);
            BufferedSocket bufferedSocket3 = this.socket;
            if (bufferedSocket3 == null) {
                Intrinsics.u("socket");
                bufferedSocket3 = null;
            }
            bufferedSocket3.getSink().getTimeout().timeout(this.writeTimeoutMillis, timeUnit);
            http1ExchangeCodec.writeRequest(request.headers(), str);
            http1ExchangeCodec.finishRequest();
            Response.Builder responseHeaders = http1ExchangeCodec.readResponseHeaders(false);
            Intrinsics.checkNotNull(responseHeaders);
            Response responseBuild = responseHeaders.request(request).build();
            http1ExchangeCodec.skipConnectBody(responseBuild);
            int iCode = responseBuild.code();
            if (iCode == 200) {
                return null;
            }
            if (iCode != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + responseBuild.code());
            }
            Request requestAuthenticate = getRoute().address().proxyAuthenticator().authenticate(getRoute(), responseBuild);
            if (requestAuthenticate == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (x.E("close", Response.header$default(responseBuild, "Connection", null, 2, null), true)) {
                return requestAuthenticate;
            }
            request = requestAuthenticate;
        }
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    /* JADX INFO: renamed from: cancel */
    public void mo217cancel() {
        this.canceled = true;
        Socket socket = this.rawSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
    }

    public final void closeQuietly() {
        Socket socket = this.javaNetSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00fb  */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    @NotNull
    /* JADX INFO: renamed from: connectTcp */
    public RoutePlanner.ConnectResult getResult() throws Throwable {
        ConnectPlan connectPlan;
        ConnectPlan connectPlan2;
        Socket socket;
        Socket socket2;
        if (this.rawSocket != null) {
            throw new IllegalStateException("TCP already connected");
        }
        this.call.getPlansToCancel$okhttp().add(this);
        boolean z10 = false;
        try {
            try {
                this.call.getEventListener().connectStart(this.call, getRoute().socketAddress(), getRoute().proxy());
                this.connectionPool.getConnectionListener().connectStart(getRoute(), this.call);
                connectSocket();
                z10 = true;
                connectPlan2 = this;
                try {
                    RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(connectPlan2, null, null, 6, null);
                    connectPlan2.call.getPlansToCancel$okhttp().remove(this);
                    return connectResult;
                } catch (IOException e10) {
                    e = e10;
                    IOException iOException = e;
                    if (getRoute().address().proxy() == null && getRoute().proxy().type() != Proxy.Type.DIRECT) {
                        getRoute().address().proxySelector().connectFailed(getRoute().address().url().uri(), getRoute().proxy().address(), iOException);
                    }
                    connectPlan2.call.getEventListener().connectFailed(connectPlan2.call, getRoute().socketAddress(), getRoute().proxy(), null, iOException);
                    connectPlan2.connectionPool.getConnectionListener().connectFailed(getRoute(), connectPlan2.call, iOException);
                    ConnectPlan connectPlan3 = connectPlan2;
                    try {
                        RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(connectPlan3, null, iOException, 2, null);
                        connectPlan2.call.getPlansToCancel$okhttp().remove(this);
                        if (!z10 && (socket2 = connectPlan2.rawSocket) != null) {
                            _UtilJvmKt.closeQuietly(socket2);
                        }
                        return connectResult2;
                    } catch (Throwable th2) {
                        th = th2;
                        connectPlan = connectPlan3;
                        connectPlan.call.getPlansToCancel$okhttp().remove(this);
                        if (!z10) {
                            _UtilJvmKt.closeQuietly(socket);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                connectPlan.call.getPlansToCancel$okhttp().remove(this);
                if (!z10 && (socket = connectPlan.rawSocket) != null) {
                    _UtilJvmKt.closeQuietly(socket);
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            connectPlan2 = this;
        } catch (Throwable th4) {
            th = th4;
            connectPlan = this;
            connectPlan.call.getPlansToCancel$okhttp().remove(this);
            if (!z10) {
                _UtilJvmKt.closeQuietly(socket);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01dc  */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    @NotNull
    /* JADX INFO: renamed from: connectTlsEtc */
    public RoutePlanner.ConnectResult mo222connectTlsEtc() throws Throwable {
        IOException iOException;
        ConnectPlan connectPlan;
        Socket socket;
        Socket socket2 = this.rawSocket;
        if (socket2 == null) {
            throw new IllegalArgumentException("TCP not connected");
        }
        if (getIsReady()) {
            throw new IllegalStateException("already connected");
        }
        List<ConnectionSpec> listConnectionSpecs = getRoute().address().connectionSpecs();
        this.call.getPlansToCancel$okhttp().add(this);
        ConnectPlan connectPlan2 = null;
        boolean z10 = false;
        try {
            try {
                if (this.tunnelRequest != null) {
                    RoutePlanner.ConnectResult connectResultConnectTunnel$okhttp = connectTunnel$okhttp();
                    if (connectResultConnectTunnel$okhttp.getNextPlan() != null || connectResultConnectTunnel$okhttp.getThrowable() != null) {
                        this.call.getPlansToCancel$okhttp().remove(this);
                        Socket socket3 = this.javaNetSocket;
                        if (socket3 != null) {
                            _UtilJvmKt.closeQuietly(socket3);
                        }
                        _UtilJvmKt.closeQuietly(socket2);
                        return connectResultConnectTunnel$okhttp;
                    }
                }
                if (getRoute().address().sslSocketFactory() != null) {
                    BufferedSocket bufferedSocket = this.socket;
                    if (bufferedSocket == null) {
                        Intrinsics.u("socket");
                        bufferedSocket = null;
                    }
                    if (bufferedSocket.getSource().getBufferField().Z1()) {
                        BufferedSocket bufferedSocket2 = this.socket;
                        if (bufferedSocket2 == null) {
                            Intrinsics.u("socket");
                            bufferedSocket2 = null;
                        }
                        if (bufferedSocket2.getSink().getBufferField().Z1()) {
                            this.call.getEventListener().secureConnectStart(this.call);
                            Socket socketCreateSocket = getRoute().address().sslSocketFactory().createSocket(socket2, getRoute().address().url().host(), getRoute().address().url().port(), true);
                            Intrinsics.d(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            ConnectPlan connectPlanPlanWithCurrentOrInitialConnectionSpec$okhttp = planWithCurrentOrInitialConnectionSpec$okhttp(listConnectionSpecs, sSLSocket);
                            ConnectionSpec connectionSpec = listConnectionSpecs.get(connectPlanPlanWithCurrentOrInitialConnectionSpec$okhttp.connectionSpecIndex);
                            ConnectPlan connectPlanNextConnectionSpec$okhttp = connectPlanPlanWithCurrentOrInitialConnectionSpec$okhttp.nextConnectionSpec$okhttp(listConnectionSpecs, sSLSocket);
                            try {
                                connectionSpec.apply$okhttp(sSLSocket, connectPlanPlanWithCurrentOrInitialConnectionSpec$okhttp.isTlsFallback);
                                connectTls(sSLSocket, connectionSpec);
                                this.call.getEventListener().secureConnectEnd(this.call, this.handshake);
                                connectPlan = connectPlanNextConnectionSpec$okhttp;
                            } catch (IOException e10) {
                                iOException = e10;
                                connectPlan = connectPlanNextConnectionSpec$okhttp;
                                this.call.getEventListener().connectFailed(this.call, getRoute().socketAddress(), getRoute().proxy(), null, iOException);
                                this.connectionPool.getConnectionListener().connectFailed(getRoute(), this.call, iOException);
                                if (this.retryOnConnectionFailure && RetryTlsHandshakeKt.retryTlsHandshake(iOException)) {
                                    connectPlan2 = connectPlan;
                                }
                                RoutePlanner.ConnectResult connectResult = new RoutePlanner.ConnectResult(this, connectPlan2, iOException);
                                this.call.getPlansToCancel$okhttp().remove(this);
                                if (!z10) {
                                    socket = this.javaNetSocket;
                                    if (socket != null) {
                                        _UtilJvmKt.closeQuietly(socket);
                                    }
                                    _UtilJvmKt.closeQuietly(socket2);
                                }
                                return connectResult;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.javaNetSocket = socket2;
                List<Protocol> listProtocols = getRoute().address().protocols();
                Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                if (!listProtocols.contains(protocol)) {
                    protocol = Protocol.HTTP_1_1;
                }
                this.protocol = protocol;
                connectPlan = null;
                try {
                    TaskRunner taskRunner = this.taskRunner;
                    RealConnectionPool realConnectionPool = this.connectionPool;
                    Route route = getRoute();
                    Socket socket4 = this.javaNetSocket;
                    Intrinsics.checkNotNull(socket4);
                    Handshake handshake = this.handshake;
                    Protocol protocol2 = this.protocol;
                    Intrinsics.checkNotNull(protocol2);
                    BufferedSocket bufferedSocket3 = this.socket;
                    if (bufferedSocket3 == null) {
                        Intrinsics.u("socket");
                        bufferedSocket3 = null;
                    }
                    RealConnection realConnection = new RealConnection(taskRunner, realConnectionPool, route, socket2, socket4, handshake, protocol2, bufferedSocket3, this.pingIntervalMillis, this.connectionPool.getConnectionListener());
                    this.connection = realConnection;
                    realConnection.start();
                    this.call.getEventListener().connectEnd(this.call, getRoute().socketAddress(), getRoute().proxy(), this.protocol);
                    try {
                        RoutePlanner.ConnectResult connectResult2 = new RoutePlanner.ConnectResult(this, null, null, 6, null);
                        this.call.getPlansToCancel$okhttp().remove(this);
                        return connectResult2;
                    } catch (IOException e11) {
                        iOException = e11;
                        z10 = true;
                        this.call.getEventListener().connectFailed(this.call, getRoute().socketAddress(), getRoute().proxy(), null, iOException);
                        this.connectionPool.getConnectionListener().connectFailed(getRoute(), this.call, iOException);
                        if (this.retryOnConnectionFailure) {
                            connectPlan2 = connectPlan;
                        }
                        RoutePlanner.ConnectResult connectResult3 = new RoutePlanner.ConnectResult(this, connectPlan2, iOException);
                        this.call.getPlansToCancel$okhttp().remove(this);
                        if (!z10) {
                            socket = this.javaNetSocket;
                            if (socket != null) {
                                _UtilJvmKt.closeQuietly(socket);
                            }
                            _UtilJvmKt.closeQuietly(socket2);
                        }
                        return connectResult3;
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = true;
                        this.call.getPlansToCancel$okhttp().remove(this);
                        if (!z10) {
                            Socket socket5 = this.javaNetSocket;
                            if (socket5 != null) {
                                _UtilJvmKt.closeQuietly(socket5);
                            }
                            _UtilJvmKt.closeQuietly(socket2);
                        }
                        throw th;
                    }
                } catch (IOException e12) {
                    iOException = e12;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
            iOException = e13;
            connectPlan = null;
        }
    }

    @NotNull
    public final RoutePlanner.ConnectResult connectTunnel$okhttp() throws IOException {
        Request requestCreateTunnel = createTunnel();
        if (requestCreateTunnel == null) {
            return new RoutePlanner.ConnectResult(this, null, null, 6, null);
        }
        Socket socket = this.rawSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
        int i10 = this.attempt + 1;
        if (i10 < 21) {
            this.call.getEventListener().connectEnd(this.call, getRoute().socketAddress(), getRoute().proxy(), null);
            return new RoutePlanner.ConnectResult(this, copy$default(this, i10, requestCreateTunnel, 0, false, 12, null), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        this.call.getEventListener().connectFailed(this.call, getRoute().socketAddress(), getRoute().proxy(), null, protocolException);
        this.connectionPool.getConnectionListener().connectFailed(getRoute(), this.call, protocolException);
        return new RoutePlanner.ConnectResult(this, null, protocolException, 2, null);
    }

    /* JADX INFO: renamed from: getConnectionSpecIndex$okhttp, reason: from getter */
    public final int getConnectionSpecIndex() {
        return this.connectionSpecIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: getJavaNetSocket$okhttp, reason: from getter */
    public final Socket getJavaNetSocket() {
        return this.javaNetSocket;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    @NotNull
    public Route getRoute() {
        return this.route;
    }

    @Nullable
    public final List<Route> getRoutes$okhttp() {
        return this.routes;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    @NotNull
    /* JADX INFO: renamed from: handleSuccess */
    public RealConnection mo218handleSuccess() {
        this.call.getClient().getRouteDatabase().connected(getRoute());
        RealConnection realConnection = this.connection;
        Intrinsics.checkNotNull(realConnection);
        realConnection.getConnectionListener().connectEnd(realConnection, getRoute(), this.call);
        ReusePlan reusePlanPlanReusePooledConnection$okhttp = this.routePlanner.planReusePooledConnection$okhttp(this, this.routes);
        if (reusePlanPlanReusePooledConnection$okhttp != null) {
            return reusePlanPlanReusePooledConnection$okhttp.getConnection();
        }
        synchronized (realConnection) {
            this.connectionPool.put(realConnection);
            this.call.acquireConnectionNoEvents(realConnection);
            Unit unit = Unit.f22483a;
        }
        this.call.getEventListener().connectionAcquired(this.call, realConnection);
        realConnection.getConnectionListener().connectionAcquired(realConnection, this.call);
        return realConnection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* JADX INFO: renamed from: isReady */
    public boolean getIsReady() {
        return this.protocol != null;
    }

    /* JADX INFO: renamed from: isTlsFallback$okhttp, reason: from getter */
    public final boolean getIsTlsFallback() {
        return this.isTlsFallback;
    }

    @Nullable
    public final ConnectPlan nextConnectionSpec$okhttp(@NotNull List<ConnectionSpec> connectionSpecs, @NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i10 = this.connectionSpecIndex + 1;
        int size = connectionSpecs.size();
        for (int i11 = i10; i11 < size; i11++) {
            if (connectionSpecs.get(i11).isCompatible(sslSocket)) {
                return copy$default(this, 0, null, i11, this.connectionSpecIndex != -1, 3, null);
            }
        }
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void noNewExchanges() {
    }

    @NotNull
    public final ConnectPlan planWithCurrentOrInitialConnectionSpec$okhttp(@NotNull List<ConnectionSpec> connectionSpecs, @NotNull SSLSocket sslSocket) throws UnknownServiceException {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (this.connectionSpecIndex != -1) {
            return this;
        }
        ConnectPlan connectPlanNextConnectionSpec$okhttp = nextConnectionSpec$okhttp(connectionSpecs, sslSocket);
        if (connectPlanNextConnectionSpec$okhttp != null) {
            return connectPlanNextConnectionSpec$okhttp;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.isTlsFallback);
        sb2.append(", modes=");
        sb2.append(connectionSpecs);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.checkNotNull(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    @NotNull
    /* JADX INFO: renamed from: retry */
    public RoutePlanner.Plan mo219retry() {
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this.routePlanner, getRoute(), this.routes, this.attempt, this.tunnelRequest, this.connectionSpecIndex, this.isTlsFallback);
    }

    public final void setJavaNetSocket$okhttp(@Nullable Socket socket) {
        this.javaNetSocket = socket;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void trackFailure(@NotNull RealCall call, @Nullable IOException e10) {
        Intrinsics.checkNotNullParameter(call, "call");
    }
}
