package p183i1;

import android.media.AudioTimestamp;
import java.util.concurrent.TimeUnit;
import p533x2.C12637g;

/* JADX INFO: renamed from: i1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C6625t {
    /* JADX INFO: renamed from: a */
    public static int m28601a(int i10) {
        return i10 == 1 ? 16 : 12;
    }

    /* JADX INFO: renamed from: b */
    public static int m28602b(int i10) {
        return i10 == 1 ? 16 : 12;
    }

    /* JADX INFO: renamed from: c */
    public static long m28603c(int i10, long j10, AudioTimestamp audioTimestamp) {
        C12637g.m47070b(((long) i10) > 0, "sampleRate must be greater than 0.");
        C12637g.m47070b(j10 >= 0, "framePosition must be no less than 0.");
        long jM28604d = audioTimestamp.nanoTime + m28604d(j10 - audioTimestamp.framePosition, i10);
        if (jM28604d < 0) {
            return 0L;
        }
        return jM28604d;
    }

    /* JADX INFO: renamed from: d */
    public static long m28604d(long j10, int i10) {
        long j11 = i10;
        C12637g.m47070b(j11 > 0, "sampleRate must be greater than 0.");
        return (TimeUnit.SECONDS.toNanos(1L) * j10) / j11;
    }

    /* JADX INFO: renamed from: e */
    public static long m28605e(long j10, int i10) {
        long j11 = i10;
        C12637g.m47070b(j11 > 0, "bytesPerFrame must be greater than 0.");
        return j10 * j11;
    }

    /* JADX INFO: renamed from: f */
    public static int m28606f(int i10, int i11) {
        C12637g.m47070b(i11 > 0, "Invalid channel count: " + i11);
        if (i10 == 2) {
            return i11 * 2;
        }
        if (i10 == 3) {
            return i11;
        }
        if (i10 != 4) {
            if (i10 == 21) {
                return i11 * 3;
            }
            if (i10 != 22) {
                throw new IllegalArgumentException("Invalid audio encoding: " + i10);
            }
        }
        return i11 * 4;
    }

    /* JADX INFO: renamed from: g */
    public static long m28607g(long j10, int i10) {
        long j11 = i10;
        C12637g.m47070b(j11 > 0, "bytesPerFrame must be greater than 0.");
        return j10 / j11;
    }
}
