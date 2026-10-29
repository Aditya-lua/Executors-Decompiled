package p225jn;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p132fn.InterfaceC5683g;

/* JADX INFO: renamed from: jn.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Ljn/a;", "Lfn/g;", "cameraController", "Landroid/view/View;", "pointOfInterestView", "", "a", "(Ljn/a;Lfn/g;Landroid/view/View;)V", "camera_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7211b {
    /* JADX INFO: renamed from: a */
    public static final void m30141a(@NotNull InterfaceC7210a interfaceC7210a, @NotNull InterfaceC5683g cameraController, @NotNull View pointOfInterestView) {
        Intrinsics.checkNotNullParameter(interfaceC7210a, "<this>");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(pointOfInterestView, "pointOfInterestView");
        int[] iArr = new int[2];
        pointOfInterestView.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        Rect rect = new Rect(i10, iArr[1], pointOfInterestView.getWidth() + i10, iArr[1] + pointOfInterestView.getHeight());
        View viewMo16220d = cameraController.mo16220d();
        viewMo16220d.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        interfaceC7210a.mo25835b(rect, new Rect(i11, iArr[1], viewMo16220d.getWidth() + i11, iArr[1] + viewMo16220d.getHeight()));
    }
}
