package lu;

import iu.g2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0005\u001a0\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013\u001aG\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u0014\u0010\f\u001a[\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u000120\b\u0001\u0010\u0017\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"T", "Llu/h;", "", "count", "b", "(Llu/h;I)Llu/h;", "Lkotlin/Function2;", "Llt/b;", "", "", "predicate", "c", "(Llu/h;Lkotlin/jvm/functions/Function2;)Llu/h;", "e", "Llu/i;", "value", "ownershipMarker", "", "d", "(Llu/i;Ljava/lang/Object;Ljava/lang/Object;Llt/b;)Ljava/lang/Object;", "f", "R", "Lkotlin/Function3;", "transform", "g", "(Llu/h;Lxt/n;)Llu/h;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"lu/w$a", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements lu.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lu.h f24127a;
        public final /* synthetic */ int b;

        public a(lu.h hVar, int i10) {
            this.f24127a = hVar;
            this.b = i10;
        }

        @Override // lu.h
        public Object collect(lu.i<? super T> iVar, lt.b<? super Unit> bVar) {
            Object objCollect = this.f24127a.collect(new b(new kotlin.jvm.internal.a0(), this.b, iVar), bVar);
            return objCollect == mt.c.e() ? objCollect : Unit.f22938a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements lu.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.a0 f24128a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lu.i<T> f24129c;

        @nt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {22}, m = "emit")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends nt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f24130t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ b<T> f24131u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f24132v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, lt.b<? super a> bVar2) {
                super(bVar2);
                this.f24131u = bVar;
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                this.f24130t = obj;
                this.f24132v |= Integer.MIN_VALUE;
                return this.f24131u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlin.jvm.internal.a0 a0Var, int i10, lu.i<? super T> iVar) {
            this.f24128a = a0Var;
            this.b = i10;
            this.f24129c = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // lu.i
        public final Object emit(T t8, lt.b<? super Unit> bVar) {
            a aVar;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f24132v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f24132v = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, bVar);
                }
            } else {
                aVar = new a(this, bVar);
            }
            Object obj = aVar.f24130t;
            Object objE = mt.c.e();
            int i11 = aVar.f24132v;
            if (i11 == 0) {
                gt.o.b(obj);
                kotlin.jvm.internal.a0 a0Var = this.f24128a;
                int i12 = a0Var.f23004a;
                if (i12 < this.b) {
                    a0Var.f23004a = i12 + 1;
                    return Unit.f22938a;
                }
                lu.i<T> iVar = this.f24129c;
                aVar.f24132v = 1;
                if (iVar.emit(t8, aVar) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"lu/w$c", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements lu.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lu.h f24133a;
        public final /* synthetic */ Function2 b;

        public c(lu.h hVar, Function2 function2) {
            this.f24133a = hVar;
            this.b = function2;
        }

        @Override // lu.h
        public Object collect(lu.i<? super T> iVar, lt.b<? super Unit> bVar) {
            Object objCollect = this.f24133a.collect(new d(new kotlin.jvm.internal.y(), iVar, this.b), bVar);
            return objCollect == mt.c.e() ? objCollect : Unit.f22938a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> implements lu.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.y f24134a;
        public final /* synthetic */ lu.i<T> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function2<T, lt.b<? super Boolean>, Object> f24135c;

        @nt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {34, 35, 37}, m = "emit")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends nt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f24136t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f24137u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f24138v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ d<T> f24139w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public int f24140x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, lt.b<? super a> bVar) {
                super(bVar);
                this.f24139w = dVar;
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                this.f24138v = obj;
                this.f24140x |= Integer.MIN_VALUE;
                return this.f24139w.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(kotlin.jvm.internal.y yVar, lu.i<? super T> iVar, Function2<? super T, ? super lt.b<? super Boolean>, ? extends Object> function2) {
            this.f24134a = yVar;
            this.b = iVar;
            this.f24135c = function2;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0074  */
        /* JADX WARN: Code duplicated, block: B:36:0x008b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // lu.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, lt.b<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof lu.w.d.a
                if (r0 == 0) goto L13
                r0 = r8
                lu.w$d$a r0 = (lu.w.d.a) r0
                int r1 = r0.f24140x
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f24140x = r1
                goto L18
            L13:
                lu.w$d$a r0 = new lu.w$d$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f24138v
                java.lang.Object r1 = mt.c.e()
                int r2 = r0.f24140x
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                gt.o.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f24137u
                java.lang.Object r2 = r0.f24136t
                lu.w$d r2 = (lu.w.d) r2
                gt.o.b(r8)
                goto L6c
            L41:
                gt.o.b(r8)
                goto L59
            L45:
                gt.o.b(r8)
                kotlin.jvm.internal.y r8 = r6.f24134a
                boolean r8 = r8.f23023a
                if (r8 == 0) goto L5c
                lu.i<T> r8 = r6.b
                r0.f24140x = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                goto L87
            L59:
                kotlin.Unit r7 = kotlin.Unit.f22938a
                return r7
            L5c:
                kotlin.jvm.functions.Function2<T, lt.b<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f24135c
                r0.f24136t = r6
                r0.f24137u = r7
                r0.f24140x = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                goto L87
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.y r8 = r2.f24134a
                r8.f23023a = r5
                lu.i<T> r8 = r2.b
                r2 = 0
                r0.f24136t = r2
                r0.f24137u = r2
                r0.f24140x = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                kotlin.Unit r7 = kotlin.Unit.f22938a
                return r7
            L8b:
                kotlin.Unit r7 = kotlin.Unit.f22938a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: lu.w.d.emit(java.lang.Object, lt.b):java.lang.Object");
        }
    }

    @nt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {71}, m = "emitAbort$FlowKt__LimitKt")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e<T> extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f24141t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f24142u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f24143v;

        public e(lt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24142u = obj;
            this.f24143v |= Integer.MIN_VALUE;
            return w.d(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"lu/w$f", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f<T> implements lu.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lu.h f24144a;
        public final /* synthetic */ int b;

        @nt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {112}, m = "collect")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends nt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f24145t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f24146u;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f24148w;

            public a(lt.b bVar) {
                super(bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                this.f24145t = obj;
                this.f24146u |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(lu.h hVar, int i10) {
            this.f24144a = hVar;
            this.b = i10;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // lu.h
        public Object collect(lu.i<? super T> iVar, lt.b<? super Unit> bVar) {
            a aVar;
            p001mu.a e10;
            Object obj;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f24146u;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f24146u = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object obj2 = aVar.f24145t;
            Object objE = mt.c.e();
            int i11 = aVar.f24146u;
            if (i11 == 0) {
                gt.o.b(obj2);
                Object obj3 = new Object();
                kotlin.jvm.internal.a0 a0Var = new kotlin.jvm.internal.a0();
                try {
                    lu.h hVar = this.f24144a;
                    g gVar = new g(a0Var, this.b, iVar, obj3);
                    aVar.f24148w = obj3;
                    aVar.f24146u = 1;
                    if (hVar.collect(gVar, aVar) == objE) {
                        return objE;
                    }
                } catch (p001mu.a e11) {
                    e10 = e11;
                    obj = obj3;
                    p001mu.p.a(e10, obj);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = aVar.f24148w;
                try {
                    gt.o.b(obj2);
                } catch (p001mu.a e12) {
                    e10 = e12;
                    p001mu.p.a(e10, obj);
                }
            }
            return Unit.f22938a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g<T> implements lu.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.a0 f24149a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lu.i<T> f24150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f24151d;

        @nt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", l = {59, 61}, m = "emit")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends nt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f24152t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ g<T> f24153u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f24154v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(g<? super T> gVar, lt.b<? super a> bVar) {
                super(bVar);
                this.f24153u = gVar;
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                this.f24152t = obj;
                this.f24154v |= Integer.MIN_VALUE;
                return this.f24153u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public g(kotlin.jvm.internal.a0 a0Var, int i10, lu.i<? super T> iVar, Object obj) {
            this.f24149a = a0Var;
            this.b = i10;
            this.f24150c = iVar;
            this.f24151d = obj;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            if (r7.emit(r6, r0) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        
            if (lu.w.d(r7, r6, r2, r0) == r1) goto L25;
         */
        @Override // lu.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, lt.b<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof lu.w.g.a
                if (r0 == 0) goto L13
                r0 = r7
                lu.w$g$a r0 = (lu.w.g.a) r0
                int r1 = r0.f24154v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f24154v = r1
                goto L18
            L13:
                lu.w$g$a r0 = new lu.w$g$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f24152t
                java.lang.Object r1 = mt.c.e()
                int r2 = r0.f24154v
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                gt.o.b(r7)
                goto L61
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                gt.o.b(r7)
                goto L51
            L38:
                gt.o.b(r7)
                kotlin.jvm.internal.a0 r7 = r5.f24149a
                int r2 = r7.f23004a
                int r2 = r2 + r4
                r7.f23004a = r2
                int r7 = r5.b
                if (r2 >= r7) goto L54
                lu.i<T> r7 = r5.f24150c
                r0.f24154v = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                goto L60
            L51:
                kotlin.Unit r6 = kotlin.Unit.f22938a
                return r6
            L54:
                lu.i<T> r7 = r5.f24150c
                java.lang.Object r2 = r5.f24151d
                r0.f24154v = r3
                java.lang.Object r6 = lu.w.a(r7, r6, r2, r0)
                if (r6 != r1) goto L61
            L60:
                return r1
            L61:
                kotlin.Unit r6 = kotlin.Unit.f22938a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: lu.w.g.emit(java.lang.Object, lt.b):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"lu/w$h", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h<T> implements lu.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lu.h f24155a;
        public final /* synthetic */ Function2 b;

        @nt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {120}, m = "collect")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends nt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f24156t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f24157u;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f24159w;

            public a(lt.b bVar) {
                super(bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                this.f24156t = obj;
                this.f24157u |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(lu.h hVar, Function2 function2) {
            this.f24155a = hVar;
            this.b = function2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // lu.h
        public Object collect(lu.i<? super T> iVar, lt.b<? super Unit> bVar) {
            a aVar;
            i iVar2;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f24157u;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f24157u = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object obj = aVar.f24156t;
            Object objE = mt.c.e();
            int i11 = aVar.f24157u;
            if (i11 == 0) {
                gt.o.b(obj);
                lu.h hVar = this.f24155a;
                i iVar3 = new i(this.b, iVar);
                try {
                    aVar.f24159w = iVar3;
                    aVar.f24157u = 1;
                    if (hVar.collect(iVar3, aVar) == objE) {
                        return objE;
                    }
                } catch (p001mu.a e10) {
                    e = e10;
                    iVar2 = iVar3;
                    p001mu.p.a(e, iVar2);
                    g2.g(aVar.getContext());
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar2 = (i) aVar.f24159w;
                try {
                    gt.o.b(obj);
                } catch (p001mu.a e11) {
                    e = e11;
                    p001mu.p.a(e, iVar2);
                    g2.g(aVar.getContext());
                }
            }
            return Unit.f22938a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"lu/w$i", "Llu/i;", "value", "", "emit", "(Ljava/lang/Object;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i<T> implements lu.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function2 f24160a;
        public final /* synthetic */ lu.i b;

        @nt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {132, 133}, m = "emit")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends nt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f24161t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f24162u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f24163v;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f24165x;

            public a(lt.b bVar) {
                super(bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                this.f24162u = obj;
                this.f24163v |= Integer.MIN_VALUE;
                return i.this.emit(null, this);
            }
        }

        public i(Function2 function2, lu.i iVar) {
            this.f24160a = function2;
            this.b = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0081  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r2.emit(r9, r0) == r1) goto L24;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // lu.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r8, lt.b<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof lu.w.i.a
                if (r0 == 0) goto L13
                r0 = r9
                lu.w$i$a r0 = (lu.w.i.a) r0
                int r1 = r0.f24163v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f24163v = r1
                goto L18
            L13:
                lu.w$i$a r0 = new lu.w$i$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f24162u
                java.lang.Object r1 = mt.c.e()
                int r2 = r0.f24163v
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f24161t
                lu.w$i r8 = (lu.w.i) r8
                gt.o.b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f24165x
                java.lang.Object r2 = r0.f24161t
                lu.w$i r2 = (lu.w.i) r2
                gt.o.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                gt.o.b(r9)
                kotlin.jvm.functions.Function2 r9 = r7.f24160a
                r0.f24161t = r7
                r0.f24165x = r8
                r0.f24163v = r4
                r2 = 6
                kotlin.jvm.internal.l.c(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.l.c(r2)
                if (r9 != r1) goto L60
                goto L7a
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                lu.i r2 = r8.b
                r0.f24161t = r8
                r5 = 0
                r0.f24165x = r5
                r0.f24163v = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
            L7a:
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                kotlin.Unit r8 = kotlin.Unit.f22938a
                return r8
            L81:
                mu.a r9 = new mu.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: lu.w.i.emit(java.lang.Object, lt.b):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @nt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", l = {152}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Llu/i;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 1, 0})
    public static final class j<R> extends nt.m implements Function2<lu.i<? super R>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24166t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f24167u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ lu.h<T> f24168v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ xt.n<lu.i<? super R>, T, lt.b<? super Boolean>, Object> f24169w;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"lu/w$j$a", "Llu/i;", "value", "", "emit", "(Ljava/lang/Object;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements lu.i<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ xt.n f24170a;
            public final /* synthetic */ lu.i b;

            /* JADX INFO: renamed from: lu.w$j$a$a, reason: collision with other inner class name */
            @nt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", l = {132}, m = "emit")
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C0429a extends nt.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f24171t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f24172u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public int f24173v;

                public C0429a(lt.b bVar) {
                    super(bVar);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    this.f24172u = obj;
                    this.f24173v |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(xt.n nVar, lu.i iVar) {
                this.f24170a = nVar;
                this.b = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // lu.i
            public Object emit(T t8, lt.b<? super Unit> bVar) {
                C0429a c0429a;
                a<T> aVar;
                if (bVar instanceof C0429a) {
                    c0429a = (C0429a) bVar;
                    int i10 = c0429a.f24173v;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0429a.f24173v = i10 - Integer.MIN_VALUE;
                    } else {
                        c0429a = new C0429a(bVar);
                    }
                } else {
                    c0429a = new C0429a(bVar);
                }
                Object objInvoke = c0429a.f24172u;
                Object objE = mt.c.e();
                int i11 = c0429a.f24173v;
                if (i11 == 0) {
                    gt.o.b(objInvoke);
                    xt.n nVar = this.f24170a;
                    lu.i iVar = this.b;
                    c0429a.f24171t = this;
                    c0429a.f24173v = 1;
                    kotlin.jvm.internal.l.c(6);
                    objInvoke = nVar.invoke(iVar, t8, c0429a);
                    kotlin.jvm.internal.l.c(7);
                    if (objInvoke == objE) {
                        return objE;
                    }
                    aVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) c0429a.f24171t;
                    gt.o.b(objInvoke);
                }
                if (((Boolean) objInvoke).booleanValue()) {
                    return Unit.f22938a;
                }
                throw new p001mu.a(aVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(lu.h<? extends T> hVar, xt.n<? super lu.i<? super R>, ? super T, ? super lt.b<? super Boolean>, ? extends Object> nVar, lt.b<? super j> bVar) {
            super(2, bVar);
            this.f24168v = hVar;
            this.f24169w = nVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            j jVar = new j(this.f24168v, this.f24169w, bVar);
            jVar.f24167u = obj;
            return jVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type lt.b to lu.w$j<R> for r5v1 'this'  lt.b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // nt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r5.f24166t
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r5.f24167u
                lu.w$j$a r0 = (lu.w.j.a) r0
                gt.o.b(r6)     // Catch: p001mu.a -> L13
                goto L44
            L13:
                r6 = move-exception
                goto L3a
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                gt.o.b(r6)
                java.lang.Object r6 = r5.f24167u
                lu.i r6 = (lu.i) r6
                lu.h<T> r1 = r5.f24168v
                xt.n<lu.i<? super R>, T, lt.b<? super java.lang.Boolean>, java.lang.Object> r3 = r5.f24169w
                lu.w$j$a r4 = new lu.w$j$a
                r4.<init>(r3, r6)
                r5.f24167u = r4     // Catch: p001mu.a -> L38
                r5.f24166t = r2     // Catch: p001mu.a -> L38
                java.lang.Object r6 = r1.collect(r4, r5)     // Catch: p001mu.a -> L38
                if (r6 != r0) goto L44
                return r0
            L38:
                r6 = move-exception
                r0 = r4
            L3a:
                p001mu.p.a(r6, r0)
                kotlin.coroutines.CoroutineContext r6 = r5.getContext()
                iu.g2.g(r6)
            L44:
                kotlin.Unit r6 = kotlin.Unit.f22938a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: lu.w.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lu.i<? super R> iVar, lt.b<? super Unit> bVar) {
            return ((j) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @NotNull
    public static final <T> lu.h<T> b(@NotNull lu.h<? extends T> hVar, int i10) {
        if (i10 >= 0) {
            return new a(hVar, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    @NotNull
    public static final <T> lu.h<T> c(@NotNull lu.h<? extends T> hVar, @NotNull Function2<? super T, ? super lt.b<? super Boolean>, ? extends Object> function2) {
        return new c(hVar, function2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object d(lu.i<? super T> iVar, T t8, Object obj, lt.b<? super Unit> bVar) {
        e eVar;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i10 = eVar.f24143v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f24143v = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar);
            }
        } else {
            eVar = new e(bVar);
        }
        Object obj2 = eVar.f24142u;
        Object objE = mt.c.e();
        int i11 = eVar.f24143v;
        if (i11 == 0) {
            gt.o.b(obj2);
            eVar.f24141t = obj;
            eVar.f24143v = 1;
            if (iVar.emit(t8, eVar) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = eVar.f24141t;
            gt.o.b(obj2);
        }
        throw new p001mu.a(obj);
    }

    @NotNull
    public static final <T> lu.h<T> e(@NotNull lu.h<? extends T> hVar, int i10) {
        if (i10 > 0) {
            return new f(hVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    @NotNull
    public static final <T> lu.h<T> f(@NotNull lu.h<? extends T> hVar, @NotNull Function2<? super T, ? super lt.b<? super Boolean>, ? extends Object> function2) {
        return new h(hVar, function2);
    }

    @NotNull
    public static final <T, R> lu.h<R> g(@NotNull lu.h<? extends T> hVar, @NotNull xt.n<? super lu.i<? super R>, ? super T, ? super lt.b<? super Boolean>, ? extends Object> nVar) {
        return lu.j.w(new j(hVar, nVar, null));
    }
}
