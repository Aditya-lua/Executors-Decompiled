package dv;

import av.d2;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aD\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000f\u001a.\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ldv/h;", BuildConfig.FLAVOR, "a", "(Ldv/h;Leu/b;)Ljava/lang/Object;", "T", "Lav/p0;", "scope", "Lav/d2;", "d", "(Ldv/h;Lav/p0;)Lav/d2;", "Lkotlin/Function2;", "Leu/b;", BuildConfig.FLAVOR, "action", "b", "(Ldv/h;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;", "Ldv/i;", "flow", "c", "(Ldv/i;Ldv/h;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {46}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12783t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ h<T> f12784u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h<? extends T> hVar, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f12784u = hVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(this.f12784u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f12783t;
            if (i10 == 0) {
                zt.o.b(obj);
                h<T> hVar = this.f12784u;
                this.f12783t = 1;
                if (j.i(hVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    @Nullable
    public static final Object a(@NotNull h<?> hVar, @NotNull eu.b<? super Unit> bVar) {
        Object objCollect = hVar.collect(kotlin.s.f14751a, bVar);
        return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
    }

    @Nullable
    public static final <T> Object b(@NotNull h<? extends T> hVar, @NotNull Function2<? super T, ? super eu.b<? super Unit>, ? extends Object> function2, @NotNull eu.b<? super Unit> bVar) {
        Object objI = j.i(o.b(j.A(hVar, function2), 0, null, 2, null), bVar);
        return objI == fu.c.e() ? objI : Unit.f21506a;
    }

    @Nullable
    public static final <T> Object c(@NotNull i<? super T> iVar, @NotNull h<? extends T> hVar, @NotNull eu.b<? super Unit> bVar) {
        j.r(iVar);
        Object objCollect = hVar.collect(iVar, bVar);
        return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
    }

    @NotNull
    public static final <T> d2 d(@NotNull h<? extends T> hVar, @NotNull av.p0 p0Var) {
        return av.k.d(p0Var, null, null, new a(hVar, null), 3, null);
    }
}
