package c8;

import android.util.Base64;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(z7.e eVar);
    }

    public static a a() {
        return new d.b().d(z7.e.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract z7.e d();

    public boolean e() {
        return c() != null;
    }

    public o f(z7.e eVar) {
        return a().b(b()).d(eVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? BuildConfig.FLAVOR : Base64.encodeToString(c(), 2));
    }
}
