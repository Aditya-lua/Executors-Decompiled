package re;

import cf.j0;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f30673a;

    public c(OutputStream outputStream) {
        this.f30673a = outputStream;
    }

    public static s c(OutputStream outputStream) {
        return new c(outputStream);
    }

    @Override // re.s
    public void a(j0 j0Var) throws IOException {
        try {
            j0Var.o(this.f30673a);
        } finally {
            this.f30673a.close();
        }
    }

    @Override // re.s
    public void b(cf.a0 a0Var) throws IOException {
        try {
            a0Var.a().D().build().o(this.f30673a);
        } finally {
            this.f30673a.close();
        }
    }
}
