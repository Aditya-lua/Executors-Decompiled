package androidx.p000lifecycle;

import com.appsflyer.sdk_base.referrer.Payload;
import gt.o;
import iu.g1;
import iu.h2;
import iu.k;
import iu.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lt.b;
import mt.c;
import nt.f;
import nt.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/n;", "Landroidx/lifecycle/m;", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/l;", "lifecycle", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroidx/lifecycle/l;Lkotlin/coroutines/CoroutineContext;)V", "", "c", "()V", "Landroidx/lifecycle/s;", Payload.SOURCE, "Landroidx/lifecycle/l$a;", "event", "f", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "a", "Landroidx/lifecycle/l;", "b", "()Landroidx/lifecycle/l;", "Lkotlin/coroutines/CoroutineContext;", "I", "()Lkotlin/coroutines/CoroutineContext;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l lifecycle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    @f(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 0, 0})
    public static final class a extends m implements Function2<p0, b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f2673t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f2674u;

        public a(b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            a aVar = n.this.new a(bVar);
            aVar.f2674u = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            c.e();
            if (this.f2673t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            p0 p0Var = (p0) this.f2674u;
            if (n.this.getLifecycle().getState().compareTo(l.b.INITIALIZED) >= 0) {
                n.this.getLifecycle().a(n.this);
            } else {
                h2.d(p0Var.getCoroutineContext(), null, 1, null);
            }
            return Unit.f22938a;
        }
    }

    public n(@NotNull l lifecycle, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (getLifecycle().getState() == l.b.DESTROYED) {
            h2.d(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // iu.p0
    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public l getLifecycle() {
        return this.lifecycle;
    }

    public final void c() {
        k.d(this, g1.c().getImmediate(), null, new a(null), 2, null);
    }

    @Override // androidx.p000lifecycle.p
    public void f(@NotNull s source, @NotNull l.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (getLifecycle().getState().compareTo(l.b.DESTROYED) <= 0) {
            getLifecycle().d(this);
            h2.d(getCoroutineContext(), null, 1, null);
        }
    }
}
