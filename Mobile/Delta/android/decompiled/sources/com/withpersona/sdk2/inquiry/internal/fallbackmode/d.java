package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.InquiryFieldMap;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import ep.InquiryAttributes;
import gt.n;
import gt.o;
import hv.x;
import iu.g1;
import iu.l0;
import iu.p0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nt.l;
import nt.m;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;", "Lbp/a;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "service", "Lsm/w;", "moshi", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "staticTemplateSessionFactory", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;Lsm/w;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;)V", "Lep/e;", "attributes", "Lgt/n;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "c", "(Lep/e;Llt/b;)Ljava/lang/Object;", "", "sessionToken", "Lokhttp3/RequestBody;", "body", "Lhv/x;", "a", "(Ljava/lang/String;Lokhttp3/RequestBody;Llt/b;)Ljava/lang/Object;", "b", "", "f", "()I", "Lbp/h;", "endpoint", "h", "(Ljava/lang/String;Lokhttp3/RequestBody;Lbp/h;Llt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "g", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "Lsm/w;", "getMoshi", "()Lsm/w;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "getStaticTemplateSessionFactory", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "d", "I", "requestCount", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements bp.a {

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

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController", f = "ApiController.kt", l = {84, 120}, m = "createSession-gIAlu-s")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11835t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f11836u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f11837v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f11838w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f11840y;

        public a(lt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11838w = obj;
            this.f11840y |= Integer.MIN_VALUE;
            Object objC = d.this.c(null, this);
            return objC == mt.c.e() ? objC : n.a(objC);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1", f = "ApiController.kt", l = {85}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "<anonymous>", "(Liu/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
    public static final class b extends m implements Function2<p0, lt.b<? super NetworkCallResult<FallbackModeService.StatusResponse>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11841t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InquiryAttributes f11842u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ d f11843v;

        @nt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1$1", f = "ApiController.kt", l = {88}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhv/x;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "<anonymous>", "()Lhv/x;"}, k = 3, mv = {2, 2, 0})
        public static final class a extends m implements Function1<lt.b<? super x<FallbackModeService.StatusResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f11844t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f11845u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ InquiryAttributes f11846v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ d f11847w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InquiryAttributes inquiryAttributes, d dVar, lt.b<? super a> bVar) {
                super(1, bVar);
                this.f11846v = inquiryAttributes;
                this.f11847w = dVar;
            }

            @Override // nt.a
            public final lt.b<Unit> create(lt.b<?> bVar) {
                return new a(this.f11846v, this.f11847w, bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                String str;
                Object objE = mt.c.e();
                int i10 = this.f11845u;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                String sessionToken = this.f11846v.getSessionToken();
                if (sessionToken == null || sessionToken.length() == 0) {
                    str = null;
                } else {
                    str = "Bearer " + com.withpersona.sdk2.inquiry.internal.h.INSTANCE.a(this.f11846v.getSessionToken());
                }
                FallbackModeService service = this.f11847w.getService();
                FallbackModeService.StatusRequest statusRequest = new FallbackModeService.StatusRequest(this.f11846v.getTemplateId());
                this.f11844t = l.a(str);
                this.f11845u = 1;
                Object objC = service.c(str, statusRequest, this);
                return objC == objE ? objE : objC;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(lt.b<? super x<FallbackModeService.StatusResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InquiryAttributes inquiryAttributes, d dVar, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f11842u = inquiryAttributes;
            this.f11843v = dVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new b(this.f11842u, this.f11843v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super NetworkCallResult<FallbackModeService.StatusResponse>> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f11841t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(this.f11842u, this.f11843v, null);
            this.f11841t = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == objE ? objE : objEnqueueRetriableRequestWithRetry;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1", f = "ApiController.kt", l = {121}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "<anonymous>", "(Liu/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<p0, lt.b<? super NetworkCallResult<FallbackModeService.SessionIdResponse>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11848t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InquiryAttributes f11850v;

        @nt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1$1", f = "ApiController.kt", l = {122}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhv/x;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "<anonymous>", "()Lhv/x;"}, k = 3, mv = {2, 2, 0})
        public static final class a extends m implements Function1<lt.b<? super x<FallbackModeService.SessionIdResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f11851t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ d f11852u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ InquiryAttributes f11853v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, InquiryAttributes inquiryAttributes, lt.b<? super a> bVar) {
                super(1, bVar);
                this.f11852u = dVar;
                this.f11853v = inquiryAttributes;
            }

            @Override // nt.a
            public final lt.b<Unit> create(lt.b<?> bVar) {
                return new a(this.f11852u, this.f11853v, bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f11851t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                FallbackModeService service = this.f11852u.getService();
                FallbackModeService.SessionIdRequest sessionIdRequest = new FallbackModeService.SessionIdRequest(this.f11853v.getTemplateId(), this.f11853v.getTemplateVersion(), this.f11853v.getInquiryId(), this.f11853v.getReferenceId(), this.f11853v.getAccountId(), ep.b.a(this.f11853v.getEnvironment()), this.f11853v.getEnvironmentId(), this.f11853v.d() != null ? new InquiryFieldMap(ep.a.t(this.f11853v.d())) : null, this.f11853v.getThemeSetId());
                this.f11851t = 1;
                Object objB = service.b(sessionIdRequest, this);
                return objB == objE ? objE : objB;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(lt.b<? super x<FallbackModeService.SessionIdResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InquiryAttributes inquiryAttributes, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f11850v = inquiryAttributes;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return d.this.new c(this.f11850v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super NetworkCallResult<FallbackModeService.SessionIdResponse>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f11848t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(d.this, this.f11850v, null);
            this.f11848t = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == objE ? objE : objEnqueueRetriableRequestWithRetry;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.d$d, reason: collision with other inner class name */
    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController", f = "ApiController.kt", l = {175, 210}, m = "transition")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0219d extends nt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11854t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f11855u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f11856v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f11857w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f11858x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f11859y;

        public C0219d(lt.b<? super C0219d> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11859y = obj;
            this.A |= Integer.MIN_VALUE;
            return d.this.h(null, null, null, this);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1", f = "ApiController.kt", l = {176}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "<anonymous>", "(Liu/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
    public static final class e extends m implements Function2<p0, lt.b<? super NetworkCallResult<FallbackModeService.UploadUrlResponse>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11861t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f11863v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ bp.h f11864w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ RequestBody f11865x;

        @nt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1$1", f = "ApiController.kt", l = {177}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhv/x;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "<anonymous>", "()Lhv/x;"}, k = 3, mv = {2, 2, 0})
        public static final class a extends m implements Function1<lt.b<? super x<FallbackModeService.UploadUrlResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f11866t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ d f11867u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f11868v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ bp.h f11869w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ RequestBody f11870x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, String str, bp.h hVar, RequestBody requestBody, lt.b<? super a> bVar) {
                super(1, bVar);
                this.f11867u = dVar;
                this.f11868v = str;
                this.f11869w = hVar;
                this.f11870x = requestBody;
            }

            @Override // nt.a
            public final lt.b<Unit> create(lt.b<?> bVar) {
                return new a(this.f11867u, this.f11868v, this.f11869w, this.f11870x, bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                String string;
                Object objE = mt.c.e();
                int i10 = this.f11866t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                FallbackModeService service = this.f11867u.getService();
                String str = this.f11868v;
                bp.h hVar = this.f11869w;
                int iF = this.f11867u.f();
                long jContentLength = this.f11870x.contentLength();
                MediaType mediaType = this.f11870x.get$contentType();
                if (mediaType == null || (string = mediaType.toString()) == null) {
                    string = "application/json";
                }
                FallbackModeService.UploadUrlRequest uploadUrlRequest = new FallbackModeService.UploadUrlRequest(jContentLength, string);
                this.f11866t = 1;
                Object objD = service.d(str, hVar, iF, uploadUrlRequest, this);
                return objD == objE ? objE : objD;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(lt.b<? super x<FallbackModeService.UploadUrlResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, bp.h hVar, RequestBody requestBody, lt.b<? super e> bVar) {
            super(2, bVar);
            this.f11863v = str;
            this.f11864w = hVar;
            this.f11865x = requestBody;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return d.this.new e(this.f11863v, this.f11864w, this.f11865x, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super NetworkCallResult<FallbackModeService.UploadUrlResponse>> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f11861t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(d.this, this.f11863v, this.f11864w, this.f11865x, null);
            this.f11861t = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == objE ? objE : objEnqueueRetriableRequestWithRetry;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1", f = "ApiController.kt", l = {211}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "", "<anonymous>", "(Liu/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
    public static final class f extends m implements Function2<p0, lt.b<? super NetworkCallResult<Object>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11871t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f11873v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ RequestBody f11874w;

        @nt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1$1", f = "ApiController.kt", l = {212}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhv/x;", "", "<anonymous>", "()Lhv/x;"}, k = 3, mv = {2, 2, 0})
        public static final class a extends m implements Function1<lt.b<? super x<Object>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f11875t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ d f11876u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f11877v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ RequestBody f11878w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, String str, RequestBody requestBody, lt.b<? super a> bVar) {
                super(1, bVar);
                this.f11876u = dVar;
                this.f11877v = str;
                this.f11878w = requestBody;
            }

            @Override // nt.a
            public final lt.b<Unit> create(lt.b<?> bVar) {
                return new a(this.f11876u, this.f11877v, this.f11878w, bVar);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f11875t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                FallbackModeService service = this.f11876u.getService();
                String str = this.f11877v;
                RequestBody requestBody = this.f11878w;
                this.f11875t = 1;
                Object objA = service.a(str, requestBody, this);
                return objA == objE ? objE : objA;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(lt.b<? super x<Object>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22938a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, RequestBody requestBody, lt.b<? super f> bVar) {
            super(2, bVar);
            this.f11873v = str;
            this.f11874w = requestBody;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return d.this.new f(this.f11873v, this.f11874w, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super NetworkCallResult<Object>> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f11871t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(d.this, this.f11873v, this.f11874w, null);
            this.f11871t = 1;
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

    @Override // bp.a
    @Nullable
    public Object a(@NotNull String str, @NotNull RequestBody requestBody, @NotNull lt.b<? super x<?>> bVar) {
        return h(str, requestBody, bp.h.Transition, bVar);
    }

    @Override // bp.a
    @Nullable
    public Object b(@NotNull String str, @NotNull RequestBody requestBody, @NotNull lt.b<? super x<?>> bVar) {
        return h(str, requestBody, bp.h.TransitionBack, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0111  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:67:0x011f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    /* JADX WARN: Code duplicated, block: B:71:0x0137  */
    /* JADX WARN: Code duplicated, block: B:73:0x0144  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // bp.a
    @Nullable
    public Object c(@NotNull InquiryAttributes inquiryAttributes, @NotNull lt.b<? super n<i>> bVar) {
        a aVar;
        String sessionToken;
        List<NextStep> list;
        FallbackModeService.StaticTemplate staticInquiryTemplate;
        NetworkCallResult networkCallResult;
        FallbackModeService.SessionIdResponse sessionIdResponse;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f11840y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f11840y = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object objG = aVar.f11838w;
        Object objE = mt.c.e();
        int i11 = aVar.f11840y;
        String token = null;
        if (i11 == 0) {
            o.b(objG);
            String templateId = inquiryAttributes.getTemplateId();
            if ((templateId == null || templateId.length() == 0) && ((sessionToken = inquiryAttributes.getSessionToken()) == null || sessionToken.length() == 0)) {
                n.Companion companion = n.INSTANCE;
                return n.b(o.a(new bp.b("Expected templateId or session token to be non-null")));
            }
            l0 l0VarA = g1.a();
            b bVar2 = new b(inquiryAttributes, this, null);
            aVar.f11835t = inquiryAttributes;
            aVar.f11840y = 1;
            objG = iu.i.g(l0VarA, bVar2, aVar);
            if (objG != objE) {
            }
            return objE;
        }
        if (i11 == 1) {
            inquiryAttributes = (InquiryAttributes) aVar.f11835t;
            o.b(objG);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) aVar.f11837v;
            o.b(objG);
        }
        networkCallResult = (NetworkCallResult) objG;
        if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
            if (networkCallResult instanceof NetworkCallResult.Success) {
                throw new gt.l();
            }
            sessionIdResponse = (FallbackModeService.SessionIdResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
            if (sessionIdResponse != null) {
                token = sessionIdResponse.getToken();
            }
        }
        if (token == null) {
            n.Companion companion2 = n.INSTANCE;
            return n.b(o.a(new bp.b("Failed to create session")));
        }
        n.Companion companion3 = n.INSTANCE;
        return n.b(this.staticTemplateSessionFactory.a(list, token));
        NetworkCallResult networkCallResult2 = (NetworkCallResult) objG;
        if (networkCallResult2 instanceof NetworkCallResult.Failure) {
            n.Companion companion4 = n.INSTANCE;
            return n.b(o.a(new bp.b("Failed to check status")));
        }
        if (!(networkCallResult2 instanceof NetworkCallResult.Success)) {
            throw new gt.l();
        }
        FallbackModeService.StatusResponse statusResponse = (FallbackModeService.StatusResponse) ((NetworkCallResult.Success) networkCallResult2).getResponse();
        List<NextStep> listA = (statusResponse == null || (staticInquiryTemplate = statusResponse.getStaticInquiryTemplate()) == null) ? null : staticInquiryTemplate.a();
        if (listA == null || listA.isEmpty()) {
            n.Companion companion5 = n.INSTANCE;
            return n.b(o.a(new bp.b("Expected steps to contain at least one step")));
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
            return n.b(o.a(new bp.b("Template ID is required to create a fallback session without an existing session token")));
        }
        l0 l0VarA2 = g1.a();
        c cVar = new c(inquiryAttributes, null);
        aVar.f11835t = l.a(inquiryAttributes);
        aVar.f11836u = l.a(networkCallResult2);
        aVar.f11837v = listA;
        aVar.f11840y = 2;
        objG = iu.i.g(l0VarA2, cVar, aVar);
        if (objG != objE) {
            list = listA;
            networkCallResult = (NetworkCallResult) objG;
            if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
                if (networkCallResult instanceof NetworkCallResult.Success) {
                    throw new gt.l();
                }
                sessionIdResponse = (FallbackModeService.SessionIdResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                if (sessionIdResponse != null) {
                    token = sessionIdResponse.getToken();
                }
            }
            if (token == null) {
                n.Companion companion8 = n.INSTANCE;
                return n.b(o.a(new bp.b("Failed to create session")));
            }
            n.Companion companion9 = n.INSTANCE;
            return n.b(this.staticTemplateSessionFactory.a(list, token));
        }
        return objE;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r17, okhttp3.RequestBody r18, bp.h r19, lt.b<? super hv.x<?>> r20) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.fallbackmode.d.h(java.lang.String, okhttp3.RequestBody, bp.h, lt.b):java.lang.Object");
    }
}
