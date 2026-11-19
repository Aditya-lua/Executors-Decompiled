package g4;

import com.github.luben.zstd.BuildConfig;
import f4.q;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lg4/a;", "Lg4/j;", "Lf4/q;", "fragment", BuildConfig.FLAVOR, "previousFragmentId", "<init>", "(Lf4/q;Ljava/lang/String;)V", "b", "Ljava/lang/String;", "getPreviousFragmentId", "()Ljava/lang/String;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends j {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String previousFragmentId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull q fragment, @NotNull String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        this.previousFragmentId = previousFragmentId;
    }
}
