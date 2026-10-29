package a2;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f91d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f92e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89a = 0;
    public int[] b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[][] f90c = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f93f = new float[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f94g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f95h = Float.NaN;

    public String toString() {
        String str = this.f92e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f91d; i10++) {
            str = str + "[" + this.b[i10] + " , " + decimalFormat.format(this.f90c[i10]) + "] ";
        }
        return str;
    }
}
