package p536x5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.InterfaceC7720d;
import kotlin.jvm.internal.Intrinsics;
import p256ku.AbstractC7888l0;
import p256ku.C7931v1;
import p301n5.C8884a;

/* JADX INFO: renamed from: x5.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"", "isTaskExecutor", "Ljava/util/concurrent/Executor;", "e", "(Z)Ljava/util/concurrent/Executor;", "Lx5/l0;", "f", "()Lx5/l0;", "Lkotlin/coroutines/CoroutineContext;", "d", "(Lkotlin/coroutines/CoroutineContext;)Ljava/util/concurrent/Executor;", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C12692c {

    /* JADX INFO: renamed from: x5.c$a */
    @Metadata(m31664d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m31665d2 = {"x5/c$a", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "Ljava/util/concurrent/atomic/AtomicInteger;", "a", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadCount", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final AtomicInteger threadCount = new AtomicInteger(0);

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f45217b;

        public a(boolean z10) {
            this.f45217b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            return new Thread(runnable, (this.f45217b ? "WM.task-" : "androidx.work-") + this.threadCount.incrementAndGet());
        }
    }

    /* JADX INFO: renamed from: x5.c$b */
    @Metadata(m31664d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m31665d2 = {"x5/c$b", "Lx5/l0;", "", "isEnabled", "()Z", "", "label", "", "a", "(Ljava/lang/String;)V", "d", "()V", "methodName", "", "cookie", "c", "(Ljava/lang/String;I)V", "b", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b implements InterfaceC12711l0 {
        @Override // p536x5.InterfaceC12711l0
        /* JADX INFO: renamed from: a */
        public void mo47330a(String label) {
            Intrinsics.checkNotNullParameter(label, "label");
            C8884a.m35746c(label);
        }

        @Override // p536x5.InterfaceC12711l0
        /* JADX INFO: renamed from: b */
        public void mo47331b(String methodName, int cookie) {
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            C8884a.m35747d(methodName, cookie);
        }

        @Override // p536x5.InterfaceC12711l0
        /* JADX INFO: renamed from: c */
        public void mo47332c(String methodName, int cookie) {
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            C8884a.m35744a(methodName, cookie);
        }

        @Override // p536x5.InterfaceC12711l0
        /* JADX INFO: renamed from: d */
        public void mo47333d() {
            C8884a.m35749f();
        }

        @Override // p536x5.InterfaceC12711l0
        public boolean isEnabled() {
            return C8884a.m35751h();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Executor m47327d(CoroutineContext coroutineContext) {
        InterfaceC7720d interfaceC7720d = coroutineContext != null ? (InterfaceC7720d) coroutineContext.get(InterfaceC7720d.INSTANCE) : null;
        AbstractC7888l0 abstractC7888l0 = interfaceC7720d instanceof AbstractC7888l0 ? (AbstractC7888l0) interfaceC7720d : null;
        if (abstractC7888l0 != null) {
            return C7931v1.m32924a(abstractC7888l0);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final Executor m47328e(boolean z10) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(z10));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        return executorServiceNewFixedThreadPool;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC12711l0 m47329f() {
        return new b();
    }
}
