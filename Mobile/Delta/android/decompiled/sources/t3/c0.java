package t3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u0015\u0010 ¨\u0006\""}, d2 = {"Lt3/c0;", "Lt3/t;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "T", "Lkotlin/Function1;", "Lnt/b;", "", "block", "b", "(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "d", "(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "", "c", "(Lnt/b;)Ljava/lang/Object;", "e", "a", "Ljava/lang/String;", "Luu/a;", "Luu/a;", "mutex", "Lt3/b;", "Lt3/b;", "version", "Lnu/h;", "", "Lnu/h;", "()Lnu/h;", "updateNotifications", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c0 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String filePath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final uu.a mutex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t3.b version;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nu.h<Unit> updateNotifications;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @pt.f(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {66, 41}, m = "lock")
    public static final class a<T> extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31359t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31360u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31361v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31363x;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31361v = obj;
            this.f31363x |= Integer.MIN_VALUE;
            return c0.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @pt.f(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {50}, m = "tryLock")
    public static final class b<T> extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31364t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f31365u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31366v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31368x;

        public b(nt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31366v = obj;
            this.f31368x |= Integer.MIN_VALUE;
            return c0.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lnu/i;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {1, 8, 0})
    @pt.f(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
    public static final class c extends pt.m implements Function2<nu.i<? super Unit>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31369t;

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        @NotNull
        public final nt.b<Unit> create(@Nullable Object obj, @NotNull nt.b<?> bVar) {
            return new c(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ot.c.e();
            if (this.f31369t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull nu.i<? super Unit> iVar, @Nullable nt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public c0(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.filePath = filePath;
        this.mutex = uu.g.b(false, 1, null);
        this.version = new t3.b(0);
        this.updateNotifications = nu.j.w(new c(null));
    }

    @Override // t3.t
    @NotNull
    public nu.h<Unit> a() {
        return this.updateNotifications;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t3.t
    @Nullable
    public <T> Object b(@NotNull Function1<? super nt.b<? super T>, ? extends Object> function1, @NotNull nt.b<? super T> bVar) throws Throwable {
        a aVar;
        uu.a aVar2;
        Throwable th2;
        uu.a aVar3;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f31363x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f31363x = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f31361v;
        Object objE = ot.c.e();
        int i11 = aVar.f31363x;
        try {
            if (i11 == 0) {
                jt.o.b(obj);
                aVar2 = this.mutex;
                aVar.f31359t = function1;
                aVar.f31360u = aVar2;
                aVar.f31363x = 1;
                if (aVar2.f(null, aVar) != objE) {
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (uu.a) aVar.f31359t;
                try {
                    jt.o.b(obj);
                    aVar3.e(null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar3.e(null);
                    throw th2;
                }
            }
            uu.a aVar4 = (uu.a) aVar.f31360u;
            Function1<? super nt.b<? super T>, ? extends Object> function2 = (Function1) aVar.f31359t;
            jt.o.b(obj);
            aVar2 = aVar4;
            function1 = function2;
            aVar.f31359t = aVar2;
            aVar.f31360u = null;
            aVar.f31363x = 2;
            Object objInvoke = function1.invoke(aVar);
            if (objInvoke != objE) {
                uu.a aVar5 = aVar2;
                obj = objInvoke;
                aVar3 = aVar5;
                aVar3.e(null);
                return obj;
            }
            return objE;
        } catch (Throwable th4) {
            uu.a aVar6 = aVar2;
            th2 = th4;
            aVar3 = aVar6;
            aVar3.e(null);
            throw th2;
        }
    }

    @Override // t3.t
    @Nullable
    public Object c(@NotNull nt.b<? super Integer> bVar) {
        return pt.b.d(this.version.b());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t3.t
    @Nullable
    public <T> Object d(@NotNull Function2<? super Boolean, ? super nt.b<? super T>, ? extends Object> function2, @NotNull nt.b<? super T> bVar) throws Throwable {
        b bVar2;
        uu.a aVar;
        Throwable th2;
        boolean z10;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f31368x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f31368x = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f31366v;
        Object objE = ot.c.e();
        int i11 = bVar2.f31368x;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = bVar2.f31365u;
            aVar = (uu.a) bVar2.f31364t;
            try {
                jt.o.b(obj);
                if (z10) {
                    aVar.e(null);
                }
                return obj;
            } catch (Throwable th3) {
                th2 = th3;
                if (z10) {
                    aVar.e(null);
                }
                throw th2;
            }
        }
        jt.o.b(obj);
        uu.a aVar2 = this.mutex;
        boolean zD = aVar2.d(null);
        try {
            Boolean boolA = pt.b.a(zD);
            bVar2.f31364t = aVar2;
            bVar2.f31365u = zD;
            bVar2.f31368x = 1;
            Object objInvoke = function2.invoke(boolA, bVar2);
            if (objInvoke == objE) {
                return objE;
            }
            aVar = aVar2;
            obj = objInvoke;
            z10 = zD;
            if (z10) {
                aVar.e(null);
            }
            return obj;
        } catch (Throwable th4) {
            aVar = aVar2;
            th2 = th4;
            z10 = zD;
            if (z10) {
                aVar.e(null);
            }
            throw th2;
        }
    }

    @Override // t3.t
    @Nullable
    public Object e(@NotNull nt.b<? super Integer> bVar) {
        return pt.b.d(this.version.d());
    }
}
