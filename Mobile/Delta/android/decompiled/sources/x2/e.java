package x2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lx2/e;", "", "T", "Lx2/d;", "", "maxPoolSize", "<init>", "(I)V", "b", "()Ljava/lang/Object;", "instance", "", "a", "(Ljava/lang/Object;)Z", "c", "", "[Ljava/lang/Object;", "pool", "I", "poolSize", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class e<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object[] pool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int poolSize;

    public e(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.pool = new Object[i10];
    }

    @Override // x2.d
    public boolean a(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (c(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.poolSize;
        Object[] objArr = this.pool;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = instance;
        this.poolSize = i10 + 1;
        return true;
    }

    @Override // x2.d
    @Nullable
    public T b() {
        int i10 = this.poolSize;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        T t8 = (T) this.pool[i11];
        Intrinsics.d(t8, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.pool[i11] = null;
        this.poolSize--;
        return t8;
    }

    public final boolean c(T instance) {
        int i10 = this.poolSize;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.pool[i11] == instance) {
                return true;
            }
        }
        return false;
    }
}
