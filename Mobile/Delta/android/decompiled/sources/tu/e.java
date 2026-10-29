package tu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ku.p;
import ku.p0;
import ku.q0;
import ku.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ltu/e;", "R", "Ltu/k;", "Lnt/b;", "uCont", "<init>", "(Lnt/b;)V", "", "B", "()Ljava/lang/Object;", "", "e", "", "C", "(Ljava/lang/Throwable;)V", "Lku/p;", "g", "Lku/p;", "cont", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e<R> extends k<R> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p<R> cont;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1", f = "SelectOld.kt", l = {39}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31974t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e<R> f31975u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e<R> eVar, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f31975u = eVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new a(this.f31975u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f31974t;
            try {
                if (i10 == 0) {
                    jt.o.b(obj);
                    e<R> eVar = this.f31975u;
                    this.f31974t = 1;
                    obj = eVar.o(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                }
                n.c(this.f31975u.cont, obj);
                return Unit.f22483a;
            } catch (Throwable th2) {
                n.d(this.f31975u.cont, th2);
                return Unit.f22483a;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public e(@NotNull nt.b<? super R> bVar) {
        super(bVar.getContext());
        this.cont = new p<>(ot.b.c(bVar), 1);
    }

    @Nullable
    public final Object B() {
        if (this.cont.d()) {
            return this.cont.A();
        }
        ku.k.d(q0.a(getContext()), null, r0.UNDISPATCHED, new a(this, null), 1, null);
        return this.cont.A();
    }

    public final void C(@NotNull Throwable e10) {
        p<R> pVar = this.cont;
        jt.n.Companion companion = jt.n.INSTANCE;
        pVar.resumeWith(jt.n.b(jt.o.a(e10)));
    }
}
