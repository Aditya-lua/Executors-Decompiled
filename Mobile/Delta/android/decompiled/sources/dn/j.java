package dn;

import android.content.Context;
import g0.h1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ldn/j;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;Llt/b;)Ljava/lang/Object;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f15111a = new j();

    @nt.f(c = "com.withpersona.sdk2.camera.CameraHelper", f = "CameraHelper.kt", l = {13, 16, 20}, m = "unbind")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f15112t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f15113u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f15114v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f15115w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f15117y;

        public a(lt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15115w = obj;
            this.f15117y |= Integer.MIN_VALUE;
            return j.this.b(null, this);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.CameraHelper$unbind$2", f = "CameraHelper.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f15118t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ d1.k f15119u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d1.k kVar, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f15119u = kVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new b(this.f15119u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f15118t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            try {
                this.f15119u.h();
            } catch (h1 unused) {
            }
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.camera.CameraHelper$unbind$future$1", f = "CameraHelper.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Lne/x;", "Ld1/k;", "<anonymous>", "(Liu/p0;)Lne/x;"}, k = 3, mv = {2, 2, 0})
    public static final class c extends nt.m implements Function2<iu.p0, lt.b<? super ne.x<d1.k>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f15120t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f15121u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f15121u = context;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new c(this.f15121u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super ne.x<d1.k>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f15120t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            return d1.k.INSTANCE.c(this.f15121u);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final d1.k c(ne.x xVar) {
        return (d1.k) xVar.get();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        if (iu.i.g(r5, r6, r0) == r1) goto L27;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull android.content.Context r10, @org.jetbrains.annotations.NotNull lt.b<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof dn.j.a
            if (r0 == 0) goto L13
            r0 = r11
            dn.j$a r0 = (dn.j.a) r0
            int r1 = r0.f15117y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15117y = r1
            goto L18
        L13:
            dn.j$a r0 = new dn.j$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f15115w
            java.lang.Object r1 = mt.c.e()
            int r2 = r0.f15117y
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L59
            if (r2 == r6) goto L51
            if (r2 == r5) goto L45
            if (r2 != r4) goto L3d
            java.lang.Object r10 = r0.f15114v
            d1.k r10 = (d1.k) r10
            java.lang.Object r10 = r0.f15113u
            ne.x r10 = (ne.x) r10
            java.lang.Object r10 = r0.f15112t
            android.content.Context r10 = (android.content.Context) r10
            gt.o.b(r11)
            goto Lbe
        L3d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L45:
            java.lang.Object r10 = r0.f15113u
            ne.x r10 = (ne.x) r10
            java.lang.Object r2 = r0.f15112t
            android.content.Context r2 = (android.content.Context) r2
            gt.o.b(r11)
            goto L98
        L51:
            java.lang.Object r10 = r0.f15112t
            android.content.Context r10 = (android.content.Context) r10
            gt.o.b(r11)
            goto L74
        L59:
            gt.o.b(r11)
            iu.n2 r11 = iu.g1.c()
            dn.j$c r2 = new dn.j$c
            r2.<init>(r10, r3)
            java.lang.Object r7 = nt.l.a(r10)
            r0.f15112t = r7
            r0.f15117y = r6
            java.lang.Object r11 = iu.i.g(r11, r2, r0)
            if (r11 != r1) goto L74
            goto Lbd
        L74:
            ne.x r11 = (ne.x) r11
            iu.l0 r2 = iu.g1.b()
            dn.i r6 = new dn.i
            r6.<init>()
            java.lang.Object r7 = nt.l.a(r10)
            r0.f15112t = r7
            java.lang.Object r7 = nt.l.a(r11)
            r0.f15113u = r7
            r0.f15117y = r5
            java.lang.Object r2 = iu.a2.b(r2, r6, r0)
            if (r2 != r1) goto L94
            goto Lbd
        L94:
            r8 = r2
            r2 = r10
            r10 = r11
            r11 = r8
        L98:
            d1.k r11 = (d1.k) r11
            iu.n2 r5 = iu.g1.c()
            dn.j$b r6 = new dn.j$b
            r6.<init>(r11, r3)
            java.lang.Object r2 = nt.l.a(r2)
            r0.f15112t = r2
            java.lang.Object r10 = nt.l.a(r10)
            r0.f15113u = r10
            java.lang.Object r10 = nt.l.a(r11)
            r0.f15114v = r10
            r0.f15117y = r4
            java.lang.Object r10 = iu.i.g(r5, r6, r0)
            if (r10 != r1) goto Lbe
        Lbd:
            return r1
        Lbe:
            kotlin.Unit r10 = kotlin.Unit.f22938a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.j.b(android.content.Context, lt.b):java.lang.Object");
    }
}
