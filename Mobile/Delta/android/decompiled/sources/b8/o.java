package b8;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(y7.e eVar);
    }

    public static a a() {
        return new d.b().d(y7.e.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract y7.e d();

    public boolean e() {
        return c() != null;
    }

    public o f(y7.e eVar) {
        return a().b(b()).d(eVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
