package p395qu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.AbstractC7888l0;
import p256ku.C7898n0;
import p256ku.C7930v0;
import p256ku.InterfaceC7874i1;
import p256ku.InterfaceC7897n;
import p256ku.InterfaceC7942y0;

/* JADX INFO: renamed from: qu.l */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u00015B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0017¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\r\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010)R\u001e\u0010-\u001a\f\u0012\b\u0012\u00060\u000ej\u0002`\u000f0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00102\u001a\u00060.j\u0002`/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u000b\u00104\u001a\u0002038\u0002X\u0082\u0004¨\u00066"}, m31665d2 = {"Lqu/l;", "Lku/l0;", "Lku/y0;", "dispatcher", "", "parallelism", "", "name", "<init>", "(Lku/l0;ILjava/lang/String;)V", "P", "(ILjava/lang/String;)Lku/l0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "w", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "F", "toString", "()Ljava/lang/String;", "", "timeMillis", "Lku/n;", "continuation", "o", "(JLku/n;)V", "Lku/i1;", "f", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lku/i1;", "", "f0", "()Z", "e0", "()Ljava/lang/Runnable;", "d", "Lku/l0;", "e", "I", "Ljava/lang/String;", "Lqu/q;", "g", "Lqu/q;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "h", "Ljava/lang/Object;", "workerAllocationLock", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", "a", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10732l extends AbstractC7888l0 implements InterfaceC7942y0 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f38286i = AtomicIntegerFieldUpdater.newUpdater(C10732l.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC7942y0 f38287c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7888l0 dispatcher;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int parallelism;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final String name;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C10742q<Runnable> queue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Object workerAllocationLock;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: qu.l$a */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lqu/l$a;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "<init>", "(Lqu/l;Ljava/lang/Runnable;)V", "", "run", "()V", "a", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
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
                    C7898n0.m32820a(C7721e.f29393a, th2);
                }
                try {
                    Runnable runnableM40879e0 = C10732l.this.m40879e0();
                    if (runnableM40879e0 == null) {
                        return;
                    }
                    this.currentTask = runnableM40879e0;
                    i10++;
                    if (i10 >= 16 && C10728j.m40869d(C10732l.this.dispatcher, C10732l.this)) {
                        C10728j.m40868c(C10732l.this.dispatcher, C10732l.this, this);
                        return;
                    }
                } catch (Throwable th3) {
                    Object obj = C10732l.this.workerAllocationLock;
                    C10732l c10732l = C10732l.this;
                    synchronized (obj) {
                        C10732l.m40878b0().decrementAndGet(c10732l);
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ku.l0 */
    /* JADX WARN: Multi-variable type inference failed */
    public C10732l(@NotNull AbstractC7888l0 abstractC7888l0, int i10, @Nullable String str) {
        InterfaceC7942y0 interfaceC7942y0 = abstractC7888l0 instanceof InterfaceC7942y0 ? (InterfaceC7942y0) abstractC7888l0 : null;
        this.f38287c = interfaceC7942y0 == null ? C7930v0.m32922a() : interfaceC7942y0;
        this.dispatcher = abstractC7888l0;
        this.parallelism = i10;
        this.name = str;
        this.queue = new C10742q<>(false);
        this.workerAllocationLock = new Object();
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [qu.l.a.run():void] */
    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ AtomicIntegerFieldUpdater m40878b0() {
        return f38286i;
    }

    @Override // p256ku.AbstractC7888l0
    /* JADX INFO: renamed from: F */
    public void mo32792F(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Runnable runnableM40879e0;
        this.queue.m40925a(block);
        if (f38286i.get(this) >= this.parallelism || !m40880f0() || (runnableM40879e0 = m40879e0()) == null) {
            return;
        }
        try {
            this.dispatcher.mo32792F(this, new a(runnableM40879e0));
        } catch (Throwable th2) {
            f38286i.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // p256ku.AbstractC7888l0
    @NotNull
    /* JADX INFO: renamed from: P */
    public AbstractC7888l0 mo32677P(int parallelism, @Nullable String name) {
        C10734m.m40890a(parallelism);
        return parallelism >= this.parallelism ? C10734m.m40891b(this, name) : super.mo32677P(parallelism, name);
    }

    /* JADX INFO: renamed from: e0 */
    public final Runnable m40879e0() {
        while (true) {
            Runnable runnableM40928e = this.queue.m40928e();
            if (runnableM40928e != null) {
                return runnableM40928e;
            }
            synchronized (this.workerAllocationLock) {
                f38286i.decrementAndGet(this);
                if (this.queue.m40927c() == 0) {
                    return null;
                }
                f38286i.incrementAndGet(this);
            }
        }
    }

    @Override // p256ku.InterfaceC7942y0
    @NotNull
    /* JADX INFO: renamed from: f */
    public InterfaceC7874i1 mo32840f(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        return this.f38287c.mo32840f(timeMillis, block, context);
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m40880f0() {
        synchronized (this.workerAllocationLock) {
            if (f38286i.get(this) >= this.parallelism) {
                return false;
            }
            f38286i.incrementAndGet(this);
            return true;
        }
    }

    @Override // p256ku.InterfaceC7942y0
    /* JADX INFO: renamed from: o */
    public void mo32841o(long timeMillis, @NotNull InterfaceC7897n<? super Unit> continuation) {
        this.f38287c.mo32841o(timeMillis, continuation);
    }

    @Override // p256ku.AbstractC7888l0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        return this.dispatcher + ".limitedParallelism(" + this.parallelism + ')';
    }

    @Override // p256ku.AbstractC7888l0
    /* JADX INFO: renamed from: w */
    public void mo6246w(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Runnable runnableM40879e0;
        this.queue.m40925a(block);
        if (f38286i.get(this) >= this.parallelism || !m40880f0() || (runnableM40879e0 = m40879e0()) == null) {
            return;
        }
        try {
            C10728j.m40868c(this.dispatcher, this, new a(runnableM40879e0));
        } catch (Throwable th2) {
            f38286i.decrementAndGet(this);
            throw th2;
        }
    }
}
