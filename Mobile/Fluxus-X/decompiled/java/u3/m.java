package u3;

import com.github.luben.zstd.BuildConfig;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljava/io/File;", "toFile", BuildConfig.FLAVOR, "a", "(Ljava/io/File;Ljava/io/File;)Z", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m {
    public static final boolean a(@NotNull File file, @NotNull File toFile) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(toFile, "toFile");
        return a.f32911a.a(file, toFile);
    }
}
