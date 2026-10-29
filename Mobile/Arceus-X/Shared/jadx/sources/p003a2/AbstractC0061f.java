package p003a2;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: a2.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0061f {

    /* JADX INFO: renamed from: d */
    public int f130d;

    /* JADX INFO: renamed from: e */
    public String f131e;

    /* JADX INFO: renamed from: a */
    public int f127a = 0;

    /* JADX INFO: renamed from: b */
    public int[] f128b = new int[10];

    /* JADX INFO: renamed from: c */
    public float[][] f129c = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: f */
    public float[] f132f = new float[3];

    /* JADX INFO: renamed from: g */
    public boolean f133g = false;

    /* JADX INFO: renamed from: h */
    public float f134h = Float.NaN;

    public String toString() {
        String str = this.f131e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f130d; i10++) {
            str = str + "[" + this.f128b[i10] + " , " + decimalFormat.format(this.f129c[i10]) + "] ";
        }
        return str;
    }
}
