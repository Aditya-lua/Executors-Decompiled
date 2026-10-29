package p0;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lp0/m;", "", "<init>", "()V", "I", "O", "Landroidx/lifecycle/a0;", Payload.SOURCE, "Lt/a;", "mapFunction", "a", "(Landroidx/lifecycle/a0;Lt/a;)Landroidx/lifecycle/a0;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f28106a = new m();

    @NotNull
    public static final <I, O> androidx.p000lifecycle.a0<O> a(@NotNull androidx.p000lifecycle.a0<I> source, @NotNull t.a<I, O> mapFunction) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(mapFunction, "mapFunction");
        s sVar = new s(mapFunction.apply(source.f()), mapFunction);
        sVar.u(source);
        return sVar;
    }
}
