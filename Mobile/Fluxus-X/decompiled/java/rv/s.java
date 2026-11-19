package rv;

import com.github.luben.zstd.BuildConfig;
import java.util.LinkedHashSet;
import java.util.Set;
import mv.j0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"Lrv/s;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/j0;", "failedRoute", BuildConfig.FLAVOR, "b", "(Lmv/j0;)V", "route", "a", BuildConfig.FLAVOR, "c", "(Lmv/j0;)Z", BuildConfig.FLAVOR, "Ljava/util/Set;", "_failedRoutes", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<j0> _failedRoutes = new LinkedHashSet();

    public final synchronized void a(@NotNull j0 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this._failedRoutes.remove(route);
    }

    public final synchronized void b(@NotNull j0 failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this._failedRoutes.add(failedRoute);
    }

    public final synchronized boolean c(@NotNull j0 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this._failedRoutes.contains(route);
    }
}
