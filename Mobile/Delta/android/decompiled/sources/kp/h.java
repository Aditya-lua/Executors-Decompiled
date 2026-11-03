package kp;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0096A¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkp/h;", "Llu/g0;", "", "<init>", "()V", "resultCode", "", "b", "(I)Z", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "a", "launchers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements lu.g0<Integer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final lu.b0<Integer> f23170c = lu.i0.b(0, 1, ku.a.DROP_OLDEST, 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lu.b0<Integer> f23171a = f23170c;

    public final boolean b(int resultCode) {
        return f23170c.a(Integer.valueOf(resultCode));
    }

    @Override // lu.g0, lu.h
    @Nullable
    public Object collect(@NotNull lu.i<? super Integer> iVar, @NotNull lt.b<?> bVar) {
        return this.f23171a.collect(iVar, bVar);
    }
}
