package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.internal.C3689h;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.InquiryFieldMap;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import gp.C6181a;
import gp.C6182b;
import gp.InquiryAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p082dp.C4648b;
import p082dp.EnumC4654h;
import p082dp.InterfaceC4647a;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p231jv.C7396x;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p471um.C11888w;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;", "Ldp/a;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", NotificationCompat.CATEGORY_SERVICE, "Lum/w;", "moshi", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "staticTemplateSessionFactory", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;Lum/w;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;)V", "Lgp/e;", "attributes", "Ljt/n;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "b", "(Lgp/e;Lnt/b;)Ljava/lang/Object;", "", "sessionToken", "Lokhttp3/RequestBody;", "body", "Ljv/x;", "c", "(Ljava/lang/String;Lokhttp3/RequestBody;Lnt/b;)Ljava/lang/Object;", "a", "", "f", "()I", "Ldp/h;", "endpoint", "h", "(Ljava/lang/String;Lokhttp3/RequestBody;Ldp/h;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "g", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;", "Lum/w;", "getMoshi", "()Lum/w;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "getStaticTemplateSessionFactory", "()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "d", "I", "requestCount", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3681d implements InterfaceC4647a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final FallbackModeService service;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C11888w moshi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C3686i.a staticTemplateSessionFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int requestCount;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.d$a */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController", m39664f = "ApiController.kt", m39665l = {84, 120}, m39666m = "createSession-gIAlu-s")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f15156t;

        /* JADX INFO: renamed from: u */
        public Object f15157u;

        /* JADX INFO: renamed from: v */
        public Object f15158v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f15159w;

        /* JADX INFO: renamed from: y */
        public int f15161y;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15159w = obj;
            this.f15161y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objMo18488b = C3681d.this.mo18488b(null, this);
            return objMo18488b == C10047c.m38805e() ? objMo18488b : C7347n.m30459a(objMo18488b);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.d$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "<anonymous>", "(Lku/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1", m39664f = "ApiController.kt", m39665l = {85}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super NetworkCallResult<FallbackModeService.StatusResponse>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15162t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InquiryAttributes f15163u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C3681d f15164v;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.d$b$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Ljv/x;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1$1", m39664f = "ApiController.kt", m39665l = {88}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<FallbackModeService.StatusResponse>>, Object> {

            /* JADX INFO: renamed from: t */
            public Object f15165t;

            /* JADX INFO: renamed from: u */
            public int f15166u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ InquiryAttributes f15167v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ C3681d f15168w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InquiryAttributes inquiryAttributes, C3681d c3681d, InterfaceC9557b<? super a> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f15167v = inquiryAttributes;
                this.f15168w = c3681d;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f15167v, this.f15168w, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                String str;
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f15166u;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                String sessionToken = this.f15167v.getSessionToken();
                if (sessionToken == null || sessionToken.length() == 0) {
                    str = null;
                } else {
                    str = "Bearer " + C3689h.INSTANCE.m18550a(this.f15167v.getSessionToken());
                }
                FallbackModeService service = this.f15168w.getService();
                FallbackModeService.StatusRequest statusRequest = new FallbackModeService.StatusRequest(this.f15167v.getTemplateId());
                this.f15165t = C10350l.m39676a(str);
                this.f15166u = 1;
                Object objM18447b = service.m18447b(str, statusRequest, this);
                return objM18447b == objM38805e ? objM38805e : objM18447b;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9557b<? super C7396x<FallbackModeService.StatusResponse>> interfaceC9557b) {
                return ((a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InquiryAttributes inquiryAttributes, C3681d c3681d, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f15163u = inquiryAttributes;
            this.f15164v = c3681d;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f15163u, this.f15164v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15162t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            a aVar = new a(this.f15163u, this.f15164v, null);
            this.f15162t = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == objM38805e ? objM38805e : objEnqueueRetriableRequestWithRetry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super NetworkCallResult<FallbackModeService.StatusResponse>> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.d$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "<anonymous>", "(Lku/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1", m39664f = "ApiController.kt", m39665l = {121}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super NetworkCallResult<FallbackModeService.SessionIdResponse>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15169t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InquiryAttributes f15171v;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.d$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Ljv/x;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$SessionIdResponse;", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$sessionIdResponse$1$1", m39664f = "ApiController.kt", m39665l = {122}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<FallbackModeService.SessionIdResponse>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f15172t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C3681d f15173u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ InquiryAttributes f15174v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3681d c3681d, InquiryAttributes inquiryAttributes, InterfaceC9557b<? super a> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f15173u = c3681d;
                this.f15174v = inquiryAttributes;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f15173u, this.f15174v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f15172t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                FallbackModeService service = this.f15173u.getService();
                FallbackModeService.SessionIdRequest sessionIdRequest = new FallbackModeService.SessionIdRequest(this.f15174v.getTemplateId(), this.f15174v.getTemplateVersion(), this.f15174v.getInquiryId(), this.f15174v.getReferenceId(), this.f15174v.getAccountId(), C6182b.m27245a(this.f15174v.getEnvironment()), this.f15174v.getEnvironmentId(), this.f15174v.m27253d() != null ? new InquiryFieldMap(C6181a.m27238t(this.f15174v.m27253d())) : null, this.f15174v.getThemeSetId());
                this.f15172t = 1;
                Object objM18449d = service.m18449d(sessionIdRequest, this);
                return objM18449d == objM38805e ? objM38805e : objM18449d;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9557b<? super C7396x<FallbackModeService.SessionIdResponse>> interfaceC9557b) {
                return ((a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InquiryAttributes inquiryAttributes, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f15171v = inquiryAttributes;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C3681d.this.new c(this.f15171v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15169t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            a aVar = new a(C3681d.this, this.f15171v, null);
            this.f15169t = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == objM38805e ? objM38805e : objEnqueueRetriableRequestWithRetry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super NetworkCallResult<FallbackModeService.SessionIdResponse>> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.d$d */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController", m39664f = "ApiController.kt", m39665l = {175, 210}, m39666m = "transition")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f15175A;

        /* JADX INFO: renamed from: t */
        public Object f15176t;

        /* JADX INFO: renamed from: u */
        public Object f15177u;

        /* JADX INFO: renamed from: v */
        public Object f15178v;

        /* JADX INFO: renamed from: w */
        public Object f15179w;

        /* JADX INFO: renamed from: x */
        public Object f15180x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f15181y;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15181y = obj;
            this.f15175A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C3681d.this.m18492h(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.d$e */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "<anonymous>", "(Lku/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1", m39664f = "ApiController.kt", m39665l = {176}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super NetworkCallResult<FallbackModeService.UploadUrlResponse>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15183t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f15185v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ EnumC4654h f15186w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ RequestBody f15187x;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.d$e$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Ljv/x;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1$1", m39664f = "ApiController.kt", m39665l = {177}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<FallbackModeService.UploadUrlResponse>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f15188t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C3681d f15189u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ String f15190v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ EnumC4654h f15191w;

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ RequestBody f15192x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3681d c3681d, String str, EnumC4654h enumC4654h, RequestBody requestBody, InterfaceC9557b<? super a> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f15189u = c3681d;
                this.f15190v = str;
                this.f15191w = enumC4654h;
                this.f15192x = requestBody;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f15189u, this.f15190v, this.f15191w, this.f15192x, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                String string;
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f15188t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                FallbackModeService service = this.f15189u.getService();
                String str = this.f15190v;
                EnumC4654h enumC4654h = this.f15191w;
                int iM18490f = this.f15189u.m18490f();
                long jContentLength = this.f15192x.contentLength();
                MediaType mediaType = this.f15192x.get$contentType();
                if (mediaType == null || (string = mediaType.toString()) == null) {
                    string = "application/json";
                }
                FallbackModeService.UploadUrlRequest uploadUrlRequest = new FallbackModeService.UploadUrlRequest(jContentLength, string);
                this.f15188t = 1;
                Object objM18448c = service.m18448c(str, enumC4654h, iM18490f, uploadUrlRequest, this);
                return objM18448c == objM38805e ? objM38805e : objM18448c;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9557b<? super C7396x<FallbackModeService.UploadUrlResponse>> interfaceC9557b) {
                return ((a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, EnumC4654h enumC4654h, RequestBody requestBody, InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f15185v = str;
            this.f15186w = enumC4654h;
            this.f15187x = requestBody;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C3681d.this.new e(this.f15185v, this.f15186w, this.f15187x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15183t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            a aVar = new a(C3681d.this, this.f15185v, this.f15186w, this.f15187x, null);
            this.f15183t = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == objM38805e ? objM38805e : objEnqueueRetriableRequestWithRetry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super NetworkCallResult<FallbackModeService.UploadUrlResponse>> interfaceC9557b) {
            return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.d$f */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;", "", "<anonymous>", "(Lku/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1", m39664f = "ApiController.kt", m39665l = {211}, m39666m = "invokeSuspend")
    public static final class f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super NetworkCallResult<Object>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15193t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f15195v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ RequestBody f15196w;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.d$f$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Ljv/x;", "", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1$1", m39664f = "ApiController.kt", m39665l = {212}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<Object>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f15197t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C3681d f15198u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ String f15199v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ RequestBody f15200w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3681d c3681d, String str, RequestBody requestBody, InterfaceC9557b<? super a> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f15198u = c3681d;
                this.f15199v = str;
                this.f15200w = requestBody;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f15198u, this.f15199v, this.f15200w, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f15197t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                FallbackModeService service = this.f15198u.getService();
                String str = this.f15199v;
                RequestBody requestBody = this.f15200w;
                this.f15197t = 1;
                Object objM18446a = service.m18446a(str, requestBody, this);
                return objM18446a == objM38805e ? objM38805e : objM18446a;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9557b<? super C7396x<Object>> interfaceC9557b) {
                return ((a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, RequestBody requestBody, InterfaceC9557b<? super f> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f15195v = str;
            this.f15196w = requestBody;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C3681d.this.new f(this.f15195v, this.f15196w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15193t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            a aVar = new a(C3681d.this, this.f15195v, this.f15196w, null);
            this.f15193t = 1;
            Object objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
            return objEnqueueRetriableRequestWithRetry == objM38805e ? objM38805e : objEnqueueRetriableRequestWithRetry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super NetworkCallResult<Object>> interfaceC9557b) {
            return ((f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C3681d(@NotNull FallbackModeService service, @NotNull C11888w moshi, @NotNull C3686i.a staticTemplateSessionFactory) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(staticTemplateSessionFactory, "staticTemplateSessionFactory");
        this.service = service;
        this.moshi = moshi;
        this.staticTemplateSessionFactory = staticTemplateSessionFactory;
    }

    @Override // p082dp.InterfaceC4647a
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo18487a(@NotNull String str, @NotNull RequestBody requestBody, @NotNull InterfaceC9557b<? super C7396x<?>> interfaceC9557b) {
        return m18492h(str, requestBody, EnumC4654h.TransitionBack, interfaceC9557b);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0111  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:67:0x011f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    /* JADX WARN: Code duplicated, block: B:71:0x0137  */
    /* JADX WARN: Code duplicated, block: B:73:0x0144  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p082dp.InterfaceC4647a
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo18488b(@NotNull InquiryAttributes inquiryAttributes, @NotNull InterfaceC9557b<? super C7347n<C3686i>> interfaceC9557b) {
        a aVar;
        String sessionToken;
        List<NextStep> list;
        FallbackModeService.StaticTemplate staticInquiryTemplate;
        NetworkCallResult networkCallResult;
        FallbackModeService.SessionIdResponse sessionIdResponse;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f15161y;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f15161y = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object objM32684g = aVar.f15159w;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f15161y;
        String token = null;
        if (i11 == 0) {
            C7348o.m30470b(objM32684g);
            String templateId = inquiryAttributes.getTemplateId();
            if ((templateId == null || templateId.length() == 0) && ((sessionToken = inquiryAttributes.getSessionToken()) == null || sessionToken.length() == 0)) {
                C7347n.Companion companion = C7347n.INSTANCE;
                return C7347n.m30460b(C7348o.m30469a(new C4648b("Expected templateId or session token to be non-null")));
            }
            AbstractC7888l0 abstractC7888l0M32643a = C7864g1.m32643a();
            b bVar = new b(inquiryAttributes, this, null);
            aVar.f15156t = inquiryAttributes;
            aVar.f15161y = 1;
            objM32684g = C7872i.m32684g(abstractC7888l0M32643a, bVar, aVar);
            if (objM32684g != objM38805e) {
            }
            return objM38805e;
        }
        if (i11 == 1) {
            inquiryAttributes = (InquiryAttributes) aVar.f15156t;
            C7348o.m30470b(objM32684g);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) aVar.f15158v;
            C7348o.m30470b(objM32684g);
        }
        networkCallResult = (NetworkCallResult) objM32684g;
        if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
            if (networkCallResult instanceof NetworkCallResult.Success) {
                throw new C7345l();
            }
            sessionIdResponse = (FallbackModeService.SessionIdResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
            if (sessionIdResponse != null) {
                token = sessionIdResponse.getToken();
            }
        }
        if (token == null) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(new C4648b("Failed to create session")));
        }
        C7347n.Companion companion3 = C7347n.INSTANCE;
        return C7347n.m30460b(this.staticTemplateSessionFactory.mo18513a(list, token));
        NetworkCallResult networkCallResult2 = (NetworkCallResult) objM32684g;
        if (networkCallResult2 instanceof NetworkCallResult.Failure) {
            C7347n.Companion companion4 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(new C4648b("Failed to check status")));
        }
        if (!(networkCallResult2 instanceof NetworkCallResult.Success)) {
            throw new C7345l();
        }
        FallbackModeService.StatusResponse statusResponse = (FallbackModeService.StatusResponse) ((NetworkCallResult.Success) networkCallResult2).getResponse();
        List<NextStep> listM18460a = (statusResponse == null || (staticInquiryTemplate = statusResponse.getStaticInquiryTemplate()) == null) ? null : staticInquiryTemplate.m18460a();
        if (listM18460a == null || listM18460a.isEmpty()) {
            C7347n.Companion companion5 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(new C4648b("Expected steps to contain at least one step")));
        }
        if (inquiryAttributes.getSessionToken() != null) {
            String strM18550a = C3689h.INSTANCE.m18550a(inquiryAttributes.getSessionToken());
            if (strM18550a == null) {
                strM18550a = inquiryAttributes.getSessionToken();
            }
            C7347n.Companion companion6 = C7347n.INSTANCE;
            return C7347n.m30460b(this.staticTemplateSessionFactory.mo18513a(listM18460a, strM18550a));
        }
        String templateId2 = inquiryAttributes.getTemplateId();
        if (templateId2 == null || templateId2.length() == 0) {
            C7347n.Companion companion7 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(new C4648b("Template ID is required to create a fallback session without an existing session token")));
        }
        AbstractC7888l0 abstractC7888l0M32643a2 = C7864g1.m32643a();
        c cVar = new c(inquiryAttributes, null);
        aVar.f15156t = C10350l.m39676a(inquiryAttributes);
        aVar.f15157u = C10350l.m39676a(networkCallResult2);
        aVar.f15158v = listM18460a;
        aVar.f15161y = 2;
        objM32684g = C7872i.m32684g(abstractC7888l0M32643a2, cVar, aVar);
        if (objM32684g != objM38805e) {
            list = listM18460a;
            networkCallResult = (NetworkCallResult) objM32684g;
            if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
                if (networkCallResult instanceof NetworkCallResult.Success) {
                    throw new C7345l();
                }
                sessionIdResponse = (FallbackModeService.SessionIdResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                if (sessionIdResponse != null) {
                    token = sessionIdResponse.getToken();
                }
            }
            if (token == null) {
                C7347n.Companion companion8 = C7347n.INSTANCE;
                return C7347n.m30460b(C7348o.m30469a(new C4648b("Failed to create session")));
            }
            C7347n.Companion companion9 = C7347n.INSTANCE;
            return C7347n.m30460b(this.staticTemplateSessionFactory.mo18513a(list, token));
        }
        return objM38805e;
    }

    @Override // p082dp.InterfaceC4647a
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo18489c(@NotNull String str, @NotNull RequestBody requestBody, @NotNull InterfaceC9557b<? super C7396x<?>> interfaceC9557b) {
        return m18492h(str, requestBody, EnumC4654h.Transition, interfaceC9557b);
    }

    /* JADX INFO: renamed from: f */
    public final int m18490f() {
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
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m18492h(String str, RequestBody requestBody, EnumC4654h enumC4654h, InterfaceC9557b<? super C7396x<?>> interfaceC9557b) {
        d dVar;
        EnumC4654h enumC4654h2;
        RequestBody requestBody2;
        String str2;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i10 = dVar.f15175A;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f15175A = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        d dVar2 = dVar;
        Object objM32684g = dVar2.f15181y;
        Object objM38805e = C10047c.m38805e();
        int i11 = dVar2.f15175A;
        if (i11 == 0) {
            C7348o.m30470b(objM32684g);
            AbstractC7888l0 abstractC7888l0M32643a = C7864g1.m32643a();
            e eVar = new e(str, enumC4654h, requestBody, null);
            dVar2.f15176t = C10350l.m39676a(str);
            dVar2.f15177u = requestBody;
            dVar2.f15178v = C10350l.m39676a(enumC4654h);
            dVar2.f15175A = 1;
            objM32684g = C7872i.m32684g(abstractC7888l0M32643a, eVar, dVar2);
            if (objM32684g != objM38805e) {
                enumC4654h2 = enumC4654h;
                requestBody2 = requestBody;
                str2 = str;
            }
            return objM38805e;
        }
        if (i11 == 1) {
            enumC4654h2 = (EnumC4654h) dVar2.f15178v;
            requestBody2 = (RequestBody) dVar2.f15177u;
            str2 = (String) dVar2.f15176t;
            C7348o.m30470b(objM32684g);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM32684g);
        }
        NetworkCallResult networkCallResult = (NetworkCallResult) objM32684g;
        if (!(networkCallResult instanceof NetworkCallResult.Failure)) {
            if (!(networkCallResult instanceof NetworkCallResult.Success)) {
                throw new C7345l();
            }
            C7396x c7396xM30651i = C7396x.m30651i(null);
            Intrinsics.checkNotNull(c7396xM30651i);
            return c7396xM30651i;
        }
        ResponseBody.Companion companion = ResponseBody.INSTANCE;
        String json = this.moshi.m44436c(ErrorResponse.class).toJson(ErrorResponse.Companion.create("Fallback mode API error."));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        C7396x c7396xM30649c = C7396x.m30649c(0, companion.create(json, MediaType.INSTANCE.get("application/json")));
        Intrinsics.checkNotNull(c7396xM30649c);
        return c7396xM30649c;
        NetworkCallResult networkCallResult2 = (NetworkCallResult) objM32684g;
        if (networkCallResult2 instanceof NetworkCallResult.Failure) {
            ResponseBody.Companion companion2 = ResponseBody.INSTANCE;
            String json2 = this.moshi.m44436c(ErrorResponse.class).toJson(ErrorResponse.Companion.create("Fallback mode API error."));
            Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
            C7396x c7396xM30649c2 = C7396x.m30649c(0, companion2.create(json2, MediaType.INSTANCE.get("application/json")));
            Intrinsics.checkNotNullExpressionValue(c7396xM30649c2, "error(...)");
            return c7396xM30649c2;
        }
        if (!(networkCallResult2 instanceof NetworkCallResult.Success)) {
            throw new C7345l();
        }
        FallbackModeService.UploadUrlResponse uploadUrlResponse = (FallbackModeService.UploadUrlResponse) ((NetworkCallResult.Success) networkCallResult2).getResponse();
        String location = uploadUrlResponse != null ? uploadUrlResponse.getLocation() : null;
        if (location == null) {
            ResponseBody.Companion companion3 = ResponseBody.INSTANCE;
            String json3 = this.moshi.m44436c(ErrorResponse.class).toJson(ErrorResponse.Companion.create("Fallback mode API error."));
            Intrinsics.checkNotNullExpressionValue(json3, "toJson(...)");
            C7396x c7396xM30649c3 = C7396x.m30649c(0, companion3.create(json3, MediaType.INSTANCE.get("application/json")));
            Intrinsics.checkNotNullExpressionValue(c7396xM30649c3, "error(...)");
            return c7396xM30649c3;
        }
        AbstractC7888l0 abstractC7888l0M32643a2 = C7864g1.m32643a();
        f fVar = new f(location, requestBody2, null);
        dVar2.f15176t = C10350l.m39676a(str2);
        dVar2.f15177u = C10350l.m39676a(requestBody2);
        dVar2.f15178v = C10350l.m39676a(enumC4654h2);
        dVar2.f15179w = C10350l.m39676a(networkCallResult2);
        dVar2.f15180x = C10350l.m39676a(location);
        dVar2.f15175A = 2;
        objM32684g = C7872i.m32684g(abstractC7888l0M32643a2, fVar, dVar2);
    }
}
