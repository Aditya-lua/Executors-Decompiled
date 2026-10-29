package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.InterfaceC0494d;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f1816a = new HashSet(Arrays.asList("A24", "BEYOND0", "BEYOND2"));

    /* JADX INFO: renamed from: i */
    public static boolean m2244i() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f1816a.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2245k() {
        return m2244i();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2246g(byte[] bArr) {
        byte b;
        int i10 = 2;
        while (i10 + 4 <= bArr.length && (b = bArr[i10]) == -1) {
            if (b == -1 && bArr[i10 + 1] == -38) {
                return true;
            }
            i10 += (((bArr[i10 + 2] & 255) << 8) | (bArr[i10 + 3] & 255)) + 2;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final int m2247h(byte[] bArr) {
        int i10 = 2;
        while (true) {
            int i11 = i10 + 1;
            if (i11 > bArr.length) {
                return -1;
            }
            if (bArr[i10] == -1 && bArr[i11] == -40) {
                return i10;
            }
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: j */
    public byte[] m2248j(InterfaceC0494d interfaceC0494d) {
        int iM2247h = 0;
        ByteBuffer byteBufferMo2188k = interfaceC0494d.mo2186H1()[0].mo2188k();
        byte[] bArr = new byte[byteBufferMo2188k.capacity()];
        byteBufferMo2188k.rewind();
        byteBufferMo2188k.get(bArr);
        return (m2246g(bArr) || (iM2247h = m2247h(bArr)) != -1) ? Arrays.copyOfRange(bArr, iM2247h, byteBufferMo2188k.limit()) : bArr;
    }
}
