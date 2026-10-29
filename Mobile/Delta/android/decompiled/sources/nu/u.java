package nu;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u001aM\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\t\u001aU\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000120\u0010\u0007\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\\\u0010\u0011\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000320\u0010\u0007\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"T", "Lnu/h;", "Lkotlin/Function2;", "Lnu/i;", "Lnt/b;", "", "", "action", "e", "(Lnu/h;Lkotlin/jvm/functions/Function2;)Lnu/h;", "Lkotlin/Function3;", "", "d", "(Lnu/h;Lzt/n;)Lnu/h;", "b", "(Lnu/i;)V", "cause", "c", "(Lnu/i;Lzt/n;Ljava/lang/Throwable;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class u {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {212}, m = "invokeSafely$FlowKt__EmittersKt")
    public static final class a<T> extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26799t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f26800u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f26801v;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f26800u = obj;
            this.f26801v |= Integer.MIN_VALUE;
            return u.c(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"nu/u$b", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f26802a;
        public final /* synthetic */ zt.n b;

        @pt.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {110, 117, R.styleable.AppCompatTheme_windowMinWidthMajor}, m = "collect")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends pt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f26803t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f26804u;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f26806w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f26807x;

            public a(nt.b bVar) {
                super(bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                this.f26803t = obj;
                this.f26804u |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(h hVar, zt.n nVar) {
            this.f26802a = hVar;
            this.b = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0088  */
        /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // nu.h
        public Object collect(i<? super T> iVar, nt.b<? super Unit> bVar) throws Throwable {
            a aVar;
            b<T> bVar2;
            u0 u0Var;
            zt.n nVar;
            p001ou.v vVar;
            Throwable th2;
            p001ou.v vVar2;
            Object objInvoke;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f26804u;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f26804u = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object obj = aVar.f26803t;
            Object objE = ot.c.e();
            int i11 = aVar.f26804u;
            if (i11 == 0) {
                jt.o.b(obj);
                try {
                    h hVar = this.f26802a;
                    aVar.f26806w = this;
                    aVar.f26807x = iVar;
                    aVar.f26804u = 1;
                    if (hVar.collect(iVar, aVar) != objE) {
                        bVar2 = this;
                        vVar = new p001ou.v(iVar, aVar.getContext());
                        zt.n nVar2 = bVar2.b;
                        aVar.f26806w = vVar;
                        aVar.f26807x = null;
                        aVar.f26804u = 3;
                        kotlin.jvm.internal.l.c(6);
                        objInvoke = nVar2.invoke(vVar, null, aVar);
                        kotlin.jvm.internal.l.c(7);
                        if (objInvoke != objE) {
                            vVar2 = vVar;
                            vVar2.releaseIntercepted();
                            return Unit.f22483a;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bVar2 = this;
                    u0Var = new u0(th);
                    nVar = bVar2.b;
                    aVar.f26806w = th;
                    aVar.f26807x = null;
                    aVar.f26804u = 2;
                    if (u.c(u0Var, nVar, th, aVar) == objE) {
                        throw th;
                    }
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    Throwable th4 = (Throwable) aVar.f26806w;
                    jt.o.b(obj);
                    throw th4;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vVar2 = (p001ou.v) aVar.f26806w;
                try {
                    jt.o.b(obj);
                    vVar2.releaseIntercepted();
                    return Unit.f22483a;
                } catch (Throwable th5) {
                    th2 = th5;
                    vVar2.releaseIntercepted();
                    throw th2;
                }
            }
            iVar = (i) aVar.f26807x;
            bVar2 = (b) aVar.f26806w;
            try {
                jt.o.b(obj);
                vVar = new p001ou.v(iVar, aVar.getContext());
                try {
                    zt.n nVar3 = bVar2.b;
                    aVar.f26806w = vVar;
                    aVar.f26807x = null;
                    aVar.f26804u = 3;
                    kotlin.jvm.internal.l.c(6);
                    objInvoke = nVar3.invoke(vVar, null, aVar);
                    kotlin.jvm.internal.l.c(7);
                    if (objInvoke != objE) {
                        vVar2 = vVar;
                        vVar2.releaseIntercepted();
                        return Unit.f22483a;
                    }
                    return objE;
                } catch (Throwable th6) {
                    th2 = th6;
                    vVar2 = vVar;
                    vVar2.releaseIntercepted();
                    throw th2;
                }
            } catch (Throwable th7) {
                th = th7;
                u0Var = new u0(th);
                nVar = bVar2.b;
                aVar.f26806w = th;
                aVar.f26807x = null;
                aVar.f26804u = 2;
                if (u.c(u0Var, nVar, th, aVar) == objE) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"nu/u$c", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function2 f26808a;
        public final /* synthetic */ h b;

        @pt.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {112, 116}, m = "collect")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends pt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f26809t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f26810u;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f26812w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f26813x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public Object f26814y;

            public a(nt.b bVar) {
                super(bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                this.f26809t = obj;
                this.f26810u |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(Function2 function2, h hVar) {
            this.f26808a = function2;
            this.b = hVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            if (r7.collect(r2, r0) == r1) goto L27;
         */
        @Override // nu.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(nu.i<? super T> r7, nt.b<? super kotlin.Unit> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof nu.u.c.a
                if (r0 == 0) goto L13
                r0 = r8
                nu.u$c$a r0 = (nu.u.c.a) r0
                int r1 = r0.f26810u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f26810u = r1
                goto L18
            L13:
                nu.u$c$a r0 = new nu.u$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f26809t
                java.lang.Object r1 = ot.c.e()
                int r2 = r0.f26810u
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                jt.o.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f26814y
                ou.v r7 = (p001ou.v) r7
                java.lang.Object r2 = r0.f26813x
                nu.i r2 = (nu.i) r2
                java.lang.Object r4 = r0.f26812w
                nu.u$c r4 = (nu.u.c) r4
                jt.o.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                jt.o.b(r8)
                ou.v r8 = new ou.v
                kotlin.coroutines.CoroutineContext r2 = r0.getContext()
                r8.<init>(r7, r2)
                kotlin.jvm.functions.Function2 r2 = r6.f26808a     // Catch: java.lang.Throwable -> L86
                r0.f26812w = r6     // Catch: java.lang.Throwable -> L86
                r0.f26813x = r7     // Catch: java.lang.Throwable -> L86
                r0.f26814y = r8     // Catch: java.lang.Throwable -> L86
                r0.f26810u = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.jvm.internal.l.c(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.jvm.internal.l.c(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                goto L82
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                nu.h r7 = r4.b
                r8 = 0
                r0.f26812w = r8
                r0.f26813x = r8
                r0.f26814y = r8
                r0.f26810u = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L83
            L82:
                return r1
            L83:
                kotlin.Unit r7 = kotlin.Unit.f22483a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: nu.u.c.collect(nu.i, nt.b):java.lang.Object");
        }
    }

    public static final void b(@NotNull i<?> iVar) {
        if (iVar instanceof u0) {
            throw ((u0) iVar).e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object c(i<? super T> iVar, zt.n<? super i<? super T>, ? super Throwable, ? super nt.b<? super Unit>, ? extends Object> nVar, Throwable th2, nt.b<? super Unit> bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f26801v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f26801v = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f26800u;
        Object objE = ot.c.e();
        int i11 = aVar.f26801v;
        try {
            if (i11 == 0) {
                jt.o.b(obj);
                aVar.f26799t = th2;
                aVar.f26801v = 1;
                if (nVar.invoke(iVar, th2, aVar) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = (Throwable) aVar.f26799t;
                jt.o.b(obj);
            }
            return Unit.f22483a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                jt.a.a(th3, th2);
            }
            throw th3;
        }
    }

    @NotNull
    public static final <T> h<T> d(@NotNull h<? extends T> hVar, @NotNull zt.n<? super i<? super T>, ? super Throwable, ? super nt.b<? super Unit>, ? extends Object> nVar) {
        return new b(hVar, nVar);
    }

    @NotNull
    public static final <T> h<T> e(@NotNull h<? extends T> hVar, @NotNull Function2<? super i<? super T>, ? super nt.b<? super Unit>, ? extends Object> function2) {
        return new c(function2, hVar);
    }
}
