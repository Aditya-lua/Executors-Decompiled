package rv;

import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mv.d0;
import mv.f0;
import mv.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000«\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001W\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002EIB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u000eJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001eH\u0000¢\u0006\u0004\b%\u0010 J%\u0010*\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102JK\u00108\u001a\u0004\u0018\u00010\u000f2\u0006\u00103\u001a\u00020,2\b\b\u0002\u00104\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\b2\b\b\u0002\u00106\u001a\u00020\b2\b\b\u0002\u00107\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b:\u0010\u0011J\u0011\u0010<\u001a\u0004\u0018\u00010;H\u0000¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\f¢\u0006\u0004\b>\u0010\u000eJ\r\u0010?\u001a\u00020\f¢\u0006\u0004\b?\u0010\u000eJ\u0017\u0010A\u001a\u00020\f2\u0006\u0010@\u001a\u00020\bH\u0000¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\b¢\u0006\u0004\bC\u0010\u001dJ\u000f\u0010D\u001a\u00020\u0014H\u0000¢\u0006\u0004\bD\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u0010L\u001a\u0004\bM\u0010\u001dR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010V\u001a\u00020R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010aR(\u00100\u001a\u0004\u0018\u00010/2\b\u0010c\u001a\u0004\u0018\u00010/8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010d\u001a\u0004\be\u0010fR\u0016\u0010g\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010LR(\u0010k\u001a\u0004\u0018\u00010,2\b\u0010c\u001a\u0004\u0018\u00010,8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bA\u0010h\u001a\u0004\bi\u0010jR\u0016\u0010l\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010LR\u0016\u0010n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010LR\u0016\u0010o\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010LR\u0016\u0010p\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010LR\u0016\u0010q\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010LR\u0016\u0010r\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010LR\u0018\u00103\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010hR \u0010x\u001a\b\u0012\u0004\u0012\u00020t0s8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010u\u001a\u0004\bv\u0010wR\"\u0010}\u001a\u0010\u0012\f\u0012\n {*\u0004\u0018\u00010z0z0y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010|¨\u0006~"}, d2 = {"Lrv/m;", "Lmv/e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lmv/d0;", "client", "Lmv/f0;", "originalRequest", BuildConfig.FLAVOR, "forWebSocket", "<init>", "(Lmv/d0;Lmv/f0;Z)V", BuildConfig.FLAVOR, "f", "()V", "Ljava/io/IOException;", "e", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "H", BuildConfig.FLAVOR, "J", "()Ljava/lang/String;", "i", "()Lmv/e;", "h", "()Lmv/f0;", "cancel", "m", "()Z", "Lmv/h0;", "j", "()Lmv/h0;", "Lmv/f;", "responseCallback", "b0", "(Lmv/f;)V", "v", "request", "newRoutePlanner", "Lsv/g;", "chain", "k", "(Lmv/f0;ZLsv/g;)V", "Lrv/h;", "x", "(Lsv/g;)Lrv/h;", "Lrv/n;", "connection", "c", "(Lrv/n;)V", "exchange", "requestDone", "responseDone", "socketSourceDone", "socketSinkDone", "y", "(Lrv/h;ZZZZLjava/io/IOException;)Ljava/io/IOException;", "B", "Ljava/net/Socket;", "D", "()Ljava/net/Socket;", "G", "M", "closeExchange", "l", "(Z)V", "F", "C", "a", "Lmv/d0;", "o", "()Lmv/d0;", "b", "Lmv/f0;", "t", "Z", "r", "Lrv/o;", "d", "Lrv/o;", "connectionPool", "Lmv/s;", "Lmv/s;", "q", "()Lmv/s;", "eventListener", "rv/m$c", "Lrv/m$c;", "timeout", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "Ljava/lang/Object;", "callStackTrace", "Lrv/i;", "Lrv/i;", "exchangeFinder", "value", "Lrv/n;", "p", "()Lrv/n;", "timeoutEarlyExit", "Lrv/h;", "s", "()Lrv/h;", "interceptorScopedExchange", "requestBodyOpen", "n", "responseBodyOpen", "socketSinkOpen", "socketSourceOpen", "expectMoreExchanges", "canceled", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lrv/t$b;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "u", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "plansToCancel", "Ljava/util/concurrent/atomic/AtomicReference;", "Lnv/g;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/atomic/AtomicReference;", "tags", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements mv.e, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d0 client;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final f0 originalRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean forWebSocket;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o connectionPool;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mv.s eventListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c timeout;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean executed;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object callStackTrace;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public i exchangeFinder;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public n connection;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean timeoutEarlyExit;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public h interceptorScopedExchange;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean requestBodyOpen;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean responseBodyOpen;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean socketSinkOpen;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean socketSourceOpen;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean expectMoreExchanges;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public volatile boolean canceled;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile h exchange;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<t.b> plansToCancel;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicReference<nv.g> tags;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0000R\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R$\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lrv/m$a;", "Ljava/lang/Runnable;", "Lmv/f;", "responseCallback", "<init>", "(Lrv/m;Lmv/f;)V", "Lrv/m;", "other", BuildConfig.FLAVOR, "g", "(Lrv/m$a;)V", "Ljava/util/concurrent/ExecutorService;", "executorService", "a", "(Ljava/util/concurrent/ExecutorService;)V", "Ljava/util/concurrent/RejectedExecutionException;", "e", "b", "(Ljava/util/concurrent/RejectedExecutionException;)V", "run", "()V", "Lmv/f;", "Ljava/util/concurrent/atomic/AtomicInteger;", "value", "Ljava/util/concurrent/atomic/AtomicInteger;", "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", BuildConfig.FLAVOR, "f", "()Ljava/lang/String;", "host", "d", "()Lrv/m;", "call", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final mv.f responseCallback;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public volatile AtomicInteger callsPerHost;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f31029c;

        public a(@NotNull m mVar, mv.f responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f31029c = mVar;
            this.responseCallback = responseCallback;
            this.callsPerHost = new AtomicInteger(0);
        }

        public static /* synthetic */ void c(a aVar, RejectedExecutionException rejectedExecutionException, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rejectedExecutionException = null;
            }
            aVar.b(rejectedExecutionException);
        }

        public final void a(@NotNull ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            nv.q.e(this.f31029c.getClient().getDispatcher());
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    b(e10);
                    this.f31029c.getClient().getDispatcher().e(this);
                }
            } catch (Throwable th2) {
                this.f31029c.getClient().getDispatcher().e(this);
                throw th2;
            }
        }

        public final void b(@Nullable RejectedExecutionException e10) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
            interruptedIOException.initCause(e10);
            this.f31029c.B(interruptedIOException);
            this.responseCallback.onFailure(this.f31029c, interruptedIOException);
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final m getF31029c() {
            return this.f31029c;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        @NotNull
        public final String f() {
            return this.f31029c.t().getUrl().getHost();
        }

        public final void g(@NotNull a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.callsPerHost = other.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th2;
            IOException e10;
            d0 client;
            String str = "OkHttp " + this.f31029c.C();
            m mVar = this.f31029c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                mVar.timeout.s();
                try {
                    try {
                        z10 = true;
                        try {
                            this.responseCallback.onResponse(mVar, mVar.v());
                            client = mVar.getClient();
                        } catch (IOException e11) {
                            e10 = e11;
                            if (z10) {
                                okhttp3.internal.platform.c.INSTANCE.e().m("Callback failure for " + mVar.J(), 4, e10);
                            } else {
                                this.responseCallback.onFailure(mVar, e10);
                            }
                            client = mVar.getClient();
                        } catch (Throwable th3) {
                            th2 = th3;
                            mVar.cancel();
                            if (!z10) {
                                IOException iOException = new IOException("canceled due to " + th2);
                                iOException.initCause(th2);
                                this.responseCallback.onFailure(mVar, iOException);
                            }
                            if (!(th2 instanceof InterruptedException)) {
                                throw th2;
                            }
                            Thread.currentThread().interrupt();
                            client = mVar.getClient();
                        }
                    } catch (Throwable th4) {
                        mVar.getClient().getDispatcher().e(this);
                        throw th4;
                    }
                } catch (IOException e12) {
                    z10 = false;
                    e10 = e12;
                } catch (Throwable th5) {
                    z10 = false;
                    th2 = th5;
                }
                client.getDispatcher().e(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th6) {
                threadCurrentThread.setName(name);
                throw th6;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lrv/m$b;", "Ljava/lang/ref/WeakReference;", "Lrv/m;", "referent", BuildConfig.FLAVOR, "callStackTrace", "<init>", "(Lrv/m;Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends WeakReference<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull m referent, @Nullable Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.callStackTrace = obj;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"rv/m$c", "Lew/c;", BuildConfig.FLAVOR, "z", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends ew.c {
        public c() {
        }

        @Override // ew.c
        public void z() {
            m.this.cancel();
        }
    }

    public m(@NotNull d0 client, @NotNull f0 originalRequest, boolean z10) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.client = client;
        this.originalRequest = originalRequest;
        this.forWebSocket = z10;
        this.connectionPool = client.getConnectionPool().getDelegate();
        this.eventListener = client.getEventListenerFactory().a(this);
        c cVar = new c();
        cVar.g(client.getCallTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = cVar;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
        this.plansToCancel = new CopyOnWriteArrayList<>();
        this.tags = new AtomicReference<>(originalRequest.getTags());
    }

    public static /* synthetic */ IOException z(m mVar, h hVar, boolean z10, boolean z11, boolean z12, boolean z13, IOException iOException, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = false;
        }
        if ((i10 & 16) != 0) {
            z13 = false;
        }
        return mVar.y(hVar, z10, z11, z12, z13, iOException);
    }

    @Nullable
    public final IOException B(@Nullable IOException e10) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.expectMoreExchanges) {
                    this.expectMoreExchanges = false;
                    if (!this.requestBodyOpen && !this.responseBodyOpen && !this.socketSinkOpen && !this.socketSourceOpen) {
                        z10 = true;
                    }
                }
                Unit unit = Unit.f21506a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10 ? e(e10) : e10;
    }

    @NotNull
    public final String C() {
        return this.originalRequest.getUrl().r();
    }

    @Nullable
    public final Socket D() {
        n nVar = this.connection;
        Intrinsics.checkNotNull(nVar);
        if (nv.q.b && !Thread.holdsLock(nVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + nVar);
        }
        List<Reference<m>> listI = nVar.i();
        Iterator<Reference<m>> it = listI.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (Intrinsics.c(it.next().get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listI.remove(i10);
        this.connection = null;
        if (listI.isEmpty()) {
            nVar.w(System.nanoTime());
            if (this.connectionPool.c(nVar)) {
                return nVar.getJavaNetSocket();
            }
        }
        return null;
    }

    public final boolean F() {
        h hVar = this.exchange;
        if (hVar == null || !hVar.m()) {
            return false;
        }
        i iVar = this.exchangeFinder;
        Intrinsics.checkNotNull(iVar);
        t tVarB = iVar.getRoutePlanner();
        h hVar2 = this.exchange;
        return tVarB.e(hVar2 != null ? hVar2.j() : null);
    }

    public final void G() {
        if (this.timeoutEarlyExit) {
            throw new IllegalStateException("Check failed.");
        }
        this.timeoutEarlyExit = true;
        this.timeout.t();
    }

    public final IOException H(IOException cause) {
        if (this.timeoutEarlyExit || !this.timeout.t()) {
            return cause;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public final String J() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getCanceled() ? "canceled " : BuildConfig.FLAVOR);
        sb2.append(this.forWebSocket ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(C());
        return sb2.toString();
    }

    public final void M() {
        G();
        synchronized (this) {
            if (this.exchange == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.socketSinkOpen || this.socketSourceOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (!this.responseBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            this.responseBodyOpen = false;
            this.socketSinkOpen = true;
            this.socketSourceOpen = true;
            Unit unit = Unit.f21506a;
        }
    }

    @Override // mv.e
    public void b0(@NotNull mv.f responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        f();
        this.client.getDispatcher().a(new a(this, responseCallback));
    }

    public final void c(@NotNull n connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!nv.q.b || Thread.holdsLock(connection)) {
            if (this.connection != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.connection = connection;
            connection.i().add(new b(this, this.callStackTrace));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @Override // mv.e
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        h hVar = this.exchange;
        if (hVar != null) {
            hVar.d();
        }
        Iterator<t.b> it = this.plansToCancel.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.eventListener.canceled(this);
    }

    public final IOException e(IOException e10) {
        Socket socketD;
        boolean z10 = nv.q.b;
        if (z10 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        n nVar = this.connection;
        if (nVar != null) {
            if (z10 && Thread.holdsLock(nVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + nVar);
            }
            synchronized (nVar) {
                socketD = D();
            }
            if (this.connection == null) {
                if (socketD != null) {
                    nv.q.h(socketD);
                }
                this.eventListener.connectionReleased(this, nVar);
                nVar.getConnectionListener().g(nVar, this);
                if (socketD != null) {
                    nVar.getConnectionListener().f(nVar);
                }
            } else if (socketD != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException iOExceptionH = H(e10);
        if (e10 == null) {
            this.eventListener.callEnd(this);
            return iOExceptionH;
        }
        mv.s sVar = this.eventListener;
        Intrinsics.checkNotNull(iOExceptionH);
        sVar.callFailed(this, iOExceptionH);
        return iOExceptionH;
    }

    public final void f() {
        this.callStackTrace = okhttp3.internal.platform.c.INSTANCE.e().k("response.body().close()");
        this.eventListener.callStart(this);
    }

    @Override // mv.e
    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public f0 getOriginalRequest() {
        return this.originalRequest;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public mv.e clone() {
        return new m(this.client, this.originalRequest, this.forWebSocket);
    }

    @Override // mv.e
    @NotNull
    public h0 j() {
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.timeout.s();
        f();
        try {
            this.client.getDispatcher().b(this);
            return v();
        } finally {
            this.client.getDispatcher().f(this);
        }
    }

    public final void k(@NotNull f0 request, boolean newRoutePlanner, @NotNull sv.g chain) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (this.interceptorScopedExchange != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.responseBodyOpen) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.requestBodyOpen || this.socketSourceOpen || this.socketSinkOpen) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f21506a;
        }
        if (newRoutePlanner) {
            p pVar = new p(this.client.getTaskRunner(), this.connectionPool, this.client.getReadTimeoutMillis(), this.client.getWriteTimeoutMillis(), chain.getConnectTimeoutMillis(), chain.getReadTimeoutMillis(), this.client.getPingIntervalMillis(), this.client.getRetryOnConnectionFailure(), this.client.getFastFallback(), this.client.e(request.getUrl()), this.client.getRouteDatabase(), this, request);
            this.exchangeFinder = this.client.getFastFallback() ? new k(pVar, this.client.getTaskRunner()) : new v(pVar);
        }
    }

    public final void l(boolean closeExchange) {
        h hVar;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.f21506a;
        }
        if (closeExchange && (hVar = this.exchange) != null) {
            hVar.f();
        }
        this.interceptorScopedExchange = null;
    }

    @Override // mv.e
    /* JADX INFO: renamed from: m, reason: from getter */
    public boolean getCanceled() {
        return this.canceled;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final d0 getClient() {
        return this.client;
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final n getConnection() {
        return this.connection;
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final mv.s getEventListener() {
        return this.eventListener;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    @Nullable
    /* JADX INFO: renamed from: s, reason: from getter */
    public final h getInterceptorScopedExchange() {
        return this.interceptorScopedExchange;
    }

    @NotNull
    public final f0 t() {
        return this.originalRequest;
    }

    @NotNull
    public final CopyOnWriteArrayList<t.b> u() {
        return this.plansToCancel;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0098  */
    @NotNull
    public final h0 v() {
        ArrayList arrayList = new ArrayList();
        p001kotlin.collections.u.z(arrayList, this.client.x());
        arrayList.add(new sv.j(this.client));
        arrayList.add(new sv.a(this.client.getCookieJar()));
        arrayList.add(new pv.a(this.client.getCache()));
        arrayList.add(rv.c.f30952a);
        if (!this.forWebSocket) {
            p001kotlin.collections.u.z(arrayList, this.client.z());
        }
        arrayList.add(sv.b.f31910a);
        boolean z10 = false;
        try {
            try {
                h0 h0VarA = new sv.g(this, arrayList, 0, null, this.originalRequest, this.client.getConnectTimeoutMillis(), this.client.getReadTimeoutMillis(), this.client.getWriteTimeoutMillis()).a(this.originalRequest);
                if (getCanceled()) {
                    nv.n.f(h0VarA);
                    throw new IOException("Canceled");
                }
                B(null);
                return h0VarA;
            } catch (IOException e10) {
                z10 = true;
                IOException iOExceptionB = B(e10);
                Intrinsics.d(iOExceptionB, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionB;
            }
        } catch (Throwable th2) {
            if (!z10) {
                B(null);
            }
            throw th2;
        }
        if (!z10) {
            B(null);
        }
        throw th2;
    }

    @NotNull
    public final h x(@NotNull sv.g chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            if (this.responseBodyOpen || this.requestBodyOpen || this.socketSourceOpen || this.socketSinkOpen) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f21506a;
        }
        i iVar = this.exchangeFinder;
        Intrinsics.checkNotNull(iVar);
        h hVar = new h(this, this.eventListener, iVar, iVar.a().s(this.client, chain));
        this.interceptorScopedExchange = hVar;
        this.exchange = hVar;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (this.canceled) {
            throw new IOException("Canceled");
        }
        return hVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x002f A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:8:0x0013, B:23:0x002f, B:25:0x0033, B:27:0x0037, B:29:0x003b, B:30:0x003d, B:32:0x0042, B:34:0x0046, B:36:0x004a, B:41:0x0053, B:46:0x005d, B:14:0x001d, B:17:0x0023, B:20:0x0029), top: B:58:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0033 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:8:0x0013, B:23:0x002f, B:25:0x0033, B:27:0x0037, B:29:0x003b, B:30:0x003d, B:32:0x0042, B:34:0x0046, B:36:0x004a, B:41:0x0053, B:46:0x005d, B:14:0x001d, B:17:0x0023, B:20:0x0029), top: B:58:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0037 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:8:0x0013, B:23:0x002f, B:25:0x0033, B:27:0x0037, B:29:0x003b, B:30:0x003d, B:32:0x0042, B:34:0x0046, B:36:0x004a, B:41:0x0053, B:46:0x005d, B:14:0x001d, B:17:0x0023, B:20:0x0029), top: B:58:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x003b A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:8:0x0013, B:23:0x002f, B:25:0x0033, B:27:0x0037, B:29:0x003b, B:30:0x003d, B:32:0x0042, B:34:0x0046, B:36:0x004a, B:41:0x0053, B:46:0x005d, B:14:0x001d, B:17:0x0023, B:20:0x0029), top: B:58:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0050  */
    @Nullable
    public final IOException y(@NotNull h exchange, boolean requestDone, boolean responseDone, boolean socketSourceDone, boolean socketSinkDone, @Nullable IOException e10) {
        boolean z10;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (Intrinsics.c(exchange, this.exchange)) {
            synchronized (this) {
                z10 = false;
                if (requestDone) {
                    try {
                        if (this.requestBodyOpen) {
                            if (requestDone) {
                                this.requestBodyOpen = false;
                            }
                            if (responseDone) {
                                this.responseBodyOpen = false;
                            }
                            if (socketSinkDone) {
                                this.socketSinkOpen = false;
                            }
                            if (socketSourceDone) {
                                this.socketSourceOpen = false;
                            }
                            if (this.requestBodyOpen) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                z10 = true;
                            }
                            boolean z13 = z12;
                            z11 = z10;
                            z10 = z13;
                        } else if ((!responseDone && this.responseBodyOpen) || ((socketSinkDone && this.socketSinkOpen) || (socketSourceDone && this.socketSourceOpen))) {
                            if (requestDone) {
                                this.requestBodyOpen = false;
                            }
                            if (responseDone) {
                                this.responseBodyOpen = false;
                            }
                            if (socketSinkDone) {
                                this.socketSinkOpen = false;
                            }
                            if (socketSourceDone) {
                                this.socketSourceOpen = false;
                            }
                            if (this.requestBodyOpen || this.responseBodyOpen || this.socketSinkOpen || this.socketSourceOpen) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (z12 && !this.expectMoreExchanges) {
                                z10 = true;
                            }
                            boolean z14 = z12;
                            z11 = z10;
                            z10 = z14;
                        }
                        Unit unit = Unit.f21506a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    z11 = !responseDone ? false : false;
                    Unit unit2 = Unit.f21506a;
                }
            }
            if (z10) {
                this.exchange = null;
                n nVar = this.connection;
                if (nVar != null) {
                    nVar.o();
                }
            }
            if (z11) {
                return e(e10);
            }
        }
        return e10;
    }
}
