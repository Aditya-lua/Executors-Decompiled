package p480v0;

import androidx.camera.core.InterfaceC0494d;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import java.nio.ByteBuffer;
import p296n0.C8782k3;

/* JADX INFO: renamed from: v0.d */
/* JADX INFO: loaded from: classes.dex */
public class C11989d {

    /* JADX INFO: renamed from: a */
    public final IncorrectJpegMetadataQuirk f42463a;

    public C11989d(C8782k3 c8782k3) {
        this.f42463a = (IncorrectJpegMetadataQuirk) c8782k3.m35234b(IncorrectJpegMetadataQuirk.class);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m44743a(InterfaceC0494d interfaceC0494d) {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.f42463a;
        if (incorrectJpegMetadataQuirk != null) {
            return incorrectJpegMetadataQuirk.m2248j(interfaceC0494d);
        }
        ByteBuffer byteBufferMo2188k = interfaceC0494d.mo2186H1()[0].mo2188k();
        byte[] bArr = new byte[byteBufferMo2188k.capacity()];
        byteBufferMo2188k.rewind();
        byteBufferMo2188k.get(bArr);
        return bArr;
    }
}
