package mq;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import rq.PoseInfo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0001\u0006&'()*+¨\u0006,À\u0006\u0003"}, d2 = {"Lmq/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lrq/a;", "i", "()Ljava/util/List;", "posesNeeded", "Lxn/a;", "k", "()Lxn/a;", "currentPose", "p", "()Lrq/a;", "currentPoseInfo", "n", "currentPoseOrNull", "Lmq/t;", "j", "()Lmq/t;", "poseConfigs", "Lmq/s;", "l", "()Lmq/s;", "currentPoseConfig", BuildConfig.FLAVOR, "g", "()Z", "autoCaptureSupported", "s", "isFlashEnabled", "Lsn/v;", "f", "()Lsn/v;", "cameraProperties", BuildConfig.FLAVOR, "t", "()J", "startSelfieTimestamp", "Lmq/b;", "Lmq/y0$a;", "Lmq/y0$d;", "Lmq/y0$l;", "Lmq/y0$n;", "Lmq/y0$q;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @NotNull
    sn.v f();

    boolean g();

    @NotNull
    List<PoseInfo> i();

    @NotNull
    PoseConfigs j();

    @NotNull
    default xn.a k() {
        return ((PoseInfo) CollectionsKt.d0(i())).getPose();
    }

    @NotNull
    default PoseConfig l() {
        xn.a aVarN = n();
        return aVarN == null ? PoseConfig.INSTANCE.a() : j().a(aVarN);
    }

    @Nullable
    default xn.a n() {
        PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(i());
        if (poseInfo != null) {
            return poseInfo.getPose();
        }
        return null;
    }

    @NotNull
    default PoseInfo p() {
        return (PoseInfo) CollectionsKt.d0(i());
    }

    boolean s();

    long t();
}
