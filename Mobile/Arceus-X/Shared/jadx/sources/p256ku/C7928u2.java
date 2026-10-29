package p256ku;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: ku.u2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Lku/u2;", "Lku/i2;", "Lnt/b;", "", "continuation", "<init>", "(Lnt/b;)V", "", "cause", "x", "(Ljava/lang/Throwable;)V", "e", "Lnt/b;", "", "w", "()Z", "onCancelling", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7928u2 extends AbstractC7875i2 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9557b<Unit> continuation;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nt.b<? super kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7928u2(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        this.continuation = interfaceC9557b;
    }

    @Override // p256ku.AbstractC7875i2
    /* JADX INFO: renamed from: w */
    public boolean mo32574w() {
        return false;
    }

    @Override // p256ku.AbstractC7875i2
    /* JADX INFO: renamed from: x */
    public void mo32575x(@Nullable Throwable cause) {
        InterfaceC9557b<Unit> interfaceC9557b = this.continuation;
        C7347n.Companion companion = C7347n.INSTANCE;
        interfaceC9557b.resumeWith(C7347n.m30460b(Unit.f29331a));
    }
}
