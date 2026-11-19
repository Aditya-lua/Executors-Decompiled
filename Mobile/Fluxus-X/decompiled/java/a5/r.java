package a5;

import av.p0;
import av.r0;
import av.w1;
import av.x;
import av.z;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a9\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lkotlin/Function2;", "Lav/p0;", "Leu/b;", BuildConfig.FLAVOR, "block", "a", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lav/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", l = {}, m = "invokeSuspend")
    public static final class a<T> extends gu.m implements Function2<p0, eu.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f242t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f243u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function2<p0, eu.b<? super T>, Object> f244v;

        /* JADX INFO: renamed from: a5.r$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 1, 0})
        @gu.f(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", l = {52}, m = "invokeSuspend")
        public static final class C0004a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f245t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f246u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ x<T> f247v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Function2<p0, eu.b<? super T>, Object> f248w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0004a(x<T> xVar, Function2<? super p0, ? super eu.b<? super T>, ? extends Object> function2, eu.b<? super C0004a> bVar) {
                super(2, bVar);
                this.f247v = xVar;
                this.f248w = function2;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                C0004a c0004a = new C0004a(this.f247v, this.f248w, bVar);
                c0004a.f246u = obj;
                return c0004a;
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((C0004a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                x<T> xVar;
                Object objB;
                Object objE = fu.c.e();
                int i10 = this.f245t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    p0 p0Var = (p0) this.f246u;
                    x<T> xVar2 = this.f247v;
                    Function2<p0, eu.b<? super T>, Object> function2 = this.f248w;
                    try {
                        zt.n.Companion companion = zt.n.INSTANCE;
                        this.f246u = xVar2;
                        this.f245t = 1;
                        obj = function2.invoke(p0Var, this);
                        if (obj == objE) {
                            return objE;
                        }
                        xVar = xVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        xVar = xVar2;
                        zt.n.Companion companion2 = zt.n.INSTANCE;
                        objB = zt.n.b(zt.o.a(th));
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar = (x) this.f246u;
                    try {
                        zt.o.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        zt.n.Companion companion3 = zt.n.INSTANCE;
                        objB = zt.n.b(zt.o.a(th));
                    }
                }
                objB = zt.n.b(obj);
                z.d(xVar, objB);
                return Unit.f21506a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lav/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @gu.f(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", l = {58}, m = "invokeSuspend")
        public static final class b extends gu.m implements Function2<p0, eu.b<? super T>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f249t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ x<T> f250u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(x<T> xVar, eu.b<? super b> bVar) {
                super(2, bVar);
                this.f250u = xVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new b(this.f250u, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super T> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f249t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return obj;
                }
                zt.o.b(obj);
                x<T> xVar = this.f250u;
                this.f249t = 1;
                Object objY = xVar.y(this);
                return objY == objE ? objE : objY;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super p0, ? super eu.b<? super T>, ? extends Object> function2, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f244v = function2;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            a aVar = new a(this.f244v, bVar);
            aVar.f243u = obj;
            return aVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super T> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f242t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            CoroutineContext.Element element = ((p0) this.f243u).getCoroutineContext().get(p001kotlin.coroutines.d.INSTANCE);
            Intrinsics.checkNotNull(element);
            p001kotlin.coroutines.d dVar = (p001kotlin.coroutines.d) element;
            x xVarC = z.c(null, 1, null);
            av.i.c(w1.f3492a, dVar, r0.UNDISPATCHED, new C0004a(xVarC, this.f244v, null));
            while (!xVarC.d()) {
                try {
                    return av.i.e(dVar, new b(xVarC, null));
                } catch (InterruptedException unused) {
                }
            }
            return xVarC.f();
        }
    }

    public static final <T> T a(@NotNull Function2<? super p0, ? super eu.b<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Thread.interrupted();
        return (T) av.j.b(null, new a(block, null), 1, null);
    }
}
