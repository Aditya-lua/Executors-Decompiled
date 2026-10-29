package p475uq;

import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import org.jetbrains.annotations.NotNull;
import p152go.C6159e;
import p152go.C6180z;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p363pq.InterfaceC10311e;
import p524wo.ScreenState;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: uq.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010\u000e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR*\u0010%\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&\"\u0004\b\u001e\u0010'R\u0011\u0010)\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010(¨\u0006*"}, m31665d2 = {"Luq/a;", "", "Lpq/e;", "externalInquiryController", "Lgo/e;", "featureFlagManager", "Lku/p0;", "coroutineScope", "<init>", "(Lpq/e;Lgo/e;Lku/p0;)V", "", "shouldShowBackButton", "shouldShowCancelButton", "isEnabled", "shouldShowHelpButton", "", "c", "(ZZZZ)V", "f", "()V", "a", "Lpq/e;", "b", "Lgo/e;", "Lku/p0;", "Lnu/c0;", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "d", "Lnu/c0;", "navigationStateFlow", "e", "Z", "g", "isNavigationEnabled", "h", "value", "i", "isTransitioningBack", "()Z", "(Z)V", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11930a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC10311e externalInquiryController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C6159e featureFlagManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<NavigationState> navigationStateFlow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean shouldShowBackButton;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean shouldShowCancelButton;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isNavigationEnabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean shouldShowHelpButton;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isTransitioningBack;

    /* JADX INFO: renamed from: uq.a$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager$updateScreenState$1", m39664f = "NavigationStateManager.kt", m39665l = {79}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f42337t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ NavigationState f42339v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NavigationState navigationState, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f42339v = navigationState;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C11930a.this.new a(this.f42339v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f42337t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0<ScreenState> interfaceC9566c0Mo18569b = C11930a.this.externalInquiryController.mo18569b();
                ScreenState screenState = new ScreenState(this.f42339v.getShowBackButton(), this.f42339v.getShowCancelButton(), this.f42339v.getIsNavigationEnabled(), this.f42339v.getShowHelpButton());
                this.f42337t = 1;
                if (interfaceC9566c0Mo18569b.emit(screenState, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C11930a(@NotNull InterfaceC10311e externalInquiryController, @NotNull C6159e featureFlagManager, @NotNull InterfaceC7906p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(externalInquiryController, "externalInquiryController");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.externalInquiryController = externalInquiryController;
        this.featureFlagManager = featureFlagManager;
        this.coroutineScope = coroutineScope;
        this.navigationStateFlow = C9596r0.m37859a(new NavigationState(true, true, externalInquiryController.mo18571d(), true, true, true));
        this.isNavigationEnabled = true;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m44527d(C11930a c11930a, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        if ((i10 & 8) != 0) {
            z13 = false;
        }
        c11930a.m44529c(z10, z11, z12, z13);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final NavigationState m44528b() {
        return this.navigationStateFlow.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m44529c(boolean shouldShowBackButton, boolean shouldShowCancelButton, boolean isEnabled, boolean shouldShowHelpButton) {
        this.shouldShowBackButton = shouldShowBackButton;
        this.shouldShowCancelButton = shouldShowCancelButton;
        this.isNavigationEnabled = isEnabled;
        this.shouldShowHelpButton = shouldShowHelpButton && this.featureFlagManager.m27148d(C6180z.f23567a);
        m44531f();
    }

    /* JADX INFO: renamed from: e */
    public final void m44530e(boolean z10) {
        this.isTransitioningBack = z10;
        m44531f();
    }

    /* JADX INFO: renamed from: f */
    public final void m44531f() {
        NavigationState navigationState = new NavigationState(this.shouldShowBackButton, this.shouldShowCancelButton, this.externalInquiryController.mo18571d(), this.externalInquiryController.mo18572e(), this.isNavigationEnabled && !this.isTransitioningBack, this.shouldShowHelpButton);
        if (Intrinsics.m31980c(this.navigationStateFlow.getValue(), navigationState)) {
            return;
        }
        this.navigationStateFlow.setValue(navigationState);
        C7882k.m32780d(this.coroutineScope, null, null, new a(navigationState, null), 3, null);
    }
}
