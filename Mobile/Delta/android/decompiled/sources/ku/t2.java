package ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lku/t2;", "T", "Lku/i2;", "Lku/p;", "continuation", "<init>", "(Lku/p;)V", "", "cause", "", "x", "(Ljava/lang/Throwable;)V", "e", "Lku/p;", "", "w", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t2<T> extends i2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public t2(@NotNull p<? super T> pVar) {
        this.continuation = pVar;
    }

    @Override // ku.i2
    public boolean w() {
        return false;
    }

    @Override // ku.i2
    public void x(@Nullable Throwable cause) {
        Object objL0 = v().l0();
        if (objL0 instanceof c0) {
            p<T> pVar = this.continuation;
            jt.n.Companion companion = jt.n.INSTANCE;
            pVar.resumeWith(jt.n.b(jt.o.a(((c0) objL0).cause)));
        } else {
            p<T> pVar2 = this.continuation;
            jt.n.Companion companion2 = jt.n.INSTANCE;
            pVar2.resumeWith(jt.n.b(k2.h(objL0)));
        }
    }
}
