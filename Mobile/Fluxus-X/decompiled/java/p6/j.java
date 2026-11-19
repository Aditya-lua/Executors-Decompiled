package p6;

import com.github.luben.zstd.BuildConfig;
import l6.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import y6.Options;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0003J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lp6/j;", BuildConfig.FLAVOR, "Lp6/i;", "a", "(Leu/b;)Ljava/lang/Object;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J)\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lp6/j$a;", BuildConfig.FLAVOR, "T", "data", "Ly6/p;", "options", "Ll6/s;", "imageLoader", "Lp6/j;", "a", "(Ljava/lang/Object;Ly6/p;Ll6/s;)Lp6/j;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a<T> {
        @Nullable
        j a(@NotNull T data, @NotNull Options options, @NotNull s imageLoader);
    }

    @Nullable
    Object a(@NotNull eu.b<? super i> bVar);
}
