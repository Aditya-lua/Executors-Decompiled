package p120f6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: f6.v */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Lf6/w;", "generationalId", "", "systemId", "Lf6/o;", "a", "(Lf6/w;I)Lf6/o;", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C5425v {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final SystemIdInfo m24902a(@NotNull WorkGenerationalId generationalId, int i10) {
        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
        return new SystemIdInfo(generationalId.getWorkSpecId(), generationalId.getGeneration(), i10);
    }
}
