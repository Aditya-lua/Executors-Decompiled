package h1;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static String a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return "null";
        }
        int iPosition = byteBuffer.position();
        try {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return b(bArr);
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b : bArr) {
            sb2.append(String.format("%02X ", Byte.valueOf(b)));
        }
        return sb2.toString().trim();
    }

    public static String c(long j10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j10);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j10 - timeUnit2.toMillis(hours));
        long millis = j10 - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((j10 - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    public static String d(MediaFormat mediaFormat) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{");
        sb2.append("csd-0");
        sb2.append(" = ");
        sb2.append(a(mediaFormat.getByteBuffer("csd-0")));
        if (mediaFormat.containsKey("csd-1")) {
            sb2.append(", ");
            sb2.append("csd-1");
            sb2.append(" = ");
            sb2.append(a(mediaFormat.getByteBuffer("csd-1")));
        }
        if (mediaFormat.containsKey("csd-2")) {
            sb2.append(", ");
            sb2.append("csd-2");
            sb2.append(" = ");
            sb2.append(a(mediaFormat.getByteBuffer("csd-2")));
        }
        sb2.append("}");
        return sb2.toString();
    }

    public static String e(long j10) {
        return c(j10);
    }

    public static String f(long j10) {
        return e(TimeUnit.MICROSECONDS.toMillis(j10));
    }
}
