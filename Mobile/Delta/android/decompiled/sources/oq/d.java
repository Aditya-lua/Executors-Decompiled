package oq;

import androidx.p000lifecycle.l0;
import androidx.p000lifecycle.x0;
import d5.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0010\u001a\u00028\u0001\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Loq/d;", "Landroidx/lifecycle/x0;", "T", "Landroidx/lifecycle/a;", "Ld5/i;", "savedStateRegistryOwner", "Lkotlin/Function1;", "Landroidx/lifecycle/l0;", "create", "<init>", "(Ld5/i;Lkotlin/jvm/functions/Function1;)V", "", "key", "Ljava/lang/Class;", "modelClass", "handle", "f", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/l0;)Landroidx/lifecycle/x0;", "e", "Lkotlin/jvm/functions/Function1;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d<T extends x0> extends androidx.p000lifecycle.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<l0, T> create;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull i savedStateRegistryOwner, @NotNull Function1<? super l0, ? extends T> create) {
        super(savedStateRegistryOwner, null);
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
        Intrinsics.checkNotNullParameter(create, "create");
        this.create = create;
    }

    @Override // androidx.p000lifecycle.a
    @NotNull
    public <T extends x0> T f(@NotNull String key, @NotNull Class<T> modelClass, @NotNull l0 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(handle, "handle");
        T tInvoke = this.create.invoke(handle);
        Intrinsics.d(tInvoke, "null cannot be cast to non-null type T of com.withpersona.sdk2.inquiry.shared.di.Factory.create");
        return tInvoke;
    }
}
