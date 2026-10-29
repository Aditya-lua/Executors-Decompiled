package p322o5;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: o5.n0 */
/* JADX INFO: loaded from: classes.dex */
public class C9678n0 extends C9676m0 {
    @Override // p322o5.C9670j0
    /* JADX INFO: renamed from: b */
    public float mo38204b(@NonNull View view) {
        return view.getTransitionAlpha();
    }

    @Override // p322o5.C9674l0, p322o5.C9670j0
    /* JADX INFO: renamed from: d */
    public void mo38206d(@NonNull View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // p322o5.C9670j0
    /* JADX INFO: renamed from: e */
    public void mo38207e(@NonNull View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // p322o5.C9676m0, p322o5.C9670j0
    /* JADX INFO: renamed from: f */
    public void mo38208f(@NonNull View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // p322o5.C9672k0, p322o5.C9670j0
    /* JADX INFO: renamed from: g */
    public void mo38209g(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p322o5.C9672k0, p322o5.C9670j0
    /* JADX INFO: renamed from: h */
    public void mo38210h(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
