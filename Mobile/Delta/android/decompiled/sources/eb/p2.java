package eb;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class p2 extends f2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageDigest f15939a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15941d;

    public p2(String str, String str2) {
        MessageDigest messageDigestA = a("SHA-256");
        this.f15939a = messageDigestA;
        this.b = messageDigestA.getDigestLength();
        this.f15941d = "Hashing.sha256()";
        this.f15940c = b(messageDigestA);
    }

    public static MessageDigest a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public static boolean b(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final String toString() {
        return this.f15941d;
    }

    @Override // eb.j2
    public final k2 zza() {
        n2 n2Var = null;
        if (this.f15940c) {
            try {
                return new o2((MessageDigest) this.f15939a.clone(), this.b, n2Var);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new o2(a(this.f15939a.getAlgorithm()), this.b, n2Var);
    }
}
