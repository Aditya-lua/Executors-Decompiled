package oe;

import java.io.IOException;
import java.io.OutputStream;
import ze.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f27342a;

    public c(OutputStream outputStream) {
        this.f27342a = outputStream;
    }

    public static s c(OutputStream outputStream) {
        return new c(outputStream);
    }

    @Override // oe.s
    public void a(j0 j0Var) throws IOException {
        try {
            j0Var.o(this.f27342a);
        } finally {
            this.f27342a.close();
        }
    }

    @Override // oe.s
    public void b(ze.a0 a0Var) throws IOException {
        try {
            a0Var.a().C().build().o(this.f27342a);
        } finally {
            this.f27342a.close();
        }
    }
}
