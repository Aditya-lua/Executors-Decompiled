package p560xu;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.collections.C7691l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p588yu.C13458g;

/* JADX INFO: renamed from: xu.o0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J'\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0016H\u0010¢\u0006\u0004\b(\u0010)J/\u0010-\u001a\u00020,2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b-\u0010.J/\u0010/\u001a\u00020,2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u00100J!\u00102\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u0016H\u0016¢\u0006\u0004\b2\u00103J!\u00104\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u0016H\u0016¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\u0003H\u0010¢\u0006\u0004\b5\u0010\"J\u001a\u00107\u001a\u00020,2\b\u0010*\u001a\u0004\u0018\u000106H\u0096\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0016H\u0016¢\u0006\u0004\b9\u0010 J\u000f\u0010:\u001a\u00020\u000bH\u0016¢\u0006\u0004\b:\u0010\u000fJ\u000f\u0010;\u001a\u00020\u0001H\u0002¢\u0006\u0004\b;\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006D"}, m31665d2 = {"Lxu/o0;", "Lxu/h;", "", "", "segments", "", "directory", "<init>", "([[B[I)V", "Ljava/nio/charset/Charset;", "charset", "", "K", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "a", "()Ljava/lang/String;", "r", "N", "()Lxu/h;", "algorithm", "d", "(Ljava/lang/String;)Lxu/h;", "", "beginIndex", "endIndex", "L", "(II)Lxu/h;", "pos", "", "x", "(I)B", "o", "()I", "O", "()[B", "Lxu/e;", "buffer", "offset", "byteCount", "", "Q", "(Lxu/e;II)V", "other", "otherOffset", "", "C", "(ILxu/h;II)Z", "D", "(I[BII)Z", "fromIndex", "u", "([BI)I", "z", "w", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "T", "f", "[[B", "S", "()[[B", "g", "[I", "R", "()[I", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12945o0 extends C12930h {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final transient byte[][] segments;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final transient int[] directory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12945o0(@NotNull byte[][] segments, @NotNull int[] directory) {
        super(C12930h.f45830e.getData());
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    @Override // p560xu.C12930h
    /* JADX INFO: renamed from: C */
    public boolean mo48083C(int offset, @NotNull C12930h other, int otherOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (offset < 0 || offset > m48089I() - byteCount) {
            return false;
        }
        int i10 = byteCount + offset;
        int iM49100b = C13458g.m49100b(this, offset);
        while (offset < i10) {
            int i11 = iM49100b == 0 ? 0 : getDirectory()[iM49100b - 1];
            int i12 = getDirectory()[iM49100b] - i11;
            int i13 = getDirectory()[getSegments().length + iM49100b];
            int iMin = Math.min(i10, i12 + i11) - offset;
            if (!other.mo48084D(otherOffset, getSegments()[iM49100b], i13 + (offset - i11), iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iM49100b++;
        }
        return true;
    }

    @Override // p560xu.C12930h
    /* JADX INFO: renamed from: D */
    public boolean mo48084D(int offset, @NotNull byte[] other, int otherOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (offset < 0 || offset > m48089I() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int i10 = byteCount + offset;
        int iM49100b = C13458g.m49100b(this, offset);
        while (offset < i10) {
            int i11 = iM49100b == 0 ? 0 : getDirectory()[iM49100b - 1];
            int i12 = getDirectory()[iM49100b] - i11;
            int i13 = getDirectory()[getSegments().length + iM49100b];
            int iMin = Math.min(i10, i12 + i11) - offset;
            if (!C12918b.m47947a(getSegments()[iM49100b], i13 + (offset - i11), other, otherOffset, iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iM49100b++;
        }
        return true;
    }

    @Override // p560xu.C12930h
    @NotNull
    /* JADX INFO: renamed from: K */
    public String mo48091K(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return m48183T().mo48091K(charset);
    }

    @Override // p560xu.C12930h
    @NotNull
    /* JADX INFO: renamed from: L */
    public C12930h mo48092L(int beginIndex, int endIndex) {
        int iM47951e = C12918b.m47951e(this, endIndex);
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex=" + beginIndex + " < 0").toString());
        }
        if (iM47951e > m48089I()) {
            throw new IllegalArgumentException(("endIndex=" + iM47951e + " > length(" + m48089I() + ')').toString());
        }
        int i10 = iM47951e - beginIndex;
        if (i10 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iM47951e + " < beginIndex=" + beginIndex).toString());
        }
        if (beginIndex == 0 && iM47951e == m48089I()) {
            return this;
        }
        if (beginIndex == iM47951e) {
            return C12930h.f45830e;
        }
        int iM49100b = C13458g.m49100b(this, beginIndex);
        int iM49100b2 = C13458g.m49100b(this, iM47951e - 1);
        byte[][] bArr = (byte[][]) C7691l.m31819n(getSegments(), iM49100b, iM49100b2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iM49100b <= iM49100b2) {
            int i11 = iM49100b;
            int i12 = 0;
            while (true) {
                iArr[i12] = Math.min(getDirectory()[i11] - beginIndex, i10);
                int i13 = i12 + 1;
                iArr[i12 + bArr.length] = getDirectory()[getSegments().length + i11];
                if (i11 == iM49100b2) {
                    break;
                }
                i11++;
                i12 = i13;
            }
        }
        int i14 = iM49100b != 0 ? getDirectory()[iM49100b - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (beginIndex - i14);
        return new C12945o0(bArr, iArr);
    }

    @Override // p560xu.C12930h
    @NotNull
    /* JADX INFO: renamed from: N */
    public C12930h mo48093N() {
        return m48183T().mo48093N();
    }

    @Override // p560xu.C12930h
    @NotNull
    /* JADX INFO: renamed from: O */
    public byte[] mo48094O() {
        byte[] bArr = new byte[m48089I()];
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = getDirectory()[length + i10];
            int i14 = getDirectory()[i10];
            int i15 = i14 - i11;
            C7691l.m31811f(getSegments()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // p560xu.C12930h
    /* JADX INFO: renamed from: Q */
    public void mo48096Q(@NotNull C12924e buffer, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i10 = offset + byteCount;
        int iM49100b = C13458g.m49100b(this, offset);
        while (offset < i10) {
            int i11 = iM49100b == 0 ? 0 : getDirectory()[iM49100b - 1];
            int i12 = getDirectory()[iM49100b] - i11;
            int i13 = getDirectory()[getSegments().length + iM49100b];
            int iMin = Math.min(i10, i12 + i11) - offset;
            int i14 = i13 + (offset - i11);
            C12941m0 c12941m0 = new C12941m0(getSegments()[iM49100b], i14, i14 + iMin, true, false);
            C12941m0 c12941m1 = buffer.head;
            if (c12941m1 == null) {
                c12941m0.prev = c12941m0;
                c12941m0.next = c12941m0;
                buffer.head = c12941m0;
            } else {
                Intrinsics.checkNotNull(c12941m1);
                C12941m0 c12941m2 = c12941m1.prev;
                Intrinsics.checkNotNull(c12941m2);
                c12941m2.m48172c(c12941m0);
            }
            offset += iMin;
            iM49100b++;
        }
        buffer.m48010U(buffer.getSize() + ((long) byteCount));
    }

    @NotNull
    /* JADX INFO: renamed from: R, reason: from getter */
    public final int[] getDirectory() {
        return this.directory;
    }

    @NotNull
    /* JADX INFO: renamed from: S, reason: from getter */
    public final byte[][] getSegments() {
        return this.segments;
    }

    /* JADX INFO: renamed from: T */
    public final C12930h m48183T() {
        return new C12930h(mo48094O());
    }

    @Override // p560xu.C12930h
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo48097a() {
        return m48183T().mo48097a();
    }

    @Override // p560xu.C12930h
    @NotNull
    /* JADX INFO: renamed from: d */
    public C12930h mo48099d(@NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = getDirectory()[length + i10];
            int i13 = getDirectory()[i10];
            messageDigest.update(getSegments()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        return new C12930h(bArrDigest);
    }

    @Override // p560xu.C12930h
    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof C12930h) {
            C12930h c12930h = (C12930h) other;
            if (c12930h.m48089I() == m48089I() && mo48083C(0, c12930h, 0, m48089I())) {
                return true;
            }
        }
        return false;
    }

    @Override // p560xu.C12930h
    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = getDirectory()[length + i10];
            int i14 = getDirectory()[i10];
            byte[] bArr = getSegments()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        m48085E(i11);
        return i11;
    }

    @Override // p560xu.C12930h
    /* JADX INFO: renamed from: o */
    public int mo48104o() {
        return getDirectory()[getSegments().length - 1];
    }

    @Override // p560xu.C12930h
    @NotNull
    /* JADX INFO: renamed from: r */
    public String mo48106r() {
        return m48183T().mo48106r();
    }

    @Override // p560xu.C12930h
    @NotNull
    public String toString() {
        return m48183T().toString();
    }

    @Override // p560xu.C12930h
    /* JADX INFO: renamed from: u */
    public int mo48108u(@NotNull byte[] other, int fromIndex) {
        Intrinsics.checkNotNullParameter(other, "other");
        return m48183T().mo48108u(other, fromIndex);
    }

    @Override // p560xu.C12930h
    @NotNull
    /* JADX INFO: renamed from: w */
    public byte[] mo48109w() {
        return mo48094O();
    }

    @Override // p560xu.C12930h
    /* JADX INFO: renamed from: x */
    public byte mo48110x(int pos) {
        C12918b.m47948b(getDirectory()[getSegments().length - 1], pos, 1L);
        int iM49100b = C13458g.m49100b(this, pos);
        return getSegments()[iM49100b][(pos - (iM49100b == 0 ? 0 : getDirectory()[iM49100b - 1])) + getDirectory()[getSegments().length + iM49100b]];
    }

    @Override // p560xu.C12930h
    /* JADX INFO: renamed from: z */
    public int mo48112z(@NotNull byte[] other, int fromIndex) {
        Intrinsics.checkNotNullParameter(other, "other");
        return m48183T().mo48112z(other, fromIndex);
    }
}
