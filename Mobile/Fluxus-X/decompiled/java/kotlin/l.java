package kotlin;

import av.p0;
import backtraceio.library.services.BacktraceMetrics;
import com.github.luben.zstd.BuildConfig;
import cv.g;
import cv.y;
import dv.h;
import dv.i;
import eu.b;
import fu.c;
import gu.d;
import gu.f;
import gu.m;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.collections.IndexedValue;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import pu.n;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@p001kotlin.Metadata(d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008a\u0001\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000624\u0010\f\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0081@¢\u0006\u0004\b\r\u0010\u000e*\u001c\b\u0002\u0010\u0010\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f2\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f¨\u0006\u0011"}, d2 = {"R", "T", "Ldv/i;", BuildConfig.FLAVOR, "Ldv/h;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Leu/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "transform", "a", "(Ldv/i;[Ldv/h;Lkotlin/jvm/functions/Function0;Lpu/n;Leu/b;)Ljava/lang/Object;", "Lkotlin/collections/IndexedValue;", "Update", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    @p001kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, 73, 76}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, b<? super p001kotlin.Unit>, Object> {
        public final /* synthetic */ Function0<T[]> A;
        public final /* synthetic */ n<i<? super R>, T[], b<? super p001kotlin.Unit>, Object> B;
        public final /* synthetic */ i<R> C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14728t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f14729u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f14730v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f14731w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f14732x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f14733y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ h<T>[] f14734z;

        /* JADX INFO: renamed from: ev.l$a$a, reason: collision with other inner class name */
        @p001kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
        public static final class C0284a extends m implements Function2<p0, b<? super p001kotlin.Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f14735t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ h<T>[] f14736u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ int f14737v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f14738w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ g<IndexedValue<Object>> f14739x;

            /* JADX INFO: renamed from: ev.l$a$a$a, reason: collision with other inner class name */
            @p001kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C0285a<T> implements i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ g<IndexedValue<Object>> f14740a;
                public final /* synthetic */ int b;

                /* JADX INFO: renamed from: ev.l$a$a$a$a, reason: collision with other inner class name */
                @p001kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {29, BacktraceMetrics.defaultTimeIntervalInMin}, m = "emit")
                public static final class C0286a extends d {

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f14741t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ C0285a<T> f14742u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public int f14743v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0286a(C0285a<? super T> c0285a, b<? super C0286a> bVar) {
                        super(bVar);
                        this.f14742u = c0285a;
                    }

                    @Override // gu.a
                    public final Object invokeSuspend(Object obj) {
                        this.f14741t = obj;
                        this.f14743v |= Integer.MIN_VALUE;
                        return this.f14742u.emit(null, this);
                    }
                }

                public C0285a(g<IndexedValue<Object>> gVar, int i10) {
                    this.f14740a = gVar;
                    this.b = i10;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
                
                    if (av.m3.a(r0) == r1) goto L21;
                 */
                @Override // dv.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(T t8, b<? super p001kotlin.Unit> bVar) {
                    C0286a c0286a;
                    if (bVar instanceof C0286a) {
                        c0286a = (C0286a) bVar;
                        int i10 = c0286a.f14743v;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0286a.f14743v = i10 - Integer.MIN_VALUE;
                        } else {
                            c0286a = new C0286a(this, bVar);
                        }
                    } else {
                        c0286a = new C0286a(this, bVar);
                    }
                    Object obj = c0286a.f14741t;
                    Object objE = c.e();
                    int i11 = c0286a.f14743v;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            o.b(obj);
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o.b(obj);
                        }
                        return p001kotlin.Unit.f21506a;
                    }
                    o.b(obj);
                    g<IndexedValue<Object>> gVar = this.f14740a;
                    IndexedValue<Object> indexedValue = new IndexedValue<>(this.b, t8);
                    c0286a.f14743v = 1;
                    if (gVar.m(indexedValue, c0286a) != objE) {
                    }
                    return objE;
                    c0286a.f14743v = 2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0284a(h<? extends T>[] hVarArr, int i10, AtomicInteger atomicInteger, g<IndexedValue<Object>> gVar, b<? super C0284a> bVar) {
                super(2, bVar);
                this.f14736u = hVarArr;
                this.f14737v = i10;
                this.f14738w = atomicInteger;
                this.f14739x = gVar;
            }

            @Override // gu.a
            public final b<p001kotlin.Unit> create(Object obj, b<?> bVar) {
                return new C0284a(this.f14736u, this.f14737v, this.f14738w, this.f14739x, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, b<? super p001kotlin.Unit> bVar) {
                return ((C0284a) create(p0Var, bVar)).invokeSuspend(p001kotlin.Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = c.e();
                int i10 = this.f14735t;
                try {
                    if (i10 == 0) {
                        o.b(obj);
                        h[] hVarArr = this.f14736u;
                        int i11 = this.f14737v;
                        h hVar = hVarArr[i11];
                        C0285a c0285a = new C0285a(this.f14739x, i11);
                        this.f14735t = 1;
                        if (hVar.collect(c0285a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj);
                    }
                    if (this.f14738w.decrementAndGet() == 0) {
                        y.a.a(this.f14739x, null, 1, null);
                    }
                    return p001kotlin.Unit.f21506a;
                } catch (Throwable th2) {
                    if (this.f14738w.decrementAndGet() == 0) {
                        y.a.a(this.f14739x, null, 1, null);
                    }
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h<? extends T>[] hVarArr, Function0<T[]> function0, n<? super i<? super R>, ? super T[], ? super b<? super p001kotlin.Unit>, ? extends Object> nVar, i<? super R> iVar, b<? super a> bVar) {
            super(2, bVar);
            this.f14734z = hVarArr;
            this.A = function0;
            this.B = nVar;
            this.C = iVar;
        }

        @Override // gu.a
        public final b<p001kotlin.Unit> create(Object obj, b<?> bVar) {
            a aVar = new a(this.f14734z, this.A, this.B, this.C, bVar);
            aVar.f14733y = obj;
            return aVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, b<? super p001kotlin.Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(p001kotlin.Unit.f21506a);
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
        @Override // gu.a
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ev.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Nullable
    public static final <R, T> Object a(@NotNull i<? super R> iVar, @NotNull h<? extends T>[] hVarArr, @NotNull Function0<T[]> function0, @NotNull n<? super i<? super R>, ? super T[], ? super b<? super p001kotlin.Unit>, ? extends Object> nVar, @NotNull b<? super p001kotlin.Unit> bVar) {
        Object objA = o.a(new a(hVarArr, function0, nVar, iVar, null), bVar);
        return objA == c.e() ? objA : p001kotlin.Unit.f21506a;
    }
}
