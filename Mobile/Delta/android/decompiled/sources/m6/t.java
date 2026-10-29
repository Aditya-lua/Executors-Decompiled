package m6;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xu.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lxu/h0;", "file", "Lxu/l;", "fileSystem", "", "diskCacheKey", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Lm6/s$a;", "metadata", "Lm6/s;", "b", "(Lxu/h0;Lxu/l;Ljava/lang/String;Ljava/lang/AutoCloseable;Lm6/s$a;)Lm6/s;", "Lxu/g;", Payload.SOURCE, "a", "(Lxu/g;Lxu/l;Lm6/s$a;)Lm6/s;", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {
    @NotNull
    public static final s a(@NotNull xu.g gVar, @NotNull xu.l lVar, @Nullable s.a aVar) {
        return new v(gVar, lVar, aVar);
    }

    @NotNull
    public static final s b(@NotNull h0 h0Var, @NotNull xu.l lVar, @Nullable String str, @Nullable AutoCloseable autoCloseable, @Nullable s.a aVar) {
        return new r(h0Var, lVar, str, autoCloseable, aVar);
    }

    public static /* synthetic */ s c(xu.g gVar, xu.l lVar, s.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        return a(gVar, lVar, aVar);
    }

    public static /* synthetic */ s d(h0 h0Var, xu.l lVar, String str, AutoCloseable autoCloseable, s.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            autoCloseable = null;
        }
        if ((i10 & 16) != 0) {
            aVar = null;
        }
        return b(h0Var, lVar, str, autoCloseable, aVar);
    }
}
