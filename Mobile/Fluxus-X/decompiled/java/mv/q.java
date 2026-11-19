package mv;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007R\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007R\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0018\u00010\u0007R\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u001a\u001a\u00020\n2\u000e\b\u0002\u0010\u0017\u001a\b\u0018\u00010\u0007R\u00020\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u0019\u001a\b\u0018\u00010\u0007R\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010#\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u001e\u00102\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\b008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00101R\u001e\u00103\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\b008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\b008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00101R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b'\u00105¨\u00066"}, d2 = {"Lmv/q;", BuildConfig.FLAVOR, "<init>", "()V", "Ljava/util/concurrent/ExecutorService;", "executorService", "(Ljava/util/concurrent/ExecutorService;)V", "Lrv/m$a;", "Lrv/m;", "call", BuildConfig.FLAVOR, "a", "(Lrv/m$a;)V", BuildConfig.FLAVOR, "b", "(Lrv/m;)Z", "e", "f", "(Lrv/m;)V", BuildConfig.FLAVOR, "host", "d", "(Ljava/lang/String;)Lrv/m$a;", "enqueuedCall", "finishedCall", "finishedAsyncCall", "g", "(Lrv/m$a;Lrv/m;Lrv/m$a;)V", BuildConfig.FLAVOR, "maxRequests", "I", "getMaxRequests", "()I", "setMaxRequests", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "Ljava/lang/Runnable;", "c", "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "idleCallback", "Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "runningAsyncCalls", "runningSyncCalls", "()Ljava/util/concurrent/ExecutorService;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int maxRequests;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int maxRequestsPerHost;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Runnable idleCallback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ExecutorService executorServiceOrNull;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ArrayDeque<rv.m.a> readyAsyncCalls;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ArrayDeque<rv.m.a> runningAsyncCalls;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ArrayDeque<rv.m> runningSyncCalls;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003R\u00020\u00040\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR!\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003R\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"mv/q$a", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lrv/m$a;", "Lrv/m;", "callsToExecute", "Ljava/lang/Runnable;", "idleCallbackToRun", "<init>", "(Ljava/util/List;Ljava/lang/Runnable;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/Runnable;", "()Ljava/lang/Runnable;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final List<rv.m.a> callsToExecute;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Runnable idleCallbackToRun;

        public a(List<rv.m.a> callsToExecute, Runnable runnable) {
            Intrinsics.checkNotNullParameter(callsToExecute, "callsToExecute");
            this.callsToExecute = callsToExecute;
            this.idleCallbackToRun = runnable;
        }

        public final List<rv.m.a> a() {
            return this.callsToExecute;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Runnable getIdleCallbackToRun() {
            return this.idleCallbackToRun;
        }
    }

    public q() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    public static /* synthetic */ void h(q qVar, rv.m.a aVar, rv.m mVar, rv.m.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        if ((i10 & 2) != 0) {
            mVar = null;
        }
        if ((i10 & 4) != 0) {
            aVar2 = null;
        }
        qVar.g(aVar, mVar, aVar2);
    }

    public final void a(@NotNull rv.m.a call) {
        Intrinsics.checkNotNullParameter(call, "call");
        h(this, call, null, null, 6, null);
    }

    public final synchronized boolean b(@NotNull rv.m call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return this.runningSyncCalls.add(call);
    }

    @NotNull
    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        try {
            if (this.executorServiceOrNull == null) {
                this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), nv.q.p(nv.q.f26640c + " Dispatcher", false));
            }
            executorService = this.executorServiceOrNull;
            Intrinsics.checkNotNull(executorService);
        } catch (Throwable th2) {
            throw th2;
        }
        return executorService;
    }

    public final rv.m.a d(String host) {
        Iterator<rv.m.a> it = this.runningAsyncCalls.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            rv.m.a next = it.next();
            if (Intrinsics.c(next.f(), host)) {
                return next;
            }
        }
        Iterator<rv.m.a> it2 = this.readyAsyncCalls.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            rv.m.a next2 = it2.next();
            if (Intrinsics.c(next2.f(), host)) {
                return next2;
            }
        }
        return null;
    }

    public final void e(@NotNull rv.m.a call) {
        Intrinsics.checkNotNullParameter(call, "call");
        h(this, null, null, call, 3, null);
    }

    public final void f(@NotNull rv.m call) {
        Intrinsics.checkNotNullParameter(call, "call");
        h(this, null, call, null, 5, null);
    }

    public final void g(rv.m.a enqueuedCall, rv.m finishedCall, rv.m.a finishedAsyncCall) {
        a aVar;
        rv.m.a aVarD;
        nv.q.e(this);
        boolean zIsShutdown = c().isShutdown();
        synchronized (this) {
            if (finishedCall != null) {
                try {
                    if (!this.runningSyncCalls.remove(finishedCall)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (finishedAsyncCall != null) {
                finishedAsyncCall.getCallsPerHost().decrementAndGet();
                if (!this.runningAsyncCalls.remove(finishedAsyncCall)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (enqueuedCall != null) {
                this.readyAsyncCalls.add(enqueuedCall);
                if (!enqueuedCall.getF31029c().getForWebSocket() && (aVarD = d(enqueuedCall.f())) != null) {
                    enqueuedCall.g(aVarD);
                }
            }
            Runnable runnable = (!(finishedCall == null && finishedAsyncCall == null) && (zIsShutdown || this.runningAsyncCalls.isEmpty()) && this.runningSyncCalls.isEmpty()) ? this.idleCallback : null;
            if (zIsShutdown) {
                List listM0 = CollectionsKt.M0(this.readyAsyncCalls);
                this.readyAsyncCalls.clear();
                aVar = new a(listM0, runnable);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<rv.m.a> it = this.readyAsyncCalls.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    rv.m.a next = it.next();
                    if (this.runningAsyncCalls.size() >= this.maxRequests) {
                        break;
                    }
                    if (next.getCallsPerHost().get() < this.maxRequestsPerHost) {
                        it.remove();
                        next.getCallsPerHost().incrementAndGet();
                        Intrinsics.checkNotNull(next);
                        arrayList.add(next);
                        this.runningAsyncCalls.add(next);
                    }
                }
                aVar = new a(arrayList, runnable);
            }
        }
        int size = aVar.a().size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            rv.m.a aVar2 = aVar.a().get(i10);
            if (aVar2 == enqueuedCall) {
                z10 = false;
            } else {
                aVar2.getF31029c().getEventListener().dispatcherQueueEnd(aVar2.getF31029c(), this);
            }
            if (zIsShutdown) {
                rv.m.a.c(aVar2, null, 1, null);
            } else {
                aVar2.a(c());
            }
        }
        if (z10 && enqueuedCall != null) {
            enqueuedCall.getF31029c().getEventListener().dispatcherQueueStart(enqueuedCall.getF31029c(), this);
        }
        Runnable idleCallbackToRun = aVar.getIdleCallbackToRun();
        if (idleCallbackToRun != null) {
            idleCallbackToRun.run();
        }
    }

    public q(@Nullable ExecutorService executorService) {
        this();
        this.executorServiceOrNull = executorService;
    }
}
