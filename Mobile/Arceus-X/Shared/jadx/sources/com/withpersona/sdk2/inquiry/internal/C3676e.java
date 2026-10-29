package com.withpersona.sdk2.inquiry.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.activity.result.IntentSenderRequest;
import androidx.p616lifecycle.C0967l0;
import bo.C1475a;
import bo.C1476b;
import bo.InterfaceC1477c;
import co.C1693c1;
import com.withpersona.sdk2.camera.C3402b;
import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.camera.C3406f;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.document.C3438a;
import com.withpersona.sdk2.inquiry.document.C3445h;
import com.withpersona.sdk2.inquiry.document.C3446i;
import com.withpersona.sdk2.inquiry.document.C3447j;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.network.C3451a;
import com.withpersona.sdk2.inquiry.document.network.C3452b;
import com.withpersona.sdk2.inquiry.document.network.C3453c;
import com.withpersona.sdk2.inquiry.document.network.C3454d;
import com.withpersona.sdk2.inquiry.document.network.C3455e;
import com.withpersona.sdk2.inquiry.document.network.C3456f;
import com.withpersona.sdk2.inquiry.document.network.C3457g;
import com.withpersona.sdk2.inquiry.document.network.C3458h;
import com.withpersona.sdk2.inquiry.document.step.C3472a;
import com.withpersona.sdk2.inquiry.document.step.C3473b;
import com.withpersona.sdk2.inquiry.document.step.C3474c;
import com.withpersona.sdk2.inquiry.document.step.C3475d;
import com.withpersona.sdk2.inquiry.document.step.C3476e;
import com.withpersona.sdk2.inquiry.document.step.C3477f;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.C3544e;
import com.withpersona.sdk2.inquiry.governmentid.C3546g;
import com.withpersona.sdk2.inquiry.governmentid.C3547h;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.network.C3569a;
import com.withpersona.sdk2.inquiry.governmentid.network.InterfaceC3570b;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.C3590a;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.C3591b;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.C3592c;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.C3593d;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.C3594e;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.C3595f;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.integration.C3612a;
import com.withpersona.sdk2.inquiry.integration.C3613b;
import com.withpersona.sdk2.inquiry.integration.C3614c;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.fragment.C3625a;
import com.withpersona.sdk2.inquiry.integration.fragment.C3626b;
import com.withpersona.sdk2.inquiry.integration.fragment.C3627c;
import com.withpersona.sdk2.inquiry.integration.fragment.C3628d;
import com.withpersona.sdk2.inquiry.integration.fragment.C3629e;
import com.withpersona.sdk2.inquiry.integration.fragment.C3630f;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.C3678a;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.C3679b;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.C3681d;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.C3682e;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.C3683f;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.C3684g;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.C3685h;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.C3686i;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.C3687j;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.network.C3706e;
import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import com.withpersona.sdk2.inquiry.internal.workflows.C3739b;
import com.withpersona.sdk2.inquiry.internal.workflows.C3740c;
import com.withpersona.sdk2.inquiry.internal.workflows.C3741d;
import com.withpersona.sdk2.inquiry.internal.workflows.C3742e;
import com.withpersona.sdk2.inquiry.internal.workflows.C3743f;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment;
import com.withpersona.sdk2.inquiry.internal.workflows.InterfaceC3738a;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderConfig;
import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_InterceptorFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_KeyInflectionFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_MoshiFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_OkhttpClientFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_ResponseInterceptorFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_RetrofitFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_UseServerStylesFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkStateManager;
import com.withpersona.sdk2.inquiry.network.core.NetworkStateManager_Factory;
import com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule_UserAgentFactory;
import com.withpersona.sdk2.inquiry.network.upload.UploadService;
import com.withpersona.sdk2.inquiry.nfc.C3828b;
import com.withpersona.sdk2.inquiry.nfc.C3829c;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;
import com.withpersona.sdk2.inquiry.p057ui.C4148a;
import com.withpersona.sdk2.inquiry.p057ui.C4150c;
import com.withpersona.sdk2.inquiry.p057ui.C4151d;
import com.withpersona.sdk2.inquiry.p057ui.C4152e;
import com.withpersona.sdk2.inquiry.p057ui.C4155h;
import com.withpersona.sdk2.inquiry.p057ui.C4156i;
import com.withpersona.sdk2.inquiry.p057ui.C4157j;
import com.withpersona.sdk2.inquiry.p057ui.C4158k;
import com.withpersona.sdk2.inquiry.p057ui.C4159l;
import com.withpersona.sdk2.inquiry.p057ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.p057ui.network.C4178b;
import com.withpersona.sdk2.inquiry.p057ui.network.C4179c;
import com.withpersona.sdk2.inquiry.p057ui.uiStep.C4190a;
import com.withpersona.sdk2.inquiry.p057ui.uiStep.C4191b;
import com.withpersona.sdk2.inquiry.p057ui.uiStep.C4192c;
import com.withpersona.sdk2.inquiry.p057ui.uiStep.UiStepFragment;
import com.withpersona.sdk2.inquiry.permissions.C3852a;
import com.withpersona.sdk2.inquiry.permissions.C3853b;
import com.withpersona.sdk2.inquiry.permissions.C3854c;
import com.withpersona.sdk2.inquiry.permissions.C3855d;
import com.withpersona.sdk2.inquiry.permissions.C3856e;
import com.withpersona.sdk2.inquiry.permissions.C3857f;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3871a;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3873c;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3874d;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3875e;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3876f;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3877g;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.permissions.state.C3896a;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import com.withpersona.sdk2.inquiry.selfie.C3942d;
import com.withpersona.sdk2.inquiry.selfie.C3953e;
import com.withpersona.sdk2.inquiry.selfie.C3954f;
import com.withpersona.sdk2.inquiry.selfie.C3955g;
import com.withpersona.sdk2.inquiry.selfie.C3967q;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.C3981a;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.C3982b;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.C3983c;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.C4007a;
import com.withpersona.sdk2.inquiry.steps.p056ui.styling.remoteFonts.RealFontDownloader;
import com.withpersona.sdk2.inquiry.tracking.C14303RealTrackingEventsLogger_Factory;
import com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger_Factory_Impl;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache_Factory;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsModule;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsModule_TrackingEventsLoggerFactory;
import com.withpersona.sdk2.inquiry.tracking.TrackingMetadataProvider;
import com.withpersona.sdk2.inquiry.tracking.TrackingMetadataProvider_Factory;
import fo.InterfaceC5720a;
import gp.C6184d;
import gp.C6186f;
import gp.C6187g;
import gp.C6188h;
import gp.C6189i;
import gp.C6190j;
import gp.C6191k;
import gp.C6192l;
import gp.C6193m;
import gp.C6194n;
import gp.C6195o;
import gp.C6196p;
import gp.C6197q;
import gp.C6198r;
import gp.C6199s;
import gp.C6200t;
import gp.C6201u;
import gp.C6202v;
import gp.InterfaceC6203w;
import gp.InterfaceC6205y;
import hn.C6433b0;
import hn.C6434c;
import hn.C6435c0;
import hn.C6437d0;
import hn.C6438e;
import hn.C6440f;
import hn.C6447i0;
import hn.C6449j0;
import ht.InterfaceC6564a;
import io.C6856e;
import io.C6871h2;
import io.C6884l;
import io.C6888m;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import jo.C7230n;
import jo.C7232p;
import jp.C7244b;
import jp.C7246d;
import jp.InterfaceC7245c;
import kn.C7640c;
import kp.C7808c;
import kp.C7809d;
import kr.C7818e;
import kr.InterfaceC7814a;
import mp.C8614c0;
import mp.C8615d;
import mp.C8620f0;
import mp.C8621g;
import mp.C8625i;
import mp.C8631n;
import mp.C8632o;
import mp.C8633p;
import mp.C8634q;
import mp.C8637t;
import mp.C8640w;
import mp.C8643z;
import mp.InterfaceC8611b;
import mq.C8645b;
import mq.C8646c;
import mq.InterfaceC8644a;
import np.C9539b;
import np.C9541d;
import np.C9542e;
import np.C9543f;
import np.C9544g;
import nu.InterfaceC9564b0;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0368c0;
import p033bq.C1486a;
import p059cq.C4197b;
import p059cq.C4198c;
import p059cq.C4199d;
import p059cq.InterfaceC4196a;
import p082dp.C4649c;
import p082dp.C4650d;
import p082dp.C4651e;
import p082dp.C4652f;
import p082dp.C4653g;
import p082dp.C4655i;
import p082dp.C4656j;
import p082dp.C4657k;
import p082dp.InterfaceC4647a;
import p083dq.C4658a;
import p083dq.C4659b;
import p083dq.C4660c;
import p086dt.C4688b;
import p086dt.C4689c;
import p086dt.InterfaceC4687a;
import p111ep.C5174a;
import p111ep.C5176c;
import p111ep.C5177d;
import p111ep.C5178e;
import p112eq.C5191l;
import p132fn.C5691k;
import p132fn.C5693l;
import p132fn.C5695m;
import p132fn.C5697n;
import p132fn.C5698n0;
import p132fn.C5700o0;
import p132fn.C5703q;
import p132fn.C5706r0;
import p132fn.C5708s0;
import p132fn.C5709t;
import p132fn.C5717x;
import p132fn.C5718y;
import p132fn.InterfaceC5690j0;
import p133fp.C5726f;
import p133fp.C5728h;
import p133fp.InterfaceC5727g;
import p134fq.C5772k2;
import p134fq.C5780m2;
import p134fq.C5784n2;
import p136ft.C5829c;
import p136ft.C5832f;
import p136ft.C5833g;
import p136ft.C5834h;
import p136ft.C5836j;
import p136ft.InterfaceC5835i;
import p139g.AbstractC5854c;
import p139g.C5859h;
import p152go.C6159e;
import p152go.C6160f;
import p152go.C6161g;
import p152go.C6162h;
import p152go.C6163i;
import p152go.C6164j;
import p152go.C6165k;
import p152go.C6166l;
import p152go.C6167m;
import p152go.C6168n;
import p152go.C6169o;
import p152go.C6170p;
import p152go.C6171q;
import p152go.C6172r;
import p152go.C6173s;
import p152go.InterfaceC6158d;
import p176ho.C6475b;
import p176ho.C6476c;
import p176ho.C6477d;
import p176ho.InterfaceC6474a;
import p177hp.C6491e0;
import p177hp.C6494f0;
import p177hp.C6496g0;
import p177hp.C6510n0;
import p178hq.C6544j;
import p178hq.C6545k;
import p226jq.C7252c0;
import p226jq.C7254d0;
import p226jq.C7256e0;
import p226jq.C7258f0;
import p226jq.C7287y;
import p226jq.InterfaceC7267k;
import p229jt.C7347n;
import p231jv.C7397y;
import p239k6.InterfaceC7479s;
import p251ko.C7642a0;
import p251ko.C7667z;
import p256ku.AbstractC7888l0;
import p256ku.InterfaceC7906p0;
import p276ln.C8170b;
import p276ln.C8171c;
import p276ln.InterfaceC8169a;
import p277lo.C8211t0;
import p277lo.C8213u0;
import p278lp.C8221c;
import p278lp.C8224f;
import p278lp.C8232n;
import p278lp.C8233o;
import p278lp.C8234p;
import p279lq.C8235a;
import p279lq.C8236b;
import p279lq.C8237c;
import p279lq.C8238d;
import p279lq.C8239e;
import p279lq.C8240f;
import p339oo.C9833b;
import p339oo.C9834c;
import p339oo.GovernmentIdHintWorker;
import p340op.C9840f;
import p341oq.C9843b;
import p342or.C9857b2;
import p342or.C9865c2;
import p342or.C9933k6;
import p342or.C9936l1;
import p361po.C10303c;
import p361po.C10304d;
import p361po.C10305e;
import p363pq.C10309c;
import p363pq.C10310d;
import p363pq.C10312f;
import p363pq.C10313g;
import p363pq.InterfaceC10311e;
import p389qo.C10642d1;
import p389qo.InterfaceC10665p;
import p390qp.C10691e;
import p390qp.C10694h;
import p390qp.C10697k;
import p391qq.C10698a;
import p391qq.C10699b;
import p391qq.C10700c;
import p392qr.C10701a;
import p392qr.C10702b;
import p392qr.InterfaceC10703c;
import p419rp.C11026j;
import p419rp.C11037m1;
import p419rp.InterfaceC11034l1;
import p420rq.C11070d;
import p420rq.InterfaceC11067a;
import p421rr.C11084e0;
import p421rr.C11087f0;
import p421rr.C11091g1;
import p421rr.C11094h1;
import p421rr.C11097i1;
import p435sq.C11445a;
import p449tp.C11734c;
import p449tp.C11735d;
import p449tp.C11737f;
import p471um.AbstractC11873h;
import p471um.C11888w;
import p473uo.C11903j;
import p473uo.C11904k;
import p473uo.C11915v;
import p473uo.C11916w;
import p474up.C11929l;
import p475uq.C11930a;
import p475uq.C11931b;
import p498vq.C12247a;
import p525wp.C12504c;
import p525wp.C12505d;
import p525wp.C12507f;
import p525wp.C12508g;
import p525wp.C12509h;
import p554xo.C12871c;
import p554xo.InterfaceC12872d;
import p582yn.C13235a0;
import p582yn.C13237b0;
import p582yn.C13239c0;
import p582yn.C13242e;
import p582yn.C13243f;
import p582yn.C13244g;
import p582yn.C13245h;
import p582yn.C13246i;
import p582yn.C13247j;
import p582yn.C13253p;
import p582yn.C13254q;
import p582yn.C13255r;
import p582yn.C13256s;
import p582yn.C13257t;
import p582yn.C13258u;
import p582yn.C13263z;
import p582yn.InterfaceC13234a;
import p582yn.InterfaceC13236b;
import p582yn.InterfaceC13240d;
import p582yn.InterfaceC13248k;
import p582yn.InterfaceC13250m;
import p583yo.C13271h;
import p584yp.C13280b0;
import p584yp.C13363n;
import p584yp.C13412v;
import p584yp.C13418w;
import p584yp.InterfaceC13287c0;
import p609zn.C13858b;
import p609zn.C13882h;
import p609zn.InterfaceC13878g;
import p610zo.C13952c;
import p610zo.C13953c0;
import p610zo.C13954d;
import p610zo.C13958f;
import p610zo.C13960g;
import p610zo.C13963h0;
import p610zo.C13964i;
import p610zo.C13965i0;
import p610zo.C13966j;
import p610zo.C13967j0;
import p610zo.C13968k;
import p610zo.C13969k0;
import p610zo.C13971l0;
import p610zo.C13974n;
import p610zo.C13975n0;
import p610zo.C13976o;
import p610zo.C13977o0;
import p610zo.C13978p;
import p610zo.C13979p0;
import p610zo.C13980q;
import p610zo.C13981r;
import p610zo.EnumC13962h;
import p610zo.InterfaceC13982s;
import p611zp.C14021p0;
import p611zp.C14023q0;
import p612zq.C14035a;
import p612zq.C14036b;
import ro.C10960i;
import ro.C10965j1;
import ro.C10966k;
import ro.C10968k1;
import ro.C10972m0;
import ro.C10974n0;
import ro.C10990v0;
import ro.C10992w0;
import sr.C11449d;
import sr.InterfaceC11448c;
import tr.C11742b;
import tr.C11743c;
import tr.InterfaceC11741a;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C3676e {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public NetworkCoreModule f14741a;

        /* JADX INFO: renamed from: b */
        public C3707f f14742b;

        /* JADX INFO: renamed from: c */
        public C8634q f14743c;

        /* JADX INFO: renamed from: d */
        public C5691k f14744d;

        /* JADX INFO: renamed from: e */
        public C8640w f14745e;

        /* JADX INFO: renamed from: f */
        public C10698a f14746f;

        /* JADX INFO: renamed from: g */
        public C13974n f14747g;

        /* JADX INFO: renamed from: h */
        public C8615d f14748h;

        /* JADX INFO: renamed from: i */
        public C8625i f14749i;

        /* JADX INFO: renamed from: j */
        public C12507f f14750j;

        /* JADX INFO: renamed from: k */
        public C10691e f14751k;

        /* JADX INFO: renamed from: l */
        public C8221c f14752l;

        /* JADX INFO: renamed from: m */
        public C8645b f14753m;

        /* JADX INFO: renamed from: n */
        public C4649c f14754n;

        /* JADX INFO: renamed from: o */
        public C7252c0 f14755o;

        /* JADX INFO: renamed from: p */
        public C8237c f14756p;

        /* JADX INFO: renamed from: q */
        public C3678a f14757q;

        /* JADX INFO: renamed from: r */
        public C10312f f14758r;

        /* JADX INFO: renamed from: s */
        public C8614c0 f14759s;

        /* JADX INFO: renamed from: t */
        public C13242e f14760t;

        /* JADX INFO: renamed from: u */
        public C6161g f14761u;

        /* JADX INFO: renamed from: v */
        public TrackingEventsModule f14762v;

        /* JADX INFO: renamed from: a */
        public a m18349a(C3678a c3678a) {
            this.f14757q = (C3678a) C5834h.m26191b(c3678a);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public InterfaceC13982s m18350b() {
            C5834h.m26190a(this.f14741a, NetworkCoreModule.class);
            C5834h.m26190a(this.f14742b, C3707f.class);
            C5834h.m26190a(this.f14743c, C8634q.class);
            if (this.f14744d == null) {
                this.f14744d = new C5691k();
            }
            C5834h.m26190a(this.f14745e, C8640w.class);
            C5834h.m26190a(this.f14746f, C10698a.class);
            C5834h.m26190a(this.f14747g, C13974n.class);
            C5834h.m26190a(this.f14748h, C8615d.class);
            C5834h.m26190a(this.f14749i, C8625i.class);
            if (this.f14750j == null) {
                this.f14750j = new C12507f();
            }
            C5834h.m26190a(this.f14751k, C10691e.class);
            C5834h.m26190a(this.f14752l, C8221c.class);
            C5834h.m26190a(this.f14753m, C8645b.class);
            C5834h.m26190a(this.f14754n, C4649c.class);
            if (this.f14755o == null) {
                this.f14755o = new C7252c0();
            }
            if (this.f14756p == null) {
                this.f14756p = new C8237c();
            }
            C5834h.m26190a(this.f14757q, C3678a.class);
            C5834h.m26190a(this.f14758r, C10312f.class);
            C5834h.m26190a(this.f14759s, C8614c0.class);
            if (this.f14760t == null) {
                this.f14760t = new C13242e();
            }
            if (this.f14761u == null) {
                this.f14761u = new C6161g();
            }
            C5834h.m26190a(this.f14762v, TrackingEventsModule.class);
            return new f(this.f14741a, this.f14742b, this.f14743c, this.f14744d, this.f14745e, this.f14746f, this.f14747g, this.f14748h, this.f14749i, this.f14750j, this.f14751k, this.f14752l, this.f14753m, this.f14754n, this.f14755o, this.f14756p, this.f14757q, this.f14758r, this.f14759s, this.f14760t, this.f14761u, this.f14762v);
        }

        /* JADX INFO: renamed from: c */
        public a m18351c(C8615d c8615d) {
            this.f14748h = (C8615d) C5834h.m26191b(c8615d);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m18352d(C8645b c8645b) {
            this.f14753m = (C8645b) C5834h.m26191b(c8645b);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m18353e(C8625i c8625i) {
            this.f14749i = (C8625i) C5834h.m26191b(c8625i);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m18354f(C8634q c8634q) {
            this.f14743c = (C8634q) C5834h.m26191b(c8634q);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m18355g(C10312f c10312f) {
            this.f14758r = (C10312f) C5834h.m26191b(c10312f);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m18356h(C4649c c4649c) {
            this.f14754n = (C4649c) C5834h.m26191b(c4649c);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a m18357i(C10698a c10698a) {
            this.f14746f = (C10698a) C5834h.m26191b(c10698a);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public a m18358j(C13974n c13974n) {
            this.f14747g = (C13974n) C5834h.m26191b(c13974n);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public a m18359k(C3707f c3707f) {
            this.f14742b = (C3707f) C5834h.m26191b(c3707f);
            return this;
        }

        /* JADX INFO: renamed from: l */
        public a m18360l(C8221c c8221c) {
            this.f14752l = (C8221c) C5834h.m26191b(c8221c);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public a m18361m(NetworkCoreModule networkCoreModule) {
            this.f14741a = (NetworkCoreModule) C5834h.m26191b(networkCoreModule);
            return this;
        }

        /* JADX INFO: renamed from: n */
        public a m18362n(C10691e c10691e) {
            this.f14751k = (C10691e) C5834h.m26191b(c10691e);
            return this;
        }

        /* JADX INFO: renamed from: o */
        public a m18363o(C8640w c8640w) {
            this.f14745e = (C8640w) C5834h.m26191b(c8640w);
            return this;
        }

        /* JADX INFO: renamed from: p */
        public a m18364p(C8614c0 c8614c0) {
            this.f14759s = (C8614c0) C5834h.m26191b(c8614c0);
            return this;
        }

        /* JADX INFO: renamed from: q */
        public a m18365q(C7252c0 c7252c0) {
            this.f14755o = (C7252c0) C5834h.m26191b(c7252c0);
            return this;
        }

        /* JADX INFO: renamed from: r */
        public a m18366r(TrackingEventsModule trackingEventsModule) {
            this.f14762v = (TrackingEventsModule) C5834h.m26191b(trackingEventsModule);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$b */
    public static final class b implements InterfaceC13878g.a {

        /* JADX INFO: renamed from: a */
        public final f f14763a;

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ldt/a; */
        @Override // p086dt.InterfaceC4687a.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC13878g mo18367a(DocumentStepFragment documentStepFragment) {
            C5834h.m26191b(documentStepFragment);
            return new c(this.f14763a, documentStepFragment);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(f fVar) {
            this.f14763a = fVar;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$c */
    public static final class c implements InterfaceC13878g {

        /* JADX INFO: renamed from: a */
        public final f f14764a;

        /* JADX INFO: renamed from: b */
        public final c f14765b = this;

        /* JADX INFO: renamed from: c */
        public InterfaceC5835i<C3438a> f14766c;

        /* JADX INFO: renamed from: d */
        public InterfaceC5835i<C3446i.b> f14767d;

        /* JADX INFO: renamed from: e */
        public InterfaceC5835i<C3451a.a> f14768e;

        /* JADX INFO: renamed from: f */
        public InterfaceC5835i<C3455e.a> f14769f;

        /* JADX INFO: renamed from: g */
        public InterfaceC5835i<C3453c.a> f14770g;

        /* JADX INFO: renamed from: h */
        public InterfaceC5835i<C1475a.a> f14771h;

        /* JADX INFO: renamed from: i */
        public InterfaceC5835i<C3457g.a> f14772i;

        /* JADX INFO: renamed from: j */
        public C11735d f14773j;

        /* JADX INFO: renamed from: k */
        public InterfaceC5835i<C3875e.a> f14774k;

        /* JADX INFO: renamed from: l */
        public C1693c1 f14775l;

        /* JADX INFO: renamed from: m */
        public InterfaceC5835i<C3473b.c> f14776m;

        /* JADX INFO: renamed from: n */
        public C3476e f14777n;

        /* JADX INFO: renamed from: o */
        public InterfaceC5835i<C3475d.a> f14778o;

        public c(f fVar, DocumentStepFragment documentStepFragment) {
            this.f14764a = fVar;
            m18370b(documentStepFragment);
        }

        /* JADX INFO: renamed from: b */
        public final void m18370b(DocumentStepFragment documentStepFragment) {
            f fVar = this.f14764a;
            this.f14766c = C13858b.m50428a(fVar.f14923t1, fVar.f14927v, fVar.f14882g);
            f fVar2 = this.f14764a;
            this.f14767d = C3447j.m16643a(fVar2.f14920s1, fVar2.f14926u1, fVar2.f14927v, fVar2.f14882g);
            this.f14768e = C3452b.m16708a(this.f14764a.f14929v1);
            this.f14769f = C3456f.m16748a(this.f14764a.f14929v1);
            f fVar3 = this.f14764a;
            this.f14770g = C3454d.m16737a(fVar3.f14929v1, fVar3.f14932w1);
            this.f14771h = C1476b.m7580a(this.f14764a.f14929v1);
            f fVar4 = this.f14764a;
            this.f14772i = C3458h.m16763a(fVar4.f14929v1, fVar4.f14814C0, fVar4.f14875d1);
            C11735d c11735dM43948a = C11735d.m43948a(this.f14764a.f14845Q0);
            this.f14773j = c11735dM43948a;
            InterfaceC5835i<C3875e.a> interfaceC5835iM19205b = C3876f.m19205b(c11735dM43948a);
            this.f14774k = interfaceC5835iM19205b;
            f fVar5 = this.f14764a;
            C1693c1 c1693c1M8404a = C1693c1.m8404a(fVar5.f14916r0, fVar5.f14927v, this.f14766c, this.f14767d, this.f14768e, this.f14769f, this.f14770g, this.f14771h, this.f14772i, fVar5.f14890i1, fVar5.f14823F0, fVar5.f14834L, interfaceC5835iM19205b, fVar5.f14821E1);
            this.f14775l = c1693c1M8404a;
            InterfaceC5835i<C3473b.c> interfaceC5835iM16902b = C3474c.m16902b(c1693c1M8404a);
            this.f14776m = interfaceC5835iM16902b;
            C3476e c3476eM16906a = C3476e.m16906a(interfaceC5835iM16902b);
            this.f14777n = c3476eM16906a;
            this.f14778o = C3477f.m16909b(c3476eM16906a);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p086dt.InterfaceC4687a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo18369a(DocumentStepFragment documentStepFragment) {
            m18372d(documentStepFragment);
        }

        /* JADX INFO: renamed from: d */
        public final DocumentStepFragment m18372d(DocumentStepFragment documentStepFragment) {
            C9843b.m38731a(documentStepFragment, this.f14764a.mo18380a());
            C3472a.m16799b(documentStepFragment, this.f14778o.get());
            C3472a.m16798a(documentStepFragment, this.f14764a.f14817D0.get());
            return documentStepFragment;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$d */
    public static final class d implements InterfaceC10665p.a {

        /* JADX INFO: renamed from: a */
        public final f f14779a;

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ldt/a; */
        @Override // p086dt.InterfaceC4687a.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10665p mo18367a(GovernmentIdStepFragment governmentIdStepFragment) {
            C5834h.m26191b(governmentIdStepFragment);
            return new e(this.f14779a, governmentIdStepFragment);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public d(f fVar) {
            this.f14779a = fVar;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$e */
    public static final class e implements InterfaceC10665p {

        /* JADX INFO: renamed from: A */
        public InterfaceC5835i<C3593d.a> f14780A;

        /* JADX INFO: renamed from: a */
        public final f f14781a;

        /* JADX INFO: renamed from: b */
        public final e f14782b = this;

        /* JADX INFO: renamed from: c */
        public C10304d f14783c;

        /* JADX INFO: renamed from: d */
        public InterfaceC5835i<C10303c.a> f14784d;

        /* JADX INFO: renamed from: e */
        public InterfaceC5835i<C3544e> f14785e;

        /* JADX INFO: renamed from: f */
        public C5709t f14786f;

        /* JADX INFO: renamed from: g */
        public InterfaceC5835i<C3405e.a> f14787g;

        /* JADX INFO: renamed from: h */
        public C6435c0 f14788h;

        /* JADX INFO: renamed from: i */
        public InterfaceC5835i<C6433b0.a> f14789i;

        /* JADX INFO: renamed from: j */
        public C6438e f14790j;

        /* JADX INFO: renamed from: k */
        public InterfaceC5835i<C6434c.a> f14791k;

        /* JADX INFO: renamed from: l */
        public InterfaceC5835i<C10990v0> f14792l;

        /* JADX INFO: renamed from: m */
        public InterfaceC5835i<C10965j1> f14793m;

        /* JADX INFO: renamed from: n */
        public C3546g f14794n;

        /* JADX INFO: renamed from: o */
        public InterfaceC5835i<GovernmentIdAnalyzeWorker.a> f14795o;

        /* JADX INFO: renamed from: p */
        public C9833b f14796p;

        /* JADX INFO: renamed from: q */
        public InterfaceC5835i<GovernmentIdHintWorker.b> f14797q;

        /* JADX INFO: renamed from: r */
        public InterfaceC5835i<C11742b.a> f14798r;

        /* JADX INFO: renamed from: s */
        public C11735d f14799s;

        /* JADX INFO: renamed from: t */
        public InterfaceC5835i<C3875e.a> f14800t;

        /* JADX INFO: renamed from: u */
        public InterfaceC5835i<C10972m0> f14801u;

        /* JADX INFO: renamed from: v */
        public InterfaceC5835i<AutoClassifyWorker.C3563b> f14802v;

        /* JADX INFO: renamed from: w */
        public InterfaceC5835i<C10960i> f14803w;

        /* JADX INFO: renamed from: x */
        public C10642d1 f14804x;

        /* JADX INFO: renamed from: y */
        public InterfaceC5835i<C3591b.c> f14805y;

        /* JADX INFO: renamed from: z */
        public C3594e f14806z;

        public e(f fVar, GovernmentIdStepFragment governmentIdStepFragment) {
            this.f14781a = fVar;
            m18374b(governmentIdStepFragment);
        }

        /* JADX INFO: renamed from: b */
        public final void m18374b(GovernmentIdStepFragment governmentIdStepFragment) {
            f fVar = this.f14781a;
            C10304d c10304dM39599a = C10304d.m39599a(fVar.f14927v, fVar.f14872c1, fVar.f14875d1, fVar.f14814C0, fVar.f14878e1, fVar.f14884g1, fVar.f14834L);
            this.f14783c = c10304dM39599a;
            this.f14784d = C10305e.m39602b(c10304dM39599a);
            f fVar2 = this.f14781a;
            this.f14785e = C6856e.m29305a(fVar2.f14887h1, fVar2.f14927v, fVar2.f14882g);
            f fVar3 = this.f14781a;
            C5709t c5709tM25880a = C5709t.m25880a(fVar3.f14927v, fVar3.f14884g1, fVar3.f14882g);
            this.f14786f = c5709tM25880a;
            this.f14787g = C3406f.m16231b(c5709tM25880a);
            f fVar4 = this.f14781a;
            C6435c0 c6435c0M28068a = C6435c0.m28068a(fVar4.f14927v, fVar4.f14884g1, fVar4.f14882g, fVar4.f14846R, fVar4.f14824G, fVar4.f14834L, fVar4.f14823F0, fVar4.f14933x);
            this.f14788h = c6435c0M28068a;
            InterfaceC5835i<C6433b0.a> interfaceC5835iM28071b = C6437d0.m28071b(c6435c0M28068a);
            this.f14789i = interfaceC5835iM28071b;
            f fVar5 = this.f14781a;
            C6438e c6438eM28072a = C6438e.m28072a(interfaceC5835iM28071b, fVar5.f14846R, fVar5.f14826H, fVar5.f14834L);
            this.f14790j = c6438eM28072a;
            InterfaceC5835i<C6434c.a> interfaceC5835iM28077b = C6440f.m28077b(c6438eM28072a);
            this.f14791k = interfaceC5835iM28077b;
            f fVar6 = this.f14781a;
            this.f14792l = C10992w0.m41673a(fVar6.f14927v, this.f14787g, interfaceC5835iM28077b, fVar6.f14890i1, fVar6.f14834L);
            f fVar7 = this.f14781a;
            this.f14793m = C10968k1.m41588a(fVar7.f14927v, this.f14787g, this.f14791k, fVar7.f14890i1, fVar7.f14834L);
            f fVar8 = this.f14781a;
            C3546g c3546gM17544a = C3546g.m17544a(fVar8.f14927v, fVar8.f14879f, fVar8.f14882g);
            this.f14794n = c3546gM17544a;
            this.f14795o = C3547h.m17547b(c3546gM17544a);
            f fVar9 = this.f14781a;
            C9833b c9833bM38714a = C9833b.m38714a(fVar9.f14927v, fVar9.f14879f);
            this.f14796p = c9833bM38714a;
            this.f14797q = C9834c.m38717b(c9833bM38714a);
            this.f14798r = C11743c.m43966a(this.f14781a.f14899l1);
            C11735d c11735dM43948a = C11735d.m43948a(this.f14781a.f14845Q0);
            this.f14799s = c11735dM43948a;
            InterfaceC5835i<C3875e.a> interfaceC5835iM19205b = C3876f.m19205b(c11735dM43948a);
            this.f14800t = interfaceC5835iM19205b;
            f fVar10 = this.f14781a;
            this.f14801u = C10974n0.m41653a(fVar10.f14927v, this.f14795o, this.f14797q, this.f14798r, this.f14787g, this.f14791k, fVar10.f14890i1, fVar10.f14834L, interfaceC5835iM19205b);
            f fVar11 = this.f14781a;
            this.f14802v = C3569a.m17724a(fVar11.f14872c1, fVar11.f14878e1);
            C10966k c10966kM41585a = C10966k.m41585a(this.f14781a.f14890i1);
            this.f14803w = c10966kM41585a;
            f fVar12 = this.f14781a;
            C10642d1 c10642d1M40727a = C10642d1.m40727a(fVar12.f14927v, fVar12.f14916r0, this.f14784d, this.f14785e, this.f14792l, this.f14793m, this.f14801u, this.f14802v, c10966kM41585a, fVar12.f14884g1, fVar12.f14890i1, fVar12.f14823F0, fVar12.f14834L, fVar12.f14866a1, fVar12.f14821E1);
            this.f14804x = c10642d1M40727a;
            InterfaceC5835i<C3591b.c> interfaceC5835iM17913b = C3592c.m17913b(c10642d1M40727a);
            this.f14805y = interfaceC5835iM17913b;
            C3594e c3594eM17917a = C3594e.m17917a(interfaceC5835iM17913b);
            this.f14806z = c3594eM17917a;
            this.f14780A = C3595f.m17920b(c3594eM17917a);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p086dt.InterfaceC4687a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo18369a(GovernmentIdStepFragment governmentIdStepFragment) {
            m18376d(governmentIdStepFragment);
        }

        /* JADX INFO: renamed from: d */
        public final GovernmentIdStepFragment m18376d(GovernmentIdStepFragment governmentIdStepFragment) {
            C9843b.m38731a(governmentIdStepFragment, this.f14781a.mo18380a());
            C3590a.m17806f(governmentIdStepFragment, this.f14780A.get());
            C3590a.m17801a(governmentIdStepFragment, this.f14781a.m18390l());
            C3590a.m17803c(governmentIdStepFragment, C5829c.m26178b(this.f14781a.f14879f));
            C3590a.m17805e(governmentIdStepFragment, this.f14781a.f14834L.get());
            C3590a.m17802b(governmentIdStepFragment, this.f14781a.f14933x.get());
            C3590a.m17804d(governmentIdStepFragment, this.f14781a.f14817D0.get());
            return governmentIdStepFragment;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$f */
    public static final class f implements InterfaceC13982s {

        /* JADX INFO: renamed from: A */
        public InterfaceC5835i<Set<JsonAdapterBinding<?>>> f14807A;

        /* JADX INFO: renamed from: A0 */
        public InterfaceC5835i<EnumC13962h> f14808A0;

        /* JADX INFO: renamed from: A1 */
        public InterfaceC5835i<C13237b0> f14809A1;

        /* JADX INFO: renamed from: B */
        public InterfaceC5835i<Set<AbstractC11873h.e>> f14810B;

        /* JADX INFO: renamed from: B0 */
        public InterfaceC5835i<C4655i> f14811B0;

        /* JADX INFO: renamed from: B1 */
        public InterfaceC5835i<InterfaceC13250m> f14812B1;

        /* JADX INFO: renamed from: C */
        public InterfaceC5835i<Set<AbstractC11873h.e>> f14813C;

        /* JADX INFO: renamed from: C0 */
        public InterfaceC5835i<InterfaceC5720a> f14814C0;

        /* JADX INFO: renamed from: C1 */
        public InterfaceC5835i<C13257t> f14815C1;

        /* JADX INFO: renamed from: D */
        public InterfaceC5835i<C11888w> f14816D;

        /* JADX INFO: renamed from: D0 */
        public InterfaceC5835i<C12247a> f14817D0;

        /* JADX INFO: renamed from: D1 */
        public InterfaceC5835i<InterfaceC13240d> f14818D1;

        /* JADX INFO: renamed from: E */
        public InterfaceC5835i<TrackingMetadataProvider> f14819E;

        /* JADX INFO: renamed from: E0 */
        public InterfaceC5835i<InterfaceC10311e> f14820E0;

        /* JADX INFO: renamed from: E1 */
        public InterfaceC5835i<InterfaceC7906p0> f14821E1;

        /* JADX INFO: renamed from: F */
        public InterfaceC5835i<AbstractC7888l0> f14822F;

        /* JADX INFO: renamed from: F0 */
        public InterfaceC5835i<C10309c> f14823F0;

        /* JADX INFO: renamed from: G */
        public InterfaceC5835i<C8235a> f14824G;

        /* JADX INFO: renamed from: G0 */
        public InterfaceC5835i<Application> f14825G0;

        /* JADX INFO: renamed from: H */
        public InterfaceC5835i<InterfaceC7906p0> f14826H;

        /* JADX INFO: renamed from: H0 */
        public InterfaceC5835i<RealFontDownloader> f14827H0;

        /* JADX INFO: renamed from: I */
        public InterfaceC5835i<NetworkStateManager> f14828I;

        /* JADX INFO: renamed from: I0 */
        public InterfaceC5835i<InterfaceC10665p.a> f14829I0;

        /* JADX INFO: renamed from: J */
        public C14303RealTrackingEventsLogger_Factory f14830J;

        /* JADX INFO: renamed from: J0 */
        public InterfaceC5835i<InterfaceC11448c.a> f14831J0;

        /* JADX INFO: renamed from: K */
        public InterfaceC5835i<RealTrackingEventsLogger.Factory> f14832K;

        /* JADX INFO: renamed from: K0 */
        public InterfaceC5835i<InterfaceC13287c0.a> f14833K0;

        /* JADX INFO: renamed from: L */
        public InterfaceC5835i<TrackingEventsLogger> f14834L;

        /* JADX INFO: renamed from: L0 */
        public InterfaceC5835i<InterfaceC13878g.a> f14835L0;

        /* JADX INFO: renamed from: M */
        public InterfaceC5835i<C7667z> f14836M;

        /* JADX INFO: renamed from: M0 */
        public InterfaceC5835i<InterfaceC11034l1.a> f14837M0;

        /* JADX INFO: renamed from: N */
        public InterfaceC5835i<Set<InterfaceC0364a0<?>>> f14838N;

        /* JADX INFO: renamed from: N0 */
        public InterfaceC5835i<InterfaceC5727g.a> f14839N0;

        /* JADX INFO: renamed from: O */
        public InterfaceC5835i<C5706r0> f14840O;

        /* JADX INFO: renamed from: O0 */
        public InterfaceC5835i<InterfaceC7245c.a> f14841O0;

        /* JADX INFO: renamed from: P */
        public InterfaceC5835i<InterfaceC9564b0<C7640c>> f14842P;

        /* JADX INFO: renamed from: P0 */
        public InterfaceC5835i<InterfaceC12872d.a> f14843P0;

        /* JADX INFO: renamed from: Q */
        public InterfaceC5835i<C5698n0> f14844Q;

        /* JADX INFO: renamed from: Q0 */
        public InterfaceC5835i<C3877g> f14845Q0;

        /* JADX INFO: renamed from: R */
        public InterfaceC5835i<C6447i0> f14846R;

        /* JADX INFO: renamed from: R0 */
        public InterfaceC5835i<UploadService> f14847R0;

        /* JADX INFO: renamed from: S */
        public InterfaceC5835i<C3942d> f14848S;

        /* JADX INFO: renamed from: S0 */
        public InterfaceC5835i<DirectFileUploader> f14849S0;

        /* JADX INFO: renamed from: T */
        public InterfaceC5835i<C14021p0> f14850T;

        /* JADX INFO: renamed from: T0 */
        public InterfaceC5835i<InterfaceC6205y> f14851T0;

        /* JADX INFO: renamed from: U */
        public InterfaceC5835i<Set<InterfaceC0364a0<?>>> f14852U;

        /* JADX INFO: renamed from: U0 */
        public InterfaceC5835i<C13253p> f14853U0;

        /* JADX INFO: renamed from: V */
        public InterfaceC5835i<Set<InterfaceC0364a0<?>>> f14854V;

        /* JADX INFO: renamed from: V0 */
        public InterfaceC5835i<InterfaceC13234a> f14855V0;

        /* JADX INFO: renamed from: W */
        public InterfaceC5835i<InterfaceC0368c0> f14856W;

        /* JADX INFO: renamed from: W0 */
        public InterfaceC5835i<C5177d> f14857W0;

        /* JADX INFO: renamed from: X */
        public InterfaceC5835i<String> f14858X;

        /* JADX INFO: renamed from: X0 */
        public InterfaceC5835i<C5174a> f14859X0;

        /* JADX INFO: renamed from: Y */
        public InterfaceC5835i<Interceptor> f14860Y;

        /* JADX INFO: renamed from: Y0 */
        public InterfaceC5835i<Boolean> f14861Y0;

        /* JADX INFO: renamed from: Z */
        public InterfaceC5835i<Interceptor> f14862Z;

        /* JADX INFO: renamed from: Z0 */
        public InterfaceC5835i<C3706e> f14863Z0;

        /* JADX INFO: renamed from: a */
        public final C13974n f14864a;

        /* JADX INFO: renamed from: a0 */
        public InterfaceC5835i<C12504c> f14865a0;

        /* JADX INFO: renamed from: a1 */
        public InterfaceC5835i<C4007a> f14866a1;

        /* JADX INFO: renamed from: b */
        public final C8237c f14867b;

        /* JADX INFO: renamed from: b0 */
        public InterfaceC5835i<Interceptor> f14868b0;

        /* JADX INFO: renamed from: b1 */
        public InterfaceC5835i<UiStepSavedStateHelper> f14869b1;

        /* JADX INFO: renamed from: c */
        public final C10698a f14870c;

        /* JADX INFO: renamed from: c0 */
        public InterfaceC5835i<Set<Interceptor>> f14871c0;

        /* JADX INFO: renamed from: c1 */
        public InterfaceC5835i<InterfaceC3570b> f14872c1;

        /* JADX INFO: renamed from: d */
        public final f f14873d = this;

        /* JADX INFO: renamed from: d0 */
        public InterfaceC5835i<String> f14874d0;

        /* JADX INFO: renamed from: d1 */
        public InterfaceC5835i<InterfaceC8644a> f14875d1;

        /* JADX INFO: renamed from: e */
        public InterfaceC5835i<InterfaceC9564b0<C7347n<InterfaceC5690j0>>> f14876e;

        /* JADX INFO: renamed from: e0 */
        public InterfaceC5835i<String> f14877e0;

        /* JADX INFO: renamed from: e1 */
        public InterfaceC5835i<InterfaceC11067a> f14878e1;

        /* JADX INFO: renamed from: f */
        public InterfaceC5835i<C5717x> f14879f;

        /* JADX INFO: renamed from: f0 */
        public InterfaceC5835i<Map<String, String>> f14880f0;

        /* JADX INFO: renamed from: f1 */
        public InterfaceC5835i<C8170b> f14881f1;

        /* JADX INFO: renamed from: g */
        public InterfaceC5835i<C10700c> f14882g;

        /* JADX INFO: renamed from: g0 */
        public InterfaceC5835i<C13263z> f14883g0;

        /* JADX INFO: renamed from: g1 */
        public InterfaceC5835i<InterfaceC8169a> f14884g1;

        /* JADX INFO: renamed from: h */
        public InterfaceC5835i<C3402b> f14885h;

        /* JADX INFO: renamed from: h0 */
        public InterfaceC5835i<InterfaceC13248k> f14886h0;

        /* JADX INFO: renamed from: h1 */
        public InterfaceC5835i<AbstractC5854c<String[]>> f14887h1;

        /* JADX INFO: renamed from: i */
        public InterfaceC5835i<InterfaceC6158d> f14888i;

        /* JADX INFO: renamed from: i0 */
        public InterfaceC5835i<C13255r> f14889i0;

        /* JADX INFO: renamed from: i1 */
        public InterfaceC5835i<C11930a> f14890i1;

        /* JADX INFO: renamed from: j */
        public InterfaceC5835i<InterfaceC6158d> f14891j;

        /* JADX INFO: renamed from: j0 */
        public InterfaceC5835i<InterfaceC13236b> f14892j0;

        /* JADX INFO: renamed from: j1 */
        public InterfaceC5835i<AbstractC5854c<String>> f14893j1;

        /* JADX INFO: renamed from: k */
        public InterfaceC5835i<InterfaceC6158d> f14894k;

        /* JADX INFO: renamed from: k0 */
        public InterfaceC5835i<C9539b> f14895k0;

        /* JADX INFO: renamed from: k1 */
        public InterfaceC5835i<AbstractC5854c<IntentSenderRequest>> f14896k1;

        /* JADX INFO: renamed from: l */
        public InterfaceC5835i<InterfaceC6158d> f14897l;

        /* JADX INFO: renamed from: l0 */
        public C9543f f14898l0;

        /* JADX INFO: renamed from: l1 */
        public InterfaceC5835i<InterfaceC11741a> f14899l1;

        /* JADX INFO: renamed from: m */
        public InterfaceC5835i<InterfaceC6158d> f14900m;

        /* JADX INFO: renamed from: m0 */
        public InterfaceC5835i<C9542e.a> f14901m0;

        /* JADX INFO: renamed from: m1 */
        public InterfaceC5835i<InterfaceC4196a> f14902m1;

        /* JADX INFO: renamed from: n */
        public InterfaceC5835i<InterfaceC6158d> f14903n;

        /* JADX INFO: renamed from: n0 */
        public InterfaceC5835i<OkHttpClient> f14904n0;

        /* JADX INFO: renamed from: n1 */
        public InterfaceC5835i<AbstractC7888l0> f14905n1;

        /* JADX INFO: renamed from: o */
        public InterfaceC5835i<InterfaceC6158d> f14906o;

        /* JADX INFO: renamed from: o0 */
        public InterfaceC5835i<C7397y> f14907o0;

        /* JADX INFO: renamed from: o1 */
        public InterfaceC5835i<AbstractC5854c<PassportNfcReaderConfig>> f14908o1;

        /* JADX INFO: renamed from: p */
        public InterfaceC5835i<InterfaceC6158d> f14909p;

        /* JADX INFO: renamed from: p0 */
        public InterfaceC5835i<InterfaceC6203w> f14910p0;

        /* JADX INFO: renamed from: p1 */
        public InterfaceC5835i<AbstractC5854c<JpMyNumberNfcReaderConfig>> f14911p1;

        /* JADX INFO: renamed from: q */
        public InterfaceC5835i<InterfaceC6158d> f14912q;

        /* JADX INFO: renamed from: q0 */
        public InterfaceC5835i<C13964i> f14913q0;

        /* JADX INFO: renamed from: q1 */
        public InterfaceC5835i<InterfaceC10703c> f14914q1;

        /* JADX INFO: renamed from: r */
        public InterfaceC5835i<InterfaceC6158d> f14915r;

        /* JADX INFO: renamed from: r0 */
        public InterfaceC5835i<InterfaceC7479s> f14916r0;

        /* JADX INFO: renamed from: r1 */
        public InterfaceC5835i<AbstractC5854c<InterfaceC8611b>> f14917r1;

        /* JADX INFO: renamed from: s */
        public InterfaceC5835i<InterfaceC6158d> f14918s;

        /* JADX INFO: renamed from: s0 */
        public InterfaceC5835i<FallbackMode> f14919s0;

        /* JADX INFO: renamed from: s1 */
        public InterfaceC5835i<AbstractC5854c<String[]>> f14920s1;

        /* JADX INFO: renamed from: t */
        public InterfaceC5835i<InterfaceC6158d> f14921t;

        /* JADX INFO: renamed from: t0 */
        public InterfaceC5835i<FallbackModeService> f14922t0;

        /* JADX INFO: renamed from: t1 */
        public InterfaceC5835i<AbstractC5854c<Uri>> f14923t1;

        /* JADX INFO: renamed from: u */
        public InterfaceC5835i<Set<InterfaceC6158d>> f14924u;

        /* JADX INFO: renamed from: u0 */
        public C4657k f14925u0;

        /* JADX INFO: renamed from: u1 */
        public InterfaceC5835i<AbstractC5854c<C5859h>> f14926u1;

        /* JADX INFO: renamed from: v */
        public InterfaceC5835i<Context> f14927v;

        /* JADX INFO: renamed from: v0 */
        public InterfaceC5835i<C3686i.a> f14928v0;

        /* JADX INFO: renamed from: v1 */
        public InterfaceC5835i<InterfaceC1477c> f14929v1;

        /* JADX INFO: renamed from: w */
        public InterfaceC5835i<C0967l0> f14930w;

        /* JADX INFO: renamed from: w0 */
        public InterfaceC5835i<C3681d> f14931w0;

        /* JADX INFO: renamed from: w1 */
        public InterfaceC5835i<InterfaceC7267k> f14932w1;

        /* JADX INFO: renamed from: x */
        public InterfaceC5835i<C6159e> f14933x;

        /* JADX INFO: renamed from: x0 */
        public C3684g f14934x0;

        /* JADX INFO: renamed from: x1 */
        public InterfaceC5835i<InterfaceC6474a> f14935x1;

        /* JADX INFO: renamed from: y */
        public InterfaceC5835i<TrackingEventsCache> f14936y;

        /* JADX INFO: renamed from: y0 */
        public InterfaceC5835i<C3683f.a> f14937y0;

        /* JADX INFO: renamed from: y1 */
        public InterfaceC5835i<C13969k0> f14938y1;

        /* JADX INFO: renamed from: z */
        public InterfaceC5835i<Set<Object>> f14939z;

        /* JADX INFO: renamed from: z0 */
        public InterfaceC5835i<InterfaceC4647a> f14940z0;

        /* JADX INFO: renamed from: z1 */
        public InterfaceC5835i<C3714q> f14941z1;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$f$a */
        public class a implements InterfaceC5835i<InterfaceC10665p.a> {
            public a() {
            }

            /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
            @Override // ht.InterfaceC6564a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC10665p.a get() {
                return new d(f.this.f14873d);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$f$b */
        public class b implements InterfaceC5835i<InterfaceC11448c.a> {
            public b() {
            }

            /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
            @Override // ht.InterfaceC6564a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC11448c.a get() {
                return new q(f.this.f14873d);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$f$c */
        public class c implements InterfaceC5835i<InterfaceC13287c0.a> {
            public c() {
            }

            /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
            @Override // ht.InterfaceC6564a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC13287c0.a get() {
                return new o(f.this.f14873d);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$f$d */
        public class d implements InterfaceC5835i<InterfaceC13878g.a> {
            public d() {
            }

            /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
            @Override // ht.InterfaceC6564a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC13878g.a get() {
                return new b(f.this.f14873d);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$f$e */
        public class e implements InterfaceC5835i<InterfaceC11034l1.a> {
            public e() {
            }

            /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
            @Override // ht.InterfaceC6564a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC11034l1.a get() {
                return new m(f.this.f14873d);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$f$f, reason: collision with other inner class name */
        public class C14133f implements InterfaceC5835i<InterfaceC5727g.a> {
            public C14133f() {
            }

            /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
            @Override // ht.InterfaceC6564a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC5727g.a get() {
                return new k(f.this.f14873d);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$f$g */
        public class g implements InterfaceC5835i<InterfaceC7245c.a> {
            public g() {
            }

            /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
            @Override // ht.InterfaceC6564a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC7245c.a get() {
                return new s(f.this.f14873d);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$f$h */
        public class h implements InterfaceC5835i<InterfaceC12872d.a> {
            public h() {
            }

            /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
            @Override // ht.InterfaceC6564a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC12872d.a get() {
                return new i(f.this.f14873d);
            }
        }

        public f(NetworkCoreModule networkCoreModule, C3707f c3707f, C8634q c8634q, C5691k c5691k, C8640w c8640w, C10698a c10698a, C13974n c13974n, C8615d c8615d, C8625i c8625i, C12507f c12507f, C10691e c10691e, C8221c c8221c, C8645b c8645b, C4649c c4649c, C7252c0 c7252c0, C8237c c8237c, C3678a c3678a, C10312f c10312f, C8614c0 c8614c0, C13242e c13242e, C6161g c6161g, TrackingEventsModule trackingEventsModule) {
            this.f14864a = c13974n;
            this.f14867b = c8237c;
            this.f14870c = c10698a;
            m18391m(networkCoreModule, c3707f, c8634q, c5691k, c8640w, c10698a, c13974n, c8615d, c8625i, c12507f, c10691e, c8221c, c8645b, c4649c, c7252c0, c8237c, c3678a, c10312f, c8614c0, c13242e, c6161g, trackingEventsModule);
            m18392n(networkCoreModule, c3707f, c8634q, c5691k, c8640w, c10698a, c13974n, c8615d, c8625i, c12507f, c10691e, c8221c, c8645b, c4649c, c7252c0, c8237c, c3678a, c10312f, c8614c0, c13242e, c6161g, trackingEventsModule);
            m18393o(networkCoreModule, c3707f, c8634q, c5691k, c8640w, c10698a, c13974n, c8615d, c8625i, c12507f, c10691e, c8221c, c8645b, c4649c, c7252c0, c8237c, c3678a, c10312f, c8614c0, c13242e, c6161g, trackingEventsModule);
            m18394p(networkCoreModule, c3707f, c8634q, c5691k, c8640w, c10698a, c13974n, c8615d, c8625i, c12507f, c10691e, c8221c, c8645b, c4649c, c7252c0, c8237c, c3678a, c10312f, c8614c0, c13242e, c6161g, trackingEventsModule);
            m18395q(networkCoreModule, c3707f, c8634q, c5691k, c8640w, c10698a, c13974n, c8615d, c8625i, c12507f, c10691e, c8221c, c8645b, c4649c, c7252c0, c8237c, c3678a, c10312f, c8614c0, c13242e, c6161g, trackingEventsModule);
            m18396r(networkCoreModule, c3707f, c8634q, c5691k, c8640w, c10698a, c13974n, c8615d, c8625i, c12507f, c10691e, c8221c, c8645b, c4649c, c7252c0, c8237c, c3678a, c10312f, c8614c0, c13242e, c6161g, trackingEventsModule);
        }

        /* JADX INFO: renamed from: A */
        public C5836j<InterfaceC0364a0<?>> m18378A(NetworkCoreModule networkCoreModule, C3707f c3707f, C8634q c8634q, C5691k c5691k, C8640w c8640w, C10698a c10698a, C13974n c13974n, C8615d c8615d, C8625i c8625i, C12507f c12507f, C10691e c10691e, C8221c c8221c, C8645b c8645b, C4649c c4649c, C7252c0 c7252c0, C8237c c8237c, C3678a c3678a, C10312f c10312f, C8614c0 c8614c0, C13242e c13242e, C6161g c6161g, TrackingEventsModule trackingEventsModule) {
            C5836j.b bVarM26195a = C5836j.m26195a(0, 8);
            bVarM26195a.m26197a(C6195o.m27288a());
            bVarM26195a.m26197a(this.f14838N);
            bVarM26195a.m26197a(C9865c2.m38754a());
            bVarM26195a.m26197a(this.f14852U);
            bVarM26195a.m26197a(C13882h.m50431a());
            bVarM26195a.m26197a(C12509h.m46840a());
            bVarM26195a.m26197a(C9840f.m38727a());
            bVarM26195a.m26197a(C11037m1.m41732a());
            return bVarM26195a.m26199c();
        }

        /* JADX INFO: renamed from: B */
        public C13969k0 m18379B() {
            return new C13969k0(C13978p.m50515a(this.f14864a), new C14035a.a(), this.f14910p0.get());
        }

        @Override // p610zo.InterfaceC13982s
        /* JADX INFO: renamed from: a */
        public C4688b<Object> mo18380a() {
            return C4689c.m22994a(m18397s(), Collections.EMPTY_MAP);
        }

        @Override // p610zo.InterfaceC13982s
        /* JADX INFO: renamed from: b */
        public TrackingEventsLogger mo18381b() {
            return this.f14834L.get();
        }

        @Override // p610zo.InterfaceC13982s
        /* JADX INFO: renamed from: c */
        public InterfaceC13248k mo18382c() {
            return this.f14886h0.get();
        }

        @Override // p610zo.InterfaceC13982s
        /* JADX INFO: renamed from: d */
        public C13964i mo18383d() {
            return this.f14913q0.get();
        }

        @Override // p610zo.InterfaceC13982s
        /* JADX INFO: renamed from: e */
        public InterfaceC7479s mo18384e() {
            return this.f14916r0.get();
        }

        @Override // p610zo.InterfaceC13982s
        /* JADX INFO: renamed from: f */
        public InterfaceC3738a.a mo18385f() {
            return new g(this.f14873d);
        }

        @Override // p610zo.InterfaceC13982s
        /* JADX INFO: renamed from: g */
        public DirectFileUploader mo18386g() {
            return this.f14849S0.get();
        }

        @Override // p610zo.InterfaceC13982s
        /* JADX INFO: renamed from: h */
        public InterfaceC7814a mo18387h() {
            return this.f14827H0.get();
        }

        @Override // p610zo.InterfaceC13982s
        /* JADX INFO: renamed from: i */
        public C3877g mo18388i() {
            return this.f14845Q0.get();
        }

        @Override // p610zo.InterfaceC13982s
        /* JADX INFO: renamed from: j */
        public C3714q mo18389j() {
            return new C3714q(m18379B(), C8240f.m33611c(this.f14867b));
        }

        /* JADX INFO: renamed from: l */
        public C3402b m18390l() {
            return new C3402b(C10699b.m40776c(this.f14870c));
        }

        /* JADX INFO: renamed from: m */
        public final void m18391m(NetworkCoreModule networkCoreModule, C3707f c3707f, C8634q c8634q, C5691k c5691k, C8640w c8640w, C10698a c10698a, C13974n c13974n, C8615d c8615d, C8625i c8625i, C12507f c12507f, C10691e c10691e, C8221c c8221c, C8645b c8645b, C4649c c4649c, C7252c0 c7252c0, C8237c c8237c, C3678a c3678a, C10312f c10312f, C8614c0 c8614c0, C13242e c13242e, C6161g c6161g, TrackingEventsModule trackingEventsModule) {
            InterfaceC5835i<InterfaceC9564b0<C7347n<InterfaceC5690j0>>> interfaceC5835iM26179c = C5829c.m26179c(C5695m.m25828a(c5691k));
            this.f14876e = interfaceC5835iM26179c;
            this.f14879f = C5718y.m25899a(interfaceC5835iM26179c);
            C10699b c10699bM40775a = C10699b.m40775a(c10698a);
            this.f14882g = c10699bM40775a;
            this.f14885h = C5703q.m25843a(c10699bM40775a);
            this.f14888i = C6169o.m27186a(c6161g);
            this.f14891j = C6171q.m27192a(c6161g);
            this.f14894k = C6170p.m27189a(c6161g);
            this.f14897l = C6165k.m27174a(c6161g);
            this.f14900m = C6172r.m27195a(c6161g);
            this.f14903n = C6164j.m27171a(c6161g);
            this.f14906o = C6168n.m27183a(c6161g);
            this.f14909p = C6162h.m27166b(c6161g);
            this.f14912q = C6163i.m27168a(c6161g);
            this.f14915r = C6173s.m27198a(c6161g);
            this.f14918s = C6167m.m27180a(c6161g);
            this.f14921t = C6166l.m27177a(c6161g);
            this.f14924u = m18400v(networkCoreModule, c3707f, c8634q, c5691k, c8640w, c10698a, c13974n, c8615d, c8625i, c12507f, c10691e, c8221c, c8645b, c4649c, c7252c0, c8237c, c3678a, c10312f, c8614c0, c13242e, c6161g, trackingEventsModule);
            this.f14927v = C13978p.m50516b(c13974n);
            C4653g c4653gM22887a = C4653g.m22887a(c4649c);
            this.f14930w = c4653gM22887a;
            this.f14933x = C5829c.m26179c(C6160f.m27150a(this.f14924u, this.f14927v, c4653gM22887a));
            this.f14936y = C5829c.m26179c(TrackingEventsCache_Factory.create());
            this.f14939z = m18404z(networkCoreModule, c3707f, c8634q, c5691k, c8640w, c10698a, c13974n, c8615d, c8625i, c12507f, c10691e, c8221c, c8645b, c4649c, c7252c0, c8237c, c3678a, c10312f, c8614c0, c13242e, c6161g, trackingEventsModule);
            this.f14807A = m18402x(networkCoreModule, c3707f, c8634q, c5691k, c8640w, c10698a, c13974n, c8615d, c8625i, c12507f, c10691e, c8221c, c8645b, c4649c, c7252c0, c8237c, c3678a, c10312f, c8614c0, c13242e, c6161g, trackingEventsModule);
            this.f14810B = TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory.create(trackingEventsModule);
            this.f14813C = m18403y(networkCoreModule, c3707f, c8634q, c5691k, c8640w, c10698a, c13974n, c8615d, c8625i, c12507f, c10691e, c8221c, c8645b, c4649c, c7252c0, c8237c, c3678a, c10312f, c8614c0, c13242e, c6161g, trackingEventsModule);
        }

        /* JADX INFO: renamed from: n */
        public final void m18392n(NetworkCoreModule networkCoreModule, C3707f c3707f, C8634q c8634q, C5691k c5691k, C8640w c8640w, C10698a c10698a, C13974n c13974n, C8615d c8615d, C8625i c8625i, C12507f c12507f, C10691e c10691e, C8221c c8221c, C8645b c8645b, C4649c c4649c, C7252c0 c7252c0, C8237c c8237c, C3678a c3678a, C10312f c10312f, C8614c0 c8614c0, C13242e c13242e, C6161g c6161g, TrackingEventsModule trackingEventsModule) {
            this.f14816D = C5829c.m26179c(NetworkCoreModule_MoshiFactory.create(networkCoreModule, this.f14939z, this.f14807A, this.f14813C));
            this.f14819E = C5829c.m26179c(TrackingMetadataProvider_Factory.create(this.f14927v));
            C8239e c8239eM33607a = C8239e.m33607a(c8237c);
            this.f14822F = c8239eM33607a;
            InterfaceC5835i<C8235a> interfaceC5835iM26179c = C5829c.m26179c(C8236b.m33598a(c8239eM33607a));
            this.f14824G = interfaceC5835iM26179c;
            this.f14826H = C8238d.m33605b(c8237c, interfaceC5835iM26179c);
            InterfaceC5835i<NetworkStateManager> interfaceC5835iM26179c2 = C5829c.m26179c(NetworkStateManager_Factory.create());
            this.f14828I = interfaceC5835iM26179c2;
            C14303RealTrackingEventsLogger_Factory c14303RealTrackingEventsLogger_FactoryCreate = C14303RealTrackingEventsLogger_Factory.create(this.f14927v, this.f14936y, this.f14816D, this.f14819E, this.f14882g, this.f14933x, this.f14826H, interfaceC5835iM26179c2);
            this.f14830J = c14303RealTrackingEventsLogger_FactoryCreate;
            InterfaceC5835i<RealTrackingEventsLogger.Factory> interfaceC5835iCreateFactoryProvider = RealTrackingEventsLogger_Factory_Impl.createFactoryProvider(c14303RealTrackingEventsLogger_FactoryCreate);
            this.f14832K = interfaceC5835iCreateFactoryProvider;
            InterfaceC5835i<TrackingEventsLogger> interfaceC5835iM26179c3 = C5829c.m26179c(TrackingEventsModule_TrackingEventsLoggerFactory.create(trackingEventsModule, interfaceC5835iCreateFactoryProvider));
            this.f14834L = interfaceC5835iM26179c3;
            C7642a0 c7642a0M31578a = C7642a0.m31578a(this.f14879f, this.f14885h, this.f14933x, interfaceC5835iM26179c3);
            this.f14836M = c7642a0M31578a;
            this.f14838N = C6888m.m29325a(c7642a0M31578a);
            this.f14840O = C5708s0.m25877a(this.f14933x);
            InterfaceC5835i<InterfaceC9564b0<C7640c>> interfaceC5835iM26179c4 = C5829c.m26179c(C5697n.m25831a(c5691k));
            this.f14842P = interfaceC5835iM26179c4;
            this.f14844Q = C5700o0.m25839a(this.f14840O, interfaceC5835iM26179c4);
            InterfaceC5835i<C6447i0> interfaceC5835iM26179c5 = C5829c.m26179c(C6449j0.m28106a());
            this.f14846R = interfaceC5835iM26179c5;
            this.f14848S = C13363n.m49035a(this.f14885h, this.f14844Q, interfaceC5835iM26179c5, this.f14834L);
            C14023q0 c14023q0M50694a = C14023q0.m50694a(this.f14885h, this.f14844Q, this.f14834L, this.f14933x);
            this.f14850T = c14023q0M50694a;
            this.f14852U = C13280b0.m49032a(this.f14848S, c14023q0M50694a);
            C5836j<InterfaceC0364a0<?>> c5836jM18378A = m18378A(networkCoreModule, c3707f, c8634q, c5691k, c8640w, c10698a, c13974n, c8615d, c8625i, c12507f, c10691e, c8221c, c8645b, c4649c, c7252c0, c8237c, c3678a, c10312f, c8614c0, c13242e, c6161g, trackingEventsModule);
            this.f14854V = c5836jM18378A;
            this.f14856W = C5829c.m26179c(C6201u.m27306a(c5836jM18378A));
            this.f14858X = C6198r.m27297a(c3707f);
            this.f14860Y = NetworkCoreModule_ResponseInterceptorFactory.create(networkCoreModule, this.f14828I);
            this.f14862Z = NetworkCoreModule_InterceptorFactory.create(networkCoreModule, this.f14816D);
            InterfaceC5835i<C12504c> interfaceC5835iM26179c6 = C5829c.m26179c(C12505d.m46829a());
            this.f14865a0 = interfaceC5835iM26179c6;
            this.f14868b0 = C12508g.m46837a(c12507f, interfaceC5835iM26179c6);
        }

        /* JADX INFO: renamed from: o */
        public final void m18393o(NetworkCoreModule networkCoreModule, C3707f c3707f, C8634q c8634q, C5691k c5691k, C8640w c8640w, C10698a c10698a, C13974n c13974n, C8615d c8615d, C8625i c8625i, C12507f c12507f, C10691e c10691e, C8221c c8221c, C8645b c8645b, C4649c c4649c, C7252c0 c7252c0, C8237c c8237c, C3678a c3678a, C10312f c10312f, C8614c0 c8614c0, C13242e c13242e, C6161g c6161g, TrackingEventsModule trackingEventsModule) {
            this.f14871c0 = m18401w(networkCoreModule, c3707f, c8634q, c5691k, c8640w, c10698a, c13974n, c8615d, c8625i, c12507f, c10691e, c8221c, c8645b, c4649c, c7252c0, c8237c, c3678a, c10312f, c8614c0, c13242e, c6161g, trackingEventsModule);
            this.f14874d0 = NetworkCoreModule_KeyInflectionFactory.create(networkCoreModule);
            this.f14877e0 = NetworkCoreModule_UseServerStylesFactory.create(networkCoreModule);
            this.f14880f0 = m18399u(networkCoreModule, c3707f, c8634q, c5691k, c8640w, c10698a, c13974n, c8615d, c8625i, c12507f, c10691e, c8221c, c8645b, c4649c, c7252c0, c8237c, c3678a, c10312f, c8614c0, c13242e, c6161g, trackingEventsModule);
            C13235a0 c13235a0M48950a = C13235a0.m48950a(this.f14927v);
            this.f14883g0 = c13235a0M48950a;
            this.f14886h0 = C5829c.m26179c(C13243f.m48986b(c13242e, c13235a0M48950a));
            C13256s c13256sM49011a = C13256s.m49011a(this.f14927v);
            this.f14889i0 = c13256sM49011a;
            this.f14892j0 = C5829c.m26179c(C13245h.m48991a(c13242e, c13256sM49011a));
            C9541d c9541dM37663a = C9541d.m37663a(this.f14927v);
            this.f14895k0 = c9541dM37663a;
            C9543f c9543fM37668a = C9543f.m37668a(c9541dM37663a);
            this.f14898l0 = c9543fM37668a;
            InterfaceC5835i<C9542e.a> interfaceC5835iM37671a = C9544g.m37671a(c9543fM37668a);
            this.f14901m0 = interfaceC5835iM37671a;
            NetworkCoreModule_OkhttpClientFactory networkCoreModule_OkhttpClientFactoryCreate = NetworkCoreModule_OkhttpClientFactory.create(networkCoreModule, this.f14871c0, this.f14880f0, this.f14927v, this.f14886h0, this.f14892j0, interfaceC5835iM37671a, this.f14828I);
            this.f14904n0 = networkCoreModule_OkhttpClientFactoryCreate;
            InterfaceC5835i<C7397y> interfaceC5835iM26179c = C5829c.m26179c(NetworkCoreModule_RetrofitFactory.create(networkCoreModule, this.f14858X, networkCoreModule_OkhttpClientFactoryCreate, this.f14816D));
            this.f14907o0 = interfaceC5835iM26179c;
            InterfaceC5835i<InterfaceC6203w> interfaceC5835iM26179c2 = C5829c.m26179c(C6190j.m27273a(c3707f, interfaceC5835iM26179c));
            this.f14910p0 = interfaceC5835iM26179c2;
            this.f14913q0 = C5829c.m26179c(C13966j.m50479a(interfaceC5835iM26179c2, this.f14816D, this.f14895k0, this.f14826H));
            this.f14916r0 = C5829c.m26179c(C13980q.m50521a(c13974n, this.f14927v));
            this.f14919s0 = C4651e.m22881a(c4649c);
            this.f14922t0 = C5829c.m26179c(C6187g.m27264a(c3707f, this.f14907o0));
            C4657k c4657kM22900a = C4657k.m22900a(this.f14930w);
            this.f14925u0 = c4657kM22900a;
            InterfaceC5835i<C3686i.a> interfaceC5835iM18514b = C3687j.m18514b(c4657kM22900a);
            this.f14928v0 = interfaceC5835iM18514b;
            this.f14931w0 = C3682e.m18497a(this.f14922t0, this.f14816D, interfaceC5835iM18514b);
            C3684g c3684gM18501a = C3684g.m18501a(this.f14816D, this.f14927v, this.f14928v0);
            this.f14934x0 = c3684gM18501a;
            InterfaceC5835i<C3683f.a> interfaceC5835iM18504b = C3685h.m18504b(c3684gM18501a);
            this.f14937y0 = interfaceC5835iM18504b;
            this.f14940z0 = C3679b.m18482b(c3678a, this.f14931w0, interfaceC5835iM18504b);
            this.f14808A0 = C4650d.m22878a(c4649c);
        }

        /* JADX INFO: renamed from: p */
        public final void m18394p(NetworkCoreModule networkCoreModule, C3707f c3707f, C8634q c8634q, C5691k c5691k, C8640w c8640w, C10698a c10698a, C13974n c13974n, C8615d c8615d, C8625i c8625i, C12507f c12507f, C10691e c10691e, C8221c c8221c, C8645b c8645b, C4649c c4649c, C7252c0 c7252c0, C8237c c8237c, C3678a c3678a, C10312f c10312f, C8614c0 c8614c0, C13242e c13242e, C6161g c6161g, TrackingEventsModule trackingEventsModule) {
            InterfaceC5835i<C4655i> interfaceC5835iM26179c = C5829c.m26179c(C4656j.m22897a(this.f14919s0, this.f14940z0, this.f14808A0, this.f14816D));
            this.f14811B0 = interfaceC5835iM26179c;
            this.f14814C0 = C5829c.m26179c(C4652f.m22884a(c4649c, interfaceC5835iM26179c));
            this.f14817D0 = C5829c.m26179c(C7258f0.m30264a(c7252c0));
            C10313g c10313gM39612a = C10313g.m39612a(c10312f);
            this.f14820E0 = c10313gM39612a;
            this.f14823F0 = C5829c.m26179c(C10310d.m39608a(c10313gM39612a, this.f14826H));
            C13976o c13976oM50510b = C13976o.m50510b(c13974n);
            this.f14825G0 = c13976oM50510b;
            this.f14827H0 = C5829c.m26179c(C7818e.m32429a(this.f14904n0, c13976oM50510b, this.f14826H));
            this.f14829I0 = new a();
            this.f14831J0 = new b();
            this.f14833K0 = new c();
            this.f14835L0 = new d();
            this.f14837M0 = new e();
            this.f14839N0 = new C14133f();
            this.f14841O0 = new g();
            this.f14843P0 = new h();
            this.f14845Q0 = C5829c.m26179c(C11737f.m43951a());
            InterfaceC5835i<UploadService> interfaceC5835iM26179c2 = C5829c.m26179c(C6200t.m27303a(c3707f, this.f14907o0));
            this.f14847R0 = interfaceC5835iM26179c2;
            this.f14849S0 = C5829c.m26179c(C1486a.m7610a(this.f14930w, interfaceC5835iM26179c2, this.f14826H));
            this.f14851T0 = C5829c.m26179c(C6196p.m27291a(c3707f, this.f14907o0));
            C13254q c13254qM49008a = C13254q.m49008a(this.f14927v);
            this.f14853U0 = c13254qM49008a;
            this.f14855V0 = C5829c.m26179c(C13244g.m48988a(c13242e, c13254qM49008a));
            InterfaceC5835i<C5177d> interfaceC5835iM26179c3 = C5829c.m26179c(C5178e.m24074a());
            this.f14857W0 = interfaceC5835iM26179c3;
            this.f14859X0 = C5829c.m26179c(C5176c.m24071a(this.f14927v, this.f14901m0, interfaceC5835iM26179c3, this.f14822F));
            C6194n c6194nM27285a = C6194n.m27285a(c3707f);
            this.f14861Y0 = c6194nM27285a;
            this.f14863Z0 = C5829c.m26179c(C6184d.m27247a(this.f14927v, this.f14910p0, this.f14851T0, this.f14811B0, this.f14865a0, this.f14855V0, this.f14859X0, c6194nM27285a));
        }

        /* JADX INFO: renamed from: q */
        public final void m18395q(NetworkCoreModule networkCoreModule, C3707f c3707f, C8634q c8634q, C5691k c5691k, C8640w c8640w, C10698a c10698a, C13974n c13974n, C8615d c8615d, C8625i c8625i, C12507f c12507f, C10691e c10691e, C8221c c8221c, C8645b c8645b, C4649c c4649c, C7252c0 c7252c0, C8237c c8237c, C3678a c3678a, C10312f c10312f, C8614c0 c8614c0, C13242e c13242e, C6161g c6161g, TrackingEventsModule trackingEventsModule) {
            this.f14866a1 = C5829c.m26179c(C11445a.m42863a(this.f14930w));
            this.f14869b1 = C5829c.m26179c(C13977o0.m50512a(this.f14927v, this.f14826H));
            this.f14872c1 = C5829c.m26179c(C6189i.m27270a(c3707f, this.f14907o0));
            this.f14875d1 = C8646c.m34723a(c8645b);
            this.f14878e1 = C5829c.m26179c(C7256e0.m30255a(c7252c0, C11070d.m41746a()));
            InterfaceC5835i<C8170b> interfaceC5835iM26179c = C5829c.m26179c(C8171c.m33450a(this.f14927v));
            this.f14881f1 = interfaceC5835iM26179c;
            this.f14884g1 = C5693l.m25825b(c5691k, interfaceC5835iM26179c);
            this.f14887h1 = C5829c.m26179c(C8637t.m34708a(c8634q));
            this.f14890i1 = C5829c.m26179c(C11931b.m44532a(this.f14820E0, this.f14933x, this.f14826H));
            this.f14893j1 = C5829c.m26179c(C8643z.m34717a(c8640w));
            this.f14896k1 = C5829c.m26179c(C8620f0.m34673a(c8614c0));
            this.f14899l1 = C5829c.m26179c(C6202v.m27309a(c3707f, this.f14907o0));
            this.f14902m1 = C5829c.m26179c(C6197q.m27294a(c3707f, this.f14907o0));
            this.f14905n1 = C8240f.m33610a(c8237c);
            this.f14908o1 = C5829c.m26179c(C10694h.m40767a(c10691e));
            this.f14911p1 = C5829c.m26179c(C8224f.m33565a(c8221c));
            this.f14914q1 = C5829c.m26179c(C6199s.m27300a(c3707f, this.f14907o0));
            this.f14917r1 = C5829c.m26179c(C8621g.m34676a(c8615d));
            this.f14920s1 = C5829c.m26179c(C8631n.m34695a(c8625i));
            this.f14923t1 = C5829c.m26179c(C8633p.m34701a(c8625i));
            this.f14926u1 = C5829c.m26179c(C8632o.m34698a(c8625i));
            this.f14929v1 = C5829c.m26179c(C6186f.m27261a(c3707f, this.f14907o0));
            this.f14932w1 = C5829c.m26179c(C7254d0.m30226a(c7252c0, C7287y.m30322a()));
            this.f14935x1 = C5829c.m26179c(C6188h.m27267a(c3707f, this.f14907o0));
            this.f14938y1 = C13971l0.m50495a(this.f14927v, C14036b.m50713a(), this.f14910p0);
        }

        /* JADX INFO: renamed from: r */
        public final void m18396r(NetworkCoreModule networkCoreModule, C3707f c3707f, C8634q c8634q, C5691k c5691k, C8640w c8640w, C10698a c10698a, C13974n c13974n, C8615d c8615d, C8625i c8625i, C12507f c12507f, C10691e c10691e, C8221c c8221c, C8645b c8645b, C4649c c4649c, C7252c0 c7252c0, C8237c c8237c, C3678a c3678a, C10312f c10312f, C8614c0 c8614c0, C13242e c13242e, C6161g c6161g, TrackingEventsModule trackingEventsModule) {
            this.f14941z1 = C13967j0.m50482a(this.f14938y1, this.f14905n1);
            C13239c0 c13239c0M48964a = C13239c0.m48964a(this.f14927v);
            this.f14809A1 = c13239c0M48964a;
            InterfaceC5835i<InterfaceC13250m> interfaceC5835iM26179c = C5829c.m26179c(C13247j.m48997a(c13242e, c13239c0M48964a));
            this.f14812B1 = interfaceC5835iM26179c;
            C13258u c13258uM49015a = C13258u.m49015a(this.f14927v, interfaceC5835iM26179c);
            this.f14815C1 = c13258uM49015a;
            this.f14818D1 = C5829c.m26179c(C13246i.m48994a(c13242e, c13258uM49015a));
            this.f14821E1 = C13981r.m50524a(c13974n);
        }

        /* JADX INFO: renamed from: s */
        public Map<Class<?>, InterfaceC6564a<InterfaceC4687a.a<?>>> m18397s() {
            return m18398t();
        }

        /* JADX INFO: renamed from: t */
        public Map m18398t() {
            C5832f c5832fM26183b = C5832f.m26183b(8);
            c5832fM26183b.m26185c(GovernmentIdStepFragment.class, this.f14829I0);
            c5832fM26183b.m26185c(UiStepFragment.class, this.f14831J0);
            c5832fM26183b.m26185c(SelfieStepFragment.class, this.f14833K0);
            c5832fM26183b.m26185c(DocumentStepFragment.class, this.f14835L0);
            c5832fM26183b.m26185c(PermissionRequestFragment.class, this.f14837M0);
            c5832fM26183b.m26185c(C5726f.class, this.f14839N0);
            c5832fM26183b.m26185c(C7244b.class, this.f14841O0);
            c5832fM26183b.m26185c(IntegrationStepFragment.class, this.f14843P0);
            return c5832fM26183b.m26184a();
        }

        /* JADX INFO: renamed from: u */
        public C5833g<String, String> m18399u(NetworkCoreModule networkCoreModule, C3707f c3707f, C8634q c8634q, C5691k c5691k, C8640w c8640w, C10698a c10698a, C13974n c13974n, C8615d c8615d, C8625i c8625i, C12507f c12507f, C10691e c10691e, C8221c c8221c, C8645b c8645b, C4649c c4649c, C7252c0 c7252c0, C8237c c8237c, C3678a c3678a, C10312f c10312f, C8614c0 c8614c0, C13242e c13242e, C6161g c6161g, TrackingEventsModule trackingEventsModule) {
            C5833g.b bVarM26186b = C5833g.m26186b(3);
            bVarM26186b.m26189c("User-Agent", NetworkInquiryModule_UserAgentFactory.create());
            bVarM26186b.m26189c("Key-Inflection", this.f14874d0);
            bVarM26186b.m26189c("Persona-Use-Mobile-Server-Styles", this.f14877e0);
            return bVarM26186b.m26188b();
        }

        /* JADX INFO: renamed from: v */
        public C5836j<InterfaceC6158d> m18400v(NetworkCoreModule networkCoreModule, C3707f c3707f, C8634q c8634q, C5691k c5691k, C8640w c8640w, C10698a c10698a, C13974n c13974n, C8615d c8615d, C8625i c8625i, C12507f c12507f, C10691e c10691e, C8221c c8221c, C8645b c8645b, C4649c c4649c, C7252c0 c7252c0, C8237c c8237c, C3678a c3678a, C10312f c10312f, C8614c0 c8614c0, C13242e c13242e, C6161g c6161g, TrackingEventsModule trackingEventsModule) {
            C5836j.b bVarM26195a = C5836j.m26195a(12, 0);
            bVarM26195a.m26198b(this.f14888i);
            bVarM26195a.m26198b(this.f14891j);
            bVarM26195a.m26198b(this.f14894k);
            bVarM26195a.m26198b(this.f14897l);
            bVarM26195a.m26198b(this.f14900m);
            bVarM26195a.m26198b(this.f14903n);
            bVarM26195a.m26198b(this.f14906o);
            bVarM26195a.m26198b(this.f14909p);
            bVarM26195a.m26198b(this.f14912q);
            bVarM26195a.m26198b(this.f14915r);
            bVarM26195a.m26198b(this.f14918s);
            bVarM26195a.m26198b(this.f14921t);
            return bVarM26195a.m26199c();
        }

        /* JADX INFO: renamed from: w */
        public C5836j<Interceptor> m18401w(NetworkCoreModule networkCoreModule, C3707f c3707f, C8634q c8634q, C5691k c5691k, C8640w c8640w, C10698a c10698a, C13974n c13974n, C8615d c8615d, C8625i c8625i, C12507f c12507f, C10691e c10691e, C8221c c8221c, C8645b c8645b, C4649c c4649c, C7252c0 c7252c0, C8237c c8237c, C3678a c3678a, C10312f c10312f, C8614c0 c8614c0, C13242e c13242e, C6161g c6161g, TrackingEventsModule trackingEventsModule) {
            C5836j.b bVarM26195a = C5836j.m26195a(3, 0);
            bVarM26195a.m26198b(this.f14860Y);
            bVarM26195a.m26198b(this.f14862Z);
            bVarM26195a.m26198b(this.f14868b0);
            return bVarM26195a.m26199c();
        }

        /* JADX INFO: renamed from: x */
        public C5836j<JsonAdapterBinding<?>> m18402x(NetworkCoreModule networkCoreModule, C3707f c3707f, C8634q c8634q, C5691k c5691k, C8640w c8640w, C10698a c10698a, C13974n c13974n, C8615d c8615d, C8625i c8625i, C12507f c12507f, C10691e c10691e, C8221c c8221c, C8645b c8645b, C4649c c4649c, C7252c0 c7252c0, C8237c c8237c, C3678a c3678a, C10312f c10312f, C8614c0 c8614c0, C13242e c13242e, C6161g c6161g, TrackingEventsModule trackingEventsModule) {
            C5836j.b bVarM26195a = C5836j.m26195a(0, 1);
            bVarM26195a.m26197a(C6191k.m27276a());
            return bVarM26195a.m26199c();
        }

        /* JADX INFO: renamed from: y */
        public C5836j<AbstractC11873h.e> m18403y(NetworkCoreModule networkCoreModule, C3707f c3707f, C8634q c8634q, C5691k c5691k, C8640w c8640w, C10698a c10698a, C13974n c13974n, C8615d c8615d, C8625i c8625i, C12507f c12507f, C10691e c10691e, C8221c c8221c, C8645b c8645b, C4649c c4649c, C7252c0 c7252c0, C8237c c8237c, C3678a c3678a, C10312f c10312f, C8614c0 c8614c0, C13242e c13242e, C6161g c6161g, TrackingEventsModule trackingEventsModule) {
            C5836j.b bVarM26195a = C5836j.m26195a(0, 5);
            bVarM26195a.m26197a(NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory.create());
            bVarM26195a.m26197a(NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory.create());
            bVarM26195a.m26197a(C6193m.m27282a());
            bVarM26195a.m26197a(C6884l.m29322a());
            bVarM26195a.m26197a(this.f14810B);
            return bVarM26195a.m26199c();
        }

        /* JADX INFO: renamed from: z */
        public C5836j<Object> m18404z(NetworkCoreModule networkCoreModule, C3707f c3707f, C8634q c8634q, C5691k c5691k, C8640w c8640w, C10698a c10698a, C13974n c13974n, C8615d c8615d, C8625i c8625i, C12507f c12507f, C10691e c10691e, C8221c c8221c, C8645b c8645b, C4649c c4649c, C7252c0 c7252c0, C8237c c8237c, C3678a c3678a, C10312f c10312f, C8614c0 c8614c0, C13242e c13242e, C6161g c6161g, TrackingEventsModule trackingEventsModule) {
            C5836j.b bVarM26195a = C5836j.m26195a(0, 2);
            bVarM26195a.m26197a(C6192l.m27279a());
            bVarM26195a.m26197a(C9857b2.m38750a());
            return bVarM26195a.m26199c();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$g */
    public static final class g implements InterfaceC3738a.a {

        /* JADX INFO: renamed from: a */
        public final f f14950a;

        @Override // com.withpersona.sdk2.inquiry.internal.workflows.InterfaceC3738a.a
        /* JADX INFO: renamed from: a */
        public InterfaceC3738a mo18413a() {
            return new h(this.f14950a);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public g(f fVar) {
            this.f14950a = fVar;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$h */
    public static final class h implements InterfaceC3738a {

        /* JADX INFO: renamed from: A */
        public InterfaceC5835i<C6434c.a> f14951A;

        /* JADX INFO: renamed from: A0 */
        public C6476c f14952A0;

        /* JADX INFO: renamed from: B */
        public InterfaceC5835i<C11903j> f14953B;

        /* JADX INFO: renamed from: B0 */
        public InterfaceC5835i<C6475b.a> f14954B0;

        /* JADX INFO: renamed from: C */
        public InterfaceC5835i<C11915v> f14955C;

        /* JADX INFO: renamed from: C0 */
        public InterfaceC5835i<C13958f> f14956C0;

        /* JADX INFO: renamed from: D */
        public InterfaceC5835i<C3855d.a> f14957D;

        /* JADX INFO: renamed from: D0 */
        public C6494f0 f14958D0;

        /* JADX INFO: renamed from: E */
        public C11026j f14959E;

        /* JADX INFO: renamed from: E0 */
        public InterfaceC5835i<C6491e0.b> f14960E0;

        /* JADX INFO: renamed from: F */
        public InterfaceC5835i<C3852a.a> f14961F;

        /* JADX INFO: renamed from: F0 */
        public C7808c f14962F0;

        /* JADX INFO: renamed from: G */
        public InterfaceC5835i<DeviceFeatureRequestWorkflow> f14963G;

        /* JADX INFO: renamed from: G0 */
        public InterfaceC5835i<C3740c.a> f14964G0;

        /* JADX INFO: renamed from: H */
        public InterfaceC5835i<PermissionRequestWorkflow> f14965H;

        /* JADX INFO: renamed from: H0 */
        public C7809d f14966H0;

        /* JADX INFO: renamed from: I */
        public C3546g f14967I;

        /* JADX INFO: renamed from: I0 */
        public InterfaceC5835i<C3742e.a> f14968I0;

        /* JADX INFO: renamed from: J */
        public InterfaceC5835i<GovernmentIdAnalyzeWorker.a> f14969J;

        /* JADX INFO: renamed from: K */
        public C9833b f14970K;

        /* JADX INFO: renamed from: L */
        public InterfaceC5835i<GovernmentIdHintWorker.b> f14971L;

        /* JADX INFO: renamed from: M */
        public InterfaceC5835i<C11742b.a> f14972M;

        /* JADX INFO: renamed from: N */
        public InterfaceC5835i<C8211t0> f14973N;

        /* JADX INFO: renamed from: O */
        public InterfaceC5835i<AutoClassifyWorker.C3563b> f14974O;

        /* JADX INFO: renamed from: P */
        public InterfaceC5835i<C7230n> f14975P;

        /* JADX INFO: renamed from: Q */
        public InterfaceC5835i<GovernmentIdWorkflow> f14976Q;

        /* JADX INFO: renamed from: R */
        public C4198c f14977R;

        /* JADX INFO: renamed from: S */
        public InterfaceC5835i<C4197b.a> f14978S;

        /* JADX INFO: renamed from: T */
        public C13412v f14979T;

        /* JADX INFO: renamed from: U */
        public InterfaceC5835i<C3953e.b> f14980U;

        /* JADX INFO: renamed from: V */
        public InterfaceC5835i<C6544j> f14981V;

        /* JADX INFO: renamed from: W */
        public C4659b f14982W;

        /* JADX INFO: renamed from: X */
        public InterfaceC5835i<C4658a.b> f14983X;

        /* JADX INFO: renamed from: Y */
        public InterfaceC5835i<C3955g> f14984Y;

        /* JADX INFO: renamed from: Z */
        public InterfaceC5835i<SelfieWorkflow> f14985Z;

        /* JADX INFO: renamed from: a */
        public final f f14986a;

        /* JADX INFO: renamed from: a0 */
        public C10697k f14987a0;

        /* JADX INFO: renamed from: b */
        public final h f14988b = this;

        /* JADX INFO: renamed from: b0 */
        public InterfaceC5835i<C3828b.a> f14989b0;

        /* JADX INFO: renamed from: c */
        public C13954d f14990c;

        /* JADX INFO: renamed from: c0 */
        public C8233o f14991c0;

        /* JADX INFO: renamed from: d */
        public InterfaceC5835i<C3674c.a> f14992d;

        /* JADX INFO: renamed from: d0 */
        public InterfaceC5835i<C8232n.a> f14993d0;

        /* JADX INFO: renamed from: e */
        public C13952c f14994e;

        /* JADX INFO: renamed from: e0 */
        public C9936l1 f14995e0;

        /* JADX INFO: renamed from: f */
        public InterfaceC5835i<C3672a.a> f14996f;

        /* JADX INFO: renamed from: f0 */
        public InterfaceC5835i<C4151d.a> f14997f0;

        /* JADX INFO: renamed from: g */
        public C13953c0 f14998g;

        /* JADX INFO: renamed from: g0 */
        public C9933k6 f14999g0;

        /* JADX INFO: renamed from: h */
        public InterfaceC5835i<C3692k.b> f15000h;

        /* JADX INFO: renamed from: h0 */
        public InterfaceC5835i<C4158k.a> f15001h0;

        /* JADX INFO: renamed from: i */
        public C13975n0 f15002i;

        /* JADX INFO: renamed from: i0 */
        public InterfaceC5835i<C4178b.a> f15003i0;

        /* JADX INFO: renamed from: j */
        public InterfaceC5835i<C3715r.a> f15004j;

        /* JADX INFO: renamed from: j0 */
        public InterfaceC5835i<C10701a.a> f15005j0;

        /* JADX INFO: renamed from: k */
        public C3717t f15006k;

        /* JADX INFO: renamed from: k0 */
        public InterfaceC5835i<C4155h.a> f15007k0;

        /* JADX INFO: renamed from: l */
        public InterfaceC5835i<TransitionWorker.InterfaceC3662a> f15008l;

        /* JADX INFO: renamed from: l0 */
        public InterfaceC5835i<C4148a> f15009l0;

        /* JADX INFO: renamed from: m */
        public C13979p0 f15010m;

        /* JADX INFO: renamed from: m0 */
        public InterfaceC5835i<UiWorkflow> f15011m0;

        /* JADX INFO: renamed from: n */
        public InterfaceC5835i<C3721v.a> f15012n;

        /* JADX INFO: renamed from: n0 */
        public InterfaceC5835i<C3438a> f15013n0;

        /* JADX INFO: renamed from: o */
        public C13968k f15014o;

        /* JADX INFO: renamed from: o0 */
        public InterfaceC5835i<C3446i.b> f15015o0;

        /* JADX INFO: renamed from: p */
        public InterfaceC5835i<C3677f.a> f15016p;

        /* JADX INFO: renamed from: p0 */
        public InterfaceC5835i<C3451a.a> f15017p0;

        /* JADX INFO: renamed from: q */
        public C13963h0 f15018q;

        /* JADX INFO: renamed from: q0 */
        public InterfaceC5835i<C3455e.a> f15019q0;

        /* JADX INFO: renamed from: r */
        public InterfaceC5835i<C3694m.a> f15020r;

        /* JADX INFO: renamed from: r0 */
        public InterfaceC5835i<C3453c.a> f15021r0;

        /* JADX INFO: renamed from: s */
        public C10304d f15022s;

        /* JADX INFO: renamed from: s0 */
        public InterfaceC5835i<C1475a.a> f15023s0;

        /* JADX INFO: renamed from: t */
        public InterfaceC5835i<C10303c.a> f15024t;

        /* JADX INFO: renamed from: t0 */
        public InterfaceC5835i<C3457g.a> f15025t0;

        /* JADX INFO: renamed from: u */
        public InterfaceC5835i<C3544e> f15026u;

        /* JADX INFO: renamed from: u0 */
        public InterfaceC5835i<DocumentWorkflow> f15027u0;

        /* JADX INFO: renamed from: v */
        public C5709t f15028v;

        /* JADX INFO: renamed from: v0 */
        public C12871c f15029v0;

        /* JADX INFO: renamed from: w */
        public InterfaceC5835i<C3405e.a> f15030w;

        /* JADX INFO: renamed from: w0 */
        public InterfaceC5835i<C3612a.a> f15031w0;

        /* JADX INFO: renamed from: x */
        public C6435c0 f15032x;

        /* JADX INFO: renamed from: x0 */
        public InterfaceC5835i<IntegrationWorkflow> f15033x0;

        /* JADX INFO: renamed from: y */
        public InterfaceC5835i<C6433b0.a> f15034y;

        /* JADX INFO: renamed from: y0 */
        public C13965i0 f15035y0;

        /* JADX INFO: renamed from: z */
        public C6438e f15036z;

        /* JADX INFO: renamed from: z0 */
        public InterfaceC5835i<C3712o.a> f15037z0;

        public h(f fVar) {
            this.f14986a = fVar;
            m18415b();
            m18416c();
            m18417d();
            m18418e();
        }

        @Override // com.withpersona.sdk2.inquiry.internal.workflows.InterfaceC3738a
        /* JADX INFO: renamed from: a */
        public void mo18414a(InquiryWorkflowFragment inquiryWorkflowFragment) {
            m18419f(inquiryWorkflowFragment);
        }

        /* JADX INFO: renamed from: b */
        public final void m18415b() {
            C13954d c13954dM50453a = C13954d.m50453a(this.f14986a.f14863Z0);
            this.f14990c = c13954dM50453a;
            this.f14992d = C3675d.m18347b(c13954dM50453a);
            C13952c c13952cM50447a = C13952c.m50447a(this.f14986a.f14863Z0);
            this.f14994e = c13952cM50447a;
            this.f14996f = C3673b.m18342b(c13952cM50447a);
            f fVar = this.f14986a;
            C13953c0 c13953c0M50450a = C13953c0.m50450a(fVar.f14910p0, fVar.f14855V0, fVar.f14865a0, fVar.f14811B0, fVar.f14827H0, fVar.f14866a1, fVar.f14863Z0);
            this.f14998g = c13953c0M50450a;
            this.f15000h = C3693l.m18598b(c13953c0M50450a);
            C13975n0 c13975n0M50506a = C13975n0.m50506a(this.f14986a.f14863Z0);
            this.f15002i = c13975n0M50506a;
            this.f15004j = C3716s.m18807b(c13975n0M50506a);
            f fVar2 = this.f14986a;
            C3717t c3717tM18808a = C3717t.m18808a(fVar2.f14910p0, fVar2.f14814C0, fVar2.f14869b1, fVar2.f14933x, fVar2.f14927v);
            this.f15006k = c3717tM18808a;
            this.f15008l = C3718u.m18811b(c3717tM18808a);
            C13979p0 c13979p0M50518a = C13979p0.m50518a(this.f14986a.f14863Z0);
            this.f15010m = c13979p0M50518a;
            this.f15012n = C3722w.m18828b(c13979p0M50518a);
            C13968k c13968kM50485a = C13968k.m50485a(this.f14986a.f14863Z0);
            this.f15014o = c13968kM50485a;
            this.f15016p = C3688g.m18515a(c13968kM50485a);
            C13963h0 c13963h0M50464a = C13963h0.m50464a(this.f14986a.f14863Z0);
            this.f15018q = c13963h0M50464a;
            this.f15020r = C3695n.m18602a(c13963h0M50464a);
            f fVar3 = this.f14986a;
            C10304d c10304dM39599a = C10304d.m39599a(fVar3.f14927v, fVar3.f14872c1, fVar3.f14875d1, fVar3.f14814C0, fVar3.f14878e1, fVar3.f14884g1, fVar3.f14834L);
            this.f15022s = c10304dM39599a;
            this.f15024t = C10305e.m39602b(c10304dM39599a);
            f fVar4 = this.f14986a;
            this.f15026u = C6856e.m29305a(fVar4.f14887h1, fVar4.f14927v, fVar4.f14882g);
            f fVar5 = this.f14986a;
            C5709t c5709tM25880a = C5709t.m25880a(fVar5.f14927v, fVar5.f14884g1, fVar5.f14882g);
            this.f15028v = c5709tM25880a;
            this.f15030w = C3406f.m16231b(c5709tM25880a);
            f fVar6 = this.f14986a;
            C6435c0 c6435c0M28068a = C6435c0.m28068a(fVar6.f14927v, fVar6.f14884g1, fVar6.f14882g, fVar6.f14846R, fVar6.f14824G, fVar6.f14834L, fVar6.f14823F0, fVar6.f14933x);
            this.f15032x = c6435c0M28068a;
            InterfaceC5835i<C6433b0.a> interfaceC5835iM28071b = C6437d0.m28071b(c6435c0M28068a);
            this.f15034y = interfaceC5835iM28071b;
            f fVar7 = this.f14986a;
            C6438e c6438eM28072a = C6438e.m28072a(interfaceC5835iM28071b, fVar7.f14846R, fVar7.f14826H, fVar7.f14834L);
            this.f15036z = c6438eM28072a;
            this.f14951A = C6440f.m28077b(c6438eM28072a);
        }

        /* JADX INFO: renamed from: c */
        public final void m18416c() {
            f fVar = this.f14986a;
            this.f14953B = C11904k.m44491a(fVar.f14927v, this.f15030w, this.f14951A, fVar.f14890i1);
            f fVar2 = this.f14986a;
            this.f14955C = C11916w.m44519a(fVar2.f14927v, this.f15030w, this.f14951A, fVar2.f14890i1, fVar2.f14834L);
            f fVar3 = this.f14986a;
            this.f14957D = C3856e.m19157a(fVar3.f14927v, fVar3.f14893j1, fVar3.f14834L);
            f fVar4 = this.f14986a;
            C11026j c11026jM41726a = C11026j.m41726a(fVar4.f14896k1, fVar4.f14927v);
            this.f14959E = c11026jM41726a;
            InterfaceC5835i<C3852a.a> interfaceC5835iM19146b = C3853b.m19146b(c11026jM41726a);
            this.f14961F = interfaceC5835iM19146b;
            C3854c c3854cM19147a = C3854c.m19147a(this.f14986a.f14927v, interfaceC5835iM19146b);
            this.f14963G = c3854cM19147a;
            f fVar5 = this.f14986a;
            this.f14965H = C3857f.m19160a(fVar5.f14927v, this.f14957D, c3854cM19147a, fVar5.f14834L);
            f fVar6 = this.f14986a;
            C3546g c3546gM17544a = C3546g.m17544a(fVar6.f14927v, fVar6.f14879f, fVar6.f14882g);
            this.f14967I = c3546gM17544a;
            this.f14969J = C3547h.m17547b(c3546gM17544a);
            f fVar7 = this.f14986a;
            C9833b c9833bM38714a = C9833b.m38714a(fVar7.f14927v, fVar7.f14879f);
            this.f14970K = c9833bM38714a;
            this.f14971L = C9834c.m38717b(c9833bM38714a);
            C11743c c11743cM43966a = C11743c.m43966a(this.f14986a.f14899l1);
            this.f14972M = c11743cM43966a;
            f fVar8 = this.f14986a;
            this.f14973N = C8213u0.m33549a(fVar8.f14927v, this.f14965H, this.f14969J, this.f14971L, c11743cM43966a, this.f15030w, this.f14951A, fVar8.f14890i1, fVar8.f14834L);
            f fVar9 = this.f14986a;
            this.f14974O = C3569a.m17724a(fVar9.f14872c1, fVar9.f14878e1);
            C7232p c7232pM30183a = C7232p.m30183a(this.f14986a.f14890i1);
            this.f14975P = c7232pM30183a;
            f fVar10 = this.f14986a;
            this.f14976Q = C6871h2.m29308a(fVar10.f14927v, fVar10.f14916r0, this.f15024t, this.f15026u, this.f14953B, this.f14955C, this.f14973N, this.f14974O, c7232pM30183a, fVar10.f14884g1, fVar10.f14890i1, fVar10.f14823F0, fVar10.f14834L, fVar10.f14866a1);
            f fVar11 = this.f14986a;
            C4198c c4198cM21724a = C4198c.m21724a(fVar11.f14927v, fVar11.f14902m1, fVar11.f14875d1, fVar11.f14814C0, fVar11.f14878e1, fVar11.f14884g1, fVar11.f14834L, fVar11.f14849S0);
            this.f14977R = c4198cM21724a;
            this.f14978S = C4199d.m21727b(c4198cM21724a);
            f fVar12 = this.f14986a;
            C13412v c13412vM49038a = C13412v.m49038a(fVar12.f14844Q, fVar12.f14882g);
            this.f14979T = c13412vM49038a;
            this.f14980U = C3954f.m20049b(c13412vM49038a);
            f fVar13 = this.f14986a;
            this.f14981V = C6545k.m28381a(fVar13.f14927v, this.f15030w, this.f14951A, fVar13.f14890i1, fVar13.f14933x);
            f fVar14 = this.f14986a;
            C4659b c4659bM22920a = C4659b.m22920a(fVar14.f14930w, fVar14.f14902m1, fVar14.f14826H, fVar14.f14905n1);
            this.f14982W = c4659bM22920a;
            this.f14983X = C4660c.m22923b(c4659bM22920a);
            f fVar15 = this.f14986a;
            C13418w c13418wM49041a = C13418w.m49041a(fVar15.f14823F0, fVar15.f14834L);
            this.f14984Y = c13418wM49041a;
            f fVar16 = this.f14986a;
            this.f14985Z = C3967q.m20201a(fVar16.f14927v, this.f14978S, this.f14972M, this.f14980U, this.f14965H, this.f14981V, this.f15030w, this.f14951A, fVar16.f14884g1, fVar16.f14890i1, fVar16.f14849S0, this.f14983X, fVar16.f14866a1, c13418wM49041a, fVar16.f14882g, fVar16.f14933x);
        }

        /* JADX INFO: renamed from: d */
        public final void m18417d() {
            f fVar = this.f14986a;
            C10697k c10697kM40771a = C10697k.m40771a(fVar.f14908o1, fVar.f14927v, fVar.f14865a0, fVar.f14882g, fVar.f14933x);
            this.f14987a0 = c10697kM40771a;
            this.f14989b0 = C3829c.m18999b(c10697kM40771a);
            f fVar2 = this.f14986a;
            C8233o c8233oM33593a = C8233o.m33593a(fVar2.f14911p1, fVar2.f14927v, fVar2.f14865a0);
            this.f14991c0 = c8233oM33593a;
            this.f14993d0 = C8234p.m33596b(c8233oM33593a);
            f fVar3 = this.f14986a;
            C9936l1 c9936l1M38760a = C9936l1.m38760a(fVar3.f14914q1, fVar3.f14855V0, fVar3.f14917r1);
            this.f14995e0 = c9936l1M38760a;
            this.f14997f0 = C4152e.m21365b(c9936l1M38760a);
            f fVar4 = this.f14986a;
            C9933k6 c9933k6M38757a = C9933k6.m38757a(fVar4.f14917r1, fVar4.f14914q1, fVar4.f14816D);
            this.f14999g0 = c9933k6M38757a;
            this.f15001h0 = C4159l.m21524b(c9933k6M38757a);
            this.f15003i0 = C4179c.m21645a(this.f14986a.f14914q1);
            this.f15005j0 = C10702b.m40792a(this.f14986a.f14914q1);
            f fVar5 = this.f14986a;
            this.f15007k0 = C4156i.m21508a(fVar5.f14920s1, fVar5.f14887h1, fVar5.f14927v);
            C4150c c4150cM21353a = C4150c.m21353a(this.f14986a.f14927v, this.f15003i0, this.f15005j0, C14036b.m50713a(), this.f15007k0);
            this.f15009l0 = c4150cM21353a;
            f fVar6 = this.f14986a;
            this.f15011m0 = C4157j.m21511a(fVar6.f14927v, this.f14989b0, this.f14993d0, fVar6.f14865a0, this.f14997f0, this.f15001h0, fVar6.f14890i1, this.f14965H, c4150cM21353a, fVar6.f14823F0, fVar6.f14933x, fVar6.f14834L);
            f fVar7 = this.f14986a;
            this.f15013n0 = C13858b.m50428a(fVar7.f14923t1, fVar7.f14927v, fVar7.f14882g);
            f fVar8 = this.f14986a;
            this.f15015o0 = C3447j.m16643a(fVar8.f14920s1, fVar8.f14926u1, fVar8.f14927v, fVar8.f14882g);
            this.f15017p0 = C3452b.m16708a(this.f14986a.f14929v1);
            this.f15019q0 = C3456f.m16748a(this.f14986a.f14929v1);
            f fVar9 = this.f14986a;
            this.f15021r0 = C3454d.m16737a(fVar9.f14929v1, fVar9.f14932w1);
            this.f15023s0 = C1476b.m7580a(this.f14986a.f14929v1);
            f fVar10 = this.f14986a;
            C3458h c3458hM16763a = C3458h.m16763a(fVar10.f14929v1, fVar10.f14814C0, fVar10.f14875d1);
            this.f15025t0 = c3458hM16763a;
            f fVar11 = this.f14986a;
            this.f15027u0 = C3445h.m16626a(fVar11.f14916r0, fVar11.f14927v, this.f14965H, this.f15013n0, this.f15015o0, this.f15017p0, this.f15019q0, this.f15021r0, this.f15023s0, c3458hM16763a, fVar11.f14890i1, fVar11.f14823F0, fVar11.f14834L);
            f fVar12 = this.f14986a;
            C12871c c12871cM47902a = C12871c.m47902a(fVar12.f14927v, fVar12.f14917r1);
            this.f15029v0 = c12871cM47902a;
            InterfaceC5835i<C3612a.a> interfaceC5835iM18008b = C3613b.m18008b(c12871cM47902a);
            this.f15031w0 = interfaceC5835iM18008b;
            f fVar13 = this.f14986a;
            this.f15033x0 = C3614c.m18009a(fVar13.f14927v, fVar13.f14890i1, interfaceC5835iM18008b, fVar13.f14834L);
            this.f15035y0 = C13965i0.m50476a(this.f14986a.f14869b1);
        }

        /* JADX INFO: renamed from: e */
        public final void m18418e() {
            this.f15037z0 = C3713p.m18790b(this.f15035y0);
            f fVar = this.f14986a;
            C6476c c6476cM28231a = C6476c.m28231a(fVar.f14933x, fVar.f14935x1);
            this.f14952A0 = c6476cM28231a;
            this.f14954B0 = C6477d.m28234a(c6476cM28231a);
            f fVar2 = this.f14986a;
            C13960g c13960gM50460a = C13960g.m50460a(fVar2.f14818D1, fVar2.f14863Z0, fVar2.f14905n1);
            this.f14956C0 = c13960gM50460a;
            InterfaceC5835i<C3674c.a> interfaceC5835i = this.f14992d;
            InterfaceC5835i<C3672a.a> interfaceC5835i2 = this.f14996f;
            InterfaceC5835i<C3692k.b> interfaceC5835i3 = this.f15000h;
            InterfaceC5835i<C3715r.a> interfaceC5835i4 = this.f15004j;
            InterfaceC5835i<TransitionWorker.InterfaceC3662a> interfaceC5835i5 = this.f15008l;
            InterfaceC5835i<C3721v.a> interfaceC5835i6 = this.f15012n;
            InterfaceC5835i<C3677f.a> interfaceC5835i7 = this.f15016p;
            InterfaceC5835i<C3694m.a> interfaceC5835i8 = this.f15020r;
            InterfaceC5835i<GovernmentIdWorkflow> interfaceC5835i9 = this.f14976Q;
            InterfaceC5835i<SelfieWorkflow> interfaceC5835i10 = this.f14985Z;
            InterfaceC5835i<UiWorkflow> interfaceC5835i11 = this.f15011m0;
            InterfaceC5835i<DocumentWorkflow> interfaceC5835i12 = this.f15027u0;
            InterfaceC5835i<IntegrationWorkflow> interfaceC5835i13 = this.f15033x0;
            f fVar3 = this.f14986a;
            C6494f0 c6494f0M28326a = C6494f0.m28326a(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5, interfaceC5835i6, interfaceC5835i7, interfaceC5835i8, interfaceC5835i9, interfaceC5835i10, interfaceC5835i11, interfaceC5835i12, interfaceC5835i13, fVar3.f14820E0, fVar3.f14890i1, fVar3.f14823F0, fVar3.f14869b1, this.f15037z0, this.f14954B0, fVar3.f14933x, fVar3.f14834L, fVar3.f14819E, fVar3.f14941z1, c13960gM50460a, fVar3.f14821E1);
            this.f14958D0 = c6494f0M28326a;
            InterfaceC5835i<C6491e0.b> interfaceC5835iM28330b = C6496g0.m28330b(c6494f0M28326a);
            this.f14960E0 = interfaceC5835iM28330b;
            C7808c c7808cM32415a = C7808c.m32415a(interfaceC5835iM28330b);
            this.f14962F0 = c7808cM32415a;
            this.f14964G0 = C3741d.m18868b(c7808cM32415a);
            C7809d c7809dM32418a = C7809d.m32418a();
            this.f14966H0 = c7809dM32418a;
            this.f14968I0 = C3743f.m18873b(c7809dM32418a);
        }

        /* JADX INFO: renamed from: f */
        public final InquiryWorkflowFragment m18419f(InquiryWorkflowFragment inquiryWorkflowFragment) {
            C3739b.m18861b(inquiryWorkflowFragment, this.f14986a);
            C3739b.m18864e(inquiryWorkflowFragment, this.f14964G0.get());
            C3739b.m18865f(inquiryWorkflowFragment, this.f14968I0.get());
            C3739b.m18863d(inquiryWorkflowFragment, this.f14986a.f14817D0.get());
            C3739b.m18860a(inquiryWorkflowFragment, this.f14986a.f14933x.get());
            C3739b.m18862c(inquiryWorkflowFragment, m18420g());
            return inquiryWorkflowFragment;
        }

        /* JADX INFO: renamed from: g */
        public C6510n0 m18420g() {
            return new C6510n0(this.f14986a.f14865a0.get());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$i */
    public static final class i implements InterfaceC12872d.a {

        /* JADX INFO: renamed from: a */
        public final f f15038a;

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ldt/a; */
        @Override // p086dt.InterfaceC4687a.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC12872d mo18367a(IntegrationStepFragment integrationStepFragment) {
            C5834h.m26191b(integrationStepFragment);
            return new j(this.f15038a, integrationStepFragment);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public i(f fVar) {
            this.f15038a = fVar;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$j */
    public static final class j implements InterfaceC12872d {

        /* JADX INFO: renamed from: a */
        public final f f15039a;

        /* JADX INFO: renamed from: b */
        public final j f15040b = this;

        /* JADX INFO: renamed from: c */
        public C12871c f15041c;

        /* JADX INFO: renamed from: d */
        public InterfaceC5835i<C3612a.a> f15042d;

        /* JADX INFO: renamed from: e */
        public C13271h f15043e;

        /* JADX INFO: renamed from: f */
        public InterfaceC5835i<C3626b.c> f15044f;

        /* JADX INFO: renamed from: g */
        public C3629e f15045g;

        /* JADX INFO: renamed from: h */
        public InterfaceC5835i<C3628d.a> f15046h;

        public j(f fVar, IntegrationStepFragment integrationStepFragment) {
            this.f15039a = fVar;
            m18422b(integrationStepFragment);
        }

        /* JADX INFO: renamed from: b */
        public final void m18422b(IntegrationStepFragment integrationStepFragment) {
            f fVar = this.f15039a;
            C12871c c12871cM47902a = C12871c.m47902a(fVar.f14927v, fVar.f14917r1);
            this.f15041c = c12871cM47902a;
            InterfaceC5835i<C3612a.a> interfaceC5835iM18008b = C3613b.m18008b(c12871cM47902a);
            this.f15042d = interfaceC5835iM18008b;
            f fVar2 = this.f15039a;
            C13271h c13271hM49028a = C13271h.m49028a(fVar2.f14927v, fVar2.f14890i1, interfaceC5835iM18008b, fVar2.f14834L, fVar2.f14821E1);
            this.f15043e = c13271hM49028a;
            InterfaceC5835i<C3626b.c> interfaceC5835iM18056b = C3627c.m18056b(c13271hM49028a);
            this.f15044f = interfaceC5835iM18056b;
            C3629e c3629eM18060a = C3629e.m18060a(interfaceC5835iM18056b);
            this.f15045g = c3629eM18060a;
            this.f15046h = C3630f.m18063b(c3629eM18060a);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p086dt.InterfaceC4687a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo18369a(IntegrationStepFragment integrationStepFragment) {
            m18424d(integrationStepFragment);
        }

        /* JADX INFO: renamed from: d */
        public final IntegrationStepFragment m18424d(IntegrationStepFragment integrationStepFragment) {
            C9843b.m38731a(integrationStepFragment, this.f15039a.mo18380a());
            C3625a.m18037b(integrationStepFragment, this.f15046h.get());
            C3625a.m18036a(integrationStepFragment, this.f15039a.f14817D0.get());
            return integrationStepFragment;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$k */
    public static final class k implements InterfaceC5727g.a {

        /* JADX INFO: renamed from: a */
        public final f f15047a;

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ldt/a; */
        @Override // p086dt.InterfaceC4687a.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC5727g mo18367a(C5726f c5726f) {
            C5834h.m26191b(c5726f);
            return new l(this.f15047a, c5726f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public k(f fVar) {
            this.f15047a = fVar;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$l */
    public static final class l implements InterfaceC5727g {

        /* JADX INFO: renamed from: a */
        public final f f15048a;

        /* JADX INFO: renamed from: b */
        public final l f15049b = this;

        public l(f fVar, C5726f c5726f) {
            this.f15048a = fVar;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p086dt.InterfaceC4687a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo18369a(C5726f c5726f) {
            m18427c(c5726f);
        }

        /* JADX INFO: renamed from: c */
        public final C5726f m18427c(C5726f c5726f) {
            C9843b.m38731a(c5726f, this.f15048a.mo18380a());
            C5728h.m25922a(c5726f, this.f15048a.f14817D0.get());
            return c5726f;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$m */
    public static final class m implements InterfaceC11034l1.a {

        /* JADX INFO: renamed from: a */
        public final f f15050a;

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ldt/a; */
        @Override // p086dt.InterfaceC4687a.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC11034l1 mo18367a(PermissionRequestFragment permissionRequestFragment) {
            C5834h.m26191b(permissionRequestFragment);
            return new n(this.f15050a, permissionRequestFragment);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public m(f fVar) {
            this.f15050a = fVar;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$n */
    public static final class n implements InterfaceC11034l1 {

        /* JADX INFO: renamed from: a */
        public final f f15051a;

        /* JADX INFO: renamed from: b */
        public final n f15052b = this;

        /* JADX INFO: renamed from: c */
        public InterfaceC5835i<C3855d.a> f15053c;

        /* JADX INFO: renamed from: d */
        public C11026j f15054d;

        /* JADX INFO: renamed from: e */
        public InterfaceC5835i<C3852a.a> f15055e;

        /* JADX INFO: renamed from: f */
        public C11929l f15056f;

        /* JADX INFO: renamed from: g */
        public InterfaceC5835i<PermissionRequestStateManager.InterfaceC3891c> f15057g;

        /* JADX INFO: renamed from: h */
        public C11734c f15058h;

        /* JADX INFO: renamed from: i */
        public InterfaceC5835i<C3873c.a> f15059i;

        public n(f fVar, PermissionRequestFragment permissionRequestFragment) {
            this.f15051a = fVar;
            m18429b(permissionRequestFragment);
        }

        /* JADX INFO: renamed from: b */
        public final void m18429b(PermissionRequestFragment permissionRequestFragment) {
            f fVar = this.f15051a;
            this.f15053c = C3856e.m19157a(fVar.f14927v, fVar.f14893j1, fVar.f14834L);
            f fVar2 = this.f15051a;
            C11026j c11026jM41726a = C11026j.m41726a(fVar2.f14896k1, fVar2.f14927v);
            this.f15054d = c11026jM41726a;
            InterfaceC5835i<C3852a.a> interfaceC5835iM19146b = C3853b.m19146b(c11026jM41726a);
            this.f15055e = interfaceC5835iM19146b;
            f fVar3 = this.f15051a;
            C11929l c11929lM44523a = C11929l.m44523a(fVar3.f14927v, this.f15053c, interfaceC5835iM19146b, fVar3.f14834L, fVar3.f14821E1);
            this.f15056f = c11929lM44523a;
            InterfaceC5835i<PermissionRequestStateManager.InterfaceC3891c> interfaceC5835iM19270b = C3896a.m19270b(c11929lM44523a);
            this.f15057g = interfaceC5835iM19270b;
            C11734c c11734cM43945a = C11734c.m43945a(interfaceC5835iM19270b);
            this.f15058h = c11734cM43945a;
            this.f15059i = C3874d.m19198b(c11734cM43945a);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p086dt.InterfaceC4687a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo18369a(PermissionRequestFragment permissionRequestFragment) {
            m18431d(permissionRequestFragment);
        }

        /* JADX INFO: renamed from: d */
        public final PermissionRequestFragment m18431d(PermissionRequestFragment permissionRequestFragment) {
            C9843b.m38731a(permissionRequestFragment, this.f15051a.mo18380a());
            C3871a.m19194a(permissionRequestFragment, this.f15059i.get());
            return permissionRequestFragment;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$o */
    public static final class o implements InterfaceC13287c0.a {

        /* JADX INFO: renamed from: a */
        public final f f15060a;

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ldt/a; */
        @Override // p086dt.InterfaceC4687a.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC13287c0 mo18367a(SelfieStepFragment selfieStepFragment) {
            C5834h.m26191b(selfieStepFragment);
            return new p(this.f15060a, selfieStepFragment);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public o(f fVar) {
            this.f15060a = fVar;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$p */
    public static final class p implements InterfaceC13287c0 {

        /* JADX INFO: renamed from: a */
        public final f f15061a;

        /* JADX INFO: renamed from: b */
        public final p f15062b = this;

        /* JADX INFO: renamed from: c */
        public C4198c f15063c;

        /* JADX INFO: renamed from: d */
        public InterfaceC5835i<C4197b.a> f15064d;

        /* JADX INFO: renamed from: e */
        public InterfaceC5835i<C11742b.a> f15065e;

        /* JADX INFO: renamed from: f */
        public C13412v f15066f;

        /* JADX INFO: renamed from: g */
        public InterfaceC5835i<C3953e.b> f15067g;

        /* JADX INFO: renamed from: h */
        public C11735d f15068h;

        /* JADX INFO: renamed from: i */
        public InterfaceC5835i<C3875e.a> f15069i;

        /* JADX INFO: renamed from: j */
        public C5709t f15070j;

        /* JADX INFO: renamed from: k */
        public InterfaceC5835i<C3405e.a> f15071k;

        /* JADX INFO: renamed from: l */
        public C6435c0 f15072l;

        /* JADX INFO: renamed from: m */
        public InterfaceC5835i<C6433b0.a> f15073m;

        /* JADX INFO: renamed from: n */
        public C6438e f15074n;

        /* JADX INFO: renamed from: o */
        public InterfaceC5835i<C6434c.a> f15075o;

        /* JADX INFO: renamed from: p */
        public C4659b f15076p;

        /* JADX INFO: renamed from: q */
        public InterfaceC5835i<C4658a.b> f15077q;

        /* JADX INFO: renamed from: r */
        public InterfaceC5835i<C3955g> f15078r;

        /* JADX INFO: renamed from: s */
        public C5780m2 f15079s;

        /* JADX INFO: renamed from: t */
        public InterfaceC5835i<C5772k2.d> f15080t;

        /* JADX INFO: renamed from: u */
        public C5191l f15081u;

        /* JADX INFO: renamed from: v */
        public InterfaceC5835i<C3982b.a> f15082v;

        public p(f fVar, SelfieStepFragment selfieStepFragment) {
            this.f15061a = fVar;
            m18433b(selfieStepFragment);
        }

        /* JADX INFO: renamed from: b */
        public final void m18433b(SelfieStepFragment selfieStepFragment) {
            f fVar = this.f15061a;
            C4198c c4198cM21724a = C4198c.m21724a(fVar.f14927v, fVar.f14902m1, fVar.f14875d1, fVar.f14814C0, fVar.f14878e1, fVar.f14884g1, fVar.f14834L, fVar.f14849S0);
            this.f15063c = c4198cM21724a;
            this.f15064d = C4199d.m21727b(c4198cM21724a);
            this.f15065e = C11743c.m43966a(this.f15061a.f14899l1);
            f fVar2 = this.f15061a;
            C13412v c13412vM49038a = C13412v.m49038a(fVar2.f14844Q, fVar2.f14882g);
            this.f15066f = c13412vM49038a;
            this.f15067g = C3954f.m20049b(c13412vM49038a);
            C11735d c11735dM43948a = C11735d.m43948a(this.f15061a.f14845Q0);
            this.f15068h = c11735dM43948a;
            this.f15069i = C3876f.m19205b(c11735dM43948a);
            f fVar3 = this.f15061a;
            C5709t c5709tM25880a = C5709t.m25880a(fVar3.f14927v, fVar3.f14884g1, fVar3.f14882g);
            this.f15070j = c5709tM25880a;
            this.f15071k = C3406f.m16231b(c5709tM25880a);
            f fVar4 = this.f15061a;
            C6435c0 c6435c0M28068a = C6435c0.m28068a(fVar4.f14927v, fVar4.f14884g1, fVar4.f14882g, fVar4.f14846R, fVar4.f14824G, fVar4.f14834L, fVar4.f14823F0, fVar4.f14933x);
            this.f15072l = c6435c0M28068a;
            InterfaceC5835i<C6433b0.a> interfaceC5835iM28071b = C6437d0.m28071b(c6435c0M28068a);
            this.f15073m = interfaceC5835iM28071b;
            f fVar5 = this.f15061a;
            C6438e c6438eM28072a = C6438e.m28072a(interfaceC5835iM28071b, fVar5.f14846R, fVar5.f14826H, fVar5.f14834L);
            this.f15074n = c6438eM28072a;
            this.f15075o = C6440f.m28077b(c6438eM28072a);
            f fVar6 = this.f15061a;
            C4659b c4659bM22920a = C4659b.m22920a(fVar6.f14930w, fVar6.f14902m1, fVar6.f14826H, fVar6.f14905n1);
            this.f15076p = c4659bM22920a;
            this.f15077q = C4660c.m22923b(c4659bM22920a);
            f fVar7 = this.f15061a;
            C13418w c13418wM49041a = C13418w.m49041a(fVar7.f14823F0, fVar7.f14834L);
            this.f15078r = c13418wM49041a;
            f fVar8 = this.f15061a;
            C5780m2 c5780m2M26155a = C5780m2.m26155a(fVar8.f14927v, this.f15064d, this.f15065e, this.f15067g, this.f15069i, this.f15071k, this.f15075o, fVar8.f14884g1, fVar8.f14890i1, fVar8.f14849S0, fVar8.f14821E1, this.f15077q, c13418wM49041a, fVar8.f14933x, fVar8.f14882g);
            this.f15079s = c5780m2M26155a;
            InterfaceC5835i<C5772k2.d> interfaceC5835iM26158b = C5784n2.m26158b(c5780m2M26155a);
            this.f15080t = interfaceC5835iM26158b;
            C5191l c5191lM24086a = C5191l.m24086a(interfaceC5835iM26158b);
            this.f15081u = c5191lM24086a;
            this.f15082v = C3983c.m20258b(c5191lM24086a);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p086dt.InterfaceC4687a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo18369a(SelfieStepFragment selfieStepFragment) {
            m18435d(selfieStepFragment);
        }

        /* JADX INFO: renamed from: d */
        public final SelfieStepFragment m18435d(SelfieStepFragment selfieStepFragment) {
            C9843b.m38731a(selfieStepFragment, this.f15061a.mo18380a());
            C3981a.m20254f(selfieStepFragment, this.f15082v.get());
            C3981a.m20249a(selfieStepFragment, this.f15061a.m18390l());
            C3981a.m20251c(selfieStepFragment, C5829c.m26178b(this.f15061a.f14844Q));
            C3981a.m20253e(selfieStepFragment, this.f15061a.f14834L.get());
            C3981a.m20252d(selfieStepFragment, this.f15061a.f14817D0.get());
            C3981a.m20250b(selfieStepFragment, this.f15061a.f14933x.get());
            return selfieStepFragment;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$q */
    public static final class q implements InterfaceC11448c.a {

        /* JADX INFO: renamed from: a */
        public final f f15083a;

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ldt/a; */
        @Override // p086dt.InterfaceC4687a.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC11448c mo18367a(UiStepFragment uiStepFragment) {
            C5834h.m26191b(uiStepFragment);
            return new r(this.f15083a, uiStepFragment);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public q(f fVar) {
            this.f15083a = fVar;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$r */
    public static final class r implements InterfaceC11448c {

        /* JADX INFO: renamed from: a */
        public final f f15084a;

        /* JADX INFO: renamed from: b */
        public final r f15085b = this;

        /* JADX INFO: renamed from: c */
        public C10697k f15086c;

        /* JADX INFO: renamed from: d */
        public InterfaceC5835i<C3828b.a> f15087d;

        /* JADX INFO: renamed from: e */
        public C8233o f15088e;

        /* JADX INFO: renamed from: f */
        public InterfaceC5835i<C8232n.a> f15089f;

        /* JADX INFO: renamed from: g */
        public C9936l1 f15090g;

        /* JADX INFO: renamed from: h */
        public InterfaceC5835i<C4151d.a> f15091h;

        /* JADX INFO: renamed from: i */
        public C9933k6 f15092i;

        /* JADX INFO: renamed from: j */
        public InterfaceC5835i<C4158k.a> f15093j;

        /* JADX INFO: renamed from: k */
        public InterfaceC5835i<C4178b.a> f15094k;

        /* JADX INFO: renamed from: l */
        public InterfaceC5835i<C10701a.a> f15095l;

        /* JADX INFO: renamed from: m */
        public InterfaceC5835i<C4155h.a> f15096m;

        /* JADX INFO: renamed from: n */
        public InterfaceC5835i<C11084e0> f15097n;

        /* JADX INFO: renamed from: o */
        public C11735d f15098o;

        /* JADX INFO: renamed from: p */
        public InterfaceC5835i<C3875e.a> f15099p;

        /* JADX INFO: renamed from: q */
        public C11094h1 f15100q;

        /* JADX INFO: renamed from: r */
        public InterfaceC5835i<C11091g1.e> f15101r;

        /* JADX INFO: renamed from: s */
        public C11449d f15102s;

        /* JADX INFO: renamed from: t */
        public InterfaceC5835i<C4191b.a> f15103t;

        public r(f fVar, UiStepFragment uiStepFragment) {
            this.f15084a = fVar;
            m18437b(uiStepFragment);
        }

        /* JADX INFO: renamed from: b */
        public final void m18437b(UiStepFragment uiStepFragment) {
            f fVar = this.f15084a;
            C10697k c10697kM40771a = C10697k.m40771a(fVar.f14908o1, fVar.f14927v, fVar.f14865a0, fVar.f14882g, fVar.f14933x);
            this.f15086c = c10697kM40771a;
            this.f15087d = C3829c.m18999b(c10697kM40771a);
            f fVar2 = this.f15084a;
            C8233o c8233oM33593a = C8233o.m33593a(fVar2.f14911p1, fVar2.f14927v, fVar2.f14865a0);
            this.f15088e = c8233oM33593a;
            this.f15089f = C8234p.m33596b(c8233oM33593a);
            f fVar3 = this.f15084a;
            C9936l1 c9936l1M38760a = C9936l1.m38760a(fVar3.f14914q1, fVar3.f14855V0, fVar3.f14917r1);
            this.f15090g = c9936l1M38760a;
            this.f15091h = C4152e.m21365b(c9936l1M38760a);
            f fVar4 = this.f15084a;
            C9933k6 c9933k6M38757a = C9933k6.m38757a(fVar4.f14917r1, fVar4.f14914q1, fVar4.f14816D);
            this.f15092i = c9933k6M38757a;
            this.f15093j = C4159l.m21524b(c9933k6M38757a);
            this.f15094k = C4179c.m21645a(this.f15084a.f14914q1);
            this.f15095l = C10702b.m40792a(this.f15084a.f14914q1);
            f fVar5 = this.f15084a;
            this.f15096m = C4156i.m21508a(fVar5.f14920s1, fVar5.f14887h1, fVar5.f14927v);
            this.f15097n = C11087f0.m41813a(this.f15084a.f14927v, this.f15094k, this.f15095l, C14036b.m50713a(), this.f15096m);
            C11735d c11735dM43948a = C11735d.m43948a(this.f15084a.f14845Q0);
            this.f15098o = c11735dM43948a;
            InterfaceC5835i<C3875e.a> interfaceC5835iM19205b = C3876f.m19205b(c11735dM43948a);
            this.f15099p = interfaceC5835iM19205b;
            f fVar6 = this.f15084a;
            C11094h1 c11094h1M41894a = C11094h1.m41894a(fVar6.f14927v, this.f15087d, this.f15089f, fVar6.f14865a0, this.f15091h, this.f15093j, fVar6.f14890i1, this.f15097n, fVar6.f14823F0, fVar6.f14933x, fVar6.f14834L, interfaceC5835iM19205b, fVar6.f14821E1);
            this.f15100q = c11094h1M41894a;
            InterfaceC5835i<C11091g1.e> interfaceC5835iM41897b = C11097i1.m41897b(c11094h1M41894a);
            this.f15101r = interfaceC5835iM41897b;
            C11449d c11449dM42866a = C11449d.m42866a(interfaceC5835iM41897b);
            this.f15102s = c11449dM42866a;
            this.f15103t = C4192c.m21677b(c11449dM42866a);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p086dt.InterfaceC4687a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo18369a(UiStepFragment uiStepFragment) {
            m18439d(uiStepFragment);
        }

        /* JADX INFO: renamed from: d */
        public final UiStepFragment m18439d(UiStepFragment uiStepFragment) {
            C9843b.m38731a(uiStepFragment, this.f15084a.mo18380a());
            C4190a.m21673b(uiStepFragment, this.f15103t.get());
            C4190a.m21672a(uiStepFragment, this.f15084a.f14817D0.get());
            return uiStepFragment;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$s */
    public static final class s implements InterfaceC7245c.a {

        /* JADX INFO: renamed from: a */
        public final f f15104a;

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ldt/a; */
        @Override // p086dt.InterfaceC4687a.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC7245c mo18367a(C7244b c7244b) {
            C5834h.m26191b(c7244b);
            return new t(this.f15104a, c7244b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public s(f fVar) {
            this.f15104a = fVar;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$t */
    public static final class t implements InterfaceC7245c {

        /* JADX INFO: renamed from: a */
        public final f f15105a;

        /* JADX INFO: renamed from: b */
        public final t f15106b = this;

        public t(f fVar, C7244b c7244b) {
            this.f15105a = fVar;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p086dt.InterfaceC4687a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo18369a(C7244b c7244b) {
            m18442c(c7244b);
        }

        /* JADX INFO: renamed from: c */
        public final C7244b m18442c(C7244b c7244b) {
            C9843b.m38731a(c7244b, this.f15105a.mo18380a());
            C7246d.m30220b(c7244b, this.f15105a.f14856W.get());
            C7246d.m30219a(c7244b, this.f15105a.f14817D0.get());
            return c7244b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m18348a() {
        return new a();
    }
}
