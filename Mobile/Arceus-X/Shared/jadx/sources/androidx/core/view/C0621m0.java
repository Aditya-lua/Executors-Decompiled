package androidx.core.view;

import android.view.MotionEvent;

/* JADX INFO: renamed from: androidx.core.view.m0 */
/* JADX INFO: loaded from: classes.dex */
public class C0621m0 {

    /* JADX INFO: renamed from: a */
    public final float[] f2448a = new float[20];

    /* JADX INFO: renamed from: b */
    public final long[] f2449b = new long[20];

    /* JADX INFO: renamed from: c */
    public float f2450c = 0.0f;

    /* JADX INFO: renamed from: d */
    public int f2451d = 0;

    /* JADX INFO: renamed from: e */
    public int f2452e = 0;

    /* JADX INFO: renamed from: f */
    public static float m2968f(float f10) {
        return (f10 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f10) * 2.0f));
    }

    /* JADX INFO: renamed from: a */
    public void m2969a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f2451d != 0 && eventTime - this.f2449b[this.f2452e] > 40) {
            m2970b();
        }
        int i10 = (this.f2452e + 1) % 20;
        this.f2452e = i10;
        int i11 = this.f2451d;
        if (i11 != 20) {
            this.f2451d = i11 + 1;
        }
        this.f2448a[i10] = motionEvent.getAxisValue(26);
        this.f2449b[this.f2452e] = eventTime;
    }

    /* JADX INFO: renamed from: b */
    public final void m2970b() {
        this.f2451d = 0;
        this.f2450c = 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public void m2971c(int i10, float f10) {
        float fM2973e = m2973e() * i10;
        this.f2450c = fM2973e;
        if (fM2973e < (-Math.abs(f10))) {
            this.f2450c = -Math.abs(f10);
        } else if (this.f2450c > Math.abs(f10)) {
            this.f2450c = Math.abs(f10);
        }
    }

    /* JADX INFO: renamed from: d */
    public float m2972d(int i10) {
        if (i10 != 26) {
            return 0.0f;
        }
        return this.f2450c;
    }

    /* JADX INFO: renamed from: e */
    public final float m2973e() {
        long[] jArr;
        long j10;
        int i10 = this.f2451d;
        if (i10 < 2) {
            return 0.0f;
        }
        int i11 = this.f2452e;
        int i12 = ((i11 + 20) - (i10 - 1)) % 20;
        long j11 = this.f2449b[i11];
        while (true) {
            jArr = this.f2449b;
            j10 = jArr[i12];
            if (j11 - j10 <= 100) {
                break;
            }
            this.f2451d--;
            i12 = (i12 + 1) % 20;
        }
        int i13 = this.f2451d;
        if (i13 < 2) {
            return 0.0f;
        }
        if (i13 == 2) {
            int i14 = (i12 + 1) % 20;
            long j12 = jArr[i14];
            if (j10 == j12) {
                return 0.0f;
            }
            return this.f2448a[i14] / (j12 - j10);
        }
        float fAbs = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f2451d - 1; i16++) {
            int i17 = i16 + i12;
            long[] jArr2 = this.f2449b;
            long j13 = jArr2[i17 % 20];
            int i18 = (i17 + 1) % 20;
            if (jArr2[i18] != j13) {
                i15++;
                float fM2968f = m2968f(fAbs);
                float f10 = this.f2448a[i18] / (this.f2449b[i18] - j13);
                fAbs += (f10 - fM2968f) * Math.abs(f10);
                if (i15 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return m2968f(fAbs);
    }
}
