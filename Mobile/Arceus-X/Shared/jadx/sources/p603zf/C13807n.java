package p603zf;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: renamed from: zf.n */
/* JADX INFO: loaded from: classes2.dex */
public class C13807n {

    /* JADX INFO: renamed from: a */
    public static final byte f48425a = Byte.parseByte("01110000", 2);

    /* JADX INFO: renamed from: b */
    public static final byte f48426b = Byte.parseByte("00001111", 2);

    /* JADX INFO: renamed from: b */
    public static String m50280b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m50281c(UUID uuid, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m50282a() {
        byte[] bArrM50281c = m50281c(UUID.randomUUID(), new byte[17]);
        byte b = bArrM50281c[0];
        bArrM50281c[16] = b;
        bArrM50281c[0] = (byte) ((b & f48426b) | f48425a);
        return m50280b(bArrM50281c);
    }
}
