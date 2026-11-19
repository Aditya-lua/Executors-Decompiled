package mp;

import androidx.p000lifecycle.d0;
import androidx.p000lifecycle.l0;
import androidx.p000lifecycle.x0;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger;
import dv.b0;
import dv.c0;
import dv.i0;
import lp.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001*B\u001b\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R*\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR(\u0010)\u001a\u0004\u0018\u00010\n2\b\u0010$\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lmp/m;", "Landroidx/lifecycle/x0;", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lmp/j$c;", "integrationStepStateManagerFactory", "<init>", "(Landroidx/lifecycle/l0;Lmp/j$c;)V", "Llp/v$b;", "input", "Lmp/j;", "e", "(Llp/v$b;)Lmp/j;", BuildConfig.FLAVOR, "f", "(Llp/v$b;)V", "b", "Landroidx/lifecycle/l0;", "c", "Lmp/j$c;", "Ldv/b0;", "Llp/v$c;", "d", "Ldv/b0;", "_result", "Landroidx/lifecycle/d0;", BuildConfig.FLAVOR, "Landroidx/lifecycle/d0;", "getInquiryId", "()Landroidx/lifecycle/d0;", "setInquiryId", "(Landroidx/lifecycle/d0;)V", "inquiryId", "getSessionToken", "setSessionToken", "sessionToken", "value", "g", "Lmp/j;", "getIntegrationStepStateManager", "()Lmp/j;", "integrationStepStateManager", "a", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends x0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j.c integrationStepStateManagerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0<v.c> _result;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public d0<String> inquiryId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public d0<String> sessionToken;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public j integrationStepStateManager;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lmp/m$a;", BuildConfig.FLAVOR, "Landroidx/lifecycle/l0;", "savedStateHandle", "Lmp/m;", "a", "(Landroidx/lifecycle/l0;)Lmp/m;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        m a(@NotNull l0 savedStateHandle);
    }

    public m(@NotNull l0 savedStateHandle, @NotNull j.c integrationStepStateManagerFactory) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(integrationStepStateManagerFactory, "integrationStepStateManagerFactory");
        this.savedStateHandle = savedStateHandle;
        this.integrationStepStateManagerFactory = integrationStepStateManagerFactory;
        this._result = i0.b(0, 0, null, 7, null);
        this.inquiryId = savedStateHandle.c("inquiry_id", null);
        this.sessionToken = savedStateHandle.c(RealTrackingEventsLogger.KEY_SESSION_TOKEN, null);
    }

    @NotNull
    public final j e(@NotNull v.Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        j jVar = this.integrationStepStateManager;
        if (jVar != null) {
            return jVar;
        }
        j jVarA = this.integrationStepStateManagerFactory.a(input, this.savedStateHandle);
        this.integrationStepStateManager = jVarA;
        return jVarA;
    }

    public final void f(@NotNull v.Input input) {
        c0<v.Input> c0VarB;
        Intrinsics.checkNotNullParameter(input, "input");
        j jVar = this.integrationStepStateManager;
        if (jVar == null || (c0VarB = jVar.b()) == null) {
            return;
        }
        c0VarB.setValue(input);
    }
}
