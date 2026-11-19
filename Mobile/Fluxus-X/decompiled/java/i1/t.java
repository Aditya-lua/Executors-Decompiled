package i1;

import android.media.AudioTimestamp;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    public static int a(int i10) {
        return i10 == 1 ? 16 : 12;
    }

    public static int b(int i10) {
        return i10 == 1 ? 16 : 12;
    }

    public static long c(int i10, long j10, AudioTimestamp audioTimestamp) {
        x2.g.b(((long) i10) > 0, "sampleRate must be greater than 0.");
        x2.g.b(j10 >= 0, "framePosition must be no less than 0.");
        long jD = audioTimestamp.nanoTime + d(j10 - audioTimestamp.framePosition, i10);
        if (jD < 0) {
            return 0L;
        }
        return jD;
    }

    public static long d(long j10, int i10) {
        long j11 = i10;
        x2.g.b(j11 > 0, "sampleRate must be greater than 0.");
        return (TimeUnit.SECONDS.toNanos(1L) * j10) / j11;
    }

    public static long e(long j10, int i10) {
        long j11 = i10;
        x2.g.b(j11 > 0, "bytesPerFrame must be greater than 0.");
        return j10 * j11;
    }

    public static int f(int i10, int i11) {
        x2.g.b(i11 > 0, "Invalid channel count: " + i11);
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

    public static long g(long j10, int i10) {
        long j11 = i10;
        x2.g.b(j11 > 0, "bytesPerFrame must be greater than 0.");
        return j10 / j11;
    }
}
