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
import gp.w;
import gp.y;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jq.b0;
import jv.x;
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
import tq.GpsData;
import xn.ThreatEventState;
import yn.DeviceMetrics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b&\u0010#J \u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0086@¢\u0006\u0004\b+\u0010,J \u0010/\u001a\u00020*2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010.\u001a\u00020-H\u0086@¢\u0006\u0004\b/\u00100J:\u00104\u001a\u0002032\u0006\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\u00102\u001a\u0004\u0018\u00010\u0019H\u0080@¢\u0006\u0004\b4\u00105J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b9\u0010:J \u0010<\u001a\u00020;2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b<\u0010,J\"\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b>\u0010,J6\u0010D\u001a\u0004\u0018\u00010=2\"\u0010C\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0@\u0012\u0006\u0012\u0004\u0018\u00010\u00010?H\u0082@¢\u0006\u0004\bD\u0010EJ:\u0010F\u001a\u0002032\u0006\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\u00102\u001a\u0004\u0018\u00010\u0019H\u0082@¢\u0006\u0004\bF\u00105J \u0010G\u001a\u0002032\u0006\u0010'\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0019H\u0082@¢\u0006\u0004\bG\u0010HJ\u0019\u0010K\u001a\u0004\u0018\u00010\u001b2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010[¨\u0006\\"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/e;", "", "Landroid/content/Context;", "applicationContext", "Lgp/w;", "service", "Lgp/y;", "relayService", "Ldp/i;", "fallbackModeManager", "Lwp/c;", "sandboxFlags", "Lyn/a;", "deviceIdProvider", "Lep/a;", "playIntegrityHelper", "", "redactAppIdentifyingInformation", "<init>", "(Landroid/content/Context;Lgp/w;Lgp/y;Ldp/i;Lwp/c;Lyn/a;Lep/a;Z)V", "Lgp/e;", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/network/a;", "h", "(Lgp/e;Lnt/b;)Ljava/lang/Object;", "", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "inquirySessionDataWrapper", "Lcom/withpersona/sdk2/inquiry/internal/network/b;", "i", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;Lnt/b;)Ljava/lang/Object;", "oneTimeLinkCode", "Lcom/withpersona/sdk2/inquiry/internal/network/d;", "k", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "relaySessionToken", "Lcom/withpersona/sdk2/inquiry/internal/network/g;", "m", "sessionToken", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/network/i;", "r", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lnt/b;)Ljava/lang/Object;", "Lyn/c;", "metrics", "s", "(Ljava/lang/String;Lyn/c;Lnt/b;)Ljava/lang/Object;", "fromStep", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/network/h;", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;", "inquirySessionData", "", "q", "(Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;)V", "Lcom/withpersona/sdk2/inquiry/internal/network/j;", "u", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "t", "Lkotlin/Function1;", "Lnt/b;", "Ljv/x;", "Lokhttp3/ResponseBody;", "inquiryCall", "l", "(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "o", "n", "(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "checkInquiryResponse", "j", "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;)Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "a", "Landroid/content/Context;", "b", "Lgp/w;", "c", "Lgp/y;", "d", "Ldp/i;", "e", "Lwp/c;", "f", "Lyn/a;", "g", "Lep/a;", "Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public final dp.i fallbackModeManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final wp.c sandboxFlags;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yn.a deviceIdProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ep.a playIntegrityHelper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final boolean redactAppIdentifyingInformation;

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {64, 80}, m = "createInquiry")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11964t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f11965u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f11967w;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11965u = obj;
            this.f11967w |= Integer.MIN_VALUE;
            return e.this.h(null, this);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {138}, m = "createInquirySession")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11968t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f11969u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f11970v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f11971w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f11973y;

        public b(nt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11971w = obj;
            this.f11973y |= Integer.MIN_VALUE;
            return e.this.i(null, null, this);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {162}, m = "exchangeOneTimeLinkCode")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11974t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f11975u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f11977w;

        public c(nt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11975u = obj;
            this.f11977w |= Integer.MIN_VALUE;
            return e.this.k(null, this);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {397}, m = "makeInquiryCallWithRetry")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11978t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f11979u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f11980v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f11982x;

        public d(nt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11980v = obj;
            this.f11982x |= Integer.MIN_VALUE;
            return e.this.l(null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "attempt", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$makeInquiryCallWithRetry$2", f = "InquiryApiHelper.kt", l = {399, 403}, m = "invokeSuspend")
    public static final class C0219e extends pt.m implements Function2<Integer, nt.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11983t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ int f11984u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1<nt.b<? super x<ResponseBody>>, Object> f11985v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ c0<InternalErrorInfo> f11986w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0219e(Function1<? super nt.b<? super x<ResponseBody>>, ? extends Object> function1, c0<InternalErrorInfo> c0Var, nt.b<? super C0219e> bVar) {
            super(2, bVar);
            this.f11985v = function1;
            this.f11986w = c0Var;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            C0219e c0219e = new C0219e(this.f11985v, this.f11986w, bVar);
            c0219e.f11984u = ((Number) obj).intValue();
            return c0219e;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, nt.b<? super Boolean> bVar) {
            return q(num.intValue(), bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        
            if (r13 == r1) goto L20;
         */
        /* JADX WARN: Type inference failed for: r13v11, types: [T, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo] */
        /* JADX WARN: Type inference failed for: r5v0, types: [T, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo] */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                int r0 = r12.f11984u
                java.lang.Object r1 = ot.c.e()
                int r2 = r12.f11983t
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                jt.o.b(r13)     // Catch: java.io.IOException -> L14
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
                jt.o.b(r13)
                goto L35
            L23:
                jt.o.b(r13)
                if (r0 <= 0) goto L35
                r12.f11984u = r0
                r12.f11983t = r4
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r13 = ku.z0.b(r5, r12)
                if (r13 != r1) goto L35
                goto L41
            L35:
                kotlin.jvm.functions.Function1<nt.b<? super jv.x<okhttp3.ResponseBody>>, java.lang.Object> r13 = r12.f11985v     // Catch: java.io.IOException -> L14
                r12.f11984u = r0     // Catch: java.io.IOException -> L14
                r12.f11983t = r3     // Catch: java.io.IOException -> L14
                java.lang.Object r13 = r13.invoke(r12)     // Catch: java.io.IOException -> L14
                if (r13 != r1) goto L42
            L41:
                return r1
            L42:
                jv.x r13 = (jv.x) r13     // Catch: java.io.IOException -> L14
                boolean r0 = r13.g()
                if (r0 != 0) goto L5b
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r13 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.toErrorInfo(r13)
                kotlin.jvm.internal.c0<com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo> r0 = r12.f11986w
                r0.f22552a = r13
                boolean r13 = r13.isRecoverable()
                java.lang.Boolean r13 = pt.b.a(r13)
                return r13
            L5b:
                kotlin.jvm.internal.c0<com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo> r13 = r12.f11986w
                r0 = 0
                r13.f22552a = r0
                r13 = 0
                java.lang.Boolean r13 = pt.b.a(r13)
                return r13
            L66:
                kotlin.jvm.internal.c0<com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo> r0 = r12.f11986w
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r5 = new com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo
                java.lang.String r7 = r13.getMessage()
                r10 = 8
                r11 = 0
                r6 = 0
                r8 = 1
                r9 = 0
                r5.<init>(r6, r7, r8, r9, r10, r11)
                r0.f22552a = r5
                java.lang.Boolean r13 = pt.b.a(r4)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.C0219e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object q(int i10, nt.b<? super Boolean> bVar) {
            return ((C0219e) create(Integer.valueOf(i10), bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {211}, m = "redeemRelaySession")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11987t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f11988u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f11990w;

        public f(nt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11988u = obj;
            this.f11990w |= Integer.MIN_VALUE;
            return e.this.m(null, this);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {465}, m = "runFallbackTransitionBack")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11991t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f11992u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f11993v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f11995x;

        public g(nt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11993v = obj;
            this.f11995x |= Integer.MIN_VALUE;
            return e.this.n(null, null, this);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {435}, m = "runTransitionBack")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class h extends pt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11996t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f11997u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f11998v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f11999w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f12000x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f12001y;

        public h(nt.b<? super h> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12001y = obj;
            this.A |= Integer.MIN_VALUE;
            return e.this.o(null, null, null, null, null, this);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {243, 251}, m = "updateInquiry")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class i extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12003t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12004u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f12005v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f12006w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f12008y;

        public i(nt.b<? super i> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12006w = obj;
            this.f12008y |= Integer.MIN_VALUE;
            return e.this.r(null, null, this);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {269}, m = "updateInquiryDeviceMetrics")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class j extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12009t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12010u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f12011v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f12013x;

        public j(nt.b<? super j> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12011v = obj;
            this.f12013x |= Integer.MIN_VALUE;
            return e.this.s(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljv/x;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Ljv/x;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$updateInquiryDeviceMetrics$updateInquiryError$1", f = "InquiryApiHelper.kt", l = {270}, m = "invokeSuspend")
    public static final class k extends pt.m implements Function1<nt.b<? super x<ResponseBody>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12014t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f12016v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ DeviceMetrics f12017w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, DeviceMetrics deviceMetrics, nt.b<? super k> bVar) {
            super(1, bVar);
            this.f12016v = str;
            this.f12017w = deviceMetrics;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return e.this.new k(this.f12016v, this.f12017w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f12014t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            w wVar = e.this.service;
            String str = this.f12016v;
            UpdateInquirySessionRequest.Companion companion = UpdateInquirySessionRequest.INSTANCE;
            Long timeSinceBootMs = this.f12017w.getTimeSinceBootMs();
            Long totalMemoryBytes = this.f12017w.getTotalMemoryBytes();
            Long availableStorageBytes = this.f12017w.getAvailableStorageBytes();
            yn.n phoneCallStatus = this.f12017w.getPhoneCallStatus();
            UpdateInquirySessionRequest updateInquirySessionRequestA = companion.a(timeSinceBootMs, totalMemoryBytes, availableStorageBytes, phoneCallStatus != null ? phoneCallStatus.getSerializedValue() : null);
            this.f12014t = 1;
            Object objI = wVar.i(str, updateInquirySessionRequestA, this);
            return objI == objE ? objE : objI;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super x<ResponseBody>> bVar) {
            return ((k) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {362, 367, 373}, m = "updateInquiryInternal")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class l extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12018t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12019u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f12020v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f12021w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f12022x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f12024z;

        public l(nt.b<? super l> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12022x = obj;
            this.f12024z |= Integer.MIN_VALUE;
            return e.this.t(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljv/x;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Ljv/x;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$updateInquiryInternal$updateInquiryError$1", f = "InquiryApiHelper.kt", l = {374}, m = "invokeSuspend")
    public static final class m extends pt.m implements Function1<nt.b<? super x<ResponseBody>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12025t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f12027v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ GpsData f12028w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ThreatEventState f12029x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, GpsData gpsData, ThreatEventState threatEventState, nt.b<? super m> bVar) {
            super(1, bVar);
            this.f12027v = str;
            this.f12028w = gpsData;
            this.f12029x = threatEventState;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return e.this.new m(this.f12027v, this.f12028w, this.f12029x, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Map<String, ThreatEventState.EventMetadata> mapB;
            tq.b precision;
            Location location;
            Location location2;
            Object objE = ot.c.e();
            int i10 = this.f12025t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            w wVar = e.this.service;
            String str = this.f12027v;
            UpdateInquirySessionRequest.Companion companion = UpdateInquirySessionRequest.INSTANCE;
            GpsData gpsData = this.f12028w;
            ArrayList arrayList = null;
            Double dB = (gpsData == null || (location2 = gpsData.getLocation()) == null) ? null : pt.b.b(location2.getLatitude());
            GpsData gpsData2 = this.f12028w;
            Double dB2 = (gpsData2 == null || (location = gpsData2.getLocation()) == null) ? null : pt.b.b(location.getLongitude());
            GpsData gpsData3 = this.f12028w;
            String strA = (gpsData3 == null || (precision = gpsData3.getPrecision()) == null) ? null : tq.c.a(precision);
            ThreatEventState threatEventState = this.f12029x;
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
            this.f12025t = 1;
            Object objI = wVar.i(str, updateInquirySessionRequestD, this);
            return objI == objE ? objE : objI;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super x<ResponseBody>> bVar) {
            return ((m) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {332, 335, 349}, m = "verifyDeviceIntegrity")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class n extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12030t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12031u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f12032v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f12033w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f12034x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f12036z;

        public n(nt.b<? super n> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12034x = obj;
            this.f12036z |= Integer.MIN_VALUE;
            return e.this.u(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljv/x;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Ljv/x;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$verifyDeviceIntegrity$verifyDeviceIntegrityError$1", f = "InquiryApiHelper.kt", l = {336}, m = "invokeSuspend")
    public static final class o extends pt.m implements Function1<nt.b<? super x<ResponseBody>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12037t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f12039v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f12040w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, String str2, nt.b<? super o> bVar) {
            super(1, bVar);
            this.f12039v = str;
            this.f12040w = str2;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return e.this.new o(this.f12039v, this.f12040w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f12037t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            w wVar = e.this.service;
            String str = this.f12039v;
            VerifyDeviceIntegrityRequest verifyDeviceIntegrityRequest = new VerifyDeviceIntegrityRequest(new VerifyDeviceIntegrityRequest.Meta(e.this.applicationContext.getPackageName(), this.f12040w));
            this.f12037t = 1;
            Object objA = wVar.a(str, verifyDeviceIntegrityRequest, this);
            return objA == objE ? objE : objA;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super x<ResponseBody>> bVar) {
            return ((o) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public e(@NotNull Context applicationContext, @NotNull w service, @NotNull y relayService, @NotNull dp.i fallbackModeManager, @NotNull wp.c sandboxFlags, @NotNull yn.a deviceIdProvider, @NotNull ep.a playIntegrityHelper, boolean z10) {
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
    public final java.lang.Object h(@org.jetbrains.annotations.NotNull gp.InquiryAttributes r18, @org.jetbrains.annotations.NotNull nt.b<? super com.withpersona.sdk2.inquiry.internal.network.a> r19) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.h(gp.e, nt.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object i(@NotNull String str, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper, @NotNull nt.b<? super com.withpersona.sdk2.inquiry.internal.network.b> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f11973y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f11973y = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objG = bVar2.f11971w;
        Object objE = ot.c.e();
        int i11 = bVar2.f11973y;
        if (i11 == 0) {
            jt.o.b(objG);
            com.withpersona.sdk2.inquiry.internal.fallbackmode.i currentSession = this.fallbackModeManager.getCurrentSession();
            if (currentSession != null) {
                return new com.withpersona.sdk2.inquiry.internal.network.b.Success(currentSession.getAuthorization(), InquirySessionConfig.INSTANCE.a(), null, 4, null);
            }
            if (inquirySessionDataWrapper != null) {
                q(inquirySessionDataWrapper.getInquirySessionData());
                return new com.withpersona.sdk2.inquiry.internal.network.b.Success("Bearer " + inquirySessionDataWrapper.getAccessToken(), gp.c.a(inquirySessionDataWrapper.getInquirySessionData().getAttributes()), inquirySessionDataWrapper.getTrackingEventsUrl());
            }
            w wVar = this.service;
            CreateInquirySessionRequest createInquirySessionRequestA = CreateInquirySessionRequest.INSTANCE.a(str);
            String strB = this.deviceIdProvider.b();
            bVar2.f11968t = pt.l.a(str);
            bVar2.f11969u = pt.l.a(inquirySessionDataWrapper);
            bVar2.f11970v = pt.l.a(currentSession);
            bVar2.f11973y = 1;
            objG = wVar.g(createInquirySessionRequestA, strB, bVar2);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(objG);
        }
        x xVar = (x) objG;
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
        return new com.withpersona.sdk2.inquiry.internal.network.b.Success("Bearer " + createInquirySessionResponse.getMeta().getAccessToken(), gp.c.a(createInquirySessionResponse.getData().getAttributes()), createInquirySessionResponse.getMeta().getTrackingEventsUrl());
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
    public final Object k(@NotNull String str, @NotNull nt.b<? super com.withpersona.sdk2.inquiry.internal.network.d> bVar) {
        c cVar;
        Relationships relationships;
        Relationship inquiry;
        RelationshipData data;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f11977w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f11977w = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object objB = cVar.f11975u;
        Object objE = ot.c.e();
        int i11 = cVar.f11977w;
        if (i11 == 0) {
            jt.o.b(objB);
            w wVar = this.service;
            ExchangeOneTimeLinkCodeRequest exchangeOneTimeLinkCodeRequest = new ExchangeOneTimeLinkCodeRequest(new ExchangeOneTimeLinkCodeRequest.Data(new ExchangeOneTimeLinkCodeRequest.Attributes(str), null, 2, null));
            cVar.f11974t = str;
            cVar.f11977w = 1;
            objB = wVar.b(exchangeOneTimeLinkCodeRequest, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) cVar.f11974t;
            jt.o.b(objB);
        }
        x xVar = (x) objB;
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
        InquirySessionConfig inquirySessionConfigA = gp.c.a(data2.getAttributes());
        ExchangeOneTimeLinkCodeResponse.Metadata meta2 = exchangeOneTimeLinkCodeResponse.getMeta();
        return new com.withpersona.sdk2.inquiry.internal.network.d.Success(id2, str3, inquirySessionConfigA, meta2 != null ? meta2.getTrackingEventsUrl() : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(Function1<? super nt.b<? super x<ResponseBody>>, ? extends Object> function1, nt.b<? super InternalErrorInfo> bVar) {
        d dVar;
        c0 c0Var;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f11982x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f11982x = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f11980v;
        Object objE = ot.c.e();
        int i11 = dVar.f11982x;
        if (i11 == 0) {
            jt.o.b(obj);
            c0 c0Var2 = new c0();
            C0219e c0219e = new C0219e(function1, c0Var2, null);
            dVar.f11978t = pt.l.a(function1);
            dVar.f11979u = c0Var2;
            dVar.f11982x = 1;
            if (b0.a(5, c0219e, dVar) == objE) {
                return objE;
            }
            c0Var = c0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (c0) dVar.f11979u;
            jt.o.b(obj);
        }
        return c0Var.f22552a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object m(@NotNull String str, @NotNull nt.b<? super com.withpersona.sdk2.inquiry.internal.network.g> bVar) {
        f fVar;
        CurrentRelaySessionResponse.Metadata meta;
        CurrentRelaySessionResponse.Data data;
        Relationships relationships;
        Relationship inquiry;
        RelationshipData data2;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.f11990w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f11990w = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object objA = fVar.f11988u;
        Object objE = ot.c.e();
        int i11 = fVar.f11990w;
        if (i11 == 0) {
            jt.o.b(objA);
            fVar.f11987t = pt.l.a(str);
            fVar.f11990w = 1;
            objA = this.relayService.a("Bearer " + str, fVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(objA);
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
    public final Object n(String str, String str2, nt.b<? super com.withpersona.sdk2.inquiry.internal.network.h> bVar) {
        g gVar;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.f11995x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f11995x = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        Object objF = gVar.f11993v;
        Object objE = ot.c.e();
        int i11 = gVar.f11995x;
        try {
            if (i11 == 0) {
                jt.o.b(objF);
                dp.i iVar = this.fallbackModeManager;
                TransitionBackRequest transitionBackRequestA = TransitionBackRequest.INSTANCE.a(str2);
                gVar.f11991t = pt.l.a(str);
                gVar.f11992u = pt.l.a(str2);
                gVar.f11995x = 1;
                objF = iVar.f(str, transitionBackRequestA, gVar);
                if (objF == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(objF);
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
    public final Object o(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, String str4, nt.b<? super com.withpersona.sdk2.inquiry.internal.network.h> bVar) {
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
        Object objJ = hVar.f12001y;
        Object objE = ot.c.e();
        int i11 = hVar.A;
        try {
            if (i11 == 0) {
                jt.o.b(objJ);
                w wVar = this.service;
                TransitionBackRequest transitionBackRequestA = TransitionBackRequest.INSTANCE.a(str3);
                hVar.f11996t = str;
                hVar.f11997u = pt.l.a(str2);
                hVar.f11998v = pt.l.a(str3);
                hVar.f11999w = inquirySessionConfig;
                hVar.f12000x = str4;
                hVar.A = 1;
                objJ = wVar.j(str, str2, transitionBackRequestA, hVar);
                if (objJ == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (String) hVar.f12000x;
                inquirySessionConfig = (InquirySessionConfig) hVar.f11999w;
                str = (String) hVar.f11996t;
                jt.o.b(objJ);
            }
            x xVar = (x) objJ;
            if (!xVar.g()) {
                return new com.withpersona.sdk2.inquiry.internal.network.h.Error(NetworkUtilsKt.toErrorInfo(xVar));
            }
            Object objA = xVar.a();
            Intrinsics.checkNotNull(objA);
            return new com.withpersona.sdk2.inquiry.internal.network.h.Success(gp.a.w((CheckInquiryResponse) objA, str, inquirySessionConfig, str4));
        } catch (SocketTimeoutException e10) {
            return new com.withpersona.sdk2.inquiry.internal.network.h.Error(NetworkUtilsKt.toSocketTimeoutErrorInfo(e10));
        }
    }

    @Nullable
    public final Object p(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str4, @NotNull nt.b<? super com.withpersona.sdk2.inquiry.internal.network.h> bVar) {
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
    public final Object r(@NotNull String str, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull nt.b<? super com.withpersona.sdk2.inquiry.internal.network.i> bVar) {
        i iVar;
        InquirySessionConfig inquirySessionConfig2;
        if (bVar instanceof i) {
            iVar = (i) bVar;
            int i10 = iVar.f12008y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f12008y = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(bVar);
            }
        } else {
            iVar = new i(bVar);
        }
        Object objU = iVar.f12006w;
        Object objE = ot.c.e();
        int i11 = iVar.f12008y;
        if (i11 == 0) {
            jt.o.b(objU);
            iVar.f12003t = str;
            iVar.f12004u = inquirySessionConfig;
            iVar.f12008y = 1;
            objU = u(str, inquirySessionConfig, iVar);
            if (objU != objE) {
            }
            return objE;
        }
        if (i11 == 1) {
            inquirySessionConfig = (InquirySessionConfig) iVar.f12004u;
            str = (String) iVar.f12003t;
            jt.o.b(objU);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inquirySessionConfig2 = (InquirySessionConfig) iVar.f12004u;
            jt.o.b(objU);
        }
        InternalErrorInfo internalErrorInfo = (InternalErrorInfo) objU;
        return (internalErrorInfo == null && inquirySessionConfig2.k()) ? new com.withpersona.sdk2.inquiry.internal.network.i.Error(internalErrorInfo) : com.withpersona.sdk2.inquiry.internal.network.i.b.f12051a;
        com.withpersona.sdk2.inquiry.internal.network.j jVar = (com.withpersona.sdk2.inquiry.internal.network.j) objU;
        if (jVar instanceof com.withpersona.sdk2.inquiry.internal.network.j.Error) {
            return new com.withpersona.sdk2.inquiry.internal.network.i.Error(((com.withpersona.sdk2.inquiry.internal.network.j.Error) jVar).getCause());
        }
        iVar.f12003t = pt.l.a(str);
        iVar.f12004u = inquirySessionConfig;
        iVar.f12005v = pt.l.a(jVar);
        iVar.f12008y = 2;
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
    public final Object s(@NotNull String str, @NotNull DeviceMetrics deviceMetrics, @NotNull nt.b<? super com.withpersona.sdk2.inquiry.internal.network.i> bVar) {
        j jVar;
        if (bVar instanceof j) {
            jVar = (j) bVar;
            int i10 = jVar.f12013x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f12013x = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(bVar);
            }
        } else {
            jVar = new j(bVar);
        }
        Object objL = jVar.f12011v;
        Object objE = ot.c.e();
        int i11 = jVar.f12013x;
        if (i11 == 0) {
            jt.o.b(objL);
            Function1<? super nt.b<? super x<ResponseBody>>, ? extends Object> kVar = new k(str, deviceMetrics, null);
            jVar.f12009t = pt.l.a(str);
            jVar.f12010u = pt.l.a(deviceMetrics);
            jVar.f12013x = 1;
            objL = l(kVar, jVar);
            if (objL == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(objL);
        }
        InternalErrorInfo internalErrorInfo = (InternalErrorInfo) objL;
        return internalErrorInfo == null ? com.withpersona.sdk2.inquiry.internal.network.i.b.f12051a : new com.withpersona.sdk2.inquiry.internal.network.i.Error(internalErrorInfo);
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
    public final java.lang.Object t(java.lang.String r13, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r14, nt.b<? super com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo> r15) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.t(java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, nt.b):java.lang.Object");
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
    public final java.lang.Object u(java.lang.String r8, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig r9, nt.b<? super com.withpersona.sdk2.inquiry.internal.network.j> r10) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.network.e.u(java.lang.String, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, nt.b):java.lang.Object");
    }
}
