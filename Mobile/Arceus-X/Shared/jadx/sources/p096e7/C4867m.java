package p096e7;

import android.os.StatFs;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p560xu.AbstractC12938l;
import p560xu.C12931h0;

/* JADX INFO: renamed from: e7.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Lxu/l;", "Lxu/h0;", "directory", "", "a", "(Lxu/l;Lxu/h0;)J", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4867m {
    /* JADX INFO: renamed from: a */
    public static final long m23473a(@NotNull AbstractC12938l abstractC12938l, @NotNull C12931h0 c12931h0) {
        File file = c12931h0.toFile();
        file.mkdir();
        StatFs statFs = new StatFs(file.getAbsolutePath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }
}
