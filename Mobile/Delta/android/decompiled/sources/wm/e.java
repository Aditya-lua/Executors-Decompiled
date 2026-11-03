package wm;

import iu.p0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwm/e;", "Lwm/t;", "<init>", "()V", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class e implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f34560a = new e();

    @Override // wm.t
    public <P, S> S a(P p8, @Nullable Snapshot snapshot, @NotNull Function2<? super P, ? super Snapshot, ? extends S> function2, @NotNull t.c cVar) {
        return (S) t.a.a(this, p8, snapshot, function2, cVar);
    }

    @Override // wm.t
    public <P, S> S b(P p8, P p10, S s8, @NotNull xt.n<? super P, ? super P, ? super S, ? extends S> nVar, @NotNull t.c cVar) {
        return (S) t.a.b(this, p8, p10, s8, nVar, cVar);
    }

    @Override // wm.t
    public void c(@NotNull p0 p0Var, @NotNull t.c cVar) {
        t.a.d(this, p0Var, cVar);
    }

    @Override // wm.t
    public <P, S, O, R> R d(P p8, S s8, @NotNull a<? extends P, S, ? super O> aVar, @NotNull xt.n<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> nVar, @NotNull t.c cVar) {
        return (R) t.a.c(this, p8, s8, aVar, nVar, cVar);
    }

    @Override // wm.t
    @Nullable
    public <S> Snapshot e(S s8, @NotNull Function1<? super S, Snapshot> function1, @NotNull t.c cVar) {
        return t.a.e(this, s8, function1, cVar);
    }
}
