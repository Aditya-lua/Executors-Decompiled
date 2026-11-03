package so;

import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005R\u0011\u0010\u0018\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lso/l;", "", "Lsr/a;", "webRtcManager", "<init>", "(Lsr/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "", "f", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z", "c", "Lkn/a;", "e", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lkn/a;", "", "a", "()V", "Lsr/a;", "b", "()Lsr/a;", "setWebRtcManager", "d", "()Z", "isWebRtcConnected", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public sr.a webRtcManager;

    public l(@Nullable sr.a aVar) {
        this.webRtcManager = aVar;
    }

    public final void a() {
        sr.a aVar = this.webRtcManager;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final sr.a getWebRtcManager() {
        return this.webRtcManager;
    }

    public final boolean c(@NotNull GovernmentIdWorkflow.Input renderProps) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        kn.a aVarE = e(renderProps);
        return aVarE == kn.a.Stream || aVarE == kn.a.Upload;
    }

    public final boolean d() {
        sr.a aVar = this.webRtcManager;
        return aVar != null && aVar.isConnected();
    }

    @NotNull
    public final kn.a e(@NotNull GovernmentIdWorkflow.Input renderProps) {
        kn.a aVar;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        VideoCaptureConfig videoCaptureConfigJ = renderProps.J();
        List<kn.a> listG = videoCaptureConfigJ.g();
        if (!videoCaptureConfigJ.j()) {
            return kn.a.None;
        }
        sr.a aVar2 = this.webRtcManager;
        boolean zD = aVar2 != null ? aVar2.d() : false;
        sr.a aVar3 = this.webRtcManager;
        boolean zH = aVar3 != null ? aVar3.h() : true;
        if (CollectionsKt.firstOrNull(videoCaptureConfigJ.g()) == kn.a.Stream && !sr.c.d()) {
            List<kn.a> listG2 = videoCaptureConfigJ.g();
            kn.a aVar4 = kn.a.Upload;
            return listG2.contains(aVar4) ? aVar4 : kn.a.None;
        }
        if (zH) {
            kn.a aVar5 = kn.a.Upload;
            if (listG.contains(aVar5)) {
                return aVar5;
            }
        }
        return (zD || (aVar = (kn.a) CollectionsKt.firstOrNull(listG)) == null) ? kn.a.None : aVar;
    }

    public final boolean f(@NotNull GovernmentIdWorkflow.Input renderProps) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        return (renderProps.J().j() && CollectionsKt.firstOrNull(renderProps.J().g()) == kn.a.Stream && !sr.c.d()) ? false : true;
    }

    public /* synthetic */ l(sr.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? sr.c.b() : aVar);
    }
}
