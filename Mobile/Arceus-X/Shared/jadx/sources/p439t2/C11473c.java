package p439t2;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: t2.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Landroid/net/Uri;", "Ljava/io/File;", "a", "(Landroid/net/Uri;)Ljava/io/File;", "core-ktx_release"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C11473c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final File m42954a(@NotNull Uri uri) {
        if (!Intrinsics.m31980c(uri.getScheme(), "file")) {
            throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
    }
}
