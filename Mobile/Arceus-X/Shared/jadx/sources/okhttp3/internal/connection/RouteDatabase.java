package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Route;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, m31665d2 = {"Lokhttp3/internal/connection/RouteDatabase;", "", "<init>", "()V", "_failedRoutes", "", "Lokhttp3/Route;", "failedRoutes", "", "getFailedRoutes", "()Ljava/util/Set;", "failed", "", "failedRoute", "connected", "route", "shouldPostpone", "", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class RouteDatabase {

    @NotNull
    private final Set<Route> _failedRoutes = new LinkedHashSet();

    public final synchronized void connected(@NotNull Route route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this._failedRoutes.remove(route);
    }

    public final synchronized void failed(@NotNull Route failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this._failedRoutes.add(failedRoute);
    }

    @NotNull
    public final synchronized Set<Route> getFailedRoutes() {
        return CollectionsKt.m31691Q0(this._failedRoutes);
    }

    public final synchronized boolean shouldPostpone(@NotNull Route route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this._failedRoutes.contains(route);
    }
}
