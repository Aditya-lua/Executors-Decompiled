package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.d;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<String> f1393a = new HashSet(Arrays.asList("A24", "BEYOND0", "BEYOND2"));

    public static boolean i() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f1393a.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    public static boolean k() {
        return i();
    }

    public final boolean g(byte[] bArr) {
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

    public final int h(byte[] bArr) {
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

    public byte[] j(d dVar) {
        int iH = 0;
        ByteBuffer byteBufferK = dVar.H1()[0].k();
        byte[] bArr = new byte[byteBufferK.capacity()];
        byteBufferK.rewind();
        byteBufferK.get(bArr);
        return (g(bArr) || (iH = h(bArr)) != -1) ? Arrays.copyOfRange(bArr, iH, byteBufferK.limit()) : bArr;
    }
}
