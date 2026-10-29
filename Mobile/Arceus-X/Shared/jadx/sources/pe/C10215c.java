package pe;

import af.C0204a0;
import af.C0226j0;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: pe.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C10215c implements InterfaceC10238s {

    /* JADX INFO: renamed from: a */
    public final OutputStream f36825a;

    public C10215c(OutputStream outputStream) {
        this.f36825a = outputStream;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10238s m39303c(OutputStream outputStream) {
        return new C10215c(outputStream);
    }

    @Override // pe.InterfaceC10238s
    /* JADX INFO: renamed from: a */
    public void mo39304a(C0226j0 c0226j0) throws IOException {
        try {
            c0226j0.m13376o(this.f36825a);
        } finally {
            this.f36825a.close();
        }
    }

    @Override // pe.InterfaceC10238s
    /* JADX INFO: renamed from: b */
    public void mo39305b(C0204a0 c0204a0) throws IOException {
        try {
            c0204a0.mo564a().m589C().build().m13376o(this.f36825a);
        } finally {
            this.f36825a.close();
        }
    }
}
