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
import gt.l;
import gt.o;
import iu.g1;
import iu.k;
import iu.p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import lu.c0;
import nt.m;
import org.jetbrains.annotations.NotNull;
import pp.i0;
import pp.j1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001aB\u008f\u0001\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\u00020)*\b\u0012\u0004\u0012\u00020\u00030,2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J1\u00107\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u000204\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020)050302*\u000201H\u0002¢\u0006\u0004\b7\u00108J1\u0010:\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u000204\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020)050302*\u000209H\u0002¢\u0006\u0004\b:\u0010;J#\u0010=\u001a\u00020)*\u00020<2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b=\u0010>J#\u0010@\u001a\u00020)*\u00020?2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0002¢\u0006\u0004\bC\u0010DR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/b;", "Ltr/c;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lk6/s;", "imageLoader", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/document/a;", "documentCameraWorker", "Lcom/withpersona/sdk2/inquiry/document/i$b;", "documentsSelectWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "documentCreateWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "documentLoadWorker", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "documentFileUploadWorkerFactory", "Lzn/a$a;", "documentFileDeleteWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "documentSubmitWorker", "Lsq/a;", "navigationStateManager", "Lnq/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "permissionRequestWorker", "Liu/p0;", "coroutineScope", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Landroidx/lifecycle/l0;Lk6/s;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/document/a;Lcom/withpersona/sdk2/inquiry/document/i$b;Lcom/withpersona/sdk2/inquiry/document/network/a$a;Lcom/withpersona/sdk2/inquiry/document/network/e$a;Lcom/withpersona/sdk2/inquiry/document/network/c$a;Lzn/a$a;Lcom/withpersona/sdk2/inquiry/document/network/g$a;Lsq/a;Lnq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;Liu/p0;)V", "renderProps", "renderState", "", "l0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V", "Ltr/f;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;", "event", "S0", "(Ltr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "b0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "c0", "(Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;", "T0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;", "U0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V", "props", "k0", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;", "e", "Landroidx/lifecycle/l0;", "f", "Lk6/s;", "g", "Landroid/content/Context;", "h", "Lcom/withpersona/sdk2/inquiry/document/a;", "i", "Lcom/withpersona/sdk2/inquiry/document/i$b;", "j", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "k", "Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "l", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "m", "Lzn/a$a;", "n", "Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "o", "Lsq/a;", "p", "Lnq/c;", "q", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "r", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;", "c", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends tr.c<DocumentWorkflow.Input, DocumentWorkflow.State, DocumentWorkflow.b, DocumentWorkflow.c> {

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
    public final com.withpersona.sdk2.inquiry.document.network.a.C0182a documentCreateWorkerFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.document.network.e.a documentLoadWorker;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.document.network.c.a documentFileUploadWorkerFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zn.a.C0693a documentFileDeleteWorkerFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g.a documentSubmitWorker;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nq.c externalEventLogger;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a permissionRequestWorker;

    @nt.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$1$1", f = "DocumentStepStateManager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class a extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10492t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ DocumentWorkflow.State f10494v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DocumentWorkflow.State state, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f10494v = state;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return b.this.new a(this.f10494v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f10492t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            b bVar = b.this;
            bVar.l0(bVar.b().getValue(), this.f10494v);
            return Unit.f22938a;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.b$b, reason: collision with other inner class name */
    @nt.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$2", f = "DocumentStepStateManager.kt", l = {97}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class C0193b extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10495t;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.b$b$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements lu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f10497a;

            public a(b bVar) {
                this.f10497a = bVar;
            }

            @Override // lu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(DocumentWorkflow.Input input, lt.b<? super Unit> bVar) {
                b bVar2 = this.f10497a;
                DocumentWorkflow.State state = (DocumentWorkflow.State) bVar2.d().i();
                if (state == null) {
                    return Unit.f22938a;
                }
                bVar2.l0(input, state);
                return Unit.f22938a;
            }
        }

        public C0193b(lt.b<? super C0193b> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return b.this.new C0193b(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((C0193b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f10495t;
            if (i10 == 0) {
                o.b(obj);
                c0<DocumentWorkflow.Input> c0VarB = b.this.b();
                a aVar = new a(b.this);
                this.f10495t = 1;
                if (c0VarB.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            throw new gt.d();
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
        public static final /* synthetic */ int[] f10498a;
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
            f10498a = iArr;
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

    @nt.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$handleState$screen$14", f = "DocumentStepStateManager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e extends m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10499t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f10501v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, lt.b<? super e> bVar) {
            super(1, bVar);
            this.f10501v = str;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return b.this.new e(this.f10501v, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f10499t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            WorkflowState workflowStateI = b.this.d().i();
            DocumentWorkflow.State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = workflowStateI instanceof DocumentWorkflow.State.ReviewCapturesWithoutDocumentId ? (DocumentWorkflow.State.ReviewCapturesWithoutDocumentId) workflowStateI : null;
            if (reviewCapturesWithoutDocumentId == null) {
                return Unit.f22938a;
            }
            DocumentWorkflow.State.a aVar = null;
            b.this.d().p(new DocumentWorkflow.State.ReviewCaptures(reviewCapturesWithoutDocumentId.m(), this.f10501v, aVar, new DocumentWorkflow.State.UploadState.UploadFiles(this.f10501v), null, false, false, reviewCapturesWithoutDocumentId.getError(), 116, null));
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$run$4", f = "DocumentStepStateManager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f extends m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10502t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ DocumentWorkflow.State.UploadState f10504v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(DocumentWorkflow.State.UploadState uploadState, lt.b<? super f> bVar) {
            super(1, bVar);
            this.f10504v = uploadState;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return b.this.new f(this.f10504v, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f10502t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            DocumentWorkflow.State state = (DocumentWorkflow.State) b.this.d().i();
            if (state == null) {
                return Unit.f22938a;
            }
            b.this.d().p(DocumentWorkflow.State.i(state, new DocumentWorkflow.State.UploadState.ReadyToSubmit(((DocumentWorkflow.State.UploadState.UploadFiles) this.f10504v).getDocumentId()), null, null, null, 14, null));
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull DocumentWorkflow.Input initialProps, @NotNull l0 savedStateHandle, @NotNull s imageLoader, @NotNull Context applicationContext, @NotNull com.withpersona.sdk2.inquiry.document.a documentCameraWorker, @NotNull i.b documentsSelectWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.document.network.a.C0182a documentCreateWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.document.network.e.a documentLoadWorker, @NotNull com.withpersona.sdk2.inquiry.document.network.c.a documentFileUploadWorkerFactory, @NotNull zn.a.C0693a documentFileDeleteWorkerFactory, @NotNull g.a documentSubmitWorker, @NotNull sq.a navigationStateManager, @NotNull nq.c externalEventLogger, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a permissionRequestWorker, @NotNull final p0 coroutineScope) {
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
        d().o(new Function1() { // from class: ao.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.step.b.Z(coroutineScope, this, (DocumentWorkflow.State) obj);
            }
        });
        k.d(coroutineScope, g1.d(), null, new C0193b(null), 2, null);
    }

    public static final Unit A0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.e.f10162a);
        return Unit.f22938a;
    }

    public static final Unit B0(DocumentFile.Remote it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f22938a;
    }

    public static final Unit C0() {
        return Unit.f22938a;
    }

    public static final Unit D0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10159a);
        return Unit.f22938a;
    }

    public static final Unit E0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.C0167a.f10158a);
        return Unit.f22938a;
    }

    public static final Unit F0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.d.f10161a);
        return Unit.f22938a;
    }

    public static final Unit G0(b bVar, g.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, g.b.C0192b.f10438a)) {
            bVar.e(DocumentWorkflow.b.d.f10171a);
        } else {
            if (!(it instanceof g.b.Error)) {
                throw new l();
            }
            bVar.e(new DocumentWorkflow.b.Errored(((g.b.Error) it).getCause()));
        }
        return Unit.f22938a;
    }

    public static final Unit H0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10159a);
        return Unit.f22938a;
    }

    public static final Unit I0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.c.f10160a);
        return Unit.f22938a;
    }

    public static final Unit J0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10159a);
        return Unit.f22938a;
    }

    public static final Unit K0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10159a);
        return Unit.f22938a;
    }

    public static final Unit L0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10159a);
        return Unit.f22938a;
    }

    public static final Unit M0(b bVar, DocumentWorkflow.State state, com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = d.f10498a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            com.withpersona.sdk2.inquiry.document.a aVar = bVar.documentCameraWorker;
            String string = bVar.applicationContext.getString(tp.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            bVar.d().p(aVar.e(string) ? state.a(DocumentWorkflow.State.a.CameraRunning) : state.a(DocumentWorkflow.State.a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new l();
            }
            bVar.d().p(state.a(DocumentWorkflow.State.a.None));
        }
        return Unit.f22938a;
    }

    public static final Unit N0(b bVar, com.withpersona.sdk2.inquiry.document.network.e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WorkflowState workflowStateI = bVar.d().i();
        DocumentWorkflow.State.ReviewCaptures reviewCaptures = workflowStateI instanceof DocumentWorkflow.State.ReviewCaptures ? (DocumentWorkflow.State.ReviewCaptures) workflowStateI : null;
        if (reviewCaptures == null) {
            return Unit.f22938a;
        }
        if (it instanceof com.withpersona.sdk2.inquiry.document.network.e.b.C0191b) {
            tr.f<DocumentWorkflow.State> fVarD = bVar.d();
            DocumentWorkflow.State.UploadState.ReadyToSubmit readyToSubmit = new DocumentWorkflow.State.UploadState.ReadyToSubmit(reviewCaptures.getDocumentId());
            List<DocumentFile> listA = ((com.withpersona.sdk2.inquiry.document.network.e.b.C0191b) it).a();
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
        return Unit.f22938a;
    }

    public static final Unit O0(b bVar, DocumentWorkflow.State state, com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = d.f10498a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            com.withpersona.sdk2.inquiry.document.a aVar = bVar.documentCameraWorker;
            String string = bVar.applicationContext.getString(tp.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            bVar.d().p(aVar.e(string) ? state.a(DocumentWorkflow.State.a.CameraRunning) : state.a(DocumentWorkflow.State.a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new l();
            }
            bVar.d().p(state.a(DocumentWorkflow.State.a.None));
        }
        return Unit.f22938a;
    }

    public static final Unit P0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.c.f10160a);
        return Unit.f22938a;
    }

    public static final Unit Q0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.g.f10164a);
        return Unit.f22938a;
    }

    public static final Unit R0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.h.f10165a);
        return Unit.f22938a;
    }

    public static final Unit V0(b bVar, DocumentWorkflow.Input input, com.withpersona.sdk2.inquiry.document.a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DocumentWorkflow.State state = (DocumentWorkflow.State) bVar.d().i();
        if (state == null) {
            return Unit.f22938a;
        }
        if (it instanceof com.withpersona.sdk2.inquiry.document.a.b.C0172b) {
            tr.f<DocumentWorkflow.State> fVarD = bVar.d();
            DocumentWorkflow.State.UploadState uploadState = state.getUploadState();
            DocumentWorkflow.State.a aVar = null;
            DocumentFile documentFile = null;
            boolean z10 = false;
            boolean z11 = false;
            String str = null;
            fVarD.p(new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.x0(state.m(), new DocumentFile.Local(((com.withpersona.sdk2.inquiry.document.a.b.C0172b) it).getAbsoluteFilePath(), CaptureMethod.MANUAL, 0, 4, null)), input.getDocumentFileLimit()), state.getDocumentId(), aVar, uploadState, documentFile, z10, z11, str, 244, null));
        } else {
            if (!Intrinsics.c(it, com.withpersona.sdk2.inquiry.document.a.b.C0171a.f10228a)) {
                throw new l();
            }
            bVar.d().p(state.a(DocumentWorkflow.State.a.None));
        }
        return Unit.f22938a;
    }

    public static final Unit W0(b bVar, DocumentWorkflow.Input input, DocumentWorkflow.State state, i.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DocumentWorkflow.State state2 = (DocumentWorkflow.State) bVar.d().i();
        if (state2 == null) {
            return Unit.f22938a;
        }
        if (it instanceof i.c.Success) {
            DocumentWorkflow.State.a aVar = null;
            bVar.d().p(new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.w0(state2.m(), com.withpersona.sdk2.inquiry.document.g.b(((i.c.Success) it).a())), input.getDocumentFileLimit()), state2.getDocumentId(), aVar, state2.getUploadState(), null, false, false, null, 244, null));
        } else if (it instanceof i.c.Failure) {
            DocumentWorkflow.State.a aVar2 = null;
            bVar.d().p(new DocumentWorkflow.State.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.w0(state2.m(), com.withpersona.sdk2.inquiry.document.g.b(((i.c.Failure) it).a())), input.getDocumentFileLimit()), state2.getDocumentId(), aVar2, state2.getUploadState(), null, false, false, bVar.applicationContext.getString(tp.g.f32534m), 116, null));
        } else {
            if (!Intrinsics.c(it, i.c.a.f10299a)) {
                throw new l();
            }
            bVar.d().p(state.a(DocumentWorkflow.State.a.None));
        }
        return Unit.f22938a;
    }

    public static final Unit X0(b bVar, com.withpersona.sdk2.inquiry.document.network.a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DocumentWorkflow.State state = (DocumentWorkflow.State) bVar.d().i();
        if (state == null) {
            return Unit.f22938a;
        }
        if (it instanceof com.withpersona.sdk2.inquiry.document.network.a.b.C0184b) {
            com.withpersona.sdk2.inquiry.document.network.a.b.C0184b c0184b = (com.withpersona.sdk2.inquiry.document.network.a.b.C0184b) it;
            bVar.d().p(DocumentWorkflow.State.i(state, new DocumentWorkflow.State.UploadState.ReadyToSubmit(c0184b.getDocumentId()), c0184b.getDocumentId(), null, null, 12, null));
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.document.network.a.b.Error)) {
                throw new l();
            }
            com.withpersona.sdk2.inquiry.document.network.a.b.Error error = (com.withpersona.sdk2.inquiry.document.network.a.b.Error) it;
            if (!error.getCause().isRecoverable()) {
                bVar.e(new DocumentWorkflow.b.Errored(error.getCause()));
            }
        }
        return Unit.f22938a;
    }

    public static final Unit Y0(b bVar, DocumentWorkflow.State.UploadState uploadState, DocumentFile.Local local, DocumentWorkflow.Input input, Object obj) {
        DocumentWorkflow.State.UploadState uploadFiles;
        DocumentWorkflow.State.UploadState readyToSubmit;
        DocumentWorkflow.State state = (DocumentWorkflow.State) bVar.d().i();
        if (state == null) {
            return Unit.f22938a;
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
        } else if (obj instanceof com.withpersona.sdk2.inquiry.document.network.c.b.C0186c) {
            List<DocumentFile> listM2 = state.m();
            ArrayList arrayList2 = new ArrayList(q.u(listM2, 10));
            for (Parcelable parcelableF : listM2) {
                if ((parcelableF instanceof DocumentFile.Local) && Intrinsics.c(parcelableF, local)) {
                    parcelableF = DocumentFile.Local.f((DocumentFile.Local) parcelableF, null, null, ((com.withpersona.sdk2.inquiry.document.network.c.b.C0186c) obj).getProgressPercentage(), 3, null);
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
        } else if (obj instanceof com.withpersona.sdk2.inquiry.document.network.c.b.C0185b) {
            bVar.e(new DocumentWorkflow.b.Errored(((com.withpersona.sdk2.inquiry.document.network.c.b.C0185b) obj).getCause()));
        }
        return Unit.f22938a;
    }

    public static final Unit Z(p0 p0Var, b bVar, DocumentWorkflow.State state) {
        if (state == null) {
            return Unit.f22938a;
        }
        k.d(p0Var, g1.d(), null, bVar.new a(state, null), 2, null);
        return Unit.f22938a;
    }

    public static final Unit Z0(b bVar, DocumentFile.Remote remote, DocumentWorkflow.State.UploadState uploadState, zn.a.b response) {
        DocumentWorkflow.State.UploadState uploadFiles;
        Intrinsics.checkNotNullParameter(response, "response");
        WorkflowState workflowStateI = bVar.d().i();
        DocumentWorkflow.State.ReviewCaptures reviewCaptures = workflowStateI instanceof DocumentWorkflow.State.ReviewCaptures ? (DocumentWorkflow.State.ReviewCaptures) workflowStateI : null;
        if (reviewCaptures == null) {
            return Unit.f22938a;
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
        if (response instanceof zn.a.b.C0695b) {
            bVar.d().p(DocumentWorkflow.State.ReviewCaptures.p(reviewCaptures, listV0, null, null, uploadState2, null, false, false, null, 230, null));
        } else {
            if (!(response instanceof zn.a.b.Error)) {
                throw new l();
            }
            bVar.e(new DocumentWorkflow.b.Errored(((zn.a.b.Error) response).getCause()));
        }
        return Unit.f22938a;
    }

    public static final Unit d0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.g.f10164a);
        return Unit.f22938a;
    }

    public static final Unit e0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.h.f10165a);
        return Unit.f22938a;
    }

    public static final Unit f0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.j.f10167a);
        return Unit.f22938a;
    }

    public static final Unit g0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.e.f10162a);
        return Unit.f22938a;
    }

    public static final Unit h0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.g.f10164a);
        return Unit.f22938a;
    }

    public static final Unit i0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.h.f10165a);
        return Unit.f22938a;
    }

    public static final Unit j0(b bVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        bVar.S0(bVar.d(), DocumentWorkflow.a.j.f10167a);
        return Unit.f22938a;
    }

    public static final Unit m0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.C0167a.f10158a);
        return Unit.f22938a;
    }

    public static final Unit n0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.j.f10167a);
        return Unit.f22938a;
    }

    public static final Unit o0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.e.f10162a);
        return Unit.f22938a;
    }

    public static final Unit p0(b bVar, DocumentWorkflow.State state, DocumentFile.Remote document) {
        Intrinsics.checkNotNullParameter(document, "document");
        bVar.S0(bVar.d(), new DocumentWorkflow.a.RemoveDocument(((DocumentWorkflow.State.ReviewCaptures) state).getDocumentId(), document));
        return Unit.f22938a;
    }

    public static final Unit q0(b bVar, DocumentWorkflow.State state) {
        bVar.S0(bVar.d(), new DocumentWorkflow.a.Submit(((DocumentWorkflow.State.ReviewCaptures) state).getDocumentId()));
        return Unit.f22938a;
    }

    public static final Unit r0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10159a);
        return Unit.f22938a;
    }

    public static final Unit s0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.C0167a.f10158a);
        return Unit.f22938a;
    }

    public static final Unit t0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.d.f10161a);
        return Unit.f22938a;
    }

    public static final Unit u0(b bVar, DocumentWorkflow.State state, com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = d.f10498a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            com.withpersona.sdk2.inquiry.document.a aVar = bVar.documentCameraWorker;
            String string = bVar.applicationContext.getString(tp.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            bVar.d().p(aVar.e(string) ? state.a(DocumentWorkflow.State.a.CameraRunning) : state.a(DocumentWorkflow.State.a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new l();
            }
            bVar.d().p(state.a(DocumentWorkflow.State.a.None));
        }
        return Unit.f22938a;
    }

    public static final Unit v0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.c.f10160a);
        return Unit.f22938a;
    }

    public static final Unit w0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.g.f10164a);
        return Unit.f22938a;
    }

    public static final Unit x0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.b.f10159a);
        return Unit.f22938a;
    }

    public static final Unit y0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.h.f10165a);
        return Unit.f22938a;
    }

    public static final Unit z0(b bVar) {
        bVar.S0(bVar.d(), DocumentWorkflow.a.j.f10167a);
        return Unit.f22938a;
    }

    public final void S0(tr.f<DocumentWorkflow.State> fVar, DocumentWorkflow.a aVar) {
        DocumentWorkflow.State state = (DocumentWorkflow.State) fVar.i();
        if (state == null) {
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.b.f10159a)) {
            e(DocumentWorkflow.b.C0168b.f10169a);
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.C0167a.f10158a)) {
            e(DocumentWorkflow.b.a.f10168a);
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.g.f10164a)) {
            fVar.p(state.a(DocumentWorkflow.State.a.SelectFileFromDocuments).f(false));
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.h.f10165a)) {
            fVar.p(state.a(DocumentWorkflow.State.a.SelectImageFromPhotoLibrary).f(false));
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.j.f10167a)) {
            fVar.p(state.a(DocumentWorkflow.State.a.CheckCameraPermissions).f(false));
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.e.f10162a)) {
            fVar.p(state.f(true));
            return;
        }
        if (Intrinsics.c(aVar, DocumentWorkflow.a.c.f10160a)) {
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
        if (Intrinsics.c(aVar, DocumentWorkflow.a.d.f10161a)) {
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
            d().n(this.documentCameraWorker, new Function1() { // from class: ao.n0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.document.step.b.V0(this.f3424a, input, (com.withpersona.sdk2.inquiry.document.a.b) obj);
                }
            });
        } else {
            if (i10 != 4 && i10 != 5) {
                throw new l();
            }
            d().n(state.getCaptureState() == DocumentWorkflow.State.a.SelectFileFromDocuments ? this.documentsSelectWorkerFactory.c() : this.documentsSelectWorkerFactory.e(), new Function1() { // from class: ao.o0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.document.step.b.W0(this.f3426a, input, state, (com.withpersona.sdk2.inquiry.document.i.c) obj);
                }
            });
        }
    }

    public final void U0(final DocumentWorkflow.State.UploadState uploadState, final DocumentWorkflow.Input input, DocumentWorkflow.State state) {
        if (Intrinsics.c(uploadState, DocumentWorkflow.State.UploadState.CreateDocument.f10148a)) {
            if (state.getDocumentId() != null) {
                return;
            }
            d().n(this.documentCreateWorkerFactory.a(input.getSessionToken(), input.getKind(), input.getFieldKeyDocument(), input.getDocumentFileLimit()), new Function1() { // from class: ao.p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.document.step.b.X0(this.f3428a, (com.withpersona.sdk2.inquiry.document.network.a.b) obj);
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
                    d().n(this.documentFileDeleteWorkerFactory.a(input.getSessionToken(), reviewCaptures.getDocumentId(), remote), new Function1() { // from class: ao.s0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return com.withpersona.sdk2.inquiry.document.step.b.Z0(this.f3435a, remote, uploadState, (zn.a.b) obj);
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
            tr.f<DocumentWorkflow.State> fVarD = d();
            com.withpersona.sdk2.inquiry.document.network.c.a aVar = this.documentFileUploadWorkerFactory;
            String sessionToken = input.getSessionToken();
            String documentId = ((DocumentWorkflow.State.UploadState.UploadFiles) uploadState).getDocumentId();
            boolean z10 = true;
            if (input.getDocumentFileLimit() != 1) {
                z10 = false;
            }
            fVarD.n(tr.g.a(aVar.a(sessionToken, documentId, local, z10), local.getAbsoluteFilePath()), new Function1() { // from class: ao.r0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return com.withpersona.sdk2.inquiry.document.step.b.Y0(this.f3431a, uploadState, local, input, obj2);
                }
            });
        }
    }

    public final List<Pair<String, Function1<UiComponent, Unit>>> b0(DocumentStartPage documentStartPage) {
        return new NestedUiStep.a().a(documentStartPage.getSelectDocumentButton(), new Function1() { // from class: ao.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.step.b.d0(this.f3416a, (UiComponent) obj);
            }
        }).a(documentStartPage.getSelectPhotoButton(), new Function1() { // from class: ao.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.step.b.e0(this.f3418a, (UiComponent) obj);
            }
        }).a(documentStartPage.getTakePhotoButton(), new Function1() { // from class: ao.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.step.b.f0(this.f3420a, (UiComponent) obj);
            }
        }).a(documentStartPage.getLaunchUploadOptionsButton(), new Function1() { // from class: ao.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.step.b.g0(this.f3422a, (UiComponent) obj);
            }
        }).b();
    }

    public final List<Pair<String, Function1<UiComponent, Unit>>> c0(UploadOptionsDialog uploadOptionsDialog) {
        return new NestedUiStep.a().a(uploadOptionsDialog.getSelectDocumentButton(), new Function1() { // from class: ao.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.step.b.h0(this.f3438a, (UiComponent) obj);
            }
        }).a(uploadOptionsDialog.getSelectPhotoButton(), new Function1() { // from class: ao.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.step.b.i0(this.f3440a, (UiComponent) obj);
            }
        }).a(uploadOptionsDialog.getTakePhotoButton(), new Function1() { // from class: ao.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.document.step.b.j0(this.f3442a, (UiComponent) obj);
            }
        }).b();
    }

    @NotNull
    public final DocumentWorkflow.State k0(@NotNull DocumentWorkflow.Input props) {
        Intrinsics.checkNotNullParameter(props, "props");
        DocumentWorkflow.StartPage startPage = props.getStartPage();
        if (Intrinsics.c(startPage, DocumentWorkflow.StartPage.Prompt.f10119a)) {
            return new DocumentWorkflow.State.Start(null, null, props.getDocumentId(), false, 11, null);
        }
        if (!(startPage instanceof DocumentWorkflow.StartPage.Review)) {
            throw new l();
        }
        return new DocumentWorkflow.State.ReviewCaptures(p.k(), ((DocumentWorkflow.StartPage.Review) props.getStartPage()).getDocumentId(), null, null, null, true, false, null, 220, null);
    }

    public final void l0(DocumentWorkflow.Input renderProps, final DocumentWorkflow.State renderState) {
        DocumentWorkflow.c bVar;
        sq.a.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !(renderState instanceof DocumentWorkflow.State.UploadDocument), false, 8, null);
        T0(renderState.getCaptureState(), renderProps, renderState);
        U0(renderState.getUploadState(), renderProps, renderState);
        com.withpersona.sdk2.inquiry.document.g.a(this.externalEventLogger, this.trackingEventsLogger, renderProps, renderState);
        if (renderState instanceof DocumentWorkflow.State.Start) {
            DocumentWorkflow.State.Start start = (DocumentWorkflow.State.Start) renderState;
            bVar = new com.withpersona.sdk2.inquiry.document.b(yq.b.a(renderProps.getPages().getDocumentStartPage()), b0(renderProps.getPages().getDocumentStartPage()), this.navigationStateManager.b(), new Function0() { // from class: ao.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.m0(this.f3439a);
                }
            }, new Function0() { // from class: ao.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.x0(this.f3421a);
                }
            }, start.getShouldShowUploadOptionsDialog() ? yq.s.f37116a.j(yq.b.a(renderProps.getPages().getUploadOptionsDialog()), c0(renderProps.getPages().getUploadOptionsDialog()), new Function0() { // from class: ao.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.I0(this.f3447a);
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()) : null, renderProps.getPromptPageNavBarTitle(), renderProps.getStyles());
            if (start.getCaptureState() == DocumentWorkflow.State.a.CheckCameraPermissions) {
                tr.f<DocumentWorkflow.State> fVarD = d();
                com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a aVar = this.permissionRequestWorker;
                i0 i0Var = i0.Camera;
                String permissionsTitle = renderProps.getPermissionsTitle();
                String str = permissionsTitle == null ? "" : permissionsTitle;
                String permissionsRationale = renderProps.getPermissionsRationale();
                if (permissionsRationale == null) {
                    permissionsRationale = this.applicationContext.getString(tp.g.f32527f);
                    Intrinsics.checkNotNullExpressionValue(permissionsRationale, "getString(...)");
                }
                String str2 = permissionsRationale;
                Context context = this.applicationContext;
                String string = context.getString(tp.g.f32526e, hq.g.b(context));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                fVarD.n(aVar.a(new PermissionRequestWorkflow.Props(i0Var, false, str, str2, string, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: ao.b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.document.step.b.M0(this.f3390a, renderState, (com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b) obj);
                    }
                });
            }
        } else if (renderState instanceof DocumentWorkflow.State.ReviewCaptures) {
            DocumentWorkflow.State.ReviewCaptures reviewCaptures = (DocumentWorkflow.State.ReviewCaptures) renderState;
            if (reviewCaptures.getShouldLoadDocuments()) {
                d().n(this.documentLoadWorker.a(renderProps.getSessionToken(), reviewCaptures.getDocumentId()), new Function1() { // from class: ao.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.document.step.b.N0(this.f3393a, (com.withpersona.sdk2.inquiry.document.network.e.b) obj);
                    }
                });
            }
            if (reviewCaptures.getCaptureState() == DocumentWorkflow.State.a.CheckCameraPermissions) {
                tr.f<DocumentWorkflow.State> fVarD2 = d();
                com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a aVar2 = this.permissionRequestWorker;
                i0 i0Var2 = i0.Camera;
                String permissionsTitle2 = renderProps.getPermissionsTitle();
                String str3 = permissionsTitle2 == null ? "" : permissionsTitle2;
                String permissionsRationale2 = renderProps.getPermissionsRationale();
                if (permissionsRationale2 == null) {
                    permissionsRationale2 = this.applicationContext.getString(tp.g.f32527f);
                    Intrinsics.checkNotNullExpressionValue(permissionsRationale2, "getString(...)");
                }
                String str4 = permissionsRationale2;
                Context context2 = this.applicationContext;
                String string2 = context2.getString(tp.g.f32526e, hq.g.b(context2));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                fVarD2.n(aVar2.a(new PermissionRequestWorkflow.Props(i0Var2, false, str3, str4, string2, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: ao.d0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.document.step.b.O0(this.f3407a, renderState, (com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b) obj);
                    }
                });
            }
            bVar = new DocumentWorkflow.c.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCaptures.m(), this.navigationStateManager.b(), new Function0() { // from class: ao.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.Q0(this.f3411a);
                }
            }, new Function0() { // from class: ao.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.R0(this.f3413a);
                }
            }, new Function0() { // from class: ao.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.n0(this.f3414a);
                }
            }, new Function0() { // from class: ao.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.o0(this.f3409a);
                }
            }, new Function1() { // from class: ao.q0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.document.step.b.p0(this.f3429a, renderState, (DocumentFile.Remote) obj);
                }
            }, new Function0() { // from class: ao.w0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.q0(this.f3444a, renderState);
                }
            }, new Function0() { // from class: ao.x0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.r0(this.f3446a);
                }
            }, new Function0() { // from class: ao.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.s0(this.f3448a);
                }
            }, reviewCaptures.getShouldLoadDocuments(), reviewCaptures.m().size() < renderProps.getDocumentFileLimit(), !reviewCaptures.m().isEmpty() && Intrinsics.c(reviewCaptures.getUploadState(), new DocumentWorkflow.State.UploadState.ReadyToSubmit(reviewCaptures.getDocumentId())), reviewCaptures.getError(), new Function0() { // from class: ao.z0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.t0(this.f3450a);
                }
            }, renderProps.getStyles(), renderProps.getCheckPageNavBarTitle(), reviewCaptures.getShouldShowUploadOptionsDialog() ? yq.s.f37116a.j(yq.b.a(renderProps.getPages().getUploadOptionsDialog()), c0(renderProps.getPages().getUploadOptionsDialog()), new Function0() { // from class: ao.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.P0(this.f3408a);
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()) : null);
        } else if (renderState instanceof DocumentWorkflow.State.ReviewCapturesWithoutDocumentId) {
            DocumentWorkflow.State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (DocumentWorkflow.State.ReviewCapturesWithoutDocumentId) renderState;
            String documentId = reviewCapturesWithoutDocumentId.getDocumentId();
            if (documentId != null) {
                d().m(documentId, new e(documentId, null));
            }
            if (reviewCapturesWithoutDocumentId.getCaptureState() == DocumentWorkflow.State.a.CheckCameraPermissions) {
                tr.f<DocumentWorkflow.State> fVarD3 = d();
                com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a aVar3 = this.permissionRequestWorker;
                i0 i0Var3 = i0.Camera;
                String permissionsTitle3 = renderProps.getPermissionsTitle();
                String str5 = permissionsTitle3 == null ? "" : permissionsTitle3;
                String permissionsRationale3 = renderProps.getPermissionsRationale();
                if (permissionsRationale3 == null) {
                    permissionsRationale3 = this.applicationContext.getString(tp.g.f32527f);
                    Intrinsics.checkNotNullExpressionValue(permissionsRationale3, "getString(...)");
                }
                String str6 = permissionsRationale3;
                Context context3 = this.applicationContext;
                String string3 = context3.getString(tp.g.f32526e, hq.g.b(context3));
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                fVarD3.n(aVar3.a(new PermissionRequestWorkflow.Props(i0Var3, false, str5, str6, string3, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: ao.a1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return com.withpersona.sdk2.inquiry.document.step.b.u0(this.f3389a, renderState, (com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.b) obj);
                    }
                });
            }
            bVar = new DocumentWorkflow.c.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCapturesWithoutDocumentId.m(), this.navigationStateManager.b(), new Function0() { // from class: ao.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.w0(this.f3417a);
                }
            }, new Function0() { // from class: ao.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.y0(this.f3419a);
                }
            }, new Function0() { // from class: ao.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.z0(this.f3423a);
                }
            }, new Function0() { // from class: ao.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.A0(this.f3425a);
                }
            }, new Function1() { // from class: ao.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.document.step.b.B0((DocumentFile.Remote) obj);
                }
            }, new Function0() { // from class: ao.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.C0();
                }
            }, new Function0() { // from class: ao.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.D0(this.f3430a);
                }
            }, new Function0() { // from class: ao.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.E0(this.f3434a);
                }
            }, reviewCapturesWithoutDocumentId.getReloadingFromPreviousSession(), reviewCapturesWithoutDocumentId.m().size() < renderProps.getDocumentFileLimit(), false, reviewCapturesWithoutDocumentId.getError(), new Function0() { // from class: ao.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.F0(this.f3437a);
                }
            }, renderProps.getStyles(), renderProps.getCheckPageNavBarTitle(), reviewCapturesWithoutDocumentId.getShouldShowUploadOptionsDialog() ? yq.s.f37116a.j(yq.b.a(renderProps.getPages().getUploadOptionsDialog()), c0(renderProps.getPages().getUploadOptionsDialog()), new Function0() { // from class: ao.b1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.v0(this.f3391a);
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()) : null);
        } else {
            if (!(renderState instanceof DocumentWorkflow.State.UploadDocument)) {
                throw new l();
            }
            d().n(this.documentSubmitWorker.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), ((DocumentWorkflow.State.UploadDocument) renderState).m()), new Function1() { // from class: ao.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.document.step.b.G0(this.f3441a, (com.withpersona.sdk2.inquiry.document.network.g.b) obj);
                }
            });
            sq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
            CustomPendingPage customPendingPage = renderProps.getCustomPendingPage();
            bVar = customPendingPage != null ? new DocumentWorkflow.c.b(yq.b.a(customPendingPage), this.navigationStateManager.b(), renderProps.getStyles(), new Function0() { // from class: ao.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.H0(this.f3443a);
                }
            }, new Function0() { // from class: ao.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.J0(this.f3445a);
                }
            }, renderProps.getPendingPageNavBarTitle(), null, 64, null) : new DocumentWorkflow.c.LoadingAnimation(renderProps.getPendingTitle(), renderProps.getPendingDescription(), this.navigationStateManager.b(), new Function0() { // from class: ao.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.K0(this.f3449a);
                }
            }, new Function0() { // from class: ao.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.step.b.L0(this.f3388a);
                }
            }, renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), renderProps.getPendingPageTextVerticalPosition(), renderProps.getPendingPageNavBarTitle(), null, Barcode.FORMAT_UPC_A, null);
        }
        c().setValue(bVar);
    }
}
