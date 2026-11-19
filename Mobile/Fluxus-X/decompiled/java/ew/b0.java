package ew;

import com.github.luben.zstd.BuildConfig;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\n\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010#R\u0013\u0010&\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010+\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u00100\u001a\u0004\u0018\u00010-8G¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b1\u0010#R\u0011\u00104\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b3\u0010 R\u0013\u00106\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b5\u0010%¨\u00067"}, d2 = {"Lew/b0;", BuildConfig.FLAVOR, "Lew/h;", "bytes", "<init>", "(Lew/h;)V", BuildConfig.FLAVOR, "child", "p", "(Ljava/lang/String;)Lew/b0;", BuildConfig.FLAVOR, "normalize", "o", "(Lew/b0;Z)Lew/b0;", "other", "m", "(Lew/b0;)Lew/b0;", "Ljava/io/File;", "toFile", "()Ljava/io/File;", "Ljava/nio/file/Path;", "r", "()Ljava/nio/file/Path;", BuildConfig.FLAVOR, "a", "(Lew/b0;)I", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lew/h;", "b", "()Lew/h;", "c", "()Lew/b0;", "root", BuildConfig.FLAVOR, "d", "()Ljava/util/List;", "segmentsBytes", "isAbsolute", "()Z", BuildConfig.FLAVOR, "s", "()Ljava/lang/Character;", "volumeLetter", "h", "nameBytes", "e", "name", "k", "parent", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 implements Comparable<b0> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f14766c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h bytes;

    /* JADX INFO: renamed from: ew.b0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u0007*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u0007*\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lew/b0$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "normalize", "Lew/b0;", "b", "(Ljava/lang/String;Z)Lew/b0;", "Ljava/io/File;", "a", "(Ljava/io/File;Z)Lew/b0;", "Ljava/nio/file/Path;", "c", "(Ljava/nio/file/Path;Z)Lew/b0;", "DIRECTORY_SEPARATOR", "Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b0 d(Companion companion, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.a(file, z10);
        }

        public static /* synthetic */ b0 e(Companion companion, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.b(str, z10);
        }

        public static /* synthetic */ b0 f(Companion companion, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.c(path, z10);
        }

        @NotNull
        public final b0 a(@NotNull File file, boolean z10) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            String string = file.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return b(string, z10);
        }

        @NotNull
        public final b0 b(@NotNull String str, boolean z10) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return fw.e.k(str, z10);
        }

        @NotNull
        public final b0 c(@NotNull Path path, boolean z10) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return b(path.toString(), z10);
        }

        public Companion() {
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f14766c = separator;
    }

    public b0(@NotNull h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.bytes = bytes;
    }

    public static /* synthetic */ b0 q(b0 b0Var, b0 b0Var2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return b0Var.o(b0Var2, z10);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull b0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return getBytes().compareTo(other.getBytes());
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getBytes() {
        return this.bytes;
    }

    @Nullable
    public final b0 c() {
        int iO = fw.e.o(this);
        if (iO == -1) {
            return null;
        }
        return new b0(getBytes().L(0, iO));
    }

    @NotNull
    public final List<h> d() {
        ArrayList arrayList = new ArrayList();
        int iO = fw.e.o(this);
        if (iO == -1) {
            iO = 0;
        } else if (iO < getBytes().I() && getBytes().k(iO) == 92) {
            iO++;
        }
        int I = getBytes().I();
        int i10 = iO;
        while (iO < I) {
            if (getBytes().k(iO) == 47 || getBytes().k(iO) == 92) {
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
        return (other instanceof b0) && Intrinsics.c(((b0) other).getBytes(), getBytes());
    }

    @NotNull
    public final h h() {
        int iL = fw.e.l(this);
        if (iL != -1) {
            return h.M(getBytes(), iL + 1, 0, 2, null);
        }
        return (s() == null || getBytes().I() != 2) ? getBytes() : h.f14806e;
    }

    public int hashCode() {
        return getBytes().hashCode();
    }

    public final boolean isAbsolute() {
        return fw.e.o(this) != -1;
    }

    @Nullable
    public final b0 k() {
        if (Intrinsics.c(getBytes(), fw.e.f16636d) || Intrinsics.c(getBytes(), fw.e.f16634a) || Intrinsics.c(getBytes(), fw.e.b) || fw.e.n(this)) {
            return null;
        }
        int iL = fw.e.l(this);
        if (iL == 2 && s() != null) {
            if (getBytes().I() == 3) {
                return null;
            }
            return new b0(h.M(getBytes(), 0, 3, 1, null));
        }
        if (iL == 1 && getBytes().J(fw.e.b)) {
            return null;
        }
        if (iL != -1 || s() == null) {
            if (iL == -1) {
                return new b0(fw.e.f16636d);
            }
            return iL == 0 ? new b0(h.M(getBytes(), 0, 1, 1, null)) : new b0(h.M(getBytes(), 0, iL, 1, null));
        }
        if (getBytes().I() == 2) {
            return null;
        }
        return new b0(h.M(getBytes(), 0, 2, 1, null));
    }

    @NotNull
    public final b0 m(@NotNull b0 other) {
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
        if (listD2.subList(i10, listD2.size()).indexOf(fw.e.f16637e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (Intrinsics.c(other.getBytes(), fw.e.f16636d)) {
            return this;
        }
        e eVar = new e();
        h hVarM = fw.e.m(other);
        if (hVarM == null && (hVarM = fw.e.m(this)) == null) {
            hVarM = fw.e.s(f14766c);
        }
        int size = listD2.size();
        for (int i11 = i10; i11 < size; i11++) {
            eVar.z1(fw.e.f16637e);
            eVar.z1(hVarM);
        }
        int size2 = listD.size();
        while (i10 < size2) {
            eVar.z1(listD.get(i10));
            eVar.z1(hVarM);
            i10++;
        }
        return fw.e.q(eVar, false);
    }

    @NotNull
    public final b0 o(@NotNull b0 child, boolean normalize) {
        Intrinsics.checkNotNullParameter(child, "child");
        return fw.e.j(this, child, normalize);
    }

    @NotNull
    public final b0 p(@NotNull String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return fw.e.j(this, fw.e.q(new e().D0(child), false), false);
    }

    @NotNull
    public final Path r() {
        Path path = Paths.get(toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    @Nullable
    public final Character s() {
        if (h.v(getBytes(), fw.e.f16634a, 0, 2, null) != -1 || getBytes().I() < 2 || getBytes().k(1) != 58) {
            return null;
        }
        char cK = (char) getBytes().k(0);
        if (('a' > cK || cK >= '{') && ('A' > cK || cK >= '[')) {
            return null;
        }
        return Character.valueOf(cK);
    }

    @NotNull
    public final File toFile() {
        return new File(toString());
    }

    @NotNull
    public String toString() {
        return getBytes().P();
    }
}
