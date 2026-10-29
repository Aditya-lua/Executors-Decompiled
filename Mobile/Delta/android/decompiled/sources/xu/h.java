package xu;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0016\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0010J#\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0018H\u0087\u0002¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\u0018H\u0010¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0003H\u0010¢\u0006\u0004\b'\u0010&J'\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0010¢\u0006\u0004\b-\u0010.J/\u00102\u001a\u0002012\u0006\u0010*\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0016¢\u0006\u0004\b2\u00103J/\u00104\u001a\u0002012\u0006\u0010*\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u0002012\u0006\u00106\u001a\u00020\u0000¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u0002012\u0006\u00109\u001a\u00020\u0000¢\u0006\u0004\b:\u00108J!\u0010<\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00002\b\b\u0002\u0010;\u001a\u00020\u0018H\u0007¢\u0006\u0004\b<\u0010=J!\u0010>\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u0018H\u0017¢\u0006\u0004\b>\u0010?J!\u0010@\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00002\b\b\u0002\u0010;\u001a\u00020\u0018H\u0007¢\u0006\u0004\b@\u0010=J!\u0010A\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u0018H\u0017¢\u0006\u0004\bA\u0010?J\u001a\u0010C\u001a\u0002012\b\u0010/\u001a\u0004\u0018\u00010BH\u0096\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0018H\u0016¢\u0006\u0004\bE\u0010$J\u0018\u0010F\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0007H\u0016¢\u0006\u0004\bH\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bJ\u0010&R\"\u0010E\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010K\u001a\u0004\bL\u0010$\"\u0004\bM\u0010NR$\u0010T\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010\t\"\u0004\bR\u0010SR\u0011\u0010U\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\bK\u0010$¨\u0006V"}, d2 = {"Lxu/h;", "Ljava/io/Serializable;", "", "", "data", "<init>", "([B)V", "", "P", "()Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "K", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "a", "B", "()Lxu/h;", "G", "H", "algorithm", "d", "(Ljava/lang/String;)Lxu/h;", "r", "N", "", "beginIndex", "endIndex", "L", "(II)Lxu/h;", "pos", "", "x", "(I)B", "index", "j", "o", "()I", "O", "()[B", "w", "Lxu/e;", "buffer", "offset", "byteCount", "", "Q", "(Lxu/e;II)V", "other", "otherOffset", "", "C", "(ILxu/h;II)Z", "D", "(I[BII)Z", "prefix", "J", "(Lxu/h;)Z", "suffix", "h", "fromIndex", "s", "(Lxu/h;I)I", "u", "([BI)I", "y", "z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "b", "(Lxu/h;)I", "toString", "[B", "l", "I", "n", "E", "(I)V", "c", "Ljava/lang/String;", "q", "F", "(Ljava/lang/String;)V", "utf8", "size", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class h implements Serializable, Comparable<h> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final h f35343e = new h(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public transient int hashCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public transient String utf8;

    /* JADX INFO: renamed from: xu.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00020\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0007*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u0007*\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0007*\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0011J\u0013\u0010\u0017\u001a\u00020\u0007*\u00020\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lxu/h$a;", "", "<init>", "()V", "", "", "data", "Lxu/h;", "e", "([B)Lxu/h;", "", "offset", "byteCount", "f", "([BII)Lxu/h;", "", "d", "(Ljava/lang/String;)Lxu/h;", "Ljava/nio/charset/Charset;", "charset", "c", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lxu/h;", "a", "b", "", "serialVersionUID", "J", "EMPTY", "Lxu/h;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ h g(Companion companion, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = b.c();
            }
            return companion.f(bArr, i10, i11);
        }

        @Nullable
        public final h a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] bArrA = a.a(str);
            if (bArrA != null) {
                return new h(bArrA);
            }
            return null;
        }

        @NotNull
        public final h b(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((yu.c.b(str.charAt(i11)) << 4) + yu.c.b(str.charAt(i11 + 1)));
            }
            return new h(bArr);
        }

        @NotNull
        public final h c(@NotNull String str, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return new h(bytes);
        }

        @NotNull
        public final h d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            h hVar = new h(v0.a(str));
            hVar.F(str);
            return hVar;
        }

        @NotNull
        public final h e(@NotNull byte... data) {
            Intrinsics.checkNotNullParameter(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            return new h(bArrCopyOf);
        }

        @NotNull
        public final h f(@NotNull byte[] bArr, int i10, int i11) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int iF = b.f(bArr, i11);
            b.b(bArr.length, i10, iF);
            return new h(kotlin.collections.l.m(bArr, i10, iF + i10));
        }

        public Companion() {
        }
    }

    public h(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public static /* synthetic */ int A(h hVar, h hVar2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = b.c();
        }
        return hVar.y(hVar2, i10);
    }

    public static /* synthetic */ h M(h hVar, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = b.c();
        }
        return hVar.L(i10, i11);
    }

    @NotNull
    public static final h c(@NotNull String str) {
        return INSTANCE.b(str);
    }

    @NotNull
    public static final h e(@NotNull String str) {
        return INSTANCE.d(str);
    }

    public static /* synthetic */ int v(h hVar, h hVar2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return hVar.s(hVar2, i10);
    }

    @NotNull
    public final h B() {
        return d("MD5");
    }

    public boolean C(int offset, @NotNull h other, int otherOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.D(otherOffset, getData(), offset, byteCount);
    }

    public boolean D(int offset, @NotNull byte[] other, int otherOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(other, "other");
        return offset >= 0 && offset <= getData().length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && b.a(getData(), offset, other, otherOffset, byteCount);
    }

    public final void E(int i10) {
        this.hashCode = i10;
    }

    public final void F(@Nullable String str) {
        this.utf8 = str;
    }

    @NotNull
    public final h G() {
        return d("SHA-1");
    }

    @NotNull
    public final h H() {
        return d("SHA-256");
    }

    public final int I() {
        return o();
    }

    public final boolean J(@NotNull h prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return C(0, prefix, 0, prefix.I());
    }

    @NotNull
    public String K(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(this.data, charset);
    }

    @NotNull
    public h L(int beginIndex, int endIndex) {
        int iE = b.e(this, endIndex);
        if (beginIndex < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iE <= getData().length) {
            if (iE - beginIndex >= 0) {
                return (beginIndex == 0 && iE == getData().length) ? this : new h(kotlin.collections.l.m(getData(), beginIndex, iE));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + getData().length + ')').toString());
    }

    @NotNull
    public h N() {
        for (int i10 = 0; i10 < getData().length; i10++) {
            byte b = getData()[i10];
            if (b >= 65 && b <= 90) {
                byte[] data = getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b10 = bArrCopyOf[i11];
                    if (b10 >= 65 && b10 <= 90) {
                        bArrCopyOf[i11] = (byte) (b10 + 32);
                    }
                }
                return new h(bArrCopyOf);
            }
        }
        return this;
    }

    @NotNull
    public byte[] O() {
        byte[] data = getData();
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @NotNull
    public String P() {
        String utf8 = getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        String strC = v0.c(w());
        F(strC);
        return strC;
    }

    public void Q(@NotNull e buffer, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        yu.b.c(this, buffer, offset, byteCount);
    }

    @NotNull
    public String a() {
        return a.c(getData(), null, 1, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull h other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int I = I();
        int I2 = other.I();
        int iMin = Math.min(I, I2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iJ = j(i10) & 255;
            int iJ2 = other.j(i10) & 255;
            if (iJ != iJ2) {
                return iJ < iJ2 ? -1 : 1;
            }
        }
        if (I == I2) {
            return 0;
        }
        return I < I2 ? -1 : 1;
    }

    @NotNull
    public h d(@NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, I());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        return new h(bArrDigest);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof h) {
            h hVar = (h) other;
            if (hVar.I() == getData().length && hVar.D(0, getData(), 0, getData().length)) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(@NotNull h suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return C(I() - suffix.I(), suffix, 0, suffix.I());
    }

    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int iHashCode = Arrays.hashCode(getData());
        E(iHashCode);
        return iHashCode;
    }

    public final byte j(int index) {
        return x(index);
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getHashCode() {
        return this.hashCode;
    }

    public int o() {
        return getData().length;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getUtf8() {
        return this.utf8;
    }

    @NotNull
    public String r() {
        char[] cArr = new char[getData().length * 2];
        int i10 = 0;
        for (byte b : getData()) {
            int i11 = i10 + 1;
            cArr[i10] = yu.b.d()[(b >> 4) & 15];
            i10 += 2;
            cArr[i11] = yu.b.d()[b & 15];
        }
        return kotlin.text.x.v(cArr);
    }

    public final int s(@NotNull h other, int fromIndex) {
        Intrinsics.checkNotNullParameter(other, "other");
        return u(other.w(), fromIndex);
    }

    @NotNull
    public String toString() {
        if (getData().length == 0) {
            return "[size=0]";
        }
        int iB = yu.b.b(getData(), 64);
        if (iB != -1) {
            String strP = P();
            String strSubstring = strP.substring(0, iB);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strN = kotlin.text.x.N(kotlin.text.x.N(kotlin.text.x.N(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iB >= strP.length()) {
                return "[text=" + strN + ']';
            }
            return "[size=" + getData().length + " text=" + strN + "…]";
        }
        if (getData().length <= 64) {
            return "[hex=" + r() + ']';
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(getData().length);
        sb2.append(" hex=");
        int iE = b.e(this, 64);
        if (iE <= getData().length) {
            if (iE < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb2.append((iE == getData().length ? this : new h(kotlin.collections.l.m(getData(), 0, iE))).r());
            sb2.append("…]");
            return sb2.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + getData().length + ')').toString());
    }

    public int u(@NotNull byte[] other, int fromIndex) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = getData().length - other.length;
        int iMax = Math.max(fromIndex, 0);
        if (iMax > length) {
            return -1;
        }
        while (!b.a(getData(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    @NotNull
    public byte[] w() {
        return getData();
    }

    public byte x(int pos) {
        return getData()[pos];
    }

    public final int y(@NotNull h other, int fromIndex) {
        Intrinsics.checkNotNullParameter(other, "other");
        return z(other.w(), fromIndex);
    }

    public int z(@NotNull byte[] other, int fromIndex) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int iMin = Math.min(b.e(this, fromIndex), getData().length - other.length); -1 < iMin; iMin--) {
            if (b.a(getData(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }
}
