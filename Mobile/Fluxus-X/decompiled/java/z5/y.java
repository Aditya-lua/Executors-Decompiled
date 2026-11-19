package z5;

import com.github.luben.zstd.BuildConfig;
import g6.WorkGenerationalId;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lz5/y;", BuildConfig.FLAVOR, "Lg6/w;", "id", "<init>", "(Lg6/w;)V", "a", "Lg6/w;", "()Lg6/w;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WorkGenerationalId id;

    public y(@NotNull WorkGenerationalId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final WorkGenerationalId getId() {
        return this.id;
    }
}
