package dv;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aE\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0004\b\u000e\u0010\t\u001aE\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"T", "Lkotlin/Function2;", "Ldv/i;", "Leu/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "block", "Ldv/h;", "c", "(Lkotlin/jvm/functions/Function2;)Ldv/h;", "value", "d", "(Ljava/lang/Object;)Ldv/h;", "Lcv/v;", "b", "a", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class k {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"dv/k$a", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f12769a;

        public a(Object obj) {
            this.f12769a = obj;
        }

        @Override // dv.h
        public Object collect(i<? super T> iVar, eu.b<? super Unit> bVar) {
            Object objEmit = iVar.emit((Object) this.f12769a, bVar);
            return objEmit == fu.c.e() ? objEmit : Unit.f21506a;
        }
    }

    @NotNull
    public static final <T> h<T> a(@NotNull Function2<? super cv.v<? super T>, ? super eu.b<? super Unit>, ? extends Object> function2) {
        return new b(function2, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> h<T> b(@NotNull Function2<? super cv.v<? super T>, ? super eu.b<? super Unit>, ? extends Object> function2) {
        return new f(function2, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> h<T> c(@NotNull Function2<? super i<? super T>, ? super eu.b<? super Unit>, ? extends Object> function2) {
        return new f0(function2);
    }

    @NotNull
    public static final <T> h<T> d(T t8) {
        return new a(t8);
    }
}
