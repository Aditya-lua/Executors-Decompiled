package rq;

import av.k;
import av.l0;
import av.p0;
import av.w0;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorException;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateRequest;
import com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateRequestAttributes;
import com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateRequestData;
import com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateResponse;
import dv.c0;
import gu.l;
import gu.m;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mq.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.j0;
import p001kotlin.collections.k0;
import p001kotlin.collections.p;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import sw.x;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0003&$(Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\n\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u001f\u0010\u001cJ$\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0!2\u0006\u0010 \u001a\u00020\u0015H\u0082@¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R(\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f03028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R0\u0010<\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020807j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u000208`98\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R\u0016\u0010A\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010@¨\u0006B"}, d2 = {"Lrq/b;", BuildConfig.FLAVOR, "Landroidx/lifecycle/l0;", "savedStateHandle", "Lqq/a;", "selfieService", "Lav/p0;", "coroutineScope", "Lav/l0;", "ioDispatcher", BuildConfig.FLAVOR, "inquiryId", "sessionToken", "stepName", BuildConfig.FLAVOR, "Lrq/a;", "initialPoseInfo", BuildConfig.FLAVOR, "perPoseTimeoutMs", "<init>", "(Landroidx/lifecycle/l0;Lqq/a;Lav/p0;Lav/l0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)V", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "n", "(I)V", "Lzt/n;", "k", "(ILeu/b;)Ljava/lang/Object;", "o", "(Leu/b;)Ljava/lang/Object;", "m", "poseIndex", "Lav/w0;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "l", "a", "Lqq/a;", "b", "Lav/p0;", "c", "Lav/l0;", "d", "Ljava/lang/String;", "e", "f", "Lkv/a;", "g", "Lkv/a;", "mutex", "Ldv/c0;", BuildConfig.FLAVOR, "h", "Ldv/c0;", "indexToPoseInfo", "Ljava/util/LinkedHashMap;", "Lrq/b$c;", "Lkotlin/collections/LinkedHashMap;", "i", "Ljava/util/LinkedHashMap;", "fetchPostJobs", "j", "J", "()J", "()Lrq/a;", "lastPose", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qq.a selfieService;

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
    public final kv.a mutex;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public c0<Map<Integer, PoseInfo>> indexToPoseInfo;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LinkedHashMap<Integer, c> fetchPostJobs;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final long perPoseTimeoutMs;

    /* JADX INFO: renamed from: rq.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lrq/b$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "inquiryId", "sessionToken", "stepName", BuildConfig.FLAVOR, "Lrq/a;", "initialPoseInfo", BuildConfig.FLAVOR, "perPoseTimeoutMs", "Lrq/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Lrq/b;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC0610b {
        @NotNull
        b a(@NotNull String inquiryId, @NotNull String sessionToken, @NotNull String stepName, @Nullable List<PoseInfo> initialPoseInfo, @Nullable Long perPoseTimeoutMs);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lrq/b$c;", BuildConfig.FLAVOR, "Lav/w0;", "Lzt/n;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "job", "<init>", "(Lav/w0;)V", "a", "Lav/w0;", "()Lav/w0;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager", f = "SelfiePoseManager.kt", l = {MlKitException.MODEL_INCOMPATIBLE_WITH_TFLITE}, m = "getPose-gIAlu-s")
    public static final class d extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30886t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f30887u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f30889w;

        public d(eu.b<? super d> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30887u = obj;
            this.f30889w |= Integer.MIN_VALUE;
            Object objK = b.this.k(0, this);
            return objK == fu.c.e() ? objK : n.a(objK);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager", f = "SelfiePoseManager.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 216}, m = "loadNextPoseAsyncInternal")
    public static final class e extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30890t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f30891u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f30892v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f30893w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f30894x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f30896z;

        public e(eu.b<? super e> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30894x = obj;
            this.f30896z |= Integer.MIN_VALUE;
            return b.this.l(0, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lzt/n;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "<anonymous>", "(Lav/p0;)Lzt/n;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager$loadNextPoseAsyncInternal$job$1", f = "SelfiePoseManager.kt", l = {138}, m = "invokeSuspend")
    public static final class f extends m implements Function2<p0, eu.b<? super n<? extends SelfiePoseStateResponse>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30897t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f30899v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t8, T t10) {
                return cu.a.a(((SelfiePoseStateResponse.SelfiePoseState) t8).getIndex(), ((SelfiePoseStateResponse.SelfiePoseState) t10).getIndex());
            }
        }

        /* JADX INFO: renamed from: rq.b$f$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lsw/x;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "<anonymous>", "(Lav/p0;)Lsw/x;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager$loadNextPoseAsyncInternal$job$1$response$1", f = "SelfiePoseManager.kt", l = {139}, m = "invokeSuspend")
        public static final class C0611b extends m implements Function2<p0, eu.b<? super x<SelfiePoseStateResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f30900t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ b f30901u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ int f30902v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0611b(b bVar, int i10, eu.b<? super C0611b> bVar2) {
                super(2, bVar2);
                this.f30901u = bVar;
                this.f30902v = i10;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new C0611b(this.f30901u, this.f30902v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super x<SelfiePoseStateResponse>> bVar) {
                return ((C0611b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f30900t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                qq.a aVar = this.f30901u.selfieService;
                String str = this.f30901u.sessionToken;
                SelfiePoseStateRequest selfiePoseStateRequest = new SelfiePoseStateRequest(new SelfiePoseStateRequestData("inquiry", this.f30901u.inquiryId, new SelfiePoseStateRequestAttributes(this.f30902v, this.f30901u.stepName)));
                this.f30900t = 1;
                Object objA = aVar.a(str, selfiePoseStateRequest, this);
                return objA == objE ? objE : objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i10, eu.b<? super f> bVar) {
            super(2, bVar);
            this.f30899v = i10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return b.this.new f(this.f30899v, bVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, eu.b<? super n<SelfiePoseStateResponse>> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:55:0x011c  */
        /* JADX WARN: Instruction removed from duplicated block: B:55:0x011c, please report this as an issue */
        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            xn.a aVarC;
            Boolean complete;
            Object objE = fu.c.e();
            int i10 = this.f30897t;
            if (i10 == 0) {
                o.b(obj);
                l0 l0Var = b.this.ioDispatcher;
                C0611b c0611b = new C0611b(b.this, this.f30899v, null);
                this.f30897t = 1;
                obj = av.i.g(l0Var, c0611b, this);
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
                        int i11 = this.f30899v;
                        if ((list instanceof Collection) && list.isEmpty()) {
                            n.Companion companion2 = n.INSTANCE;
                            objB = n.b(o.a(new IllegalArgumentException("Requested pose at index " + this.f30899v + " however response did not include requested index.")));
                        } else {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Integer index = ((SelfiePoseStateResponse.SelfiePoseState) it.next()).getIndex();
                                if (index != null && index.intValue() == i11) {
                                    c0 c0Var = b.this.indexToPoseInfo;
                                    Map mapY = k0.y((Map) b.this.indexToPoseInfo.getValue());
                                    int i12 = 0;
                                    for (SelfiePoseStateResponse.SelfiePoseState selfiePoseState : CollectionsKt.F0(selfiePoseStateResponse.b(), new a())) {
                                        int i13 = i12 + 1;
                                        Integer index2 = selfiePoseState.getIndex();
                                        if (index2 != null) {
                                            Integer numC = gu.b.c(index2.intValue());
                                            int iIntValue = selfiePoseState.getIndex().intValue();
                                            NextStep.Selfie.SelfiePose pose = selfiePoseState.getPose();
                                            if (pose != null && (aVarC = m0.c(pose)) != null && (complete = selfiePoseStateResponse.getComplete()) != null) {
                                                boolean z10 = complete.booleanValue() && i12 == p.m(selfiePoseStateResponse.b());
                                                String token = selfiePoseState.getToken();
                                                if (token != null) {
                                                    mapY.put(numC, new PoseInfo(iIntValue, aVarC, z10, token));
                                                }
                                            }
                                        }
                                        i12 = i13;
                                    }
                                    c0Var.setValue(mapY);
                                    objB = n.b(selfiePoseStateResponse);
                                }
                            }
                            n.Companion companion3 = n.INSTANCE;
                            objB = n.b(o.a(new IllegalArgumentException("Requested pose at index " + this.f30899v + " however response did not include requested index.")));
                        }
                    } else {
                        n.Companion companion4 = n.INSTANCE;
                        objB = n.b(o.a(new IllegalArgumentException("Requested pose at index " + this.f30899v + " however response did not include requested index.")));
                    }
                }
            } else {
                n.Companion companion5 = n.INSTANCE;
                objB = n.b(o.a(new InternalErrorException(NetworkUtilsKt.toErrorInfo(xVar))));
            }
            return n.a(objB);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, eu.b<? super n<? extends SelfiePoseStateResponse>> bVar) {
            return invoke2(p0Var, (eu.b<? super n<SelfiePoseStateResponse>>) bVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager", f = "SelfiePoseManager.kt", l = {123, 123}, m = "loadNextPoseInternal-gIAlu-s")
    public static final class g extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30903t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f30904u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f30905v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f30906w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f30908y;

        public g(eu.b<? super g> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30906w = obj;
            this.f30908y |= Integer.MIN_VALUE;
            Object objM = b.this.m(0, this);
            return objM == fu.c.e() ? objM : n.a(objM);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager$loadPoseAsync$1", f = "SelfiePoseManager.kt", l = {91}, m = "invokeSuspend")
    public static final class h extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30909t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f30911v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i10, eu.b<? super h> bVar) {
            super(2, bVar);
            this.f30911v = i10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return b.this.new h(this.f30911v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f30909t;
            if (i10 == 0) {
                o.b(obj);
                b bVar = b.this;
                int i11 = this.f30911v;
                this.f30909t = 1;
                if (bVar.m(i11, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                ((n) obj).getValue();
            }
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager", f = "SelfiePoseManager.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "reset")
    public static final class i extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f30912t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f30913u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f30914v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f30916x;

        public i(eu.b<? super i> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30914v = obj;
            this.f30916x |= Integer.MIN_VALUE;
            return b.this.o(this);
        }
    }

    public b(@NotNull androidx.p000lifecycle.l0 savedStateHandle, @NotNull qq.a selfieService, @NotNull p0 coroutineScope, @NotNull l0 ioDispatcher, @NotNull String inquiryId, @NotNull String sessionToken, @NotNull String stepName, @Nullable List<PoseInfo> list, @Nullable Long l10) {
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
        this.mutex = kv.g.b(false, 1, null);
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
    public final Object k(int i10, @NotNull eu.b<? super n<PoseInfo>> bVar) {
        d dVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i11 = dVar.f30889w;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f30889w = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f30887u;
        Object objE = fu.c.e();
        int i12 = dVar.f30889w;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return ((n) obj).getValue();
        }
        o.b(obj);
        dVar.f30886t = i10;
        dVar.f30889w = 1;
        Object objM = m(i10, dVar);
        return objM == objE ? objE : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(int i10, eu.b<? super w0<n<SelfiePoseStateResponse>>> bVar) {
        e eVar;
        kv.a aVar;
        w0 w0Var;
        kv.a aVar2;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i11 = eVar.f30896z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f30896z = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar);
            }
        } else {
            eVar = new e(bVar);
        }
        Object obj = eVar.f30894x;
        Object objE = fu.c.e();
        int i12 = eVar.f30896z;
        try {
            if (i12 == 0) {
                o.b(obj);
                aVar = this.mutex;
                eVar.f30892v = aVar;
                eVar.f30890t = i10;
                eVar.f30891u = 0;
                eVar.f30896z = 1;
                if (aVar.d(null, eVar) != objE) {
                }
                return objE;
            }
            if (i12 == 1) {
                i10 = eVar.f30890t;
                aVar = (kv.a) eVar.f30892v;
                o.b(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = eVar.f30890t;
                aVar2 = (kv.a) eVar.f30893w;
                w0Var = (w0) eVar.f30892v;
                o.b(obj);
            }
            try {
                this.fetchPostJobs.put(gu.b.c(i10), new c(w0Var));
                Unit unit = Unit.f21506a;
                return w0Var;
            } finally {
                aVar2.f(null);
            }
            c cVar = this.fetchPostJobs.get(gu.b.c(i10));
            if (cVar != null) {
                w0<n<SelfiePoseStateResponse>> w0VarA = cVar.a();
                aVar.f(null);
                return w0VarA;
            }
            Unit unit2 = Unit.f21506a;
            aVar.f(null);
            w0 w0VarB = k.b(this.coroutineScope, null, null, new f(i10, null), 3, null);
            kv.a aVar3 = this.mutex;
            eVar.f30892v = w0VarB;
            eVar.f30893w = aVar3;
            eVar.f30890t = i10;
            eVar.f30891u = 0;
            eVar.f30896z = 2;
            if (aVar3.d(null, eVar) != objE) {
                w0Var = w0VarB;
                aVar2 = aVar3;
                this.fetchPostJobs.put(gu.b.c(i10), new c(w0Var));
                Unit unit3 = Unit.f21506a;
                return w0Var;
            }
            return objE;
        } catch (Throwable th2) {
            aVar.f(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d8, code lost:
    
        if (r9 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(int i10, eu.b<? super n<PoseInfo>> bVar) {
        g gVar;
        PoseInfo poseInfoI;
        PoseInfo poseInfo;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i11 = gVar.f30908y;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f30908y = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        Object objY = gVar.f30906w;
        Object objE = fu.c.e();
        int i12 = gVar.f30908y;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = gVar.f30903t;
                poseInfoI = (PoseInfo) gVar.f30905v;
                poseInfo = (PoseInfo) gVar.f30904u;
                o.b(objY);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = gVar.f30903t;
                o.b(objY);
            }
            Object value = ((n) objY).getValue();
            if (!n.h(value)) {
                return n.b(value);
            }
            PoseInfo poseInfo2 = this.indexToPoseInfo.getValue().get(gu.b.c(i10));
            if (poseInfo2 != null) {
                return n.b(poseInfo2);
            }
            throw new IllegalStateException("This shouldn't be possible.");
        }
        o.b(objY);
        PoseInfo poseInfo3 = this.indexToPoseInfo.getValue().get(gu.b.c(i10));
        if (poseInfo3 != null) {
            return n.b(poseInfo3);
        }
        poseInfoI = i();
        if (poseInfoI == null || i10 <= poseInfoI.getIndex()) {
            gVar.f30904u = l.a(poseInfo3);
            gVar.f30905v = l.a(poseInfoI);
            gVar.f30903t = i10;
            gVar.f30908y = 1;
            Object objL = l(i10, gVar);
            if (objL != objE) {
                poseInfo = poseInfo3;
                objY = objL;
            }
            return objE;
        }
        n.Companion companion = n.INSTANCE;
        return n.b(o.a(new RuntimeException("Next pose index (" + i10 + ") out of bounds (max is " + poseInfoI.getIndex() + ").")));
        gVar.f30904u = l.a(poseInfo);
        gVar.f30905v = l.a(poseInfoI);
        gVar.f30903t = i10;
        gVar.f30908y = 2;
        objY = ((w0) objY).y(gVar);
    }

    public final void n(int index) {
        if (this.indexToPoseInfo.getValue().get(Integer.valueOf(index)) != null) {
            return;
        }
        k.d(this.coroutineScope, null, null, new h(index, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object o(@NotNull eu.b<? super Unit> bVar) {
        i iVar;
        kv.a aVar;
        if (bVar instanceof i) {
            iVar = (i) bVar;
            int i10 = iVar.f30916x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f30916x = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(bVar);
            }
        } else {
            iVar = new i(bVar);
        }
        Object obj = iVar.f30914v;
        Object objE = fu.c.e();
        int i11 = iVar.f30916x;
        if (i11 == 0) {
            o.b(obj);
            kv.a aVar2 = this.mutex;
            iVar.f30912t = aVar2;
            iVar.f30913u = 0;
            iVar.f30916x = 1;
            if (aVar2.d(null, iVar) == objE) {
                return objE;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (kv.a) iVar.f30912t;
            o.b(obj);
        }
        try {
            this.indexToPoseInfo.setValue(k0.j());
            this.fetchPostJobs.clear();
            Unit unit = Unit.f21506a;
            return Unit.f21506a;
        } finally {
            aVar.f(null);
        }
    }
}
