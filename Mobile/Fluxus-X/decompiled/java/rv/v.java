package rv;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lrv/v;", "Lrv/i;", "Lrv/t;", "routePlanner", "<init>", "(Lrv/t;)V", "Lrv/n;", "a", "()Lrv/n;", "Lrv/t;", "b", "()Lrv/t;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t routePlanner;

    public v(@NotNull t routePlanner) {
        Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
        this.routePlanner = routePlanner;
    }

    @Override // rv.i
    @NotNull
    public n a() throws Throwable {
        IOException iOException = null;
        while (!getRoutePlanner().m()) {
            try {
                t.b bVarD = getRoutePlanner().d();
                if (!bVarD.getIsReady()) {
                    t.ConnectResult connectResultH = bVarD.h();
                    if (connectResultH.f()) {
                        connectResultH = bVarD.getResult();
                    }
                    t.b nextPlan = connectResultH.getNextPlan();
                    Throwable throwable = connectResultH.getThrowable();
                    if (throwable != null) {
                        throw throwable;
                    }
                    if (nextPlan != null) {
                        getRoutePlanner().c().addFirst(nextPlan);
                    }
                }
                return bVarD.getConnection();
            } catch (IOException e10) {
                if (iOException == null) {
                    iOException = e10;
                } else {
                    zt.a.a(iOException, e10);
                }
                if (!t.b(getRoutePlanner(), null, 1, null)) {
                    throw iOException;
                }
            }
        }
        throw new IOException("Canceled");
    }

    @Override // rv.i
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public t getRoutePlanner() {
        return this.routePlanner;
    }
}
