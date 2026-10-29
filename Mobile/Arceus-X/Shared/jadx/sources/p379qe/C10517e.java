package p379qe;

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
import pe.InterfaceC10211a;
import re.C10835j0;

/* JADX INFO: renamed from: qe.e */
/* JADX INFO: loaded from: classes2.dex */
public class C10517e implements InterfaceC12378k0<InterfaceC10211a, InterfaceC10211a> {

    /* JADX INFO: renamed from: a */
    public static final C10517e f37742a = new C10517e();

    /* JADX INFO: renamed from: b */
    public static final AbstractC12372h0<C12387p, InterfaceC10211a> f37743b = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: qe.d
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C10835j0.m41246d((C12387p) abstractC10231l);
        }
    }, C12387p.class, InterfaceC10211a.class);

    /* JADX INFO: renamed from: qe.e$b */
    public static class b implements InterfaceC10211a {

        /* JADX INFO: renamed from: a */
        public final C12376j0<InterfaceC10211a> f37744a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC12393s.a f37745b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC12393s.a f37746c;

        @Override // pe.InterfaceC10211a
        /* JADX INFO: renamed from: a */
        public byte[] mo22645a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrMo22645a = this.f37744a.m46363d().m46374b().mo22645a(bArr, bArr2);
                this.f37745b.mo46446a(this.f37744a.m46363d().m46375c(), bArr.length);
                return bArrMo22645a;
            } catch (GeneralSecurityException e10) {
                this.f37745b.mo46447b();
                throw e10;
            }
        }

        @Override // pe.InterfaceC10211a
        /* JADX INFO: renamed from: b */
        public byte[] mo22646b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                for (C12376j0.c<InterfaceC10211a> cVar : this.f37744a.m46364e(Arrays.copyOf(bArr, 5))) {
                    try {
                        byte[] bArrMo22646b = cVar.m46374b().mo22646b(bArr, bArr2);
                        this.f37746c.mo46446a(cVar.m46375c(), bArr.length);
                        return bArrMo22646b;
                    } catch (GeneralSecurityException unused) {
                    }
                }
            }
            for (C12376j0.c<InterfaceC10211a> cVar2 : this.f37744a.m46366g()) {
                try {
                    byte[] bArrMo22646b2 = cVar2.m46374b().mo22646b(bArr, bArr2);
                    this.f37746c.mo46446a(cVar2.m46375c(), bArr.length);
                    return bArrMo22646b2;
                } catch (GeneralSecurityException unused2) {
                }
            }
            this.f37746c.mo46447b();
            throw new GeneralSecurityException("decryption failed");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(C12376j0<InterfaceC10211a> c12376j0) {
            this.f37744a = c12376j0;
            if (!c12376j0.m46367h()) {
                InterfaceC12393s.a aVar = C12396u.f44356a;
                this.f37745b = aVar;
                this.f37746c = aVar;
            } else {
                InterfaceC12393s interfaceC12393sM46476a = C12400y.m46475b().m46476a();
                C12395t c12395tM46463a = C12396u.m46463a(c12376j0);
                this.f37745b = interfaceC12393sM46476a.mo46445a(c12395tM46463a, "aead", "encrypt");
                this.f37746c = interfaceC12393sM46476a.mo46445a(c12395tM46463a, "aead", "decrypt");
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m40348d() {
        C12358a0.m46226c().m46230e(f37742a);
        C12358a0.m46226c().m46229d(f37743b);
    }

    @Override // p515we.InterfaceC12378k0
    /* JADX INFO: renamed from: a */
    public Class<InterfaceC10211a> mo7283a() {
        return InterfaceC10211a.class;
    }

    @Override // p515we.InterfaceC12378k0
    /* JADX INFO: renamed from: c */
    public Class<InterfaceC10211a> mo7285c() {
        return InterfaceC10211a.class;
    }

    /* JADX DEBUG: Method merged with bridge method: b(Lwe/j0;)Ljava/lang/Object; */
    @Override // p515we.InterfaceC12378k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC10211a mo7284b(C12376j0<InterfaceC10211a> c12376j0) {
        return new b(c12376j0);
    }
}
