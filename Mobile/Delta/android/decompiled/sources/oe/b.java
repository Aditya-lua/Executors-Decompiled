package oe;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import ze.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f27339a;

    public b(InputStream inputStream) {
        this.f27339a = inputStream;
    }

    public static r b(byte[] bArr) {
        return new b(new ByteArrayInputStream(bArr));
    }

    @Override // oe.r
    public ze.a0 a() throws IOException {
        try {
            return ze.a0.g0(this.f27339a, com.google.crypto.tink.shaded.protobuf.p.b());
        } finally {
            this.f27339a.close();
        }
    }

    @Override // oe.r
    public j0 read() throws IOException {
        try {
            return j0.j0(this.f27339a, com.google.crypto.tink.shaded.protobuf.p.b());
        } finally {
            this.f27339a.close();
        }
    }
}
