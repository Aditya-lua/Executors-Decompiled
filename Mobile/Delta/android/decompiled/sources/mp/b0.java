package mp;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096A¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lmp/b0;", "Lnu/g0;", "", "<init>", "()V", "isGranted", "b", "(Z)Z", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "a", "launchers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 implements nu.g0<Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final nu.b0<Boolean> f24464c = nu.i0.b(0, 1, mu.a.DROP_OLDEST, 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu.b0<Boolean> f24465a = f24464c;

    public final boolean b(boolean isGranted) {
        return f24464c.a(Boolean.valueOf(isGranted));
    }

    @Override // nu.g0, nu.h
    @Nullable
    public Object collect(@NotNull nu.i<? super Boolean> iVar, @NotNull nt.b<?> bVar) {
        return this.f24465a.collect(iVar, bVar);
    }
}
