package ep;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import vo.d2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lep/i1;", "Landroidx/lifecycle/x0;", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lvo/d2$a;", "initialInput", "Lep/f1$c;", "stateManagerFactory", "<init>", "(Landroidx/lifecycle/l0;Lvo/d2$a;Lep/f1$c;)V", "input", BuildConfig.FLAVOR, "f", "(Lvo/d2$a;)V", "d", "()V", "Lep/f1;", "b", "Lep/f1;", "e", "()Lep/f1;", "governmentIdStepStateManager", "a", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i1 extends androidx.p000lifecycle.x0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final f1 governmentIdStepStateManager;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lep/i1$a;", BuildConfig.FLAVOR, "Landroidx/lifecycle/l0;", "savedStateHandle", "Lvo/d2$a;", "initialInput", "Lep/i1;", "a", "(Landroidx/lifecycle/l0;Lvo/d2$a;)Lep/i1;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        i1 a(@NotNull androidx.p000lifecycle.l0 savedStateHandle, @NotNull d2.a initialInput);
    }

    public i1(@NotNull androidx.p000lifecycle.l0 savedStateHandle, @NotNull d2.a initialInput, @NotNull f1.c stateManagerFactory) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(initialInput, "initialInput");
        Intrinsics.checkNotNullParameter(stateManagerFactory, "stateManagerFactory");
        this.governmentIdStepStateManager = stateManagerFactory.a(initialInput, savedStateHandle);
    }

    @Override // androidx.p000lifecycle.x0
    public void d() {
        super.d();
        this.governmentIdStepStateManager.e0();
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final f1 getGovernmentIdStepStateManager() {
        return this.governmentIdStepStateManager;
    }

    public final void f(@NotNull d2.a input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.governmentIdStepStateManager.b().setValue(input);
    }
}
