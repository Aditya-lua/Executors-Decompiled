package p322o5;

import java.util.Arrays;

/* JADX INFO: renamed from: o5.g0 */
/* JADX INFO: loaded from: classes.dex */
public class C9664g0 {

    /* JADX INFO: renamed from: a */
    public long[] f35080a;

    /* JADX INFO: renamed from: b */
    public float[] f35081b = new float[20];

    /* JADX INFO: renamed from: c */
    public int f35082c = 0;

    public C9664g0() {
        long[] jArr = new long[20];
        this.f35080a = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: a */
    public void m38178a(long j10, float f10) {
        int i10 = (this.f35082c + 1) % 20;
        this.f35082c = i10;
        this.f35080a[i10] = j10;
        this.f35081b[i10] = f10;
    }

    /* JADX INFO: renamed from: b */
    public float m38179b() {
        float fM38180c;
        int i10 = this.f35082c;
        if (i10 == 0 && this.f35080a[i10] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j10 = this.f35080a[i10];
        int i11 = 0;
        long j11 = j10;
        while (true) {
            long j12 = this.f35080a[i10];
            if (j12 == Long.MIN_VALUE) {
                break;
            }
            float f10 = j10 - j12;
            float fAbs = Math.abs(j12 - j11);
            if (f10 > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (i10 == 0) {
                i10 = 20;
            }
            i10--;
            i11++;
            if (i11 >= 20) {
                break;
            }
            j11 = j12;
        }
        if (i11 < 2) {
            return 0.0f;
        }
        if (i11 == 2) {
            int i12 = this.f35082c;
            int i13 = i12 == 0 ? 19 : i12 - 1;
            long[] jArr = this.f35080a;
            float f11 = jArr[i12] - jArr[i13];
            if (f11 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.f35081b;
            fM38180c = (fArr[i12] - fArr[i13]) / f11;
        } else {
            int i14 = this.f35082c;
            int i15 = ((i14 - i11) + 21) % 20;
            int i16 = (i14 + 21) % 20;
            long j13 = this.f35080a[i15];
            float f12 = this.f35081b[i15];
            int i17 = i15 + 1;
            float fM38180c2 = 0.0f;
            for (int i18 = i17 % 20; i18 != i16; i18 = (i18 + 1) % 20) {
                long j14 = this.f35080a[i18];
                float f13 = j14 - j13;
                if (f13 != 0.0f) {
                    float f14 = this.f35081b[i18];
                    float f15 = (f14 - f12) / f13;
                    fM38180c2 += (f15 - m38180c(fM38180c2)) * Math.abs(f15);
                    if (i18 == i17) {
                        fM38180c2 *= 0.5f;
                    }
                    f12 = f14;
                    j13 = j14;
                }
            }
            fM38180c = m38180c(fM38180c2);
        }
        return fM38180c * 1000.0f;
    }

    /* JADX INFO: renamed from: c */
    public final float m38180c(float f10) {
        return (float) (((double) Math.signum(f10)) * Math.sqrt(Math.abs(f10) * 2.0f));
    }
}
