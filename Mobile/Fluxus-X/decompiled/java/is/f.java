package is;

import androidx.p000lifecycle.d0;
import androidx.p000lifecycle.l0;
import androidx.p000lifecycle.x0;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger;
import dv.b0;
import dv.i0;
import es.s6;
import hs.g1;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001)B%\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R*\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u0017\u0010(\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001a\u0010'¨\u0006*"}, d2 = {"Lis/f;", "Landroidx/lifecycle/x0;", "Landroidx/lifecycle/l0;", "savedStateHandle", "Les/s6$b;", "initialInput", "Lhs/g1$e;", "uiStepStateManagerFactory", "<init>", "(Landroidx/lifecycle/l0;Les/s6$b;Lhs/g1$e;)V", BuildConfig.FLAVOR, "d", "()V", "input", "f", "(Les/s6$b;)V", "b", "Landroidx/lifecycle/l0;", "c", "Les/s6$b;", "Ldv/b0;", "Les/s6$c;", "Ldv/b0;", "_result", "Landroidx/lifecycle/d0;", BuildConfig.FLAVOR, "e", "Landroidx/lifecycle/d0;", "getInquiryId", "()Landroidx/lifecycle/d0;", "setInquiryId", "(Landroidx/lifecycle/d0;)V", "inquiryId", "getSessionToken", "setSessionToken", "sessionToken", "Lhs/g1;", "g", "Lhs/g1;", "()Lhs/g1;", "uiStepStateManager", "a", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends x0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s6.Input initialInput;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0<s6.c> _result;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public d0<String> inquiryId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public d0<String> sessionToken;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g1 uiStepStateManager;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lis/f$a;", BuildConfig.FLAVOR, "Landroidx/lifecycle/l0;", "savedStateHandle", "Les/s6$b;", "initialInput", "Lis/f;", "a", "(Landroidx/lifecycle/l0;Les/s6$b;)Lis/f;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        f a(@NotNull l0 savedStateHandle, @NotNull s6.Input initialInput);
    }

    public f(@NotNull l0 savedStateHandle, @NotNull s6.Input initialInput, @NotNull g1.e uiStepStateManagerFactory) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(initialInput, "initialInput");
        Intrinsics.checkNotNullParameter(uiStepStateManagerFactory, "uiStepStateManagerFactory");
        this.savedStateHandle = savedStateHandle;
        this.initialInput = initialInput;
        this._result = i0.b(0, 0, null, 7, null);
        this.inquiryId = savedStateHandle.c("inquiry_id", null);
        this.sessionToken = savedStateHandle.c(RealTrackingEventsLogger.KEY_SESSION_TOKEN, null);
        this.uiStepStateManager = uiStepStateManagerFactory.a(initialInput, savedStateHandle);
    }

    @Override // androidx.p000lifecycle.x0
    public void d() {
        this.uiStepStateManager.l0();
        super.d();
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final g1 getUiStepStateManager() {
        return this.uiStepStateManager;
    }

    public final void f(@NotNull s6.Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.uiStepStateManager.b().setValue(input);
    }
}
