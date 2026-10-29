package mu;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import ku.e2;
import ku.j2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0012H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001f\u001a\u00020\u00032\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00030\u001dH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b#\u0010$J\u0016\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096A¢\u0006\u0004\b\u0001\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0096\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0014\u00102\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b3\u00101R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u00107¨\u0006;"}, d2 = {"Lmu/h;", "E", "Lku/a;", "", "Lmu/g;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "_channel", "", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lmu/g;ZZ)V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "c", "(Ljava/util/concurrent/CancellationException;)V", "", "U", "(Ljava/lang/Throwable;)V", "element", "i", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "Lmu/k;", "w", "(Ljava/lang/Object;)Ljava/lang/Object;", "F", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "handler", "t", "(Lkotlin/jvm/functions/Function1;)V", "offer", "(Ljava/lang/Object;)Z", "D", "(Lnt/b;)Ljava/lang/Object;", "C", "()Ljava/lang/Object;", "Lmu/i;", "iterator", "()Lmu/i;", "d", "Lmu/g;", "Y0", "()Lmu/g;", "X0", "channel", "I", "()Z", "isClosedForSend", "h", "isClosedForReceive", "Ltu/h;", "z", "()Ltu/h;", "onReceive", "A", "onReceiveCatching", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class h<E> extends ku.a<Unit> implements g<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g<E> _channel;

    public h(@NotNull CoroutineContext coroutineContext, @NotNull g<E> gVar, boolean z10, boolean z11) {
        super(coroutineContext, z10, z11);
        this._channel = gVar;
    }

    @Override // mu.x
    @NotNull
    public tu.h<k<E>> A() {
        return this._channel.A();
    }

    @Override // mu.x
    @NotNull
    public Object C() {
        return this._channel.C();
    }

    @Override // mu.x
    @Nullable
    public Object D(@NotNull nt.b<? super E> bVar) {
        return this._channel.D(bVar);
    }

    @Override // mu.x
    @Nullable
    public Object E(@NotNull nt.b<? super k<? extends E>> bVar) {
        Object objE = this._channel.E(bVar);
        ot.c.e();
        return objE;
    }

    @Override // mu.y
    public boolean F(@Nullable Throwable cause) {
        return this._channel.F(cause);
    }

    @Override // mu.y
    public boolean I() {
        return this._channel.I();
    }

    @Override // ku.j2
    public void U(@NotNull Throwable cause) {
        CancellationException cancellationExceptionM0 = j2.M0(this, cause, null, 1, null);
        this._channel.c(cancellationExceptionM0);
        S(cancellationExceptionM0);
    }

    @NotNull
    public final g<E> X0() {
        return this;
    }

    @NotNull
    public final g<E> Y0() {
        return this._channel;
    }

    @Override // ku.j2, ku.d2
    public final void c(@Nullable CancellationException cause) {
        if (isCancelled()) {
            return;
        }
        if (cause == null) {
            cause = new e2(X(), null, this);
        }
        U(cause);
    }

    @Override // mu.x
    public boolean h() {
        return this._channel.h();
    }

    @Override // mu.y
    @Nullable
    public Object i(E e10, @NotNull nt.b<? super Unit> bVar) {
        return this._channel.i(e10, bVar);
    }

    @Override // mu.x
    @NotNull
    public i<E> iterator() {
        return this._channel.iterator();
    }

    @Override // mu.y
    public boolean offer(E element) {
        return this._channel.offer(element);
    }

    @Override // mu.y
    public void t(@NotNull Function1<? super Throwable, Unit> handler) {
        this._channel.t(handler);
    }

    @Override // mu.y
    @NotNull
    public Object w(E element) {
        return this._channel.w(element);
    }

    @Override // mu.x
    @NotNull
    public tu.h<E> z() {
        return this._channel.z();
    }
}
