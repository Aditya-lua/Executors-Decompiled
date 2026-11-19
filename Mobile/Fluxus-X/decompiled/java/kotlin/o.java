package kotlin;

import av.p0;
import com.github.luben.zstd.BuildConfig;
import dv.h;
import dv.i;
import fu.c;
import gu.f;
import gu.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.jvm.functions.Function2;
import pu.n;

/* JADX INFO: loaded from: classes2.dex */
@p001kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002$\b\u0001\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007\u001aM\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u000020\b\u0001\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"R", "Lkotlin/Function2;", "Lav/p0;", "Leu/b;", BuildConfig.FLAVOR, "block", "a", "(Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;", "Lkotlin/Function3;", "Ldv/i;", BuildConfig.FLAVOR, "Ldv/h;", "b", "(Lpu/n;)Ldv/h;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @p001kotlin.Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ev/o$a", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<R> implements h<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f14745a;

        public a(n nVar) {
            this.f14745a = nVar;
        }

        @Override // dv.h
        public Object collect(i<? super R> iVar, eu.b<? super p001kotlin.Unit> bVar) {
            Object objA = o.a(new b(this.f14745a, iVar, null), bVar);
            return objA == c.e() ? objA : p001kotlin.Unit.f21506a;
        }
    }

    @p001kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", l = {47}, m = "invokeSuspend")
    public static final class b extends m implements Function2<p0, eu.b<? super p001kotlin.Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14746t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f14747u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ n<p0, i<? super R>, eu.b<? super p001kotlin.Unit>, Object> f14748v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ i<R> f14749w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(n<? super p0, ? super i<? super R>, ? super eu.b<? super p001kotlin.Unit>, ? extends Object> nVar, i<? super R> iVar, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f14748v = nVar;
            this.f14749w = iVar;
        }

        @Override // gu.a
        public final eu.b<p001kotlin.Unit> create(Object obj, eu.b<?> bVar) {
            b bVar2 = new b(this.f14748v, this.f14749w, bVar);
            bVar2.f14747u = obj;
            return bVar2;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super p001kotlin.Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(p001kotlin.Unit.f21506a);
        }

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
        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = c.e();
            int i10 = this.f14746t;
            if (i10 == 0) {
                zt.o.b(obj);
                p0 p0Var = (p0) this.f14747u;
                n<p0, i<? super R>, eu.b<? super p001kotlin.Unit>, Object> nVar = this.f14748v;
                Object obj2 = this.f14749w;
                this.f14746t = 1;
                if (nVar.invoke(p0Var, obj2, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return p001kotlin.Unit.f21506a;
        }
    }

    @Nullable
    public static final <R> Object a(@NotNull Function2<? super p0, ? super eu.b<? super R>, ? extends Object> function2, @NotNull eu.b<? super R> bVar) {
        n nVar = new n(bVar.getContext(), bVar);
        Object objD = hv.b.d(nVar, nVar, function2);
        if (objD == c.e()) {
            gu.h.c(bVar);
        }
        return objD;
    }

    @NotNull
    public static final <R> h<R> b(@NotNull n<? super p0, ? super i<? super R>, ? super eu.b<? super p001kotlin.Unit>, ? extends Object> nVar) {
        return new a(nVar);
    }
}
