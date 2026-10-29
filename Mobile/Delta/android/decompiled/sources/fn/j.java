package fn;

import android.content.Context;
import g0.h1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfn/j;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f16915a = new j();

    @pt.f(c = "com.withpersona.sdk2.camera.CameraHelper", f = "CameraHelper.kt", l = {13, 16, 20}, m = "unbind")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f16916t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f16917u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f16918v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f16919w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f16921y;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f16919w = obj;
            this.f16921y |= Integer.MIN_VALUE;
            return j.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.CameraHelper$unbind$2", f = "CameraHelper.kt", l = {}, m = "invokeSuspend")
    public static final class b extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f16922t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ d1.k f16923u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d1.k kVar, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f16923u = kVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f16923u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f16922t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            try {
                this.f16923u.h();
            } catch (h1 unused) {
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Lme/x;", "Ld1/k;", "<anonymous>", "(Lku/p0;)Lme/x;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.camera.CameraHelper$unbind$future$1", f = "CameraHelper.kt", l = {}, m = "invokeSuspend")
    public static final class c extends pt.m implements Function2<ku.p0, nt.b<? super me.x<d1.k>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f16924t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f16925u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f16925u = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(this.f16925u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f16924t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            return d1.k.INSTANCE.c(this.f16925u);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super me.x<d1.k>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final d1.k c(me.x xVar) {
        return (d1.k) xVar.get();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        if (ku.i.g(r5, r6, r0) == r1) goto L27;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull android.content.Context r10, @org.jetbrains.annotations.NotNull nt.b<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof fn.j.a
            if (r0 == 0) goto L13
            r0 = r11
            fn.j$a r0 = (fn.j.a) r0
            int r1 = r0.f16921y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16921y = r1
            goto L18
        L13:
            fn.j$a r0 = new fn.j$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f16919w
            java.lang.Object r1 = ot.c.e()
            int r2 = r0.f16921y
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L59
            if (r2 == r6) goto L51
            if (r2 == r5) goto L45
            if (r2 != r4) goto L3d
            java.lang.Object r10 = r0.f16918v
            d1.k r10 = (d1.k) r10
            java.lang.Object r10 = r0.f16917u
            me.x r10 = (me.x) r10
            java.lang.Object r10 = r0.f16916t
            android.content.Context r10 = (android.content.Context) r10
            jt.o.b(r11)
            goto Lbe
        L3d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L45:
            java.lang.Object r10 = r0.f16917u
            me.x r10 = (me.x) r10
            java.lang.Object r2 = r0.f16916t
            android.content.Context r2 = (android.content.Context) r2
            jt.o.b(r11)
            goto L98
        L51:
            java.lang.Object r10 = r0.f16916t
            android.content.Context r10 = (android.content.Context) r10
            jt.o.b(r11)
            goto L74
        L59:
            jt.o.b(r11)
            ku.n2 r11 = ku.g1.c()
            fn.j$c r2 = new fn.j$c
            r2.<init>(r10, r3)
            java.lang.Object r7 = pt.l.a(r10)
            r0.f16916t = r7
            r0.f16921y = r6
            java.lang.Object r11 = ku.i.g(r11, r2, r0)
            if (r11 != r1) goto L74
            goto Lbd
        L74:
            me.x r11 = (me.x) r11
            ku.l0 r2 = ku.g1.b()
            fn.i r6 = new fn.i
            r6.<init>()
            java.lang.Object r7 = pt.l.a(r10)
            r0.f16916t = r7
            java.lang.Object r7 = pt.l.a(r11)
            r0.f16917u = r7
            r0.f16921y = r5
            java.lang.Object r2 = ku.a2.b(r2, r6, r0)
            if (r2 != r1) goto L94
            goto Lbd
        L94:
            r8 = r2
            r2 = r10
            r10 = r11
            r11 = r8
        L98:
            d1.k r11 = (d1.k) r11
            ku.n2 r5 = ku.g1.c()
            fn.j$b r6 = new fn.j$b
            r6.<init>(r11, r3)
            java.lang.Object r2 = pt.l.a(r2)
            r0.f16916t = r2
            java.lang.Object r10 = pt.l.a(r10)
            r0.f16917u = r10
            java.lang.Object r10 = pt.l.a(r11)
            r0.f16918v = r10
            r0.f16921y = r4
            java.lang.Object r10 = ku.i.g(r5, r6, r0)
            if (r10 != r1) goto Lbe
        Lbd:
            return r1
        Lbe:
            kotlin.Unit r10 = kotlin.Unit.f22483a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.j.b(android.content.Context, nt.b):java.lang.Object");
    }
}
