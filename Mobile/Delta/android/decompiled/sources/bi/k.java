package bi;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import gt.n;
import gt.o;
import ie.q;
import iu.g1;
import iu.l0;
import iu.p0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql.Achievement;
import ql.RemoteAchievement;
import ql.v;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\nJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0013*\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0013\u0010\u0017\u001a\u00020\u0010*\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u0019"}, d2 = {"Lbi/k;", "Lql/v;", "Lda/a;", "achievementsClient", "<init>", "(Lda/a;)V", "Lql/a;", "a", "Lgt/n;", "", "(Lql/a;Llt/b;)Ljava/lang/Object;", "", "Lql/u;", "b", "(Llt/b;)Ljava/lang/Object;", "Lcom/google/android/gms/games/achievement/Achievement;", "Lbi/l;", "h", "(Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;", "Lbi/j;", "g", "(Lql/a;)Ljava/lang/String;", "f", "i", "Lda/a;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q<l, j> f4279c = new q.a().f(l.a(l.b("AchievementOneNameManyFaces")), j.a(j.b("CgkIyM-UotMBEAIQAg"))).f(l.a(bi.b.c().getRobloxId()), j.a(bi.b.c().getPlayId())).f(l.a(bi.b.b().getRobloxId()), j.a(bi.b.b().getPlayId())).f(l.a(bi.b.d().getRobloxId()), j.a(bi.b.d().getPlayId())).f(l.a(l.b("AchievementMarathon")), j.a(j.b("CgkIyM-UotMBEAIQBg"))).f(l.a(l.b("AchievementFoursCompany")), j.a(j.b("CgkIyM-UotMBEAIQBw"))).f(l.a(l.b("AchievementPollster")), j.a(j.b("CgkIyM-UotMBEAIQCA"))).f(l.a(l.b("AchievementScout")), j.a(j.b("CgkIyM-UotMBEAIQCQ"))).f(l.a(l.b("AchievementExplorer")), j.a(j.b("CgkIyM-UotMBEAIQCg"))).f(l.a(l.b("AchievementTrailblazer")), j.a(j.b("CgkIyM-UotMBEAIQCw"))).f(l.a(l.b("AchievementStrengthInNumbers")), j.a(j.b("CgkIyM-UotMBEAIQDA"))).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final da.a achievementsClient;

    @nt.f(c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository", f = "PlayStoreRemoteAchievementRepository.kt", l = {43}, m = "grantAchievement-gIAlu-s", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f4281t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f4282u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f4284w;

        public b(lt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4282u = obj;
            this.f4284w |= Integer.MIN_VALUE;
            Object objA = k.this.a(null, this);
            return objA == mt.c.e() ? objA : n.a(objA);
        }
    }

    @nt.f(c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository$grantAchievement$2", f = "PlayStoreRemoteAchievementRepository.kt", l = {46}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Lgt/n;", "", "<anonymous>", "(Liu/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
    public static final class c extends nt.m implements Function2<p0, lt.b<? super n<? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f4285t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f4286u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f4287v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f4288w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f4289x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Achievement f4291z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Achievement achievement, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f4291z = achievement;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            c cVar = k.this.new c(this.f4291z, bVar);
            cVar.f4289x = obj;
            return cVar;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, lt.b<? super n<Boolean>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            p0 p0Var = (p0) this.f4289x;
            Object objE = mt.c.e();
            int i10 = this.f4288w;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    k kVar = k.this;
                    Achievement achievement = this.f4291z;
                    n.Companion companion = n.INSTANCE;
                    String strG = kVar.g(achievement);
                    j jVarA = strG != null ? j.a(strG) : null;
                    if (jVarA == null) {
                        throw new IllegalStateException((achievement.getCodeName() + " has no mapping to Play store achievement").toString());
                    }
                    String id2 = jVarA.getId();
                    Task<Void> taskB = kVar.achievementsClient.b(id2);
                    Intrinsics.checkNotNullExpressionValue(taskB, "unlockImmediate(...)");
                    this.f4289x = nt.l.a(p0Var);
                    this.f4285t = nt.l.a(p0Var);
                    this.f4286u = nt.l.a(id2);
                    this.f4287v = 0;
                    this.f4288w = 1;
                    if (tu.b.a(taskB, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                objB = n.b(nt.b.a(true));
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                objB = n.b(o.a(th2));
            }
            Throwable thE = n.e(objB);
            if (thE != null) {
                try {
                    Log.w("rbx.achievements.playgames", "Unable to grant achievement", thE);
                    objB = n.b(nt.b.a(false));
                } catch (Throwable th3) {
                    n.Companion companion3 = n.INSTANCE;
                    objB = n.b(o.a(th3));
                }
            }
            return n.a(objB);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, lt.b<? super n<? extends Boolean>> bVar) {
            return invoke2(p0Var, (lt.b<? super n<Boolean>>) bVar);
        }
    }

    @nt.f(c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository", f = "PlayStoreRemoteAchievementRepository.kt", l = {57}, m = "listGrantedAchievements-IoAF18A", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f4292t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f4294v;

        public d(lt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4292t = obj;
            this.f4294v |= Integer.MIN_VALUE;
            Object objB = k.this.b(this);
            return objB == mt.c.e() ? objB : n.a(objB);
        }
    }

    @nt.f(c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository$listGrantedAchievements$2", f = "PlayStoreRemoteAchievementRepository.kt", l = {59}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Liu/p0;", "Lgt/n;", "", "Lql/u;", "<anonymous>", "(Liu/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
    public static final class e extends nt.m implements Function2<p0, lt.b<? super n<? extends List<? extends RemoteAchievement>>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f4295t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f4296u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f4297v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f4298w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f4299x;

        public e(lt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            e eVar = k.this.new e(bVar);
            eVar.f4299x = obj;
            return eVar;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, lt.b<? super n<? extends List<RemoteAchievement>>> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Throwable thE;
            k kVar;
            List arrayList;
            p0 p0Var = (p0) this.f4299x;
            Object objE = mt.c.e();
            int i10 = this.f4298w;
            int i11 = 0;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    k kVar2 = k.this;
                    n.Companion companion = n.INSTANCE;
                    Task<da.b<ea.a>> taskA = kVar2.achievementsClient.a(false);
                    Intrinsics.checkNotNullExpressionValue(taskA, "load(...)");
                    this.f4299x = nt.l.a(p0Var);
                    this.f4295t = kVar2;
                    this.f4296u = nt.l.a(p0Var);
                    this.f4297v = 0;
                    this.f4298w = 1;
                    Object objA = tu.b.a(taskA, this);
                    if (objA == objE) {
                        return objE;
                    }
                    kVar = kVar2;
                    obj = objA;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = (k) this.f4295t;
                    o.b(obj);
                }
                ea.a aVar = (ea.a) ((da.b) obj).a();
                if (aVar != null) {
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        for (com.google.android.gms.games.achievement.Achievement achievement : aVar) {
                            com.google.android.gms.games.achievement.Achievement achievement2 = achievement;
                            Intrinsics.checkNotNull(achievement2);
                            if (kVar.h(achievement2) != null && achievement2.getState() == 0) {
                                arrayList2.add(achievement);
                            }
                        }
                        arrayList = new ArrayList();
                        int size = arrayList2.size();
                        while (true) {
                            RemoteAchievement remoteAchievement = null;
                            if (i11 >= size) {
                                break;
                            }
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            com.google.android.gms.games.achievement.Achievement achievement3 = (com.google.android.gms.games.achievement.Achievement) obj2;
                            Intrinsics.checkNotNull(achievement3);
                            String strH = kVar.h(achievement3);
                            if (strH != null) {
                                String id2 = l.a(strH).getId();
                                Instant instantOfEpochMilli = Instant.ofEpochMilli(achievement3.d1());
                                Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                                remoteAchievement = new RemoteAchievement(id2, instantOfEpochMilli);
                            }
                            if (remoteAchievement != null) {
                                arrayList.add(remoteAchievement);
                            }
                            n.Companion companion2 = n.INSTANCE;
                            objB = n.b(o.a(th));
                            thE = n.e(objB);
                            if (thE != null) {
                                Log.w("rbx.achievements.playgames", "Unable to list Google Play Games Achievements", thE);
                                objB = n.b(p.k());
                            }
                            return n.a(objB);
                        }
                        st.c.a(aVar, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            st.c.a(aVar, th2);
                            throw th3;
                        }
                    }
                } else {
                    arrayList = p.k();
                }
                objB = n.b(arrayList);
            } catch (Throwable th4) {
                n.Companion companion3 = n.INSTANCE;
                objB = n.b(o.a(th4));
            }
            thE = n.e(objB);
            if (thE != null) {
                Log.w("rbx.achievements.playgames", "Unable to list Google Play Games Achievements", thE);
                objB = n.b(p.k());
            }
            return n.a(objB);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, lt.b<? super n<? extends List<? extends RemoteAchievement>>> bVar) {
            return invoke2(p0Var, (lt.b<? super n<? extends List<RemoteAchievement>>>) bVar);
        }
    }

    public k(@NotNull da.a achievementsClient) {
        Intrinsics.checkNotNullParameter(achievementsClient, "achievementsClient");
        this.achievementsClient = achievementsClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ql.v
    @Nullable
    public Object a(@NotNull Achievement achievement, @NotNull lt.b<? super n<Boolean>> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f4284w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f4284w = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objG = bVar2.f4282u;
        Object objE = mt.c.e();
        int i11 = bVar2.f4284w;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            c cVar = new c(achievement, null);
            bVar2.f4281t = nt.l.a(achievement);
            bVar2.f4284w = 1;
            objG = iu.i.g(l0VarB, cVar, bVar2);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(objG);
        }
        return ((n) objG).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ql.v
    @Nullable
    public Object b(@NotNull lt.b<? super n<? extends List<RemoteAchievement>>> bVar) {
        d dVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f4294v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f4294v = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object objG = dVar.f4292t;
        Object objE = mt.c.e();
        int i11 = dVar.f4294v;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            e eVar = new e(null);
            dVar.f4294v = 1;
            objG = iu.i.g(l0VarB, eVar, dVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(objG);
        }
        return ((n) objG).getValue();
    }

    public final String f(com.google.android.gms.games.achievement.Achievement achievement) {
        String strD0 = achievement.D0();
        Intrinsics.checkNotNullExpressionValue(strD0, "getAchievementId(...)");
        return j.b(strD0);
    }

    public final String g(Achievement achievement) {
        j jVar = f4279c.get(l.a(i(achievement)));
        if (jVar != null) {
            return jVar.getId();
        }
        return null;
    }

    public final String h(com.google.android.gms.games.achievement.Achievement achievement) {
        l lVar = f4279c.r().get(j.a(f(achievement)));
        if (lVar != null) {
            return lVar.getId();
        }
        return null;
    }

    public final String i(Achievement achievement) {
        return l.b(achievement.getCodeName());
    }
}
