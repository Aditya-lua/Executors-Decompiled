package qo;

import android.content.Context;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fq.n1;
import fq.s1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import no.f3;
import no.u2;
import no.y2;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import qr.x5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001aB\u008f\u0001\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\u00020)*\b\u0012\u0004\u0012\u00020\u00030,2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J1\u00107\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u000204\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020)050302*\u000201H\u0002¢\u0006\u0004\b7\u00108J1\u0010:\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u000204\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020)050302*\u000209H\u0002¢\u0006\u0004\b:\u0010;J#\u0010=\u001a\u00020)*\u00020<2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b=\u0010>J#\u0010@\u001a\u00020)*\u00020?2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0002¢\u0006\u0004\bC\u0010DR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006b"}, d2 = {"Lqo/e1;", "Lls/d;", "Lno/u2$b;", "Lno/u2$f;", "Lno/u2$c;", "Lno/u2$d;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Ll6/s;", "imageLoader", "Landroid/content/Context;", "applicationContext", "Lno/c;", "documentCameraWorker", "Lno/y2$b;", "documentsSelectWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "documentCreateWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "documentLoadWorker", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "documentFileUploadWorkerFactory", "Lpo/a$a;", "documentFileDeleteWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "documentSubmitWorker", "Lir/b;", "navigationStateManager", "Ldr/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lhq/i$a;", "permissionRequestWorker", "Lav/p0;", "coroutineScope", "<init>", "(Lno/u2$b;Landroidx/lifecycle/l0;Ll6/s;Landroid/content/Context;Lno/c;Lno/y2$b;Lcom/withpersona/sdk2/inquiry/document/network/a$a;Lcom/withpersona/sdk2/inquiry/document/network/e$a;Lcom/withpersona/sdk2/inquiry/document/network/c$a;Lpo/a$a;Lcom/withpersona/sdk2/inquiry/document/network/g$a;Lir/b;Ldr/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lhq/i$a;Lav/p0;)V", "renderProps", "renderState", BuildConfig.FLAVOR, "l0", "(Lno/u2$b;Lno/u2$f;)V", "Lls/g;", "Lno/u2$a;", "event", "S0", "(Lls/g;Lno/u2$a;)V", "Lno/w;", BuildConfig.FLAVOR, "Lkotlin/Pair;", BuildConfig.FLAVOR, "Lkotlin/Function1;", "Lqr/x5;", "b0", "(Lno/w;)Ljava/util/List;", "Lno/f3;", "c0", "(Lno/f3;)Ljava/util/List;", "Lno/u2$f$a;", "T0", "(Lno/u2$f$a;Lno/u2$b;Lno/u2$f;)V", "Lno/u2$f$f;", "U0", "(Lno/u2$f$f;Lno/u2$b;Lno/u2$f;)V", "props", "k0", "(Lno/u2$b;)Lno/u2$f;", "e", "Landroidx/lifecycle/l0;", "f", "Ll6/s;", "g", "Landroid/content/Context;", "h", "Lno/c;", "i", "Lno/y2$b;", "j", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "k", "Lcom/withpersona/sdk2/inquiry/document/network/e$a;", "l", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "m", "Lpo/a$a;", "n", "Lcom/withpersona/sdk2/inquiry/document/network/g$a;", "o", "Lir/b;", "p", "Ldr/c;", "q", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "r", "Lhq/i$a;", "c", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e1 extends ls.d<u2.Input, u2.f, u2.c, u2.d> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.p000lifecycle.l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l6.s imageLoader;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final no.c documentCameraWorker;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y2.b documentsSelectWorkerFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.document.network.a.C0164a documentCreateWorkerFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.document.network.e.a documentLoadWorker;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.document.network.c.a documentFileUploadWorkerFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final po.a.C0563a documentFileDeleteWorkerFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.document.network.g.a documentSubmitWorker;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.b navigationStateManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dr.c externalEventLogger;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hq.i.a permissionRequestWorker;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$1$1", f = "DocumentStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30062t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ u2.f f30064v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u2.f fVar, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f30064v = fVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return e1.this.new a(this.f30064v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f30062t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            e1 e1Var = e1.this;
            e1Var.l0(e1Var.b().getValue(), this.f30064v);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$2", f = "DocumentStepStateManager.kt", l = {97}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30065t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e1 f30067a;

            public a(e1 e1Var) {
                this.f30067a = e1Var;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(u2.Input input, eu.b<? super Unit> bVar) {
                e1 e1Var = this.f30067a;
                u2.f fVar = (u2.f) e1Var.d().i();
                if (fVar == null) {
                    return Unit.f21506a;
                }
                e1Var.l0(input, fVar);
                return Unit.f21506a;
            }
        }

        public b(eu.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return e1.this.new b(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f30065t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.c0<u2.Input> c0VarB = e1.this.b();
                a aVar = new a(e1.this);
                this.f30065t = 1;
                if (c0VarB.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            throw new zt.d();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lqo/e1$c;", BuildConfig.FLAVOR, "Lno/u2$b;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lqo/e1;", "a", "(Lno/u2$b;Landroidx/lifecycle/l0;)Lqo/e1;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        @NotNull
        e1 a(@NotNull u2.Input initialProps, @NotNull androidx.p000lifecycle.l0 savedStateHandle);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30068a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[s1.values().length];
            try {
                iArr[s1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s1.PermissionRejected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s1.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30068a = iArr;
            int[] iArr2 = new int[u2.f.a.values().length];
            try {
                iArr2[u2.f.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[u2.f.a.CheckCameraPermissions.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[u2.f.a.CameraRunning.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[u2.f.a.SelectFileFromDocuments.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[u2.f.a.SelectImageFromPhotoLibrary.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$handleState$screen$14", f = "DocumentStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class e extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30069t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f30071v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, eu.b<? super e> bVar) {
            super(1, bVar);
            this.f30071v = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return e1.this.new e(this.f30071v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f30069t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            ls.h hVarI = e1.this.d().i();
            u2.f.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = hVarI instanceof u2.f.ReviewCapturesWithoutDocumentId ? (u2.f.ReviewCapturesWithoutDocumentId) hVarI : null;
            if (reviewCapturesWithoutDocumentId == null) {
                return Unit.f21506a;
            }
            u2.f.a aVar = null;
            e1.this.d().p(new u2.f.ReviewCaptures(reviewCapturesWithoutDocumentId.l(), this.f30071v, aVar, new u2.f.InterfaceC0518f.UploadFiles(this.f30071v), null, false, false, reviewCapturesWithoutDocumentId.getError(), 116, null));
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$run$4", f = "DocumentStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class f extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30072t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ u2.f.InterfaceC0518f f30074v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(u2.f.InterfaceC0518f interfaceC0518f, eu.b<? super f> bVar) {
            super(1, bVar);
            this.f30074v = interfaceC0518f;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return e1.this.new f(this.f30074v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f30072t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            u2.f fVar = (u2.f) e1.this.d().i();
            if (fVar == null) {
                return Unit.f21506a;
            }
            e1.this.d().p(u2.f.i(fVar, new u2.f.InterfaceC0518f.ReadyToSubmit(((u2.f.InterfaceC0518f.UploadFiles) this.f30074v).getDocumentId()), null, null, null, 14, null));
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(@NotNull u2.Input initialProps, @NotNull androidx.p000lifecycle.l0 savedStateHandle, @NotNull l6.s imageLoader, @NotNull Context applicationContext, @NotNull no.c documentCameraWorker, @NotNull y2.b documentsSelectWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.document.network.a.C0164a documentCreateWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.document.network.e.a documentLoadWorker, @NotNull com.withpersona.sdk2.inquiry.document.network.c.a documentFileUploadWorkerFactory, @NotNull po.a.C0563a documentFileDeleteWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.document.network.g.a documentSubmitWorker, @NotNull ir.b navigationStateManager, @NotNull dr.c externalEventLogger, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull hq.i.a permissionRequestWorker, @NotNull final av.p0 coroutineScope) {
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
        d().o(new Function1() { // from class: qo.l
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.Z(coroutineScope, this, (u2.f) obj);
            }
        });
        av.k.d(coroutineScope, av.g1.d(), null, new b(null), 2, null);
    }

    public static final Unit A0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.e.f26089a);
        return Unit.f21506a;
    }

    public static final Unit B0(no.e.Remote it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f21506a;
    }

    public static final Unit C0() {
        return Unit.f21506a;
    }

    public static final Unit D0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.b.f26086a);
        return Unit.f21506a;
    }

    public static final Unit E0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.C0515a.f26085a);
        return Unit.f21506a;
    }

    public static final Unit F0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.d.f26088a);
        return Unit.f21506a;
    }

    public static final Unit G0(e1 e1Var, com.withpersona.sdk2.inquiry.document.network.g.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, com.withpersona.sdk2.inquiry.document.network.g.b.C0174b.f9993a)) {
            e1Var.e(u2.c.d.f26123a);
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.document.network.g.b.Error)) {
                throw new zt.l();
            }
            e1Var.e(new u2.c.Errored(((com.withpersona.sdk2.inquiry.document.network.g.b.Error) it).getCause()));
        }
        return Unit.f21506a;
    }

    public static final Unit H0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.b.f26086a);
        return Unit.f21506a;
    }

    public static final Unit I0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.c.f26087a);
        return Unit.f21506a;
    }

    public static final Unit J0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.b.f26086a);
        return Unit.f21506a;
    }

    public static final Unit K0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.b.f26086a);
        return Unit.f21506a;
    }

    public static final Unit L0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.b.f26086a);
        return Unit.f21506a;
    }

    public static final Unit M0(e1 e1Var, u2.f fVar, hq.i.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = d.f30068a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            no.c cVar = e1Var.documentCameraWorker;
            String string = e1Var.applicationContext.getString(jq.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            e1Var.d().p(cVar.e(string) ? fVar.a(u2.f.a.CameraRunning) : fVar.a(u2.f.a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new zt.l();
            }
            e1Var.d().p(fVar.a(u2.f.a.None));
        }
        return Unit.f21506a;
    }

    public static final Unit N0(e1 e1Var, com.withpersona.sdk2.inquiry.document.network.e.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ls.h hVarI = e1Var.d().i();
        u2.f.ReviewCaptures reviewCaptures = hVarI instanceof u2.f.ReviewCaptures ? (u2.f.ReviewCaptures) hVarI : null;
        if (reviewCaptures == null) {
            return Unit.f21506a;
        }
        if (it instanceof com.withpersona.sdk2.inquiry.document.network.e.b.C0173b) {
            ls.g<u2.f> gVarD = e1Var.d();
            u2.f.InterfaceC0518f.ReadyToSubmit readyToSubmit = new u2.f.InterfaceC0518f.ReadyToSubmit(reviewCaptures.getDocumentId());
            List<no.e> listA = ((com.withpersona.sdk2.inquiry.document.network.e.b.C0173b) it).a();
            List<no.e> listL = reviewCaptures.l();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listL) {
                if (obj instanceof no.e.Local) {
                    arrayList.add(obj);
                }
            }
            gVarD.p(u2.f.ReviewCaptures.p(reviewCaptures, CollectionsKt.w0(listA, arrayList), null, null, readyToSubmit, null, false, false, null, 214, null));
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.document.network.e.b.a)) {
                throw new zt.l();
            }
            e1Var.e(new u2.c.Errored(((com.withpersona.sdk2.inquiry.document.network.e.b.a) it).getCause()));
        }
        return Unit.f21506a;
    }

    public static final Unit O0(e1 e1Var, u2.f fVar, hq.i.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = d.f30068a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            no.c cVar = e1Var.documentCameraWorker;
            String string = e1Var.applicationContext.getString(jq.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            e1Var.d().p(cVar.e(string) ? fVar.a(u2.f.a.CameraRunning) : fVar.a(u2.f.a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new zt.l();
            }
            e1Var.d().p(fVar.a(u2.f.a.None));
        }
        return Unit.f21506a;
    }

    public static final Unit P0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.c.f26087a);
        return Unit.f21506a;
    }

    public static final Unit Q0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.g.f26091a);
        return Unit.f21506a;
    }

    public static final Unit R0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.h.f26092a);
        return Unit.f21506a;
    }

    public static final Unit V0(e1 e1Var, u2.Input input, no.c.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        u2.f fVar = (u2.f) e1Var.d().i();
        if (fVar == null) {
            return Unit.f21506a;
        }
        if (it instanceof no.c.b.C0510b) {
            ls.g<u2.f> gVarD = e1Var.d();
            u2.f.InterfaceC0518f uploadState = fVar.getUploadState();
            u2.f.a aVar = null;
            no.e eVar = null;
            boolean z10 = false;
            boolean z11 = false;
            String str = null;
            gVarD.p(new u2.f.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.x0(fVar.l(), new no.e.Local(((no.c.b.C0510b) it).getAbsoluteFilePath(), no.a.MANUAL, 0, 4, null)), input.getDocumentFileLimit()), fVar.getDocumentId(), aVar, uploadState, eVar, z10, z11, str, 244, null));
        } else {
            if (!Intrinsics.c(it, no.c.b.a.f25926a)) {
                throw new zt.l();
            }
            e1Var.d().p(fVar.a(u2.f.a.None));
        }
        return Unit.f21506a;
    }

    public static final Unit W0(e1 e1Var, u2.Input input, u2.f fVar, y2.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        u2.f fVar2 = (u2.f) e1Var.d().i();
        if (fVar2 == null) {
            return Unit.f21506a;
        }
        if (it instanceof y2.c.Success) {
            u2.f.a aVar = null;
            e1Var.d().p(new u2.f.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.w0(fVar2.l(), no.a0.b(((y2.c.Success) it).a())), input.getDocumentFileLimit()), fVar2.getDocumentId(), aVar, fVar2.getUploadState(), null, false, false, null, 244, null));
        } else if (it instanceof y2.c.Failure) {
            u2.f.a aVar2 = null;
            e1Var.d().p(new u2.f.ReviewCapturesWithoutDocumentId(CollectionsKt.H0(CollectionsKt.w0(fVar2.l(), no.a0.b(((y2.c.Failure) it).a())), input.getDocumentFileLimit()), fVar2.getDocumentId(), aVar2, fVar2.getUploadState(), null, false, false, e1Var.applicationContext.getString(jq.g.f20883m), 116, null));
        } else {
            if (!Intrinsics.c(it, y2.c.a.f26250a)) {
                throw new zt.l();
            }
            e1Var.d().p(fVar.a(u2.f.a.None));
        }
        return Unit.f21506a;
    }

    public static final Unit X0(e1 e1Var, com.withpersona.sdk2.inquiry.document.network.a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        u2.f fVar = (u2.f) e1Var.d().i();
        if (fVar == null) {
            return Unit.f21506a;
        }
        if (it instanceof com.withpersona.sdk2.inquiry.document.network.a.b.C0166b) {
            com.withpersona.sdk2.inquiry.document.network.a.b.C0166b c0166b = (com.withpersona.sdk2.inquiry.document.network.a.b.C0166b) it;
            e1Var.d().p(u2.f.i(fVar, new u2.f.InterfaceC0518f.ReadyToSubmit(c0166b.getDocumentId()), c0166b.getDocumentId(), null, null, 12, null));
        } else {
            if (!(it instanceof com.withpersona.sdk2.inquiry.document.network.a.b.Error)) {
                throw new zt.l();
            }
            com.withpersona.sdk2.inquiry.document.network.a.b.Error error = (com.withpersona.sdk2.inquiry.document.network.a.b.Error) it;
            if (!error.getCause().isRecoverable()) {
                e1Var.e(new u2.c.Errored(error.getCause()));
            }
        }
        return Unit.f21506a;
    }

    public static final Unit Y0(e1 e1Var, u2.f.InterfaceC0518f interfaceC0518f, no.e.Local local, u2.Input input, Object obj) {
        u2.f.InterfaceC0518f uploadFiles;
        u2.f.InterfaceC0518f readyToSubmit;
        u2.f fVar = (u2.f) e1Var.d().i();
        if (fVar == null) {
            return Unit.f21506a;
        }
        if (obj instanceof com.withpersona.sdk2.inquiry.document.network.c.b.d) {
            List<no.e> listL = fVar.l();
            ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(listL, 10));
            for (Parcelable parcelableA : listL) {
                com.withpersona.sdk2.inquiry.document.network.c.b.d dVar = (com.withpersona.sdk2.inquiry.document.network.c.b.d) obj;
                if (Intrinsics.c(parcelableA, dVar.getOldLocalDocument())) {
                    parcelableA = dVar.getNewRemoteDocument();
                }
                arrayList.add(parcelableA);
            }
            if (arrayList.isEmpty()) {
                readyToSubmit = new u2.f.InterfaceC0518f.ReadyToSubmit(((u2.f.InterfaceC0518f.UploadFiles) interfaceC0518f).getDocumentId());
                break;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    readyToSubmit = new u2.f.InterfaceC0518f.ReadyToSubmit(((u2.f.InterfaceC0518f.UploadFiles) interfaceC0518f).getDocumentId());
                    break;
                }
                Object obj2 = arrayList.get(i10);
                i10++;
                if (((no.e) obj2) instanceof no.e.Local) {
                    readyToSubmit = new u2.f.InterfaceC0518f.UploadFiles(((u2.f.InterfaceC0518f.UploadFiles) interfaceC0518f).getDocumentId());
                    break;
                }
            }
            e1Var.d().p(u2.f.i(fVar, readyToSubmit, null, arrayList, null, 10, null));
        } else if (obj instanceof com.withpersona.sdk2.inquiry.document.network.c.b.C0168c) {
            List<no.e> listL2 = fVar.l();
            ArrayList arrayList2 = new ArrayList(p001kotlin.collections.q.u(listL2, 10));
            for (Parcelable parcelableF : listL2) {
                if ((parcelableF instanceof no.e.Local) && Intrinsics.c(parcelableF, local)) {
                    parcelableF = no.e.Local.f((no.e.Local) parcelableF, null, null, ((com.withpersona.sdk2.inquiry.document.network.c.b.C0168c) obj).getProgressPercentage(), 3, null);
                }
                arrayList2.add(parcelableF);
            }
            e1Var.d().p(u2.f.i(fVar, fVar.getUploadState(), null, arrayList2, null, 10, null));
        } else if (obj instanceof com.withpersona.sdk2.inquiry.document.network.c.b.a) {
            List listV0 = CollectionsKt.v0(fVar.l(), local);
            List list = listV0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        uploadFiles = new u2.f.InterfaceC0518f.ReadyToSubmit(((u2.f.InterfaceC0518f.UploadFiles) interfaceC0518f).getDocumentId());
                        break;
                    }
                    if (((no.e) it.next()) instanceof no.e.Local) {
                        uploadFiles = new u2.f.InterfaceC0518f.UploadFiles(((u2.f.InterfaceC0518f.UploadFiles) interfaceC0518f).getDocumentId());
                        break;
                    }
                }
            } else {
                uploadFiles = new u2.f.InterfaceC0518f.ReadyToSubmit(((u2.f.InterfaceC0518f.UploadFiles) interfaceC0518f).getDocumentId());
                break;
            }
            u2.f.InterfaceC0518f interfaceC0518f2 = uploadFiles;
            com.withpersona.sdk2.inquiry.document.network.c.b.a aVar = (com.withpersona.sdk2.inquiry.document.network.c.b.a) obj;
            no.e eVar = null;
            e1Var.d().p(new u2.f.ReviewCaptures(listV0, ((u2.f.InterfaceC0518f.UploadFiles) interfaceC0518f).getDocumentId(), u2.f.a.None, interfaceC0518f2, eVar, aVar.getCause() instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError, false, no.a0.c(aVar.getCause(), e1Var.applicationContext, input), 80, null));
        } else if (obj instanceof com.withpersona.sdk2.inquiry.document.network.c.b.C0167b) {
            e1Var.e(new u2.c.Errored(((com.withpersona.sdk2.inquiry.document.network.c.b.C0167b) obj).getCause()));
        }
        return Unit.f21506a;
    }

    public static final Unit Z(av.p0 p0Var, e1 e1Var, u2.f fVar) {
        if (fVar == null) {
            return Unit.f21506a;
        }
        av.k.d(p0Var, av.g1.d(), null, e1Var.new a(fVar, null), 2, null);
        return Unit.f21506a;
    }

    public static final Unit Z0(e1 e1Var, no.e.Remote remote, u2.f.InterfaceC0518f interfaceC0518f, po.a.b response) {
        u2.f.InterfaceC0518f uploadFiles;
        Intrinsics.checkNotNullParameter(response, "response");
        ls.h hVarI = e1Var.d().i();
        u2.f.ReviewCaptures reviewCaptures = hVarI instanceof u2.f.ReviewCaptures ? (u2.f.ReviewCaptures) hVarI : null;
        if (reviewCaptures == null) {
            return Unit.f21506a;
        }
        List listV0 = CollectionsKt.v0(reviewCaptures.l(), remote);
        List list = listV0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    uploadFiles = new u2.f.InterfaceC0518f.ReadyToSubmit(((u2.f.InterfaceC0518f.DeleteFiles) interfaceC0518f).getDocumentId());
                    break;
                }
                if (((no.e) it.next()) instanceof no.e.Local) {
                    uploadFiles = new u2.f.InterfaceC0518f.UploadFiles(((u2.f.InterfaceC0518f.DeleteFiles) interfaceC0518f).getDocumentId());
                    break;
                }
            }
        } else {
            uploadFiles = new u2.f.InterfaceC0518f.ReadyToSubmit(((u2.f.InterfaceC0518f.DeleteFiles) interfaceC0518f).getDocumentId());
            break;
        }
        u2.f.InterfaceC0518f interfaceC0518f2 = uploadFiles;
        if (response instanceof po.a.b.C0565b) {
            e1Var.d().p(u2.f.ReviewCaptures.p(reviewCaptures, listV0, null, null, interfaceC0518f2, null, false, false, null, 230, null));
        } else {
            if (!(response instanceof po.a.b.Error)) {
                throw new zt.l();
            }
            e1Var.e(new u2.c.Errored(((po.a.b.Error) response).getCause()));
        }
        return Unit.f21506a;
    }

    public static final Unit d0(e1 e1Var, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        e1Var.S0(e1Var.d(), u2.a.g.f26091a);
        return Unit.f21506a;
    }

    public static final Unit e0(e1 e1Var, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        e1Var.S0(e1Var.d(), u2.a.h.f26092a);
        return Unit.f21506a;
    }

    public static final Unit f0(e1 e1Var, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        e1Var.S0(e1Var.d(), u2.a.j.f26094a);
        return Unit.f21506a;
    }

    public static final Unit g0(e1 e1Var, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        e1Var.S0(e1Var.d(), u2.a.e.f26089a);
        return Unit.f21506a;
    }

    public static final Unit h0(e1 e1Var, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        e1Var.S0(e1Var.d(), u2.a.g.f26091a);
        return Unit.f21506a;
    }

    public static final Unit i0(e1 e1Var, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        e1Var.S0(e1Var.d(), u2.a.h.f26092a);
        return Unit.f21506a;
    }

    public static final Unit j0(e1 e1Var, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        e1Var.S0(e1Var.d(), u2.a.j.f26094a);
        return Unit.f21506a;
    }

    public static final Unit m0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.C0515a.f26085a);
        return Unit.f21506a;
    }

    public static final Unit n0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.j.f26094a);
        return Unit.f21506a;
    }

    public static final Unit o0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.e.f26089a);
        return Unit.f21506a;
    }

    public static final Unit p0(e1 e1Var, u2.f fVar, no.e.Remote document) {
        Intrinsics.checkNotNullParameter(document, "document");
        e1Var.S0(e1Var.d(), new u2.a.RemoveDocument(((u2.f.ReviewCaptures) fVar).getDocumentId(), document));
        return Unit.f21506a;
    }

    public static final Unit q0(e1 e1Var, u2.f fVar) {
        e1Var.S0(e1Var.d(), new u2.a.Submit(((u2.f.ReviewCaptures) fVar).getDocumentId()));
        return Unit.f21506a;
    }

    public static final Unit r0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.b.f26086a);
        return Unit.f21506a;
    }

    public static final Unit s0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.C0515a.f26085a);
        return Unit.f21506a;
    }

    public static final Unit t0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.d.f26088a);
        return Unit.f21506a;
    }

    public static final Unit u0(e1 e1Var, u2.f fVar, hq.i.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = d.f30068a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            no.c cVar = e1Var.documentCameraWorker;
            String string = e1Var.applicationContext.getString(jq.g.b);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            e1Var.d().p(cVar.e(string) ? fVar.a(u2.f.a.CameraRunning) : fVar.a(u2.f.a.None));
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new zt.l();
            }
            e1Var.d().p(fVar.a(u2.f.a.None));
        }
        return Unit.f21506a;
    }

    public static final Unit v0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.c.f26087a);
        return Unit.f21506a;
    }

    public static final Unit w0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.g.f26091a);
        return Unit.f21506a;
    }

    public static final Unit x0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.b.f26086a);
        return Unit.f21506a;
    }

    public static final Unit y0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.h.f26092a);
        return Unit.f21506a;
    }

    public static final Unit z0(e1 e1Var) {
        e1Var.S0(e1Var.d(), u2.a.j.f26094a);
        return Unit.f21506a;
    }

    public final void S0(ls.g<u2.f> gVar, u2.a aVar) {
        u2.f fVar = (u2.f) gVar.i();
        if (fVar == null) {
            return;
        }
        if (Intrinsics.c(aVar, u2.a.b.f26086a)) {
            e(u2.c.b.f26121a);
            return;
        }
        if (Intrinsics.c(aVar, u2.a.C0515a.f26085a)) {
            e(u2.c.a.f26120a);
            return;
        }
        if (Intrinsics.c(aVar, u2.a.g.f26091a)) {
            gVar.p(fVar.a(u2.f.a.SelectFileFromDocuments).f(false));
            return;
        }
        if (Intrinsics.c(aVar, u2.a.h.f26092a)) {
            gVar.p(fVar.a(u2.f.a.SelectImageFromPhotoLibrary).f(false));
            return;
        }
        if (Intrinsics.c(aVar, u2.a.j.f26094a)) {
            gVar.p(fVar.a(u2.f.a.CheckCameraPermissions).f(false));
            return;
        }
        if (Intrinsics.c(aVar, u2.a.e.f26089a)) {
            gVar.p(fVar.f(true));
            return;
        }
        if (Intrinsics.c(aVar, u2.a.c.f26087a)) {
            gVar.p(fVar.f(false));
            return;
        }
        if (aVar instanceof u2.a.RemoveDocument) {
            if (fVar instanceof u2.f.ReviewCaptures) {
                u2.a.RemoveDocument removeDocument = (u2.a.RemoveDocument) aVar;
                gVar.p(u2.f.i(fVar, new u2.f.InterfaceC0518f.DeleteFiles(removeDocument.getDocumentId()), null, null, removeDocument.getDocument(), 6, null));
                return;
            }
            return;
        }
        if (Intrinsics.c(aVar, u2.a.d.f26088a)) {
            if (fVar instanceof u2.f.ReviewCaptures) {
                gVar.p(u2.f.ReviewCaptures.p((u2.f.ReviewCaptures) fVar, null, null, null, null, null, false, false, null, 127, null));
            }
        } else {
            if (!(aVar instanceof u2.a.Submit)) {
                throw new zt.l();
            }
            u2.a.Submit submit = (u2.a.Submit) aVar;
            gVar.p(new u2.f.UploadDocument(fVar.l(), submit.getDocumentId(), new u2.f.InterfaceC0518f.ReadyToSubmit(submit.getDocumentId()), null, 8, null));
        }
    }

    public final void T0(u2.f.a aVar, final u2.Input input, final u2.f fVar) {
        int i10 = d.b[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return;
        }
        if (i10 == 3) {
            d().n(this.documentCameraWorker, new Function1() { // from class: qo.p0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e1.V0(this.f30138a, input, (no.c.b) obj);
                }
            });
        } else {
            if (i10 != 4 && i10 != 5) {
                throw new zt.l();
            }
            d().n(fVar.getCaptureState() == u2.f.a.SelectFileFromDocuments ? this.documentsSelectWorkerFactory.c() : this.documentsSelectWorkerFactory.e(), new Function1() { // from class: qo.q0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e1.W0(this.f30140a, input, fVar, (y2.c) obj);
                }
            });
        }
    }

    public final void U0(final u2.f.InterfaceC0518f interfaceC0518f, final u2.Input input, u2.f fVar) {
        if (Intrinsics.c(interfaceC0518f, u2.f.InterfaceC0518f.a.f26196a)) {
            if (fVar.getDocumentId() != null) {
                return;
            }
            d().n(this.documentCreateWorkerFactory.a(input.getSessionToken(), input.getKind(), input.getFieldKeyDocument(), input.getDocumentFileLimit()), new Function1() { // from class: qo.r0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e1.X0(this.f30142a, (com.withpersona.sdk2.inquiry.document.network.a.b) obj);
                }
            });
            return;
        }
        if (!(interfaceC0518f instanceof u2.f.InterfaceC0518f.UploadFiles)) {
            if (!(interfaceC0518f instanceof u2.f.InterfaceC0518f.DeleteFiles)) {
                if (!(interfaceC0518f instanceof u2.f.InterfaceC0518f.ReadyToSubmit)) {
                    throw new zt.l();
                }
                return;
            } else {
                if (fVar instanceof u2.f.ReviewCaptures) {
                    u2.f.ReviewCaptures reviewCaptures = (u2.f.ReviewCaptures) fVar;
                    no.e documentFileToDelete = reviewCaptures.getDocumentFileToDelete();
                    final no.e.Remote remote = documentFileToDelete instanceof no.e.Remote ? (no.e.Remote) documentFileToDelete : null;
                    if (remote == null) {
                        return;
                    }
                    d().n(this.documentFileDeleteWorkerFactory.a(input.getSessionToken(), reviewCaptures.getDocumentId(), remote), new Function1() { // from class: qo.u0
                        @Override // p001kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return e1.Z0(this.f30149a, remote, interfaceC0518f, (po.a.b) obj);
                        }
                    });
                    return;
                }
                return;
            }
        }
        List<no.e> listL = fVar.l();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            if (obj instanceof no.e.Local) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            d().m("upload_complete", new f(interfaceC0518f, null));
            return;
        }
        for (final no.e.Local local : CollectionsKt.H0(arrayList, 3)) {
            ls.g<u2.f> gVarD = d();
            com.withpersona.sdk2.inquiry.document.network.c.a aVar = this.documentFileUploadWorkerFactory;
            String sessionToken = input.getSessionToken();
            String documentId = ((u2.f.InterfaceC0518f.UploadFiles) interfaceC0518f).getDocumentId();
            boolean z10 = true;
            if (input.getDocumentFileLimit() != 1) {
                z10 = false;
            }
            gVarD.n(ls.i.a(aVar.a(sessionToken, documentId, local, z10), local.getAbsoluteFilePath()), new Function1() { // from class: qo.t0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return e1.Y0(this.f30145a, interfaceC0518f, local, input, obj2);
                }
            });
        }
    }

    public final List<Pair<String, Function1<x5, Unit>>> b0(no.w wVar) {
        return new or.c.a().a(wVar.getSelectDocumentButton(), new Function1() { // from class: qo.l0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.d0(this.f30130a, (x5) obj);
            }
        }).a(wVar.getSelectPhotoButton(), new Function1() { // from class: qo.m0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.e0(this.f30132a, (x5) obj);
            }
        }).a(wVar.getTakePhotoButton(), new Function1() { // from class: qo.n0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.f0(this.f30134a, (x5) obj);
            }
        }).a(wVar.getLaunchUploadOptionsButton(), new Function1() { // from class: qo.o0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.g0(this.f30136a, (x5) obj);
            }
        }).b();
    }

    public final List<Pair<String, Function1<x5, Unit>>> c0(f3 f3Var) {
        return new or.c.a().a(f3Var.getSelectDocumentButton(), new Function1() { // from class: qo.v0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.h0(this.f30152a, (x5) obj);
            }
        }).a(f3Var.getSelectPhotoButton(), new Function1() { // from class: qo.w0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.i0(this.f30154a, (x5) obj);
            }
        }).a(f3Var.getTakePhotoButton(), new Function1() { // from class: qo.x0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.j0(this.f30156a, (x5) obj);
            }
        }).b();
    }

    @NotNull
    public final u2.f k0(@NotNull u2.Input props) {
        Intrinsics.checkNotNullParameter(props, "props");
        u2.e startPage = props.getStartPage();
        if (Intrinsics.c(startPage, u2.e.a.f26161a)) {
            return new u2.f.Start(null, null, props.getDocumentId(), false, 11, null);
        }
        if (!(startPage instanceof u2.e.Review)) {
            throw new zt.l();
        }
        return new u2.f.ReviewCaptures(p001kotlin.collections.p.k(), ((u2.e.Review) props.getStartPage()).getDocumentId(), null, null, null, true, false, null, 220, null);
    }

    public final void l0(u2.Input renderProps, final u2.f renderState) {
        u2.d bVar;
        ir.b.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !(renderState instanceof u2.f.UploadDocument), false, 8, null);
        T0(renderState.getCaptureState(), renderProps, renderState);
        U0(renderState.getUploadState(), renderProps, renderState);
        no.a0.a(this.externalEventLogger, this.trackingEventsLogger, renderProps, renderState);
        if (renderState instanceof u2.f.Start) {
            u2.f.Start start = (u2.f.Start) renderState;
            bVar = new no.j(or.d.a(renderProps.getPages().getDocumentStartPage()), b0(renderProps.getPages().getDocumentStartPage()), this.navigationStateManager.b(), new Function0() { // from class: qo.w
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.m0(this.f30153a);
                }
            }, new Function0() { // from class: qo.o
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.x0(this.f30135a);
                }
            }, start.getShouldShowUploadOptionsDialog() ? or.v.f28513a.j(or.d.a(renderProps.getPages().getUploadOptionsDialog()), c0(renderProps.getPages().getUploadOptionsDialog()), new Function0() { // from class: qo.a0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.I0(this.f30038a);
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()) : null, renderProps.getPromptPageNavBarTitle(), renderProps.getStyles());
            if (start.getCaptureState() == u2.f.a.CheckCameraPermissions) {
                ls.g<u2.f> gVarD = d();
                hq.i.a aVar = this.permissionRequestWorker;
                fq.n0 n0Var = fq.n0.Camera;
                String permissionsTitle = renderProps.getPermissionsTitle();
                String str = permissionsTitle == null ? BuildConfig.FLAVOR : permissionsTitle;
                String permissionsRationale = renderProps.getPermissionsRationale();
                if (permissionsRationale == null) {
                    permissionsRationale = this.applicationContext.getString(jq.g.f20876f);
                    Intrinsics.checkNotNullExpressionValue(permissionsRationale, "getString(...)");
                }
                String str2 = permissionsRationale;
                Context context = this.applicationContext;
                String string = context.getString(jq.g.f20875e, xq.g.b(context));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                gVarD.n(aVar.a(new n1.Props(n0Var, false, str, str2, string, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: qo.d0
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e1.M0(this.f30045a, renderState, (hq.i.b) obj);
                    }
                });
            }
        } else if (renderState instanceof u2.f.ReviewCaptures) {
            u2.f.ReviewCaptures reviewCaptures = (u2.f.ReviewCaptures) renderState;
            if (reviewCaptures.getShouldLoadDocuments()) {
                d().n(this.documentLoadWorker.a(renderProps.getSessionToken(), reviewCaptures.getDocumentId()), new Function1() { // from class: qo.e0
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e1.N0(this.f30047a, (com.withpersona.sdk2.inquiry.document.network.e.b) obj);
                    }
                });
            }
            if (reviewCaptures.getCaptureState() == u2.f.a.CheckCameraPermissions) {
                ls.g<u2.f> gVarD2 = d();
                hq.i.a aVar2 = this.permissionRequestWorker;
                fq.n0 n0Var2 = fq.n0.Camera;
                String permissionsTitle2 = renderProps.getPermissionsTitle();
                String str3 = permissionsTitle2 == null ? BuildConfig.FLAVOR : permissionsTitle2;
                String permissionsRationale2 = renderProps.getPermissionsRationale();
                if (permissionsRationale2 == null) {
                    permissionsRationale2 = this.applicationContext.getString(jq.g.f20876f);
                    Intrinsics.checkNotNullExpressionValue(permissionsRationale2, "getString(...)");
                }
                String str4 = permissionsRationale2;
                Context context2 = this.applicationContext;
                String string2 = context2.getString(jq.g.f20875e, xq.g.b(context2));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                gVarD2.n(aVar2.a(new n1.Props(n0Var2, false, str3, str4, string2, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: qo.f0
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e1.O0(this.f30075a, renderState, (hq.i.b) obj);
                    }
                });
            }
            bVar = new u2.d.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCaptures.l(), this.navigationStateManager.b(), new Function0() { // from class: qo.i0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.Q0(this.f30124a);
                }
            }, new Function0() { // from class: qo.j0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.R0(this.f30126a);
                }
            }, new Function0() { // from class: qo.k0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.n0(this.f30128a);
                }
            }, new Function0() { // from class: qo.h0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.o0(this.f30120a);
                }
            }, new Function1() { // from class: qo.s0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e1.p0(this.f30143a, renderState, (no.e.Remote) obj);
                }
            }, new Function0() { // from class: qo.y0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.q0(this.f30158a, renderState);
                }
            }, new Function0() { // from class: qo.z0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.r0(this.f30160a);
                }
            }, new Function0() { // from class: qo.a1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.s0(this.f30039a);
                }
            }, reviewCaptures.getShouldLoadDocuments(), reviewCaptures.l().size() < renderProps.getDocumentFileLimit(), !reviewCaptures.l().isEmpty() && Intrinsics.c(reviewCaptures.getUploadState(), new u2.f.InterfaceC0518f.ReadyToSubmit(reviewCaptures.getDocumentId())), reviewCaptures.getError(), new Function0() { // from class: qo.b1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.t0(this.f30041a);
                }
            }, renderProps.getStyles(), renderProps.getCheckPageNavBarTitle(), reviewCaptures.getShouldShowUploadOptionsDialog() ? or.v.f28513a.j(or.d.a(renderProps.getPages().getUploadOptionsDialog()), c0(renderProps.getPages().getUploadOptionsDialog()), new Function0() { // from class: qo.g0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.P0(this.f30117a);
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()) : null);
        } else if (renderState instanceof u2.f.ReviewCapturesWithoutDocumentId) {
            u2.f.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (u2.f.ReviewCapturesWithoutDocumentId) renderState;
            String documentId = reviewCapturesWithoutDocumentId.getDocumentId();
            if (documentId != null) {
                d().m(documentId, new e(documentId, null));
            }
            if (reviewCapturesWithoutDocumentId.getCaptureState() == u2.f.a.CheckCameraPermissions) {
                ls.g<u2.f> gVarD3 = d();
                hq.i.a aVar3 = this.permissionRequestWorker;
                fq.n0 n0Var3 = fq.n0.Camera;
                String permissionsTitle3 = renderProps.getPermissionsTitle();
                String str5 = permissionsTitle3 == null ? BuildConfig.FLAVOR : permissionsTitle3;
                String permissionsRationale3 = renderProps.getPermissionsRationale();
                if (permissionsRationale3 == null) {
                    permissionsRationale3 = this.applicationContext.getString(jq.g.f20876f);
                    Intrinsics.checkNotNullExpressionValue(permissionsRationale3, "getString(...)");
                }
                String str6 = permissionsRationale3;
                Context context3 = this.applicationContext;
                String string3 = context3.getString(jq.g.f20875e, xq.g.b(context3));
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                gVarD3.n(aVar3.a(new n1.Props(n0Var3, false, str5, str6, string3, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), null, null, null, renderProps.getStyles(), 898, null)), new Function1() { // from class: qo.c1
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e1.u0(this.f30044a, renderState, (hq.i.b) obj);
                    }
                });
            }
            bVar = new u2.d.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCapturesWithoutDocumentId.l(), this.navigationStateManager.b(), new Function0() { // from class: qo.m
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.w0(this.f30131a);
                }
            }, new Function0() { // from class: qo.n
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.y0(this.f30133a);
                }
            }, new Function0() { // from class: qo.p
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.z0(this.f30137a);
                }
            }, new Function0() { // from class: qo.q
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.A0(this.f30139a);
                }
            }, new Function1() { // from class: qo.r
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e1.B0((no.e.Remote) obj);
                }
            }, new Function0() { // from class: qo.s
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.C0();
                }
            }, new Function0() { // from class: qo.t
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.D0(this.f30144a);
                }
            }, new Function0() { // from class: qo.u
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.E0(this.f30148a);
                }
            }, reviewCapturesWithoutDocumentId.getReloadingFromPreviousSession(), reviewCapturesWithoutDocumentId.l().size() < renderProps.getDocumentFileLimit(), false, reviewCapturesWithoutDocumentId.getError(), new Function0() { // from class: qo.v
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.F0(this.f30151a);
                }
            }, renderProps.getStyles(), renderProps.getCheckPageNavBarTitle(), reviewCapturesWithoutDocumentId.getShouldShowUploadOptionsDialog() ? or.v.f28513a.j(or.d.a(renderProps.getPages().getUploadOptionsDialog()), c0(renderProps.getPages().getUploadOptionsDialog()), new Function0() { // from class: qo.d1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.v0(this.f30046a);
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()) : null);
        } else {
            if (!(renderState instanceof u2.f.UploadDocument)) {
                throw new zt.l();
            }
            d().n(this.documentSubmitWorker.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), ((u2.f.UploadDocument) renderState).l()), new Function1() { // from class: qo.x
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e1.G0(this.f30155a, (com.withpersona.sdk2.inquiry.document.network.g.b) obj);
                }
            });
            ir.b.d(this.navigationStateManager, false, false, false, false, 12, null);
            or.b customPendingPage = renderProps.getCustomPendingPage();
            bVar = customPendingPage != null ? new u2.d.b(or.d.a(customPendingPage), this.navigationStateManager.b(), renderProps.getStyles(), new Function0() { // from class: qo.y
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.H0(this.f30157a);
                }
            }, new Function0() { // from class: qo.z
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.J0(this.f30159a);
                }
            }, renderProps.getPendingPageNavBarTitle(), null, 64, null) : new u2.d.LoadingAnimation(renderProps.getPendingTitle(), renderProps.getPendingDescription(), this.navigationStateManager.b(), new Function0() { // from class: qo.b0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.K0(this.f30040a);
                }
            }, new Function0() { // from class: qo.c0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e1.L0(this.f30043a);
                }
            }, renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), renderProps.getPendingPageTextVerticalPosition(), renderProps.getPendingPageNavBarTitle(), null, Barcode.FORMAT_UPC_A, null);
        }
        c().setValue(bVar);
    }
}
