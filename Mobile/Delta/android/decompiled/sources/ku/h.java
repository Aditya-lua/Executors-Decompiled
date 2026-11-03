package ku;

import iu.e2;
import iu.j2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0012H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001f\u001a\u00020\u00032\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00030\u001dH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096A¢\u0006\u0004\b%\u0010$J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0096\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b/\u0010.R\u0014\u00103\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b4\u00102R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00028\u0000068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108R \u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u00108¨\u0006<"}, d2 = {"Lku/h;", "E", "Liu/a;", "", "Lku/g;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "_channel", "", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lku/g;ZZ)V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "c", "(Ljava/util/concurrent/CancellationException;)V", "", "U", "(Ljava/lang/Throwable;)V", "element", "z", "(Ljava/lang/Object;Llt/b;)Ljava/lang/Object;", "Lku/k;", "y", "(Ljava/lang/Object;)Ljava/lang/Object;", "G", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "handler", "x", "(Lkotlin/jvm/functions/Function1;)V", "offer", "(Ljava/lang/Object;)Z", "g", "(Llt/b;)Ljava/lang/Object;", "k", "D", "()Ljava/lang/Object;", "Lku/i;", "iterator", "()Lku/i;", "d", "Lku/g;", "Y0", "()Lku/g;", "X0", "channel", "J", "()Z", "isClosedForSend", "i", "isClosedForReceive", "Lru/h;", "B", "()Lru/h;", "onReceive", "C", "onReceiveCatching", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class h<E> extends iu.a<Unit> implements g<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g<E> _channel;

    public h(@NotNull CoroutineContext coroutineContext, @NotNull g<E> gVar, boolean z10, boolean z11) {
        super(coroutineContext, z10, z11);
        this._channel = gVar;
    }

    @Override // ku.x
    @NotNull
    public ru.h<E> B() {
        return this._channel.B();
    }

    @Override // ku.x
    @NotNull
    public ru.h<k<E>> C() {
        return this._channel.C();
    }

    @Override // ku.x
    @NotNull
    public Object D() {
        return this._channel.D();
    }

    @Override // ku.y
    public boolean G(@Nullable Throwable cause) {
        return this._channel.G(cause);
    }

    @Override // ku.y
    public boolean J() {
        return this._channel.J();
    }

    @Override // iu.j2
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

    @Override // iu.j2, iu.d2
    public final void c(@Nullable CancellationException cause) {
        if (isCancelled()) {
            return;
        }
        if (cause == null) {
            cause = new e2(X(), null, this);
        }
        U(cause);
    }

    @Override // ku.x
    @Nullable
    public Object g(@NotNull lt.b<? super E> bVar) {
        return this._channel.g(bVar);
    }

    @Override // ku.x
    public boolean i() {
        return this._channel.i();
    }

    @Override // ku.x
    @NotNull
    public i<E> iterator() {
        return this._channel.iterator();
    }

    @Override // ku.x
    @Nullable
    public Object k(@NotNull lt.b<? super k<? extends E>> bVar) {
        Object objK = this._channel.k(bVar);
        mt.c.e();
        return objK;
    }

    @Override // ku.y
    public boolean offer(E element) {
        return this._channel.offer(element);
    }

    @Override // ku.y
    public void x(@NotNull Function1<? super Throwable, Unit> handler) {
        this._channel.x(handler);
    }

    @Override // ku.y
    @NotNull
    public Object y(E element) {
        return this._channel.y(element);
    }

    @Override // ku.y
    @Nullable
    public Object z(E e10, @NotNull lt.b<? super Unit> bVar) {
        return this._channel.z(e10, bVar);
    }
}
