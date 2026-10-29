package p560xu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7707t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xu.x */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010!J\u001f\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010%J\u001f\u0010*\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010(J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020#*\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020#*\u00020\u0004H\u0002¢\u0006\u0004\b0\u0010/¨\u00061"}, m31665d2 = {"Lxu/x;", "Lxu/l;", "<init>", "()V", "Lxu/h0;", "dir", "", "throwOnFailure", "", "a", "(Lxu/h0;Z)Ljava/util/List;", "path", "canonicalize", "(Lxu/h0;)Lxu/h0;", "Lxu/k;", "metadataOrNull", "(Lxu/h0;)Lxu/k;", "list", "(Lxu/h0;)Ljava/util/List;", "listOrNull", "file", "Lxu/j;", "openReadOnly", "(Lxu/h0;)Lxu/j;", "mustCreate", "mustExist", "openReadWrite", "(Lxu/h0;ZZ)Lxu/j;", "Lxu/r0;", Payload.SOURCE, "(Lxu/h0;)Lxu/r0;", "Lxu/p0;", "sink", "(Lxu/h0;Z)Lxu/p0;", "appendingSink", "", "createDirectory", "(Lxu/h0;Z)V", "target", "atomicMove", "(Lxu/h0;Lxu/h0;)V", "delete", "createSymlink", "", "toString", "()Ljava/lang/String;", "c", "(Lxu/h0;)V", "b", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public class C12961x extends AbstractC12938l {
    /* JADX INFO: renamed from: a */
    private final List<C12931h0> m48205a(C12931h0 dir, boolean throwOnFailure) throws IOException {
        File file = dir.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                Intrinsics.checkNotNull(str);
                arrayList.add(dir.m48129n(str));
            }
            C7707t.m31918x(arrayList);
            return arrayList;
        }
        if (!throwOnFailure) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + dir);
        }
        throw new FileNotFoundException("no such file: " + dir);
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public InterfaceC12947p0 appendingSink(@NotNull C12931h0 file, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (mustExist) {
            m48207c(file);
        }
        return C12919b0.m47963e(file.toFile(), true);
    }

    @Override // p560xu.AbstractC12938l
    public void atomicMove(@NotNull C12931h0 source, @NotNull C12931h0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    /* JADX INFO: renamed from: b */
    public final void m48206b(C12931h0 c12931h0) throws IOException {
        if (exists(c12931h0)) {
            throw new IOException(c12931h0 + " already exists.");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m48207c(C12931h0 c12931h0) throws IOException {
        if (exists(c12931h0)) {
            return;
        }
        throw new IOException(c12931h0 + " doesn't exist.");
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public C12931h0 canonicalize(@NotNull C12931h0 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        File canonicalFile = path.toFile().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new FileNotFoundException("no such file");
        }
        C12931h0.Companion companion = C12931h0.INSTANCE;
        Intrinsics.checkNotNull(canonicalFile);
        return C12931h0.Companion.m48134d(companion, canonicalFile, false, 1, null);
    }

    @Override // p560xu.AbstractC12938l
    public void createDirectory(@NotNull C12931h0 dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        C12936k c12936kMetadataOrNull = metadataOrNull(dir);
        if (c12936kMetadataOrNull == null || !c12936kMetadataOrNull.getIsDirectory()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (mustCreate) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // p560xu.AbstractC12938l
    public void createSymlink(@NotNull C12931h0 source, @NotNull C12931h0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("unsupported");
    }

    @Override // p560xu.AbstractC12938l
    public void delete(@NotNull C12931h0 path, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (mustExist) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public List<C12931h0> list(@NotNull C12931h0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<C12931h0> listM48205a = m48205a(dir, true);
        Intrinsics.checkNotNull(listM48205a);
        return listM48205a;
    }

    @Override // p560xu.AbstractC12938l
    @Nullable
    public List<C12931h0> listOrNull(@NotNull C12931h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return m48205a(dir, false);
    }

    @Override // p560xu.AbstractC12938l
    @Nullable
    public C12936k metadataOrNull(@NotNull C12931h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new C12936k(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public AbstractC12934j openReadOnly(@NotNull C12931h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new C12960w(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public AbstractC12934j openReadWrite(@NotNull C12931h0 file, boolean mustCreate, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (mustCreate && mustExist) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if (mustCreate) {
            m48206b(file);
        }
        if (mustExist) {
            m48207c(file);
        }
        return new C12960w(true, new RandomAccessFile(file.toFile(), "rw"));
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public InterfaceC12947p0 sink(@NotNull C12931h0 file, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (mustCreate) {
            m48206b(file);
        }
        return C12921c0.m47981c(file.toFile(), false, 1, null);
    }

    @Override // p560xu.AbstractC12938l
    @NotNull
    public InterfaceC12951r0 source(@NotNull C12931h0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return C12919b0.m47967i(file.toFile());
    }

    @NotNull
    public String toString() {
        return "JvmSystemFileSystem";
    }
}
