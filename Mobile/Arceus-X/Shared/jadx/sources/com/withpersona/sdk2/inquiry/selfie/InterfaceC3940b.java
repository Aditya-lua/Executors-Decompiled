package com.withpersona.sdk2.inquiry.selfie;

import kotlin.Metadata;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/b;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "", "n", "()J", "startCaptureTimestamp", "", "o", "()Z", "manualCaptureEnabled", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC3940b extends InterfaceC3939a {
    /* JADX INFO: renamed from: n */
    long mo19319n();

    /* JADX INFO: renamed from: o */
    default boolean mo19320o() {
        PoseConfig poseConfigMo19318k = mo19318k();
        if (!mo19301f() || poseConfigMo19318k.getManualCaptureEnabled()) {
            return (mo19301f() && poseConfigMo19318k.getAutoCaptureEnabled() && System.currentTimeMillis() - mo19319n() <= poseConfigMo19318k.getManualCaptureDelayMs()) ? false : true;
        }
        return false;
    }
}
