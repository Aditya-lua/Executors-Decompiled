package bf;

import cf.C1651p;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p515we.AbstractC12372h0;
import p515we.C12358a0;
import p515we.C12376j0;
import p515we.C12387p;
import p515we.C12396u;
import p515we.C12400y;
import p515we.InterfaceC12378k0;
import p515we.InterfaceC12393s;
import pe.AbstractC10231l;
import pe.InterfaceC10212a0;

/* JADX INFO: renamed from: bf.i0 */
/* JADX INFO: loaded from: classes2.dex */
public class C1399i0 implements InterfaceC12378k0<InterfaceC10212a0, InterfaceC10212a0> {

    /* JADX INFO: renamed from: a */
    public static final C1399i0 f5482a = new C1399i0();

    /* JADX INFO: renamed from: b */
    public static final AbstractC12372h0<C12387p, InterfaceC10212a0> f5483b = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: bf.h0
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C1651p.m8299b((C12387p) abstractC10231l);
        }
    }, C12387p.class, InterfaceC10212a0.class);

    /* JADX INFO: renamed from: bf.i0$a */
    public static class a implements InterfaceC10212a0 {

        /* JADX INFO: renamed from: a */
        public final C12376j0<InterfaceC10212a0> f5484a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC12393s.a f5485b;

        public a(C12376j0<InterfaceC10212a0> c12376j0) {
            this.f5484a = c12376j0;
            if (c12376j0.m46367h()) {
                this.f5485b = C12400y.m46475b().m46476a().mo46445a(C12396u.m46463a(c12376j0), "public_key_verify", "verify");
            } else {
                this.f5485b = C12396u.f44356a;
            }
        }

        @Override // pe.InterfaceC10212a0
        /* JADX INFO: renamed from: a */
        public void mo7293a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                this.f5485b.mo46447b();
                throw new GeneralSecurityException("signature too short");
            }
            for (C12376j0.c<InterfaceC10212a0> cVar : this.f5484a.m46364e(Arrays.copyOf(bArr, 5))) {
                try {
                    cVar.m46374b().mo7293a(bArr, bArr2);
                    this.f5485b.mo46446a(cVar.m46375c(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            for (C12376j0.c<InterfaceC10212a0> cVar2 : this.f5484a.m46366g()) {
                try {
                    cVar2.m46374b().mo7293a(bArr, bArr2);
                    this.f5485b.mo46446a(cVar2.m46375c(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused2) {
                }
            }
            this.f5485b.mo46447b();
            throw new GeneralSecurityException("invalid signature");
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m7291d() {
        C12358a0.m46226c().m46230e(f5482a);
        C12358a0.m46226c().m46229d(f5483b);
    }

    @Override // p515we.InterfaceC12378k0
    /* JADX INFO: renamed from: a */
    public Class<InterfaceC10212a0> mo7283a() {
        return InterfaceC10212a0.class;
    }

    @Override // p515we.InterfaceC12378k0
    /* JADX INFO: renamed from: c */
    public Class<InterfaceC10212a0> mo7285c() {
        return InterfaceC10212a0.class;
    }

    /* JADX DEBUG: Method merged with bridge method: b(Lwe/j0;)Ljava/lang/Object; */
    @Override // p515we.InterfaceC12378k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC10212a0 mo7284b(C12376j0<InterfaceC10212a0> c12376j0) {
        return new a(c12376j0);
    }
}
