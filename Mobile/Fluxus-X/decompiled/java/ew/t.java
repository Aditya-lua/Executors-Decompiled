package ew;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010\u001dJ\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0014H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\u001b*\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\u00020\u001b*\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010*¨\u0006,"}, d2 = {"Lew/t;", "Lew/k;", "<init>", "()V", "Lew/b0;", "path", "Lew/j;", "p", "(Lew/b0;)Lew/j;", "dir", BuildConfig.FLAVOR, "n", "(Lew/b0;)Ljava/util/List;", "file", "Lew/i;", "r", "(Lew/b0;)Lew/i;", "Lew/l0;", "w", "(Lew/b0;)Lew/l0;", BuildConfig.FLAVOR, "mustCreate", "Lew/j0;", "u", "(Lew/b0;Z)Lew/j0;", "mustExist", "b", BuildConfig.FLAVOR, "f", "(Lew/b0;Z)V", Payload.SOURCE, "target", "c", "(Lew/b0;Lew/b0;)V", "k", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "throwOnFailure", "y", "(Lew/b0;Z)Ljava/util/List;", "A", "(Lew/b0;)V", "z", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class t extends k {
    public final void A(b0 b0Var) throws IOException {
        if (m(b0Var)) {
            return;
        }
        throw new IOException(b0Var + " doesn't exist.");
    }

    @Override // ew.k
    @NotNull
    public j0 b(@NotNull b0 file, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (mustExist) {
            A(file);
        }
        return v.e(file.toFile(), true);
    }

    @Override // ew.k
    public void c(@NotNull b0 source, @NotNull b0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // ew.k
    public void f(@NotNull b0 dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        j jVarP = p(dir);
        if (jVarP == null || !jVarP.getIsDirectory()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (mustCreate) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // ew.k
    public void k(@NotNull b0 path, boolean mustExist) throws IOException {
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

    @Override // ew.k
    @NotNull
    public List<b0> n(@NotNull b0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<b0> listY = y(dir, true);
        Intrinsics.checkNotNull(listY);
        return listY;
    }

    @Override // ew.k
    @Nullable
    public j p(@NotNull b0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new j(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, Barcode.FORMAT_ITF, null);
    }

    @Override // ew.k
    @NotNull
    public i r(@NotNull b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new s(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @NotNull
    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // ew.k
    @NotNull
    public j0 u(@NotNull b0 file, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (mustCreate) {
            z(file);
        }
        return w.c(file.toFile(), false, 1, null);
    }

    @Override // ew.k
    @NotNull
    public l0 w(@NotNull b0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return v.i(file.toFile());
    }

    public final List<b0> y(b0 dir, boolean throwOnFailure) throws IOException {
        File file = dir.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                Intrinsics.checkNotNull(str);
                arrayList.add(dir.p(str));
            }
            p001kotlin.collections.t.x(arrayList);
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

    public final void z(b0 b0Var) throws IOException {
        if (m(b0Var)) {
            throw new IOException(b0Var + " already exists.");
        }
    }
}
