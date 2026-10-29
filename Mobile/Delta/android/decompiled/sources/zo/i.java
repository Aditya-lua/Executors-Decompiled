package zo;

import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import ku.g1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0010J2\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lzo/i;", "", "Lgp/w;", "inquiryService", "Lum/w;", "moshi", "Lnp/b;", "logger", "Lku/p0;", "coroutineScope", "<init>", "(Lgp/w;Lum/w;Lnp/b;Lku/p0;)V", "", "sessionToken", "Lku/d2;", "i", "(Ljava/lang/String;)Lku/d2;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "errorInfo", "f", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lku/d2;", "h", "subsystem", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "errorType", "Lnp/a;", "level", "", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Lnp/a;Lnt/b;)Ljava/lang/Object;", "a", "Lgp/w;", "b", "Lum/w;", "c", "Lnp/b;", "d", "Lku/p0;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gp.w inquiryService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final um.w moshi;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final np.b logger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ku.p0 coroutineScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportError$1", f = "ErrorReportingManager.kt", l = {37}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37891t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f37893v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InternalErrorInfo f37894w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InternalErrorInfo internalErrorInfo, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f37893v = str;
            this.f37894w = internalErrorInfo;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return i.this.new a(this.f37893v, this.f37894w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f37891t;
            if (i10 == 0) {
                jt.o.b(obj);
                gp.w wVar = i.this.inquiryService;
                String str = this.f37893v;
                ErrorRequest errorRequest = new ErrorRequest(com.withpersona.sdk2.inquiry.internal.network.c.a(this.f37894w), i.this.moshi.c(InternalErrorInfo.class).toJsonValue(this.f37894w));
                this.f37891t = 1;
                if (wVar.c(str, errorRequest, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager", f = "ErrorReportingManager.kt", l = {61, 70}, m = "reportError")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends pt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37895t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37896u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f37897v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f37898w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f37899x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f37900y;

        public b(nt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37900y = obj;
            this.A |= Integer.MIN_VALUE;
            return i.this.e(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportErrors$1", f = "ErrorReportingManager.kt", l = {47, 48, 49, 51}, m = "invokeSuspend")
    public static final class c extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37902t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f37904v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f37904v = str;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return i.this.new c(this.f37904v, bVar);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0075 A[PHI: r10
          0x0075: PHI (r10v3 zo.i$c) = (r10v2 zo.i$c), (r10v6 zo.i$c) binds: [B:21:0x0072, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        
            if (r14.f(r13) == r0) goto L25;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r13.f37902t
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L31
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L27
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                jt.o.b(r14)
                r10 = r13
                goto L84
            L1a:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L22:
                jt.o.b(r14)
                r10 = r13
                goto L75
            L27:
                jt.o.b(r14)
                r10 = r13
                goto L60
            L2c:
                jt.o.b(r14)
                r10 = r13
                goto L4b
            L31:
                jt.o.b(r14)
                r14 = r5
                zo.i r5 = zo.i.this
                java.lang.String r6 = r13.f37904v
                com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a r8 = com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a.Nfc
                r13.f37902t = r14
                java.lang.String r7 = "com.withpersona.sdk2.inquiry.nfc"
                r9 = 0
                r11 = 8
                r12 = 0
                r10 = r13
                java.lang.Object r14 = zo.i.g(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L4b
                goto L83
            L4b:
                zo.i r5 = zo.i.this
                java.lang.String r6 = r10.f37904v
                com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a r8 = com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a.Network
                r10.f37902t = r4
                java.lang.String r7 = "com.withpersona.sdk2.inquiry.network"
                r9 = 0
                r11 = 8
                r12 = 0
                java.lang.Object r14 = zo.i.g(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L60
                goto L83
            L60:
                zo.i r5 = zo.i.this
                java.lang.String r6 = r10.f37904v
                com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a r8 = com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a.Other
                r10.f37902t = r3
                java.lang.String r7 = "com.withpersona.sdk2.inquiry.integrity"
                r9 = 0
                r11 = 8
                r12 = 0
                java.lang.Object r14 = zo.i.g(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L75
                goto L83
            L75:
                zo.i r14 = zo.i.this
                np.b r14 = zo.i.b(r14)
                r10.f37902t = r2
                java.lang.Object r14 = r14.f(r13)
                if (r14 != r0) goto L84
            L83:
                return r0
            L84:
                kotlin.Unit r14 = kotlin.Unit.f22483a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: zo.i.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportSessionCancelled$1", f = "ErrorReportingManager.kt", l = {30}, m = "invokeSuspend")
    public static final class d extends pt.m implements Function2<ku.p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37905t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f37907v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f37907v = str;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return i.this.new d(this.f37907v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f37905t;
            if (i10 == 0) {
                jt.o.b(obj);
                gp.w wVar = i.this.inquiryService;
                String str = this.f37907v;
                this.f37905t = 1;
                if (wVar.h(str, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public i(@NotNull gp.w inquiryService, @NotNull um.w moshi, @NotNull np.b logger, @NotNull ku.p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(inquiryService, "inquiryService");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.inquiryService = inquiryService;
        this.moshi = moshi;
        this.logger = logger;
        this.coroutineScope = coroutineScope;
    }

    public static /* synthetic */ Object g(i iVar, String str, String str2, ErrorRequest.a aVar, np.a aVar2, nt.b bVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            aVar2 = np.a.Error;
        }
        return iVar.e(str, str2, aVar, aVar2, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        if (r2.c(r8, r4, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r8, java.lang.String r9, com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a r10, np.a r11, nt.b<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zo.i.e(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a, np.a, nt.b):java.lang.Object");
    }

    @NotNull
    public final d2 f(@NotNull String sessionToken, @NotNull InternalErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        return ku.k.d(this.coroutineScope, g1.b(), null, new a(sessionToken, errorInfo, null), 2, null);
    }

    @NotNull
    public final d2 h(@NotNull String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        return ku.k.d(this.coroutineScope, g1.b(), null, new c(sessionToken, null), 2, null);
    }

    @NotNull
    public final d2 i(@NotNull String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        return ku.k.d(this.coroutineScope, g1.b(), null, new d(sessionToken, null), 2, null);
    }
}
