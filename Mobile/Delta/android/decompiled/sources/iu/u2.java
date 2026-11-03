package iu;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Liu/u2;", "Liu/i2;", "Llt/b;", "", "continuation", "<init>", "(Llt/b;)V", "", "cause", "x", "(Ljava/lang/Throwable;)V", "e", "Llt/b;", "", "w", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u2 extends i2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lt.b<Unit> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public u2(@NotNull lt.b<? super Unit> bVar) {
        this.continuation = bVar;
    }

    @Override // iu.i2
    public boolean w() {
        return false;
    }

    @Override // iu.i2
    public void x(@Nullable Throwable cause) {
        lt.b<Unit> bVar = this.continuation;
        gt.n.Companion companion = gt.n.INSTANCE;
        bVar.resumeWith(gt.n.b(Unit.f22938a));
    }
}
