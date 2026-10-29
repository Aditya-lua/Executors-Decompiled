package p256ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;

/* JADX INFO: renamed from: ku.y */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m31665d2 = {"Lku/y;", "T", "Lku/j2;", "Lku/x;", "Lku/d2;", "parent", "<init>", "(Lku/d2;)V", "g", "()Ljava/lang/Object;", "B", "(Lnt/b;)Ljava/lang/Object;", "value", "", "s", "(Ljava/lang/Object;)Z", "", "exception", "r", "(Ljava/lang/Throwable;)Z", "h0", "()Z", "onCancelComplete", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7941y<T> extends C7880j2 implements InterfaceC7937x<T> {
    public C7941y(@Nullable InterfaceC7850d2 interfaceC7850d2) {
        super(true);
        m32752q0(interfaceC7850d2);
    }

    @Override // p256ku.InterfaceC7934w0
    @Nullable
    /* JADX INFO: renamed from: B */
    public Object mo32927B(@NotNull InterfaceC9557b<? super T> interfaceC9557b) throws Throwable {
        Object objM32728Q = m32728Q(interfaceC9557b);
        C10047c.m38805e();
        return objM32728Q;
    }

    @Override // p256ku.InterfaceC7934w0
    /* JADX INFO: renamed from: g */
    public T mo32928g() {
        return (T) m32743d0();
    }

    @Override // p256ku.C7880j2
    /* JADX INFO: renamed from: h0 */
    public boolean mo32640h0() {
        return true;
    }

    @Override // p256ku.InterfaceC7937x
    /* JADX INFO: renamed from: r */
    public boolean mo32929r(@NotNull Throwable exception) {
        return m32758w0(new C7843c0(exception, false, 2, null));
    }

    @Override // p256ku.InterfaceC7937x
    /* JADX INFO: renamed from: s */
    public boolean mo32930s(T value) {
        return m32758w0(value);
    }
}
