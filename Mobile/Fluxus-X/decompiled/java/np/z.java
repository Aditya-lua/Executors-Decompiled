package np;

import android.app.Application;
import android.net.Uri;
import androidx.p000lifecycle.y0;
import av.g1;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.Inquiry;
import com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager;
import com.withpersona.sdk2.inquiry.InquiryActivityEvent;
import com.withpersona.sdk2.inquiry.OnInquiryEventListener;
import com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import eq.PassportNfcReaderConfig;
import java.util.List;
import kp.ScreenState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zp.JpMyNumberNfcReaderConfig;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 p2\u00020\u0001:\u0002\u0080\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R$\u0010(\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0017\u0010-\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,R\u001a\u00103\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\b048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R*\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR*\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR*\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010=\u001a\u0004\bH\u0010?\"\u0004\bI\u0010AR*\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010=\u001a\u0004\bL\u0010?\"\u0004\bM\u0010AR\u0017\u0010R\u001a\u00020O8\u0006¢\u0006\f\n\u0004\b7\u0010P\u001a\u0004\b<\u0010QR\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020T0S8\u0006¢\u0006\f\n\u0004\b>\u0010U\u001a\u0004\b/\u0010VR#\u0010^\u001a\b\u0012\u0004\u0012\u00020Y0X8\u0006¢\u0006\u0012\n\u0004\b+\u0010Z\u0012\u0004\b]\u0010\u0015\u001a\u0004\b[\u0010\\R#\u0010b\u001a\b\u0012\u0004\u0012\u00020_0S8\u0006¢\u0006\u0012\n\u0004\b`\u0010U\u0012\u0004\ba\u0010\u0015\u001a\u0004\bK\u0010VR&\u0010i\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020e0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010f\u001a\u0004\bg\u0010hR&\u0010l\u001a\u000e\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020\b0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010f\u001a\u0004\bk\u0010hR,\u0010q\u001a\u0014\u0012\u0004\u0012\u00020m\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0n0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bo\u0010f\u001a\u0004\bp\u0010hR2\u0010s\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0r\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0n0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010f\u001a\u0004\bG\u0010hR&\u0010u\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bt\u0010f\u001a\u0004\bt\u0010hR.\u0010v\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0r\u0012\u0006\u0012\u0004\u0018\u00010j0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010f\u001a\u0004\bC\u0010hR&\u0010y\u001a\u000e\u0012\u0004\u0012\u00020w\u0012\u0004\u0012\u00020x0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010f\u001a\u0004\bo\u0010hR&\u0010|\u001a\u000e\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020{0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010f\u001a\u0004\b`\u0010hR&\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020~0c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010f\u001a\u0004\b5\u0010h¨\u0006\u0081\u0001"}, d2 = {"Lnp/z;", "Landroidx/lifecycle/b;", "Landroid/app/Application;", "application", "Landroidx/lifecycle/l0;", "savedStateHandle", "<init>", "(Landroid/app/Application;Landroidx/lifecycle/l0;)V", BuildConfig.FLAVOR, "foregrounded", BuildConfig.FLAVOR, "E", "(Z)V", "Lg/c;", "activityResultCaller", "G", "(Lg/c;)V", "B", "newValue", "I", "d", "()V", "F", "D", "C", "force", "skipBackendCall", "e", "(ZZ)V", "c", "Landroid/app/Application;", "Landroidx/lifecycle/l0;", "w", "()Landroidx/lifecycle/l0;", "Lnp/s;", "Lnp/s;", "f", "()Lnp/s;", "H", "(Lnp/s;)V", "component", BuildConfig.FLAVOR, "J", "o", "()J", "inquiryStartTimeMs", "Ler/c;", "g", "Ler/c;", "y", "()Ler/c;", "sdkFilesManager", "Ldv/p0;", "h", "Ldv/p0;", "m", "()Ldv/p0;", "forceFallbackModeFlow", "Landroidx/lifecycle/d0;", BuildConfig.FLAVOR, "i", "Landroidx/lifecycle/d0;", "n", "()Landroidx/lifecycle/d0;", "setInquiryId", "(Landroidx/lifecycle/d0;)V", "inquiryId", "j", "A", "setSessionToken", "sessionToken", "k", "r", "setLastStep", "lastStep", "l", "q", "setLastPage", "lastPage", "Lar/e;", "Lar/e;", "()Lar/e;", "dataCollector", "Ldv/b0;", "Ldr/a;", "Ldv/b0;", "()Ldv/b0;", "controllerRequestFlow", "Ldv/c0;", "Lkp/e;", "Ldv/c0;", "x", "()Ldv/c0;", "getScreenStateFlow$annotations", "screenStateFlow", "Lkp/d;", "p", "getEventFlow$annotations", "eventFlow", "Laq/h0;", "Lg/i;", "Lg/a;", "Laq/h0;", "v", "()Laq/h0;", "resolvableApiLauncher", "Landroid/net/Uri;", "t", "pictureLaunchResultLauncher", "Lg/j;", BuildConfig.FLAVOR, "s", "z", "selectFromPhotoLibraryLauncher", BuildConfig.FLAVOR, "documentsSelectResultLauncher", "u", "requestPermissionResultLauncher", "documentSelectResultLauncher", "Leq/f;", "Leq/l;", "passportNfcReaderLauncher", "Lzp/c;", "Lzp/i;", "jpMyNumberNfcReaderLauncher", "Laq/b;", BuildConfig.FLAVOR, "customTabsLauncher", "b", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends androidx.p000lifecycle.b {

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
    public final er.c sdkFilesManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dv.p0<Boolean> forceFallbackModeFlow;

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
    public final ar.e dataCollector;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dv.b0<dr.a> controllerRequestFlow;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dv.c0<ScreenState> screenStateFlow;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dv.b0<kp.d> eventFlow;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final aq.h0<g.i, g.a> resolvableApiLauncher;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final aq.h0<Uri, Boolean> pictureLaunchResultLauncher;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final aq.h0<g.j, List<Uri>> selectFromPhotoLibraryLauncher;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final aq.h0<String[], List<Uri>> documentsSelectResultLauncher;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final aq.h0<String, Boolean> requestPermissionResultLauncher;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final aq.h0<String[], Uri> documentSelectResultLauncher;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final aq.h0<PassportNfcReaderConfig, eq.l> passportNfcReaderLauncher;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final aq.h0<JpMyNumberNfcReaderConfig, zp.i> jpMyNumberNfcReaderLauncher;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final aq.h0<aq.b, Integer> customTabsLauncher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1", f = "InquiryViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26452t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f26453u;

        /* JADX INFO: renamed from: np.z$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1$1", f = "InquiryViewModel.kt", l = {106}, m = "invokeSuspend")
        public static final class C0526a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26455t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ z f26456u;

            /* JADX INFO: renamed from: np.z$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0527a<T> implements dv.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ z f26457a;

                public C0527a(z zVar) {
                    this.f26457a = zVar;
                }

                @Override // dv.i
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(InquiryActivityEvent inquiryActivityEvent, eu.b<? super Unit> bVar) {
                    if (inquiryActivityEvent instanceof InquiryActivityEvent.CancelInquiry) {
                        this.f26457a.e(true, ((InquiryActivityEvent.CancelInquiry) inquiryActivityEvent).getSkipBackendCall());
                    }
                    return Unit.f21506a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0526a(z zVar, eu.b<? super C0526a> bVar) {
                super(2, bVar);
                this.f26456u = zVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new C0526a(this.f26456u, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
                return ((C0526a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f26455t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    dv.g0<InquiryActivityEvent> eventFlow = InquiryActivityBroadcastManager.INSTANCE.getEventFlow();
                    C0527a c0527a = new C0527a(this.f26456u);
                    this.f26455t = 1;
                    if (eventFlow.collect(c0527a, this) == objE) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1$2", f = "InquiryViewModel.kt", l = {114}, m = "invokeSuspend")
        public static final class b extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26458t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ z f26459u;

            /* JADX INFO: renamed from: np.z$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0528a<T> implements dv.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ z f26460a;

                public C0528a(z zVar) {
                    this.f26460a = zVar;
                }

                @Override // dv.i
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(kp.d dVar, eu.b<? super Unit> bVar) {
                    OnInquiryEventListener onEventListener = Inquiry.INSTANCE.getOnEventListener();
                    if (onEventListener != null) {
                        onEventListener.onEvent(dVar);
                    }
                    if (dVar instanceof kp.d.PageChange) {
                        kp.d.PageChange pageChange = (kp.d.PageChange) dVar;
                        this.f26460a.r().o(pageChange.getName());
                        this.f26460a.q().o(pageChange.getPath());
                    }
                    return Unit.f21506a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(z zVar, eu.b<? super b> bVar) {
                super(2, bVar);
                this.f26459u = zVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new b(this.f26459u, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f26458t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    dv.b0<kp.d> b0VarL = this.f26459u.l();
                    C0528a c0528a = new C0528a(this.f26459u);
                    this.f26458t = 1;
                    if (b0VarL.collect(c0528a, this) == objE) {
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

        public a(eu.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            a aVar = z.this.new a(bVar);
            aVar.f26453u = obj;
            return aVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            av.p0 p0Var = (av.p0) this.f26453u;
            fu.c.e();
            if (this.f26452t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            av.k.d(p0Var, null, null, new C0526a(z.this, null), 3, null);
            av.k.d(p0Var, g1.c(), null, new b(z.this, null), 2, null);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$cancelInquiry$1", f = "InquiryViewModel.kt", l = {199}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26461t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f26463v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f26464w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, boolean z11, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f26463v = z10;
            this.f26464w = z11;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return z.this.new c(this.f26463v, this.f26464w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f26461t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.b0<dr.a> b0VarG = z.this.g();
                dr.a.CancelRequest cancelRequest = new dr.a.CancelRequest(this.f26463v, this.f26464w);
                this.f26461t = 1;
                if (b0VarG.emit(cancelRequest, this) == objE) {
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
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$logUiLifecycle$1", f = "InquiryViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class d extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26465t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f26466u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ z f26467v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, z zVar, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f26466u = z10;
            this.f26467v = zVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new d(this.f26466u, this.f26467v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            TrackingEventsLogger trackingEventsLoggerB;
            TrackingEventsLogger trackingEventsLoggerB2;
            fu.c.e();
            if (this.f26465t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            if (this.f26466u) {
                s component = this.f26467v.getComponent();
                if (component != null && (trackingEventsLoggerB2 = component.b()) != null) {
                    TrackingEventsLogger.logForegroundEvent$default(trackingEventsLoggerB2, this.f26467v.r().f(), this.f26467v.q().f(), false, 4, null);
                }
            } else {
                s component2 = this.f26467v.getComponent();
                if (component2 != null && (trackingEventsLoggerB = component2.b()) != null) {
                    TrackingEventsLogger.logBackgroundEvent$default(trackingEventsLoggerB, this.f26467v.r().f(), this.f26467v.q().f(), false, 4, null);
                }
            }
            return Unit.f21506a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(@NotNull Application application, @NotNull androidx.p000lifecycle.l0 savedStateHandle) {
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
        this.sdkFilesManager = new er.c(application);
        this.forceFallbackModeFlow = savedStateHandle.f("force_fallback_mode", Boolean.FALSE);
        this.inquiryId = savedStateHandle.c("inquiry_id", null);
        this.sessionToken = savedStateHandle.c(RealTrackingEventsLogger.KEY_SESSION_TOKEN, null);
        this.lastStep = savedStateHandle.c("last_step", null);
        this.lastPage = savedStateHandle.c("last_page", null);
        this.dataCollector = new ar.e(savedStateHandle);
        this.controllerRequestFlow = dv.i0.b(0, 0, null, 7, null);
        this.screenStateFlow = dv.r0.a(new ScreenState(false, false, true, false));
        this.eventFlow = dv.i0.b(0, 0, null, 7, null);
        this.resolvableApiLauncher = aq.e0.b();
        this.pictureLaunchResultLauncher = aq.m.h();
        this.selectFromPhotoLibraryLauncher = aq.m.f();
        this.documentsSelectResultLauncher = aq.m.d();
        this.requestPermissionResultLauncher = aq.y.b();
        this.documentSelectResultLauncher = aq.s.b();
        this.passportNfcReaderLauncher = eq.j.b();
        this.jpMyNumberNfcReaderLauncher = zp.g.b();
        this.customTabsLauncher = aq.f.b();
        av.k.d(y0.a(this), g1.a(), null, new a(null), 2, null);
    }

    @NotNull
    public final androidx.p000lifecycle.d0<String> A() {
        return this.sessionToken;
    }

    public final void B(@NotNull g.c activityResultCaller) {
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
        av.k.d(y0.a(this), g1.a(), null, new d(foregrounded, this, null), 2, null);
    }

    public final void F() {
        mo.k kVarC;
        s sVar = this.component;
        if (sVar == null || (kVarC = sVar.c()) == null) {
            return;
        }
        kVarC.a();
    }

    public final void G(g.c activityResultCaller) {
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
        l6.s sVarE;
        s sVar = this.component;
        if (sVar != null && (sVarE = sVar.e()) != null) {
            sVarE.shutdown();
        }
        super.d();
    }

    public final void e(boolean force, boolean skipBackendCall) {
        av.k.d(y0.a(this), g1.a(), null, new c(force, skipBackendCall, null), 2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final s getComponent() {
        return this.component;
    }

    @NotNull
    public final dv.b0<dr.a> g() {
        return this.controllerRequestFlow;
    }

    @NotNull
    public final aq.h0<aq.b, Integer> h() {
        return this.customTabsLauncher;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final ar.e getDataCollector() {
        return this.dataCollector;
    }

    @NotNull
    public final aq.h0<String[], Uri> j() {
        return this.documentSelectResultLauncher;
    }

    @NotNull
    public final aq.h0<String[], List<Uri>> k() {
        return this.documentsSelectResultLauncher;
    }

    @NotNull
    public final dv.b0<kp.d> l() {
        return this.eventFlow;
    }

    @NotNull
    public final dv.p0<Boolean> m() {
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
    public final aq.h0<JpMyNumberNfcReaderConfig, zp.i> p() {
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
    public final aq.h0<PassportNfcReaderConfig, eq.l> s() {
        return this.passportNfcReaderLauncher;
    }

    @NotNull
    public final aq.h0<Uri, Boolean> t() {
        return this.pictureLaunchResultLauncher;
    }

    @NotNull
    public final aq.h0<String, Boolean> u() {
        return this.requestPermissionResultLauncher;
    }

    @NotNull
    public final aq.h0<g.i, g.a> v() {
        return this.resolvableApiLauncher;
    }

    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public final androidx.p000lifecycle.l0 getSavedStateHandle() {
        return this.savedStateHandle;
    }

    @NotNull
    public final dv.c0<ScreenState> x() {
        return this.screenStateFlow;
    }

    @NotNull
    /* JADX INFO: renamed from: y, reason: from getter */
    public final er.c getSdkFilesManager() {
        return this.sdkFilesManager;
    }

    @NotNull
    public final aq.h0<g.j, List<Uri>> z() {
        return this.selectFromPhotoLibraryLauncher;
    }
}
