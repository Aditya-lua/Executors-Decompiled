package com.withpersona.sdk2.inquiry.internal.network;

import android.content.Context;
import android.location.Location;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.network.dto.Included;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionData;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import com.withpersona.sdk2.inquiry.network.dto.Relationship;
import com.withpersona.sdk2.inquiry.network.dto.RelationshipData;
import com.withpersona.sdk2.inquiry.network.dto.Relationships;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import ep.w;
import ep.y;
import hq.b0;
import hv.x;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rq.GpsData;
import vn.ThreatEventState;
import wn.DeviceMetrics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b&\u0010#J \u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0086@¢\u0006\u0004\b+\u0010,J \u0010/\u001a\u00020*2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010.\u001a\u00020-H\u0086@¢\u0006\u0004\b/\u00100J:\u00104\u001a\u0002032\u0006\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\u00102\u001a\u0004\u0018\u00010\u0019H\u0080@¢\u0006\u0004\b4\u00105J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b9\u0010:J \u0010<\u001a\u00020;2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b<\u0010,J\"\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b>\u0010,J6\u0010D\u001a\u0004\u0018\u00010=2\"\u0010C\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0@\u0012\u0006\u0012\u0004\u0018\u00010\u00010?H\u0082@¢\u0006\u0004\bD\u0010EJ:\u0010F\u001a\u0002032\u0006\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\u00102\u001a\u0004\u0018\u00010\u0019H\u0082@¢\u0006\u0004\bF\u00105J \u0010G\u001a\u0002032\u0006\u0010'\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0019H\u0082@¢\u0006\u0004\bG\u0010HJ\u0019\u0010K\u001a\u0004\u0018\u00010\u001b2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010[¨\u0006\\"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/e;", "", "Landroid/content/Context;", "applicationContext", "Lep/w;", "service", "Lep/y;", "relayService", "Lbp/i;", "fallbackModeManager", "Lup/c;", "sandboxFlags", "Lwn/a;", "deviceIdProvider", "Lcp/a;", "playIntegrityHelper", "", "redactAppIdentifyingInformation", "<init>", "(Landroid/content/Context;Lep/w;Lep/y;Lbp/i;Lup/c;Lwn/a;Lcp/a;Z)V", "Lep/e;", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/network/a;", "h", "(Lep/e;Llt/b;)Ljava/lang/Object;", "", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "inquirySessionDataWrapper", "Lcom/withpersona/sdk2/inquiry/internal/network/b;", "i", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;Llt/b;)Ljava/lang/Object;", "oneTimeLinkCode", "Lcom/withpersona/sdk2/inquiry/internal/network/d;", "k", "(Ljava/lang/String;Llt/b;)Ljava/lang/Object;", "relaySessionToken", "Lcom/withpersona/sdk2/inquiry/internal/network/g;", "m", "sessionToken", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/network/i;", "r", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Llt/b;)Ljava/lang/Object;", "Lwn/c;", "metrics", "s", "(Ljava/lang/String;Lwn/c;Llt/b;)Ljava/lang/Object;", "fromStep", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/network/h;", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Llt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;", "inquirySessionData", "", "q", "(Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;)V", "Lcom/withpersona/sdk2/inquiry/internal/network/j;", "u", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "t", "Lkotlin/Function1;", "Llt/b;", "Lhv/x;", "Lokhttp3/ResponseBody;", "inquiryCall", "l", "(Lkotlin/jvm/functions/Function1;Llt/b;)Ljava/lang/Object;", "o", "n", "(Ljava/lang/String;Ljava/lang/String;Llt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "checkInquiryResponse", "j", "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;)Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "a", "Landroid/content/Context;", "b", "Lep/w;", "c", "Lep/y;", "d", "Lbp/i;", "e", "Lup/c;", "f", "Lwn/a;", "g", "Lcp/a;", "Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final w service;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y relayService;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final bp.i fallbackModeManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final up.c sandboxFlags;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final wn.a deviceIdProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final cp.a playIntegrityHelper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final boolean redactAppIdentifyingInformation;

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {64, 80}, m = "createInquiry")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12045t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f12046u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f12048w;

        public a(lt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12046u = obj;
            this.f12048w |= Integer.MIN_VALUE;
            return e.this.h(null, this);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {138}, m = "createInquirySession")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12049t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12050u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f12051v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f12052w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f12054y;

        public b(lt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12052w = obj;
            this.f12054y |= Integer.MIN_VALUE;
            return e.this.i(null, null, this);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {162}, m = "exchangeOneTimeLinkCode")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12055t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f12056u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f12058w;

        public c(lt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12056u = obj;
            this.f12058w |= Integer.MIN_VALUE;
            return e.this.k(null, this);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {397}, m = "makeInquiryCallWithRetry")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12059t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12060u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f12061v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f12063x;

        public d(lt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12061v = obj;
            this.f12063x |= Integer.MIN_VALUE;
            return e.this.l(null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$e, reason: collision with other inner class name */
    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$makeInquiryCallWithRetry$2", f = "InquiryApiHelper.kt", l = {399, 403}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "attempt", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0222e extends nt.m implements Function2<Integer, lt.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12064t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ int f12065u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1<lt.b<? super x<ResponseBody>>, Object> f12066v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ c0<InternalErrorInfo> f12067w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0222e(Function1<? super lt.b<? super x<ResponseBody>>, ? extends Object> function1, c0<InternalErrorInfo> c0Var, lt.b<? super C0222e> bVar) {
            super(2, bVar);
            this.f12066v = function1;
            this.f12067w = c0Var;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            C0222e c0222e = new C0222e(this.f12066v, this.f12067w, bVar);
            c0222e.f12065u = ((Number) obj).intValue();
            return c0222e;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, lt.b<? super Boolean> bVar) {
            return m(num.intValue(), bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        
            if (r13 == r1) goto L20;
         */
        /* JADX WARN: Type inference failed for: r13v11, types: [T, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo] */
        /* JADX WARN: Type inference failed for: r5v0, types: [T, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo] */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                int r0 = r12.f12065u
                java.lang.Object r1 = mt.c.e()
                int r2 = r12.f12064t
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                gt.o.b(r13)     // Catch: java.io.IOException -> L14
                goto L42
            L14:
                r0 = move-exception
                r13 = r0
                goto L66
            L17:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1f:
                gt.o.b(r13)
                goto L35
            L23:
                gt.o.b(r13)
                if (r0 <= 0) goto L35
                r12.f12065u = r0
                r12.f12064t = r4
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r13 = iu.z0.b(r5, r12)
                if (r13 != r1) goto L35
                goto L41
            L35:
                kotlin.jvm.functions.Function1<lt.b<? super hv.x<okhttp3.ResponseBody>>, java.lang.Object> r13 = r12.f12066v     // Catch: java.io.IOException -> L14
                r12.f12065u = r0     // Catch: java.io.IOException -> L14
                r12.f12064t = r3     // Catch: java.io.IOException -> L14
                java.lang.Object r13 = r13.invoke(r12)     // Catch: java.io.IOException -> L14
                if (r13 != r1) goto L42
            L41:
                return r1
            L42:
                hv.x r13 = (hv.x) r13     // Catch: java.io.IOException -> L14
                boolean r0 = r13.g()
                if (r0 != 0) goto L5b
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r13 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.toErrorInfo(r13)
                kotlin.jvm.internal.c0<com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo> r0 = r12.f12067w
                r0.f23007a = r13
                boolean r13 = r13.isRecoverable()
                java.lang.Boolean r13 = nt.b.a(r13)
                return r13
            L5b:
                kotlin.jvm.internal.c0<com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo> r13 = r12.f12067w
                r0 = 0
                r13.f23007a = r0
                r13 = 0
                java.lang.Boolean r13 = nt.b.a(r13)
                return r13
            L66:
                kotlin.jvm.internal.c0<com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo> r0 = r12.f12067w
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r5 = new com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo
                java.lang.String r7 = r13.getMessage()
                r10 = 8
                r11 = 0
                r6 = 0
                r8 = 1
                r9 = 0
                r5.<init>(r6, r7, r8, r9, r10, r11)
                r0.f23007a = r5
                java.lang.Boolean r13 = nt.b.a(r4)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.C0222e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object m(int i10, lt.b<? super Boolean> bVar) {
            return ((C0222e) create(Integer.valueOf(i10), bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {211}, m = "redeemRelaySession")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12068t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f12069u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f12071w;

        public f(lt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12069u = obj;
            this.f12071w |= Integer.MIN_VALUE;
            return e.this.m(null, this);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {465}, m = "runFallbackTransitionBack")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12072t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12073u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f12074v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f12076x;

        public g(lt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12074v = obj;
            this.f12076x |= Integer.MIN_VALUE;
            return e.this.n(null, null, this);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {435}, m = "runTransitionBack")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class h extends nt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12077t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12078u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f12079v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f12080w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f12081x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f12082y;

        public h(lt.b<? super h> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12082y = obj;
            this.A |= Integer.MIN_VALUE;
            return e.this.o(null, null, null, null, null, this);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {243, 251}, m = "updateInquiry")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class i extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12084t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12085u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f12086v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f12087w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f12089y;

        public i(lt.b<? super i> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12087w = obj;
            this.f12089y |= Integer.MIN_VALUE;
            return e.this.r(null, null, this);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {269}, m = "updateInquiryDeviceMetrics")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class j extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12090t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12091u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f12092v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f12094x;

        public j(lt.b<? super j> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12092v = obj;
            this.f12094x |= Integer.MIN_VALUE;
            return e.this.s(null, null, this);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$updateInquiryDeviceMetrics$updateInquiryError$1", f = "InquiryApiHelper.kt", l = {270}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhv/x;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Lhv/x;"}, k = 3, mv = {2, 2, 0})
    public static final class k extends nt.m implements Function1<lt.b<? super x<ResponseBody>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12095t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f12097v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ DeviceMetrics f12098w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, DeviceMetrics deviceMetrics, lt.b<? super k> bVar) {
            super(1, bVar);
            this.f12097v = str;
            this.f12098w = deviceMetrics;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return e.this.new k(this.f12097v, this.f12098w, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f12095t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            w wVar = e.this.service;
            String str = this.f12097v;
            UpdateInquirySessionRequest.Companion companion = UpdateInquirySessionRequest.INSTANCE;
            Long timeSinceBootMs = this.f12098w.getTimeSinceBootMs();
            Long totalMemoryBytes = this.f12098w.getTotalMemoryBytes();
            Long availableStorageBytes = this.f12098w.getAvailableStorageBytes();
            wn.n phoneCallStatus = this.f12098w.getPhoneCallStatus();
            UpdateInquirySessionRequest updateInquirySessionRequestA = companion.a(timeSinceBootMs, totalMemoryBytes, availableStorageBytes, phoneCallStatus != null ? phoneCallStatus.getSerializedValue() : null);
            this.f12095t = 1;
            Object objC = wVar.c(str, updateInquirySessionRequestA, this);
            return objC == objE ? objE : objC;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super x<ResponseBody>> bVar) {
            return ((k) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {362, 367, 373}, m = "updateInquiryInternal")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class l extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12099t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12100u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f12101v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f12102w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f12103x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f12105z;

        public l(lt.b<? super l> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12103x = obj;
            this.f12105z |= Integer.MIN_VALUE;
            return e.this.t(null, null, this);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$updateInquiryInternal$updateInquiryError$1", f = "InquiryApiHelper.kt", l = {374}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhv/x;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Lhv/x;"}, k = 3, mv = {2, 2, 0})
    public static final class m extends nt.m implements Function1<lt.b<? super x<ResponseBody>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12106t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f12108v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ GpsData f12109w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ThreatEventState f12110x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, GpsData gpsData, ThreatEventState threatEventState, lt.b<? super m> bVar) {
            super(1, bVar);
            this.f12108v = str;
            this.f12109w = gpsData;
            this.f12110x = threatEventState;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return e.this.new m(this.f12108v, this.f12109w, this.f12110x, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Map<String, ThreatEventState.EventMetadata> mapB;
            rq.b precision;
            Location location;
            Location location2;
            Object objE = mt.c.e();
            int i10 = this.f12106t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            w wVar = e.this.service;
            String str = this.f12108v;
            UpdateInquirySessionRequest.Companion companion = UpdateInquirySessionRequest.INSTANCE;
            GpsData gpsData = this.f12109w;
            ArrayList arrayList = null;
            Double dB = (gpsData == null || (location2 = gpsData.getLocation()) == null) ? null : nt.b.b(location2.getLatitude());
            GpsData gpsData2 = this.f12109w;
            Double dB2 = (gpsData2 == null || (location = gpsData2.getLocation()) == null) ? null : nt.b.b(location.getLongitude());
            GpsData gpsData3 = this.f12109w;
            String strA = (gpsData3 == null || (precision = gpsData3.getPrecision()) == null) ? null : rq.c.a(precision);
            ThreatEventState threatEventState = this.f12110x;
            if (threatEventState != null && (mapB = threatEventState.b()) != null) {
                arrayList = new ArrayList(mapB.size());
                for (Map.Entry<String, ThreatEventState.EventMetadata> entry : mapB.entrySet()) {
                    String key = entry.getKey();
                    String timestamp = entry.getValue().getTimestamp();
                    String str2 = "";
                    if (timestamp == null) {
                        timestamp = "";
                    }
                    String reasonData = entry.getValue().getReasonData();
                    if (reasonData != null) {
                        str2 = reasonData;
                    }
                    arrayList.add(new UpdateInquirySessionRequest.AppdomeThreatEvent(key, timestamp, str2));
                }
            }
            UpdateInquirySessionRequest updateInquirySessionRequestD = companion.d(dB2, dB, strA, arrayList);
            this.f12106t = 1;
            Object objC = wVar.c(str, updateInquirySessionRequestD, this);
            return objC == objE ? objE : objC;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super x<ResponseBody>> bVar) {
            return ((m) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {332, 335, 349}, m = "verifyDeviceIntegrity")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class n extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12111t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12112u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f12113v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f12114w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f12115x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f12117z;

        public n(lt.b<? super n> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12115x = obj;
            this.f12117z |= Integer.MIN_VALUE;
            return e.this.u(null, null, this);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$verifyDeviceIntegrity$verifyDeviceIntegrityError$1", f = "InquiryApiHelper.kt", l = {336}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhv/x;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Lhv/x;"}, k = 3, mv = {2, 2, 0})
    public static final class o extends nt.m implements Function1<lt.b<? super x<ResponseBody>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12118t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f12120v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f12121w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, String str2, lt.b<? super o> bVar) {
            super(1, bVar);
            this.f12120v = str;
            this.f12121w = str2;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return e.this.new o(this.f12120v, this.f12121w, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f12118t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            w wVar = e.this.service;
            String str = this.f12120v;
            VerifyDeviceIntegrityRequest verifyDeviceIntegrityRequest = new VerifyDeviceIntegrityRequest(new VerifyDeviceIntegrityRequest.Meta(e.this.applicationContext.getPackageName(), this.f12121w));
            this.f12118t = 1;
            Object objF = wVar.f(str, verifyDeviceIntegrityRequest, this);
            return objF == objE ? objE : objF;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super x<ResponseBody>> bVar) {
            return ((o) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public e(@NotNull Context applicationContext, @NotNull w service, @NotNull y relayService, @NotNull bp.i fallbackModeManager, @NotNull up.c sandboxFlags, @NotNull wn.a deviceIdProvider, @NotNull cp.a playIntegrityHelper, boolean z10) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(relayService, "relayService");
        Intrinsics.checkNotNullParameter(fallbackModeManager, "fallbackModeManager");
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(playIntegrityHelper, "playIntegrityHelper");
        this.applicationContext = applicationContext;
        this.service = service;
        this.relayService = relayService;
        this.fallbackModeManager = fallbackModeManager;
        this.sandboxFlags = sandboxFlags;
        this.deviceIdProvider = deviceIdProvider;
        this.playIntegrityHelper = playIntegrityHelper;
        this.redactAppIdentifyingInformation = z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        if (r0 == r3) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012f, code lost:
    
        if (r0 == r3) goto L54;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(@org.jetbrains.annotations.NotNull ep.InquiryAttributes r18, @org.jetbrains.annotations.NotNull lt.b<? super com.withpersona.sdk2.inquiry.internal.network.a> r19) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.h(ep.e, lt.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object i(@NotNull String str, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper, @NotNull lt.b<? super com.withpersona.sdk2.inquiry.internal.network.b> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f12054y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f12054y = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objI = bVar2.f12052w;
        Object objE = mt.c.e();
        int i11 = bVar2.f12054y;
        if (i11 == 0) {
            gt.o.b(objI);
            com.withpersona.sdk2.inquiry.internal.fallbackmode.i currentSession = this.fallbackModeManager.getCurrentSession();
            if (currentSession != null) {
                return new com.withpersona.sdk2.inquiry.internal.network.b.Success(currentSession.getAuthorization(), InquirySessionConfig.INSTANCE.a(), null, 4, null);
            }
            if (inquirySessionDataWrapper != null) {
                q(inquirySessionDataWrapper.getInquirySessionData());
                return new com.withpersona.sdk2.inquiry.internal.network.b.Success("Bearer " + inquirySessionDataWrapper.getAccessToken(), ep.c.a(inquirySessionDataWrapper.getInquirySessionData().getAttributes()), inquirySessionDataWrapper.getTrackingEventsUrl());
            }
            w wVar = this.service;
            CreateInquirySessionRequest createInquirySessionRequestA = CreateInquirySessionRequest.INSTANCE.a(str);
            String strB = this.deviceIdProvider.b();
            bVar2.f12049t = nt.l.a(str);
            bVar2.f12050u = nt.l.a(inquirySessionDataWrapper);
            bVar2.f12051v = nt.l.a(currentSession);
            bVar2.f12054y = 1;
            objI = wVar.i(createInquirySessionRequestA, strB, bVar2);
            if (objI == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(objI);
        }
        x xVar = (x) objI;
        if (!xVar.g()) {
            return new com.withpersona.sdk2.inquiry.internal.network.b.Error(NetworkUtilsKt.toErrorInfo(xVar));
        }
        String str2 = xVar.f().get("persona-device-id");
        if (str2 != null) {
            this.deviceIdProvider.a(str2);
        }
        Object objA = xVar.a();
        Intrinsics.checkNotNull(objA);
        CreateInquirySessionResponse createInquirySessionResponse = (CreateInquirySessionResponse) objA;
        q(createInquirySessionResponse.getData());
        return new com.withpersona.sdk2.inquiry.internal.network.b.Success("Bearer " + createInquirySessionResponse.getMeta().getAccessToken(), ep.c.a(createInquirySessionResponse.getData().getAttributes()), createInquirySessionResponse.getMeta().getTrackingEventsUrl());
    }

    public final InquirySessionDataWrapper j(CheckInquiryResponse checkInquiryResponse) {
        String accessToken;
        List<Included> included;
        CheckInquiryResponse.Meta meta = checkInquiryResponse.getMeta();
        if (meta == null || (accessToken = meta.getAccessToken()) == null || (included = checkInquiryResponse.getIncluded()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : included) {
            if (obj instanceof InquirySessionData) {
                arrayList.add(obj);
            }
        }
        InquirySessionData inquirySessionData = (InquirySessionData) CollectionsKt.firstOrNull(arrayList);
        if (inquirySessionData != null) {
            return new InquirySessionDataWrapper(accessToken, inquirySessionData, meta.getTrackingEventsUrl());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object k(@NotNull String str, @NotNull lt.b<? super com.withpersona.sdk2.inquiry.internal.network.d> bVar) {
        c cVar;
        Relationships relationships;
        Relationship inquiry;
        RelationshipData data;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f12058w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f12058w = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object objD = cVar.f12056u;
        Object objE = mt.c.e();
        int i11 = cVar.f12058w;
        if (i11 == 0) {
            gt.o.b(objD);
            w wVar = this.service;
            ExchangeOneTimeLinkCodeRequest exchangeOneTimeLinkCodeRequest = new ExchangeOneTimeLinkCodeRequest(new ExchangeOneTimeLinkCodeRequest.Data(new ExchangeOneTimeLinkCodeRequest.Attributes(str), null, 2, null));
            cVar.f12055t = str;
            cVar.f12058w = 1;
            objD = wVar.d(exchangeOneTimeLinkCodeRequest, cVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) cVar.f12055t;
            gt.o.b(objD);
        }
        x xVar = (x) objD;
        if (!xVar.g()) {
            return NetworkUtilsKt.toErrorInfo(xVar).getCode() == 404 ? new com.withpersona.sdk2.inquiry.internal.network.d.Error(new InternalErrorInfo.InvalidOneTimeLinkCode(str)) : new com.withpersona.sdk2.inquiry.internal.network.d.Error(NetworkUtilsKt.toErrorInfo(xVar));
        }
        String str2 = xVar.f().get("persona-device-id");
        if (str2 != null) {
            this.deviceIdProvider.a(str2);
        }
        Object objA = xVar.a();
        Intrinsics.checkNotNull(objA);
        ExchangeOneTimeLinkCodeResponse exchangeOneTimeLinkCodeResponse = (ExchangeOneTimeLinkCodeResponse) objA;
        InquirySessionData data2 = exchangeOneTimeLinkCodeResponse.getData();
        String id2 = (data2 == null || (relationships = data2.getRelationships()) == null || (inquiry = relationships.getInquiry()) == null || (data = inquiry.getData()) == null) ? null : data.getId();
        if (data2 != null) {
            q(data2);
        }
        if (id2 == null) {
            return new com.withpersona.sdk2.inquiry.internal.network.d.Error(new InternalErrorInfo.UnknownErrorInfo("Error exchanging one-time-code."));
        }
        ExchangeOneTimeLinkCodeResponse.Metadata meta = exchangeOneTimeLinkCodeResponse.getMeta();
        String str3 = "Bearer " + (meta != null ? meta.getAccessToken() : null);
        InquirySessionConfig inquirySessionConfigA = ep.c.a(data2.getAttributes());
        ExchangeOneTimeLinkCodeResponse.Metadata meta2 = exchangeOneTimeLinkCodeResponse.getMeta();
        return new com.withpersona.sdk2.inquiry.internal.network.d.Success(id2, str3, inquirySessionConfigA, meta2 != null ? meta2.getTrackingEventsUrl() : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(Function1<? super lt.b<? super x<ResponseBody>>, ? extends Object> function1, lt.b<? super InternalErrorInfo> bVar) {
        d dVar;
        c0 c0Var;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f12063x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f12063x = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f12061v;
        Object objE = mt.c.e();
        int i11 = dVar.f12063x;
        if (i11 == 0) {
            gt.o.b(obj);
            c0 c0Var2 = new c0();
            C0222e c0222e = new C0222e(function1, c0Var2, null);
            dVar.f12059t = nt.l.a(function1);
            dVar.f12060u = c0Var2;
            dVar.f12063x = 1;
            if (b0.a(5, c0222e, dVar) == objE) {
                return objE;
            }
            c0Var = c0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (c0) dVar.f12060u;
            gt.o.b(obj);
        }
        return c0Var.f23007a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object m(@NotNull String str, @NotNull lt.b<? super com.withpersona.sdk2.inquiry.internal.network.g> bVar) {
        f fVar;
        CurrentRelaySessionResponse.Metadata meta;
        CurrentRelaySessionResponse.Data data;
        Relationships relationships;
        Relationship inquiry;
        RelationshipData data2;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.f12071w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f12071w = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object objA = fVar.f12069u;
        Object objE = mt.c.e();
        int i11 = fVar.f12071w;
        if (i11 == 0) {
            gt.o.b(objA);
            fVar.f12068t = nt.l.a(str);
            fVar.f12071w = 1;
            objA = this.relayService.a("Bearer " + str, fVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(objA);
        }
        x xVar = (x) objA;
        if (!xVar.g()) {
            return new com.withpersona.sdk2.inquiry.internal.network.g.Error(NetworkUtilsKt.toErrorInfo(xVar));
        }
        String str2 = xVar.f().get("persona-device-id");
        if (str2 != null) {
            this.deviceIdProvider.a(str2);
        }
        CurrentRelaySessionResponse currentRelaySessionResponse = (CurrentRelaySessionResponse) xVar.a();
        String inquirySessionToken = null;
        String id2 = (currentRelaySessionResponse == null || (data = currentRelaySessionResponse.getData()) == null || (relationships = data.getRelationships()) == null || (inquiry = relationships.getInquiry()) == null || (data2 = inquiry.getData()) == null) ? null : data2.getId();
        if (currentRelaySessionResponse != null && (meta = currentRelaySessionResponse.getMeta()) != null) {
            inquirySessionToken = meta.getInquirySessionToken();
        }
        if (id2 == null || inquirySessionToken == null) {
            return new com.withpersona.sdk2.inquiry.internal.network.g.Error(new InternalErrorInfo.UnknownErrorInfo("Error resolving relay session."));
        }
        return new com.withpersona.sdk2.inquiry.internal.network.g.Success(id2, "Bearer " + inquirySessionToken, InquirySessionConfig.INSTANCE.a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(String str, String str2, lt.b<? super com.withpersona.sdk2.inquiry.internal.network.h> bVar) {
        g gVar;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.f12076x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f12076x = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        Object objF = gVar.f12074v;
        Object objE = mt.c.e();
        int i11 = gVar.f12076x;
        try {
            if (i11 == 0) {
                gt.o.b(objF);
                bp.i iVar = this.fallbackModeManager;
                TransitionBackRequest transitionBackRequestA = TransitionBackRequest.INSTANCE.a(str2);
                gVar.f12072t = nt.l.a(str);
                gVar.f12073u = nt.l.a(str2);
                gVar.f12076x = 1;
                objF = iVar.f(str, transitionBackRequestA, gVar);
                if (objF == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(objF);
            }
            x xVar = (x) objF;
            com.withpersona.sdk2.inquiry.internal.fallbackmode.i currentSession = this.fallbackModeManager.getCurrentSession();
            if (xVar.g()) {
                return currentSession == null ? new com.withpersona.sdk2.inquiry.internal.network.h.Error(new InternalErrorInfo.UnknownErrorInfo("Current fallback session is unexpectedly null.")) : new com.withpersona.sdk2.inquiry.internal.network.h.Success(currentSession.a());
            }
            return new com.withpersona.sdk2.inquiry.internal.network.h.Error(NetworkUtilsKt.toErrorInfo(xVar));
        } catch (SocketTimeoutException e10) {
            return new com.withpersona.sdk2.inquiry.internal.network.h.Error(NetworkUtilsKt.toSocketTimeoutErrorInfo(e10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, String str4, lt.b<? super com.withpersona.sdk2.inquiry.internal.network.h> bVar) {
        h hVar;
        if (bVar instanceof h) {
            hVar = (h) bVar;
            int i10 = hVar.A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.A = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(bVar);
            }
        } else {
            hVar = new h(bVar);
        }
        Object objB = hVar.f12082y;
        Object objE = mt.c.e();
        int i11 = hVar.A;
        try {
            if (i11 == 0) {
                gt.o.b(objB);
                w wVar = this.service;
                TransitionBackRequest transitionBackRequestA = TransitionBackRequest.INSTANCE.a(str3);
                hVar.f12077t = str;
                hVar.f12078u = nt.l.a(str2);
                hVar.f12079v = nt.l.a(str3);
                hVar.f12080w = inquirySessionConfig;
                hVar.f12081x = str4;
                hVar.A = 1;
                objB = wVar.b(str, str2, transitionBackRequestA, hVar);
                if (objB == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (String) hVar.f12081x;
                inquirySessionConfig = (InquirySessionConfig) hVar.f12080w;
                str = (String) hVar.f12077t;
                gt.o.b(objB);
            }
            x xVar = (x) objB;
            if (!xVar.g()) {
                return new com.withpersona.sdk2.inquiry.internal.network.h.Error(NetworkUtilsKt.toErrorInfo(xVar));
            }
            Object objA = xVar.a();
            Intrinsics.checkNotNull(objA);
            return new com.withpersona.sdk2.inquiry.internal.network.h.Success(ep.a.w((CheckInquiryResponse) objA, str, inquirySessionConfig, str4));
        } catch (SocketTimeoutException e10) {
            return new com.withpersona.sdk2.inquiry.internal.network.h.Error(NetworkUtilsKt.toSocketTimeoutErrorInfo(e10));
        }
    }

    @Nullable
    public final Object p(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str4, @NotNull lt.b<? super com.withpersona.sdk2.inquiry.internal.network.h> bVar) {
        return this.fallbackModeManager.b() ? n(str, str3, bVar) : o(str, str2, str3, inquirySessionConfig, str4, bVar);
    }

    public final void q(@NotNull InquirySessionData inquirySessionData) {
        Relationship device;
        RelationshipData data;
        String id2;
        Intrinsics.checkNotNullParameter(inquirySessionData, "inquirySessionData");
        Relationships relationships = inquirySessionData.getRelationships();
        if (relationships != null && (device = relationships.getDevice()) != null && (data = device.getData()) != null && (id2 = data.getId()) != null) {
            this.deviceIdProvider.a(id2);
        }
        String playIntegrityProjectId = inquirySessionData.getAttributes().getPlayIntegrityProjectId();
        if (playIntegrityProjectId != null) {
            this.playIntegrityHelper.h(playIntegrityProjectId);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object r(@NotNull String str, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull lt.b<? super com.withpersona.sdk2.inquiry.internal.network.i> bVar) {
        i iVar;
        InquirySessionConfig inquirySessionConfig2;
        if (bVar instanceof i) {
            iVar = (i) bVar;
            int i10 = iVar.f12089y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f12089y = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(bVar);
            }
        } else {
            iVar = new i(bVar);
        }
        Object objU = iVar.f12087w;
        Object objE = mt.c.e();
        int i11 = iVar.f12089y;
        if (i11 == 0) {
            gt.o.b(objU);
            iVar.f12084t = str;
            iVar.f12085u = inquirySessionConfig;
            iVar.f12089y = 1;
            objU = u(str, inquirySessionConfig, iVar);
            if (objU != objE) {
            }
            return objE;
        }
        if (i11 == 1) {
            inquirySessionConfig = (InquirySessionConfig) iVar.f12085u;
            str = (String) iVar.f12084t;
            gt.o.b(objU);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inquirySessionConfig2 = (InquirySessionConfig) iVar.f12085u;
            gt.o.b(objU);
        }
        InternalErrorInfo internalErrorInfo = (InternalErrorInfo) objU;
        return (internalErrorInfo == null && inquirySessionConfig2.k()) ? new com.withpersona.sdk2.inquiry.internal.network.i.Error(internalErrorInfo) : com.withpersona.sdk2.inquiry.internal.network.i.b.f12132a;
        com.withpersona.sdk2.inquiry.internal.network.j jVar = (com.withpersona.sdk2.inquiry.internal.network.j) objU;
        if (jVar instanceof com.withpersona.sdk2.inquiry.internal.network.j.Error) {
            return new com.withpersona.sdk2.inquiry.internal.network.i.Error(((com.withpersona.sdk2.inquiry.internal.network.j.Error) jVar).getCause());
        }
        iVar.f12084t = nt.l.a(str);
        iVar.f12085u = inquirySessionConfig;
        iVar.f12086v = nt.l.a(jVar);
        iVar.f12089y = 2;
        objU = t(str, inquirySessionConfig, iVar);
        if (objU != objE) {
            inquirySessionConfig2 = inquirySessionConfig;
            InternalErrorInfo internalErrorInfo2 = (InternalErrorInfo) objU;
            if (internalErrorInfo2 == null) {
            }
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object s(@NotNull String str, @NotNull DeviceMetrics deviceMetrics, @NotNull lt.b<? super com.withpersona.sdk2.inquiry.internal.network.i> bVar) {
        j jVar;
        if (bVar instanceof j) {
            jVar = (j) bVar;
            int i10 = jVar.f12094x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f12094x = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(bVar);
            }
        } else {
            jVar = new j(bVar);
        }
        Object objL = jVar.f12092v;
        Object objE = mt.c.e();
        int i11 = jVar.f12094x;
        if (i11 == 0) {
            gt.o.b(objL);
            Function1<? super lt.b<? super x<ResponseBody>>, ? extends Object> kVar = new k(str, deviceMetrics, null);
            jVar.f12090t = nt.l.a(str);
            jVar.f12091u = nt.l.a(deviceMetrics);
            jVar.f12094x = 1;
            objL = l(kVar, jVar);
            if (objL == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(objL);
        }
        InternalErrorInfo internalErrorInfo = (InternalErrorInfo) objL;
        return internalErrorInfo == null ? com.withpersona.sdk2.inquiry.internal.network.i.b.f12132a : new com.withpersona.sdk2.inquiry.internal.network.i.Error(internalErrorInfo);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f5, code lost:
    
        if (r0 == r7) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.lang.String r13, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r14, lt.b<? super com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo> r15) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.t(java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, lt.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00db, code lost:
    
        if (r4.i(r0) == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.String r8, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r9, lt.b<? super com.withpersona.sdk2.inquiry.internal.network.j> r10) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.u(java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, lt.b):java.lang.Object");
    }
}
