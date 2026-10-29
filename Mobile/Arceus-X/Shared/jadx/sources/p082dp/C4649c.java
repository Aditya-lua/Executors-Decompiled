package p082dp;

import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.FallbackMode;
import fo.InterfaceC5720a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p610zo.EnumC13962h;

/* JADX INFO: renamed from: dp.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Ldp/c;", "", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "fallbackMode", "Lzo/h;", "environment", "Landroidx/lifecycle/l0;", "savedStateHandle", "<init>", "(Lcom/withpersona/sdk2/inquiry/FallbackMode;Lzo/h;Landroidx/lifecycle/l0;)V", "Ldp/i;", "fallbackModeManager", "Lfo/a;", "c", "(Ldp/i;)Lfo/a;", "b", "()Lcom/withpersona/sdk2/inquiry/FallbackMode;", "a", "()Lzo/h;", "d", "()Landroidx/lifecycle/l0;", "Lcom/withpersona/sdk2/inquiry/FallbackMode;", "Lzo/h;", "Landroidx/lifecycle/l0;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4649c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final FallbackMode fallbackMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final EnumC13962h environment;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    public C4649c(@NotNull FallbackMode fallbackMode, @NotNull EnumC13962h environment, @NotNull C0967l0 savedStateHandle) {
        Intrinsics.checkNotNullParameter(fallbackMode, "fallbackMode");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.fallbackMode = fallbackMode;
        this.environment = environment;
        this.savedStateHandle = savedStateHandle;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC13962h getEnvironment() {
        return this.environment;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final FallbackMode getFallbackMode() {
        return this.fallbackMode;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC5720a m22876c(@NotNull C4655i fallbackModeManager) {
        Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
        return fallbackModeManager;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final C0967l0 getSavedStateHandle() {
        return this.savedStateHandle;
    }
}
