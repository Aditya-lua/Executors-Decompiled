package tu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007\u0012J\b\u0002\u0010\f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0004j\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R<\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\\\u0010\f\u001aD\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0004j\u0004\u0018\u0001`\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R<\u0010\u0018\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004j\u0002`\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, d2 = {"Ltu/g;", "Ltu/f;", "", "clauseObject", "Lkotlin/Function3;", "Ltu/l;", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Lzt/n;Lzt/n;)V", "a", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "b", "Lzt/n;", "()Lzt/n;", "c", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object clauseObject;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final zt.n<Object, l<?>, Object, Unit> regFunc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final zt.n<l<?>, Object, Object, zt.n<Throwable, Object, CoroutineContext, Unit>> onCancellationConstructor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.n<Object, Object, Object, Object> processResFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull Object obj, @NotNull zt.n<Object, ? super l<?>, Object, Unit> nVar, @Nullable zt.n<? super l<?>, Object, Object, ? extends zt.n<? super Throwable, Object, ? super CoroutineContext, Unit>> nVar2) {
        this.clauseObject = obj;
        this.regFunc = nVar;
        this.onCancellationConstructor = nVar2;
        this.processResFunc = m.f31999a;
    }

    @Override // tu.j
    @NotNull
    public zt.n<Object, l<?>, Object, Unit> a() {
        return this.regFunc;
    }

    @Override // tu.j
    @Nullable
    public zt.n<l<?>, Object, Object, zt.n<Throwable, Object, CoroutineContext, Unit>> b() {
        return this.onCancellationConstructor;
    }

    @Override // tu.j
    @NotNull
    public zt.n<Object, Object, Object, Object> c() {
        return this.processResFunc;
    }

    @Override // tu.j
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public Object getClauseObject() {
        return this.clauseObject;
    }

    public /* synthetic */ g(Object obj, zt.n nVar, zt.n nVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, nVar, (i10 & 4) != 0 ? null : nVar2);
    }
}
