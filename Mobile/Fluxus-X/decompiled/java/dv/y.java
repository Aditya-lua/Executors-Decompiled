package dv;

import av.g2;
import com.github.luben.zstd.BuildConfig;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001aD\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u000b\u0010\u0003¨\u0006\f"}, d2 = {"T", "Ldv/h;", "a", "(Ldv/h;Leu/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "Leu/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "predicate", "b", "(Ldv/h;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"dv/y$a", "Ldv/i;", "value", BuildConfig.FLAVOR, "emit", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p001kotlin.jvm.internal.c0 f12937a;

        public a(p001kotlin.jvm.internal.c0 c0Var) {
            this.f12937a = c0Var;
        }

        @Override // dv.i
        public Object emit(T t8, eu.b<? super Unit> bVar) {
            this.f12937a.f21575a = t8;
            throw new kotlin.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"dv/y$b", "Ldv/i;", "value", BuildConfig.FLAVOR, "emit", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function2 f12938a;
        public final /* synthetic */ p001kotlin.jvm.internal.c0 b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {132}, m = "emit")
        public static final class a extends gu.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f12939t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f12940u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f12941v;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f12943x;

            public a(eu.b bVar) {
                super(bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                this.f12940u = obj;
                this.f12941v |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(Function2 function2, p001kotlin.jvm.internal.c0 c0Var) {
            this.f12938a = function2;
            this.b = c0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // dv.i
        public Object emit(T t8, eu.b<? super Unit> bVar) {
            a aVar;
            b<T> bVar2;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f12941v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f12941v = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object objInvoke = aVar.f12940u;
            Object objE = fu.c.e();
            int i11 = aVar.f12941v;
            if (i11 == 0) {
                zt.o.b(objInvoke);
                Function2 function2 = this.f12938a;
                aVar.f12939t = this;
                aVar.f12943x = t8;
                aVar.f12941v = 1;
                p001kotlin.jvm.internal.l.c(6);
                objInvoke = function2.invoke(t8, aVar);
                p001kotlin.jvm.internal.l.c(7);
                if (objInvoke == objE) {
                    return objE;
                }
                bVar2 = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t8 = (T) aVar.f12943x;
                bVar2 = (b) aVar.f12939t;
                zt.o.b(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.f21506a;
            }
            bVar2.b.f21575a = t8;
            throw new kotlin.a(bVar2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    public static final class c<T> extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12944t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12945u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f12946v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f12947w;

        public c(eu.b<? super c> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12946v = obj;
            this.f12947w |= Integer.MIN_VALUE;
            return j.t(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    public static final class d<T> extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12948t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12949u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f12950v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f12951w;

        public d(eu.b<? super d> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12950v = obj;
            this.f12951w |= Integer.MIN_VALUE;
            return j.u(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"dv/y$e", "Ldv/i;", "value", BuildConfig.FLAVOR, "emit", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p001kotlin.jvm.internal.c0 f12952a;

        public e(p001kotlin.jvm.internal.c0 c0Var) {
            this.f12952a = c0Var;
        }

        @Override // dv.i
        public Object emit(T t8, eu.b<? super Unit> bVar) {
            this.f12952a.f21575a = t8;
            throw new kotlin.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "firstOrNull")
    public static final class f<T> extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12953t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12954u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f12955v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f12956w;

        public f(eu.b<? super f> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12955v = obj;
            this.f12956w |= Integer.MIN_VALUE;
            return j.v(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object a(@NotNull h<? extends T> hVar, @NotNull eu.b<? super T> bVar) {
        c cVar;
        p001kotlin.jvm.internal.c0 c0Var;
        kotlin.a e10;
        i<? super Object> iVar;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f12947w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f12947w = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object obj = cVar.f12946v;
        Object objE = fu.c.e();
        int i11 = cVar.f12947w;
        if (i11 == 0) {
            zt.o.b(obj);
            p001kotlin.jvm.internal.c0 c0Var2 = new p001kotlin.jvm.internal.c0();
            c0Var2.f21575a = (T) kotlin.t.f14752a;
            i<? super Object> aVar = new a<>(c0Var2);
            try {
                cVar.f12944t = c0Var2;
                cVar.f12945u = aVar;
                cVar.f12947w = 1;
                if (hVar.collect(aVar, cVar) == objE) {
                    return objE;
                }
                c0Var = c0Var2;
            } catch (kotlin.a e11) {
                c0Var = c0Var2;
                e10 = e11;
                iVar = aVar;
                kotlin.p.a(e10, iVar);
                g2.i(cVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (a) cVar.f12945u;
            c0Var = (p001kotlin.jvm.internal.c0) cVar.f12944t;
            try {
                zt.o.b(obj);
            } catch (kotlin.a e12) {
                e10 = e12;
                kotlin.p.a(e10, iVar);
                g2.i(cVar.getContext());
            }
        }
        T t8 = c0Var.f21575a;
        if (t8 != kotlin.t.f14752a) {
            return t8;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object b(@NotNull h<? extends T> hVar, @NotNull Function2<? super T, ? super eu.b<? super Boolean>, ? extends Object> function2, @NotNull eu.b<? super T> bVar) {
        d dVar;
        p001kotlin.jvm.internal.c0 c0Var;
        kotlin.a e10;
        i<? super Object> iVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f12951w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f12951w = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f12950v;
        Object objE = fu.c.e();
        int i11 = dVar.f12951w;
        if (i11 == 0) {
            zt.o.b(obj);
            p001kotlin.jvm.internal.c0 c0Var2 = new p001kotlin.jvm.internal.c0();
            c0Var2.f21575a = (T) kotlin.t.f14752a;
            i<? super Object> bVar2 = new b<>(function2, c0Var2);
            try {
                dVar.f12948t = c0Var2;
                dVar.f12949u = bVar2;
                dVar.f12951w = 1;
                if (hVar.collect(bVar2, dVar) == objE) {
                    return objE;
                }
                c0Var = c0Var2;
            } catch (kotlin.a e11) {
                c0Var = c0Var2;
                e10 = e11;
                iVar = bVar2;
                kotlin.p.a(e10, iVar);
                g2.i(dVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (b) dVar.f12949u;
            c0Var = (p001kotlin.jvm.internal.c0) dVar.f12948t;
            try {
                zt.o.b(obj);
            } catch (kotlin.a e12) {
                e10 = e12;
                kotlin.p.a(e10, iVar);
                g2.i(dVar.getContext());
            }
        }
        T t8 = c0Var.f21575a;
        if (t8 != kotlin.t.f14752a) {
            return t8;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object c(@NotNull h<? extends T> hVar, @NotNull eu.b<? super T> bVar) {
        f fVar;
        p001kotlin.jvm.internal.c0 c0Var;
        kotlin.a e10;
        i<? super Object> iVar;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.f12956w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f12956w = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object obj = fVar.f12955v;
        Object objE = fu.c.e();
        int i11 = fVar.f12956w;
        if (i11 == 0) {
            zt.o.b(obj);
            p001kotlin.jvm.internal.c0 c0Var2 = new p001kotlin.jvm.internal.c0();
            i<? super Object> eVar = new e<>(c0Var2);
            try {
                fVar.f12953t = c0Var2;
                fVar.f12954u = eVar;
                fVar.f12956w = 1;
                if (hVar.collect(eVar, fVar) == objE) {
                    return objE;
                }
                c0Var = c0Var2;
            } catch (kotlin.a e11) {
                c0Var = c0Var2;
                e10 = e11;
                iVar = eVar;
                kotlin.p.a(e10, iVar);
                g2.i(fVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (e) fVar.f12954u;
            c0Var = (p001kotlin.jvm.internal.c0) fVar.f12953t;
            try {
                zt.o.b(obj);
            } catch (kotlin.a e12) {
                e10 = e12;
                kotlin.p.a(e10, iVar);
                g2.i(fVar.getContext());
            }
        }
        return c0Var.f21575a;
    }
}
