package lq;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku.l0;
import ku.p0;
import ku.q0;
import ku.z2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Llq/a;", "", "Lku/l0;", "defaultDispatcher", "<init>", "(Lku/l0;)V", "Lku/p0;", "a", "()Lku/p0;", "Lku/l0;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 defaultDispatcher;

    public a(@NotNull l0 defaultDispatcher) {
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        this.defaultDispatcher = defaultDispatcher;
    }

    @NotNull
    public final p0 a() {
        return q0.a(this.defaultDispatcher.plus(z2.b(null, 1, null)));
    }
}
