package xu;

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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\n\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$R\u0013\u0010'\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u00101\u001a\u0004\u0018\u00010.8G¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00103\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b2\u0010$R\u0011\u00105\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b4\u0010!R\u0013\u00107\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b6\u0010&¨\u00068"}, d2 = {"Lxu/h0;", "", "Lxu/h;", "bytes", "<init>", "(Lxu/h;)V", "", "child", "n", "(Ljava/lang/String;)Lxu/h0;", "o", "(Lxu/h0;)Lxu/h0;", "", "normalize", "q", "(Lxu/h0;Z)Lxu/h0;", "other", "l", "Ljava/io/File;", "toFile", "()Ljava/io/File;", "Ljava/nio/file/Path;", "s", "()Ljava/nio/file/Path;", "", "a", "(Lxu/h0;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lxu/h;", "b", "()Lxu/h;", "c", "()Lxu/h0;", "root", "", "d", "()Ljava/util/List;", "segmentsBytes", "isAbsolute", "()Z", "", "u", "()Ljava/lang/Character;", "volumeLetter", "h", "nameBytes", "e", "name", "j", "parent", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 implements Comparable<h0> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f35346c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h bytes;

    /* JADX INFO: renamed from: xu.h0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u0007*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u0007*\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lxu/h0$a;", "", "<init>", "()V", "", "", "normalize", "Lxu/h0;", "b", "(Ljava/lang/String;Z)Lxu/h0;", "Ljava/io/File;", "a", "(Ljava/io/File;Z)Lxu/h0;", "Ljava/nio/file/Path;", "c", "(Ljava/nio/file/Path;Z)Lxu/h0;", "DIRECTORY_SEPARATOR", "Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ h0 d(Companion companion, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.a(file, z10);
        }

        public static /* synthetic */ h0 e(Companion companion, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.b(str, z10);
        }

        public static /* synthetic */ h0 f(Companion companion, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.c(path, z10);
        }

        @NotNull
        public final h0 a(@NotNull File file, boolean z10) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            String string = file.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return b(string, z10);
        }

        @NotNull
        public final h0 b(@NotNull String str, boolean z10) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return yu.e.k(str, z10);
        }

        @NotNull
        public final h0 c(@NotNull Path path, boolean z10) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return b(path.toString(), z10);
        }

        public Companion() {
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f35346c = separator;
    }

    public h0(@NotNull h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.bytes = bytes;
    }

    public static /* synthetic */ h0 r(h0 h0Var, h0 h0Var2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return h0Var.q(h0Var2, z10);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull h0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return getBytes().compareTo(other.getBytes());
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getBytes() {
        return this.bytes;
    }

    @Nullable
    public final h0 c() {
        int iO = yu.e.o(this);
        if (iO == -1) {
            return null;
        }
        return new h0(getBytes().L(0, iO));
    }

    @NotNull
    public final List<h> d() {
        ArrayList arrayList = new ArrayList();
        int iO = yu.e.o(this);
        if (iO == -1) {
            iO = 0;
        } else if (iO < getBytes().I() && getBytes().j(iO) == 92) {
            iO++;
        }
        int I = getBytes().I();
        int i10 = iO;
        while (iO < I) {
            if (getBytes().j(iO) == 47 || getBytes().j(iO) == 92) {
                arrayList.add(getBytes().L(i10, iO));
                i10 = iO + 1;
            }
            iO++;
        }
        if (i10 < getBytes().I()) {
            arrayList.add(getBytes().L(i10, getBytes().I()));
        }
        return arrayList;
    }

    @NotNull
    public final String e() {
        return h().P();
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof h0) && Intrinsics.c(((h0) other).getBytes(), getBytes());
    }

    @NotNull
    public final h h() {
        int iL = yu.e.l(this);
        if (iL != -1) {
            return h.M(getBytes(), iL + 1, 0, 2, null);
        }
        return (u() == null || getBytes().I() != 2) ? getBytes() : h.f35343e;
    }

    public int hashCode() {
        return getBytes().hashCode();
    }

    public final boolean isAbsolute() {
        return yu.e.o(this) != -1;
    }

    @Nullable
    public final h0 j() {
        if (Intrinsics.c(getBytes(), yu.e.f36372d) || Intrinsics.c(getBytes(), yu.e.f36370a) || Intrinsics.c(getBytes(), yu.e.b) || yu.e.n(this)) {
            return null;
        }
        int iL = yu.e.l(this);
        if (iL == 2 && u() != null) {
            if (getBytes().I() == 3) {
                return null;
            }
            return new h0(h.M(getBytes(), 0, 3, 1, null));
        }
        if (iL == 1 && getBytes().J(yu.e.b)) {
            return null;
        }
        if (iL != -1 || u() == null) {
            if (iL == -1) {
                return new h0(yu.e.f36372d);
            }
            return iL == 0 ? new h0(h.M(getBytes(), 0, 1, 1, null)) : new h0(h.M(getBytes(), 0, iL, 1, null));
        }
        if (getBytes().I() == 2) {
            return null;
        }
        return new h0(h.M(getBytes(), 0, 2, 1, null));
    }

    @NotNull
    public final h0 l(@NotNull h0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.c(c(), other.c())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<h> listD = d();
        List<h> listD2 = other.d();
        int iMin = Math.min(listD.size(), listD2.size());
        int i10 = 0;
        while (i10 < iMin && Intrinsics.c(listD.get(i10), listD2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && getBytes().I() == other.getBytes().I()) {
            return Companion.e(INSTANCE, ".", false, 1, null);
        }
        if (listD2.subList(i10, listD2.size()).indexOf(yu.e.f36373e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (Intrinsics.c(other.getBytes(), yu.e.f36372d)) {
            return this;
        }
        e eVar = new e();
        h hVarM = yu.e.m(other);
        if (hVarM == null && (hVarM = yu.e.m(this)) == null) {
            hVarM = yu.e.s(f35346c);
        }
        int size = listD2.size();
        for (int i11 = i10; i11 < size; i11++) {
            eVar.d0(yu.e.f36373e);
            eVar.d0(hVarM);
        }
        int size2 = listD.size();
        while (i10 < size2) {
            eVar.d0(listD.get(i10));
            eVar.d0(hVarM);
            i10++;
        }
        return yu.e.q(eVar, false);
    }

    @NotNull
    public final h0 n(@NotNull String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return yu.e.j(this, yu.e.q(new e().C0(child), false), false);
    }

    @NotNull
    public final h0 o(@NotNull h0 child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return yu.e.j(this, child, false);
    }

    @NotNull
    public final h0 q(@NotNull h0 child, boolean normalize) {
        Intrinsics.checkNotNullParameter(child, "child");
        return yu.e.j(this, child, normalize);
    }

    @NotNull
    public final Path s() {
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
        return getBytes().P();
    }

    @Nullable
    public final Character u() {
        if (h.v(getBytes(), yu.e.f36370a, 0, 2, null) != -1 || getBytes().I() < 2 || getBytes().j(1) != 58) {
            return null;
        }
        char cJ = (char) getBytes().j(0);
        if (('a' > cJ || cJ >= '{') && ('A' > cJ || cJ >= '[')) {
            return null;
        }
        return Character.valueOf(cJ);
    }
}
