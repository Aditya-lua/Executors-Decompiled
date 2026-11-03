package xo;

import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import iu.d2;
import iu.g1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0010J2\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lxo/i;", "", "Lep/w;", "inquiryService", "Lsm/w;", "moshi", "Llp/b;", "logger", "Liu/p0;", "coroutineScope", "<init>", "(Lep/w;Lsm/w;Llp/b;Liu/p0;)V", "", "sessionToken", "Liu/d2;", "i", "(Ljava/lang/String;)Liu/d2;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "errorInfo", "e", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Liu/d2;", "h", "subsystem", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "errorType", "Llp/a;", "level", "", "f", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Llp/a;Llt/b;)Ljava/lang/Object;", "a", "Lep/w;", "b", "Lsm/w;", "c", "Llp/b;", "d", "Liu/p0;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ep.w inquiryService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final sm.w moshi;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lp.b logger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final iu.p0 coroutineScope;

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportError$1", f = "ErrorReportingManager.kt", l = {37}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class a extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36014t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f36016v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InternalErrorInfo f36017w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InternalErrorInfo internalErrorInfo, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f36016v = str;
            this.f36017w = internalErrorInfo;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return i.this.new a(this.f36016v, this.f36017w, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f36014t;
            if (i10 == 0) {
                gt.o.b(obj);
                ep.w wVar = i.this.inquiryService;
                String str = this.f36016v;
                ErrorRequest errorRequest = new ErrorRequest(com.withpersona.sdk2.inquiry.internal.network.c.a(this.f36017w), i.this.moshi.c(InternalErrorInfo.class).toJsonValue(this.f36017w));
                this.f36014t = 1;
                if (wVar.e(str, errorRequest, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager", f = "ErrorReportingManager.kt", l = {61, 70}, m = "reportError")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends nt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f36018t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f36019u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f36020v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f36021w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f36022x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f36023y;

        public b(lt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36023y = obj;
            this.A |= Integer.MIN_VALUE;
            return i.this.f(null, null, null, null, this);
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportErrors$1", f = "ErrorReportingManager.kt", l = {47, 48, 49, 51}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36025t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f36027v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f36027v = str;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return i.this.new c(this.f36027v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0075 A[PHI: r10
          0x0075: PHI (r10v3 xo.i$c) = (r10v2 xo.i$c), (r10v6 xo.i$c) binds: [B:21:0x0072, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        
            if (r14.f(r13) == r0) goto L25;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r13.f36025t
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L31
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L27
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                gt.o.b(r14)
                r10 = r13
                goto L84
            L1a:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L22:
                gt.o.b(r14)
                r10 = r13
                goto L75
            L27:
                gt.o.b(r14)
                r10 = r13
                goto L60
            L2c:
                gt.o.b(r14)
                r10 = r13
                goto L4b
            L31:
                gt.o.b(r14)
                r14 = r5
                xo.i r5 = xo.i.this
                java.lang.String r6 = r13.f36027v
                com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a r8 = com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a.Nfc
                r13.f36025t = r14
                java.lang.String r7 = "com.withpersona.sdk2.inquiry.nfc"
                r9 = 0
                r11 = 8
                r12 = 0
                r10 = r13
                java.lang.Object r14 = xo.i.g(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L4b
                goto L83
            L4b:
                xo.i r5 = xo.i.this
                java.lang.String r6 = r10.f36027v
                com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a r8 = com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a.Network
                r10.f36025t = r4
                java.lang.String r7 = "com.withpersona.sdk2.inquiry.network"
                r9 = 0
                r11 = 8
                r12 = 0
                java.lang.Object r14 = xo.i.g(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L60
                goto L83
            L60:
                xo.i r5 = xo.i.this
                java.lang.String r6 = r10.f36027v
                com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a r8 = com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a.Other
                r10.f36025t = r3
                java.lang.String r7 = "com.withpersona.sdk2.inquiry.integrity"
                r9 = 0
                r11 = 8
                r12 = 0
                java.lang.Object r14 = xo.i.g(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L75
                goto L83
            L75:
                xo.i r14 = xo.i.this
                lp.b r14 = xo.i.b(r14)
                r10.f36025t = r2
                java.lang.Object r14 = r14.f(r13)
                if (r14 != r0) goto L84
            L83:
                return r0
            L84:
                kotlin.Unit r14 = kotlin.Unit.f22938a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: xo.i.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportSessionCancelled$1", f = "ErrorReportingManager.kt", l = {30}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends nt.m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36028t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f36030v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, lt.b<? super d> bVar) {
            super(2, bVar);
            this.f36030v = str;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return i.this.new d(this.f36030v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f36028t;
            if (i10 == 0) {
                gt.o.b(obj);
                ep.w wVar = i.this.inquiryService;
                String str = this.f36030v;
                this.f36028t = 1;
                if (wVar.a(str, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    public i(@NotNull ep.w inquiryService, @NotNull sm.w moshi, @NotNull lp.b logger, @NotNull iu.p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(inquiryService, "inquiryService");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.inquiryService = inquiryService;
        this.moshi = moshi;
        this.logger = logger;
        this.coroutineScope = coroutineScope;
    }

    public static /* synthetic */ Object g(i iVar, String str, String str2, ErrorRequest.a aVar, lp.a aVar2, lt.b bVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            aVar2 = lp.a.Error;
        }
        return iVar.f(str, str2, aVar, aVar2, bVar);
    }

    @NotNull
    public final d2 e(@NotNull String sessionToken, @NotNull InternalErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        return iu.k.d(this.coroutineScope, g1.b(), null, new a(sessionToken, errorInfo, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        if (r2.e(r8, r4, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r8, java.lang.String r9, com.withpersona.sdk2.inquiry.internal.network.ErrorRequest.a r10, lp.a r11, lt.b<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xo.i.f(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a, lp.a, lt.b):java.lang.Object");
    }

    @NotNull
    public final d2 h(@NotNull String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        return iu.k.d(this.coroutineScope, g1.b(), null, new c(sessionToken, null), 2, null);
    }

    @NotNull
    public final d2 i(@NotNull String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        return iu.k.d(this.coroutineScope, g1.b(), null, new d(sessionToken, null), 2, null);
    }
}
