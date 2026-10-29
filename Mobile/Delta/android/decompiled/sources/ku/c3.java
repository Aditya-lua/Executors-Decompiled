package ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0011"}, d2 = {"Lku/c3;", "", "<init>", "()V", "Lku/m1;", "a", "()Lku/m1;", "", "c", "eventLoop", "d", "(Lku/m1;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", "ref", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c3 f22770a = new c3();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ThreadLocal<m1> ref = qu.o0.a(new qu.e0("ThreadLocalEventLoop"));

    @Nullable
    public final m1 a() {
        return ref.get();
    }

    @NotNull
    public final m1 b() {
        ThreadLocal<m1> threadLocal = ref;
        m1 m1Var = threadLocal.get();
        if (m1Var != null) {
            return m1Var;
        }
        m1 m1VarA = p1.a();
        threadLocal.set(m1VarA);
        return m1VarA;
    }

    public final void c() {
        ref.set(null);
    }

    public final void d(@NotNull m1 eventLoop) {
        ref.set(eventLoop);
    }
}
