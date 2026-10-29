package p216jc;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: jc.g */
/* JADX INFO: loaded from: classes2.dex */
public class C7143g implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: a */
    public final float[] f27794a = new float[9];

    /* JADX INFO: renamed from: b */
    public final float[] f27795b = new float[9];

    /* JADX INFO: renamed from: c */
    public final Matrix f27796c = new Matrix();

    @NonNull
    /* JADX INFO: renamed from: a */
    public Matrix mo12837a(float f10, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        matrix.getValues(this.f27794a);
        matrix2.getValues(this.f27795b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f27795b;
            float f11 = fArr[i10];
            float f12 = this.f27794a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f27796c.setValues(this.f27795b);
        return this.f27796c;
    }
}
