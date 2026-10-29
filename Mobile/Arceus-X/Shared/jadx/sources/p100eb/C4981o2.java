package p100eb;

import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: renamed from: eb.o2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4981o2 extends AbstractC4921e2 {

    /* JADX INFO: renamed from: b */
    public final MessageDigest f19709b;

    /* JADX INFO: renamed from: c */
    public final int f19710c;

    /* JADX INFO: renamed from: d */
    public boolean f19711d;

    public /* synthetic */ C4981o2(MessageDigest messageDigest, int i10, C4975n2 c4975n2) {
        this.f19709b = messageDigest;
        this.f19710c = i10;
    }

    @Override // p100eb.AbstractC4921e2
    /* JADX INFO: renamed from: b */
    public final void mo23578b(byte[] bArr, int i10, int i11) {
        m23685c();
        this.f19709b.update(bArr, 0, i11);
    }

    /* JADX INFO: renamed from: c */
    public final void m23685c() {
        C4973n0.m23682f(!this.f19711d, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // p100eb.InterfaceC4957k2
    public final AbstractC4945i2 zzc() {
        m23685c();
        this.f19711d = true;
        int i10 = this.f19710c;
        if (i10 == this.f19709b.getDigestLength()) {
            byte[] bArrDigest = this.f19709b.digest();
            char[] cArr = AbstractC4945i2.f19669a;
            return new C4939h2(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.f19709b.digest(), i10);
        char[] cArr2 = AbstractC4945i2.f19669a;
        return new C4939h2(bArrCopyOf);
    }
}
