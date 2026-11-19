package ls;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lls/c;", "Lls/h;", "<init>", "()V", "other", BuildConfig.FLAVOR, "N2", "(Lls/h;)Z", "workflows_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class c implements h {
    @Override // ls.h
    public boolean N2(@NotNull h other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return getClass() == other.getClass();
    }
}
