package p0;

import androidx.p000lifecycle.b0;
import androidx.p000lifecycle.e0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B#\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lp0/s;", "I", "O", "Landroidx/lifecycle/b0;", "initialValue", "Lt/a;", "mapFunction", "<init>", "(Ljava/lang/Object;Lt/a;)V", "Landroidx/lifecycle/a0;", "liveDataSource", "", "u", "(Landroidx/lifecycle/a0;)V", "f", "()Ljava/lang/Object;", "m", "Ljava/lang/Object;", "n", "Lt/a;", "o", "Landroidx/lifecycle/a0;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class s<I, O> extends b0<O> {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final O initialValue;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t.a<I, O> mapFunction;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public androidx.p000lifecycle.a0<I> liveDataSource;

    public s(O o8, @NotNull t.a<I, O> mapFunction) {
        Intrinsics.checkNotNullParameter(mapFunction, "mapFunction");
        this.initialValue = o8;
        this.mapFunction = mapFunction;
    }

    public static final void v(final s sVar, androidx.p000lifecycle.a0 a0Var) {
        final Function1 function1 = new Function1() { // from class: p0.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.w(this.f28110a, obj);
            }
        };
        super.p(a0Var, new e0() { // from class: p0.r
            @Override // androidx.p000lifecycle.e0
            public final void a(Object obj) {
                s.x(function1, obj);
            }
        });
    }

    public static final Unit w(s sVar, Object obj) {
        sVar.o(sVar.mapFunction.apply(obj));
        return Unit.f22483a;
    }

    public static final void x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // androidx.p000lifecycle.a0
    @Nullable
    public O f() {
        androidx.p000lifecycle.a0<I> a0Var = this.liveDataSource;
        return a0Var == null ? this.initialValue : this.mapFunction.apply(a0Var.f());
    }

    public final void u(@NotNull final androidx.p000lifecycle.a0<I> liveDataSource) {
        Intrinsics.checkNotNullParameter(liveDataSource, "liveDataSource");
        androidx.p000lifecycle.a0<I> a0Var = this.liveDataSource;
        if (a0Var != null) {
            Intrinsics.checkNotNull(a0Var);
            super.q(a0Var);
        }
        this.liveDataSource = liveDataSource;
        z.e(new Runnable() { // from class: p0.p
            @Override // java.lang.Runnable
            public final void run() {
                s.v(this.f28109a, liveDataSource);
            }
        });
    }
}
