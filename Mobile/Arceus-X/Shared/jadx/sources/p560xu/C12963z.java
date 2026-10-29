package p560xu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7697o;
import kotlin.collections.C7707t;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p528wt.C12569c;

/* JADX INFO: renamed from: xu.z */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010 J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b(\u0010$J\u001f\u0010)\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010'J\u000f\u0010*\u001a\u00020\"H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\u00020/*\u00020\u0006H\u0002¢\u0006\u0004\b0\u00101J'\u00103\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0016H\u0002¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00105¨\u00066"}, m31665d2 = {"Lxu/z;", "Lxu/a0;", "Ljava/nio/file/FileSystem;", "nioFileSystem", "<init>", "(Ljava/nio/file/FileSystem;)V", "Lxu/h0;", "path", "canonicalize", "(Lxu/h0;)Lxu/h0;", "Lxu/k;", "metadataOrNull", "(Lxu/h0;)Lxu/k;", "dir", "", "list", "(Lxu/h0;)Ljava/util/List;", "listOrNull", "file", "Lxu/j;", "openReadOnly", "(Lxu/h0;)Lxu/j;", "", "mustCreate", "mustExist", "openReadWrite", "(Lxu/h0;ZZ)Lxu/j;", "Lxu/r0;", Payload.SOURCE, "(Lxu/h0;)Lxu/r0;", "Lxu/p0;", "sink", "(Lxu/h0;Z)Lxu/p0;", "appendingSink", "", "createDirectory", "(Lxu/h0;Z)V", "target", "atomicMove", "(Lxu/h0;Lxu/h0;)V", "delete", "createSymlink", "close", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/nio/file/Path;", "f", "(Lxu/h0;)Ljava/nio/file/Path;", "throwOnFailure", "a", "(Lxu/h0;Z)Ljava/util/List;", "Ljava/nio/file/FileSystem;", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12963z extends C12917a0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final FileSystem nioFileSystem;

    public C12963z(@NotNull FileSystem nioFileSystem) {
        Intrinsics.checkNotNullParameter(nioFileSystem, "nioFileSystem");
        this.nioFileSystem = nioFileSystem;
    }

    /* JADX DEBUG: Class process forced to load method for inline: wt.c.b(java.nio.file.Path, java.lang.String, int, java.lang.Object):java.util.List */
    /* JADX INFO: renamed from: a */
    public final List<C12931h0> m48208a(C12931h0 dir, boolean throwOnFailure) throws IOException {
        Path pathM48209f = m48209f(dir);
        try {
            List listM46921b = C12569c.m46921b(pathM48209f, null, 1, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listM46921b.iterator();
            while (it.hasNext()) {
                arrayList.add(C12931h0.Companion.m48136f(C12931h0.INSTANCE, (Path) it.next(), false, 1, null));
            }
            C7707t.m31918x(arrayList);
            return arrayList;
        } catch (Exception unused) {
            if (!throwOnFailure) {
                return null;
            }
            if (Files.exists(pathM48209f, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException("failed to list " + dir);
            }
            throw new FileNotFoundException("no such file: " + dir);
        }
    }

    @Override // p560xu.C12961x, p560xu.AbstractC12938l
    @NotNull
    public InterfaceC12947p0 appendingSink(@NotNull C12931h0 file, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        List listM31877c = C7697o.m31877c();
        listM31877c.add(StandardOpenOption.APPEND);
        if (!mustExist) {
            listM31877c.add(StandardOpenOption.CREATE);
        }
        List listM31875a = C7697o.m31875a(listM31877c);
        Path pathM48209f = m48209f(file);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listM31875a.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathM48209f, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        return C12919b0.m47964f(outputStreamNewOutputStream);
    }

    @Override // p560xu.C12917a0, p560xu.C12961x, p560xu.AbstractC12938l
    public void atomicMove(@NotNull C12931h0 source, @NotNull C12931h0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Intrinsics.checkNotNullExpressionValue(Files.move(m48209f(source), m48209f(target), (CopyOption[]) Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2)), "move(...)");
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // p560xu.C12961x, p560xu.AbstractC12938l
    @NotNull
    public C12931h0 canonicalize(@NotNull C12931h0 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            C12931h0.Companion companion = C12931h0.INSTANCE;
            Path realPath = m48209f(path).toRealPath(new LinkOption[0]);
            Intrinsics.checkNotNullExpressionValue(realPath, "toRealPath(...)");
            return C12931h0.Companion.m48136f(companion, realPath, false, 1, null);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // p560xu.AbstractC12938l, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.nioFileSystem.close();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // p560xu.C12961x, p560xu.AbstractC12938l
    public void createDirectory(@NotNull C12931h0 dir, boolean mustCreate) throws IOException {
        boolean z10;
        Intrinsics.checkNotNullParameter(dir, "dir");
        C12936k c12936kMetadataOrNull = metadataOrNull(dir);
        if (c12936kMetadataOrNull != null) {
            z10 = c12936kMetadataOrNull.getIsDirectory();
        }
        if (z10 && mustCreate) {
            throw new IOException(dir + " already exists.");
        }
        try {
            Intrinsics.checkNotNullExpressionValue(Files.createDirectory(m48209f(dir), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createDirectory(...)");
        } catch (IOException e10) {
            if (z10) {
                return;
            }
            throw new IOException("failed to create directory: " + dir, e10);
        }
    }

    @Override // p560xu.C12917a0, p560xu.C12961x, p560xu.AbstractC12938l
    public void createSymlink(@NotNull C12931h0 source, @NotNull C12931h0 target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullExpressionValue(Files.createSymbolicLink(m48209f(source), m48209f(target), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createSymbolicLink(...)");
    }

    @Override // p560xu.C12961x, p560xu.AbstractC12938l
    public void delete(@NotNull C12931h0 path, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        Path pathM48209f = m48209f(path);
        try {
            Files.delete(pathM48209f);
        } catch (NoSuchFileException unused) {
            if (mustExist) {
                throw new FileNotFoundException("no such file: " + path);
            }
        } catch (IOException unused2) {
            if (Files.exists(pathM48209f, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException("failed to delete " + path);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final Path m48209f(C12931h0 c12931h0) {
        Path path = this.nioFileSystem.getPath(c12931h0.toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }

    @Override // p560xu.C12961x, p560xu.AbstractC12938l
    @NotNull
    public List<C12931h0> list(@NotNull C12931h0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<C12931h0> listM48208a = m48208a(dir, true);
        Intrinsics.checkNotNull(listM48208a);
        return listM48208a;
    }

    @Override // p560xu.C12961x, p560xu.AbstractC12938l
    @Nullable
    public List<C12931h0> listOrNull(@NotNull C12931h0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return m48208a(dir, false);
    }

    @Override // p560xu.C12917a0, p560xu.C12961x, p560xu.AbstractC12938l
    @Nullable
    public C12936k metadataOrNull(@NotNull C12931h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return m47945d(m48209f(path));
    }

    @Override // p560xu.C12961x, p560xu.AbstractC12938l
    @NotNull
    public AbstractC12934j openReadOnly(@NotNull C12931h0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            FileChannel fileChannelOpen = FileChannel.open(m48209f(file), StandardOpenOption.READ);
            Intrinsics.checkNotNull(fileChannelOpen);
            return new C12962y(false, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // p560xu.C12961x, p560xu.AbstractC12938l
    @NotNull
    public AbstractC12934j openReadWrite(@NotNull C12931h0 file, boolean mustCreate, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (mustCreate && mustExist) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        List listM31877c = C7697o.m31877c();
        listM31877c.add(StandardOpenOption.READ);
        listM31877c.add(StandardOpenOption.WRITE);
        if (mustCreate) {
            listM31877c.add(StandardOpenOption.CREATE_NEW);
        } else if (!mustExist) {
            listM31877c.add(StandardOpenOption.CREATE);
        }
        List listM31875a = C7697o.m31875a(listM31877c);
        try {
            Path pathM48209f = m48209f(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listM31875a.toArray(new StandardOpenOption[0]);
            FileChannel fileChannelOpen = FileChannel.open(pathM48209f, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            Intrinsics.checkNotNull(fileChannelOpen);
            return new C12962y(true, fileChannelOpen);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // p560xu.C12961x, p560xu.AbstractC12938l
    @NotNull
    public InterfaceC12947p0 sink(@NotNull C12931h0 file, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        List listM31877c = C7697o.m31877c();
        if (mustCreate) {
            listM31877c.add(StandardOpenOption.CREATE_NEW);
        }
        List listM31875a = C7697o.m31875a(listM31877c);
        try {
            Path pathM48209f = m48209f(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) listM31875a.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream outputStreamNewOutputStream = Files.newOutputStream(pathM48209f, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            Intrinsics.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
            return C12919b0.m47964f(outputStreamNewOutputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // p560xu.C12961x, p560xu.AbstractC12938l
    @NotNull
    public InterfaceC12951r0 source(@NotNull C12931h0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(m48209f(file), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            Intrinsics.checkNotNullExpressionValue(inputStreamNewInputStream, "newInputStream(...)");
            return C12919b0.m47968j(inputStreamNewInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // p560xu.C12917a0, p560xu.C12961x
    @NotNull
    public String toString() {
        String strMo28427g = C7731d0.m32002b(this.nioFileSystem.getClass()).mo28427g();
        Intrinsics.checkNotNull(strMo28427g);
        return strMo28427g;
    }
}
