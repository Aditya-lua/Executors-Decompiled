package mi;

import ci.j;
import gt.o;
import iu.g1;
import iu.i;
import iu.p0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import nt.l;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import rg.a1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001e\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "userId", "", "c", "(JLlt/b;)Ljava/lang/Object;", "a", "", "userIds", "b", "(Ljava/util/List;Llt/b;)Ljava/lang/Object;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {

    @nt.f(c = "com.roblox.client.job.UserJobsKt", f = "UserJobs.kt", l = {36}, m = "fetchAvatarHeadshots", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f24835t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f24836u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f24837v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f24838w;

        public a(lt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24837v = obj;
            this.f24838w |= Integer.MIN_VALUE;
            return g.b(null, this);
        }
    }

    @nt.f(c = "com.roblox.client.job.UserJobsKt$fetchUserAndHeadshot$2", f = "UserJobs.kt", l = {24}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f24839t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f24840u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f24841v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f24842w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f24843x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f24844y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ long f24845z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f24845z = j10;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new b(this.f24845z, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f24844y;
            if (i10 == 0) {
                o.b(obj);
                String strZ = a1.Z(this.f24845z);
                j jVarI = ci.c.i(strZ, null, null);
                String strA = jVarI.a();
                JSONObject jSONObject = new JSONObject(strA);
                ch.a aVar = new ch.a(jSONObject.optLong("id", -1L), jSONObject.optString("displayName"));
                ch.b.b().e(aVar);
                long j10 = this.f24845z;
                this.f24839t = l.a(strZ);
                this.f24840u = l.a(jVarI);
                this.f24841v = l.a(strA);
                this.f24842w = l.a(jSONObject);
                this.f24843x = l.a(aVar);
                this.f24844y = 1;
                if (g.a(j10, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    @Nullable
    public static final Object a(long j10, @NotNull lt.b<? super Unit> bVar) {
        Object objB = b(kotlin.collections.o.d(nt.b.e(j10)), bVar);
        return objB == mt.c.e() ? objB : Unit.f22938a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Nullable
    public static final Object b(@NotNull List<Long> list, @NotNull lt.b<? super Unit> bVar) {
        a aVar;
        ch.a aVarD;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f24838w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f24838w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        a aVar2 = aVar;
        Object objA = aVar2.f24837v;
        Object objE = mt.c.e();
        int i11 = aVar2.f24838w;
        if (i11 == 0) {
            o.b(objA);
            if (list.isEmpty()) {
                return Unit.f22938a;
            }
            String strM0 = CollectionsKt.m0(list, ",", null, null, 0, null, null, 62, null);
            xk.m mVarD = tk.g.d().d();
            aVar2.f24835t = l.a(list);
            aVar2.f24836u = l.a(strM0);
            aVar2.f24838w = 1;
            objA = mVarD.a(strM0, "150x150", "Png", false, aVar2);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(objA);
        }
        List listC = kotlin.collections.o.c();
        for (bl.a aVar3 : ((bl.b) objA).data) {
            String str = aVar3.imageUrl;
            if (str != null && str.length() != 0 && (aVarD = ch.b.b().d(aVar3.targetId)) != null) {
                aVarD.e(aVar3.imageUrl);
            }
            listC.add(nt.b.e(aVar3.targetId));
        }
        dv.c.d().j(new oh.b(new ArrayList(kotlin.collections.o.a(listC))));
        return Unit.f22938a;
    }

    @Nullable
    public static final Object c(long j10, @NotNull lt.b<? super Unit> bVar) {
        Object objG = i.g(g1.b(), new b(j10, null), bVar);
        return objG == mt.c.e() ? objG : Unit.f22938a;
    }
}
