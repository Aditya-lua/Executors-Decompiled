package p567y5;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p120f6.WorkGenerationalId;

/* JADX INFO: renamed from: y5.b0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016¨\u0006\u0018"}, m31665d2 = {"Ly5/b0;", "Ly5/z;", "delegate", "<init>", "(Ly5/z;)V", "Lf6/w;", "id", "Ly5/y;", "f", "(Lf6/w;)Ly5/y;", "c", "", "workSpecId", "", "remove", "(Ljava/lang/String;)Ljava/util/List;", "", "e", "(Lf6/w;)Z", "b", "Ly5/z;", "", "Ljava/lang/Object;", "lock", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13035b0 implements InterfaceC13100z {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC13100z delegate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    public C13035b0(@NotNull InterfaceC13100z delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.lock = new Object();
    }

    @Override // p567y5.InterfaceC13100z
    @Nullable
    /* JADX INFO: renamed from: c */
    public C13098y mo48547c(@NotNull WorkGenerationalId id2) {
        C13098y c13098yMo48547c;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.lock) {
            c13098yMo48547c = this.delegate.mo48547c(id2);
        }
        return c13098yMo48547c;
    }

    @Override // p567y5.InterfaceC13100z
    /* JADX INFO: renamed from: e */
    public boolean mo48548e(@NotNull WorkGenerationalId id2) {
        boolean zMo48548e;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.lock) {
            zMo48548e = this.delegate.mo48548e(id2);
        }
        return zMo48548e;
    }

    @Override // p567y5.InterfaceC13100z
    @NotNull
    /* JADX INFO: renamed from: f */
    public C13098y mo48549f(@NotNull WorkGenerationalId id2) {
        C13098y c13098yMo48549f;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.lock) {
            c13098yMo48549f = this.delegate.mo48549f(id2);
        }
        return c13098yMo48549f;
    }

    @Override // p567y5.InterfaceC13100z
    @NotNull
    public List<C13098y> remove(@NotNull String workSpecId) {
        List<C13098y> listRemove;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.lock) {
            listRemove = this.delegate.remove(workSpecId);
        }
        return listRemove;
    }
}
