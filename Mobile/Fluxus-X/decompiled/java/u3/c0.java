package u3;

import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006\""}, d2 = {"Lu3/c0;", "Lu3/t;", BuildConfig.FLAVOR, "filePath", "<init>", "(Ljava/lang/String;)V", "T", "Lkotlin/Function1;", "Leu/b;", BuildConfig.FLAVOR, "block", "e", "(Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;", "Lkotlin/Function2;", BuildConfig.FLAVOR, "c", "(Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "a", "(Leu/b;)Ljava/lang/Object;", "d", "Ljava/lang/String;", "Lkv/a;", "b", "Lkv/a;", "mutex", "Lu3/b;", "Lu3/b;", "version", "Ldv/h;", BuildConfig.FLAVOR, "Ldv/h;", "()Ldv/h;", "updateNotifications", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c0 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String filePath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final kv.a mutex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final u3.b version;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dv.h<Unit> updateNotifications;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @gu.f(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {66, RequestError.NO_DEV_KEY}, m = "lock")
    public static final class a<T> extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32925t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f32926u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f32927v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f32929x;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32927v = obj;
            this.f32929x |= Integer.MIN_VALUE;
            return c0.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @gu.f(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "tryLock")
    public static final class b<T> extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32930t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f32931u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f32932v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f32934x;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32932v = obj;
            this.f32934x |= Integer.MIN_VALUE;
            return c0.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ldv/i;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {1, 8, 0})
    @gu.f(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<dv.i<? super Unit>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f32935t;

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        @NotNull
        public final eu.b<Unit> create(@Nullable Object obj, @NotNull eu.b<?> bVar) {
            return new c(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            fu.c.e();
            if (this.f32935t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull dv.i<? super Unit> iVar, @Nullable eu.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public c0(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.filePath = filePath;
        this.mutex = kv.g.b(false, 1, null);
        this.version = new u3.b(0);
        this.updateNotifications = dv.j.w(new c(null));
    }

    @Override // u3.t
    @Nullable
    public Object a(@NotNull eu.b<? super Integer> bVar) {
        return gu.b.c(this.version.b());
    }

    @Override // u3.t
    @NotNull
    public dv.h<Unit> b() {
        return this.updateNotifications;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // u3.t
    @Nullable
    public <T> Object c(@NotNull Function2<? super Boolean, ? super eu.b<? super T>, ? extends Object> function2, @NotNull eu.b<? super T> bVar) throws Throwable {
        b bVar2;
        kv.a aVar;
        Throwable th2;
        boolean z10;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f32934x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f32934x = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f32932v;
        Object objE = fu.c.e();
        int i11 = bVar2.f32934x;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = bVar2.f32931u;
            aVar = (kv.a) bVar2.f32930t;
            try {
                zt.o.b(obj);
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
        zt.o.b(obj);
        kv.a aVar2 = this.mutex;
        boolean zE = aVar2.e(null);
        try {
            Boolean boolA = gu.b.a(zE);
            bVar2.f32930t = aVar2;
            bVar2.f32931u = zE;
            bVar2.f32934x = 1;
            Object objInvoke = function2.invoke(boolA, bVar2);
            if (objInvoke == objE) {
                return objE;
            }
            aVar = aVar2;
            obj = objInvoke;
            z10 = zE;
            if (z10) {
                aVar.f(null);
            }
            return obj;
        } catch (Throwable th4) {
            aVar = aVar2;
            th2 = th4;
            z10 = zE;
            if (z10) {
                aVar.f(null);
            }
            throw th2;
        }
    }

    @Override // u3.t
    @Nullable
    public Object d(@NotNull eu.b<? super Integer> bVar) {
        return gu.b.c(this.version.d());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // u3.t
    @Nullable
    public <T> Object e(@NotNull Function1<? super eu.b<? super T>, ? extends Object> function1, @NotNull eu.b<? super T> bVar) throws Throwable {
        a aVar;
        kv.a aVar2;
        Throwable th2;
        kv.a aVar3;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f32929x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f32929x = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f32927v;
        Object objE = fu.c.e();
        int i11 = aVar.f32929x;
        try {
            if (i11 == 0) {
                zt.o.b(obj);
                aVar2 = this.mutex;
                aVar.f32925t = function1;
                aVar.f32926u = aVar2;
                aVar.f32929x = 1;
                if (aVar2.d(null, aVar) != objE) {
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (kv.a) aVar.f32925t;
                try {
                    zt.o.b(obj);
                    aVar3.f(null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar3.f(null);
                    throw th2;
                }
            }
            kv.a aVar4 = (kv.a) aVar.f32926u;
            Function1<? super eu.b<? super T>, ? extends Object> function2 = (Function1) aVar.f32925t;
            zt.o.b(obj);
            aVar2 = aVar4;
            function1 = function2;
            aVar.f32925t = aVar2;
            aVar.f32926u = null;
            aVar.f32929x = 2;
            Object objInvoke = function1.invoke(aVar);
            if (objInvoke != objE) {
                kv.a aVar5 = aVar2;
                obj = objInvoke;
                aVar3 = aVar5;
                aVar3.f(null);
                return obj;
            }
            return objE;
        } catch (Throwable th4) {
            kv.a aVar6 = aVar2;
            th2 = th4;
            aVar3 = aVar6;
            aVar3.f(null);
            throw th2;
        }
    }
}
