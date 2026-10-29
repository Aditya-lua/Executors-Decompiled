package su;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.AbstractC7888l0;
import p256ku.AbstractC7923t1;
import p395qu.C10721f0;
import p395qu.C10725h0;

/* JADX INFO: renamed from: su.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0013H\u0017¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m31665d2 = {"Lsu/b;", "Lku/t1;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "", "parallelism", "", "name", "Lku/l0;", "P", "(ILjava/lang/String;)Lku/l0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/Runnable;", "block", "w", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "F", "close", "toString", "()Ljava/lang/String;", "e", "Lku/l0;", "default", "X", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class ExecutorC11453b extends AbstractC7923t1 implements Executor {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final ExecutorC11453b f40493d = new ExecutorC11453b();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final AbstractC7888l0 default = AbstractC7888l0.m32791U(C11462k.f40511c, C10725h0.m40855e("kotlinx.coroutines.io.parallelism", C7764d.m32078c(64, C10721f0.m40840a()), 0, 0, 12, null), null, 2, null);

    @Override // p256ku.AbstractC7888l0
    /* JADX INFO: renamed from: F */
    public void mo32792F(@NotNull CoroutineContext context, @NotNull Runnable block) {
        default.mo32792F(context, block);
    }

    @Override // p256ku.AbstractC7888l0
    @NotNull
    /* JADX INFO: renamed from: P */
    public AbstractC7888l0 mo32677P(int parallelism, @Nullable String name) {
        return C11462k.f40511c.mo32677P(parallelism, name);
    }

    @Override // p256ku.AbstractC7923t1
    @NotNull
    /* JADX INFO: renamed from: X */
    public Executor getExecutor() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        mo6246w(C7721e.f29393a, command);
    }

    @Override // p256ku.AbstractC7888l0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "Dispatchers.IO";
    }

    @Override // p256ku.AbstractC7888l0
    /* JADX INFO: renamed from: w */
    public void mo6246w(@NotNull CoroutineContext context, @NotNull Runnable block) {
        default.mo6246w(context, block);
    }
}
