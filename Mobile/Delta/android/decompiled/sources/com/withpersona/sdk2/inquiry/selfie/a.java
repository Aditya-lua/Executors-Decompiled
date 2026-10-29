package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0001\u0006&'()*+¨\u0006,À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/a;", "", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "g", "()Ljava/util/List;", "posesNeeded", "Lkn/a;", "j", "()Lkn/a;", "currentPose", "p", "()Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "currentPoseInfo", "m", "currentPoseOrNull", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "i", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "k", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "currentPoseConfig", "", "f", "()Z", "autoCaptureSupported", "s", "isFlashEnabled", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "t", "()J", "startSelfieTimestamp", "Lcom/withpersona/sdk2/inquiry/selfie/b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @NotNull
    CameraProperties a();

    boolean f();

    @NotNull
    List<PoseInfo> g();

    @NotNull
    PoseConfigs i();

    @NotNull
    default kn.a j() {
        return ((PoseInfo) CollectionsKt.d0(g())).getPose();
    }

    @NotNull
    default PoseConfig k() {
        kn.a aVarM = m();
        return aVarM == null ? PoseConfig.INSTANCE.a() : i().a(aVarM);
    }

    @Nullable
    default kn.a m() {
        PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(g());
        if (poseInfo != null) {
            return poseInfo.getPose();
        }
        return null;
    }

    @NotNull
    default PoseInfo p() {
        return (PoseInfo) CollectionsKt.d0(g());
    }

    boolean s();

    long t();
}
