package xu;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J'\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0016H\u0010¢\u0006\u0004\b(\u0010)J/\u0010-\u001a\u00020,2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b-\u0010.J/\u0010/\u001a\u00020,2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u00100J!\u00102\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u0016H\u0016¢\u0006\u0004\b2\u00103J!\u00104\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u0016H\u0016¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\u0003H\u0010¢\u0006\u0004\b5\u0010\"J\u001a\u00107\u001a\u00020,2\b\u0010*\u001a\u0004\u0018\u000106H\u0096\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0016H\u0016¢\u0006\u0004\b9\u0010 J\u000f\u0010:\u001a\u00020\u000bH\u0016¢\u0006\u0004\b:\u0010\u000fJ\u000f\u0010;\u001a\u00020\u0001H\u0002¢\u0006\u0004\b;\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lxu/o0;", "Lxu/h;", "", "", "segments", "", "directory", "<init>", "([[B[I)V", "Ljava/nio/charset/Charset;", "charset", "", "K", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "a", "()Ljava/lang/String;", "r", "N", "()Lxu/h;", "algorithm", "d", "(Ljava/lang/String;)Lxu/h;", "", "beginIndex", "endIndex", "L", "(II)Lxu/h;", "pos", "", "x", "(I)B", "o", "()I", "O", "()[B", "Lxu/e;", "buffer", "offset", "byteCount", "", "Q", "(Lxu/e;II)V", "other", "otherOffset", "", "C", "(ILxu/h;II)Z", "D", "(I[BII)Z", "fromIndex", "u", "([BI)I", "z", "w", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "T", "f", "[[B", "S", "()[[B", "g", "[I", "R", "()[I", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o0 extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final transient byte[][] segments;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final transient int[] directory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(@NotNull byte[][] segments, @NotNull int[] directory) {
        super(h.f35343e.getData());
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    @Override // xu.h
    public boolean C(int offset, @NotNull h other, int otherOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (offset < 0 || offset > I() - byteCount) {
            return false;
        }
        int i10 = byteCount + offset;
        int iB = yu.g.b(this, offset);
        while (offset < i10) {
            int i11 = iB == 0 ? 0 : getDirectory()[iB - 1];
            int i12 = getDirectory()[iB] - i11;
            int i13 = getDirectory()[getSegments().length + iB];
            int iMin = Math.min(i10, i12 + i11) - offset;
            if (!other.D(otherOffset, getSegments()[iB], i13 + (offset - i11), iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iB++;
        }
        return true;
    }

    @Override // xu.h
    public boolean D(int offset, @NotNull byte[] other, int otherOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (offset < 0 || offset > I() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int i10 = byteCount + offset;
        int iB = yu.g.b(this, offset);
        while (offset < i10) {
            int i11 = iB == 0 ? 0 : getDirectory()[iB - 1];
            int i12 = getDirectory()[iB] - i11;
            int i13 = getDirectory()[getSegments().length + iB];
            int iMin = Math.min(i10, i12 + i11) - offset;
            if (!b.a(getSegments()[iB], i13 + (offset - i11), other, otherOffset, iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iB++;
        }
        return true;
    }

    @Override // xu.h
    @NotNull
    public String K(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return T().K(charset);
    }

    @Override // xu.h
    @NotNull
    public h L(int beginIndex, int endIndex) {
        int iE = b.e(this, endIndex);
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex=" + beginIndex + " < 0").toString());
        }
        if (iE > I()) {
            throw new IllegalArgumentException(("endIndex=" + iE + " > length(" + I() + ')').toString());
        }
        int i10 = iE - beginIndex;
        if (i10 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iE + " < beginIndex=" + beginIndex).toString());
        }
        if (beginIndex == 0 && iE == I()) {
            return this;
        }
        if (beginIndex == iE) {
            return h.f35343e;
        }
        int iB = yu.g.b(this, beginIndex);
        int iB2 = yu.g.b(this, iE - 1);
        byte[][] bArr = (byte[][]) kotlin.collections.l.n(getSegments(), iB, iB2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iB <= iB2) {
            int i11 = iB;
            int i12 = 0;
            while (true) {
                iArr[i12] = Math.min(getDirectory()[i11] - beginIndex, i10);
                int i13 = i12 + 1;
                iArr[i12 + bArr.length] = getDirectory()[getSegments().length + i11];
                if (i11 == iB2) {
                    break;
                }
                i11++;
                i12 = i13;
            }
        }
        int i14 = iB != 0 ? getDirectory()[iB - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (beginIndex - i14);
        return new o0(bArr, iArr);
    }

    @Override // xu.h
    @NotNull
    public h N() {
        return T().N();
    }

    @Override // xu.h
    @NotNull
    public byte[] O() {
        byte[] bArr = new byte[I()];
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = getDirectory()[length + i10];
            int i14 = getDirectory()[i10];
            int i15 = i14 - i11;
            kotlin.collections.l.f(getSegments()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // xu.h
    public void Q(@NotNull e buffer, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i10 = offset + byteCount;
        int iB = yu.g.b(this, offset);
        while (offset < i10) {
            int i11 = iB == 0 ? 0 : getDirectory()[iB - 1];
            int i12 = getDirectory()[iB] - i11;
            int i13 = getDirectory()[getSegments().length + iB];
            int iMin = Math.min(i10, i12 + i11) - offset;
            int i14 = i13 + (offset - i11);
            m0 m0Var = new m0(getSegments()[iB], i14, i14 + iMin, true, false);
            m0 m0Var2 = buffer.head;
            if (m0Var2 == null) {
                m0Var.prev = m0Var;
                m0Var.next = m0Var;
                buffer.head = m0Var;
            } else {
                Intrinsics.checkNotNull(m0Var2);
                m0 m0Var3 = m0Var2.prev;
                Intrinsics.checkNotNull(m0Var3);
                m0Var3.c(m0Var);
            }
            offset += iMin;
            iB++;
        }
        buffer.U(buffer.getSize() + ((long) byteCount));
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

    public final h T() {
        return new h(O());
    }

    @Override // xu.h
    @NotNull
    public String a() {
        return T().a();
    }

    @Override // xu.h
    @NotNull
    public h d(@NotNull String algorithm) throws NoSuchAlgorithmException {
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
        return new h(bArrDigest);
    }

    @Override // xu.h
    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof h) {
            h hVar = (h) other;
            if (hVar.I() == I() && C(0, hVar, 0, I())) {
                return true;
            }
        }
        return false;
    }

    @Override // xu.h
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
        E(i11);
        return i11;
    }

    @Override // xu.h
    public int o() {
        return getDirectory()[getSegments().length - 1];
    }

    @Override // xu.h
    @NotNull
    public String r() {
        return T().r();
    }

    @Override // xu.h
    @NotNull
    public String toString() {
        return T().toString();
    }

    @Override // xu.h
    public int u(@NotNull byte[] other, int fromIndex) {
        Intrinsics.checkNotNullParameter(other, "other");
        return T().u(other, fromIndex);
    }

    @Override // xu.h
    @NotNull
    public byte[] w() {
        return O();
    }

    @Override // xu.h
    public byte x(int pos) {
        b.b(getDirectory()[getSegments().length - 1], pos, 1L);
        int iB = yu.g.b(this, pos);
        return getSegments()[iB][(pos - (iB == 0 ? 0 : getDirectory()[iB - 1])) + getDirectory()[getSegments().length + iB]];
    }

    @Override // xu.h
    public int z(@NotNull byte[] other, int fromIndex) {
        Intrinsics.checkNotNullParameter(other, "other");
        return T().z(other, fromIndex);
    }
}
