package g6;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lg6/p;", BuildConfig.FLAVOR, "Lg6/o;", "systemIdInfo", BuildConfig.FLAVOR, "b", "(Lg6/o;)V", BuildConfig.FLAVOR, "workSpecId", BuildConfig.FLAVOR, "generation", "c", "(Ljava/lang/String;I)Lg6/o;", "Lg6/w;", "id", "a", "(Lg6/w;)Lg6/o;", "e", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "d", "()Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface p {
    @Nullable
    default SystemIdInfo a(@NotNull WorkGenerationalId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return c(id2.getWorkSpecId(), id2.getGeneration());
    }

    void b(@NotNull SystemIdInfo systemIdInfo);

    @Nullable
    SystemIdInfo c(@NotNull String workSpecId, int generation);

    @NotNull
    List<String> d();

    void e(@NotNull String workSpecId);
}
