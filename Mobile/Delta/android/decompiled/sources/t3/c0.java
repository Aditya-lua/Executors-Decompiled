package t3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006\""}, d2 = {"Lt3/c0;", "Lt3/t;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "T", "Lkotlin/Function1;", "Llt/b;", "", "block", "e", "(Lkotlin/jvm/functions/Function1;Llt/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "c", "(Lkotlin/jvm/functions/Function2;Llt/b;)Ljava/lang/Object;", "", "b", "(Llt/b;)Ljava/lang/Object;", "a", "Ljava/lang/String;", "Lsu/a;", "Lsu/a;", "mutex", "Lt3/b;", "Lt3/b;", "version", "Llu/h;", "", "d", "Llu/h;", "()Llu/h;", "updateNotifications", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c0 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String filePath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final su.a mutex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t3.b version;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lu.h<Unit> updateNotifications;

    @nt.f(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {66, 41}, m = "lock")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31878t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31879u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31880v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31882x;

        public a(lt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31880v = obj;
            this.f31882x |= Integer.MIN_VALUE;
            return c0.this.e(null, this);
        }
    }

    @nt.f(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {50}, m = "tryLock")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31883t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f31884u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31885v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31887x;

        public b(lt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31885v = obj;
            this.f31887x |= Integer.MIN_VALUE;
            return c0.this.c(null, this);
        }
    }

    @nt.f(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llu/i;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends nt.m implements Function2<lu.i<? super Unit>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31888t;

        public c(lt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        @NotNull
        public final lt.b<Unit> create(@Nullable Object obj, @NotNull lt.b<?> bVar) {
            return new c(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            mt.c.e();
            if (this.f31888t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull lu.i<? super Unit> iVar, @Nullable lt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public c0(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.filePath = filePath;
        this.mutex = su.g.b(false, 1, null);
        this.version = new t3.b(0);
        this.updateNotifications = lu.j.w(new c(null));
    }

    @Override // t3.t
    @Nullable
    public Object a(@NotNull lt.b<? super Integer> bVar) {
        return nt.b.d(this.version.d());
    }

    @Override // t3.t
    @Nullable
    public Object b(@NotNull lt.b<? super Integer> bVar) {
        return nt.b.d(this.version.b());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t3.t
    @Nullable
    public <T> Object c(@NotNull Function2<? super Boolean, ? super lt.b<? super T>, ? extends Object> function2, @NotNull lt.b<? super T> bVar) throws Throwable {
        b bVar2;
        su.a aVar;
        Throwable th2;
        boolean z10;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f31887x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f31887x = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f31885v;
        Object objE = mt.c.e();
        int i11 = bVar2.f31887x;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = bVar2.f31884u;
            aVar = (su.a) bVar2.f31883t;
            try {
                gt.o.b(obj);
                if (z10) {
                    aVar.f(null);
                }
                return obj;
            } catch (Throwable th3) {
                th2 = th3;
                if (z10) {
                    aVar.f(null);
                }
                throw th2;
            }
        }
        gt.o.b(obj);
        su.a aVar2 = this.mutex;
        boolean zD = aVar2.d(null);
        try {
            Boolean boolA = nt.b.a(zD);
            bVar2.f31883t = aVar2;
            bVar2.f31884u = zD;
            bVar2.f31887x = 1;
            Object objInvoke = function2.invoke(boolA, bVar2);
            if (objInvoke == objE) {
                return objE;
            }
            aVar = aVar2;
            obj = objInvoke;
            z10 = zD;
            if (z10) {
                aVar.f(null);
            }
            return obj;
        } catch (Throwable th4) {
            aVar = aVar2;
            th2 = th4;
            z10 = zD;
            if (z10) {
                aVar.f(null);
            }
            throw th2;
        }
    }

    @Override // t3.t
    @NotNull
    public lu.h<Unit> d() {
        return this.updateNotifications;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t3.t
    @Nullable
    public <T> Object e(@NotNull Function1<? super lt.b<? super T>, ? extends Object> function1, @NotNull lt.b<? super T> bVar) throws Throwable {
        a aVar;
        su.a aVar2;
        Throwable th2;
        su.a aVar3;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f31882x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f31882x = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f31880v;
        Object objE = mt.c.e();
        int i11 = aVar.f31882x;
        try {
            if (i11 == 0) {
                gt.o.b(obj);
                aVar2 = this.mutex;
                aVar.f31878t = function1;
                aVar.f31879u = aVar2;
                aVar.f31882x = 1;
                if (aVar2.b(null, aVar) != objE) {
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (su.a) aVar.f31878t;
                try {
                    gt.o.b(obj);
                    aVar3.f(null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar3.f(null);
                    throw th2;
                }
            }
            su.a aVar4 = (su.a) aVar.f31879u;
            Function1<? super lt.b<? super T>, ? extends Object> function2 = (Function1) aVar.f31878t;
            gt.o.b(obj);
            aVar2 = aVar4;
            function1 = function2;
            aVar.f31878t = aVar2;
            aVar.f31879u = null;
            aVar.f31882x = 2;
            Object objInvoke = function1.invoke(aVar);
            if (objInvoke != objE) {
                su.a aVar5 = aVar2;
                obj = objInvoke;
                aVar3 = aVar5;
                aVar3.f(null);
                return obj;
            }
            return objE;
        } catch (Throwable th4) {
            su.a aVar6 = aVar2;
            th2 = th4;
            aVar3 = aVar6;
            aVar3.f(null);
            throw th2;
        }
    }
}
