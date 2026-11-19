package ep;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import vo.EnabledIdClass;
import vo.Frame;
import vo.IdConfig;
import vo.b3;
import vo.d2;
import vo.i3;
import vo.p3;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001fB\u0097\u0001\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0003H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020+H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020+H\u0002¢\u0006\u0004\b2\u00101J\u001b\u00104\u001a\u000203*\u00020\u00032\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0002¢\u0006\u0004\b7\u00108J\u001d\u0010=\u001a\u00020+2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020+¢\u0006\u0004\b?\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R \u0010e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006g"}, d2 = {"Lep/f1;", "Lls/d;", "Lvo/d2$a;", "Lvo/j0;", "Lvo/d2$b;", "Lvo/y3;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Ll6/s;", "imageLoader", "Ldp/f$a;", "submitVerificationWorkerFactory", "Lvo/j;", "documentSelectWorker", "Lfp/v0;", "localVideoCaptureRenderer", "Lfp/j1;", "webRtcRenderer", "Lfp/m0;", "captureRenderer", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "autoClassifyWorkerFactory", "Lfp/i;", "autoClassificationRenderer", "Lyn/a;", "cameraStatsManager", "Lir/b;", "navigationStateManager", "Ldr/c;", "externalEventLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lgr/b;", "themeManager", "Lav/p0;", "coroutineScope", "<init>", "(Lvo/d2$a;Landroidx/lifecycle/l0;Landroid/content/Context;Ll6/s;Ldp/f$a;Lvo/j;Lfp/v0;Lfp/j1;Lfp/m0;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Lfp/i;Lyn/a;Lir/b;Ldr/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lgr/b;Lav/p0;)V", "renderProps", "renderState", BuildConfig.FLAVOR, "d0", "(Lvo/d2$a;Lvo/j0;Leu/b;)Ljava/lang/Object;", "g0", "(Lvo/d2$a;Lvo/j0;)Lvo/y3;", "c0", "()V", "Z", BuildConfig.FLAVOR, "V0", "(Lvo/j0;Lvo/d2$a;)Z", "props", "a0", "(Lvo/d2$a;)Lvo/j0;", "Ljava/io/File;", "file", "Lsn/v;", "cameraProperties", "f0", "(Ljava/io/File;Lsn/v;)V", "e0", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Ll6/s;", "h", "Ldp/f$a;", "i", "Lvo/j;", "j", "Lfp/v0;", "k", "Lfp/j1;", "l", "Lfp/m0;", "m", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;", "n", "Lfp/i;", "o", "Lyn/a;", "p", "Lir/b;", "q", "Ldr/c;", "r", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "s", "Lgr/b;", "Lip/l;", "t", "Lip/l;", "videoCaptureHelper", "Lxu/c;", "u", "Lxu/c;", "previousStateClass", "c", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f1 extends ls.d<d2.a, vo.j0, d2.b, y3> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.p000lifecycle.l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l6.s imageLoader;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dp.f.a submitVerificationWorkerFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final vo.j documentSelectWorker;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fp.v0 localVideoCaptureRenderer;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fp.j1 webRtcRenderer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fp.m0 captureRenderer;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AutoClassifyWorker.b autoClassifyWorkerFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fp.i autoClassificationRenderer;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yn.a cameraStatsManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.b navigationStateManager;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dr.c externalEventLogger;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gr.b themeManager;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ip.l videoCaptureHelper;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public xu.c<? extends vo.j0> previousStateClass;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$1$1", f = "GovernmentIdStepStateManager.kt", l = {119}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13917t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ vo.j0 f13919v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vo.j0 j0Var, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f13919v = j0Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return f1.this.new a(this.f13919v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f13917t;
            if (i10 == 0) {
                zt.o.b(obj);
                f1 f1Var = f1.this;
                d2.a value = f1Var.b().getValue();
                vo.j0 j0Var = this.f13919v;
                this.f13917t = 1;
                if (f1Var.d0(value, j0Var, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$2", f = "GovernmentIdStepStateManager.kt", l = {123}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13920t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f1 f13922a;

            public a(f1 f1Var) {
                this.f13922a = f1Var;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(d2.a aVar, eu.b<? super Unit> bVar) {
                Object objD0;
                f1 f1Var = this.f13922a;
                vo.j0 j0Var = (vo.j0) f1Var.d().i();
                return (j0Var != null && (objD0 = f1Var.d0(aVar, j0Var, bVar)) == fu.c.e()) ? objD0 : Unit.f21506a;
            }
        }

        public b(eu.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return f1.this.new b(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f13920t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.c0<d2.a> c0VarB = f1.this.b();
                a aVar = new a(f1.this);
                this.f13920t = 1;
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lep/f1$c;", BuildConfig.FLAVOR, "Lvo/d2$a;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lep/f1;", "a", "(Lvo/d2$a;Landroidx/lifecycle/l0;)Lep/f1;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        @NotNull
        f1 a(@NotNull d2.a initialProps, @NotNull androidx.p000lifecycle.l0 savedStateHandle);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13923a;

        static {
            int[] iArr = new int[IdConfig.e.values().length];
            try {
                iArr[IdConfig.e.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdConfig.e.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdConfig.e.FrontOrBack.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdConfig.e.BarcodePdf417.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdConfig.e.PassportSignature.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f13923a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$handleState$2", f = "GovernmentIdStepStateManager.kt", l = {223}, m = "invokeSuspend")
    public static final class e extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13924t;

        public e(eu.b<? super e> bVar) {
            super(1, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return f1.this.new e(bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f13924t;
            if (i10 == 0) {
                zt.o.b(obj);
                sn.m mVar = sn.m.f31643a;
                Context context = f1.this.applicationContext;
                this.f13924t = 1;
                if (mVar.b(context, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            f1.this.videoCaptureHelper.a();
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$handleState$3", f = "GovernmentIdStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class f extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13926t;

        public f(eu.b<? super f> bVar) {
            super(1, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return f1.this.new f(bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f13926t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            f1.this.e(new d2.b.c(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$handleState$4", f = "GovernmentIdStepStateManager.kt", l = {241}, m = "invokeSuspend")
    public static final class g extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13928t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ y3 f13930v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(y3 y3Var, eu.b<? super g> bVar) {
            super(2, bVar);
            this.f13930v = y3Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return f1.this.new g(this.f13930v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f13928t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.c0<y3> c0VarC = f1.this.c();
                y3 y3Var = this.f13930v;
                this.f13928t = 1;
                if (c0VarC.emit(y3Var, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class h implements ln.h, p001kotlin.jvm.internal.h {
        public h() {
        }

        @Override // p001kotlin.jvm.internal.h
        public final zt.b<?> b() {
            return new p001kotlin.jvm.internal.k(1, f1.this, f1.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        @Override // ln.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void a(d2.b p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            f1.this.e(p8);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ln.h) && (obj instanceof p001kotlin.jvm.internal.h)) {
                return Intrinsics.c(b(), ((p001kotlin.jvm.internal.h) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class i implements ln.h, p001kotlin.jvm.internal.h {
        public i() {
        }

        @Override // p001kotlin.jvm.internal.h
        public final zt.b<?> b() {
            return new p001kotlin.jvm.internal.k(1, f1.this, f1.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        @Override // ln.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void a(d2.b p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            f1.this.e(p8);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ln.h) && (obj instanceof p001kotlin.jvm.internal.h)) {
                return Intrinsics.c(b(), ((p001kotlin.jvm.internal.h) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class j extends p001kotlin.jvm.internal.k implements Function1<d2.b, Unit> {
        public j(Object obj) {
            super(1, obj, f1.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        public final void d(d2.b p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            ((f1) this.receiver).e(p8);
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(d2.b bVar) {
            d(bVar);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$renderScreen$1", f = "GovernmentIdStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class k extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13933t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ d2.a f13934u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ vo.j0 f13935v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ f1 f13936w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(d2.a aVar, vo.j0 j0Var, f1 f1Var, eu.b<? super k> bVar) {
            super(1, bVar);
            this.f13934u = aVar;
            this.f13935v = j0Var;
            this.f13936w = f1Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return new k(this.f13934u, this.f13935v, this.f13936w, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f13933t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            if (this.f13934u.o().size() == 1) {
                vo.j0 j0Var = this.f13935v;
                f1 f1Var = this.f13936w;
                d2.a aVar = this.f13934u;
                f1.T0(j0Var, f1Var, aVar, (IdConfig) CollectionsKt.d0(aVar.o()), false);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((k) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class l extends p001kotlin.jvm.internal.k implements Function1<d2.b, Unit> {
        public l(Object obj) {
            super(1, obj, f1.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        public final void d(d2.b p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            ((f1) this.receiver).e(p8);
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(d2.b bVar) {
            d(bVar);
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class m extends p001kotlin.jvm.internal.a implements Function1<IdConfig, Unit> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ vo.j0 f13937h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ f1 f13938i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ d2.a f13939j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(vo.j0 j0Var, f1 f1Var, d2.a aVar) {
            super(1, Intrinsics.a.class, "selectIdClass", "renderScreen$selectIdClass(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepStateManager;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V", 0);
            this.f13937h = j0Var;
            this.f13938i = f1Var;
            this.f13939j = aVar;
        }

        public final void a(IdConfig p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            f1.U0(this.f13937h, this.f13938i, this.f13939j, p8, false, 16, null);
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdConfig idConfig) {
            a(idConfig);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$renderScreen$42", f = "GovernmentIdStepStateManager.kt", l = {899}, m = "invokeSuspend")
    public static final class n extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13940t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ vo.j0 f13942v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(vo.j0 j0Var, eu.b<? super n> bVar) {
            super(1, bVar);
            this.f13942v = j0Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return f1.this.new n(this.f13942v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f13940t;
            if (i10 == 0) {
                zt.o.b(obj);
                sn.m mVar = sn.m.f31643a;
                Context context = f1.this.applicationContext;
                this.f13940t = 1;
                if (mVar.b(context, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            f1.this.videoCaptureHelper.a();
            f1.this.d().p(this.f13942v);
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((n) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(@NotNull d2.a initialProps, @NotNull androidx.p000lifecycle.l0 savedStateHandle, @NotNull Context applicationContext, @NotNull l6.s imageLoader, @NotNull dp.f.a submitVerificationWorkerFactory, @NotNull vo.j documentSelectWorker, @NotNull fp.v0 localVideoCaptureRenderer, @NotNull fp.j1 webRtcRenderer, @NotNull fp.m0 captureRenderer, @NotNull AutoClassifyWorker.b autoClassifyWorkerFactory, @NotNull fp.i autoClassificationRenderer, @NotNull yn.a cameraStatsManager, @NotNull ir.b navigationStateManager, @NotNull dr.c externalEventLogger, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull gr.b themeManager, @NotNull final av.p0 coroutineScope) {
        super(initialProps, savedStateHandle, coroutineScope);
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(submitVerificationWorkerFactory, "submitVerificationWorkerFactory");
        Intrinsics.checkNotNullParameter(documentSelectWorker, "documentSelectWorker");
        Intrinsics.checkNotNullParameter(localVideoCaptureRenderer, "localVideoCaptureRenderer");
        Intrinsics.checkNotNullParameter(webRtcRenderer, "webRtcRenderer");
        Intrinsics.checkNotNullParameter(captureRenderer, "captureRenderer");
        Intrinsics.checkNotNullParameter(autoClassifyWorkerFactory, "autoClassifyWorkerFactory");
        Intrinsics.checkNotNullParameter(autoClassificationRenderer, "autoClassificationRenderer");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(themeManager, "themeManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.savedStateHandle = savedStateHandle;
        this.applicationContext = applicationContext;
        this.imageLoader = imageLoader;
        this.submitVerificationWorkerFactory = submitVerificationWorkerFactory;
        this.documentSelectWorker = documentSelectWorker;
        this.localVideoCaptureRenderer = localVideoCaptureRenderer;
        this.webRtcRenderer = webRtcRenderer;
        this.captureRenderer = captureRenderer;
        this.autoClassifyWorkerFactory = autoClassifyWorkerFactory;
        this.autoClassificationRenderer = autoClassificationRenderer;
        this.cameraStatsManager = cameraStatsManager;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.trackingEventsLogger = trackingEventsLogger;
        this.themeManager = themeManager;
        this.videoCaptureHelper = new ip.l(null, 1, null);
        if (d().i() == null) {
            f(a0(b().getValue()));
        }
        d().o(new Function1() { // from class: ep.s
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f1.T(coroutineScope, this, (vo.j0) obj);
            }
        });
        av.k.d(coroutineScope, av.g1.d(), null, new b(null), 2, null);
    }

    public static final Unit A0(f1 f1Var) {
        f1Var.e(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit B0(f1 f1Var) {
        f1Var.e(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit C0(f1 f1Var) {
        f1Var.e(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit D0(f1 f1Var) {
        f1Var.e(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit E0(f1 f1Var) {
        f1Var.e(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit F0(f1 f1Var) {
        f1Var.e(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit G0(f1 f1Var, d2.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f1Var.e(it);
        return Unit.f21506a;
    }

    public static final Unit H0(f1 f1Var, d2.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f1Var.e(it);
        return Unit.f21506a;
    }

    public static final Unit I0(f1 f1Var, d2.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f1Var.e(it);
        return Unit.f21506a;
    }

    public static final Unit J0(f1 f1Var, d2.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f1Var.e(it);
        return Unit.f21506a;
    }

    public static final Unit K0(f1 f1Var) {
        f1Var.c0();
        return Unit.f21506a;
    }

    public static final Unit L0(f1 f1Var, d2.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f1Var.e(it);
        return Unit.f21506a;
    }

    public static final Unit M0(f1 f1Var, d2.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f1Var.e(it);
        return Unit.f21506a;
    }

    public static final Unit N0(f1 f1Var) {
        f1Var.Z();
        return Unit.f21506a;
    }

    public static final Unit O0(f1 f1Var, vo.j0 j0Var) {
        f1Var.f(vo.j0.ShowInstructions.H((vo.j0.ShowInstructions) j0Var, null, null, null, null, 0, null, null, null, 127, null));
        return Unit.f21506a;
    }

    public static final Unit P0(f1 f1Var, vo.j0 j0Var, i3.SideIdPart sideIdPart, vo.j.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof vo.j.a.c) {
            vo.j.a.c cVar = (vo.j.a.c) it;
            S0(sideIdPart, j0Var, f1Var, cVar.getAbsoluteFilePath(), cVar.getFileName());
        } else if (Intrinsics.c(it, vo.j.a.C0712a.f34672a)) {
            f1Var.f(vo.j0.ChooseCaptureMethod.H((vo.j0.ChooseCaptureMethod) j0Var, null, null, null, 0, null, null, false, null, null, 447, null));
        } else {
            if (!(it instanceof vo.j.a.b)) {
                throw new zt.l();
            }
            f1Var.e(new d2.b.c(((vo.j.a.b) it).getCause()));
        }
        return Unit.f21506a;
    }

    public static final Unit Q0(final f1 f1Var, vo.j0 j0Var, d2.a aVar) {
        ls.h hVarI = f1Var.d().i();
        vo.j0.ChooseCaptureMethod chooseCaptureMethod = hVarI instanceof vo.j0.ChooseCaptureMethod ? (vo.j0.ChooseCaptureMethod) hVarI : null;
        if (chooseCaptureMethod == null) {
            return Unit.f21506a;
        }
        vo.j0.ChooseCaptureMethod chooseCaptureMethod2 = (vo.j0.ChooseCaptureMethod) j0Var;
        f1Var.f(new vo.j0.WaitForAutocapture(chooseCaptureMethod2.getCurrentPart(), chooseCaptureMethod2.D(), chooseCaptureMethod2.getCaptureConfig(), b3.O(aVar, chooseCaptureMethod2.getCurrentPart().getSide()), chooseCaptureMethod.C(), chooseCaptureMethod.getPartIndex(), ep.e.e(f1Var.d(), false), ip.x.Disconnected, aVar.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, chooseCaptureMethod2.getCountryCode(), null, new Function0() { // from class: ep.x0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f1.R0(this.f14038a);
            }
        }, 11776, null));
        return Unit.f21506a;
    }

    public static final Unit R0(f1 f1Var) {
        ls.h hVarI = f1Var.d().i();
        vo.j0.WaitForAutocapture waitForAutocapture = hVarI instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) hVarI : null;
        if (waitForAutocapture != null) {
            f1Var.f(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, f1Var.videoCaptureHelper.d() ? ip.x.Connected : ip.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f21506a;
    }

    public static final void S0(i3.SideIdPart sideIdPart, vo.j0 j0Var, f1 f1Var, String str, String str2) {
        List listD = p001kotlin.collections.o.d(new Frame(str, null, 2, null));
        vo.n.d dVarE0 = b3.e0(sideIdPart.getSide());
        vo.j0.ChooseCaptureMethod chooseCaptureMethod = (vo.j0.ChooseCaptureMethod) j0Var;
        vo.n.GovernmentIdImage governmentIdImage = new vo.n.GovernmentIdImage(listD, dVarE0, vo.g.b(chooseCaptureMethod.getCaptureConfig()), vo.n.a.f34839c, null, null, 32, null);
        ls.h hVarI = f1Var.d().i();
        vo.j0.ChooseCaptureMethod chooseCaptureMethod2 = hVarI instanceof vo.j0.ChooseCaptureMethod ? (vo.j0.ChooseCaptureMethod) hVarI : null;
        if (chooseCaptureMethod2 == null) {
            return;
        }
        f1Var.f(new vo.j0.ReviewSelectedImage(chooseCaptureMethod.getCurrentPart(), chooseCaptureMethod.D(), chooseCaptureMethod.getCaptureConfig(), governmentIdImage, str2, chooseCaptureMethod2.C(), chooseCaptureMethod2.getPartIndex(), ep.e.e(f1Var.d(), false), null, null, false, chooseCaptureMethod.getCountryCode(), 1792, null));
    }

    public static final Unit T(av.p0 p0Var, f1 f1Var, vo.j0 j0Var) {
        if (j0Var == null) {
            return Unit.f21506a;
        }
        av.k.d(p0Var, av.g1.d(), null, f1Var.new a(j0Var, null), 2, null);
        return Unit.f21506a;
    }

    public static final void T0(vo.j0 j0Var, f1 f1Var, d2.a aVar, IdConfig idConfig, boolean z10) {
        ep.e.s((vo.j0.ShowInstructions) j0Var, f1Var.d(), aVar, null, idConfig, f1Var.videoCaptureHelper, new sn.v(null, null, null, 0, 0, 31, null), z10, idConfig.f(), 0, null, null, 3584, null);
    }

    public static /* synthetic */ void U0(vo.j0 j0Var, f1 f1Var, d2.a aVar, IdConfig idConfig, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        T0(j0Var, f1Var, aVar, idConfig, z10);
    }

    public static final Unit b0(f1 f1Var) {
        ls.h hVarI = f1Var.d().i();
        vo.j0.WaitForAutocapture waitForAutocapture = hVarI instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) hVarI : null;
        if (waitForAutocapture != null) {
            f1Var.f(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, f1Var.videoCaptureHelper.d() ? ip.x.Connected : ip.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f21506a;
    }

    public static final Unit h0(f1 f1Var, vo.j0 j0Var) {
        f1Var.documentSelectWorker.g();
        f1Var.f(vo.j0.ChooseCaptureMethod.H((vo.j0.ChooseCaptureMethod) j0Var, null, null, null, 0, null, null, true, null, null, 447, null));
        return Unit.f21506a;
    }

    public static final Unit i0(f1 f1Var) {
        f1Var.c0();
        return Unit.f21506a;
    }

    public static final Unit j0(f1 f1Var) {
        f1Var.Z();
        return Unit.f21506a;
    }

    public static final Unit k0(f1 f1Var, vo.j0 j0Var) {
        f1Var.f(vo.j0.ChooseCaptureMethod.H((vo.j0.ChooseCaptureMethod) j0Var, null, null, null, 0, null, null, false, null, null, 255, null));
        return Unit.f21506a;
    }

    public static final Unit l0(f1 f1Var, d2.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f1Var.e(it);
        return Unit.f21506a;
    }

    public static final Unit m0(f1 f1Var, d2.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f1Var.e(it);
        return Unit.f21506a;
    }

    public static final Unit n0(d2.a aVar, vo.j0 j0Var, f1 f1Var) {
        ep.e.u(aVar, (vo.j0.j) j0Var, f1Var.d(), f1Var.videoCaptureHelper, f1Var.trackingEventsLogger);
        return Unit.f21506a;
    }

    public static final Unit o0(final f1 f1Var, vo.j0 j0Var, d2.a aVar, vo.f fVar) {
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(f1Var.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.RETAKE_PHOTO, null, 2, null), false, 2, null);
        vo.j0 j0Var2 = (vo.j0) f1Var.d().i();
        if (j0Var2 != null) {
            vo.j0.ReviewCapturedImage reviewCapturedImage = (vo.j0.ReviewCapturedImage) j0Var;
            vo.j0.WaitForAutocapture waitForAutocapture = new vo.j0.WaitForAutocapture(reviewCapturedImage.getCurrentPart(), j0Var2.D(), fVar, b3.O(aVar, reviewCapturedImage.getCurrentPart().getSide()), j0Var2.C(), j0Var2.getPartIndex(), ep.e.e(f1Var.d(), false), f1Var.videoCaptureHelper.d() ? ip.x.Connected : ip.x.Disconnected, aVar.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, reviewCapturedImage.getCountryCode(), null, new Function0() { // from class: ep.w0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.p0(this.f14036a);
                }
            }, 11776, null);
            waitForAutocapture.F(true);
            f1Var.f(waitForAutocapture);
        }
        return Unit.f21506a;
    }

    public static final Unit p0(f1 f1Var) {
        ls.h hVarI = f1Var.d().i();
        vo.j0.WaitForAutocapture waitForAutocapture = hVarI instanceof vo.j0.WaitForAutocapture ? (vo.j0.WaitForAutocapture) hVarI : null;
        if (waitForAutocapture != null) {
            f1Var.f(vo.j0.WaitForAutocapture.L(waitForAutocapture, null, null, null, null, null, 0, null, f1Var.videoCaptureHelper.d() ? ip.x.Connected : ip.x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f21506a;
    }

    public static final Unit q0(f1 f1Var) {
        f1Var.e(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit r0(f1 f1Var, vo.j0 j0Var) {
        f1Var.f(vo.j0.ReviewCapturedImage.N((vo.j0.ReviewCapturedImage) j0Var, null, null, null, null, null, 0, null, null, null, false, null, 1791, null));
        return Unit.f21506a;
    }

    public static final Unit s0(d2.a aVar, vo.j0 j0Var, f1 f1Var) {
        ep.e.u(aVar, (vo.j0.j) j0Var, f1Var.d(), f1Var.videoCaptureHelper, f1Var.trackingEventsLogger);
        return Unit.f21506a;
    }

    public static final Unit t0(f1 f1Var) {
        f1Var.c0();
        return Unit.f21506a;
    }

    public static final Unit u0(f1 f1Var) {
        f1Var.c0();
        return Unit.f21506a;
    }

    public static final Unit v0(f1 f1Var) {
        f1Var.Z();
        return Unit.f21506a;
    }

    public static final Unit w0(f1 f1Var, vo.j0 j0Var) {
        f1Var.f(vo.j0.ReviewSelectedImage.N((vo.j0.ReviewSelectedImage) j0Var, null, null, null, null, null, null, 0, null, null, null, false, null, 3583, null));
        return Unit.f21506a;
    }

    public static final Unit x0(f1 f1Var, vo.j0 j0Var, dp.f.b it) {
        vo.j0 backState;
        String string;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof dp.f.b.c) {
            f1Var.f(vo.j0.Submit.H((vo.j0.Submit) j0Var, null, null, null, null, 0, null, null, null, null, null, true, 1023, null));
            f1Var.e(d2.b.d.f34602a);
        } else {
            if (it instanceof dp.f.b.C0228b) {
                dp.f.b.C0228b c0228b = (dp.f.b.C0228b) it;
                if (c0228b.getCause() instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) {
                    string = f1Var.applicationContext.getString(jq.g.f20890t, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) c0228b.getCause()).getDetails().getMinDimensionSize()));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                } else {
                    string = f1Var.applicationContext.getString(jq.g.f20891u);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
                vo.j0 j0Var2 = (vo.j0) f1Var.d().i();
                backState = j0Var2 != null ? j0Var2.getBackState() : null;
                if (backState != null) {
                    f1Var.f(backState.u(string));
                }
            } else {
                if (!(it instanceof dp.f.b.a)) {
                    throw new zt.l();
                }
                vo.j0 j0Var3 = (vo.j0) f1Var.d().i();
                backState = j0Var3 != null ? j0Var3.getBackState() : null;
                dp.f.b.a aVar = (dp.f.b.a) it;
                if ((aVar.getCause() instanceof InternalErrorInfo.NetworkErrorInfo) && ((InternalErrorInfo.NetworkErrorInfo) aVar.getCause()).isRecoverable() && backState != null) {
                    String string2 = f1Var.applicationContext.getString(jq.g.B);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    f1Var.f(backState.u(string2));
                } else {
                    f1Var.f(vo.j0.Submit.H((vo.j0.Submit) j0Var, null, null, null, null, 0, null, null, null, null, null, true, 1023, null));
                    f1Var.e(new d2.b.c(aVar.getCause()));
                }
            }
        }
        return Unit.f21506a;
    }

    public static final Unit y0(f1 f1Var) {
        f1Var.e(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public static final Unit z0(f1 f1Var) {
        f1Var.e(d2.b.C0708b.f34600a);
        return Unit.f21506a;
    }

    public final boolean V0(vo.j0 j0Var, d2.a aVar) {
        if ((j0Var instanceof vo.j0.CountdownToCapture) || (j0Var instanceof vo.j0.f) || (j0Var instanceof vo.j0.WaitForAutocapture) || (j0Var instanceof vo.j0.FinalizeLocalVideoCapture) || (j0Var instanceof vo.j0.HolographicTorchDelay)) {
            return true;
        }
        if (j0Var instanceof vo.j0.ReviewCapturedImage) {
            return this.videoCaptureHelper.c(aVar) && aVar.getAutoClassificationConfig().getIsEnabled();
        }
        if ((j0Var instanceof vo.j0.ChooseCaptureMethod) || (j0Var instanceof vo.j0.ReviewSelectedImage) || (j0Var instanceof vo.j0.ShowInstructions) || (j0Var instanceof vo.j0.Submit) || (j0Var instanceof vo.j0.AutoClassificationError) || (j0Var instanceof vo.j0.AutoClassificationManualSelect) || (j0Var instanceof vo.j0.RestartStep)) {
            return false;
        }
        throw new zt.l();
    }

    public final void Z() {
        e(d2.b.C0708b.f34600a);
    }

    @NotNull
    public final vo.j0 a0(@NotNull d2.a props) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (!props.getAutoClassificationConfig().getIsEnabled()) {
            return new vo.j0.ShowInstructions(null, null, null, null, 0, props.getCountryCode(), null, null, 223, null);
        }
        if (props.u()) {
            return new vo.j0.ChooseCaptureMethod(new i3.SideIdPart(IdConfig.e.Front), p001kotlin.collections.p.k(), p001kotlin.collections.p.k(), 0, props.getCountryCode(), new vo.f.AutoClassifyConfig(props.getAutoClassificationConfig()), false, null, null, 320, null);
        }
        return new vo.j0.WaitForAutocapture(new i3.SideIdPart(IdConfig.e.Front), p001kotlin.collections.p.k(), new vo.f.AutoClassifyConfig(props.getAutoClassificationConfig()), props.getDesignVersion() == vo.i.K0000 ? y3.b.a.Hidden : y3.b.a.Enabled, p001kotlin.collections.p.k(), 0, null, ip.x.Disconnected, props.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, props.getCountryCode(), null, new Function0() { // from class: ep.v0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f1.b0(this.f14034a);
            }
        }, 11776, null);
    }

    public final void c0() {
        vo.j0 j0Var = (vo.j0) d().i();
        vo.j0 backState = j0Var != null ? j0Var.getBackState() : null;
        this.videoCaptureHelper.a();
        if (backState != null) {
            backState.F(true);
            f(backState);
        } else if (b().getValue().getBackStepEnabled()) {
            e(d2.b.a.f34599a);
        } else {
            e(d2.b.C0708b.f34600a);
        }
    }

    public final Object d0(d2.a aVar, vo.j0 j0Var, eu.b<? super Unit> bVar) {
        y3 y3VarG0 = g0(aVar, j0Var);
        if (!V0(j0Var, aVar)) {
            d().m("close_camera", new e(null));
        }
        if (!this.videoCaptureHelper.f(aVar) && xq.g.e(this.applicationContext)) {
            d().m("output_webrtc_error", new f(null));
        }
        Object objG = av.i.g(av.g1.c(), new g(y3VarG0, null), bVar);
        return objG == fu.c.e() ? objG : Unit.f21506a;
    }

    public final void e0() {
        this.videoCaptureHelper.a();
        this.cameraStatsManager.a();
    }

    public final void f0(@NotNull File file, @NotNull sn.v cameraProperties) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        ls.h hVarI = d().i();
        vo.j0.FinalizeLocalVideoCapture finalizeLocalVideoCapture = hVarI instanceof vo.j0.FinalizeLocalVideoCapture ? (vo.j0.FinalizeLocalVideoCapture) hVarI : null;
        if (finalizeLocalVideoCapture == null) {
            return;
        }
        d2.a value = b().getValue();
        TrackingEventsLogger.logVideoStopEvent$default(this.trackingEventsLogger, value.getFromStep(), "Upload", null, null, null, null, false, 124, null);
        List<vo.n> listD = finalizeLocalVideoCapture.D();
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(((vo.n) it.next()).getSide());
        }
        vo.n.d dVar = vo.n.d.FRONT;
        boolean zContains = arrayList.contains(dVar);
        vo.n.d dVar2 = vo.n.d.BACK;
        boolean zContains2 = arrayList.contains(dVar2);
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        List listD2 = p001kotlin.collections.o.d(new Frame(absolutePath, "video/*"));
        if (zContains && zContains2) {
            dVar = vo.n.d.FRONT_AND_BACK;
        } else if (!zContains && zContains2) {
            dVar = dVar2;
        }
        ep.e.s(finalizeLocalVideoCapture, d(), value, new vo.n.GovernmentIdVideo(listD2, dVar, finalizeLocalVideoCapture.getId().getIdClassKey(), vo.n.a.b), finalizeLocalVideoCapture.getId(), this.videoCaptureHelper, cameraProperties, false, null, 0, null, null, 3840, null);
    }

    public final y3 g0(final d2.a renderProps, final vo.j0 renderState) {
        dr.h takePhoto;
        final d2.a aVar;
        boolean z10;
        int i10;
        xu.c<? extends vo.j0> cVarB = p001kotlin.jvm.internal.d0.b(renderState.getClass());
        ir.b.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), renderProps.getIsEnabled() && !(renderState instanceof vo.j0.Submit), false, 8, null);
        boolean z11 = renderState instanceof vo.j0.AutoClassificationError;
        if (z11) {
            takePhoto = dr.h.a.f12631a;
        } else if (renderState instanceof vo.j0.AutoClassificationManualSelect) {
            takePhoto = dr.h.b.f12632a;
        } else if (renderState instanceof vo.j0.ShowInstructions) {
            takePhoto = dr.h.C0231h.f12638a;
        } else if (renderState instanceof vo.j0.ChooseCaptureMethod) {
            takePhoto = new dr.h.Prompt(((vo.j0.ChooseCaptureMethod) renderState).getPartIndex());
        } else if ((renderState instanceof vo.j0.WaitForAutocapture) || (renderState instanceof vo.j0.CountdownToCapture) || (renderState instanceof vo.j0.FinalizeLocalVideoCapture) || (renderState instanceof vo.j0.f) || (renderState instanceof vo.j0.HolographicTorchDelay)) {
            takePhoto = new dr.h.TakePhoto(renderState.getPartIndex());
        } else if (renderState instanceof vo.j0.ReviewCapturedImage) {
            takePhoto = new dr.h.Check(((vo.j0.ReviewCapturedImage) renderState).getPartIndex());
        } else if (renderState instanceof vo.j0.ReviewSelectedImage) {
            takePhoto = new dr.h.CheckUpload(((vo.j0.ReviewSelectedImage) renderState).getPartIndex());
        } else if (renderState instanceof vo.j0.Submit) {
            takePhoto = dr.h.e.f12635a;
        } else {
            if (!(renderState instanceof vo.j0.RestartStep)) {
                throw new zt.l();
            }
            takePhoto = dr.h.g.f12637a;
        }
        this.externalEventLogger.c(new dr.i.c(renderProps.getFromStep(), takePhoto));
        RemoteImage idFrontPictograph = null;
        if (!Intrinsics.c(this.previousStateClass, cVarB)) {
            TrackingEventsLogger.logInquiryPageViewEvent$default(this.trackingEventsLogger, renderProps.getFromStep(), takePhoto.toString(), false, 4, null);
            if (Intrinsics.c(cVarB, p001kotlin.jvm.internal.d0.b(vo.j0.WaitForAutocapture.class))) {
                TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
                GovIdCaptureState govIdCaptureState = GovIdCaptureState.LOADING;
                IdConfig.e eVarQ = b3.Q(renderState.getCurrentPart());
                TrackingEventsLogger.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(govIdCaptureState, null, eVarQ != null ? b3.d0(eVarQ) : null, null, 8, null), false, 2, null);
            }
            this.previousStateClass = cVarB;
        }
        kr.l lVar = renderState.getDidGoBack() ? kr.l.SLIDE_OUT : kr.l.SLIDE_IN;
        if (renderState instanceof vo.j0.ShowInstructions) {
            d().m("check_if_single_id_class", new k(renderProps, renderState, this, null));
            String title = renderProps.getStrings().getTitle();
            String prompt = renderProps.getStrings().getPrompt();
            String choose = renderProps.getStrings().getChoose();
            String instructionsDisclaimer = renderProps.getStrings().getInstructionsDisclaimer();
            List<EnabledIdClass> listM = ep.e.m(renderProps);
            m mVar = new m(renderState, this, renderProps);
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage = renderProps.getAssetConfig().getSelectPage();
            return new y3.e(title, prompt, choose, instructionsDisclaimer, listM, this.navigationStateManager.b(), mVar, renderProps.getStyles(), selectPage, renderProps.getIsEnabled(), new Function0() { // from class: ep.d0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.K0(this.f13893a);
                }
            }, new Function0() { // from class: ep.v
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.N0(this.f14033a);
                }
            }, ((vo.j0.ShowInstructions) renderState).getError(), new Function0() { // from class: ep.h0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.O0(this.f13961a, renderState);
                }
            }, this.themeManager.a().getIconStyle(), renderProps.getStrings().getSelectPageNavBarTitle(), lVar);
        }
        if (renderState instanceof vo.j0.ChooseCaptureMethod) {
            vo.j0.ChooseCaptureMethod chooseCaptureMethod = (vo.j0.ChooseCaptureMethod) renderState;
            final i3.SideIdPart currentPart = chooseCaptureMethod.getCurrentPart();
            if (chooseCaptureMethod.getChoosingDocumentToUpload()) {
                d().n(this.documentSelectWorker, new Function1() { // from class: ep.n0
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return f1.P0(this.f14019a, renderState, currentPart, (vo.j.a) obj);
                    }
                });
            }
            NextStep.GovernmentId.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            List<CaptureOptionNativeMobile> listN = renderProps.n();
            String strJ = ep.e.j(renderProps.getStrings(), currentPart.getSide(), vo.g.b(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
            String strI = ep.e.i(renderProps.getStrings(), currentPart.getSide(), vo.g.b(chooseCaptureMethod.getCaptureConfig()), chooseCaptureMethod.getCountryCode());
            String chooseCaptureMethodCameraButton = renderProps.getStrings().getChooseCaptureMethodCameraButton();
            String chooseCaptureMethodUploadButton = renderProps.getStrings().getChooseCaptureMethodUploadButton();
            ir.a aVarB = this.navigationStateManager.b();
            Function0 function0 = new Function0() { // from class: ep.p0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.Q0(this.f14023a, renderState, renderProps);
                }
            };
            Function0 function1 = new Function0() { // from class: ep.q0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.h0(this.f14025a, renderState);
                }
            };
            Function0 function2 = new Function0() { // from class: ep.r0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.i0(this.f14026a);
                }
            };
            Function0 function3 = new Function0() { // from class: ep.s0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.j0(this.f14028a);
                }
            };
            String error = chooseCaptureMethod.getError();
            Function0 function4 = new Function0() { // from class: ep.t0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.k0(this.f14030a, renderState);
                }
            };
            StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
            IdConfig.e side = chooseCaptureMethod.getCurrentPart().getSide();
            int[] iArr = d.f13923a;
            int i11 = iArr[side.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                throw new zt.l();
                            }
                            if (promptPage != null) {
                                idFrontPictograph = promptPage.getPassportSignaturePictograph();
                            }
                        } else if (promptPage != null) {
                            idFrontPictograph = promptPage.getBarcodePdf417Pictograph();
                        }
                    }
                } else if (promptPage != null) {
                    idFrontPictograph = promptPage.getIdBackPictograph();
                }
            } else if (vo.g.a(chooseCaptureMethod.getCaptureConfig()) == dp.e.Passport) {
                if (promptPage != null) {
                    idFrontPictograph = promptPage.getPassportFrontPictograph();
                }
            } else if (promptPage != null) {
                idFrontPictograph = promptPage.getIdFrontPictograph();
            }
            RemoteImage remoteImage = idFrontPictograph;
            int i12 = iArr[chooseCaptureMethod.getCurrentPart().getSide().ordinal()];
            if (i12 != 1) {
                i10 = (i12 == 2 || i12 == 4) ? p3.f34951d : p3.f34952e;
            } else {
                i10 = vo.g.a(chooseCaptureMethod.getCaptureConfig()) == dp.e.Passport ? p3.f34953f : p3.f34952e;
            }
            int i13 = i10;
            String requestPageNavBarTitle = renderProps.getStrings().getRequestPageNavBarTitle();
            if (requestPageNavBarTitle == null) {
                requestPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
            }
            return new y3.c(listN, strJ, strI, chooseCaptureMethodCameraButton, chooseCaptureMethodUploadButton, aVarB, function0, function1, function2, function3, error, function4, styles, remoteImage, i13, requestPageNavBarTitle, lVar);
        }
        if (renderState instanceof vo.j0.WaitForAutocapture) {
            return this.captureRenderer.Q(this.applicationContext, renderProps, (vo.j0.WaitForAutocapture) renderState, d(), this.videoCaptureHelper, new h(), new Function1() { // from class: ep.u0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f1.l0(this.f14032a, (d2.b) obj);
                }
            }, lVar);
        }
        if (renderState instanceof vo.j0.CountdownToCapture) {
            return this.captureRenderer.E(renderProps, (vo.j0.CountdownToCapture) renderState, d(), this.videoCaptureHelper, new i(), new Function1() { // from class: ep.o0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f1.m0(this.f14022a, (d2.b) obj);
                }
            }, lVar);
        }
        if (renderState instanceof vo.j0.ReviewCapturedImage) {
            vo.j0.ReviewCapturedImage reviewCapturedImage = (vo.j0.ReviewCapturedImage) renderState;
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, b3.d0(reviewCapturedImage.getCurrentPart().getSide()), null, 8, null), false, 2, null);
            final vo.f captureConfig = reviewCapturedImage.getCaptureConfig();
            IdConfig.IdSideConfig idSideConfigD = vo.g.d(captureConfig, reviewCapturedImage.getCurrentPart().getSide());
            Frame frame = (Frame) CollectionsKt.d0(reviewCapturedImage.getIdForReview().j3());
            if (reviewCapturedImage.getSubmittingForAutoClassification()) {
                z10 = true;
                ep.e.v(renderProps, (vo.j0.j) renderState, d(), this.videoCaptureHelper, this.autoClassifyWorkerFactory, new j(this));
                aVar = renderProps;
            } else {
                aVar = renderProps;
                z10 = true;
            }
            return new y3.i(this.imageLoader, ep.e.k(aVar.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), vo.g.b(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), aVar.getStrings().getCaptureDisclaimer(), idSideConfigD.getOverlay(), frame.getAbsoluteFilePath(), reviewCapturedImage.getCurrentPart().getSide(), vo.g.a(captureConfig), this.navigationStateManager.b(), new Function0() { // from class: ep.y0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.n0(aVar, renderState, this);
                }
            }, aVar.getStrings().getButtonSubmit(), new Function0() { // from class: ep.z0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.o0(this.f14043a, renderState, aVar, captureConfig);
                }
            }, aVar.getStrings().getButtonRetake(), ep.e.l(aVar.getStrings(), reviewCapturedImage.getCurrentPart().getSide(), vo.g.b(reviewCapturedImage.getCaptureConfig()), reviewCapturedImage.getCountryCode()), new Function0() { // from class: ep.a1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.q0(this.f13880a);
                }
            }, aVar.getStyles(), reviewCapturedImage.getError(), new Function0() { // from class: ep.b1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.r0(this.f13883a, renderState);
                }
            }, aVar.getAssetConfig().getCapturePage(), (!aVar.getIsEnabled() || reviewCapturedImage.getSubmittingForAutoClassification()) ? false : z10, reviewCapturedImage.getSubmittingForAutoClassification(), aVar.getReviewCaptureButtonsAxis(), aVar.getDesignVersion(), (this.videoCaptureHelper.c(aVar) && aVar.getAutoClassificationConfig().getIsEnabled()) ? z10 : false, aVar.getStrings().getCheckPageNavBarTitle(), lVar);
        }
        final d2.a aVar2 = renderProps;
        if (renderState instanceof vo.j0.ReviewSelectedImage) {
            vo.j0.ReviewSelectedImage reviewSelectedImage = (vo.j0.ReviewSelectedImage) renderState;
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.CONFIRMING, null, b3.d0(reviewSelectedImage.getCurrentPart().getSide()), null, 8, null), false, 2, null);
            i3.SideIdPart currentPart2 = reviewSelectedImage.getCurrentPart();
            if (reviewSelectedImage.getSubmittingForAutoClassification()) {
                ep.e.v(renderProps, (vo.j0.j) renderState, d(), this.videoCaptureHelper, this.autoClassifyWorkerFactory, new l(this));
                aVar2 = renderProps;
            }
            l6.s sVar = this.imageLoader;
            String strO = ep.e.o(aVar2.getStrings(), currentPart2.getSide());
            String strN = ep.e.n(aVar2.getStrings(), currentPart2.getSide());
            String reviewSelectedImageConfirmButton = aVar2.getStrings().getReviewSelectedImageConfirmButton();
            String reviewSelectedImageChooseAnotherButton = aVar2.getStrings().getReviewSelectedImageChooseAnotherButton();
            String absoluteFilePath = ((Frame) CollectionsKt.d0(reviewSelectedImage.getIdForReview().j3())).getAbsoluteFilePath();
            String mimeType = ((Frame) CollectionsKt.d0(reviewSelectedImage.getIdForReview().j3())).getMimeType();
            String fileName = reviewSelectedImage.getFileName();
            ir.a aVarB2 = this.navigationStateManager.b();
            String error2 = reviewSelectedImage.getError();
            boolean submittingForAutoClassification = reviewSelectedImage.getSubmittingForAutoClassification();
            StepStyles.GovernmentIdStepStyle styles2 = aVar2.getStyles();
            String reviewUploadPageNavBarTitle = aVar2.getStrings().getReviewUploadPageNavBarTitle();
            if (reviewUploadPageNavBarTitle == null) {
                reviewUploadPageNavBarTitle = aVar2.getStrings().getCapturePageNavBarTitle();
            }
            return new y3.j(sVar, strO, strN, reviewSelectedImageConfirmButton, reviewSelectedImageChooseAnotherButton, absoluteFilePath, mimeType, fileName, aVarB2, new Function0() { // from class: ep.c1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.s0(aVar2, renderState, this);
                }
            }, new Function0() { // from class: ep.d1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.t0(this.f13894a);
                }
            }, new Function0() { // from class: ep.e1
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.u0(this.f13896a);
                }
            }, new Function0() { // from class: ep.t
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.v0(this.f14029a);
                }
            }, error2, new Function0() { // from class: ep.u
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.w0(this.f14031a, renderState);
                }
            }, styles2, submittingForAutoClassification, reviewUploadPageNavBarTitle, lVar);
        }
        if (renderState instanceof vo.j0.Submit) {
            vo.j0.Submit submit = (vo.j0.Submit) renderState;
            if (!submit.getHasSubmitted()) {
                d().n(this.submitVerificationWorkerFactory.a(aVar2.getSessionToken(), aVar2.getInquiryId(), aVar2.getFromComponent(), aVar2.getFromStep(), submit.getGovernmentIdRequestArguments(), submit.getWebRtcObjectId(), submit.getCameraProperties()), new Function1() { // from class: ep.w
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return f1.x0(this.f14035a, renderState, (dp.f.b) obj);
                    }
                });
            }
            ir.b.d(this.navigationStateManager, false, false, false, false, 12, null);
            or.b customPendingPage = aVar2.getCustomPendingPage();
            return customPendingPage != null ? new y3.g(or.d.a(customPendingPage), this.navigationStateManager.b(), aVar2.getStyles(), new Function0() { // from class: ep.x
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.y0(this.f14037a);
                }
            }, new Function0() { // from class: ep.y
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.z0(this.f14039a);
                }
            }, aVar2.getStrings().getPendingPageNavBarTitle(), false, lVar, 64, null) : new y3.k(aVar2.getStrings().getProcessingTitle(), aVar2.getStrings().getProcessingDescription(), aVar2.getStyles(), aVar2.getAssetConfig().getPendingPage(), this.navigationStateManager.b(), new Function0() { // from class: ep.z
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.A0(this.f14042a);
                }
            }, new Function0() { // from class: ep.a0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.B0(this.f13879a);
                }
            }, aVar2.getPendingPageTextVerticalPosition(), false, aVar2.getStrings().getPendingPageNavBarTitle(), lVar, Barcode.FORMAT_QR_CODE, null);
        }
        if (renderState instanceof vo.j0.FinalizeLocalVideoCapture) {
            if (!aVar2.getAutoClassificationConfig().getIsEnabled()) {
                return this.localVideoCaptureRenderer.i(aVar2, (vo.j0.FinalizeLocalVideoCapture) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: ep.g0
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return f1.G0(this.f13945a, (d2.b) obj);
                    }
                }, lVar);
            }
            ir.b.d(this.navigationStateManager, false, false, false, false, 12, null);
            or.b customPendingPage2 = aVar2.getCustomPendingPage();
            return customPendingPage2 != null ? new y3.g(or.d.a(customPendingPage2), this.navigationStateManager.b(), aVar2.getStyles(), new Function0() { // from class: ep.b0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.C0(this.f13882a);
                }
            }, new Function0() { // from class: ep.c0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.D0(this.f13888a);
                }
            }, aVar2.getStrings().getPendingPageNavBarTitle(), true, lVar) : new y3.k(aVar2.getStrings().getProcessingTitle(), aVar2.getStrings().getProcessingDescription(), aVar2.getStyles(), aVar2.getAssetConfig().getPendingPage(), this.navigationStateManager.b(), new Function0() { // from class: ep.e0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.E0(this.f13895a);
                }
            }, new Function0() { // from class: ep.f0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f1.F0(this.f13899a);
                }
            }, aVar2.getPendingPageTextVerticalPosition(), true, aVar2.getStrings().getPendingPageNavBarTitle(), lVar);
        }
        if (renderState instanceof vo.j0.f) {
            return renderProps.getAutoClassificationConfig().getIsEnabled() ? this.webRtcRenderer.u(renderProps, (vo.j0.f) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: ep.i0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f1.H0(this.f13964a, (d2.b) obj);
                }
            }, lVar) : this.webRtcRenderer.m(renderProps, (vo.j0.f) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: ep.j0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f1.I0(this.f13965a, (d2.b) obj);
                }
            }, lVar);
        }
        if (renderState instanceof vo.j0.HolographicTorchDelay) {
            return this.captureRenderer.M(renderProps, (vo.j0.HolographicTorchDelay) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: ep.k0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f1.J0(this.f13967a, (d2.b) obj);
                }
            });
        }
        if (z11) {
            return this.autoClassificationRenderer.i(renderProps, (vo.j0.AutoClassificationError) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: ep.l0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f1.L0(this.f13969a, (d2.b) obj);
                }
            }, lVar);
        }
        if (renderState instanceof vo.j0.AutoClassificationManualSelect) {
            return this.autoClassificationRenderer.m(renderProps, (vo.j0.AutoClassificationManualSelect) renderState, d(), this.videoCaptureHelper, new Function1() { // from class: ep.m0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f1.M0(this.f14017a, (d2.b) obj);
                }
            }, lVar);
        }
        if (!(renderState instanceof vo.j0.RestartStep)) {
            throw new zt.l();
        }
        d().m("restart_step", new n(a0(renderProps), null));
        return new y3.h(null, 1, null);
    }
}
