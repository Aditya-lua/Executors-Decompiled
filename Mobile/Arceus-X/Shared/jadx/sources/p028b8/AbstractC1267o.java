package p028b8;

import android.util.Base64;
import p569y7.EnumC13118e;

/* JADX INFO: renamed from: b8.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1267o {

    /* JADX INFO: renamed from: b8.o$a */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract AbstractC1267o mo7010a();

        /* JADX INFO: renamed from: b */
        public abstract a mo7011b(String str);

        /* JADX INFO: renamed from: c */
        public abstract a mo7012c(byte[] bArr);

        /* JADX INFO: renamed from: d */
        public abstract a mo7013d(EnumC13118e enumC13118e);
    }

    /* JADX INFO: renamed from: a */
    public static a m7040a() {
        return new C1256d.b().mo7013d(EnumC13118e.DEFAULT);
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo7007b();

    /* JADX INFO: renamed from: c */
    public abstract byte[] mo7008c();

    /* JADX INFO: renamed from: d */
    public abstract EnumC13118e mo7009d();

    /* JADX INFO: renamed from: e */
    public boolean m7041e() {
        return mo7008c() != null;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC1267o m7042f(EnumC13118e enumC13118e) {
        return m7040a().mo7011b(mo7007b()).mo7013d(enumC13118e).mo7012c(mo7008c()).mo7010a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", mo7007b(), mo7009d(), mo7008c() == null ? "" : Base64.encodeToString(mo7008c(), 2));
    }
}
