package es;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.ui.network.OneTimeLinkCodeForPersonasRequest;
import com.withpersona.sdk2.inquiry.ui.network.OneTimeLinkCodeResponse;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u001c\u0017Bg\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000b\u0012\u0014\b\u0001\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Les/x6;", "Lln/o;", "Les/x6$b;", "Lls/j;", "Lg/d;", "Laq/b;", "customTabsLauncher", "Lgs/c;", "uiService", "Lhn/w;", "moshi", BuildConfig.FLAVOR, "sessionToken", "inquiryId", "url", "componentName", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "<init>", "(Lg/d;Lgs/c;Lhn/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "otherWorker", BuildConfig.FLAVOR, "a", "(Lln/o;)Z", "Ldv/h;", "run", "()Ldv/h;", "b", "Lg/d;", "c", "Lgs/c;", "d", "Lhn/w;", "e", "Ljava/lang/String;", "f", "g", "h", "i", "Ljava/util/Map;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x6 implements ln.o<b>, ls.j<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.d<aq.b> customTabsLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gs.c uiService;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hn.w moshi;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String componentName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, ComponentParam> componentParams;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JM\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Les/x6$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "sessionToken", "inquiryId", "url", "componentName", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "Les/x6;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Les/x6;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        x6 a(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String url, @NotNull String componentName, @NotNull Map<String, ? extends ComponentParam> componentParams);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Les/x6$b;", BuildConfig.FLAVOR, "a", "b", "Les/x6$b$a;", "Les/x6$b$b;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Les/x6$b$a;", "Les/x6$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f14641a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1215598964;
            }

            @NotNull
            public String toString() {
                return "Complete";
            }
        }

        /* JADX INFO: renamed from: es.x6$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Les/x6$b$b;", "Les/x6$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "errorInfo", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
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
                return (other instanceof Error) && Intrinsics.c(this.errorInfo, ((Error) other).errorInfo);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Les/x6$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker$run$1", f = "VerifyReusablePersonaWorker.kt", l = {45, 51, 56, 63, 73, 82, 84}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<dv.i<? super b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14643t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f14644u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f14645v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f14646w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker$run$1$1", f = "VerifyReusablePersonaWorker.kt", l = {}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f14648t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ x6 f14649u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f14650v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x6 x6Var, String str, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f14649u = x6Var;
                this.f14650v = str;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f14649u, this.f14650v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f14648t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                g.d dVar = this.f14649u.customTabsLauncher;
                w.d dVarA = new w.d.e().a();
                Intrinsics.checkNotNullExpressionValue(dVarA, "build(...)");
                dVar.b(new aq.c(dVarA, y1.a(this.f14649u.url, this.f14650v, this.f14649u.componentName), null, 4, null));
                return Unit.f21506a;
            }
        }

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = x6.this.new c(bVar);
            cVar.f14646w = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0099  */
        /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:33:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:43:0x0121 A[PHI: r2 r9
          0x0121: PHI (r2v12 java.lang.String) = (r2v8 java.lang.String), (r2v14 java.lang.String) binds: [B:41:0x011e, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE]
          0x0121: PHI (r9v20 sw.x) = (r9v10 sw.x), (r9v21 sw.x) binds: [B:41:0x011e, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:46:0x0142  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00f7, code lost:
        
            if (r0.emit(r3, r8) == r1) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x015e, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0183, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L54;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            sw.x xVar;
            OneTimeLinkCodeResponse oneTimeLinkCodeResponse;
            String oneTimeLinkCode;
            av.n2 n2VarC;
            a aVar;
            com.withpersona.sdk2.inquiry.ui.network.Metadata meta;
            dv.h hVarN;
            sw.x xVar2;
            dv.i iVar = (dv.i) this.f14646w;
            Object objE = fu.c.e();
            try {
                switch (this.f14645v) {
                    case 0:
                        zt.o.b(obj);
                        gs.c cVar = x6.this.uiService;
                        String str = x6.this.inquiryId;
                        String str2 = x6.this.sessionToken;
                        OneTimeLinkCodeForPersonasRequest oneTimeLinkCodeForPersonasRequestA = OneTimeLinkCodeForPersonasRequest.INSTANCE.a(x6.this.componentParams);
                        this.f14646w = iVar;
                        this.f14645v = 1;
                        obj = cVar.d(str, str2, oneTimeLinkCodeForPersonasRequestA, this);
                        if (obj != objE) {
                            xVar = (sw.x) obj;
                            if (!xVar.g()) {
                                b.Error error = new b.Error(NetworkUtilsKt.toErrorInfo(xVar));
                                this.f14646w = gu.l.a(iVar);
                                this.f14643t = gu.l.a(xVar);
                                this.f14645v = 3;
                            } else {
                                oneTimeLinkCodeResponse = (OneTimeLinkCodeResponse) xVar.a();
                                if (oneTimeLinkCodeResponse != null || (meta = oneTimeLinkCodeResponse.getMeta()) == null) {
                                    oneTimeLinkCode = null;
                                } else {
                                    oneTimeLinkCode = meta.getOneTimeLinkCode();
                                }
                                if (oneTimeLinkCode == null) {
                                    n2VarC = av.g1.c();
                                    aVar = new a(x6.this, oneTimeLinkCode, null);
                                    this.f14646w = iVar;
                                    this.f14643t = gu.l.a(xVar);
                                    this.f14644u = gu.l.a(oneTimeLinkCode);
                                    this.f14645v = 5;
                                    if (av.i.g(n2VarC, aVar, this) != objE) {
                                        hVarN = dv.j.N(new aq.h(), 1);
                                        this.f14646w = iVar;
                                        this.f14643t = gu.l.a(xVar);
                                        this.f14644u = gu.l.a(oneTimeLinkCode);
                                        this.f14645v = 6;
                                        if (dv.n.c(hVarN, null, this, 1, null) != objE) {
                                            xVar2 = xVar;
                                            b.a aVar2 = b.a.f14641a;
                                            this.f14646w = gu.l.a(iVar);
                                            this.f14643t = gu.l.a(xVar2);
                                            this.f14644u = gu.l.a(oneTimeLinkCode);
                                            this.f14645v = 7;
                                        }
                                    }
                                } else {
                                    b.Error error2 = new b.Error(new InternalErrorInfo.UnknownErrorInfo("Expected oneTimeLinkCode but got null."));
                                    this.f14646w = gu.l.a(iVar);
                                    this.f14643t = gu.l.a(xVar);
                                    this.f14644u = gu.l.a(oneTimeLinkCode);
                                    this.f14645v = 4;
                                }
                            }
                            break;
                        }
                        return objE;
                    case 1:
                        zt.o.b(obj);
                        xVar = (sw.x) obj;
                        if (!xVar.g()) {
                            b.Error error3 = new b.Error(NetworkUtilsKt.toErrorInfo(xVar));
                            this.f14646w = gu.l.a(iVar);
                            this.f14643t = gu.l.a(xVar);
                            this.f14645v = 3;
                            break;
                        } else {
                            oneTimeLinkCodeResponse = (OneTimeLinkCodeResponse) xVar.a();
                            if (oneTimeLinkCodeResponse != null) {
                                oneTimeLinkCode = null;
                            } else {
                                oneTimeLinkCode = null;
                            }
                            if (oneTimeLinkCode == null) {
                                n2VarC = av.g1.c();
                                aVar = new a(x6.this, oneTimeLinkCode, null);
                                this.f14646w = iVar;
                                this.f14643t = gu.l.a(xVar);
                                this.f14644u = gu.l.a(oneTimeLinkCode);
                                this.f14645v = 5;
                                if (av.i.g(n2VarC, aVar, this) != objE) {
                                    hVarN = dv.j.N(new aq.h(), 1);
                                    this.f14646w = iVar;
                                    this.f14643t = gu.l.a(xVar);
                                    this.f14644u = gu.l.a(oneTimeLinkCode);
                                    this.f14645v = 6;
                                    if (dv.n.c(hVarN, null, this, 1, null) != objE) {
                                        xVar2 = xVar;
                                        b.a aVar3 = b.a.f14641a;
                                        this.f14646w = gu.l.a(iVar);
                                        this.f14643t = gu.l.a(xVar2);
                                        this.f14644u = gu.l.a(oneTimeLinkCode);
                                        this.f14645v = 7;
                                    }
                                }
                            } else {
                                b.Error error4 = new b.Error(new InternalErrorInfo.UnknownErrorInfo("Expected oneTimeLinkCode but got null."));
                                this.f14646w = gu.l.a(iVar);
                                this.f14643t = gu.l.a(xVar);
                                this.f14644u = gu.l.a(oneTimeLinkCode);
                                this.f14645v = 4;
                            }
                            break;
                        }
                        return objE;
                    case 2:
                        zt.o.b(obj);
                        return Unit.f21506a;
                    case 3:
                        zt.o.b(obj);
                        return Unit.f21506a;
                    case 4:
                        zt.o.b(obj);
                        return Unit.f21506a;
                    case 5:
                        oneTimeLinkCode = (String) this.f14644u;
                        sw.x xVar3 = (sw.x) this.f14643t;
                        zt.o.b(obj);
                        xVar = xVar3;
                        hVarN = dv.j.N(new aq.h(), 1);
                        this.f14646w = iVar;
                        this.f14643t = gu.l.a(xVar);
                        this.f14644u = gu.l.a(oneTimeLinkCode);
                        this.f14645v = 6;
                        if (dv.n.c(hVarN, null, this, 1, null) != objE) {
                            xVar2 = xVar;
                            b.a aVar4 = b.a.f14641a;
                            this.f14646w = gu.l.a(iVar);
                            this.f14643t = gu.l.a(xVar2);
                            this.f14644u = gu.l.a(oneTimeLinkCode);
                            this.f14645v = 7;
                            break;
                        }
                        return objE;
                    case 6:
                        oneTimeLinkCode = (String) this.f14644u;
                        xVar2 = (sw.x) this.f14643t;
                        zt.o.b(obj);
                        b.a aVar5 = b.a.f14641a;
                        this.f14646w = gu.l.a(iVar);
                        this.f14643t = gu.l.a(xVar2);
                        this.f14644u = gu.l.a(oneTimeLinkCode);
                        this.f14645v = 7;
                        break;
                    case 7:
                        zt.o.b(obj);
                        return Unit.f21506a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e10) {
                b.Error error5 = new b.Error(new InternalErrorInfo.UnknownErrorInfo("API response has unexpected shape."));
                this.f14646w = gu.l.a(iVar);
                this.f14643t = gu.l.a(e10);
                this.f14645v = 2;
            }
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x6(@NotNull g.d<aq.b> customTabsLauncher, @NotNull gs.c uiService, @NotNull hn.w moshi, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull String url, @NotNull String componentName, @NotNull Map<String, ? extends ComponentParam> componentParams) {
        Intrinsics.checkNotNullParameter(customTabsLauncher, "customTabsLauncher");
        Intrinsics.checkNotNullParameter(uiService, "uiService");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        this.customTabsLauncher = customTabsLauncher;
        this.uiService = uiService;
        this.moshi = moshi;
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.url = url;
        this.componentName = componentName;
        this.componentParams = componentParams;
    }

    @Override // ln.o
    public boolean a(@NotNull ln.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return ln.o.b.a(this, otherWorker) && Intrinsics.c(((x6) otherWorker).url, this.url);
    }

    @Override // ls.j
    public boolean b(@NotNull ls.j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull ls.j<?> jVar) {
        return super.c(jVar);
    }

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<b> run() {
        return dv.j.w(new c(null));
    }
}
