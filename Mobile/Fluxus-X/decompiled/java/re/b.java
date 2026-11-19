package re;

import cf.j0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f30670a;

    public b(InputStream inputStream) {
        this.f30670a = inputStream;
    }

    public static r b(byte[] bArr) {
        return new b(new ByteArrayInputStream(bArr));
    }

    @Override // re.r
    public cf.a0 a() throws IOException {
        try {
            return cf.a0.g0(this.f30670a, com.google.crypto.tink.shaded.protobuf.p.b());
        } finally {
            this.f30670a.close();
        }
    }

    @Override // re.r
    public j0 read() throws IOException {
        try {
            return j0.j0(this.f30670a, com.google.crypto.tink.shaded.protobuf.p.b());
        } finally {
            this.f30670a.close();
        }
    }
}
