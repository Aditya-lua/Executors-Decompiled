package p100eb;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: eb.p2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4987p2 extends AbstractC4927f2 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final MessageDigest f19724a;

    /* JADX INFO: renamed from: b */
    public final int f19725b;

    /* JADX INFO: renamed from: c */
    public final boolean f19726c;

    /* JADX INFO: renamed from: d */
    public final String f19727d;

    public C4987p2(String str, String str2) {
        MessageDigest messageDigestM23688a = m23688a("SHA-256");
        this.f19724a = messageDigestM23688a;
        this.f19725b = messageDigestM23688a.getDigestLength();
        this.f19727d = "Hashing.sha256()";
        this.f19726c = m23689b(messageDigestM23688a);
    }

    /* JADX INFO: renamed from: a */
    public static MessageDigest m23688a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m23689b(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final String toString() {
        return this.f19727d;
    }

    @Override // p100eb.InterfaceC4951j2
    public final InterfaceC4957k2 zza() {
        C4975n2 c4975n2 = null;
        if (this.f19726c) {
            try {
                return new C4981o2((MessageDigest) this.f19724a.clone(), this.f19725b, c4975n2);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new C4981o2(m23688a(this.f19724a.getAlgorithm()), this.f19725b, c4975n2);
    }
}
