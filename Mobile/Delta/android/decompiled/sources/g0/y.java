package g0;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006JC\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lg0/y;", "", "", "cameraId", "Ls0/f;", "a", "(Ljava/lang/String;)Ls0/f;", "Ln0/p0;", "camera", "secondaryCamera", "Ln0/e;", "adapterCameraInfo", "secondaryAdapterCameraInfo", "Lg0/i0;", "compositionSettings", "secondaryCompositionSettings", "b", "(Ln0/p0;Ln0/p0;Ln0/e;Ln0/e;Lg0/i0;Lg0/i0;)Ls0/f;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface y {
    @NotNull
    s0.f a(@NotNull String cameraId);

    @NotNull
    s0.f b(@NotNull n0.p0 camera, @Nullable n0.p0 secondaryCamera, @NotNull n0.e adapterCameraInfo, @Nullable n0.e secondaryAdapterCameraInfo, @NotNull i0 compositionSettings, @NotNull i0 secondaryCompositionSettings);
}
