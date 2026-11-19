package ip;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import vo.d2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005R\u0011\u0010\u0018\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lip/l;", BuildConfig.FLAVOR, "Lks/a;", "webRtcManager", "<init>", "(Lks/a;)V", "Lvo/d2$a;", "renderProps", BuildConfig.FLAVOR, "f", "(Lvo/d2$a;)Z", "c", "Lzn/a;", "e", "(Lvo/d2$a;)Lzn/a;", BuildConfig.FLAVOR, "a", "()V", "Lks/a;", "b", "()Lks/a;", "setWebRtcManager", "d", "()Z", "isWebRtcConnected", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ks.a webRtcManager;

    public l(@Nullable ks.a aVar) {
        this.webRtcManager = aVar;
    }

    public final void a() {
        ks.a aVar = this.webRtcManager;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ks.a getWebRtcManager() {
        return this.webRtcManager;
    }

    public final boolean c(@NotNull d2.a renderProps) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        zn.a aVarE = e(renderProps);
        return aVarE == zn.a.Stream || aVarE == zn.a.Upload;
    }

    public final boolean d() {
        ks.a aVar = this.webRtcManager;
        return aVar != null && aVar.isConnected();
    }

    @NotNull
    public final zn.a e(@NotNull d2.a renderProps) {
        zn.a aVar;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        VideoCaptureConfig videoCaptureConfigH = renderProps.H();
        List<zn.a> listG = videoCaptureConfigH.g();
        if (!videoCaptureConfigH.j()) {
            return zn.a.None;
        }
        ks.a aVar2 = this.webRtcManager;
        boolean zD = aVar2 != null ? aVar2.d() : false;
        ks.a aVar3 = this.webRtcManager;
        boolean zH = aVar3 != null ? aVar3.h() : true;
        if (CollectionsKt.firstOrNull(videoCaptureConfigH.g()) == zn.a.Stream && !ks.c.d()) {
            List<zn.a> listG2 = videoCaptureConfigH.g();
            zn.a aVar4 = zn.a.Upload;
            return listG2.contains(aVar4) ? aVar4 : zn.a.None;
        }
        if (zH) {
            zn.a aVar5 = zn.a.Upload;
            if (listG.contains(aVar5)) {
                return aVar5;
            }
        }
        return (zD || (aVar = (zn.a) CollectionsKt.firstOrNull(listG)) == null) ? zn.a.None : aVar;
    }

    public final boolean f(@NotNull d2.a renderProps) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        return (renderProps.H().j() && CollectionsKt.firstOrNull(renderProps.H().g()) == zn.a.Stream && !ks.c.d()) ? false : true;
    }

    public /* synthetic */ l(ks.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ks.c.b() : aVar);
    }
}
