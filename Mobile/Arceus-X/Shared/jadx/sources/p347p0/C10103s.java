package p347p0;

import androidx.p616lifecycle.AbstractC0940a0;
import androidx.p616lifecycle.C0943b0;
import androidx.p616lifecycle.InterfaceC0952e0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p436t.InterfaceC11464a;

/* JADX INFO: renamed from: p0.s */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B#\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Lp0/s;", "I", "O", "Landroidx/lifecycle/b0;", "initialValue", "Lt/a;", "mapFunction", "<init>", "(Ljava/lang/Object;Lt/a;)V", "Landroidx/lifecycle/a0;", "liveDataSource", "", "u", "(Landroidx/lifecycle/a0;)V", "f", "()Ljava/lang/Object;", "m", "Ljava/lang/Object;", "n", "Lt/a;", "o", "Landroidx/lifecycle/a0;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public class C10103s<I, O> extends C0943b0<O> {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final O initialValue;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11464a<I, O> mapFunction;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public AbstractC0940a0<I> liveDataSource;

    public C10103s(O o8, @NotNull InterfaceC11464a<I, O> mapFunction) {
        Intrinsics.checkNotNullParameter(mapFunction, "mapFunction");
        this.initialValue = o8;
        this.mapFunction = mapFunction;
    }

    /* JADX INFO: renamed from: v */
    public static final void m38994v(final C10103s c10103s, AbstractC0940a0 abstractC0940a0) {
        final Function1 function1 = new Function1() { // from class: p0.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C10103s.m38995w(this.f36387a, obj);
            }
        };
        super.m4882p(abstractC0940a0, new InterfaceC0952e0() { // from class: p0.r
            @Override // androidx.p616lifecycle.InterfaceC0952e0
            /* JADX INFO: renamed from: a */
            public final void mo4884a(Object obj) {
                C10103s.m38996x(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m38995w(C10103s c10103s, Object obj) {
        c10103s.mo4863o(c10103s.mapFunction.apply(obj));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x */
    public static final void m38996x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // androidx.p616lifecycle.AbstractC0940a0
    @Nullable
    /* JADX INFO: renamed from: f */
    public O mo4854f() {
        AbstractC0940a0<I> abstractC0940a0 = this.liveDataSource;
        return abstractC0940a0 == null ? this.initialValue : this.mapFunction.apply(abstractC0940a0.mo4854f());
    }

    /* JADX INFO: renamed from: u */
    public final void m38997u(@NotNull final AbstractC0940a0<I> liveDataSource) {
        Intrinsics.checkNotNullParameter(liveDataSource, "liveDataSource");
        AbstractC0940a0<I> abstractC0940a0 = this.liveDataSource;
        if (abstractC0940a0 != null) {
            Intrinsics.checkNotNull(abstractC0940a0);
            super.m4883q(abstractC0940a0);
        }
        this.liveDataSource = liveDataSource;
        C10110z.m39011e(new Runnable() { // from class: p0.p
            @Override // java.lang.Runnable
            public final void run() {
                C10103s.m38994v(this.f36385a, liveDataSource);
            }
        });
    }
}
