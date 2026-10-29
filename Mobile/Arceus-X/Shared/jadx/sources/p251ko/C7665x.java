package p251ko;

import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mn.EnumC8598a;
import org.jetbrains.annotations.NotNull;
import p473uo.EnumC11917x;

/* JADX INFO: renamed from: ko.x */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;)Z", "waitingOnWebRtcSetup", "b", "webRtcCaptureInProgress", "government-id_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7665x {
    /* JADX INFO: renamed from: a */
    public static final boolean m31657a(@NotNull Screen.C3527b c3527b) {
        Intrinsics.checkNotNullParameter(c3527b, "<this>");
        return (c3527b.getState() instanceof GovernmentIdState.WaitForAutocapture) && c3527b.getVideoCaptureMethod() == EnumC8598a.Stream && ((GovernmentIdState.WaitForAutocapture) c3527b.getState()).getWebRtcState() != EnumC11917x.Connected;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m31658b(@NotNull Screen.C3527b c3527b) {
        Intrinsics.checkNotNullParameter(c3527b, "<this>");
        return (c3527b.getState() instanceof GovernmentIdState.WaitForAutocapture) && c3527b.getVideoCaptureMethod() == EnumC8598a.Stream && ((GovernmentIdState.WaitForAutocapture) c3527b.getState()).getWebRtcState() == EnumC11917x.Connected;
    }
}
