package e7;

import android.os.StatFs;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxu/l;", "Lxu/h0;", "directory", "", "a", "(Lxu/l;Lxu/h0;)J", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final long a(@NotNull xu.l lVar, @NotNull xu.h0 h0Var) {
        File file = h0Var.toFile();
        file.mkdir();
        StatFs statFs = new StatFs(file.getAbsolutePath());
        return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
    }
}
