package oi;

import ei.j;
import java.util.ArrayList;
import java.util.List;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import ku.g1;
import ku.i;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import pt.l;
import pt.m;
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001e\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "userId", "", "c", "(JLnt/b;)Ljava/lang/Object;", "a", "", "userIds", "b", "(Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {

    @pt.f(c = "com.roblox.client.job.UserJobsKt", f = "UserJobs.kt", l = {36}, m = "fetchAvatarHeadshots", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f27406t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f27407u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f27408v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f27409w;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f27408v = obj;
            this.f27409w |= Integer.MIN_VALUE;
            return g.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.job.UserJobsKt$fetchUserAndHeadshot$2", f = "UserJobs.kt", l = {24}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f27410t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f27411u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f27412v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f27413w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f27414x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f27415y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ long f27416z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f27416z = j10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f27416z, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f27415y;
            if (i10 == 0) {
                o.b(obj);
                String strZ = a1.Z(this.f27416z);
                j jVarI = ei.c.i(strZ, null, null);
                String strA = jVarI.a();
                JSONObject jSONObject = new JSONObject(strA);
                dh.a aVar = new dh.a(jSONObject.optLong("id", -1L), jSONObject.optString("displayName"));
                dh.b.b().e(aVar);
                long j10 = this.f27416z;
                this.f27410t = l.a(strZ);
                this.f27411u = l.a(jVarI);
                this.f27412v = l.a(strA);
                this.f27413w = l.a(jSONObject);
                this.f27414x = l.a(aVar);
                this.f27415y = 1;
                if (g.a(j10, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Nullable
    public static final Object a(long j10, @NotNull nt.b<? super Unit> bVar) {
        Object objB = b(kotlin.collections.o.d(pt.b.e(j10)), bVar);
        return objB == ot.c.e() ? objB : Unit.f22483a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Nullable
    public static final Object b(@NotNull List<Long> list, @NotNull nt.b<? super Unit> bVar) {
        a aVar;
        dh.a aVarD;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f27409w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f27409w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        a aVar2 = aVar;
        Object objA = aVar2.f27408v;
        Object objE = ot.c.e();
        int i11 = aVar2.f27409w;
        if (i11 == 0) {
            o.b(objA);
            if (list.isEmpty()) {
                return Unit.f22483a;
            }
            String strM0 = CollectionsKt.m0(list, ",", null, null, 0, null, null, 62, null);
            zk.m mVarE = vk.g.d().e();
            aVar2.f27406t = l.a(list);
            aVar2.f27407u = l.a(strM0);
            aVar2.f27409w = 1;
            objA = mVarE.a(strM0, "150x150", "Png", false, aVar2);
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
        for (dl.a aVar3 : ((dl.b) objA).data) {
            String str = aVar3.imageUrl;
            if (str != null && str.length() != 0 && (aVarD = dh.b.b().d(aVar3.targetId)) != null) {
                aVarD.e(aVar3.imageUrl);
            }
            listC.add(pt.b.e(aVar3.targetId));
        }
        fv.c.d().j(new ph.b(new ArrayList(kotlin.collections.o.a(listC))));
        return Unit.f22483a;
    }

    @Nullable
    public static final Object c(long j10, @NotNull nt.b<? super Unit> bVar) {
        Object objG = i.g(g1.b(), new b(j10, null), bVar);
        return objG == ot.c.e() ? objG : Unit.f22483a;
    }
}
