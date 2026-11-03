package lu;

import iu.g2;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001aD\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u000b\u0010\u0003¨\u0006\f"}, d2 = {"T", "Llu/h;", "b", "(Llu/h;Llt/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "Llt/b;", "", "", "predicate", "a", "(Llu/h;Lkotlin/jvm/functions/Function2;Llt/b;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"lu/y$a", "Llu/i;", "value", "", "emit", "(Ljava/lang/Object;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.c0 f24180a;

        public a(kotlin.jvm.internal.c0 c0Var) {
            this.f24180a = c0Var;
        }

        @Override // lu.i
        public Object emit(T t8, lt.b<? super Unit> bVar) {
            this.f24180a.f23007a = t8;
            throw new p001mu.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"lu/y$b", "Llu/i;", "value", "", "emit", "(Ljava/lang/Object;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function2 f24181a;
        public final /* synthetic */ kotlin.jvm.internal.c0 b;

        @nt.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {132}, m = "emit")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends nt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f24182t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f24183u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f24184v;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f24186x;

            public a(lt.b bVar) {
                super(bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                this.f24183u = obj;
                this.f24184v |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(Function2 function2, kotlin.jvm.internal.c0 c0Var) {
            this.f24181a = function2;
            this.b = c0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // lu.i
        public Object emit(T t8, lt.b<? super Unit> bVar) {
            a aVar;
            b<T> bVar2;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f24184v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f24184v = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object objInvoke = aVar.f24183u;
            Object objE = mt.c.e();
            int i11 = aVar.f24184v;
            if (i11 == 0) {
                gt.o.b(objInvoke);
                Function2 function2 = this.f24181a;
                aVar.f24182t = this;
                aVar.f24186x = t8;
                aVar.f24184v = 1;
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
                t8 = (T) aVar.f24186x;
                bVar2 = (b) aVar.f24182t;
                gt.o.b(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return Unit.f22938a;
            }
            bVar2.b.f23007a = t8;
            throw new p001mu.a(bVar2);
        }
    }

    @nt.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f24187t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f24188u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f24189v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f24190w;

        public c(lt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24189v = obj;
            this.f24190w |= Integer.MIN_VALUE;
            return j.u(null, this);
        }
    }

    @nt.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f24191t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f24192u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f24193v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f24194w;

        public d(lt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24193v = obj;
            this.f24194w |= Integer.MIN_VALUE;
            return j.t(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"lu/y$e", "Llu/i;", "value", "", "emit", "(Ljava/lang/Object;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.c0 f24195a;

        public e(kotlin.jvm.internal.c0 c0Var) {
            this.f24195a = c0Var;
        }

        @Override // lu.i
        public Object emit(T t8, lt.b<? super Unit> bVar) {
            this.f24195a.f23007a = t8;
            throw new p001mu.a(this);
        }
    }

    @nt.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "firstOrNull")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class f<T> extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f24196t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f24197u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f24198v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f24199w;

        public f(lt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24198v = obj;
            this.f24199w |= Integer.MIN_VALUE;
            return j.v(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object a(@NotNull h<? extends T> hVar, @NotNull Function2<? super T, ? super lt.b<? super Boolean>, ? extends Object> function2, @NotNull lt.b<? super T> bVar) {
        d dVar;
        kotlin.jvm.internal.c0 c0Var;
        p001mu.a e10;
        i<? super Object> iVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f24194w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f24194w = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f24193v;
        Object objE = mt.c.e();
        int i11 = dVar.f24194w;
        if (i11 == 0) {
            gt.o.b(obj);
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            c0Var2.f23007a = (T) p001mu.t.f25389a;
            i<? super Object> bVar2 = new b<>(function2, c0Var2);
            try {
                dVar.f24191t = c0Var2;
                dVar.f24192u = bVar2;
                dVar.f24194w = 1;
                if (hVar.collect(bVar2, dVar) == objE) {
                    return objE;
                }
                c0Var = c0Var2;
            } catch (p001mu.a e11) {
                c0Var = c0Var2;
                e10 = e11;
                iVar = bVar2;
                p001mu.p.a(e10, iVar);
                g2.g(dVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (b) dVar.f24192u;
            c0Var = (kotlin.jvm.internal.c0) dVar.f24191t;
            try {
                gt.o.b(obj);
            } catch (p001mu.a e12) {
                e10 = e12;
                p001mu.p.a(e10, iVar);
                g2.g(dVar.getContext());
            }
        }
        T t8 = c0Var.f23007a;
        if (t8 != p001mu.t.f25389a) {
            return t8;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object b(@NotNull h<? extends T> hVar, @NotNull lt.b<? super T> bVar) {
        c cVar;
        kotlin.jvm.internal.c0 c0Var;
        p001mu.a e10;
        i<? super Object> iVar;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f24190w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f24190w = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object obj = cVar.f24189v;
        Object objE = mt.c.e();
        int i11 = cVar.f24190w;
        if (i11 == 0) {
            gt.o.b(obj);
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            c0Var2.f23007a = (T) p001mu.t.f25389a;
            i<? super Object> aVar = new a<>(c0Var2);
            try {
                cVar.f24187t = c0Var2;
                cVar.f24188u = aVar;
                cVar.f24190w = 1;
                if (hVar.collect(aVar, cVar) == objE) {
                    return objE;
                }
                c0Var = c0Var2;
            } catch (p001mu.a e11) {
                c0Var = c0Var2;
                e10 = e11;
                iVar = aVar;
                p001mu.p.a(e10, iVar);
                g2.g(cVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (a) cVar.f24188u;
            c0Var = (kotlin.jvm.internal.c0) cVar.f24187t;
            try {
                gt.o.b(obj);
            } catch (p001mu.a e12) {
                e10 = e12;
                p001mu.p.a(e10, iVar);
                g2.g(cVar.getContext());
            }
        }
        T t8 = c0Var.f23007a;
        if (t8 != p001mu.t.f25389a) {
            return t8;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object c(@NotNull h<? extends T> hVar, @NotNull lt.b<? super T> bVar) {
        f fVar;
        kotlin.jvm.internal.c0 c0Var;
        p001mu.a e10;
        i<? super Object> iVar;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.f24199w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f24199w = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object obj = fVar.f24198v;
        Object objE = mt.c.e();
        int i11 = fVar.f24199w;
        if (i11 == 0) {
            gt.o.b(obj);
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            i<? super Object> eVar = new e<>(c0Var2);
            try {
                fVar.f24196t = c0Var2;
                fVar.f24197u = eVar;
                fVar.f24199w = 1;
                if (hVar.collect(eVar, fVar) == objE) {
                    return objE;
                }
                c0Var = c0Var2;
            } catch (p001mu.a e11) {
                c0Var = c0Var2;
                e10 = e11;
                iVar = eVar;
                p001mu.p.a(e10, iVar);
                g2.g(fVar.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (e) fVar.f24197u;
            c0Var = (kotlin.jvm.internal.c0) fVar.f24196t;
            try {
                gt.o.b(obj);
            } catch (p001mu.a e12) {
                e10 = e12;
                p001mu.p.a(e10, iVar);
                g2.g(fVar.getContext());
            }
        }
        return c0Var.f23007a;
    }
}
