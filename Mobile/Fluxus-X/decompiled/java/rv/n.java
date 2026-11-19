package rv;

import com.github.luben.zstd.BuildConfig;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import ew.m0;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import mv.d0;
import mv.e0;
import mv.j0;
import mv.x;
import mv.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;
import uv.a0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001VB[\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001aH\u0016¢\u0006\u0004\b(\u0010\u001cJ\u000f\u0010)\u001a\u00020\u001aH\u0000¢\u0006\u0004\b)\u0010\u001cJ\u000f\u0010*\u001a\u00020\u001aH\u0000¢\u0006\u0004\b*\u0010\u001cJ\r\u0010+\u001a\u00020\u001a¢\u0006\u0004\b+\u0010\u001cJ'\u0010/\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020,2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001dH\u0000¢\u0006\u0004\b/\u00100J\u001f\u00106\u001a\u0002052\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0000¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u001aH\u0000¢\u0006\u0004\b8\u0010\u001cJ\u000f\u00109\u001a\u00020\tH\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u001aH\u0016¢\u0006\u0004\b;\u0010\u001cJ\u000f\u0010<\u001a\u00020\u000bH\u0016¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u001f¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010I\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u0011\u0010K\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\bK\u0010LJ'\u0010P\u001a\u00020\u001a2\u0006\u00102\u001a\u0002012\u0006\u0010M\u001a\u00020\t2\u0006\u0010O\u001a\u00020NH\u0000¢\u0006\u0004\bP\u0010QJ!\u0010T\u001a\u00020\u001a2\u0006\u0010S\u001a\u00020R2\b\u0010&\u001a\u0004\u0018\u00010NH\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0010H\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010Y\u001a\u00020XH\u0016¢\u0006\u0004\bY\u0010ZR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bC\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010a\u001a\u0004\bb\u0010:R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010cR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010dR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u001a\u0010\u0017\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bg\u0010mR\u0018\u0010p\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\"\u0010u\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010q\u001a\u0004\bk\u0010r\"\u0004\bs\u0010tR\u0016\u0010v\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010qR\"\u0010z\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010j\u001a\u0004\bn\u0010w\"\u0004\bx\u0010yR\u0016\u0010{\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010jR\u0016\u0010}\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010jR%\u0010\u0080\u0001\u001a\u00020\u00142\u0006\u0010~\u001a\u00020\u00148\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b6\u0010j\u001a\u0004\b\u007f\u0010wR(\u0010\u0085\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020R0\u0082\u00010\u0081\u00018\u0006¢\u0006\u000e\n\u0005\b)\u0010\u0083\u0001\u001a\u0005\be\u0010\u0084\u0001R(\u0010\u008b\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b9\u0010\u0087\u0001\u001a\u0005\bi\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0015\u0010\u008c\u0001\u001a\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b|\u0010r¨\u0006\u008d\u0001"}, d2 = {"Lrv/n;", "Luv/o$c;", "Lmv/k;", "Lsv/d$a;", BuildConfig.FLAVOR, "Lqv/d;", "taskRunner", "Lrv/o;", "connectionPool", "Lmv/j0;", "route", "Ljava/net/Socket;", "rawSocket", "javaNetSocket", "Lmv/x;", "handshake", "Lmv/e0;", "protocol", "Lrv/a;", "socket", BuildConfig.FLAVOR, "pingIntervalMillis", "Lrv/g;", "connectionListener", "<init>", "(Lqv/d;Lrv/o;Lmv/j0;Ljava/net/Socket;Ljava/net/Socket;Lmv/x;Lmv/e0;Lrv/a;ILrv/g;)V", BuildConfig.FLAVOR, "A", "()V", BuildConfig.FLAVOR, "candidates", BuildConfig.FLAVOR, "v", "(Ljava/util/List;)Z", "Lmv/z;", "url", "B", "(Lmv/z;)Z", "e", "(Lmv/z;Lmv/x;)Z", "d", "t", "o", "z", "Lmv/a;", "address", "routes", "p", "(Lmv/a;Ljava/util/List;)Z", "Lmv/d0;", "client", "Lsv/g;", "chain", "Lsv/d;", "s", "(Lmv/d0;Lsv/g;)Lsv/d;", "C", "u", "()Lmv/j0;", "cancel", "y", "()Ljava/net/Socket;", "doExtensiveChecks", "q", "(Z)Z", "Luv/v;", "stream", "c", "(Luv/v;)V", "Luv/o;", "connection", "Luv/z;", "settings", "b", "(Luv/o;Luv/z;)V", "n", "()Lmv/x;", "failedRoute", "Ljava/io/IOException;", "failure", "h", "(Lmv/d0;Lmv/j0;Ljava/io/IOException;)V", "Lrv/m;", "call", "g", "(Lrv/m;Ljava/io/IOException;)V", "a", "()Lmv/e0;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Lqv/d;", "getTaskRunner", "()Lqv/d;", "Lrv/o;", "getConnectionPool", "()Lrv/o;", "Lmv/j0;", "f", "Ljava/net/Socket;", "Lmv/x;", "i", "Lmv/e0;", "j", "Lrv/a;", "k", "I", "l", "Lrv/g;", "()Lrv/g;", "m", "Luv/o;", "http2Connection", "Z", "()Z", "x", "(Z)V", "noNewExchanges", "noCoalescedConnections", "()I", "setRouteFailureCount$okhttp", "(I)V", "routeFailureCount", "successCount", "r", "refusedStreamCount", "value", "getAllocationLimit$okhttp", "allocationLimit", BuildConfig.FLAVOR, "Ljava/lang/ref/Reference;", "Ljava/util/List;", "()Ljava/util/List;", "calls", BuildConfig.FLAVOR, "J", "()J", "w", "(J)V", "idleAtNs", "isMultiplexed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends uv.o.c implements mv.k, sv.d.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qv.d taskRunner;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o connectionPool;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j0 route;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Socket rawSocket;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Socket javaNetSocket;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final x handshake;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e0 protocol;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a socket;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final int pingIntervalMillis;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g connectionListener;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public uv.o http2Connection;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean noNewExchanges;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean noCoalescedConnections;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public int routeFailureCount;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public int successCount;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public int refusedStreamCount;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public int allocationLimit;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Reference<m>> calls;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public long idleAtNs;

    public n(@NotNull qv.d taskRunner, @NotNull o connectionPool, @NotNull j0 route, @NotNull Socket rawSocket, @NotNull Socket javaNetSocket, @Nullable x xVar, @NotNull e0 protocol, @NotNull a socket, int i10, @NotNull g connectionListener) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(rawSocket, "rawSocket");
        Intrinsics.checkNotNullParameter(javaNetSocket, "javaNetSocket");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        this.taskRunner = taskRunner;
        this.connectionPool = connectionPool;
        this.route = route;
        this.rawSocket = rawSocket;
        this.javaNetSocket = javaNetSocket;
        this.handshake = xVar;
        this.protocol = protocol;
        this.socket = socket;
        this.pingIntervalMillis = i10;
        this.connectionListener = connectionListener;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    public final void A() throws SocketException {
        this.javaNetSocket.setSoTimeout(0);
        Object obj = this.connectionListener;
        uv.c cVar = obj instanceof uv.c ? (uv.c) obj : null;
        if (cVar == null) {
            cVar = uv.c.a.f33970a;
        }
        uv.o oVarA = new uv.o.a(true, this.taskRunner).o(this.socket, getRoute().getAddress().getUrl().getHost()).k(this).l(this.pingIntervalMillis).b(cVar).a();
        this.http2Connection = oVarA;
        this.allocationLimit = uv.o.INSTANCE.a().d();
        uv.o.V0(oVarA, false, 1, null);
    }

    public final boolean B(z url) {
        x xVar;
        if (!nv.q.b || Thread.holdsLock(this)) {
            z url2 = getRoute().getAddress().getUrl();
            if (url.getPort() != url2.getPort()) {
                return false;
            }
            if (Intrinsics.c(url.getHost(), url2.getHost())) {
                return true;
            }
            return (this.noCoalescedConnections || (xVar = this.handshake) == null || !e(url, xVar)) ? false : true;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final void C() throws SocketException {
        this.javaNetSocket.setSoTimeout(0);
        d();
    }

    @Override // mv.k
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public e0 getProtocol() {
        return this.protocol;
    }

    @Override // uv.o.c
    public void b(@NotNull uv.o connection, @NotNull uv.z settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        synchronized (this) {
            this.allocationLimit = settings.d();
            Unit unit = Unit.f21506a;
        }
    }

    @Override // uv.o.c
    public void c(@NotNull uv.v stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.g(uv.b.REFUSED_STREAM, null);
    }

    @Override // sv.d.a
    public void cancel() {
        nv.q.h(this.rawSocket);
    }

    @Override // sv.d.a
    public void d() {
        synchronized (this) {
            this.noNewExchanges = true;
            Unit unit = Unit.f21506a;
        }
        this.connectionListener.h(this);
    }

    public final boolean e(z url, x handshake) {
        List<Certificate> listE = handshake.e();
        if (!listE.isEmpty()) {
            bw.d dVar = bw.d.f4602a;
            String host = url.getHost();
            Certificate certificate = listE.get(0);
            Intrinsics.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.e(host, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    @Override // sv.d.a
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public j0 getRoute() {
        return this.route;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    @Override // sv.d.a
    public void g(@NotNull m call, @Nullable IOException e10) {
        boolean z10;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                if (e10 instanceof a0) {
                    if (((a0) e10).errorCode == uv.b.REFUSED_STREAM) {
                        int i10 = this.refusedStreamCount + 1;
                        this.refusedStreamCount = i10;
                        if (i10 > 1) {
                            z10 = !this.noNewExchanges;
                            this.noNewExchanges = true;
                            this.routeFailureCount++;
                        } else {
                            z10 = false;
                        }
                    } else if (((a0) e10).errorCode == uv.b.CANCEL && call.getCanceled()) {
                        z10 = false;
                    } else {
                        z10 = !this.noNewExchanges;
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (!r() || (e10 instanceof uv.a)) {
                    boolean z11 = !this.noNewExchanges;
                    this.noNewExchanges = true;
                    if (this.successCount == 0) {
                        if (e10 != null) {
                            h(call.getClient(), getRoute(), e10);
                        }
                        this.routeFailureCount++;
                    }
                    z10 = z11;
                } else {
                    z10 = false;
                }
                Unit unit = Unit.f21506a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.connectionListener.h(this);
        }
    }

    public final void h(@NotNull d0 client, @NotNull j0 failedRoute, @NotNull IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.getProxy().type() != Proxy.Type.DIRECT) {
            mv.a address = failedRoute.getAddress();
            address.getProxySelector().connectFailed(address.getUrl().u(), failedRoute.getProxy().address(), failure);
        }
        client.getRouteDatabase().b(failedRoute);
    }

    @NotNull
    public final List<Reference<m>> i() {
        return this.calls;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final g getConnectionListener() {
        return this.connectionListener;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getIdleAtNs() {
        return this.idleAtNs;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getRouteFailureCount() {
        return this.routeFailureCount;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public x getHandshake() {
        return this.handshake;
    }

    public final void o() {
        synchronized (this) {
            this.successCount++;
        }
    }

    public final boolean p(@NotNull mv.a address, @Nullable List<j0> routes) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (nv.q.b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !getRoute().getAddress().d(address)) {
            return false;
        }
        if (Intrinsics.c(address.getUrl().getHost(), u().getAddress().getUrl().getHost())) {
            return true;
        }
        if (this.http2Connection == null || routes == null || !v(routes) || address.getHostnameVerifier() != bw.d.f4602a || !B(address.getUrl())) {
            return false;
        }
        try {
            mv.h certificatePinner = address.getCertificatePinner();
            Intrinsics.checkNotNull(certificatePinner);
            String host = address.getUrl().getHost();
            x handshake = getHandshake();
            Intrinsics.checkNotNull(handshake);
            certificatePinner.b(host, handshake.e());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean q(boolean doExtensiveChecks) {
        long j10;
        if (nv.q.b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        if (this.rawSocket.isClosed() || this.javaNetSocket.isClosed() || this.javaNetSocket.isInputShutdown() || this.javaNetSocket.isOutputShutdown()) {
            return false;
        }
        uv.o oVar = this.http2Connection;
        if (oVar != null) {
            return oVar.n0(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.idleAtNs;
        }
        if (j10 < 10000000000L || !doExtensiveChecks) {
            return true;
        }
        return nv.q.m(this.javaNetSocket, this.socket.a());
    }

    public final boolean r() {
        return this.http2Connection != null;
    }

    @NotNull
    public final sv.d s(@NotNull d0 client, @NotNull sv.g chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        a aVar = this.socket;
        uv.o oVar = this.http2Connection;
        if (oVar != null) {
            return new uv.t(client, this, chain, oVar);
        }
        this.javaNetSocket.setSoTimeout(chain.l());
        m0 m0VarT = aVar.a().t();
        long jI = chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m0VarT.g(jI, timeUnit);
        aVar.b().t().g(chain.getWriteTimeoutMillis(), timeUnit);
        return new tv.b(client, this, aVar);
    }

    public final void t() {
        synchronized (this) {
            this.noCoalescedConnections = true;
            Unit unit = Unit.f21506a;
        }
    }

    @NotNull
    public String toString() {
        Object cipherSuite;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(getRoute().getAddress().getUrl().getHost());
        sb2.append(':');
        sb2.append(getRoute().getAddress().getUrl().getPort());
        sb2.append(", proxy=");
        sb2.append(getRoute().getProxy());
        sb2.append(" hostAddress=");
        sb2.append(getRoute().getSocketAddress());
        sb2.append(" cipherSuite=");
        x xVar = this.handshake;
        if (xVar == null || (cipherSuite = xVar.getCipherSuite()) == null) {
            cipherSuite = PayloadNotificationChannel.SOUND_NONE;
        }
        sb2.append(cipherSuite);
        sb2.append(" protocol=");
        sb2.append(this.protocol);
        sb2.append('}');
        return sb2.toString();
    }

    @NotNull
    public j0 u() {
        return getRoute();
    }

    public final boolean v(List<j0> candidates) {
        List<j0> list = candidates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (j0 j0Var : list) {
            Proxy.Type type = j0Var.getProxy().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && getRoute().getProxy().type() == type2 && Intrinsics.c(getRoute().getSocketAddress(), j0Var.getSocketAddress())) {
                return true;
            }
        }
        return false;
    }

    public final void w(long j10) {
        this.idleAtNs = j10;
    }

    public final void x(boolean z10) {
        this.noNewExchanges = z10;
    }

    @NotNull
    /* JADX INFO: renamed from: y, reason: from getter */
    public Socket getJavaNetSocket() {
        return this.javaNetSocket;
    }

    public final void z() throws SocketException {
        this.idleAtNs = System.nanoTime();
        e0 e0Var = this.protocol;
        if (e0Var == e0.HTTP_2 || e0Var == e0.H2_PRIOR_KNOWLEDGE) {
            A();
        }
    }
}
