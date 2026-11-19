package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import av.g1;
import av.l0;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.InquiryFieldMap;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import gu.l;
import gu.m;
import hn.w;
import java.util.List;
import mv.b0;
import mv.g0;
import mv.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import sw.x;
import up.InquiryAttributes;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;", "Lrp/a;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "service", "Lhn/w;", "moshi", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "staticTemplateSessionFactory", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;Lhn/w;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;)V", "Lup/e;", "attributes", "Lzt/n;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "b", "(Lup/e;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "sessionToken", "Lmv/g0;", "body", "Lsw/x;", "a", "(Ljava/lang/String;Lmv/g0;Leu/b;)Ljava/lang/Object;", "c", BuildConfig.FLAVOR, "f", "()I", "Lrp/h;", "endpoint", "h", "(Ljava/lang/String;Lmv/g0;Lrp/h;Leu/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "g", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "Lhn/w;", "getMoshi", "()Lhn/w;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "getStaticTemplateSessionFactory", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "d", "I", "requestCount", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements rp.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FallbackModeService service;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final w moshi;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i.a staticTemplateSessionFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int requestCount;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController", f = "ApiController.kt", l = {84, 120}, m = "createSession-gIAlu-s")
    public static final class a extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10396t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f10397u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f10398v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f10399w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f10401y;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10399w = obj;
            this.f10401y |= Integer.MIN_VALUE;
            Object objB = d.this.b(null, this);
            return objB == fu.c.e() ? objB : n.a(objB);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "<anonymous>", "(Lav/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1", f = "ApiController.kt", l = {85}, m = "invokeSuspend")
    public static final class b extends m implements Function2<p0, eu.b<? super NetworkCallResult<FallbackModeService.StatusResponse>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10402t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InquiryAttributes f10403u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ d f10404v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1$1", f = "ApiController.kt", l = {88}, m = "invokeSuspend")
        public static final class a extends m implements Function1<eu.b<? super x<FallbackModeService.StatusResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f10405t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f10406u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ InquiryAttributes f10407v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ d f10408w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InquiryAttributes inquiryAttributes, d dVar, eu.b<? super a> bVar) {
                super(1, bVar);
                this.f10407v = inquiryAttributes;
                this.f10408w = dVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new a(this.f10407v, this.f10408w, bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                String str;
                Object objE = fu.c.e();
                int i10 = this.f10406u;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                String sessionToken = this.f10407v.getSessionToken();
                if (sessionToken == null || sessionToken.length() == 0) {
                    str = null;
                } else {
                    str = "Bearer " + com.withpersona.sdk2.inquiry.internal.h.INSTANCE.a(this.f10407v.getSessionToken());
                }
                FallbackModeService service = this.f10408w.getService();
                FallbackModeService.StatusRequest statusRequest = new FallbackModeService.StatusRequest(this.f10407v.getTemplateId());
                this.f10405t = l.a(str);
                this.f10406u = 1;
                Object objC = service.c(str, statusRequest, this);
                return objC == objE ? objE : objC;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super x<FallbackModeService.StatusResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InquiryAttributes inquiryAttributes, d dVar, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f10403u = inquiryAttributes;
            this.f10404v = dVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new b(this.f10403u, this.f10404v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super NetworkCallResult<FallbackModeService.StatusResponse>> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f10402t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(this.f10403u, this.f10404v, null);
            this.f10402t = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == objE ? objE : objEnqueueRetriableRequestWithRetry;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "<anonymous>", "(Lav/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1", f = "ApiController.kt", l = {121}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, eu.b<? super NetworkCallResult<FallbackModeService.SessionIdResponse>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10409t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InquiryAttributes f10411v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1$1", f = "ApiController.kt", l = {122}, m = "invokeSuspend")
        public static final class a extends m implements Function1<eu.b<? super x<FallbackModeService.SessionIdResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f10412t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ d f10413u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ InquiryAttributes f10414v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, InquiryAttributes inquiryAttributes, eu.b<? super a> bVar) {
                super(1, bVar);
                this.f10413u = dVar;
                this.f10414v = inquiryAttributes;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new a(this.f10413u, this.f10414v, bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f10412t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                FallbackModeService service = this.f10413u.getService();
                FallbackModeService.SessionIdRequest sessionIdRequest = new FallbackModeService.SessionIdRequest(this.f10414v.getTemplateId(), this.f10414v.getTemplateVersion(), this.f10414v.getInquiryId(), this.f10414v.getReferenceId(), this.f10414v.getAccountId(), up.b.a(this.f10414v.getEnvironment()), this.f10414v.getEnvironmentId(), this.f10414v.d() != null ? new InquiryFieldMap(up.a.t(this.f10414v.d())) : null, this.f10414v.getThemeSetId());
                this.f10412t = 1;
                Object objB = service.b(sessionIdRequest, this);
                return objB == objE ? objE : objB;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super x<FallbackModeService.SessionIdResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InquiryAttributes inquiryAttributes, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f10411v = inquiryAttributes;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return d.this.new c(this.f10411v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super NetworkCallResult<FallbackModeService.SessionIdResponse>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f10409t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(d.this, this.f10411v, null);
            this.f10409t = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == objE ? objE : objEnqueueRetriableRequestWithRetry;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController", f = "ApiController.kt", l = {175, 210}, m = "transition")
    public static final class C0180d extends gu.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10415t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f10416u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f10417v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f10418w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f10419x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f10420y;

        public C0180d(eu.b<? super C0180d> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10420y = obj;
            this.A |= Integer.MIN_VALUE;
            return d.this.h(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "<anonymous>", "(Lav/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1", f = "ApiController.kt", l = {176}, m = "invokeSuspend")
    public static final class e extends m implements Function2<p0, eu.b<? super NetworkCallResult<FallbackModeService.UploadUrlResponse>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10422t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f10424v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ rp.h f10425w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ g0 f10426x;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1$1", f = "ApiController.kt", l = {177}, m = "invokeSuspend")
        public static final class a extends m implements Function1<eu.b<? super x<FallbackModeService.UploadUrlResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f10427t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ d f10428u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f10429v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ rp.h f10430w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ g0 f10431x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, String str, rp.h hVar, g0 g0Var, eu.b<? super a> bVar) {
                super(1, bVar);
                this.f10428u = dVar;
                this.f10429v = str;
                this.f10430w = hVar;
                this.f10431x = g0Var;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new a(this.f10428u, this.f10429v, this.f10430w, this.f10431x, bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                String mediaType;
                Object objE = fu.c.e();
                int i10 = this.f10427t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                FallbackModeService service = this.f10428u.getService();
                String str = this.f10429v;
                rp.h hVar = this.f10430w;
                int iF = this.f10428u.f();
                long jA = this.f10431x.a();
                b0 f24606c = this.f10431x.getF24606c();
                if (f24606c == null || (mediaType = f24606c.getMediaType()) == null) {
                    mediaType = "application/json";
                }
                FallbackModeService.UploadUrlRequest uploadUrlRequest = new FallbackModeService.UploadUrlRequest(jA, mediaType);
                this.f10427t = 1;
                Object objA = service.a(str, hVar, iF, uploadUrlRequest, this);
                return objA == objE ? objE : objA;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super x<FallbackModeService.UploadUrlResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, rp.h hVar, g0 g0Var, eu.b<? super e> bVar) {
            super(2, bVar);
            this.f10424v = str;
            this.f10425w = hVar;
            this.f10426x = g0Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return d.this.new e(this.f10424v, this.f10425w, this.f10426x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super NetworkCallResult<FallbackModeService.UploadUrlResponse>> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f10422t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(d.this, this.f10424v, this.f10425w, this.f10426x, null);
            this.f10422t = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == objE ? objE : objEnqueueRetriableRequestWithRetry;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1", f = "ApiController.kt", l = {211}, m = "invokeSuspend")
    public static final class f extends m implements Function2<p0, eu.b<? super NetworkCallResult<Object>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10432t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f10434v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ g0 f10435w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", BuildConfig.FLAVOR, "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1$1", f = "ApiController.kt", l = {212}, m = "invokeSuspend")
        public static final class a extends m implements Function1<eu.b<? super x<Object>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f10436t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ d f10437u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f10438v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ g0 f10439w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, String str, g0 g0Var, eu.b<? super a> bVar) {
                super(1, bVar);
                this.f10437u = dVar;
                this.f10438v = str;
                this.f10439w = g0Var;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new a(this.f10437u, this.f10438v, this.f10439w, bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f10436t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                FallbackModeService service = this.f10437u.getService();
                String str = this.f10438v;
                g0 g0Var = this.f10439w;
                this.f10436t = 1;
                Object objD = service.d(str, g0Var, this);
                return objD == objE ? objE : objD;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super x<Object>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, g0 g0Var, eu.b<? super f> bVar) {
            super(2, bVar);
            this.f10434v = str;
            this.f10435w = g0Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return d.this.new f(this.f10434v, this.f10435w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super NetworkCallResult<Object>> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f10432t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(d.this, this.f10434v, this.f10435w, null);
            this.f10432t = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == objE ? objE : objEnqueueRetriableRequestWithRetry;
        }
    }

    public d(@NotNull FallbackModeService service, @NotNull w moshi, @NotNull i.a staticTemplateSessionFactory) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(staticTemplateSessionFactory, "staticTemplateSessionFactory");
        this.service = service;
        this.moshi = moshi;
        this.staticTemplateSessionFactory = staticTemplateSessionFactory;
    }

    @Override // rp.a
    @Nullable
    public Object a(@NotNull String str, @NotNull g0 g0Var, @NotNull eu.b<? super x<?>> bVar) {
        return h(str, g0Var, rp.h.Transition, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0111  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:67:0x011f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    /* JADX WARN: Code duplicated, block: B:71:0x0137  */
    /* JADX WARN: Code duplicated, block: B:73:0x0144  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rp.a
    @Nullable
    public Object b(@NotNull InquiryAttributes inquiryAttributes, @NotNull eu.b<? super n<i>> bVar) {
        a aVar;
        String sessionToken;
        List<NextStep> list;
        FallbackModeService.StaticTemplate staticInquiryTemplate;
        NetworkCallResult networkCallResult;
        FallbackModeService.SessionIdResponse sessionIdResponse;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f10401y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f10401y = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object objG = aVar.f10399w;
        Object objE = fu.c.e();
        int i11 = aVar.f10401y;
        String token = null;
        if (i11 == 0) {
            o.b(objG);
            String templateId = inquiryAttributes.getTemplateId();
            if ((templateId == null || templateId.length() == 0) && ((sessionToken = inquiryAttributes.getSessionToken()) == null || sessionToken.length() == 0)) {
                n.Companion companion = n.INSTANCE;
                return n.b(o.a(new rp.b("Expected templateId or session token to be non-null")));
            }
            l0 l0VarA = g1.a();
            b bVar2 = new b(inquiryAttributes, this, null);
            aVar.f10396t = inquiryAttributes;
            aVar.f10401y = 1;
            objG = av.i.g(l0VarA, bVar2, aVar);
            if (objG != objE) {
            }
            return objE;
        }
        if (i11 == 1) {
            inquiryAttributes = (InquiryAttributes) aVar.f10396t;
            o.b(objG);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) aVar.f10398v;
            o.b(objG);
        }
        networkCallResult = (NetworkCallResult) objG;
        if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
            if (networkCallResult instanceof NetworkCallResult.Success) {
                throw new zt.l();
            }
            sessionIdResponse = (FallbackModeService.SessionIdResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
            if (sessionIdResponse != null) {
                token = sessionIdResponse.getToken();
            }
        }
        if (token == null) {
            n.Companion companion2 = n.INSTANCE;
            return n.b(o.a(new rp.b("Failed to create session")));
        }
        n.Companion companion3 = n.INSTANCE;
        return n.b(this.staticTemplateSessionFactory.a(list, token));
        NetworkCallResult networkCallResult2 = (NetworkCallResult) objG;
        if (networkCallResult2 instanceof NetworkCallResult.Failure) {
            n.Companion companion4 = n.INSTANCE;
            return n.b(o.a(new rp.b("Failed to check status")));
        }
        if (!(networkCallResult2 instanceof NetworkCallResult.Success)) {
            throw new zt.l();
        }
        FallbackModeService.StatusResponse statusResponse = (FallbackModeService.StatusResponse) ((NetworkCallResult.Success) networkCallResult2).getResponse();
        List<NextStep> listA = (statusResponse == null || (staticInquiryTemplate = statusResponse.getStaticInquiryTemplate()) == null) ? null : staticInquiryTemplate.a();
        if (listA == null || listA.isEmpty()) {
            n.Companion companion5 = n.INSTANCE;
            return n.b(o.a(new rp.b("Expected steps to contain at least one step")));
        }
        if (inquiryAttributes.getSessionToken() != null) {
            String strA = com.withpersona.sdk2.inquiry.internal.h.INSTANCE.a(inquiryAttributes.getSessionToken());
            if (strA == null) {
                strA = inquiryAttributes.getSessionToken();
            }
            n.Companion companion6 = n.INSTANCE;
            return n.b(this.staticTemplateSessionFactory.a(listA, strA));
        }
        String templateId2 = inquiryAttributes.getTemplateId();
        if (templateId2 == null || templateId2.length() == 0) {
            n.Companion companion7 = n.INSTANCE;
            return n.b(o.a(new rp.b("Template ID is required to create a fallback session without an existing session token")));
        }
        l0 l0VarA2 = g1.a();
        c cVar = new c(inquiryAttributes, null);
        aVar.f10396t = l.a(inquiryAttributes);
        aVar.f10397u = l.a(networkCallResult2);
        aVar.f10398v = listA;
        aVar.f10401y = 2;
        objG = av.i.g(l0VarA2, cVar, aVar);
        if (objG != objE) {
            list = listA;
            networkCallResult = (NetworkCallResult) objG;
            if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
                if (networkCallResult instanceof NetworkCallResult.Success) {
                    throw new zt.l();
                }
                sessionIdResponse = (FallbackModeService.SessionIdResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                if (sessionIdResponse != null) {
                    token = sessionIdResponse.getToken();
                }
            }
            if (token == null) {
                n.Companion companion8 = n.INSTANCE;
                return n.b(o.a(new rp.b("Failed to create session")));
            }
            n.Companion companion9 = n.INSTANCE;
            return n.b(this.staticTemplateSessionFactory.a(list, token));
        }
        return objE;
    }

    @Override // rp.a
    @Nullable
    public Object c(@NotNull String str, @NotNull g0 g0Var, @NotNull eu.b<? super x<?>> bVar) {
        return h(str, g0Var, rp.h.TransitionBack, bVar);
    }

    public final int f() {
        int i10 = this.requestCount + 1;
        this.requestCount = i10;
        return i10;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final FallbackModeService getService() {
        return this.service;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0136, code lost:
    
        if (r0 == r7) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, g0 g0Var, rp.h hVar, eu.b<? super x<?>> bVar) {
        C0180d c0180d;
        rp.h hVar2;
        g0 g0Var2;
        String str2;
        if (bVar instanceof C0180d) {
            c0180d = (C0180d) bVar;
            int i10 = c0180d.A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0180d.A = i10 - Integer.MIN_VALUE;
            } else {
                c0180d = new C0180d(bVar);
            }
        } else {
            c0180d = new C0180d(bVar);
        }
        C0180d c0180d2 = c0180d;
        Object objG = c0180d2.f10420y;
        Object objE = fu.c.e();
        int i11 = c0180d2.A;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarA = g1.a();
            e eVar = new e(str, hVar, g0Var, null);
            c0180d2.f10415t = l.a(str);
            c0180d2.f10416u = g0Var;
            c0180d2.f10417v = l.a(hVar);
            c0180d2.A = 1;
            objG = av.i.g(l0VarA, eVar, c0180d2);
            if (objG != objE) {
                hVar2 = hVar;
                g0Var2 = g0Var;
                str2 = str;
            }
            return objE;
        }
        if (i11 == 1) {
            hVar2 = (rp.h) c0180d2.f10417v;
            g0Var2 = (g0) c0180d2.f10416u;
            str2 = (String) c0180d2.f10415t;
            o.b(objG);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(objG);
        }
        NetworkCallResult networkCallResult = (NetworkCallResult) objG;
        if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
            if (!(networkCallResult instanceof NetworkCallResult.Success)) {
                throw new zt.l();
            }
            x xVarI = x.i(null);
            Intrinsics.checkNotNull(xVarI);
            return xVarI;
        }
        i0.Companion companion = i0.INSTANCE;
        String json = this.moshi.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create("Fallback mode API error."));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        x xVarC = x.c(0, companion.c(json, b0.INSTANCE.a("application/json")));
        Intrinsics.checkNotNull(xVarC);
        return xVarC;
        NetworkCallResult networkCallResult2 = (NetworkCallResult) objG;
        if (networkCallResult2 instanceof NetworkCallResult.Failure) {
            i0.Companion companion2 = i0.INSTANCE;
            String json2 = this.moshi.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create("Fallback mode API error."));
            Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
            x xVarC2 = x.c(0, companion2.c(json2, b0.INSTANCE.a("application/json")));
            Intrinsics.checkNotNullExpressionValue(xVarC2, "error(...)");
            return xVarC2;
        }
        if (!(networkCallResult2 instanceof NetworkCallResult.Success)) {
            throw new zt.l();
        }
        FallbackModeService.UploadUrlResponse uploadUrlResponse = (FallbackModeService.UploadUrlResponse) ((NetworkCallResult.Success) networkCallResult2).getResponse();
        String location = uploadUrlResponse != null ? uploadUrlResponse.getLocation() : null;
        if (location == null) {
            i0.Companion companion3 = i0.INSTANCE;
            String json3 = this.moshi.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create("Fallback mode API error."));
            Intrinsics.checkNotNullExpressionValue(json3, "toJson(...)");
            x xVarC3 = x.c(0, companion3.c(json3, b0.INSTANCE.a("application/json")));
            Intrinsics.checkNotNullExpressionValue(xVarC3, "error(...)");
            return xVarC3;
        }
        l0 l0VarA2 = g1.a();
        f fVar = new f(location, g0Var2, null);
        c0180d2.f10415t = l.a(str2);
        c0180d2.f10416u = l.a(g0Var2);
        c0180d2.f10417v = l.a(hVar2);
        c0180d2.f10418w = l.a(networkCallResult2);
        c0180d2.f10419x = l.a(location);
        c0180d2.A = 2;
        objG = av.i.g(l0VarA2, fVar, c0180d2);
    }
}
