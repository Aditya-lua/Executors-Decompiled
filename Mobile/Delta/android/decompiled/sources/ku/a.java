package ku;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0004¢\u0006\u0004\b\u001b\u0010\u0010J\u001b\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u001e\u0010\u0010J\u0019\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001f\u0010\u0010J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0011H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0010¢\u0006\u0004\b#\u0010\u0018JG\u0010*\u001a\u00020\u000e\"\u0004\b\u0001\u0010$2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00028\u00012\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00190(¢\u0006\u0004\b*\u0010+R\u001d\u00102\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00107\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lku/a;", "T", "Lku/j2;", "Lku/d2;", "Lnt/b;", "Lku/p0;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;ZZ)V", "value", "", "V0", "(Ljava/lang/Object;)V", "", "cause", "handled", "U0", "(Ljava/lang/Throwable;Z)V", "", "X", "()Ljava/lang/String;", "", "state", "D0", "Ljt/n;", "result", "resumeWith", "T0", "exception", "p0", "(Ljava/lang/Throwable;)V", "y0", "R", "Lku/r0;", "start", "receiver", "Lkotlin/Function2;", "block", "W0", "(Lku/r0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "c", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getContext$annotations", "()V", "context", "H", "coroutineContext", "b", "()Z", "isActive", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<T> extends j2 implements d2, nt.b<T>, p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    public a(@NotNull CoroutineContext coroutineContext, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            q0((d2) coroutineContext.get(d2.INSTANCE));
        }
        this.context = coroutineContext.plus(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ku.j2
    public final void D0(@Nullable Object state) {
        if (!(state instanceof c0)) {
            V0(state);
        } else {
            c0 c0Var = (c0) state;
            U0(c0Var.cause, c0Var.a());
        }
    }

    @Override // ku.p0
    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public CoroutineContext getCoroutineContext() {
        return this.context;
    }

    public void T0(@Nullable Object state) {
        P(state);
    }

    public void U0(@NotNull Throwable cause, boolean handled) {
    }

    public void V0(T value) {
    }

    public final <R> void W0(@NotNull r0 start, R receiver, @NotNull Function2<? super R, ? super nt.b<? super T>, ? extends Object> block) {
        start.b(block, receiver, this);
    }

    @Override // ku.j2
    @NotNull
    public String X() {
        return t0.a(this) + " was cancelled";
    }

    @Override // ku.j2, ku.d2
    public boolean b() {
        return super.b();
    }

    @Override // nt.b
    @NotNull
    public final CoroutineContext getContext() {
        return this.context;
    }

    @Override // ku.j2
    public final void p0(@NotNull Throwable exception) {
        n0.a(this.context, exception);
    }

    @Override // nt.b
    public final void resumeWith(@NotNull Object result) {
        Object objX0 = x0(e0.b(result));
        if (objX0 == k2.b) {
            return;
        }
        T0(objX0);
    }

    @Override // ku.j2
    @NotNull
    public String y0() {
        String strG = j0.g(this.context);
        if (strG == null) {
            return super.y0();
        }
        return '\"' + strG + "\":" + super.y0();
    }
}
