package nu;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ku.g2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001aD\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u000b\u0010\u0003¨\u0006\f"}, d2 = {"T", "Lnu/h;", "b", "(Lnu/h;Lnt/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lnt/b;", "", "", "predicate", "a", "(Lnu/h;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"nu/y$a", "Lnu/i;", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.c0 f26891a;

        public a(kotlin.jvm.internal.c0 c0Var) {
            this.f26891a = c0Var;
        }

        @Override // nu.i
        public Object emit(T t8, nt.b<? super Unit> bVar) {
            this.f26891a.f22552a = t8;
            throw new p001ou.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"nu/y$b", "Lnu/i;", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function2 f26892a;
        public final /* synthetic */ kotlin.jvm.internal.c0 b;

        @pt.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {132}, m = "emit")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends pt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f26893t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f26894u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f26895v;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f26897x;

            public a(nt.b bVar) {
                super(bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                this.f26894u = obj;
                this.f26895v |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(Function2 function2, kotlin.jvm.internal.c0 c0Var) {
            this.f26892a = function2;
            this.b = c0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // nu.i
        public Object emit(T t8, nt.b<? super Unit> bVar) {
            a aVar;
            b<T> bVar2;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f26895v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f26895v = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object objInvoke = aVar.f26894u;
            Object objE = ot.c.e();
            int i11 = aVar.f26895v;
            if (i11 == 0) {
                jt.o.b(objInvoke);
                Function2 function2 = this.f26892a;
                aVar.f26893t = this;
                aVar.f26897x = t8;
                aVar.f26895v = 1;
                kotlin.jvm.internal.l.c(6);
                objInvoke = function2.invoke(t8, aVar);
                kotlin.jvm.internal.l.c(7);
                if (objInvoke == objE) {
                    return objE;
                }
                bVar2 = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t8 = (T) aVar.f26897x;
                bVar2 = (b) aVar.f26893t;
                jt.o.b(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.f22483a;
            }
            bVar2.b.f22552a = t8;
            throw new p001ou.a(bVar2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    public static final class c<T> extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26898t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f26899u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f26900v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f26901w;

        public c(nt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f26900v = obj;
            this.f26901w |= Integer.MIN_VALUE;
            return j.u(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    public static final class d<T> extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26902t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f26903u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f26904v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f26905w;

        public d(nt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f26904v = obj;
            this.f26905w |= Integer.MIN_VALUE;
            return j.t(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"nu/y$e", "Lnu/i;", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.c0 f26906a;

        public e(kotlin.jvm.internal.c0 c0Var) {
            this.f26906a = c0Var;
        }

        @Override // nu.i
        public Object emit(T t8, nt.b<? super Unit> bVar) {
            this.f26906a.f22552a = t8;
            throw new p001ou.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "firstOrNull")
    public static final class f<T> extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26907t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f26908u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f26909v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f26910w;

        public f(nt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f26909v = obj;
            this.f26910w |= Integer.MIN_VALUE;
            return j.v(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object a(@NotNull h<? extends T> hVar, @NotNull Function2<? super T, ? super nt.b<? super Boolean>, ? extends Object> function2, @NotNull nt.b<? super T> bVar) {
        d dVar;
        kotlin.jvm.internal.c0 c0Var;
        p001ou.a e10;
        i<? super Object> iVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f26905w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f26905w = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f26904v;
        Object objE = ot.c.e();
        int i11 = dVar.f26905w;
        if (i11 == 0) {
            jt.o.b(obj);
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            c0Var2.f22552a = (T) p001ou.t.f28008a;
            i<? super Object> bVar2 = new b<>(function2, c0Var2);
            try {
                dVar.f26902t = c0Var2;
                dVar.f26903u = bVar2;
                dVar.f26905w = 1;
                if (hVar.collect(bVar2, dVar) == objE) {
                    return objE;
                }
                c0Var = c0Var2;
            } catch (p001ou.a e11) {
                c0Var = c0Var2;
                e10 = e11;
                iVar = bVar2;
                p001ou.p.a(e10, iVar);
                g2.f(dVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (b) dVar.f26903u;
            c0Var = (kotlin.jvm.internal.c0) dVar.f26902t;
            try {
                jt.o.b(obj);
            } catch (p001ou.a e12) {
                e10 = e12;
                p001ou.p.a(e10, iVar);
                g2.f(dVar.getContext());
            }
        }
        T t8 = c0Var.f22552a;
        if (t8 != p001ou.t.f28008a) {
            return t8;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object b(@NotNull h<? extends T> hVar, @NotNull nt.b<? super T> bVar) {
        c cVar;
        kotlin.jvm.internal.c0 c0Var;
        p001ou.a e10;
        i<? super Object> iVar;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f26901w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f26901w = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object obj = cVar.f26900v;
        Object objE = ot.c.e();
        int i11 = cVar.f26901w;
        if (i11 == 0) {
            jt.o.b(obj);
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            c0Var2.f22552a = (T) p001ou.t.f28008a;
            i<? super Object> aVar = new a<>(c0Var2);
            try {
                cVar.f26898t = c0Var2;
                cVar.f26899u = aVar;
                cVar.f26901w = 1;
                if (hVar.collect(aVar, cVar) == objE) {
                    return objE;
                }
                c0Var = c0Var2;
            } catch (p001ou.a e11) {
                c0Var = c0Var2;
                e10 = e11;
                iVar = aVar;
                p001ou.p.a(e10, iVar);
                g2.f(cVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (a) cVar.f26899u;
            c0Var = (kotlin.jvm.internal.c0) cVar.f26898t;
            try {
                jt.o.b(obj);
            } catch (p001ou.a e12) {
                e10 = e12;
                p001ou.p.a(e10, iVar);
                g2.f(cVar.getContext());
            }
        }
        T t8 = c0Var.f22552a;
        if (t8 != p001ou.t.f28008a) {
            return t8;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object c(@NotNull h<? extends T> hVar, @NotNull nt.b<? super T> bVar) {
        f fVar;
        kotlin.jvm.internal.c0 c0Var;
        p001ou.a e10;
        i<? super Object> iVar;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.f26910w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f26910w = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object obj = fVar.f26909v;
        Object objE = ot.c.e();
        int i11 = fVar.f26910w;
        if (i11 == 0) {
            jt.o.b(obj);
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            i<? super Object> eVar = new e<>(c0Var2);
            try {
                fVar.f26907t = c0Var2;
                fVar.f26908u = eVar;
                fVar.f26910w = 1;
                if (hVar.collect(eVar, fVar) == objE) {
                    return objE;
                }
                c0Var = c0Var2;
            } catch (p001ou.a e11) {
                c0Var = c0Var2;
                e10 = e11;
                iVar = eVar;
                p001ou.p.a(e10, iVar);
                g2.f(fVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (e) fVar.f26908u;
            c0Var = (kotlin.jvm.internal.c0) fVar.f26907t;
            try {
                jt.o.b(obj);
            } catch (p001ou.a e12) {
                e10 = e12;
                p001ou.p.a(e10, iVar);
                g2.f(fVar.getContext());
            }
        }
        return c0Var.f22552a;
    }
}
