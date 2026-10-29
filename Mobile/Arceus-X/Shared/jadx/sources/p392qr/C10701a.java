package p392qr;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.p057ui.network.AddressDetailsResponse;
import com.withpersona.sdk2.inquiry.p057ui.network.LocationData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import p229jt.C7348o;
import p231jv.C7396x;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: qr.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0010\u0016B!\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m31665d2 = {"Lqr/a;", "Lym/o;", "Lqr/a$b;", "Lvr/h;", "", "sessionToken", "addressId", "Lqr/c;", "uiService", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lqr/c;)V", "Lnu/h;", "run", "()Lnu/h;", "otherWorker", "", "b", "(Lym/o;)Z", "Ljava/lang/String;", "c", "d", "Lqr/c;", "a", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10701a implements InterfaceC13222o<b>, InterfaceC12257h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String addressId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC10703c uiService;

    /* JADX INFO: renamed from: qr.a$a */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, m31665d2 = {"Lqr/a$a;", "", "Lqr/c;", "uiService", "<init>", "(Lqr/c;)V", "", "sessionToken", "addressId", "Lqr/a;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lqr/a;", "Lqr/c;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC10703c uiService;

        public a(@NotNull InterfaceC10703c uiService) {
            Intrinsics.checkNotNullParameter(uiService, "uiService");
            this.uiService = uiService;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C10701a m40787a(@NotNull String sessionToken, @NotNull String addressId) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(addressId, "addressId");
            return new C10701a(sessionToken, addressId, this.uiService, null);
        }
    }

    /* JADX INFO: renamed from: qr.a$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lqr/a$b;", "", "<init>", "()V", "b", "a", "Lqr/a$b$a;", "Lqr/a$b$b;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: qr.a$b$a */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lqr/a$b$a;", "Lqr/a$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        /* JADX INFO: renamed from: qr.a$b$b, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lqr/a$b$b;", "Lqr/a$b;", "Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "result", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;)V", "a", "Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "()Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14235b extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final LocationData result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14235b(@NotNull LocationData result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final LocationData getResult() {
                return this.result;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: qr.a.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: qr.a$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lqr/a$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.network.UiAddressDetailsWorker$run$1", m39664f = "UiAddressDetailsWorker.kt", m39665l = {20, 28, 30, 41}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC9577i<? super b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f38240t;

        /* JADX INFO: renamed from: u */
        public Object f38241u;

        /* JADX INFO: renamed from: v */
        public Object f38242v;

        /* JADX INFO: renamed from: w */
        public int f38243w;

        /* JADX INFO: renamed from: x */
        public int f38244x;

        /* JADX INFO: renamed from: y */
        public int f38245y;

        /* JADX INFO: renamed from: z */
        public /* synthetic */ Object f38246z;

        /* JADX INFO: renamed from: qr.a$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Ljv/x;", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressDetailsResponse;", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.network.UiAddressDetailsWorker$run$1$1", m39664f = "UiAddressDetailsWorker.kt", m39665l = {21}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<AddressDetailsResponse>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f38247t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C10701a f38248u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C10701a c10701a, InterfaceC9557b<? super a> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f38248u = c10701a;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f38248u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f38247t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                InterfaceC10703c interfaceC10703c = this.f38248u.uiService;
                String str = this.f38248u.sessionToken;
                String str2 = this.f38248u.addressId;
                this.f38247t = 1;
                Object objM40797c = interfaceC10703c.m40797c(str, str2, this);
                return objM40797c == objM38805e ? objM38805e : objM40797c;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9557b<? super C7396x<AddressDetailsResponse>> interfaceC9557b) {
                return ((a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C10701a.this.new c(interfaceC9557b);
            cVar.f38246z = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00cd  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00f3, code lost:
        
            if (r1.emit(r6, r18) == r2) goto L33;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objEnqueueRetriableRequestWithRetry;
            NetworkCallResult networkCallResult;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f38246z;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f38245y;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                a aVar = new a(C10701a.this, null);
                this.f38246z = interfaceC9577i;
                this.f38245y = 1;
                objEnqueueRetriableRequestWithRetry = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
                if (objEnqueueRetriableRequestWithRetry != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 == 1) {
                C7348o.m30470b(obj);
                objEnqueueRetriableRequestWithRetry = obj;
            } else if (i10 == 2 || i10 == 3) {
                networkCallResult = (NetworkCallResult) this.f38240t;
                C7348o.m30470b(obj);
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                    b.a aVar2 = new b.a(networkErrorInfo);
                    this.f38246z = C10350l.m39676a(interfaceC9577i);
                    this.f38240t = networkCallResult;
                    this.f38241u = C10350l.m39676a(networkErrorInfo);
                    this.f38242v = null;
                    this.f38243w = 0;
                    this.f38244x = 0;
                    this.f38245y = 4;
                }
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
            networkCallResult = (NetworkCallResult) objEnqueueRetriableRequestWithRetry;
            if (networkCallResult instanceof NetworkCallResult.Success) {
                AddressDetailsResponse addressDetailsResponse = (AddressDetailsResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                LocationData attributes = addressDetailsResponse != null ? addressDetailsResponse.getAttributes() : null;
                if (attributes != null) {
                    b.C14235b c14235b = new b.C14235b(attributes);
                    this.f38246z = interfaceC9577i;
                    this.f38240t = networkCallResult;
                    this.f38241u = C10350l.m39676a(addressDetailsResponse);
                    this.f38242v = C10350l.m39676a(attributes);
                    this.f38243w = 0;
                    this.f38244x = 0;
                    this.f38245y = 2;
                    if (interfaceC9577i.emit(c14235b, this) != objM38805e) {
                    }
                } else {
                    b.a aVar3 = new b.a(new InternalErrorInfo.NetworkErrorInfo(0, "Expected body attributes to be non-null.", false, null, 8, null));
                    this.f38246z = interfaceC9577i;
                    this.f38240t = networkCallResult;
                    this.f38241u = C10350l.m39676a(addressDetailsResponse);
                    this.f38242v = C10350l.m39676a(attributes);
                    this.f38243w = 0;
                    this.f38244x = 0;
                    this.f38245y = 3;
                    if (interfaceC9577i.emit(aVar3, this) != objM38805e) {
                    }
                }
                return objM38805e;
            }
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                InternalErrorInfo.NetworkErrorInfo networkErrorInfo2 = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                b.a aVar4 = new b.a(networkErrorInfo2);
                this.f38246z = C10350l.m39676a(interfaceC9577i);
                this.f38240t = networkCallResult;
                this.f38241u = C10350l.m39676a(networkErrorInfo2);
                this.f38242v = null;
                this.f38243w = 0;
                this.f38244x = 0;
                this.f38245y = 4;
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super b> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String), (r3v0 qr.c) A[MD:(java.lang.String, java.lang.String, qr.c):void (m)] (LINE:1) call: qr.a.<init>(java.lang.String, java.lang.String, qr.c):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C10701a(String str, String str2, InterfaceC10703c interfaceC10703c, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, interfaceC10703c);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof C10701a) && Intrinsics.m31980c(this.addressId, ((C10701a) otherWorker).addressId);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10701a(String str, String str2, InterfaceC10703c interfaceC10703c) {
        this.sessionToken = str;
        this.addressId = str2;
        this.uiService = interfaceC10703c;
    }
}
