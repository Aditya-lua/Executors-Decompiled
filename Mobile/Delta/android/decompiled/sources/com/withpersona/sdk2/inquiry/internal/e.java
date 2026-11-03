package com.withpersona.sdk2.inquiry.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.activity.result.IntentSenderRequest;
import ao.c1;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment;
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
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader;
import com.withpersona.sdk2.inquiry.tracking.C0701RealTrackingEventsLogger_Factory;
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
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;
import dn.j0;
import dn.o0;
import dn.r0;
import dn.s0;
import dn.x;
import dq.k2;
import dq.m2;
import dq.n2;
import ep.y;
import fn.b0;
import fn.d0;
import fn.i0;
import fp.g0;
import go.h2;
import hq.c0;
import hq.e0;
import hq.f0;
import io.z;
import iu.l0;
import iu.p0;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import jo.t0;
import jo.u0;
import mo.GovernmentIdHintWorker;
import mr.b2;
import mr.c2;
import mr.k6;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import oo.d1;
import po.j1;
import po.k1;
import po.m0;
import po.n0;
import po.v0;
import po.w0;
import pp.l1;
import pp.m1;
import pr.g1;
import pr.h1;
import pr.i1;
import xo.h0;
import xo.k0;
import xp.q0;
import ym.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public NetworkCoreModule f11536a;
        public com.withpersona.sdk2.inquiry.internal.network.f b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public kp.q f11537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public dn.k f11538d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public kp.w f11539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public oq.a f11540f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public xo.n f11541g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public kp.d f11542h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public kp.i f11543i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public up.f f11544j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public op.e f11545k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public jp.c f11546l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public kq.b f11547m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public bp.c f11548n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public c0 f11549o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public jq.c f11550p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.internal.fallbackmode.a f11551q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public nq.f f11552r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public kp.c0 f11553s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public wn.e f11554t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public eo.g f11555u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TrackingEventsModule f11556v;

        public a a(com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar) {
            this.f11551q = (com.withpersona.sdk2.inquiry.internal.fallbackmode.a) dt.h.b(aVar);
            return this;
        }

        public xo.s b() {
            dt.h.a(this.f11536a, NetworkCoreModule.class);
            dt.h.a(this.b, com.withpersona.sdk2.inquiry.internal.network.f.class);
            dt.h.a(this.f11537c, kp.q.class);
            if (this.f11538d == null) {
                this.f11538d = new dn.k();
            }
            dt.h.a(this.f11539e, kp.w.class);
            dt.h.a(this.f11540f, oq.a.class);
            dt.h.a(this.f11541g, xo.n.class);
            dt.h.a(this.f11542h, kp.d.class);
            dt.h.a(this.f11543i, kp.i.class);
            if (this.f11544j == null) {
                this.f11544j = new up.f();
            }
            dt.h.a(this.f11545k, op.e.class);
            dt.h.a(this.f11546l, jp.c.class);
            dt.h.a(this.f11547m, kq.b.class);
            dt.h.a(this.f11548n, bp.c.class);
            if (this.f11549o == null) {
                this.f11549o = new c0();
            }
            if (this.f11550p == null) {
                this.f11550p = new jq.c();
            }
            dt.h.a(this.f11551q, com.withpersona.sdk2.inquiry.internal.fallbackmode.a.class);
            dt.h.a(this.f11552r, nq.f.class);
            dt.h.a(this.f11553s, kp.c0.class);
            if (this.f11554t == null) {
                this.f11554t = new wn.e();
            }
            if (this.f11555u == null) {
                this.f11555u = new eo.g();
            }
            dt.h.a(this.f11556v, TrackingEventsModule.class);
            return new f(this.f11536a, this.b, this.f11537c, this.f11538d, this.f11539e, this.f11540f, this.f11541g, this.f11542h, this.f11543i, this.f11544j, this.f11545k, this.f11546l, this.f11547m, this.f11548n, this.f11549o, this.f11550p, this.f11551q, this.f11552r, this.f11553s, this.f11554t, this.f11555u, this.f11556v);
        }

        public a c(kp.d dVar) {
            this.f11542h = (kp.d) dt.h.b(dVar);
            return this;
        }

        public a d(kq.b bVar) {
            this.f11547m = (kq.b) dt.h.b(bVar);
            return this;
        }

        public a e(kp.i iVar) {
            this.f11543i = (kp.i) dt.h.b(iVar);
            return this;
        }

        public a f(kp.q qVar) {
            this.f11537c = (kp.q) dt.h.b(qVar);
            return this;
        }

        public a g(nq.f fVar) {
            this.f11552r = (nq.f) dt.h.b(fVar);
            return this;
        }

        public a h(bp.c cVar) {
            this.f11548n = (bp.c) dt.h.b(cVar);
            return this;
        }

        public a i(oq.a aVar) {
            this.f11540f = (oq.a) dt.h.b(aVar);
            return this;
        }

        public a j(xo.n nVar) {
            this.f11541g = (xo.n) dt.h.b(nVar);
            return this;
        }

        public a k(com.withpersona.sdk2.inquiry.internal.network.f fVar) {
            this.b = (com.withpersona.sdk2.inquiry.internal.network.f) dt.h.b(fVar);
            return this;
        }

        public a l(jp.c cVar) {
            this.f11546l = (jp.c) dt.h.b(cVar);
            return this;
        }

        public a m(NetworkCoreModule networkCoreModule) {
            this.f11536a = (NetworkCoreModule) dt.h.b(networkCoreModule);
            return this;
        }

        public a n(op.e eVar) {
            this.f11545k = (op.e) dt.h.b(eVar);
            return this;
        }

        public a o(kp.w wVar) {
            this.f11539e = (kp.w) dt.h.b(wVar);
            return this;
        }

        public a p(kp.c0 c0Var) {
            this.f11553s = (kp.c0) dt.h.b(c0Var);
            return this;
        }

        public a q(c0 c0Var) {
            this.f11549o = (c0) dt.h.b(c0Var);
            return this;
        }

        public a r(TrackingEventsModule trackingEventsModule) {
            this.f11556v = (TrackingEventsModule) dt.h.b(trackingEventsModule);
            return this;
        }

        public a() {
        }
    }

    public static final class b implements xn.g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11557a;

        @Override // bt.a.InterfaceC0090a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public xn.g a(DocumentStepFragment documentStepFragment) {
            dt.h.b(documentStepFragment);
            return new c(this.f11557a, documentStepFragment);
        }

        public b(f fVar) {
            this.f11557a = fVar;
        }
    }

    public static final class c implements xn.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11558a;
        public final c b = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.document.a> f11559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.document.i.b> f11560d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.document.network.a.C0182a> f11561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.document.network.e.a> f11562f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.document.network.c.a> f11563g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public dt.i<zn.a.C0693a> f11564h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.document.network.g.a> f11565i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public rp.d f11566j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> f11567k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public c1 f11568l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.document.step.b.c> f11569m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.document.step.e f11570n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.document.step.d.a> f11571o;

        public c(f fVar, DocumentStepFragment documentStepFragment) {
            this.f11558a = fVar;
            b(documentStepFragment);
        }

        public final void b(DocumentStepFragment documentStepFragment) {
            f fVar = this.f11558a;
            this.f11559c = xn.b.a(fVar.f11656t1, fVar.f11660v, fVar.f11615g);
            f fVar2 = this.f11558a;
            this.f11560d = com.withpersona.sdk2.inquiry.document.j.a(fVar2.f11653s1, fVar2.f11659u1, fVar2.f11660v, fVar2.f11615g);
            this.f11561e = com.withpersona.sdk2.inquiry.document.network.b.a(this.f11558a.f11662v1);
            this.f11562f = com.withpersona.sdk2.inquiry.document.network.f.a(this.f11558a.f11662v1);
            f fVar3 = this.f11558a;
            this.f11563g = com.withpersona.sdk2.inquiry.document.network.d.a(fVar3.f11662v1, fVar3.f11665w1);
            this.f11564h = zn.b.a(this.f11558a.f11662v1);
            f fVar4 = this.f11558a;
            this.f11565i = com.withpersona.sdk2.inquiry.document.network.h.a(fVar4.f11662v1, fVar4.C0, fVar4.f11608d1);
            rp.d dVarA = rp.d.a(this.f11558a.Q0);
            this.f11566j = dVarA;
            dt.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> iVarB = com.withpersona.sdk2.inquiry.permissions.permissionRequest.f.b(dVarA);
            this.f11567k = iVarB;
            f fVar5 = this.f11558a;
            c1 c1VarA = c1.a(fVar5.f11649r0, fVar5.f11660v, this.f11559c, this.f11560d, this.f11561e, this.f11562f, this.f11563g, this.f11564h, this.f11565i, fVar5.f11623i1, fVar5.F0, fVar5.L, iVarB, fVar5.E1);
            this.f11568l = c1VarA;
            dt.i<com.withpersona.sdk2.inquiry.document.step.b.c> iVarB2 = com.withpersona.sdk2.inquiry.document.step.c.b(c1VarA);
            this.f11569m = iVarB2;
            com.withpersona.sdk2.inquiry.document.step.e eVarA = com.withpersona.sdk2.inquiry.document.step.e.a(iVarB2);
            this.f11570n = eVarA;
            this.f11571o = com.withpersona.sdk2.inquiry.document.step.f.b(eVarA);
        }

        @Override // bt.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(DocumentStepFragment documentStepFragment) {
            d(documentStepFragment);
        }

        public final DocumentStepFragment d(DocumentStepFragment documentStepFragment) {
            mq.b.a(documentStepFragment, this.f11558a.a());
            com.withpersona.sdk2.inquiry.document.step.a.b(documentStepFragment, this.f11571o.get());
            com.withpersona.sdk2.inquiry.document.step.a.a(documentStepFragment, this.f11558a.D0.get());
            return documentStepFragment;
        }
    }

    public static final class d implements oo.p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11572a;

        @Override // bt.a.InterfaceC0090a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public oo.p a(GovernmentIdStepFragment governmentIdStepFragment) {
            dt.h.b(governmentIdStepFragment);
            return new C0216e(this.f11572a, governmentIdStepFragment);
        }

        public d(f fVar) {
            this.f11572a = fVar;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$e, reason: collision with other inner class name */
    public static final class C0216e implements oo.p {
        public dt.i<com.withpersona.sdk2.inquiry.governmentid.persona_workflow.d.a> A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11573a;
        public final C0216e b = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public no.d f11574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public dt.i<no.c.a> f11575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.governmentid.e> f11576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public dn.t f11577f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.camera.e.a> f11578g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public fn.c0 f11579h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public dt.i<b0.a> f11580i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public fn.e f11581j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public dt.i<fn.c.a> f11582k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public dt.i<v0> f11583l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public dt.i<j1> f11584m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.governmentid.g f11585n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public dt.i<GovernmentIdAnalyzeWorker.a> f11586o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public mo.b f11587p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public dt.i<GovernmentIdHintWorker.b> f11588q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public dt.i<rr.b.a> f11589r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public rp.d f11590s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> f11591t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public dt.i<m0> f11592u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public dt.i<AutoClassifyWorker.b> f11593v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public dt.i<po.i> f11594w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public d1 f11595x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.c> f11596y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.governmentid.persona_workflow.e f11597z;

        public C0216e(f fVar, GovernmentIdStepFragment governmentIdStepFragment) {
            this.f11573a = fVar;
            b(governmentIdStepFragment);
        }

        public final void b(GovernmentIdStepFragment governmentIdStepFragment) {
            f fVar = this.f11573a;
            no.d dVarA = no.d.a(fVar.f11660v, fVar.f11605c1, fVar.f11608d1, fVar.C0, fVar.f11611e1, fVar.f11617g1, fVar.L);
            this.f11574c = dVarA;
            this.f11575d = no.e.b(dVarA);
            f fVar2 = this.f11573a;
            this.f11576e = go.e.a(fVar2.f11620h1, fVar2.f11660v, fVar2.f11615g);
            f fVar3 = this.f11573a;
            dn.t tVarA = dn.t.a(fVar3.f11660v, fVar3.f11617g1, fVar3.f11615g);
            this.f11577f = tVarA;
            this.f11578g = com.withpersona.sdk2.camera.f.b(tVarA);
            f fVar4 = this.f11573a;
            fn.c0 c0VarA = fn.c0.a(fVar4.f11660v, fVar4.f11617g1, fVar4.f11615g, fVar4.R, fVar4.G, fVar4.L, fVar4.F0, fVar4.f11666x);
            this.f11579h = c0VarA;
            dt.i<b0.a> iVarB = d0.b(c0VarA);
            this.f11580i = iVarB;
            f fVar5 = this.f11573a;
            fn.e eVarA = fn.e.a(iVarB, fVar5.R, fVar5.H, fVar5.L);
            this.f11581j = eVarA;
            dt.i<fn.c.a> iVarB2 = fn.f.b(eVarA);
            this.f11582k = iVarB2;
            f fVar6 = this.f11573a;
            this.f11583l = w0.a(fVar6.f11660v, this.f11578g, iVarB2, fVar6.f11623i1, fVar6.L);
            f fVar7 = this.f11573a;
            this.f11584m = k1.a(fVar7.f11660v, this.f11578g, this.f11582k, fVar7.f11623i1, fVar7.L);
            f fVar8 = this.f11573a;
            com.withpersona.sdk2.inquiry.governmentid.g gVarA = com.withpersona.sdk2.inquiry.governmentid.g.a(fVar8.f11660v, fVar8.f11612f, fVar8.f11615g);
            this.f11585n = gVarA;
            this.f11586o = com.withpersona.sdk2.inquiry.governmentid.h.b(gVarA);
            f fVar9 = this.f11573a;
            mo.b bVarA = mo.b.a(fVar9.f11660v, fVar9.f11612f);
            this.f11587p = bVarA;
            this.f11588q = mo.c.b(bVarA);
            this.f11589r = rr.c.a(this.f11573a.f11632l1);
            rp.d dVarA2 = rp.d.a(this.f11573a.Q0);
            this.f11590s = dVarA2;
            dt.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> iVarB3 = com.withpersona.sdk2.inquiry.permissions.permissionRequest.f.b(dVarA2);
            this.f11591t = iVarB3;
            f fVar10 = this.f11573a;
            this.f11592u = n0.a(fVar10.f11660v, this.f11586o, this.f11588q, this.f11589r, this.f11578g, this.f11582k, fVar10.f11623i1, fVar10.L, iVarB3);
            f fVar11 = this.f11573a;
            this.f11593v = com.withpersona.sdk2.inquiry.governmentid.network.a.a(fVar11.f11605c1, fVar11.f11611e1);
            po.k kVarA = po.k.a(this.f11573a.f11623i1);
            this.f11594w = kVarA;
            f fVar12 = this.f11573a;
            d1 d1VarA = d1.a(fVar12.f11660v, fVar12.f11649r0, this.f11575d, this.f11576e, this.f11583l, this.f11584m, this.f11592u, this.f11593v, kVarA, fVar12.f11617g1, fVar12.f11623i1, fVar12.F0, fVar12.L, fVar12.f11600a1, fVar12.E1);
            this.f11595x = d1VarA;
            dt.i<com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.c> iVarB4 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.c.b(d1VarA);
            this.f11596y = iVarB4;
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.e eVarA2 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.e.a(iVarB4);
            this.f11597z = eVarA2;
            this.A = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.f.b(eVarA2);
        }

        @Override // bt.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(GovernmentIdStepFragment governmentIdStepFragment) {
            d(governmentIdStepFragment);
        }

        public final GovernmentIdStepFragment d(GovernmentIdStepFragment governmentIdStepFragment) {
            mq.b.a(governmentIdStepFragment, this.f11573a.a());
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.f(governmentIdStepFragment, this.A.get());
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.a(governmentIdStepFragment, this.f11573a.l());
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.c(governmentIdStepFragment, dt.c.b(this.f11573a.f11612f));
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.e(governmentIdStepFragment, this.f11573a.L.get());
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.b(governmentIdStepFragment, this.f11573a.f11666x.get());
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.d(governmentIdStepFragment, this.f11573a.D0.get());
            return governmentIdStepFragment;
        }
    }

    public static final class f implements xo.s {
        public dt.i<Set<JsonAdapterBinding<?>>> A;
        public dt.i<xo.h> A0;
        public dt.i<wn.b0> A1;
        public dt.i<Set<sm.h.e>> B;
        public dt.i<bp.i> B0;
        public dt.i<wn.m> B1;
        public dt.i<Set<sm.h.e>> C;
        public dt.i<co.a> C0;
        public dt.i<wn.t> C1;
        public dt.i<sm.w> D;
        public dt.i<tq.a> D0;
        public dt.i<wn.d> D1;
        public dt.i<TrackingMetadataProvider> E;
        public dt.i<nq.e> E0;
        public dt.i<p0> E1;
        public dt.i<l0> F;
        public dt.i<nq.c> F0;
        public dt.i<jq.a> G;
        public dt.i<Application> G0;
        public dt.i<p0> H;
        public dt.i<RealFontDownloader> H0;
        public dt.i<NetworkStateManager> I;
        public dt.i<oo.p.a> I0;
        public C0701RealTrackingEventsLogger_Factory J;
        public dt.i<qr.c.a> J0;
        public dt.i<RealTrackingEventsLogger.Factory> K;
        public dt.i<wp.c0.a> K0;
        public dt.i<TrackingEventsLogger> L;
        public dt.i<xn.g.a> L0;
        public dt.i<z> M;
        public dt.i<l1.a> M0;
        public dt.i<Set<a0<?>>> N;
        public dt.i<dp.g.a> N0;
        public dt.i<r0> O;
        public dt.i<hp.c.a> O0;
        public dt.i<lu.b0<in.c>> P;
        public dt.i<vo.d.a> P0;
        public dt.i<dn.n0> Q;
        public dt.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.g> Q0;
        public dt.i<i0> R;
        public dt.i<UploadService> R0;
        public dt.i<com.withpersona.sdk2.inquiry.selfie.d> S;
        public dt.i<DirectFileUploader> S0;
        public dt.i<xp.p0> T;
        public dt.i<y> T0;
        public dt.i<Set<a0<?>>> U;
        public dt.i<wn.p> U0;
        public dt.i<Set<a0<?>>> V;
        public dt.i<wn.a> V0;
        public dt.i<ym.c0> W;
        public dt.i<cp.d> W0;
        public dt.i<String> X;
        public dt.i<cp.a> X0;
        public dt.i<Interceptor> Y;
        public dt.i<Boolean> Y0;
        public dt.i<Interceptor> Z;
        public dt.i<com.withpersona.sdk2.inquiry.internal.network.e> Z0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xo.n f11598a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public dt.i<up.c> f11599a0;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> f11600a1;
        public final jq.c b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public dt.i<Interceptor> f11601b0;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        public dt.i<UiStepSavedStateHelper> f11602b1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oq.a f11603c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public dt.i<Set<Interceptor>> f11604c0;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.governmentid.network.b> f11605c1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final f f11606d = this;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public dt.i<String> f11607d0;

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        public dt.i<kq.a> f11608d1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public dt.i<lu.b0<gt.n<j0>>> f11609e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public dt.i<String> f11610e0;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        public dt.i<pq.a> f11611e1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public dt.i<x> f11612f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public dt.i<Map<String, String>> f11613f0;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        public dt.i<jn.b> f11614f1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public dt.i<oq.c> f11615g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public dt.i<wn.z> f11616g0;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        public dt.i<jn.a> f11617g1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.camera.b> f11618h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public dt.i<wn.k> f11619h0;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        public dt.i<g.c<String[]>> f11620h1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public dt.i<eo.d> f11621i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public dt.i<wn.r> f11622i0;

        /* JADX INFO: renamed from: i1, reason: collision with root package name */
        public dt.i<sq.a> f11623i1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public dt.i<eo.d> f11624j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public dt.i<wn.b> f11625j0;

        /* JADX INFO: renamed from: j1, reason: collision with root package name */
        public dt.i<g.c<String>> f11626j1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public dt.i<eo.d> f11627k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public dt.i<lp.b> f11628k0;

        /* JADX INFO: renamed from: k1, reason: collision with root package name */
        public dt.i<g.c<IntentSenderRequest>> f11629k1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public dt.i<eo.d> f11630l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public lp.f f11631l0;

        /* JADX INFO: renamed from: l1, reason: collision with root package name */
        public dt.i<rr.a> f11632l1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public dt.i<eo.d> f11633m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public dt.i<lp.e.a> f11634m0;

        /* JADX INFO: renamed from: m1, reason: collision with root package name */
        public dt.i<aq.a> f11635m1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public dt.i<eo.d> f11636n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public dt.i<OkHttpClient> f11637n0;

        /* JADX INFO: renamed from: n1, reason: collision with root package name */
        public dt.i<l0> f11638n1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public dt.i<eo.d> f11639o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public dt.i<hv.y> f11640o0;

        /* JADX INFO: renamed from: o1, reason: collision with root package name */
        public dt.i<g.c<PassportNfcReaderConfig>> f11641o1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public dt.i<eo.d> f11642p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public dt.i<ep.w> f11643p0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        public dt.i<g.c<JpMyNumberNfcReaderConfig>> f11644p1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public dt.i<eo.d> f11645q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public dt.i<xo.i> f11646q0;

        /* JADX INFO: renamed from: q1, reason: collision with root package name */
        public dt.i<or.c> f11647q1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public dt.i<eo.d> f11648r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public dt.i<k6.s> f11649r0;

        /* JADX INFO: renamed from: r1, reason: collision with root package name */
        public dt.i<g.c<kp.b>> f11650r1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public dt.i<eo.d> f11651s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public dt.i<FallbackMode> f11652s0;

        /* JADX INFO: renamed from: s1, reason: collision with root package name */
        public dt.i<g.c<String[]>> f11653s1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public dt.i<eo.d> f11654t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public dt.i<FallbackModeService> f11655t0;

        /* JADX INFO: renamed from: t1, reason: collision with root package name */
        public dt.i<g.c<Uri>> f11656t1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public dt.i<Set<eo.d>> f11657u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public bp.k f11658u0;

        /* JADX INFO: renamed from: u1, reason: collision with root package name */
        public dt.i<g.c<g.h>> f11659u1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public dt.i<Context> f11660v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.internal.fallbackmode.i.a> f11661v0;

        /* JADX INFO: renamed from: v1, reason: collision with root package name */
        public dt.i<zn.c> f11662v1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public dt.i<androidx.p000lifecycle.l0> f11663w;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.internal.fallbackmode.d> f11664w0;

        /* JADX INFO: renamed from: w1, reason: collision with root package name */
        public dt.i<hq.k> f11665w1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public dt.i<eo.e> f11666x;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.internal.fallbackmode.g f11667x0;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        public dt.i<fo.a> f11668x1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public dt.i<TrackingEventsCache> f11669y;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.internal.fallbackmode.f.a> f11670y0;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        public dt.i<k0> f11671y1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public dt.i<Set<Object>> f11672z;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public dt.i<bp.a> f11673z0;

        /* JADX INFO: renamed from: z1, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.internal.q> f11674z1;

        public class a implements dt.i<oo.p.a> {
            public a() {
            }

            @Override // ft.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public oo.p.a get() {
                return new d(f.this.f11606d);
            }
        }

        public class b implements dt.i<qr.c.a> {
            public b() {
            }

            @Override // ft.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public qr.c.a get() {
                return new q(f.this.f11606d);
            }
        }

        public class c implements dt.i<wp.c0.a> {
            public c() {
            }

            @Override // ft.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public wp.c0.a get() {
                return new o(f.this.f11606d);
            }
        }

        public class d implements dt.i<xn.g.a> {
            public d() {
            }

            @Override // ft.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public xn.g.a get() {
                return new b(f.this.f11606d);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$f$e, reason: collision with other inner class name */
        public class C0217e implements dt.i<l1.a> {
            public C0217e() {
            }

            @Override // ft.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l1.a get() {
                return new m(f.this.f11606d);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$f$f, reason: collision with other inner class name */
        public class C0218f implements dt.i<dp.g.a> {
            public C0218f() {
            }

            @Override // ft.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public dp.g.a get() {
                return new k(f.this.f11606d);
            }
        }

        public class g implements dt.i<hp.c.a> {
            public g() {
            }

            @Override // ft.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public hp.c.a get() {
                return new s(f.this.f11606d);
            }
        }

        public class h implements dt.i<vo.d.a> {
            public h() {
            }

            @Override // ft.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public vo.d.a get() {
                return new i(f.this.f11606d);
            }
        }

        public f(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            this.f11598a = nVar;
            this.b = cVar3;
            this.f11603c = aVar;
            m(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            n(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            o(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            p(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            q(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            r(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
        }

        public dt.j<a0<?>> A(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            dt.j.b bVarA = dt.j.a(0, 8);
            bVarA.a(ep.o.a());
            bVarA.a(this.N);
            bVarA.a(c2.a());
            bVarA.a(this.U);
            bVarA.a(xn.h.a());
            bVarA.a(up.h.a());
            bVarA.a(mp.f.a());
            bVarA.a(m1.a());
            return bVarA.c();
        }

        public k0 B() {
            return new k0(xo.p.a(this.f11598a), new xq.a.C0658a(), this.f11643p0.get());
        }

        @Override // xo.s
        public bt.b<Object> a() {
            return bt.c.a(s(), Collections.EMPTY_MAP);
        }

        @Override // xo.s
        public TrackingEventsLogger b() {
            return this.L.get();
        }

        @Override // xo.s
        public wn.k c() {
            return this.f11619h0.get();
        }

        @Override // xo.s
        public xo.i d() {
            return this.f11646q0.get();
        }

        @Override // xo.s
        public k6.s e() {
            return this.f11649r0.get();
        }

        @Override // xo.s
        public com.withpersona.sdk2.inquiry.internal.workflows.a.InterfaceC0225a f() {
            return new g(this.f11606d);
        }

        @Override // xo.s
        public DirectFileUploader g() {
            return this.S0.get();
        }

        @Override // xo.s
        public ir.a h() {
            return this.H0.get();
        }

        @Override // xo.s
        public com.withpersona.sdk2.inquiry.permissions.permissionRequest.g i() {
            return this.Q0.get();
        }

        @Override // xo.s
        public com.withpersona.sdk2.inquiry.internal.q j() {
            return new com.withpersona.sdk2.inquiry.internal.q(B(), jq.f.c(this.b));
        }

        public com.withpersona.sdk2.camera.b l() {
            return new com.withpersona.sdk2.camera.b(oq.b.c(this.f11603c));
        }

        public final void m(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            dt.i<lu.b0<gt.n<j0>>> iVarC = dt.c.c(dn.m.a(kVar));
            this.f11609e = iVarC;
            this.f11612f = dn.y.a(iVarC);
            oq.b bVarA = oq.b.a(aVar);
            this.f11615g = bVarA;
            this.f11618h = dn.q.a(bVarA);
            this.f11621i = eo.o.a(gVar);
            this.f11624j = eo.q.a(gVar);
            this.f11627k = eo.p.a(gVar);
            this.f11630l = eo.k.a(gVar);
            this.f11633m = eo.r.a(gVar);
            this.f11636n = eo.j.a(gVar);
            this.f11639o = eo.n.a(gVar);
            this.f11642p = eo.h.b(gVar);
            this.f11645q = eo.i.a(gVar);
            this.f11648r = eo.s.a(gVar);
            this.f11651s = eo.m.a(gVar);
            this.f11654t = eo.l.a(gVar);
            this.f11657u = v(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            this.f11660v = xo.p.b(nVar);
            bp.g gVarA = bp.g.a(cVar2);
            this.f11663w = gVarA;
            this.f11666x = dt.c.c(eo.f.a(this.f11657u, this.f11660v, gVarA));
            this.f11669y = dt.c.c(TrackingEventsCache_Factory.create());
            this.f11672z = z(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            this.A = x(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            this.B = TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory.create(trackingEventsModule);
            this.C = y(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
        }

        public final void n(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            this.D = dt.c.c(NetworkCoreModule_MoshiFactory.create(networkCoreModule, this.f11672z, this.A, this.C));
            this.E = dt.c.c(TrackingMetadataProvider_Factory.create(this.f11660v));
            jq.e eVarA = jq.e.a(cVar3);
            this.F = eVarA;
            dt.i<jq.a> iVarC = dt.c.c(jq.b.a(eVarA));
            this.G = iVarC;
            this.H = jq.d.b(cVar3, iVarC);
            dt.i<NetworkStateManager> iVarC2 = dt.c.c(NetworkStateManager_Factory.create());
            this.I = iVarC2;
            C0701RealTrackingEventsLogger_Factory c0701RealTrackingEventsLogger_FactoryCreate = C0701RealTrackingEventsLogger_Factory.create(this.f11660v, this.f11669y, this.D, this.E, this.f11615g, this.f11666x, this.H, iVarC2);
            this.J = c0701RealTrackingEventsLogger_FactoryCreate;
            dt.i<RealTrackingEventsLogger.Factory> iVarCreateFactoryProvider = RealTrackingEventsLogger_Factory_Impl.createFactoryProvider(c0701RealTrackingEventsLogger_FactoryCreate);
            this.K = iVarCreateFactoryProvider;
            dt.i<TrackingEventsLogger> iVarC3 = dt.c.c(TrackingEventsModule_TrackingEventsLoggerFactory.create(trackingEventsModule, iVarCreateFactoryProvider));
            this.L = iVarC3;
            io.a0 a0VarA = io.a0.a(this.f11612f, this.f11618h, this.f11666x, iVarC3);
            this.M = a0VarA;
            this.N = go.m.a(a0VarA);
            this.O = s0.a(this.f11666x);
            dt.i<lu.b0<in.c>> iVarC4 = dt.c.c(dn.n.a(kVar));
            this.P = iVarC4;
            this.Q = o0.a(this.O, iVarC4);
            dt.i<i0> iVarC5 = dt.c.c(fn.j0.a());
            this.R = iVarC5;
            this.S = wp.n.a(this.f11618h, this.Q, iVarC5, this.L);
            q0 q0VarA = q0.a(this.f11618h, this.Q, this.L, this.f11666x);
            this.T = q0VarA;
            this.U = wp.b0.a(this.S, q0VarA);
            dt.j<a0<?>> jVarA = A(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            this.V = jVarA;
            this.W = dt.c.c(ep.u.a(jVarA));
            this.X = ep.r.a(fVar);
            this.Y = NetworkCoreModule_ResponseInterceptorFactory.create(networkCoreModule, this.I);
            this.Z = NetworkCoreModule_InterceptorFactory.create(networkCoreModule, this.D);
            dt.i<up.c> iVarC6 = dt.c.c(up.d.a());
            this.f11599a0 = iVarC6;
            this.f11601b0 = up.g.a(fVar2, iVarC6);
        }

        public final void o(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            this.f11604c0 = w(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            this.f11607d0 = NetworkCoreModule_KeyInflectionFactory.create(networkCoreModule);
            this.f11610e0 = NetworkCoreModule_UseServerStylesFactory.create(networkCoreModule);
            this.f11613f0 = u(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            wn.a0 a0VarA = wn.a0.a(this.f11660v);
            this.f11616g0 = a0VarA;
            this.f11619h0 = dt.c.c(wn.f.b(eVar2, a0VarA));
            wn.s sVarA = wn.s.a(this.f11660v);
            this.f11622i0 = sVarA;
            this.f11625j0 = dt.c.c(wn.h.a(eVar2, sVarA));
            lp.d dVarA = lp.d.a(this.f11660v);
            this.f11628k0 = dVarA;
            lp.f fVarA = lp.f.a(dVarA);
            this.f11631l0 = fVarA;
            dt.i<lp.e.a> iVarA = lp.g.a(fVarA);
            this.f11634m0 = iVarA;
            NetworkCoreModule_OkhttpClientFactory networkCoreModule_OkhttpClientFactoryCreate = NetworkCoreModule_OkhttpClientFactory.create(networkCoreModule, this.f11604c0, this.f11613f0, this.f11660v, this.f11619h0, this.f11625j0, iVarA, this.I);
            this.f11637n0 = networkCoreModule_OkhttpClientFactoryCreate;
            dt.i<hv.y> iVarC = dt.c.c(NetworkCoreModule_RetrofitFactory.create(networkCoreModule, this.X, networkCoreModule_OkhttpClientFactoryCreate, this.D));
            this.f11640o0 = iVarC;
            dt.i<ep.w> iVarC2 = dt.c.c(ep.j.a(fVar, iVarC));
            this.f11643p0 = iVarC2;
            this.f11646q0 = dt.c.c(xo.j.a(iVarC2, this.D, this.f11628k0, this.H));
            this.f11649r0 = dt.c.c(xo.q.a(nVar, this.f11660v));
            this.f11652s0 = bp.e.a(cVar2);
            this.f11655t0 = dt.c.c(ep.g.a(fVar, this.f11640o0));
            bp.k kVarA = bp.k.a(this.f11663w);
            this.f11658u0 = kVarA;
            dt.i<com.withpersona.sdk2.inquiry.internal.fallbackmode.i.a> iVarB = com.withpersona.sdk2.inquiry.internal.fallbackmode.j.b(kVarA);
            this.f11661v0 = iVarB;
            this.f11664w0 = com.withpersona.sdk2.inquiry.internal.fallbackmode.e.a(this.f11655t0, this.D, iVarB);
            com.withpersona.sdk2.inquiry.internal.fallbackmode.g gVarA = com.withpersona.sdk2.inquiry.internal.fallbackmode.g.a(this.D, this.f11660v, this.f11661v0);
            this.f11667x0 = gVarA;
            dt.i<com.withpersona.sdk2.inquiry.internal.fallbackmode.f.a> iVarB2 = com.withpersona.sdk2.inquiry.internal.fallbackmode.h.b(gVarA);
            this.f11670y0 = iVarB2;
            this.f11673z0 = com.withpersona.sdk2.inquiry.internal.fallbackmode.b.b(aVar2, this.f11664w0, iVarB2);
            this.A0 = bp.d.a(cVar2);
        }

        public final void p(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            dt.i<bp.i> iVarC = dt.c.c(bp.j.a(this.f11652s0, this.f11673z0, this.A0, this.D));
            this.B0 = iVarC;
            this.C0 = dt.c.c(bp.f.a(cVar2, iVarC));
            this.D0 = dt.c.c(f0.a(c0Var));
            nq.g gVarA = nq.g.a(fVar3);
            this.E0 = gVarA;
            this.F0 = dt.c.c(nq.d.a(gVarA, this.H));
            xo.o oVarB = xo.o.b(nVar);
            this.G0 = oVarB;
            this.H0 = dt.c.c(ir.e.a(this.f11637n0, oVarB, this.H));
            this.I0 = new a();
            this.J0 = new b();
            this.K0 = new c();
            this.L0 = new d();
            this.M0 = new C0217e();
            this.N0 = new C0218f();
            this.O0 = new g();
            this.P0 = new h();
            this.Q0 = dt.c.c(rp.f.a());
            dt.i<UploadService> iVarC2 = dt.c.c(ep.t.a(fVar, this.f11640o0));
            this.R0 = iVarC2;
            this.S0 = dt.c.c(zp.a.a(this.f11663w, iVarC2, this.H));
            this.T0 = dt.c.c(ep.p.a(fVar, this.f11640o0));
            wn.q qVarA = wn.q.a(this.f11660v);
            this.U0 = qVarA;
            this.V0 = dt.c.c(wn.g.a(eVar2, qVarA));
            dt.i<cp.d> iVarC3 = dt.c.c(cp.e.a());
            this.W0 = iVarC3;
            this.X0 = dt.c.c(cp.c.a(this.f11660v, this.f11634m0, iVarC3, this.F));
            ep.n nVarA = ep.n.a(fVar);
            this.Y0 = nVarA;
            this.Z0 = dt.c.c(ep.d.a(this.f11660v, this.f11643p0, this.T0, this.B0, this.f11599a0, this.V0, this.X0, nVarA));
        }

        public final void q(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            this.f11600a1 = dt.c.c(qq.a.a(this.f11663w));
            this.f11602b1 = dt.c.c(xo.o0.a(this.f11660v, this.H));
            this.f11605c1 = dt.c.c(ep.i.a(fVar, this.f11640o0));
            this.f11608d1 = kq.c.a(bVar);
            this.f11611e1 = dt.c.c(e0.a(c0Var, pq.d.a()));
            dt.i<jn.b> iVarC = dt.c.c(jn.c.a(this.f11660v));
            this.f11614f1 = iVarC;
            this.f11617g1 = dn.l.b(kVar, iVarC);
            this.f11620h1 = dt.c.c(kp.t.a(qVar));
            this.f11623i1 = dt.c.c(sq.b.a(this.E0, this.f11666x, this.H));
            this.f11626j1 = dt.c.c(kp.z.a(wVar));
            this.f11629k1 = dt.c.c(kp.f0.a(c0Var2));
            this.f11632l1 = dt.c.c(ep.v.a(fVar, this.f11640o0));
            this.f11635m1 = dt.c.c(ep.q.a(fVar, this.f11640o0));
            this.f11638n1 = jq.f.a(cVar3);
            this.f11641o1 = dt.c.c(op.h.a(eVar));
            this.f11644p1 = dt.c.c(jp.f.a(cVar));
            this.f11647q1 = dt.c.c(ep.s.a(fVar, this.f11640o0));
            this.f11650r1 = dt.c.c(kp.g.a(dVar));
            this.f11653s1 = dt.c.c(kp.n.a(iVar));
            this.f11656t1 = dt.c.c(kp.p.a(iVar));
            this.f11659u1 = dt.c.c(kp.o.a(iVar));
            this.f11662v1 = dt.c.c(ep.f.a(fVar, this.f11640o0));
            this.f11665w1 = dt.c.c(hq.d0.a(c0Var, hq.y.a()));
            this.f11668x1 = dt.c.c(ep.h.a(fVar, this.f11640o0));
            this.f11671y1 = xo.l0.a(this.f11660v, xq.b.a(), this.f11643p0);
        }

        public final void r(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            this.f11674z1 = xo.j0.a(this.f11671y1, this.f11638n1);
            wn.c0 c0VarA = wn.c0.a(this.f11660v);
            this.A1 = c0VarA;
            dt.i<wn.m> iVarC = dt.c.c(wn.j.a(eVar2, c0VarA));
            this.B1 = iVarC;
            wn.u uVarA = wn.u.a(this.f11660v, iVarC);
            this.C1 = uVarA;
            this.D1 = dt.c.c(wn.i.a(eVar2, uVarA));
            this.E1 = xo.r.a(nVar);
        }

        public Map<Class<?>, ft.a<bt.a.InterfaceC0090a<?>>> s() {
            return t();
        }

        public Map t() {
            dt.f fVarB = dt.f.b(8);
            fVarB.c(GovernmentIdStepFragment.class, this.I0);
            fVarB.c(UiStepFragment.class, this.J0);
            fVarB.c(SelfieStepFragment.class, this.K0);
            fVarB.c(DocumentStepFragment.class, this.L0);
            fVarB.c(PermissionRequestFragment.class, this.M0);
            fVarB.c(dp.f.class, this.N0);
            fVarB.c(hp.b.class, this.O0);
            fVarB.c(IntegrationStepFragment.class, this.P0);
            return fVarB.a();
        }

        public dt.g<String, String> u(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            dt.g.b bVarB = dt.g.b(3);
            bVarB.c("User-Agent", NetworkInquiryModule_UserAgentFactory.create());
            bVarB.c("Key-Inflection", this.f11607d0);
            bVarB.c("Persona-Use-Mobile-Server-Styles", this.f11610e0);
            return bVarB.b();
        }

        public dt.j<eo.d> v(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            dt.j.b bVarA = dt.j.a(12, 0);
            bVarA.b(this.f11621i);
            bVarA.b(this.f11624j);
            bVarA.b(this.f11627k);
            bVarA.b(this.f11630l);
            bVarA.b(this.f11633m);
            bVarA.b(this.f11636n);
            bVarA.b(this.f11639o);
            bVarA.b(this.f11642p);
            bVarA.b(this.f11645q);
            bVarA.b(this.f11648r);
            bVarA.b(this.f11651s);
            bVarA.b(this.f11654t);
            return bVarA.c();
        }

        public dt.j<Interceptor> w(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            dt.j.b bVarA = dt.j.a(3, 0);
            bVarA.b(this.Y);
            bVarA.b(this.Z);
            bVarA.b(this.f11601b0);
            return bVarA.c();
        }

        public dt.j<JsonAdapterBinding<?>> x(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            dt.j.b bVarA = dt.j.a(0, 1);
            bVarA.a(ep.k.a());
            return bVarA.c();
        }

        public dt.j<sm.h.e> y(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            dt.j.b bVarA = dt.j.a(0, 5);
            bVarA.a(NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory.create());
            bVarA.a(NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory.create());
            bVarA.a(ep.m.a());
            bVarA.a(go.l.a());
            bVarA.a(this.B);
            return bVarA.c();
        }

        public dt.j<Object> z(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            dt.j.b bVarA = dt.j.a(0, 2);
            bVarA.a(ep.l.a());
            bVarA.a(b2.a());
            return bVarA.c();
        }
    }

    public static final class g implements com.withpersona.sdk2.inquiry.internal.workflows.a.InterfaceC0225a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11683a;

        @Override // com.withpersona.sdk2.inquiry.internal.workflows.a.InterfaceC0225a
        public com.withpersona.sdk2.inquiry.internal.workflows.a a() {
            return new h(this.f11683a);
        }

        public g(f fVar) {
            this.f11683a = fVar;
        }
    }

    public static final class h implements com.withpersona.sdk2.inquiry.internal.workflows.a {
        public dt.i<fn.c.a> A;
        public fo.c A0;
        public dt.i<so.j> B;
        public dt.i<fo.b.a> B0;
        public dt.i<so.v> C;
        public dt.i<xo.f> C0;
        public dt.i<com.withpersona.sdk2.inquiry.permissions.d.a> D;
        public fp.f0 D0;
        public pp.j E;
        public dt.i<fp.e0.b> E0;
        public dt.i<com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0228a> F;
        public ip.c F0;
        public dt.i<DeviceFeatureRequestWorkflow> G;
        public dt.i<com.withpersona.sdk2.inquiry.internal.workflows.c.a> G0;
        public dt.i<PermissionRequestWorkflow> H;
        public ip.d H0;
        public com.withpersona.sdk2.inquiry.governmentid.g I;
        public dt.i<com.withpersona.sdk2.inquiry.internal.workflows.e.a> I0;
        public dt.i<GovernmentIdAnalyzeWorker.a> J;
        public mo.b K;
        public dt.i<GovernmentIdHintWorker.b> L;
        public dt.i<rr.b.a> M;
        public dt.i<t0> N;
        public dt.i<AutoClassifyWorker.b> O;
        public dt.i<ho.n> P;
        public dt.i<GovernmentIdWorkflow> Q;
        public aq.c R;
        public dt.i<aq.b.a> S;
        public wp.v T;
        public dt.i<com.withpersona.sdk2.inquiry.selfie.e.b> U;
        public dt.i<fq.j> V;
        public bq.b W;
        public dt.i<bq.a.b> X;
        public dt.i<com.withpersona.sdk2.inquiry.selfie.g> Y;
        public dt.i<SelfieWorkflow> Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11684a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public op.k f11685a0;
        public final h b = this;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.nfc.b.a> f11686b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public xo.d f11687c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public jp.o f11688c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.internal.c.a> f11689d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public dt.i<jp.n.a> f11690d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public xo.c f11691e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public mr.l1 f11692e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.internal.a.InterfaceC0215a> f11693f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.ui.d.a> f11694f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public xo.c0 f11695g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public k6 f11696g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.internal.k.b> f11697h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.ui.k.a> f11698h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public xo.n0 f11699i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.ui.network.b.a> f11700i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.internal.r.a> f11701j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public dt.i<or.a.C0489a> f11702j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.internal.t f11703k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.ui.h.a> f11704k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public dt.i<TransitionWorker.a> f11705l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.ui.a> f11706l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public xo.p0 f11707m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public dt.i<UiWorkflow> f11708m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public dt.i<v.a> f11709n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.document.a> f11710n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public xo.k f11711o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.document.i.b> f11712o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.internal.f.a> f11713p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.document.network.a.C0182a> f11714p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public h0 f11715q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.document.network.e.a> f11716q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.internal.m.a> f11717r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.document.network.c.a> f11718r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public no.d f11719s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public dt.i<zn.a.C0693a> f11720s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public dt.i<no.c.a> f11721t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.document.network.g.a> f11722t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.governmentid.e> f11723u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public dt.i<DocumentWorkflow> f11724u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public dn.t f11725v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public vo.c f11726v0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.camera.e.a> f11727w;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.integration.a.InterfaceC0207a> f11728w0;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public fn.c0 f11729x;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public dt.i<IntegrationWorkflow> f11730x0;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public dt.i<b0.a> f11731y;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public xo.i0 f11732y0;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public fn.e f11733z;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.internal.o.a> f11734z0;

        public h(f fVar) {
            this.f11684a = fVar;
            b();
            c();
            d();
            e();
        }

        @Override // com.withpersona.sdk2.inquiry.internal.workflows.a
        public void a(InquiryWorkflowFragment inquiryWorkflowFragment) {
            f(inquiryWorkflowFragment);
        }

        public final void b() {
            xo.d dVarA = xo.d.a(this.f11684a.Z0);
            this.f11687c = dVarA;
            this.f11689d = com.withpersona.sdk2.inquiry.internal.d.b(dVarA);
            xo.c cVarA = xo.c.a(this.f11684a.Z0);
            this.f11691e = cVarA;
            this.f11693f = com.withpersona.sdk2.inquiry.internal.b.b(cVarA);
            f fVar = this.f11684a;
            xo.c0 c0VarA = xo.c0.a(fVar.f11643p0, fVar.V0, fVar.f11599a0, fVar.B0, fVar.H0, fVar.f11600a1, fVar.Z0);
            this.f11695g = c0VarA;
            this.f11697h = com.withpersona.sdk2.inquiry.internal.l.b(c0VarA);
            xo.n0 n0VarA = xo.n0.a(this.f11684a.Z0);
            this.f11699i = n0VarA;
            this.f11701j = com.withpersona.sdk2.inquiry.internal.s.b(n0VarA);
            f fVar2 = this.f11684a;
            com.withpersona.sdk2.inquiry.internal.t tVarA = com.withpersona.sdk2.inquiry.internal.t.a(fVar2.f11643p0, fVar2.C0, fVar2.f11602b1, fVar2.f11666x, fVar2.f11660v);
            this.f11703k = tVarA;
            this.f11705l = u.b(tVarA);
            xo.p0 p0VarA = xo.p0.a(this.f11684a.Z0);
            this.f11707m = p0VarA;
            this.f11709n = w.b(p0VarA);
            xo.k kVarA = xo.k.a(this.f11684a.Z0);
            this.f11711o = kVarA;
            this.f11713p = com.withpersona.sdk2.inquiry.internal.g.a(kVarA);
            h0 h0VarA = h0.a(this.f11684a.Z0);
            this.f11715q = h0VarA;
            this.f11717r = com.withpersona.sdk2.inquiry.internal.n.a(h0VarA);
            f fVar3 = this.f11684a;
            no.d dVarA2 = no.d.a(fVar3.f11660v, fVar3.f11605c1, fVar3.f11608d1, fVar3.C0, fVar3.f11611e1, fVar3.f11617g1, fVar3.L);
            this.f11719s = dVarA2;
            this.f11721t = no.e.b(dVarA2);
            f fVar4 = this.f11684a;
            this.f11723u = go.e.a(fVar4.f11620h1, fVar4.f11660v, fVar4.f11615g);
            f fVar5 = this.f11684a;
            dn.t tVarA2 = dn.t.a(fVar5.f11660v, fVar5.f11617g1, fVar5.f11615g);
            this.f11725v = tVarA2;
            this.f11727w = com.withpersona.sdk2.camera.f.b(tVarA2);
            f fVar6 = this.f11684a;
            fn.c0 c0VarA2 = fn.c0.a(fVar6.f11660v, fVar6.f11617g1, fVar6.f11615g, fVar6.R, fVar6.G, fVar6.L, fVar6.F0, fVar6.f11666x);
            this.f11729x = c0VarA2;
            dt.i<b0.a> iVarB = d0.b(c0VarA2);
            this.f11731y = iVarB;
            f fVar7 = this.f11684a;
            fn.e eVarA = fn.e.a(iVarB, fVar7.R, fVar7.H, fVar7.L);
            this.f11733z = eVarA;
            this.A = fn.f.b(eVarA);
        }

        public final void c() {
            f fVar = this.f11684a;
            this.B = so.k.a(fVar.f11660v, this.f11727w, this.A, fVar.f11623i1);
            f fVar2 = this.f11684a;
            this.C = so.w.a(fVar2.f11660v, this.f11727w, this.A, fVar2.f11623i1, fVar2.L);
            f fVar3 = this.f11684a;
            this.D = com.withpersona.sdk2.inquiry.permissions.e.a(fVar3.f11660v, fVar3.f11626j1, fVar3.L);
            f fVar4 = this.f11684a;
            pp.j jVarA = pp.j.a(fVar4.f11629k1, fVar4.f11660v);
            this.E = jVarA;
            dt.i<com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0228a> iVarB = com.withpersona.sdk2.inquiry.permissions.b.b(jVarA);
            this.F = iVarB;
            com.withpersona.sdk2.inquiry.permissions.c cVarA = com.withpersona.sdk2.inquiry.permissions.c.a(this.f11684a.f11660v, iVarB);
            this.G = cVarA;
            f fVar5 = this.f11684a;
            this.H = com.withpersona.sdk2.inquiry.permissions.f.a(fVar5.f11660v, this.D, cVarA, fVar5.L);
            f fVar6 = this.f11684a;
            com.withpersona.sdk2.inquiry.governmentid.g gVarA = com.withpersona.sdk2.inquiry.governmentid.g.a(fVar6.f11660v, fVar6.f11612f, fVar6.f11615g);
            this.I = gVarA;
            this.J = com.withpersona.sdk2.inquiry.governmentid.h.b(gVarA);
            f fVar7 = this.f11684a;
            mo.b bVarA = mo.b.a(fVar7.f11660v, fVar7.f11612f);
            this.K = bVarA;
            this.L = mo.c.b(bVarA);
            rr.c cVarA2 = rr.c.a(this.f11684a.f11632l1);
            this.M = cVarA2;
            f fVar8 = this.f11684a;
            this.N = u0.a(fVar8.f11660v, this.H, this.J, this.L, cVarA2, this.f11727w, this.A, fVar8.f11623i1, fVar8.L);
            f fVar9 = this.f11684a;
            this.O = com.withpersona.sdk2.inquiry.governmentid.network.a.a(fVar9.f11605c1, fVar9.f11611e1);
            ho.p pVarA = ho.p.a(this.f11684a.f11623i1);
            this.P = pVarA;
            f fVar10 = this.f11684a;
            this.Q = h2.a(fVar10.f11660v, fVar10.f11649r0, this.f11721t, this.f11723u, this.B, this.C, this.N, this.O, pVarA, fVar10.f11617g1, fVar10.f11623i1, fVar10.F0, fVar10.L, fVar10.f11600a1);
            f fVar11 = this.f11684a;
            aq.c cVarA3 = aq.c.a(fVar11.f11660v, fVar11.f11635m1, fVar11.f11608d1, fVar11.C0, fVar11.f11611e1, fVar11.f11617g1, fVar11.L, fVar11.S0);
            this.R = cVarA3;
            this.S = aq.d.b(cVarA3);
            f fVar12 = this.f11684a;
            wp.v vVarA = wp.v.a(fVar12.Q, fVar12.f11615g);
            this.T = vVarA;
            this.U = com.withpersona.sdk2.inquiry.selfie.f.b(vVarA);
            f fVar13 = this.f11684a;
            this.V = fq.k.a(fVar13.f11660v, this.f11727w, this.A, fVar13.f11623i1, fVar13.f11666x);
            f fVar14 = this.f11684a;
            bq.b bVarA2 = bq.b.a(fVar14.f11663w, fVar14.f11635m1, fVar14.H, fVar14.f11638n1);
            this.W = bVarA2;
            this.X = bq.c.b(bVarA2);
            f fVar15 = this.f11684a;
            wp.w wVarA = wp.w.a(fVar15.F0, fVar15.L);
            this.Y = wVarA;
            f fVar16 = this.f11684a;
            this.Z = com.withpersona.sdk2.inquiry.selfie.q.a(fVar16.f11660v, this.S, this.M, this.U, this.H, this.V, this.f11727w, this.A, fVar16.f11617g1, fVar16.f11623i1, fVar16.S0, this.X, fVar16.f11600a1, wVarA, fVar16.f11615g, fVar16.f11666x);
        }

        public final void d() {
            f fVar = this.f11684a;
            op.k kVarA = op.k.a(fVar.f11641o1, fVar.f11660v, fVar.f11599a0, fVar.f11615g, fVar.f11666x);
            this.f11685a0 = kVarA;
            this.f11686b0 = com.withpersona.sdk2.inquiry.nfc.c.b(kVarA);
            f fVar2 = this.f11684a;
            jp.o oVarA = jp.o.a(fVar2.f11644p1, fVar2.f11660v, fVar2.f11599a0);
            this.f11688c0 = oVarA;
            this.f11690d0 = jp.p.b(oVarA);
            f fVar3 = this.f11684a;
            mr.l1 l1VarA = mr.l1.a(fVar3.f11647q1, fVar3.V0, fVar3.f11650r1);
            this.f11692e0 = l1VarA;
            this.f11694f0 = com.withpersona.sdk2.inquiry.ui.e.b(l1VarA);
            f fVar4 = this.f11684a;
            k6 k6VarA = k6.a(fVar4.f11650r1, fVar4.f11647q1, fVar4.D);
            this.f11696g0 = k6VarA;
            this.f11698h0 = com.withpersona.sdk2.inquiry.ui.l.b(k6VarA);
            this.f11700i0 = com.withpersona.sdk2.inquiry.ui.network.c.a(this.f11684a.f11647q1);
            this.f11702j0 = or.b.a(this.f11684a.f11647q1);
            f fVar5 = this.f11684a;
            this.f11704k0 = com.withpersona.sdk2.inquiry.ui.i.a(fVar5.f11653s1, fVar5.f11620h1, fVar5.f11660v);
            com.withpersona.sdk2.inquiry.ui.c cVarA = com.withpersona.sdk2.inquiry.ui.c.a(this.f11684a.f11660v, this.f11700i0, this.f11702j0, xq.b.a(), this.f11704k0);
            this.f11706l0 = cVarA;
            f fVar6 = this.f11684a;
            this.f11708m0 = com.withpersona.sdk2.inquiry.ui.j.a(fVar6.f11660v, this.f11686b0, this.f11690d0, fVar6.f11599a0, this.f11694f0, this.f11698h0, fVar6.f11623i1, this.H, cVarA, fVar6.F0, fVar6.f11666x, fVar6.L);
            f fVar7 = this.f11684a;
            this.f11710n0 = xn.b.a(fVar7.f11656t1, fVar7.f11660v, fVar7.f11615g);
            f fVar8 = this.f11684a;
            this.f11712o0 = com.withpersona.sdk2.inquiry.document.j.a(fVar8.f11653s1, fVar8.f11659u1, fVar8.f11660v, fVar8.f11615g);
            this.f11714p0 = com.withpersona.sdk2.inquiry.document.network.b.a(this.f11684a.f11662v1);
            this.f11716q0 = com.withpersona.sdk2.inquiry.document.network.f.a(this.f11684a.f11662v1);
            f fVar9 = this.f11684a;
            this.f11718r0 = com.withpersona.sdk2.inquiry.document.network.d.a(fVar9.f11662v1, fVar9.f11665w1);
            this.f11720s0 = zn.b.a(this.f11684a.f11662v1);
            f fVar10 = this.f11684a;
            com.withpersona.sdk2.inquiry.document.network.h hVarA = com.withpersona.sdk2.inquiry.document.network.h.a(fVar10.f11662v1, fVar10.C0, fVar10.f11608d1);
            this.f11722t0 = hVarA;
            f fVar11 = this.f11684a;
            this.f11724u0 = com.withpersona.sdk2.inquiry.document.h.a(fVar11.f11649r0, fVar11.f11660v, this.H, this.f11710n0, this.f11712o0, this.f11714p0, this.f11716q0, this.f11718r0, this.f11720s0, hVarA, fVar11.f11623i1, fVar11.F0, fVar11.L);
            f fVar12 = this.f11684a;
            vo.c cVarA2 = vo.c.a(fVar12.f11660v, fVar12.f11650r1);
            this.f11726v0 = cVarA2;
            dt.i<com.withpersona.sdk2.inquiry.integration.a.InterfaceC0207a> iVarB = com.withpersona.sdk2.inquiry.integration.b.b(cVarA2);
            this.f11728w0 = iVarB;
            f fVar13 = this.f11684a;
            this.f11730x0 = com.withpersona.sdk2.inquiry.integration.c.a(fVar13.f11660v, fVar13.f11623i1, iVarB, fVar13.L);
            this.f11732y0 = xo.i0.a(this.f11684a.f11602b1);
        }

        public final void e() {
            this.f11734z0 = com.withpersona.sdk2.inquiry.internal.p.b(this.f11732y0);
            f fVar = this.f11684a;
            fo.c cVarA = fo.c.a(fVar.f11666x, fVar.f11668x1);
            this.A0 = cVarA;
            this.B0 = fo.d.a(cVarA);
            f fVar2 = this.f11684a;
            xo.g gVarA = xo.g.a(fVar2.D1, fVar2.Z0, fVar2.f11638n1);
            this.C0 = gVarA;
            dt.i<com.withpersona.sdk2.inquiry.internal.c.a> iVar = this.f11689d;
            dt.i<com.withpersona.sdk2.inquiry.internal.a.InterfaceC0215a> iVar2 = this.f11693f;
            dt.i<com.withpersona.sdk2.inquiry.internal.k.b> iVar3 = this.f11697h;
            dt.i<com.withpersona.sdk2.inquiry.internal.r.a> iVar4 = this.f11701j;
            dt.i<TransitionWorker.a> iVar5 = this.f11705l;
            dt.i<v.a> iVar6 = this.f11709n;
            dt.i<com.withpersona.sdk2.inquiry.internal.f.a> iVar7 = this.f11713p;
            dt.i<com.withpersona.sdk2.inquiry.internal.m.a> iVar8 = this.f11717r;
            dt.i<GovernmentIdWorkflow> iVar9 = this.Q;
            dt.i<SelfieWorkflow> iVar10 = this.Z;
            dt.i<UiWorkflow> iVar11 = this.f11708m0;
            dt.i<DocumentWorkflow> iVar12 = this.f11724u0;
            dt.i<IntegrationWorkflow> iVar13 = this.f11730x0;
            f fVar3 = this.f11684a;
            fp.f0 f0VarA = fp.f0.a(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, fVar3.E0, fVar3.f11623i1, fVar3.F0, fVar3.f11602b1, this.f11734z0, this.B0, fVar3.f11666x, fVar3.L, fVar3.E, fVar3.f11674z1, gVarA, fVar3.E1);
            this.D0 = f0VarA;
            dt.i<fp.e0.b> iVarB = g0.b(f0VarA);
            this.E0 = iVarB;
            ip.c cVarA2 = ip.c.a(iVarB);
            this.F0 = cVarA2;
            this.G0 = com.withpersona.sdk2.inquiry.internal.workflows.d.b(cVarA2);
            ip.d dVarA = ip.d.a();
            this.H0 = dVarA;
            this.I0 = com.withpersona.sdk2.inquiry.internal.workflows.f.b(dVarA);
        }

        public final InquiryWorkflowFragment f(InquiryWorkflowFragment inquiryWorkflowFragment) {
            com.withpersona.sdk2.inquiry.internal.workflows.b.b(inquiryWorkflowFragment, this.f11684a);
            com.withpersona.sdk2.inquiry.internal.workflows.b.e(inquiryWorkflowFragment, this.G0.get());
            com.withpersona.sdk2.inquiry.internal.workflows.b.f(inquiryWorkflowFragment, this.I0.get());
            com.withpersona.sdk2.inquiry.internal.workflows.b.d(inquiryWorkflowFragment, this.f11684a.D0.get());
            com.withpersona.sdk2.inquiry.internal.workflows.b.a(inquiryWorkflowFragment, this.f11684a.f11666x.get());
            com.withpersona.sdk2.inquiry.internal.workflows.b.c(inquiryWorkflowFragment, g());
            return inquiryWorkflowFragment;
        }

        public fp.n0 g() {
            return new fp.n0(this.f11684a.f11599a0.get());
        }
    }

    public static final class i implements vo.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11735a;

        @Override // bt.a.InterfaceC0090a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public vo.d a(IntegrationStepFragment integrationStepFragment) {
            dt.h.b(integrationStepFragment);
            return new j(this.f11735a, integrationStepFragment);
        }

        public i(f fVar) {
            this.f11735a = fVar;
        }
    }

    public static final class j implements vo.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11736a;
        public final j b = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public vo.c f11737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.integration.a.InterfaceC0207a> f11738d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public wo.h f11739e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.integration.fragment.b.c> f11740f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.integration.fragment.e f11741g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.integration.fragment.d.a> f11742h;

        public j(f fVar, IntegrationStepFragment integrationStepFragment) {
            this.f11736a = fVar;
            b(integrationStepFragment);
        }

        public final void b(IntegrationStepFragment integrationStepFragment) {
            f fVar = this.f11736a;
            vo.c cVarA = vo.c.a(fVar.f11660v, fVar.f11650r1);
            this.f11737c = cVarA;
            dt.i<com.withpersona.sdk2.inquiry.integration.a.InterfaceC0207a> iVarB = com.withpersona.sdk2.inquiry.integration.b.b(cVarA);
            this.f11738d = iVarB;
            f fVar2 = this.f11736a;
            wo.h hVarA = wo.h.a(fVar2.f11660v, fVar2.f11623i1, iVarB, fVar2.L, fVar2.E1);
            this.f11739e = hVarA;
            dt.i<com.withpersona.sdk2.inquiry.integration.fragment.b.c> iVarB2 = com.withpersona.sdk2.inquiry.integration.fragment.c.b(hVarA);
            this.f11740f = iVarB2;
            com.withpersona.sdk2.inquiry.integration.fragment.e eVarA = com.withpersona.sdk2.inquiry.integration.fragment.e.a(iVarB2);
            this.f11741g = eVarA;
            this.f11742h = com.withpersona.sdk2.inquiry.integration.fragment.f.b(eVarA);
        }

        @Override // bt.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(IntegrationStepFragment integrationStepFragment) {
            d(integrationStepFragment);
        }

        public final IntegrationStepFragment d(IntegrationStepFragment integrationStepFragment) {
            mq.b.a(integrationStepFragment, this.f11736a.a());
            com.withpersona.sdk2.inquiry.integration.fragment.a.b(integrationStepFragment, this.f11742h.get());
            com.withpersona.sdk2.inquiry.integration.fragment.a.a(integrationStepFragment, this.f11736a.D0.get());
            return integrationStepFragment;
        }
    }

    public static final class k implements dp.g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11743a;

        @Override // bt.a.InterfaceC0090a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public dp.g a(dp.f fVar) {
            dt.h.b(fVar);
            return new l(this.f11743a, fVar);
        }

        public k(f fVar) {
            this.f11743a = fVar;
        }
    }

    public static final class l implements dp.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11744a;
        public final l b = this;

        public l(f fVar, dp.f fVar2) {
            this.f11744a = fVar;
        }

        @Override // bt.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(dp.f fVar) {
            c(fVar);
        }

        public final dp.f c(dp.f fVar) {
            mq.b.a(fVar, this.f11744a.a());
            dp.h.a(fVar, this.f11744a.D0.get());
            return fVar;
        }
    }

    public static final class m implements l1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11745a;

        @Override // bt.a.InterfaceC0090a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l1 a(PermissionRequestFragment permissionRequestFragment) {
            dt.h.b(permissionRequestFragment);
            return new n(this.f11745a, permissionRequestFragment);
        }

        public m(f fVar) {
            this.f11745a = fVar;
        }
    }

    public static final class n implements l1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11746a;
        public final n b = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.permissions.d.a> f11747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public pp.j f11748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0228a> f11749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public sp.l f11750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public dt.i<PermissionRequestStateManager.c> f11751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public rp.c f11752h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.c.a> f11753i;

        public n(f fVar, PermissionRequestFragment permissionRequestFragment) {
            this.f11746a = fVar;
            b(permissionRequestFragment);
        }

        public final void b(PermissionRequestFragment permissionRequestFragment) {
            f fVar = this.f11746a;
            this.f11747c = com.withpersona.sdk2.inquiry.permissions.e.a(fVar.f11660v, fVar.f11626j1, fVar.L);
            f fVar2 = this.f11746a;
            pp.j jVarA = pp.j.a(fVar2.f11629k1, fVar2.f11660v);
            this.f11748d = jVarA;
            dt.i<com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0228a> iVarB = com.withpersona.sdk2.inquiry.permissions.b.b(jVarA);
            this.f11749e = iVarB;
            f fVar3 = this.f11746a;
            sp.l lVarA = sp.l.a(fVar3.f11660v, this.f11747c, iVarB, fVar3.L, fVar3.E1);
            this.f11750f = lVarA;
            dt.i<PermissionRequestStateManager.c> iVarB2 = com.withpersona.sdk2.inquiry.permissions.state.a.b(lVarA);
            this.f11751g = iVarB2;
            rp.c cVarA = rp.c.a(iVarB2);
            this.f11752h = cVarA;
            this.f11753i = com.withpersona.sdk2.inquiry.permissions.permissionRequest.d.b(cVarA);
        }

        @Override // bt.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(PermissionRequestFragment permissionRequestFragment) {
            d(permissionRequestFragment);
        }

        public final PermissionRequestFragment d(PermissionRequestFragment permissionRequestFragment) {
            mq.b.a(permissionRequestFragment, this.f11746a.a());
            com.withpersona.sdk2.inquiry.permissions.permissionRequest.a.a(permissionRequestFragment, this.f11753i.get());
            return permissionRequestFragment;
        }
    }

    public static final class o implements wp.c0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11754a;

        @Override // bt.a.InterfaceC0090a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public wp.c0 a(SelfieStepFragment selfieStepFragment) {
            dt.h.b(selfieStepFragment);
            return new p(this.f11754a, selfieStepFragment);
        }

        public o(f fVar) {
            this.f11754a = fVar;
        }
    }

    public static final class p implements wp.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11755a;
        public final p b = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public aq.c f11756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public dt.i<aq.b.a> f11757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public dt.i<rr.b.a> f11758e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public wp.v f11759f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.selfie.e.b> f11760g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public rp.d f11761h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> f11762i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public dn.t f11763j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.camera.e.a> f11764k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public fn.c0 f11765l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public dt.i<b0.a> f11766m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public fn.e f11767n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public dt.i<fn.c.a> f11768o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public bq.b f11769p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public dt.i<bq.a.b> f11770q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.selfie.g> f11771r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public m2 f11772s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public dt.i<k2.d> f11773t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public cq.l f11774u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.selfie.selfieStep.b.a> f11775v;

        public p(f fVar, SelfieStepFragment selfieStepFragment) {
            this.f11755a = fVar;
            b(selfieStepFragment);
        }

        public final void b(SelfieStepFragment selfieStepFragment) {
            f fVar = this.f11755a;
            aq.c cVarA = aq.c.a(fVar.f11660v, fVar.f11635m1, fVar.f11608d1, fVar.C0, fVar.f11611e1, fVar.f11617g1, fVar.L, fVar.S0);
            this.f11756c = cVarA;
            this.f11757d = aq.d.b(cVarA);
            this.f11758e = rr.c.a(this.f11755a.f11632l1);
            f fVar2 = this.f11755a;
            wp.v vVarA = wp.v.a(fVar2.Q, fVar2.f11615g);
            this.f11759f = vVarA;
            this.f11760g = com.withpersona.sdk2.inquiry.selfie.f.b(vVarA);
            rp.d dVarA = rp.d.a(this.f11755a.Q0);
            this.f11761h = dVarA;
            this.f11762i = com.withpersona.sdk2.inquiry.permissions.permissionRequest.f.b(dVarA);
            f fVar3 = this.f11755a;
            dn.t tVarA = dn.t.a(fVar3.f11660v, fVar3.f11617g1, fVar3.f11615g);
            this.f11763j = tVarA;
            this.f11764k = com.withpersona.sdk2.camera.f.b(tVarA);
            f fVar4 = this.f11755a;
            fn.c0 c0VarA = fn.c0.a(fVar4.f11660v, fVar4.f11617g1, fVar4.f11615g, fVar4.R, fVar4.G, fVar4.L, fVar4.F0, fVar4.f11666x);
            this.f11765l = c0VarA;
            dt.i<b0.a> iVarB = d0.b(c0VarA);
            this.f11766m = iVarB;
            f fVar5 = this.f11755a;
            fn.e eVarA = fn.e.a(iVarB, fVar5.R, fVar5.H, fVar5.L);
            this.f11767n = eVarA;
            this.f11768o = fn.f.b(eVarA);
            f fVar6 = this.f11755a;
            bq.b bVarA = bq.b.a(fVar6.f11663w, fVar6.f11635m1, fVar6.H, fVar6.f11638n1);
            this.f11769p = bVarA;
            this.f11770q = bq.c.b(bVarA);
            f fVar7 = this.f11755a;
            wp.w wVarA = wp.w.a(fVar7.F0, fVar7.L);
            this.f11771r = wVarA;
            f fVar8 = this.f11755a;
            m2 m2VarA = m2.a(fVar8.f11660v, this.f11757d, this.f11758e, this.f11760g, this.f11762i, this.f11764k, this.f11768o, fVar8.f11617g1, fVar8.f11623i1, fVar8.S0, fVar8.E1, this.f11770q, wVarA, fVar8.f11666x, fVar8.f11615g);
            this.f11772s = m2VarA;
            dt.i<k2.d> iVarB2 = n2.b(m2VarA);
            this.f11773t = iVarB2;
            cq.l lVarA = cq.l.a(iVarB2);
            this.f11774u = lVarA;
            this.f11775v = com.withpersona.sdk2.inquiry.selfie.selfieStep.c.b(lVarA);
        }

        @Override // bt.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(SelfieStepFragment selfieStepFragment) {
            d(selfieStepFragment);
        }

        public final SelfieStepFragment d(SelfieStepFragment selfieStepFragment) {
            mq.b.a(selfieStepFragment, this.f11755a.a());
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.f(selfieStepFragment, this.f11775v.get());
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.a(selfieStepFragment, this.f11755a.l());
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.c(selfieStepFragment, dt.c.b(this.f11755a.Q));
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.e(selfieStepFragment, this.f11755a.L.get());
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.d(selfieStepFragment, this.f11755a.D0.get());
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.b(selfieStepFragment, this.f11755a.f11666x.get());
            return selfieStepFragment;
        }
    }

    public static final class q implements qr.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11776a;

        @Override // bt.a.InterfaceC0090a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public qr.c a(UiStepFragment uiStepFragment) {
            dt.h.b(uiStepFragment);
            return new r(this.f11776a, uiStepFragment);
        }

        public q(f fVar) {
            this.f11776a = fVar;
        }
    }

    public static final class r implements qr.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11777a;
        public final r b = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public op.k f11778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.nfc.b.a> f11779d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public jp.o f11780e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public dt.i<jp.n.a> f11781f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public mr.l1 f11782g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.ui.d.a> f11783h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public k6 f11784i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.ui.k.a> f11785j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.ui.network.b.a> f11786k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public dt.i<or.a.C0489a> f11787l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.ui.h.a> f11788m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public dt.i<pr.e0> f11789n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public rp.d f11790o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> f11791p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public h1 f11792q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public dt.i<g1.e> f11793r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public qr.d f11794s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.ui.uiStep.b.a> f11795t;

        public r(f fVar, UiStepFragment uiStepFragment) {
            this.f11777a = fVar;
            b(uiStepFragment);
        }

        public final void b(UiStepFragment uiStepFragment) {
            f fVar = this.f11777a;
            op.k kVarA = op.k.a(fVar.f11641o1, fVar.f11660v, fVar.f11599a0, fVar.f11615g, fVar.f11666x);
            this.f11778c = kVarA;
            this.f11779d = com.withpersona.sdk2.inquiry.nfc.c.b(kVarA);
            f fVar2 = this.f11777a;
            jp.o oVarA = jp.o.a(fVar2.f11644p1, fVar2.f11660v, fVar2.f11599a0);
            this.f11780e = oVarA;
            this.f11781f = jp.p.b(oVarA);
            f fVar3 = this.f11777a;
            mr.l1 l1VarA = mr.l1.a(fVar3.f11647q1, fVar3.V0, fVar3.f11650r1);
            this.f11782g = l1VarA;
            this.f11783h = com.withpersona.sdk2.inquiry.ui.e.b(l1VarA);
            f fVar4 = this.f11777a;
            k6 k6VarA = k6.a(fVar4.f11650r1, fVar4.f11647q1, fVar4.D);
            this.f11784i = k6VarA;
            this.f11785j = com.withpersona.sdk2.inquiry.ui.l.b(k6VarA);
            this.f11786k = com.withpersona.sdk2.inquiry.ui.network.c.a(this.f11777a.f11647q1);
            this.f11787l = or.b.a(this.f11777a.f11647q1);
            f fVar5 = this.f11777a;
            this.f11788m = com.withpersona.sdk2.inquiry.ui.i.a(fVar5.f11653s1, fVar5.f11620h1, fVar5.f11660v);
            this.f11789n = pr.f0.a(this.f11777a.f11660v, this.f11786k, this.f11787l, xq.b.a(), this.f11788m);
            rp.d dVarA = rp.d.a(this.f11777a.Q0);
            this.f11790o = dVarA;
            dt.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> iVarB = com.withpersona.sdk2.inquiry.permissions.permissionRequest.f.b(dVarA);
            this.f11791p = iVarB;
            f fVar6 = this.f11777a;
            h1 h1VarA = h1.a(fVar6.f11660v, this.f11779d, this.f11781f, fVar6.f11599a0, this.f11783h, this.f11785j, fVar6.f11623i1, this.f11789n, fVar6.F0, fVar6.f11666x, fVar6.L, iVarB, fVar6.E1);
            this.f11792q = h1VarA;
            dt.i<g1.e> iVarB2 = i1.b(h1VarA);
            this.f11793r = iVarB2;
            qr.d dVarA2 = qr.d.a(iVarB2);
            this.f11794s = dVarA2;
            this.f11795t = com.withpersona.sdk2.inquiry.ui.uiStep.c.b(dVarA2);
        }

        @Override // bt.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(UiStepFragment uiStepFragment) {
            d(uiStepFragment);
        }

        public final UiStepFragment d(UiStepFragment uiStepFragment) {
            mq.b.a(uiStepFragment, this.f11777a.a());
            com.withpersona.sdk2.inquiry.ui.uiStep.a.b(uiStepFragment, this.f11795t.get());
            com.withpersona.sdk2.inquiry.ui.uiStep.a.a(uiStepFragment, this.f11777a.D0.get());
            return uiStepFragment;
        }
    }

    public static final class s implements hp.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11796a;

        @Override // bt.a.InterfaceC0090a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public hp.c a(hp.b bVar) {
            dt.h.b(bVar);
            return new t(this.f11796a, bVar);
        }

        public s(f fVar) {
            this.f11796a = fVar;
        }
    }

    public static final class t implements hp.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11797a;
        public final t b = this;

        public t(f fVar, hp.b bVar) {
            this.f11797a = fVar;
        }

        @Override // bt.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(hp.b bVar) {
            c(bVar);
        }

        public final hp.b c(hp.b bVar) {
            mq.b.a(bVar, this.f11797a.a());
            hp.d.b(bVar, this.f11797a.W.get());
            hp.d.a(bVar, this.f11797a.D0.get());
            return bVar;
        }
    }

    public static a a() {
        return new a();
    }
}
