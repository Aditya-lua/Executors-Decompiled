package rv;

import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\"\u0010'\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\u000b0\u000b0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&¨\u0006("}, d2 = {"Lrv/k;", "Lrv/i;", "Lrv/t;", "routePlanner", "Lqv/d;", "taskRunner", "<init>", "(Lrv/t;Lqv/d;)V", "Lrv/n;", "a", "()Lrv/n;", "Lrv/t$a;", "g", "()Lrv/t$a;", BuildConfig.FLAVOR, "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "e", "(JLjava/util/concurrent/TimeUnit;)Lrv/t$a;", BuildConfig.FLAVOR, "f", "()V", "Lrv/t;", "b", "()Lrv/t;", "Lqv/d;", "c", "J", "connectDelayNanos", "d", "nextTcpConnectAtNanos", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lrv/t$b;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "tcpConnectsInFlight", "Ljava/util/concurrent/BlockingQueue;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/BlockingQueue;", "connectResults", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t routePlanner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final qv.d taskRunner;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long connectDelayNanos;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long nextTcpConnectAtNanos;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<t.b> tcpConnectsInFlight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BlockingQueue<t.ConnectResult> connectResults;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"rv/k$a", "Lqv/a;", BuildConfig.FLAVOR, "f", "()J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends qv.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ t.b f31006e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ k f31007f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, t.b bVar, k kVar) {
            super(str, false, 2, null);
            this.f31006e = bVar;
            this.f31007f = kVar;
        }

        @Override // qv.a
        public long f() throws InterruptedException {
            t.ConnectResult connectResult;
            try {
                connectResult = this.f31006e.h();
            } catch (Throwable th2) {
                connectResult = new t.ConnectResult(this.f31006e, null, th2, 2, null);
            }
            if (!this.f31007f.tcpConnectsInFlight.contains(this.f31006e)) {
                return -1L;
            }
            this.f31007f.connectResults.put(connectResult);
            return -1L;
        }
    }

    public k(@NotNull t routePlanner, @NotNull qv.d taskRunner) {
        Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.routePlanner = routePlanner;
        this.taskRunner = taskRunner;
        this.connectDelayNanos = TimeUnit.MILLISECONDS.toNanos(250L);
        this.nextTcpConnectAtNanos = Long.MIN_VALUE;
        this.tcpConnectsInFlight = new CopyOnWriteArrayList<>();
        this.connectResults = taskRunner.getBackend().e(new LinkedBlockingDeque());
    }

    @Override // rv.i
    @NotNull
    public n a() throws IOException {
        t.ConnectResult connectResultG;
        long j10;
        IOException iOException = null;
        while (true) {
            try {
                if (this.tcpConnectsInFlight.isEmpty() && !t.b(getRoutePlanner(), null, 1, null)) {
                    f();
                    Intrinsics.checkNotNull(iOException);
                    throw iOException;
                }
                if (getRoutePlanner().m()) {
                    throw new IOException("Canceled");
                }
                long jC = this.taskRunner.getBackend().c();
                long j11 = this.nextTcpConnectAtNanos - jC;
                if (this.tcpConnectsInFlight.isEmpty() || j11 <= 0) {
                    connectResultG = g();
                    j10 = this.connectDelayNanos;
                    this.nextTcpConnectAtNanos = jC + j10;
                } else {
                    j10 = j11;
                    connectResultG = null;
                }
                if (connectResultG != null || (connectResultG = e(j10, TimeUnit.NANOSECONDS)) != null) {
                    if (connectResultG.f()) {
                        f();
                        if (!connectResultG.getPlan().getIsReady()) {
                            connectResultG = connectResultG.getPlan().getResult();
                        }
                        if (connectResultG.f()) {
                            n connection = connectResultG.getPlan().getConnection();
                            f();
                            return connection;
                        }
                    }
                    Throwable thE = connectResultG.e();
                    if (thE != null) {
                        if (!(thE instanceof IOException)) {
                            throw thE;
                        }
                        if (iOException == null) {
                            iOException = (IOException) thE;
                        } else {
                            zt.a.a(iOException, thE);
                        }
                    }
                    t.b bVarC = connectResultG.c();
                    if (bVarC != null) {
                        getRoutePlanner().c().addFirst(bVarC);
                    }
                }
            } catch (Throwable th2) {
                f();
                throw th2;
            }
        }
    }

    @Override // rv.i
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public t getRoutePlanner() {
        return this.routePlanner;
    }

    public final t.ConnectResult e(long timeout, TimeUnit unit) {
        t.ConnectResult connectResultPoll;
        if (this.tcpConnectsInFlight.isEmpty() || (connectResultPoll = this.connectResults.poll(timeout, unit)) == null) {
            return null;
        }
        this.tcpConnectsInFlight.remove(connectResultPoll.getPlan());
        return connectResultPoll;
    }

    public final void f() {
        Iterator<t.b> it = this.tcpConnectsInFlight.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            t.b next = it.next();
            next.cancel();
            t.b bVarB = next.b();
            if (bVarB != null) {
                getRoutePlanner().c().addLast(bVarB);
            }
        }
        this.tcpConnectsInFlight.clear();
    }

    public final t.ConnectResult g() {
        t.b jVar;
        if (t.b(getRoutePlanner(), null, 1, null)) {
            try {
                jVar = getRoutePlanner().d();
            } catch (Throwable th2) {
                jVar = new j(th2);
            }
            if (jVar.getIsReady()) {
                return new t.ConnectResult(jVar, null, null, 6, null);
            }
            if (jVar instanceof j) {
                return ((j) jVar).f();
            }
            this.tcpConnectsInFlight.add(jVar);
            qv.c.m(this.taskRunner.k(), new a(nv.q.f26640c + " connect " + getRoutePlanner().getAddress().getUrl().r(), jVar, this), 0L, 2, null);
        }
        return null;
    }
}
