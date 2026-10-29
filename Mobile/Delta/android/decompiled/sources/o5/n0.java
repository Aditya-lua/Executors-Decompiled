package o5;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class n0 extends m0 {
    @Override // o5.j0
    public float b(@NonNull View view) {
        return view.getTransitionAlpha();
    }

    @Override // o5.l0, o5.j0
    public void d(@NonNull View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // o5.j0
    public void e(@NonNull View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // o5.m0, o5.j0
    public void f(@NonNull View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // o5.k0, o5.j0
    public void g(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // o5.k0, o5.j0
    public void h(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
