package p076df;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: renamed from: df.n */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4592n<T> {

    /* JADX INFO: renamed from: df.n$a */
    public static class a implements InterfaceC4592n<Cipher> {
        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object; */
        @Override // p076df.InterfaceC4592n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Cipher mo22701a(String str, Provider provider) {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        }
    }

    /* JADX INFO: renamed from: df.n$b */
    public static class b implements InterfaceC4592n<KeyAgreement> {
        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object; */
        @Override // p076df.InterfaceC4592n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public KeyAgreement mo22701a(String str, Provider provider) {
            return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
        }
    }

    /* JADX INFO: renamed from: df.n$c */
    public static class c implements InterfaceC4592n<KeyFactory> {
        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object; */
        @Override // p076df.InterfaceC4592n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public KeyFactory mo22701a(String str, Provider provider) {
            return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
        }
    }

    /* JADX INFO: renamed from: df.n$d */
    public static class d implements InterfaceC4592n<KeyPairGenerator> {
        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object; */
        @Override // p076df.InterfaceC4592n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public KeyPairGenerator mo22701a(String str, Provider provider) {
            return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
        }
    }

    /* JADX INFO: renamed from: df.n$e */
    public static class e implements InterfaceC4592n<Mac> {
        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object; */
        @Override // p076df.InterfaceC4592n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Mac mo22701a(String str, Provider provider) {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    /* JADX INFO: renamed from: df.n$f */
    public static class f implements InterfaceC4592n<MessageDigest> {
        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object; */
        @Override // p076df.InterfaceC4592n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MessageDigest mo22701a(String str, Provider provider) {
            return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    /* JADX INFO: renamed from: df.n$g */
    public static class g implements InterfaceC4592n<Signature> {
        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object; */
        @Override // p076df.InterfaceC4592n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Signature mo22701a(String str, Provider provider) {
            return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    /* JADX INFO: renamed from: a */
    T mo22701a(String str, Provider provider);
}
