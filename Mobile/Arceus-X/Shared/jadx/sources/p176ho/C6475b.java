package p176ho;

import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
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
import org.jetbrains.annotations.Nullable;
import p152go.C6159e;
import p229jt.C7348o;
import p231jv.C7396x;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ho.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u000f\u0015B#\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m31665d2 = {"Lho/b;", "Lym/o;", "Lho/b$b;", "Lvr/h;", "", "sessionToken", "Lgo/e;", "featureFlagManager", "Lho/a;", "featureFlagService", "<init>", "(Ljava/lang/String;Lgo/e;Lho/a;)V", "Lnu/h;", "run", "()Lnu/h;", "b", "Ljava/lang/String;", "c", "Lgo/e;", "d", "Lho/a;", "a", "feature-flag_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6475b implements InterfaceC13222o<b>, InterfaceC12257h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C6159e featureFlagManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6474a featureFlagService;

    /* JADX INFO: renamed from: ho.b$a */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m31665d2 = {"Lho/b$a;", "", "", "sessionToken", "Lho/b;", "create", "(Ljava/lang/String;)Lho/b;", "feature-flag_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        C6475b create(@NotNull String sessionToken);
    }

    /* JADX INFO: renamed from: ho.b$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lho/b$b;", "", "<init>", "()V", "b", "a", "Lho/b$b$a;", "Lho/b$b$b;", "feature-flag_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: ho.b$b$a */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lho/b$b$a;", "Lho/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "feature-flag_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f24637a = new a();

            public a() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 727805021;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        /* JADX INFO: renamed from: ho.b$b$b, reason: collision with other inner class name and from toString */
        @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Lho/b$b$b;", "Lho/b$b;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "data", "<init>", "(Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "getData", "()Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "feature-flag_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Success extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @Nullable
            public final FeatureFlagResponse data;

            public Success(@Nullable FeatureFlagResponse featureFlagResponse) {
                super(null);
                this.data = featureFlagResponse;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.m31980c(this.data, ((Success) other).data);
            }

            public int hashCode() {
                FeatureFlagResponse featureFlagResponse = this.data;
                if (featureFlagResponse == null) {
                    return 0;
                }
                return featureFlagResponse.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(data=" + this.data + ")";
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: ho.b.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: ho.b$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lho/b$b;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker$run$1", m39664f = "FeatureFlagWorker.kt", m39665l = {22, 31, 33}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC9577i<? super b>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f24639t;

        /* JADX INFO: renamed from: u */
        public Object f24640u;

        /* JADX INFO: renamed from: v */
        public int f24641v;

        /* JADX INFO: renamed from: w */
        public int f24642w;

        /* JADX INFO: renamed from: x */
        public int f24643x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f24644y;

        /* JADX INFO: renamed from: ho.b$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Ljv/x;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker$run$1$1", m39664f = "FeatureFlagWorker.kt", m39665l = {23}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<FeatureFlagResponse>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f24646t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C6475b f24647u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C6475b c6475b, InterfaceC9557b<? super a> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f24647u = c6475b;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f24647u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f24646t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                InterfaceC6474a interfaceC6474a = this.f24647u.featureFlagService;
                String str = this.f24647u.sessionToken;
                String[] strArr = (String[]) this.f24647u.featureFlagManager.m27147c().m16910a().toArray(new String[0]);
                this.f24646t = 1;
                Object objM28225a = interfaceC6474a.m28225a(str, strArr, this);
                return objM28225a == objM38805e ? objM38805e : objM28225a;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9557b<? super C7396x<FeatureFlagResponse>> interfaceC9557b) {
                return ((a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C6475b.this.new c(interfaceC9557b);
            cVar.f24644y = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x008a  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
        
            if (r0.emit(r4, r8) == r1) goto L24;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            NetworkCallResult networkCallResult;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f24644y;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f24643x;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                a aVar = new a(C6475b.this, null);
                this.f24644y = interfaceC9577i;
                this.f24643x = 1;
                obj = NetworkUtilsKt.enqueueVerificationRequestWithRetry(aVar, this);
                if (obj != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 == 1) {
                C7348o.m30470b(obj);
            } else if (i10 == 2) {
                networkCallResult = (NetworkCallResult) this.f24639t;
                C7348o.m30470b(obj);
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                    b.a aVar2 = b.a.f24637a;
                    this.f24644y = C10350l.m39676a(interfaceC9577i);
                    this.f24639t = networkCallResult;
                    this.f24640u = C10350l.m39676a(networkErrorInfo);
                    this.f24641v = 0;
                    this.f24642w = 0;
                    this.f24643x = 3;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
            networkCallResult = (NetworkCallResult) obj;
            C6475b c6475b = C6475b.this;
            if (networkCallResult instanceof NetworkCallResult.Success) {
                FeatureFlagResponse featureFlagResponse = (FeatureFlagResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                c6475b.featureFlagManager.m27149e(featureFlagResponse);
                b.Success success = new b.Success(featureFlagResponse);
                this.f24644y = interfaceC9577i;
                this.f24639t = networkCallResult;
                this.f24640u = C10350l.m39676a(featureFlagResponse);
                this.f24641v = 0;
                this.f24642w = 0;
                this.f24643x = 2;
                if (interfaceC9577i.emit(success, this) != objM38805e) {
                }
                return objM38805e;
            }
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                InternalErrorInfo.NetworkErrorInfo networkErrorInfo2 = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                b.a aVar3 = b.a.f24637a;
                this.f24644y = C10350l.m39676a(interfaceC9577i);
                this.f24639t = networkCallResult;
                this.f24640u = C10350l.m39676a(networkErrorInfo2);
                this.f24641v = 0;
                this.f24642w = 0;
                this.f24643x = 3;
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

    public C6475b(@NotNull String sessionToken, @NotNull C6159e featureFlagManager, @NotNull InterfaceC6474a featureFlagService) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(featureFlagService, "featureFlagService");
        this.sessionToken = sessionToken;
        this.featureFlagManager = featureFlagManager;
        this.featureFlagService = featureFlagService;
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
