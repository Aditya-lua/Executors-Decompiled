package fn;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0007J\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lfn/k;", "", "<init>", "()V", "Lnu/b0;", "Lkn/c;", "c", "()Lnu/b0;", "Ljt/n;", "Lfn/j0;", "b", "Lct/a;", "Lln/b;", "realCameraStatsManager", "Lln/a;", "a", "(Lct/a;)Lln/a;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class k {
    @NotNull
    public ln.a a(@NotNull ct.a<ln.b> realCameraStatsManager) {
        Intrinsics.checkNotNullParameter(realCameraStatsManager, "realCameraStatsManager");
        ln.b bVar = realCameraStatsManager.get();
        Intrinsics.checkNotNullExpressionValue(bVar, "get(...)");
        return bVar;
    }

    @NotNull
    public final nu.b0<jt.n<j0>> b() {
        return nu.i0.b(0, 0, null, 7, null);
    }

    @NotNull
    public final nu.b0<kn.c> c() {
        return nu.i0.b(0, 0, null, 7, null);
    }
}
