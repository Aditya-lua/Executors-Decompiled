package sn;

import android.content.Context;
import av.a2;
import av.n2;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsn/m;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "b", "(Landroid/content/Context;Leu/b;)Ljava/lang/Object;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f31643a = new m();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.camera.CameraHelper", f = "CameraHelper.kt", l = {13, 16, 20}, m = "unbind")
    public static final class a extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31644t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31645u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f31646v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f31647w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f31649y;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31647w = obj;
            this.f31649y |= Integer.MIN_VALUE;
            return m.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.CameraHelper$unbind$2", f = "CameraHelper.kt", l = {}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31650t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ d1.k f31651u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d1.k kVar, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f31651u = kVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new b(this.f31651u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f31650t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            try {
                this.f31651u.h();
            } catch (g0.h1 unused) {
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lpe/x;", "Ld1/k;", "<anonymous>", "(Lav/p0;)Lpe/x;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.CameraHelper$unbind$future$1", f = "CameraHelper.kt", l = {}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<av.p0, eu.b<? super pe.x<d1.k>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31652t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f31653u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f31653u = context;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(this.f31653u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super pe.x<d1.k>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f31652t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            return d1.k.INSTANCE.c(this.f31653u);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final d1.k c(pe.x xVar) {
        return (d1.k) xVar.get();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        if (av.i.g(r5, r6, r0) == r1) goto L27;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull Context context, @NotNull eu.b<? super Unit> bVar) {
        a aVar;
        Context context2;
        pe.x xVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f31649y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f31649y = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object objG = aVar.f31647w;
        Object objE = fu.c.e();
        int i11 = aVar.f31649y;
        if (i11 == 0) {
            zt.o.b(objG);
            n2 n2VarC = av.g1.c();
            c cVar = new c(context, null);
            aVar.f31644t = gu.l.a(context);
            aVar.f31649y = 1;
            objG = av.i.g(n2VarC, cVar, aVar);
            if (objG != objE) {
            }
            return objE;
        }
        if (i11 == 1) {
            context = (Context) aVar.f31644t;
            zt.o.b(objG);
        } else if (i11 == 2) {
            xVar = (pe.x) aVar.f31645u;
            context2 = (Context) aVar.f31644t;
            zt.o.b(objG);
            d1.k kVar = (d1.k) objG;
            n2 n2VarC2 = av.g1.c();
            b bVar2 = new b(kVar, null);
            aVar.f31644t = gu.l.a(context2);
            aVar.f31645u = gu.l.a(xVar);
            aVar.f31646v = gu.l.a(kVar);
            aVar.f31649y = 3;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(objG);
        }
        return Unit.f21506a;
        final pe.x xVar2 = (pe.x) objG;
        av.l0 l0VarB = av.g1.b();
        Function0 function0 = new Function0() { // from class: sn.l
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.c(xVar2);
            }
        };
        aVar.f31644t = gu.l.a(context);
        aVar.f31645u = gu.l.a(xVar2);
        aVar.f31649y = 2;
        Object objB = a2.b(l0VarB, function0, aVar);
        if (objB != objE) {
            context2 = context;
            xVar = xVar2;
            objG = objB;
            d1.k kVar2 = (d1.k) objG;
            n2 n2VarC3 = av.g1.c();
            b bVar3 = new b(kVar2, null);
            aVar.f31644t = gu.l.a(context2);
            aVar.f31645u = gu.l.a(xVar);
            aVar.f31646v = gu.l.a(kVar2);
            aVar.f31649y = 3;
        }
        return objE;
    }
}
