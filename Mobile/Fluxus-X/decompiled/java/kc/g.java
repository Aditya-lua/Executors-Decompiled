package kc;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class g implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f21333a = new float[9];
    public final float[] b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f21334c = new Matrix();

    @NonNull
    public Matrix a(float f10, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        matrix.getValues(this.f21333a);
        matrix2.getValues(this.b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.b;
            float f11 = fArr[i10];
            float f12 = this.f21333a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f21334c.setValues(this.b);
        return this.f21334c;
    }
}
