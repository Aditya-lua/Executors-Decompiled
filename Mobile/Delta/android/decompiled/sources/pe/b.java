package pe;

import af.j0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f28667a;

    public b(InputStream inputStream) {
        this.f28667a = inputStream;
    }

    public static r b(byte[] bArr) {
        return new b(new ByteArrayInputStream(bArr));
    }

    @Override // pe.r
    public af.a0 a() throws IOException {
        try {
            return af.a0.g0(this.f28667a, com.google.crypto.tink.shaded.protobuf.p.b());
        } finally {
            this.f28667a.close();
        }
    }

    @Override // pe.r
    public j0 read() throws IOException {
        try {
            return j0.j0(this.f28667a, com.google.crypto.tink.shaded.protobuf.p.b());
        } finally {
            this.f28667a.close();
        }
    }
}
