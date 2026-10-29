package p076df;

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
import p076df.InterfaceC4592n;
import p465ue.C11844b;

/* JADX INFO: renamed from: df.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C4591m<T_WRAPPER extends InterfaceC4592n<JcePrimitiveT>, JcePrimitiveT> {

    /* JADX INFO: renamed from: b */
    public static final C4591m<InterfaceC4592n.a, Cipher> f18797b = new C4591m<>(new InterfaceC4592n.a());

    /* JADX INFO: renamed from: c */
    public static final C4591m<InterfaceC4592n.e, Mac> f18798c = new C4591m<>(new InterfaceC4592n.e());

    /* JADX INFO: renamed from: d */
    public static final C4591m<InterfaceC4592n.g, Signature> f18799d = new C4591m<>(new InterfaceC4592n.g());

    /* JADX INFO: renamed from: e */
    public static final C4591m<InterfaceC4592n.f, MessageDigest> f18800e = new C4591m<>(new InterfaceC4592n.f());

    /* JADX INFO: renamed from: f */
    public static final C4591m<InterfaceC4592n.b, KeyAgreement> f18801f = new C4591m<>(new InterfaceC4592n.b());

    /* JADX INFO: renamed from: g */
    public static final C4591m<InterfaceC4592n.d, KeyPairGenerator> f18802g = new C4591m<>(new InterfaceC4592n.d());

    /* JADX INFO: renamed from: h */
    public static final C4591m<InterfaceC4592n.c, KeyFactory> f18803h = new C4591m<>(new InterfaceC4592n.c());

    /* JADX INFO: renamed from: a */
    public final e<JcePrimitiveT> f18804a;

    /* JADX INFO: renamed from: df.m$b */
    public static class b<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC4592n<JcePrimitiveT> f18805a;

        @Override // p076df.C4591m.e
        /* JADX INFO: renamed from: a */
        public JcePrimitiveT mo22700a(String str) {
            Iterator<Provider> it = C4591m.m22698b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f18805a.mo22701a(str, it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            return this.f18805a.mo22701a(str, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(InterfaceC4592n<JcePrimitiveT> interfaceC4592n) {
            this.f18805a = interfaceC4592n;
        }
    }

    /* JADX INFO: renamed from: df.m$c */
    public static class c<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC4592n<JcePrimitiveT> f18806a;

        @Override // p076df.C4591m.e
        /* JADX INFO: renamed from: a */
        public JcePrimitiveT mo22700a(String str) {
            return this.f18806a.mo22701a(str, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(InterfaceC4592n<JcePrimitiveT> interfaceC4592n) {
            this.f18806a = interfaceC4592n;
        }
    }

    /* JADX INFO: renamed from: df.m$d */
    public static class d<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC4592n<JcePrimitiveT> f18807a;

        @Override // p076df.C4591m.e
        /* JADX INFO: renamed from: a */
        public JcePrimitiveT mo22700a(String str) throws GeneralSecurityException {
            Iterator<Provider> it = C4591m.m22698b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f18807a.mo22701a(str, it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public d(InterfaceC4592n<JcePrimitiveT> interfaceC4592n) {
            this.f18807a = interfaceC4592n;
        }
    }

    /* JADX INFO: renamed from: df.m$e */
    public interface e<JcePrimitiveT> {
        /* JADX INFO: renamed from: a */
        JcePrimitiveT mo22700a(String str);
    }

    public C4591m(T_WRAPPER t_wrapper) {
        if (C11844b.m44242c()) {
            this.f18804a = new d(t_wrapper);
        } else if (C4604z.m22740c()) {
            this.f18804a = new b(t_wrapper);
        } else {
            this.f18804a = new c(t_wrapper);
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<Provider> m22698b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public JcePrimitiveT m22699a(String str) {
        return this.f18804a.mo22700a(str);
    }
}
