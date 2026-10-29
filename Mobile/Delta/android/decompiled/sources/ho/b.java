package ho;

import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse;
import go.e;
import jv.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.i;
import nu.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.f;
import pt.m;
import vr.h;
import ym.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u000f\u0015B#\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lho/b;", "Lym/o;", "Lho/b$b;", "Lvr/h;", "", "sessionToken", "Lgo/e;", "featureFlagManager", "Lho/a;", "featureFlagService", "<init>", "(Ljava/lang/String;Lgo/e;Lho/a;)V", "Lnu/h;", "run", "()Lnu/h;", "b", "Ljava/lang/String;", "c", "Lgo/e;", "d", "Lho/a;", "a", "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements o<AbstractC0349b>, h<AbstractC0349b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e featureFlagManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ho.a featureFlagService;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lho/b$a;", "", "", "sessionToken", "Lho/b;", "create", "(Ljava/lang/String;)Lho/b;", "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        b create(@NotNull String sessionToken);
    }

    /* JADX INFO: renamed from: ho.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lho/b$b;", "", "<init>", "()V", "b", "a", "Lho/b$b$a;", "Lho/b$b$b;", "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class AbstractC0349b {

        /* JADX INFO: renamed from: ho.b$b$a */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lho/b$b$a;", "Lho/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends AbstractC0349b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f19566a = new a();

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
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lho/b$b$b;", "Lho/b$b;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "data", "<init>", "(Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "getData", "()Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "feature-flag_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success extends AbstractC0349b {

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

        public /* synthetic */ AbstractC0349b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC0349b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnu/i;", "Lho/b$b;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker$run$1", f = "FeatureFlagWorker.kt", l = {22, 31, 33}, m = "invokeSuspend")
    public static final class c extends m implements Function2<i<? super AbstractC0349b>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f19568t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f19569u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f19570v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f19571w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f19572x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f19573y;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljv/x;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "<anonymous>", "()Ljv/x;"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker$run$1$1", f = "FeatureFlagWorker.kt", l = {23}, m = "invokeSuspend")
        public static final class a extends m implements Function1<nt.b<? super x<FeatureFlagResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f19575t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ b f19576u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, nt.b<? super a> bVar2) {
                super(1, bVar2);
                this.f19576u = bVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(nt.b<?> bVar) {
                return new a(this.f19576u, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f19575t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                    return obj;
                }
                jt.o.b(obj);
                ho.a aVar = this.f19576u.featureFlagService;
                String str = this.f19576u.sessionToken;
                String[] strArr = (String[]) this.f19576u.featureFlagManager.c().a().toArray(new String[0]);
                this.f19575t = 1;
                Object objA = aVar.a(str, strArr, this);
                return objA == objE ? objE : objA;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nt.b<? super x<FeatureFlagResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            c cVar = b.this.new c(bVar);
            cVar.f19573y = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x008a  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
        
            if (r0.emit(r4, r8) == r1) goto L24;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f19573y
                nu.i r0 = (nu.i) r0
                java.lang.Object r1 = ot.c.e()
                int r2 = r8.f19572x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L3b
                if (r2 == r5) goto L37
                if (r2 == r4) goto L2b
                if (r2 != r3) goto L23
                java.lang.Object r0 = r8.f19569u
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r0 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo) r0
                java.lang.Object r0 = r8.f19568t
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r0 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r0
                jt.o.b(r9)
                goto Lae
            L23:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L2b:
                java.lang.Object r2 = r8.f19569u
                com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse r2 = (com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse) r2
                java.lang.Object r2 = r8.f19568t
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r2 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r2
                jt.o.b(r9)
                goto L86
            L37:
                jt.o.b(r9)
                goto L51
            L3b:
                jt.o.b(r9)
                ho.b$c$a r9 = new ho.b$c$a
                ho.b r2 = ho.b.this
                r7 = 0
                r9.<init>(r2, r7)
                r8.f19573y = r0
                r8.f19572x = r5
                java.lang.Object r9 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.enqueueVerificationRequestWithRetry(r9, r8)
                if (r9 != r1) goto L51
                goto Lad
            L51:
                r2 = r9
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult r2 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult) r2
                ho.b r9 = ho.b.this
                boolean r5 = r2 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success
                if (r5 == 0) goto L86
                r5 = r2
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success r5 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Success) r5
                java.lang.Object r5 = r5.getResponse()
                com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse r5 = (com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponse) r5
                go.e r9 = ho.b.d(r9)
                r9.e(r5)
                ho.b$b$b r9 = new ho.b$b$b
                r9.<init>(r5)
                r8.f19573y = r0
                r8.f19568t = r2
                java.lang.Object r5 = pt.l.a(r5)
                r8.f19569u = r5
                r8.f19570v = r6
                r8.f19571w = r6
                r8.f19572x = r4
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L86
                goto Lad
            L86:
                boolean r9 = r2 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure
                if (r9 == 0) goto Lae
                r9 = r2
                com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Failure r9 = (com.withpersona.sdk2.inquiry.network.core.NetworkCallResult.Failure) r9
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r9 = r9.getNetworkErrorInfo()
                ho.b$b$a r4 = ho.b.AbstractC0349b.a.f19566a
                java.lang.Object r5 = pt.l.a(r0)
                r8.f19573y = r5
                r8.f19568t = r2
                java.lang.Object r9 = pt.l.a(r9)
                r8.f19569u = r9
                r8.f19570v = r6
                r8.f19571w = r6
                r8.f19572x = r3
                java.lang.Object r9 = r0.emit(r4, r8)
                if (r9 != r1) goto Lae
            Lad:
                return r1
            Lae:
                kotlin.Unit r9 = kotlin.Unit.f22483a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ho.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super AbstractC0349b> iVar, nt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public b(@NotNull String sessionToken, @NotNull e featureFlagManager, @NotNull ho.a featureFlagService) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(featureFlagService, "featureFlagService");
        this.sessionToken = sessionToken;
        this.featureFlagManager = featureFlagManager;
        this.featureFlagService = featureFlagService;
    }

    @Override // vr.h
    public boolean a(@NotNull h<?> hVar) {
        return super.a(hVar);
    }

    @Override // ym.o
    public boolean b(@NotNull o<?> oVar) {
        return o.b.a(this, oVar);
    }

    @Override // vr.h
    public boolean c(@NotNull h<?> hVar) {
        return super.c(hVar);
    }

    @Override // ym.o, vr.h
    @NotNull
    public nu.h<AbstractC0349b> run() {
        return j.w(new c(null));
    }
}
