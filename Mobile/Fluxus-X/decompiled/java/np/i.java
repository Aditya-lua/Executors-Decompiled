package np;

import av.d2;
import av.g1;
import backtraceio.library.services.BacktraceMetrics;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.internal.ErrorLog;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0010J2\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lnp/i;", BuildConfig.FLAVOR, "Lup/w;", "inquiryService", "Lhn/w;", "moshi", "Lbq/b;", "logger", "Lav/p0;", "coroutineScope", "<init>", "(Lup/w;Lhn/w;Lbq/b;Lav/p0;)V", BuildConfig.FLAVOR, "sessionToken", "Lav/d2;", "i", "(Ljava/lang/String;)Lav/d2;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "errorInfo", "e", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lav/d2;", "h", "subsystem", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "errorType", "Lbq/a;", "level", BuildConfig.FLAVOR, "f", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Lbq/a;Leu/b;)Ljava/lang/Object;", "a", "Lup/w;", "b", "Lhn/w;", "c", "Lbq/b;", "d", "Lav/p0;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final up.w inquiryService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final hn.w moshi;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final bq.b logger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final av.p0 coroutineScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportError$1", f = "ErrorReportingManager.kt", l = {37}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26332t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f26334v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InternalErrorInfo f26335w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InternalErrorInfo internalErrorInfo, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f26334v = str;
            this.f26335w = internalErrorInfo;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return i.this.new a(this.f26334v, this.f26335w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f26332t;
            if (i10 == 0) {
                zt.o.b(obj);
                up.w wVar = i.this.inquiryService;
                String str = this.f26334v;
                ErrorRequest errorRequest = new ErrorRequest(com.withpersona.sdk2.inquiry.internal.network.c.a(this.f26335w), i.this.moshi.c(InternalErrorInfo.class).toJsonValue(this.f26335w));
                this.f26332t = 1;
                if (wVar.b(str, errorRequest, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager", f = "ErrorReportingManager.kt", l = {61, 70}, m = "reportError")
    public static final class b extends gu.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26336t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f26337u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f26338v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f26339w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f26340x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f26341y;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f26341y = obj;
            this.A |= Integer.MIN_VALUE;
            return i.this.f(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportErrors$1", f = "ErrorReportingManager.kt", l = {47, 48, 49, 51}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26343t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f26345v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f26345v = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return i.this.new c(this.f26345v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0075 A[PHI: r10
          0x0075: PHI (r10v3 np.i$c) = (r10v2 np.i$c), (r10v6 np.i$c) binds: [B:21:0x0072, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        
            if (r14.f(r13) == r0) goto L25;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            c cVar;
            i iVar;
            String str;
            ErrorRequest.a aVar;
            Object objE = fu.c.e();
            int i10 = this.f26343t;
            if (i10 == 0) {
                zt.o.b(obj);
                i iVar2 = i.this;
                String str2 = this.f26345v;
                ErrorRequest.a aVar2 = ErrorRequest.a.Nfc;
                this.f26343t = 1;
                cVar = this;
                if (i.g(iVar2, str2, "com.withpersona.sdk2.inquiry.nfc", aVar2, null, cVar, 8, null) != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                zt.o.b(obj);
                cVar = this;
            } else {
                if (i10 == 2) {
                    zt.o.b(obj);
                    cVar = this;
                    iVar = i.this;
                    str = cVar.f26345v;
                    aVar = ErrorRequest.a.Other;
                    cVar.f26343t = 3;
                    if (i.g(iVar, str, "com.withpersona.sdk2.inquiry.integrity", aVar, null, cVar, 8, null) != objE) {
                        bq.b bVar = i.this.logger;
                        cVar.f26343t = 4;
                    }
                    return objE;
                }
                if (i10 == 3) {
                    zt.o.b(obj);
                    cVar = this;
                    bq.b bVar2 = i.this.logger;
                    cVar.f26343t = 4;
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
            }
            return Unit.f21506a;
            i iVar3 = i.this;
            String str3 = cVar.f26345v;
            ErrorRequest.a aVar3 = ErrorRequest.a.Network;
            cVar.f26343t = 2;
            if (i.g(iVar3, str3, NetworkUtilsKt.SUBSYSTEM, aVar3, null, cVar, 8, null) != objE) {
                iVar = i.this;
                str = cVar.f26345v;
                aVar = ErrorRequest.a.Other;
                cVar.f26343t = 3;
                if (i.g(iVar, str, "com.withpersona.sdk2.inquiry.integrity", aVar, null, cVar, 8, null) != objE) {
                    bq.b bVar3 = i.this.logger;
                    cVar.f26343t = 4;
                }
            }
            return objE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportSessionCancelled$1", f = "ErrorReportingManager.kt", l = {BacktraceMetrics.defaultTimeIntervalInMin}, m = "invokeSuspend")
    public static final class d extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26346t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f26348v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f26348v = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return i.this.new d(this.f26348v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f26346t;
            if (i10 == 0) {
                zt.o.b(obj);
                up.w wVar = i.this.inquiryService;
                String str = this.f26348v;
                this.f26346t = 1;
                if (wVar.f(str, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    public i(@NotNull up.w inquiryService, @NotNull hn.w moshi, @NotNull bq.b logger, @NotNull av.p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(inquiryService, "inquiryService");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.inquiryService = inquiryService;
        this.moshi = moshi;
        this.logger = logger;
        this.coroutineScope = coroutineScope;
    }

    public static /* synthetic */ Object g(i iVar, String str, String str2, ErrorRequest.a aVar, bq.a aVar2, eu.b bVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            aVar2 = bq.a.Error;
        }
        return iVar.f(str, str2, aVar, aVar2, bVar);
    }

    @NotNull
    public final d2 e(@NotNull String sessionToken, @NotNull InternalErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        return av.k.d(this.coroutineScope, g1.b(), null, new a(sessionToken, errorInfo, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        if (r2.b(r8, r4, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, ErrorRequest.a aVar, bq.a aVar2, eu.b<? super Unit> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.A = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objJ = bVar2.f26341y;
        Object objE = fu.c.e();
        int i11 = bVar2.A;
        if (i11 == 0) {
            zt.o.b(objJ);
            bq.b bVar3 = this.logger;
            bVar2.f26336t = str;
            bVar2.f26337u = gu.l.a(str2);
            bVar2.f26338v = aVar;
            bVar2.f26339w = gu.l.a(aVar2);
            bVar2.A = 1;
            objJ = bVar3.j(str2, aVar2, bVar2);
            if (objJ != objE) {
            }
            return objE;
        }
        if (i11 == 1) {
            aVar2 = (bq.a) bVar2.f26339w;
            aVar = (ErrorRequest.a) bVar2.f26338v;
            str2 = (String) bVar2.f26337u;
            str = (String) bVar2.f26336t;
            zt.o.b(objJ);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(objJ);
        }
        return Unit.f21506a;
        String str3 = (String) objJ;
        if (str3 != null && !StringsKt.p0(str3)) {
            up.w wVar = this.inquiryService;
            ErrorRequest errorRequest = new ErrorRequest(aVar, this.moshi.c(ErrorLog.class).toJsonValue(new ErrorLog(str3)));
            bVar2.f26336t = gu.l.a(str);
            bVar2.f26337u = gu.l.a(str2);
            bVar2.f26338v = gu.l.a(aVar);
            bVar2.f26339w = gu.l.a(aVar2);
            bVar2.f26340x = gu.l.a(str3);
            bVar2.A = 2;
        }
        return Unit.f21506a;
    }

    @NotNull
    public final d2 h(@NotNull String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        return av.k.d(this.coroutineScope, g1.b(), null, new c(sessionToken, null), 2, null);
    }

    @NotNull
    public final d2 i(@NotNull String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        return av.k.d(this.coroutineScope, g1.b(), null, new d(sessionToken, null), 2, null);
    }
}
