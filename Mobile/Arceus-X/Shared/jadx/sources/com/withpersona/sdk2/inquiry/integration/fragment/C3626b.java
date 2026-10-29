package com.withpersona.sdk2.inquiry.integration.fragment;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.p616lifecycle.C0967l0;
import ar.C1147b;
import com.withpersona.sdk2.inquiry.integration.C3612a;
import com.withpersona.sdk2.inquiry.integration.IntegrationPage;
import com.withpersona.sdk2.inquiry.integration.IntegrationView;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.fragment.C3626b;
import com.withpersona.sdk2.inquiry.steps.p056ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationEventData;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationState;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9566c0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7334d;
import p229jt.C7345l;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p475uq.C11930a;
import p499vr.AbstractC12252c;
import p554xo.BrowserSelection;
import p554xo.C12873e;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u000256BG\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J5\u0010)\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001a0'0%0$2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/b;", "Lvr/c;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationView;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/integration/a$a;", "integrationBrowserWorkerFactory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lku/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Landroidx/lifecycle/l0;Landroid/content/Context;Luq/a;Lcom/withpersona/sdk2/inquiry/integration/a$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lku/p0;)V", "props", "p", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;", "renderProps", "renderState", "", "s", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State;)V", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b;", NotificationCompat.CATEGORY_EVENT, "v", "(Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b;)V", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;", "q", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$State$Starting;)V", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "n", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;)Ljava/util/List;", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Luq/a;", "h", "Lcom/withpersona/sdk2/inquiry/integration/a$a;", "i", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "c", "b", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3626b extends AbstractC12252c<IntegrationWorkflow.Input, IntegrationWorkflow.State, IntegrationWorkflow.InterfaceC3611b, IntegrationView> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C11930a navigationStateManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C3612a.a integrationBrowserWorkerFactory;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.b$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepStateManager$2", m39664f = "IntegrationStepStateManager.kt", m39665l = {60}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f14401t;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.b$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14131a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C3626b f14403a;

            public C14131a(C3626b c3626b) {
                this.f14403a = c3626b;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(IntegrationWorkflow.Input input, InterfaceC9557b<? super Unit> interfaceC9557b) {
                C3626b c3626b = this.f14403a;
                IntegrationWorkflow.State state = (IntegrationWorkflow.State) c3626b.m45397d().m45411i();
                if (state == null) {
                    return Unit.f29331a;
                }
                c3626b.m18052s(input, state);
                return Unit.f29331a;
            }
        }

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C3626b.this.new a(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14401t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0<IntegrationWorkflow.Input> interfaceC9566c0M45395b = C3626b.this.m45395b();
                C14131a c14131a = new C14131a(C3626b.this);
                this.f14401t = 1;
                if (interfaceC9566c0M45395b.collect(c14131a, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            throw new C7334d();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.b$b */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b;", "", "a", "b", "c", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b$a;", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b$b;", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b$c;", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.b$b$a */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b$a;", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f14404a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1679929975;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.b$b$b, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b$b;", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class C14132b implements b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final C14132b f14405a = new C14132b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C14132b);
            }

            public int hashCode() {
                return 523949724;
            }

            @NotNull
            public String toString() {
                return "Cancel";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.b$b$c */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b$c;", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final c f14406a = new c();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -323947876;
            }

            @NotNull
            public String toString() {
                return "OpenBrowser";
            }
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.fragment.b$c */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/fragment/b$c;", "", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/integration/fragment/b;", "a", "(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/integration/fragment/b;", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface c {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3626b mo18055a(@NotNull IntegrationWorkflow.Input initialProps, @NotNull C0967l0 savedStateHandle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3626b(@NotNull IntegrationWorkflow.Input initialProps, @NotNull C0967l0 savedStateHandle, @NotNull Context applicationContext, @NotNull C11930a navigationStateManager, @NotNull C3612a.a integrationBrowserWorkerFactory, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull InterfaceC7906p0 coroutineScope) {
        super(initialProps, savedStateHandle, coroutineScope);
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(integrationBrowserWorkerFactory, "integrationBrowserWorkerFactory");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.savedStateHandle = savedStateHandle;
        this.applicationContext = applicationContext;
        this.navigationStateManager = navigationStateManager;
        this.integrationBrowserWorkerFactory = integrationBrowserWorkerFactory;
        this.trackingEventsLogger = trackingEventsLogger;
        if (m45397d().m45411i() == null) {
            m45397d().m45417p(m18050p(m45395b().getValue()));
        }
        m45397d().m45416o(new Function1() { // from class: yo.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3626b.m18043l(this.f46624a, (IntegrationWorkflow.State) obj);
            }
        });
        C7882k.m32780d(coroutineScope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m18043l(C3626b c3626b, IntegrationWorkflow.State state) {
        if (state == null) {
            return Unit.f29331a;
        }
        c3626b.m18052s(c3626b.m45395b().getValue(), state);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m18045o(C3626b c3626b, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3626b.m18053v(b.c.f14406a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m18046r(C3626b c3626b, IntegrationWorkflow.Input input, BrowserSelection browserSelection, C3612a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof C3612a.b.a)) {
            throw new C7345l();
        }
        WorkflowState workflowStateM45411i = c3626b.m45397d().m45411i();
        IntegrationWorkflow.State.Starting starting = workflowStateM45411i instanceof IntegrationWorkflow.State.Starting ? (IntegrationWorkflow.State.Starting) workflowStateM45411i : null;
        if (starting == null) {
            return Unit.f29331a;
        }
        TrackingEventsLogger.logIntegrationEvent$default(c3626b.trackingEventsLogger, new IntegrationEventData(IntegrationState.Complete, input.getFlowUrl(), Boolean.valueOf(browserSelection.getSupportsAuthTab()), null, 8, null), false, 2, null);
        c3626b.m45397d().m45417p(starting.m17993u(null));
        c3626b.m45398e(IntegrationWorkflow.InterfaceC3611b.d.f14348a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m18047t(C3626b c3626b) {
        c3626b.m18053v(b.a.f14404a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m18048u(C3626b c3626b) {
        c3626b.m18053v(b.C14132b.f14405a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n */
    public final List<Pair<String, Function1<UiComponent, Unit>>> m18049n(IntegrationWorkflow.Input props) {
        IntegrationPage integrationPageM17987k = props.getStartPage();
        return integrationPageM17987k == null ? C7699p.m31892k() : new NestedUiStep.C4025a().m20520a(integrationPageM17987k.getOpenBrowserButton(), new Function1() { // from class: yo.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3626b.m18045o(this.f46627a, (UiComponent) obj);
            }
        }).m20521b();
    }

    /* JADX INFO: renamed from: p */
    public final IntegrationWorkflow.State m18050p(IntegrationWorkflow.Input props) {
        return new IntegrationWorkflow.State.Starting(IntegrationWorkflow.PendingAction.OpenBrowser.f14340a);
    }

    /* JADX INFO: renamed from: q */
    public final void m18051q(final IntegrationWorkflow.Input renderProps, IntegrationWorkflow.State.Starting renderState) {
        IntegrationWorkflow.PendingAction pendingActionM17994v = renderState.getPendingAction();
        if (!(pendingActionM17994v instanceof IntegrationWorkflow.PendingAction.OpenBrowser)) {
            if (pendingActionM17994v != null) {
                throw new C7345l();
            }
        } else {
            final BrowserSelection browserSelectionM47907c = C12873e.f45728a.m47907c(this.applicationContext);
            TrackingEventsLogger.logIntegrationEvent$default(this.trackingEventsLogger, new IntegrationEventData(IntegrationState.ShowingIntegration, renderProps.getFlowUrl(), Boolean.valueOf(browserSelectionM47907c.getSupportsAuthTab()), null, 8, null), false, 2, null);
            m45397d().m45415n(this.integrationBrowserWorkerFactory.mo18005a(renderProps.getFlowUrl(), renderProps.getRedirectPath(), browserSelectionM47907c, renderProps.getIntegrationStepBrowserType()), new Function1() { // from class: yo.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3626b.m18046r(this.f46628a, renderProps, browserSelectionM47907c, (C3612a.b) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m18052s(IntegrationWorkflow.Input renderProps, IntegrationWorkflow.State renderState) {
        if (!(renderState instanceof IntegrationWorkflow.State.Starting)) {
            throw new C7345l();
        }
        IntegrationWorkflow.State.Starting starting = (IntegrationWorkflow.State.Starting) renderState;
        m18051q(renderProps, starting);
        C11930a.m44527d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), starting.getPendingAction() == null && !renderProps.getIsSubmitting(), false, 8, null);
        IntegrationPage integrationPageM17987k = renderProps.getStartPage();
        Intrinsics.checkNotNull(integrationPageM17987k);
        m45396c().setValue(new IntegrationView(C1147b.m6492a(integrationPageM17987k), this.navigationStateManager.m44528b(), new Function0() { // from class: yo.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3626b.m18047t(this.f46625a);
            }
        }, new Function0() { // from class: yo.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3626b.m18048u(this.f46626a);
            }
        }, m18049n(renderProps), starting.getPendingAction() != null || renderProps.getIsSubmitting()));
    }

    /* JADX INFO: renamed from: v */
    public final void m18053v(b event) {
        if (event instanceof b.a) {
            m45398e(IntegrationWorkflow.InterfaceC3611b.a.f14345a);
            return;
        }
        if (event instanceof b.C14132b) {
            m45398e(IntegrationWorkflow.InterfaceC3611b.b.f14346a);
            return;
        }
        if (!(event instanceof b.c)) {
            throw new C7345l();
        }
        WorkflowState workflowStateM45411i = m45397d().m45411i();
        IntegrationWorkflow.State.Starting starting = workflowStateM45411i instanceof IntegrationWorkflow.State.Starting ? (IntegrationWorkflow.State.Starting) workflowStateM45411i : null;
        if (starting == null) {
            return;
        }
        m45397d().m45417p(starting.m17993u(IntegrationWorkflow.PendingAction.OpenBrowser.f14340a));
    }
}
