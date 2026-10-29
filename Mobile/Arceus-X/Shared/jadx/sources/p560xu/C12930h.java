package p560xu;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C7691l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p588yu.C13453b;
import p588yu.C13454c;

/* JADX INFO: renamed from: xu.h */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0016\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0010J#\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0018H\u0087\u0002¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\u0018H\u0010¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0003H\u0010¢\u0006\u0004\b'\u0010&J'\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0010¢\u0006\u0004\b-\u0010.J/\u00102\u001a\u0002012\u0006\u0010*\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0016¢\u0006\u0004\b2\u00103J/\u00104\u001a\u0002012\u0006\u0010*\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0016¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u0002012\u0006\u00106\u001a\u00020\u0000¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u0002012\u0006\u00109\u001a\u00020\u0000¢\u0006\u0004\b:\u00108J!\u0010<\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00002\b\b\u0002\u0010;\u001a\u00020\u0018H\u0007¢\u0006\u0004\b<\u0010=J!\u0010>\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u0018H\u0017¢\u0006\u0004\b>\u0010?J!\u0010@\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00002\b\b\u0002\u0010;\u001a\u00020\u0018H\u0007¢\u0006\u0004\b@\u0010=J!\u0010A\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u0018H\u0017¢\u0006\u0004\bA\u0010?J\u001a\u0010C\u001a\u0002012\b\u0010/\u001a\u0004\u0018\u00010BH\u0096\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0018H\u0016¢\u0006\u0004\bE\u0010$J\u0018\u0010F\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0007H\u0016¢\u0006\u0004\bH\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bJ\u0010&R\"\u0010E\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010K\u001a\u0004\bL\u0010$\"\u0004\bM\u0010NR$\u0010T\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010\t\"\u0004\bR\u0010SR\u0011\u0010U\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\bK\u0010$¨\u0006V"}, m31665d2 = {"Lxu/h;", "Ljava/io/Serializable;", "", "", "data", "<init>", "([B)V", "", "P", "()Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "K", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "a", "B", "()Lxu/h;", "G", "H", "algorithm", "d", "(Ljava/lang/String;)Lxu/h;", "r", "N", "", "beginIndex", "endIndex", "L", "(II)Lxu/h;", "pos", "", "x", "(I)B", "index", "j", "o", "()I", "O", "()[B", "w", "Lxu/e;", "buffer", "offset", "byteCount", "", "Q", "(Lxu/e;II)V", "other", "otherOffset", "", "C", "(ILxu/h;II)Z", "D", "(I[BII)Z", "prefix", "J", "(Lxu/h;)Z", "suffix", "h", "fromIndex", "s", "(Lxu/h;I)I", "u", "([BI)I", "y", "z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "b", "(Lxu/h;)I", "toString", "[B", "l", "I", "n", "E", "(I)V", "c", "Ljava/lang/String;", "q", "F", "(Ljava/lang/String;)V", "utf8", "size", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public class C12930h implements Serializable, Comparable<C12930h> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final C12930h f45830e = new C12930h(new byte[0]);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final byte[] data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public transient int hashCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public transient String utf8;

    /* JADX INFO: renamed from: xu.h$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00020\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0007*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u0007*\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0007*\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0011J\u0013\u0010\u0017\u001a\u00020\u0007*\u00020\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m31665d2 = {"Lxu/h$a;", "", "<init>", "()V", "", "", "data", "Lxu/h;", "e", "([B)Lxu/h;", "", "offset", "byteCount", "f", "([BII)Lxu/h;", "", "d", "(Ljava/lang/String;)Lxu/h;", "Ljava/nio/charset/Charset;", "charset", "c", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lxu/h;", "a", "b", "", "serialVersionUID", "J", "EMPTY", "Lxu/h;", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: xu.h.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ C12930h m48113g(Companion companion, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = C12918b.m47949c();
            }
            return companion.m48119f(bArr, i10, i11);
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final C12930h m48114a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] bArrM47942a = C12916a.m47942a(str);
            if (bArrM47942a != null) {
                return new C12930h(bArrM47942a);
            }
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C12930h m48115b(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((C13454c.m49066b(str.charAt(i11)) << 4) + C13454c.m49066b(str.charAt(i11 + 1)));
            }
            return new C12930h(bArr);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C12930h m48116c(@NotNull String str, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return new C12930h(bytes);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C12930h m48117d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            C12930h c12930h = new C12930h(C12959v0.m48202a(str));
            c12930h.m48086F(str);
            return c12930h;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C12930h m48118e(@NotNull byte... data) {
            Intrinsics.checkNotNullParameter(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            return new C12930h(bArrCopyOf);
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C12930h m48119f(@NotNull byte[] bArr, int i10, int i11) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int iM47952f = C12918b.m47952f(bArr, i11);
            C12918b.m47948b(bArr.length, i10, iM47952f);
            return new C12930h(C7691l.m31818m(bArr, i10, iM47952f + i10));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public C12930h(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ int m48077A(C12930h c12930h, C12930h c12930h2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = C12918b.m47949c();
        }
        return c12930h.m48111y(c12930h2, i10);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ C12930h m48078M(C12930h c12930h, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = C12918b.m47949c();
        }
        return c12930h.mo48092L(i10, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final C12930h m48079c(@NotNull String str) {
        return INSTANCE.m48115b(str);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final C12930h m48080e(@NotNull String str) {
        return INSTANCE.m48117d(str);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m48081v(C12930h c12930h, C12930h c12930h2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c12930h.m48107s(c12930h2, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final C12930h m48082B() {
        return mo48099d("MD5");
    }

    /* JADX INFO: renamed from: C */
    public boolean mo48083C(int offset, @NotNull C12930h other, int otherOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.mo48084D(otherOffset, getData(), offset, byteCount);
    }

    /* JADX INFO: renamed from: D */
    public boolean mo48084D(int offset, @NotNull byte[] other, int otherOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(other, "other");
        return offset >= 0 && offset <= getData().length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && C12918b.m47947a(getData(), offset, other, otherOffset, byteCount);
    }

    /* JADX INFO: renamed from: E */
    public final void m48085E(int i10) {
        this.hashCode = i10;
    }

    /* JADX INFO: renamed from: F */
    public final void m48086F(@Nullable String str) {
        this.utf8 = str;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final C12930h m48087G() {
        return mo48099d("SHA-1");
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final C12930h m48088H() {
        return mo48099d("SHA-256");
    }

    /* JADX INFO: renamed from: I */
    public final int m48089I() {
        return mo48104o();
    }

    /* JADX INFO: renamed from: J */
    public final boolean m48090J(@NotNull C12930h prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return mo48083C(0, prefix, 0, prefix.m48089I());
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public String mo48091K(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(this.data, charset);
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public C12930h mo48092L(int beginIndex, int endIndex) {
        int iM47951e = C12918b.m47951e(this, endIndex);
        if (beginIndex < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iM47951e <= getData().length) {
            if (iM47951e - beginIndex >= 0) {
                return (beginIndex == 0 && iM47951e == getData().length) ? this : new C12930h(C7691l.m31818m(getData(), beginIndex, iM47951e));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + getData().length + ')').toString());
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public C12930h mo48093N() {
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
                return new C12930h(bArrCopyOf);
            }
        }
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public byte[] mo48094O() {
        byte[] data = getData();
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public String m48095P() {
        String utf8 = getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        String strM48204c = C12959v0.m48204c(mo48109w());
        m48086F(strM48204c);
        return strM48204c;
    }

    /* JADX INFO: renamed from: Q */
    public void mo48096Q(@NotNull C12924e buffer, int offset, int byteCount) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        C13453b.m49063c(this, buffer, offset, byteCount);
    }

    /* JADX DEBUG: Class process forced to load method for inline: xu.a.c(byte[], byte[], int, java.lang.Object):java.lang.String */
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo48097a() {
        return C12916a.m47944c(getData(), null, 1, null);
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull C12930h other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM48089I = m48089I();
        int iM48089I2 = other.m48089I();
        int iMin = Math.min(iM48089I, iM48089I2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iM48101j = m48101j(i10) & 255;
            int iM48101j2 = other.m48101j(i10) & 255;
            if (iM48101j != iM48101j2) {
                return iM48101j < iM48101j2 ? -1 : 1;
            }
        }
        if (iM48089I == iM48089I2) {
            return 0;
        }
        return iM48089I < iM48089I2 ? -1 : 1;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public C12930h mo48099d(@NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, m48089I());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        return new C12930h(bArrDigest);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof C12930h) {
            C12930h c12930h = (C12930h) other;
            if (c12930h.m48089I() == getData().length && c12930h.mo48084D(0, getData(), 0, getData().length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m48100h(@NotNull C12930h suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return mo48083C(m48089I() - suffix.m48089I(), suffix, 0, suffix.m48089I());
    }

    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int iHashCode = Arrays.hashCode(getData());
        m48085E(iHashCode);
        return iHashCode;
    }

    /* JADX INFO: renamed from: j */
    public final byte m48101j(int index) {
        return mo48110x(index);
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

    /* JADX INFO: renamed from: o */
    public int mo48104o() {
        return getData().length;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getUtf8() {
        return this.utf8;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public String mo48106r() {
        char[] cArr = new char[getData().length * 2];
        int i10 = 0;
        for (byte b : getData()) {
            int i11 = i10 + 1;
            cArr[i10] = C13453b.m49064d()[(b >> 4) & 15];
            i10 += 2;
            cArr[i11] = C13453b.m49064d()[b & 15];
        }
        return C7797x.m32310v(cArr);
    }

    /* JADX INFO: renamed from: s */
    public final int m48107s(@NotNull C12930h other, int fromIndex) {
        Intrinsics.checkNotNullParameter(other, "other");
        return mo48108u(other.mo48109w(), fromIndex);
    }

    /* JADX DEBUG: Class process forced to load method for inline: yu.b.a(byte[], int):int */
    @NotNull
    public String toString() {
        if (getData().length == 0) {
            return "[size=0]";
        }
        int iM49062b = C13453b.m49062b(getData(), 64);
        if (iM49062b != -1) {
            String strM48095P = m48095P();
            String strSubstring = strM48095P.substring(0, iM49062b);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strM32303N = C7797x.m32303N(C7797x.m32303N(C7797x.m32303N(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iM49062b >= strM48095P.length()) {
                return "[text=" + strM32303N + ']';
            }
            return "[size=" + getData().length + " text=" + strM32303N + "…]";
        }
        if (getData().length <= 64) {
            return "[hex=" + mo48106r() + ']';
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(getData().length);
        sb2.append(" hex=");
        int iM47951e = C12918b.m47951e(this, 64);
        if (iM47951e <= getData().length) {
            if (iM47951e < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb2.append((iM47951e == getData().length ? this : new C12930h(C7691l.m31818m(getData(), 0, iM47951e))).mo48106r());
            sb2.append("…]");
            return sb2.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + getData().length + ')').toString());
    }

    /* JADX INFO: renamed from: u */
    public int mo48108u(@NotNull byte[] other, int fromIndex) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = getData().length - other.length;
        int iMax = Math.max(fromIndex, 0);
        if (iMax > length) {
            return -1;
        }
        while (!C12918b.m47947a(getData(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public byte[] mo48109w() {
        return getData();
    }

    /* JADX INFO: renamed from: x */
    public byte mo48110x(int pos) {
        return getData()[pos];
    }

    /* JADX INFO: renamed from: y */
    public final int m48111y(@NotNull C12930h other, int fromIndex) {
        Intrinsics.checkNotNullParameter(other, "other");
        return mo48112z(other.mo48109w(), fromIndex);
    }

    /* JADX INFO: renamed from: z */
    public int mo48112z(@NotNull byte[] other, int fromIndex) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int iMin = Math.min(C12918b.m47951e(this, fromIndex), getData().length - other.length); -1 < iMin; iMin--) {
            if (C12918b.m47947a(getData(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }
}
