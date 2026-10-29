package p537x6;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p256ku.InterfaceC7850d2;
import p430s6.InterfaceC11178d;
import p568y6.Size;

/* JADX INFO: renamed from: x6.r */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, m31665d2 = {"Lx6/r;", "", "Lx6/g;", "request", "Lku/d2;", "job", "", "findLifecycle", "Lx6/q;", "a", "(Lx6/g;Lku/d2;Z)Lx6/q;", "b", "(Lx6/g;)Lx6/g;", "Ly6/g;", "size", "Lx6/p;", "e", "(Lx6/g;Ly6/g;)Lx6/p;", "options", "d", "(Lx6/p;)Lx6/p;", "Ls6/d$c;", "cacheValue", "c", "(Lx6/g;Ls6/d$c;)Z", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC12757r {
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC12756q mo47467a(@NotNull ImageRequest request, @NotNull InterfaceC7850d2 job, boolean findLifecycle);

    @NotNull
    /* JADX INFO: renamed from: b */
    ImageRequest mo47468b(@NotNull ImageRequest request);

    /* JADX INFO: renamed from: c */
    boolean mo47469c(@NotNull ImageRequest request, @NotNull InterfaceC11178d.Value cacheValue);

    @NotNull
    /* JADX INFO: renamed from: d */
    Options mo47470d(@NotNull Options options);

    @NotNull
    /* JADX INFO: renamed from: e */
    Options mo47471e(@NotNull ImageRequest request, @NotNull Size size);
}
