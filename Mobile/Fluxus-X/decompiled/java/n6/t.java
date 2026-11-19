package n6;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import ew.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lew/b0;", "file", "Lew/k;", "fileSystem", BuildConfig.FLAVOR, "diskCacheKey", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Ln6/s$a;", "metadata", "Ln6/s;", "b", "(Lew/b0;Lew/k;Ljava/lang/String;Ljava/lang/AutoCloseable;Ln6/s$a;)Ln6/s;", "Lew/g;", Payload.SOURCE, "a", "(Lew/g;Lew/k;Ln6/s$a;)Ln6/s;", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {
    @NotNull
    public static final s a(@NotNull ew.g gVar, @NotNull ew.k kVar, @Nullable s.a aVar) {
        return new v(gVar, kVar, aVar);
    }

    @NotNull
    public static final s b(@NotNull b0 b0Var, @NotNull ew.k kVar, @Nullable String str, @Nullable AutoCloseable autoCloseable, @Nullable s.a aVar) {
        return new r(b0Var, kVar, str, autoCloseable, aVar);
    }

    public static /* synthetic */ s c(ew.g gVar, ew.k kVar, s.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        return a(gVar, kVar, aVar);
    }

    public static /* synthetic */ s d(b0 b0Var, ew.k kVar, String str, AutoCloseable autoCloseable, s.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            autoCloseable = null;
        }
        if ((i10 & 16) != 0) {
            aVar = null;
        }
        return b(b0Var, kVar, str, autoCloseable, aVar);
    }
}
