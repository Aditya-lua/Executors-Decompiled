package zo;

import android.app.Application;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.p000lifecycle.y0;
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
import ku.g1;
import nu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wo.ScreenState;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 p2\u00020\u0001:\u0002\u0080\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R$\u0010(\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0017\u0010-\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,R\u001a\u00103\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\b048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R*\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR*\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR*\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010=\u001a\u0004\bH\u0010?\"\u0004\bI\u0010AR*\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010=\u001a\u0004\bL\u0010?\"\u0004\bM\u0010AR\u0017\u0010R\u001a\u00020O8\u0006¢\u0006\f\n\u0004\b7\u0010P\u001a\u0004\b<\u0010QR\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020T0S8\u0006¢\u0006\f\n\u0004\b>\u0010U\u001a\u0004\b/\u0010VR#\u0010^\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0006¢\u0006\u0012\n\u0004\b+\u0010Z\u0012\u0004\b]\u0010\u0015\u001a\u0004\b[\u0010\\R#\u0010b\u001a\b\u0012\u0004\u0012\u00020_0S8\u0006¢\u0006\u0012\n\u0004\b`\u0010U\u0012\u0004\ba\u0010\u0015\u001a\u0004\bK\u0010VR&\u0010i\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020e0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010f\u001a\u0004\bg\u0010hR&\u0010l\u001a\u000e\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020\b0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010f\u001a\u0004\bk\u0010hR,\u0010q\u001a\u0014\u0012\u0004\u0012\u00020m\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0n0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bo\u0010f\u001a\u0004\bp\u0010hR2\u0010s\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0r\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0n0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010f\u001a\u0004\bG\u0010hR&\u0010u\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bt\u0010f\u001a\u0004\bt\u0010hR.\u0010v\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0r\u0012\u0006\u0012\u0004\u0018\u00010j0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010f\u001a\u0004\bC\u0010hR&\u0010y\u001a\u000e\u0012\u0004\u0012\u00020w\u0012\u0004\u0012\u00020x0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010f\u001a\u0004\bo\u0010hR&\u0010|\u001a\u000e\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020{0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010f\u001a\u0004\b`\u0010hR&\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020~0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010f\u001a\u0004\b5\u0010h¨\u0006\u0081\u0001"}, d2 = {"Lzo/x;", "Landroidx/lifecycle/b;", "Landroid/app/Application;", "application", "Landroidx/lifecycle/l0;", "savedStateHandle", "<init>", "(Landroid/app/Application;Landroidx/lifecycle/l0;)V", "", "foregrounded", "", "E", "(Z)V", "Lg/b;", "activityResultCaller", "G", "(Lg/b;)V", "B", "newValue", "I", "d", "()V", "F", "D", "C", "force", "skipBackendCall", "e", "(ZZ)V", "c", "Landroid/app/Application;", "Landroidx/lifecycle/l0;", "w", "()Landroidx/lifecycle/l0;", "Lzo/s;", "Lzo/s;", "f", "()Lzo/s;", "H", "(Lzo/s;)V", "component", "", "J", "o", "()J", "inquiryStartTimeMs", "Lqq/c;", "g", "Lqq/c;", "y", "()Lqq/c;", "sdkFilesManager", "Lnu/p0;", "h", "Lnu/p0;", "m", "()Lnu/p0;", "forceFallbackModeFlow", "Landroidx/lifecycle/d0;", "", "i", "Landroidx/lifecycle/d0;", "n", "()Landroidx/lifecycle/d0;", "setInquiryId", "(Landroidx/lifecycle/d0;)V", "inquiryId", "j", "A", "setSessionToken", "sessionToken", "k", "r", "setLastStep", "lastStep", "l", "q", "setLastPage", "lastPage", "Lmq/e;", "Lmq/e;", "()Lmq/e;", "dataCollector", "Lnu/b0;", "Lpq/a;", "Lnu/b0;", "()Lnu/b0;", "controllerRequestFlow", "Lnu/c0;", "Lwo/c;", "Lnu/c0;", "x", "()Lnu/c0;", "getScreenStateFlow$annotations", "screenStateFlow", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;", "p", "getEventFlow$annotations", "eventFlow", "Lmp/h0;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "Lmp/h0;", "v", "()Lmp/h0;", "resolvableApiLauncher", "Landroid/net/Uri;", "t", "pictureLaunchResultLauncher", "Lg/h;", "", "s", "z", "selectFromPhotoLibraryLauncher", "", "documentsSelectResultLauncher", "u", "requestPermissionResultLauncher", "documentSelectResultLauncher", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "passportNfcReaderLauncher", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderConfig;", "Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcReaderOutput;", "jpMyNumberNfcReaderLauncher", "Lmp/b;", "", "customTabsLauncher", "b", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends androidx.p000lifecycle.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Application application;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.p000lifecycle.l0 savedStateHandle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public s component;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long inquiryStartTimeMs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qq.c sdkFilesManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nu.p0<Boolean> forceFallbackModeFlow;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public androidx.p000lifecycle.d0<String> inquiryId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public androidx.p000lifecycle.d0<String> sessionToken;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public androidx.p000lifecycle.d0<String> lastStep;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public androidx.p000lifecycle.d0<String> lastPage;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mq.e dataCollector;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nu.b0<pq.a> controllerRequestFlow;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nu.c0<ScreenState> screenStateFlow;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nu.b0<InquiryEvent> eventFlow;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mp.h0<IntentSenderRequest, ActivityResult> resolvableApiLauncher;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mp.h0<Uri, Boolean> pictureLaunchResultLauncher;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mp.h0<g.h, List<Uri>> selectFromPhotoLibraryLauncher;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mp.h0<String[], List<Uri>> documentsSelectResultLauncher;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mp.h0<String, Boolean> requestPermissionResultLauncher;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mp.h0<String[], Uri> documentSelectResultLauncher;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mp.h0<PassportNfcReaderConfig, PassportNfcReaderOutput> passportNfcReaderLauncher;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mp.h0<JpMyNumberNfcReaderConfig, JpMyNumberNfcReaderOutput> jpMyNumberNfcReaderLauncher;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mp.h0<mp.b, Integer> customTabsLauncher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1", f = "InquiryViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37979t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f37980u;

        /* JADX INFO: renamed from: zo.x$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1$1", f = "InquiryViewModel.kt", l = {106}, m = "invokeSuspend")
        public static final class C0685a extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f37982t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ x f37983u;

            /* JADX INFO: renamed from: zo.x$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0686a<T> implements nu.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ x f37984a;

                public C0686a(x xVar) {
                    this.f37984a = xVar;
                }

                @Override // nu.i
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(InquiryActivityEvent inquiryActivityEvent, nt.b<? super Unit> bVar) {
                    if (inquiryActivityEvent instanceof InquiryActivityEvent.CancelInquiry) {
                        this.f37984a.e(true, ((InquiryActivityEvent.CancelInquiry) inquiryActivityEvent).getSkipBackendCall());
                    }
                    return Unit.f22483a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0685a(x xVar, nt.b<? super C0685a> bVar) {
                super(2, bVar);
                this.f37983u = xVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new C0685a(this.f37983u, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f37982t;
                if (i10 == 0) {
                    jt.o.b(obj);
                    nu.g0<InquiryActivityEvent> eventFlow = InquiryActivityBroadcastManager.INSTANCE.getEventFlow();
                    C0686a c0686a = new C0686a(this.f37983u);
                    this.f37982t = 1;
                    if (eventFlow.collect(c0686a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                }
                throw new jt.d();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
                return ((C0685a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1$2", f = "InquiryViewModel.kt", l = {114}, m = "invokeSuspend")
        public static final class b extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f37985t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ x f37986u;

            /* JADX INFO: renamed from: zo.x$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0687a<T> implements nu.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ x f37987a;

                public C0687a(x xVar) {
                    this.f37987a = xVar;
                }

                @Override // nu.i
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(InquiryEvent inquiryEvent, nt.b<? super Unit> bVar) {
                    OnInquiryEventListener onEventListener = Inquiry.INSTANCE.getOnEventListener();
                    if (onEventListener != null) {
                        onEventListener.onEvent(inquiryEvent);
                    }
                    if (inquiryEvent instanceof InquiryEvent.PageChange) {
                        InquiryEvent.PageChange pageChange = (InquiryEvent.PageChange) inquiryEvent;
                        this.f37987a.r().o(pageChange.getName());
                        this.f37987a.q().o(pageChange.getPath());
                    }
                    return Unit.f22483a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(x xVar, nt.b<? super b> bVar) {
                super(2, bVar);
                this.f37986u = xVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new b(this.f37986u, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f37985t;
                if (i10 == 0) {
                    jt.o.b(obj);
                    nu.b0<InquiryEvent> b0VarL = this.f37986u.l();
                    C0687a c0687a = new C0687a(this.f37986u);
                    this.f37985t = 1;
                    if (b0VarL.collect(c0687a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                }
                throw new jt.d();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        public a(nt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            a aVar = x.this.new a(bVar);
            aVar.f37980u = obj;
            return aVar;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ku.p0 p0Var = (ku.p0) this.f37980u;
            ot.c.e();
            if (this.f37979t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            ku.k.d(p0Var, null, null, new C0685a(x.this, null), 3, null);
            ku.k.d(p0Var, g1.c(), null, new b(x.this, null), 2, null);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$cancelInquiry$1", f = "InquiryViewModel.kt", l = {199}, m = "invokeSuspend")
    public static final class c extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37988t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f37990v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f37991w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, boolean z11, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f37990v = z10;
            this.f37991w = z11;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return x.this.new c(this.f37990v, this.f37991w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f37988t;
            if (i10 == 0) {
                jt.o.b(obj);
                nu.b0<pq.a> b0VarG = x.this.g();
                pq.a.CancelRequest cancelRequest = new pq.a.CancelRequest(this.f37990v, this.f37991w);
                this.f37988t = 1;
                if (b0VarG.emit(cancelRequest, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$logUiLifecycle$1", f = "InquiryViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class d extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37992t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f37993u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ x f37994v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, x xVar, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f37993u = z10;
            this.f37994v = xVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new d(this.f37993u, this.f37994v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            TrackingEventsLogger trackingEventsLoggerB;
            TrackingEventsLogger trackingEventsLoggerB2;
            ot.c.e();
            if (this.f37992t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            if (this.f37993u) {
                s component = this.f37994v.getComponent();
                if (component != null && (trackingEventsLoggerB2 = component.b()) != null) {
                    TrackingEventsLogger.logForegroundEvent$default(trackingEventsLoggerB2, this.f37994v.r().f(), this.f37994v.q().f(), false, 4, null);
                }
            } else {
                s component2 = this.f37994v.getComponent();
                if (component2 != null && (trackingEventsLoggerB = component2.b()) != null) {
                    TrackingEventsLogger.logBackgroundEvent$default(trackingEventsLoggerB, this.f37994v.r().f(), this.f37994v.q().f(), false, 4, null);
                }
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@NotNull Application application, @NotNull androidx.p000lifecycle.l0 savedStateHandle) {
        long jLongValue;
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.application = application;
        this.savedStateHandle = savedStateHandle;
        Long l10 = (Long) savedStateHandle.b("inquiry_start_time_ms");
        if (l10 != null) {
            jLongValue = l10.longValue();
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            savedStateHandle.i("inquiry_start_time_ms", Long.valueOf(jCurrentTimeMillis));
            jLongValue = jCurrentTimeMillis;
        }
        this.inquiryStartTimeMs = jLongValue;
        this.sdkFilesManager = new qq.c(application);
        this.forceFallbackModeFlow = savedStateHandle.f("force_fallback_mode", Boolean.FALSE);
        this.inquiryId = savedStateHandle.c("inquiry_id", null);
        this.sessionToken = savedStateHandle.c(RealTrackingEventsLogger.KEY_SESSION_TOKEN, null);
        this.lastStep = savedStateHandle.c("last_step", null);
        this.lastPage = savedStateHandle.c("last_page", null);
        this.dataCollector = new mq.e(savedStateHandle);
        this.controllerRequestFlow = nu.i0.b(0, 0, null, 7, null);
        this.screenStateFlow = r0.a(new ScreenState(false, false, true, false));
        this.eventFlow = nu.i0.b(0, 0, null, 7, null);
        this.resolvableApiLauncher = mp.e0.b();
        this.pictureLaunchResultLauncher = mp.m.h();
        this.selectFromPhotoLibraryLauncher = mp.m.f();
        this.documentsSelectResultLauncher = mp.m.d();
        this.requestPermissionResultLauncher = mp.y.b();
        this.documentSelectResultLauncher = mp.s.b();
        this.passportNfcReaderLauncher = qp.g.b();
        this.jpMyNumberNfcReaderLauncher = lp.e.b();
        this.customTabsLauncher = mp.f.b();
        ku.k.d(y0.a(this), g1.a(), null, new a(null), 2, null);
    }

    @NotNull
    public final androidx.p000lifecycle.d0<String> A() {
        return this.sessionToken;
    }

    public final void B(@NotNull g.b activityResultCaller) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        G(activityResultCaller);
    }

    public final void C() {
        E(false);
    }

    public final void D() {
        E(true);
    }

    public final void E(boolean foregrounded) {
        ku.k.d(y0.a(this), g1.a(), null, new d(foregrounded, this, null), 2, null);
    }

    public final void F() {
        yn.k kVarC;
        s sVar = this.component;
        if (sVar == null || (kVarC = sVar.c()) == null) {
            return;
        }
        kVarC.a();
    }

    public final void G(g.b activityResultCaller) {
        this.resolvableApiLauncher.e(activityResultCaller);
        this.pictureLaunchResultLauncher.e(activityResultCaller);
        this.selectFromPhotoLibraryLauncher.e(activityResultCaller);
        this.documentsSelectResultLauncher.e(activityResultCaller);
        this.requestPermissionResultLauncher.e(activityResultCaller);
        this.documentSelectResultLauncher.e(activityResultCaller);
        this.passportNfcReaderLauncher.e(activityResultCaller);
        this.jpMyNumberNfcReaderLauncher.e(activityResultCaller);
        this.customTabsLauncher.e(activityResultCaller);
    }

    public final void H(@Nullable s sVar) {
        this.component = sVar;
    }

    public final void I(boolean newValue) {
        this.savedStateHandle.i("force_fallback_mode", Boolean.valueOf(newValue));
    }

    @Override // androidx.p000lifecycle.x0
    public void d() {
        k6.s sVarE;
        s sVar = this.component;
        if (sVar != null && (sVarE = sVar.e()) != null) {
            sVarE.shutdown();
        }
        super.d();
    }

    public final void e(boolean force, boolean skipBackendCall) {
        ku.k.d(y0.a(this), g1.a(), null, new c(force, skipBackendCall, null), 2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final s getComponent() {
        return this.component;
    }

    @NotNull
    public final nu.b0<pq.a> g() {
        return this.controllerRequestFlow;
    }

    @NotNull
    public final mp.h0<mp.b, Integer> h() {
        return this.customTabsLauncher;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final mq.e getDataCollector() {
        return this.dataCollector;
    }

    @NotNull
    public final mp.h0<String[], Uri> j() {
        return this.documentSelectResultLauncher;
    }

    @NotNull
    public final mp.h0<String[], List<Uri>> k() {
        return this.documentsSelectResultLauncher;
    }

    @NotNull
    public final nu.b0<InquiryEvent> l() {
        return this.eventFlow;
    }

    @NotNull
    public final nu.p0<Boolean> m() {
        return this.forceFallbackModeFlow;
    }

    @NotNull
    public final androidx.p000lifecycle.d0<String> n() {
        return this.inquiryId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getInquiryStartTimeMs() {
        return this.inquiryStartTimeMs;
    }

    @NotNull
    public final mp.h0<JpMyNumberNfcReaderConfig, JpMyNumberNfcReaderOutput> p() {
        return this.jpMyNumberNfcReaderLauncher;
    }

    @NotNull
    public final androidx.p000lifecycle.d0<String> q() {
        return this.lastPage;
    }

    @NotNull
    public final androidx.p000lifecycle.d0<String> r() {
        return this.lastStep;
    }

    @NotNull
    public final mp.h0<PassportNfcReaderConfig, PassportNfcReaderOutput> s() {
        return this.passportNfcReaderLauncher;
    }

    @NotNull
    public final mp.h0<Uri, Boolean> t() {
        return this.pictureLaunchResultLauncher;
    }

    @NotNull
    public final mp.h0<String, Boolean> u() {
        return this.requestPermissionResultLauncher;
    }

    @NotNull
    public final mp.h0<IntentSenderRequest, ActivityResult> v() {
        return this.resolvableApiLauncher;
    }

    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public final androidx.p000lifecycle.l0 getSavedStateHandle() {
        return this.savedStateHandle;
    }

    @NotNull
    public final nu.c0<ScreenState> x() {
        return this.screenStateFlow;
    }

    @NotNull
    /* JADX INFO: renamed from: y, reason: from getter */
    public final qq.c getSdkFilesManager() {
        return this.sdkFilesManager;
    }

    @NotNull
    public final mp.h0<g.h, List<Uri>> z() {
        return this.selectFromPhotoLibraryLauncher;
    }
}
