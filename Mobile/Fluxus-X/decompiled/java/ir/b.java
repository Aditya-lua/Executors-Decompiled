package ir;

import av.k;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import dr.e;
import dv.c0;
import dv.r0;
import gu.f;
import gu.m;
import kp.ScreenState;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import to.z;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010\u000e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR*\u0010%\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&\"\u0004\b\u001e\u0010'R\u0011\u0010)\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010(¨\u0006*"}, d2 = {"Lir/b;", BuildConfig.FLAVOR, "Ldr/e;", "externalInquiryController", "Lto/e;", "featureFlagManager", "Lav/p0;", "coroutineScope", "<init>", "(Ldr/e;Lto/e;Lav/p0;)V", BuildConfig.FLAVOR, "shouldShowBackButton", "shouldShowCancelButton", "isEnabled", "shouldShowHelpButton", BuildConfig.FLAVOR, "c", "(ZZZZ)V", "f", "()V", "a", "Ldr/e;", "b", "Lto/e;", "Lav/p0;", "Ldv/c0;", "Lir/a;", "d", "Ldv/c0;", "navigationStateFlow", "e", "Z", "g", "isNavigationEnabled", "h", "value", "i", "isTransitioningBack", "()Z", "(Z)V", "()Lir/a;", "navigationState", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e externalInquiryController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final to.e featureFlagManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<ir.a> navigationStateFlow;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean shouldShowBackButton;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean shouldShowCancelButton;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isNavigationEnabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean shouldShowHelpButton;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean isTransitioningBack;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager$updateScreenState$1", f = "NavigationStateManager.kt", l = {79}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19753t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ir.a f19755v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ir.a aVar, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f19755v = aVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return b.this.new a(this.f19755v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f19753t;
            if (i10 == 0) {
                o.b(obj);
                c0<ScreenState> c0VarB = b.this.externalInquiryController.b();
                ScreenState screenState = new ScreenState(this.f19755v.getShowBackButton(), this.f19755v.getShowCancelButton(), this.f19755v.getIsNavigationEnabled(), this.f19755v.getShowHelpButton());
                this.f19753t = 1;
                if (c0VarB.emit(screenState, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    public b(@NotNull e externalInquiryController, @NotNull to.e featureFlagManager, @NotNull p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(externalInquiryController, "externalInquiryController");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.externalInquiryController = externalInquiryController;
        this.featureFlagManager = featureFlagManager;
        this.coroutineScope = coroutineScope;
        this.navigationStateFlow = r0.a(new ir.a(true, true, externalInquiryController.d(), true, true, true));
        this.isNavigationEnabled = true;
    }

    public static /* synthetic */ void d(b bVar, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        if ((i10 & 8) != 0) {
            z13 = false;
        }
        bVar.c(z10, z11, z12, z13);
    }

    @NotNull
    public final ir.a b() {
        return this.navigationStateFlow.getValue();
    }

    public final void c(boolean shouldShowBackButton, boolean shouldShowCancelButton, boolean isEnabled, boolean shouldShowHelpButton) {
        this.shouldShowBackButton = shouldShowBackButton;
        this.shouldShowCancelButton = shouldShowCancelButton;
        this.isNavigationEnabled = isEnabled;
        this.shouldShowHelpButton = shouldShowHelpButton && this.featureFlagManager.d(z.f32642a);
        f();
    }

    public final void e(boolean z10) {
        this.isTransitioningBack = z10;
        f();
    }

    public final void f() {
        ir.a aVar = new ir.a(this.shouldShowBackButton, this.shouldShowCancelButton, this.externalInquiryController.d(), this.externalInquiryController.e(), this.isNavigationEnabled && !this.isTransitioningBack, this.shouldShowHelpButton);
        if (Intrinsics.c(this.navigationStateFlow.getValue(), aVar)) {
            return;
        }
        this.navigationStateFlow.setValue(aVar);
        k.d(this.coroutineScope, null, null, new a(aVar, null), 3, null);
    }
}
