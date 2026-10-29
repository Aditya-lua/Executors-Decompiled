package ve;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s.a f33020a = new b(null);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33021a;

        static {
            int[] iArr = new int[ze.g0.values().length];
            f33021a = iArr;
            try {
                iArr[ze.g0.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33021a[ze.g0.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33021a[ze.g0.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b implements s.a {
        public b() {
        }

        @Override // ve.s.a
        public void a(int i10, long j10) {
        }

        @Override // ve.s.a
        public void b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static <P> t a(j0<P> j0Var) {
        t.b bVarA = t.a();
        bVarA.d(j0Var.c());
        Iterator<List<j0.c<P>>> it = j0Var.b().iterator();
        while (it.hasNext()) {
            for (j0.c<P> cVar : it.next()) {
                bVarA.a(c(cVar.g()), cVar.c(), b(cVar.d()), cVar.f().name());
            }
        }
        if (j0Var.d() != null) {
            bVarA.e(j0Var.d().c());
        }
        try {
            return bVarA.b();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static String b(String str) {
        return !str.startsWith("type.googleapis.com/google.crypto.") ? str : str.substring(34);
    }

    public static oe.n c(ze.g0 g0Var) {
        int i10 = a.f33021a[g0Var.ordinal()];
        if (i10 == 1) {
            return oe.n.b;
        }
        if (i10 == 2) {
            return oe.n.f27349c;
        }
        if (i10 == 3) {
            return oe.n.f27350d;
        }
        throw new IllegalStateException("Unknown key status");
    }
}
