package androidx.camera.core.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;
import p140g0.AbstractC5952w2;
import p140g0.C5864a2;
import p296n0.InterfaceC8758g3;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8777j4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0011"}, m31665d2 = {"Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;", "Ln0/g3;", "<init>", "()V", "", "h", "()Z", "", "cameraId", "", "Lg0/w2;", "appUseCases", "i", "(Ljava/lang/String;Ljava/util/Collection;)Z", "j", "g", "isMotoE20", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class PreviewGreenTintQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PreviewGreenTintQuirk f1820a = new PreviewGreenTintQuirk();

    private PreviewGreenTintQuirk() {
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m2255h() {
        return f1820a.m2257g();
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m2256i(@NotNull String cameraId, @NotNull Collection<? extends AbstractC5952w2> appUseCases) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(appUseCases, "appUseCases");
        PreviewGreenTintQuirk previewGreenTintQuirk = f1820a;
        if (previewGreenTintQuirk.m2257g()) {
            return previewGreenTintQuirk.m2258j(cameraId, appUseCases);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2257g() {
        return C7797x.m32294E("motorola", Build.BRAND, true) && C7797x.m32294E("moto e20", Build.MODEL, true);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2258j(String cameraId, Collection<? extends AbstractC5952w2> appUseCases) {
        boolean z10;
        boolean z11;
        if (Intrinsics.m31980c(cameraId, "0") && appUseCases.size() == 2) {
            Collection<? extends AbstractC5952w2> collection = appUseCases;
            boolean z12 = collection instanceof Collection;
            if (!z12 || !collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    if (((AbstractC5952w2) it.next()) instanceof C5864a2) {
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
                    AbstractC5952w2 abstractC5952w2 = (AbstractC5952w2) it2.next();
                    if (abstractC5952w2.m26707l().mo35023a(InterfaceC8771i4.f31902G) && abstractC5952w2.m26707l().mo35207X() == InterfaceC8777j4.b.VIDEO_CAPTURE) {
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
