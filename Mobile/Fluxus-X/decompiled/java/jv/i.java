package jv;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B¯\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012(\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u0012(\u0010\u000b\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\n\u0012J\b\u0002\u0010\u000f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u0005j\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R<\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R<\u0010\u000b\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\\\u0010\u000f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u0005j\u0004\u0018\u0001`\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Ljv/i;", "Q", "Ljv/h;", BuildConfig.FLAVOR, "clauseObject", "Lkotlin/Function3;", "Ljv/l;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", BuildConfig.FLAVOR, "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Lpu/n;Lpu/n;Lpu/n;)V", "a", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "b", "Lpu/n;", "()Lpu/n;", "c", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i<Q> implements h<Q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object clauseObject;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final pu.n<Object, l<?>, Object, Unit> regFunc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pu.n<Object, Object, Object, Object> processResFunc;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final pu.n<l<?>, Object, Object, pu.n<Throwable, Object, CoroutineContext, Unit>> onCancellationConstructor;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull Object obj, @NotNull pu.n<Object, ? super l<?>, Object, Unit> nVar, @NotNull pu.n<Object, Object, Object, ? extends Object> nVar2, @Nullable pu.n<? super l<?>, Object, Object, ? extends pu.n<? super Throwable, Object, ? super CoroutineContext, Unit>> nVar3) {
        this.clauseObject = obj;
        this.regFunc = nVar;
        this.processResFunc = nVar2;
        this.onCancellationConstructor = nVar3;
    }

    @Override // jv.j
    @NotNull
    public pu.n<Object, l<?>, Object, Unit> a() {
        return this.regFunc;
    }

    @Override // jv.j
    @Nullable
    public pu.n<l<?>, Object, Object, pu.n<Throwable, Object, CoroutineContext, Unit>> b() {
        return this.onCancellationConstructor;
    }

    @Override // jv.j
    @NotNull
    public pu.n<Object, Object, Object, Object> c() {
        return this.processResFunc;
    }

    @Override // jv.j
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public Object getClauseObject() {
        return this.clauseObject;
    }
}
