package bf;

import cf.C1650o;
import java.security.GeneralSecurityException;
import p515we.AbstractC12372h0;
import p515we.C12358a0;
import p515we.C12376j0;
import p515we.C12387p;
import p515we.C12396u;
import p515we.C12400y;
import p515we.InterfaceC12378k0;
import p515we.InterfaceC12393s;
import pe.AbstractC10231l;
import pe.InterfaceC10245z;

/* JADX INFO: renamed from: bf.g0 */
/* JADX INFO: loaded from: classes2.dex */
public class C1395g0 implements InterfaceC12378k0<InterfaceC10245z, InterfaceC10245z> {

    /* JADX INFO: renamed from: a */
    public static final C1395g0 f5472a = new C1395g0();

    /* JADX INFO: renamed from: b */
    public static final AbstractC12372h0<C12387p, InterfaceC10245z> f5473b = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: bf.f0
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C1650o.m8298b((C12387p) abstractC10231l);
        }
    }, C12387p.class, InterfaceC10245z.class);

    /* JADX INFO: renamed from: bf.g0$a */
    public static class a implements InterfaceC10245z {

        /* JADX INFO: renamed from: a */
        public final C12376j0<InterfaceC10245z> f5474a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC12393s.a f5475b;

        public a(C12376j0<InterfaceC10245z> c12376j0) {
            this.f5474a = c12376j0;
            if (c12376j0.m46367h()) {
                this.f5475b = C12400y.m46475b().m46476a().mo46445a(C12396u.m46463a(c12376j0), "public_key_sign", "sign");
            } else {
                this.f5475b = C12396u.f44356a;
            }
        }

        @Override // pe.InterfaceC10245z
        /* JADX INFO: renamed from: a */
        public byte[] mo7287a(byte[] bArr) throws GeneralSecurityException {
            try {
                byte[] bArrMo7287a = this.f5474a.m46363d().m46374b().mo7287a(bArr);
                this.f5475b.mo46446a(this.f5474a.m46363d().m46375c(), bArr.length);
                return bArrMo7287a;
            } catch (GeneralSecurityException e10) {
                this.f5475b.mo46447b();
                throw e10;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m7282d() {
        C12358a0.m46226c().m46230e(f5472a);
        C12358a0.m46226c().m46229d(f5473b);
    }

    @Override // p515we.InterfaceC12378k0
    /* JADX INFO: renamed from: a */
    public Class<InterfaceC10245z> mo7283a() {
        return InterfaceC10245z.class;
    }

    @Override // p515we.InterfaceC12378k0
    /* JADX INFO: renamed from: c */
    public Class<InterfaceC10245z> mo7285c() {
        return InterfaceC10245z.class;
    }

    /* JADX DEBUG: Method merged with bridge method: b(Lwe/j0;)Ljava/lang/Object; */
    @Override // p515we.InterfaceC12378k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC10245z mo7284b(C12376j0<InterfaceC10245z> c12376j0) {
        return new a(c12376j0);
    }
}
