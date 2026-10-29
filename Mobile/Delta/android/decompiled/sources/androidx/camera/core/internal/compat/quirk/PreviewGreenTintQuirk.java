package androidx.camera.core.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import g0.a2;
import g0.w2;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import n0.g3;
import n0.i4;
import n0.j4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;", "Ln0/g3;", "<init>", "()V", "", "h", "()Z", "", "cameraId", "", "Lg0/w2;", "appUseCases", "i", "(Ljava/lang/String;Ljava/util/Collection;)Z", "j", "g", "isMotoE20", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class PreviewGreenTintQuirk implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final PreviewGreenTintQuirk f1396a = new PreviewGreenTintQuirk();

    private PreviewGreenTintQuirk() {
    }

    public static final boolean h() {
        return f1396a.g();
    }

    public static final boolean i(@NotNull String cameraId, @NotNull Collection<? extends w2> appUseCases) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(appUseCases, "appUseCases");
        PreviewGreenTintQuirk previewGreenTintQuirk = f1396a;
        if (previewGreenTintQuirk.g()) {
            return previewGreenTintQuirk.j(cameraId, appUseCases);
        }
        return false;
    }

    public final boolean g() {
        return x.E("motorola", Build.BRAND, true) && x.E("moto e20", Build.MODEL, true);
    }

    public final boolean j(String cameraId, Collection<? extends w2> appUseCases) {
        boolean z10;
        boolean z11;
        if (Intrinsics.c(cameraId, "0") && appUseCases.size() == 2) {
            Collection<? extends w2> collection = appUseCases;
            boolean z12 = collection instanceof Collection;
            if (!z12 || !collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    if (((w2) it.next()) instanceof a2) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                z10 = false;
                break;
            }
            if (!z12 || !collection.isEmpty()) {
                Iterator<T> it2 = collection.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z11 = false;
                        break;
                    }
                    w2 w2Var = (w2) it2.next();
                    if (w2Var.l().a(i4.G) && w2Var.l().X() == j4.b.VIDEO_CAPTURE) {
                        z11 = true;
                        break;
                    }
                }
            } else {
                z11 = false;
                break;
            }
            if (z10 && z11) {
                return true;
            }
        }
        return false;
    }
}
