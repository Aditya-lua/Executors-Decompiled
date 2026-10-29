package dq;

import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorException;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateRequest;
import com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateRequestAttributes;
import com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateRequestData;
import com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateResponse;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jt.n;
import jt.o;
import jv.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.k0;
import kotlin.collections.p;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.k;
import ku.l0;
import ku.p0;
import ku.w0;
import nu.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0003&$(Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\n\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u001f\u0010\u001cJ$\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0!2\u0006\u0010 \u001a\u00020\u0015H\u0082@¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R(\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f03028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R0\u0010<\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020807j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u000208`98\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R\u0016\u0010A\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010@¨\u0006B"}, d2 = {"Ldq/a;", "", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcq/a;", "selfieService", "Lku/p0;", "coroutineScope", "Lku/l0;", "ioDispatcher", "", "inquiryId", "sessionToken", "stepName", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "initialPoseInfo", "", "perPoseTimeoutMs", "<init>", "(Landroidx/lifecycle/l0;Lcq/a;Lku/p0;Lku/l0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)V", "", "index", "", "n", "(I)V", "Ljt/n;", "k", "(ILnt/b;)Ljava/lang/Object;", "o", "(Lnt/b;)Ljava/lang/Object;", "m", "poseIndex", "Lku/w0;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "l", "a", "Lcq/a;", "b", "Lku/p0;", "c", "Lku/l0;", "d", "Ljava/lang/String;", "e", "f", "Luu/a;", "g", "Luu/a;", "mutex", "Lnu/c0;", "", "h", "Lnu/c0;", "indexToPoseInfo", "Ljava/util/LinkedHashMap;", "Ldq/a$c;", "Lkotlin/collections/LinkedHashMap;", "i", "Ljava/util/LinkedHashMap;", "fetchPostJobs", "j", "J", "()J", "()Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "lastPose", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final cq.a selfieService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 ioDispatcher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String stepName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uu.a mutex;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public c0<Map<Integer, PoseInfo>> indexToPoseInfo;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LinkedHashMap<Integer, c> fetchPostJobs;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final long perPoseTimeoutMs;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Ldq/a$b;", "", "", "inquiryId", "sessionToken", "stepName", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "initialPoseInfo", "", "perPoseTimeoutMs", "Ldq/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Ldq/a;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        @NotNull
        a a(@NotNull String inquiryId, @NotNull String sessionToken, @NotNull String stepName, @Nullable List<PoseInfo> initialPoseInfo, @Nullable Long perPoseTimeoutMs);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Ldq/a$c;", "", "Lku/w0;", "Ljt/n;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "job", "<init>", "(Lku/w0;)V", "a", "Lku/w0;", "()Lku/w0;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final w0<n<SelfiePoseStateResponse>> job;

        public c(@NotNull w0<n<SelfiePoseStateResponse>> job) {
            Intrinsics.checkNotNullParameter(job, "job");
            this.job = job;
        }

        @NotNull
        public final w0<n<SelfiePoseStateResponse>> a() {
            return this.job;
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager", f = "SelfiePoseManager.kt", l = {100}, m = "getPose-gIAlu-s")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14811t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f14812u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f14814w;

        public d(nt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14812u = obj;
            this.f14814w |= Integer.MIN_VALUE;
            Object objK = a.this.k(0, this);
            return objK == ot.c.e() ? objK : n.a(objK);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager", f = "SelfiePoseManager.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 216}, m = "loadNextPoseAsyncInternal")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14815t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f14816u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f14817v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f14818w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f14819x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f14821z;

        public e(nt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14819x = obj;
            this.f14821z |= Integer.MIN_VALUE;
            return a.this.l(0, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Ljt/n;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "<anonymous>", "(Lku/p0;)Ljt/n;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager$loadNextPoseAsyncInternal$job$1", f = "SelfiePoseManager.kt", l = {138}, m = "invokeSuspend")
    public static final class f extends m implements Function2<p0, nt.b<? super n<? extends SelfiePoseStateResponse>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14822t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f14824v;

        /* JADX INFO: renamed from: dq.a$f$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0276a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t8, T t10) {
                return mt.a.a(((SelfiePoseStateResponse.SelfiePoseState) t8).getIndex(), ((SelfiePoseStateResponse.SelfiePoseState) t10).getIndex());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Ljv/x;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "<anonymous>", "(Lku/p0;)Ljv/x;"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager$loadNextPoseAsyncInternal$job$1$response$1", f = "SelfiePoseManager.kt", l = {139}, m = "invokeSuspend")
        public static final class b extends m implements Function2<p0, nt.b<? super x<SelfiePoseStateResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f14825t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a f14826u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ int f14827v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, int i10, nt.b<? super b> bVar) {
                super(2, bVar);
                this.f14826u = aVar;
                this.f14827v = i10;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new b(this.f14826u, this.f14827v, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f14825t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                cq.a aVar = this.f14826u.selfieService;
                String str = this.f14826u.sessionToken;
                SelfiePoseStateRequest selfiePoseStateRequest = new SelfiePoseStateRequest(new SelfiePoseStateRequestData("inquiry", this.f14826u.inquiryId, new SelfiePoseStateRequestAttributes(this.f14827v, this.f14826u.stepName)));
                this.f14825t = 1;
                Object objA = aVar.a(str, selfiePoseStateRequest, this);
                return objA == objE ? objE : objA;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super x<SelfiePoseStateResponse>> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i10, nt.b<? super f> bVar) {
            super(2, bVar);
            this.f14824v = i10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return a.this.new f(this.f14824v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, nt.b<? super n<? extends SelfiePoseStateResponse>> bVar) {
            return invoke2(p0Var, (nt.b<? super n<SelfiePoseStateResponse>>) bVar);
        }

        /* JADX WARN: Code duplicated, block: B:55:0x011c  */
        /* JADX WARN: Instruction removed from duplicated block: B:55:0x011c, please report this as an issue */
        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            kn.a aVarC;
            Boolean complete;
            Object objE = ot.c.e();
            int i10 = this.f14822t;
            if (i10 == 0) {
                o.b(obj);
                l0 l0Var = a.this.ioDispatcher;
                b bVar = new b(a.this, this.f14824v, null);
                this.f14822t = 1;
                obj = ku.i.g(l0Var, bVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            x xVar = (x) obj;
            if (xVar.g()) {
                SelfiePoseStateResponse selfiePoseStateResponse = (SelfiePoseStateResponse) xVar.a();
                if (selfiePoseStateResponse == null) {
                    n.Companion companion = n.INSTANCE;
                    objB = n.b(o.a(new RuntimeException("Response body is null.")));
                } else {
                    List<SelfiePoseStateResponse.SelfiePoseState> listB = selfiePoseStateResponse.b();
                    if (listB != null) {
                        List<SelfiePoseStateResponse.SelfiePoseState> list = listB;
                        int i11 = this.f14824v;
                        if ((list instanceof Collection) && list.isEmpty()) {
                            n.Companion companion2 = n.INSTANCE;
                            objB = n.b(o.a(new IllegalArgumentException("Requested pose at index " + this.f14824v + " however response did not include requested index.")));
                        } else {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Integer index = ((SelfiePoseStateResponse.SelfiePoseState) it.next()).getIndex();
                                if (index != null && index.intValue() == i11) {
                                    c0 c0Var = a.this.indexToPoseInfo;
                                    Map mapX = k0.x((Map) a.this.indexToPoseInfo.getValue());
                                    int i12 = 0;
                                    for (SelfiePoseStateResponse.SelfiePoseState selfiePoseState : CollectionsKt.F0(selfiePoseStateResponse.b(), new C0276a())) {
                                        int i13 = i12 + 1;
                                        Integer index2 = selfiePoseState.getIndex();
                                        if (index2 != null) {
                                            Integer numD = pt.b.d(index2.intValue());
                                            int iIntValue = selfiePoseState.getIndex().intValue();
                                            NextStep.Selfie.SelfiePose pose = selfiePoseState.getPose();
                                            if (pose != null && (aVarC = com.withpersona.sdk2.inquiry.selfie.i.c(pose)) != null && (complete = selfiePoseStateResponse.getComplete()) != null) {
                                                boolean z10 = complete.booleanValue() && i12 == p.m(selfiePoseStateResponse.b());
                                                String token = selfiePoseState.getToken();
                                                if (token != null) {
                                                    mapX.put(numD, new PoseInfo(iIntValue, aVarC, z10, token));
                                                }
                                            }
                                        }
                                        i12 = i13;
                                    }
                                    c0Var.setValue(mapX);
                                    objB = n.b(selfiePoseStateResponse);
                                }
                            }
                            n.Companion companion3 = n.INSTANCE;
                            objB = n.b(o.a(new IllegalArgumentException("Requested pose at index " + this.f14824v + " however response did not include requested index.")));
                        }
                    } else {
                        n.Companion companion4 = n.INSTANCE;
                        objB = n.b(o.a(new IllegalArgumentException("Requested pose at index " + this.f14824v + " however response did not include requested index.")));
                    }
                }
            } else {
                n.Companion companion5 = n.INSTANCE;
                objB = n.b(o.a(new InternalErrorException(NetworkUtilsKt.toErrorInfo(xVar))));
            }
            return n.a(objB);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, nt.b<? super n<SelfiePoseStateResponse>> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager", f = "SelfiePoseManager.kt", l = {123, 123}, m = "loadNextPoseInternal-gIAlu-s")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14828t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f14829u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f14830v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f14831w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f14833y;

        public g(nt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14831w = obj;
            this.f14833y |= Integer.MIN_VALUE;
            Object objM = a.this.m(0, this);
            return objM == ot.c.e() ? objM : n.a(objM);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager$loadPoseAsync$1", f = "SelfiePoseManager.kt", l = {91}, m = "invokeSuspend")
    public static final class h extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14834t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f14836v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i10, nt.b<? super h> bVar) {
            super(2, bVar);
            this.f14836v = i10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return a.this.new h(this.f14836v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f14834t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                int i11 = this.f14836v;
                this.f14834t = 1;
                if (aVar.m(i11, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                ((n) obj).getValue();
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager", f = "SelfiePoseManager.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "reset")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class i extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14837t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f14838u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f14839v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f14841x;

        public i(nt.b<? super i> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14839v = obj;
            this.f14841x |= Integer.MIN_VALUE;
            return a.this.o(this);
        }
    }

    public a(@NotNull androidx.p000lifecycle.l0 savedStateHandle, @NotNull cq.a selfieService, @NotNull p0 coroutineScope, @NotNull l0 ioDispatcher, @NotNull String inquiryId, @NotNull String sessionToken, @NotNull String stepName, @Nullable List<PoseInfo> list, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(selfieService, "selfieService");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        this.selfieService = selfieService;
        this.coroutineScope = coroutineScope;
        this.ioDispatcher = ioDispatcher;
        this.inquiryId = inquiryId;
        this.sessionToken = sessionToken;
        this.stepName = stepName;
        this.mutex = uu.g.b(false, 1, null);
        this.indexToPoseInfo = savedStateHandle.e("com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseOrderManager.KEY_INDEX_TO_POSE_INFO:" + stepName, k0.j());
        this.fetchPostJobs = new LinkedHashMap<>();
        this.perPoseTimeoutMs = l10 != null ? l10.longValue() : 5000L;
        if (this.indexToPoseInfo.getValue().isEmpty()) {
            c0<Map<Integer, PoseInfo>> c0Var = this.indexToPoseInfo;
            Map mapD = j0.d();
            if (list != null) {
                for (PoseInfo poseInfo : list) {
                    mapD.put(Integer.valueOf(poseInfo.getIndex()), poseInfo);
                }
            }
            c0Var.setValue(j0.c(mapD));
        }
    }

    public final PoseInfo i() {
        Object next;
        Iterator<T> it = this.indexToPoseInfo.getValue().values().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((PoseInfo) next).getIsLast()) {
                return (PoseInfo) next;
            }
        }
        next = null;
        return (PoseInfo) next;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getPerPoseTimeoutMs() {
        return this.perPoseTimeoutMs;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object k(int i10, @NotNull nt.b<? super n<PoseInfo>> bVar) {
        d dVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i11 = dVar.f14814w;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f14814w = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f14812u;
        Object objE = ot.c.e();
        int i12 = dVar.f14814w;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return ((n) obj).getValue();
        }
        o.b(obj);
        dVar.f14811t = i10;
        dVar.f14814w = 1;
        Object objM = m(i10, dVar);
        return objM == objE ? objE : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(int i10, nt.b<? super w0<n<SelfiePoseStateResponse>>> bVar) {
        e eVar;
        uu.a aVar;
        w0 w0Var;
        uu.a aVar2;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i11 = eVar.f14821z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f14821z = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar);
            }
        } else {
            eVar = new e(bVar);
        }
        Object obj = eVar.f14819x;
        Object objE = ot.c.e();
        int i12 = eVar.f14821z;
        try {
            if (i12 == 0) {
                o.b(obj);
                aVar = this.mutex;
                eVar.f14817v = aVar;
                eVar.f14815t = i10;
                eVar.f14816u = 0;
                eVar.f14821z = 1;
                if (aVar.f(null, eVar) != objE) {
                }
                return objE;
            }
            if (i12 == 1) {
                i10 = eVar.f14815t;
                aVar = (uu.a) eVar.f14817v;
                o.b(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = eVar.f14815t;
                aVar2 = (uu.a) eVar.f14818w;
                w0Var = (w0) eVar.f14817v;
                o.b(obj);
            }
            try {
                this.fetchPostJobs.put(pt.b.d(i10), new c(w0Var));
                Unit unit = Unit.f22483a;
                return w0Var;
            } finally {
                aVar2.e(null);
            }
            c cVar = this.fetchPostJobs.get(pt.b.d(i10));
            if (cVar != null) {
                w0<n<SelfiePoseStateResponse>> w0VarA = cVar.a();
                aVar.e(null);
                return w0VarA;
            }
            Unit unit2 = Unit.f22483a;
            aVar.e(null);
            w0 w0VarB = k.b(this.coroutineScope, null, null, new f(i10, null), 3, null);
            uu.a aVar3 = this.mutex;
            eVar.f14817v = w0VarB;
            eVar.f14818w = aVar3;
            eVar.f14815t = i10;
            eVar.f14816u = 0;
            eVar.f14821z = 2;
            if (aVar3.f(null, eVar) != objE) {
                w0Var = w0VarB;
                aVar2 = aVar3;
                this.fetchPostJobs.put(pt.b.d(i10), new c(w0Var));
                Unit unit3 = Unit.f22483a;
                return w0Var;
            }
            return objE;
        } catch (Throwable th2) {
            aVar.e(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d8, code lost:
    
        if (r9 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(int r8, nt.b<? super jt.n<com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo>> r9) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dq.a.m(int, nt.b):java.lang.Object");
    }

    public final void n(int index) {
        if (this.indexToPoseInfo.getValue().get(Integer.valueOf(index)) != null) {
            return;
        }
        k.d(this.coroutineScope, null, null, new h(index, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object o(@NotNull nt.b<? super Unit> bVar) {
        i iVar;
        uu.a aVar;
        if (bVar instanceof i) {
            iVar = (i) bVar;
            int i10 = iVar.f14841x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f14841x = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(bVar);
            }
        } else {
            iVar = new i(bVar);
        }
        Object obj = iVar.f14839v;
        Object objE = ot.c.e();
        int i11 = iVar.f14841x;
        if (i11 == 0) {
            o.b(obj);
            uu.a aVar2 = this.mutex;
            iVar.f14837t = aVar2;
            iVar.f14838u = 0;
            iVar.f14841x = 1;
            if (aVar2.f(null, iVar) == objE) {
                return objE;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (uu.a) iVar.f14837t;
            o.b(obj);
        }
        try {
            this.indexToPoseInfo.setValue(k0.j());
            this.fetchPostJobs.clear();
            Unit unit = Unit.f22483a;
            return Unit.f22483a;
        } finally {
            aVar.e(null);
        }
    }
}
