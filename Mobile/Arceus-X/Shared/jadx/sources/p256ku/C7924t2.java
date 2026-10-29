package p256ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;

/* JADX INFO: renamed from: ku.t2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m31665d2 = {"Lku/t2;", "T", "Lku/i2;", "Lku/p;", "continuation", "<init>", "(Lku/p;)V", "", "cause", "", "x", "(Ljava/lang/Throwable;)V", "e", "Lku/p;", "", "w", "()Z", "onCancelling", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7924t2<T> extends AbstractC7875i2 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C7905p<T> continuation;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ku.p<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7924t2(@NotNull C7905p<? super T> c7905p) {
        this.continuation = c7905p;
    }

    @Override // p256ku.AbstractC7875i2
    /* JADX INFO: renamed from: w */
    public boolean mo32574w() {
        return false;
    }

    @Override // p256ku.AbstractC7875i2
    /* JADX INFO: renamed from: x */
    public void mo32575x(@Nullable Throwable cause) {
        Object objM32750l0 = m32687v().m32750l0();
        if (objM32750l0 instanceof C7843c0) {
            C7905p<T> c7905p = this.continuation;
            C7347n.Companion companion = C7347n.INSTANCE;
            c7905p.resumeWith(C7347n.m30460b(C7348o.m30469a(((C7843c0) objM32750l0).cause)));
        } else {
            C7905p<T> c7905p2 = this.continuation;
            C7347n.Companion companion2 = C7347n.INSTANCE;
            c7905p2.resumeWith(C7347n.m30460b(C7885k2.m32789h(objM32750l0)));
        }
    }
}
