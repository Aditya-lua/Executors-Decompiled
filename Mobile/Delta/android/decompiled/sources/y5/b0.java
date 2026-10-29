package y5;

import f6.WorkGenerationalId;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016¨\u0006\u0018"}, d2 = {"Ly5/b0;", "Ly5/z;", "delegate", "<init>", "(Ly5/z;)V", "Lf6/w;", "id", "Ly5/y;", "f", "(Lf6/w;)Ly5/y;", "c", "", "workSpecId", "", "remove", "(Ljava/lang/String;)Ljava/util/List;", "", "e", "(Lf6/w;)Z", "b", "Ly5/z;", "", "Ljava/lang/Object;", "lock", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 implements z {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final z delegate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object lock;

    public b0(@NotNull z delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.lock = new Object();
    }

    @Override // y5.z
    @Nullable
    public y c(@NotNull WorkGenerationalId id2) {
        y yVarC;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.lock) {
            yVarC = this.delegate.c(id2);
        }
        return yVarC;
    }

    @Override // y5.z
    public boolean e(@NotNull WorkGenerationalId id2) {
        boolean zE;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.lock) {
            zE = this.delegate.e(id2);
        }
        return zE;
    }

    @Override // y5.z
    @NotNull
    public y f(@NotNull WorkGenerationalId id2) {
        y yVarF;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.lock) {
            yVarF = this.delegate.f(id2);
        }
        return yVarF;
    }

    @Override // y5.z
    @NotNull
    public List<y> remove(@NotNull String workSpecId) {
        List<y> listRemove;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.lock) {
            listRemove = this.delegate.remove(workSpecId);
        }
        return listRemove;
    }
}
