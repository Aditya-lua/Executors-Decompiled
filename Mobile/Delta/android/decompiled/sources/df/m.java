package df;

import df.n;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class m<T_WRAPPER extends n<JcePrimitiveT>, JcePrimitiveT> {
    public static final m<n.a, Cipher> b = new m<>(new n.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m<n.e, Mac> f14708c = new m<>(new n.e());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m<n.g, Signature> f14709d = new m<>(new n.g());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m<n.f, MessageDigest> f14710e = new m<>(new n.f());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m<n.b, KeyAgreement> f14711f = new m<>(new n.b());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m<n.d, KeyPairGenerator> f14712g = new m<>(new n.d());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m<n.c, KeyFactory> f14713h = new m<>(new n.c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<JcePrimitiveT> f14714a;

    public static class b<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n<JcePrimitiveT> f14715a;

        @Override // df.m.e
        public JcePrimitiveT a(String str) {
            Iterator<Provider> it = m.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f14715a.a(str, it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            return this.f14715a.a(str, null);
        }

        public b(n<JcePrimitiveT> nVar) {
            this.f14715a = nVar;
        }
    }

    public static class c<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n<JcePrimitiveT> f14716a;

        @Override // df.m.e
        public JcePrimitiveT a(String str) {
            return this.f14716a.a(str, null);
        }

        public c(n<JcePrimitiveT> nVar) {
            this.f14716a = nVar;
        }
    }

    public static class d<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n<JcePrimitiveT> f14717a;

        @Override // df.m.e
        public JcePrimitiveT a(String str) throws GeneralSecurityException {
            Iterator<Provider> it = m.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f14717a.a(str, it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        public d(n<JcePrimitiveT> nVar) {
            this.f14717a = nVar;
        }
    }

    public interface e<JcePrimitiveT> {
        JcePrimitiveT a(String str);
    }

    public m(T_WRAPPER t_wrapper) {
        if (ue.b.c()) {
            this.f14714a = new d(t_wrapper);
        } else if (z.c()) {
            this.f14714a = new b(t_wrapper);
        } else {
            this.f14714a = new c(t_wrapper);
        }
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public JcePrimitiveT a(String str) {
        return this.f14714a.a(str);
    }
}
