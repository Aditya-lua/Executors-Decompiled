package rv;

import com.github.luben.zstd.BuildConfig;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import mv.j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u00015\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001bB1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u001e¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010+\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00106R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001a088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00109¨\u0006;"}, d2 = {"Lrv/o;", BuildConfig.FLAVOR, "Lqv/d;", "taskRunner", BuildConfig.FLAVOR, "maxIdleConnections", BuildConfig.FLAVOR, "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Lrv/g;", "connectionListener", "<init>", "(Lqv/d;IJLjava/util/concurrent/TimeUnit;Lrv/g;)V", "d", "()I", BuildConfig.FLAVOR, "doExtensiveHealthChecks", "Lmv/a;", "address", "Lrv/m;", "call", BuildConfig.FLAVOR, "Lmv/j0;", "routes", "requireMultiplexed", "Lrv/n;", "a", "(ZLmv/a;Lrv/m;Ljava/util/List;Z)Lrv/n;", "connection", BuildConfig.FLAVOR, "g", "(Lrv/n;)V", "c", "(Lrv/n;)Z", "now", "b", "(J)J", "h", "()V", "f", "(Lrv/n;J)I", "I", "Lrv/g;", "e", "()Lrv/g;", "J", "getKeepAliveDurationNs$okhttp", "()J", "keepAliveDurationNs", "Lqv/c;", "Lqv/c;", "cleanupQueue", "rv/o$b", "Lrv/o$b;", "cleanupTask", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int maxIdleConnections;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g connectionListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long keepAliveDurationNs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qv.c cleanupQueue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b cleanupTask;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ConcurrentLinkedQueue<n> connections;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"rv/o$b", "Lqv/a;", BuildConfig.FLAVOR, "f", "()J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends qv.a {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override // qv.a
        public long f() {
            return o.this.b(System.nanoTime());
        }
    }

    public o(@NotNull qv.d taskRunner, int i10, long j10, @NotNull TimeUnit timeUnit, @NotNull g connectionListener) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        this.maxIdleConnections = i10;
        this.connectionListener = connectionListener;
        this.keepAliveDurationNs = timeUnit.toNanos(j10);
        this.cleanupQueue = taskRunner.k();
        this.cleanupTask = new b(nv.q.f26640c + " ConnectionPool connection closer");
        this.connections = new ConcurrentLinkedQueue<>();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x0029, B:14:0x0032, B:17:0x0039), top: B:38:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x0029, B:14:0x0032, B:17:0x0039), top: B:38:0x0029 }] */
    @Nullable
    public final n a(boolean doExtensiveHealthChecks, @NotNull mv.a address, @NotNull m call, @Nullable List<j0> routes, boolean requireMultiplexed) {
        boolean z10;
        boolean noNewExchanges;
        Socket socketD;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator<n> it = this.connections.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            n next = it.next();
            Intrinsics.checkNotNull(next);
            synchronized (next) {
                z10 = false;
                if (requireMultiplexed) {
                    try {
                        if (next.r()) {
                            if (!next.p(address, routes)) {
                                call.c(next);
                                z10 = true;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else if (!next.p(address, routes)) {
                    call.c(next);
                    z10 = true;
                }
            }
            if (z10) {
                if (next.q(doExtensiveHealthChecks)) {
                    return next;
                }
                synchronized (next) {
                    noNewExchanges = next.getNoNewExchanges();
                    next.x(true);
                    socketD = call.D();
                }
                if (socketD != null) {
                    nv.q.h(socketD);
                    this.connectionListener.f(next);
                } else if (!noNewExchanges) {
                    this.connectionListener.h(next);
                }
            }
        }
        return null;
    }

    public final long b(long now) {
        long j10 = (now - this.keepAliveDurationNs) + 1;
        Iterator<n> it = this.connections.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        n nVar = null;
        long j11 = Long.MAX_VALUE;
        int i10 = 0;
        n nVar2 = null;
        n nVar3 = null;
        int i11 = 0;
        while (it.hasNext()) {
            n next = it.next();
            Intrinsics.checkNotNull(next);
            synchronized (next) {
                if (f(next, now) > 0) {
                    i11++;
                } else {
                    long idleAtNs = next.getIdleAtNs();
                    if (idleAtNs < j10) {
                        nVar2 = next;
                        j10 = idleAtNs;
                    }
                    i10++;
                    if (idleAtNs < j11) {
                        nVar3 = next;
                        j11 = idleAtNs;
                    }
                }
                Unit unit = Unit.f21506a;
            }
        }
        if (nVar2 != null) {
            nVar = nVar2;
        } else if (i10 > this.maxIdleConnections) {
            j10 = j11;
            nVar = nVar3;
        } else {
            j10 = -1;
        }
        if (nVar == null) {
            if (nVar3 != null) {
                return (j11 + this.keepAliveDurationNs) - now;
            }
            if (i11 > 0) {
                return this.keepAliveDurationNs;
            }
            return -1L;
        }
        synchronized (nVar) {
            if (!nVar.i().isEmpty()) {
                return 0L;
            }
            if (nVar.getIdleAtNs() != j10) {
                return 0L;
            }
            nVar.x(true);
            this.connections.remove(nVar);
            nv.q.h(nVar.getJavaNetSocket());
            this.connectionListener.f(nVar);
            if (this.connections.isEmpty()) {
                this.cleanupQueue.a();
            }
            return 0L;
        }
    }

    public final boolean c(@NotNull n connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (nv.q.b && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.getNoNewExchanges() && this.maxIdleConnections != 0) {
            h();
            return false;
        }
        connection.x(true);
        this.connections.remove(connection);
        if (this.connections.isEmpty()) {
            this.cleanupQueue.a();
        }
        return true;
    }

    public final int d() {
        return this.connections.size();
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final g getConnectionListener() {
        return this.connectionListener;
    }

    public final int f(n connection, long now) {
        if (nv.q.b && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        List<Reference<m>> listI = connection.i();
        int i10 = 0;
        while (i10 < listI.size()) {
            Reference<m> reference = listI.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                Intrinsics.d(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                okhttp3.internal.platform.c.INSTANCE.e().n("A connection to " + connection.u().getAddress().getUrl() + " was leaked. Did you forget to close a response body?", ((m.b) reference).getCallStackTrace());
                listI.remove(i10);
                if (listI.isEmpty()) {
                    connection.w(now - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return listI.size();
    }

    public final void g(@NotNull n connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!nv.q.b || Thread.holdsLock(connection)) {
            this.connections.add(connection);
            h();
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    public final void h() {
        qv.c.m(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
    }
}
