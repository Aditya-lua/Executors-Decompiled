package p515we;

import af.EnumC0220g0;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import pe.C10233n;

/* JADX INFO: renamed from: we.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C12396u {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC12393s.a f44356a = new b(null);

    /* JADX INFO: renamed from: we.u$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44357a;

        static {
            int[] iArr = new int[EnumC0220g0.values().length];
            f44357a = iArr;
            try {
                iArr[EnumC0220g0.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44357a[EnumC0220g0.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44357a[EnumC0220g0.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: we.u$b */
    public static class b implements InterfaceC12393s.a {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
        }

        @Override // p515we.InterfaceC12393s.a
        /* JADX INFO: renamed from: a */
        public void mo46446a(int i10, long j10) {
        }

        @Override // p515we.InterfaceC12393s.a
        /* JADX INFO: renamed from: b */
        public void mo46447b() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: we.u.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: a */
    public static <P> C12395t m46463a(C12376j0<P> c12376j0) {
        C12395t.b bVarM46456a = C12395t.m46456a();
        bVarM46456a.m46460d(c12376j0.m46362c());
        Iterator<List<C12376j0.c<P>>> it = c12376j0.m46361b().iterator();
        while (it.hasNext()) {
            for (C12376j0.c<P> cVar : it.next()) {
                bVarM46456a.m46457a(m46465c(cVar.m46379g()), cVar.m46375c(), m46464b(cVar.m46376d()), cVar.m46378f().name());
            }
        }
        if (c12376j0.m46363d() != null) {
            bVarM46456a.m46461e(c12376j0.m46363d().m46375c());
        }
        try {
            return bVarM46456a.m46458b();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m46464b(String str) {
        return !str.startsWith("type.googleapis.com/google.crypto.") ? str : str.substring(34);
    }

    /* JADX INFO: renamed from: c */
    public static C10233n m46465c(EnumC0220g0 enumC0220g0) {
        int i10 = a.f44357a[enumC0220g0.ordinal()];
        if (i10 == 1) {
            return C10233n.f36833b;
        }
        if (i10 == 2) {
            return C10233n.f36834c;
        }
        if (i10 == 3) {
            return C10233n.f36835d;
        }
        throw new IllegalStateException("Unknown key status");
    }
}
