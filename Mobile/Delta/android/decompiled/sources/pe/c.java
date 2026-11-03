package pe;

import af.j0;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f28670a;

    public c(OutputStream outputStream) {
        this.f28670a = outputStream;
    }

    public static s c(OutputStream outputStream) {
        return new c(outputStream);
    }

    @Override // pe.s
    public void a(j0 j0Var) throws IOException {
        try {
            j0Var.o(this.f28670a);
        } finally {
            this.f28670a.close();
        }
    }

    @Override // pe.s
    public void b(af.a0 a0Var) throws IOException {
        try {
            a0Var.a().C().build().o(this.f28670a);
        } finally {
            this.f28670a.close();
        }
    }
}
