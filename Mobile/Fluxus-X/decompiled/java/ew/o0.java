package ew;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 62\u00020\u0001:\u00017B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010\"J\u001f\u0010&\u001a\u00020%2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010'J\u0017\u0010-\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00101R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00068"}, d2 = {"Lew/o0;", "Lew/k;", "Lew/b0;", "zipPath", "fileSystem", BuildConfig.FLAVOR, "Lfw/o;", "entries", BuildConfig.FLAVOR, "comment", "<init>", "(Lew/b0;Lew/k;Ljava/util/Map;Ljava/lang/String;)V", "dir", BuildConfig.FLAVOR, "throwOnFailure", BuildConfig.FLAVOR, "z", "(Lew/b0;Z)Ljava/util/List;", "path", "Lew/j;", "p", "(Lew/b0;)Lew/j;", "file", "Lew/i;", "r", "(Lew/b0;)Lew/i;", "n", "(Lew/b0;)Ljava/util/List;", "Lew/l0;", "w", "(Lew/b0;)Lew/l0;", "mustCreate", "Lew/j0;", "u", "(Lew/b0;Z)Lew/j0;", "mustExist", "b", BuildConfig.FLAVOR, "f", "(Lew/b0;Z)V", Payload.SOURCE, "target", "c", "(Lew/b0;Lew/b0;)V", "k", "y", "(Lew/b0;)Lew/b0;", "e", "Lew/b0;", "Lew/k;", "g", "Ljava/util/Map;", "h", "Ljava/lang/String;", "i", "a", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o0 extends k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final b0 f14839j = b0.Companion.e(b0.INSTANCE, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0 zipPath;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k fileSystem;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<b0, fw.o> entries;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String comment;

    public o0(@NotNull b0 zipPath, @NotNull k fileSystem, @NotNull Map<b0, fw.o> entries, @Nullable String str) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.zipPath = zipPath;
        this.fileSystem = fileSystem;
        this.entries = entries;
        this.comment = str;
    }

    private final List<b0> z(b0 dir, boolean throwOnFailure) throws IOException {
        fw.o oVar = this.entries.get(y(dir));
        if (oVar != null) {
            return CollectionsKt.M0(oVar.c());
        }
        if (!throwOnFailure) {
            return null;
        }
        throw new IOException("not a directory: " + dir);
    }

    @Override // ew.k
    @NotNull
    public j0 b(@NotNull b0 file, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // ew.k
    public void c(@NotNull b0 source, @NotNull b0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // ew.k
    public void f(@NotNull b0 dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // ew.k
    public void k(@NotNull b0 path, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // ew.k
    @NotNull
    public List<b0> n(@NotNull b0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<b0> listZ = z(dir, true);
        Intrinsics.checkNotNull(listZ);
        return listZ;
    }

    @Override // ew.k
    @Nullable
    public j p(@NotNull b0 path) throws Throwable {
        Throwable th2;
        Throwable th3;
        Intrinsics.checkNotNullParameter(path, "path");
        fw.o oVarQ = this.entries.get(y(path));
        if (oVarQ == null) {
            return null;
        }
        if (oVarQ.getOffset() != -1) {
            i iVarR = this.fileSystem.r(this.zipPath);
            try {
                g gVarC = v.c(iVarR.m(oVarQ.getOffset()));
                try {
                    oVarQ = fw.t.q(gVarC, oVarQ);
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
                            zt.a.a(th5, th6);
                        }
                    }
                    th3 = th5;
                    oVarQ = null;
                }
                if (th3 != null) {
                    throw th3;
                }
                if (iVarR != null) {
                    try {
                        iVarR.close();
                    } catch (Throwable th7) {
                        th2 = th7;
                    }
                }
                th2 = null;
            } catch (Throwable th8) {
                if (iVarR != null) {
                    try {
                        iVarR.close();
                    } catch (Throwable th9) {
                        zt.a.a(th8, th9);
                    }
                }
                th2 = th8;
                oVarQ = null;
            }
            if (th2 != null) {
                throw th2;
            }
        }
        return new j(!oVarQ.getIsDirectory(), oVarQ.getIsDirectory(), null, oVarQ.getIsDirectory() ? null : Long.valueOf(oVarQ.getSize()), oVarQ.f(), oVarQ.h(), oVarQ.g(), null, Barcode.FORMAT_ITF, null);
    }

    @Override // ew.k
    @NotNull
    public i r(@NotNull b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // ew.k
    @NotNull
    public j0 u(@NotNull b0 file, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // ew.k
    @NotNull
    public l0 w(@NotNull b0 file) throws IllegalAccessException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(file, "file");
        fw.o oVar = this.entries.get(y(file));
        if (oVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        i iVarR = this.fileSystem.r(this.zipPath);
        g th2 = null;
        try {
            g gVarC = v.c(iVarR.m(oVar.getOffset()));
            if (iVarR != null) {
                try {
                    iVarR.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = gVarC;
        } catch (Throwable th4) {
            th = th4;
            if (iVarR != null) {
                try {
                    iVarR.close();
                } catch (Throwable th5) {
                    zt.a.a(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        fw.t.u(th2);
        return oVar.getCompressionMethod() == 0 ? new fw.j(th2, oVar.getSize(), true) : new fw.j(new q(new fw.j(th2, oVar.getCompressedSize(), true), new Inflater(true)), oVar.getSize(), false);
    }

    public final b0 y(b0 path) {
        return f14839j.o(path, true);
    }
}
