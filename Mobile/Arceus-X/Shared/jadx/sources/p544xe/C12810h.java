package p544xe;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import p515we.C12358a0;
import p515we.C12376j0;
import p515we.InterfaceC12378k0;

/* JADX INFO: renamed from: xe.h */
/* JADX INFO: loaded from: classes2.dex */
public class C12810h implements InterfaceC12378k0<InterfaceC12809g, InterfaceC12809g> {

    /* JADX INFO: renamed from: a */
    public static final C12810h f45569a = new C12810h();

    /* JADX INFO: renamed from: xe.h$b */
    public static class b implements InterfaceC12809g {

        /* JADX INFO: renamed from: a */
        public final C12376j0<InterfaceC12809g> f45570a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(C12376j0<InterfaceC12809g> c12376j0) {
            this.f45570a = c12376j0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m47708d() {
        C12358a0.m46226c().m46230e(f45569a);
    }

    @Override // p515we.InterfaceC12378k0
    /* JADX INFO: renamed from: a */
    public Class<InterfaceC12809g> mo7283a() {
        return InterfaceC12809g.class;
    }

    @Override // p515we.InterfaceC12378k0
    /* JADX INFO: renamed from: c */
    public Class<InterfaceC12809g> mo7285c() {
        return InterfaceC12809g.class;
    }

    /* JADX DEBUG: Method merged with bridge method: b(Lwe/j0;)Ljava/lang/Object; */
    @Override // p515we.InterfaceC12378k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC12809g mo7284b(C12376j0<InterfaceC12809g> c12376j0) throws GeneralSecurityException {
        if (c12376j0 == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (c12376j0.m46363d() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator<List<C12376j0.c<InterfaceC12809g>>> it = c12376j0.m46361b().iterator();
        while (it.hasNext()) {
            Iterator<C12376j0.c<InterfaceC12809g>> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().m46374b();
            }
        }
        return new b(c12376j0);
    }
}
