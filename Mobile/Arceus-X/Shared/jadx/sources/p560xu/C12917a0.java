package p560xu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xu.a0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m31665d2 = {"Lxu/a0;", "Lxu/x;", "<init>", "()V", "Lxu/h0;", "path", "Lxu/k;", "metadataOrNull", "(Lxu/h0;)Lxu/k;", "Ljava/nio/file/Path;", "nioPath", "d", "(Ljava/nio/file/Path;)Lxu/k;", Payload.SOURCE, "target", "", "atomicMove", "(Lxu/h0;Lxu/h0;)V", "createSymlink", "", "toString", "()Ljava/lang/String;", "Ljava/nio/file/attribute/FileTime;", "", "e", "(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public class C12917a0 extends C12961x {
    @Override // p560xu.C12961x, p560xu.AbstractC12938l
    public void atomicMove(@NotNull C12931h0 source, @NotNull C12931h0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Files.move(source.m48132s(), target.m48132s(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // p560xu.C12961x, p560xu.AbstractC12938l
    public void createSymlink(@NotNull C12931h0 source, @NotNull C12931h0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        Files.createSymbolicLink(source.m48132s(), target.m48132s(), new FileAttribute[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final C12936k m47945d(@NotNull Path nioPath) {
        Intrinsics.checkNotNullParameter(nioPath, "nioPath");
        try {
            BasicFileAttributes attributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(nioPath) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            C12931h0 c12931h0M48136f = symbolicLink != null ? C12931h0.Companion.m48136f(C12931h0.INSTANCE, symbolicLink, false, 1, null) : null;
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lM47946e = fileTimeCreationTime != null ? m47946e(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lM47946e2 = fileTimeLastModifiedTime != null ? m47946e(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new C12936k(zIsRegularFile, zIsDirectory, c12931h0M48136f, lValueOf, lM47946e, lM47946e2, fileTimeLastAccessTime != null ? m47946e(fileTimeLastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Long m47946e(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // p560xu.C12961x, p560xu.AbstractC12938l
    @Nullable
    public C12936k metadataOrNull(@NotNull C12931h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return m47945d(path.m48132s());
    }

    @Override // p560xu.C12961x
    @NotNull
    public String toString() {
        return "NioSystemFileSystem";
    }
}
