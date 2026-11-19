package rv;

import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import mv.e0;
import mv.f0;
import mv.h0;
import mv.j0;
import mv.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001Bq\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b\u001f\u0010 J/\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001e2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"H\u0000¢\u0006\u0004\b&\u0010'J)\u0010)\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020#2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"H\u0000¢\u0006\u0004\b)\u0010*J\u0019\u0010-\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0011\u00103\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00152\u0006\u0010(\u001a\u00020#H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u0004\u0018\u00010#2\u0006\u00107\u001a\u00020+H\u0002¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010?R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010?R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010?R\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010@R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010@R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b:\u0010CR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010DR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010ER\u0014\u0010F\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010@R\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR \u0010U\u001a\b\u0012\u0004\u0012\u00020\u001b0Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\b>\u0010T¨\u0006V"}, d2 = {"Lrv/p;", "Lrv/t;", "Lqv/d;", "taskRunner", "Lrv/o;", "connectionPool", BuildConfig.FLAVOR, "readTimeoutMillis", "writeTimeoutMillis", "socketConnectTimeoutMillis", "socketReadTimeoutMillis", "pingIntervalMillis", BuildConfig.FLAVOR, "retryOnConnectionFailure", "fastFallback", "Lmv/a;", "address", "Lrv/s;", "routeDatabase", "Lrv/m;", "call", "Lmv/f0;", "request", "<init>", "(Lqv/d;Lrv/o;IIIIIZZLmv/a;Lrv/s;Lrv/m;Lmv/f0;)V", "m", "()Z", "Lrv/t$b;", "d", "()Lrv/t$b;", "Lrv/f;", "h", "()Lrv/f;", "planToReplace", BuildConfig.FLAVOR, "Lmv/j0;", "routes", "Lrv/r;", "l", "(Lrv/f;Ljava/util/List;)Lrv/r;", "route", "i", "(Lmv/j0;Ljava/util/List;)Lrv/f;", "Lrv/n;", "failedConnection", "e", "(Lrv/n;)Z", "Lmv/z;", "url", "f", "(Lmv/z;)Z", "k", "()Lrv/r;", "g", "(Lmv/j0;)Lmv/f0;", "connection", "o", "(Lrv/n;)Lmv/j0;", "a", "Lqv/d;", "b", "Lrv/o;", "c", "I", "Z", "j", "Lmv/a;", "()Lmv/a;", "Lrv/s;", "Lrv/m;", "doExtensiveHealthChecks", "Lrv/u$b;", "n", "Lrv/u$b;", "routeSelection", "Lrv/u;", "Lrv/u;", "routeSelector", "p", "Lmv/j0;", "nextRouteToTry", "Lkotlin/collections/i;", "q", "Lkotlin/collections/i;", "()Lkotlin/collections/i;", "deferredPlans", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements t {

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
    public final boolean fastFallback;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mv.a address;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s routeDatabase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m call;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final boolean doExtensiveHealthChecks;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public u.b routeSelection;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public u routeSelector;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public j0 nextRouteToTry;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p001kotlin.collections.i<t.b> deferredPlans;

    public p(@NotNull qv.d taskRunner, @NotNull o connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, @NotNull mv.a address, @NotNull s routeDatabase, @NotNull m call, @NotNull f0 request) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        this.taskRunner = taskRunner;
        this.connectionPool = connectionPool;
        this.readTimeoutMillis = i10;
        this.writeTimeoutMillis = i11;
        this.socketConnectTimeoutMillis = i12;
        this.socketReadTimeoutMillis = i13;
        this.pingIntervalMillis = i14;
        this.retryOnConnectionFailure = z10;
        this.fastFallback = z11;
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.doExtensiveHealthChecks = !Intrinsics.c(request.getMethod(), "GET");
        this.deferredPlans = new p001kotlin.collections.i<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f j(p pVar, j0 j0Var, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        return pVar.i(j0Var, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ r n(p pVar, f fVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = null;
        }
        if ((i10 & 2) != 0) {
            list = null;
        }
        return pVar.l(fVar, list);
    }

    @Override // rv.t
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public mv.a getAddress() {
        return this.address;
    }

    @Override // rv.t
    @NotNull
    public p001kotlin.collections.i<t.b> c() {
        return this.deferredPlans;
    }

    @Override // rv.t
    @NotNull
    public t.b d() throws IOException {
        r rVarK = k();
        if (rVarK != null) {
            return rVarK;
        }
        r rVarN = n(this, null, null, 3, null);
        if (rVarN != null) {
            return rVarN;
        }
        if (!c().isEmpty()) {
            return c().removeFirst();
        }
        f fVarH = h();
        r rVarL = l(fVarH, fVarH.t());
        return rVarL != null ? rVarL : fVarH;
    }

    @Override // rv.t
    public boolean e(@Nullable n failedConnection) {
        u uVar;
        j0 j0VarO;
        if (!c().isEmpty() || this.nextRouteToTry != null) {
            return true;
        }
        if (failedConnection != null && (j0VarO = o(failedConnection)) != null) {
            this.nextRouteToTry = j0VarO;
            return true;
        }
        u.b bVar = this.routeSelection;
        if ((bVar == null || !bVar.b()) && (uVar = this.routeSelector) != null) {
            return uVar.a();
        }
        return true;
    }

    @Override // rv.t
    public boolean f(@NotNull z url) {
        Intrinsics.checkNotNullParameter(url, "url");
        z url2 = getAddress().getUrl();
        return url.getPort() == url2.getPort() && Intrinsics.c(url.getHost(), url2.getHost());
    }

    public final f0 g(j0 route) {
        f0 f0VarB = new f0.a().v(route.getAddress().getUrl()).o("CONNECT", null).m("Host", nv.q.t(route.getAddress().getUrl(), true)).m("Proxy-Connection", "Keep-Alive").m("User-Agent", "okhttp/5.3.2").b();
        f0 f0VarA = route.getAddress().getProxyAuthenticator().a(route, new h0.a().q(f0VarB).o(e0.HTTP_1_1).f(407).l("Preemptive Authenticate").r(-1L).p(-1L).i("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return f0VarA == null ? f0VarB : f0VarA;
    }

    @NotNull
    public final f h() throws IOException {
        j0 j0Var = this.nextRouteToTry;
        if (j0Var != null) {
            this.nextRouteToTry = null;
            return j(this, j0Var, null, 2, null);
        }
        u.b bVar = this.routeSelection;
        if (bVar != null && bVar.b()) {
            return j(this, bVar.c(), null, 2, null);
        }
        u uVar = this.routeSelector;
        if (uVar == null) {
            uVar = new u(getAddress(), this.routeDatabase, this.call, this.fastFallback);
            this.routeSelector = uVar;
        }
        if (!uVar.a()) {
            throw new IOException("exhausted all routes");
        }
        u.b bVarC = uVar.c();
        this.routeSelection = bVarC;
        if (m()) {
            throw new IOException("Canceled");
        }
        return i(bVarC.c(), bVarC.a());
    }

    @NotNull
    public final f i(@NotNull j0 route, @Nullable List<j0> routes) throws UnknownServiceException {
        Intrinsics.checkNotNullParameter(route, "route");
        if (route.getAddress().getSslSocketFactory() == null) {
            if (!route.getAddress().b().contains(mv.m.f24745k)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String host = route.getAddress().getUrl().getHost();
            if (!okhttp3.internal.platform.c.INSTANCE.e().l(host)) {
                throw new UnknownServiceException("CLEARTEXT communication to " + host + " not permitted by network security policy");
            }
        } else if (route.getAddress().f().contains(e0.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        return new f(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this, route, routes, 0, route.c() ? g(route) : null, -1, false);
    }

    public final r k() {
        Socket socketD;
        boolean z10;
        n connection = this.call.getConnection();
        if (connection == null) {
            return null;
        }
        boolean zQ = connection.q(this.doExtensiveHealthChecks);
        synchronized (connection) {
            try {
                if (!zQ) {
                    z10 = !connection.getNoNewExchanges();
                    connection.x(true);
                    socketD = this.call.D();
                } else if (connection.getNoNewExchanges() || !f(connection.u().getAddress().getUrl())) {
                    socketD = this.call.D();
                    z10 = false;
                } else {
                    z10 = false;
                    socketD = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.call.getConnection() != null) {
            if (socketD == null) {
                return new r(connection);
            }
            throw new IllegalStateException("Check failed.");
        }
        if (socketD != null) {
            nv.q.h(socketD);
        }
        this.call.getEventListener().connectionReleased(this.call, connection);
        connection.getConnectionListener().g(connection, this.call);
        if (socketD != null) {
            connection.getConnectionListener().f(connection);
        } else if (z10) {
            connection.getConnectionListener().h(connection);
        }
        return null;
    }

    @Nullable
    public final r l(@Nullable f planToReplace, @Nullable List<j0> routes) {
        n nVarA = this.connectionPool.a(this.doExtensiveHealthChecks, getAddress(), this.call, routes, planToReplace != null && planToReplace.getIsReady());
        if (nVarA == null) {
            return null;
        }
        if (planToReplace != null) {
            this.nextRouteToTry = planToReplace.getRoute();
            planToReplace.k();
        }
        this.call.getEventListener().connectionAcquired(this.call, nVarA);
        nVarA.getConnectionListener().e(nVarA, this.call);
        return new r(nVarA);
    }

    @Override // rv.t
    public boolean m() {
        return this.call.getCanceled();
    }

    public final j0 o(n connection) {
        j0 j0VarU;
        synchronized (connection) {
            j0VarU = null;
            if (connection.getRouteFailureCount() == 0 && connection.getNoNewExchanges() && nv.q.f(connection.u().getAddress().getUrl(), getAddress().getUrl())) {
                j0VarU = connection.u();
            }
        }
        return j0VarU;
    }
}
