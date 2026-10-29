package xu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 92\u00020\u0001:\u00012B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010(J\u001f\u0010+\u001a\u00020*2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020*2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020*2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b0\u0010,J\u001f\u00101\u001a\u00020*2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u0010/J\u0017\u00102\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b2\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00104R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lxu/u0;", "Lxu/l;", "Lxu/h0;", "zipPath", "fileSystem", "", "Lyu/o;", "entries", "", "comment", "<init>", "(Lxu/h0;Lxu/l;Ljava/util/Map;Ljava/lang/String;)V", "dir", "", "throwOnFailure", "", "b", "(Lxu/h0;Z)Ljava/util/List;", "path", "canonicalize", "(Lxu/h0;)Lxu/h0;", "Lxu/k;", "metadataOrNull", "(Lxu/h0;)Lxu/k;", "file", "Lxu/j;", "openReadOnly", "(Lxu/h0;)Lxu/j;", "mustCreate", "mustExist", "openReadWrite", "(Lxu/h0;ZZ)Lxu/j;", "list", "(Lxu/h0;)Ljava/util/List;", "listOrNull", "Lxu/r0;", Payload.SOURCE, "(Lxu/h0;)Lxu/r0;", "Lxu/p0;", "sink", "(Lxu/h0;Z)Lxu/p0;", "appendingSink", "", "createDirectory", "(Lxu/h0;Z)V", "target", "atomicMove", "(Lxu/h0;Lxu/h0;)V", "delete", "createSymlink", "a", "Lxu/h0;", "Lxu/l;", "c", "Ljava/util/Map;", "d", "Ljava/lang/String;", "e", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u0 extends l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final h0 f35403f = h0.Companion.e(h0.INSTANCE, "/", false, 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 zipPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l fileSystem;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<h0, yu.o> entries;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String comment;

    public u0(@NotNull h0 zipPath, @NotNull l fileSystem, @NotNull Map<h0, yu.o> entries, @Nullable String str) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.zipPath = zipPath;
        this.fileSystem = fileSystem;
        this.entries = entries;
        this.comment = str;
    }

    private final List<h0> b(h0 dir, boolean throwOnFailure) throws IOException {
        yu.o oVar = this.entries.get(a(dir));
        if (oVar != null) {
            return CollectionsKt.M0(oVar.c());
        }
        if (!throwOnFailure) {
            return null;
        }
        throw new IOException("not a directory: " + dir);
    }

    public final h0 a(h0 path) {
        return f35403f.q(path, true);
    }

    @Override // xu.l
    @NotNull
    public p0 appendingSink(@NotNull h0 file, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // xu.l
    public void atomicMove(@NotNull h0 source, @NotNull h0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // xu.l
    @NotNull
    public h0 canonicalize(@NotNull h0 path) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(path, "path");
        h0 h0VarA = a(path);
        if (this.entries.containsKey(h0VarA)) {
            return h0VarA;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    @Override // xu.l
    public void createDirectory(@NotNull h0 dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // xu.l
    public void createSymlink(@NotNull h0 source, @NotNull h0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // xu.l
    public void delete(@NotNull h0 path, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // xu.l
    @NotNull
    public List<h0> list(@NotNull h0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<h0> listB = b(dir, true);
        Intrinsics.checkNotNull(listB);
        return listB;
    }

    @Override // xu.l
    @Nullable
    public List<h0> listOrNull(@NotNull h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return b(dir, false);
    }

    @Override // xu.l
    @Nullable
    public k metadataOrNull(@NotNull h0 path) throws Throwable {
        Throwable th2;
        Throwable th3;
        Intrinsics.checkNotNullParameter(path, "path");
        yu.o oVarQ = this.entries.get(a(path));
        if (oVarQ == null) {
            return null;
        }
        if (oVarQ.getOffset() != -1) {
            j jVarOpenReadOnly = this.fileSystem.openReadOnly(this.zipPath);
            try {
                g gVarC = b0.c(jVarOpenReadOnly.l(oVarQ.getOffset()));
                try {
                    oVarQ = yu.t.q(gVarC, oVarQ);
                    if (gVarC != null) {
                        try {
                            gVarC.close();
                        } catch (Throwable th4) {
                            th3 = th4;
                        }
                    }
                    th3 = null;
                } catch (Throwable th5) {
                    if (gVarC != null) {
                        try {
                            gVarC.close();
                        } catch (Throwable th6) {
                            jt.a.a(th5, th6);
                        }
                    }
                    th3 = th5;
                    oVarQ = null;
                }
                if (th3 != null) {
                    throw th3;
                }
                if (jVarOpenReadOnly != null) {
                    try {
                        jVarOpenReadOnly.close();
                    } catch (Throwable th7) {
                        th2 = th7;
                    }
                }
                th2 = null;
            } catch (Throwable th8) {
                if (jVarOpenReadOnly != null) {
                    try {
                        jVarOpenReadOnly.close();
                    } catch (Throwable th9) {
                        jt.a.a(th8, th9);
                    }
                }
                th2 = th8;
                oVarQ = null;
            }
            if (th2 != null) {
                throw th2;
            }
        }
        return new k(!oVarQ.getIsDirectory(), oVarQ.getIsDirectory(), null, oVarQ.getIsDirectory() ? null : Long.valueOf(oVarQ.getSize()), oVarQ.f(), oVarQ.h(), oVarQ.g(), null, 128, null);
    }

    @Override // xu.l
    @NotNull
    public j openReadOnly(@NotNull h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // xu.l
    @NotNull
    public j openReadWrite(@NotNull h0 file, boolean mustCreate, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // xu.l
    @NotNull
    public p0 sink(@NotNull h0 file, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // xu.l
    @NotNull
    public r0 source(@NotNull h0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        yu.o oVar = this.entries.get(a(file));
        if (oVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        j jVarOpenReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        g th2 = null;
        try {
            g gVarC = b0.c(jVarOpenReadOnly.l(oVar.getOffset()));
            if (jVarOpenReadOnly != null) {
                try {
                    jVarOpenReadOnly.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = gVarC;
        } catch (Throwable th4) {
            th = th4;
            if (jVarOpenReadOnly != null) {
                try {
                    jVarOpenReadOnly.close();
                } catch (Throwable th5) {
                    jt.a.a(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        yu.t.u(th2);
        return oVar.getCompressionMethod() == 0 ? new yu.j(th2, oVar.getSize(), true) : new yu.j(new u(new yu.j(th2, oVar.getCompressedSize(), true), new Inflater(true)), oVar.getSize(), false);
    }
}
