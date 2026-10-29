package p440t3;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: t3.v */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"Ljava/io/File;", "file", "Lt3/t;", "a", "(Ljava/io/File;)Lt3/t;", "datastore-core_release"}, m31666k = 2, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C11506v {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC11504t m43066a(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "file.canonicalFile.absolutePath");
        return C11505u.m43065a(absolutePath);
    }
}
