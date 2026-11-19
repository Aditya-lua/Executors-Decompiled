package aq;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0096A¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Laq/h;", "Ldv/g0;", BuildConfig.FLAVOR, "<init>", "()V", "resultCode", BuildConfig.FLAVOR, "b", "(I)Z", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "a", "launchers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements dv.g0<Integer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final dv.b0<Integer> f3306c = dv.i0.b(0, 1, cv.a.DROP_OLDEST, 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dv.b0<Integer> f3307a = f3306c;

    public final boolean b(int resultCode) {
        return f3306c.a(Integer.valueOf(resultCode));
    }

    @Override // dv.g0, dv.h
    @Nullable
    public Object collect(@NotNull dv.i<? super Integer> iVar, @NotNull eu.b<?> bVar) {
        return this.f3307a.collect(iVar, bVar);
    }
}
