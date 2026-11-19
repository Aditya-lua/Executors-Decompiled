package mq;

import com.github.luben.zstd.BuildConfig;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lmq/b;", "Lmq/a;", BuildConfig.FLAVOR, "a", "()J", "startCaptureTimestamp", BuildConfig.FLAVOR, "o", "()Z", "manualCaptureEnabled", "Lmq/y0$b;", "Lmq/y0$e;", "Lmq/y0$m;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b extends a {
    long a();

    default boolean o() {
        PoseConfig poseConfigL = l();
        if (!g() || poseConfigL.getManualCaptureEnabled()) {
            return (g() && poseConfigL.getAutoCaptureEnabled() && System.currentTimeMillis() - a() <= poseConfigL.getManualCaptureDelayMs()) ? false : true;
        }
        return false;
    }
}
