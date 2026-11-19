package wi;

import av.g1;
import av.i;
import av.p0;
import bh.a1;
import com.github.luben.zstd.BuildConfig;
import com.roblox.platform.http.interfaces.ThumbnailsInterface;
import gu.l;
import gu.m;
import java.util.ArrayList;
import java.util.List;
import mi.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function2;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001e\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {BuildConfig.FLAVOR, "userId", BuildConfig.FLAVOR, "c", "(JLeu/b;)Ljava/lang/Object;", "a", BuildConfig.FLAVOR, "userIds", "b", "(Ljava/util/List;Leu/b;)Ljava/lang/Object;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.job.UserJobsKt", f = "UserJobs.kt", l = {36}, m = "fetchAvatarHeadshots", v = 1)
    public static final class a extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f35841t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f35842u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f35843v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f35844w;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35843v = obj;
            this.f35844w |= Integer.MIN_VALUE;
            return g.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.job.UserJobsKt$fetchUserAndHeadshot$2", f = "UserJobs.kt", l = {24}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f35845t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f35846u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f35847v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f35848w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f35849x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f35850y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ long f35851z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f35851z = j10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new b(this.f35851z, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f35850y;
            if (i10 == 0) {
                o.b(obj);
                String strZ = a1.Z(this.f35851z);
                j jVarI = mi.c.i(strZ, null, null);
                String strA = jVarI.a();
                JSONObject jSONObject = new JSONObject(strA);
                mh.a aVar = new mh.a(jSONObject.optLong("id", -1L), jSONObject.optString("displayName"));
                mh.b.b().e(aVar);
                long j10 = this.f35851z;
                this.f35845t = l.a(strZ);
                this.f35846u = l.a(jVarI);
                this.f35847v = l.a(strA);
                this.f35848w = l.a(jSONObject);
                this.f35849x = l.a(aVar);
                this.f35850y = 1;
                if (g.a(j10, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    @Nullable
    public static final Object a(long j10, @NotNull eu.b<? super Unit> bVar) {
        Object objB = b(p001kotlin.collections.o.d(gu.b.d(j10)), bVar);
        return objB == fu.c.e() ? objB : Unit.f21506a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Nullable
    public static final Object b(@NotNull List<Long> list, @NotNull eu.b<? super Unit> bVar) {
        a aVar;
        mh.a aVarD;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f35844w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f35844w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        a aVar2 = aVar;
        Object avatarHeadshot = aVar2.f35843v;
        Object objE = fu.c.e();
        int i11 = aVar2.f35844w;
        if (i11 == 0) {
            o.b(avatarHeadshot);
            if (list.isEmpty()) {
                return Unit.f21506a;
            }
            String strM0 = CollectionsKt.m0(list, ",", null, null, 0, null, null, 62, null);
            ThumbnailsInterface thumbnailsInterfaceF = cl.g.d().f();
            aVar2.f35841t = l.a(list);
            aVar2.f35842u = l.a(strM0);
            aVar2.f35844w = 1;
            avatarHeadshot = thumbnailsInterfaceF.getAvatarHeadshot(strM0, ThumbnailsInterface.HEADSHOT_SIZE_150X150, ThumbnailsInterface.FORMAT_PNG, false, aVar2);
            if (avatarHeadshot == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(avatarHeadshot);
        }
        List listC = p001kotlin.collections.o.c();
        for (ql.a aVar3 : ((ql.b) avatarHeadshot).data) {
            String str = aVar3.imageUrl;
            if (str != null && str.length() != 0 && (aVarD = mh.b.b().d(aVar3.targetId)) != null) {
                aVarD.e(aVar3.imageUrl);
            }
            listC.add(gu.b.d(aVar3.targetId));
        }
        mw.c.d().j(new yh.b(new ArrayList(p001kotlin.collections.o.a(listC))));
        return Unit.f21506a;
    }

    @Nullable
    public static final Object c(long j10, @NotNull eu.b<? super Unit> bVar) {
        Object objG = i.g(g1.b(), new b(j10, null), bVar);
        return objG == fu.c.e() ? objG : Unit.f21506a;
    }
}
