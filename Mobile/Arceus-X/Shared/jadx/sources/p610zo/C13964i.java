package p610zo;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.internal.ErrorLog;
import com.withpersona.sdk2.inquiry.internal.network.C3704c;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import gp.InterfaceC6203w;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import np.C9539b;
import np.EnumC9538a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p471um.C11888w;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: zo.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0010J2\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m31665d2 = {"Lzo/i;", "", "Lgp/w;", "inquiryService", "Lum/w;", "moshi", "Lnp/b;", "logger", "Lku/p0;", "coroutineScope", "<init>", "(Lgp/w;Lum/w;Lnp/b;Lku/p0;)V", "", "sessionToken", "Lku/d2;", "i", "(Ljava/lang/String;)Lku/d2;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "errorInfo", "f", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lku/d2;", "h", "subsystem", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "errorType", "Lnp/a;", "level", "", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Lnp/a;Lnt/b;)Ljava/lang/Object;", "a", "Lgp/w;", "b", "Lum/w;", "c", "Lnp/b;", "d", "Lku/p0;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13964i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6203w inquiryService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C11888w moshi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C9539b logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: zo.i$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportError$1", m39664f = "ErrorReportingManager.kt", m39665l = {37}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48784t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f48786v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ InternalErrorInfo f48787w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InternalErrorInfo internalErrorInfo, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48786v = str;
            this.f48787w = internalErrorInfo;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C13964i.this.new a(this.f48786v, this.f48787w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f48784t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC6203w interfaceC6203w = C13964i.this.inquiryService;
                String str = this.f48786v;
                ErrorRequest errorRequest = new ErrorRequest(C3704c.m18722a(this.f48787w), C13964i.this.moshi.m44436c(InternalErrorInfo.class).toJsonValue(this.f48787w));
                this.f48784t = 1;
                if (interfaceC6203w.m27314c(str, errorRequest, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: zo.i$b */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager", m39664f = "ErrorReportingManager.kt", m39665l = {61, 70}, m39666m = "reportError")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f48788A;

        /* JADX INFO: renamed from: t */
        public Object f48789t;

        /* JADX INFO: renamed from: u */
        public Object f48790u;

        /* JADX INFO: renamed from: v */
        public Object f48791v;

        /* JADX INFO: renamed from: w */
        public Object f48792w;

        /* JADX INFO: renamed from: x */
        public Object f48793x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f48794y;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48794y = obj;
            this.f48788A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C13964i.this.m50472e(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zo.i$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportErrors$1", m39664f = "ErrorReportingManager.kt", m39665l = {47, 48, 49, 51}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48796t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f48798v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48798v = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C13964i.this.new c(this.f48798v, interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0075 A[PHI: r10
          0x0075: PHI (r10v3 zo.i$c) = (r10v2 zo.i$c), (r10v6 zo.i$c) binds: [B:21:0x0072, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        
            if (r14.m37656f(r13) == r0) goto L25;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            c cVar;
            C13964i c13964i;
            String str;
            ErrorRequest.EnumC3699a enumC3699a;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f48796t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C13964i c13964i2 = C13964i.this;
                String str2 = this.f48798v;
                ErrorRequest.EnumC3699a enumC3699a2 = ErrorRequest.EnumC3699a.Nfc;
                this.f48796t = 1;
                cVar = this;
                if (C13964i.m50471g(c13964i2, str2, "com.withpersona.sdk2.inquiry.nfc", enumC3699a2, null, cVar, 8, null) != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 == 1) {
                C7348o.m30470b(obj);
                cVar = this;
            } else {
                if (i10 == 2) {
                    C7348o.m30470b(obj);
                    cVar = this;
                    c13964i = C13964i.this;
                    str = cVar.f48798v;
                    enumC3699a = ErrorRequest.EnumC3699a.Other;
                    cVar.f48796t = 3;
                    if (C13964i.m50471g(c13964i, str, "com.withpersona.sdk2.inquiry.integrity", enumC3699a, null, cVar, 8, null) != objM38805e) {
                        C9539b c9539b = C13964i.this.logger;
                        cVar.f48796t = 4;
                    }
                    return objM38805e;
                }
                if (i10 == 3) {
                    C7348o.m30470b(obj);
                    cVar = this;
                    C9539b c9539b2 = C13964i.this.logger;
                    cVar.f48796t = 4;
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
            }
            return Unit.f29331a;
            C13964i c13964i3 = C13964i.this;
            String str3 = cVar.f48798v;
            ErrorRequest.EnumC3699a enumC3699a3 = ErrorRequest.EnumC3699a.Network;
            cVar.f48796t = 2;
            if (C13964i.m50471g(c13964i3, str3, NetworkUtilsKt.SUBSYSTEM, enumC3699a3, null, cVar, 8, null) != objM38805e) {
                c13964i = C13964i.this;
                str = cVar.f48798v;
                enumC3699a = ErrorRequest.EnumC3699a.Other;
                cVar.f48796t = 3;
                if (C13964i.m50471g(c13964i, str, "com.withpersona.sdk2.inquiry.integrity", enumC3699a, null, cVar, 8, null) != objM38805e) {
                    C9539b c9539b3 = C13964i.this.logger;
                    cVar.f48796t = 4;
                }
            }
            return objM38805e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: zo.i$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportSessionCancelled$1", m39664f = "ErrorReportingManager.kt", m39665l = {30}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48799t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f48801v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48801v = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C13964i.this.new d(this.f48801v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f48799t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC6203w interfaceC6203w = C13964i.this.inquiryService;
                String str = this.f48801v;
                this.f48799t = 1;
                if (interfaceC6203w.m27319h(str, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C13964i(@NotNull InterfaceC6203w inquiryService, @NotNull C11888w moshi, @NotNull C9539b logger, @NotNull InterfaceC7906p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(inquiryService, "inquiryService");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.inquiryService = inquiryService;
        this.moshi = moshi;
        this.logger = logger;
        this.coroutineScope = coroutineScope;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m50471g(C13964i c13964i, String str, String str2, ErrorRequest.EnumC3699a enumC3699a, EnumC9538a enumC9538a, InterfaceC9557b interfaceC9557b, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            enumC9538a = EnumC9538a.Error;
        }
        return c13964i.m50472e(str, str2, enumC3699a, enumC9538a, interfaceC9557b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        if (r2.m27314c(r8, r4, r0) == r1) goto L29;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m50472e(String str, String str2, ErrorRequest.EnumC3699a enumC3699a, EnumC9538a enumC9538a, InterfaceC9557b<? super Unit> interfaceC9557b) {
        b bVar;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f48788A;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f48788A = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object objM37660j = bVar.f48794y;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f48788A;
        if (i11 == 0) {
            C7348o.m30470b(objM37660j);
            C9539b c9539b = this.logger;
            bVar.f48789t = str;
            bVar.f48790u = C10350l.m39676a(str2);
            bVar.f48791v = enumC3699a;
            bVar.f48792w = C10350l.m39676a(enumC9538a);
            bVar.f48788A = 1;
            objM37660j = c9539b.m37660j(str2, enumC9538a, bVar);
            if (objM37660j != objM38805e) {
            }
            return objM38805e;
        }
        if (i11 == 1) {
            enumC9538a = (EnumC9538a) bVar.f48792w;
            enumC3699a = (ErrorRequest.EnumC3699a) bVar.f48791v;
            str2 = (String) bVar.f48790u;
            str = (String) bVar.f48789t;
            C7348o.m30470b(objM37660j);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM37660j);
        }
        return Unit.f29331a;
        String str3 = (String) objM37660j;
        if (str3 != null && !StringsKt.m32182p0(str3)) {
            InterfaceC6203w interfaceC6203w = this.inquiryService;
            ErrorRequest errorRequest = new ErrorRequest(enumC3699a, this.moshi.m44436c(ErrorLog.class).toJsonValue(new ErrorLog(str3)));
            bVar.f48789t = C10350l.m39676a(str);
            bVar.f48790u = C10350l.m39676a(str2);
            bVar.f48791v = C10350l.m39676a(enumC3699a);
            bVar.f48792w = C10350l.m39676a(enumC9538a);
            bVar.f48793x = C10350l.m39676a(str3);
            bVar.f48788A = 2;
        }
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final InterfaceC7850d2 m50473f(@NotNull String sessionToken, @NotNull InternalErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        return C7882k.m32780d(this.coroutineScope, C7864g1.m32644b(), null, new a(sessionToken, errorInfo, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final InterfaceC7850d2 m50474h(@NotNull String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        return C7882k.m32780d(this.coroutineScope, C7864g1.m32644b(), null, new c(sessionToken, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final InterfaceC7850d2 m50475i(@NotNull String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        return C7882k.m32780d(this.coroutineScope, C7864g1.m32644b(), null, new d(sessionToken, null), 2, null);
    }
}
