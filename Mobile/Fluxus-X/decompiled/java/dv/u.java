package dv;

import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u001aM\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\t\u001aU\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000120\u0010\u0007\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\\\u0010\u0011\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000320\u0010\u0007\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"T", "Ldv/h;", "Lkotlin/Function2;", "Ldv/i;", "Leu/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "action", "e", "(Ldv/h;Lkotlin/jvm/functions/Function2;)Ldv/h;", "Lkotlin/Function3;", BuildConfig.FLAVOR, "d", "(Ldv/h;Lpu/n;)Ldv/h;", "b", "(Ldv/i;)V", "cause", "c", "(Ldv/i;Lpu/n;Ljava/lang/Throwable;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class u {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {212}, m = "invokeSafely$FlowKt__EmittersKt")
    public static final class a<T> extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12845t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f12846u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f12847v;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12846u = obj;
            this.f12847v |= Integer.MIN_VALUE;
            return u.c(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"dv/u$b", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f12848a;
        public final /* synthetic */ pu.n b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {110, 117, 124}, m = "collect")
        public static final class a extends gu.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f12849t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f12850u;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f12852w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f12853x;

            public a(eu.b bVar) {
                super(bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                this.f12849t = obj;
                this.f12850u |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(h hVar, pu.n nVar) {
            this.f12848a = hVar;
            this.b = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0088  */
        /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // dv.h
        public Object collect(i<? super T> iVar, eu.b<? super Unit> bVar) throws Throwable {
            a aVar;
            b<T> bVar2;
            u0 u0Var;
            pu.n nVar;
            kotlin.v vVar;
            Throwable th2;
            kotlin.v vVar2;
            Object objInvoke;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f12850u;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f12850u = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object obj = aVar.f12849t;
            Object objE = fu.c.e();
            int i11 = aVar.f12850u;
            if (i11 == 0) {
                zt.o.b(obj);
                try {
                    h hVar = this.f12848a;
                    aVar.f12852w = this;
                    aVar.f12853x = iVar;
                    aVar.f12850u = 1;
                    if (hVar.collect(iVar, aVar) != objE) {
                        bVar2 = this;
                        vVar = new kotlin.v(iVar, aVar.getContext());
                        pu.n nVar2 = bVar2.b;
                        aVar.f12852w = vVar;
                        aVar.f12853x = null;
                        aVar.f12850u = 3;
                        p001kotlin.jvm.internal.l.c(6);
                        objInvoke = nVar2.invoke(vVar, null, aVar);
                        p001kotlin.jvm.internal.l.c(7);
                        if (objInvoke != objE) {
                            vVar2 = vVar;
                            vVar2.releaseIntercepted();
                            return Unit.f21506a;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bVar2 = this;
                    u0Var = new u0(th);
                    nVar = bVar2.b;
                    aVar.f12852w = th;
                    aVar.f12853x = null;
                    aVar.f12850u = 2;
                    if (u.c(u0Var, nVar, th, aVar) == objE) {
                        throw th;
                    }
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    Throwable th4 = (Throwable) aVar.f12852w;
                    zt.o.b(obj);
                    throw th4;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vVar2 = (kotlin.v) aVar.f12852w;
                try {
                    zt.o.b(obj);
                    vVar2.releaseIntercepted();
                    return Unit.f21506a;
                } catch (Throwable th5) {
                    th2 = th5;
                    vVar2.releaseIntercepted();
                    throw th2;
                }
            }
            iVar = (i) aVar.f12853x;
            bVar2 = (b) aVar.f12852w;
            try {
                zt.o.b(obj);
                vVar = new kotlin.v(iVar, aVar.getContext());
                try {
                    pu.n nVar3 = bVar2.b;
                    aVar.f12852w = vVar;
                    aVar.f12853x = null;
                    aVar.f12850u = 3;
                    p001kotlin.jvm.internal.l.c(6);
                    objInvoke = nVar3.invoke(vVar, null, aVar);
                    p001kotlin.jvm.internal.l.c(7);
                    if (objInvoke != objE) {
                        vVar2 = vVar;
                        vVar2.releaseIntercepted();
                        return Unit.f21506a;
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
                aVar.f12852w = th;
                aVar.f12853x = null;
                aVar.f12850u = 2;
                if (u.c(u0Var, nVar, th, aVar) == objE) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"dv/u$c", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function2 f12854a;
        public final /* synthetic */ h b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {112, 116}, m = "collect")
        public static final class a extends gu.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f12855t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f12856u;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f12858w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f12859x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public Object f12860y;

            public a(eu.b bVar) {
                super(bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                this.f12855t = obj;
                this.f12856u |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(Function2 function2, h hVar) {
            this.f12854a = function2;
            this.b = hVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            if (r7.collect(r2, r0) == r1) goto L27;
         */
        @Override // dv.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(i<? super T> iVar, eu.b<? super Unit> bVar) throws Throwable {
            a aVar;
            Throwable th2;
            kotlin.v vVar;
            c<T> cVar;
            i<? super T> iVar2;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f12856u;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f12856u = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object obj = aVar.f12855t;
            Object objE = fu.c.e();
            int i11 = aVar.f12856u;
            if (i11 != 0) {
                if (i11 == 1) {
                    vVar = (kotlin.v) aVar.f12860y;
                    iVar2 = (i) aVar.f12859x;
                    cVar = (c) aVar.f12858w;
                    try {
                        zt.o.b(obj);
                        vVar.releaseIntercepted();
                        h hVar = cVar.b;
                        aVar.f12858w = null;
                        aVar.f12859x = null;
                        aVar.f12860y = null;
                        aVar.f12856u = 2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        vVar.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }
            zt.o.b(obj);
            kotlin.v vVar2 = new kotlin.v(iVar, aVar.getContext());
            try {
                Function2 function2 = this.f12854a;
                aVar.f12858w = this;
                aVar.f12859x = iVar;
                aVar.f12860y = vVar2;
                aVar.f12856u = 1;
                p001kotlin.jvm.internal.l.c(6);
                Object objInvoke = function2.invoke(vVar2, aVar);
                p001kotlin.jvm.internal.l.c(7);
                if (objInvoke != objE) {
                    cVar = this;
                    iVar2 = iVar;
                    vVar = vVar2;
                    vVar.releaseIntercepted();
                    h hVar2 = cVar.b;
                    aVar.f12858w = null;
                    aVar.f12859x = null;
                    aVar.f12860y = null;
                    aVar.f12856u = 2;
                }
                return objE;
            } catch (Throwable th4) {
                th2 = th4;
                vVar = vVar2;
                vVar.releaseIntercepted();
                throw th2;
            }
        }
    }

    public static final void b(@NotNull i<?> iVar) {
        if (iVar instanceof u0) {
            throw ((u0) iVar).e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object c(i<? super T> iVar, pu.n<? super i<? super T>, ? super Throwable, ? super eu.b<? super Unit>, ? extends Object> nVar, Throwable th2, eu.b<? super Unit> bVar) throws IllegalAccessException, InvocationTargetException {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f12847v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f12847v = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f12846u;
        Object objE = fu.c.e();
        int i11 = aVar.f12847v;
        try {
            if (i11 == 0) {
                zt.o.b(obj);
                aVar.f12845t = th2;
                aVar.f12847v = 1;
                if (nVar.invoke(iVar, th2, aVar) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = (Throwable) aVar.f12845t;
                zt.o.b(obj);
            }
            return Unit.f21506a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                zt.a.a(th3, th2);
            }
            throw th3;
        }
    }

    @NotNull
    public static final <T> h<T> d(@NotNull h<? extends T> hVar, @NotNull pu.n<? super i<? super T>, ? super Throwable, ? super eu.b<? super Unit>, ? extends Object> nVar) {
        return new b(hVar, nVar);
    }

    @NotNull
    public static final <T> h<T> e(@NotNull h<? extends T> hVar, @NotNull Function2<? super i<? super T>, ? super eu.b<? super Unit>, ? extends Object> function2) {
        return new c(function2, hVar);
    }
}
