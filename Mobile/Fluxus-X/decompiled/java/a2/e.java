package a2;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f86a = new int[10];
    public float[] b = new float[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f87c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f88d;

    public String toString() {
        String str = this.f88d;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f87c; i10++) {
            str = str + "[" + this.f86a[i10] + " , " + decimalFormat.format(this.b[i10]) + "] ";
        }
        return str;
    }
}
