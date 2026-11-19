package eu;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.n;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"R", "T", "Lkotlin/Function2;", "Leu/b;", BuildConfig.FLAVOR, "receiver", "completion", BuildConfig.FLAVOR, "a", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Leu/b;)V", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final <R, T> void a(@NotNull Function2<? super R, ? super b<? super T>, ? extends Object> function2, R r10, @NotNull b<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        fu.b.c(fu.b.a(function2, r10, completion)).resumeWith(n.b(Unit.f21506a));
    }
}
