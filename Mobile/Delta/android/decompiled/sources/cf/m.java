package cf;

import cf.n;
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
    public static final m<n.e, Mac> f4870c = new m<>(new n.e());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m<n.g, Signature> f4871d = new m<>(new n.g());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m<n.f, MessageDigest> f4872e = new m<>(new n.f());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m<n.b, KeyAgreement> f4873f = new m<>(new n.b());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m<n.d, KeyPairGenerator> f4874g = new m<>(new n.d());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m<n.c, KeyFactory> f4875h = new m<>(new n.c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<JcePrimitiveT> f4876a;

    public static class b<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n<JcePrimitiveT> f4877a;

        @Override // cf.m.e
        public JcePrimitiveT a(String str) {
            Iterator<Provider> it = m.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f4877a.a(str, it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            return this.f4877a.a(str, null);
        }

        public b(n<JcePrimitiveT> nVar) {
            this.f4877a = nVar;
        }
    }

    public static class c<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n<JcePrimitiveT> f4878a;

        @Override // cf.m.e
        public JcePrimitiveT a(String str) {
            return this.f4878a.a(str, null);
        }

        public c(n<JcePrimitiveT> nVar) {
            this.f4878a = nVar;
        }
    }

    public static class d<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n<JcePrimitiveT> f4879a;

        @Override // cf.m.e
        public JcePrimitiveT a(String str) throws GeneralSecurityException {
            Iterator<Provider> it = m.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f4879a.a(str, it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        public d(n<JcePrimitiveT> nVar) {
            this.f4879a = nVar;
        }
    }

    public interface e<JcePrimitiveT> {
        JcePrimitiveT a(String str);
    }

    public m(T_WRAPPER t_wrapper) {
        if (te.b.c()) {
            this.f4876a = new d(t_wrapper);
        } else if (z.c()) {
            this.f4876a = new b(t_wrapper);
        } else {
            this.f4876a = new c(t_wrapper);
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
        return this.f4876a.a(str);
    }
}
