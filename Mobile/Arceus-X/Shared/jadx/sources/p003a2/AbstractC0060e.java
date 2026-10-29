package p003a2;

import java.text.DecimalFormat;

/* JADX INFO: renamed from: a2.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0060e {

    /* JADX INFO: renamed from: a */
    public int[] f123a = new int[10];

    /* JADX INFO: renamed from: b */
    public float[] f124b = new float[10];

    /* JADX INFO: renamed from: c */
    public int f125c;

    /* JADX INFO: renamed from: d */
    public String f126d;

    public String toString() {
        String str = this.f126d;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f125c; i10++) {
            str = str + "[" + this.f123a[i10] + " , " + decimalFormat.format(this.f124b[i10]) + "] ";
        }
        return str;
    }
}
