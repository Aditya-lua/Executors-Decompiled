package uo;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import dv.h;
import dv.i;
import gu.f;
import gu.l;
import gu.m;
import ln.o;
import ls.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import sw.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u000f\u0015B#\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Luo/c;", "Lln/o;", "Luo/c$b;", "Lls/j;", BuildConfig.FLAVOR, "sessionToken", "Lto/e;", "featureFlagManager", "Luo/b;", "featureFlagService", "<init>", "(Ljava/lang/String;Lto/e;Luo/b;)V", "Ldv/h;", "run", "()Ldv/h;", "b", "Ljava/lang/String;", "c", "Lto/e;", "d", "Luo/b;", "a", "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements o<b>, j<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final to.e featureFlagManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uo.b featureFlagService;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Luo/c$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "sessionToken", "Luo/c;", "create", "(Ljava/lang/String;)Luo/c;", "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        c create(@NotNull String sessionToken);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Luo/c$b;", BuildConfig.FLAVOR, "<init>", "()V", "b", "a", "Luo/c$b$a;", "Luo/c$b$b;", "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Luo/c$b$a;", "Luo/c$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f33782a = new a();

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

        /* JADX INFO: renamed from: uo.c$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Luo/c$b$b;", "Luo/c$b;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "data", "<init>", "(Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "getData", "()Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
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
                return (other instanceof Success) && Intrinsics.c(this.data, ((Success) other).data);
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

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: uo.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Luo/c$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker$run$1", f = "FeatureFlagWorker.kt", l = {22, 31, 33}, m = "invokeSuspend")
    public static final class C0690c extends m implements Function2<i<? super b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33784t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33785u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f33786v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f33787w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f33788x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f33789y;

        /* JADX INFO: renamed from: uo.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker$run$1$1", f = "FeatureFlagWorker.kt", l = {23}, m = "invokeSuspend")
        public static final class a extends m implements Function1<eu.b<? super x<FeatureFlagResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f33791t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ c f33792u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, eu.b<? super a> bVar) {
                super(1, bVar);
                this.f33792u = cVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new a(this.f33792u, bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f33791t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return obj;
                }
                zt.o.b(obj);
                uo.b bVar = this.f33792u.featureFlagService;
                String str = this.f33792u.sessionToken;
                String[] strArr = (String[]) this.f33792u.featureFlagManager.c().a().toArray(new String[0]);
                this.f33791t = 1;
                Object objA = bVar.a(str, strArr, this);
                return objA == objE ? objE : objA;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super x<FeatureFlagResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        public C0690c(eu.b<? super C0690c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            C0690c c0690c = c.this.new C0690c(bVar);
            c0690c.f33789y = obj;
            return c0690c;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x008a  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
        
            if (r0.emit(r4, r8) == r1) goto L24;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            NetworkCallResult networkCallResult;
            i iVar = (i) this.f33789y;
            Object objE = fu.c.e();
            int i10 = this.f33788x;
            if (i10 == 0) {
                zt.o.b(obj);
                a aVar = new a(c.this, null);
                this.f33789y = iVar;
                this.f33788x = 1;
                obj = NetworkUtilsKt.enqueueVerificationRequestWithRetry(aVar, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i10 == 1) {
                zt.o.b(obj);
            } else if (i10 == 2) {
                networkCallResult = (NetworkCallResult) this.f33784t;
                zt.o.b(obj);
                if (networkCallResult instanceof NetworkCallResult.Failure) {
                    InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                    b.a aVar2 = b.a.f33782a;
                    this.f33789y = l.a(iVar);
                    this.f33784t = networkCallResult;
                    this.f33785u = l.a(networkErrorInfo);
                    this.f33786v = 0;
                    this.f33787w = 0;
                    this.f33788x = 3;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
            networkCallResult = (NetworkCallResult) obj;
            c cVar = c.this;
            if (networkCallResult instanceof NetworkCallResult.Success) {
                FeatureFlagResponse featureFlagResponse = (FeatureFlagResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                cVar.featureFlagManager.e(featureFlagResponse);
                b.Success success = new b.Success(featureFlagResponse);
                this.f33789y = iVar;
                this.f33784t = networkCallResult;
                this.f33785u = l.a(featureFlagResponse);
                this.f33786v = 0;
                this.f33787w = 0;
                this.f33788x = 2;
                if (iVar.emit(success, this) != objE) {
                }
                return objE;
            }
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                InternalErrorInfo.NetworkErrorInfo networkErrorInfo2 = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                b.a aVar3 = b.a.f33782a;
                this.f33789y = l.a(iVar);
                this.f33784t = networkCallResult;
                this.f33785u = l.a(networkErrorInfo2);
                this.f33786v = 0;
                this.f33787w = 0;
                this.f33788x = 3;
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((C0690c) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public c(@NotNull String sessionToken, @NotNull to.e featureFlagManager, @NotNull uo.b featureFlagService) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(featureFlagService, "featureFlagService");
        this.sessionToken = sessionToken;
        this.featureFlagManager = featureFlagManager;
        this.featureFlagService = featureFlagService;
    }

    @Override // ln.o
    public boolean a(@NotNull o<?> oVar) {
        return o.b.a(this, oVar);
    }

    @Override // ls.j
    public boolean b(@NotNull j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull j<?> jVar) {
        return super.c(jVar);
    }

    @Override // ln.o, ls.j
    @NotNull
    public h<b> run() {
        return dv.j.w(new C0690c(null));
    }
}
