package p001ou;

import java.util.concurrent.atomic.AtomicInteger;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ku.p0;
import mu.g;
import mu.y;
import nt.b;
import nu.h;
import nu.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.c;
import pt.d;
import pt.f;
import pt.m;
import zt.n;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008a\u0001\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000624\u0010\f\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0081@¢\u0006\u0004\b\r\u0010\u000e*\u001c\b\u0002\u0010\u0010\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f2\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f¨\u0006\u0011"}, d2 = {"R", "T", "Lnu/i;", "", "Lnu/h;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lnt/b;", "", "", "transform", "a", "(Lnu/i;[Lnu/h;Lkotlin/jvm/functions/Function0;Lzt/n;Lnt/b;)Ljava/lang/Object;", "Lkotlin/collections/IndexedValue;", "Update", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, 73, 76}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, b<? super Unit>, Object> {
        public final /* synthetic */ Function0<T[]> A;
        public final /* synthetic */ n<i<? super R>, T[], b<? super Unit>, Object> B;
        public final /* synthetic */ i<R> C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f27984t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f27985u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f27986v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f27987w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f27988x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f27989y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ h<T>[] f27990z;

        /* JADX INFO: renamed from: ou.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
        public static final class C0485a extends m implements Function2<p0, b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f27991t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ h<T>[] f27992u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ int f27993v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f27994w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ g<IndexedValue<Object>> f27995x;

            /* JADX INFO: renamed from: ou.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C0486a<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ g<IndexedValue<Object>> f27996a;
                public final /* synthetic */ int b;

                /* JADX INFO: renamed from: ou.l$a$a$a$a, reason: collision with other inner class name */
                @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {29, 30}, m = "emit")
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class C0487a extends d {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f27997t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ C0486a<T> f27998u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public int f27999v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0487a(C0486a<? super T> c0486a, b<? super C0487a> bVar) {
                        super(bVar);
                        this.f27998u = c0486a;
                    }

                    @Override // pt.a
                    public final Object invokeSuspend(Object obj) {
                        this.f27997t = obj;
                        this.f27999v |= Integer.MIN_VALUE;
                        return this.f27998u.emit(null, this);
                    }
                }

                public C0486a(g<IndexedValue<Object>> gVar, int i10) {
                    this.f27996a = gVar;
                    this.b = i10;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
                
                    if (ku.m3.a(r0) == r1) goto L21;
                 */
                @Override // nu.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r7, nt.b<? super kotlin.Unit> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof ou.l.a.C0485a.C0486a.C0487a
                        if (r0 == 0) goto L13
                        r0 = r8
                        ou.l$a$a$a$a r0 = (ou.l.a.C0485a.C0486a.C0487a) r0
                        int r1 = r0.f27999v
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f27999v = r1
                        goto L18
                    L13:
                        ou.l$a$a$a$a r0 = new ou.l$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.f27997t
                        java.lang.Object r1 = ot.c.e()
                        int r2 = r0.f27999v
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        jt.o.b(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        jt.o.b(r8)
                        goto L4d
                    L38:
                        jt.o.b(r8)
                        mu.g<kotlin.collections.IndexedValue<java.lang.Object>> r8 = r6.f27996a
                        kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                        int r5 = r6.b
                        r2.<init>(r5, r7)
                        r0.f27999v = r4
                        java.lang.Object r7 = r8.i(r2, r0)
                        if (r7 != r1) goto L4d
                        goto L55
                    L4d:
                        r0.f27999v = r3
                        java.lang.Object r7 = ku.m3.a(r0)
                        if (r7 != r1) goto L56
                    L55:
                        return r1
                    L56:
                        kotlin.Unit r7 = kotlin.Unit.f22483a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ou.l.a.C0485a.C0486a.emit(java.lang.Object, nt.b):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0485a(h<? extends T>[] hVarArr, int i10, AtomicInteger atomicInteger, g<IndexedValue<Object>> gVar, b<? super C0485a> bVar) {
                super(2, bVar);
                this.f27992u = hVarArr;
                this.f27993v = i10;
                this.f27994w = atomicInteger;
                this.f27995x = gVar;
            }

            @Override // pt.a
            public final b<Unit> create(Object obj, b<?> bVar) {
                return new C0485a(this.f27992u, this.f27993v, this.f27994w, this.f27995x, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = c.e();
                int i10 = this.f27991t;
                try {
                    if (i10 == 0) {
                        o.b(obj);
                        h[] hVarArr = this.f27992u;
                        int i11 = this.f27993v;
                        h hVar = hVarArr[i11];
                        C0486a c0486a = new C0486a(this.f27995x, i11);
                        this.f27991t = 1;
                        if (hVar.collect(c0486a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj);
                    }
                    if (this.f27994w.decrementAndGet() == 0) {
                        y.a.a(this.f27995x, null, 1, null);
                    }
                    return Unit.f22483a;
                } catch (Throwable th2) {
                    if (this.f27994w.decrementAndGet() == 0) {
                        y.a.a(this.f27995x, null, 1, null);
                    }
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
                return ((C0485a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h<? extends T>[] hVarArr, Function0<T[]> function0, n<? super i<? super R>, ? super T[], ? super b<? super Unit>, ? extends Object> nVar, i<? super R> iVar, b<? super a> bVar) {
            super(2, bVar);
            this.f27990z = hVarArr;
            this.A = function0;
            this.B = nVar;
            this.C = iVar;
        }

        @Override // pt.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            a aVar = new a(this.f27990z, this.A, this.B, this.C, bVar);
            aVar.f27989y = obj;
            return aVar;
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
        @Override // pt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ou.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Nullable
    public static final <R, T> Object a(@NotNull i<? super R> iVar, @NotNull h<? extends T>[] hVarArr, @NotNull Function0<T[]> function0, @NotNull n<? super i<? super R>, ? super T[], ? super b<? super Unit>, ? extends Object> nVar, @NotNull b<? super Unit> bVar) {
        Object objA = o.a(new a(hVarArr, function0, nVar, iVar, null), bVar);
        return objA == c.e() ? objA : Unit.f22483a;
    }
}
