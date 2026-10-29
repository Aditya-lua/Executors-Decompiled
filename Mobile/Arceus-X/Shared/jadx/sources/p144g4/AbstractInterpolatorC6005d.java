package p144g4;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: g4.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractInterpolatorC6005d implements Interpolator {

    /* JADX INFO: renamed from: a */
    public final float[] f23255a;

    /* JADX INFO: renamed from: b */
    public final float f23256b;

    public AbstractInterpolatorC6005d(float[] fArr) {
        this.f23255a = fArr;
        this.f23256b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f23255a;
        int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f23256b;
        float f12 = (f10 - (iMin * f11)) / f11;
        float[] fArr2 = this.f23255a;
        float f13 = fArr2[iMin];
        return f13 + (f12 * (fArr2[iMin + 1] - f13));
    }
}
