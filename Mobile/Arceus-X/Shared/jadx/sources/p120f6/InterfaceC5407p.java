package p120f6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: f6.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0003"}, m31665d2 = {"Lf6/p;", "", "Lf6/o;", "systemIdInfo", "", "a", "(Lf6/o;)V", "", "workSpecId", "", "generation", "b", "(Ljava/lang/String;I)Lf6/o;", "Lf6/w;", "id", "d", "(Lf6/w;)Lf6/o;", "e", "(Ljava/lang/String;)V", "", "c", "()Ljava/util/List;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC5407p {
    /* JADX INFO: renamed from: a */
    void mo24873a(@NotNull SystemIdInfo systemIdInfo);

    @Nullable
    /* JADX INFO: renamed from: b */
    SystemIdInfo mo24874b(@NotNull String workSpecId, int generation);

    @NotNull
    /* JADX INFO: renamed from: c */
    List<String> mo24875c();

    @Nullable
    /* JADX INFO: renamed from: d */
    default SystemIdInfo m24876d(@NotNull WorkGenerationalId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return mo24874b(id2.getWorkSpecId(), id2.getGeneration());
    }

    /* JADX INFO: renamed from: e */
    void mo24877e(@NotNull String workSpecId);
}
