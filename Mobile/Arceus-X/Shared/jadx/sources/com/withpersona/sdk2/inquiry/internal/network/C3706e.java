package com.withpersona.sdk2.inquiry.internal.network;

import android.content.Context;
import android.location.Location;
import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.C3686i;
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
import com.withpersona.sdk2.inquiry.shared.inquiry_session.C4012a;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsCollectionRequirement;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import gp.C6181a;
import gp.C6182b;
import gp.C6183c;
import gp.InquiryAttributes;
import gp.InterfaceC6203w;
import gp.InterfaceC6205y;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import nu.C9579j;
import nu.InterfaceC9575h;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p082dp.C4655i;
import p111ep.C5174a;
import p226jq.C7250b0;
import p229jt.C7348o;
import p231jv.C7396x;
import p256ku.C7946z0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p450tq.C11740c;
import p450tq.EnumC11739b;
import p450tq.GpsData;
import p525wp.C12504c;
import p553xn.C12868c;
import p553xn.ThreatEventState;
import p582yn.DeviceMetrics;
import p582yn.EnumC13251n;
import p582yn.InterfaceC13234a;
import p610zo.EnumC13962h;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b&\u0010#J \u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0086@¢\u0006\u0004\b+\u0010,J \u0010/\u001a\u00020*2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010.\u001a\u00020-H\u0086@¢\u0006\u0004\b/\u00100J:\u00104\u001a\u0002032\u0006\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\u00102\u001a\u0004\u0018\u00010\u0019H\u0080@¢\u0006\u0004\b4\u00105J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b9\u0010:J \u0010<\u001a\u00020;2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b<\u0010,J\"\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010'\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b>\u0010,J6\u0010D\u001a\u0004\u0018\u00010=2\"\u0010C\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0@\u0012\u0006\u0012\u0004\u0018\u00010\u00010?H\u0082@¢\u0006\u0004\bD\u0010EJ:\u0010F\u001a\u0002032\u0006\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u0010)\u001a\u00020(2\b\u00102\u001a\u0004\u0018\u00010\u0019H\u0082@¢\u0006\u0004\bF\u00105J \u0010G\u001a\u0002032\u0006\u0010'\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0019H\u0082@¢\u0006\u0004\bG\u0010HJ\u0019\u0010K\u001a\u0004\u0018\u00010\u001b2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010[¨\u0006\\"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/e;", "", "Landroid/content/Context;", "applicationContext", "Lgp/w;", NotificationCompat.CATEGORY_SERVICE, "Lgp/y;", "relayService", "Ldp/i;", "fallbackModeManager", "Lwp/c;", "sandboxFlags", "Lyn/a;", "deviceIdProvider", "Lep/a;", "playIntegrityHelper", "", "redactAppIdentifyingInformation", "<init>", "(Landroid/content/Context;Lgp/w;Lgp/y;Ldp/i;Lwp/c;Lyn/a;Lep/a;Z)V", "Lgp/e;", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/network/a;", "h", "(Lgp/e;Lnt/b;)Ljava/lang/Object;", "", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "inquirySessionDataWrapper", "Lcom/withpersona/sdk2/inquiry/internal/network/b;", "i", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;Lnt/b;)Ljava/lang/Object;", "oneTimeLinkCode", "Lcom/withpersona/sdk2/inquiry/internal/network/d;", "k", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "relaySessionToken", "Lcom/withpersona/sdk2/inquiry/internal/network/g;", "m", "sessionToken", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/network/i;", "r", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lnt/b;)Ljava/lang/Object;", "Lyn/c;", "metrics", "s", "(Ljava/lang/String;Lyn/c;Lnt/b;)Ljava/lang/Object;", "fromStep", "trackingEventsUrl", "Lcom/withpersona/sdk2/inquiry/internal/network/h;", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;", "inquirySessionData", "", "q", "(Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;)V", "Lcom/withpersona/sdk2/inquiry/internal/network/j;", "u", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "t", "Lkotlin/Function1;", "Lnt/b;", "Ljv/x;", "Lokhttp3/ResponseBody;", "inquiryCall", "l", "(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "o", "n", "(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "checkInquiryResponse", "j", "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;)Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionDataWrapper;", "a", "Landroid/content/Context;", "b", "Lgp/w;", "c", "Lgp/y;", "d", "Ldp/i;", "e", "Lwp/c;", "f", "Lyn/a;", "g", "Lep/a;", "Z", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3706e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6203w service;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6205y relayService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C4655i fallbackModeManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C12504c sandboxFlags;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC13234a deviceIdProvider;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C5174a playIntegrityHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final boolean redactAppIdentifyingInformation;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$a */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m39664f = "InquiryApiHelper.kt", m39665l = {64, 80}, m39666m = "createInquiry")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f15427t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f15428u;

        /* JADX INFO: renamed from: w */
        public int f15430w;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15428u = obj;
            this.f15430w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C3706e.this.m18735h(null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$b */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m39664f = "InquiryApiHelper.kt", m39665l = {138}, m39666m = "createInquirySession")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f15431t;

        /* JADX INFO: renamed from: u */
        public Object f15432u;

        /* JADX INFO: renamed from: v */
        public Object f15433v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f15434w;

        /* JADX INFO: renamed from: y */
        public int f15436y;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15434w = obj;
            this.f15436y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C3706e.this.m18736i(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$c */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m39664f = "InquiryApiHelper.kt", m39665l = {162}, m39666m = "exchangeOneTimeLinkCode")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f15437t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f15438u;

        /* JADX INFO: renamed from: w */
        public int f15440w;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15438u = obj;
            this.f15440w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C3706e.this.m18738k(null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$d */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m39664f = "InquiryApiHelper.kt", m39665l = {397}, m39666m = "makeInquiryCallWithRetry")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f15441t;

        /* JADX INFO: renamed from: u */
        public Object f15442u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f15443v;

        /* JADX INFO: renamed from: x */
        public int f15445x;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15443v = obj;
            this.f15445x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C3706e.this.m18739l(null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m31665d2 = {"<anonymous>", "", "attempt", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$makeInquiryCallWithRetry$2", m39664f = "InquiryApiHelper.kt", m39665l = {399, 403}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function2<Integer, InterfaceC9557b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15446t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ int f15447u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Function1<InterfaceC9557b<? super C7396x<ResponseBody>>, Object> f15448v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C7729c0<InternalErrorInfo> f15449w;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super nt.b<? super jv.x<okhttp3.ResponseBody>>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function1<? super InterfaceC9557b<? super C7396x<ResponseBody>>, ? extends Object> function1, C7729c0<InternalErrorInfo> c7729c0, InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f15448v = function1;
            this.f15449w = c7729c0;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            e eVar = new e(this.f15448v, this.f15449w, interfaceC9557b);
            eVar.f15447u = ((Number) obj).intValue();
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, InterfaceC9557b<? super Boolean> interfaceC9557b) {
            return m18749q(num.intValue(), interfaceC9557b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        
            if (r13 == r1) goto L20;
         */
        /* JADX WARN: Type inference failed for: r13v11, types: [T, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo] */
        /* JADX WARN: Type inference failed for: r5v0, types: [T, com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo] */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i10 = this.f15447u;
            Object objM38805e = C10047c.m38805e();
            int i11 = this.f15446t;
            try {
                if (i11 == 0) {
                    C7348o.m30470b(obj);
                    if (i10 > 0) {
                        this.f15447u = i10;
                        this.f15446t = 1;
                        if (C7946z0.m32938b(1000L, this) != objM38805e) {
                        }
                    }
                    return objM38805e;
                }
                if (i11 == 1) {
                    C7348o.m30470b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                C7396x c7396x = (C7396x) obj;
                if (c7396x.m30657g()) {
                    this.f15449w.f29425a = null;
                    return C10340b.m39658a(false);
                }
                ?? errorInfo = NetworkUtilsKt.toErrorInfo(c7396x);
                this.f15449w.f29425a = errorInfo;
                return C10340b.m39658a(errorInfo.isRecoverable());
                Function1<InterfaceC9557b<? super C7396x<ResponseBody>>, Object> function1 = this.f15448v;
                this.f15447u = i10;
                this.f15446t = 2;
                obj = function1.invoke(this);
            } catch (IOException e10) {
                this.f15449w.f29425a = new InternalErrorInfo.NetworkErrorInfo(0, e10.getMessage(), true, null, 8, null);
                return C10340b.m39658a(true);
            }
        }

        /* JADX INFO: renamed from: q */
        public final Object m18749q(int i10, InterfaceC9557b<? super Boolean> interfaceC9557b) {
            return ((e) create(Integer.valueOf(i10), interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$f */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m39664f = "InquiryApiHelper.kt", m39665l = {211}, m39666m = "redeemRelaySession")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class f extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f15450t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f15451u;

        /* JADX INFO: renamed from: w */
        public int f15453w;

        public f(InterfaceC9557b<? super f> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15451u = obj;
            this.f15453w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C3706e.this.m18740m(null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$g */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m39664f = "InquiryApiHelper.kt", m39665l = {465}, m39666m = "runFallbackTransitionBack")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class g extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f15454t;

        /* JADX INFO: renamed from: u */
        public Object f15455u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f15456v;

        /* JADX INFO: renamed from: x */
        public int f15458x;

        public g(InterfaceC9557b<? super g> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15456v = obj;
            this.f15458x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C3706e.this.m18741n(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$h */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m39664f = "InquiryApiHelper.kt", m39665l = {435}, m39666m = "runTransitionBack")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class h extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f15459A;

        /* JADX INFO: renamed from: t */
        public Object f15460t;

        /* JADX INFO: renamed from: u */
        public Object f15461u;

        /* JADX INFO: renamed from: v */
        public Object f15462v;

        /* JADX INFO: renamed from: w */
        public Object f15463w;

        /* JADX INFO: renamed from: x */
        public Object f15464x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f15465y;

        public h(InterfaceC9557b<? super h> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15465y = obj;
            this.f15459A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C3706e.this.m18742o(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$i */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m39664f = "InquiryApiHelper.kt", m39665l = {243, 251}, m39666m = "updateInquiry")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class i extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f15467t;

        /* JADX INFO: renamed from: u */
        public Object f15468u;

        /* JADX INFO: renamed from: v */
        public Object f15469v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f15470w;

        /* JADX INFO: renamed from: y */
        public int f15472y;

        public i(InterfaceC9557b<? super i> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15470w = obj;
            this.f15472y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C3706e.this.m18745r(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$j */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m39664f = "InquiryApiHelper.kt", m39665l = {269}, m39666m = "updateInquiryDeviceMetrics")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class j extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f15473t;

        /* JADX INFO: renamed from: u */
        public Object f15474u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f15475v;

        /* JADX INFO: renamed from: x */
        public int f15477x;

        public j(InterfaceC9557b<? super j> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15475v = obj;
            this.f15477x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C3706e.this.m18746s(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$k */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Ljv/x;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$updateInquiryDeviceMetrics$updateInquiryError$1", m39664f = "InquiryApiHelper.kt", m39665l = {270}, m39666m = "invokeSuspend")
    public static final class k extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<ResponseBody>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15478t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f15480v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ DeviceMetrics f15481w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, DeviceMetrics deviceMetrics, InterfaceC9557b<? super k> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f15480v = str;
            this.f15481w = deviceMetrics;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C3706e.this.new k(this.f15480v, this.f15481w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15478t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            InterfaceC6203w interfaceC6203w = C3706e.this.service;
            String str = this.f15480v;
            UpdateInquirySessionRequest.Companion companion = UpdateInquirySessionRequest.INSTANCE;
            Long timeSinceBootMs = this.f15481w.getTimeSinceBootMs();
            Long totalMemoryBytes = this.f15481w.getTotalMemoryBytes();
            Long availableStorageBytes = this.f15481w.getAvailableStorageBytes();
            EnumC13251n phoneCallStatus = this.f15481w.getPhoneCallStatus();
            UpdateInquirySessionRequest updateInquirySessionRequestM18694a = companion.m18694a(timeSinceBootMs, totalMemoryBytes, availableStorageBytes, phoneCallStatus != null ? phoneCallStatus.getSerializedValue() : null);
            this.f15478t = 1;
            Object objM27320i = interfaceC6203w.m27320i(str, updateInquirySessionRequestM18694a, this);
            return objM27320i == objM38805e ? objM38805e : objM27320i;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super C7396x<ResponseBody>> interfaceC9557b) {
            return ((k) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$l */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m39664f = "InquiryApiHelper.kt", m39665l = {362, 367, 373}, m39666m = "updateInquiryInternal")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class l extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f15482t;

        /* JADX INFO: renamed from: u */
        public Object f15483u;

        /* JADX INFO: renamed from: v */
        public Object f15484v;

        /* JADX INFO: renamed from: w */
        public Object f15485w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f15486x;

        /* JADX INFO: renamed from: z */
        public int f15488z;

        public l(InterfaceC9557b<? super l> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15486x = obj;
            this.f15488z |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C3706e.this.m18747t(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$m */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Ljv/x;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$updateInquiryInternal$updateInquiryError$1", m39664f = "InquiryApiHelper.kt", m39665l = {374}, m39666m = "invokeSuspend")
    public static final class m extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<ResponseBody>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15489t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f15491v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ GpsData f15492w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ ThreatEventState f15493x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, GpsData gpsData, ThreatEventState threatEventState, InterfaceC9557b<? super m> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f15491v = str;
            this.f15492w = gpsData;
            this.f15493x = threatEventState;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C3706e.this.new m(this.f15491v, this.f15492w, this.f15493x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Map<String, ThreatEventState.EventMetadata> mapM47889b;
            EnumC11739b precision;
            Location location;
            Location location2;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15489t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            InterfaceC6203w interfaceC6203w = C3706e.this.service;
            String str = this.f15491v;
            UpdateInquirySessionRequest.Companion companion = UpdateInquirySessionRequest.INSTANCE;
            GpsData gpsData = this.f15492w;
            ArrayList arrayList = null;
            Double dM39659b = (gpsData == null || (location2 = gpsData.getLocation()) == null) ? null : C10340b.m39659b(location2.getLatitude());
            GpsData gpsData2 = this.f15492w;
            Double dM39659b2 = (gpsData2 == null || (location = gpsData2.getLocation()) == null) ? null : C10340b.m39659b(location.getLongitude());
            GpsData gpsData3 = this.f15492w;
            String strM43957a = (gpsData3 == null || (precision = gpsData3.getPrecision()) == null) ? null : C11740c.m43957a(precision);
            ThreatEventState threatEventState = this.f15493x;
            if (threatEventState != null && (mapM47889b = threatEventState.m47889b()) != null) {
                arrayList = new ArrayList(mapM47889b.size());
                for (Map.Entry<String, ThreatEventState.EventMetadata> entry : mapM47889b.entrySet()) {
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
            UpdateInquirySessionRequest updateInquirySessionRequestM18696d = companion.m18696d(dM39659b2, dM39659b, strM43957a, arrayList);
            this.f15489t = 1;
            Object objM27320i = interfaceC6203w.m27320i(str, updateInquirySessionRequestM18696d, this);
            return objM27320i == objM38805e ? objM38805e : objM27320i;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super C7396x<ResponseBody>> interfaceC9557b) {
            return ((m) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$n */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper", m39664f = "InquiryApiHelper.kt", m39665l = {332, 335, 349}, m39666m = "verifyDeviceIntegrity")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class n extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f15494t;

        /* JADX INFO: renamed from: u */
        public Object f15495u;

        /* JADX INFO: renamed from: v */
        public Object f15496v;

        /* JADX INFO: renamed from: w */
        public Object f15497w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f15498x;

        /* JADX INFO: renamed from: z */
        public int f15500z;

        public n(InterfaceC9557b<? super n> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15498x = obj;
            this.f15500z |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C3706e.this.m18748u(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.e$o */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Ljv/x;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$verifyDeviceIntegrity$verifyDeviceIntegrityError$1", m39664f = "InquiryApiHelper.kt", m39665l = {336}, m39666m = "invokeSuspend")
    public static final class o extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<ResponseBody>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15501t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f15503v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ String f15504w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, String str2, InterfaceC9557b<? super o> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f15503v = str;
            this.f15504w = str2;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C3706e.this.new o(this.f15503v, this.f15504w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15501t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            InterfaceC6203w interfaceC6203w = C3706e.this.service;
            String str = this.f15503v;
            VerifyDeviceIntegrityRequest verifyDeviceIntegrityRequest = new VerifyDeviceIntegrityRequest(new VerifyDeviceIntegrityRequest.Meta(C3706e.this.applicationContext.getPackageName(), this.f15504w));
            this.f15501t = 1;
            Object objM27312a = interfaceC6203w.m27312a(str, verifyDeviceIntegrityRequest, this);
            return objM27312a == objM38805e ? objM38805e : objM27312a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super C7396x<ResponseBody>> interfaceC9557b) {
            return ((o) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C3706e(@NotNull Context applicationContext, @NotNull InterfaceC6203w service, @NotNull InterfaceC6205y relayService, @NotNull C4655i fallbackModeManager, @NotNull C12504c sandboxFlags, @NotNull InterfaceC13234a deviceIdProvider, @NotNull C5174a playIntegrityHelper, boolean z10) {
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
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m18735h(@NotNull InquiryAttributes inquiryAttributes, @NotNull InterfaceC9557b<? super AbstractC3702a> interfaceC9557b) {
        a aVar;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f15430w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f15430w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object objM27322k = aVar.f15428u;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f15430w;
        try {
            if (i11 == 0) {
                C7348o.m30470b(objM27322k);
                if (inquiryAttributes.getTemplateId() != null && !C7797x.m32309T(inquiryAttributes.getTemplateId(), "itmpl_", false, 2, null)) {
                    return new AbstractC3702a.Error("The SDK needs a template ID that starts with `itmpl_`. If your template ID starts with `tmpl_`, you should use version v1.x of the Persona Android SDK. https://docs.withpersona.com/docs/mobile-sdks-v1", new InternalErrorInfo.IntegrationErrorInfo("Invalid template format: " + inquiryAttributes.getTemplateId()));
                }
                if (this.fallbackModeManager.mo22892b()) {
                    this.sandboxFlags.m46824e(inquiryAttributes.getEnvironment() == EnumC13962h.SANDBOX);
                    C4655i c4655i = this.fallbackModeManager;
                    aVar.f15427t = C10350l.m39676a(inquiryAttributes);
                    aVar.f15430w = 1;
                    objM27322k = c4655i.m22893c(inquiryAttributes, aVar);
                } else {
                    InterfaceC6203w interfaceC6203w = this.service;
                    CreateInquiryRequest createInquiryRequestM18615a = CreateInquiryRequest.INSTANCE.m18615a(inquiryAttributes.getTemplateId(), inquiryAttributes.getTemplateVersion(), C6182b.m27245a(inquiryAttributes.getEnvironment()), inquiryAttributes.getEnvironmentId(), inquiryAttributes.getAccountId(), inquiryAttributes.getReferenceId(), inquiryAttributes.m27253d(), inquiryAttributes.getThemeSetId(), inquiryAttributes.getRedirectUri());
                    String str = this.fallbackModeManager.getFallbackMode() == FallbackMode.DEFER ? "defer" : null;
                    aVar.f15427t = C10350l.m39676a(inquiryAttributes);
                    aVar.f15430w = 2;
                    objM27322k = interfaceC6203w.m27322k(createInquiryRequestM18615a, str, aVar);
                }
                return objM38805e;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(objM27322k);
                C7396x c7396x = (C7396x) objM27322k;
                if (!c7396x.m30657g()) {
                    InternalErrorInfo.NetworkErrorInfo errorInfo = NetworkUtilsKt.toErrorInfo(c7396x);
                    return new AbstractC3702a.Error(errorInfo.getMessage(), errorInfo);
                }
                Object objM30653a = c7396x.m30653a();
                Intrinsics.checkNotNull(objM30653a);
                CheckInquiryResponse checkInquiryResponse = (CheckInquiryResponse) objM30653a;
                return new AbstractC3702a.Success(checkInquiryResponse.getData().getId(), checkInquiryResponse.getData().getAttributes().getNextStep(), checkInquiryResponse.getToken(), m18737j(checkInquiryResponse), checkInquiryResponse.getData().getAttributes().getRedirectUri());
            }
            C7348o.m30470b(objM27322k);
            InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) objM27322k;
            if (networkErrorInfo != null) {
                return new AbstractC3702a.Error(networkErrorInfo.getMessage(), networkErrorInfo);
            }
            C3686i currentSession = this.fallbackModeManager.getCurrentSession();
            if (currentSession == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String strM18509e = currentSession.getInquiryId();
            NextStep nextStepM18507c = currentSession.m18507c();
            if (nextStepM18507c != null) {
                return new AbstractC3702a.Success(strM18509e, nextStepM18507c, null, null, null, 28, null);
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (SocketTimeoutException e10) {
            return new AbstractC3702a.Error("There was a problem reaching the server.", NetworkUtilsKt.toSocketTimeoutErrorInfo(e10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m18736i(@NotNull String str, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper, @NotNull InterfaceC9557b<? super AbstractC3703b> interfaceC9557b) {
        b bVar;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f15436y;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f15436y = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object objM27318g = bVar.f15434w;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f15436y;
        if (i11 == 0) {
            C7348o.m30470b(objM27318g);
            C3686i currentSession = this.fallbackModeManager.getCurrentSession();
            if (currentSession != null) {
                return new AbstractC3703b.Success(currentSession.getAuthorization(), InquirySessionConfig.INSTANCE.m20427a(), null, 4, null);
            }
            if (inquirySessionDataWrapper != null) {
                m18744q(inquirySessionDataWrapper.getInquirySessionData());
                return new AbstractC3703b.Success("Bearer " + inquirySessionDataWrapper.getAccessToken(), C6183c.m27246a(inquirySessionDataWrapper.getInquirySessionData().getAttributes()), inquirySessionDataWrapper.getTrackingEventsUrl());
            }
            InterfaceC6203w interfaceC6203w = this.service;
            CreateInquirySessionRequest createInquirySessionRequestM18622a = CreateInquirySessionRequest.INSTANCE.m18622a(str);
            String strMo48949b = this.deviceIdProvider.mo48949b();
            bVar.f15431t = C10350l.m39676a(str);
            bVar.f15432u = C10350l.m39676a(inquirySessionDataWrapper);
            bVar.f15433v = C10350l.m39676a(currentSession);
            bVar.f15436y = 1;
            objM27318g = interfaceC6203w.m27318g(createInquirySessionRequestM18622a, strMo48949b, bVar);
            if (objM27318g == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM27318g);
        }
        C7396x c7396x = (C7396x) objM27318g;
        if (!c7396x.m30657g()) {
            return new AbstractC3703b.Error(NetworkUtilsKt.toErrorInfo(c7396x));
        }
        String str2 = c7396x.m30656f().get("persona-device-id");
        if (str2 != null) {
            this.deviceIdProvider.mo48948a(str2);
        }
        Object objM30653a = c7396x.m30653a();
        Intrinsics.checkNotNull(objM30653a);
        CreateInquirySessionResponse createInquirySessionResponse = (CreateInquirySessionResponse) objM30653a;
        m18744q(createInquirySessionResponse.getData());
        return new AbstractC3703b.Success("Bearer " + createInquirySessionResponse.getMeta().getAccessToken(), C6183c.m27246a(createInquirySessionResponse.getData().getAttributes()), createInquirySessionResponse.getMeta().getTrackingEventsUrl());
    }

    /* JADX INFO: renamed from: j */
    public final InquirySessionDataWrapper m18737j(CheckInquiryResponse checkInquiryResponse) {
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
    /* JADX INFO: renamed from: k */
    public final Object m18738k(@NotNull String str, @NotNull InterfaceC9557b<? super AbstractC3705d> interfaceC9557b) {
        c cVar;
        Relationships relationships;
        Relationship inquiry;
        RelationshipData data;
        if (interfaceC9557b instanceof c) {
            cVar = (c) interfaceC9557b;
            int i10 = cVar.f15440w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                cVar.f15440w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                cVar = new c(interfaceC9557b);
            }
        } else {
            cVar = new c(interfaceC9557b);
        }
        Object objM27313b = cVar.f15438u;
        Object objM38805e = C10047c.m38805e();
        int i11 = cVar.f15440w;
        if (i11 == 0) {
            C7348o.m30470b(objM27313b);
            InterfaceC6203w interfaceC6203w = this.service;
            ExchangeOneTimeLinkCodeRequest exchangeOneTimeLinkCodeRequest = new ExchangeOneTimeLinkCodeRequest(new ExchangeOneTimeLinkCodeRequest.Data(new ExchangeOneTimeLinkCodeRequest.Attributes(str), null, 2, null));
            cVar.f15437t = str;
            cVar.f15440w = 1;
            objM27313b = interfaceC6203w.m27313b(exchangeOneTimeLinkCodeRequest, cVar);
            if (objM27313b == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) cVar.f15437t;
            C7348o.m30470b(objM27313b);
        }
        C7396x c7396x = (C7396x) objM27313b;
        if (!c7396x.m30657g()) {
            return NetworkUtilsKt.toErrorInfo(c7396x).getCode() == 404 ? new AbstractC3705d.Error(new InternalErrorInfo.InvalidOneTimeLinkCode(str)) : new AbstractC3705d.Error(NetworkUtilsKt.toErrorInfo(c7396x));
        }
        String str2 = c7396x.m30656f().get("persona-device-id");
        if (str2 != null) {
            this.deviceIdProvider.mo48948a(str2);
        }
        Object objM30653a = c7396x.m30653a();
        Intrinsics.checkNotNull(objM30653a);
        ExchangeOneTimeLinkCodeResponse exchangeOneTimeLinkCodeResponse = (ExchangeOneTimeLinkCodeResponse) objM30653a;
        InquirySessionData data2 = exchangeOneTimeLinkCodeResponse.getData();
        String id2 = (data2 == null || (relationships = data2.getRelationships()) == null || (inquiry = relationships.getInquiry()) == null || (data = inquiry.getData()) == null) ? null : data.getId();
        if (data2 != null) {
            m18744q(data2);
        }
        if (id2 == null) {
            return new AbstractC3705d.Error(new InternalErrorInfo.UnknownErrorInfo("Error exchanging one-time-code."));
        }
        ExchangeOneTimeLinkCodeResponse.Metadata meta = exchangeOneTimeLinkCodeResponse.getMeta();
        String str3 = "Bearer " + (meta != null ? meta.getAccessToken() : null);
        InquirySessionConfig inquirySessionConfigM27246a = C6183c.m27246a(data2.getAttributes());
        ExchangeOneTimeLinkCodeResponse.Metadata meta2 = exchangeOneTimeLinkCodeResponse.getMeta();
        return new AbstractC3705d.Success(id2, str3, inquirySessionConfigM27246a, meta2 != null ? meta2.getTrackingEventsUrl() : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m18739l(Function1<? super InterfaceC9557b<? super C7396x<ResponseBody>>, ? extends Object> function1, InterfaceC9557b<? super InternalErrorInfo> interfaceC9557b) {
        d dVar;
        C7729c0 c7729c0;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i10 = dVar.f15445x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f15445x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        Object obj = dVar.f15443v;
        Object objM38805e = C10047c.m38805e();
        int i11 = dVar.f15445x;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            C7729c0 c7729c1 = new C7729c0();
            e eVar = new e(function1, c7729c1, null);
            dVar.f15441t = C10350l.m39676a(function1);
            dVar.f15442u = c7729c1;
            dVar.f15445x = 1;
            if (C7250b0.m30222a(5, eVar, dVar) == objM38805e) {
                return objM38805e;
            }
            c7729c0 = c7729c1;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7729c0 = (C7729c0) dVar.f15442u;
            C7348o.m30470b(obj);
        }
        return c7729c0.f29425a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m18740m(@NotNull String str, @NotNull InterfaceC9557b<? super InterfaceC3708g> interfaceC9557b) {
        f fVar;
        CurrentRelaySessionResponse.Metadata meta;
        CurrentRelaySessionResponse.Data data;
        Relationships relationships;
        Relationship inquiry;
        RelationshipData data2;
        if (interfaceC9557b instanceof f) {
            fVar = (f) interfaceC9557b;
            int i10 = fVar.f15453w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                fVar.f15453w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                fVar = new f(interfaceC9557b);
            }
        } else {
            fVar = new f(interfaceC9557b);
        }
        Object objM27326a = fVar.f15451u;
        Object objM38805e = C10047c.m38805e();
        int i11 = fVar.f15453w;
        if (i11 == 0) {
            C7348o.m30470b(objM27326a);
            fVar.f15450t = C10350l.m39676a(str);
            fVar.f15453w = 1;
            objM27326a = this.relayService.m27326a("Bearer " + str, fVar);
            if (objM27326a == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM27326a);
        }
        C7396x c7396x = (C7396x) objM27326a;
        if (!c7396x.m30657g()) {
            return new InterfaceC3708g.Error(NetworkUtilsKt.toErrorInfo(c7396x));
        }
        String str2 = c7396x.m30656f().get("persona-device-id");
        if (str2 != null) {
            this.deviceIdProvider.mo48948a(str2);
        }
        CurrentRelaySessionResponse currentRelaySessionResponse = (CurrentRelaySessionResponse) c7396x.m30653a();
        String inquirySessionToken = null;
        String id2 = (currentRelaySessionResponse == null || (data = currentRelaySessionResponse.getData()) == null || (relationships = data.getRelationships()) == null || (inquiry = relationships.getInquiry()) == null || (data2 = inquiry.getData()) == null) ? null : data2.getId();
        if (currentRelaySessionResponse != null && (meta = currentRelaySessionResponse.getMeta()) != null) {
            inquirySessionToken = meta.getInquirySessionToken();
        }
        if (id2 == null || inquirySessionToken == null) {
            return new InterfaceC3708g.Error(new InternalErrorInfo.UnknownErrorInfo("Error resolving relay session."));
        }
        return new InterfaceC3708g.Success(id2, "Bearer " + inquirySessionToken, InquirySessionConfig.INSTANCE.m20427a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m18741n(String str, String str2, InterfaceC9557b<? super AbstractC3709h> interfaceC9557b) {
        g gVar;
        if (interfaceC9557b instanceof g) {
            gVar = (g) interfaceC9557b;
            int i10 = gVar.f15458x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                gVar.f15458x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                gVar = new g(interfaceC9557b);
            }
        } else {
            gVar = new g(interfaceC9557b);
        }
        Object objM22896f = gVar.f15456v;
        Object objM38805e = C10047c.m38805e();
        int i11 = gVar.f15458x;
        try {
            if (i11 == 0) {
                C7348o.m30470b(objM22896f);
                C4655i c4655i = this.fallbackModeManager;
                TransitionBackRequest transitionBackRequestM18672a = TransitionBackRequest.INSTANCE.m18672a(str2);
                gVar.f15454t = C10350l.m39676a(str);
                gVar.f15455u = C10350l.m39676a(str2);
                gVar.f15458x = 1;
                objM22896f = c4655i.m22896f(str, transitionBackRequestM18672a, gVar);
                if (objM22896f == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(objM22896f);
            }
            C7396x c7396x = (C7396x) objM22896f;
            C3686i currentSession = this.fallbackModeManager.getCurrentSession();
            if (c7396x.m30657g()) {
                return currentSession == null ? new AbstractC3709h.Error(new InternalErrorInfo.UnknownErrorInfo("Current fallback session is unexpectedly null.")) : new AbstractC3709h.Success(currentSession.m18505a());
            }
            return new AbstractC3709h.Error(NetworkUtilsKt.toErrorInfo(c7396x));
        } catch (SocketTimeoutException e10) {
            return new AbstractC3709h.Error(NetworkUtilsKt.toSocketTimeoutErrorInfo(e10));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m18742o(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, String str4, InterfaceC9557b<? super AbstractC3709h> interfaceC9557b) {
        h hVar;
        if (interfaceC9557b instanceof h) {
            hVar = (h) interfaceC9557b;
            int i10 = hVar.f15459A;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                hVar.f15459A = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                hVar = new h(interfaceC9557b);
            }
        } else {
            hVar = new h(interfaceC9557b);
        }
        Object objM27321j = hVar.f15465y;
        Object objM38805e = C10047c.m38805e();
        int i11 = hVar.f15459A;
        try {
            if (i11 == 0) {
                C7348o.m30470b(objM27321j);
                InterfaceC6203w interfaceC6203w = this.service;
                TransitionBackRequest transitionBackRequestM18672a = TransitionBackRequest.INSTANCE.m18672a(str3);
                hVar.f15460t = str;
                hVar.f15461u = C10350l.m39676a(str2);
                hVar.f15462v = C10350l.m39676a(str3);
                hVar.f15463w = inquirySessionConfig;
                hVar.f15464x = str4;
                hVar.f15459A = 1;
                objM27321j = interfaceC6203w.m27321j(str, str2, transitionBackRequestM18672a, hVar);
                if (objM27321j == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (String) hVar.f15464x;
                inquirySessionConfig = (InquirySessionConfig) hVar.f15463w;
                str = (String) hVar.f15460t;
                C7348o.m30470b(objM27321j);
            }
            C7396x c7396x = (C7396x) objM27321j;
            if (!c7396x.m30657g()) {
                return new AbstractC3709h.Error(NetworkUtilsKt.toErrorInfo(c7396x));
            }
            Object objM30653a = c7396x.m30653a();
            Intrinsics.checkNotNull(objM30653a);
            return new AbstractC3709h.Success(C6181a.m27241w((CheckInquiryResponse) objM30653a, str, inquirySessionConfig, str4));
        } catch (SocketTimeoutException e10) {
            return new AbstractC3709h.Error(NetworkUtilsKt.toSocketTimeoutErrorInfo(e10));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final Object m18743p(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull InquirySessionConfig inquirySessionConfig, @Nullable String str4, @NotNull InterfaceC9557b<? super AbstractC3709h> interfaceC9557b) {
        return this.fallbackModeManager.mo22892b() ? m18741n(str, str3, interfaceC9557b) : m18742o(str, str2, str3, inquirySessionConfig, str4, interfaceC9557b);
    }

    /* JADX INFO: renamed from: q */
    public final void m18744q(@NotNull InquirySessionData inquirySessionData) {
        Relationship device;
        RelationshipData data;
        String id2;
        Intrinsics.checkNotNullParameter(inquirySessionData, "inquirySessionData");
        Relationships relationships = inquirySessionData.getRelationships();
        if (relationships != null && (device = relationships.getDevice()) != null && (data = device.getData()) != null && (id2 = data.getId()) != null) {
            this.deviceIdProvider.mo48948a(id2);
        }
        String playIntegrityProjectId = inquirySessionData.getAttributes().getPlayIntegrityProjectId();
        if (playIntegrityProjectId != null) {
            this.playIntegrityHelper.m24065h(playIntegrityProjectId);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: r */
    public final Object m18745r(@NotNull String str, @NotNull InquirySessionConfig inquirySessionConfig, @NotNull InterfaceC9557b<? super AbstractC3710i> interfaceC9557b) {
        i iVar;
        InquirySessionConfig inquirySessionConfig2;
        if (interfaceC9557b instanceof i) {
            iVar = (i) interfaceC9557b;
            int i10 = iVar.f15472y;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                iVar.f15472y = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                iVar = new i(interfaceC9557b);
            }
        } else {
            iVar = new i(interfaceC9557b);
        }
        Object objM18748u = iVar.f15470w;
        Object objM38805e = C10047c.m38805e();
        int i11 = iVar.f15472y;
        if (i11 == 0) {
            C7348o.m30470b(objM18748u);
            iVar.f15467t = str;
            iVar.f15468u = inquirySessionConfig;
            iVar.f15472y = 1;
            objM18748u = m18748u(str, inquirySessionConfig, iVar);
            if (objM18748u != objM38805e) {
            }
            return objM38805e;
        }
        if (i11 == 1) {
            inquirySessionConfig = (InquirySessionConfig) iVar.f15468u;
            str = (String) iVar.f15467t;
            C7348o.m30470b(objM18748u);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inquirySessionConfig2 = (InquirySessionConfig) iVar.f15468u;
            C7348o.m30470b(objM18748u);
        }
        InternalErrorInfo internalErrorInfo = (InternalErrorInfo) objM18748u;
        return (internalErrorInfo == null && inquirySessionConfig2.m20426k()) ? new AbstractC3710i.Error(internalErrorInfo) : AbstractC3710i.b.f15517a;
        AbstractC3711j abstractC3711j = (AbstractC3711j) objM18748u;
        if (abstractC3711j instanceof AbstractC3711j.Error) {
            return new AbstractC3710i.Error(((AbstractC3711j.Error) abstractC3711j).getCause());
        }
        iVar.f15467t = C10350l.m39676a(str);
        iVar.f15468u = inquirySessionConfig;
        iVar.f15469v = C10350l.m39676a(abstractC3711j);
        iVar.f15472y = 2;
        objM18748u = m18747t(str, inquirySessionConfig, iVar);
        if (objM18748u != objM38805e) {
            inquirySessionConfig2 = inquirySessionConfig;
            InternalErrorInfo internalErrorInfo2 = (InternalErrorInfo) objM18748u;
            if (internalErrorInfo2 == null) {
            }
        }
        return objM38805e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: s */
    public final Object m18746s(@NotNull String str, @NotNull DeviceMetrics deviceMetrics, @NotNull InterfaceC9557b<? super AbstractC3710i> interfaceC9557b) {
        j jVar;
        if (interfaceC9557b instanceof j) {
            jVar = (j) interfaceC9557b;
            int i10 = jVar.f15477x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                jVar.f15477x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                jVar = new j(interfaceC9557b);
            }
        } else {
            jVar = new j(interfaceC9557b);
        }
        Object objM18739l = jVar.f15475v;
        Object objM38805e = C10047c.m38805e();
        int i11 = jVar.f15477x;
        if (i11 == 0) {
            C7348o.m30470b(objM18739l);
            Function1<? super InterfaceC9557b<? super C7396x<ResponseBody>>, ? extends Object> kVar = new k(str, deviceMetrics, null);
            jVar.f15473t = C10350l.m39676a(str);
            jVar.f15474u = C10350l.m39676a(deviceMetrics);
            jVar.f15477x = 1;
            objM18739l = m18739l(kVar, jVar);
            if (objM18739l == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM18739l);
        }
        InternalErrorInfo internalErrorInfo = (InternalErrorInfo) objM18739l;
        return internalErrorInfo == null ? AbstractC3710i.b.f15517a : new AbstractC3710i.Error(internalErrorInfo);
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
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m18747t(String str, InquirySessionConfig inquirySessionConfig, InterfaceC9557b<? super InternalErrorInfo> interfaceC9557b) {
        l lVar;
        String str2;
        InquirySessionConfig inquirySessionConfig2;
        GpsData gpsData;
        Object obj;
        InterfaceC9575h<ThreatEventState> interfaceC9575hM47894b;
        InquirySessionConfig inquirySessionConfig3;
        GpsData gpsData2;
        ThreatEventState threatEventState;
        Object objM37805v;
        InquirySessionConfig inquirySessionConfig4;
        String str3;
        GpsData gpsData3;
        Map<String, ThreatEventState.EventMetadata> mapM47889b;
        if (interfaceC9557b instanceof l) {
            lVar = (l) interfaceC9557b;
            int i10 = lVar.f15488z;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                lVar.f15488z = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                lVar = new l(interfaceC9557b);
            }
        } else {
            lVar = new l(interfaceC9557b);
        }
        l lVar2 = lVar;
        Object objM18739l = lVar2.f15486x;
        Object objM38805e = C10047c.m38805e();
        int i11 = lVar2.f15488z;
        if (i11 != 0) {
            if (i11 == 1) {
                InquirySessionConfig inquirySessionConfig5 = (InquirySessionConfig) lVar2.f15483u;
                String str4 = (String) lVar2.f15482t;
                C7348o.m30470b(objM18739l);
                obj = objM18739l;
                inquirySessionConfig2 = inquirySessionConfig5;
                str2 = str4;
            } else if (i11 == 2) {
                gpsData3 = (GpsData) lVar2.f15484v;
                inquirySessionConfig4 = (InquirySessionConfig) lVar2.f15483u;
                str3 = (String) lVar2.f15482t;
                C7348o.m30470b(objM18739l);
                inquirySessionConfig3 = inquirySessionConfig4;
                gpsData2 = gpsData3;
                str2 = str3;
                threatEventState = (ThreatEventState) objM18739l;
                if (gpsData2 == null) {
                    if (threatEventState != null) {
                        mapM47889b = threatEventState.m47889b();
                    } else {
                        mapM47889b = null;
                    }
                    if (mapM47889b != null || mapM47889b.isEmpty()) {
                        return null;
                    }
                }
                Function1<? super InterfaceC9557b<? super C7396x<ResponseBody>>, ? extends Object> mVar = new m(str2, gpsData2, threatEventState, null);
                lVar2.f15482t = C10350l.m39676a(str2);
                lVar2.f15483u = C10350l.m39676a(inquirySessionConfig3);
                lVar2.f15484v = C10350l.m39676a(gpsData2);
                lVar2.f15485w = C10350l.m39676a(threatEventState);
                lVar2.f15488z = 3;
                objM18739l = m18739l(mVar, lVar2);
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(objM18739l);
            }
            return (InternalErrorInfo) objM18739l;
        }
        C7348o.m30470b(objM18739l);
        if (inquirySessionConfig.getGpsCollectionRequirement() != GpsCollectionRequirement.NONE) {
            Context context = this.applicationContext;
            lVar2.f15482t = str;
            lVar2.f15483u = C10350l.m39676a(inquirySessionConfig);
            lVar2.f15488z = 1;
            Object objM20430a = C4012a.m20430a(context, lVar2);
            if (objM20430a != objM38805e) {
                str2 = str;
                obj = objM20430a;
                inquirySessionConfig2 = inquirySessionConfig;
            }
        } else {
            str2 = str;
            inquirySessionConfig2 = inquirySessionConfig;
            gpsData = null;
            interfaceC9575hM47894b = C12868c.m47894b();
            if (interfaceC9575hM47894b != null) {
                lVar2.f15482t = str2;
                lVar2.f15483u = C10350l.m39676a(inquirySessionConfig2);
                lVar2.f15484v = gpsData;
                lVar2.f15488z = 2;
                objM37805v = C9579j.m37805v(interfaceC9575hM47894b, lVar2);
                if (objM37805v != objM38805e) {
                    inquirySessionConfig4 = inquirySessionConfig2;
                    objM18739l = objM37805v;
                    GpsData gpsData4 = gpsData;
                    str3 = str2;
                    gpsData3 = gpsData4;
                    inquirySessionConfig3 = inquirySessionConfig4;
                    gpsData2 = gpsData3;
                    str2 = str3;
                    threatEventState = (ThreatEventState) objM18739l;
                    if (gpsData2 == null) {
                        if (threatEventState != null) {
                            mapM47889b = threatEventState.m47889b();
                        } else {
                            mapM47889b = null;
                        }
                        if (mapM47889b != null) {
                        }
                        return null;
                    }
                    Function1<? super InterfaceC9557b<? super C7396x<ResponseBody>>, ? extends Object> mVar2 = new m(str2, gpsData2, threatEventState, null);
                    lVar2.f15482t = C10350l.m39676a(str2);
                    lVar2.f15483u = C10350l.m39676a(inquirySessionConfig3);
                    lVar2.f15484v = C10350l.m39676a(gpsData2);
                    lVar2.f15485w = C10350l.m39676a(threatEventState);
                    lVar2.f15488z = 3;
                    objM18739l = m18739l(mVar2, lVar2);
                }
            } else {
                inquirySessionConfig3 = inquirySessionConfig2;
                gpsData2 = gpsData;
                threatEventState = null;
                if (gpsData2 == null) {
                    if (threatEventState != null) {
                        mapM47889b = threatEventState.m47889b();
                    } else {
                        mapM47889b = null;
                    }
                    if (mapM47889b != null) {
                    }
                    return null;
                }
                Function1<? super InterfaceC9557b<? super C7396x<ResponseBody>>, ? extends Object> mVar3 = new m(str2, gpsData2, threatEventState, null);
                lVar2.f15482t = C10350l.m39676a(str2);
                lVar2.f15483u = C10350l.m39676a(inquirySessionConfig3);
                lVar2.f15484v = C10350l.m39676a(gpsData2);
                lVar2.f15485w = C10350l.m39676a(threatEventState);
                lVar2.f15488z = 3;
                objM18739l = m18739l(mVar3, lVar2);
            }
        }
        return objM38805e;
        gpsData = (GpsData) obj;
        interfaceC9575hM47894b = C12868c.m47894b();
        if (interfaceC9575hM47894b != null) {
            lVar2.f15482t = str2;
            lVar2.f15483u = C10350l.m39676a(inquirySessionConfig2);
            lVar2.f15484v = gpsData;
            lVar2.f15488z = 2;
            objM37805v = C9579j.m37805v(interfaceC9575hM47894b, lVar2);
            if (objM37805v != objM38805e) {
                inquirySessionConfig4 = inquirySessionConfig2;
                objM18739l = objM37805v;
                GpsData gpsData5 = gpsData;
                str3 = str2;
                gpsData3 = gpsData5;
                inquirySessionConfig3 = inquirySessionConfig4;
                gpsData2 = gpsData3;
                str2 = str3;
                threatEventState = (ThreatEventState) objM18739l;
                if (gpsData2 == null) {
                    if (threatEventState != null) {
                        mapM47889b = threatEventState.m47889b();
                    } else {
                        mapM47889b = null;
                    }
                    if (mapM47889b != null) {
                    }
                    return null;
                }
                Function1<? super InterfaceC9557b<? super C7396x<ResponseBody>>, ? extends Object> mVar4 = new m(str2, gpsData2, threatEventState, null);
                lVar2.f15482t = C10350l.m39676a(str2);
                lVar2.f15483u = C10350l.m39676a(inquirySessionConfig3);
                lVar2.f15484v = C10350l.m39676a(gpsData2);
                lVar2.f15485w = C10350l.m39676a(threatEventState);
                lVar2.f15488z = 3;
                objM18739l = m18739l(mVar4, lVar2);
            }
        } else {
            inquirySessionConfig3 = inquirySessionConfig2;
            gpsData2 = gpsData;
            threatEventState = null;
            if (gpsData2 == null) {
                if (threatEventState != null) {
                    mapM47889b = threatEventState.m47889b();
                } else {
                    mapM47889b = null;
                }
                if (mapM47889b != null) {
                }
                return null;
            }
            Function1<? super InterfaceC9557b<? super C7396x<ResponseBody>>, ? extends Object> mVar5 = new m(str2, gpsData2, threatEventState, null);
            lVar2.f15482t = C10350l.m39676a(str2);
            lVar2.f15483u = C10350l.m39676a(inquirySessionConfig3);
            lVar2.f15484v = C10350l.m39676a(gpsData2);
            lVar2.f15485w = C10350l.m39676a(threatEventState);
            lVar2.f15488z = 3;
            objM18739l = m18739l(mVar5, lVar2);
        }
        return objM38805e;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00db, code lost:
    
        if (r4.m24066i(r0) == r1) goto L41;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m18748u(String str, InquirySessionConfig inquirySessionConfig, InterfaceC9557b<? super AbstractC3711j> interfaceC9557b) {
        n nVar;
        String str2;
        String str3;
        InternalErrorInfo internalErrorInfo;
        if (interfaceC9557b instanceof n) {
            nVar = (n) interfaceC9557b;
            int i10 = nVar.f15500z;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                nVar.f15500z = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                nVar = new n(interfaceC9557b);
            }
        } else {
            nVar = new n(interfaceC9557b);
        }
        Object objM24064g = nVar.f15498x;
        Object objM38805e = C10047c.m38805e();
        int i11 = nVar.f15500z;
        if (i11 == 0) {
            C7348o.m30470b(objM24064g);
            if (!this.redactAppIdentifyingInformation && inquirySessionConfig.getUsePlayIntegrity()) {
                C5174a c5174a = this.playIntegrityHelper;
                nVar.f15494t = str;
                nVar.f15495u = C10350l.m39676a(inquirySessionConfig);
                nVar.f15500z = 1;
                objM24064g = c5174a.m24064g(nVar);
                if (objM24064g != objM38805e) {
                }
                return objM38805e;
            }
            return AbstractC3711j.b.f15519a;
        }
        if (i11 == 1) {
            inquirySessionConfig = (InquirySessionConfig) nVar.f15495u;
            str = (String) nVar.f15494t;
            C7348o.m30470b(objM24064g);
        } else if (i11 == 2) {
            str3 = (String) nVar.f15496v;
            inquirySessionConfig = (InquirySessionConfig) nVar.f15495u;
            str2 = (String) nVar.f15494t;
            C7348o.m30470b(objM24064g);
            internalErrorInfo = (InternalErrorInfo) objM24064g;
            if (internalErrorInfo == null) {
                return new AbstractC3711j.Error(internalErrorInfo);
            }
            C5174a c5174a2 = this.playIntegrityHelper;
            nVar.f15494t = C10350l.m39676a(str2);
            nVar.f15495u = C10350l.m39676a(inquirySessionConfig);
            nVar.f15496v = C10350l.m39676a(str3);
            nVar.f15497w = C10350l.m39676a(internalErrorInfo);
            nVar.f15500z = 3;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM24064g);
        }
        return AbstractC3711j.b.f15519a;
        String str4 = (String) objM24064g;
        if (str4 == null) {
            return AbstractC3711j.b.f15519a;
        }
        Function1<? super InterfaceC9557b<? super C7396x<ResponseBody>>, ? extends Object> oVar = new o(str, str4, null);
        nVar.f15494t = C10350l.m39676a(str);
        nVar.f15495u = C10350l.m39676a(inquirySessionConfig);
        nVar.f15496v = C10350l.m39676a(str4);
        nVar.f15500z = 2;
        Object objM18739l = m18739l(oVar, nVar);
        if (objM18739l != objM38805e) {
            str2 = str;
            str3 = str4;
            objM24064g = objM18739l;
            internalErrorInfo = (InternalErrorInfo) objM24064g;
            if (internalErrorInfo == null) {
                return new AbstractC3711j.Error(internalErrorInfo);
            }
            C5174a c5174a3 = this.playIntegrityHelper;
            nVar.f15494t = C10350l.m39676a(str2);
            nVar.f15495u = C10350l.m39676a(inquirySessionConfig);
            nVar.f15496v = C10350l.m39676a(str3);
            nVar.f15497w = C10350l.m39676a(internalErrorInfo);
            nVar.f15500z = 3;
        }
        return objM38805e;
    }
}
