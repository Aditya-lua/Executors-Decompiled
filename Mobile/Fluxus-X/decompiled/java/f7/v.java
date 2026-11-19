package f7;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf7/u;", BuildConfig.FLAVOR, "tag", BuildConfig.FLAVOR, "throwable", BuildConfig.FLAVOR, "a", "(Lf7/u;Ljava/lang/String;Ljava/lang/Throwable;)V", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class v {
    public static final void a(@NotNull u uVar, @NotNull String str, @NotNull Throwable th2) {
        u.a aVarA = uVar.a();
        u.a aVar = u.a.Error;
        if (aVarA.compareTo(aVar) <= 0) {
            uVar.b(str, aVar, null, th2);
        }
    }
}
