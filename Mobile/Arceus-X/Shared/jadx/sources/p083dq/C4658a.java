package p083dq;

import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.p616lifecycle.C0967l0;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorException;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.selfie.C3957i;
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
import kn.EnumC7638a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7688j0;
import kotlin.collections.C7690k0;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mt.C8662a;
import nu.InterfaceC9566c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p059cq.InterfaceC4196a;
import p229jt.C7347n;
import p229jt.C7348o;
import p231jv.C7396x;
import p256ku.AbstractC7888l0;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p256ku.InterfaceC7934w0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p478uu.C11976g;
import p478uu.InterfaceC11970a;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: dq.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0003&$(Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\n\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u001f\u0010\u001cJ$\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0!2\u0006\u0010 \u001a\u00020\u0015H\u0082@¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R(\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f03028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R0\u0010<\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020807j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u000208`98\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R\u0016\u0010A\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010@¨\u0006B"}, m31665d2 = {"Ldq/a;", "", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcq/a;", "selfieService", "Lku/p0;", "coroutineScope", "Lku/l0;", "ioDispatcher", "", "inquiryId", "sessionToken", "stepName", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "initialPoseInfo", "", "perPoseTimeoutMs", "<init>", "(Landroidx/lifecycle/l0;Lcq/a;Lku/p0;Lku/l0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)V", "", "index", "", "n", "(I)V", "Ljt/n;", "k", "(ILnt/b;)Ljava/lang/Object;", "o", "(Lnt/b;)Ljava/lang/Object;", "m", "poseIndex", "Lku/w0;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "l", "a", "Lcq/a;", "b", "Lku/p0;", "c", "Lku/l0;", "d", "Ljava/lang/String;", "e", "f", "Luu/a;", "g", "Luu/a;", "mutex", "Lnu/c0;", "", "h", "Lnu/c0;", "indexToPoseInfo", "Ljava/util/LinkedHashMap;", "Ldq/a$c;", "Lkotlin/collections/LinkedHashMap;", "i", "Ljava/util/LinkedHashMap;", "fetchPostJobs", "j", "J", "()J", "()Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "lastPose", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4658a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4196a selfieService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7888l0 ioDispatcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String sessionToken;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String stepName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11970a mutex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public InterfaceC9566c0<Map<Integer, PoseInfo>> indexToPoseInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final LinkedHashMap<Integer, c> fetchPostJobs;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final long perPoseTimeoutMs;

    /* JADX INFO: renamed from: dq.a$b */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, m31665d2 = {"Ldq/a$b;", "", "", "inquiryId", "sessionToken", "stepName", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "initialPoseInfo", "", "perPoseTimeoutMs", "Ldq/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Ldq/a;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface b {
        @NotNull
        /* JADX INFO: renamed from: a */
        C4658a mo22918a(@NotNull String inquiryId, @NotNull String sessionToken, @NotNull String stepName, @Nullable List<PoseInfo> initialPoseInfo, @Nullable Long perPoseTimeoutMs);
    }

    /* JADX INFO: renamed from: dq.a$c */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, m31665d2 = {"Ldq/a$c;", "", "Lku/w0;", "Ljt/n;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "job", "<init>", "(Lku/w0;)V", "a", "Lku/w0;", "()Lku/w0;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC7934w0<C7347n<SelfiePoseStateResponse>> job;

        public c(@NotNull InterfaceC7934w0<C7347n<SelfiePoseStateResponse>> job) {
            Intrinsics.checkNotNullParameter(job, "job");
            this.job = job;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC7934w0<C7347n<SelfiePoseStateResponse>> m22919a() {
            return this.job;
        }
    }

    /* JADX INFO: renamed from: dq.a$d */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager", m39664f = "SelfiePoseManager.kt", m39665l = {100}, m39666m = "getPose-gIAlu-s")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public int f19094t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f19095u;

        /* JADX INFO: renamed from: w */
        public int f19097w;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19095u = obj;
            this.f19097w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM22913k = C4658a.this.m22913k(0, this);
            return objM22913k == C10047c.m38805e() ? objM22913k : C7347n.m30459a(objM22913k);
        }
    }

    /* JADX INFO: renamed from: dq.a$e */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager", m39664f = "SelfiePoseManager.kt", m39665l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 216}, m39666m = "loadNextPoseAsyncInternal")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class e extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public int f19098t;

        /* JADX INFO: renamed from: u */
        public int f19099u;

        /* JADX INFO: renamed from: v */
        public Object f19100v;

        /* JADX INFO: renamed from: w */
        public Object f19101w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f19102x;

        /* JADX INFO: renamed from: z */
        public int f19104z;

        public e(InterfaceC9557b<? super e> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19102x = obj;
            this.f19104z |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C4658a.this.m22914l(0, this);
        }
    }

    /* JADX INFO: renamed from: dq.a$f */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Ljt/n;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "<anonymous>", "(Lku/p0;)Ljt/n;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager$loadNextPoseAsyncInternal$job$1", m39664f = "SelfiePoseManager.kt", m39665l = {138}, m39666m = "invokeSuspend")
    public static final class f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C7347n<? extends SelfiePoseStateResponse>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f19105t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ int f19107v;

        /* JADX INFO: renamed from: dq.a$f$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements Comparator {
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t8, T t10) {
                return C8662a.m34743a(((SelfiePoseStateResponse.SelfiePoseState) t8).getIndex(), ((SelfiePoseStateResponse.SelfiePoseState) t10).getIndex());
            }
        }

        /* JADX INFO: renamed from: dq.a$f$b */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Ljv/x;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;", "<anonymous>", "(Lku/p0;)Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager$loadNextPoseAsyncInternal$job$1$response$1", m39664f = "SelfiePoseManager.kt", m39665l = {139}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C7396x<SelfiePoseStateResponse>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f19108t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C4658a f19109u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ int f19110v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C4658a c4658a, int i10, InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f19109u = c4658a;
                this.f19110v = i10;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new b(this.f19109u, this.f19110v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f19108t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                InterfaceC4196a interfaceC4196a = this.f19109u.selfieService;
                String str = this.f19109u.sessionToken;
                SelfiePoseStateRequest selfiePoseStateRequest = new SelfiePoseStateRequest(new SelfiePoseStateRequestData("inquiry", this.f19109u.inquiryId, new SelfiePoseStateRequestAttributes(this.f19110v, this.f19109u.stepName)));
                this.f19108t = 1;
                Object objM21695a = interfaceC4196a.m21695a(str, selfiePoseStateRequest, this);
                return objM21695a == objM38805e ? objM38805e : objM21695a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7396x<SelfiePoseStateResponse>> interfaceC9557b) {
                return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i10, InterfaceC9557b<? super f> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f19107v = i10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C4658a.this.new f(this.f19107v, interfaceC9557b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<? extends SelfiePoseStateResponse>> interfaceC9557b) {
            return invoke2(interfaceC7906p0, (InterfaceC9557b<? super C7347n<SelfiePoseStateResponse>>) interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:55:0x011c  */
        /* JADX WARN: Instruction removed from duplicated block: B:55:0x011c, please report this as an issue */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM30460b;
            EnumC7638a enumC7638aM20081c;
            Boolean complete;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f19105t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                AbstractC7888l0 abstractC7888l0 = C4658a.this.ioDispatcher;
                b bVar = new b(C4658a.this, this.f19107v, null);
                this.f19105t = 1;
                obj = C7872i.m32684g(abstractC7888l0, bVar, this);
                if (obj == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            C7396x c7396x = (C7396x) obj;
            if (c7396x.m30657g()) {
                SelfiePoseStateResponse selfiePoseStateResponse = (SelfiePoseStateResponse) c7396x.m30653a();
                if (selfiePoseStateResponse == null) {
                    C7347n.Companion companion = C7347n.INSTANCE;
                    objM30460b = C7347n.m30460b(C7348o.m30469a(new RuntimeException("Response body is null.")));
                } else {
                    List<SelfiePoseStateResponse.SelfiePoseState> listM20130b = selfiePoseStateResponse.m20130b();
                    if (listM20130b != null) {
                        List<SelfiePoseStateResponse.SelfiePoseState> list = listM20130b;
                        int i11 = this.f19107v;
                        if ((list instanceof Collection) && list.isEmpty()) {
                            C7347n.Companion companion2 = C7347n.INSTANCE;
                            objM30460b = C7347n.m30460b(C7348o.m30469a(new IllegalArgumentException("Requested pose at index " + this.f19107v + " however response did not include requested index.")));
                        } else {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Integer index = ((SelfiePoseStateResponse.SelfiePoseState) it.next()).getIndex();
                                if (index != null && index.intValue() == i11) {
                                    InterfaceC9566c0 interfaceC9566c0 = C4658a.this.indexToPoseInfo;
                                    Map mapM31809x = C7690k0.m31809x((Map) C4658a.this.indexToPoseInfo.getValue());
                                    int i12 = 0;
                                    for (SelfiePoseStateResponse.SelfiePoseState selfiePoseState : CollectionsKt.m31680F0(selfiePoseStateResponse.m20130b(), new a())) {
                                        int i13 = i12 + 1;
                                        Integer index2 = selfiePoseState.getIndex();
                                        if (index2 != null) {
                                            Integer numM39661d = C10340b.m39661d(index2.intValue());
                                            int iIntValue = selfiePoseState.getIndex().intValue();
                                            NextStep.Selfie.SelfiePose pose = selfiePoseState.getPose();
                                            if (pose != null && (enumC7638aM20081c = C3957i.m20081c(pose)) != null && (complete = selfiePoseStateResponse.getComplete()) != null) {
                                                boolean z10 = complete.booleanValue() && i12 == C7699p.m31894m(selfiePoseStateResponse.m20130b());
                                                String token = selfiePoseState.getToken();
                                                if (token != null) {
                                                    mapM31809x.put(numM39661d, new PoseInfo(iIntValue, enumC7638aM20081c, z10, token));
                                                }
                                            }
                                        }
                                        i12 = i13;
                                    }
                                    interfaceC9566c0.setValue(mapM31809x);
                                    objM30460b = C7347n.m30460b(selfiePoseStateResponse);
                                }
                            }
                            C7347n.Companion companion3 = C7347n.INSTANCE;
                            objM30460b = C7347n.m30460b(C7348o.m30469a(new IllegalArgumentException("Requested pose at index " + this.f19107v + " however response did not include requested index.")));
                        }
                    } else {
                        C7347n.Companion companion4 = C7347n.INSTANCE;
                        objM30460b = C7347n.m30460b(C7348o.m30469a(new IllegalArgumentException("Requested pose at index " + this.f19107v + " however response did not include requested index.")));
                    }
                }
            } else {
                C7347n.Companion companion5 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(new InternalErrorException(NetworkUtilsKt.toErrorInfo(c7396x))));
            }
            return C7347n.m30459a(objM30460b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<SelfiePoseStateResponse>> interfaceC9557b) {
            return ((f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: dq.a$g */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager", m39664f = "SelfiePoseManager.kt", m39665l = {123, 123}, m39666m = "loadNextPoseInternal-gIAlu-s")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class g extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public int f19111t;

        /* JADX INFO: renamed from: u */
        public Object f19112u;

        /* JADX INFO: renamed from: v */
        public Object f19113v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f19114w;

        /* JADX INFO: renamed from: y */
        public int f19116y;

        public g(InterfaceC9557b<? super g> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19114w = obj;
            this.f19116y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM22915m = C4658a.this.m22915m(0, this);
            return objM22915m == C10047c.m38805e() ? objM22915m : C7347n.m30459a(objM22915m);
        }
    }

    /* JADX INFO: renamed from: dq.a$h */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager$loadPoseAsync$1", m39664f = "SelfiePoseManager.kt", m39665l = {91}, m39666m = "invokeSuspend")
    public static final class h extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f19117t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ int f19119v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i10, InterfaceC9557b<? super h> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f19119v = i10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C4658a.this.new h(this.f19119v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f19117t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C4658a c4658a = C4658a.this;
                int i11 = this.f19119v;
                this.f19117t = 1;
                if (c4658a.m22915m(i11, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                ((C7347n) obj).getValue();
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((h) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: dq.a$i */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager", m39664f = "SelfiePoseManager.kt", m39665l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m39666m = "reset")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class i extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f19120t;

        /* JADX INFO: renamed from: u */
        public int f19121u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f19122v;

        /* JADX INFO: renamed from: x */
        public int f19124x;

        public i(InterfaceC9557b<? super i> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19122v = obj;
            this.f19124x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C4658a.this.m22917o(this);
        }
    }

    public C4658a(@NotNull C0967l0 savedStateHandle, @NotNull InterfaceC4196a selfieService, @NotNull InterfaceC7906p0 coroutineScope, @NotNull AbstractC7888l0 ioDispatcher, @NotNull String inquiryId, @NotNull String sessionToken, @NotNull String stepName, @Nullable List<PoseInfo> list, @Nullable Long l10) {
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
        this.mutex = C11976g.m44697b(false, 1, null);
        this.indexToPoseInfo = savedStateHandle.m4950e("com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseOrderManager.KEY_INDEX_TO_POSE_INFO:" + stepName, C7690k0.m31795j());
        this.fetchPostJobs = new LinkedHashMap<>();
        this.perPoseTimeoutMs = l10 != null ? l10.longValue() : 5000L;
        if (this.indexToPoseInfo.getValue().isEmpty()) {
            InterfaceC9566c0<Map<Integer, PoseInfo>> interfaceC9566c0 = this.indexToPoseInfo;
            Map mapM31788d = C7688j0.m31788d();
            if (list != null) {
                for (PoseInfo poseInfo : list) {
                    mapM31788d.put(Integer.valueOf(poseInfo.getIndex()), poseInfo);
                }
            }
            interfaceC9566c0.setValue(C7688j0.m31787c(mapM31788d));
        }
    }

    /* JADX INFO: renamed from: i */
    public final PoseInfo m22911i() {
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
    /* JADX INFO: renamed from: k */
    public final Object m22913k(int i10, @NotNull InterfaceC9557b<? super C7347n<PoseInfo>> interfaceC9557b) {
        d dVar;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i11 = dVar.f19097w;
            if ((i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f19097w = i11 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        Object obj = dVar.f19095u;
        Object objM38805e = C10047c.m38805e();
        int i12 = dVar.f19097w;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return ((C7347n) obj).getValue();
        }
        C7348o.m30470b(obj);
        dVar.f19094t = i10;
        dVar.f19097w = 1;
        Object objM22915m = m22915m(i10, dVar);
        return objM22915m == objM38805e ? objM38805e : objM22915m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m22914l(int i10, InterfaceC9557b<? super InterfaceC7934w0<C7347n<SelfiePoseStateResponse>>> interfaceC9557b) {
        e eVar;
        InterfaceC11970a interfaceC11970a;
        InterfaceC7934w0 interfaceC7934w0;
        InterfaceC11970a interfaceC11970a2;
        if (interfaceC9557b instanceof e) {
            eVar = (e) interfaceC9557b;
            int i11 = eVar.f19104z;
            if ((i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                eVar.f19104z = i11 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                eVar = new e(interfaceC9557b);
            }
        } else {
            eVar = new e(interfaceC9557b);
        }
        Object obj = eVar.f19102x;
        Object objM38805e = C10047c.m38805e();
        int i12 = eVar.f19104z;
        try {
            if (i12 == 0) {
                C7348o.m30470b(obj);
                interfaceC11970a = this.mutex;
                eVar.f19100v = interfaceC11970a;
                eVar.f19098t = i10;
                eVar.f19099u = 0;
                eVar.f19104z = 1;
                if (interfaceC11970a.mo44674f(null, eVar) != objM38805e) {
                }
                return objM38805e;
            }
            if (i12 == 1) {
                i10 = eVar.f19098t;
                interfaceC11970a = (InterfaceC11970a) eVar.f19100v;
                C7348o.m30470b(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = eVar.f19098t;
                interfaceC11970a2 = (InterfaceC11970a) eVar.f19101w;
                interfaceC7934w0 = (InterfaceC7934w0) eVar.f19100v;
                C7348o.m30470b(obj);
            }
            try {
                this.fetchPostJobs.put(C10340b.m39661d(i10), new c(interfaceC7934w0));
                Unit unit = Unit.f29331a;
                return interfaceC7934w0;
            } finally {
                interfaceC11970a2.mo44673e(null);
            }
            c cVar = this.fetchPostJobs.get(C10340b.m39661d(i10));
            if (cVar != null) {
                InterfaceC7934w0<C7347n<SelfiePoseStateResponse>> interfaceC7934w0M22919a = cVar.m22919a();
                interfaceC11970a.mo44673e(null);
                return interfaceC7934w0M22919a;
            }
            Unit unit2 = Unit.f29331a;
            interfaceC11970a.mo44673e(null);
            InterfaceC7934w0 interfaceC7934w0M32778b = C7882k.m32778b(this.coroutineScope, null, null, new f(i10, null), 3, null);
            InterfaceC11970a interfaceC11970a3 = this.mutex;
            eVar.f19100v = interfaceC7934w0M32778b;
            eVar.f19101w = interfaceC11970a3;
            eVar.f19098t = i10;
            eVar.f19099u = 0;
            eVar.f19104z = 2;
            if (interfaceC11970a3.mo44674f(null, eVar) != objM38805e) {
                interfaceC7934w0 = interfaceC7934w0M32778b;
                interfaceC11970a2 = interfaceC11970a3;
                this.fetchPostJobs.put(C10340b.m39661d(i10), new c(interfaceC7934w0));
                Unit unit3 = Unit.f29331a;
                return interfaceC7934w0;
            }
            return objM38805e;
        } catch (Throwable th2) {
            interfaceC11970a.mo44673e(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d8, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m22915m(int i10, InterfaceC9557b<? super C7347n<PoseInfo>> interfaceC9557b) {
        g gVar;
        PoseInfo poseInfoM22911i;
        PoseInfo poseInfo;
        if (interfaceC9557b instanceof g) {
            gVar = (g) interfaceC9557b;
            int i11 = gVar.f19116y;
            if ((i11 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                gVar.f19116y = i11 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                gVar = new g(interfaceC9557b);
            }
        } else {
            gVar = new g(interfaceC9557b);
        }
        Object objMo32927B = gVar.f19114w;
        Object objM38805e = C10047c.m38805e();
        int i12 = gVar.f19116y;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = gVar.f19111t;
                poseInfoM22911i = (PoseInfo) gVar.f19113v;
                poseInfo = (PoseInfo) gVar.f19112u;
                C7348o.m30470b(objMo32927B);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = gVar.f19111t;
                C7348o.m30470b(objMo32927B);
            }
            Object value = ((C7347n) objMo32927B).getValue();
            if (!C7347n.m30466h(value)) {
                return C7347n.m30460b(value);
            }
            PoseInfo poseInfo2 = this.indexToPoseInfo.getValue().get(C10340b.m39661d(i10));
            if (poseInfo2 != null) {
                return C7347n.m30460b(poseInfo2);
            }
            throw new IllegalStateException("This shouldn't be possible.");
        }
        C7348o.m30470b(objMo32927B);
        PoseInfo poseInfo3 = this.indexToPoseInfo.getValue().get(C10340b.m39661d(i10));
        if (poseInfo3 != null) {
            return C7347n.m30460b(poseInfo3);
        }
        poseInfoM22911i = m22911i();
        if (poseInfoM22911i == null || i10 <= poseInfoM22911i.getIndex()) {
            gVar.f19112u = C10350l.m39676a(poseInfo3);
            gVar.f19113v = C10350l.m39676a(poseInfoM22911i);
            gVar.f19111t = i10;
            gVar.f19116y = 1;
            Object objM22914l = m22914l(i10, gVar);
            if (objM22914l != objM38805e) {
                poseInfo = poseInfo3;
                objMo32927B = objM22914l;
            }
            return objM38805e;
        }
        C7347n.Companion companion = C7347n.INSTANCE;
        return C7347n.m30460b(C7348o.m30469a(new RuntimeException("Next pose index (" + i10 + ") out of bounds (max is " + poseInfoM22911i.getIndex() + ").")));
        gVar.f19112u = C10350l.m39676a(poseInfo);
        gVar.f19113v = C10350l.m39676a(poseInfoM22911i);
        gVar.f19111t = i10;
        gVar.f19116y = 2;
        objMo32927B = ((InterfaceC7934w0) objMo32927B).mo32927B(gVar);
    }

    /* JADX INFO: renamed from: n */
    public final void m22916n(int index) {
        if (this.indexToPoseInfo.getValue().get(Integer.valueOf(index)) != null) {
            return;
        }
        C7882k.m32780d(this.coroutineScope, null, null, new h(index, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: o */
    public final Object m22917o(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        i iVar;
        InterfaceC11970a interfaceC11970a;
        if (interfaceC9557b instanceof i) {
            iVar = (i) interfaceC9557b;
            int i10 = iVar.f19124x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                iVar.f19124x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                iVar = new i(interfaceC9557b);
            }
        } else {
            iVar = new i(interfaceC9557b);
        }
        Object obj = iVar.f19122v;
        Object objM38805e = C10047c.m38805e();
        int i11 = iVar.f19124x;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            InterfaceC11970a interfaceC11970a2 = this.mutex;
            iVar.f19120t = interfaceC11970a2;
            iVar.f19121u = 0;
            iVar.f19124x = 1;
            if (interfaceC11970a2.mo44674f(null, iVar) == objM38805e) {
                return objM38805e;
            }
            interfaceC11970a = interfaceC11970a2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC11970a = (InterfaceC11970a) iVar.f19120t;
            C7348o.m30470b(obj);
        }
        try {
            this.indexToPoseInfo.setValue(C7690k0.m31795j());
            this.fetchPostJobs.clear();
            Unit unit = Unit.f29331a;
            return Unit.f29331a;
        } finally {
            interfaceC11970a.mo44673e(null);
        }
    }
}
