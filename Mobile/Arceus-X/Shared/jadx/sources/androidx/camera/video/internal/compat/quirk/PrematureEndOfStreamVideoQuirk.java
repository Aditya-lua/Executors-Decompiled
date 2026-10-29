package androidx.camera.video.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import kotlin.Metadata;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m31665d2 = {"Landroidx/camera/video/internal/compat/quirk/PrematureEndOfStreamVideoQuirk;", "Ln0/g3;", "<init>", "()V", "", "g", "()Z", "b", "Z", "isCph1931", "camera-video_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class PrematureEndOfStreamVideoQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PrematureEndOfStreamVideoQuirk f1827a = new PrematureEndOfStreamVideoQuirk();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final boolean isCph1931;

    static {
        isCph1931 = C7797x.m32294E("OPPO", Build.BRAND, true) && C7797x.m32294E("CPH1931", Build.MODEL, true);
    }

    private PrematureEndOfStreamVideoQuirk() {
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m2316g() {
        return isCph1931;
    }
}
