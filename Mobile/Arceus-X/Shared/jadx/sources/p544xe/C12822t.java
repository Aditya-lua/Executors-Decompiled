package p544xe;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import p515we.AbstractC12372h0;
import p515we.C12358a0;
import p515we.C12376j0;
import p515we.C12387p;
import p515we.C12395t;
import p515we.C12396u;
import p515we.C12400y;
import p515we.InterfaceC12378k0;
import p515we.InterfaceC12393s;
import pe.AbstractC10231l;
import pe.InterfaceC10242w;
import ye.C13186n;

/* JADX INFO: renamed from: xe.t */
/* JADX INFO: loaded from: classes2.dex */
public class C12822t implements InterfaceC12378k0<InterfaceC10242w, InterfaceC10242w> {

    /* JADX INFO: renamed from: a */
    public static final C12822t f45607a = new C12822t();

    /* JADX INFO: renamed from: b */
    public static final AbstractC12372h0<C12387p, InterfaceC10242w> f45608b = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: xe.s
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C13186n.m48802c((C12387p) abstractC10231l);
        }
    }, C12387p.class, InterfaceC10242w.class);

    /* JADX INFO: renamed from: xe.t$b */
    public static class b implements InterfaceC10242w {

        /* JADX INFO: renamed from: a */
        public final C12376j0<InterfaceC10242w> f45609a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC12393s.a f45610b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC12393s.a f45611c;

        @Override // pe.InterfaceC10242w
        /* JADX INFO: renamed from: a */
        public void mo22722a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                this.f45611c.mo46447b();
                throw new GeneralSecurityException("tag too short");
            }
            for (C12376j0.c<InterfaceC10242w> cVar : this.f45609a.m46364e(Arrays.copyOf(bArr, 5))) {
                try {
                    cVar.m46374b().mo22722a(bArr, bArr2);
                    this.f45611c.mo46446a(cVar.m46375c(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            for (C12376j0.c<InterfaceC10242w> cVar2 : this.f45609a.m46366g()) {
                try {
                    cVar2.m46374b().mo22722a(bArr, bArr2);
                    this.f45611c.mo46446a(cVar2.m46375c(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused2) {
                }
            }
            this.f45611c.mo46447b();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // pe.InterfaceC10242w
        /* JADX INFO: renamed from: b */
        public byte[] mo22723b(byte[] bArr) throws GeneralSecurityException {
            try {
                byte[] bArrMo22723b = this.f45609a.m46363d().m46374b().mo22723b(bArr);
                this.f45610b.mo46446a(this.f45609a.m46363d().m46375c(), bArr.length);
                return bArrMo22723b;
            } catch (GeneralSecurityException e10) {
                this.f45610b.mo46447b();
                throw e10;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(C12376j0<InterfaceC10242w> c12376j0) {
            this.f45609a = c12376j0;
            if (!c12376j0.m46367h()) {
                InterfaceC12393s.a aVar = C12396u.f44356a;
                this.f45610b = aVar;
                this.f45611c = aVar;
            } else {
                InterfaceC12393s interfaceC12393sM46476a = C12400y.m46475b().m46476a();
                C12395t c12395tM46463a = C12396u.m46463a(c12376j0);
                this.f45610b = interfaceC12393sM46476a.mo46445a(c12395tM46463a, "mac", "compute");
                this.f45611c = interfaceC12393sM46476a.mo46445a(c12395tM46463a, "mac", "verify");
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m47739d() {
        C12358a0.m46226c().m46230e(f45607a);
        C12358a0.m46226c().m46229d(f45608b);
    }

    @Override // p515we.InterfaceC12378k0
    /* JADX INFO: renamed from: a */
    public Class<InterfaceC10242w> mo7283a() {
        return InterfaceC10242w.class;
    }

    @Override // p515we.InterfaceC12378k0
    /* JADX INFO: renamed from: c */
    public Class<InterfaceC10242w> mo7285c() {
        return InterfaceC10242w.class;
    }

    /* JADX DEBUG: Method merged with bridge method: b(Lwe/j0;)Ljava/lang/Object; */
    @Override // p515we.InterfaceC12378k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC10242w mo7284b(C12376j0<InterfaceC10242w> c12376j0) {
        return new b(c12376j0);
    }
}
