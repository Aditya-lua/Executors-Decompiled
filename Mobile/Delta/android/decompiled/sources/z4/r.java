package z4;

import iu.p0;
import iu.r0;
import iu.w1;
import iu.x;
import iu.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a9\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lkotlin/Function2;", "Liu/p0;", "Llt/b;", "", "block", "a", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @nt.f(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Liu/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a<T> extends nt.m implements Function2<p0, lt.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37967t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f37968u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function2<p0, lt.b<? super T>, Object> f37969v;

        /* JADX INFO: renamed from: z4.r$a$a, reason: collision with other inner class name */
        @nt.f(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", l = {52}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class C0684a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f37970t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f37971u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ x<T> f37972v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Function2<p0, lt.b<? super T>, Object> f37973w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0684a(x<T> xVar, Function2<? super p0, ? super lt.b<? super T>, ? extends Object> function2, lt.b<? super C0684a> bVar) {
                super(2, bVar);
                this.f37972v = xVar;
                this.f37973w = function2;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                C0684a c0684a = new C0684a(this.f37972v, this.f37973w, bVar);
                c0684a.f37971u = obj;
                return c0684a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((C0684a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                x<T> xVar;
                Object objB;
                Object objE = mt.c.e();
                int i10 = this.f37970t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    p0 p0Var = (p0) this.f37971u;
                    x<T> xVar2 = this.f37972v;
                    Function2<p0, lt.b<? super T>, Object> function2 = this.f37973w;
                    try {
                        gt.n.Companion companion = gt.n.INSTANCE;
                        this.f37971u = xVar2;
                        this.f37970t = 1;
                        obj = function2.invoke(p0Var, this);
                        if (obj == objE) {
                            return objE;
                        }
                        xVar = xVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        xVar = xVar2;
                        gt.n.Companion companion2 = gt.n.INSTANCE;
                        objB = gt.n.b(gt.o.a(th));
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar = (x) this.f37971u;
                    try {
                        gt.o.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        gt.n.Companion companion3 = gt.n.INSTANCE;
                        objB = gt.n.b(gt.o.a(th));
                    }
                }
                objB = gt.n.b(obj);
                z.d(xVar, objB);
                return Unit.f22938a;
            }
        }

        @nt.f(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", l = {58}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Liu/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        public static final class b extends nt.m implements Function2<p0, lt.b<? super T>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f37974t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ x<T> f37975u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(x<T> xVar, lt.b<? super b> bVar) {
                super(2, bVar);
                this.f37975u = xVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new b(this.f37975u, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super T> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f37974t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                x<T> xVar = this.f37975u;
                this.f37974t = 1;
                Object objN = xVar.n(this);
                return objN == objE ? objE : objN;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super p0, ? super lt.b<? super T>, ? extends Object> function2, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f37969v = function2;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            a aVar = new a(this.f37969v, bVar);
            aVar.f37968u = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super T> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f37967t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            CoroutineContext.Element element = ((p0) this.f37968u).getCoroutineContext().get(kotlin.coroutines.d.INSTANCE);
            Intrinsics.checkNotNull(element);
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) element;
            x xVarC = z.c(null, 1, null);
            iu.i.c(w1.f21435a, dVar, r0.UNDISPATCHED, new C0684a(xVarC, this.f37969v, null));
            while (!xVarC.d()) {
                try {
                    return iu.i.e(dVar, new b(xVarC, null));
                } catch (InterruptedException unused) {
                }
            }
            return xVarC.f();
        }
    }

    public static final <T> T a(@NotNull Function2<? super p0, ? super lt.b<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Thread.interrupted();
        return (T) iu.j.b(null, new a(block, null), 1, null);
    }
}
