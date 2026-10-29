package xu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.Closeable;
import java.nio.file.FileSystem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\b&\u0018\u0000 D2\u00060\u0001j\u0002`\u0002:\u0001EB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\u0010\u001a\u00020\u0005H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0005H&¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0005H&¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010 \u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b \u0010!J\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0005H&¢\u0006\u0004\b#\u0010$JB\u0010+\u001a\u00028\u0000\"\u0004\b\u0000\u0010%2\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00028\u00000&H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\rH&¢\u0006\u0004\b-\u0010.J\u0015\u0010-\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b-\u0010/JL\u00104\u001a\u00028\u0000\"\u0004\b\u0000\u0010%2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\r2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000&H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001¢\u0006\u0004\b2\u00103J!\u00105\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b5\u0010.J\u0015\u00105\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b5\u0010/J!\u00107\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\rH&¢\u0006\u0004\b7\u00108J\u0015\u00107\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b7\u00109J\u001f\u0010:\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b:\u00108J\u0015\u0010:\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b:\u00109J\u001f\u0010<\u001a\u0002062\u0006\u0010#\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H&¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u0002062\u0006\u0010#\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H\u0016¢\u0006\u0004\b>\u0010=J!\u0010?\u001a\u0002062\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b?\u00108J\u0015\u0010?\u001a\u0002062\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b?\u00109J!\u0010A\u001a\u0002062\u0006\u0010@\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\bA\u00108J\u0015\u0010A\u001a\u0002062\u0006\u0010@\u001a\u00020\u0005¢\u0006\u0004\bA\u00109J\u001f\u0010B\u001a\u0002062\u0006\u0010#\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H&¢\u0006\u0004\bB\u0010=J\u000f\u0010C\u001a\u000206H\u0016¢\u0006\u0004\bC\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006F"}, d2 = {"Lxu/l;", "Ljava/io/Closeable;", "Lokio/Closeable;", "<init>", "()V", "Lxu/h0;", "path", "canonicalize", "(Lxu/h0;)Lxu/h0;", "Lxu/k;", "metadata", "(Lxu/h0;)Lxu/k;", "metadataOrNull", "", "exists", "(Lxu/h0;)Z", "dir", "", "list", "(Lxu/h0;)Ljava/util/List;", "listOrNull", "followSymlinks", "Lkotlin/sequences/Sequence;", "listRecursively", "(Lxu/h0;Z)Lkotlin/sequences/Sequence;", "(Lxu/h0;)Lkotlin/sequences/Sequence;", "file", "Lxu/j;", "openReadOnly", "(Lxu/h0;)Lxu/j;", "mustCreate", "mustExist", "openReadWrite", "(Lxu/h0;ZZ)Lxu/j;", "Lxu/r0;", Payload.SOURCE, "(Lxu/h0;)Lxu/r0;", "T", "Lkotlin/Function1;", "Lxu/g;", "readerAction", "-read", "(Lxu/h0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "read", "Lxu/p0;", "sink", "(Lxu/h0;Z)Lxu/p0;", "(Lxu/h0;)Lxu/p0;", "Lxu/f;", "writerAction", "-write", "(Lxu/h0;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "write", "appendingSink", "", "createDirectory", "(Lxu/h0;Z)V", "(Lxu/h0;)V", "createDirectories", "target", "atomicMove", "(Lxu/h0;Lxu/h0;)V", "copy", "delete", "fileOrDirectory", "deleteRecursively", "createSymlink", "close", "Companion", "a", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class l implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final l RESOURCES;

    @NotNull
    public static final l SYSTEM;

    @NotNull
    public static final h0 SYSTEM_TEMPORARY_DIRECTORY;

    /* JADX INFO: renamed from: xu.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lxu/l$a;", "", "<init>", "()V", "Ljava/nio/file/FileSystem;", "Lxu/l;", "a", "(Ljava/nio/file/FileSystem;)Lxu/l;", "SYSTEM", "Lxu/l;", "Lxu/h0;", "SYSTEM_TEMPORARY_DIRECTORY", "Lxu/h0;", "RESOURCES", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final l a(@NotNull FileSystem fileSystem) {
            Intrinsics.checkNotNullParameter(fileSystem, "<this>");
            return new z(fileSystem);
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX INFO: renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m224write$default(l lVar, h0 file, boolean z10, Function1 writerAction, int i10, Object obj) {
        ?? r8;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(writerAction, "writerAction");
        f fVarB = b0.b(lVar.sink(file, z10));
        Object th2 = null;
        try {
            Object objInvoke = writerAction.invoke(fVarB);
            kotlin.jvm.internal.l.b(1);
            if (fVarB != null) {
                try {
                    fVarB.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            kotlin.jvm.internal.l.a(1);
            r8 = th2;
            th2 = objInvoke;
        } catch (Throwable th4) {
            kotlin.jvm.internal.l.b(1);
            if (fVarB != null) {
                try {
                    fVarB.close();
                } catch (Throwable th5) {
                    jt.a.a(th4, th5);
                }
            }
            kotlin.jvm.internal.l.a(1);
            r8 = th4;
        }
        if (r8 == 0) {
            return th2;
        }
        throw r8;
    }

    static {
        l xVar;
        try {
            Class.forName("java.nio.file.Files");
            xVar = new a0();
        } catch (ClassNotFoundException unused) {
            xVar = new x();
        }
        SYSTEM = xVar;
        h0.Companion companion = h0.INSTANCE;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = h0.Companion.e(companion, property, false, 1, null);
        ClassLoader classLoader = yu.m.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        RESOURCES = new yu.m(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ p0 appendingSink$default(l lVar, h0 h0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return lVar.appendingSink(h0Var, z10);
    }

    public static /* synthetic */ void createDirectories$default(l lVar, h0 h0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        lVar.createDirectories(h0Var, z10);
    }

    public static /* synthetic */ void createDirectory$default(l lVar, h0 h0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        lVar.createDirectory(h0Var, z10);
    }

    public static /* synthetic */ void delete$default(l lVar, h0 h0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        lVar.delete(h0Var, z10);
    }

    public static /* synthetic */ void deleteRecursively$default(l lVar, h0 h0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        lVar.deleteRecursively(h0Var, z10);
    }

    @NotNull
    public static final l get(@NotNull FileSystem fileSystem) {
        return INSTANCE.a(fileSystem);
    }

    public static /* synthetic */ Sequence listRecursively$default(l lVar, h0 h0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return lVar.listRecursively(h0Var, z10);
    }

    public static /* synthetic */ j openReadWrite$default(l lVar, h0 h0Var, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return lVar.openReadWrite(h0Var, z10, z11);
    }

    public static /* synthetic */ p0 sink$default(l lVar, h0 h0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return lVar.sink(h0Var, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX INFO: renamed from: -read, reason: not valid java name */
    public final <T> T m225read(@NotNull h0 file, @NotNull Function1<? super g, ? extends T> readerAction) {
        ?? r8;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(readerAction, "readerAction");
        g gVarC = b0.c(source(file));
        T th2 = null;
        try {
            T tInvoke = readerAction.invoke(gVarC);
            kotlin.jvm.internal.l.b(1);
            if (gVarC != null) {
                try {
                    gVarC.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            kotlin.jvm.internal.l.a(1);
            T t8 = th2;
            th2 = tInvoke;
            r8 = t8;
        } catch (Throwable th4) {
            kotlin.jvm.internal.l.b(1);
            if (gVarC != null) {
                try {
                    gVarC.close();
                } catch (Throwable th5) {
                    jt.a.a(th4, th5);
                }
            }
            kotlin.jvm.internal.l.a(1);
            r8 = th4;
        }
        if (r8 == 0) {
            return th2;
        }
        throw r8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX INFO: renamed from: -write, reason: not valid java name */
    public final <T> T m226write(@NotNull h0 file, boolean mustCreate, @NotNull Function1<? super f, ? extends T> writerAction) {
        ?? r8;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(writerAction, "writerAction");
        f fVarB = b0.b(sink(file, mustCreate));
        T th2 = null;
        try {
            T tInvoke = writerAction.invoke(fVarB);
            kotlin.jvm.internal.l.b(1);
            if (fVarB != null) {
                try {
                    fVarB.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            kotlin.jvm.internal.l.a(1);
            T t8 = th2;
            th2 = tInvoke;
            r8 = t8;
        } catch (Throwable th4) {
            kotlin.jvm.internal.l.b(1);
            if (fVarB != null) {
                try {
                    fVarB.close();
                } catch (Throwable th5) {
                    jt.a.a(th4, th5);
                }
            }
            kotlin.jvm.internal.l.a(1);
            r8 = th4;
        }
        if (r8 == 0) {
            return th2;
        }
        throw r8;
    }

    @NotNull
    public final p0 appendingSink(@NotNull h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return appendingSink(file, false);
    }

    @NotNull
    public abstract p0 appendingSink(@NotNull h0 file, boolean mustExist);

    public abstract void atomicMove(@NotNull h0 source, @NotNull h0 target);

    @NotNull
    public abstract h0 canonicalize(@NotNull h0 path);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void copy(@NotNull h0 source, @NotNull h0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        yu.d.b(this, source, target);
    }

    public final void createDirectories(@NotNull h0 dir, boolean mustCreate) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        yu.d.c(this, dir, mustCreate);
    }

    public final void createDirectory(@NotNull h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        createDirectory(dir, false);
    }

    public abstract void createDirectory(@NotNull h0 dir, boolean mustCreate);

    public abstract void createSymlink(@NotNull h0 source, @NotNull h0 target);

    public final void delete(@NotNull h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        delete(path, false);
    }

    public abstract void delete(@NotNull h0 path, boolean mustExist);

    public void deleteRecursively(@NotNull h0 fileOrDirectory, boolean mustExist) {
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        yu.d.d(this, fileOrDirectory, mustExist);
    }

    public final boolean exists(@NotNull h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return yu.d.e(this, path);
    }

    @NotNull
    public abstract List<h0> list(@NotNull h0 dir);

    @Nullable
    public abstract List<h0> listOrNull(@NotNull h0 dir);

    @NotNull
    public Sequence<h0> listRecursively(@NotNull h0 dir, boolean followSymlinks) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return yu.d.f(this, dir, followSymlinks);
    }

    @NotNull
    public final k metadata(@NotNull h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return yu.d.g(this, path);
    }

    @Nullable
    public abstract k metadataOrNull(@NotNull h0 path);

    @NotNull
    public abstract j openReadOnly(@NotNull h0 file);

    @NotNull
    public final j openReadWrite(@NotNull h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return openReadWrite(file, false, false);
    }

    @NotNull
    public abstract j openReadWrite(@NotNull h0 file, boolean mustCreate, boolean mustExist);

    @NotNull
    public final p0 sink(@NotNull h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return sink(file, false);
    }

    @NotNull
    public abstract p0 sink(@NotNull h0 file, boolean mustCreate);

    @NotNull
    public abstract r0 source(@NotNull h0 file);

    public final void createDirectories(@NotNull h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        createDirectories(dir, false);
    }

    public final void deleteRecursively(@NotNull h0 fileOrDirectory) {
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        deleteRecursively(fileOrDirectory, false);
    }

    @NotNull
    public final Sequence<h0> listRecursively(@NotNull h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return listRecursively(dir, false);
    }
}
