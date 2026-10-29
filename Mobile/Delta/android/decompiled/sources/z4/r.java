package z4;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.p0;
import ku.r0;
import ku.w1;
import ku.x;
import ku.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a9\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "block", "a", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lku/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", l = {}, m = "invokeSuspend")
    public static final class a<T> extends pt.m implements Function2<p0, nt.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37272t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f37273u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function2<p0, nt.b<? super T>, Object> f37274v;

        /* JADX INFO: renamed from: z4.r$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 1, 0})
        @pt.f(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", l = {52}, m = "invokeSuspend")
        public static final class C0674a extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f37275t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f37276u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ x<T> f37277v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Function2<p0, nt.b<? super T>, Object> f37278w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0674a(x<T> xVar, Function2<? super p0, ? super nt.b<? super T>, ? extends Object> function2, nt.b<? super C0674a> bVar) {
                super(2, bVar);
                this.f37277v = xVar;
                this.f37278w = function2;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                C0674a c0674a = new C0674a(this.f37277v, this.f37278w, bVar);
                c0674a.f37276u = obj;
                return c0674a;
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                x<T> xVar;
                Object objB;
                Object objE = ot.c.e();
                int i10 = this.f37275t;
                if (i10 == 0) {
                    jt.o.b(obj);
                    p0 p0Var = (p0) this.f37276u;
                    x<T> xVar2 = this.f37277v;
                    Function2<p0, nt.b<? super T>, Object> function2 = this.f37278w;
                    try {
                        jt.n.Companion companion = jt.n.INSTANCE;
                        this.f37276u = xVar2;
                        this.f37275t = 1;
                        obj = function2.invoke(p0Var, this);
                        if (obj == objE) {
                            return objE;
                        }
                        xVar = xVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        xVar = xVar2;
                        jt.n.Companion companion2 = jt.n.INSTANCE;
                        objB = jt.n.b(jt.o.a(th));
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar = (x) this.f37276u;
                    try {
                        jt.o.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        jt.n.Companion companion3 = jt.n.INSTANCE;
                        objB = jt.n.b(jt.o.a(th));
                    }
                }
                objB = jt.n.b(obj);
                z.d(xVar, objB);
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((C0674a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lku/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @pt.f(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", l = {58}, m = "invokeSuspend")
        public static final class b extends pt.m implements Function2<p0, nt.b<? super T>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f37279t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ x<T> f37280u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(x<T> xVar, nt.b<? super b> bVar) {
                super(2, bVar);
                this.f37280u = xVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new b(this.f37280u, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f37279t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                    return obj;
                }
                jt.o.b(obj);
                x<T> xVar = this.f37280u;
                this.f37279t = 1;
                Object objB = xVar.B(this);
                return objB == objE ? objE : objB;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super T> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super p0, ? super nt.b<? super T>, ? extends Object> function2, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f37274v = function2;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            a aVar = new a(this.f37274v, bVar);
            aVar.f37273u = obj;
            return aVar;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f37272t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            CoroutineContext.Element element = ((p0) this.f37273u).getCoroutineContext().get(kotlin.coroutines.d.INSTANCE);
            Intrinsics.checkNotNull(element);
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) element;
            x xVarC = z.c(null, 1, null);
            ku.i.c(w1.f22869a, dVar, r0.UNDISPATCHED, new C0674a(xVarC, this.f37274v, null));
            while (!xVarC.d()) {
                try {
                    return ku.i.e(dVar, new b(xVarC, null));
                } catch (InterruptedException unused) {
                }
            }
            return xVarC.g();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super T> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public static final <T> T a(@NotNull Function2<? super p0, ? super nt.b<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Thread.interrupted();
        return (T) ku.j.b(null, new a(block, null), 1, null);
    }
}
