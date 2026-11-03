package p001mu;

import gt.o;
import iu.p0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ku.g;
import ku.y;
import lt.b;
import lu.h;
import lu.i;
import mt.c;
import nt.d;
import nt.f;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xt.n;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008a\u0001\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000624\u0010\f\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0081@¢\u0006\u0004\b\r\u0010\u000e*\u001c\b\u0002\u0010\u0010\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f2\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f¨\u0006\u0011"}, d2 = {"R", "T", "Llu/i;", "", "Llu/h;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Llt/b;", "", "", "transform", "a", "(Llu/i;[Llu/h;Lkotlin/jvm/functions/Function0;Lxt/n;Llt/b;)Ljava/lang/Object;", "Lkotlin/collections/IndexedValue;", "Update", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, 73, 76}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends m implements Function2<p0, b<? super Unit>, Object> {
        public final /* synthetic */ Function0<T[]> A;
        public final /* synthetic */ n<i<? super R>, T[], b<? super Unit>, Object> B;
        public final /* synthetic */ i<R> C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f25365t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f25366u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f25367v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f25368w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f25369x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f25370y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ h<T>[] f25371z;

        /* JADX INFO: renamed from: mu.l$a$a, reason: collision with other inner class name */
        @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class C0451a extends m implements Function2<p0, b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f25372t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ h<T>[] f25373u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ int f25374v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f25375w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ g<IndexedValue<Object>> f25376x;

            /* JADX INFO: renamed from: mu.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C0452a<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ g<IndexedValue<Object>> f25377a;
                public final /* synthetic */ int b;

                /* JADX INFO: renamed from: mu.l$a$a$a$a, reason: collision with other inner class name */
                @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {29, 30}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class C0453a extends d {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f25378t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ C0452a<T> f25379u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public int f25380v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0453a(C0452a<? super T> c0452a, b<? super C0453a> bVar) {
                        super(bVar);
                        this.f25379u = c0452a;
                    }

                    @Override // nt.a
                    public final Object invokeSuspend(Object obj) {
                        this.f25378t = obj;
                        this.f25380v |= Integer.MIN_VALUE;
                        return this.f25379u.emit(null, this);
                    }
                }

                public C0452a(g<IndexedValue<Object>> gVar, int i10) {
                    this.f25377a = gVar;
                    this.b = i10;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
                
                    if (iu.m3.a(r0) == r1) goto L21;
                 */
                @Override // lu.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r7, lt.b<? super kotlin.Unit> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof mu.l.a.C0451a.C0452a.C0453a
                        if (r0 == 0) goto L13
                        r0 = r8
                        mu.l$a$a$a$a r0 = (mu.l.a.C0451a.C0452a.C0453a) r0
                        int r1 = r0.f25380v
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f25380v = r1
                        goto L18
                    L13:
                        mu.l$a$a$a$a r0 = new mu.l$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.f25378t
                        java.lang.Object r1 = mt.c.e()
                        int r2 = r0.f25380v
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        gt.o.b(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        gt.o.b(r8)
                        goto L4d
                    L38:
                        gt.o.b(r8)
                        ku.g<kotlin.collections.IndexedValue<java.lang.Object>> r8 = r6.f25377a
                        kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                        int r5 = r6.b
                        r2.<init>(r5, r7)
                        r0.f25380v = r4
                        java.lang.Object r7 = r8.z(r2, r0)
                        if (r7 != r1) goto L4d
                        goto L55
                    L4d:
                        r0.f25380v = r3
                        java.lang.Object r7 = iu.m3.a(r0)
                        if (r7 != r1) goto L56
                    L55:
                        return r1
                    L56:
                        kotlin.Unit r7 = kotlin.Unit.f22938a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: mu.l.a.C0451a.C0452a.emit(java.lang.Object, lt.b):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0451a(h<? extends T>[] hVarArr, int i10, AtomicInteger atomicInteger, g<IndexedValue<Object>> gVar, b<? super C0451a> bVar) {
                super(2, bVar);
                this.f25373u = hVarArr;
                this.f25374v = i10;
                this.f25375w = atomicInteger;
                this.f25376x = gVar;
            }

            @Override // nt.a
            public final b<Unit> create(Object obj, b<?> bVar) {
                return new C0451a(this.f25373u, this.f25374v, this.f25375w, this.f25376x, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
                return ((C0451a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = c.e();
                int i10 = this.f25372t;
                try {
                    if (i10 == 0) {
                        o.b(obj);
                        h[] hVarArr = this.f25373u;
                        int i11 = this.f25374v;
                        h hVar = hVarArr[i11];
                        C0452a c0452a = new C0452a(this.f25376x, i11);
                        this.f25372t = 1;
                        if (hVar.collect(c0452a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj);
                    }
                    if (this.f25375w.decrementAndGet() == 0) {
                        y.a.a(this.f25376x, null, 1, null);
                    }
                    return Unit.f22938a;
                } catch (Throwable th2) {
                    if (this.f25375w.decrementAndGet() == 0) {
                        y.a.a(this.f25376x, null, 1, null);
                    }
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h<? extends T>[] hVarArr, Function0<T[]> function0, n<? super i<? super R>, ? super T[], ? super b<? super Unit>, ? extends Object> nVar, i<? super R> iVar, b<? super a> bVar) {
            super(2, bVar);
            this.f25371z = hVarArr;
            this.A = function0;
            this.B = nVar;
            this.C = iVar;
        }

        @Override // nt.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            a aVar = new a(this.f25371z, this.A, this.B, this.C, bVar);
            aVar.f25370y = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e6 A[EDGE_INSN: B:35:0x00e6->B:44:0x0129 BREAK  A[LOOP:0: B:28:0x00c1->B:47:?]] */
        /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:41:0x0109  */
        /* JADX WARN: Code duplicated, block: B:46:0x00e6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:28:0x00c1->B:47:?, LOOP_END, SYNTHETIC] */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0106 -> B:44:0x0129). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0126 -> B:44:0x0129). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:0x0109
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // nt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Nullable
    public static final <R, T> Object a(@NotNull i<? super R> iVar, @NotNull h<? extends T>[] hVarArr, @NotNull Function0<T[]> function0, @NotNull n<? super i<? super R>, ? super T[], ? super b<? super Unit>, ? extends Object> nVar, @NotNull b<? super Unit> bVar) {
        Object objA = o.a(new a(hVarArr, function0, nVar, iVar, null), bVar);
        return objA == c.e() ? objA : Unit.f22938a;
    }
}
