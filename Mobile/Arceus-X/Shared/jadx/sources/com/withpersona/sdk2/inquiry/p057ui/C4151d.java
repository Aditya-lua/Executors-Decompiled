package com.withpersona.sdk2.inquiry.p057ui;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.p057ui.network.OneTimeLinkCodeResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mp.C8613c;
import mp.C8623h;
import mp.InterfaceC8611b;
import nu.C9579j;
import nu.C9587n;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139g.AbstractC5854c;
import p229jt.C7348o;
import p231jv.C7396x;
import p256ku.AbstractC7900n2;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p342or.C9992t1;
import p344ot.C10047c;
import p392qr.InterfaceC10703c;
import p499vr.InterfaceC12257h;
import p502w.C12268d;
import p581ym.InterfaceC13222o;
import p582yn.InterfaceC13234a;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0015 BQ\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c¨\u0006!"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/d;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/ui/d$b;", "Lvr/h;", "Lqr/c;", "uiService", "Lyn/a;", "deviceIdProvider", "Lg/c;", "Lmp/b;", "customTabsLauncher", "", "sessionToken", "inquiryId", "url", "componentName", "<init>", "(Lqr/c;Lyn/a;Lg/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lnu/h;", "run", "()Lnu/h;", "b", "Lqr/c;", "c", "Lyn/a;", "d", "Lg/c;", "e", "Ljava/lang/String;", "f", "g", "h", "a", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4151d implements InterfaceC13222o<b>, InterfaceC12257h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC10703c uiService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC13234a deviceIdProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AbstractC5854c<InterfaceC8611b> customTabsLauncher;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final String componentName;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.d$a */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J7\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/d$a;", "", "", "sessionToken", "inquiryId", "url", "componentName", "Lcom/withpersona/sdk2/inquiry/ui/d;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/d;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C4151d mo21362a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String url, @NotNull String componentName);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.d$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/d$b;", "", "a", "b", "Lcom/withpersona/sdk2/inquiry/ui/d$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/d$b$b;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.d$b$a */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/d$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/d$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f17671a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1705280535;
            }

            @NotNull
            public String toString() {
                return "Complete";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.d$b$b, reason: collision with other inner class name and from toString */
        @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/d$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/d$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "errorInfo", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Error implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final InternalErrorInfo errorInfo;

            public Error(@NotNull InternalErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                this.errorInfo = errorInfo;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getErrorInfo() {
                return this.errorInfo;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.m31980c(this.errorInfo, ((Error) other).errorInfo);
            }

            public int hashCode() {
                return this.errorInfo.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(errorInfo=" + this.errorInfo + ")";
            }
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.d$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/ui/d$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker$run$1", m39664f = "CreateReusablePersonaWorker.kt", m39665l = {37, 42, 47, 54, 64, 73, 75}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC9577i<? super b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f17673t;

        /* JADX INFO: renamed from: u */
        public Object f17674u;

        /* JADX INFO: renamed from: v */
        public int f17675v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f17676w;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.d$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker$run$1$1", m39664f = "CreateReusablePersonaWorker.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f17678t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C4151d f17679u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ String f17680v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4151d c4151d, String str, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f17679u = c4151d;
                this.f17680v = str;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f17679u, this.f17680v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f17678t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                AbstractC5854c abstractC5854c = this.f17679u.customTabsLauncher;
                C12268d c12268dM45532a = new C12268d.e().m45532a();
                Intrinsics.checkNotNullExpressionValue(c12268dM45532a, "build(...)");
                abstractC5854c.m26240b(new C8613c(c12268dM45532a, C9992t1.m38774a(this.f17679u.url, this.f17680v, this.f17679u.componentName), null, 4, null));
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C4151d.this.new c(interfaceC9557b);
            cVar.f17676w = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x008d  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:40:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:43:0x0115 A[PHI: r2 r9
          0x0115: PHI (r2v12 java.lang.String) = (r2v8 java.lang.String), (r2v14 java.lang.String) binds: [B:41:0x0112, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE]
          0x0115: PHI (r9v20 jv.x) = (r9v10 jv.x), (r9v21 jv.x) binds: [B:41:0x0112, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:46:0x0136  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00eb, code lost:
        
            if (r0.emit(r3, r8) == r1) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0152, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0177, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L54;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C7396x c7396x;
            OneTimeLinkCodeResponse oneTimeLinkCodeResponse;
            String oneTimeLinkCode;
            AbstractC7900n2 abstractC7900n2M32645c;
            a aVar;
            com.withpersona.sdk2.inquiry.p057ui.network.Metadata meta;
            InterfaceC9575h interfaceC9575hM37776M;
            C7396x c7396x2;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f17676w;
            Object objM38805e = C10047c.m38805e();
            try {
                switch (this.f17675v) {
                    case 0:
                        C7348o.m30470b(obj);
                        InterfaceC10703c interfaceC10703c = C4151d.this.uiService;
                        String str = C4151d.this.inquiryId;
                        String str2 = C4151d.this.sessionToken;
                        this.f17676w = interfaceC9577i;
                        this.f17675v = 1;
                        obj = interfaceC10703c.m40795a(str, str2, this);
                        if (obj != objM38805e) {
                            c7396x = (C7396x) obj;
                            if (!c7396x.m30657g()) {
                                b.Error error = new b.Error(NetworkUtilsKt.toErrorInfo(c7396x));
                                this.f17676w = C10350l.m39676a(interfaceC9577i);
                                this.f17673t = C10350l.m39676a(c7396x);
                                this.f17675v = 3;
                            } else {
                                oneTimeLinkCodeResponse = (OneTimeLinkCodeResponse) c7396x.m30653a();
                                if (oneTimeLinkCodeResponse != null || (meta = oneTimeLinkCodeResponse.getMeta()) == null) {
                                    oneTimeLinkCode = null;
                                } else {
                                    oneTimeLinkCode = meta.getOneTimeLinkCode();
                                }
                                if (oneTimeLinkCode == null) {
                                    abstractC7900n2M32645c = C7864g1.m32645c();
                                    aVar = new a(C4151d.this, oneTimeLinkCode, null);
                                    this.f17676w = interfaceC9577i;
                                    this.f17673t = C10350l.m39676a(c7396x);
                                    this.f17674u = C10350l.m39676a(oneTimeLinkCode);
                                    this.f17675v = 5;
                                    if (C7872i.m32684g(abstractC7900n2M32645c, aVar, this) != objM38805e) {
                                        interfaceC9575hM37776M = C9579j.m37776M(new C8623h(), 1);
                                        this.f17676w = interfaceC9577i;
                                        this.f17673t = C10350l.m39676a(c7396x);
                                        this.f17674u = C10350l.m39676a(oneTimeLinkCode);
                                        this.f17675v = 6;
                                        if (C9587n.m37833c(interfaceC9575hM37776M, null, this, 1, null) != objM38805e) {
                                            c7396x2 = c7396x;
                                            b.a aVar2 = b.a.f17671a;
                                            this.f17676w = C10350l.m39676a(interfaceC9577i);
                                            this.f17673t = C10350l.m39676a(c7396x2);
                                            this.f17674u = C10350l.m39676a(oneTimeLinkCode);
                                            this.f17675v = 7;
                                        }
                                    }
                                } else {
                                    b.Error error2 = new b.Error(new InternalErrorInfo.UnknownErrorInfo("Expected oneTimeLinkCode but got null."));
                                    this.f17676w = C10350l.m39676a(interfaceC9577i);
                                    this.f17673t = C10350l.m39676a(c7396x);
                                    this.f17674u = C10350l.m39676a(oneTimeLinkCode);
                                    this.f17675v = 4;
                                }
                            }
                            break;
                        }
                        return objM38805e;
                    case 1:
                        C7348o.m30470b(obj);
                        c7396x = (C7396x) obj;
                        if (!c7396x.m30657g()) {
                            b.Error error3 = new b.Error(NetworkUtilsKt.toErrorInfo(c7396x));
                            this.f17676w = C10350l.m39676a(interfaceC9577i);
                            this.f17673t = C10350l.m39676a(c7396x);
                            this.f17675v = 3;
                            break;
                        } else {
                            oneTimeLinkCodeResponse = (OneTimeLinkCodeResponse) c7396x.m30653a();
                            if (oneTimeLinkCodeResponse != null) {
                                oneTimeLinkCode = null;
                            } else {
                                oneTimeLinkCode = null;
                            }
                            if (oneTimeLinkCode == null) {
                                abstractC7900n2M32645c = C7864g1.m32645c();
                                aVar = new a(C4151d.this, oneTimeLinkCode, null);
                                this.f17676w = interfaceC9577i;
                                this.f17673t = C10350l.m39676a(c7396x);
                                this.f17674u = C10350l.m39676a(oneTimeLinkCode);
                                this.f17675v = 5;
                                if (C7872i.m32684g(abstractC7900n2M32645c, aVar, this) != objM38805e) {
                                    interfaceC9575hM37776M = C9579j.m37776M(new C8623h(), 1);
                                    this.f17676w = interfaceC9577i;
                                    this.f17673t = C10350l.m39676a(c7396x);
                                    this.f17674u = C10350l.m39676a(oneTimeLinkCode);
                                    this.f17675v = 6;
                                    if (C9587n.m37833c(interfaceC9575hM37776M, null, this, 1, null) != objM38805e) {
                                        c7396x2 = c7396x;
                                        b.a aVar3 = b.a.f17671a;
                                        this.f17676w = C10350l.m39676a(interfaceC9577i);
                                        this.f17673t = C10350l.m39676a(c7396x2);
                                        this.f17674u = C10350l.m39676a(oneTimeLinkCode);
                                        this.f17675v = 7;
                                    }
                                }
                            } else {
                                b.Error error4 = new b.Error(new InternalErrorInfo.UnknownErrorInfo("Expected oneTimeLinkCode but got null."));
                                this.f17676w = C10350l.m39676a(interfaceC9577i);
                                this.f17673t = C10350l.m39676a(c7396x);
                                this.f17674u = C10350l.m39676a(oneTimeLinkCode);
                                this.f17675v = 4;
                            }
                            break;
                        }
                        return objM38805e;
                    case 2:
                        C7348o.m30470b(obj);
                        return Unit.f29331a;
                    case 3:
                        C7348o.m30470b(obj);
                        return Unit.f29331a;
                    case 4:
                        C7348o.m30470b(obj);
                        return Unit.f29331a;
                    case 5:
                        oneTimeLinkCode = (String) this.f17674u;
                        C7396x c7396x3 = (C7396x) this.f17673t;
                        C7348o.m30470b(obj);
                        c7396x = c7396x3;
                        interfaceC9575hM37776M = C9579j.m37776M(new C8623h(), 1);
                        this.f17676w = interfaceC9577i;
                        this.f17673t = C10350l.m39676a(c7396x);
                        this.f17674u = C10350l.m39676a(oneTimeLinkCode);
                        this.f17675v = 6;
                        if (C9587n.m37833c(interfaceC9575hM37776M, null, this, 1, null) != objM38805e) {
                            c7396x2 = c7396x;
                            b.a aVar4 = b.a.f17671a;
                            this.f17676w = C10350l.m39676a(interfaceC9577i);
                            this.f17673t = C10350l.m39676a(c7396x2);
                            this.f17674u = C10350l.m39676a(oneTimeLinkCode);
                            this.f17675v = 7;
                            break;
                        }
                        return objM38805e;
                    case 6:
                        oneTimeLinkCode = (String) this.f17674u;
                        c7396x2 = (C7396x) this.f17673t;
                        C7348o.m30470b(obj);
                        b.a aVar5 = b.a.f17671a;
                        this.f17676w = C10350l.m39676a(interfaceC9577i);
                        this.f17673t = C10350l.m39676a(c7396x2);
                        this.f17674u = C10350l.m39676a(oneTimeLinkCode);
                        this.f17675v = 7;
                        break;
                    case 7:
                        C7348o.m30470b(obj);
                        return Unit.f29331a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e10) {
                b.Error error5 = new b.Error(new InternalErrorInfo.UnknownErrorInfo("API response has unexpected shape."));
                this.f17676w = C10350l.m39676a(interfaceC9577i);
                this.f17673t = C10350l.m39676a(e10);
                this.f17675v = 2;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C4151d(@NotNull InterfaceC10703c uiService, @NotNull InterfaceC13234a deviceIdProvider, @NotNull AbstractC5854c<InterfaceC8611b> customTabsLauncher, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull String url, @NotNull String componentName) {
        Intrinsics.checkNotNullParameter(uiService, "uiService");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(customTabsLauncher, "customTabsLauncher");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        this.uiService = uiService;
        this.deviceIdProvider = deviceIdProvider;
        this.customTabsLauncher = customTabsLauncher;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.url = url;
        this.componentName = componentName;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> interfaceC13222o) {
        return InterfaceC13222o.b.m48893a(this, interfaceC13222o);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7574c(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<b> run() {
        return C9579j.m37806w(new c(null));
    }
}
