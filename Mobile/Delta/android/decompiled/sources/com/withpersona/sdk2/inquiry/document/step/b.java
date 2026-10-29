package com.withpersona.sdk2.inquiry.document.step;

import android.content.Context;
import android.os.Parcelable;
import androidx.p000lifecycle.l0;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.document.CaptureMethod;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentStartPage;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.UploadOptionsDialog;
import com.withpersona.sdk2.inquiry.document.i;
import com.withpersona.sdk2.inquiry.document.network.g;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.steps.ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jt.l;
import jt.o;
import k6.s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.k;
import ku.p0;
import nu.c0;
import org.jetbrains.annotations.NotNull;
import pt.m;
import rp.i0;
import rp.j1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001aB\u008f\u0001\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\u00020)*\b\u0012\u0004\u0012\u00020\u00030,2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J1\u00107\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u000204\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020)050302*\u000201H\u0002¢\u0006\u0004\b7\u00108J1\u0010:\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u000204\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020)050302*\u000209H\u0002¢\u0006\u0004\b:\u0010;J#\u0010=\u001a\u00020)*\u00020<2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b=\u0010>J#\u0010@\u001a\u00020)*\u00020?2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0002¢\u0006\u0004\bC\u0010DR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/b;", "Lvr/c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lk6/s;", "imageLoader", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/document/a;", "documentCameraWorker", "Lcom/withpersona/sdk2/inquiry/document/i$b;", "documentsSelectWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "documentCreateWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "documentLoadWorker", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "documentFileUploadWorkerFactory", "Lbo/a$a;", "documentFileDeleteWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "documentSubmitWorker", "Luq/a;", "navigationStateManager", "Lpq/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "permissionRequestWorker", "Lku/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Landroidx/lifecycle/l0;Lk6/s;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/document/a;Lcom/withpersona/sdk2/inquiry/document/i$b;Lcom/withpersona/sdk2/inquiry/document/network/a$a;Lcom/withpersona/sdk2/inquiry/document/network/e$a;Lcom/withpersona/sdk2/inquiry/document/network/c$a;Lbo/a$a;Lcom/withpersona/sdk2/inquiry/document/network/g$a;Luq/a;Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;Lku/p0;)V", "renderProps", "renderState", "", "l0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V", "Lvr/f;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "event", "S0", "(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "b0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "c0", "(Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "T0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "U0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V", "props", "k0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "e", "Landroidx/lifecycle/l0;", "f", "Lk6/s;", "g", "Landroid/content/Context;", "h", "Lcom/withpersona/sdk2/inquiry/document/a;", "i", "Lcom/withpersona/sdk2/inquiry/document/i$b;", "j", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "k", "Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "l", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "m", "Lbo/a$a;", "n", "Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "o", "Luq/a;", "p", "Lpq/c;", "q", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "r", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "c", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends vr.c<DocumentWorkflow.Input, DocumentWorkflow.State, DocumentWorkflow.b, DocumentWorkflow.c> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s imageLoader;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.document.a documentCameraWorker;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i.b documentsSelectWorkerFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.document.network.a.C0179a documentCreateWorkerFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.document.network.e.a documentLoadWorker;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.document.network.c.a documentFileUploadWorkerFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final bo.a.C0086a documentFileDeleteWorkerFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g.a documentSubmitWorker;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uq.a navigationStateManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pq.c externalEventLogger;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a permissionRequestWorker;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$1$1", f = "DocumentStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10411t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ DocumentWorkflow.State f10413v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DocumentWorkflow.State state, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f10413v = state;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return b.this.new a(this.f10413v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f10411t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            b bVar = b.this;
            bVar.l0(bVar.b().getValue(), this.f10413v);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$2", f = "DocumentStepStateManager.kt", l = {97}, m = "invokeSuspend")
    public static final class C0190b extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10414t;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.b$b$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements nu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f10416a;

            public a(b bVar) {
                this.f10416a = bVar;
            }

            @Override // nu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(DocumentWorkflow.Input input, nt.b<? super Unit> bVar) {
                b bVar2 = this.f10416a;
                DocumentWorkflow.State state = (DocumentWorkflow.State) bVar2.d().i();
                if (state == null) {
                    return Unit.f22483a;
                }
                bVar2.l0(input, state);
                return Unit.f22483a;
            }
        }

        public C0190b(nt.b<? super C0190b> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return b.this.new C0190b(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f10414t;
            if (i10 == 0) {
                o.b(obj);
                c0<DocumentWorkflow.Input> c0VarB = b.this.b();
                a aVar = new a(b.this);
                this.f10414t = 1;
                if (c0VarB.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            throw new jt.d();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((C0190b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/b$c;", "", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/document/step/b;", "a", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/document/step/b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        @NotNull
        b a(@NotNull DocumentWorkflow.Input initialProps, @NotNull l0 savedStateHandle);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10417a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[j1.values().length];
            try {
                iArr[j1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j1.PermissionRejected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j1.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10417a = iArr;
            int[] iArr2 = new int[DocumentWorkflow.State.a.values().length];
            try {
                iArr2[DocumentWorkflow.State.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DocumentWorkflow.State.a.CheckCameraPermissions.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DocumentWorkflow.State.a.CameraRunning.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DocumentWorkflow.State.a.SelectFileFromDocuments.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DocumentWorkflow.State.a.SelectImageFromPhotoLibrary.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$handleState$screen$14", f = "DocumentStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class e extends m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10418t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f10420v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, nt.b<? super e> bVar) {
            super(1, bVar);
            this.f10420v = str;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return b.this.new e(this.f10420v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f10418t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            WorkflowState workflowStateI = b.this.d().i();
            DocumentWorkflow.State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = workflowStateI instanceof DocumentWorkflow.State.ReviewCapturesWithoutDocumentId ? (DocumentWorkflow.State.ReviewCapturesWithoutDocumentId) workflowStateI : null;
            if (reviewCapturesWithoutDocumentId == null) {
                return Unit.f22483a;
            }
            DocumentWorkflow.State.a aVar = null;
            b.this.d().p(new DocumentWorkflow.State.ReviewCaptures(reviewCapturesWithoutDocumentId.m(), this.f10420v, aVar, new DocumentWorkflow.State.UploadState.UploadFiles(this.f10420v), null, false, false, reviewCapturesWithoutDocumentId.getError(), 116, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$run$4", f = "DocumentStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class f extends m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10421t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ DocumentWorkflow.State.UploadState f10423v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(DocumentWorkflow.State.UploadState uploadState, nt.b<? super f> bVar) {
            super(1, bVar);
            this.f10423v = uploadState;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return b.this.new f(this.f10423v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f10421t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            DocumentWorkflow.State state = (DocumentWorkflow.State) b.this.d().i();
            if (state == null) {
                return Unit.f22483a;
            }
            b.this.d().p(DocumentWorkflow.State.i(state, new DocumentWorkflow.State.UploadState.ReadyToSubmit(((DocumentWorkflow.State.UploadState.UploadFiles) this.f10423v).getDocumentId()), null, null, null, 14, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull DocumentWorkflow.Input initialProps, @NotNull l0 savedStateHandle, @NotNull s imageLoader, @NotNull Context applicationContext, @NotNull com.withpersona.sdk2.inquiry.document.a documentCameraWorker, @NotNull i.b documentsSelectWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.document.network.a.C0179a documentCreateWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.document.network.e.a documentLoadWorker, @NotNull com.withpersona.sdk2.inquiry.document.network.c.a documentFileUploadWorkerFactory, @NotNull bo.a.C0086a documentFileDeleteWorkerFactory, @NotNull g.a documentSubmitWorker, @NotNull uq.a navigationStateManager, @NotNull pq.c externalEventLogger, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a permissionRequestWorker, @NotNull final p0 coroutineScope) {
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
        if (d().i() == null) {
            d().p(k0(b().getValue()));
        }
        d().o(new Function1() { // from class: co.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.step.b.Z(coroutineScope, this, (DocumentWorkflow.State) obj);
            }
        });
        k.d(coroutineScope, g1.d(), null, new C0190b(null), 2, null);
    }

    public static final Unit A0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.e.f10081a);
        return Unit.f22483a;
    }

    public static final Unit B0(DocumentFile.Remote it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f22483a;
    }

    public static final Unit C0() {
        return Unit.f22483a;
    }

    public static final Unit D0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10078a);
        return Unit.f22483a;
    }

    public static final Unit E0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.C0164a.f10077a);
        return Unit.f22483a;
    }

    public static final Unit F0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.d.f10080a);
        return Unit.f22483a;
    }

    public static final Unit G0(b bVar, g.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, g.b.C0189b.f10357a)) {
            bVar.e(DocumentWorkflow.b.d.f10090a);
        } else {
            if (!(it instanceof g.b.Error)) {
                throw new l();
            }
            bVar.e(new DocumentWorkflow.b.Errored(((g.b.Error) it).getCause()));
        }
        return Unit.f22483a;
    }

    public static final Unit H0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10078a);
        return Unit.f22483a;
    }

    public static final Unit I0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.c.f10079a);
        return Unit.f22483a;
    }

    public static final Unit J0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10078a);
        return Unit.f22483a;
    }

    public static final Unit K0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10078a);
        return Unit.f22483a;
    }

    public static final Unit L0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10078a);
        return Unit.f22483a;
    }

    public static final Unit M0(b bVar, DocumentWorkflow.State state, com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = d.f10417a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            com.withpersona.sdk2.inquiry.document.a aVar = bVar.documentCameraWorker;
            String string = bVar.applicationContext.getString(vp.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            bVar.d().p(aVar.e(string) ? state.a(DocumentWorkflow.State.a.CameraRunning) : state.a(DocumentWorkflow.State.a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new l();
            }
            bVar.d().p(state.a(DocumentWorkflow.State.a.None));
        }
        return Unit.f22483a;
    }

    public static final Unit N0(b bVar, com.withpersona.sdk2.inquiry.document.network.e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WorkflowState workflowStateI = bVar.d().i();
        DocumentWorkflow.State.ReviewCaptures reviewCaptures = workflowStateI instanceof DocumentWorkflow.State.ReviewCaptures ? (DocumentWorkflow.State.ReviewCaptures) workflowStateI : null;
        if (reviewCaptures == null) {
            return Unit.f22483a;
        }
        if (it instanceof com.withpersona.sdk2.inquiry.document.network.e.b.C0188b) {
            vr.f<DocumentWorkflow.State> fVarD = bVar.d();
            DocumentWorkflow.State.UploadState.ReadyToSubmit readyToSubmit = new DocumentWorkflow.State.UploadState.ReadyToSubmit(reviewCaptures.getDocumentId());
            List<DocumentFile> listA = ((com.withpersona.sdk2.inquiry.document.network.e.b.C0188b) it).a();
            List<DocumentFile> listM = reviewCaptures.m();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM) {
                if (obj instanceof DocumentFile.Local) {
                    arrayList.add(obj);
                }
            }
            fVarD.p(DocumentWorkflow.State.ReviewCaptures.p(reviewCaptures, CollectionsKt.w0(listA, arrayList), null, null, readyToSubmit, null, false, false, null, 214, null));
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.document.network.e.b.a)) {
                throw new l();
            }
            bVar.e(new DocumentWorkflow.b.Errored(((com.withpersona.sdk2.inquiry.document.network.e.b.a) it).getCause()));
        }
        return Unit.f22483a;
    }

    public static final Unit O0(b bVar, DocumentWorkflow.State state, com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = d.f10417a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            com.withpersona.sdk2.inquiry.document.a aVar = bVar.documentCameraWorker;
            String string = bVar.applicationContext.getString(vp.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            bVar.d().p(aVar.e(string) ? state.a(DocumentWorkflow.State.a.CameraRunning) : state.a(DocumentWorkflow.State.a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new l();
            }
            bVar.d().p(state.a(DocumentWorkflow.State.a.None));
        }
        return Unit.f22483a;
    }

    public static final Unit P0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.c.f10079a);
        return Unit.f22483a;
    }

    public static final Unit Q0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.g.f10083a);
        return Unit.f22483a;
    }

    public static final Unit R0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.h.f10084a);
        return Unit.f22483a;
    }

    public static final Unit V0(b bVar, DocumentWorkflow.Input input, com.withpersona.sdk2.inquiry.document.a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DocumentWorkflow.State state = (DocumentWorkflow.State) bVar.d().i();
        if (state == null) {
            return Unit.f22483a;
        }
        if (it instanceof com.withpersona.sdk2.inquiry.document.a.b.C0169b) {
            vr.f<DocumentWorkflow.State> fVarD = bVar.d();
            DocumentWorkflow.State.UploadState uploadState = state.getUploadState();
            DocumentWorkflow.State.a aVar = null;
            DocumentFile documentFile = null;
            boolean z10 = false;
            boolean z11 = false;
            String str = null;
            fVarD.p(new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.x0(state.m(), new DocumentFile.Local(((com.withpersona.sdk2.inquiry.document.a.b.C0169b) it).getAbsoluteFilePath(), CaptureMethod.MANUAL, 0, 4, null)), input.getDocumentFileLimit()), state.getDocumentId(), aVar, uploadState, documentFile, z10, z11, str, 244, null));
        } else {
            if (!Intrinsics.c(it, com.withpersona.sdk2.inquiry.document.a.b.C0168a.f10147a)) {
                throw new l();
            }
            bVar.d().p(state.a(DocumentWorkflow.State.a.None));
        }
        return Unit.f22483a;
    }

    public static final Unit W0(b bVar, DocumentWorkflow.Input input, DocumentWorkflow.State state, i.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DocumentWorkflow.State state2 = (DocumentWorkflow.State) bVar.d().i();
        if (state2 == null) {
            return Unit.f22483a;
        }
        if (it instanceof i.c.Success) {
            DocumentWorkflow.State.a aVar = null;
            bVar.d().p(new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.w0(state2.m(), com.withpersona.sdk2.inquiry.document.g.b(((i.c.Success) it).a())), input.getDocumentFileLimit()), state2.getDocumentId(), aVar, state2.getUploadState(), null, false, false, null, 244, null));
        } else if (it instanceof i.c.Failure) {
            DocumentWorkflow.State.a aVar2 = null;
            bVar.d().p(new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.w0(state2.m(), com.withpersona.sdk2.inquiry.document.g.b(((i.c.Failure) it).a())), input.getDocumentFileLimit()), state2.getDocumentId(), aVar2, state2.getUploadState(), null, false, false, bVar.applicationContext.getString(vp.g.f33398m), 116, null));
        } else {
            if (!Intrinsics.c(it, i.c.a.f10218a)) {
                throw new l();
            }
            bVar.d().p(state.a(DocumentWorkflow.State.a.None));
        }
        return Unit.f22483a;
    }

    public static final Unit X0(b bVar, com.withpersona.sdk2.inquiry.document.network.a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DocumentWorkflow.State state = (DocumentWorkflow.State) bVar.d().i();
        if (state == null) {
            return Unit.f22483a;
        }
        if (it instanceof com.withpersona.sdk2.inquiry.document.network.a.b.C0181b) {
            com.withpersona.sdk2.inquiry.document.network.a.b.C0181b c0181b = (com.withpersona.sdk2.inquiry.document.network.a.b.C0181b) it;
            bVar.d().p(DocumentWorkflow.State.i(state, new DocumentWorkflow.State.UploadState.ReadyToSubmit(c0181b.getDocumentId()), c0181b.getDocumentId(), null, null, 12, null));
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.document.network.a.b.Error)) {
                throw new l();
            }
            com.withpersona.sdk2.inquiry.document.network.a.b.Error error = (com.withpersona.sdk2.inquiry.document.network.a.b.Error) it;
            if (!error.getCause().isRecoverable()) {
                bVar.e(new DocumentWorkflow.b.Errored(error.getCause()));
            }
        }
        return Unit.f22483a;
    }

    public static final Unit Y0(b bVar, DocumentWorkflow.State.UploadState uploadState, DocumentFile.Local local, DocumentWorkflow.Input input, Object obj) {
        DocumentWorkflow.State.UploadState uploadFiles;
        DocumentWorkflow.State.UploadState readyToSubmit;
        DocumentWorkflow.State state = (DocumentWorkflow.State) bVar.d().i();
        if (state == null) {
            return Unit.f22483a;
        }
        if (obj instanceof com.withpersona.sdk2.inquiry.document.network.c.b.d) {
            List<DocumentFile> listM = state.m();
            ArrayList arrayList = new ArrayList(q.u(listM, 10));
            for (Parcelable parcelableA : listM) {
                com.withpersona.sdk2.inquiry.document.network.c.b.d dVar = (com.withpersona.sdk2.inquiry.document.network.c.b.d) obj;
                if (Intrinsics.c(parcelableA, dVar.getOldLocalDocument())) {
                    parcelableA = dVar.getNewRemoteDocument();
                }
                arrayList.add(parcelableA);
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
            bVar.d().p(DocumentWorkflow.State.i(state, readyToSubmit, null, arrayList, null, 10, null));
        } else if (obj instanceof com.withpersona.sdk2.inquiry.document.network.c.b.C0183c) {
            List<DocumentFile> listM2 = state.m();
            ArrayList arrayList2 = new ArrayList(q.u(listM2, 10));
            for (Parcelable parcelableF : listM2) {
                if ((parcelableF instanceof DocumentFile.Local) && Intrinsics.c(parcelableF, local)) {
                    parcelableF = DocumentFile.Local.f((DocumentFile.Local) parcelableF, null, null, ((com.withpersona.sdk2.inquiry.document.network.c.b.C0183c) obj).getProgressPercentage(), 3, null);
                }
                arrayList2.add(parcelableF);
            }
            bVar.d().p(DocumentWorkflow.State.i(state, state.getUploadState(), null, arrayList2, null, 10, null));
        } else if (obj instanceof com.withpersona.sdk2.inquiry.document.network.c.b.a) {
            List listV0 = CollectionsKt.v0(state.m(), local);
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
            com.withpersona.sdk2.inquiry.document.network.c.b.a aVar = (com.withpersona.sdk2.inquiry.document.network.c.b.a) obj;
            DocumentFile documentFile = null;
            bVar.d().p(new DocumentWorkflow.State.ReviewCaptures(listV0, ((DocumentWorkflow.State.UploadState.UploadFiles) uploadState).getDocumentId(), DocumentWorkflow.State.a.None, uploadState2, documentFile, aVar.getCause() instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError, false, com.withpersona.sdk2.inquiry.document.g.c(aVar.getCause(), bVar.applicationContext, input), 80, null));
        } else if (obj instanceof com.withpersona.sdk2.inquiry.document.network.c.b.C0182b) {
            bVar.e(new DocumentWorkflow.b.Errored(((com.withpersona.sdk2.inquiry.document.network.c.b.C0182b) obj).getCause()));
        }
        return Unit.f22483a;
    }

    public static final Unit Z(p0 p0Var, b bVar, DocumentWorkflow.State state) {
        if (state == null) {
            return Unit.f22483a;
        }
        k.d(p0Var, g1.d(), null, bVar.new a(state, null), 2, null);
        return Unit.f22483a;
    }

    public static final Unit Z0(b bVar, DocumentFile.Remote remote, DocumentWorkflow.State.UploadState uploadState, bo.a.b response) {
        DocumentWorkflow.State.UploadState uploadFiles;
        Intrinsics.checkNotNullParameter(response, "response");
        WorkflowState workflowStateI = bVar.d().i();
        DocumentWorkflow.State.ReviewCaptures reviewCaptures = workflowStateI instanceof DocumentWorkflow.State.ReviewCaptures ? (DocumentWorkflow.State.ReviewCaptures) workflowStateI : null;
        if (reviewCaptures == null) {
            return Unit.f22483a;
        }
        List listV0 = CollectionsKt.v0(reviewCaptures.m(), remote);
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
        if (response instanceof bo.a.b.C0088b) {
            bVar.d().p(DocumentWorkflow.State.ReviewCaptures.p(reviewCaptures, listV0, null, null, uploadState2, null, false, false, null, 230, null));
        } else {
            if (!(response instanceof bo.a.b.Error)) {
                throw new l();
            }
            bVar.e(new DocumentWorkflow.b.Errored(((bo.a.b.Error) response).getCause()));
        }
        return Unit.f22483a;
    }

    public static final Unit d0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.g.f10083a);
        return Unit.f22483a;
    }

    public static final Unit e0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.h.f10084a);
        return Unit.f22483a;
    }

    public static final Unit f0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.j.f10086a);
        return Unit.f22483a;
    }

    public static final Unit g0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.e.f10081a);
        return Unit.f22483a;
    }

    public static final Unit h0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.g.f10083a);
        return Unit.f22483a;
    }

    public static final Unit i0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.h.f10084a);
        return Unit.f22483a;
    }

    public static final Unit j0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.j.f10086a);
        return Unit.f22483a;
    }

    public static final Unit m0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.C0164a.f10077a);
        return Unit.f22483a;
    }

    public static final Unit n0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.j.f10086a);
        return Unit.f22483a;
    }

    public static final Unit o0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.e.f10081a);
        return Unit.f22483a;
    }

    public static final Unit p0(b bVar, DocumentWorkflow.State state, DocumentFile.Remote document) {
        Intrinsics.checkNotNullParameter(document, "document");
        bVar.S0(bVar.d(), new DocumentWorkflow.a.RemoveDocument(((DocumentWorkflow.State.ReviewCaptures) state).getDocumentId(), document));
        return Unit.f22483a;
    }

    public static final Unit q0(b bVar, DocumentWorkflow.State state) {
        bVar.S0(bVar.d(), new DocumentWorkflow.a.Submit(((DocumentWorkflow.State.ReviewCaptures) state).getDocumentId()));
        return Unit.f22483a;
    }

    public static final Unit r0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10078a);
        return Unit.f22483a;
    }

    public static final Unit s0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.C0164a.f10077a);
        return Unit.f22483a;
    }

    public static final Unit t0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.d.f10080a);
        return Unit.f22483a;
    }

    public static final Unit u0(b bVar, DocumentWorkflow.State state, com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = d.f10417a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            com.withpersona.sdk2.inquiry.document.a aVar = bVar.documentCameraWorker;
            String string = bVar.applicationContext.getString(vp.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            bVar.d().p(aVar.e(string) ? state.a(DocumentWorkflow.State.a.CameraRunning) : state.a(DocumentWorkflow.State.a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new l();
            }
            bVar.d().p(state.a(DocumentWorkflow.State.a.None));
        }
        return Unit.f22483a;
    }

    public static final Unit v0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.c.f10079a);
        return Unit.f22483a;
    }

    public static final Unit w0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.g.f10083a);
        return Unit.f22483a;
    }

    public static final Unit x0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10078a);
        return Unit.f22483a;
    }

    public static final Unit y0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.h.f10084a);
        return Unit.f22483a;
    }

    public static final Unit z0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.j.f10086a);
        return Unit.f22483a;
    }

    public final void S0(vr.f<DocumentWorkflow.State> fVar, DocumentWorkflow.a aVar) {
        DocumentWorkflow.State state = (DocumentWorkflow.State) fVar.i();
        if (state == null) {
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.b.f10078a)) {
            e(DocumentWorkflow.b.C0165b.f10088a);
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.C0164a.f10077a)) {
            e(DocumentWorkflow.b.a.f10087a);
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.g.f10083a)) {
            fVar.p(state.a(DocumentWorkflow.State.a.SelectFileFromDocuments).f(false));
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.h.f10084a)) {
            fVar.p(state.a(DocumentWorkflow.State.a.SelectImageFromPhotoLibrary).f(false));
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.j.f10086a)) {
            fVar.p(state.a(DocumentWorkflow.State.a.CheckCameraPermissions).f(false));
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.e.f10081a)) {
            fVar.p(state.f(true));
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.c.f10079a)) {
            fVar.p(state.f(false));
            return;
        }
        if (aVar instanceof DocumentWorkflow.a.RemoveDocument) {
            if (state instanceof DocumentWorkflow.State.ReviewCaptures) {
                DocumentWorkflow.a.RemoveDocument removeDocument = (DocumentWorkflow.a.RemoveDocument) aVar;
                fVar.p(DocumentWorkflow.State.i(state, new DocumentWorkflow.State.UploadState.DeleteFiles(removeDocument.getDocumentId()), null, null, removeDocument.getDocument(), 6, null));
                return;
            }
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.d.f10080a)) {
            if (state instanceof DocumentWorkflow.State.ReviewCaptures) {
                fVar.p(DocumentWorkflow.State.ReviewCaptures.p((DocumentWorkflow.State.ReviewCaptures) state, null, null, null, null, null, false, false, null, 127, null));
            }
        } else {
            if (!(aVar instanceof DocumentWorkflow.a.Submit)) {
                throw new l();
            }
            DocumentWorkflow.a.Submit submit = (DocumentWorkflow.a.Submit) aVar;
            fVar.p(new DocumentWorkflow.State.UploadDocument(state.m(), submit.getDocumentId(), new DocumentWorkflow.State.UploadState.ReadyToSubmit(submit.getDocumentId()), null, 8, null));
        }
    }

    public final void T0(DocumentWorkflow.State.a aVar, final DocumentWorkflow.Input input, final DocumentWorkflow.State state) {
        int i10 = d.b[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return;
        }
        if (i10 == 3) {
            d().n(this.documentCameraWorker, new Function1() { // from class: co.n0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.document.step.b.V0(this.f4993a, input, (com.withpersona.sdk2.inquiry.document.a.b) obj);
                }
            });
        } else {
            if (i10 != 4 && i10 != 5) {
                throw new l();
            }
            d().n(state.getCaptureState() == DocumentWorkflow.State.a.SelectFileFromDocuments ? this.documentsSelectWorkerFactory.c() : this.documentsSelectWorkerFactory.e(), new Function1() { // from class: co.o0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.document.step.b.W0(this.f4995a, input, state, (com.withpersona.sdk2.inquiry.document.i.c) obj);
                }
            });
        }
    }

    public final void U0(final DocumentWorkflow.State.UploadState uploadState, final DocumentWorkflow.Input input, DocumentWorkflow.State state) {
        if (Intrinsics.c(uploadState, DocumentWorkflow.State.UploadState.CreateDocument.f10067a)) {
            if (state.getDocumentId() != null) {
                return;
            }
            d().n(this.documentCreateWorkerFactory.a(input.getSessionToken(), input.getKind(), input.getFieldKeyDocument(), input.getDocumentFileLimit()), new Function1() { // from class: co.p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.document.step.b.X0(this.f4997a, (com.withpersona.sdk2.inquiry.document.network.a.b) obj);
                }
            });
            return;
        }
        if (!(uploadState instanceof DocumentWorkflow.State.UploadState.UploadFiles)) {
            if (!(uploadState instanceof DocumentWorkflow.State.UploadState.DeleteFiles)) {
                if (!(uploadState instanceof DocumentWorkflow.State.UploadState.ReadyToSubmit)) {
                    throw new l();
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
                    d().n(this.documentFileDeleteWorkerFactory.a(input.getSessionToken(), reviewCaptures.getDocumentId(), remote), new Function1() { // from class: co.s0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return com.withpersona.sdk2.inquiry.document.step.b.Z0(this.f5004a, remote, uploadState, (bo.a.b) obj);
                        }
                    });
                    return;
                }
                return;
            }
        }
        List<DocumentFile> listM = state.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (obj instanceof DocumentFile.Local) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            d().m("upload_complete", new f(uploadState, null));
            return;
        }
        for (final DocumentFile.Local local : CollectionsKt.H0(arrayList, 3)) {
            vr.f<DocumentWorkflow.State> fVarD = d();
            com.withpersona.sdk2.inquiry.document.network.c.a aVar = this.documentFileUploadWorkerFactory;
            String sessionToken = input.getSessionToken();
            String documentId = ((DocumentWorkflow.State.UploadState.UploadFiles) uploadState).getDocumentId();
            boolean z10 = true;
            if (input.getDocumentFileLimit() != 1) {
                z10 = false;
            }
            fVarD.n(vr.g.a(aVar.a(sessionToken, documentId, local, z10), local.getAbsoluteFilePath()), new Function1() { // from class: co.r0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return com.withpersona.sdk2.inquiry.document.step.b.Y0(this.f5000a, uploadState, local, input, obj2);
                }
            });
        }
    }

    public final List<Pair<String, Function1<UiComponent, Unit>>> b0(DocumentStartPage documentStartPage) {
        return new NestedUiStep.a().a(documentStartPage.getSelectDocumentButton(), new Function1() { // from class: co.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.step.b.d0(this.f4985a, (UiComponent) obj);
            }
        }).a(documentStartPage.getSelectPhotoButton(), new Function1() { // from class: co.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.step.b.e0(this.f4987a, (UiComponent) obj);
            }
        }).a(documentStartPage.getTakePhotoButton(), new Function1() { // from class: co.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.step.b.f0(this.f4989a, (UiComponent) obj);
            }
        }).a(documentStartPage.getLaunchUploadOptionsButton(), new Function1() { // from class: co.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.step.b.g0(this.f4991a, (UiComponent) obj);
            }
        }).b();
    }

    public final List<Pair<String, Function1<UiComponent, Unit>>> c0(UploadOptionsDialog uploadOptionsDialog) {
        return new NestedUiStep.a().a(uploadOptionsDialog.getSelectDocumentButton(), new Function1() { // from class: co.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.step.b.h0(this.f5007a, (UiComponent) obj);
            }
        }).a(uploadOptionsDialog.getSelectPhotoButton(), new Function1() { // from class: co.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.step.b.i0(this.f5009a, (UiComponent) obj);
            }
        }).a(uploadOptionsDialog.getTakePhotoButton(), new Function1() { // from class: co.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.step.b.j0(this.f5011a, (UiComponent) obj);
            }
        }).b();
    }

    @NotNull
    public final DocumentWorkflow.State k0(@NotNull DocumentWorkflow.Input props) {
        Intrinsics.checkNotNullParameter(props, "props");
        DocumentWorkflow.StartPage startPage = props.getStartPage();
        if (Intrinsics.c(startPage, DocumentWorkflow.StartPage.Prompt.f10038a)) {
            return new DocumentWorkflow.State.Start(null, null, props.getDocumentId(), false, 11, null);
        }
        if (!(startPage instanceof DocumentWorkflow.StartPage.Review)) {
            throw new l();
        }
        return new DocumentWorkflow.State.ReviewCaptures(p.k(), ((DocumentWorkflow.StartPage.Review) props.getStartPage()).getDocumentId(), null, null, null, true, false, null, 220, null);
    }

    public final void l0(DocumentWorkflow.Input renderProps, final DocumentWorkflow.State renderState) {
        DocumentWorkflow.c bVar;
        uq.a.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !(renderState instanceof DocumentWorkflow.State.UploadDocument), false, 8, null);
        T0(renderState.getCaptureState(), renderProps, renderState);
        U0(renderState.getUploadState(), renderProps, renderState);
        com.withpersona.sdk2.inquiry.document.g.a(this.externalEventLogger, this.trackingEventsLogger, renderProps, renderState);
        if (renderState instanceof DocumentWorkflow.State.Start) {
            DocumentWorkflow.State.Start start = (DocumentWorkflow.State.Start) renderState;
            bVar = new com.withpersona.sdk2.inquiry.document.b(ar.b.a(renderProps.getPages().getDocumentStartPage()), b0(renderProps.getPages().getDocumentStartPage()), this.navigationStateManager.b(), new Function0() { // from class: co.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.m0(this.f5008a);
                }
            }, new Function0() { // from class: co.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.x0(this.f4990a);
                }
            }, start.getShouldShowUploadOptionsDialog() ? ar.s.f3757a.j(ar.b.a(renderProps.getPages().getUploadOptionsDialog()), c0(renderProps.getPages().getUploadOptionsDialog()), new Function0() { // from class: co.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.I0(this.f5016a);
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()) : null, renderProps.getPromptPageNavBarTitle(), renderProps.getStyles());
            if (start.getCaptureState() == DocumentWorkflow.State.a.CheckCameraPermissions) {
                vr.f<DocumentWorkflow.State> fVarD = d();
                com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a aVar = this.permissionRequestWorker;
                i0 i0Var = i0.Camera;
                String permissionsTitle = renderProps.getPermissionsTitle();
                String str = permissionsTitle == null ? "" : permissionsTitle;
                String permissionsRationale = renderProps.getPermissionsRationale();
                if (permissionsRationale == null) {
                    permissionsRationale = this.applicationContext.getString(vp.g.f33391f);
                    Intrinsics.checkNotNullExpressionValue(permissionsRationale, "getString(...)");
                }
                String str2 = permissionsRationale;
                Context context = this.applicationContext;
                String string = context.getString(vp.g.f33390e, jq.g.b(context));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                fVarD.n(aVar.a(new PermissionRequestWorkflow.Props(i0Var, false, str, str2, string, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: co.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.document.step.b.M0(this.f4959a, renderState, (com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b) obj);
                    }
                });
            }
        } else if (renderState instanceof DocumentWorkflow.State.ReviewCaptures) {
            DocumentWorkflow.State.ReviewCaptures reviewCaptures = (DocumentWorkflow.State.ReviewCaptures) renderState;
            if (reviewCaptures.getShouldLoadDocuments()) {
                d().n(this.documentLoadWorker.a(renderProps.getSessionToken(), reviewCaptures.getDocumentId()), new Function1() { // from class: co.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.document.step.b.N0(this.f4962a, (com.withpersona.sdk2.inquiry.document.network.e.b) obj);
                    }
                });
            }
            if (reviewCaptures.getCaptureState() == DocumentWorkflow.State.a.CheckCameraPermissions) {
                vr.f<DocumentWorkflow.State> fVarD2 = d();
                com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a aVar2 = this.permissionRequestWorker;
                i0 i0Var2 = i0.Camera;
                String permissionsTitle2 = renderProps.getPermissionsTitle();
                String str3 = permissionsTitle2 == null ? "" : permissionsTitle2;
                String permissionsRationale2 = renderProps.getPermissionsRationale();
                if (permissionsRationale2 == null) {
                    permissionsRationale2 = this.applicationContext.getString(vp.g.f33391f);
                    Intrinsics.checkNotNullExpressionValue(permissionsRationale2, "getString(...)");
                }
                String str4 = permissionsRationale2;
                Context context2 = this.applicationContext;
                String string2 = context2.getString(vp.g.f33390e, jq.g.b(context2));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                fVarD2.n(aVar2.a(new PermissionRequestWorkflow.Props(i0Var2, false, str3, str4, string2, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: co.d0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.document.step.b.O0(this.f4976a, renderState, (com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b) obj);
                    }
                });
            }
            bVar = new DocumentWorkflow.c.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCaptures.m(), this.navigationStateManager.b(), new Function0() { // from class: co.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.Q0(this.f4980a);
                }
            }, new Function0() { // from class: co.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.R0(this.f4982a);
                }
            }, new Function0() { // from class: co.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.n0(this.f4983a);
                }
            }, new Function0() { // from class: co.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.o0(this.f4978a);
                }
            }, new Function1() { // from class: co.q0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.document.step.b.p0(this.f4998a, renderState, (DocumentFile.Remote) obj);
                }
            }, new Function0() { // from class: co.w0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.q0(this.f5013a, renderState);
                }
            }, new Function0() { // from class: co.x0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.r0(this.f5015a);
                }
            }, new Function0() { // from class: co.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.s0(this.f5017a);
                }
            }, reviewCaptures.getShouldLoadDocuments(), reviewCaptures.m().size() < renderProps.getDocumentFileLimit(), !reviewCaptures.m().isEmpty() && Intrinsics.c(reviewCaptures.getUploadState(), new DocumentWorkflow.State.UploadState.ReadyToSubmit(reviewCaptures.getDocumentId())), reviewCaptures.getError(), new Function0() { // from class: co.z0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.t0(this.f5019a);
                }
            }, renderProps.getStyles(), renderProps.getCheckPageNavBarTitle(), reviewCaptures.getShouldShowUploadOptionsDialog() ? ar.s.f3757a.j(ar.b.a(renderProps.getPages().getUploadOptionsDialog()), c0(renderProps.getPages().getUploadOptionsDialog()), new Function0() { // from class: co.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.P0(this.f4977a);
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()) : null);
        } else if (renderState instanceof DocumentWorkflow.State.ReviewCapturesWithoutDocumentId) {
            DocumentWorkflow.State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (DocumentWorkflow.State.ReviewCapturesWithoutDocumentId) renderState;
            String documentId = reviewCapturesWithoutDocumentId.getDocumentId();
            if (documentId != null) {
                d().m(documentId, new e(documentId, null));
            }
            if (reviewCapturesWithoutDocumentId.getCaptureState() == DocumentWorkflow.State.a.CheckCameraPermissions) {
                vr.f<DocumentWorkflow.State> fVarD3 = d();
                com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a aVar3 = this.permissionRequestWorker;
                i0 i0Var3 = i0.Camera;
                String permissionsTitle3 = renderProps.getPermissionsTitle();
                String str5 = permissionsTitle3 == null ? "" : permissionsTitle3;
                String permissionsRationale3 = renderProps.getPermissionsRationale();
                if (permissionsRationale3 == null) {
                    permissionsRationale3 = this.applicationContext.getString(vp.g.f33391f);
                    Intrinsics.checkNotNullExpressionValue(permissionsRationale3, "getString(...)");
                }
                String str6 = permissionsRationale3;
                Context context3 = this.applicationContext;
                String string3 = context3.getString(vp.g.f33390e, jq.g.b(context3));
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                fVarD3.n(aVar3.a(new PermissionRequestWorkflow.Props(i0Var3, false, str5, str6, string3, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: co.a1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.document.step.b.u0(this.f4958a, renderState, (com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b) obj);
                    }
                });
            }
            bVar = new DocumentWorkflow.c.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCapturesWithoutDocumentId.m(), this.navigationStateManager.b(), new Function0() { // from class: co.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.w0(this.f4986a);
                }
            }, new Function0() { // from class: co.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.y0(this.f4988a);
                }
            }, new Function0() { // from class: co.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.z0(this.f4992a);
                }
            }, new Function0() { // from class: co.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.A0(this.f4994a);
                }
            }, new Function1() { // from class: co.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.document.step.b.B0((DocumentFile.Remote) obj);
                }
            }, new Function0() { // from class: co.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.C0();
                }
            }, new Function0() { // from class: co.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.D0(this.f4999a);
                }
            }, new Function0() { // from class: co.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.E0(this.f5003a);
                }
            }, reviewCapturesWithoutDocumentId.getReloadingFromPreviousSession(), reviewCapturesWithoutDocumentId.m().size() < renderProps.getDocumentFileLimit(), false, reviewCapturesWithoutDocumentId.getError(), new Function0() { // from class: co.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.F0(this.f5006a);
                }
            }, renderProps.getStyles(), renderProps.getCheckPageNavBarTitle(), reviewCapturesWithoutDocumentId.getShouldShowUploadOptionsDialog() ? ar.s.f3757a.j(ar.b.a(renderProps.getPages().getUploadOptionsDialog()), c0(renderProps.getPages().getUploadOptionsDialog()), new Function0() { // from class: co.b1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.v0(this.f4960a);
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()) : null);
        } else {
            if (!(renderState instanceof DocumentWorkflow.State.UploadDocument)) {
                throw new l();
            }
            d().n(this.documentSubmitWorker.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), ((DocumentWorkflow.State.UploadDocument) renderState).m()), new Function1() { // from class: co.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.document.step.b.G0(this.f5010a, (com.withpersona.sdk2.inquiry.document.network.g.b) obj);
                }
            });
            uq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
            CustomPendingPage customPendingPage = renderProps.getCustomPendingPage();
            bVar = customPendingPage != null ? new DocumentWorkflow.c.b(ar.b.a(customPendingPage), this.navigationStateManager.b(), renderProps.getStyles(), new Function0() { // from class: co.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.H0(this.f5012a);
                }
            }, new Function0() { // from class: co.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.J0(this.f5014a);
                }
            }, renderProps.getPendingPageNavBarTitle(), null, 64, null) : new DocumentWorkflow.c.LoadingAnimation(renderProps.getPendingTitle(), renderProps.getPendingDescription(), this.navigationStateManager.b(), new Function0() { // from class: co.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.K0(this.f5018a);
                }
            }, new Function0() { // from class: co.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.L0(this.f4957a);
                }
            }, renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), renderProps.getPendingPageTextVerticalPosition(), renderProps.getPendingPageNavBarTitle(), null, Barcode.FORMAT_UPC_A, null);
        }
        c().setValue(bVar);
    }
}
