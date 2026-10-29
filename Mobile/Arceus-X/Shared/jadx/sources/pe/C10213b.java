package pe;

import af.C0204a0;
import af.C0226j0;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: pe.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C10213b implements InterfaceC10237r {

    /* JADX INFO: renamed from: a */
    public final InputStream f36821a;

    public C10213b(InputStream inputStream) {
        this.f36821a = inputStream;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10237r m39296b(byte[] bArr) {
        return new C10213b(new ByteArrayInputStream(bArr));
    }

    @Override // pe.InterfaceC10237r
    /* JADX INFO: renamed from: a */
    public C0204a0 mo39297a() throws IOException {
        try {
            return C0204a0.m584g0(this.f36821a, C2944p.m14035b());
        } finally {
            this.f36821a.close();
        }
    }

    @Override // pe.InterfaceC10237r
    public C0226j0 read() throws IOException {
        try {
            return C0226j0.m798j0(this.f36821a, C2944p.m14035b());
        } finally {
            this.f36821a.close();
        }
    }
}
