package wn;

import android.graphics.Rect;
import android.view.View;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import sn.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwn/a;", "Lsn/i;", "cameraController", "Landroid/view/View;", "pointOfInterestView", BuildConfig.FLAVOR, "a", "(Lwn/a;Lsn/i;Landroid/view/View;)V", "camera_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final void a(@NotNull a aVar, @NotNull i cameraController, @NotNull View pointOfInterestView) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(pointOfInterestView, "pointOfInterestView");
        int[] iArr = new int[2];
        pointOfInterestView.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        Rect rect = new Rect(i10, iArr[1], pointOfInterestView.getWidth() + i10, iArr[1] + pointOfInterestView.getHeight());
        View viewC = cameraController.c();
        viewC.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        aVar.b(rect, new Rect(i11, iArr[1], viewC.getWidth() + i11, iArr[1] + viewC.getHeight()));
    }
}
