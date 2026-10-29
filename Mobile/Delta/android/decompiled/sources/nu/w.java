package nu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ku.g2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0005\u001a0\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013\u001aG\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u0014\u0010\f\u001a[\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u000120\b\u0001\u0010\u0017\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"T", "Lnu/h;", "", "count", "b", "(Lnu/h;I)Lnu/h;", "Lkotlin/Function2;", "Lnt/b;", "", "", "predicate", "c", "(Lnu/h;Lkotlin/jvm/functions/Function2;)Lnu/h;", "e", "Lnu/i;", "value", "ownershipMarker", "", "d", "(Lnu/i;Ljava/lang/Object;Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "f", "R", "Lkotlin/Function3;", "transform", "g", "(Lnu/h;Lzt/n;)Lnu/h;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"nu/w$a", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements nu.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nu.h f26838a;
        public final /* synthetic */ int b;

        public a(nu.h hVar, int i10) {
            this.f26838a = hVar;
            this.b = i10;
        }

        @Override // nu.h
        public Object collect(nu.i<? super T> iVar, nt.b<? super Unit> bVar) {
            Object objCollect = this.f26838a.collect(new b(new kotlin.jvm.internal.a0(), this.b, iVar), bVar);
            return objCollect == ot.c.e() ? objCollect : Unit.f22483a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements nu.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.a0 f26839a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ nu.i<T> f26840c;

        @pt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {22}, m = "emit")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends pt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f26841t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ b<T> f26842u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f26843v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, nt.b<? super a> bVar2) {
                super(bVar2);
                this.f26842u = bVar;
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                this.f26841t = obj;
                this.f26843v |= Integer.MIN_VALUE;
                return this.f26842u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlin.jvm.internal.a0 a0Var, int i10, nu.i<? super T> iVar) {
            this.f26839a = a0Var;
            this.b = i10;
            this.f26840c = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // nu.i
        public final Object emit(T t8, nt.b<? super Unit> bVar) {
            a aVar;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f26843v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f26843v = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, bVar);
                }
            } else {
                aVar = new a(this, bVar);
            }
            Object obj = aVar.f26841t;
            Object objE = ot.c.e();
            int i11 = aVar.f26843v;
            if (i11 == 0) {
                jt.o.b(obj);
                kotlin.jvm.internal.a0 a0Var = this.f26839a;
                int i12 = a0Var.f22549a;
                if (i12 < this.b) {
                    a0Var.f22549a = i12 + 1;
                    return Unit.f22483a;
                }
                nu.i<T> iVar = this.f26840c;
                aVar.f26843v = 1;
                if (iVar.emit(t8, aVar) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return Unit.f22483a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"nu/w$c", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements nu.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nu.h f26844a;
        public final /* synthetic */ Function2 b;

        public c(nu.h hVar, Function2 function2) {
            this.f26844a = hVar;
            this.b = function2;
        }

        @Override // nu.h
        public Object collect(nu.i<? super T> iVar, nt.b<? super Unit> bVar) {
            Object objCollect = this.f26844a.collect(new d(new kotlin.jvm.internal.y(), iVar, this.b), bVar);
            return objCollect == ot.c.e() ? objCollect : Unit.f22483a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> implements nu.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.y f26845a;
        public final /* synthetic */ nu.i<T> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function2<T, nt.b<? super Boolean>, Object> f26846c;

        @pt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {34, 35, 37}, m = "emit")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends pt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f26847t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f26848u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f26849v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ d<T> f26850w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public int f26851x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, nt.b<? super a> bVar) {
                super(bVar);
                this.f26850w = dVar;
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                this.f26849v = obj;
                this.f26851x |= Integer.MIN_VALUE;
                return this.f26850w.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(kotlin.jvm.internal.y yVar, nu.i<? super T> iVar, Function2<? super T, ? super nt.b<? super Boolean>, ? extends Object> function2) {
            this.f26845a = yVar;
            this.b = iVar;
            this.f26846c = function2;
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
        @Override // nu.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, nt.b<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof nu.w.d.a
                if (r0 == 0) goto L13
                r0 = r8
                nu.w$d$a r0 = (nu.w.d.a) r0
                int r1 = r0.f26851x
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f26851x = r1
                goto L18
            L13:
                nu.w$d$a r0 = new nu.w$d$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f26849v
                java.lang.Object r1 = ot.c.e()
                int r2 = r0.f26851x
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                jt.o.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f26848u
                java.lang.Object r2 = r0.f26847t
                nu.w$d r2 = (nu.w.d) r2
                jt.o.b(r8)
                goto L6c
            L41:
                jt.o.b(r8)
                goto L59
            L45:
                jt.o.b(r8)
                kotlin.jvm.internal.y r8 = r6.f26845a
                boolean r8 = r8.f22568a
                if (r8 == 0) goto L5c
                nu.i<T> r8 = r6.b
                r0.f26851x = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                goto L87
            L59:
                kotlin.Unit r7 = kotlin.Unit.f22483a
                return r7
            L5c:
                kotlin.jvm.functions.Function2<T, nt.b<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f26846c
                r0.f26847t = r6
                r0.f26848u = r7
                r0.f26851x = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                goto L87
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.y r8 = r2.f26845a
                r8.f22568a = r5
                nu.i<T> r8 = r2.b
                r2 = 0
                r0.f26847t = r2
                r0.f26848u = r2
                r0.f26851x = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                kotlin.Unit r7 = kotlin.Unit.f22483a
                return r7
            L8b:
                kotlin.Unit r7 = kotlin.Unit.f22483a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: nu.w.d.emit(java.lang.Object, nt.b):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {71}, m = "emitAbort$FlowKt__LimitKt")
    public static final class e<T> extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26852t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f26853u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f26854v;

        public e(nt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f26853u = obj;
            this.f26854v |= Integer.MIN_VALUE;
            return w.d(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"nu/w$f", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f<T> implements nu.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nu.h f26855a;
        public final /* synthetic */ int b;

        @pt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {112}, m = "collect")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends pt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f26856t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f26857u;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f26859w;

            public a(nt.b bVar) {
                super(bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                this.f26856t = obj;
                this.f26857u |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(nu.h hVar, int i10) {
            this.f26855a = hVar;
            this.b = i10;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // nu.h
        public Object collect(nu.i<? super T> iVar, nt.b<? super Unit> bVar) {
            a aVar;
            p001ou.a e10;
            Object obj;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f26857u;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f26857u = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object obj2 = aVar.f26856t;
            Object objE = ot.c.e();
            int i11 = aVar.f26857u;
            if (i11 == 0) {
                jt.o.b(obj2);
                Object obj3 = new Object();
                kotlin.jvm.internal.a0 a0Var = new kotlin.jvm.internal.a0();
                try {
                    nu.h hVar = this.f26855a;
                    g gVar = new g(a0Var, this.b, iVar, obj3);
                    aVar.f26859w = obj3;
                    aVar.f26857u = 1;
                    if (hVar.collect(gVar, aVar) == objE) {
                        return objE;
                    }
                } catch (p001ou.a e11) {
                    e10 = e11;
                    obj = obj3;
                    p001ou.p.a(e10, obj);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = aVar.f26859w;
                try {
                    jt.o.b(obj2);
                } catch (p001ou.a e12) {
                    e10 = e12;
                    p001ou.p.a(e10, obj);
                }
            }
            return Unit.f22483a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g<T> implements nu.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.a0 f26860a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ nu.i<T> f26861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f26862d;

        @pt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", l = {59, 61}, m = "emit")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends pt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f26863t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ g<T> f26864u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f26865v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(g<? super T> gVar, nt.b<? super a> bVar) {
                super(bVar);
                this.f26864u = gVar;
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                this.f26863t = obj;
                this.f26865v |= Integer.MIN_VALUE;
                return this.f26864u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public g(kotlin.jvm.internal.a0 a0Var, int i10, nu.i<? super T> iVar, Object obj) {
            this.f26860a = a0Var;
            this.b = i10;
            this.f26861c = iVar;
            this.f26862d = obj;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            if (r7.emit(r6, r0) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        
            if (nu.w.d(r7, r6, r2, r0) == r1) goto L25;
         */
        @Override // nu.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, nt.b<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof nu.w.g.a
                if (r0 == 0) goto L13
                r0 = r7
                nu.w$g$a r0 = (nu.w.g.a) r0
                int r1 = r0.f26865v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f26865v = r1
                goto L18
            L13:
                nu.w$g$a r0 = new nu.w$g$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f26863t
                java.lang.Object r1 = ot.c.e()
                int r2 = r0.f26865v
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                jt.o.b(r7)
                goto L61
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                jt.o.b(r7)
                goto L51
            L38:
                jt.o.b(r7)
                kotlin.jvm.internal.a0 r7 = r5.f26860a
                int r2 = r7.f22549a
                int r2 = r2 + r4
                r7.f22549a = r2
                int r7 = r5.b
                if (r2 >= r7) goto L54
                nu.i<T> r7 = r5.f26861c
                r0.f26865v = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                goto L60
            L51:
                kotlin.Unit r6 = kotlin.Unit.f22483a
                return r6
            L54:
                nu.i<T> r7 = r5.f26861c
                java.lang.Object r2 = r5.f26862d
                r0.f26865v = r3
                java.lang.Object r6 = nu.w.a(r7, r6, r2, r0)
                if (r6 != r1) goto L61
            L60:
                return r1
            L61:
                kotlin.Unit r6 = kotlin.Unit.f22483a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nu.w.g.emit(java.lang.Object, nt.b):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"nu/w$h", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h<T> implements nu.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nu.h f26866a;
        public final /* synthetic */ Function2 b;

        @pt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {120}, m = "collect")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends pt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f26867t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f26868u;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f26870w;

            public a(nt.b bVar) {
                super(bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                this.f26867t = obj;
                this.f26868u |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(nu.h hVar, Function2 function2) {
            this.f26866a = hVar;
            this.b = function2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // nu.h
        public Object collect(nu.i<? super T> iVar, nt.b<? super Unit> bVar) {
            a aVar;
            i iVar2;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f26868u;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f26868u = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object obj = aVar.f26867t;
            Object objE = ot.c.e();
            int i11 = aVar.f26868u;
            if (i11 == 0) {
                jt.o.b(obj);
                nu.h hVar = this.f26866a;
                i iVar3 = new i(this.b, iVar);
                try {
                    aVar.f26870w = iVar3;
                    aVar.f26868u = 1;
                    if (hVar.collect(iVar3, aVar) == objE) {
                        return objE;
                    }
                } catch (p001ou.a e10) {
                    e = e10;
                    iVar2 = iVar3;
                    p001ou.p.a(e, iVar2);
                    g2.f(aVar.getContext());
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar2 = (i) aVar.f26870w;
                try {
                    jt.o.b(obj);
                } catch (p001ou.a e11) {
                    e = e11;
                    p001ou.p.a(e, iVar2);
                    g2.f(aVar.getContext());
                }
            }
            return Unit.f22483a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"nu/w$i", "Lnu/i;", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i<T> implements nu.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function2 f26871a;
        public final /* synthetic */ nu.i b;

        @pt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {132, 133}, m = "emit")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a extends pt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f26872t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f26873u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f26874v;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f26876x;

            public a(nt.b bVar) {
                super(bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                this.f26873u = obj;
                this.f26874v |= Integer.MIN_VALUE;
                return i.this.emit(null, this);
            }
        }

        public i(Function2 function2, nu.i iVar) {
            this.f26871a = function2;
            this.b = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0081  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r2.emit(r9, r0) == r1) goto L24;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // nu.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r8, nt.b<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof nu.w.i.a
                if (r0 == 0) goto L13
                r0 = r9
                nu.w$i$a r0 = (nu.w.i.a) r0
                int r1 = r0.f26874v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f26874v = r1
                goto L18
            L13:
                nu.w$i$a r0 = new nu.w$i$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f26873u
                java.lang.Object r1 = ot.c.e()
                int r2 = r0.f26874v
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f26872t
                nu.w$i r8 = (nu.w.i) r8
                jt.o.b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f26876x
                java.lang.Object r2 = r0.f26872t
                nu.w$i r2 = (nu.w.i) r2
                jt.o.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                jt.o.b(r9)
                kotlin.jvm.functions.Function2 r9 = r7.f26871a
                r0.f26872t = r7
                r0.f26876x = r8
                r0.f26874v = r4
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
                nu.i r2 = r8.b
                r0.f26872t = r8
                r5 = 0
                r0.f26876x = r5
                r0.f26874v = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
            L7a:
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                kotlin.Unit r8 = kotlin.Unit.f22483a
                return r8
            L81:
                ou.a r9 = new ou.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: nu.w.i.emit(java.lang.Object, nt.b):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lnu/i;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", l = {152}, m = "invokeSuspend")
    public static final class j<R> extends pt.m implements Function2<nu.i<? super R>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26877t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f26878u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ nu.h<T> f26879v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ zt.n<nu.i<? super R>, T, nt.b<? super Boolean>, Object> f26880w;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"nu/w$j$a", "Lnu/i;", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements nu.i<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ zt.n f26881a;
            public final /* synthetic */ nu.i b;

            /* JADX INFO: renamed from: nu.w$j$a$a, reason: collision with other inner class name */
            @pt.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", l = {132}, m = "emit")
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C0461a extends pt.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public Object f26882t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f26883u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public int f26884v;

                public C0461a(nt.b bVar) {
                    super(bVar);
                }

                @Override // pt.a
                public final Object invokeSuspend(Object obj) {
                    this.f26883u = obj;
                    this.f26884v |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(zt.n nVar, nu.i iVar) {
                this.f26881a = nVar;
                this.b = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // nu.i
            public Object emit(T t8, nt.b<? super Unit> bVar) {
                C0461a c0461a;
                a<T> aVar;
                if (bVar instanceof C0461a) {
                    c0461a = (C0461a) bVar;
                    int i10 = c0461a.f26884v;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0461a.f26884v = i10 - Integer.MIN_VALUE;
                    } else {
                        c0461a = new C0461a(bVar);
                    }
                } else {
                    c0461a = new C0461a(bVar);
                }
                Object objInvoke = c0461a.f26883u;
                Object objE = ot.c.e();
                int i11 = c0461a.f26884v;
                if (i11 == 0) {
                    jt.o.b(objInvoke);
                    zt.n nVar = this.f26881a;
                    nu.i iVar = this.b;
                    c0461a.f26882t = this;
                    c0461a.f26884v = 1;
                    kotlin.jvm.internal.l.c(6);
                    objInvoke = nVar.invoke(iVar, t8, c0461a);
                    kotlin.jvm.internal.l.c(7);
                    if (objInvoke == objE) {
                        return objE;
                    }
                    aVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) c0461a.f26882t;
                    jt.o.b(objInvoke);
                }
                if (((Boolean) objInvoke).booleanValue()) {
                    return Unit.f22483a;
                }
                throw new p001ou.a(aVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(nu.h<? extends T> hVar, zt.n<? super nu.i<? super R>, ? super T, ? super nt.b<? super Boolean>, ? extends Object> nVar, nt.b<? super j> bVar) {
            super(2, bVar);
            this.f26879v = hVar;
            this.f26880w = nVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            j jVar = new j(this.f26879v, this.f26880w, bVar);
            jVar.f26878u = obj;
            return jVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type nt.b to nu.w$j<R> for r5v1 'this'  nt.b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // pt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r5.f26877t
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r5.f26878u
                nu.w$j$a r0 = (nu.w.j.a) r0
                jt.o.b(r6)     // Catch: p001ou.a -> L13
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
                jt.o.b(r6)
                java.lang.Object r6 = r5.f26878u
                nu.i r6 = (nu.i) r6
                nu.h<T> r1 = r5.f26879v
                zt.n<nu.i<? super R>, T, nt.b<? super java.lang.Boolean>, java.lang.Object> r3 = r5.f26880w
                nu.w$j$a r4 = new nu.w$j$a
                r4.<init>(r3, r6)
                r5.f26878u = r4     // Catch: p001ou.a -> L38
                r5.f26877t = r2     // Catch: p001ou.a -> L38
                java.lang.Object r6 = r1.collect(r4, r5)     // Catch: p001ou.a -> L38
                if (r6 != r0) goto L44
                return r0
            L38:
                r6 = move-exception
                r0 = r4
            L3a:
                p001ou.p.a(r6, r0)
                kotlin.coroutines.CoroutineContext r6 = r5.getContext()
                ku.g2.f(r6)
            L44:
                kotlin.Unit r6 = kotlin.Unit.f22483a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: nu.w.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nu.i<? super R> iVar, nt.b<? super Unit> bVar) {
            return ((j) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @NotNull
    public static final <T> nu.h<T> b(@NotNull nu.h<? extends T> hVar, int i10) {
        if (i10 >= 0) {
            return new a(hVar, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    @NotNull
    public static final <T> nu.h<T> c(@NotNull nu.h<? extends T> hVar, @NotNull Function2<? super T, ? super nt.b<? super Boolean>, ? extends Object> function2) {
        return new c(hVar, function2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object d(nu.i<? super T> iVar, T t8, Object obj, nt.b<? super Unit> bVar) {
        e eVar;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i10 = eVar.f26854v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f26854v = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar);
            }
        } else {
            eVar = new e(bVar);
        }
        Object obj2 = eVar.f26853u;
        Object objE = ot.c.e();
        int i11 = eVar.f26854v;
        if (i11 == 0) {
            jt.o.b(obj2);
            eVar.f26852t = obj;
            eVar.f26854v = 1;
            if (iVar.emit(t8, eVar) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = eVar.f26852t;
            jt.o.b(obj2);
        }
        throw new p001ou.a(obj);
    }

    @NotNull
    public static final <T> nu.h<T> e(@NotNull nu.h<? extends T> hVar, int i10) {
        if (i10 > 0) {
            return new f(hVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    @NotNull
    public static final <T> nu.h<T> f(@NotNull nu.h<? extends T> hVar, @NotNull Function2<? super T, ? super nt.b<? super Boolean>, ? extends Object> function2) {
        return new h(hVar, function2);
    }

    @NotNull
    public static final <T, R> nu.h<R> g(@NotNull nu.h<? extends T> hVar, @NotNull zt.n<? super nu.i<? super R>, ? super T, ? super nt.b<? super Boolean>, ? extends Object> nVar) {
        return nu.j.w(new j(hVar, nVar, null));
    }
}
