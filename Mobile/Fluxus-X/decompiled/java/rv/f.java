package rv;

import com.github.luben.zstd.BuildConfig;
import ew.m0;
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
import mv.e0;
import mv.f0;
import mv.h0;
import mv.j0;
import mv.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 l2\u00020\u00012\u00020\u0002:\u0001?B\u0093\u0001\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u001eH\u0000¢\u0006\u0004\b\"\u0010 J%\u0010'\u001a\u00020\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00152\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u0004\u0018\u00010\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00152\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b)\u0010(J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J!\u0010/\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020.H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020.H\u0016¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020\u0001H\u0016¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020.¢\u0006\u0004\b6\u00102J9\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020.H\u0002¢\u0006\u0004\b9\u00102J\u001f\u0010;\u001a\u00020.2\u0006\u0010&\u001a\u00020%2\u0006\u0010:\u001a\u00020#H\u0002¢\u0006\u0004\b;\u0010<J\u0011\u0010=\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010AR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010BR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010BR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010BR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010BR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010DR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010I\u001a\u0004\bC\u0010JR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010\u0017\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010BR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010\u001a\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010B\u001a\u0004\bQ\u0010RR\u001a\u0010\u001b\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010D\u001a\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010DR\u0018\u0010Y\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR$\u0010^\u001a\u0004\u0018\u00010V8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010X\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0018\u0010a\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010`R\u0018\u0010d\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010cR\u0016\u0010g\u001a\u00020e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010fR\u0018\u0010j\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010T¨\u0006m"}, d2 = {"Lrv/f;", "Lrv/t$b;", "Lsv/d$a;", "Lqv/d;", "taskRunner", "Lrv/o;", "connectionPool", BuildConfig.FLAVOR, "readTimeoutMillis", "writeTimeoutMillis", "socketConnectTimeoutMillis", "socketReadTimeoutMillis", "pingIntervalMillis", BuildConfig.FLAVOR, "retryOnConnectionFailure", "Lrv/m;", "call", "Lrv/p;", "routePlanner", "Lmv/j0;", "route", BuildConfig.FLAVOR, "routes", "attempt", "Lmv/f0;", "tunnelRequest", "connectionSpecIndex", "isTlsFallback", "<init>", "(Lqv/d;Lrv/o;IIIIIZLrv/m;Lrv/p;Lmv/j0;Ljava/util/List;ILmv/f0;IZ)V", "Lrv/t$a;", "h", "()Lrv/t$a;", "e", "p", "Lmv/m;", "connectionSpecs", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "v", "(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lrv/f;", "u", "Lrv/n;", "c", "()Lrv/n;", "Ljava/io/IOException;", BuildConfig.FLAVOR, "g", "(Lrv/m;Ljava/io/IOException;)V", "d", "()V", "cancel", "b", "()Lrv/t$b;", "k", "q", "(ILmv/f0;IZ)Lrv/f;", "l", "connectionSpec", "m", "(Ljavax/net/ssl/SSLSocket;Lmv/m;)V", "s", "()Lmv/f0;", "a", "Lqv/d;", "Lrv/o;", "I", "f", "Z", "i", "Lrv/m;", "j", "Lrv/p;", "Lmv/j0;", "()Lmv/j0;", "Ljava/util/List;", "t", "()Ljava/util/List;", "n", "Lmv/f0;", "o", "getConnectionSpecIndex$okhttp", "()I", "isTlsFallback$okhttp", "()Z", "canceled", "Ljava/net/Socket;", "r", "Ljava/net/Socket;", "rawSocket", "getJavaNetSocket$okhttp", "()Ljava/net/Socket;", "setJavaNetSocket$okhttp", "(Ljava/net/Socket;)V", "javaNetSocket", "Lmv/x;", "Lmv/x;", "handshake", "Lmv/e0;", "Lmv/e0;", "protocol", "Lrv/a;", "Lrv/a;", "socket", "w", "Lrv/n;", "connection", "isReady", "x", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements t.b, sv.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qv.d taskRunner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final o connectionPool;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int readTimeoutMillis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int writeTimeoutMillis;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int socketConnectTimeoutMillis;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int socketReadTimeoutMillis;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int pingIntervalMillis;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final boolean retryOnConnectionFailure;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m call;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p routePlanner;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j0 route;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<j0> routes;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final int attempt;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final f0 tunnelRequest;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final int connectionSpecIndex;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final boolean isTlsFallback;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public volatile boolean canceled;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Socket rawSocket;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Socket javaNetSocket;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public x handshake;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public e0 protocol;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public a socket;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public n connection;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30979a;

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
            f30979a = iArr;
        }
    }

    public f(@NotNull qv.d taskRunner, @NotNull o connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z10, @NotNull m call, @NotNull p routePlanner, @NotNull j0 route, @Nullable List<j0> list, int i15, @Nullable f0 f0Var, int i16, boolean z11) {
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
        this.tunnelRequest = f0Var;
        this.connectionSpecIndex = i16;
        this.isTlsFallback = z11;
    }

    public static final List n(mv.h hVar, x xVar, mv.a aVar) {
        bw.c certificateChainCleaner = hVar.getCertificateChainCleaner();
        Intrinsics.checkNotNull(certificateChainCleaner);
        return certificateChainCleaner.a(xVar.e(), aVar.getUrl().getHost());
    }

    public static final List o(x xVar) {
        List<Certificate> listE = xVar.e();
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(listE, 10));
        for (Certificate certificate : listE) {
            Intrinsics.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    public static /* synthetic */ f r(f fVar, int i10, f0 f0Var, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = fVar.attempt;
        }
        if ((i12 & 2) != 0) {
            f0Var = fVar.tunnelRequest;
        }
        if ((i12 & 4) != 0) {
            i11 = fVar.connectionSpecIndex;
        }
        if ((i12 & 8) != 0) {
            z10 = fVar.isTlsFallback;
        }
        return fVar.q(i10, f0Var, i11, z10);
    }

    @Override // rv.t.b
    /* JADX INFO: renamed from: a */
    public boolean getIsReady() {
        return this.protocol != null;
    }

    @Override // rv.t.b
    @NotNull
    public t.b b() {
        return new f(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this.routePlanner, getRoute(), this.routes, this.attempt, this.tunnelRequest, this.connectionSpecIndex, this.isTlsFallback);
    }

    @Override // rv.t.b
    @NotNull
    /* JADX INFO: renamed from: c */
    public n getConnection() {
        this.call.getClient().getRouteDatabase().a(getRoute());
        n nVar = this.connection;
        Intrinsics.checkNotNull(nVar);
        nVar.getConnectionListener().b(nVar, getRoute(), this.call);
        r rVarL = this.routePlanner.l(this, this.routes);
        if (rVarL != null) {
            return rVarL.i();
        }
        synchronized (nVar) {
            this.connectionPool.g(nVar);
            this.call.c(nVar);
            Unit unit = Unit.f21506a;
        }
        this.call.getEventListener().connectionAcquired(this.call, nVar);
        nVar.getConnectionListener().e(nVar, this.call);
        return nVar;
    }

    @Override // rv.t.b, sv.d.a
    public void cancel() {
        this.canceled = true;
        Socket socket = this.rawSocket;
        if (socket != null) {
            nv.q.h(socket);
        }
    }

    @Override // sv.d.a
    public void d() {
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01dc  */
    @Override // rv.t.b
    @NotNull
    /* JADX INFO: renamed from: e */
    public t.ConnectResult getResult() throws Throwable {
        IOException iOException;
        f fVar;
        Socket socket;
        Socket socket2 = this.rawSocket;
        if (socket2 == null) {
            throw new IllegalArgumentException("TCP not connected");
        }
        if (getIsReady()) {
            throw new IllegalStateException("already connected");
        }
        List<mv.m> listB = getRoute().getAddress().b();
        this.call.u().add(this);
        f fVar2 = null;
        boolean z10 = false;
        try {
            try {
                if (this.tunnelRequest != null) {
                    t.ConnectResult connectResultP = p();
                    if (connectResultP.c() != null || connectResultP.e() != null) {
                        this.call.u().remove(this);
                        Socket socket3 = this.javaNetSocket;
                        if (socket3 != null) {
                            nv.q.h(socket3);
                        }
                        nv.q.h(socket2);
                        return connectResultP;
                    }
                }
                if (getRoute().getAddress().getSslSocketFactory() != null) {
                    a aVar = this.socket;
                    if (aVar == null) {
                        Intrinsics.u("socket");
                        aVar = null;
                    }
                    if (aVar.getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String().getBufferField().c2()) {
                        a aVar2 = this.socket;
                        if (aVar2 == null) {
                            Intrinsics.u("socket");
                            aVar2 = null;
                        }
                        if (aVar2.getSink().getBufferField().c2()) {
                            this.call.getEventListener().secureConnectStart(this.call);
                            Socket socketCreateSocket = getRoute().getAddress().getSslSocketFactory().createSocket(socket2, getRoute().getAddress().getUrl().getHost(), getRoute().getAddress().getUrl().getPort(), true);
                            Intrinsics.d(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            f fVarV = v(listB, sSLSocket);
                            mv.m mVar = listB.get(fVarV.connectionSpecIndex);
                            f fVarU = fVarV.u(listB, sSLSocket);
                            try {
                                mVar.b(sSLSocket, fVarV.isTlsFallback);
                                m(sSLSocket, mVar);
                                this.call.getEventListener().secureConnectEnd(this.call, this.handshake);
                                fVar = fVarU;
                            } catch (IOException e10) {
                                iOException = e10;
                                fVar = fVarU;
                                this.call.getEventListener().connectFailed(this.call, getRoute().getSocketAddress(), getRoute().getProxy(), null, iOException);
                                this.connectionPool.getConnectionListener().c(getRoute(), this.call, iOException);
                                if (this.retryOnConnectionFailure && q.a(iOException)) {
                                    fVar2 = fVar;
                                }
                                t.ConnectResult connectResult = new t.ConnectResult(this, fVar2, iOException);
                                this.call.u().remove(this);
                                if (!z10) {
                                    socket = this.javaNetSocket;
                                    if (socket != null) {
                                        nv.q.h(socket);
                                    }
                                    nv.q.h(socket2);
                                }
                                return connectResult;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.javaNetSocket = socket2;
                List<e0> listF = getRoute().getAddress().f();
                e0 e0Var = e0.H2_PRIOR_KNOWLEDGE;
                if (!listF.contains(e0Var)) {
                    e0Var = e0.HTTP_1_1;
                }
                this.protocol = e0Var;
                fVar = null;
                try {
                    qv.d dVar = this.taskRunner;
                    o oVar = this.connectionPool;
                    j0 route = getRoute();
                    Socket socket4 = this.javaNetSocket;
                    Intrinsics.checkNotNull(socket4);
                    x xVar = this.handshake;
                    e0 e0Var2 = this.protocol;
                    Intrinsics.checkNotNull(e0Var2);
                    a aVar3 = this.socket;
                    if (aVar3 == null) {
                        Intrinsics.u("socket");
                        aVar3 = null;
                    }
                    n nVar = new n(dVar, oVar, route, socket2, socket4, xVar, e0Var2, aVar3, this.pingIntervalMillis, this.connectionPool.getConnectionListener());
                    this.connection = nVar;
                    nVar.z();
                    this.call.getEventListener().connectEnd(this.call, getRoute().getSocketAddress(), getRoute().getProxy(), this.protocol);
                    try {
                        t.ConnectResult connectResult2 = new t.ConnectResult(this, null, null, 6, null);
                        this.call.u().remove(this);
                        return connectResult2;
                    } catch (IOException e11) {
                        iOException = e11;
                        z10 = true;
                        this.call.getEventListener().connectFailed(this.call, getRoute().getSocketAddress(), getRoute().getProxy(), null, iOException);
                        this.connectionPool.getConnectionListener().c(getRoute(), this.call, iOException);
                        if (this.retryOnConnectionFailure) {
                            fVar2 = fVar;
                        }
                        t.ConnectResult connectResult3 = new t.ConnectResult(this, fVar2, iOException);
                        this.call.u().remove(this);
                        if (!z10) {
                            socket = this.javaNetSocket;
                            if (socket != null) {
                                nv.q.h(socket);
                            }
                            nv.q.h(socket2);
                        }
                        return connectResult3;
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = true;
                        this.call.u().remove(this);
                        if (!z10) {
                            Socket socket5 = this.javaNetSocket;
                            if (socket5 != null) {
                                nv.q.h(socket5);
                            }
                            nv.q.h(socket2);
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
            fVar = null;
        }
    }

    @Override // sv.d.a
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public j0 getRoute() {
        return this.route;
    }

    @Override // sv.d.a
    public void g(@NotNull m call, @Nullable IOException e10) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00fb  */
    @Override // rv.t.b
    @NotNull
    public t.ConnectResult h() throws Throwable {
        f fVar;
        f fVar2;
        Socket socket;
        Socket socket2;
        if (this.rawSocket != null) {
            throw new IllegalStateException("TCP already connected");
        }
        this.call.u().add(this);
        boolean z10 = false;
        try {
            try {
                this.call.getEventListener().connectStart(this.call, getRoute().getSocketAddress(), getRoute().getProxy());
                this.connectionPool.getConnectionListener().d(getRoute(), this.call);
                l();
                z10 = true;
                fVar2 = this;
                try {
                    t.ConnectResult connectResult = new t.ConnectResult(fVar2, null, null, 6, null);
                    fVar2.call.u().remove(this);
                    return connectResult;
                } catch (IOException e10) {
                    e = e10;
                    IOException iOException = e;
                    if (getRoute().getAddress().getProxy() == null && getRoute().getProxy().type() != Proxy.Type.DIRECT) {
                        getRoute().getAddress().getProxySelector().connectFailed(getRoute().getAddress().getUrl().u(), getRoute().getProxy().address(), iOException);
                    }
                    fVar2.call.getEventListener().connectFailed(fVar2.call, getRoute().getSocketAddress(), getRoute().getProxy(), null, iOException);
                    fVar2.connectionPool.getConnectionListener().c(getRoute(), fVar2.call, iOException);
                    f fVar3 = fVar2;
                    try {
                        t.ConnectResult connectResult2 = new t.ConnectResult(fVar3, null, iOException, 2, null);
                        fVar2.call.u().remove(this);
                        if (!z10 && (socket2 = fVar2.rawSocket) != null) {
                            nv.q.h(socket2);
                        }
                        return connectResult2;
                    } catch (Throwable th2) {
                        th = th2;
                        fVar = fVar3;
                        fVar.call.u().remove(this);
                        if (!z10) {
                            nv.q.h(socket);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fVar.call.u().remove(this);
                if (!z10 && (socket = fVar.rawSocket) != null) {
                    nv.q.h(socket);
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            fVar2 = this;
        } catch (Throwable th4) {
            th = th4;
            fVar = this;
            fVar.call.u().remove(this);
            if (!z10) {
                nv.q.h(socket);
            }
            throw th;
        }
    }

    public final void k() {
        Socket socket = this.javaNetSocket;
        if (socket != null) {
            nv.q.h(socket);
        }
    }

    public final void l() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = getRoute().getProxy().type();
        int i10 = type == null ? -1 : b.f30979a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            socketCreateSocket = getRoute().getAddress().getSocketFactory().createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(getRoute().getProxy());
        }
        this.rawSocket = socketCreateSocket;
        if (this.canceled) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.socketReadTimeoutMillis);
        try {
            okhttp3.internal.platform.c.INSTANCE.e().h(socketCreateSocket, getRoute().getSocketAddress(), this.socketConnectTimeoutMillis);
            try {
                this.socket = rv.b.b(socketCreateSocket);
            } catch (NullPointerException e10) {
                if (Intrinsics.c(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + getRoute().getSocketAddress());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void m(SSLSocket sslSocket, mv.m connectionSpec) {
        final mv.a address = getRoute().getAddress();
        try {
            if (connectionSpec.getSupportsTlsExtensions()) {
                okhttp3.internal.platform.c.INSTANCE.e().g(sslSocket, address.getUrl().getHost(), address.f());
            }
            sslSocket.startHandshake();
            SSLSession session = sslSocket.getSession();
            x.Companion companion = x.INSTANCE;
            Intrinsics.checkNotNull(session);
            final x xVarC = companion.c(session);
            HostnameVerifier hostnameVerifier = address.getHostnameVerifier();
            Intrinsics.checkNotNull(hostnameVerifier);
            if (hostnameVerifier.verify(address.getUrl().getHost(), session)) {
                final mv.h certificatePinner = address.getCertificatePinner();
                Intrinsics.checkNotNull(certificatePinner);
                final x xVar = new x(xVarC.getTlsVersion(), xVarC.getCipherSuite(), xVarC.d(), new Function0() { // from class: rv.d
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return f.n(certificatePinner, xVarC, address);
                    }
                });
                this.handshake = xVar;
                certificatePinner.d(address.getUrl().getHost(), new Function0() { // from class: rv.e
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return f.o(xVar);
                    }
                });
                String strJ = connectionSpec.getSupportsTlsExtensions() ? okhttp3.internal.platform.c.INSTANCE.e().j(sslSocket) : null;
                this.javaNetSocket = sslSocket;
                this.socket = rv.b.b(sslSocket);
                this.protocol = strJ != null ? e0.INSTANCE.a(strJ) : e0.HTTP_1_1;
                okhttp3.internal.platform.c.INSTANCE.e().d(sslSocket);
                return;
            }
            List<Certificate> listE = xVarC.e();
            if (listE.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + address.getUrl().getHost() + " not verified (no certificates)");
            }
            Certificate certificate = listE.get(0);
            Intrinsics.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) certificate;
            throw new SSLPeerUnverifiedException(p001kotlin.text.r.p("\n            |Hostname " + address.getUrl().getHost() + " not verified:\n            |    certificate: " + mv.h.INSTANCE.a(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + bw.d.f4602a.a(x509Certificate) + "\n            ", null, 1, null));
        } catch (Throwable th2) {
            okhttp3.internal.platform.c.INSTANCE.e().d(sslSocket);
            nv.q.h(sslSocket);
            throw th2;
        }
    }

    @NotNull
    public final t.ConnectResult p() throws IOException {
        f0 f0VarS = s();
        if (f0VarS == null) {
            return new t.ConnectResult(this, null, null, 6, null);
        }
        Socket socket = this.rawSocket;
        if (socket != null) {
            nv.q.h(socket);
        }
        int i10 = this.attempt + 1;
        if (i10 < 21) {
            this.call.getEventListener().connectEnd(this.call, getRoute().getSocketAddress(), getRoute().getProxy(), null);
            return new t.ConnectResult(this, r(this, i10, f0VarS, 0, false, 12, null), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        this.call.getEventListener().connectFailed(this.call, getRoute().getSocketAddress(), getRoute().getProxy(), null, protocolException);
        this.connectionPool.getConnectionListener().c(getRoute(), this.call, protocolException);
        return new t.ConnectResult(this, null, protocolException, 2, null);
    }

    public final f q(int attempt, f0 tunnelRequest, int connectionSpecIndex, boolean isTlsFallback) {
        return new f(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this.routePlanner, getRoute(), this.routes, attempt, tunnelRequest, connectionSpecIndex, isTlsFallback);
    }

    public final f0 s() throws IOException {
        f0 f0Var = this.tunnelRequest;
        Intrinsics.checkNotNull(f0Var);
        String str = "CONNECT " + nv.q.t(getRoute().getAddress().getUrl(), true) + " HTTP/1.1";
        while (true) {
            a aVar = this.socket;
            if (aVar == null) {
                Intrinsics.u("socket");
                aVar = null;
            }
            tv.b bVar = new tv.b(null, this, aVar);
            a aVar2 = this.socket;
            if (aVar2 == null) {
                Intrinsics.u("socket");
                aVar2 = null;
            }
            m0 timeout = aVar2.getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String().getTimeout();
            long j10 = this.readTimeoutMillis;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeout.g(j10, timeUnit);
            a aVar3 = this.socket;
            if (aVar3 == null) {
                Intrinsics.u("socket");
                aVar3 = null;
            }
            aVar3.getSink().getTimeout().g(this.writeTimeoutMillis, timeUnit);
            bVar.B(f0Var.getHeaders(), str);
            bVar.b();
            h0.a aVarE = bVar.e(false);
            Intrinsics.checkNotNull(aVarE);
            h0 h0VarC = aVarE.q(f0Var).c();
            bVar.A(h0VarC);
            int code = h0VarC.getCode();
            if (code == 200) {
                return null;
            }
            if (code != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + h0VarC.getCode());
            }
            f0 f0VarA = getRoute().getAddress().getProxyAuthenticator().a(getRoute(), h0VarC);
            if (f0VarA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (p001kotlin.text.x.E("close", h0.n(h0VarC, "Connection", null, 2, null), true)) {
                return f0VarA;
            }
            f0Var = f0VarA;
        }
    }

    @Nullable
    public final List<j0> t() {
        return this.routes;
    }

    @Nullable
    public final f u(@NotNull List<mv.m> connectionSpecs, @NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i10 = this.connectionSpecIndex + 1;
        int size = connectionSpecs.size();
        for (int i11 = i10; i11 < size; i11++) {
            if (connectionSpecs.get(i11).e(sslSocket)) {
                return r(this, 0, null, i11, this.connectionSpecIndex != -1, 3, null);
            }
        }
        return null;
    }

    @NotNull
    public final f v(@NotNull List<mv.m> connectionSpecs, @NotNull SSLSocket sslSocket) throws UnknownServiceException {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (this.connectionSpecIndex != -1) {
            return this;
        }
        f fVarU = u(connectionSpecs, sslSocket);
        if (fVarU != null) {
            return fVarU;
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
}
