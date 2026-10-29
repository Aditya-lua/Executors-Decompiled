package p610zo;

import android.app.Application;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.p616lifecycle.C0942b;
import androidx.p616lifecycle.C0949d0;
import androidx.p616lifecycle.C0967l0;
import androidx.p616lifecycle.C0993y0;
import com.withpersona.sdk2.inquiry.Inquiry;
import com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager;
import com.withpersona.sdk2.inquiry.InquiryActivityEvent;
import com.withpersona.sdk2.inquiry.OnInquiryEventListener;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderConfig;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderOutput;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mp.C8618e0;
import mp.C8619f;
import mp.C8624h0;
import mp.C8630m;
import mp.C8636s;
import mp.C8642y;
import mp.InterfaceC8611b;
import mq.C8648e;
import nu.C9578i0;
import nu.C9596r0;
import nu.InterfaceC9564b0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9574g0;
import nu.InterfaceC9577i;
import nu.InterfaceC9592p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139g.C5859h;
import p139g.InterfaceC5853b;
import p229jt.C7334d;
import p229jt.C7348o;
import p239k6.InterfaceC7479s;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p278lp.C8223e;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p363pq.InterfaceC10307a;
import p390qp.C10693g;
import p391qq.C10700c;
import p524wo.ScreenState;
import p582yn.InterfaceC13248k;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: zo.x */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 p2\u00020\u0001:\u0002\u0080\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R$\u0010(\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0017\u0010-\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,R\u001a\u00103\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\b048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R*\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR*\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR*\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010=\u001a\u0004\bH\u0010?\"\u0004\bI\u0010AR*\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010=\u001a\u0004\bL\u0010?\"\u0004\bM\u0010AR\u0017\u0010R\u001a\u00020O8\u0006¢\u0006\f\n\u0004\b7\u0010P\u001a\u0004\b<\u0010QR\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020T0S8\u0006¢\u0006\f\n\u0004\b>\u0010U\u001a\u0004\b/\u0010VR#\u0010^\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0006¢\u0006\u0012\n\u0004\b+\u0010Z\u0012\u0004\b]\u0010\u0015\u001a\u0004\b[\u0010\\R#\u0010b\u001a\b\u0012\u0004\u0012\u00020_0S8\u0006¢\u0006\u0012\n\u0004\b`\u0010U\u0012\u0004\ba\u0010\u0015\u001a\u0004\bK\u0010VR&\u0010i\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020e0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010f\u001a\u0004\bg\u0010hR&\u0010l\u001a\u000e\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020\b0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010f\u001a\u0004\bk\u0010hR,\u0010q\u001a\u0014\u0012\u0004\u0012\u00020m\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0n0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bo\u0010f\u001a\u0004\bp\u0010hR2\u0010s\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0r\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0n0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010f\u001a\u0004\bG\u0010hR&\u0010u\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bt\u0010f\u001a\u0004\bt\u0010hR.\u0010v\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0r\u0012\u0006\u0012\u0004\u0018\u00010j0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010f\u001a\u0004\bC\u0010hR&\u0010y\u001a\u000e\u0012\u0004\u0012\u00020w\u0012\u0004\u0012\u00020x0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010f\u001a\u0004\bo\u0010hR&\u0010|\u001a\u000e\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020{0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010f\u001a\u0004\b`\u0010hR&\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020~0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010f\u001a\u0004\b5\u0010h¨\u0006\u0081\u0001"}, m31665d2 = {"Lzo/x;", "Landroidx/lifecycle/b;", "Landroid/app/Application;", "application", "Landroidx/lifecycle/l0;", "savedStateHandle", "<init>", "(Landroid/app/Application;Landroidx/lifecycle/l0;)V", "", "foregrounded", "", "E", "(Z)V", "Lg/b;", "activityResultCaller", "G", "(Lg/b;)V", "B", "newValue", "I", "d", "()V", "F", "D", "C", "force", "skipBackendCall", "e", "(ZZ)V", "c", "Landroid/app/Application;", "Landroidx/lifecycle/l0;", "w", "()Landroidx/lifecycle/l0;", "Lzo/s;", "Lzo/s;", "f", "()Lzo/s;", "H", "(Lzo/s;)V", "component", "", "J", "o", "()J", "inquiryStartTimeMs", "Lqq/c;", "g", "Lqq/c;", "y", "()Lqq/c;", "sdkFilesManager", "Lnu/p0;", "h", "Lnu/p0;", "m", "()Lnu/p0;", "forceFallbackModeFlow", "Landroidx/lifecycle/d0;", "", "i", "Landroidx/lifecycle/d0;", "n", "()Landroidx/lifecycle/d0;", "setInquiryId", "(Landroidx/lifecycle/d0;)V", "inquiryId", "j", "A", "setSessionToken", "sessionToken", "k", "r", "setLastStep", "lastStep", "l", "q", "setLastPage", "lastPage", "Lmq/e;", "Lmq/e;", "()Lmq/e;", "dataCollector", "Lnu/b0;", "Lpq/a;", "Lnu/b0;", "()Lnu/b0;", "controllerRequestFlow", "Lnu/c0;", "Lwo/c;", "Lnu/c0;", "x", "()Lnu/c0;", "getScreenStateFlow$annotations", "screenStateFlow", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;", "p", "getEventFlow$annotations", "eventFlow", "Lmp/h0;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "Lmp/h0;", "v", "()Lmp/h0;", "resolvableApiLauncher", "Landroid/net/Uri;", "t", "pictureLaunchResultLauncher", "Lg/h;", "", "s", "z", "selectFromPhotoLibraryLauncher", "", "documentsSelectResultLauncher", "u", "requestPermissionResultLauncher", "documentSelectResultLauncher", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "passportNfcReaderLauncher", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderConfig;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;", "jpMyNumberNfcReaderLauncher", "Lmp/b;", "", "customTabsLauncher", "b", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13987x extends C0942b {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Application application;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public InterfaceC13982s component;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final long inquiryStartTimeMs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C10700c sdkFilesManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9592p0<Boolean> forceFallbackModeFlow;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public C0949d0<String> inquiryId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public C0949d0<String> sessionToken;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public C0949d0<String> lastStep;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public C0949d0<String> lastPage;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final C8648e dataCollector;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9564b0<InterfaceC10307a> controllerRequestFlow;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<ScreenState> screenStateFlow;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9564b0<InquiryEvent> eventFlow;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final C8624h0<IntentSenderRequest, ActivityResult> resolvableApiLauncher;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final C8624h0<Uri, Boolean> pictureLaunchResultLauncher;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final C8624h0<C5859h, List<Uri>> selectFromPhotoLibraryLauncher;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final C8624h0<String[], List<Uri>> documentsSelectResultLauncher;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final C8624h0<String, Boolean> requestPermissionResultLauncher;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final C8624h0<String[], Uri> documentSelectResultLauncher;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final C8624h0<PassportNfcReaderConfig, PassportNfcReaderOutput> passportNfcReaderLauncher;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final C8624h0<JpMyNumberNfcReaderConfig, JpMyNumberNfcReaderOutput> jpMyNumberNfcReaderLauncher;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final C8624h0<InterfaceC8611b, Integer> customTabsLauncher;

    /* JADX INFO: renamed from: zo.x$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1", m39664f = "InquiryViewModel.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48883t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f48884u;

        /* JADX INFO: renamed from: zo.x$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1$1", m39664f = "InquiryViewModel.kt", m39665l = {106}, m39666m = "invokeSuspend")
        public static final class C14297a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f48886t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C13987x f48887u;

            /* JADX INFO: renamed from: zo.x$a$a$a, reason: collision with other inner class name */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C14298a<T> implements InterfaceC9577i {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C13987x f48888a;

                public C14298a(C13987x c13987x) {
                    this.f48888a = c13987x;
                }

                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
                @Override // nu.InterfaceC9577i
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(InquiryActivityEvent inquiryActivityEvent, InterfaceC9557b<? super Unit> interfaceC9557b) {
                    if (inquiryActivityEvent instanceof InquiryActivityEvent.CancelInquiry) {
                        this.f48888a.m50544e(true, ((InquiryActivityEvent.CancelInquiry) inquiryActivityEvent).getSkipBackendCall());
                    }
                    return Unit.f29331a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14297a(C13987x c13987x, InterfaceC9557b<? super C14297a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f48887u = c13987x;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new C14297a(this.f48887u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f48886t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC9574g0<InquiryActivityEvent> eventFlow = InquiryActivityBroadcastManager.INSTANCE.getEventFlow();
                    C14298a c14298a = new C14298a(this.f48887u);
                    this.f48886t = 1;
                    if (eventFlow.collect(c14298a, this) == objM38805e) {
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
                return ((C14297a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: zo.x$a$b */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1$2", m39664f = "InquiryViewModel.kt", m39665l = {114}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f48889t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C13987x f48890u;

            /* JADX INFO: renamed from: zo.x$a$b$a, reason: collision with other inner class name */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C14299a<T> implements InterfaceC9577i {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C13987x f48891a;

                public C14299a(C13987x c13987x) {
                    this.f48891a = c13987x;
                }

                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
                @Override // nu.InterfaceC9577i
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(InquiryEvent inquiryEvent, InterfaceC9557b<? super Unit> interfaceC9557b) {
                    OnInquiryEventListener onEventListener = Inquiry.INSTANCE.getOnEventListener();
                    if (onEventListener != null) {
                        onEventListener.onEvent(inquiryEvent);
                    }
                    if (inquiryEvent instanceof InquiryEvent.PageChange) {
                        InquiryEvent.PageChange pageChange = (InquiryEvent.PageChange) inquiryEvent;
                        this.f48891a.m50557r().mo4863o(pageChange.getName());
                        this.f48891a.m50556q().mo4863o(pageChange.getPath());
                    }
                    return Unit.f29331a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C13987x c13987x, InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f48890u = c13987x;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new b(this.f48890u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f48889t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC9564b0<InquiryEvent> interfaceC9564b0M50551l = this.f48890u.m50551l();
                    C14299a c14299a = new C14299a(this.f48890u);
                    this.f48889t = 1;
                    if (interfaceC9564b0M50551l.collect(c14299a, this) == objM38805e) {
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

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = C13987x.this.new a(interfaceC9557b);
            aVar.f48884u = obj;
            return aVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f48884u;
            C10047c.m38805e();
            if (this.f48883t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C7882k.m32780d(interfaceC7906p0, null, null, new C14297a(C13987x.this, null), 3, null);
            C7882k.m32780d(interfaceC7906p0, C7864g1.m32645c(), null, new b(C13987x.this, null), 2, null);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: zo.x$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$cancelInquiry$1", m39664f = "InquiryViewModel.kt", m39665l = {199}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48892t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ boolean f48894v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ boolean f48895w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, boolean z11, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48894v = z10;
            this.f48895w = z11;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C13987x.this.new c(this.f48894v, this.f48895w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f48892t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9564b0<InterfaceC10307a> interfaceC9564b0M50546g = C13987x.this.m50546g();
                InterfaceC10307a.CancelRequest cancelRequest = new InterfaceC10307a.CancelRequest(this.f48894v, this.f48895w);
                this.f48892t = 1;
                if (interfaceC9564b0M50546g.emit(cancelRequest, this) == objM38805e) {
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
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: zo.x$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$logUiLifecycle$1", m39664f = "InquiryViewModel.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48896t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ boolean f48897u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C13987x f48898v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, C13987x c13987x, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48897u = z10;
            this.f48898v = c13987x;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new d(this.f48897u, this.f48898v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            TrackingEventsLogger trackingEventsLoggerMo18381b;
            TrackingEventsLogger trackingEventsLoggerMo18381b2;
            C10047c.m38805e();
            if (this.f48896t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            if (this.f48897u) {
                InterfaceC13982s component = this.f48898v.getComponent();
                if (component != null && (trackingEventsLoggerMo18381b2 = component.mo18381b()) != null) {
                    TrackingEventsLogger.logForegroundEvent$default(trackingEventsLoggerMo18381b2, this.f48898v.m50557r().mo4854f(), this.f48898v.m50556q().mo4854f(), false, 4, null);
                }
            } else {
                InterfaceC13982s component2 = this.f48898v.getComponent();
                if (component2 != null && (trackingEventsLoggerMo18381b = component2.mo18381b()) != null) {
                    TrackingEventsLogger.logBackgroundEvent$default(trackingEventsLoggerMo18381b, this.f48898v.m50557r().mo4854f(), this.f48898v.m50556q().mo4854f(), false, 4, null);
                }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13987x(@NotNull Application application, @NotNull C0967l0 savedStateHandle) {
        long jLongValue;
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.application = application;
        this.savedStateHandle = savedStateHandle;
        Long l10 = (Long) savedStateHandle.m4947b("inquiry_start_time_ms");
        if (l10 != null) {
            jLongValue = l10.longValue();
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            savedStateHandle.m4954i("inquiry_start_time_ms", Long.valueOf(jCurrentTimeMillis));
            jLongValue = jCurrentTimeMillis;
        }
        this.inquiryStartTimeMs = jLongValue;
        this.sdkFilesManager = new C10700c(application);
        this.forceFallbackModeFlow = savedStateHandle.m4951f("force_fallback_mode", Boolean.FALSE);
        this.inquiryId = savedStateHandle.m4948c("inquiry_id", null);
        this.sessionToken = savedStateHandle.m4948c(RealTrackingEventsLogger.KEY_SESSION_TOKEN, null);
        this.lastStep = savedStateHandle.m4948c("last_step", null);
        this.lastPage = savedStateHandle.m4948c("last_page", null);
        this.dataCollector = new C8648e(savedStateHandle);
        this.controllerRequestFlow = C9578i0.m37758b(0, 0, null, 7, null);
        this.screenStateFlow = C9596r0.m37859a(new ScreenState(false, false, true, false));
        this.eventFlow = C9578i0.m37758b(0, 0, null, 7, null);
        this.resolvableApiLauncher = C8618e0.m34666b();
        this.pictureLaunchResultLauncher = C8630m.m34693h();
        this.selectFromPhotoLibraryLauncher = C8630m.m34691f();
        this.documentsSelectResultLauncher = C8630m.m34689d();
        this.requestPermissionResultLauncher = C8642y.m34715b();
        this.documentSelectResultLauncher = C8636s.m34706b();
        this.passportNfcReaderLauncher = C10693g.m40765b();
        this.jpMyNumberNfcReaderLauncher = C8223e.m33563b();
        this.customTabsLauncher = C8619f.m34669b();
        C7882k.m32780d(C0993y0.m5013a(this), C7864g1.m32643a(), null, new a(null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final C0949d0<String> m50535A() {
        return this.sessionToken;
    }

    /* JADX INFO: renamed from: B */
    public final void m50536B(@NotNull InterfaceC5853b activityResultCaller) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        m50541G(activityResultCaller);
    }

    /* JADX INFO: renamed from: C */
    public final void m50537C() {
        m50539E(false);
    }

    /* JADX INFO: renamed from: D */
    public final void m50538D() {
        m50539E(true);
    }

    /* JADX INFO: renamed from: E */
    public final void m50539E(boolean foregrounded) {
        C7882k.m32780d(C0993y0.m5013a(this), C7864g1.m32643a(), null, new d(foregrounded, this, null), 2, null);
    }

    /* JADX INFO: renamed from: F */
    public final void m50540F() {
        InterfaceC13248k interfaceC13248kMo18382c;
        InterfaceC13982s interfaceC13982s = this.component;
        if (interfaceC13982s == null || (interfaceC13248kMo18382c = interfaceC13982s.mo18382c()) == null) {
            return;
        }
        interfaceC13248kMo18382c.mo49000a();
    }

    /* JADX INFO: renamed from: G */
    public final void m50541G(InterfaceC5853b activityResultCaller) {
        this.resolvableApiLauncher.m34681e(activityResultCaller);
        this.pictureLaunchResultLauncher.m34681e(activityResultCaller);
        this.selectFromPhotoLibraryLauncher.m34681e(activityResultCaller);
        this.documentsSelectResultLauncher.m34681e(activityResultCaller);
        this.requestPermissionResultLauncher.m34681e(activityResultCaller);
        this.documentSelectResultLauncher.m34681e(activityResultCaller);
        this.passportNfcReaderLauncher.m34681e(activityResultCaller);
        this.jpMyNumberNfcReaderLauncher.m34681e(activityResultCaller);
        this.customTabsLauncher.m34681e(activityResultCaller);
    }

    /* JADX INFO: renamed from: H */
    public final void m50542H(@Nullable InterfaceC13982s interfaceC13982s) {
        this.component = interfaceC13982s;
    }

    /* JADX INFO: renamed from: I */
    public final void m50543I(boolean newValue) {
        this.savedStateHandle.m4954i("force_fallback_mode", Boolean.valueOf(newValue));
    }

    @Override // androidx.p616lifecycle.AbstractC0991x0
    /* JADX INFO: renamed from: d */
    public void mo5012d() {
        InterfaceC7479s interfaceC7479sMo18384e;
        InterfaceC13982s interfaceC13982s = this.component;
        if (interfaceC13982s != null && (interfaceC7479sMo18384e = interfaceC13982s.mo18384e()) != null) {
            interfaceC7479sMo18384e.shutdown();
        }
        super.mo5012d();
    }

    /* JADX INFO: renamed from: e */
    public final void m50544e(boolean force, boolean skipBackendCall) {
        C7882k.m32780d(C0993y0.m5013a(this), C7864g1.m32643a(), null, new c(force, skipBackendCall, null), 2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC13982s getComponent() {
        return this.component;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InterfaceC9564b0<InterfaceC10307a> m50546g() {
        return this.controllerRequestFlow;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final C8624h0<InterfaceC8611b, Integer> m50547h() {
        return this.customTabsLauncher;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final C8648e getDataCollector() {
        return this.dataCollector;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final C8624h0<String[], Uri> m50549j() {
        return this.documentSelectResultLauncher;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final C8624h0<String[], List<Uri>> m50550k() {
        return this.documentsSelectResultLauncher;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final InterfaceC9564b0<InquiryEvent> m50551l() {
        return this.eventFlow;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final InterfaceC9592p0<Boolean> m50552m() {
        return this.forceFallbackModeFlow;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final C0949d0<String> m50553n() {
        return this.inquiryId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getInquiryStartTimeMs() {
        return this.inquiryStartTimeMs;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final C8624h0<JpMyNumberNfcReaderConfig, JpMyNumberNfcReaderOutput> m50555p() {
        return this.jpMyNumberNfcReaderLauncher;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final C0949d0<String> m50556q() {
        return this.lastPage;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final C0949d0<String> m50557r() {
        return this.lastStep;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final C8624h0<PassportNfcReaderConfig, PassportNfcReaderOutput> m50558s() {
        return this.passportNfcReaderLauncher;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final C8624h0<Uri, Boolean> m50559t() {
        return this.pictureLaunchResultLauncher;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final C8624h0<String, Boolean> m50560u() {
        return this.requestPermissionResultLauncher;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final C8624h0<IntentSenderRequest, ActivityResult> m50561v() {
        return this.resolvableApiLauncher;
    }

    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public final C0967l0 getSavedStateHandle() {
        return this.savedStateHandle;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final InterfaceC9566c0<ScreenState> m50563x() {
        return this.screenStateFlow;
    }

    @NotNull
    /* JADX INFO: renamed from: y, reason: from getter */
    public final C10700c getSdkFilesManager() {
        return this.sdkFilesManager;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final C8624h0<C5859h, List<Uri>> m50565z() {
        return this.selectFromPhotoLibraryLauncher;
    }
}
