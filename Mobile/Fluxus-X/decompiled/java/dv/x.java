package dv;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0005\"\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a]\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u000220\b\u0001\u0010\u000f\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aQ\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00022$\b\u0001\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\" \u0010\u001b\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"T", BuildConfig.FLAVOR, "Ldv/h;", "b", "(Ljava/lang/Iterable;)Ldv/h;", BuildConfig.FLAVOR, "flows", "c", "([Ldv/h;)Ldv/h;", "R", "Lkotlin/Function3;", "Ldv/i;", "Leu/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "transform", "d", "(Ldv/h;Lpu/n;)Ldv/h;", "Lkotlin/Function2;", "a", "(Ldv/h;Lkotlin/jvm/functions/Function2;)Ldv/h;", BuildConfig.FLAVOR, "I", "getDEFAULT_CONCURRENCY", "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12932a = gv.f0.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Ldv/i;", "it", BuildConfig.FLAVOR, "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {213, 213}, m = "invokeSuspend")
    public static final class a<R, T> extends gu.m implements pu.n<i<? super R>, T, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12933t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f12934u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f12935v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Function2<T, eu.b<? super R>, Object> f12936w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super T, ? super eu.b<? super R>, ? extends Object> function2, eu.b<? super a> bVar) {
            super(3, bVar);
            this.f12936w = function2;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to dv.x$a<R, T> for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // gu.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = fu.c.e()
                int r1 = r5.f12933t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                zt.o.b(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f12934u
                dv.i r1 = (dv.i) r1
                zt.o.b(r6)
                goto L39
            L22:
                zt.o.b(r6)
                java.lang.Object r6 = r5.f12934u
                r1 = r6
                dv.i r1 = (dv.i) r1
                java.lang.Object r6 = r5.f12935v
                kotlin.jvm.functions.Function2<T, eu.b<? super R>, java.lang.Object> r4 = r5.f12936w
                r5.f12934u = r1
                r5.f12933t = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                goto L44
            L39:
                r3 = 0
                r5.f12934u = r3
                r5.f12933t = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                kotlin.Unit r6 = p001kotlin.Unit.f21506a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: dv.x.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pu.n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super R> iVar, T t8, eu.b<? super Unit> bVar) {
            a aVar = new a(this.f12936w, bVar);
            aVar.f12934u = iVar;
            aVar.f12935v = t8;
            return aVar.invokeSuspend(Unit.f21506a);
        }
    }

    @NotNull
    public static final <T, R> h<R> a(@NotNull h<? extends T> hVar, @NotNull Function2<? super T, ? super eu.b<? super R>, ? extends Object> function2) {
        return j.T(hVar, new a(function2, null));
    }

    @NotNull
    public static final <T> h<T> b(@NotNull Iterable<? extends h<? extends T>> iterable) {
        return new kotlin.j(iterable, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> h<T> c(@NotNull h<? extends T>... hVarArr) {
        return j.B(p001kotlin.collections.m.A(hVarArr));
    }

    @NotNull
    public static final <T, R> h<R> d(@NotNull h<? extends T> hVar, @NotNull pu.n<? super i<? super R>, ? super T, ? super eu.b<? super Unit>, ? extends Object> nVar) {
        return new kotlin.i(nVar, hVar, null, 0, null, 28, null);
    }
}
