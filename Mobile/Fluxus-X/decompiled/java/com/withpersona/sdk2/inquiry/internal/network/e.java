package com.withpersona.sdk2.inquiry.internal.network;

import android.content.Context;
import android.location.Location;
import av.z0;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.network.dto.Included;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionData;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.Relationship;
import com.withpersona.sdk2.inquiry.network.dto.RelationshipData;
import com.withpersona.sdk2.inquiry.network.dto.Relationships;
import hr.GpsData;
import hr.InquirySessionConfig;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lo.ThreatEventState;
import mo.DeviceMetrics;
import mv.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.c0;
import sw.x;
import up.InquiryAttributes;
import up.w;
import up.y;
import xq.b0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b&\u0010#J \u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0086@¢\u0006\u0004\b+\u0010,J \u0010/\u001a\u00020*2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010.\u001a\u00020-H\u0086@¢\u0006\u0004\b/\u00100J:\u00104\u001a\u0002032\u0006\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\u00102\u001a\u0004\u0018\u00010\u0019H\u0080@¢\u0006\u0004\b4\u00105J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b9\u0010:J \u0010<\u001a\u00020;2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b<\u0010,J\"\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b>\u0010,J6\u0010D\u001a\u0004\u0018\u00010=2\"\u0010C\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0@\u0012\u0006\u0012\u0004\u0018\u00010\u00010?H\u0082@¢\u0006\u0004\bD\u0010EJ:\u0010F\u001a\u0002032\u0006\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\u00102\u001a\u0004\u0018\u00010\u0019H\u0082@¢\u0006\u0004\bF\u00105J \u0010G\u001a\u0002032\u0006\u0010'\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0019H\u0082@¢\u0006\u0004\bG\u0010HJ\u0019\u0010K\u001a\u0004\u0018\u00010\u001b2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010[¨\u0006\\"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/e;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Lup/w;", "service", "Lup/y;", "relayService", "Lrp/i;", "fallbackModeManager", "Lkq/c;", "sandboxFlags", "Lmo/a;", "deviceIdProvider", "Lsp/a;", "playIntegrityHelper", BuildConfig.FLAVOR, "redactAppIdentifyingInformation", "<init>", "(Landroid/content/Context;Lup/w;Lup/y;Lrp/i;Lkq/c;Lmo/a;Lsp/a;Z)V", "Lup/e;", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/network/a;", "h", "(Lup/e;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "inquirySessionDataWrapper", "Lcom/withpersona/sdk2/inquiry/internal/network/b;", "i", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;Leu/b;)Ljava/lang/Object;", "oneTimeLinkCode", "Lcom/withpersona/sdk2/inquiry/internal/network/d;", "k", "(Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "relaySessionToken", "Lcom/withpersona/sdk2/inquiry/internal/network/g;", "m", "sessionToken", "Lhr/g;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/network/i;", "r", "(Ljava/lang/String;Lhr/g;Leu/b;)Ljava/lang/Object;", "Lmo/c;", "metrics", "s", "(Ljava/lang/String;Lmo/c;Leu/b;)Ljava/lang/Object;", "fromStep", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/network/h;", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhr/g;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;", "inquirySessionData", BuildConfig.FLAVOR, "q", "(Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;)V", "Lcom/withpersona/sdk2/inquiry/internal/network/j;", "u", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "t", "Lkotlin/Function1;", "Leu/b;", "Lsw/x;", "Lmv/i0;", "inquiryCall", "l", "(Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;", "o", "n", "(Ljava/lang/String;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "checkInquiryResponse", "j", "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;)Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "a", "Landroid/content/Context;", "b", "Lup/w;", "c", "Lup/y;", "d", "Lrp/i;", "e", "Lkq/c;", "f", "Lmo/a;", "g", "Lsp/a;", "Z", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public final rp.i fallbackModeManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kq.c sandboxFlags;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mo.a deviceIdProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sp.a playIntegrityHelper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final boolean redactAppIdentifyingInformation;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {Barcode.FORMAT_EAN_8, 80}, m = "createInquiry")
    public static final class a extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10778t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f10779u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f10781w;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10779u = obj;
            this.f10781w |= Integer.MIN_VALUE;
            return e.this.h(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {138}, m = "createInquirySession")
    public static final class b extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10782t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f10783u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f10784v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f10785w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f10787y;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10785w = obj;
            this.f10787y |= Integer.MIN_VALUE;
            return e.this.i(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {162}, m = "exchangeOneTimeLinkCode")
    public static final class c extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10788t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f10789u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f10791w;

        public c(eu.b<? super c> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10789u = obj;
            this.f10791w |= Integer.MIN_VALUE;
            return e.this.k(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {397}, m = "makeInquiryCallWithRetry")
    public static final class d extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10792t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f10793u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f10794v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f10796x;

        public d(eu.b<? super d> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10794v = obj;
            this.f10796x |= Integer.MIN_VALUE;
            return e.this.l(null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "attempt", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$makeInquiryCallWithRetry$2", f = "InquiryApiHelper.kt", l = {399, 403}, m = "invokeSuspend")
    public static final class C0187e extends gu.m implements Function2<Integer, eu.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10797t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ int f10798u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1<eu.b<? super x<i0>>, Object> f10799v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ c0<InternalErrorInfo> f10800w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0187e(Function1<? super eu.b<? super x<i0>>, ? extends Object> function1, c0<InternalErrorInfo> c0Var, eu.b<? super C0187e> bVar) {
            super(2, bVar);
            this.f10799v = function1;
            this.f10800w = c0Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            C0187e c0187e = new C0187e(this.f10799v, this.f10800w, bVar);
            c0187e.f10798u = ((Number) obj).intValue();
            return c0187e;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, eu.b<? super Boolean> bVar) {
            return m(num.intValue(), bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        
            if (r13 == r1) goto L20;
         */
        /* JADX WARN: Type inference failed for: r13v11, types: [T, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo] */
        /* JADX WARN: Type inference failed for: r5v0, types: [T, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo] */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i10 = this.f10798u;
            Object objE = fu.c.e();
            int i11 = this.f10797t;
            try {
                if (i11 == 0) {
                    zt.o.b(obj);
                    if (i10 > 0) {
                        this.f10798u = i10;
                        this.f10797t = 1;
                        if (z0.b(1000L, this) != objE) {
                        }
                    }
                    return objE;
                }
                if (i11 == 1) {
                    zt.o.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                x xVar = (x) obj;
                if (xVar.g()) {
                    this.f10800w.f21575a = null;
                    return gu.b.a(false);
                }
                ?? errorInfo = NetworkUtilsKt.toErrorInfo(xVar);
                this.f10800w.f21575a = errorInfo;
                return gu.b.a(errorInfo.isRecoverable());
                Function1<eu.b<? super x<i0>>, Object> function1 = this.f10799v;
                this.f10798u = i10;
                this.f10797t = 2;
                obj = function1.invoke(this);
            } catch (IOException e10) {
                this.f10800w.f21575a = new InternalErrorInfo.NetworkErrorInfo(0, e10.getMessage(), true, null, 8, null);
                return gu.b.a(true);
            }
        }

        public final Object m(int i10, eu.b<? super Boolean> bVar) {
            return ((C0187e) create(Integer.valueOf(i10), bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {211}, m = "redeemRelaySession")
    public static final class f extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10801t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f10802u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f10804w;

        public f(eu.b<? super f> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10802u = obj;
            this.f10804w |= Integer.MIN_VALUE;
            return e.this.m(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {465}, m = "runFallbackTransitionBack")
    public static final class g extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10805t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f10806u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f10807v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f10809x;

        public g(eu.b<? super g> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10807v = obj;
            this.f10809x |= Integer.MIN_VALUE;
            return e.this.n(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {435}, m = "runTransitionBack")
    public static final class h extends gu.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10810t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f10811u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f10812v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f10813w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f10814x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f10815y;

        public h(eu.b<? super h> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10815y = obj;
            this.A |= Integer.MIN_VALUE;
            return e.this.o(null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {243, 251}, m = "updateInquiry")
    public static final class i extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10817t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f10818u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f10819v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f10820w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f10822y;

        public i(eu.b<? super i> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10820w = obj;
            this.f10822y |= Integer.MIN_VALUE;
            return e.this.r(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {269}, m = "updateInquiryDeviceMetrics")
    public static final class j extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10823t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f10824u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f10825v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f10827x;

        public j(eu.b<? super j> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10825v = obj;
            this.f10827x |= Integer.MIN_VALUE;
            return e.this.s(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", "Lmv/i0;", "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$updateInquiryDeviceMetrics$updateInquiryError$1", f = "InquiryApiHelper.kt", l = {270}, m = "invokeSuspend")
    public static final class k extends gu.m implements Function1<eu.b<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10828t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f10830v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ DeviceMetrics f10831w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, DeviceMetrics deviceMetrics, eu.b<? super k> bVar) {
            super(1, bVar);
            this.f10830v = str;
            this.f10831w = deviceMetrics;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return e.this.new k(this.f10830v, this.f10831w, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f10828t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            w wVar = e.this.service;
            String str = this.f10830v;
            UpdateInquirySessionRequest.Companion companion = UpdateInquirySessionRequest.INSTANCE;
            Long timeSinceBootMs = this.f10831w.getTimeSinceBootMs();
            Long totalMemoryBytes = this.f10831w.getTotalMemoryBytes();
            Long availableStorageBytes = this.f10831w.getAvailableStorageBytes();
            mo.n phoneCallStatus = this.f10831w.getPhoneCallStatus();
            UpdateInquirySessionRequest updateInquirySessionRequestA = companion.a(timeSinceBootMs, totalMemoryBytes, availableStorageBytes, phoneCallStatus != null ? phoneCallStatus.getSerializedValue() : null);
            this.f10828t = 1;
            Object objE2 = wVar.e(str, updateInquirySessionRequestA, this);
            return objE2 == objE ? objE : objE2;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super x<i0>> bVar) {
            return ((k) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {362, 367, 373}, m = "updateInquiryInternal")
    public static final class l extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10832t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f10833u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f10834v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f10835w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f10836x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f10838z;

        public l(eu.b<? super l> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10836x = obj;
            this.f10838z |= Integer.MIN_VALUE;
            return e.this.t(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", "Lmv/i0;", "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$updateInquiryInternal$updateInquiryError$1", f = "InquiryApiHelper.kt", l = {374}, m = "invokeSuspend")
    public static final class m extends gu.m implements Function1<eu.b<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10839t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f10841v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ GpsData f10842w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ThreatEventState f10843x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, GpsData gpsData, ThreatEventState threatEventState, eu.b<? super m> bVar) {
            super(1, bVar);
            this.f10841v = str;
            this.f10842w = gpsData;
            this.f10843x = threatEventState;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return e.this.new m(this.f10841v, this.f10842w, this.f10843x, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Map<String, ThreatEventState.EventMetadata> mapB;
            hr.c precision;
            Location location;
            Location location2;
            Object objE = fu.c.e();
            int i10 = this.f10839t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            w wVar = e.this.service;
            String str = this.f10841v;
            UpdateInquirySessionRequest.Companion companion = UpdateInquirySessionRequest.INSTANCE;
            GpsData gpsData = this.f10842w;
            ArrayList arrayList = null;
            Double dB = (gpsData == null || (location2 = gpsData.getLocation()) == null) ? null : gu.b.b(location2.getLatitude());
            GpsData gpsData2 = this.f10842w;
            Double dB2 = (gpsData2 == null || (location = gpsData2.getLocation()) == null) ? null : gu.b.b(location.getLongitude());
            GpsData gpsData3 = this.f10842w;
            String strA = (gpsData3 == null || (precision = gpsData3.getPrecision()) == null) ? null : hr.d.a(precision);
            ThreatEventState threatEventState = this.f10843x;
            if (threatEventState != null && (mapB = threatEventState.b()) != null) {
                arrayList = new ArrayList(mapB.size());
                for (Map.Entry<String, ThreatEventState.EventMetadata> entry : mapB.entrySet()) {
                    String key = entry.getKey();
                    String timestamp = entry.getValue().getTimestamp();
                    String str2 = BuildConfig.FLAVOR;
                    if (timestamp == null) {
                        timestamp = BuildConfig.FLAVOR;
                    }
                    String reasonData = entry.getValue().getReasonData();
                    if (reasonData != null) {
                        str2 = reasonData;
                    }
                    arrayList.add(new UpdateInquirySessionRequest.AppdomeThreatEvent(key, timestamp, str2));
                }
            }
            UpdateInquirySessionRequest updateInquirySessionRequestD = companion.d(dB2, dB, strA, arrayList);
            this.f10839t = 1;
            Object objE2 = wVar.e(str, updateInquirySessionRequestD, this);
            return objE2 == objE ? objE : objE2;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super x<i0>> bVar) {
            return ((m) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", f = "InquiryApiHelper.kt", l = {332, 335, 349}, m = "verifyDeviceIntegrity")
    public static final class n extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10844t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f10845u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f10846v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f10847w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f10848x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f10850z;

        public n(eu.b<? super n> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f10848x = obj;
            this.f10850z |= Integer.MIN_VALUE;
            return e.this.u(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", "Lmv/i0;", "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$verifyDeviceIntegrity$verifyDeviceIntegrityError$1", f = "InquiryApiHelper.kt", l = {336}, m = "invokeSuspend")
    public static final class o extends gu.m implements Function1<eu.b<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10851t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f10853v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f10854w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, String str2, eu.b<? super o> bVar) {
            super(1, bVar);
            this.f10853v = str;
            this.f10854w = str2;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return e.this.new o(this.f10853v, this.f10854w, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f10851t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            w wVar = e.this.service;
            String str = this.f10853v;
            VerifyDeviceIntegrityRequest verifyDeviceIntegrityRequest = new VerifyDeviceIntegrityRequest(new VerifyDeviceIntegrityRequest.Meta(e.this.applicationContext.getPackageName(), this.f10854w));
            this.f10851t = 1;
            Object objA = wVar.a(str, verifyDeviceIntegrityRequest, this);
            return objA == objE ? objE : objA;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super x<i0>> bVar) {
            return ((o) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public e(@NotNull Context applicationContext, @NotNull w service, @NotNull y relayService, @NotNull rp.i fallbackModeManager, @NotNull kq.c sandboxFlags, @NotNull mo.a deviceIdProvider, @NotNull sp.a playIntegrityHelper, boolean z10) {
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
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(@NotNull InquiryAttributes inquiryAttributes, @NotNull eu.b<? super com.withpersona.sdk2.inquiry.internal.network.a> bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f10781w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f10781w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object objC = aVar.f10779u;
        Object objE = fu.c.e();
        int i11 = aVar.f10781w;
        try {
            if (i11 == 0) {
                zt.o.b(objC);
                if (inquiryAttributes.getTemplateId() != null && !p001kotlin.text.x.T(inquiryAttributes.getTemplateId(), "itmpl_", false, 2, null)) {
                    return new com.withpersona.sdk2.inquiry.internal.network.a.Error("The SDK needs a template ID that starts with `itmpl_`. If your template ID starts with `tmpl_`, you should use version v1.x of the Persona Android SDK. https://docs.withpersona.com/docs/mobile-sdks-v1", new InternalErrorInfo.IntegrationErrorInfo("Invalid template format: " + inquiryAttributes.getTemplateId()));
                }
                if (this.fallbackModeManager.b()) {
                    this.sandboxFlags.e(inquiryAttributes.getEnvironment() == np.h.SANDBOX);
                    rp.i iVar = this.fallbackModeManager;
                    aVar.f10778t = gu.l.a(inquiryAttributes);
                    aVar.f10781w = 1;
                    objC = iVar.c(inquiryAttributes, aVar);
                } else {
                    w wVar = this.service;
                    CreateInquiryRequest createInquiryRequestA = CreateInquiryRequest.INSTANCE.a(inquiryAttributes.getTemplateId(), inquiryAttributes.getTemplateVersion(), up.b.a(inquiryAttributes.getEnvironment()), inquiryAttributes.getEnvironmentId(), inquiryAttributes.getAccountId(), inquiryAttributes.getReferenceId(), inquiryAttributes.d(), inquiryAttributes.getThemeSetId(), inquiryAttributes.getRedirectUri());
                    String str = this.fallbackModeManager.getFallbackMode() == FallbackMode.DEFER ? "defer" : null;
                    aVar.f10778t = gu.l.a(inquiryAttributes);
                    aVar.f10781w = 2;
                    objC = wVar.c(createInquiryRequestA, str, aVar);
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(objC);
                x xVar = (x) objC;
                if (!xVar.g()) {
                    InternalErrorInfo.NetworkErrorInfo errorInfo = NetworkUtilsKt.toErrorInfo(xVar);
                    return new com.withpersona.sdk2.inquiry.internal.network.a.Error(errorInfo.getMessage(), errorInfo);
                }
                Object objA = xVar.a();
                Intrinsics.checkNotNull(objA);
                CheckInquiryResponse checkInquiryResponse = (CheckInquiryResponse) objA;
                return new com.withpersona.sdk2.inquiry.internal.network.a.Success(checkInquiryResponse.getData().getId(), checkInquiryResponse.getData().getAttributes().getNextStep(), checkInquiryResponse.getToken(), j(checkInquiryResponse), checkInquiryResponse.getData().getAttributes().getRedirectUri());
            }
            zt.o.b(objC);
            InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) objC;
            if (networkErrorInfo != null) {
                return new com.withpersona.sdk2.inquiry.internal.network.a.Error(networkErrorInfo.getMessage(), networkErrorInfo);
            }
            com.withpersona.sdk2.inquiry.internal.fallbackmode.i currentSession = this.fallbackModeManager.getCurrentSession();
            if (currentSession == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String strE = currentSession.getInquiryId();
            NextStep nextStepC = currentSession.c();
            if (nextStepC != null) {
                return new com.withpersona.sdk2.inquiry.internal.network.a.Success(strE, nextStepC, null, null, null, 28, null);
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (SocketTimeoutException e10) {
            return new com.withpersona.sdk2.inquiry.internal.network.a.Error("There was a problem reaching the server.", NetworkUtilsKt.toSocketTimeoutErrorInfo(e10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object i(@NotNull String str, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper, @NotNull eu.b<? super com.withpersona.sdk2.inquiry.internal.network.b> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f10787y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f10787y = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objK = bVar2.f10785w;
        Object objE = fu.c.e();
        int i11 = bVar2.f10787y;
        if (i11 == 0) {
            zt.o.b(objK);
            com.withpersona.sdk2.inquiry.internal.fallbackmode.i currentSession = this.fallbackModeManager.getCurrentSession();
            if (currentSession != null) {
                return new com.withpersona.sdk2.inquiry.internal.network.b.Success(currentSession.getAuthorization(), InquirySessionConfig.INSTANCE.a(), null, 4, null);
            }
            if (inquirySessionDataWrapper != null) {
                q(inquirySessionDataWrapper.getInquirySessionData());
                return new com.withpersona.sdk2.inquiry.internal.network.b.Success("Bearer " + inquirySessionDataWrapper.getAccessToken(), up.c.a(inquirySessionDataWrapper.getInquirySessionData().getAttributes()), inquirySessionDataWrapper.getTrackingEventsUrl());
            }
            w wVar = this.service;
            CreateInquirySessionRequest createInquirySessionRequestA = CreateInquirySessionRequest.INSTANCE.a(str);
            String strB = this.deviceIdProvider.b();
            bVar2.f10782t = gu.l.a(str);
            bVar2.f10783u = gu.l.a(inquirySessionDataWrapper);
            bVar2.f10784v = gu.l.a(currentSession);
            bVar2.f10787y = 1;
            objK = wVar.k(createInquirySessionRequestA, strB, bVar2);
            if (objK == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(objK);
        }
        x xVar = (x) objK;
        if (!xVar.g()) {
            return new com.withpersona.sdk2.inquiry.internal.network.b.Error(NetworkUtilsKt.toErrorInfo(xVar));
        }
        String strA = xVar.f().a("persona-device-id");
        if (strA != null) {
            this.deviceIdProvider.a(strA);
        }
        Object objA = xVar.a();
        Intrinsics.checkNotNull(objA);
        CreateInquirySessionResponse createInquirySessionResponse = (CreateInquirySessionResponse) objA;
        q(createInquirySessionResponse.getData());
        return new com.withpersona.sdk2.inquiry.internal.network.b.Success("Bearer " + createInquirySessionResponse.getMeta().getAccessToken(), up.c.a(createInquirySessionResponse.getData().getAttributes()), createInquirySessionResponse.getMeta().getTrackingEventsUrl());
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
    public final Object k(@NotNull String str, @NotNull eu.b<? super com.withpersona.sdk2.inquiry.internal.network.d> bVar) {
        c cVar;
        Relationships relationships;
        Relationship inquiry;
        RelationshipData data;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f10791w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f10791w = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object objD = cVar.f10789u;
        Object objE = fu.c.e();
        int i11 = cVar.f10791w;
        if (i11 == 0) {
            zt.o.b(objD);
            w wVar = this.service;
            ExchangeOneTimeLinkCodeRequest exchangeOneTimeLinkCodeRequest = new ExchangeOneTimeLinkCodeRequest(new ExchangeOneTimeLinkCodeRequest.Data(new ExchangeOneTimeLinkCodeRequest.Attributes(str), null, 2, null));
            cVar.f10788t = str;
            cVar.f10791w = 1;
            objD = wVar.d(exchangeOneTimeLinkCodeRequest, cVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) cVar.f10788t;
            zt.o.b(objD);
        }
        x xVar = (x) objD;
        if (!xVar.g()) {
            return NetworkUtilsKt.toErrorInfo(xVar).getCode() == 404 ? new com.withpersona.sdk2.inquiry.internal.network.d.Error(new InternalErrorInfo.InvalidOneTimeLinkCode(str)) : new com.withpersona.sdk2.inquiry.internal.network.d.Error(NetworkUtilsKt.toErrorInfo(xVar));
        }
        String strA = xVar.f().a("persona-device-id");
        if (strA != null) {
            this.deviceIdProvider.a(strA);
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
        String str2 = "Bearer " + (meta != null ? meta.getAccessToken() : null);
        InquirySessionConfig inquirySessionConfigA = up.c.a(data2.getAttributes());
        ExchangeOneTimeLinkCodeResponse.Metadata meta2 = exchangeOneTimeLinkCodeResponse.getMeta();
        return new com.withpersona.sdk2.inquiry.internal.network.d.Success(id2, str2, inquirySessionConfigA, meta2 != null ? meta2.getTrackingEventsUrl() : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(Function1<? super eu.b<? super x<i0>>, ? extends Object> function1, eu.b<? super InternalErrorInfo> bVar) {
        d dVar;
        c0 c0Var;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f10796x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f10796x = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f10794v;
        Object objE = fu.c.e();
        int i11 = dVar.f10796x;
        if (i11 == 0) {
            zt.o.b(obj);
            c0 c0Var2 = new c0();
            C0187e c0187e = new C0187e(function1, c0Var2, null);
            dVar.f10792t = gu.l.a(function1);
            dVar.f10793u = c0Var2;
            dVar.f10796x = 1;
            if (b0.a(5, c0187e, dVar) == objE) {
                return objE;
            }
            c0Var = c0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (c0) dVar.f10793u;
            zt.o.b(obj);
        }
        return c0Var.f21575a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object m(@NotNull String str, @NotNull eu.b<? super com.withpersona.sdk2.inquiry.internal.network.g> bVar) {
        f fVar;
        CurrentRelaySessionResponse.Metadata meta;
        CurrentRelaySessionResponse.Data data;
        Relationships relationships;
        Relationship inquiry;
        RelationshipData data2;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.f10804w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f10804w = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object objA = fVar.f10802u;
        Object objE = fu.c.e();
        int i11 = fVar.f10804w;
        if (i11 == 0) {
            zt.o.b(objA);
            fVar.f10801t = gu.l.a(str);
            fVar.f10804w = 1;
            objA = this.relayService.a("Bearer " + str, fVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(objA);
        }
        x xVar = (x) objA;
        if (!xVar.g()) {
            return new com.withpersona.sdk2.inquiry.internal.network.g.Error(NetworkUtilsKt.toErrorInfo(xVar));
        }
        String strA = xVar.f().a("persona-device-id");
        if (strA != null) {
            this.deviceIdProvider.a(strA);
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
    public final Object n(String str, String str2, eu.b<? super com.withpersona.sdk2.inquiry.internal.network.h> bVar) {
        g gVar;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.f10809x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f10809x = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        Object objF = gVar.f10807v;
        Object objE = fu.c.e();
        int i11 = gVar.f10809x;
        try {
            if (i11 == 0) {
                zt.o.b(objF);
                rp.i iVar = this.fallbackModeManager;
                TransitionBackRequest transitionBackRequestA = TransitionBackRequest.INSTANCE.a(str2);
                gVar.f10805t = gu.l.a(str);
                gVar.f10806u = gu.l.a(str2);
                gVar.f10809x = 1;
                objF = iVar.f(str, transitionBackRequestA, gVar);
                if (objF == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(objF);
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
    public final Object o(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, String str4, eu.b<? super com.withpersona.sdk2.inquiry.internal.network.h> bVar) {
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
        Object objH = hVar.f10815y;
        Object objE = fu.c.e();
        int i11 = hVar.A;
        try {
            if (i11 == 0) {
                zt.o.b(objH);
                w wVar = this.service;
                TransitionBackRequest transitionBackRequestA = TransitionBackRequest.INSTANCE.a(str3);
                hVar.f10810t = str;
                hVar.f10811u = gu.l.a(str2);
                hVar.f10812v = gu.l.a(str3);
                hVar.f10813w = inquirySessionConfig;
                hVar.f10814x = str4;
                hVar.A = 1;
                objH = wVar.h(str, str2, transitionBackRequestA, hVar);
                if (objH == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (String) hVar.f10814x;
                inquirySessionConfig = (InquirySessionConfig) hVar.f10813w;
                str = (String) hVar.f10810t;
                zt.o.b(objH);
            }
            x xVar = (x) objH;
            if (!xVar.g()) {
                return new com.withpersona.sdk2.inquiry.internal.network.h.Error(NetworkUtilsKt.toErrorInfo(xVar));
            }
            Object objA = xVar.a();
            Intrinsics.checkNotNull(objA);
            return new com.withpersona.sdk2.inquiry.internal.network.h.Success(up.a.w((CheckInquiryResponse) objA, str, inquirySessionConfig, str4));
        } catch (SocketTimeoutException e10) {
            return new com.withpersona.sdk2.inquiry.internal.network.h.Error(NetworkUtilsKt.toSocketTimeoutErrorInfo(e10));
        }
    }

    @Nullable
    public final Object p(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str4, @NotNull eu.b<? super com.withpersona.sdk2.inquiry.internal.network.h> bVar) {
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
    public final Object r(@NotNull String str, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull eu.b<? super com.withpersona.sdk2.inquiry.internal.network.i> bVar) {
        i iVar;
        InquirySessionConfig inquirySessionConfig2;
        if (bVar instanceof i) {
            iVar = (i) bVar;
            int i10 = iVar.f10822y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f10822y = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(bVar);
            }
        } else {
            iVar = new i(bVar);
        }
        Object objU = iVar.f10820w;
        Object objE = fu.c.e();
        int i11 = iVar.f10822y;
        if (i11 == 0) {
            zt.o.b(objU);
            iVar.f10817t = str;
            iVar.f10818u = inquirySessionConfig;
            iVar.f10822y = 1;
            objU = u(str, inquirySessionConfig, iVar);
            if (objU != objE) {
            }
            return objE;
        }
        if (i11 == 1) {
            inquirySessionConfig = (InquirySessionConfig) iVar.f10818u;
            str = (String) iVar.f10817t;
            zt.o.b(objU);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inquirySessionConfig2 = (InquirySessionConfig) iVar.f10818u;
            zt.o.b(objU);
        }
        InternalErrorInfo internalErrorInfo = (InternalErrorInfo) objU;
        return (internalErrorInfo == null && inquirySessionConfig2.k()) ? new com.withpersona.sdk2.inquiry.internal.network.i.Error(internalErrorInfo) : com.withpersona.sdk2.inquiry.internal.network.i.b.f10865a;
        com.withpersona.sdk2.inquiry.internal.network.j jVar = (com.withpersona.sdk2.inquiry.internal.network.j) objU;
        if (jVar instanceof com.withpersona.sdk2.inquiry.internal.network.j.Error) {
            return new com.withpersona.sdk2.inquiry.internal.network.i.Error(((com.withpersona.sdk2.inquiry.internal.network.j.Error) jVar).getCause());
        }
        iVar.f10817t = gu.l.a(str);
        iVar.f10818u = inquirySessionConfig;
        iVar.f10819v = gu.l.a(jVar);
        iVar.f10822y = 2;
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
    public final Object s(@NotNull String str, @NotNull DeviceMetrics deviceMetrics, @NotNull eu.b<? super com.withpersona.sdk2.inquiry.internal.network.i> bVar) {
        j jVar;
        if (bVar instanceof j) {
            jVar = (j) bVar;
            int i10 = jVar.f10827x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f10827x = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(bVar);
            }
        } else {
            jVar = new j(bVar);
        }
        Object objL = jVar.f10825v;
        Object objE = fu.c.e();
        int i11 = jVar.f10827x;
        if (i11 == 0) {
            zt.o.b(objL);
            Function1<? super eu.b<? super x<i0>>, ? extends Object> kVar = new k(str, deviceMetrics, null);
            jVar.f10823t = gu.l.a(str);
            jVar.f10824u = gu.l.a(deviceMetrics);
            jVar.f10827x = 1;
            objL = l(kVar, jVar);
            if (objL == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(objL);
        }
        InternalErrorInfo internalErrorInfo = (InternalErrorInfo) objL;
        return internalErrorInfo == null ? com.withpersona.sdk2.inquiry.internal.network.i.b.f10865a : new com.withpersona.sdk2.inquiry.internal.network.i.Error(internalErrorInfo);
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
    */
    public final Object t(String str, InquirySessionConfig inquirySessionConfig, eu.b<? super InternalErrorInfo> bVar) {
        l lVar;
        String str2;
        InquirySessionConfig inquirySessionConfig2;
        GpsData gpsData;
        Object obj;
        dv.h<ThreatEventState> hVarB;
        InquirySessionConfig inquirySessionConfig3;
        GpsData gpsData2;
        ThreatEventState threatEventState;
        Object objV;
        InquirySessionConfig inquirySessionConfig4;
        String str3;
        GpsData gpsData3;
        Map<String, ThreatEventState.EventMetadata> mapB;
        if (bVar instanceof l) {
            lVar = (l) bVar;
            int i10 = lVar.f10838z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f10838z = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(bVar);
            }
        } else {
            lVar = new l(bVar);
        }
        l lVar2 = lVar;
        Object objL = lVar2.f10836x;
        Object objE = fu.c.e();
        int i11 = lVar2.f10838z;
        if (i11 != 0) {
            if (i11 == 1) {
                InquirySessionConfig inquirySessionConfig5 = (InquirySessionConfig) lVar2.f10833u;
                String str4 = (String) lVar2.f10832t;
                zt.o.b(objL);
                obj = objL;
                inquirySessionConfig2 = inquirySessionConfig5;
                str2 = str4;
            } else if (i11 == 2) {
                gpsData3 = (GpsData) lVar2.f10834v;
                inquirySessionConfig4 = (InquirySessionConfig) lVar2.f10833u;
                str3 = (String) lVar2.f10832t;
                zt.o.b(objL);
                inquirySessionConfig3 = inquirySessionConfig4;
                gpsData2 = gpsData3;
                str2 = str3;
                threatEventState = (ThreatEventState) objL;
                if (gpsData2 == null) {
                    if (threatEventState != null) {
                        mapB = threatEventState.b();
                    } else {
                        mapB = null;
                    }
                    if (mapB != null || mapB.isEmpty()) {
                        return null;
                    }
                }
                Function1<? super eu.b<? super x<i0>>, ? extends Object> mVar = new m(str2, gpsData2, threatEventState, null);
                lVar2.f10832t = gu.l.a(str2);
                lVar2.f10833u = gu.l.a(inquirySessionConfig3);
                lVar2.f10834v = gu.l.a(gpsData2);
                lVar2.f10835w = gu.l.a(threatEventState);
                lVar2.f10838z = 3;
                objL = l(mVar, lVar2);
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(objL);
            }
            return (InternalErrorInfo) objL;
        }
        zt.o.b(objL);
        if (inquirySessionConfig.getGpsCollectionRequirement() != hr.a.NONE) {
            Context context = this.applicationContext;
            lVar2.f10832t = str;
            lVar2.f10833u = gu.l.a(inquirySessionConfig);
            lVar2.f10838z = 1;
            Object objA = hr.f.a(context, lVar2);
            if (objA != objE) {
                str2 = str;
                obj = objA;
                inquirySessionConfig2 = inquirySessionConfig;
            }
        } else {
            str2 = str;
            inquirySessionConfig2 = inquirySessionConfig;
            gpsData = null;
            hVarB = lo.c.b();
            if (hVarB != null) {
                lVar2.f10832t = str2;
                lVar2.f10833u = gu.l.a(inquirySessionConfig2);
                lVar2.f10834v = gpsData;
                lVar2.f10838z = 2;
                objV = dv.j.v(hVarB, lVar2);
                if (objV != objE) {
                    inquirySessionConfig4 = inquirySessionConfig2;
                    objL = objV;
                    GpsData gpsData4 = gpsData;
                    str3 = str2;
                    gpsData3 = gpsData4;
                    inquirySessionConfig3 = inquirySessionConfig4;
                    gpsData2 = gpsData3;
                    str2 = str3;
                    threatEventState = (ThreatEventState) objL;
                    if (gpsData2 == null) {
                        if (threatEventState != null) {
                            mapB = threatEventState.b();
                        } else {
                            mapB = null;
                        }
                        if (mapB != null) {
                        }
                        return null;
                    }
                    Function1<? super eu.b<? super x<i0>>, ? extends Object> mVar2 = new m(str2, gpsData2, threatEventState, null);
                    lVar2.f10832t = gu.l.a(str2);
                    lVar2.f10833u = gu.l.a(inquirySessionConfig3);
                    lVar2.f10834v = gu.l.a(gpsData2);
                    lVar2.f10835w = gu.l.a(threatEventState);
                    lVar2.f10838z = 3;
                    objL = l(mVar2, lVar2);
                }
            } else {
                inquirySessionConfig3 = inquirySessionConfig2;
                gpsData2 = gpsData;
                threatEventState = null;
                if (gpsData2 == null) {
                    if (threatEventState != null) {
                        mapB = threatEventState.b();
                    } else {
                        mapB = null;
                    }
                    if (mapB != null) {
                    }
                    return null;
                }
                Function1<? super eu.b<? super x<i0>>, ? extends Object> mVar3 = new m(str2, gpsData2, threatEventState, null);
                lVar2.f10832t = gu.l.a(str2);
                lVar2.f10833u = gu.l.a(inquirySessionConfig3);
                lVar2.f10834v = gu.l.a(gpsData2);
                lVar2.f10835w = gu.l.a(threatEventState);
                lVar2.f10838z = 3;
                objL = l(mVar3, lVar2);
            }
        }
        return objE;
        gpsData = (GpsData) obj;
        hVarB = lo.c.b();
        if (hVarB != null) {
            lVar2.f10832t = str2;
            lVar2.f10833u = gu.l.a(inquirySessionConfig2);
            lVar2.f10834v = gpsData;
            lVar2.f10838z = 2;
            objV = dv.j.v(hVarB, lVar2);
            if (objV != objE) {
                inquirySessionConfig4 = inquirySessionConfig2;
                objL = objV;
                GpsData gpsData5 = gpsData;
                str3 = str2;
                gpsData3 = gpsData5;
                inquirySessionConfig3 = inquirySessionConfig4;
                gpsData2 = gpsData3;
                str2 = str3;
                threatEventState = (ThreatEventState) objL;
                if (gpsData2 == null) {
                    if (threatEventState != null) {
                        mapB = threatEventState.b();
                    } else {
                        mapB = null;
                    }
                    if (mapB != null) {
                    }
                    return null;
                }
                Function1<? super eu.b<? super x<i0>>, ? extends Object> mVar4 = new m(str2, gpsData2, threatEventState, null);
                lVar2.f10832t = gu.l.a(str2);
                lVar2.f10833u = gu.l.a(inquirySessionConfig3);
                lVar2.f10834v = gu.l.a(gpsData2);
                lVar2.f10835w = gu.l.a(threatEventState);
                lVar2.f10838z = 3;
                objL = l(mVar4, lVar2);
            }
        } else {
            inquirySessionConfig3 = inquirySessionConfig2;
            gpsData2 = gpsData;
            threatEventState = null;
            if (gpsData2 == null) {
                if (threatEventState != null) {
                    mapB = threatEventState.b();
                } else {
                    mapB = null;
                }
                if (mapB != null) {
                }
                return null;
            }
            Function1<? super eu.b<? super x<i0>>, ? extends Object> mVar5 = new m(str2, gpsData2, threatEventState, null);
            lVar2.f10832t = gu.l.a(str2);
            lVar2.f10833u = gu.l.a(inquirySessionConfig3);
            lVar2.f10834v = gu.l.a(gpsData2);
            lVar2.f10835w = gu.l.a(threatEventState);
            lVar2.f10838z = 3;
            objL = l(mVar5, lVar2);
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00db, code lost:
    
        if (r4.i(r0) == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(String str, InquirySessionConfig inquirySessionConfig, eu.b<? super com.withpersona.sdk2.inquiry.internal.network.j> bVar) {
        n nVar;
        String str2;
        String str3;
        InternalErrorInfo internalErrorInfo;
        if (bVar instanceof n) {
            nVar = (n) bVar;
            int i10 = nVar.f10850z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f10850z = i10 - Integer.MIN_VALUE;
            } else {
                nVar = new n(bVar);
            }
        } else {
            nVar = new n(bVar);
        }
        Object objG = nVar.f10848x;
        Object objE = fu.c.e();
        int i11 = nVar.f10850z;
        if (i11 == 0) {
            zt.o.b(objG);
            if (!this.redactAppIdentifyingInformation && inquirySessionConfig.getUsePlayIntegrity()) {
                sp.a aVar = this.playIntegrityHelper;
                nVar.f10844t = str;
                nVar.f10845u = gu.l.a(inquirySessionConfig);
                nVar.f10850z = 1;
                objG = aVar.g(nVar);
                if (objG != objE) {
                }
                return objE;
            }
            return com.withpersona.sdk2.inquiry.internal.network.j.b.f10867a;
        }
        if (i11 == 1) {
            inquirySessionConfig = (InquirySessionConfig) nVar.f10845u;
            str = (String) nVar.f10844t;
            zt.o.b(objG);
        } else if (i11 == 2) {
            str3 = (String) nVar.f10846v;
            inquirySessionConfig = (InquirySessionConfig) nVar.f10845u;
            str2 = (String) nVar.f10844t;
            zt.o.b(objG);
            internalErrorInfo = (InternalErrorInfo) objG;
            if (internalErrorInfo == null) {
                return new com.withpersona.sdk2.inquiry.internal.network.j.Error(internalErrorInfo);
            }
            sp.a aVar2 = this.playIntegrityHelper;
            nVar.f10844t = gu.l.a(str2);
            nVar.f10845u = gu.l.a(inquirySessionConfig);
            nVar.f10846v = gu.l.a(str3);
            nVar.f10847w = gu.l.a(internalErrorInfo);
            nVar.f10850z = 3;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(objG);
        }
        return com.withpersona.sdk2.inquiry.internal.network.j.b.f10867a;
        String str4 = (String) objG;
        if (str4 == null) {
            return com.withpersona.sdk2.inquiry.internal.network.j.b.f10867a;
        }
        Function1<? super eu.b<? super x<i0>>, ? extends Object> oVar = new o(str, str4, null);
        nVar.f10844t = gu.l.a(str);
        nVar.f10845u = gu.l.a(inquirySessionConfig);
        nVar.f10846v = gu.l.a(str4);
        nVar.f10850z = 2;
        Object objL = l(oVar, nVar);
        if (objL != objE) {
            str2 = str;
            str3 = str4;
            objG = objL;
            internalErrorInfo = (InternalErrorInfo) objG;
            if (internalErrorInfo == null) {
                return new com.withpersona.sdk2.inquiry.internal.network.j.Error(internalErrorInfo);
            }
            sp.a aVar3 = this.playIntegrityHelper;
            nVar.f10844t = gu.l.a(str2);
            nVar.f10845u = gu.l.a(inquirySessionConfig);
            nVar.f10846v = gu.l.a(str3);
            nVar.f10847w = gu.l.a(internalErrorInfo);
            nVar.f10850z = 3;
        }
        return objE;
    }
}
