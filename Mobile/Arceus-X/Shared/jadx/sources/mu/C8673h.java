package mu;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.AbstractC7832a;
import p256ku.C7855e2;
import p256ku.C7880j2;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p452tu.InterfaceC11756h;

/* JADX INFO: renamed from: mu.h */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0012H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001f\u001a\u00020\u00032\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00030\u001dH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b#\u0010$J\u0016\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096A¢\u0006\u0004\b\u0001\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0096\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0014\u00102\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b3\u00101R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u00107¨\u0006;"}, m31665d2 = {"Lmu/h;", "E", "Lku/a;", "", "Lmu/g;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "_channel", "", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lmu/g;ZZ)V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "c", "(Ljava/util/concurrent/CancellationException;)V", "", "U", "(Ljava/lang/Throwable;)V", "element", "i", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "Lmu/k;", "w", "(Ljava/lang/Object;)Ljava/lang/Object;", "F", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "handler", "t", "(Lkotlin/jvm/functions/Function1;)V", "offer", "(Ljava/lang/Object;)Z", "D", "(Lnt/b;)Ljava/lang/Object;", "C", "()Ljava/lang/Object;", "Lmu/i;", "iterator", "()Lmu/i;", "d", "Lmu/g;", "Y0", "()Lmu/g;", "X0", "channel", "I", "()Z", "isClosedForSend", "h", "isClosedForReceive", "Ltu/h;", "z", "()Ltu/h;", "onReceive", "A", "onReceiveCatching", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C8673h<E> extends AbstractC7832a<Unit> implements InterfaceC8672g<E> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8672g<E> _channel;

    public C8673h(@NotNull CoroutineContext coroutineContext, @NotNull InterfaceC8672g<E> interfaceC8672g, boolean z10, boolean z11) {
        super(coroutineContext, z10, z11);
        this._channel = interfaceC8672g;
    }

    @Override // mu.InterfaceC8689x
    @NotNull
    /* JADX INFO: renamed from: A */
    public InterfaceC11756h<C8676k<E>> mo34793A() {
        return this._channel.mo34793A();
    }

    @Override // mu.InterfaceC8689x
    @NotNull
    /* JADX INFO: renamed from: C */
    public Object mo34796C() {
        return this._channel.mo34796C();
    }

    @Override // mu.InterfaceC8689x
    @Nullable
    /* JADX INFO: renamed from: D */
    public Object mo34798D(@NotNull InterfaceC9557b<? super E> interfaceC9557b) {
        return this._channel.mo34798D(interfaceC9557b);
    }

    @Override // mu.InterfaceC8689x
    @Nullable
    /* JADX INFO: renamed from: E */
    public Object mo34800E(@NotNull InterfaceC9557b<? super C8676k<? extends E>> interfaceC9557b) {
        Object objMo34800E = this._channel.mo34800E(interfaceC9557b);
        C10047c.m38805e();
        return objMo34800E;
    }

    @Override // mu.InterfaceC8690y
    /* JADX INFO: renamed from: F */
    public boolean mo34802F(@Nullable Throwable cause) {
        return this._channel.mo34802F(cause);
    }

    @Override // mu.InterfaceC8690y
    /* JADX INFO: renamed from: I */
    public boolean mo34806I() {
        return this._channel.mo34806I();
    }

    @Override // p256ku.C7880j2
    /* JADX INFO: renamed from: U */
    public void mo32735U(@NotNull Throwable cause) {
        CancellationException cancellationExceptionM32709M0 = C7880j2.m32709M0(this, cause, null, 1, null);
        this._channel.mo34836c(cancellationExceptionM32709M0);
        m32732S(cancellationExceptionM32709M0);
    }

    @NotNull
    /* JADX INFO: renamed from: X0 */
    public final InterfaceC8672g<E> m34924X0() {
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: Y0 */
    public final InterfaceC8672g<E> m34925Y0() {
        return this._channel;
    }

    @Override // p256ku.C7880j2, p256ku.InterfaceC7850d2
    /* JADX INFO: renamed from: c */
    public final void mo32597c(@Nullable CancellationException cause) {
        if (isCancelled()) {
            return;
        }
        if (cause == null) {
            cause = new C7855e2(mo32555X(), null, this);
        }
        mo32735U(cause);
    }

    @Override // mu.InterfaceC8689x
    /* JADX INFO: renamed from: h */
    public boolean mo34846h() {
        return this._channel.mo34846h();
    }

    @Override // mu.InterfaceC8690y
    @Nullable
    /* JADX INFO: renamed from: i */
    public Object mo34848i(E e10, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return this._channel.mo34848i(e10, interfaceC9557b);
    }

    @Override // mu.InterfaceC8689x
    @NotNull
    public InterfaceC8674i<E> iterator() {
        return this._channel.iterator();
    }

    @Override // mu.InterfaceC8690y
    public boolean offer(E element) {
        return this._channel.offer(element);
    }

    @Override // mu.InterfaceC8690y
    /* JADX INFO: renamed from: t */
    public void mo34864t(@NotNull Function1<? super Throwable, Unit> handler) {
        this._channel.mo34864t(handler);
    }

    @Override // mu.InterfaceC8690y
    @NotNull
    /* JADX INFO: renamed from: w */
    public Object mo34870w(E element) {
        return this._channel.mo34870w(element);
    }

    @Override // mu.InterfaceC8689x
    @NotNull
    /* JADX INFO: renamed from: z */
    public InterfaceC11756h<E> mo34874z() {
        return this._channel.mo34874z();
    }
}
