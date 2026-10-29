package uo;

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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005R\u0011\u0010\u0018\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Luo/l;", "", "Lur/a;", "webRtcManager", "<init>", "(Lur/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "", "f", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z", "c", "Lmn/a;", "e", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lmn/a;", "", "a", "()V", "Lur/a;", "b", "()Lur/a;", "setWebRtcManager", "d", "()Z", "isWebRtcConnected", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ur.a webRtcManager;

    public l(@Nullable ur.a aVar) {
        this.webRtcManager = aVar;
    }

    public final void a() {
        ur.a aVar = this.webRtcManager;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ur.a getWebRtcManager() {
        return this.webRtcManager;
    }

    public final boolean c(@NotNull GovernmentIdWorkflow.Input renderProps) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        mn.a aVarE = e(renderProps);
        return aVarE == mn.a.Stream || aVarE == mn.a.Upload;
    }

    public final boolean d() {
        ur.a aVar = this.webRtcManager;
        return aVar != null && aVar.isConnected();
    }

    @NotNull
    public final mn.a e(@NotNull GovernmentIdWorkflow.Input renderProps) {
        mn.a aVar;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        VideoCaptureConfig videoCaptureConfigJ = renderProps.J();
        List<mn.a> listG = videoCaptureConfigJ.g();
        if (!videoCaptureConfigJ.j()) {
            return mn.a.None;
        }
        ur.a aVar2 = this.webRtcManager;
        boolean zC = aVar2 != null ? aVar2.c() : false;
        ur.a aVar3 = this.webRtcManager;
        boolean zG = aVar3 != null ? aVar3.g() : true;
        if (CollectionsKt.firstOrNull(videoCaptureConfigJ.g()) == mn.a.Stream && !ur.c.d()) {
            List<mn.a> listG2 = videoCaptureConfigJ.g();
            mn.a aVar4 = mn.a.Upload;
            return listG2.contains(aVar4) ? aVar4 : mn.a.None;
        }
        if (zG) {
            mn.a aVar5 = mn.a.Upload;
            if (listG.contains(aVar5)) {
                return aVar5;
            }
        }
        return (zC || (aVar = (mn.a) CollectionsKt.firstOrNull(listG)) == null) ? mn.a.None : aVar;
    }

    public final boolean f(@NotNull GovernmentIdWorkflow.Input renderProps) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        return (renderProps.J().j() && CollectionsKt.firstOrNull(renderProps.J().g()) == mn.a.Stream && !ur.c.d()) ? false : true;
    }

    public /* synthetic */ l(ur.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ur.c.b() : aVar);
    }
}
