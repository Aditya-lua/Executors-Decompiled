package xo;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import vo.j0;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"Lvo/y3$b;", BuildConfig.FLAVOR, "a", "(Lvo/y3$b;)Z", "waitingOnWebRtcSetup", "b", "webRtcCaptureInProgress", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class x {
    public static final boolean a(@NotNull y3.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return (bVar.getState() instanceof j0.WaitForAutocapture) && bVar.getVideoCaptureMethod() == zn.a.Stream && ((j0.WaitForAutocapture) bVar.getState()).getWebRtcState() != ip.x.Connected;
    }

    public static final boolean b(@NotNull y3.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return (bVar.getState() instanceof j0.WaitForAutocapture) && bVar.getVideoCaptureMethod() == zn.a.Stream && ((j0.WaitForAutocapture) bVar.getState()).getWebRtcState() == ip.x.Connected;
    }
}
