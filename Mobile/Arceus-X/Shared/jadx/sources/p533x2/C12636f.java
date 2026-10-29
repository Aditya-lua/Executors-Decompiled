package p533x2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: x2.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Lx2/f;", "", "T", "Lx2/e;", "", "maxPoolSize", "<init>", "(I)V", "b", "()Ljava/lang/Object;", "instance", "", "a", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/Object;", "lock", "core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public class C12636f<T> extends C12635e<T> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    public C12636f(int i10) {
        super(i10);
        this.lock = new Object();
    }

    @Override // p533x2.C12635e, p533x2.InterfaceC12634d
    /* JADX INFO: renamed from: a */
    public boolean mo47066a(@NotNull T instance) {
        boolean zMo47066a;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.lock) {
            zMo47066a = super.mo47066a(instance);
        }
        return zMo47066a;
    }

    @Override // p533x2.C12635e, p533x2.InterfaceC12634d
    @Nullable
    /* JADX INFO: renamed from: b */
    public T mo47067b() {
        T t8;
        synchronized (this.lock) {
            t8 = (T) super.mo47067b();
        }
        return t8;
    }
}
