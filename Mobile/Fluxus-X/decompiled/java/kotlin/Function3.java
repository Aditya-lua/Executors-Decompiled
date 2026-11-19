package kotlin;

import com.github.luben.zstd.BuildConfig;
import dv.i;
import eu.b;
import org.jetbrains.annotations.NotNull;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.h0;
import p001kotlin.jvm.internal.k;
import pu.n;

/* JADX INFO: renamed from: ev.w, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes2.dex */
@p001kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\"D\u0010\t\u001a,\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/Function3;", "Ldv/i;", BuildConfig.FLAVOR, "Leu/b;", BuildConfig.FLAVOR, "a", "Lpu/n;", "getEmitFun$annotations", "()V", "emitFun", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n<i<Object>, Object, b<? super p001kotlin.Unit>, Object> f14759a;

    /* JADX INFO: renamed from: ev.w$a */
    @p001kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a extends k implements n<i<? super Object>, Object, b<? super p001kotlin.Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14760a = new a();

        public a() {
            super(3, i.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // pu.n
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<Object> iVar, Object obj, b<? super p001kotlin.Unit> bVar) {
            return iVar.emit(obj, bVar);
        }
    }

    static {
        a aVar = a.f14760a;
        Intrinsics.d(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f14759a = (n) h0.e(aVar, 3);
    }
}
