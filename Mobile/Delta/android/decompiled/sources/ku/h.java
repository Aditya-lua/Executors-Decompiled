package ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lku/h;", "Lku/n1;", "Ljava/lang/Thread;", "thread", "<init>", "(Ljava/lang/Thread;)V", "i", "Ljava/lang/Thread;", "y0", "()Ljava/lang/Thread;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends n1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Thread thread;

    public h(@NotNull Thread thread) {
        this.thread = thread;
    }

    @Override // ku.o1
    @NotNull
    /* JADX INFO: renamed from: y0, reason: from getter */
    public Thread getThread() {
        return this.thread;
    }
}
