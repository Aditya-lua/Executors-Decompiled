package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.InquiryFieldMap;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import gp.InquiryAttributes;
import java.util.List;
import jt.n;
import jt.o;
import jv.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.l0;
import ku.p0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.l;
import pt.m;
import um.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;", "Ldp/a;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "service", "Lum/w;", "moshi", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "staticTemplateSessionFactory", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;Lum/w;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;)V", "Lgp/e;", "attributes", "Ljt/n;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "b", "(Lgp/e;Lnt/b;)Ljava/lang/Object;", "", "sessionToken", "Lokhttp3/RequestBody;", "body", "Ljv/x;", "c", "(Ljava/lang/String;Lokhttp3/RequestBody;Lnt/b;)Ljava/lang/Object;", "a", "", "f", "()I", "Ldp/h;", "endpoint", "h", "(Ljava/lang/String;Lokhttp3/RequestBody;Ldp/h;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "g", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "Lum/w;", "getMoshi", "()Lum/w;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "getStaticTemplateSessionFactory", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "d", "I", "requestCount", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements dp.a {

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

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController", f = "ApiController.kt", l = {84, 120}, m = "createSession-gIAlu-s")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11754t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f11755u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f11756v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f11757w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f11759y;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11757w = obj;
            this.f11759y |= Integer.MIN_VALUE;
            Object objB = d.this.b(null, this);
            return objB == ot.c.e() ? objB : n.a(objB);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "<anonymous>", "(Lku/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1", f = "ApiController.kt", l = {85}, m = "invokeSuspend")
    public static final class b extends m implements Function2<p0, nt.b<? super NetworkCallResult<FallbackModeService.StatusResponse>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11760t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InquiryAttributes f11761u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ d f11762v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljv/x;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "<anonymous>", "()Ljv/x;"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1$1", f = "ApiController.kt", l = {88}, m = "invokeSuspend")
        public static final class a extends m implements Function1<nt.b<? super x<FallbackModeService.StatusResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f11763t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f11764u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ InquiryAttributes f11765v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ d f11766w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InquiryAttributes inquiryAttributes, d dVar, nt.b<? super a> bVar) {
                super(1, bVar);
                this.f11765v = inquiryAttributes;
                this.f11766w = dVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(nt.b<?> bVar) {
                return new a(this.f11765v, this.f11766w, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                String str;
                Object objE = ot.c.e();
                int i10 = this.f11764u;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                String sessionToken = this.f11765v.getSessionToken();
                if (sessionToken == null || sessionToken.length() == 0) {
                    str = null;
                } else {
                    str = "Bearer " + com.withpersona.sdk2.inquiry.internal.h.INSTANCE.a(this.f11765v.getSessionToken());
                }
                FallbackModeService service = this.f11766w.getService();
                FallbackModeService.StatusRequest statusRequest = new FallbackModeService.StatusRequest(this.f11765v.getTemplateId());
                this.f11763t = l.a(str);
                this.f11764u = 1;
                Object objB = service.b(str, statusRequest, this);
                return objB == objE ? objE : objB;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nt.b<? super x<FallbackModeService.StatusResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InquiryAttributes inquiryAttributes, d dVar, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f11761u = inquiryAttributes;
            this.f11762v = dVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f11761u, this.f11762v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f11760t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(this.f11761u, this.f11762v, null);
            this.f11760t = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == objE ? objE : objEnqueueRetriableRequestWithRetry;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super NetworkCallResult<FallbackModeService.StatusResponse>> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "<anonymous>", "(Lku/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1", f = "ApiController.kt", l = {121}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, nt.b<? super NetworkCallResult<FallbackModeService.SessionIdResponse>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11767t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InquiryAttributes f11769v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljv/x;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "<anonymous>", "()Ljv/x;"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1$1", f = "ApiController.kt", l = {122}, m = "invokeSuspend")
        public static final class a extends m implements Function1<nt.b<? super x<FallbackModeService.SessionIdResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f11770t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ d f11771u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ InquiryAttributes f11772v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, InquiryAttributes inquiryAttributes, nt.b<? super a> bVar) {
                super(1, bVar);
                this.f11771u = dVar;
                this.f11772v = inquiryAttributes;
            }

            @Override // pt.a
            public final nt.b<Unit> create(nt.b<?> bVar) {
                return new a(this.f11771u, this.f11772v, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f11770t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                FallbackModeService service = this.f11771u.getService();
                FallbackModeService.SessionIdRequest sessionIdRequest = new FallbackModeService.SessionIdRequest(this.f11772v.getTemplateId(), this.f11772v.getTemplateVersion(), this.f11772v.getInquiryId(), this.f11772v.getReferenceId(), this.f11772v.getAccountId(), gp.b.a(this.f11772v.getEnvironment()), this.f11772v.getEnvironmentId(), this.f11772v.d() != null ? new InquiryFieldMap(gp.a.t(this.f11772v.d())) : null, this.f11772v.getThemeSetId());
                this.f11770t = 1;
                Object objD = service.d(sessionIdRequest, this);
                return objD == objE ? objE : objD;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nt.b<? super x<FallbackModeService.SessionIdResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InquiryAttributes inquiryAttributes, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f11769v = inquiryAttributes;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return d.this.new c(this.f11769v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f11767t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(d.this, this.f11769v, null);
            this.f11767t = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == objE ? objE : objEnqueueRetriableRequestWithRetry;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super NetworkCallResult<FallbackModeService.SessionIdResponse>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.d$d, reason: collision with other inner class name */
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController", f = "ApiController.kt", l = {175, 210}, m = "transition")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0216d extends pt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11773t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f11774u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f11775v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f11776w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f11777x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f11778y;

        public C0216d(nt.b<? super C0216d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11778y = obj;
            this.A |= Integer.MIN_VALUE;
            return d.this.h(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "<anonymous>", "(Lku/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1", f = "ApiController.kt", l = {176}, m = "invokeSuspend")
    public static final class e extends m implements Function2<p0, nt.b<? super NetworkCallResult<FallbackModeService.UploadUrlResponse>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11780t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f11782v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ dp.h f11783w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ RequestBody f11784x;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljv/x;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "<anonymous>", "()Ljv/x;"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1$1", f = "ApiController.kt", l = {177}, m = "invokeSuspend")
        public static final class a extends m implements Function1<nt.b<? super x<FallbackModeService.UploadUrlResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f11785t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ d f11786u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f11787v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ dp.h f11788w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ RequestBody f11789x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, String str, dp.h hVar, RequestBody requestBody, nt.b<? super a> bVar) {
                super(1, bVar);
                this.f11786u = dVar;
                this.f11787v = str;
                this.f11788w = hVar;
                this.f11789x = requestBody;
            }

            @Override // pt.a
            public final nt.b<Unit> create(nt.b<?> bVar) {
                return new a(this.f11786u, this.f11787v, this.f11788w, this.f11789x, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                String string;
                Object objE = ot.c.e();
                int i10 = this.f11785t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                FallbackModeService service = this.f11786u.getService();
                String str = this.f11787v;
                dp.h hVar = this.f11788w;
                int iF = this.f11786u.f();
                long jContentLength = this.f11789x.contentLength();
                MediaType mediaType = this.f11789x.get$contentType();
                if (mediaType == null || (string = mediaType.toString()) == null) {
                    string = "application/json";
                }
                FallbackModeService.UploadUrlRequest uploadUrlRequest = new FallbackModeService.UploadUrlRequest(jContentLength, string);
                this.f11785t = 1;
                Object objC = service.c(str, hVar, iF, uploadUrlRequest, this);
                return objC == objE ? objE : objC;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nt.b<? super x<FallbackModeService.UploadUrlResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, dp.h hVar, RequestBody requestBody, nt.b<? super e> bVar) {
            super(2, bVar);
            this.f11782v = str;
            this.f11783w = hVar;
            this.f11784x = requestBody;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return d.this.new e(this.f11782v, this.f11783w, this.f11784x, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f11780t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(d.this, this.f11782v, this.f11783w, this.f11784x, null);
            this.f11780t = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == objE ? objE : objEnqueueRetriableRequestWithRetry;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super NetworkCallResult<FallbackModeService.UploadUrlResponse>> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "", "<anonymous>", "(Lku/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1", f = "ApiController.kt", l = {211}, m = "invokeSuspend")
    public static final class f extends m implements Function2<p0, nt.b<? super NetworkCallResult<Object>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11790t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f11792v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ RequestBody f11793w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljv/x;", "", "<anonymous>", "()Ljv/x;"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1$1", f = "ApiController.kt", l = {212}, m = "invokeSuspend")
        public static final class a extends m implements Function1<nt.b<? super x<Object>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f11794t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ d f11795u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f11796v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ RequestBody f11797w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, String str, RequestBody requestBody, nt.b<? super a> bVar) {
                super(1, bVar);
                this.f11795u = dVar;
                this.f11796v = str;
                this.f11797w = requestBody;
            }

            @Override // pt.a
            public final nt.b<Unit> create(nt.b<?> bVar) {
                return new a(this.f11795u, this.f11796v, this.f11797w, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f11794t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                FallbackModeService service = this.f11795u.getService();
                String str = this.f11796v;
                RequestBody requestBody = this.f11797w;
                this.f11794t = 1;
                Object objA = service.a(str, requestBody, this);
                return objA == objE ? objE : objA;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nt.b<? super x<Object>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, RequestBody requestBody, nt.b<? super f> bVar) {
            super(2, bVar);
            this.f11792v = str;
            this.f11793w = requestBody;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return d.this.new f(this.f11792v, this.f11793w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f11790t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = new a(d.this, this.f11792v, this.f11793w, null);
            this.f11790t = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == objE ? objE : objEnqueueRetriableRequestWithRetry;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super NetworkCallResult<Object>> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
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

    @Override // dp.a
    @Nullable
    public Object a(@NotNull String str, @NotNull RequestBody requestBody, @NotNull nt.b<? super x<?>> bVar) {
        return h(str, requestBody, dp.h.TransitionBack, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0111  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:67:0x011f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    /* JADX WARN: Code duplicated, block: B:71:0x0137  */
    /* JADX WARN: Code duplicated, block: B:73:0x0144  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dp.a
    @Nullable
    public Object b(@NotNull InquiryAttributes inquiryAttributes, @NotNull nt.b<? super n<i>> bVar) {
        a aVar;
        String sessionToken;
        List<NextStep> list;
        FallbackModeService.StaticTemplate staticInquiryTemplate;
        NetworkCallResult networkCallResult;
        FallbackModeService.SessionIdResponse sessionIdResponse;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f11759y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f11759y = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object objG = aVar.f11757w;
        Object objE = ot.c.e();
        int i11 = aVar.f11759y;
        String token = null;
        if (i11 == 0) {
            o.b(objG);
            String templateId = inquiryAttributes.getTemplateId();
            if ((templateId == null || templateId.length() == 0) && ((sessionToken = inquiryAttributes.getSessionToken()) == null || sessionToken.length() == 0)) {
                n.Companion companion = n.INSTANCE;
                return n.b(o.a(new dp.b("Expected templateId or session token to be non-null")));
            }
            l0 l0VarA = g1.a();
            b bVar2 = new b(inquiryAttributes, this, null);
            aVar.f11754t = inquiryAttributes;
            aVar.f11759y = 1;
            objG = ku.i.g(l0VarA, bVar2, aVar);
            if (objG != objE) {
            }
            return objE;
        }
        if (i11 == 1) {
            inquiryAttributes = (InquiryAttributes) aVar.f11754t;
            o.b(objG);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) aVar.f11756v;
            o.b(objG);
        }
        networkCallResult = (NetworkCallResult) objG;
        if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
            if (networkCallResult instanceof NetworkCallResult.Success) {
                throw new jt.l();
            }
            sessionIdResponse = (FallbackModeService.SessionIdResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
            if (sessionIdResponse != null) {
                token = sessionIdResponse.getToken();
            }
        }
        if (token == null) {
            n.Companion companion2 = n.INSTANCE;
            return n.b(o.a(new dp.b("Failed to create session")));
        }
        n.Companion companion3 = n.INSTANCE;
        return n.b(this.staticTemplateSessionFactory.a(list, token));
        NetworkCallResult networkCallResult2 = (NetworkCallResult) objG;
        if (networkCallResult2 instanceof NetworkCallResult.Failure) {
            n.Companion companion4 = n.INSTANCE;
            return n.b(o.a(new dp.b("Failed to check status")));
        }
        if (!(networkCallResult2 instanceof NetworkCallResult.Success)) {
            throw new jt.l();
        }
        FallbackModeService.StatusResponse statusResponse = (FallbackModeService.StatusResponse) ((NetworkCallResult.Success) networkCallResult2).getResponse();
        List<NextStep> listA = (statusResponse == null || (staticInquiryTemplate = statusResponse.getStaticInquiryTemplate()) == null) ? null : staticInquiryTemplate.a();
        if (listA == null || listA.isEmpty()) {
            n.Companion companion5 = n.INSTANCE;
            return n.b(o.a(new dp.b("Expected steps to contain at least one step")));
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
            return n.b(o.a(new dp.b("Template ID is required to create a fallback session without an existing session token")));
        }
        l0 l0VarA2 = g1.a();
        c cVar = new c(inquiryAttributes, null);
        aVar.f11754t = l.a(inquiryAttributes);
        aVar.f11755u = l.a(networkCallResult2);
        aVar.f11756v = listA;
        aVar.f11759y = 2;
        objG = ku.i.g(l0VarA2, cVar, aVar);
        if (objG != objE) {
            list = listA;
            networkCallResult = (NetworkCallResult) objG;
            if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
                if (networkCallResult instanceof NetworkCallResult.Success) {
                    throw new jt.l();
                }
                sessionIdResponse = (FallbackModeService.SessionIdResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                if (sessionIdResponse != null) {
                    token = sessionIdResponse.getToken();
                }
            }
            if (token == null) {
                n.Companion companion8 = n.INSTANCE;
                return n.b(o.a(new dp.b("Failed to create session")));
            }
            n.Companion companion9 = n.INSTANCE;
            return n.b(this.staticTemplateSessionFactory.a(list, token));
        }
        return objE;
    }

    @Override // dp.a
    @Nullable
    public Object c(@NotNull String str, @NotNull RequestBody requestBody, @NotNull nt.b<? super x<?>> bVar) {
        return h(str, requestBody, dp.h.Transition, bVar);
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
    public final java.lang.Object h(java.lang.String r17, okhttp3.RequestBody r18, dp.h r19, nt.b<? super jv.x<?>> r20) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.fallbackmode.d.h(java.lang.String, okhttp3.RequestBody, dp.h, nt.b):java.lang.Object");
    }
}
