package p560xu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.Closeable;
import java.nio.file.FileSystem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7745l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7328a;
import p588yu.C13455d;
import p588yu.C13464m;

/* JADX INFO: renamed from: xu.l */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\b&\u0018\u0000 D2\u00060\u0001j\u0002`\u0002:\u0001EB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\u0010\u001a\u00020\u0005H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0005H&¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0005H&¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010 \u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b \u0010!J\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0005H&¢\u0006\u0004\b#\u0010$JB\u0010+\u001a\u00028\u0000\"\u0004\b\u0000\u0010%2\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00028\u00000&H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\rH&¢\u0006\u0004\b-\u0010.J\u0015\u0010-\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b-\u0010/JL\u00104\u001a\u00028\u0000\"\u0004\b\u0000\u0010%2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\r2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000&H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001¢\u0006\u0004\b2\u00103J!\u00105\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b5\u0010.J\u0015\u00105\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b5\u0010/J!\u00107\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\rH&¢\u0006\u0004\b7\u00108J\u0015\u00107\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b7\u00109J\u001f\u0010:\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b:\u00108J\u0015\u0010:\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b:\u00109J\u001f\u0010<\u001a\u0002062\u0006\u0010#\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H&¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u0002062\u0006\u0010#\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H\u0016¢\u0006\u0004\b>\u0010=J!\u0010?\u001a\u0002062\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b?\u00108J\u0015\u0010?\u001a\u0002062\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b?\u00109J!\u0010A\u001a\u0002062\u0006\u0010@\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\bA\u00108J\u0015\u0010A\u001a\u0002062\u0006\u0010@\u001a\u00020\u0005¢\u0006\u0004\bA\u00109J\u001f\u0010B\u001a\u0002062\u0006\u0010#\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005H&¢\u0006\u0004\bB\u0010=J\u000f\u0010C\u001a\u000206H\u0016¢\u0006\u0004\bC\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006F"}, m31665d2 = {"Lxu/l;", "Ljava/io/Closeable;", "Lokio/Closeable;", "<init>", "()V", "Lxu/h0;", "path", "canonicalize", "(Lxu/h0;)Lxu/h0;", "Lxu/k;", "metadata", "(Lxu/h0;)Lxu/k;", "metadataOrNull", "", "exists", "(Lxu/h0;)Z", "dir", "", "list", "(Lxu/h0;)Ljava/util/List;", "listOrNull", "followSymlinks", "Lkotlin/sequences/Sequence;", "listRecursively", "(Lxu/h0;Z)Lkotlin/sequences/Sequence;", "(Lxu/h0;)Lkotlin/sequences/Sequence;", "file", "Lxu/j;", "openReadOnly", "(Lxu/h0;)Lxu/j;", "mustCreate", "mustExist", "openReadWrite", "(Lxu/h0;ZZ)Lxu/j;", "Lxu/r0;", Payload.SOURCE, "(Lxu/h0;)Lxu/r0;", "T", "Lkotlin/Function1;", "Lxu/g;", "readerAction", "-read", "(Lxu/h0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "read", "Lxu/p0;", "sink", "(Lxu/h0;Z)Lxu/p0;", "(Lxu/h0;)Lxu/p0;", "Lxu/f;", "writerAction", "-write", "(Lxu/h0;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "write", "appendingSink", "", "createDirectory", "(Lxu/h0;Z)V", "(Lxu/h0;)V", "createDirectories", "target", "atomicMove", "(Lxu/h0;Lxu/h0;)V", "copy", "delete", "fileOrDirectory", "deleteRecursively", "createSymlink", "close", "Companion", "a", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC12938l implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final AbstractC12938l RESOURCES;

    @NotNull
    public static final AbstractC12938l SYSTEM;

    @NotNull
    public static final C12931h0 SYSTEM_TEMPORARY_DIRECTORY;

    /* JADX INFO: renamed from: xu.l$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, m31665d2 = {"Lxu/l$a;", "", "<init>", "()V", "Ljava/nio/file/FileSystem;", "Lxu/l;", "a", "(Ljava/nio/file/FileSystem;)Lxu/l;", "SYSTEM", "Lxu/l;", "Lxu/h0;", "SYSTEM_TEMPORARY_DIRECTORY", "Lxu/h0;", "RESOURCES", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: xu.l.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final AbstractC12938l m48164a(@NotNull FileSystem fileSystem) {
            Intrinsics.checkNotNullParameter(fileSystem, "<this>");
            return new C12963z(fileSystem);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX INFO: renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m50958write$default(AbstractC12938l abstractC12938l, C12931h0 file, boolean z10, Function1 writerAction, int i10, Object obj) {
        ?? r8;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(writerAction, "writerAction");
        InterfaceC12926f interfaceC12926fM47960b = C12919b0.m47960b(abstractC12938l.sink(file, z10));
        Object th2 = null;
        try {
            Object objInvoke = writerAction.invoke(interfaceC12926fM47960b);
            C7745l.m32060b(1);
            if (interfaceC12926fM47960b != null) {
                try {
                    interfaceC12926fM47960b.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            C7745l.m32059a(1);
            r8 = th2;
            th2 = objInvoke;
        } catch (Throwable th4) {
            C7745l.m32060b(1);
            if (interfaceC12926fM47960b != null) {
                try {
                    interfaceC12926fM47960b.close();
                } catch (Throwable th5) {
                    C7328a.m30429a(th4, th5);
                }
            }
            C7745l.m32059a(1);
            r8 = th4;
        }
        if (r8 == 0) {
            return th2;
        }
        throw r8;
    }

    static {
        AbstractC12938l c12961x;
        try {
            Class.forName("java.nio.file.Files");
            c12961x = new C12917a0();
        } catch (ClassNotFoundException unused) {
            c12961x = new C12961x();
        }
        SYSTEM = c12961x;
        C12931h0.Companion companion = C12931h0.INSTANCE;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = C12931h0.Companion.m48135e(companion, property, false, 1, null);
        ClassLoader classLoader = C13464m.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        RESOURCES = new C13464m(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ InterfaceC12947p0 appendingSink$default(AbstractC12938l abstractC12938l, C12931h0 c12931h0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return abstractC12938l.appendingSink(c12931h0, z10);
    }

    public static /* synthetic */ void createDirectories$default(AbstractC12938l abstractC12938l, C12931h0 c12931h0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        abstractC12938l.createDirectories(c12931h0, z10);
    }

    public static /* synthetic */ void createDirectory$default(AbstractC12938l abstractC12938l, C12931h0 c12931h0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        abstractC12938l.createDirectory(c12931h0, z10);
    }

    public static /* synthetic */ void delete$default(AbstractC12938l abstractC12938l, C12931h0 c12931h0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        abstractC12938l.delete(c12931h0, z10);
    }

    public static /* synthetic */ void deleteRecursively$default(AbstractC12938l abstractC12938l, C12931h0 c12931h0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        abstractC12938l.deleteRecursively(c12931h0, z10);
    }

    @NotNull
    public static final AbstractC12938l get(@NotNull FileSystem fileSystem) {
        return INSTANCE.m48164a(fileSystem);
    }

    public static /* synthetic */ Sequence listRecursively$default(AbstractC12938l abstractC12938l, C12931h0 c12931h0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return abstractC12938l.listRecursively(c12931h0, z10);
    }

    public static /* synthetic */ AbstractC12934j openReadWrite$default(AbstractC12938l abstractC12938l, C12931h0 c12931h0, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return abstractC12938l.openReadWrite(c12931h0, z10, z11);
    }

    public static /* synthetic */ InterfaceC12947p0 sink$default(AbstractC12938l abstractC12938l, C12931h0 c12931h0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return abstractC12938l.sink(c12931h0, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX INFO: renamed from: -read, reason: not valid java name */
    public final <T> T m50959read(@NotNull C12931h0 file, @NotNull Function1<? super InterfaceC12928g, ? extends T> readerAction) {
        ?? r8;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(readerAction, "readerAction");
        InterfaceC12928g interfaceC12928gM47961c = C12919b0.m47961c(source(file));
        T th2 = null;
        try {
            T tInvoke = readerAction.invoke(interfaceC12928gM47961c);
            C7745l.m32060b(1);
            if (interfaceC12928gM47961c != null) {
                try {
                    interfaceC12928gM47961c.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            C7745l.m32059a(1);
            T t8 = th2;
            th2 = tInvoke;
            r8 = t8;
        } catch (Throwable th4) {
            C7745l.m32060b(1);
            if (interfaceC12928gM47961c != null) {
                try {
                    interfaceC12928gM47961c.close();
                } catch (Throwable th5) {
                    C7328a.m30429a(th4, th5);
                }
            }
            C7745l.m32059a(1);
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
    public final <T> T m50960write(@NotNull C12931h0 file, boolean mustCreate, @NotNull Function1<? super InterfaceC12926f, ? extends T> writerAction) {
        ?? r8;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(writerAction, "writerAction");
        InterfaceC12926f interfaceC12926fM47960b = C12919b0.m47960b(sink(file, mustCreate));
        T th2 = null;
        try {
            T tInvoke = writerAction.invoke(interfaceC12926fM47960b);
            C7745l.m32060b(1);
            if (interfaceC12926fM47960b != null) {
                try {
                    interfaceC12926fM47960b.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            C7745l.m32059a(1);
            T t8 = th2;
            th2 = tInvoke;
            r8 = t8;
        } catch (Throwable th4) {
            C7745l.m32060b(1);
            if (interfaceC12926fM47960b != null) {
                try {
                    interfaceC12926fM47960b.close();
                } catch (Throwable th5) {
                    C7328a.m30429a(th4, th5);
                }
            }
            C7745l.m32059a(1);
            r8 = th4;
        }
        if (r8 == 0) {
            return th2;
        }
        throw r8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NotNull
    public final InterfaceC12947p0 appendingSink(@NotNull C12931h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return appendingSink(file, false);
    }

    @NotNull
    public abstract InterfaceC12947p0 appendingSink(@NotNull C12931h0 file, boolean mustExist);

    public abstract void atomicMove(@NotNull C12931h0 source, @NotNull C12931h0 target);

    @NotNull
    public abstract C12931h0 canonicalize(@NotNull C12931h0 path);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void copy(@NotNull C12931h0 source, @NotNull C12931h0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        C13455d.m49068b(this, source, target);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void createDirectories(@NotNull C12931h0 dir, boolean mustCreate) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        C13455d.m49069c(this, dir, mustCreate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void createDirectory(@NotNull C12931h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        createDirectory(dir, false);
    }

    public abstract void createDirectory(@NotNull C12931h0 dir, boolean mustCreate);

    public abstract void createSymlink(@NotNull C12931h0 source, @NotNull C12931h0 target);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void delete(@NotNull C12931h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        delete(path, false);
    }

    public abstract void delete(@NotNull C12931h0 path, boolean mustExist);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void deleteRecursively(@NotNull C12931h0 fileOrDirectory, boolean mustExist) {
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        C13455d.m49070d(this, fileOrDirectory, mustExist);
    }

    public final boolean exists(@NotNull C12931h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return C13455d.m49071e(this, path);
    }

    @NotNull
    public abstract List<C12931h0> list(@NotNull C12931h0 dir);

    @Nullable
    public abstract List<C12931h0> listOrNull(@NotNull C12931h0 dir);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NotNull
    public Sequence<C12931h0> listRecursively(@NotNull C12931h0 dir, boolean followSymlinks) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return C13455d.m49072f(this, dir, followSymlinks);
    }

    @NotNull
    public final C12936k metadata(@NotNull C12931h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return C13455d.m49073g(this, path);
    }

    @Nullable
    public abstract C12936k metadataOrNull(@NotNull C12931h0 path);

    @NotNull
    public abstract AbstractC12934j openReadOnly(@NotNull C12931h0 file);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NotNull
    public final AbstractC12934j openReadWrite(@NotNull C12931h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return openReadWrite(file, false, false);
    }

    @NotNull
    public abstract AbstractC12934j openReadWrite(@NotNull C12931h0 file, boolean mustCreate, boolean mustExist);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NotNull
    public final InterfaceC12947p0 sink(@NotNull C12931h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return sink(file, false);
    }

    @NotNull
    public abstract InterfaceC12947p0 sink(@NotNull C12931h0 file, boolean mustCreate);

    @NotNull
    public abstract InterfaceC12951r0 source(@NotNull C12931h0 file);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void createDirectories(@NotNull C12931h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        createDirectories(dir, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void deleteRecursively(@NotNull C12931h0 fileOrDirectory) {
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        deleteRecursively(fileOrDirectory, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @NotNull
    public final Sequence<C12931h0> listRecursively(@NotNull C12931h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return listRecursively(dir, false);
    }
}
