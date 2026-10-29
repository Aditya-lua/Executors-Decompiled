package qu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import ku.i1;
import ku.v0;
import ku.y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u00015B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0017¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010)R\u001e\u0010-\u001a\f\u0012\b\u0012\u00060\u000ej\u0002`\u000f0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00102\u001a\u00060.j\u0002`/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u000b\u00104\u001a\u0002038\u0002X\u0082\u0004¨\u00066"}, d2 = {"Lqu/l;", "Lku/l0;", "Lku/y0;", "dispatcher", "", "parallelism", "", "name", "<init>", "(Lku/l0;ILjava/lang/String;)V", "P", "(ILjava/lang/String;)Lku/l0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "w", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "F", "toString", "()Ljava/lang/String;", "", "timeMillis", "Lku/n;", "continuation", "o", "(JLku/n;)V", "Lku/i1;", "f", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lku/i1;", "", "f0", "()Z", "e0", "()Ljava/lang/Runnable;", "d", "Lku/l0;", "e", "I", "Ljava/lang/String;", "Lqu/q;", "g", "Lqu/q;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "h", "Ljava/lang/Object;", "workerAllocationLock", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends ku.l0 implements y0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29651i = AtomicIntegerFieldUpdater.newUpdater(l.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0 f29652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ku.l0 dispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int parallelism;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String name;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final q<Runnable> queue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object workerAllocationLock;
    private volatile /* synthetic */ int runningWorkers$volatile;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqu/l$a;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "<init>", "(Lqu/l;Ljava/lang/Runnable;)V", "", "run", "()V", "a", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Runnable currentTask;

        public a(Runnable runnable) {
            this.currentTask = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.currentTask.run();
                } catch (Throwable th2) {
                    ku.n0.a(kotlin.coroutines.e.f22525a, th2);
                }
                try {
                    Runnable runnableE0 = l.this.e0();
                    if (runnableE0 == null) {
                        return;
                    }
                    this.currentTask = runnableE0;
                    i10++;
                    if (i10 >= 16 && j.d(l.this.dispatcher, l.this)) {
                        j.c(l.this.dispatcher, l.this, this);
                        return;
                    }
                } catch (Throwable th3) {
                    Object obj = l.this.workerAllocationLock;
                    l lVar = l.this;
                    synchronized (obj) {
                        l.b0().decrementAndGet(lVar);
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull ku.l0 l0Var, int i10, @Nullable String str) {
        y0 y0Var = l0Var instanceof y0 ? (y0) l0Var : null;
        this.f29652c = y0Var == null ? v0.a() : y0Var;
        this.dispatcher = l0Var;
        this.parallelism = i10;
        this.name = str;
        this.queue = new q<>(false);
        this.workerAllocationLock = new Object();
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater b0() {
        return f29651i;
    }

    @Override // ku.l0
    public void F(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Runnable runnableE0;
        this.queue.a(block);
        if (f29651i.get(this) >= this.parallelism || !f0() || (runnableE0 = e0()) == null) {
            return;
        }
        try {
            this.dispatcher.F(this, new a(runnableE0));
        } catch (Throwable th2) {
            f29651i.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // ku.l0
    @NotNull
    public ku.l0 P(int parallelism, @Nullable String name) {
        m.a(parallelism);
        return parallelism >= this.parallelism ? m.b(this, name) : super.P(parallelism, name);
    }

    public final Runnable e0() {
        while (true) {
            Runnable runnableE = this.queue.e();
            if (runnableE != null) {
                return runnableE;
            }
            synchronized (this.workerAllocationLock) {
                f29651i.decrementAndGet(this);
                if (this.queue.c() == 0) {
                    return null;
                }
                f29651i.incrementAndGet(this);
            }
        }
    }

    @Override // ku.y0
    @NotNull
    public i1 f(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        return this.f29652c.f(timeMillis, block, context);
    }

    public final boolean f0() {
        synchronized (this.workerAllocationLock) {
            if (f29651i.get(this) >= this.parallelism) {
                return false;
            }
            f29651i.incrementAndGet(this);
            return true;
        }
    }

    @Override // ku.y0
    public void o(long timeMillis, @NotNull ku.n<? super Unit> continuation) {
        this.f29652c.o(timeMillis, continuation);
    }

    @Override // ku.l0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        return this.dispatcher + ".limitedParallelism(" + this.parallelism + ')';
    }

    @Override // ku.l0
    public void w(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Runnable runnableE0;
        this.queue.a(block);
        if (f29651i.get(this) >= this.parallelism || !f0() || (runnableE0 = e0()) == null) {
            return;
        }
        try {
            j.c(this.dispatcher, this, new a(runnableE0));
        } catch (Throwable th2) {
            f29651i.decrementAndGet(this);
            throw th2;
        }
    }
}
