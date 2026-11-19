package jv;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001R\u0014\u0010\u0004\u001a\u00020\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003R6\u0010\u000b\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR6\u0010\u000e\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005j\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\nRV\u0010\u0013\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u0005j\u0004\u0018\u0001`\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\n\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Ljv/j;", BuildConfig.FLAVOR, "d", "()Ljava/lang/Object;", "clauseObject", "Lkotlin/Function3;", "Ljv/l;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/selects/RegistrationFunction;", "a", "()Lpu/n;", "regFunc", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "c", "processResFunc", BuildConfig.FLAVOR, "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "b", "onCancellationConstructor", "Ljv/f;", "Ljv/h;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface j {
    @NotNull
    pu.n<Object, l<?>, Object, Unit> a();

    @Nullable
    pu.n<l<?>, Object, Object, pu.n<Throwable, Object, CoroutineContext, Unit>> b();

    @NotNull
    pu.n<Object, Object, Object, Object> c();

    @NotNull
    Object d();
}
