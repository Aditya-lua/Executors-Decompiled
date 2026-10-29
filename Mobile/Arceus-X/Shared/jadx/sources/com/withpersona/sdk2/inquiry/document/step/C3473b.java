package com.withpersona.sdk2.inquiry.document.step;

import android.content.Context;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import androidx.p616lifecycle.C0967l0;
import ar.C1147b;
import ar.C1164s;
import bo.C1475a;
import com.withpersona.sdk2.inquiry.document.C3438a;
import com.withpersona.sdk2.inquiry.document.C3439b;
import com.withpersona.sdk2.inquiry.document.C3444g;
import com.withpersona.sdk2.inquiry.document.C3446i;
import com.withpersona.sdk2.inquiry.document.CaptureMethod;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentStartPage;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.UploadOptionsDialog;
import com.withpersona.sdk2.inquiry.document.network.C3451a;
import com.withpersona.sdk2.inquiry.document.network.C3453c;
import com.withpersona.sdk2.inquiry.document.network.C3455e;
import com.withpersona.sdk2.inquiry.document.network.C3457g;
import com.withpersona.sdk2.inquiry.document.step.C3473b;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3875e;
import com.withpersona.sdk2.inquiry.steps.p056ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.steps.p056ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9566c0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import p226jq.C7259g;
import p229jt.C7334d;
import p229jt.C7345l;
import p229jt.C7348o;
import p239k6.InterfaceC7479s;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p363pq.C10309c;
import p419rp.EnumC11024i0;
import p419rp.EnumC11028j1;
import p475uq.C11930a;
import p497vp.C12244g;
import p499vr.AbstractC12252c;
import p499vr.C12255f;
import p499vr.C12256g;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001aB\u008f\u0001\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\u00020)*\b\u0012\u0004\u0012\u00020\u00030,2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J1\u00107\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u000204\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020)050302*\u000201H\u0002¢\u0006\u0004\b7\u00108J1\u0010:\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u000204\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020)050302*\u000209H\u0002¢\u0006\u0004\b:\u0010;J#\u0010=\u001a\u00020)*\u00020<2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b=\u0010>J#\u0010@\u001a\u00020)*\u00020?2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0002¢\u0006\u0004\bC\u0010DR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/b;", "Lvr/c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lk6/s;", "imageLoader", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/document/a;", "documentCameraWorker", "Lcom/withpersona/sdk2/inquiry/document/i$b;", "documentsSelectWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "documentCreateWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "documentLoadWorker", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "documentFileUploadWorkerFactory", "Lbo/a$a;", "documentFileDeleteWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "documentSubmitWorker", "Luq/a;", "navigationStateManager", "Lpq/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "permissionRequestWorker", "Lku/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Landroidx/lifecycle/l0;Lk6/s;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/document/a;Lcom/withpersona/sdk2/inquiry/document/i$b;Lcom/withpersona/sdk2/inquiry/document/network/a$a;Lcom/withpersona/sdk2/inquiry/document/network/e$a;Lcom/withpersona/sdk2/inquiry/document/network/c$a;Lbo/a$a;Lcom/withpersona/sdk2/inquiry/document/network/g$a;Luq/a;Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;Lku/p0;)V", "renderProps", "renderState", "", "l0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V", "Lvr/f;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", NotificationCompat.CATEGORY_EVENT, "S0", "(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "b0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "c0", "(Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "T0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "U0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V", "props", "k0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "e", "Landroidx/lifecycle/l0;", "f", "Lk6/s;", "g", "Landroid/content/Context;", "h", "Lcom/withpersona/sdk2/inquiry/document/a;", "i", "Lcom/withpersona/sdk2/inquiry/document/i$b;", "j", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "k", "Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "l", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "m", "Lbo/a$a;", "n", "Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "o", "Luq/a;", "p", "Lpq/c;", "q", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "r", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "c", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3473b extends AbstractC12252c<DocumentWorkflow.Input, DocumentWorkflow.State, DocumentWorkflow.AbstractC3431b, DocumentWorkflow.InterfaceC3432c> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7479s imageLoader;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C3438a documentCameraWorker;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C3446i.b documentsSelectWorkerFactory;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final C3451a.a documentCreateWorkerFactory;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C3455e.a documentLoadWorker;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final C3453c.a documentFileUploadWorkerFactory;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final C1475a.a documentFileDeleteWorkerFactory;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final C3457g.a documentSubmitWorker;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final C11930a navigationStateManager;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final C10309c externalEventLogger;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final C3875e.a permissionRequestWorker;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.b$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$1$1", m39664f = "DocumentStepStateManager.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f13484t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ DocumentWorkflow.State f13486v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DocumentWorkflow.State state, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f13486v = state;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C3473b.this.new a(this.f13486v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f13484t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C3473b c3473b = C3473b.this;
            c3473b.m16897l0(c3473b.m45395b().getValue(), this.f13486v);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.b$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$2", m39664f = "DocumentStepStateManager.kt", m39665l = {97}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f13487t;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.b$b$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C3473b f13489a;

            public a(C3473b c3473b) {
                this.f13489a = c3473b;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(DocumentWorkflow.Input input, InterfaceC9557b<? super Unit> interfaceC9557b) {
                C3473b c3473b = this.f13489a;
                DocumentWorkflow.State state = (DocumentWorkflow.State) c3473b.m45397d().m45411i();
                if (state == null) {
                    return Unit.f29331a;
                }
                c3473b.m16897l0(input, state);
                return Unit.f29331a;
            }
        }

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C3473b.this.new b(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f13487t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0<DocumentWorkflow.Input> interfaceC9566c0M45395b = C3473b.this.m45395b();
                a aVar = new a(C3473b.this);
                this.f13487t = 1;
                if (interfaceC9566c0M45395b.collect(aVar, this) == objM38805e) {
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
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.b$c */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/b$c;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/document/step/b;", "a", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/document/step/b;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface c {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3473b mo16899a(@NotNull DocumentWorkflow.Input initialProps, @NotNull C0967l0 savedStateHandle);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.b$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13490a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f13491b;

        static {
            int[] iArr = new int[EnumC11028j1.values().length];
            try {
                iArr[EnumC11028j1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11028j1.PermissionRejected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11028j1.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13490a = iArr;
            int[] iArr2 = new int[DocumentWorkflow.State.EnumC3429a.values().length];
            try {
                iArr2[DocumentWorkflow.State.EnumC3429a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DocumentWorkflow.State.EnumC3429a.CheckCameraPermissions.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DocumentWorkflow.State.EnumC3429a.CameraRunning.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DocumentWorkflow.State.EnumC3429a.SelectFileFromDocuments.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DocumentWorkflow.State.EnumC3429a.SelectImageFromPhotoLibrary.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f13491b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.b$e */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$handleState$screen$14", m39664f = "DocumentStepStateManager.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f13492t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f13494v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC9557b<? super e> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f13494v = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C3473b.this.new e(this.f13494v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f13492t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            WorkflowState workflowStateM45411i = C3473b.this.m45397d().m45411i();
            DocumentWorkflow.State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = workflowStateM45411i instanceof DocumentWorkflow.State.ReviewCapturesWithoutDocumentId ? (DocumentWorkflow.State.ReviewCapturesWithoutDocumentId) workflowStateM45411i : null;
            if (reviewCapturesWithoutDocumentId == null) {
                return Unit.f29331a;
            }
            DocumentWorkflow.State.EnumC3429a enumC3429a = null;
            C3473b.this.m45397d().m45417p(new DocumentWorkflow.State.ReviewCaptures(reviewCapturesWithoutDocumentId.mo16476m(), this.f13494v, enumC3429a, new DocumentWorkflow.State.UploadState.UploadFiles(this.f13494v), null, false, false, reviewCapturesWithoutDocumentId.getError(), 116, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((e) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.b$f */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$run$4", m39664f = "DocumentStepStateManager.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class f extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f13495t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ DocumentWorkflow.State.UploadState f13497v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(DocumentWorkflow.State.UploadState uploadState, InterfaceC9557b<? super f> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f13497v = uploadState;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C3473b.this.new f(this.f13497v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f13495t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            DocumentWorkflow.State state = (DocumentWorkflow.State) C3473b.this.m45397d().m45411i();
            if (state == null) {
                return Unit.f29331a;
            }
            C3473b.this.m45397d().m45417p(DocumentWorkflow.State.m16470i(state, new DocumentWorkflow.State.UploadState.ReadyToSubmit(((DocumentWorkflow.State.UploadState.UploadFiles) this.f13497v).getDocumentId()), null, null, null, 14, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((f) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3473b(@NotNull DocumentWorkflow.Input initialProps, @NotNull C0967l0 savedStateHandle, @NotNull InterfaceC7479s imageLoader, @NotNull Context applicationContext, @NotNull C3438a documentCameraWorker, @NotNull C3446i.b documentsSelectWorkerFactory, @NotNull C3451a.a documentCreateWorkerFactory, @NotNull C3455e.a documentLoadWorker, @NotNull C3453c.a documentFileUploadWorkerFactory, @NotNull C1475a.a documentFileDeleteWorkerFactory, @NotNull C3457g.a documentSubmitWorker, @NotNull C11930a navigationStateManager, @NotNull C10309c externalEventLogger, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull C3875e.a permissionRequestWorker, @NotNull final InterfaceC7906p0 coroutineScope) {
        super(initialProps, savedStateHandle, coroutineScope);
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(documentCameraWorker, "documentCameraWorker");
        Intrinsics.checkNotNullParameter(documentsSelectWorkerFactory, "documentsSelectWorkerFactory");
        Intrinsics.checkNotNullParameter(documentCreateWorkerFactory, "documentCreateWorkerFactory");
        Intrinsics.checkNotNullParameter(documentLoadWorker, "documentLoadWorker");
        Intrinsics.checkNotNullParameter(documentFileUploadWorkerFactory, "documentFileUploadWorkerFactory");
        Intrinsics.checkNotNullParameter(documentFileDeleteWorkerFactory, "documentFileDeleteWorkerFactory");
        Intrinsics.checkNotNullParameter(documentSubmitWorker, "documentSubmitWorker");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(permissionRequestWorker, "permissionRequestWorker");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.savedStateHandle = savedStateHandle;
        this.imageLoader = imageLoader;
        this.applicationContext = applicationContext;
        this.documentCameraWorker = documentCameraWorker;
        this.documentsSelectWorkerFactory = documentsSelectWorkerFactory;
        this.documentCreateWorkerFactory = documentCreateWorkerFactory;
        this.documentLoadWorker = documentLoadWorker;
        this.documentFileUploadWorkerFactory = documentFileUploadWorkerFactory;
        this.documentFileDeleteWorkerFactory = documentFileDeleteWorkerFactory;
        this.documentSubmitWorker = documentSubmitWorker;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.trackingEventsLogger = trackingEventsLogger;
        this.permissionRequestWorker = permissionRequestWorker;
        if (m45397d().m45411i() == null) {
            m45397d().m45417p(m16896k0(m45395b().getValue()));
        }
        m45397d().m45416o(new Function1() { // from class: co.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3473b.m16847Z(coroutineScope, this, (DocumentWorkflow.State) obj);
            }
        });
        C7882k.m32780d(coroutineScope, C7864g1.m32646d(), null, new b(null), 2, null);
    }

    /* JADX INFO: renamed from: A0 */
    public static final Unit m16801A0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.e.f13090a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m16803B0(DocumentFile.Remote it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C0 */
    public static final Unit m16805C0() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: D0 */
    public static final Unit m16807D0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.b.f13087a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: E0 */
    public static final Unit m16809E0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.a.f13086a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m16811F0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.d.f13089a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G0 */
    public static final Unit m16813G0(C3473b c3473b, C3457g.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.m31980c(it, C3457g.b.C14124b.f13425a)) {
            c3473b.m45398e(DocumentWorkflow.AbstractC3431b.d.f13100a);
        } else {
            if (!(it instanceof C3457g.b.Error)) {
                throw new C7345l();
            }
            c3473b.m45398e(new DocumentWorkflow.AbstractC3431b.Errored(((C3457g.b.Error) it).getCause()));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H0 */
    public static final Unit m16815H0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.b.f13087a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: I0 */
    public static final Unit m16817I0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.c.f13088a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: J0 */
    public static final Unit m16819J0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.b.f13087a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: K0 */
    public static final Unit m16821K0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.b.f13087a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: L0 */
    public static final Unit m16823L0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.b.f13087a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: M0 */
    public static final Unit m16825M0(C3473b c3473b, DocumentWorkflow.State state, C3875e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = d.f13490a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            C3438a c3438a = c3473b.documentCameraWorker;
            String string = c3473b.applicationContext.getString(C12244g.f43244b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            c3473b.m45397d().m45417p(c3438a.m16564e(string) ? state.m16471a(DocumentWorkflow.State.EnumC3429a.CameraRunning) : state.m16471a(DocumentWorkflow.State.EnumC3429a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new C7345l();
            }
            c3473b.m45397d().m45417p(state.m16471a(DocumentWorkflow.State.EnumC3429a.None));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: N0 */
    public static final Unit m16827N0(C3473b c3473b, C3455e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WorkflowState workflowStateM45411i = c3473b.m45397d().m45411i();
        DocumentWorkflow.State.ReviewCaptures reviewCaptures = workflowStateM45411i instanceof DocumentWorkflow.State.ReviewCaptures ? (DocumentWorkflow.State.ReviewCaptures) workflowStateM45411i : null;
        if (reviewCaptures == null) {
            return Unit.f29331a;
        }
        if (it instanceof C3455e.b.C14123b) {
            C12255f<DocumentWorkflow.State> c12255fM45397d = c3473b.m45397d();
            DocumentWorkflow.State.UploadState.ReadyToSubmit readyToSubmit = new DocumentWorkflow.State.UploadState.ReadyToSubmit(reviewCaptures.getDocumentId());
            List<DocumentFile> listM16745a = ((C3455e.b.C14123b) it).m16745a();
            List<DocumentFile> listMo16476m = reviewCaptures.mo16476m();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listMo16476m) {
                if (obj instanceof DocumentFile.Local) {
                    arrayList.add(obj);
                }
            }
            c12255fM45397d.m45417p(DocumentWorkflow.State.ReviewCaptures.m16479p(reviewCaptures, CollectionsKt.m31725w0(listM16745a, arrayList), null, null, readyToSubmit, null, false, false, null, 214, null));
        } else {
            if (!(it instanceof C3455e.b.a)) {
                throw new C7345l();
            }
            c3473b.m45398e(new DocumentWorkflow.AbstractC3431b.Errored(((C3455e.b.a) it).getCause()));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O0 */
    public static final Unit m16829O0(C3473b c3473b, DocumentWorkflow.State state, C3875e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = d.f13490a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            C3438a c3438a = c3473b.documentCameraWorker;
            String string = c3473b.applicationContext.getString(C12244g.f43244b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            c3473b.m45397d().m45417p(c3438a.m16564e(string) ? state.m16471a(DocumentWorkflow.State.EnumC3429a.CameraRunning) : state.m16471a(DocumentWorkflow.State.EnumC3429a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new C7345l();
            }
            c3473b.m45397d().m45417p(state.m16471a(DocumentWorkflow.State.EnumC3429a.None));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: P0 */
    public static final Unit m16831P0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.c.f13088a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final Unit m16833Q0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.g.f13093a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R0 */
    public static final Unit m16835R0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.h.f13094a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V0 */
    public static final Unit m16840V0(C3473b c3473b, DocumentWorkflow.Input input, C3438a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DocumentWorkflow.State state = (DocumentWorkflow.State) c3473b.m45397d().m45411i();
        if (state == null) {
            return Unit.f29331a;
        }
        if (it instanceof C3438a.b.C14111b) {
            C12255f<DocumentWorkflow.State> c12255fM45397d = c3473b.m45397d();
            DocumentWorkflow.State.UploadState uploadState = state.getUploadState();
            DocumentWorkflow.State.EnumC3429a enumC3429a = null;
            DocumentFile documentFile = null;
            boolean z10 = false;
            boolean z11 = false;
            String str = null;
            c12255fM45397d.m45417p(new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.m31682H0(CollectionsKt.m31726x0(state.mo16476m(), new DocumentFile.Local(((C3438a.b.C14111b) it).getAbsoluteFilePath(), CaptureMethod.MANUAL, 0, 4, null)), input.getDocumentFileLimit()), state.getDocumentId(), enumC3429a, uploadState, documentFile, z10, z11, str, 244, null));
        } else {
            if (!Intrinsics.m31980c(it, C3438a.b.a.f13163a)) {
                throw new C7345l();
            }
            c3473b.m45397d().m45417p(state.m16471a(DocumentWorkflow.State.EnumC3429a.None));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W0 */
    public static final Unit m16842W0(C3473b c3473b, DocumentWorkflow.Input input, DocumentWorkflow.State state, C3446i.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DocumentWorkflow.State state2 = (DocumentWorkflow.State) c3473b.m45397d().m45411i();
        if (state2 == null) {
            return Unit.f29331a;
        }
        if (it instanceof C3446i.c.Success) {
            DocumentWorkflow.State.EnumC3429a enumC3429a = null;
            c3473b.m45397d().m45417p(new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.m31682H0(CollectionsKt.m31725w0(state2.mo16476m(), C3444g.m16624b(((C3446i.c.Success) it).m16640a())), input.getDocumentFileLimit()), state2.getDocumentId(), enumC3429a, state2.getUploadState(), null, false, false, null, 244, null));
        } else if (it instanceof C3446i.c.Failure) {
            DocumentWorkflow.State.EnumC3429a enumC3429a2 = null;
            c3473b.m45397d().m45417p(new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.m31682H0(CollectionsKt.m31725w0(state2.mo16476m(), C3444g.m16624b(((C3446i.c.Failure) it).m16639a())), input.getDocumentFileLimit()), state2.getDocumentId(), enumC3429a2, state2.getUploadState(), null, false, false, c3473b.applicationContext.getString(C12244g.f43257m), 116, null));
        } else {
            if (!Intrinsics.m31980c(it, C3446i.c.a.f13249a)) {
                throw new C7345l();
            }
            c3473b.m45397d().m45417p(state.m16471a(DocumentWorkflow.State.EnumC3429a.None));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X0 */
    public static final Unit m16844X0(C3473b c3473b, C3451a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DocumentWorkflow.State state = (DocumentWorkflow.State) c3473b.m45397d().m45411i();
        if (state == null) {
            return Unit.f29331a;
        }
        if (it instanceof C3451a.b.C14119b) {
            C3451a.b.C14119b c14119b = (C3451a.b.C14119b) it;
            c3473b.m45397d().m45417p(DocumentWorkflow.State.m16470i(state, new DocumentWorkflow.State.UploadState.ReadyToSubmit(c14119b.getDocumentId()), c14119b.getDocumentId(), null, null, 12, null));
        } else {
            if (!(it instanceof C3451a.b.Error)) {
                throw new C7345l();
            }
            C3451a.b.Error error = (C3451a.b.Error) it;
            if (!error.getCause().isRecoverable()) {
                c3473b.m45398e(new DocumentWorkflow.AbstractC3431b.Errored(error.getCause()));
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y0 */
    public static final Unit m16846Y0(C3473b c3473b, DocumentWorkflow.State.UploadState uploadState, DocumentFile.Local local, DocumentWorkflow.Input input, Object obj) {
        DocumentWorkflow.State.UploadState uploadFiles;
        DocumentWorkflow.State.UploadState readyToSubmit;
        DocumentWorkflow.State state = (DocumentWorkflow.State) c3473b.m45397d().m45411i();
        if (state == null) {
            return Unit.f29331a;
        }
        if (obj instanceof C3453c.b.d) {
            List<DocumentFile> listMo16476m = state.mo16476m();
            ArrayList arrayList = new ArrayList(C7701q.m31905u(listMo16476m, 10));
            for (Parcelable parcelableM16726a : listMo16476m) {
                C3453c.b.d dVar = (C3453c.b.d) obj;
                if (Intrinsics.m31980c(parcelableM16726a, dVar.getOldLocalDocument())) {
                    parcelableM16726a = dVar.getNewRemoteDocument();
                }
                arrayList.add(parcelableM16726a);
            }
            if (arrayList.isEmpty()) {
                readyToSubmit = new DocumentWorkflow.State.UploadState.ReadyToSubmit(((DocumentWorkflow.State.UploadState.UploadFiles) uploadState).getDocumentId());
                break;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    readyToSubmit = new DocumentWorkflow.State.UploadState.ReadyToSubmit(((DocumentWorkflow.State.UploadState.UploadFiles) uploadState).getDocumentId());
                    break;
                }
                Object obj2 = arrayList.get(i10);
                i10++;
                if (((DocumentFile) obj2) instanceof DocumentFile.Local) {
                    readyToSubmit = new DocumentWorkflow.State.UploadState.UploadFiles(((DocumentWorkflow.State.UploadState.UploadFiles) uploadState).getDocumentId());
                    break;
                }
            }
            c3473b.m45397d().m45417p(DocumentWorkflow.State.m16470i(state, readyToSubmit, null, arrayList, null, 10, null));
        } else if (obj instanceof C3453c.b.c) {
            List<DocumentFile> listMo16476m2 = state.mo16476m();
            ArrayList arrayList2 = new ArrayList(C7701q.m31905u(listMo16476m2, 10));
            for (Parcelable parcelableM16255f : listMo16476m2) {
                if ((parcelableM16255f instanceof DocumentFile.Local) && Intrinsics.m31980c(parcelableM16255f, local)) {
                    parcelableM16255f = DocumentFile.Local.m16255f((DocumentFile.Local) parcelableM16255f, null, null, ((C3453c.b.c) obj).getProgressPercentage(), 3, null);
                }
                arrayList2.add(parcelableM16255f);
            }
            c3473b.m45397d().m45417p(DocumentWorkflow.State.m16470i(state, state.getUploadState(), null, arrayList2, null, 10, null));
        } else if (obj instanceof C3453c.b.a) {
            List listV0 = CollectionsKt.m31724v0(state.mo16476m(), local);
            List list = listV0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        uploadFiles = new DocumentWorkflow.State.UploadState.ReadyToSubmit(((DocumentWorkflow.State.UploadState.UploadFiles) uploadState).getDocumentId());
                        break;
                    }
                    if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                        uploadFiles = new DocumentWorkflow.State.UploadState.UploadFiles(((DocumentWorkflow.State.UploadState.UploadFiles) uploadState).getDocumentId());
                        break;
                    }
                }
            } else {
                uploadFiles = new DocumentWorkflow.State.UploadState.ReadyToSubmit(((DocumentWorkflow.State.UploadState.UploadFiles) uploadState).getDocumentId());
                break;
            }
            DocumentWorkflow.State.UploadState uploadState2 = uploadFiles;
            C3453c.b.a aVar = (C3453c.b.a) obj;
            DocumentFile documentFile = null;
            c3473b.m45397d().m45417p(new DocumentWorkflow.State.ReviewCaptures(listV0, ((DocumentWorkflow.State.UploadState.UploadFiles) uploadState).getDocumentId(), DocumentWorkflow.State.EnumC3429a.None, uploadState2, documentFile, aVar.getCause() instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError, false, C3444g.m16625c(aVar.getCause(), c3473b.applicationContext, input), 80, null));
        } else if (obj instanceof C3453c.b.C14120b) {
            c3473b.m45398e(new DocumentWorkflow.AbstractC3431b.Errored(((C3453c.b.C14120b) obj).getCause()));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m16847Z(InterfaceC7906p0 interfaceC7906p0, C3473b c3473b, DocumentWorkflow.State state) {
        if (state == null) {
            return Unit.f29331a;
        }
        C7882k.m32780d(interfaceC7906p0, C7864g1.m32646d(), null, c3473b.new a(state, null), 2, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z0 */
    public static final Unit m16848Z0(C3473b c3473b, DocumentFile.Remote remote, DocumentWorkflow.State.UploadState uploadState, C1475a.b response) {
        DocumentWorkflow.State.UploadState uploadFiles;
        Intrinsics.checkNotNullParameter(response, "response");
        WorkflowState workflowStateM45411i = c3473b.m45397d().m45411i();
        DocumentWorkflow.State.ReviewCaptures reviewCaptures = workflowStateM45411i instanceof DocumentWorkflow.State.ReviewCaptures ? (DocumentWorkflow.State.ReviewCaptures) workflowStateM45411i : null;
        if (reviewCaptures == null) {
            return Unit.f29331a;
        }
        List listV0 = CollectionsKt.m31724v0(reviewCaptures.mo16476m(), remote);
        List list = listV0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    uploadFiles = new DocumentWorkflow.State.UploadState.ReadyToSubmit(((DocumentWorkflow.State.UploadState.DeleteFiles) uploadState).getDocumentId());
                    break;
                }
                if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                    uploadFiles = new DocumentWorkflow.State.UploadState.UploadFiles(((DocumentWorkflow.State.UploadState.DeleteFiles) uploadState).getDocumentId());
                    break;
                }
            }
        } else {
            uploadFiles = new DocumentWorkflow.State.UploadState.ReadyToSubmit(((DocumentWorkflow.State.UploadState.DeleteFiles) uploadState).getDocumentId());
            break;
        }
        DocumentWorkflow.State.UploadState uploadState2 = uploadFiles;
        if (response instanceof C1475a.b.C14096b) {
            c3473b.m45397d().m45417p(DocumentWorkflow.State.ReviewCaptures.m16479p(reviewCaptures, listV0, null, null, uploadState2, null, false, false, null, 230, null));
        } else {
            if (!(response instanceof C1475a.b.Error)) {
                throw new C7345l();
            }
            c3473b.m45398e(new DocumentWorkflow.AbstractC3431b.Errored(((C1475a.b.Error) response).getCause()));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: d0 */
    public static final Unit m16850d0(C3473b c3473b, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.g.f13093a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e0 */
    public static final Unit m16851e0(C3473b c3473b, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.h.f13094a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m16852f0(C3473b c3473b, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.j.f13096a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m16854g0(C3473b c3473b, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.e.f13090a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h0 */
    public static final Unit m16856h0(C3473b c3473b, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.g.f13093a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i0 */
    public static final Unit m16858i0(C3473b c3473b, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.h.f13094a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j0 */
    public static final Unit m16860j0(C3473b c3473b, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.j.f13096a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m16864m0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.a.f13086a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n0 */
    public static final Unit m16866n0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.j.f13096a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m16868o0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.e.f13090a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m16870p0(C3473b c3473b, DocumentWorkflow.State state, DocumentFile.Remote document) {
        Intrinsics.checkNotNullParameter(document, "document");
        c3473b.m16891S0(c3473b.m45397d(), new DocumentWorkflow.AbstractC3430a.RemoveDocument(((DocumentWorkflow.State.ReviewCaptures) state).getDocumentId(), document));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q0 */
    public static final Unit m16872q0(C3473b c3473b, DocumentWorkflow.State state) {
        c3473b.m16891S0(c3473b.m45397d(), new DocumentWorkflow.AbstractC3430a.Submit(((DocumentWorkflow.State.ReviewCaptures) state).getDocumentId()));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r0 */
    public static final Unit m16874r0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.b.f13087a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s0 */
    public static final Unit m16876s0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.a.f13086a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t0 */
    public static final Unit m16878t0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.d.f13089a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u0 */
    public static final Unit m16880u0(C3473b c3473b, DocumentWorkflow.State state, C3875e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = d.f13490a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            C3438a c3438a = c3473b.documentCameraWorker;
            String string = c3473b.applicationContext.getString(C12244g.f43244b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            c3473b.m45397d().m45417p(c3438a.m16564e(string) ? state.m16471a(DocumentWorkflow.State.EnumC3429a.CameraRunning) : state.m16471a(DocumentWorkflow.State.EnumC3429a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new C7345l();
            }
            c3473b.m45397d().m45417p(state.m16471a(DocumentWorkflow.State.EnumC3429a.None));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v0 */
    public static final Unit m16882v0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.c.f13088a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: w0 */
    public static final Unit m16884w0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.g.f13093a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x0 */
    public static final Unit m16886x0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.b.f13087a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y0 */
    public static final Unit m16888y0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.h.f13094a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z0 */
    public static final Unit m16890z0(C3473b c3473b) {
        c3473b.m16891S0(c3473b.m45397d(), DocumentWorkflow.AbstractC3430a.j.f13096a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m16891S0(C12255f<DocumentWorkflow.State> c12255f, DocumentWorkflow.AbstractC3430a abstractC3430a) {
        DocumentWorkflow.State state = (DocumentWorkflow.State) c12255f.m45411i();
        if (state == null) {
            return;
        }
        if (Intrinsics.m31980c(abstractC3430a, DocumentWorkflow.AbstractC3430a.b.f13087a)) {
            m45398e(DocumentWorkflow.AbstractC3431b.b.f13098a);
            return;
        }
        if (Intrinsics.m31980c(abstractC3430a, DocumentWorkflow.AbstractC3430a.a.f13086a)) {
            m45398e(DocumentWorkflow.AbstractC3431b.a.f13097a);
            return;
        }
        if (Intrinsics.m31980c(abstractC3430a, DocumentWorkflow.AbstractC3430a.g.f13093a)) {
            c12255f.m45417p(state.m16471a(DocumentWorkflow.State.EnumC3429a.SelectFileFromDocuments).m16472f(false));
            return;
        }
        if (Intrinsics.m31980c(abstractC3430a, DocumentWorkflow.AbstractC3430a.h.f13094a)) {
            c12255f.m45417p(state.m16471a(DocumentWorkflow.State.EnumC3429a.SelectImageFromPhotoLibrary).m16472f(false));
            return;
        }
        if (Intrinsics.m31980c(abstractC3430a, DocumentWorkflow.AbstractC3430a.j.f13096a)) {
            c12255f.m45417p(state.m16471a(DocumentWorkflow.State.EnumC3429a.CheckCameraPermissions).m16472f(false));
            return;
        }
        if (Intrinsics.m31980c(abstractC3430a, DocumentWorkflow.AbstractC3430a.e.f13090a)) {
            c12255f.m45417p(state.m16472f(true));
            return;
        }
        if (Intrinsics.m31980c(abstractC3430a, DocumentWorkflow.AbstractC3430a.c.f13088a)) {
            c12255f.m45417p(state.m16472f(false));
            return;
        }
        if (abstractC3430a instanceof DocumentWorkflow.AbstractC3430a.RemoveDocument) {
            if (state instanceof DocumentWorkflow.State.ReviewCaptures) {
                DocumentWorkflow.AbstractC3430a.RemoveDocument removeDocument = (DocumentWorkflow.AbstractC3430a.RemoveDocument) abstractC3430a;
                c12255f.m45417p(DocumentWorkflow.State.m16470i(state, new DocumentWorkflow.State.UploadState.DeleteFiles(removeDocument.getDocumentId()), null, null, removeDocument.getDocument(), 6, null));
                return;
            }
            return;
        }
        if (Intrinsics.m31980c(abstractC3430a, DocumentWorkflow.AbstractC3430a.d.f13089a)) {
            if (state instanceof DocumentWorkflow.State.ReviewCaptures) {
                c12255f.m45417p(DocumentWorkflow.State.ReviewCaptures.m16479p((DocumentWorkflow.State.ReviewCaptures) state, null, null, null, null, null, false, false, null, 127, null));
            }
        } else {
            if (!(abstractC3430a instanceof DocumentWorkflow.AbstractC3430a.Submit)) {
                throw new C7345l();
            }
            DocumentWorkflow.AbstractC3430a.Submit submit = (DocumentWorkflow.AbstractC3430a.Submit) abstractC3430a;
            c12255f.m45417p(new DocumentWorkflow.State.UploadDocument(state.mo16476m(), submit.getDocumentId(), new DocumentWorkflow.State.UploadState.ReadyToSubmit(submit.getDocumentId()), null, 8, null));
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m16892T0(DocumentWorkflow.State.EnumC3429a enumC3429a, final DocumentWorkflow.Input input, final DocumentWorkflow.State state) {
        int i10 = d.f13491b[enumC3429a.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return;
        }
        if (i10 == 3) {
            m45397d().m45415n(this.documentCameraWorker, new Function1() { // from class: co.n0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3473b.m16840V0(this.f6515a, input, (C3438a.b) obj);
                }
            });
        } else {
            if (i10 != 4 && i10 != 5) {
                throw new C7345l();
            }
            m45397d().m45415n(state.getCaptureState() == DocumentWorkflow.State.EnumC3429a.SelectFileFromDocuments ? this.documentsSelectWorkerFactory.m16637c() : this.documentsSelectWorkerFactory.m16638e(), new Function1() { // from class: co.o0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3473b.m16842W0(this.f6518a, input, state, (C3446i.c) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m16893U0(final DocumentWorkflow.State.UploadState uploadState, final DocumentWorkflow.Input input, DocumentWorkflow.State state) {
        if (Intrinsics.m31980c(uploadState, DocumentWorkflow.State.UploadState.CreateDocument.f13075a)) {
            if (state.getDocumentId() != null) {
                return;
            }
            m45397d().m45415n(this.documentCreateWorkerFactory.m16704a(input.getSessionToken(), input.getKind(), input.getFieldKeyDocument(), input.getDocumentFileLimit()), new Function1() { // from class: co.p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3473b.m16844X0(this.f6521a, (C3451a.b) obj);
                }
            });
            return;
        }
        if (!(uploadState instanceof DocumentWorkflow.State.UploadState.UploadFiles)) {
            if (!(uploadState instanceof DocumentWorkflow.State.UploadState.DeleteFiles)) {
                if (!(uploadState instanceof DocumentWorkflow.State.UploadState.ReadyToSubmit)) {
                    throw new C7345l();
                }
                return;
            } else {
                if (state instanceof DocumentWorkflow.State.ReviewCaptures) {
                    DocumentWorkflow.State.ReviewCaptures reviewCaptures = (DocumentWorkflow.State.ReviewCaptures) state;
                    DocumentFile documentFileToDelete = reviewCaptures.getDocumentFileToDelete();
                    final DocumentFile.Remote remote = documentFileToDelete instanceof DocumentFile.Remote ? (DocumentFile.Remote) documentFileToDelete : null;
                    if (remote == null) {
                        return;
                    }
                    m45397d().m45415n(this.documentFileDeleteWorkerFactory.m7576a(input.getSessionToken(), reviewCaptures.getDocumentId(), remote), new Function1() { // from class: co.s0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C3473b.m16848Z0(this.f6530a, remote, uploadState, (C1475a.b) obj);
                        }
                    });
                    return;
                }
                return;
            }
        }
        List<DocumentFile> listMo16476m = state.mo16476m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo16476m) {
            if (obj instanceof DocumentFile.Local) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            m45397d().m45414m("upload_complete", new f(uploadState, null));
            return;
        }
        for (final DocumentFile.Local local : CollectionsKt.m31682H0(arrayList, 3)) {
            C12255f<DocumentWorkflow.State> c12255fM45397d = m45397d();
            C3453c.a aVar = this.documentFileUploadWorkerFactory;
            String sessionToken = input.getSessionToken();
            String documentId = ((DocumentWorkflow.State.UploadState.UploadFiles) uploadState).getDocumentId();
            boolean z10 = true;
            if (input.getDocumentFileLimit() != 1) {
                z10 = false;
            }
            c12255fM45397d.m45415n(C12256g.m45423a(aVar.m16722a(sessionToken, documentId, local, z10), local.getAbsoluteFilePath()), new Function1() { // from class: co.r0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C3473b.m16846Y0(this.f6525a, uploadState, local, input, obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final List<Pair<String, Function1<UiComponent, Unit>>> m16894b0(DocumentStartPage documentStartPage) {
        return new NestedUiStep.C4025a().m20520a(documentStartPage.getSelectDocumentButton(), new Function1() { // from class: co.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3473b.m16850d0(this.f6507a, (UiComponent) obj);
            }
        }).m20520a(documentStartPage.getSelectPhotoButton(), new Function1() { // from class: co.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3473b.m16851e0(this.f6509a, (UiComponent) obj);
            }
        }).m20520a(documentStartPage.getTakePhotoButton(), new Function1() { // from class: co.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3473b.m16852f0(this.f6511a, (UiComponent) obj);
            }
        }).m20520a(documentStartPage.getLaunchUploadOptionsButton(), new Function1() { // from class: co.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3473b.m16854g0(this.f6513a, (UiComponent) obj);
            }
        }).m20521b();
    }

    /* JADX INFO: renamed from: c0 */
    public final List<Pair<String, Function1<UiComponent, Unit>>> m16895c0(UploadOptionsDialog uploadOptionsDialog) {
        return new NestedUiStep.C4025a().m20520a(uploadOptionsDialog.getSelectDocumentButton(), new Function1() { // from class: co.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3473b.m16856h0(this.f6534a, (UiComponent) obj);
            }
        }).m20520a(uploadOptionsDialog.getSelectPhotoButton(), new Function1() { // from class: co.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3473b.m16858i0(this.f6536a, (UiComponent) obj);
            }
        }).m20520a(uploadOptionsDialog.getTakePhotoButton(), new Function1() { // from class: co.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3473b.m16860j0(this.f6538a, (UiComponent) obj);
            }
        }).m20521b();
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final DocumentWorkflow.State m16896k0(@NotNull DocumentWorkflow.Input props) {
        Intrinsics.checkNotNullParameter(props, "props");
        DocumentWorkflow.StartPage startPage = props.getStartPage();
        if (Intrinsics.m31980c(startPage, DocumentWorkflow.StartPage.Prompt.f13045a)) {
            return new DocumentWorkflow.State.Start(null, null, props.getDocumentId(), false, 11, null);
        }
        if (!(startPage instanceof DocumentWorkflow.StartPage.Review)) {
            throw new C7345l();
        }
        return new DocumentWorkflow.State.ReviewCaptures(C7699p.m31892k(), ((DocumentWorkflow.StartPage.Review) props.getStartPage()).getDocumentId(), null, null, null, true, false, null, 220, null);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m16897l0(DocumentWorkflow.Input renderProps, final DocumentWorkflow.State renderState) {
        DocumentWorkflow.InterfaceC3432c bVar;
        C11930a.m44527d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !(renderState instanceof DocumentWorkflow.State.UploadDocument), false, 8, null);
        m16892T0(renderState.getCaptureState(), renderProps, renderState);
        m16893U0(renderState.getUploadState(), renderProps, renderState);
        C3444g.m16623a(this.externalEventLogger, this.trackingEventsLogger, renderProps, renderState);
        if (renderState instanceof DocumentWorkflow.State.Start) {
            DocumentWorkflow.State.Start start = (DocumentWorkflow.State.Start) renderState;
            bVar = new C3439b(C1147b.m6492a(renderProps.getPages().getDocumentStartPage()), m16894b0(renderProps.getPages().getDocumentStartPage()), this.navigationStateManager.m44528b(), new Function0() { // from class: co.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16864m0(this.f6535a);
                }
            }, new Function0() { // from class: co.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16886x0(this.f6512a);
                }
            }, start.getShouldShowUploadOptionsDialog() ? C1164s.f4917a.m6528j(C1147b.m6492a(renderProps.getPages().getUploadOptionsDialog()), m16895c0(renderProps.getPages().getUploadOptionsDialog()), new Function0() { // from class: co.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16817I0(this.f6544a);
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()) : null, renderProps.getPromptPageNavBarTitle(), renderProps.getStyles());
            if (start.getCaptureState() == DocumentWorkflow.State.EnumC3429a.CheckCameraPermissions) {
                C12255f<DocumentWorkflow.State> c12255fM45397d = m45397d();
                C3875e.a aVar = this.permissionRequestWorker;
                EnumC11024i0 enumC11024i0 = EnumC11024i0.Camera;
                String permissionsTitle = renderProps.getPermissionsTitle();
                String str = permissionsTitle == null ? "" : permissionsTitle;
                String permissionsRationale = renderProps.getPermissionsRationale();
                if (permissionsRationale == null) {
                    permissionsRationale = this.applicationContext.getString(C12244g.f43250f);
                    Intrinsics.checkNotNullExpressionValue(permissionsRationale, "getString(...)");
                }
                String str2 = permissionsRationale;
                Context context = this.applicationContext;
                String string = context.getString(C12244g.f43249e, C7259g.m30268b(context));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                c12255fM45397d.m45415n(aVar.mo19201a(new PermissionRequestWorkflow.Props(enumC11024i0, false, str, str2, string, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: co.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3473b.m16825M0(this.f6477a, renderState, (C3875e.b) obj);
                    }
                });
            }
        } else if (renderState instanceof DocumentWorkflow.State.ReviewCaptures) {
            DocumentWorkflow.State.ReviewCaptures reviewCaptures = (DocumentWorkflow.State.ReviewCaptures) renderState;
            if (reviewCaptures.getShouldLoadDocuments()) {
                m45397d().m45415n(this.documentLoadWorker.m16743a(renderProps.getSessionToken(), reviewCaptures.getDocumentId()), new Function1() { // from class: co.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3473b.m16827N0(this.f6481a, (C3455e.b) obj);
                    }
                });
            }
            if (reviewCaptures.getCaptureState() == DocumentWorkflow.State.EnumC3429a.CheckCameraPermissions) {
                C12255f<DocumentWorkflow.State> c12255fM45397d2 = m45397d();
                C3875e.a aVar2 = this.permissionRequestWorker;
                EnumC11024i0 enumC11024i1 = EnumC11024i0.Camera;
                String permissionsTitle2 = renderProps.getPermissionsTitle();
                String str3 = permissionsTitle2 == null ? "" : permissionsTitle2;
                String permissionsRationale2 = renderProps.getPermissionsRationale();
                if (permissionsRationale2 == null) {
                    permissionsRationale2 = this.applicationContext.getString(C12244g.f43250f);
                    Intrinsics.checkNotNullExpressionValue(permissionsRationale2, "getString(...)");
                }
                String str4 = permissionsRationale2;
                Context context2 = this.applicationContext;
                String string2 = context2.getString(C12244g.f43249e, C7259g.m30268b(context2));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                c12255fM45397d2.m45415n(aVar2.mo19201a(new PermissionRequestWorkflow.Props(enumC11024i1, false, str3, str4, string2, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: co.d0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3473b.m16829O0(this.f6496a, renderState, (C3875e.b) obj);
                    }
                });
            }
            bVar = new DocumentWorkflow.InterfaceC3432c.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCaptures.mo16476m(), this.navigationStateManager.m44528b(), new Function0() { // from class: co.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16833Q0(this.f6501a);
                }
            }, new Function0() { // from class: co.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16835R0(this.f6503a);
                }
            }, new Function0() { // from class: co.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16866n0(this.f6504a);
                }
            }, new Function0() { // from class: co.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16868o0(this.f6499a);
                }
            }, new Function1() { // from class: co.q0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3473b.m16870p0(this.f6522a, renderState, (DocumentFile.Remote) obj);
                }
            }, new Function0() { // from class: co.w0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16872q0(this.f6540a, renderState);
                }
            }, new Function0() { // from class: co.x0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16874r0(this.f6543a);
                }
            }, new Function0() { // from class: co.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16876s0(this.f6545a);
                }
            }, reviewCaptures.getShouldLoadDocuments(), reviewCaptures.mo16476m().size() < renderProps.getDocumentFileLimit(), !reviewCaptures.mo16476m().isEmpty() && Intrinsics.m31980c(reviewCaptures.getUploadState(), new DocumentWorkflow.State.UploadState.ReadyToSubmit(reviewCaptures.getDocumentId())), reviewCaptures.getError(), new Function0() { // from class: co.z0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16878t0(this.f6547a);
                }
            }, renderProps.getStyles(), renderProps.getCheckPageNavBarTitle(), reviewCaptures.getShouldShowUploadOptionsDialog() ? C1164s.f4917a.m6528j(C1147b.m6492a(renderProps.getPages().getUploadOptionsDialog()), m16895c0(renderProps.getPages().getUploadOptionsDialog()), new Function0() { // from class: co.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16831P0(this.f6498a);
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()) : null);
        } else if (renderState instanceof DocumentWorkflow.State.ReviewCapturesWithoutDocumentId) {
            DocumentWorkflow.State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (DocumentWorkflow.State.ReviewCapturesWithoutDocumentId) renderState;
            String documentId = reviewCapturesWithoutDocumentId.getDocumentId();
            if (documentId != null) {
                m45397d().m45414m(documentId, new e(documentId, null));
            }
            if (reviewCapturesWithoutDocumentId.getCaptureState() == DocumentWorkflow.State.EnumC3429a.CheckCameraPermissions) {
                C12255f<DocumentWorkflow.State> c12255fM45397d3 = m45397d();
                C3875e.a aVar3 = this.permissionRequestWorker;
                EnumC11024i0 enumC11024i2 = EnumC11024i0.Camera;
                String permissionsTitle3 = renderProps.getPermissionsTitle();
                String str5 = permissionsTitle3 == null ? "" : permissionsTitle3;
                String permissionsRationale3 = renderProps.getPermissionsRationale();
                if (permissionsRationale3 == null) {
                    permissionsRationale3 = this.applicationContext.getString(C12244g.f43250f);
                    Intrinsics.checkNotNullExpressionValue(permissionsRationale3, "getString(...)");
                }
                String str6 = permissionsRationale3;
                Context context3 = this.applicationContext;
                String string3 = context3.getString(C12244g.f43249e, C7259g.m30268b(context3));
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                c12255fM45397d3.m45415n(aVar3.mo19201a(new PermissionRequestWorkflow.Props(enumC11024i2, false, str5, str6, string3, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: co.a1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3473b.m16880u0(this.f6474a, renderState, (C3875e.b) obj);
                    }
                });
            }
            bVar = new DocumentWorkflow.InterfaceC3432c.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCapturesWithoutDocumentId.mo16476m(), this.navigationStateManager.m44528b(), new Function0() { // from class: co.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16884w0(this.f6508a);
                }
            }, new Function0() { // from class: co.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16888y0(this.f6510a);
                }
            }, new Function0() { // from class: co.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16890z0(this.f6514a);
                }
            }, new Function0() { // from class: co.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16801A0(this.f6517a);
                }
            }, new Function1() { // from class: co.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3473b.m16803B0((DocumentFile.Remote) obj);
                }
            }, new Function0() { // from class: co.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16805C0();
                }
            }, new Function0() { // from class: co.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16807D0(this.f6524a);
                }
            }, new Function0() { // from class: co.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16809E0(this.f6529a);
                }
            }, reviewCapturesWithoutDocumentId.getReloadingFromPreviousSession(), reviewCapturesWithoutDocumentId.mo16476m().size() < renderProps.getDocumentFileLimit(), false, reviewCapturesWithoutDocumentId.getError(), new Function0() { // from class: co.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16811F0(this.f6533a);
                }
            }, renderProps.getStyles(), renderProps.getCheckPageNavBarTitle(), reviewCapturesWithoutDocumentId.getShouldShowUploadOptionsDialog() ? C1164s.f4917a.m6528j(C1147b.m6492a(renderProps.getPages().getUploadOptionsDialog()), m16895c0(renderProps.getPages().getUploadOptionsDialog()), new Function0() { // from class: co.b1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16882v0(this.f6479a);
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()) : null);
        } else {
            if (!(renderState instanceof DocumentWorkflow.State.UploadDocument)) {
                throw new C7345l();
            }
            m45397d().m45415n(this.documentSubmitWorker.m16759a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), ((DocumentWorkflow.State.UploadDocument) renderState).mo16476m()), new Function1() { // from class: co.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C3473b.m16813G0(this.f6537a, (C3457g.b) obj);
                }
            });
            C11930a.m44527d(this.navigationStateManager, false, false, false, false, 12, null);
            CustomPendingPage customPendingPage = renderProps.getCustomPendingPage();
            bVar = customPendingPage != null ? new DocumentWorkflow.InterfaceC3432c.b(C1147b.m6492a(customPendingPage), this.navigationStateManager.m44528b(), renderProps.getStyles(), new Function0() { // from class: co.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16815H0(this.f6539a);
                }
            }, new Function0() { // from class: co.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16819J0(this.f6542a);
                }
            }, renderProps.getPendingPageNavBarTitle(), null, 64, null) : new DocumentWorkflow.InterfaceC3432c.LoadingAnimation(renderProps.getPendingTitle(), renderProps.getPendingDescription(), this.navigationStateManager.m44528b(), new Function0() { // from class: co.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16821K0(this.f6546a);
                }
            }, new Function0() { // from class: co.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3473b.m16823L0(this.f6473a);
                }
            }, renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), renderProps.getPendingPageTextVerticalPosition(), renderProps.getPendingPageNavBarTitle(), null, 512, null);
        }
        m45396c().setValue(bVar);
    }
}
