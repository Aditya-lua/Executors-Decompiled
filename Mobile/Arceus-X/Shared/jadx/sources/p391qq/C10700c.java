package p391qq;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p477ut.C11966k;

/* JADX INFO: renamed from: qq.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\nJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u000e*\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u001b"}, m31665d2 = {"Lqq/c;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "extension", "Ljava/io/File;", "d", "(Ljava/lang/String;)Ljava/io/File;", "fileName", "f", "e", "", "a", "()V", "", "b", "()Ljava/util/List;", "c", "(Ljava/io/File;)V", "Ljava/io/File;", "sdkCacheDir", "sdkDir", "sessionDir", "sessionCacheDir", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10700c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final File sdkCacheDir;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final File sdkDir;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final File sessionDir;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final File sessionCacheDir;

    public C10700c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(context.getCacheDir(), ".com.withpersona.sdk2.inquiry");
        this.sdkCacheDir = file;
        File file2 = new File(context.getFilesDir(), ".com.withpersona.sdk2.inquiry");
        this.sdkDir = file2;
        this.sessionDir = new File(file2, "sess");
        this.sessionCacheDir = new File(file, "sess");
    }

    /* JADX INFO: renamed from: a */
    public final void m40778a() {
        C11966k.m44657o(this.sessionDir);
        C11966k.m44657o(this.sessionCacheDir);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<File> m40779b() {
        return C7699p.m31895n(this.sessionDir, this.sessionCacheDir);
    }

    /* JADX INFO: renamed from: c */
    public final void m40780c(File file) {
        if (file.exists()) {
            if (!file.isFile()) {
                return;
            } else {
                file.delete();
            }
        }
        file.mkdirs();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final File m40781d(@NotNull String extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        m40780c(this.sdkCacheDir);
        return new File(this.sdkCacheDir, UUID.randomUUID() + "." + extension);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final File m40782e(@NotNull String extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        m40780c(this.sessionDir);
        return new File(this.sessionDir, UUID.randomUUID() + "." + extension);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final File m40783f(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        m40780c(this.sessionDir);
        return new File(this.sessionDir, fileName);
    }
}
