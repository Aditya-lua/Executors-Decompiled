package p251ko;

import android.content.Context;
import android.view.View;
import androidx.core.view.InputDeviceCompat;
import androidx.p616lifecycle.AbstractC0968m;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.appsflyer.C1759R;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.camera.C3401a;
import com.withpersona.sdk2.camera.C3403c;
import com.withpersona.sdk2.camera.InterfaceC3404d;
import com.withpersona.sdk2.inquiry.governmentid.C3536a;
import com.withpersona.sdk2.inquiry.governmentid.C3555n;
import com.withpersona.sdk2.inquiry.governmentid.C3571o;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureButtonType;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdButtonEventData;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import gn.C6147k;
import io.EnumC6852d;
import io.OverlayAssets;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mn.EnumC8598a;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p132fn.C5686h0;
import p132fn.C5694l0;
import p132fn.C5696m0;
import p132fn.C5714v0;
import p132fn.C5717x;
import p132fn.InterfaceC5683g;
import p225jn.C7211b;
import p226jq.C7259g;
import p229jt.C7328a;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7946z0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p261l2.C7975b;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p497vp.C12239b;
import p498vq.C12249c;
import p526wq.C12543z;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ko.u */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00104\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R*\u0010:\u001a\u0016\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u0012\u0018\u000105j\u0004\u0018\u0001`78\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010.R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010=¨\u0006N"}, m31665d2 = {"Lko/u;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "Landroid/content/Context;", "context", "Lko/w;", "viewController", "Lfn/g;", "cameraController", "Lfn/x;", "governmentIdFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lko/w;Lfn/g;Lfn/x;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "rendering", "Lan/y;", "viewEnvironment", "", "t", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lan/y;)V", "", "maxRecordingLengthMs", "A", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;J)V", "Landroidx/lifecycle/m;", "lifecycleScope", "s", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Landroidx/lifecycle/m;J)V", "r", "()V", "", "q", "()Z", "b", "Landroid/content/Context;", "c", "Lko/w;", "d", "Lfn/g;", "e", "Lfn/x;", "f", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lku/d2;", "g", "Lku/d2;", "currentCaptureJob", "h", "maxRecordingLimitJob", "i", "Z", "currentHolographicTorchEnabled", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "j", "Lkotlin/jvm/functions/Function1;", "currentErrorHandler", "Lkotlin/Function0;", "k", "Lkotlin/jvm/functions/Function0;", "permissionChangedHandler", "l", "cameraStateListenerJob", "", "m", "Ljava/lang/Integer;", "lastAutoCaptureRulesId", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "n", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "lastLoggedIdleSide", "o", "I", "statusBarColor", "p", "currentPermissionChangedHandler", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7662u implements InterfaceC0382k<Screen.C3527b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7664w viewController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5683g cameraController;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C5717x governmentIdFeed;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public InterfaceC7850d2 currentCaptureJob;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public InterfaceC7850d2 maxRecordingLimitJob;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean currentHolographicTorchEnabled;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public Function1<? super Throwable, Unit> currentErrorHandler;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> permissionChangedHandler;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public InterfaceC7850d2 cameraStateListenerJob;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public Integer lastAutoCaptureRulesId;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public IdConfig.EnumC3514b lastLoggedIdleSide;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final int statusBarColor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> currentPermissionChangedHandler;

    /* JADX INFO: renamed from: ko.u$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"ko/u$a", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onResume", "(Landroidx/lifecycle/s;)V", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC0954f {
        public a() {
        }

        /* JADX INFO: renamed from: b */
        public static final void m31651b(C7662u c7662u) {
            Function0 function0 = c7662u.currentPermissionChangedHandler;
            if (function0 != null) {
                function0.invoke();
            }
            c7662u.m31647r();
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onCreate(InterfaceC0980s interfaceC0980s) {
            super.onCreate(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onDestroy(InterfaceC0980s interfaceC0980s) {
            super.onDestroy(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onPause(InterfaceC0980s interfaceC0980s) {
            super.onPause(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onResume(InterfaceC0980s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            View root = C7662u.this.viewController.getRoot();
            final C7662u c7662u = C7662u.this;
            root.post(new Runnable() { // from class: ko.t
                @Override // java.lang.Runnable
                public final void run() {
                    C7662u.a.m31651b(c7662u);
                }
            });
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onStart(InterfaceC0980s interfaceC0980s) {
            super.onStart(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onStop(InterfaceC0980s interfaceC0980s) {
            super.onStop(interfaceC0980s);
        }
    }

    /* JADX INFO: renamed from: ko.u$b */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m31665d2 = {"ko/u$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
            InterfaceC7850d2 interfaceC7850d2 = C7662u.this.maxRecordingLimitJob;
            if (interfaceC7850d2 != null) {
                InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
            }
            C7662u.this.maxRecordingLimitJob = null;
        }
    }

    /* JADX INFO: renamed from: ko.u$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29281a;

        static {
            int[] iArr = new int[EnumC6852d.values().length];
            try {
                iArr[EnumC6852d.K0000.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f29281a = iArr;
        }
    }

    /* JADX INFO: renamed from: ko.u$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$registerCameraStateListener$1", m39664f = "CameraScreenRunner.kt", m39665l = {363}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f29282t;

        /* JADX INFO: renamed from: ko.u$d$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C7662u f29284a;

            public a(C7662u c7662u) {
                this.f29284a = c7662u;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC3404d interfaceC3404d, InterfaceC9557b<? super Unit> interfaceC9557b) {
                Function1 function1;
                if (interfaceC3404d instanceof InterfaceC3404d.Ready) {
                    TrackingEventsLogger.logCameraInfoEvent$default(this.f29284a.trackingEventsLogger, C3403c.m16209a(this.f29284a.cameraController.mo16217a()), false, 2, null);
                } else if (Intrinsics.m31980c(interfaceC3404d, InterfaceC3404d.b.f12930a)) {
                    Function1 function2 = this.f29284a.currentErrorHandler;
                    if (function2 != null) {
                        function2.invoke(new C5714v0());
                    }
                } else if (interfaceC3404d instanceof InterfaceC3404d.Closed) {
                    InterfaceC3404d.Closed closed = (InterfaceC3404d.Closed) interfaceC3404d;
                    if (closed.getWasRecordingInterrupted() && (function1 = this.f29284a.currentErrorHandler) != null) {
                        function1.invoke(new C5694l0(closed.getIsClosedDueToBadCameraConfiguration()));
                    }
                }
                return Unit.f29331a;
            }
        }

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C7662u.this.new d(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f29282t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h<InterfaceC3404d> interfaceC9575hM16191a = C3401a.m16191a(C7662u.this.cameraController.mo16218b());
                a aVar = new a(C7662u.this);
                this.f29282t = 1;
                if (interfaceC9575hM16191a.collect(aVar, this) == objM38805e) {
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
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: ko.u$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$setupMaxRecordingLimitJobIfNeeded$1", m39664f = "CameraScreenRunner.kt", m39665l = {329, 337}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f29285t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ long f29286u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C7662u f29287v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Screen.C3527b f29288w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, C7662u c7662u, Screen.C3527b c3527b, InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f29286u = j10;
            this.f29287v = c7662u;
            this.f29288w = c3527b;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new e(this.f29286u, this.f29287v, this.f29288w, interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0075  */
        /* JADX WARN: Code duplicated, block: B:28:0x009f  */
        /* JADX WARN: Code duplicated, block: B:31:0x00e1  */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Function1 function1;
            C7662u c7662u;
            Screen.C3527b c3527b;
            C7662u c7662u2;
            Screen.C3527b c3527b2;
            Throwable thM30463e;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f29285t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long j10 = this.f29286u;
                this.f29285t = 1;
                if (C7946z0.m32938b(j10, this) != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 == 1) {
                C7348o.m30470b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                value = ((C7347n) obj).getValue();
            }
            c7662u = this.f29287v;
            c3527b = this.f29288w;
            if (C7347n.m30466h(value)) {
                ((File) value).delete();
                TrackingEventsLogger.logVideoStopEvent$default(c7662u.trackingEventsLogger, "government-id", c3527b.getVideoCaptureMethod().toString(), null, null, null, null, false, C1759R.styleable.AppCompatTheme_windowMinWidthMajor, null);
            }
            c7662u2 = this.f29287v;
            c3527b2 = this.f29288w;
            thM30463e = C7347n.m30463e(value);
            if (thM30463e != null) {
                TrackingEventsLogger.logVideoErrorEvent$default(c7662u2.trackingEventsLogger, "government-id", c3527b2.getVideoCaptureMethod().toString(), null, C7328a.m30430b(thM30463e), false, 20, null);
            }
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.f29287v.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.RECORDING_TIMED_OUT, null, C3555n.m17628d0(this.f29288w.getCaptureSide()), null, 8, null), false, 2, null);
            function1 = this.f29287v.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new C5696m0());
            }
            return Unit.f29331a;
            this.f29287v.maxRecordingLimitJob = null;
            if (this.f29287v.cameraController.mo16218b().getValue() instanceof InterfaceC3404d.Closed) {
                return Unit.f29331a;
            }
            if (this.f29288w.getVideoCaptureMethod() == EnumC8598a.Upload) {
                InterfaceC5683g interfaceC5683g = this.f29287v.cameraController;
                this.f29285t = 2;
                Object objMo16225i = interfaceC5683g.mo16225i(this);
                if (objMo16225i != objM38805e) {
                    value = objMo16225i;
                    c7662u = this.f29287v;
                    c3527b = this.f29288w;
                    if (C7347n.m30466h(value)) {
                        ((File) value).delete();
                        TrackingEventsLogger.logVideoStopEvent$default(c7662u.trackingEventsLogger, "government-id", c3527b.getVideoCaptureMethod().toString(), null, null, null, null, false, C1759R.styleable.AppCompatTheme_windowMinWidthMajor, null);
                    }
                    c7662u2 = this.f29287v;
                    c3527b2 = this.f29288w;
                    thM30463e = C7347n.m30463e(value);
                    if (thM30463e != null) {
                        TrackingEventsLogger.logVideoErrorEvent$default(c7662u2.trackingEventsLogger, "government-id", c3527b2.getVideoCaptureMethod().toString(), null, C7328a.m30430b(thM30463e), false, 20, null);
                    }
                }
                return objM38805e;
            }
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.f29287v.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.RECORDING_TIMED_OUT, null, C3555n.m17628d0(this.f29288w.getCaptureSide()), null, 8, null), false, 2, null);
            function1 = this.f29287v.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new C5696m0());
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: ko.u$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$2$1", m39664f = "CameraScreenRunner.kt", m39665l = {209}, m39666m = "invokeSuspend")
    public static final class f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public Object f29289A;

        /* JADX INFO: renamed from: B */
        public int f29290B;

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ Screen.C3527b f29291C;

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ C7662u f29292D;

        /* JADX INFO: renamed from: t */
        public int f29293t;

        /* JADX INFO: renamed from: u */
        public int f29294u;

        /* JADX INFO: renamed from: v */
        public int f29295v;

        /* JADX INFO: renamed from: w */
        public int f29296w;

        /* JADX INFO: renamed from: x */
        public Object f29297x;

        /* JADX INFO: renamed from: y */
        public Object f29298y;

        /* JADX INFO: renamed from: z */
        public Object f29299z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Screen.C3527b c3527b, C7662u c7662u, InterfaceC9557b<? super f> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f29291C = c3527b;
            this.f29292D = c7662u;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new f(this.f29291C, this.f29292D, interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x004a  */
        /* JADX WARN: Code duplicated, block: B:12:0x0066 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:13:0x0067  */
        /* JADX WARN: Code duplicated, block: B:16:0x006e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0067 -> B:14:0x0068). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p344ot.C10047c.m38805e()
                int r1 = r10.f29290B
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L32
                if (r1 != r3) goto L2a
                int r1 = r10.f29294u
                int r4 = r10.f29293t
                java.lang.Object r5 = r10.f29289A
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                java.lang.Object r6 = r10.f29299z
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                java.lang.Object r7 = r10.f29298y
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r7 = (com.withpersona.sdk2.inquiry.governmentid.Screen.C3527b) r7
                java.lang.Object r8 = r10.f29297x
                ko.u r8 = (p251ko.C7662u) r8
                p229jt.C7348o.m30470b(r11)
                jt.n r11 = (p229jt.C7347n) r11
                java.lang.Object r11 = r11.getValue()
                goto L68
            L2a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L32:
                p229jt.C7348o.m30470b(r11)
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r11 = r10.f29291C
                int r11 = r11.getRemainingCaptureCount()
                ko.u r1 = r10.f29292D
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r4 = r10.f29291C
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r11)
                r8 = r1
                r1 = r2
                r7 = r4
                r4 = r11
            L48:
                if (r1 >= r4) goto L8b
                fn.g r11 = p251ko.C7662u.m31630h(r8)
                r10.f29297x = r8
                r10.f29298y = r7
                r10.f29299z = r5
                r10.f29289A = r5
                r10.f29293t = r4
                r10.f29294u = r1
                r10.f29295v = r1
                r10.f29296w = r2
                r10.f29290B = r3
                java.lang.Object r11 = r11.mo16227k(r10)
                if (r11 != r0) goto L67
                return r0
            L67:
                r6 = r5
            L68:
                java.lang.Throwable r9 = p229jt.C7347n.m30463e(r11)
                if (r9 != 0) goto L7a
                java.io.File r11 = (java.io.File) r11
                java.lang.String r11 = r11.getAbsolutePath()
                r5.add(r11)
                int r1 = r1 + r3
                r5 = r6
                goto L48
            L7a:
                boolean r11 = r9 instanceof hn.C6459o0
                if (r11 == 0) goto L81
                kotlin.Unit r11 = kotlin.Unit.f29331a
                return r11
            L81:
                kotlin.jvm.functions.Function1 r11 = r7.m17358E()
                r11.invoke(r9)
                kotlin.Unit r11 = kotlin.Unit.f29331a
                return r11
            L8b:
                ko.u r11 = r10.f29292D
                ko.w r11 = p251ko.C7662u.m31635m(r11)
                r11.mo31618e()
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r11 = r10.f29291C
                kotlin.jvm.functions.Function2 r11 = r11.m17395y()
                ko.u r0 = r10.f29292D
                fn.g r0 = p251ko.C7662u.m31630h(r0)
                com.withpersona.sdk2.camera.CameraProperties r0 = r0.mo16217a()
                r11.invoke(r5, r0)
                kotlin.Unit r11 = kotlin.Unit.f29331a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p251ko.C7662u.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: ko.u$g */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$6", m39664f = "CameraScreenRunner.kt", m39665l = {249, InputDeviceCompat.SOURCE_KEYBOARD}, m39666m = "invokeSuspend")
    public static final class g extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public int f29300A;

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ Screen.C3527b f29301B;

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ C7662u f29302C;

        /* JADX INFO: renamed from: t */
        public int f29303t;

        /* JADX INFO: renamed from: u */
        public int f29304u;

        /* JADX INFO: renamed from: v */
        public int f29305v;

        /* JADX INFO: renamed from: w */
        public int f29306w;

        /* JADX INFO: renamed from: x */
        public Object f29307x;

        /* JADX INFO: renamed from: y */
        public Object f29308y;

        /* JADX INFO: renamed from: z */
        public Object f29309z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Screen.C3527b c3527b, C7662u c7662u, InterfaceC9557b<? super g> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f29301B = c3527b;
            this.f29302C = c7662u;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new g(this.f29301B, this.f29302C, interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x004f  */
        /* JADX WARN: Code duplicated, block: B:15:0x006a  */
        /* JADX WARN: Code duplicated, block: B:18:0x0074  */
        /* JADX WARN: Code duplicated, block: B:19:0x007b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x006a -> B:16:0x006e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p344ot.C10047c.m38805e()
                int r1 = r11.f29300A
                r2 = 0
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L3b
                if (r1 == r5) goto L21
                if (r1 != r3) goto L19
                java.lang.Object r0 = r11.f29307x
                java.util.List r0 = (java.util.List) r0
                p229jt.C7348o.m30470b(r12)
                goto La2
            L19:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L21:
                int r1 = r11.f29304u
                int r6 = r11.f29303t
                java.lang.Object r7 = r11.f29309z
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                java.lang.Object r8 = r11.f29308y
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                java.lang.Object r9 = r11.f29307x
                ko.u r9 = (p251ko.C7662u) r9
                p229jt.C7348o.m30470b(r12)
                jt.n r12 = (p229jt.C7347n) r12
                java.lang.Object r12 = r12.getValue()
                goto L6e
            L3b:
                p229jt.C7348o.m30470b(r12)
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r12 = r11.f29301B
                int r12 = r12.getRemainingCaptureCount()
                ko.u r1 = r11.f29302C
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>(r12)
                r9 = r1
                r1 = r2
            L4d:
                if (r1 >= r12) goto L83
                fn.g r7 = p251ko.C7662u.m31630h(r9)
                r11.f29307x = r9
                r11.f29308y = r6
                r11.f29309z = r6
                r11.f29303t = r12
                r11.f29304u = r1
                r11.f29305v = r1
                r11.f29306w = r2
                r11.f29300A = r5
                java.lang.Object r7 = r7.mo16227k(r11)
                if (r7 != r0) goto L6a
                goto La0
            L6a:
                r8 = r6
                r6 = r12
                r12 = r7
                r7 = r8
            L6e:
                java.lang.Throwable r10 = p229jt.C7347n.m30463e(r12)
                if (r10 != 0) goto L7b
                java.io.File r12 = (java.io.File) r12
                java.lang.String r12 = r12.getAbsolutePath()
                goto L7c
            L7b:
                r12 = r4
            L7c:
                r7.add(r12)
                int r1 = r1 + r5
                r12 = r6
                r6 = r8
                goto L4d
            L83:
                ko.u r12 = r11.f29302C
                ko.w r12 = p251ko.C7662u.m31635m(r12)
                r12.mo31618e()
                ko.u r12 = r11.f29302C
                ko.w r12 = p251ko.C7662u.m31635m(r12)
                r11.f29307x = r6
                r11.f29308y = r4
                r11.f29309z = r4
                r11.f29300A = r3
                java.lang.Object r12 = r12.mo31620g(r11)
                if (r12 != r0) goto La1
            La0:
                return r0
            La1:
                r0 = r6
            La2:
                com.withpersona.sdk2.inquiry.governmentid.Screen$b r12 = r11.f29301B
                kotlin.jvm.functions.Function2 r12 = r12.m17374d()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r0 = kotlin.collections.CollectionsKt.m31703a0(r0)
                ko.u r1 = r11.f29302C
                fn.g r1 = p251ko.C7662u.m31630h(r1)
                com.withpersona.sdk2.camera.CameraProperties r1 = r1.mo16217a()
                r12.invoke(r0, r1)
                kotlin.Unit r12 = kotlin.Unit.f29331a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p251ko.C7662u.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((g) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: ko.u$h */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$8", m39664f = "CameraScreenRunner.kt", m39665l = {271}, m39666m = "invokeSuspend")
    public static final class h extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f29310t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Screen.C3527b f29312v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Screen.C3527b c3527b, InterfaceC9557b<? super h> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f29312v = c3527b;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C7662u.this.new h(this.f29312v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f29310t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC5683g interfaceC5683g = C7662u.this.cameraController;
                this.f29310t = 1;
                Object objMo16225i = interfaceC5683g.mo16225i(this);
                if (objMo16225i == objM38805e) {
                    return objM38805e;
                }
                value = objMo16225i;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                value = ((C7347n) obj).getValue();
            }
            Screen.C3527b c3527b = this.f29312v;
            C7662u c7662u = C7662u.this;
            if (C7347n.m30466h(value)) {
                c3527b.m17359F().invoke((File) value, c7662u.cameraController.mo16217a());
                TrackingEventsLogger.logVideoStopEvent$default(c7662u.trackingEventsLogger, "government-id", c3527b.getVideoCaptureMethod().toString(), null, null, null, null, false, C1759R.styleable.AppCompatTheme_windowMinWidthMajor, null);
            }
            C7662u c7662u2 = C7662u.this;
            Screen.C3527b c3527b2 = this.f29312v;
            Throwable thM30463e = C7347n.m30463e(value);
            if (thM30463e != null) {
                TrackingEventsLogger.logVideoErrorEvent$default(c7662u2.trackingEventsLogger, "government-id", c3527b2.getVideoCaptureMethod().toString(), null, C7328a.m30430b(thM30463e), false, 20, null);
                if (!(thM30463e instanceof C5686h0)) {
                    c3527b2.m17357D().invoke(thM30463e);
                }
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((h) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: ko.u$i */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$startLocalVideoCaptureIfNeeded$1", m39664f = "CameraScreenRunner.kt", m39665l = {MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE}, m39666m = "invokeSuspend")
    public static final class i extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f29313t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Screen.C3527b f29315v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ AbstractC0968m f29316w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ long f29317x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Screen.C3527b c3527b, AbstractC0968m abstractC0968m, long j10, InterfaceC9557b<? super i> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f29315v = c3527b;
            this.f29316w = abstractC0968m;
            this.f29317x = j10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C7662u.this.new i(this.f29315v, this.f29316w, this.f29317x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objMo16226j;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f29313t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC5683g interfaceC5683g = C7662u.this.cameraController;
                this.f29313t = 1;
                objMo16226j = interfaceC5683g.mo16226j(this);
                if (objMo16226j == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                objMo16226j = ((C7347n) obj).getValue();
            }
            C7662u c7662u = C7662u.this;
            Screen.C3527b c3527b = this.f29315v;
            AbstractC0968m abstractC0968m = this.f29316w;
            long j10 = this.f29317x;
            if (C7347n.m30466h(objMo16226j)) {
                if (((Boolean) objMo16226j).booleanValue()) {
                    c7662u.m31648s(c3527b, abstractC0968m, j10);
                }
                TrackingEventsLogger.logVideoStartEvent$default(c7662u.trackingEventsLogger, "government-id", c3527b.getVideoCaptureMethod().toString(), null, false, 12, null);
            }
            C7662u c7662u2 = C7662u.this;
            Screen.C3527b c3527b2 = this.f29315v;
            Throwable thM30463e = C7347n.m30463e(objMo16226j);
            if (thM30463e != null) {
                TrackingEventsLogger.logVideoErrorEvent$default(c7662u2.trackingEventsLogger, "government-id", c3527b2.getVideoCaptureMethod().toString(), null, C7328a.m30430b(thM30463e), false, 20, null);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((i) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C7662u(@NotNull Context context, @NotNull InterfaceC7664w viewController, @NotNull InterfaceC5683g cameraController, @NotNull C5717x governmentIdFeed, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.context = context;
        this.viewController = viewController;
        this.cameraController = cameraController;
        this.governmentIdFeed = governmentIdFeed;
        this.trackingEventsLogger = trackingEventsLogger;
        this.statusBarColor = C7975b.m33005c(context, C12239b.f43188a);
        viewController.mo31615a();
        C7259g.m30275i(context).mo4656a().mo4935a(new a());
        m31647r();
        viewController.getRoot().addOnAttachStateChangeListener(new b());
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m31639u(C7662u c7662u, boolean z10) {
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(c7662u.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.FLASH, null, 2, null), false, 2, null);
        c7662u.cameraController.mo16219c(z10);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m31640v(C7662u c7662u, Screen.C3527b c3527b, AbstractC0968m abstractC0968m) {
        boolean zM31646q = c7662u.m31646q();
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(c7662u.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.SHUTTER, null, 2, null), false, 2, null);
        if (!zM31646q) {
            c7662u.m31645A(c3527b, c3527b.getMaxRecordingLengthMs());
            c3527b.m17394x().invoke();
            c7662u.currentCaptureJob = C7882k.m32780d(abstractC0968m, C7864g1.m32645c(), null, new f(c3527b, c7662u, null), 2, null);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m31641w(C7662u c7662u) {
        TrackingEventsLogger.logGovernmentIdButtonClickEvent$default(c7662u.trackingEventsLogger, new GovernmentIdButtonEventData(GovIdCaptureButtonType.CAPTURE_TIPS, null, 2, null), false, 2, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m31642x(C7662u c7662u) {
        c7662u.cameraController.mo16221e();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y */
    public static final void m31643y(C7662u c7662u, View view) {
        c7662u.cameraController.mo16221e();
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m31644z(C7662u c7662u) {
        C7211b.m30141a(c7662u.governmentIdFeed, c7662u.cameraController, c7662u.viewController.mo31616b());
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: A */
    public final void m31645A(Screen.C3527b rendering, long maxRecordingLengthMs) {
        if (rendering.getVideoCaptureMethod() == EnumC8598a.Upload) {
            AbstractC0968m abstractC0968mM4979a = C0982t.m4979a(C7259g.m30275i(this.context));
            C7882k.m32780d(abstractC0968mM4979a, C7864g1.m32645c(), null, new i(rendering, abstractC0968mM4979a, maxRecordingLengthMs, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m31646q() {
        InterfaceC7850d2 interfaceC7850d2 = this.currentCaptureJob;
        return interfaceC7850d2 != null && interfaceC7850d2.mo32556b();
    }

    /* JADX INFO: renamed from: r */
    public final void m31647r() {
        InterfaceC7850d2 interfaceC7850d2 = this.cameraStateListenerJob;
        if (interfaceC7850d2 != null) {
            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
        }
        this.cameraStateListenerJob = C7882k.m32780d(C0982t.m4979a(C7259g.m30275i(this.context)), null, null, new d(null), 3, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m31648s(Screen.C3527b rendering, AbstractC0968m lifecycleScope, long maxRecordingLengthMs) {
        InterfaceC7850d2 interfaceC7850d2 = this.maxRecordingLimitJob;
        if (interfaceC7850d2 != null) {
            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
        }
        this.maxRecordingLimitJob = C7882k.m32780d(lifecycleScope, C7864g1.m32644b(), null, new e(maxRecordingLengthMs, this, rendering, null), 2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;)V */
    @Override // p016an.InterfaceC0382k
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo1442a(@NotNull final Screen.C3527b rendering, @NotNull ViewEnvironment viewEnvironment) {
        InterfaceC7850d2 interfaceC7850d2;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        final AbstractC0968m abstractC0968mM4979a = C0982t.m4979a(C7259g.m30275i(this.context));
        if (this.lastLoggedIdleSide != rendering.getCaptureSide()) {
            this.lastLoggedIdleSide = rendering.getCaptureSide();
            TrackingEventsLogger.logGovernmentIdStateEvent$default(this.trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.IDLE, null, C3555n.m17628d0(rendering.getCaptureSide()), null, 8, null), false, 2, null);
        }
        this.cameraController.mo16224h();
        if (rendering.getHolographicTorchEnabled() != this.currentHolographicTorchEnabled) {
            this.currentHolographicTorchEnabled = rendering.getHolographicTorchEnabled();
            this.cameraController.mo16219c(rendering.getHolographicTorchEnabled());
        }
        if (C7665x.m31658b(rendering)) {
            m31648s(rendering, abstractC0968mM4979a, rendering.getMaxRecordingLengthMs());
        }
        this.cameraController.mo16222f(rendering.getEnableAnalyzer());
        C12249c.m45393b(viewEnvironment, this.context, this.statusBarColor);
        Integer num = this.lastAutoCaptureRulesId;
        int autoCaptureRulesId = rendering.getAutoCaptureRulesId();
        if (num == null || num.intValue() != autoCaptureRulesId) {
            this.governmentIdFeed.m25897o(C7663v.m31654b(rendering.getCaptureSide()), rendering.m17375e(), C7697o.m31878d(new C6147k()), c.f29281a[rendering.getDesignVersion().ordinal()] == 1);
            this.lastAutoCaptureRulesId = Integer.valueOf(rendering.getAutoCaptureRulesId());
        }
        this.currentErrorHandler = rendering.m17357D();
        this.permissionChangedHandler = rendering.m17384n();
        InterfaceC7664w interfaceC7664w = this.viewController;
        String message = rendering.getMessage();
        String scanInstructions = rendering.getScanInstructions();
        String disclaimer = rendering.getDisclaimer();
        String str = rendering.getCom.withpersona.sdk2.inquiry.network.dto.ui.components.Title.type java.lang.String();
        String description = rendering.getDescription();
        String hintText = rendering.getHintText();
        Screen.C3527b.a captureButtonState = (rendering.getCaptureButtonState() != Screen.C3527b.a.Enabled || rendering.getIsEnabled()) ? rendering.getCaptureButtonState() : Screen.C3527b.a.Disabled;
        IdConfig.EnumC3514b captureSide = rendering.getCaptureSide();
        Screen.Overlay overlay = rendering.getOverlay();
        OverlayAssets overlayAssetsM17730b = C3571o.m17730b(this.context, rendering.getOverlay(), rendering.getCaptureSide());
        NextStep.GovernmentId.AssetConfig.CapturePage assetConfig = rendering.getAssetConfig();
        interfaceC7664w.mo31617c(message, scanInstructions, disclaimer, str, description, hintText, captureButtonState, captureSide, overlay, overlayAssetsM17730b, assetConfig != null ? C3536a.m17498a(assetConfig, rendering.getIdClass(), rendering.getCaptureSide()) : null, C7665x.m31657a(rendering), rendering.getShowFinalizeUi(), rendering.getNavigationState(), rendering.getNavBarTitle(), rendering.getCaptureTips(), rendering.getAssetConfig(), rendering.getPlaySideTransition(), rendering.m17378h(), rendering.m17385o(), new Function1() { // from class: ko.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C7662u.m31639u(this.f29255a, ((Boolean) obj).booleanValue());
            }
        }, new Function0() { // from class: ko.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7662u.m31640v(this.f29256a, rendering, abstractC0968mM4979a);
            }
        }, new Function0() { // from class: ko.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7662u.m31641w(this.f29259a);
            }
        }, new Function0() { // from class: ko.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7662u.m31642x(this.f29260a);
            }
        }, rendering.getStyles(), rendering.getWatermarkText());
        this.cameraController.getPreviewView().setOnClickListener(new View.OnClickListener() { // from class: ko.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7662u.m31643y(this.f29261a, view);
            }
        });
        if (rendering.getAutoCapturing() && !m31646q()) {
            m31645A(rendering, rendering.getMaxRecordingLengthMs());
            this.currentCaptureJob = C7882k.m32780d(abstractC0968mM4979a, C7864g1.m32645c(), null, new g(rendering, this, null), 2, null);
        }
        C12543z.m46890b(this.cameraController.getPreviewView(), new Function0() { // from class: ko.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7662u.m31644z(this.f29262a);
            }
        });
        if (((rendering.getState() instanceof GovernmentIdState.FinalizeWebRtc) || rendering.getFinalizeLocalVideo()) && (interfaceC7850d2 = this.maxRecordingLimitJob) != null) {
            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
        }
        if (rendering.getFinalizeLocalVideo()) {
            C7882k.m32780d(abstractC0968mM4979a, C7864g1.m32645c(), null, new h(rendering, null), 2, null);
        }
    }
}
