package p560xu;

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
import p229jt.C7328a;
import p588yu.C13461j;
import p588yu.C13466o;
import p588yu.C13471t;

/* JADX INFO: renamed from: xu.u0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 92\u00020\u0001:\u00012B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010(J\u001f\u0010+\u001a\u00020*2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020*2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020*2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b0\u0010,J\u001f\u00101\u001a\u00020*2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u0010/J\u0017\u00102\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b2\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00104R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, m31665d2 = {"Lxu/u0;", "Lxu/l;", "Lxu/h0;", "zipPath", "fileSystem", "", "Lyu/o;", "entries", "", "comment", "<init>", "(Lxu/h0;Lxu/l;Ljava/util/Map;Ljava/lang/String;)V", "dir", "", "throwOnFailure", "", "b", "(Lxu/h0;Z)Ljava/util/List;", "path", "canonicalize", "(Lxu/h0;)Lxu/h0;", "Lxu/k;", "metadataOrNull", "(Lxu/h0;)Lxu/k;", "file", "Lxu/j;", "openReadOnly", "(Lxu/h0;)Lxu/j;", "mustCreate", "mustExist", "openReadWrite", "(Lxu/h0;ZZ)Lxu/j;", "list", "(Lxu/h0;)Ljava/util/List;", "listOrNull", "Lxu/r0;", Payload.SOURCE, "(Lxu/h0;)Lxu/r0;", "Lxu/p0;", "sink", "(Lxu/h0;Z)Lxu/p0;", "appendingSink", "", "createDirectory", "(Lxu/h0;Z)V", "target", "atomicMove", "(Lxu/h0;Lxu/h0;)V", "delete", "createSymlink", "a", "Lxu/h0;", "Lxu/l;", "c", "Ljava/util/Map;", "d", "Ljava/lang/String;", "e", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12957u0 extends AbstractC12938l {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final C12931h0 f45906f = C12931h0.Companion.m48135e(C12931h0.INSTANCE, "/", false, 1, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C12931h0 zipPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12938l fileSystem;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<C12931h0, C13466o> entries;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String comment;

    public C12957u0(@NotNull C12931h0 zipPath, @NotNull AbstractC12938l fileSystem, @NotNull Map<C12931h0, C13466o> entries, @Nullable String str) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.zipPath = zipPath;
        this.fileSystem = fileSystem;
        this.entries = entries;
        this.comment = str;
    }

    /* JADX INFO: renamed from: b */
    private final List<C12931h0> m48200b(C12931h0 dir, boolean throwOnFailure) throws IOException {
        C13466o c13466o = this.entries.get(m48201a(dir));
        if (c13466o != null) {
            return CollectionsKt.m31687M0(c13466o.m49126c());
        }
        if (!throwOnFailure) {
            return null;
        }
        throw new IOException("not a directory: " + dir);
    }

    /* JADX INFO: renamed from: a */
    public final C12931h0 m48201a(C12931h0 path) {
        return f45906f.m48131q(path, true);
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public InterfaceC12947p0 appendingSink(@NotNull C12931h0 file, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p560xu.AbstractC12938l
    public void atomicMove(@NotNull C12931h0 source, @NotNull C12931h0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public C12931h0 canonicalize(@NotNull C12931h0 path) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(path, "path");
        C12931h0 c12931h0M48201a = m48201a(path);
        if (this.entries.containsKey(c12931h0M48201a)) {
            return c12931h0M48201a;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    @Override // p560xu.AbstractC12938l
    public void createDirectory(@NotNull C12931h0 dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p560xu.AbstractC12938l
    public void createSymlink(@NotNull C12931h0 source, @NotNull C12931h0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p560xu.AbstractC12938l
    public void delete(@NotNull C12931h0 path, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public List<C12931h0> list(@NotNull C12931h0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<C12931h0> listM48200b = m48200b(dir, true);
        Intrinsics.checkNotNull(listM48200b);
        return listM48200b;
    }

    @Override // p560xu.AbstractC12938l
    @Nullable
    public List<C12931h0> listOrNull(@NotNull C12931h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return m48200b(dir, false);
    }

    @Override // p560xu.AbstractC12938l
    @Nullable
    public C12936k metadataOrNull(@NotNull C12931h0 path) throws Throwable {
        Throwable th2;
        Throwable th3;
        Intrinsics.checkNotNullParameter(path, "path");
        C13466o c13466oM49151q = this.entries.get(m48201a(path));
        if (c13466oM49151q == null) {
            return null;
        }
        if (c13466oM49151q.getOffset() != -1) {
            AbstractC12934j abstractC12934jOpenReadOnly = this.fileSystem.openReadOnly(this.zipPath);
            try {
                InterfaceC12928g interfaceC12928gM47961c = C12919b0.m47961c(abstractC12934jOpenReadOnly.m48151l(c13466oM49151q.getOffset()));
                try {
                    c13466oM49151q = C13471t.m49151q(interfaceC12928gM47961c, c13466oM49151q);
                    if (interfaceC12928gM47961c != null) {
                        try {
                            interfaceC12928gM47961c.close();
                        } catch (Throwable th4) {
                            th3 = th4;
                        }
                    }
                    th3 = null;
                } catch (Throwable th5) {
                    if (interfaceC12928gM47961c != null) {
                        try {
                            interfaceC12928gM47961c.close();
                        } catch (Throwable th6) {
                            C7328a.m30429a(th5, th6);
                        }
                    }
                    th3 = th5;
                    c13466oM49151q = null;
                }
                if (th3 != null) {
                    throw th3;
                }
                if (abstractC12934jOpenReadOnly != null) {
                    try {
                        abstractC12934jOpenReadOnly.close();
                    } catch (Throwable th7) {
                        th2 = th7;
                    }
                }
                th2 = null;
            } catch (Throwable th8) {
                if (abstractC12934jOpenReadOnly != null) {
                    try {
                        abstractC12934jOpenReadOnly.close();
                    } catch (Throwable th9) {
                        C7328a.m30429a(th8, th9);
                    }
                }
                th2 = th8;
                c13466oM49151q = null;
            }
            if (th2 != null) {
                throw th2;
            }
        }
        return new C12936k(!c13466oM49151q.getIsDirectory(), c13466oM49151q.getIsDirectory(), null, c13466oM49151q.getIsDirectory() ? null : Long.valueOf(c13466oM49151q.getSize()), c13466oM49151q.m49129f(), c13466oM49151q.m49131h(), c13466oM49151q.m49130g(), null, 128, null);
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public AbstractC12934j openReadOnly(@NotNull C12931h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public AbstractC12934j openReadWrite(@NotNull C12931h0 file, boolean mustCreate, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public InterfaceC12947p0 sink(@NotNull C12931h0 file, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0034 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // p560xu.AbstractC12938l
    @NotNull
    public InterfaceC12951r0 source(@NotNull C12931h0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        C13466o c13466o = this.entries.get(m48201a(file));
        if (c13466o == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        AbstractC12934j abstractC12934jOpenReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        InterfaceC12928g th2 = null;
        try {
            InterfaceC12928g interfaceC12928gM47961c = C12919b0.m47961c(abstractC12934jOpenReadOnly.m48151l(c13466o.getOffset()));
            if (abstractC12934jOpenReadOnly != null) {
                try {
                    abstractC12934jOpenReadOnly.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = interfaceC12928gM47961c;
        } catch (Throwable th4) {
            th = th4;
            if (abstractC12934jOpenReadOnly != null) {
                try {
                    abstractC12934jOpenReadOnly.close();
                } catch (Throwable th5) {
                    C7328a.m30429a(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        C13471t.m49155u(th2);
        return c13466o.getCompressionMethod() == 0 ? new C13461j(th2, c13466o.getSize(), true) : new C13461j(new C12956u(new C13461j(th2, c13466o.getCompressedSize(), true), new Inflater(true)), c13466o.getSize(), false);
    }
}
