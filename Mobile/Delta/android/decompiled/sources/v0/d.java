package v0;

import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import java.nio.ByteBuffer;
import n0.k3;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncorrectJpegMetadataQuirk f32680a;

    public d(k3 k3Var) {
        this.f32680a = (IncorrectJpegMetadataQuirk) k3Var.b(IncorrectJpegMetadataQuirk.class);
    }

    public byte[] a(androidx.camera.core.d dVar) {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.f32680a;
        if (incorrectJpegMetadataQuirk != null) {
            return incorrectJpegMetadataQuirk.j(dVar);
        }
        ByteBuffer byteBufferK = dVar.H1()[0].k();
        byte[] bArr = new byte[byteBufferK.capacity()];
        byteBufferK.rewind();
        byteBufferK.get(bArr);
        return bArr;
    }
}
