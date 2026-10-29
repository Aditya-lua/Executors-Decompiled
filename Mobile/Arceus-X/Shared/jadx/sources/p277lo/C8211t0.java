package p277lo;

import android.R;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.util.Size;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.C3540c;
import com.withpersona.sdk2.inquiry.governmentid.C3549j;
import com.withpersona.sdk2.inquiry.governmentid.C3551l;
import com.withpersona.sdk2.inquiry.governmentid.C3555n;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdPart;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.permissions.C3858g;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureMethod;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import hn.C6434c;
import hn.C6441f0;
import hn.C6445h0;
import hn.CameraChoices;
import hn.EnumC6455m0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7688j0;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import kotlin.time.C7800a;
import kotlin.time.C7801b;
import mn.EnumC8598a;
import mo.InterfaceC8607i;
import org.jetbrains.annotations.NotNull;
import p109en.AlertContainerScreen;
import p109en.AlertScreen;
import p226jq.C7259g;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.C7352s;
import p230ju.EnumC7361b;
import p256ku.C7946z0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p339oo.GovernmentIdHintWorker;
import p340op.C9837c;
import p344ot.C10047c;
import p361po.EnumC10302b;
import p473uo.C11905l;
import p473uo.EnumC11917x;
import p475uq.C11930a;
import p476ur.InterfaceC11932a;
import p497vp.C12244g;
import p526wq.EnumC12529l;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13208b0;
import p581ym.C13230w;
import p581ym.InterfaceC13215h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import tr.C11742b;

/* JADX INFO: renamed from: lo.t0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015JQ\u0010#\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$Jg\u0010-\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001d2&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J[\u00101\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010(\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0/¢\u0006\u0004\b1\u00102J[\u00104\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u0002032&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010(\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0/¢\u0006\u0004\b4\u00105J[\u00107\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u0002062&\u0010\u001f\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001cj\u0002`\u001b2\u0006\u0010(\u001a\u00020'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0/¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, m31665d2 = {"Llo/t0;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;", "governmentIdAnalyzeWorkerFactory", "Loo/a$b;", "governmentIdHintWorkerFactory", "Ltr/b$a;", "webRtcWorkerFactory", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/f$a;Loo/a$b;Ltr/b$a;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "renderState", "Lym/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "context", "Lur/a;", "webRtcManager", "", "G0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lym/k$a;Lur/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "Luo/l;", "videoCaptureHelper", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "capturedId", "T", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Luo/l;Lcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;)V", "Lym/h;", "sink", "n0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lym/k$a;Luo/l;Lym/h;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "Y", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;Lym/k$a;Luo/l;Lym/h;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;", "j0", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;Lym/k$a;Luo/l;Lym/h;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "c", "Lcom/withpersona/sdk2/inquiry/governmentid/f$a;", "d", "Loo/a$b;", "e", "Ltr/b$a;", "f", "Lcom/withpersona/sdk2/camera/e$a;", "g", "Lhn/c$a;", "h", "Luq/a;", "i", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8211t0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PermissionRequestWorkflow permissionRequestWorkflow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final GovernmentIdHintWorker.b governmentIdHintWorkerFactory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C11742b.a webRtcWorkerFactory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C3405e.a cameraXControllerFactory;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C6434c.a camera2ControllerFactory;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C11930a navigationStateManager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: lo.t0$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$renderHolographicTorchDelay$1", m39664f = "CaptureRenderer.kt", m39665l = {454}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30441t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ GovernmentIdState.HolographicTorchDelay f30442u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AbstractC13218k<GovernmentIdWorkflow.Input, GovernmentIdState, GovernmentIdWorkflow.AbstractC3503a, Object>.a f30443v;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(GovernmentIdState.HolographicTorchDelay holographicTorchDelay, AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a aVar, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f30442u = holographicTorchDelay;
            this.f30443v = aVar;
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m33548r(AbstractC13225r.c cVar) {
            Object objM48901c = cVar.m48901c();
            GovernmentIdState.HolographicTorchDelay holographicTorchDelay = objM48901c instanceof GovernmentIdState.HolographicTorchDelay ? (GovernmentIdState.HolographicTorchDelay) objM48901c : null;
            if (holographicTorchDelay == null) {
                return Unit.f29331a;
            }
            cVar.m48903e(GovernmentIdState.HolographicTorchDelay.m17005J(holographicTorchDelay, null, null, null, 0, null, null, null, null, 0, null, false, 1023, null));
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f30442u, this.f30443v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f30441t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C7800a.Companion companion = C7800a.INSTANCE;
                long jM32371p = C7801b.m32371p(this.f30442u.getTorchDurationMs(), EnumC7361b.MILLISECONDS);
                this.f30441t = 1;
                if (C7946z0.m32939c(jM32371p, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            this.f30443v.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: lo.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C8211t0.a.m33548r((AbstractC13225r.c) obj2);
                }
            }, 1, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: lo.t0$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$renderHolographicTorchDelay$2", m39664f = "CaptureRenderer.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30444t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ GovernmentIdWorkflow.Input f30446v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ GovernmentIdState.HolographicTorchDelay f30447w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ AbstractC13218k<GovernmentIdWorkflow.Input, GovernmentIdState, GovernmentIdWorkflow.AbstractC3503a, Object>.a f30448x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ C11905l f30449y;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$a, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(GovernmentIdWorkflow.Input input, GovernmentIdState.HolographicTorchDelay holographicTorchDelay, AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a aVar, C11905l c11905l, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f30446v = input;
            this.f30447w = holographicTorchDelay;
            this.f30448x = aVar;
            this.f30449y = c11905l;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C8211t0.this.new b(this.f30446v, this.f30447w, this.f30448x, this.f30449y, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f30444t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C8211t0 c8211t0 = C8211t0.this;
            GovernmentIdWorkflow.Input input = this.f30446v;
            GovernmentIdState.HolographicTorchDelay holographicTorchDelay = this.f30447w;
            c8211t0.m33543T(input, holographicTorchDelay, this.f30448x, holographicTorchDelay.getCaptureConfig(), this.f30449y, this.f30447w.getCameraProperties(), this.f30447w.getCapturedImage());
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C8211t0(@NotNull Context applicationContext, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, @NotNull GovernmentIdAnalyzeWorker.a governmentIdAnalyzeWorkerFactory, @NotNull GovernmentIdHintWorker.b governmentIdHintWorkerFactory, @NotNull C11742b.a webRtcWorkerFactory, @NotNull C3405e.a cameraXControllerFactory, @NotNull C6434c.a camera2ControllerFactory, @NotNull C11930a navigationStateManager, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(governmentIdAnalyzeWorkerFactory, "governmentIdAnalyzeWorkerFactory");
        Intrinsics.checkNotNullParameter(governmentIdHintWorkerFactory, "governmentIdHintWorkerFactory");
        Intrinsics.checkNotNullParameter(webRtcWorkerFactory, "webRtcWorkerFactory");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.applicationContext = applicationContext;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.governmentIdAnalyzeWorkerFactory = governmentIdAnalyzeWorkerFactory;
        this.governmentIdHintWorkerFactory = governmentIdHintWorkerFactory;
        this.webRtcWorkerFactory = webRtcWorkerFactory;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.navigationStateManager = navigationStateManager;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    /* JADX INFO: renamed from: A0 */
    public static final Unit m33454A0(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(new GovernmentIdWorkflow.AbstractC3503a.c(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m33456B0(GovernmentIdState.WaitForAutocapture waitForAutocapture, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (waitForAutocapture.getManualCapture() == Screen.C3527b.a.Hidden) {
            action.m48903e(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, Screen.C3527b.a.Enabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C0 */
    public static final AbstractC13225r m33458C0(final Hint hint) {
        return C13208b0.m48847c(null, new Function1() { // from class: lo.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33460D0(hint, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: D0 */
    public static final Unit m33460D0(Hint hint, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objM48901c instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objM48901c : null;
        if (waitForAutocapture == null) {
            return Unit.f29331a;
        }
        action.m48903e(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, null, null, 0, null, null, null, null, false, false, null, hint, null, 24575, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: E0 */
    public static final AbstractC13225r m33462E0(final GovernmentIdState.WaitForAutocapture waitForAutocapture, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C13208b0.m48847c(null, new Function1() { // from class: lo.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33464F0(waitForAutocapture, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m33464F0(GovernmentIdState.WaitForAutocapture waitForAutocapture, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (waitForAutocapture.getManualCapture() == Screen.C3527b.a.Hidden) {
            action.m48903e(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, Screen.C3527b.a.Enabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H0 */
    public static final AbstractC13225r m33467H0(final C8211t0 c8211t0, final InterfaceC11932a interfaceC11932a, final GovernmentIdState.WaitForAutocapture waitForAutocapture, final GovernmentIdWorkflow.Input input, final AbstractC13218k.a aVar, final C11742b.b it) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(it, "it");
        final CameraChoices cameraChoicesM28079b = C6441f0.m28079b(c8211t0.applicationContext, EnumC6455m0.FRONT);
        if (it instanceof C11742b.b.C14265b) {
            return C13208b0.m48847c(null, new Function1() { // from class: lo.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C8211t0.m33469I0(interfaceC11932a, c8211t0, cameraChoicesM28079b, it, waitForAutocapture, input, aVar, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof C11742b.b.Error) {
            return C13208b0.m48847c(null, new Function1() { // from class: lo.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C8211t0.m33481O0(aVar, interfaceC11932a, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: I0 */
    public static final Unit m33469I0(final InterfaceC11932a interfaceC11932a, final C8211t0 c8211t0, CameraChoices cameraChoices, C11742b.b bVar, final GovernmentIdState.WaitForAutocapture waitForAutocapture, final GovernmentIdWorkflow.Input input, final AbstractC13218k.a aVar, AbstractC13225r.c action) {
        int i10;
        int i11;
        C6445h0 primaryChoice;
        C6445h0 primaryChoice2;
        C6445h0 primaryChoice3;
        Size size;
        C6445h0 primaryChoice4;
        Size size2;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture2 = objM48901c instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objM48901c : null;
        if (waitForAutocapture2 != null && waitForAutocapture2.getWebRtcState() == EnumC11917x.Connecting) {
            return Unit.f29331a;
        }
        if (waitForAutocapture2 != null) {
            action.m48903e(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture2, null, null, null, null, null, 0, null, EnumC11917x.Connecting, null, null, false, false, null, null, null, 32639, null));
        }
        if (interfaceC11932a != null) {
            interfaceC11932a.m44542h(c8211t0.webRtcWorkerFactory.getAndroidx.core.app.NotificationCompat.CATEGORY_SERVICE java.lang.String());
        }
        if (interfaceC11932a != null) {
            interfaceC11932a.m44543i(c8211t0.applicationContext);
        }
        int height = 0;
        int width = (cameraChoices == null || (primaryChoice4 = cameraChoices.getPrimaryChoice()) == null || (size2 = primaryChoice4.getSize()) == null) ? 0 : size2.getWidth();
        if (cameraChoices != null && (primaryChoice3 = cameraChoices.getPrimaryChoice()) != null && (size = primaryChoice3.getSize()) != null) {
            height = size.getHeight();
        }
        if ((cameraChoices == null || (primaryChoice2 = cameraChoices.getPrimaryChoice()) == null || primaryChoice2.getRotation() != 90) && (cameraChoices == null || (primaryChoice = cameraChoices.getPrimaryChoice()) == null || primaryChoice.getRotation() != 270)) {
            i10 = height;
            i11 = width;
        } else {
            i11 = height;
            i10 = width;
        }
        if (interfaceC11932a != null) {
            C11742b.b.C14265b c14265b = (C11742b.b.C14265b) bVar;
            interfaceC11932a.m44539e(c14265b.getResult().getUsername(), c14265b.getResult().getCredential(), c14265b.getResult().getServerUrl(), waitForAutocapture.getWebRtcJwt(), i11, i10, input.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: lo.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C8211t0.m33471J0(this.f30369a, input, waitForAutocapture);
                }
            }, new Function0() { // from class: lo.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C8211t0.m33473K0(aVar, interfaceC11932a);
                }
            }, new Function0() { // from class: lo.i0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C8211t0.m33477M0(this.f30380a, input);
                }
            }, new Function1() { // from class: lo.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C8211t0.m33479N0(this.f30386a, (String) obj);
                }
            });
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: J0 */
    public static final Unit m33471J0(C8211t0 c8211t0, GovernmentIdWorkflow.Input input, GovernmentIdState.WaitForAutocapture waitForAutocapture) {
        TrackingEventsLogger.logVideoStartEvent$default(c8211t0.trackingEventsLogger, input.getFromStep(), "Stream", null, false, 12, null);
        waitForAutocapture.m17059U().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: K0 */
    public static final Unit m33473K0(AbstractC13218k.a aVar, final InterfaceC11932a interfaceC11932a) {
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: lo.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33475L0(interfaceC11932a, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: L0 */
    public static final Unit m33475L0(InterfaceC11932a interfaceC11932a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        interfaceC11932a.m44535a();
        action.m48903e(new GovernmentIdState.RestartStep(null, null, null, null, 0, ((GovernmentIdState) action.m48901c()).getCountryCode(), null, null, 223, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: M0 */
    public static final Unit m33477M0(C8211t0 c8211t0, GovernmentIdWorkflow.Input input) {
        TrackingEventsLogger.logWebRtcIceCompleteEvent$default(c8211t0.trackingEventsLogger, input.getFromStep(), null, false, 6, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: N0 */
    public static final Unit m33479N0(C8211t0 c8211t0, String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        TrackingEventsLogger.logVideoStopRequestEvent$default(c8211t0.trackingEventsLogger, step, false, 2, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O0 */
    public static final Unit m33481O0(AbstractC13218k.a aVar, final InterfaceC11932a interfaceC11932a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objM48901c instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objM48901c : null;
        if (waitForAutocapture == null || waitForAutocapture.getWebRtcState() == EnumC11917x.Connecting) {
            return Unit.f29331a;
        }
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: lo.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33483P0(interfaceC11932a, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: P0 */
    public static final Unit m33483P0(InterfaceC11932a interfaceC11932a, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (interfaceC11932a != null) {
            interfaceC11932a.m44535a();
        }
        action.m48903e(new GovernmentIdState.RestartStep(null, null, null, null, 0, ((GovernmentIdState) action.m48901c()).getCountryCode(), null, null, 223, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: U */
    public static final Unit m33487U(GovernmentIdState governmentIdState, IdPart.SideIdPart sideIdPart, CaptureConfig captureConfig, CameraProperties cameraProperties, int i10, GovernmentId.GovernmentIdImage governmentIdImage, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (action.m48901c().getClass() != governmentIdState.getClass()) {
            return Unit.f29331a;
        }
        action.m48903e(new GovernmentIdState.HolographicTorchDelay(sideIdPart, governmentIdState.mo16956E(), governmentIdState.mo16955D(), governmentIdState.getPartIndex(), governmentIdState.getBackState(), governmentIdState.getCountryCode(), captureConfig, cameraProperties, i10, governmentIdImage, false, 1024, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m33488V(AbstractC13218k.a aVar, final C11905l c11905l) {
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: lo.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33489W(c11905l, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m33489W(C11905l c11905l, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objM48901c instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objM48901c : null;
        if (waitForAutocapture != null) {
            action.m48903e(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, null, null, 0, null, c11905l.m44497d() ? EnumC11917x.Connected : EnumC11917x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m33490X(GovernmentIdState governmentIdState, CaptureConfig captureConfig, GovernmentId.GovernmentIdImage governmentIdImage, GovernmentIdState.WaitForAutocapture waitForAutocapture, CameraProperties cameraProperties, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        IdPart currentPart = governmentIdState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        if (sideIdPart == null) {
            return Unit.f29331a;
        }
        action.m48903e(new GovernmentIdState.ReviewCapturedImage(sideIdPart, ((GovernmentIdState) action.m48901c()).mo16956E(), captureConfig, governmentIdImage, ((GovernmentIdState) action.m48901c()).mo16955D(), ((GovernmentIdState) action.m48901c()).getPartIndex(), waitForAutocapture, cameraProperties, null, false, ((GovernmentIdState) action.m48901c()).getCountryCode(), 768, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z */
    public static final AbstractC13225r m33491Z(final Hint hint) {
        return C13208b0.m48847c(null, new Function1() { // from class: lo.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33493a0(hint, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m33493a0(Hint hint, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.CountdownToCapture countdownToCapture = objM48901c instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) objM48901c : null;
        if (countdownToCapture == null) {
            return Unit.f29331a;
        }
        action.m48903e(GovernmentIdState.CountdownToCapture.m16986J(countdownToCapture, null, null, null, null, null, 0, null, null, hint, 255, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m33495b0(InterfaceC13215h interfaceC13215h) {
        interfaceC13215h.mo17905a(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: c0 */
    public static final Unit m33497c0(AbstractC13218k.a aVar, C11905l c11905l) {
        C3555n.m17613S(aVar, c11905l);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: d0 */
    public static final Unit m33499d0(GovernmentIdState.CountdownToCapture countdownToCapture, C8211t0 c8211t0, GovernmentIdWorkflow.Input input, AbstractC13218k.a aVar, C11905l c11905l, List absolutePaths, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List<Frame> listMo16936d3 = countdownToCapture.getIdForReview().mo16936d3();
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listMo16936d3, 10));
        Iterator<T> it = listMo16936d3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Frame) it.next()).getAbsoluteFilePath());
        }
        List listW0 = CollectionsKt.m31725w0(arrayList, absolutePaths);
        CaptureConfig captureConfig = countdownToCapture.getCaptureConfig();
        GovernmentId.GovernmentIdImage idForReview = countdownToCapture.getIdForReview();
        List list = listW0;
        ArrayList arrayList2 = new ArrayList(C7701q.m31905u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Frame((String) it2.next(), null, 2, null));
        }
        c8211t0.m33543T(input, countdownToCapture, aVar, captureConfig, c11905l, cameraProperties, GovernmentId.GovernmentIdImage.m16939f(idForReview, arrayList2, null, null, null, null, null, 62, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e0 */
    public static final Unit m33501e0(final AbstractC13218k.a aVar, final GovernmentIdState.CountdownToCapture countdownToCapture, final GovernmentIdWorkflow.Input input, final C11905l c11905l, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: lo.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33503f0(countdownToCapture, input, error, aVar, c11905l, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m33503f0(GovernmentIdState.CountdownToCapture countdownToCapture, GovernmentIdWorkflow.Input input, Throwable th2, final AbstractC13218k.a aVar, final C11905l c11905l, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.CountdownToCapture countdownToCapture2 = objM48901c instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) objM48901c : null;
        if (countdownToCapture2 == null) {
            return Unit.f29331a;
        }
        action.m48903e(new GovernmentIdState.WaitForAutocapture(countdownToCapture.getCurrentPart(), countdownToCapture.mo16956E(), countdownToCapture.getCaptureConfig(), C3555n.m17609O((GovernmentIdWorkflow.Input) action.m48900b(), countdownToCapture.getCurrentPart().getSide()), countdownToCapture2.mo16955D(), countdownToCapture2.getPartIndex(), C3555n.m17657x(action, false), EnumC11917x.Disconnected, input.getVideoCaptureConfig().getWebRtcJwt(), th2, false, false, countdownToCapture2.getCountryCode(), null, new Function0() { // from class: lo.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8211t0.m33505g0(aVar, c11905l);
            }
        }, 11264, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m33505g0(AbstractC13218k.a aVar, final C11905l c11905l) {
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: lo.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33507h0(c11905l, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h0 */
    public static final Unit m33507h0(C11905l c11905l, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objM48901c instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objM48901c : null;
        if (waitForAutocapture != null) {
            action.m48903e(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, null, null, 0, null, c11905l.m44497d() ? EnumC11917x.Connected : EnumC11917x.Disconnected, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i0 */
    public static final Unit m33509i0(C8211t0 c8211t0, AbstractC13218k.a aVar, GovernmentIdWorkflow.Input input, C11905l c11905l) {
        C3555n.m17615U(c8211t0.applicationContext, aVar, input, c11905l.m44496c(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k0 */
    public static final Unit m33512k0(InterfaceC13215h interfaceC13215h) {
        interfaceC13215h.mo17905a(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l0 */
    public static final Unit m33514l0(AbstractC13218k.a aVar, C11905l c11905l) {
        C3555n.m17613S(aVar, c11905l);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m33516m0(C8211t0 c8211t0, AbstractC13218k.a aVar, GovernmentIdWorkflow.Input input) {
        C3555n.m17615U(c8211t0.applicationContext, aVar, input, true);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m33519o0(AbstractC13218k.a aVar, AlertScreen.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: lo.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33521p0((AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p0 */
    public static final Unit m33521p0(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState governmentIdState = (GovernmentIdState) action.m48901c();
        if (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) {
            action.m48903e(GovernmentIdState.WaitForAutocapture.m17050L((GovernmentIdState.WaitForAutocapture) governmentIdState, null, null, null, null, null, 0, null, null, null, null, false, false, null, null, null, 32255, null));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q0 */
    public static final Unit m33523q0(GovernmentIdState.WaitForAutocapture waitForAutocapture, CaptureConfig captureConfig, C8211t0 c8211t0, GovernmentIdWorkflow.Input input, AbstractC13218k.a aVar, C11905l c11905l, List absolutePaths, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List list = absolutePaths;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Frame((String) it.next(), null, 2, null));
        }
        c8211t0.m33543T(input, waitForAutocapture, aVar, waitForAutocapture.getCaptureConfig(), c11905l, cameraProperties, new GovernmentId.GovernmentIdImage(arrayList, C3555n.m17630e0(waitForAutocapture.getCurrentPart().getSide()), C3540c.m17508b(captureConfig), GovernmentId.EnumC3485a.f13532b, null, null, 32, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r0 */
    public static final Unit m33525r0(InterfaceC13215h interfaceC13215h) {
        interfaceC13215h.mo17905a(GovernmentIdWorkflow.AbstractC3503a.b.f13791a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s0 */
    public static final Unit m33527s0(AbstractC13218k.a aVar, C11905l c11905l) {
        C3555n.m17613S(aVar, c11905l);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t0 */
    public static final Unit m33529t0(AbstractC13218k.a aVar, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: lo.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33531u0(error, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u0 */
    public static final Unit m33531u0(Throwable th2, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = objM48901c instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objM48901c : null;
        if (waitForAutocapture == null) {
            return Unit.f29331a;
        }
        action.m48903e(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, Screen.C3527b.a.Enabled, null, 0, null, null, null, th2, false, false, null, null, null, 32247, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v0 */
    public static final Unit m33533v0(C8211t0 c8211t0, final GovernmentIdState.WaitForAutocapture waitForAutocapture, AbstractC13218k.a aVar) {
        TrackingEventsLogger.logGovernmentIdStateEvent$default(c8211t0.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.MANUAL, C3555n.m17628d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
        aVar.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: lo.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33535w0(waitForAutocapture, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: w0 */
    public static final Unit m33535w0(GovernmentIdState.WaitForAutocapture waitForAutocapture, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(GovernmentIdState.WaitForAutocapture.m17050L(waitForAutocapture, null, null, null, Screen.C3527b.a.Disabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x0 */
    public static final Unit m33537x0(C8211t0 c8211t0, AbstractC13218k.a aVar, GovernmentIdWorkflow.Input input, C11905l c11905l) {
        C3555n.m17615U(c8211t0.applicationContext, aVar, input, c11905l.m44496c(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y0 */
    public static final AbstractC13225r m33539y0(final C8211t0 c8211t0, final GovernmentIdState.WaitForAutocapture waitForAutocapture, final CaptureConfig captureConfig, C7347n c7347n) {
        Object value = c7347n.getValue();
        Throwable thM30463e = C7347n.m30463e(value);
        if (thM30463e == null) {
            final GovernmentId.GovernmentIdImage governmentIdImage = (GovernmentId.GovernmentIdImage) value;
            return C13208b0.m48847c(null, new Function1() { // from class: lo.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C8211t0.m33541z0(this.f30450a, waitForAutocapture, captureConfig, governmentIdImage, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        String message = thM30463e.getMessage();
        return (message == null || !StringsKt.m32152a0(message, "ENOSPC", false, 2, null)) ? C13208b0.m48847c(null, new Function1() { // from class: lo.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33456B0(waitForAutocapture, (AbstractC13225r.c) obj);
            }
        }, 1, null) : C13208b0.m48847c(null, new Function1() { // from class: lo.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33454A0((AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: z0 */
    public static final Unit m33541z0(C8211t0 c8211t0, GovernmentIdState.WaitForAutocapture waitForAutocapture, CaptureConfig captureConfig, GovernmentId.GovernmentIdImage governmentIdImage, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        TrackingEventsLogger.logGovernmentIdStateEvent$default(c8211t0.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.AUTO, C3555n.m17628d0(waitForAutocapture.getCurrentPart().getSide()), null, 8, null), false, 2, null);
        Object objM48901c = action.m48901c();
        GovernmentIdState.WaitForAutocapture waitForAutocapture2 = objM48901c instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) objM48901c : null;
        if (waitForAutocapture2 == null) {
            return Unit.f29331a;
        }
        action.m48903e(new GovernmentIdState.CountdownToCapture(waitForAutocapture.getCurrentPart(), ((GovernmentIdState) action.m48901c()).mo16956E(), captureConfig, governmentIdImage, waitForAutocapture2.mo16955D(), waitForAutocapture2.getPartIndex(), C3555n.m17657x(action, false), waitForAutocapture2.getCountryCode(), waitForAutocapture2.getHint()));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m33542G0(final GovernmentIdWorkflow.Input renderProps, final GovernmentIdState.WaitForAutocapture renderState, final AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a context, final InterfaceC11932a webRtcManager) {
        C13230w.m48937l(context, this.webRtcWorkerFactory.m43961a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), C7731d0.m32011k(C11742b.class), "", new Function1() { // from class: lo.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33467H0(this.f30387a, webRtcManager, renderState, renderProps, context, (C11742b.b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public final void m33543T(GovernmentIdWorkflow.Input renderProps, final GovernmentIdState renderState, final AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a context, final CaptureConfig captureConfig, final C11905l videoCaptureHelper, final CameraProperties cameraProperties, final GovernmentId.GovernmentIdImage capturedId) {
        boolean z10 = false;
        if (!(renderState instanceof GovernmentIdState.HolographicTorchDelay)) {
            TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
            GovIdCaptureState govIdCaptureState = GovIdCaptureState.CAPTURED_PHOTO;
            GovIdCaptureMethod govIdCaptureMethodM17562b = C3549j.m17562b(capturedId.getCaptureMethod());
            IdConfig.EnumC3514b enumC3514bM17611Q = C3555n.m17611Q(renderState.getCurrentPart());
            TrackingEventsLogger.logGovernmentIdStateEvent$default(trackingEventsLogger, new GovernmentIdStateEventData(govIdCaptureState, govIdCaptureMethodM17562b, enumC3514bM17611Q != null ? C3555n.m17628d0(enumC3514bM17611Q) : null, null, 8, null), false, 2, null);
        }
        Integer holographicTorchEnabledDurationMs = renderProps.getHolographicTorchEnabledDurationMs();
        int iIntValue = holographicTorchEnabledDurationMs != null ? holographicTorchEnabledDurationMs.intValue() : 0;
        IdPart currentPart = renderState.getCurrentPart();
        IdPart.SideIdPart sideIdPart = currentPart instanceof IdPart.SideIdPart ? (IdPart.SideIdPart) currentPart : null;
        IdConfig idConfigM17509c = C3540c.m17509c(captureConfig);
        if (videoCaptureHelper.m44496c(renderProps) && iIntValue > 0 && renderState.mo16956E().isEmpty() && sideIdPart != null) {
            z10 = true;
        }
        if (!(renderState instanceof GovernmentIdState.HolographicTorchDelay) && z10) {
            final int i10 = iIntValue;
            final IdPart.SideIdPart sideIdPart2 = sideIdPart;
            context.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: lo.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C8211t0.m33487U(renderState, sideIdPart2, captureConfig, cameraProperties, i10, capturedId, (AbstractC13225r.c) obj);
                }
            }, 1, null));
            return;
        }
        boolean zM44496c = videoCaptureHelper.m44496c(renderProps);
        boolean shouldSkipReviewScreen = renderProps.getShouldSkipReviewScreen();
        if (idConfigM17509c != null && (zM44496c || shouldSkipReviewScreen)) {
            C3555n.m17617W(renderState, context, renderProps, capturedId, idConfigM17509c, videoCaptureHelper, cameraProperties, (3584 & 128) != 0, (3584 & 256) != 0 ? renderState.mo16955D() : null, (3584 & 512) != 0 ? renderState.getPartIndex() : 0, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? renderState.getCountryCode() : null);
        } else {
            if (sideIdPart == null) {
                return;
            }
            final GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(sideIdPart, renderState.mo16956E(), captureConfig, C3555n.m17609O(renderProps, sideIdPart.getSide()), renderState.mo16955D(), renderState.getPartIndex(), renderState.getBackState(), EnumC11917x.Disconnected, renderProps.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, renderState.getCountryCode(), null, new Function0() { // from class: lo.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C8211t0.m33488V(context, videoCaptureHelper);
                }
            }, 11776, null);
            context.mo48837d().mo17905a(C13208b0.m48847c(null, new Function1() { // from class: lo.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C8211t0.m33490X(renderState, captureConfig, capturedId, waitForAutocapture, cameraProperties, (AbstractC13225r.c) obj);
                }
            }, 1, null));
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.withpersona.sdk2.inquiry.governmentid.l.g(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.governmentid.Screen$b$a, com.withpersona.sdk2.inquiry.governmentid.Screen$Overlay, po.b, com.withpersona.sdk2.inquiry.governmentid.IdConfig$b, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.util.List, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, int, com.withpersona.sdk2.camera.e$a, hn.c$a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, mn.a, boolean, boolean, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.String, mo.i, ur.a, boolean, wq.l, int, int, java.lang.Object):com.withpersona.sdk2.inquiry.governmentid.Screen$b */
    @NotNull
    /* JADX INFO: renamed from: Y */
    public final Object m33544Y(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.CountdownToCapture renderState, @NotNull final AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a context, @NotNull final C11905l videoCaptureHelper, @NotNull final InterfaceC13215h<? super GovernmentIdWorkflow.AbstractC3503a> sink) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        IdConfig.IdSideConfig idSideConfigM17510d = C3540c.m17510d(renderState.getCaptureConfig(), renderState.getCurrentPart().getSide());
        C13230w.m48937l(context, this.governmentIdHintWorkerFactory.mo38708a(renderState.getCurrentPart().getSide()), C7731d0.m32011k(GovernmentIdHintWorker.class), "", new Function1() { // from class: lo.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33491Z((Hint) obj);
            }
        });
        String strM17605K = C3555n.m17605K(renderProps.getStrings(), renderState.getCurrentPart().getSide(), C3540c.m17508b(renderState.getCaptureConfig()), renderState.getCountryCode());
        String strM17604J = C3555n.m17604J(renderProps.getStrings(), renderState.getCurrentPart().getSide(), C3540c.m17508b(renderState.getCaptureConfig()), renderState.getCountryCode());
        String capturing = renderProps.getStrings().getCapturing();
        IdConfig.EnumC3514b side = renderState.getCurrentPart().getSide();
        Screen.C3527b.a aVar = Screen.C3527b.a.Disabled;
        Screen.Overlay overlay = idSideConfigM17510d.getOverlay();
        EnumC10302b enumC10302bM17507a = C3540c.m17507a(renderState.getCaptureConfig());
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        List<AutoCaptureRule> listM16167a = idSideConfigM17510d.getAutoCaptureConfig().getRuleSet().m16167a();
        int partIndex = renderState.getPartIndex();
        int imageCaptureCount = renderProps.getImageCaptureCount() - 1;
        Function1 function1M17595A = C3555n.m17595A(context, false, 1, null);
        EnumC8598a enumC8598aM44498e = videoCaptureHelper.m44498e(renderProps);
        String strM17612R = C3555n.m17612R(renderProps.getStrings(), renderState.getHint());
        InterfaceC11932a webRtcManager = videoCaptureHelper.getWebRtcManager();
        return new AlertContainerScreen(C3858g.m19165c(C3551l.m17572f(renderProps, strM17605K, strM17604J, capturing, aVar, overlay, enumC10302bM17507a, side, navigationStateM44528b, (1203765760 & 512) != 0 ? new Function2() { // from class: io.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C3551l.m17574h((List) obj, (CameraProperties) obj2);
            }
        } : null, new Function0() { // from class: lo.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8211t0.m33495b0(sink);
            }
        }, new Function0() { // from class: lo.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8211t0.m33497c0(context, videoCaptureHelper);
            }
        }, true, listM16167a, renderState, partIndex, this.cameraXControllerFactory, this.camera2ControllerFactory, (262144 & 1203765760) != 0 ? new Function2() { // from class: io.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C3551l.m17575i((List) obj, (CameraProperties) obj2);
            }
        } : new Function2() { // from class: lo.o0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C8211t0.m33499d0(renderState, this, renderProps, context, videoCaptureHelper, (List) obj, (CameraProperties) obj2);
            }
        }, (524288 & 1203765760) != 0 ? new Function1() { // from class: io.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3551l.m17576j((Throwable) obj);
            }
        } : new Function1() { // from class: lo.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33501e0(context, renderState, renderProps, videoCaptureHelper, (Throwable) obj);
            }
        }, function1M17595A, (2097152 & 1203765760) != 0 ? EnumC8598a.None : enumC8598aM44498e, (4194304 & 1203765760) != 0, (8388608 & 1203765760) != 0 ? false : false, (16777216 & 1203765760) != 0 ? false : false, (33554432 & 1203765760) != 0 ? new Function2() { // from class: io.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C3551l.m17577k((File) obj, (CameraProperties) obj2);
            }
        } : null, (67108864 & 1203765760) != 0 ? new Function0() { // from class: io.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3551l.m17578l();
            }
        } : null, new Function0() { // from class: lo.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8211t0.m33509i0(this.f30412a, context, renderProps, videoCaptureHelper);
            }
        }, (268435456 & 1203765760) != 0 ? renderProps.getImageCaptureCount() : imageCaptureCount, (536870912 & 1203765760) != 0 ? null : strM17612R, (1073741824 & 1203765760) != 0 ? null : null, (1203765760 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0 ? null : webRtcManager, (3 & 1) != 0 ? false : false, (3 & 2) != 0 ? EnumC12529l.SLIDE_IN : null)), null, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final Object m33545j0(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull GovernmentIdState.HolographicTorchDelay renderState, @NotNull final AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a context, @NotNull final C11905l videoCaptureHelper, @NotNull final InterfaceC13215h<? super GovernmentIdWorkflow.AbstractC3503a> sink) {
        final C8211t0 c8211t0;
        final GovernmentIdWorkflow.Input renderProps2 = renderProps;
        Intrinsics.checkNotNullParameter(renderProps2, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        context.mo48835b("holographic_torch_delay", new a(renderState, context, null));
        if (renderState.getHolographicTorchEnabled()) {
            c8211t0 = this;
        } else {
            b bVar = new b(renderProps2, renderState, context, videoCaptureHelper, null);
            c8211t0 = this;
            renderProps2 = renderProps2;
            context.mo48835b("holographic_torch_complete", bVar);
        }
        CaptureConfig captureConfig = renderState.getCaptureConfig();
        IdConfig.IdSideConfig idSideConfigM17510d = C3540c.m17510d(captureConfig, renderState.getCurrentPart().getSide());
        String strM17508b = C3540c.m17508b(captureConfig);
        IdConfig.EnumC3514b side = renderState.getCurrentPart().getSide();
        String strM17605K = C3555n.m17605K(renderProps2.getStrings(), side, strM17508b, renderState.getCountryCode());
        String strM17604J = C3555n.m17604J(renderProps2.getStrings(), side, strM17508b, renderState.getCountryCode());
        String capturing = renderProps2.getStrings().getCapturing();
        Screen.C3527b.a aVar = Screen.C3527b.a.Disabled;
        Screen.Overlay overlay = idSideConfigM17510d.getOverlay();
        EnumC10302b enumC10302bM17507a = C3540c.m17507a(captureConfig);
        NavigationState navigationStateM44528b = c8211t0.navigationStateManager.m44528b();
        List listM31892k = C7699p.m31892k();
        int partIndex = renderState.getPartIndex();
        Function1 function1M17595A = C3555n.m17595A(context, false, 1, null);
        EnumC8598a enumC8598aM44498e = videoCaptureHelper.m44498e(renderProps2);
        InterfaceC11932a webRtcManager = videoCaptureHelper.getWebRtcManager();
        return new AlertContainerScreen(C3858g.m19165c(C3551l.m17572f(renderProps2, strM17605K, strM17604J, capturing, aVar, overlay, enumC10302bM17507a, side, navigationStateM44528b, (1203765760 & 512) != 0 ? new Function2() { // from class: io.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C3551l.m17574h((List) obj, (CameraProperties) obj2);
            }
        } : null, new Function0() { // from class: lo.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8211t0.m33512k0(sink);
            }
        }, new Function0() { // from class: lo.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8211t0.m33514l0(context, videoCaptureHelper);
            }
        }, false, listM31892k, renderState, partIndex, c8211t0.cameraXControllerFactory, c8211t0.camera2ControllerFactory, (262144 & 1203765760) != 0 ? new Function2() { // from class: io.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C3551l.m17575i((List) obj, (CameraProperties) obj2);
            }
        } : null, (524288 & 1203765760) != 0 ? new Function1() { // from class: io.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3551l.m17576j((Throwable) obj);
            }
        } : null, function1M17595A, (2097152 & 1203765760) != 0 ? EnumC8598a.None : enumC8598aM44498e, (4194304 & 1203765760) != 0, (8388608 & 1203765760) != 0 ? false : false, (16777216 & 1203765760) != 0 ? false : false, (33554432 & 1203765760) != 0 ? new Function2() { // from class: io.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C3551l.m17577k((File) obj, (CameraProperties) obj2);
            }
        } : null, (67108864 & 1203765760) != 0 ? new Function0() { // from class: io.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3551l.m17578l();
            }
        } : null, new Function0() { // from class: lo.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8211t0.m33516m0(this.f30463a, context, renderProps2);
            }
        }, (268435456 & 1203765760) != 0 ? renderProps2.getImageCaptureCount() : 0, (536870912 & 1203765760) != 0 ? null : null, (1073741824 & 1203765760) != 0 ? null : null, (1203765760 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0 ? null : webRtcManager, (3 & 1) != 0 ? false : renderState.getHolographicTorchEnabled(), (3 & 2) != 0 ? EnumC12529l.SLIDE_IN : null)), null, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: n0 */
    public final Object m33546n0(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull final GovernmentIdState.WaitForAutocapture renderState, @NotNull final AbstractC13218k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.AbstractC3503a, ? extends Object>.a context, @NotNull final C11905l videoCaptureHelper, @NotNull final InterfaceC13215h<? super GovernmentIdWorkflow.AbstractC3503a> sink) {
        C11905l c11905l;
        C9837c<Object, Object> c9837cM19165c;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        final CaptureConfig captureConfig = renderState.getCaptureConfig();
        IdConfig.IdSideConfig idSideConfigM17510d = C3540c.m17510d(captureConfig, renderState.getCurrentPart().getSide());
        String strM17508b = C3540c.m17508b(captureConfig);
        boolean z10 = captureConfig instanceof CaptureConfig.AutoClassifyConfig;
        C13230w.m48937l(context, this.governmentIdAnalyzeWorkerFactory.mo17543a(renderState.getCurrentPart().getSide(), strM17508b), C7731d0.m32011k(GovernmentIdAnalyzeWorker.class), "", new Function1() { // from class: lo.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33539y0(this.f30422a, renderState, captureConfig, (C7347n) obj);
            }
        });
        C13230w.m48937l(context, this.governmentIdHintWorkerFactory.mo38708a(renderState.getCurrentPart().getSide()), C7731d0.m32011k(GovernmentIdHintWorker.class), "", new Function1() { // from class: lo.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33458C0((Hint) obj);
            }
        });
        EnumC8598a enumC8598aM44498e = videoCaptureHelper.m44498e(renderProps);
        EnumC8598a enumC8598a = EnumC8598a.Stream;
        boolean z11 = enumC8598aM44498e == enumC8598a && !videoCaptureHelper.m44497d();
        if (idSideConfigM17510d.getManualCaptureConfig().getIsEnabled() && !z11) {
            C13230w.m48937l(context, InterfaceC13222o.Companion.m48891b(InterfaceC13222o.INSTANCE, C7764d.m32079d(idSideConfigM17510d.getManualCaptureConfig().getDelayMs(), 0L), null, 2, null), C7731d0.m32012l(InterfaceC13222o.class, KTypeProjection.INSTANCE.m32095a(C7731d0.m32011k(Unit.class))), idSideConfigM17510d.getSideKey(), new Function1() { // from class: lo.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C8211t0.m33462E0(renderState, (Unit) obj);
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        if (renderState.getError() != null) {
            Map mapM31791g = C7688j0.m31791g(C7352s.m30477a(AlertScreen.a.POSITIVE, this.applicationContext.getString(R.string.ok)));
            String string = this.applicationContext.getString(C12244g.f43258n);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add(new AlertScreen(mapM31791g, string, null, false, new Function1() { // from class: lo.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C8211t0.m33519o0(context, (AlertScreen.b) obj);
                }
            }, 12, null));
        }
        String strM17605K = C3555n.m17605K(renderProps.getStrings(), renderState.getCurrentPart().getSide(), strM17508b, renderState.getCountryCode());
        String strM17604J = C3555n.m17604J(renderProps.getStrings(), renderState.getCurrentPart().getSide(), strM17508b, renderState.getCountryCode());
        String strM17610P = C3555n.m17610P(renderProps.getStrings(), renderState.getCurrentPart().getSide(), strM17508b, renderState.getCountryCode(), z10);
        IdConfig.EnumC3514b side = renderState.getCurrentPart().getSide();
        Screen.C3527b.a manualCapture = renderState.getManualCapture();
        Screen.Overlay overlay = idSideConfigM17510d.getOverlay();
        EnumC10302b enumC10302bM17507a = C3540c.m17507a(captureConfig);
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        List<AutoCaptureRule> listM16167a = idSideConfigM17510d.getAutoCaptureConfig().getRuleSet().m16167a();
        int partIndex = renderState.getPartIndex();
        Function1 function1M17595A = C3555n.m17595A(context, false, 1, null);
        EnumC8598a enumC8598aM44498e2 = videoCaptureHelper.m44498e(renderProps);
        String strM17612R = C3555n.m17612R(renderProps.getStrings(), renderState.getHint());
        InterfaceC8607i interfaceC8607iM17606L = C3555n.m17606L(renderProps, renderState.getCurrentPart().getSide());
        InterfaceC11932a webRtcManager = videoCaptureHelper.getWebRtcManager();
        Screen.C3527b c3527bM17572f = C3551l.m17572f(renderProps, strM17605K, strM17604J, strM17610P, manualCapture, overlay, enumC10302bM17507a, side, navigationStateM44528b, (1203765760 & 512) != 0 ? new Function2() { // from class: io.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C3551l.m17574h((List) obj, (CameraProperties) obj2);
            }
        } : new Function2() { // from class: lo.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C8211t0.m33523q0(renderState, captureConfig, this, renderProps, context, videoCaptureHelper, (List) obj, (CameraProperties) obj2);
            }
        }, new Function0() { // from class: lo.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8211t0.m33525r0(sink);
            }
        }, new Function0() { // from class: lo.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8211t0.m33527s0(context, videoCaptureHelper);
            }
        }, false, listM16167a, renderState, partIndex, this.cameraXControllerFactory, this.camera2ControllerFactory, (262144 & 1203765760) != 0 ? new Function2() { // from class: io.o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C3551l.m17575i((List) obj, (CameraProperties) obj2);
            }
        } : null, (524288 & 1203765760) != 0 ? new Function1() { // from class: io.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3551l.m17576j((Throwable) obj);
            }
        } : new Function1() { // from class: lo.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8211t0.m33529t0(context, (Throwable) obj);
            }
        }, function1M17595A, (2097152 & 1203765760) != 0 ? EnumC8598a.None : enumC8598aM44498e2, (4194304 & 1203765760) != 0, (8388608 & 1203765760) != 0 ? false : false, (16777216 & 1203765760) != 0 ? false : false, (33554432 & 1203765760) != 0 ? new Function2() { // from class: io.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C3551l.m17577k((File) obj, (CameraProperties) obj2);
            }
        } : null, (67108864 & 1203765760) != 0 ? new Function0() { // from class: io.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3551l.m17578l();
            }
        } : new Function0() { // from class: lo.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8211t0.m33533v0(this.f30377a, renderState, context);
            }
        }, new Function0() { // from class: lo.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8211t0.m33537x0(this.f30382a, context, renderProps, videoCaptureHelper);
            }
        }, (268435456 & 1203765760) != 0 ? renderProps.getImageCaptureCount() : 0, (536870912 & 1203765760) != 0 ? null : strM17612R, (1073741824 & 1203765760) != 0 ? null : interfaceC8607iM17606L, (1203765760 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0 ? null : webRtcManager, (3 & 1) != 0 ? false : false, (3 & 2) != 0 ? EnumC12529l.SLIDE_IN : null);
        if (renderState.getCheckCameraPermissions()) {
            c9837cM19165c = C3555n.m17640j0(c3527bM17572f, this.applicationContext, context, renderProps, true, this.permissionRequestWorkflow);
        } else {
            if (renderState.getCheckAudioPermissions()) {
                c11905l = videoCaptureHelper;
                if (c11905l.m44496c(renderProps) && C7259g.m30272f(this.applicationContext) && renderProps.getVideoCaptureConfig().getRecordAudio()) {
                    c9837cM19165c = C3555n.m17632f0(c3527bM17572f, this.applicationContext, context, renderProps, true, this.permissionRequestWorkflow);
                }
            } else {
                c11905l = videoCaptureHelper;
            }
            if (c11905l.m44498e(renderProps) == enumC8598a && renderState.getWebRtcState() == EnumC11917x.Disconnected) {
                m33542G0(renderProps, renderState, context, c11905l.getWebRtcManager());
                c9837cM19165c = C3858g.m19165c(c3527bM17572f);
            } else {
                c9837cM19165c = C3858g.m19165c(c3527bM17572f);
            }
        }
        return new AlertContainerScreen(c9837cM19165c, arrayList);
    }
}
