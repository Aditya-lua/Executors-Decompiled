package ko;

import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;)Z", "waitingOnWebRtcSetup", "b", "webRtcCaptureInProgress", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class x {
    public static final boolean a(@NotNull Screen.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return (bVar.getState() instanceof GovernmentIdState.WaitForAutocapture) && bVar.getVideoCaptureMethod() == mn.a.Stream && ((GovernmentIdState.WaitForAutocapture) bVar.getState()).getWebRtcState() != uo.x.Connected;
    }

    public static final boolean b(@NotNull Screen.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return (bVar.getState() instanceof GovernmentIdState.WaitForAutocapture) && bVar.getVideoCaptureMethod() == mn.a.Stream && ((GovernmentIdState.WaitForAutocapture) bVar.getState()).getWebRtcState() == uo.x.Connected;
    }
}
