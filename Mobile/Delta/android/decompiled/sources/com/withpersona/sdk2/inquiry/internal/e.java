package com.withpersona.sdk2.inquiry.internal;

import an.a0;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.activity.result.IntentSenderRequest;
import co.c1;
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
import com.withpersona.sdk2.inquiry.tracking.C0696RealTrackingEventsLogger_Factory;
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
import fn.j0;
import fn.o0;
import fn.r0;
import fn.s0;
import fn.x;
import fq.k2;
import fq.m2;
import fq.n2;
import gp.y;
import hn.b0;
import hn.d0;
import hn.i0;
import hp.g0;
import io.h2;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import jq.c0;
import jq.e0;
import jq.f0;
import ko.z;
import ku.l0;
import ku.p0;
import lo.t0;
import lo.u0;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import oo.GovernmentIdHintWorker;
import or.b2;
import or.c2;
import or.k6;
import qo.d1;
import ro.j1;
import ro.k1;
import ro.m0;
import ro.n0;
import ro.v0;
import ro.w0;
import rp.l1;
import rp.m1;
import rr.g1;
import rr.h1;
import rr.i1;
import zo.h0;
import zo.k0;
import zp.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public NetworkCoreModule f11455a;
        public com.withpersona.sdk2.inquiry.internal.network.f b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public mp.q f11456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public fn.k f11457d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public mp.w f11458e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public qq.a f11459f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public zo.n f11460g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public mp.d f11461h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public mp.i f11462i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public wp.f f11463j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public qp.e f11464k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public lp.c f11465l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public mq.b f11466m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public dp.c f11467n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public c0 f11468o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public lq.c f11469p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.internal.fallbackmode.a f11470q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public pq.f f11471r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public mp.c0 f11472s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public yn.e f11473t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public go.g f11474u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TrackingEventsModule f11475v;

        public a a(com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar) {
            this.f11470q = (com.withpersona.sdk2.inquiry.internal.fallbackmode.a) ft.h.b(aVar);
            return this;
        }

        public zo.s b() {
            ft.h.a(this.f11455a, NetworkCoreModule.class);
            ft.h.a(this.b, com.withpersona.sdk2.inquiry.internal.network.f.class);
            ft.h.a(this.f11456c, mp.q.class);
            if (this.f11457d == null) {
                this.f11457d = new fn.k();
            }
            ft.h.a(this.f11458e, mp.w.class);
            ft.h.a(this.f11459f, qq.a.class);
            ft.h.a(this.f11460g, zo.n.class);
            ft.h.a(this.f11461h, mp.d.class);
            ft.h.a(this.f11462i, mp.i.class);
            if (this.f11463j == null) {
                this.f11463j = new wp.f();
            }
            ft.h.a(this.f11464k, qp.e.class);
            ft.h.a(this.f11465l, lp.c.class);
            ft.h.a(this.f11466m, mq.b.class);
            ft.h.a(this.f11467n, dp.c.class);
            if (this.f11468o == null) {
                this.f11468o = new c0();
            }
            if (this.f11469p == null) {
                this.f11469p = new lq.c();
            }
            ft.h.a(this.f11470q, com.withpersona.sdk2.inquiry.internal.fallbackmode.a.class);
            ft.h.a(this.f11471r, pq.f.class);
            ft.h.a(this.f11472s, mp.c0.class);
            if (this.f11473t == null) {
                this.f11473t = new yn.e();
            }
            if (this.f11474u == null) {
                this.f11474u = new go.g();
            }
            ft.h.a(this.f11475v, TrackingEventsModule.class);
            return new f(this.f11455a, this.b, this.f11456c, this.f11457d, this.f11458e, this.f11459f, this.f11460g, this.f11461h, this.f11462i, this.f11463j, this.f11464k, this.f11465l, this.f11466m, this.f11467n, this.f11468o, this.f11469p, this.f11470q, this.f11471r, this.f11472s, this.f11473t, this.f11474u, this.f11475v);
        }

        public a c(mp.d dVar) {
            this.f11461h = (mp.d) ft.h.b(dVar);
            return this;
        }

        public a d(mq.b bVar) {
            this.f11466m = (mq.b) ft.h.b(bVar);
            return this;
        }

        public a e(mp.i iVar) {
            this.f11462i = (mp.i) ft.h.b(iVar);
            return this;
        }

        public a f(mp.q qVar) {
            this.f11456c = (mp.q) ft.h.b(qVar);
            return this;
        }

        public a g(pq.f fVar) {
            this.f11471r = (pq.f) ft.h.b(fVar);
            return this;
        }

        public a h(dp.c cVar) {
            this.f11467n = (dp.c) ft.h.b(cVar);
            return this;
        }

        public a i(qq.a aVar) {
            this.f11459f = (qq.a) ft.h.b(aVar);
            return this;
        }

        public a j(zo.n nVar) {
            this.f11460g = (zo.n) ft.h.b(nVar);
            return this;
        }

        public a k(com.withpersona.sdk2.inquiry.internal.network.f fVar) {
            this.b = (com.withpersona.sdk2.inquiry.internal.network.f) ft.h.b(fVar);
            return this;
        }

        public a l(lp.c cVar) {
            this.f11465l = (lp.c) ft.h.b(cVar);
            return this;
        }

        public a m(NetworkCoreModule networkCoreModule) {
            this.f11455a = (NetworkCoreModule) ft.h.b(networkCoreModule);
            return this;
        }

        public a n(qp.e eVar) {
            this.f11464k = (qp.e) ft.h.b(eVar);
            return this;
        }

        public a o(mp.w wVar) {
            this.f11458e = (mp.w) ft.h.b(wVar);
            return this;
        }

        public a p(mp.c0 c0Var) {
            this.f11472s = (mp.c0) ft.h.b(c0Var);
            return this;
        }

        public a q(c0 c0Var) {
            this.f11468o = (c0) ft.h.b(c0Var);
            return this;
        }

        public a r(TrackingEventsModule trackingEventsModule) {
            this.f11475v = (TrackingEventsModule) ft.h.b(trackingEventsModule);
            return this;
        }

        public a() {
        }
    }

    public static final class b implements zn.g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11476a;

        @Override // dt.a.InterfaceC0277a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public zn.g a(DocumentStepFragment documentStepFragment) {
            ft.h.b(documentStepFragment);
            return new c(this.f11476a, documentStepFragment);
        }

        public b(f fVar) {
            this.f11476a = fVar;
        }
    }

    public static final class c implements zn.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11477a;
        public final c b = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.document.a> f11478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.document.i.b> f11479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.document.network.a.C0179a> f11480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.document.network.e.a> f11481f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.document.network.c.a> f11482g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ft.i<bo.a.C0086a> f11483h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.document.network.g.a> f11484i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public tp.d f11485j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> f11486k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public c1 f11487l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.document.step.b.c> f11488m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.document.step.e f11489n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.document.step.d.a> f11490o;

        public c(f fVar, DocumentStepFragment documentStepFragment) {
            this.f11477a = fVar;
            b(documentStepFragment);
        }

        public final void b(DocumentStepFragment documentStepFragment) {
            f fVar = this.f11477a;
            this.f11478c = zn.b.a(fVar.f11575t1, fVar.f11579v, fVar.f11534g);
            f fVar2 = this.f11477a;
            this.f11479d = com.withpersona.sdk2.inquiry.document.j.a(fVar2.f11572s1, fVar2.f11578u1, fVar2.f11579v, fVar2.f11534g);
            this.f11480e = com.withpersona.sdk2.inquiry.document.network.b.a(this.f11477a.f11581v1);
            this.f11481f = com.withpersona.sdk2.inquiry.document.network.f.a(this.f11477a.f11581v1);
            f fVar3 = this.f11477a;
            this.f11482g = com.withpersona.sdk2.inquiry.document.network.d.a(fVar3.f11581v1, fVar3.f11584w1);
            this.f11483h = bo.b.a(this.f11477a.f11581v1);
            f fVar4 = this.f11477a;
            this.f11484i = com.withpersona.sdk2.inquiry.document.network.h.a(fVar4.f11581v1, fVar4.C0, fVar4.f11527d1);
            tp.d dVarA = tp.d.a(this.f11477a.Q0);
            this.f11485j = dVarA;
            ft.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> iVarB = com.withpersona.sdk2.inquiry.permissions.permissionRequest.f.b(dVarA);
            this.f11486k = iVarB;
            f fVar5 = this.f11477a;
            c1 c1VarA = c1.a(fVar5.f11568r0, fVar5.f11579v, this.f11478c, this.f11479d, this.f11480e, this.f11481f, this.f11482g, this.f11483h, this.f11484i, fVar5.f11542i1, fVar5.F0, fVar5.L, iVarB, fVar5.E1);
            this.f11487l = c1VarA;
            ft.i<com.withpersona.sdk2.inquiry.document.step.b.c> iVarB2 = com.withpersona.sdk2.inquiry.document.step.c.b(c1VarA);
            this.f11488m = iVarB2;
            com.withpersona.sdk2.inquiry.document.step.e eVarA = com.withpersona.sdk2.inquiry.document.step.e.a(iVarB2);
            this.f11489n = eVarA;
            this.f11490o = com.withpersona.sdk2.inquiry.document.step.f.b(eVarA);
        }

        @Override // dt.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(DocumentStepFragment documentStepFragment) {
            d(documentStepFragment);
        }

        public final DocumentStepFragment d(DocumentStepFragment documentStepFragment) {
            oq.b.a(documentStepFragment, this.f11477a.a());
            com.withpersona.sdk2.inquiry.document.step.a.b(documentStepFragment, this.f11490o.get());
            com.withpersona.sdk2.inquiry.document.step.a.a(documentStepFragment, this.f11477a.D0.get());
            return documentStepFragment;
        }
    }

    public static final class d implements qo.p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11491a;

        @Override // dt.a.InterfaceC0277a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public qo.p a(GovernmentIdStepFragment governmentIdStepFragment) {
            ft.h.b(governmentIdStepFragment);
            return new C0213e(this.f11491a, governmentIdStepFragment);
        }

        public d(f fVar) {
            this.f11491a = fVar;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$e, reason: collision with other inner class name */
    public static final class C0213e implements qo.p {
        public ft.i<com.withpersona.sdk2.inquiry.governmentid.persona_workflow.d.a> A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11492a;
        public final C0213e b = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public po.d f11493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ft.i<po.c.a> f11494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.governmentid.e> f11495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public fn.t f11496f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.camera.e.a> f11497g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public hn.c0 f11498h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ft.i<b0.a> f11499i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public hn.e f11500j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ft.i<hn.c.a> f11501k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ft.i<v0> f11502l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ft.i<j1> f11503m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.governmentid.g f11504n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public ft.i<GovernmentIdAnalyzeWorker.a> f11505o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public oo.b f11506p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public ft.i<GovernmentIdHintWorker.b> f11507q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public ft.i<tr.b.a> f11508r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public tp.d f11509s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> f11510t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public ft.i<m0> f11511u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ft.i<AutoClassifyWorker.b> f11512v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ft.i<ro.i> f11513w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public d1 f11514x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.c> f11515y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.governmentid.persona_workflow.e f11516z;

        public C0213e(f fVar, GovernmentIdStepFragment governmentIdStepFragment) {
            this.f11492a = fVar;
            b(governmentIdStepFragment);
        }

        public final void b(GovernmentIdStepFragment governmentIdStepFragment) {
            f fVar = this.f11492a;
            po.d dVarA = po.d.a(fVar.f11579v, fVar.f11524c1, fVar.f11527d1, fVar.C0, fVar.f11530e1, fVar.f11536g1, fVar.L);
            this.f11493c = dVarA;
            this.f11494d = po.e.b(dVarA);
            f fVar2 = this.f11492a;
            this.f11495e = io.e.a(fVar2.f11539h1, fVar2.f11579v, fVar2.f11534g);
            f fVar3 = this.f11492a;
            fn.t tVarA = fn.t.a(fVar3.f11579v, fVar3.f11536g1, fVar3.f11534g);
            this.f11496f = tVarA;
            this.f11497g = com.withpersona.sdk2.camera.f.b(tVarA);
            f fVar4 = this.f11492a;
            hn.c0 c0VarA = hn.c0.a(fVar4.f11579v, fVar4.f11536g1, fVar4.f11534g, fVar4.R, fVar4.G, fVar4.L, fVar4.F0, fVar4.f11585x);
            this.f11498h = c0VarA;
            ft.i<b0.a> iVarB = d0.b(c0VarA);
            this.f11499i = iVarB;
            f fVar5 = this.f11492a;
            hn.e eVarA = hn.e.a(iVarB, fVar5.R, fVar5.H, fVar5.L);
            this.f11500j = eVarA;
            ft.i<hn.c.a> iVarB2 = hn.f.b(eVarA);
            this.f11501k = iVarB2;
            f fVar6 = this.f11492a;
            this.f11502l = w0.a(fVar6.f11579v, this.f11497g, iVarB2, fVar6.f11542i1, fVar6.L);
            f fVar7 = this.f11492a;
            this.f11503m = k1.a(fVar7.f11579v, this.f11497g, this.f11501k, fVar7.f11542i1, fVar7.L);
            f fVar8 = this.f11492a;
            com.withpersona.sdk2.inquiry.governmentid.g gVarA = com.withpersona.sdk2.inquiry.governmentid.g.a(fVar8.f11579v, fVar8.f11531f, fVar8.f11534g);
            this.f11504n = gVarA;
            this.f11505o = com.withpersona.sdk2.inquiry.governmentid.h.b(gVarA);
            f fVar9 = this.f11492a;
            oo.b bVarA = oo.b.a(fVar9.f11579v, fVar9.f11531f);
            this.f11506p = bVarA;
            this.f11507q = oo.c.b(bVarA);
            this.f11508r = tr.c.a(this.f11492a.f11551l1);
            tp.d dVarA2 = tp.d.a(this.f11492a.Q0);
            this.f11509s = dVarA2;
            ft.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> iVarB3 = com.withpersona.sdk2.inquiry.permissions.permissionRequest.f.b(dVarA2);
            this.f11510t = iVarB3;
            f fVar10 = this.f11492a;
            this.f11511u = n0.a(fVar10.f11579v, this.f11505o, this.f11507q, this.f11508r, this.f11497g, this.f11501k, fVar10.f11542i1, fVar10.L, iVarB3);
            f fVar11 = this.f11492a;
            this.f11512v = com.withpersona.sdk2.inquiry.governmentid.network.a.a(fVar11.f11524c1, fVar11.f11530e1);
            ro.k kVarA = ro.k.a(this.f11492a.f11542i1);
            this.f11513w = kVarA;
            f fVar12 = this.f11492a;
            d1 d1VarA = d1.a(fVar12.f11579v, fVar12.f11568r0, this.f11494d, this.f11495e, this.f11502l, this.f11503m, this.f11511u, this.f11512v, kVarA, fVar12.f11536g1, fVar12.f11542i1, fVar12.F0, fVar12.L, fVar12.f11519a1, fVar12.E1);
            this.f11514x = d1VarA;
            ft.i<com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b.c> iVarB4 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.c.b(d1VarA);
            this.f11515y = iVarB4;
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.e eVarA2 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.e.a(iVarB4);
            this.f11516z = eVarA2;
            this.A = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.f.b(eVarA2);
        }

        @Override // dt.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(GovernmentIdStepFragment governmentIdStepFragment) {
            d(governmentIdStepFragment);
        }

        public final GovernmentIdStepFragment d(GovernmentIdStepFragment governmentIdStepFragment) {
            oq.b.a(governmentIdStepFragment, this.f11492a.a());
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.f(governmentIdStepFragment, this.A.get());
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.a(governmentIdStepFragment, this.f11492a.l());
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.c(governmentIdStepFragment, ft.c.b(this.f11492a.f11531f));
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.e(governmentIdStepFragment, this.f11492a.L.get());
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.b(governmentIdStepFragment, this.f11492a.f11585x.get());
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.d(governmentIdStepFragment, this.f11492a.D0.get());
            return governmentIdStepFragment;
        }
    }

    public static final class f implements zo.s {
        public ft.i<Set<JsonAdapterBinding<?>>> A;
        public ft.i<zo.h> A0;
        public ft.i<yn.b0> A1;
        public ft.i<Set<um.h.e>> B;
        public ft.i<dp.i> B0;
        public ft.i<yn.m> B1;
        public ft.i<Set<um.h.e>> C;
        public ft.i<fo.a> C0;
        public ft.i<yn.t> C1;
        public ft.i<um.w> D;
        public ft.i<vq.a> D0;
        public ft.i<yn.d> D1;
        public ft.i<TrackingMetadataProvider> E;
        public ft.i<pq.e> E0;
        public ft.i<p0> E1;
        public ft.i<l0> F;
        public ft.i<pq.c> F0;
        public ft.i<lq.a> G;
        public ft.i<Application> G0;
        public ft.i<p0> H;
        public ft.i<RealFontDownloader> H0;
        public ft.i<NetworkStateManager> I;
        public ft.i<qo.p.a> I0;
        public C0696RealTrackingEventsLogger_Factory J;
        public ft.i<sr.c.a> J0;
        public ft.i<RealTrackingEventsLogger.Factory> K;
        public ft.i<yp.c0.a> K0;
        public ft.i<TrackingEventsLogger> L;
        public ft.i<zn.g.a> L0;
        public ft.i<z> M;
        public ft.i<l1.a> M0;
        public ft.i<Set<a0<?>>> N;
        public ft.i<fp.g.a> N0;
        public ft.i<r0> O;
        public ft.i<jp.c.a> O0;
        public ft.i<nu.b0<kn.c>> P;
        public ft.i<xo.d.a> P0;
        public ft.i<fn.n0> Q;
        public ft.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.g> Q0;
        public ft.i<i0> R;
        public ft.i<UploadService> R0;
        public ft.i<com.withpersona.sdk2.inquiry.selfie.d> S;
        public ft.i<DirectFileUploader> S0;
        public ft.i<zp.p0> T;
        public ft.i<y> T0;
        public ft.i<Set<a0<?>>> U;
        public ft.i<yn.p> U0;
        public ft.i<Set<a0<?>>> V;
        public ft.i<yn.a> V0;
        public ft.i<an.c0> W;
        public ft.i<ep.d> W0;
        public ft.i<String> X;
        public ft.i<ep.a> X0;
        public ft.i<Interceptor> Y;
        public ft.i<Boolean> Y0;
        public ft.i<Interceptor> Z;
        public ft.i<com.withpersona.sdk2.inquiry.internal.network.e> Z0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zo.n f11517a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public ft.i<wp.c> f11518a0;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> f11519a1;
        public final lq.c b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public ft.i<Interceptor> f11520b0;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        public ft.i<UiStepSavedStateHelper> f11521b1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final qq.a f11522c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public ft.i<Set<Interceptor>> f11523c0;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.governmentid.network.b> f11524c1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final f f11525d = this;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public ft.i<String> f11526d0;

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        public ft.i<mq.a> f11527d1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ft.i<nu.b0<jt.n<j0>>> f11528e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public ft.i<String> f11529e0;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        public ft.i<rq.a> f11530e1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ft.i<x> f11531f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public ft.i<Map<String, String>> f11532f0;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        public ft.i<ln.b> f11533f1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ft.i<qq.c> f11534g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public ft.i<yn.z> f11535g0;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        public ft.i<ln.a> f11536g1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.camera.b> f11537h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public ft.i<yn.k> f11538h0;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        public ft.i<g.c<String[]>> f11539h1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ft.i<go.d> f11540i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public ft.i<yn.r> f11541i0;

        /* JADX INFO: renamed from: i1, reason: collision with root package name */
        public ft.i<uq.a> f11542i1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ft.i<go.d> f11543j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public ft.i<yn.b> f11544j0;

        /* JADX INFO: renamed from: j1, reason: collision with root package name */
        public ft.i<g.c<String>> f11545j1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ft.i<go.d> f11546k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public ft.i<np.b> f11547k0;

        /* JADX INFO: renamed from: k1, reason: collision with root package name */
        public ft.i<g.c<IntentSenderRequest>> f11548k1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ft.i<go.d> f11549l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public np.f f11550l0;

        /* JADX INFO: renamed from: l1, reason: collision with root package name */
        public ft.i<tr.a> f11551l1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ft.i<go.d> f11552m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public ft.i<np.e.a> f11553m0;

        /* JADX INFO: renamed from: m1, reason: collision with root package name */
        public ft.i<cq.a> f11554m1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ft.i<go.d> f11555n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public ft.i<OkHttpClient> f11556n0;

        /* JADX INFO: renamed from: n1, reason: collision with root package name */
        public ft.i<l0> f11557n1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public ft.i<go.d> f11558o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public ft.i<jv.y> f11559o0;

        /* JADX INFO: renamed from: o1, reason: collision with root package name */
        public ft.i<g.c<PassportNfcReaderConfig>> f11560o1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public ft.i<go.d> f11561p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ft.i<gp.w> f11562p0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        public ft.i<g.c<JpMyNumberNfcReaderConfig>> f11563p1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public ft.i<go.d> f11564q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ft.i<zo.i> f11565q0;

        /* JADX INFO: renamed from: q1, reason: collision with root package name */
        public ft.i<qr.c> f11566q1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public ft.i<go.d> f11567r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public ft.i<k6.s> f11568r0;

        /* JADX INFO: renamed from: r1, reason: collision with root package name */
        public ft.i<g.c<mp.b>> f11569r1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public ft.i<go.d> f11570s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public ft.i<FallbackMode> f11571s0;

        /* JADX INFO: renamed from: s1, reason: collision with root package name */
        public ft.i<g.c<String[]>> f11572s1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ft.i<go.d> f11573t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public ft.i<FallbackModeService> f11574t0;

        /* JADX INFO: renamed from: t1, reason: collision with root package name */
        public ft.i<g.c<Uri>> f11575t1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public ft.i<Set<go.d>> f11576u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public dp.k f11577u0;

        /* JADX INFO: renamed from: u1, reason: collision with root package name */
        public ft.i<g.c<g.h>> f11578u1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ft.i<Context> f11579v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.internal.fallbackmode.i.a> f11580v0;

        /* JADX INFO: renamed from: v1, reason: collision with root package name */
        public ft.i<bo.c> f11581v1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ft.i<androidx.p000lifecycle.l0> f11582w;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.internal.fallbackmode.d> f11583w0;

        /* JADX INFO: renamed from: w1, reason: collision with root package name */
        public ft.i<jq.k> f11584w1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public ft.i<go.e> f11585x;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.internal.fallbackmode.g f11586x0;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        public ft.i<ho.a> f11587x1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ft.i<TrackingEventsCache> f11588y;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.internal.fallbackmode.f.a> f11589y0;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        public ft.i<k0> f11590y1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public ft.i<Set<Object>> f11591z;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public ft.i<dp.a> f11592z0;

        /* JADX INFO: renamed from: z1, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.internal.q> f11593z1;

        public class a implements ft.i<qo.p.a> {
            public a() {
            }

            @Override // ht.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public qo.p.a get() {
                return new d(f.this.f11525d);
            }
        }

        public class b implements ft.i<sr.c.a> {
            public b() {
            }

            @Override // ht.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public sr.c.a get() {
                return new q(f.this.f11525d);
            }
        }

        public class c implements ft.i<yp.c0.a> {
            public c() {
            }

            @Override // ht.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public yp.c0.a get() {
                return new o(f.this.f11525d);
            }
        }

        public class d implements ft.i<zn.g.a> {
            public d() {
            }

            @Override // ht.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public zn.g.a get() {
                return new b(f.this.f11525d);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$f$e, reason: collision with other inner class name */
        public class C0214e implements ft.i<l1.a> {
            public C0214e() {
            }

            @Override // ht.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l1.a get() {
                return new m(f.this.f11525d);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.e$f$f, reason: collision with other inner class name */
        public class C0215f implements ft.i<fp.g.a> {
            public C0215f() {
            }

            @Override // ht.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public fp.g.a get() {
                return new k(f.this.f11525d);
            }
        }

        public class g implements ft.i<jp.c.a> {
            public g() {
            }

            @Override // ht.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public jp.c.a get() {
                return new s(f.this.f11525d);
            }
        }

        public class h implements ft.i<xo.d.a> {
            public h() {
            }

            @Override // ht.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public xo.d.a get() {
                return new i(f.this.f11525d);
            }
        }

        public f(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, mp.q qVar, fn.k kVar, mp.w wVar, qq.a aVar, zo.n nVar, mp.d dVar, mp.i iVar, wp.f fVar2, qp.e eVar, lp.c cVar, mq.b bVar, dp.c cVar2, c0 c0Var, lq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, pq.f fVar3, mp.c0 c0Var2, yn.e eVar2, go.g gVar, TrackingEventsModule trackingEventsModule) {
            this.f11517a = nVar;
            this.b = cVar3;
            this.f11522c = aVar;
            m(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            n(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            o(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            p(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            q(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            r(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
        }

        public ft.j<a0<?>> A(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, mp.q qVar, fn.k kVar, mp.w wVar, qq.a aVar, zo.n nVar, mp.d dVar, mp.i iVar, wp.f fVar2, qp.e eVar, lp.c cVar, mq.b bVar, dp.c cVar2, c0 c0Var, lq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, pq.f fVar3, mp.c0 c0Var2, yn.e eVar2, go.g gVar, TrackingEventsModule trackingEventsModule) {
            ft.j.b bVarA = ft.j.a(0, 8);
            bVarA.a(gp.o.a());
            bVarA.a(this.N);
            bVarA.a(c2.a());
            bVarA.a(this.U);
            bVarA.a(zn.h.a());
            bVarA.a(wp.h.a());
            bVarA.a(op.f.a());
            bVarA.a(m1.a());
            return bVarA.c();
        }

        public k0 B() {
            return new k0(zo.p.a(this.f11517a), new zq.a.C0689a(), this.f11562p0.get());
        }

        @Override // zo.s
        public dt.b<Object> a() {
            return dt.c.a(s(), Collections.EMPTY_MAP);
        }

        @Override // zo.s
        public TrackingEventsLogger b() {
            return this.L.get();
        }

        @Override // zo.s
        public yn.k c() {
            return this.f11538h0.get();
        }

        @Override // zo.s
        public zo.i d() {
            return this.f11565q0.get();
        }

        @Override // zo.s
        public k6.s e() {
            return this.f11568r0.get();
        }

        @Override // zo.s
        public com.withpersona.sdk2.inquiry.internal.workflows.a.InterfaceC0222a f() {
            return new g(this.f11525d);
        }

        @Override // zo.s
        public DirectFileUploader g() {
            return this.S0.get();
        }

        @Override // zo.s
        public kr.a h() {
            return this.H0.get();
        }

        @Override // zo.s
        public com.withpersona.sdk2.inquiry.permissions.permissionRequest.g i() {
            return this.Q0.get();
        }

        @Override // zo.s
        public com.withpersona.sdk2.inquiry.internal.q j() {
            return new com.withpersona.sdk2.inquiry.internal.q(B(), lq.f.c(this.b));
        }

        public com.withpersona.sdk2.camera.b l() {
            return new com.withpersona.sdk2.camera.b(qq.b.c(this.f11522c));
        }

        public final void m(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, mp.q qVar, fn.k kVar, mp.w wVar, qq.a aVar, zo.n nVar, mp.d dVar, mp.i iVar, wp.f fVar2, qp.e eVar, lp.c cVar, mq.b bVar, dp.c cVar2, c0 c0Var, lq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, pq.f fVar3, mp.c0 c0Var2, yn.e eVar2, go.g gVar, TrackingEventsModule trackingEventsModule) {
            ft.i<nu.b0<jt.n<j0>>> iVarC = ft.c.c(fn.m.a(kVar));
            this.f11528e = iVarC;
            this.f11531f = fn.y.a(iVarC);
            qq.b bVarA = qq.b.a(aVar);
            this.f11534g = bVarA;
            this.f11537h = fn.q.a(bVarA);
            this.f11540i = go.o.a(gVar);
            this.f11543j = go.q.a(gVar);
            this.f11546k = go.p.a(gVar);
            this.f11549l = go.k.a(gVar);
            this.f11552m = go.r.a(gVar);
            this.f11555n = go.j.a(gVar);
            this.f11558o = go.n.a(gVar);
            this.f11561p = go.h.b(gVar);
            this.f11564q = go.i.a(gVar);
            this.f11567r = go.s.a(gVar);
            this.f11570s = go.m.a(gVar);
            this.f11573t = go.l.a(gVar);
            this.f11576u = v(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            this.f11579v = zo.p.b(nVar);
            dp.g gVarA = dp.g.a(cVar2);
            this.f11582w = gVarA;
            this.f11585x = ft.c.c(go.f.a(this.f11576u, this.f11579v, gVarA));
            this.f11588y = ft.c.c(TrackingEventsCache_Factory.create());
            this.f11591z = z(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            this.A = x(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            this.B = TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory.create(trackingEventsModule);
            this.C = y(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
        }

        public final void n(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, mp.q qVar, fn.k kVar, mp.w wVar, qq.a aVar, zo.n nVar, mp.d dVar, mp.i iVar, wp.f fVar2, qp.e eVar, lp.c cVar, mq.b bVar, dp.c cVar2, c0 c0Var, lq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, pq.f fVar3, mp.c0 c0Var2, yn.e eVar2, go.g gVar, TrackingEventsModule trackingEventsModule) {
            this.D = ft.c.c(NetworkCoreModule_MoshiFactory.create(networkCoreModule, this.f11591z, this.A, this.C));
            this.E = ft.c.c(TrackingMetadataProvider_Factory.create(this.f11579v));
            lq.e eVarA = lq.e.a(cVar3);
            this.F = eVarA;
            ft.i<lq.a> iVarC = ft.c.c(lq.b.a(eVarA));
            this.G = iVarC;
            this.H = lq.d.b(cVar3, iVarC);
            ft.i<NetworkStateManager> iVarC2 = ft.c.c(NetworkStateManager_Factory.create());
            this.I = iVarC2;
            C0696RealTrackingEventsLogger_Factory c0696RealTrackingEventsLogger_FactoryCreate = C0696RealTrackingEventsLogger_Factory.create(this.f11579v, this.f11588y, this.D, this.E, this.f11534g, this.f11585x, this.H, iVarC2);
            this.J = c0696RealTrackingEventsLogger_FactoryCreate;
            ft.i<RealTrackingEventsLogger.Factory> iVarCreateFactoryProvider = RealTrackingEventsLogger_Factory_Impl.createFactoryProvider(c0696RealTrackingEventsLogger_FactoryCreate);
            this.K = iVarCreateFactoryProvider;
            ft.i<TrackingEventsLogger> iVarC3 = ft.c.c(TrackingEventsModule_TrackingEventsLoggerFactory.create(trackingEventsModule, iVarCreateFactoryProvider));
            this.L = iVarC3;
            ko.a0 a0VarA = ko.a0.a(this.f11531f, this.f11537h, this.f11585x, iVarC3);
            this.M = a0VarA;
            this.N = io.m.a(a0VarA);
            this.O = s0.a(this.f11585x);
            ft.i<nu.b0<kn.c>> iVarC4 = ft.c.c(fn.n.a(kVar));
            this.P = iVarC4;
            this.Q = o0.a(this.O, iVarC4);
            ft.i<i0> iVarC5 = ft.c.c(hn.j0.a());
            this.R = iVarC5;
            this.S = yp.n.a(this.f11537h, this.Q, iVarC5, this.L);
            q0 q0VarA = q0.a(this.f11537h, this.Q, this.L, this.f11585x);
            this.T = q0VarA;
            this.U = yp.b0.a(this.S, q0VarA);
            ft.j<a0<?>> jVarA = A(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            this.V = jVarA;
            this.W = ft.c.c(gp.u.a(jVarA));
            this.X = gp.r.a(fVar);
            this.Y = NetworkCoreModule_ResponseInterceptorFactory.create(networkCoreModule, this.I);
            this.Z = NetworkCoreModule_InterceptorFactory.create(networkCoreModule, this.D);
            ft.i<wp.c> iVarC6 = ft.c.c(wp.d.a());
            this.f11518a0 = iVarC6;
            this.f11520b0 = wp.g.a(fVar2, iVarC6);
        }

        public final void o(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, mp.q qVar, fn.k kVar, mp.w wVar, qq.a aVar, zo.n nVar, mp.d dVar, mp.i iVar, wp.f fVar2, qp.e eVar, lp.c cVar, mq.b bVar, dp.c cVar2, c0 c0Var, lq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, pq.f fVar3, mp.c0 c0Var2, yn.e eVar2, go.g gVar, TrackingEventsModule trackingEventsModule) {
            this.f11523c0 = w(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            this.f11526d0 = NetworkCoreModule_KeyInflectionFactory.create(networkCoreModule);
            this.f11529e0 = NetworkCoreModule_UseServerStylesFactory.create(networkCoreModule);
            this.f11532f0 = u(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            yn.a0 a0VarA = yn.a0.a(this.f11579v);
            this.f11535g0 = a0VarA;
            this.f11538h0 = ft.c.c(yn.f.b(eVar2, a0VarA));
            yn.s sVarA = yn.s.a(this.f11579v);
            this.f11541i0 = sVarA;
            this.f11544j0 = ft.c.c(yn.h.a(eVar2, sVarA));
            np.d dVarA = np.d.a(this.f11579v);
            this.f11547k0 = dVarA;
            np.f fVarA = np.f.a(dVarA);
            this.f11550l0 = fVarA;
            ft.i<np.e.a> iVarA = np.g.a(fVarA);
            this.f11553m0 = iVarA;
            NetworkCoreModule_OkhttpClientFactory networkCoreModule_OkhttpClientFactoryCreate = NetworkCoreModule_OkhttpClientFactory.create(networkCoreModule, this.f11523c0, this.f11532f0, this.f11579v, this.f11538h0, this.f11544j0, iVarA, this.I);
            this.f11556n0 = networkCoreModule_OkhttpClientFactoryCreate;
            ft.i<jv.y> iVarC = ft.c.c(NetworkCoreModule_RetrofitFactory.create(networkCoreModule, this.X, networkCoreModule_OkhttpClientFactoryCreate, this.D));
            this.f11559o0 = iVarC;
            ft.i<gp.w> iVarC2 = ft.c.c(gp.j.a(fVar, iVarC));
            this.f11562p0 = iVarC2;
            this.f11565q0 = ft.c.c(zo.j.a(iVarC2, this.D, this.f11547k0, this.H));
            this.f11568r0 = ft.c.c(zo.q.a(nVar, this.f11579v));
            this.f11571s0 = dp.e.a(cVar2);
            this.f11574t0 = ft.c.c(gp.g.a(fVar, this.f11559o0));
            dp.k kVarA = dp.k.a(this.f11582w);
            this.f11577u0 = kVarA;
            ft.i<com.withpersona.sdk2.inquiry.internal.fallbackmode.i.a> iVarB = com.withpersona.sdk2.inquiry.internal.fallbackmode.j.b(kVarA);
            this.f11580v0 = iVarB;
            this.f11583w0 = com.withpersona.sdk2.inquiry.internal.fallbackmode.e.a(this.f11574t0, this.D, iVarB);
            com.withpersona.sdk2.inquiry.internal.fallbackmode.g gVarA = com.withpersona.sdk2.inquiry.internal.fallbackmode.g.a(this.D, this.f11579v, this.f11580v0);
            this.f11586x0 = gVarA;
            ft.i<com.withpersona.sdk2.inquiry.internal.fallbackmode.f.a> iVarB2 = com.withpersona.sdk2.inquiry.internal.fallbackmode.h.b(gVarA);
            this.f11589y0 = iVarB2;
            this.f11592z0 = com.withpersona.sdk2.inquiry.internal.fallbackmode.b.b(aVar2, this.f11583w0, iVarB2);
            this.A0 = dp.d.a(cVar2);
        }

        public final void p(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, mp.q qVar, fn.k kVar, mp.w wVar, qq.a aVar, zo.n nVar, mp.d dVar, mp.i iVar, wp.f fVar2, qp.e eVar, lp.c cVar, mq.b bVar, dp.c cVar2, c0 c0Var, lq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, pq.f fVar3, mp.c0 c0Var2, yn.e eVar2, go.g gVar, TrackingEventsModule trackingEventsModule) {
            ft.i<dp.i> iVarC = ft.c.c(dp.j.a(this.f11571s0, this.f11592z0, this.A0, this.D));
            this.B0 = iVarC;
            this.C0 = ft.c.c(dp.f.a(cVar2, iVarC));
            this.D0 = ft.c.c(f0.a(c0Var));
            pq.g gVarA = pq.g.a(fVar3);
            this.E0 = gVarA;
            this.F0 = ft.c.c(pq.d.a(gVarA, this.H));
            zo.o oVarB = zo.o.b(nVar);
            this.G0 = oVarB;
            this.H0 = ft.c.c(kr.e.a(this.f11556n0, oVarB, this.H));
            this.I0 = new a();
            this.J0 = new b();
            this.K0 = new c();
            this.L0 = new d();
            this.M0 = new C0214e();
            this.N0 = new C0215f();
            this.O0 = new g();
            this.P0 = new h();
            this.Q0 = ft.c.c(tp.f.a());
            ft.i<UploadService> iVarC2 = ft.c.c(gp.t.a(fVar, this.f11559o0));
            this.R0 = iVarC2;
            this.S0 = ft.c.c(bq.a.a(this.f11582w, iVarC2, this.H));
            this.T0 = ft.c.c(gp.p.a(fVar, this.f11559o0));
            yn.q qVarA = yn.q.a(this.f11579v);
            this.U0 = qVarA;
            this.V0 = ft.c.c(yn.g.a(eVar2, qVarA));
            ft.i<ep.d> iVarC3 = ft.c.c(ep.e.a());
            this.W0 = iVarC3;
            this.X0 = ft.c.c(ep.c.a(this.f11579v, this.f11553m0, iVarC3, this.F));
            gp.n nVarA = gp.n.a(fVar);
            this.Y0 = nVarA;
            this.Z0 = ft.c.c(gp.d.a(this.f11579v, this.f11562p0, this.T0, this.B0, this.f11518a0, this.V0, this.X0, nVarA));
        }

        public final void q(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, mp.q qVar, fn.k kVar, mp.w wVar, qq.a aVar, zo.n nVar, mp.d dVar, mp.i iVar, wp.f fVar2, qp.e eVar, lp.c cVar, mq.b bVar, dp.c cVar2, c0 c0Var, lq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, pq.f fVar3, mp.c0 c0Var2, yn.e eVar2, go.g gVar, TrackingEventsModule trackingEventsModule) {
            this.f11519a1 = ft.c.c(sq.a.a(this.f11582w));
            this.f11521b1 = ft.c.c(zo.o0.a(this.f11579v, this.H));
            this.f11524c1 = ft.c.c(gp.i.a(fVar, this.f11559o0));
            this.f11527d1 = mq.c.a(bVar);
            this.f11530e1 = ft.c.c(e0.a(c0Var, rq.d.a()));
            ft.i<ln.b> iVarC = ft.c.c(ln.c.a(this.f11579v));
            this.f11533f1 = iVarC;
            this.f11536g1 = fn.l.b(kVar, iVarC);
            this.f11539h1 = ft.c.c(mp.t.a(qVar));
            this.f11542i1 = ft.c.c(uq.b.a(this.E0, this.f11585x, this.H));
            this.f11545j1 = ft.c.c(mp.z.a(wVar));
            this.f11548k1 = ft.c.c(mp.f0.a(c0Var2));
            this.f11551l1 = ft.c.c(gp.v.a(fVar, this.f11559o0));
            this.f11554m1 = ft.c.c(gp.q.a(fVar, this.f11559o0));
            this.f11557n1 = lq.f.a(cVar3);
            this.f11560o1 = ft.c.c(qp.h.a(eVar));
            this.f11563p1 = ft.c.c(lp.f.a(cVar));
            this.f11566q1 = ft.c.c(gp.s.a(fVar, this.f11559o0));
            this.f11569r1 = ft.c.c(mp.g.a(dVar));
            this.f11572s1 = ft.c.c(mp.n.a(iVar));
            this.f11575t1 = ft.c.c(mp.p.a(iVar));
            this.f11578u1 = ft.c.c(mp.o.a(iVar));
            this.f11581v1 = ft.c.c(gp.f.a(fVar, this.f11559o0));
            this.f11584w1 = ft.c.c(jq.d0.a(c0Var, jq.y.a()));
            this.f11587x1 = ft.c.c(gp.h.a(fVar, this.f11559o0));
            this.f11590y1 = zo.l0.a(this.f11579v, zq.b.a(), this.f11562p0);
        }

        public final void r(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, mp.q qVar, fn.k kVar, mp.w wVar, qq.a aVar, zo.n nVar, mp.d dVar, mp.i iVar, wp.f fVar2, qp.e eVar, lp.c cVar, mq.b bVar, dp.c cVar2, c0 c0Var, lq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, pq.f fVar3, mp.c0 c0Var2, yn.e eVar2, go.g gVar, TrackingEventsModule trackingEventsModule) {
            this.f11593z1 = zo.j0.a(this.f11590y1, this.f11557n1);
            yn.c0 c0VarA = yn.c0.a(this.f11579v);
            this.A1 = c0VarA;
            ft.i<yn.m> iVarC = ft.c.c(yn.j.a(eVar2, c0VarA));
            this.B1 = iVarC;
            yn.u uVarA = yn.u.a(this.f11579v, iVarC);
            this.C1 = uVarA;
            this.D1 = ft.c.c(yn.i.a(eVar2, uVarA));
            this.E1 = zo.r.a(nVar);
        }

        public Map<Class<?>, ht.a<dt.a.InterfaceC0277a<?>>> s() {
            return t();
        }

        public Map t() {
            ft.f fVarB = ft.f.b(8);
            fVarB.c(GovernmentIdStepFragment.class, this.I0);
            fVarB.c(UiStepFragment.class, this.J0);
            fVarB.c(SelfieStepFragment.class, this.K0);
            fVarB.c(DocumentStepFragment.class, this.L0);
            fVarB.c(PermissionRequestFragment.class, this.M0);
            fVarB.c(fp.f.class, this.N0);
            fVarB.c(jp.b.class, this.O0);
            fVarB.c(IntegrationStepFragment.class, this.P0);
            return fVarB.a();
        }

        public ft.g<String, String> u(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, mp.q qVar, fn.k kVar, mp.w wVar, qq.a aVar, zo.n nVar, mp.d dVar, mp.i iVar, wp.f fVar2, qp.e eVar, lp.c cVar, mq.b bVar, dp.c cVar2, c0 c0Var, lq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, pq.f fVar3, mp.c0 c0Var2, yn.e eVar2, go.g gVar, TrackingEventsModule trackingEventsModule) {
            ft.g.b bVarB = ft.g.b(3);
            bVarB.c("User-Agent", NetworkInquiryModule_UserAgentFactory.create());
            bVarB.c("Key-Inflection", this.f11526d0);
            bVarB.c("Persona-Use-Mobile-Server-Styles", this.f11529e0);
            return bVarB.b();
        }

        public ft.j<go.d> v(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, mp.q qVar, fn.k kVar, mp.w wVar, qq.a aVar, zo.n nVar, mp.d dVar, mp.i iVar, wp.f fVar2, qp.e eVar, lp.c cVar, mq.b bVar, dp.c cVar2, c0 c0Var, lq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, pq.f fVar3, mp.c0 c0Var2, yn.e eVar2, go.g gVar, TrackingEventsModule trackingEventsModule) {
            ft.j.b bVarA = ft.j.a(12, 0);
            bVarA.b(this.f11540i);
            bVarA.b(this.f11543j);
            bVarA.b(this.f11546k);
            bVarA.b(this.f11549l);
            bVarA.b(this.f11552m);
            bVarA.b(this.f11555n);
            bVarA.b(this.f11558o);
            bVarA.b(this.f11561p);
            bVarA.b(this.f11564q);
            bVarA.b(this.f11567r);
            bVarA.b(this.f11570s);
            bVarA.b(this.f11573t);
            return bVarA.c();
        }

        public ft.j<Interceptor> w(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, mp.q qVar, fn.k kVar, mp.w wVar, qq.a aVar, zo.n nVar, mp.d dVar, mp.i iVar, wp.f fVar2, qp.e eVar, lp.c cVar, mq.b bVar, dp.c cVar2, c0 c0Var, lq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, pq.f fVar3, mp.c0 c0Var2, yn.e eVar2, go.g gVar, TrackingEventsModule trackingEventsModule) {
            ft.j.b bVarA = ft.j.a(3, 0);
            bVarA.b(this.Y);
            bVarA.b(this.Z);
            bVarA.b(this.f11520b0);
            return bVarA.c();
        }

        public ft.j<JsonAdapterBinding<?>> x(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, mp.q qVar, fn.k kVar, mp.w wVar, qq.a aVar, zo.n nVar, mp.d dVar, mp.i iVar, wp.f fVar2, qp.e eVar, lp.c cVar, mq.b bVar, dp.c cVar2, c0 c0Var, lq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, pq.f fVar3, mp.c0 c0Var2, yn.e eVar2, go.g gVar, TrackingEventsModule trackingEventsModule) {
            ft.j.b bVarA = ft.j.a(0, 1);
            bVarA.a(gp.k.a());
            return bVarA.c();
        }

        public ft.j<um.h.e> y(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, mp.q qVar, fn.k kVar, mp.w wVar, qq.a aVar, zo.n nVar, mp.d dVar, mp.i iVar, wp.f fVar2, qp.e eVar, lp.c cVar, mq.b bVar, dp.c cVar2, c0 c0Var, lq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, pq.f fVar3, mp.c0 c0Var2, yn.e eVar2, go.g gVar, TrackingEventsModule trackingEventsModule) {
            ft.j.b bVarA = ft.j.a(0, 5);
            bVarA.a(NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory.create());
            bVarA.a(NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory.create());
            bVarA.a(gp.m.a());
            bVarA.a(io.l.a());
            bVarA.a(this.B);
            return bVarA.c();
        }

        public ft.j<Object> z(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, mp.q qVar, fn.k kVar, mp.w wVar, qq.a aVar, zo.n nVar, mp.d dVar, mp.i iVar, wp.f fVar2, qp.e eVar, lp.c cVar, mq.b bVar, dp.c cVar2, c0 c0Var, lq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, pq.f fVar3, mp.c0 c0Var2, yn.e eVar2, go.g gVar, TrackingEventsModule trackingEventsModule) {
            ft.j.b bVarA = ft.j.a(0, 2);
            bVarA.a(gp.l.a());
            bVarA.a(b2.a());
            return bVarA.c();
        }
    }

    public static final class g implements com.withpersona.sdk2.inquiry.internal.workflows.a.InterfaceC0222a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11602a;

        @Override // com.withpersona.sdk2.inquiry.internal.workflows.a.InterfaceC0222a
        public com.withpersona.sdk2.inquiry.internal.workflows.a a() {
            return new h(this.f11602a);
        }

        public g(f fVar) {
            this.f11602a = fVar;
        }
    }

    public static final class h implements com.withpersona.sdk2.inquiry.internal.workflows.a {
        public ft.i<hn.c.a> A;
        public ho.c A0;
        public ft.i<uo.j> B;
        public ft.i<ho.b.a> B0;
        public ft.i<uo.v> C;
        public ft.i<zo.f> C0;
        public ft.i<com.withpersona.sdk2.inquiry.permissions.d.a> D;
        public hp.f0 D0;
        public rp.j E;
        public ft.i<hp.e0.b> E0;
        public ft.i<com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0225a> F;
        public kp.c F0;
        public ft.i<DeviceFeatureRequestWorkflow> G;
        public ft.i<com.withpersona.sdk2.inquiry.internal.workflows.c.a> G0;
        public ft.i<PermissionRequestWorkflow> H;
        public kp.d H0;
        public com.withpersona.sdk2.inquiry.governmentid.g I;
        public ft.i<com.withpersona.sdk2.inquiry.internal.workflows.e.a> I0;
        public ft.i<GovernmentIdAnalyzeWorker.a> J;
        public oo.b K;
        public ft.i<GovernmentIdHintWorker.b> L;
        public ft.i<tr.b.a> M;
        public ft.i<t0> N;
        public ft.i<AutoClassifyWorker.b> O;
        public ft.i<jo.n> P;
        public ft.i<GovernmentIdWorkflow> Q;
        public cq.c R;
        public ft.i<cq.b.a> S;
        public yp.v T;
        public ft.i<com.withpersona.sdk2.inquiry.selfie.e.b> U;
        public ft.i<hq.j> V;
        public dq.b W;
        public ft.i<dq.a.b> X;
        public ft.i<com.withpersona.sdk2.inquiry.selfie.g> Y;
        public ft.i<SelfieWorkflow> Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11603a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public qp.k f11604a0;
        public final h b = this;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.nfc.b.a> f11605b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public zo.d f11606c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public lp.o f11607c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.internal.c.a> f11608d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public ft.i<lp.n.a> f11609d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public zo.c f11610e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public or.l1 f11611e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.internal.a.InterfaceC0212a> f11612f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.ui.d.a> f11613f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public zo.c0 f11614g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public k6 f11615g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.internal.k.b> f11616h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.ui.k.a> f11617h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public zo.n0 f11618i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.ui.network.b.a> f11619i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.internal.r.a> f11620j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public ft.i<qr.a.C0521a> f11621j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.internal.t f11622k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.ui.h.a> f11623k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ft.i<TransitionWorker.a> f11624l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.ui.a> f11625l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public zo.p0 f11626m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public ft.i<UiWorkflow> f11627m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ft.i<v.a> f11628n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.document.a> f11629n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public zo.k f11630o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.document.i.b> f11631o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.internal.f.a> f11632p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.document.network.a.C0179a> f11633p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public h0 f11634q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.document.network.e.a> f11635q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.internal.m.a> f11636r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.document.network.c.a> f11637r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public po.d f11638s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public ft.i<bo.a.C0086a> f11639s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ft.i<po.c.a> f11640t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.document.network.g.a> f11641t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.governmentid.e> f11642u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public ft.i<DocumentWorkflow> f11643u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public fn.t f11644v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public xo.c f11645v0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.camera.e.a> f11646w;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.integration.a.InterfaceC0204a> f11647w0;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public hn.c0 f11648x;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public ft.i<IntegrationWorkflow> f11649x0;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ft.i<b0.a> f11650y;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public zo.i0 f11651y0;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public hn.e f11652z;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.internal.o.a> f11653z0;

        public h(f fVar) {
            this.f11603a = fVar;
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
            zo.d dVarA = zo.d.a(this.f11603a.Z0);
            this.f11606c = dVarA;
            this.f11608d = com.withpersona.sdk2.inquiry.internal.d.b(dVarA);
            zo.c cVarA = zo.c.a(this.f11603a.Z0);
            this.f11610e = cVarA;
            this.f11612f = com.withpersona.sdk2.inquiry.internal.b.b(cVarA);
            f fVar = this.f11603a;
            zo.c0 c0VarA = zo.c0.a(fVar.f11562p0, fVar.V0, fVar.f11518a0, fVar.B0, fVar.H0, fVar.f11519a1, fVar.Z0);
            this.f11614g = c0VarA;
            this.f11616h = com.withpersona.sdk2.inquiry.internal.l.b(c0VarA);
            zo.n0 n0VarA = zo.n0.a(this.f11603a.Z0);
            this.f11618i = n0VarA;
            this.f11620j = com.withpersona.sdk2.inquiry.internal.s.b(n0VarA);
            f fVar2 = this.f11603a;
            com.withpersona.sdk2.inquiry.internal.t tVarA = com.withpersona.sdk2.inquiry.internal.t.a(fVar2.f11562p0, fVar2.C0, fVar2.f11521b1, fVar2.f11585x, fVar2.f11579v);
            this.f11622k = tVarA;
            this.f11624l = u.b(tVarA);
            zo.p0 p0VarA = zo.p0.a(this.f11603a.Z0);
            this.f11626m = p0VarA;
            this.f11628n = w.b(p0VarA);
            zo.k kVarA = zo.k.a(this.f11603a.Z0);
            this.f11630o = kVarA;
            this.f11632p = com.withpersona.sdk2.inquiry.internal.g.a(kVarA);
            h0 h0VarA = h0.a(this.f11603a.Z0);
            this.f11634q = h0VarA;
            this.f11636r = com.withpersona.sdk2.inquiry.internal.n.a(h0VarA);
            f fVar3 = this.f11603a;
            po.d dVarA2 = po.d.a(fVar3.f11579v, fVar3.f11524c1, fVar3.f11527d1, fVar3.C0, fVar3.f11530e1, fVar3.f11536g1, fVar3.L);
            this.f11638s = dVarA2;
            this.f11640t = po.e.b(dVarA2);
            f fVar4 = this.f11603a;
            this.f11642u = io.e.a(fVar4.f11539h1, fVar4.f11579v, fVar4.f11534g);
            f fVar5 = this.f11603a;
            fn.t tVarA2 = fn.t.a(fVar5.f11579v, fVar5.f11536g1, fVar5.f11534g);
            this.f11644v = tVarA2;
            this.f11646w = com.withpersona.sdk2.camera.f.b(tVarA2);
            f fVar6 = this.f11603a;
            hn.c0 c0VarA2 = hn.c0.a(fVar6.f11579v, fVar6.f11536g1, fVar6.f11534g, fVar6.R, fVar6.G, fVar6.L, fVar6.F0, fVar6.f11585x);
            this.f11648x = c0VarA2;
            ft.i<b0.a> iVarB = d0.b(c0VarA2);
            this.f11650y = iVarB;
            f fVar7 = this.f11603a;
            hn.e eVarA = hn.e.a(iVarB, fVar7.R, fVar7.H, fVar7.L);
            this.f11652z = eVarA;
            this.A = hn.f.b(eVarA);
        }

        public final void c() {
            f fVar = this.f11603a;
            this.B = uo.k.a(fVar.f11579v, this.f11646w, this.A, fVar.f11542i1);
            f fVar2 = this.f11603a;
            this.C = uo.w.a(fVar2.f11579v, this.f11646w, this.A, fVar2.f11542i1, fVar2.L);
            f fVar3 = this.f11603a;
            this.D = com.withpersona.sdk2.inquiry.permissions.e.a(fVar3.f11579v, fVar3.f11545j1, fVar3.L);
            f fVar4 = this.f11603a;
            rp.j jVarA = rp.j.a(fVar4.f11548k1, fVar4.f11579v);
            this.E = jVarA;
            ft.i<com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0225a> iVarB = com.withpersona.sdk2.inquiry.permissions.b.b(jVarA);
            this.F = iVarB;
            com.withpersona.sdk2.inquiry.permissions.c cVarA = com.withpersona.sdk2.inquiry.permissions.c.a(this.f11603a.f11579v, iVarB);
            this.G = cVarA;
            f fVar5 = this.f11603a;
            this.H = com.withpersona.sdk2.inquiry.permissions.f.a(fVar5.f11579v, this.D, cVarA, fVar5.L);
            f fVar6 = this.f11603a;
            com.withpersona.sdk2.inquiry.governmentid.g gVarA = com.withpersona.sdk2.inquiry.governmentid.g.a(fVar6.f11579v, fVar6.f11531f, fVar6.f11534g);
            this.I = gVarA;
            this.J = com.withpersona.sdk2.inquiry.governmentid.h.b(gVarA);
            f fVar7 = this.f11603a;
            oo.b bVarA = oo.b.a(fVar7.f11579v, fVar7.f11531f);
            this.K = bVarA;
            this.L = oo.c.b(bVarA);
            tr.c cVarA2 = tr.c.a(this.f11603a.f11551l1);
            this.M = cVarA2;
            f fVar8 = this.f11603a;
            this.N = u0.a(fVar8.f11579v, this.H, this.J, this.L, cVarA2, this.f11646w, this.A, fVar8.f11542i1, fVar8.L);
            f fVar9 = this.f11603a;
            this.O = com.withpersona.sdk2.inquiry.governmentid.network.a.a(fVar9.f11524c1, fVar9.f11530e1);
            jo.p pVarA = jo.p.a(this.f11603a.f11542i1);
            this.P = pVarA;
            f fVar10 = this.f11603a;
            this.Q = h2.a(fVar10.f11579v, fVar10.f11568r0, this.f11640t, this.f11642u, this.B, this.C, this.N, this.O, pVarA, fVar10.f11536g1, fVar10.f11542i1, fVar10.F0, fVar10.L, fVar10.f11519a1);
            f fVar11 = this.f11603a;
            cq.c cVarA3 = cq.c.a(fVar11.f11579v, fVar11.f11554m1, fVar11.f11527d1, fVar11.C0, fVar11.f11530e1, fVar11.f11536g1, fVar11.L, fVar11.S0);
            this.R = cVarA3;
            this.S = cq.d.b(cVarA3);
            f fVar12 = this.f11603a;
            yp.v vVarA = yp.v.a(fVar12.Q, fVar12.f11534g);
            this.T = vVarA;
            this.U = com.withpersona.sdk2.inquiry.selfie.f.b(vVarA);
            f fVar13 = this.f11603a;
            this.V = hq.k.a(fVar13.f11579v, this.f11646w, this.A, fVar13.f11542i1, fVar13.f11585x);
            f fVar14 = this.f11603a;
            dq.b bVarA2 = dq.b.a(fVar14.f11582w, fVar14.f11554m1, fVar14.H, fVar14.f11557n1);
            this.W = bVarA2;
            this.X = dq.c.b(bVarA2);
            f fVar15 = this.f11603a;
            yp.w wVarA = yp.w.a(fVar15.F0, fVar15.L);
            this.Y = wVarA;
            f fVar16 = this.f11603a;
            this.Z = com.withpersona.sdk2.inquiry.selfie.q.a(fVar16.f11579v, this.S, this.M, this.U, this.H, this.V, this.f11646w, this.A, fVar16.f11536g1, fVar16.f11542i1, fVar16.S0, this.X, fVar16.f11519a1, wVarA, fVar16.f11534g, fVar16.f11585x);
        }

        public final void d() {
            f fVar = this.f11603a;
            qp.k kVarA = qp.k.a(fVar.f11560o1, fVar.f11579v, fVar.f11518a0, fVar.f11534g, fVar.f11585x);
            this.f11604a0 = kVarA;
            this.f11605b0 = com.withpersona.sdk2.inquiry.nfc.c.b(kVarA);
            f fVar2 = this.f11603a;
            lp.o oVarA = lp.o.a(fVar2.f11563p1, fVar2.f11579v, fVar2.f11518a0);
            this.f11607c0 = oVarA;
            this.f11609d0 = lp.p.b(oVarA);
            f fVar3 = this.f11603a;
            or.l1 l1VarA = or.l1.a(fVar3.f11566q1, fVar3.V0, fVar3.f11569r1);
            this.f11611e0 = l1VarA;
            this.f11613f0 = com.withpersona.sdk2.inquiry.ui.e.b(l1VarA);
            f fVar4 = this.f11603a;
            k6 k6VarA = k6.a(fVar4.f11569r1, fVar4.f11566q1, fVar4.D);
            this.f11615g0 = k6VarA;
            this.f11617h0 = com.withpersona.sdk2.inquiry.ui.l.b(k6VarA);
            this.f11619i0 = com.withpersona.sdk2.inquiry.ui.network.c.a(this.f11603a.f11566q1);
            this.f11621j0 = qr.b.a(this.f11603a.f11566q1);
            f fVar5 = this.f11603a;
            this.f11623k0 = com.withpersona.sdk2.inquiry.ui.i.a(fVar5.f11572s1, fVar5.f11539h1, fVar5.f11579v);
            com.withpersona.sdk2.inquiry.ui.c cVarA = com.withpersona.sdk2.inquiry.ui.c.a(this.f11603a.f11579v, this.f11619i0, this.f11621j0, zq.b.a(), this.f11623k0);
            this.f11625l0 = cVarA;
            f fVar6 = this.f11603a;
            this.f11627m0 = com.withpersona.sdk2.inquiry.ui.j.a(fVar6.f11579v, this.f11605b0, this.f11609d0, fVar6.f11518a0, this.f11613f0, this.f11617h0, fVar6.f11542i1, this.H, cVarA, fVar6.F0, fVar6.f11585x, fVar6.L);
            f fVar7 = this.f11603a;
            this.f11629n0 = zn.b.a(fVar7.f11575t1, fVar7.f11579v, fVar7.f11534g);
            f fVar8 = this.f11603a;
            this.f11631o0 = com.withpersona.sdk2.inquiry.document.j.a(fVar8.f11572s1, fVar8.f11578u1, fVar8.f11579v, fVar8.f11534g);
            this.f11633p0 = com.withpersona.sdk2.inquiry.document.network.b.a(this.f11603a.f11581v1);
            this.f11635q0 = com.withpersona.sdk2.inquiry.document.network.f.a(this.f11603a.f11581v1);
            f fVar9 = this.f11603a;
            this.f11637r0 = com.withpersona.sdk2.inquiry.document.network.d.a(fVar9.f11581v1, fVar9.f11584w1);
            this.f11639s0 = bo.b.a(this.f11603a.f11581v1);
            f fVar10 = this.f11603a;
            com.withpersona.sdk2.inquiry.document.network.h hVarA = com.withpersona.sdk2.inquiry.document.network.h.a(fVar10.f11581v1, fVar10.C0, fVar10.f11527d1);
            this.f11641t0 = hVarA;
            f fVar11 = this.f11603a;
            this.f11643u0 = com.withpersona.sdk2.inquiry.document.h.a(fVar11.f11568r0, fVar11.f11579v, this.H, this.f11629n0, this.f11631o0, this.f11633p0, this.f11635q0, this.f11637r0, this.f11639s0, hVarA, fVar11.f11542i1, fVar11.F0, fVar11.L);
            f fVar12 = this.f11603a;
            xo.c cVarA2 = xo.c.a(fVar12.f11579v, fVar12.f11569r1);
            this.f11645v0 = cVarA2;
            ft.i<com.withpersona.sdk2.inquiry.integration.a.InterfaceC0204a> iVarB = com.withpersona.sdk2.inquiry.integration.b.b(cVarA2);
            this.f11647w0 = iVarB;
            f fVar13 = this.f11603a;
            this.f11649x0 = com.withpersona.sdk2.inquiry.integration.c.a(fVar13.f11579v, fVar13.f11542i1, iVarB, fVar13.L);
            this.f11651y0 = zo.i0.a(this.f11603a.f11521b1);
        }

        public final void e() {
            this.f11653z0 = com.withpersona.sdk2.inquiry.internal.p.b(this.f11651y0);
            f fVar = this.f11603a;
            ho.c cVarA = ho.c.a(fVar.f11585x, fVar.f11587x1);
            this.A0 = cVarA;
            this.B0 = ho.d.a(cVarA);
            f fVar2 = this.f11603a;
            zo.g gVarA = zo.g.a(fVar2.D1, fVar2.Z0, fVar2.f11557n1);
            this.C0 = gVarA;
            ft.i<com.withpersona.sdk2.inquiry.internal.c.a> iVar = this.f11608d;
            ft.i<com.withpersona.sdk2.inquiry.internal.a.InterfaceC0212a> iVar2 = this.f11612f;
            ft.i<com.withpersona.sdk2.inquiry.internal.k.b> iVar3 = this.f11616h;
            ft.i<com.withpersona.sdk2.inquiry.internal.r.a> iVar4 = this.f11620j;
            ft.i<TransitionWorker.a> iVar5 = this.f11624l;
            ft.i<v.a> iVar6 = this.f11628n;
            ft.i<com.withpersona.sdk2.inquiry.internal.f.a> iVar7 = this.f11632p;
            ft.i<com.withpersona.sdk2.inquiry.internal.m.a> iVar8 = this.f11636r;
            ft.i<GovernmentIdWorkflow> iVar9 = this.Q;
            ft.i<SelfieWorkflow> iVar10 = this.Z;
            ft.i<UiWorkflow> iVar11 = this.f11627m0;
            ft.i<DocumentWorkflow> iVar12 = this.f11643u0;
            ft.i<IntegrationWorkflow> iVar13 = this.f11649x0;
            f fVar3 = this.f11603a;
            hp.f0 f0VarA = hp.f0.a(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, fVar3.E0, fVar3.f11542i1, fVar3.F0, fVar3.f11521b1, this.f11653z0, this.B0, fVar3.f11585x, fVar3.L, fVar3.E, fVar3.f11593z1, gVarA, fVar3.E1);
            this.D0 = f0VarA;
            ft.i<hp.e0.b> iVarB = g0.b(f0VarA);
            this.E0 = iVarB;
            kp.c cVarA2 = kp.c.a(iVarB);
            this.F0 = cVarA2;
            this.G0 = com.withpersona.sdk2.inquiry.internal.workflows.d.b(cVarA2);
            kp.d dVarA = kp.d.a();
            this.H0 = dVarA;
            this.I0 = com.withpersona.sdk2.inquiry.internal.workflows.f.b(dVarA);
        }

        public final InquiryWorkflowFragment f(InquiryWorkflowFragment inquiryWorkflowFragment) {
            com.withpersona.sdk2.inquiry.internal.workflows.b.b(inquiryWorkflowFragment, this.f11603a);
            com.withpersona.sdk2.inquiry.internal.workflows.b.e(inquiryWorkflowFragment, this.G0.get());
            com.withpersona.sdk2.inquiry.internal.workflows.b.f(inquiryWorkflowFragment, this.I0.get());
            com.withpersona.sdk2.inquiry.internal.workflows.b.d(inquiryWorkflowFragment, this.f11603a.D0.get());
            com.withpersona.sdk2.inquiry.internal.workflows.b.a(inquiryWorkflowFragment, this.f11603a.f11585x.get());
            com.withpersona.sdk2.inquiry.internal.workflows.b.c(inquiryWorkflowFragment, g());
            return inquiryWorkflowFragment;
        }

        public hp.n0 g() {
            return new hp.n0(this.f11603a.f11518a0.get());
        }
    }

    public static final class i implements xo.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11654a;

        @Override // dt.a.InterfaceC0277a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public xo.d a(IntegrationStepFragment integrationStepFragment) {
            ft.h.b(integrationStepFragment);
            return new j(this.f11654a, integrationStepFragment);
        }

        public i(f fVar) {
            this.f11654a = fVar;
        }
    }

    public static final class j implements xo.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11655a;
        public final j b = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public xo.c f11656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.integration.a.InterfaceC0204a> f11657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public yo.h f11658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.integration.fragment.b.c> f11659f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.integration.fragment.e f11660g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.integration.fragment.d.a> f11661h;

        public j(f fVar, IntegrationStepFragment integrationStepFragment) {
            this.f11655a = fVar;
            b(integrationStepFragment);
        }

        public final void b(IntegrationStepFragment integrationStepFragment) {
            f fVar = this.f11655a;
            xo.c cVarA = xo.c.a(fVar.f11579v, fVar.f11569r1);
            this.f11656c = cVarA;
            ft.i<com.withpersona.sdk2.inquiry.integration.a.InterfaceC0204a> iVarB = com.withpersona.sdk2.inquiry.integration.b.b(cVarA);
            this.f11657d = iVarB;
            f fVar2 = this.f11655a;
            yo.h hVarA = yo.h.a(fVar2.f11579v, fVar2.f11542i1, iVarB, fVar2.L, fVar2.E1);
            this.f11658e = hVarA;
            ft.i<com.withpersona.sdk2.inquiry.integration.fragment.b.c> iVarB2 = com.withpersona.sdk2.inquiry.integration.fragment.c.b(hVarA);
            this.f11659f = iVarB2;
            com.withpersona.sdk2.inquiry.integration.fragment.e eVarA = com.withpersona.sdk2.inquiry.integration.fragment.e.a(iVarB2);
            this.f11660g = eVarA;
            this.f11661h = com.withpersona.sdk2.inquiry.integration.fragment.f.b(eVarA);
        }

        @Override // dt.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(IntegrationStepFragment integrationStepFragment) {
            d(integrationStepFragment);
        }

        public final IntegrationStepFragment d(IntegrationStepFragment integrationStepFragment) {
            oq.b.a(integrationStepFragment, this.f11655a.a());
            com.withpersona.sdk2.inquiry.integration.fragment.a.b(integrationStepFragment, this.f11661h.get());
            com.withpersona.sdk2.inquiry.integration.fragment.a.a(integrationStepFragment, this.f11655a.D0.get());
            return integrationStepFragment;
        }
    }

    public static final class k implements fp.g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11662a;

        @Override // dt.a.InterfaceC0277a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public fp.g a(fp.f fVar) {
            ft.h.b(fVar);
            return new l(this.f11662a, fVar);
        }

        public k(f fVar) {
            this.f11662a = fVar;
        }
    }

    public static final class l implements fp.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11663a;
        public final l b = this;

        public l(f fVar, fp.f fVar2) {
            this.f11663a = fVar;
        }

        @Override // dt.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(fp.f fVar) {
            c(fVar);
        }

        public final fp.f c(fp.f fVar) {
            oq.b.a(fVar, this.f11663a.a());
            fp.h.a(fVar, this.f11663a.D0.get());
            return fVar;
        }
    }

    public static final class m implements l1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11664a;

        @Override // dt.a.InterfaceC0277a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l1 a(PermissionRequestFragment permissionRequestFragment) {
            ft.h.b(permissionRequestFragment);
            return new n(this.f11664a, permissionRequestFragment);
        }

        public m(f fVar) {
            this.f11664a = fVar;
        }
    }

    public static final class n implements l1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11665a;
        public final n b = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.permissions.d.a> f11666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public rp.j f11667d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0225a> f11668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public up.l f11669f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ft.i<PermissionRequestStateManager.c> f11670g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public tp.c f11671h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.c.a> f11672i;

        public n(f fVar, PermissionRequestFragment permissionRequestFragment) {
            this.f11665a = fVar;
            b(permissionRequestFragment);
        }

        public final void b(PermissionRequestFragment permissionRequestFragment) {
            f fVar = this.f11665a;
            this.f11666c = com.withpersona.sdk2.inquiry.permissions.e.a(fVar.f11579v, fVar.f11545j1, fVar.L);
            f fVar2 = this.f11665a;
            rp.j jVarA = rp.j.a(fVar2.f11548k1, fVar2.f11579v);
            this.f11667d = jVarA;
            ft.i<com.withpersona.sdk2.inquiry.permissions.a.InterfaceC0225a> iVarB = com.withpersona.sdk2.inquiry.permissions.b.b(jVarA);
            this.f11668e = iVarB;
            f fVar3 = this.f11665a;
            up.l lVarA = up.l.a(fVar3.f11579v, this.f11666c, iVarB, fVar3.L, fVar3.E1);
            this.f11669f = lVarA;
            ft.i<PermissionRequestStateManager.c> iVarB2 = com.withpersona.sdk2.inquiry.permissions.state.a.b(lVarA);
            this.f11670g = iVarB2;
            tp.c cVarA = tp.c.a(iVarB2);
            this.f11671h = cVarA;
            this.f11672i = com.withpersona.sdk2.inquiry.permissions.permissionRequest.d.b(cVarA);
        }

        @Override // dt.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(PermissionRequestFragment permissionRequestFragment) {
            d(permissionRequestFragment);
        }

        public final PermissionRequestFragment d(PermissionRequestFragment permissionRequestFragment) {
            oq.b.a(permissionRequestFragment, this.f11665a.a());
            com.withpersona.sdk2.inquiry.permissions.permissionRequest.a.a(permissionRequestFragment, this.f11672i.get());
            return permissionRequestFragment;
        }
    }

    public static final class o implements yp.c0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11673a;

        @Override // dt.a.InterfaceC0277a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public yp.c0 a(SelfieStepFragment selfieStepFragment) {
            ft.h.b(selfieStepFragment);
            return new p(this.f11673a, selfieStepFragment);
        }

        public o(f fVar) {
            this.f11673a = fVar;
        }
    }

    public static final class p implements yp.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11674a;
        public final p b = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public cq.c f11675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ft.i<cq.b.a> f11676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ft.i<tr.b.a> f11677e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public yp.v f11678f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.selfie.e.b> f11679g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public tp.d f11680h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> f11681i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public fn.t f11682j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.camera.e.a> f11683k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public hn.c0 f11684l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ft.i<b0.a> f11685m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public hn.e f11686n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public ft.i<hn.c.a> f11687o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public dq.b f11688p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public ft.i<dq.a.b> f11689q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.selfie.g> f11690r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public m2 f11691s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ft.i<k2.d> f11692t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public eq.l f11693u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.selfie.selfieStep.b.a> f11694v;

        public p(f fVar, SelfieStepFragment selfieStepFragment) {
            this.f11674a = fVar;
            b(selfieStepFragment);
        }

        public final void b(SelfieStepFragment selfieStepFragment) {
            f fVar = this.f11674a;
            cq.c cVarA = cq.c.a(fVar.f11579v, fVar.f11554m1, fVar.f11527d1, fVar.C0, fVar.f11530e1, fVar.f11536g1, fVar.L, fVar.S0);
            this.f11675c = cVarA;
            this.f11676d = cq.d.b(cVarA);
            this.f11677e = tr.c.a(this.f11674a.f11551l1);
            f fVar2 = this.f11674a;
            yp.v vVarA = yp.v.a(fVar2.Q, fVar2.f11534g);
            this.f11678f = vVarA;
            this.f11679g = com.withpersona.sdk2.inquiry.selfie.f.b(vVarA);
            tp.d dVarA = tp.d.a(this.f11674a.Q0);
            this.f11680h = dVarA;
            this.f11681i = com.withpersona.sdk2.inquiry.permissions.permissionRequest.f.b(dVarA);
            f fVar3 = this.f11674a;
            fn.t tVarA = fn.t.a(fVar3.f11579v, fVar3.f11536g1, fVar3.f11534g);
            this.f11682j = tVarA;
            this.f11683k = com.withpersona.sdk2.camera.f.b(tVarA);
            f fVar4 = this.f11674a;
            hn.c0 c0VarA = hn.c0.a(fVar4.f11579v, fVar4.f11536g1, fVar4.f11534g, fVar4.R, fVar4.G, fVar4.L, fVar4.F0, fVar4.f11585x);
            this.f11684l = c0VarA;
            ft.i<b0.a> iVarB = d0.b(c0VarA);
            this.f11685m = iVarB;
            f fVar5 = this.f11674a;
            hn.e eVarA = hn.e.a(iVarB, fVar5.R, fVar5.H, fVar5.L);
            this.f11686n = eVarA;
            this.f11687o = hn.f.b(eVarA);
            f fVar6 = this.f11674a;
            dq.b bVarA = dq.b.a(fVar6.f11582w, fVar6.f11554m1, fVar6.H, fVar6.f11557n1);
            this.f11688p = bVarA;
            this.f11689q = dq.c.b(bVarA);
            f fVar7 = this.f11674a;
            yp.w wVarA = yp.w.a(fVar7.F0, fVar7.L);
            this.f11690r = wVarA;
            f fVar8 = this.f11674a;
            m2 m2VarA = m2.a(fVar8.f11579v, this.f11676d, this.f11677e, this.f11679g, this.f11681i, this.f11683k, this.f11687o, fVar8.f11536g1, fVar8.f11542i1, fVar8.S0, fVar8.E1, this.f11689q, wVarA, fVar8.f11585x, fVar8.f11534g);
            this.f11691s = m2VarA;
            ft.i<k2.d> iVarB2 = n2.b(m2VarA);
            this.f11692t = iVarB2;
            eq.l lVarA = eq.l.a(iVarB2);
            this.f11693u = lVarA;
            this.f11694v = com.withpersona.sdk2.inquiry.selfie.selfieStep.c.b(lVarA);
        }

        @Override // dt.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(SelfieStepFragment selfieStepFragment) {
            d(selfieStepFragment);
        }

        public final SelfieStepFragment d(SelfieStepFragment selfieStepFragment) {
            oq.b.a(selfieStepFragment, this.f11674a.a());
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.f(selfieStepFragment, this.f11694v.get());
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.a(selfieStepFragment, this.f11674a.l());
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.c(selfieStepFragment, ft.c.b(this.f11674a.Q));
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.e(selfieStepFragment, this.f11674a.L.get());
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.d(selfieStepFragment, this.f11674a.D0.get());
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.b(selfieStepFragment, this.f11674a.f11585x.get());
            return selfieStepFragment;
        }
    }

    public static final class q implements sr.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11695a;

        @Override // dt.a.InterfaceC0277a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public sr.c a(UiStepFragment uiStepFragment) {
            ft.h.b(uiStepFragment);
            return new r(this.f11695a, uiStepFragment);
        }

        public q(f fVar) {
            this.f11695a = fVar;
        }
    }

    public static final class r implements sr.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11696a;
        public final r b = this;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public qp.k f11697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.nfc.b.a> f11698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public lp.o f11699e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ft.i<lp.n.a> f11700f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public or.l1 f11701g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.ui.d.a> f11702h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public k6 f11703i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.ui.k.a> f11704j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.ui.network.b.a> f11705k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ft.i<qr.a.C0521a> f11706l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.ui.h.a> f11707m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ft.i<rr.e0> f11708n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public tp.d f11709o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> f11710p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public h1 f11711q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public ft.i<g1.e> f11712r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public sr.d f11713s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ft.i<com.withpersona.sdk2.inquiry.ui.uiStep.b.a> f11714t;

        public r(f fVar, UiStepFragment uiStepFragment) {
            this.f11696a = fVar;
            b(uiStepFragment);
        }

        public final void b(UiStepFragment uiStepFragment) {
            f fVar = this.f11696a;
            qp.k kVarA = qp.k.a(fVar.f11560o1, fVar.f11579v, fVar.f11518a0, fVar.f11534g, fVar.f11585x);
            this.f11697c = kVarA;
            this.f11698d = com.withpersona.sdk2.inquiry.nfc.c.b(kVarA);
            f fVar2 = this.f11696a;
            lp.o oVarA = lp.o.a(fVar2.f11563p1, fVar2.f11579v, fVar2.f11518a0);
            this.f11699e = oVarA;
            this.f11700f = lp.p.b(oVarA);
            f fVar3 = this.f11696a;
            or.l1 l1VarA = or.l1.a(fVar3.f11566q1, fVar3.V0, fVar3.f11569r1);
            this.f11701g = l1VarA;
            this.f11702h = com.withpersona.sdk2.inquiry.ui.e.b(l1VarA);
            f fVar4 = this.f11696a;
            k6 k6VarA = k6.a(fVar4.f11569r1, fVar4.f11566q1, fVar4.D);
            this.f11703i = k6VarA;
            this.f11704j = com.withpersona.sdk2.inquiry.ui.l.b(k6VarA);
            this.f11705k = com.withpersona.sdk2.inquiry.ui.network.c.a(this.f11696a.f11566q1);
            this.f11706l = qr.b.a(this.f11696a.f11566q1);
            f fVar5 = this.f11696a;
            this.f11707m = com.withpersona.sdk2.inquiry.ui.i.a(fVar5.f11572s1, fVar5.f11539h1, fVar5.f11579v);
            this.f11708n = rr.f0.a(this.f11696a.f11579v, this.f11705k, this.f11706l, zq.b.a(), this.f11707m);
            tp.d dVarA = tp.d.a(this.f11696a.Q0);
            this.f11709o = dVarA;
            ft.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.e.a> iVarB = com.withpersona.sdk2.inquiry.permissions.permissionRequest.f.b(dVarA);
            this.f11710p = iVarB;
            f fVar6 = this.f11696a;
            h1 h1VarA = h1.a(fVar6.f11579v, this.f11698d, this.f11700f, fVar6.f11518a0, this.f11702h, this.f11704j, fVar6.f11542i1, this.f11708n, fVar6.F0, fVar6.f11585x, fVar6.L, iVarB, fVar6.E1);
            this.f11711q = h1VarA;
            ft.i<g1.e> iVarB2 = i1.b(h1VarA);
            this.f11712r = iVarB2;
            sr.d dVarA2 = sr.d.a(iVarB2);
            this.f11713s = dVarA2;
            this.f11714t = com.withpersona.sdk2.inquiry.ui.uiStep.c.b(dVarA2);
        }

        @Override // dt.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(UiStepFragment uiStepFragment) {
            d(uiStepFragment);
        }

        public final UiStepFragment d(UiStepFragment uiStepFragment) {
            oq.b.a(uiStepFragment, this.f11696a.a());
            com.withpersona.sdk2.inquiry.ui.uiStep.a.b(uiStepFragment, this.f11714t.get());
            com.withpersona.sdk2.inquiry.ui.uiStep.a.a(uiStepFragment, this.f11696a.D0.get());
            return uiStepFragment;
        }
    }

    public static final class s implements jp.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11715a;

        @Override // dt.a.InterfaceC0277a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public jp.c a(jp.b bVar) {
            ft.h.b(bVar);
            return new t(this.f11715a, bVar);
        }

        public s(f fVar) {
            this.f11715a = fVar;
        }
    }

    public static final class t implements jp.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f11716a;
        public final t b = this;

        public t(f fVar, jp.b bVar) {
            this.f11716a = fVar;
        }

        @Override // dt.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(jp.b bVar) {
            c(bVar);
        }

        public final jp.b c(jp.b bVar) {
            oq.b.a(bVar, this.f11716a.a());
            jp.d.b(bVar, this.f11716a.W.get());
            jp.d.a(bVar, this.f11716a.D0.get());
            return bVar;
        }
    }

    public static a a() {
        return new a();
    }
}
