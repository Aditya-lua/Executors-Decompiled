package u3;

import com.github.luben.zstd.BuildConfig;
import dv.r0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\u0004R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000eR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lu3/l;", "T", BuildConfig.FLAVOR, "<init>", "()V", "Lu3/d0;", "newState", "c", "(Lu3/d0;)Lu3/d0;", "Ldv/c0;", "a", "Ldv/c0;", "getCachedValue$annotations", "cachedValue", "()Lu3/d0;", "currentState", "Ldv/h;", "b", "()Ldv/h;", "flow", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dv.c0<d0<T>> cachedValue;

    public l() {
        h0 h0Var = h0.b;
        Intrinsics.d(h0Var, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.cachedValue = r0.a(h0Var);
    }

    @NotNull
    public final d0<T> a() {
        return this.cachedValue.getValue();
    }

    @NotNull
    public final dv.h<d0<T>> b() {
        return this.cachedValue;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @NotNull
    public final d0<T> c(@NotNull d0<T> newState) {
        d0<T> value;
        d0<T> d0Var;
        Intrinsics.checkNotNullParameter(newState, "newState");
        dv.c0<d0<T>> c0Var = this.cachedValue;
        do {
            value = c0Var.getValue();
            d0Var = value;
            if (d0Var instanceof x ? true : Intrinsics.c(d0Var, h0.b)) {
                d0Var = newState;
            } else if (d0Var instanceof f) {
                if (newState.getVersion() > d0Var.getVersion()) {
                    d0Var = newState;
                }
            } else if (!(d0Var instanceof r)) {
                throw new zt.l();
            }
        } while (!c0Var.h(value, d0Var));
        return d0Var;
    }
}
