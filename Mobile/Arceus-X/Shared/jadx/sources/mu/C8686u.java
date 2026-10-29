package mu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import p256ku.C7898n0;

/* JADX INFO: renamed from: mu.u */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m31665d2 = {"Lmu/u;", "E", "Lmu/h;", "Lmu/v;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lmu/g;", "channel", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lmu/g;)V", "", "value", "Z0", "(Lkotlin/Unit;)V", "", "cause", "", "handled", "U0", "(Ljava/lang/Throwable;Z)V", "b", "()Z", "isActive", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C8686u<E> extends C8673h<E> implements InterfaceC8687v<E> {
    public C8686u(@NotNull CoroutineContext coroutineContext, @NotNull InterfaceC8672g<E> interfaceC8672g) {
        super(coroutineContext, interfaceC8672g, true, true);
    }

    @Override // p256ku.AbstractC7832a
    /* JADX INFO: renamed from: U0 */
    public void mo32552U0(@NotNull Throwable cause, boolean handled) {
        if (m34925Y0().mo34802F(cause) || handled) {
            return;
        }
        C7898n0.m32820a(getContext(), cause);
    }

    /* JADX DEBUG: Method merged with bridge method: V0(Ljava/lang/Object;)V */
    @Override // p256ku.AbstractC7832a
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public void mo32553V0(@NotNull Unit value) {
        InterfaceC8690y.a.m34972a(m34925Y0(), null, 1, null);
    }

    @Override // mu.InterfaceC8687v
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC8690y mo34971a() {
        return m34924X0();
    }

    @Override // p256ku.AbstractC7832a, p256ku.C7880j2, p256ku.InterfaceC7850d2
    /* JADX INFO: renamed from: b */
    public boolean mo32556b() {
        return super.mo32556b();
    }
}
