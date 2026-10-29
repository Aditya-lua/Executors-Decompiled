package p560xu;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p588yu.C13456e;

/* JADX INFO: renamed from: xu.h0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\n\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$R\u0013\u0010'\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u00101\u001a\u0004\u0018\u00010.8G¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00103\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b2\u0010$R\u0011\u00105\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b4\u0010!R\u0013\u00107\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b6\u0010&¨\u00068"}, m31665d2 = {"Lxu/h0;", "", "Lxu/h;", "bytes", "<init>", "(Lxu/h;)V", "", "child", "n", "(Ljava/lang/String;)Lxu/h0;", "o", "(Lxu/h0;)Lxu/h0;", "", "normalize", "q", "(Lxu/h0;Z)Lxu/h0;", "other", "l", "Ljava/io/File;", "toFile", "()Ljava/io/File;", "Ljava/nio/file/Path;", "s", "()Ljava/nio/file/Path;", "", "a", "(Lxu/h0;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lxu/h;", "b", "()Lxu/h;", "c", "()Lxu/h0;", "root", "", "d", "()Ljava/util/List;", "segmentsBytes", "isAbsolute", "()Z", "", "u", "()Ljava/lang/Character;", "volumeLetter", "h", "nameBytes", "e", "name", "j", "parent", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12931h0 implements Comparable<C12931h0> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String f45835c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C12930h bytes;

    /* JADX INFO: renamed from: xu.h0$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u0007*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u0007*\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lxu/h0$a;", "", "<init>", "()V", "", "", "normalize", "Lxu/h0;", "b", "(Ljava/lang/String;Z)Lxu/h0;", "Ljava/io/File;", "a", "(Ljava/io/File;Z)Lxu/h0;", "Ljava/nio/file/Path;", "c", "(Ljava/nio/file/Path;Z)Lxu/h0;", "DIRECTORY_SEPARATOR", "Ljava/lang/String;", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: xu.h0.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ C12931h0 m48134d(Companion companion, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.m48137a(file, z10);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ C12931h0 m48135e(Companion companion, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.m48138b(str, z10);
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ C12931h0 m48136f(Companion companion, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.m48139c(path, z10);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C12931h0 m48137a(@NotNull File file, boolean z10) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            String string = file.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return m48138b(string, z10);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C12931h0 m48138b(@NotNull String str, boolean z10) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return C13456e.m49087k(str, z10);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C12931h0 m48139c(@NotNull Path path, boolean z10) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return m48138b(path.toString(), z10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f45835c = separator;
    }

    public C12931h0(@NotNull C12930h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.bytes = bytes;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ C12931h0 m48120r(C12931h0 c12931h0, C12931h0 c12931h1, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c12931h0.m48131q(c12931h1, z10);
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull C12931h0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return getBytes().compareTo(other.getBytes());
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C12930h getBytes() {
        return this.bytes;
    }

    /* JADX DEBUG: Class process forced to load method for inline: yu.e.h(xu.h0):int */
    @Nullable
    /* JADX INFO: renamed from: c */
    public final C12931h0 m48123c() {
        int iM49091o = C13456e.m49091o(this);
        if (iM49091o == -1) {
            return null;
        }
        return new C12931h0(getBytes().mo48092L(0, iM49091o));
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<C12930h> m48124d() {
        ArrayList arrayList = new ArrayList();
        int iM49091o = C13456e.m49091o(this);
        if (iM49091o == -1) {
            iM49091o = 0;
        } else if (iM49091o < getBytes().m48089I() && getBytes().m48101j(iM49091o) == 92) {
            iM49091o++;
        }
        int iM48089I = getBytes().m48089I();
        int i10 = iM49091o;
        while (iM49091o < iM48089I) {
            if (getBytes().m48101j(iM49091o) == 47 || getBytes().m48101j(iM49091o) == 92) {
                arrayList.add(getBytes().mo48092L(i10, iM49091o));
                i10 = iM49091o + 1;
            }
            iM49091o++;
        }
        if (i10 < getBytes().m48089I()) {
            arrayList.add(getBytes().mo48092L(i10, getBytes().m48089I()));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m48125e() {
        return m48126h().m48095P();
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof C12931h0) && Intrinsics.m31980c(((C12931h0) other).getBytes(), getBytes());
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final C12930h m48126h() {
        int iM49088l = C13456e.m49088l(this);
        if (iM49088l != -1) {
            return C12930h.m48078M(getBytes(), iM49088l + 1, 0, 2, null);
        }
        return (m48133u() == null || getBytes().m48089I() != 2) ? getBytes() : C12930h.f45830e;
    }

    public int hashCode() {
        return getBytes().hashCode();
    }

    public final boolean isAbsolute() {
        return C13456e.m49091o(this) != -1;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final C12931h0 m48127j() {
        if (Intrinsics.m31980c(getBytes(), C13456e.f47127d) || Intrinsics.m31980c(getBytes(), C13456e.f47124a) || Intrinsics.m31980c(getBytes(), C13456e.f47125b) || C13456e.m49090n(this)) {
            return null;
        }
        int iM49088l = C13456e.m49088l(this);
        if (iM49088l == 2 && m48133u() != null) {
            if (getBytes().m48089I() == 3) {
                return null;
            }
            return new C12931h0(C12930h.m48078M(getBytes(), 0, 3, 1, null));
        }
        if (iM49088l == 1 && getBytes().m48090J(C13456e.f47125b)) {
            return null;
        }
        if (iM49088l != -1 || m48133u() == null) {
            if (iM49088l == -1) {
                return new C12931h0(C13456e.f47127d);
            }
            return iM49088l == 0 ? new C12931h0(C12930h.m48078M(getBytes(), 0, 1, 1, null)) : new C12931h0(C12930h.m48078M(getBytes(), 0, iM49088l, 1, null));
        }
        if (getBytes().m48089I() == 2) {
            return null;
        }
        return new C12931h0(C12930h.m48078M(getBytes(), 0, 2, 1, null));
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final C12931h0 m48128l(@NotNull C12931h0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.m31980c(m48123c(), other.m48123c())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<C12930h> listM48124d = m48124d();
        List<C12930h> listM48124d2 = other.m48124d();
        int iMin = Math.min(listM48124d.size(), listM48124d2.size());
        int i10 = 0;
        while (i10 < iMin && Intrinsics.m31980c(listM48124d.get(i10), listM48124d2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && getBytes().m48089I() == other.getBytes().m48089I()) {
            return Companion.m48135e(INSTANCE, ".", false, 1, null);
        }
        if (listM48124d2.subList(i10, listM48124d2.size()).indexOf(C13456e.f47128e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (Intrinsics.m31980c(other.getBytes(), C13456e.f47127d)) {
            return this;
        }
        C12924e c12924e = new C12924e();
        C12930h c12930hM49089m = C13456e.m49089m(other);
        if (c12930hM49089m == null && (c12930hM49089m = C13456e.m49089m(this)) == null) {
            c12930hM49089m = C13456e.m49095s(f45835c);
        }
        int size = listM48124d2.size();
        for (int i11 = i10; i11 < size; i11++) {
            c12924e.mo48023d0(C13456e.f47128e);
            c12924e.mo48023d0(c12930hM49089m);
        }
        int size2 = listM48124d.size();
        while (i10 < size2) {
            c12924e.mo48023d0(listM48124d.get(i10));
            c12924e.mo48023d0(c12930hM49089m);
            i10++;
        }
        return C13456e.m49093q(c12924e, false);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final C12931h0 m48129n(@NotNull String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return C13456e.m49086j(this, C13456e.m49093q(new C12924e().mo47992C0(child), false), false);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final C12931h0 m48130o(@NotNull C12931h0 child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return C13456e.m49086j(this, child, false);
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final C12931h0 m48131q(@NotNull C12931h0 child, boolean normalize) {
        Intrinsics.checkNotNullParameter(child, "child");
        return C13456e.m49086j(this, child, normalize);
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final Path m48132s() {
        Path path = Paths.get(toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    @NotNull
    public final File toFile() {
        return new File(toString());
    }

    @NotNull
    public String toString() {
        return getBytes().m48095P();
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public final Character m48133u() {
        if (C12930h.m48081v(getBytes(), C13456e.f47124a, 0, 2, null) != -1 || getBytes().m48089I() < 2 || getBytes().m48101j(1) != 58) {
            return null;
        }
        char cM48101j = (char) getBytes().m48101j(0);
        if (('a' > cM48101j || cM48101j >= '{') && ('A' > cM48101j || cM48101j >= '[')) {
            return null;
        }
        return Character.valueOf(cM48101j);
    }
}
