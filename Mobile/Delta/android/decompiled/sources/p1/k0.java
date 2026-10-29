package p1;

import android.graphics.PointF;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lp1/k0;", "", "", "focusState", "Landroid/graphics/PointF;", "tapPoint", "<init>", "(ILandroid/graphics/PointF;)V", "a", "I", "()I", "b", "Landroid/graphics/PointF;", "getTapPoint", "()Landroid/graphics/PointF;", "camera-view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int focusState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final PointF tapPoint;

    public k0(int i10, @Nullable PointF pointF) {
        this.focusState = i10;
        this.tapPoint = pointF;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getFocusState() {
        return this.focusState;
    }
}
