package di;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import he.q;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.l0;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;
import sl.Achievement;
import sl.RemoteAchievement;
import sl.v;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\bH\u0096@¢\u0006\u0004\b\u0007\u0010\u000eJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0013*\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0013\u0010\u0017\u001a\u00020\u0010*\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u0019"}, d2 = {"Ldi/j;", "Lsl/v;", "Lda/a;", "achievementsClient", "<init>", "(Lda/a;)V", "Lsl/a;", "a", "Ljt/n;", "", "b", "(Lsl/a;Lnt/b;)Ljava/lang/Object;", "", "Lsl/u;", "(Lnt/b;)Ljava/lang/Object;", "Lcom/google/android/gms/games/achievement/Achievement;", "Ldi/k;", "h", "(Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;", "Ldi/i;", "g", "(Lsl/a;)Ljava/lang/String;", "f", "i", "Lda/a;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q<k, i> f14687c = new q.a().f(k.a(k.b("AchievementOneNameManyFaces")), i.a(i.b("CgkIyM-UotMBEAIQAg"))).f(k.a(di.b.c().getRobloxId()), i.a(di.b.c().getPlayId())).f(k.a(di.b.b().getRobloxId()), i.a(di.b.b().getPlayId())).f(k.a(di.b.d().getRobloxId()), i.a(di.b.d().getPlayId())).f(k.a(k.b("AchievementMarathon")), i.a(i.b("CgkIyM-UotMBEAIQBg"))).f(k.a(k.b("AchievementFoursCompany")), i.a(i.b("CgkIyM-UotMBEAIQBw"))).f(k.a(k.b("AchievementPollster")), i.a(i.b("CgkIyM-UotMBEAIQCA"))).f(k.a(k.b("AchievementScout")), i.a(i.b("CgkIyM-UotMBEAIQCQ"))).f(k.a(k.b("AchievementExplorer")), i.a(i.b("CgkIyM-UotMBEAIQCg"))).f(k.a(k.b("AchievementTrailblazer")), i.a(i.b("CgkIyM-UotMBEAIQCw"))).f(k.a(k.b("AchievementStrengthInNumbers")), i.a(i.b("CgkIyM-UotMBEAIQDA"))).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final da.a achievementsClient;

    @pt.f(c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository", f = "PlayStoreRemoteAchievementRepository.kt", l = {43}, m = "grantAchievement-gIAlu-s", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14689t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f14690u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f14692w;

        public b(nt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14690u = obj;
            this.f14692w |= Integer.MIN_VALUE;
            Object objB = j.this.b(null, this);
            return objB == ot.c.e() ? objB : n.a(objB);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Ljt/n;", "", "<anonymous>", "(Lku/p0;)Ljt/n;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository$grantAchievement$2", f = "PlayStoreRemoteAchievementRepository.kt", l = {46}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, nt.b<? super n<? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14693t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f14694u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f14695v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f14696w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f14697x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Achievement f14699z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Achievement achievement, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f14699z = achievement;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            c cVar = j.this.new c(this.f14699z, bVar);
            cVar.f14697x = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, nt.b<? super n<? extends Boolean>> bVar) {
            return invoke2(p0Var, (nt.b<? super n<Boolean>>) bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            p0 p0Var = (p0) this.f14697x;
            Object objE = ot.c.e();
            int i10 = this.f14696w;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    j jVar = j.this;
                    Achievement achievement = this.f14699z;
                    n.Companion companion = n.INSTANCE;
                    String strG = jVar.g(achievement);
                    i iVarA = strG != null ? i.a(strG) : null;
                    if (iVarA == null) {
                        throw new IllegalStateException((achievement.getCodeName() + " has no mapping to Play store achievement").toString());
                    }
                    String id2 = iVarA.getId();
                    Task<Void> taskB = jVar.achievementsClient.b(id2);
                    Intrinsics.checkNotNullExpressionValue(taskB, "unlockImmediate(...)");
                    this.f14697x = pt.l.a(p0Var);
                    this.f14693t = pt.l.a(p0Var);
                    this.f14694u = pt.l.a(id2);
                    this.f14695v = 0;
                    this.f14696w = 1;
                    if (vu.b.a(taskB, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                objB = n.b(pt.b.a(true));
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                objB = n.b(o.a(th2));
            }
            Throwable thE = n.e(objB);
            if (thE != null) {
                try {
                    Log.w("rbx.achievements.playgames", "Unable to grant achievement", thE);
                    objB = n.b(pt.b.a(false));
                } catch (Throwable th3) {
                    n.Companion companion3 = n.INSTANCE;
                    objB = n.b(o.a(th3));
                }
            }
            return n.a(objB);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, nt.b<? super n<Boolean>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository", f = "PlayStoreRemoteAchievementRepository.kt", l = {57}, m = "listGrantedAchievements-IoAF18A", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f14700t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f14702v;

        public d(nt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14700t = obj;
            this.f14702v |= Integer.MIN_VALUE;
            Object objA = j.this.a(this);
            return objA == ot.c.e() ? objA : n.a(objA);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lku/p0;", "Ljt/n;", "", "Lsl/u;", "<anonymous>", "(Lku/p0;)Ljt/n;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository$listGrantedAchievements$2", f = "PlayStoreRemoteAchievementRepository.kt", l = {59}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, nt.b<? super n<? extends List<? extends RemoteAchievement>>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14703t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f14704u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f14705v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f14706w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f14707x;

        public e(nt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            e eVar = j.this.new e(bVar);
            eVar.f14707x = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, nt.b<? super n<? extends List<? extends RemoteAchievement>>> bVar) {
            return invoke2(p0Var, (nt.b<? super n<? extends List<RemoteAchievement>>>) bVar);
        }

        /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Throwable thE;
            j jVar;
            List arrayList;
            p0 p0Var = (p0) this.f14707x;
            Object objE = ot.c.e();
            int i10 = this.f14706w;
            int i11 = 0;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    j jVar2 = j.this;
                    n.Companion companion = n.INSTANCE;
                    Task<da.b<ea.a>> taskA = jVar2.achievementsClient.a(false);
                    Intrinsics.checkNotNullExpressionValue(taskA, "load(...)");
                    this.f14707x = pt.l.a(p0Var);
                    this.f14703t = jVar2;
                    this.f14704u = pt.l.a(p0Var);
                    this.f14705v = 0;
                    this.f14706w = 1;
                    Object objA = vu.b.a(taskA, this);
                    if (objA == objE) {
                        return objE;
                    }
                    jVar = jVar2;
                    obj = objA;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = (j) this.f14703t;
                    o.b(obj);
                }
                ea.a aVar = (ea.a) ((da.b) obj).a();
                if (aVar != null) {
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        for (com.google.android.gms.games.achievement.Achievement achievement : aVar) {
                            com.google.android.gms.games.achievement.Achievement achievement2 = achievement;
                            Intrinsics.checkNotNull(achievement2);
                            if (jVar.h(achievement2) != null && achievement2.getState() == 0) {
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
                            String strH = jVar.h(achievement3);
                            if (strH != null) {
                                String id2 = k.a(strH).getId();
                                Instant instantOfEpochMilli = Instant.ofEpochMilli(achievement3.h1());
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
                        ut.c.a(aVar, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ut.c.a(aVar, th2);
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

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, nt.b<? super n<? extends List<RemoteAchievement>>> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public j(@NotNull da.a achievementsClient) {
        Intrinsics.checkNotNullParameter(achievementsClient, "achievementsClient");
        this.achievementsClient = achievementsClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sl.v
    @Nullable
    public Object a(@NotNull nt.b<? super n<? extends List<RemoteAchievement>>> bVar) {
        d dVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f14702v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f14702v = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object objG = dVar.f14700t;
        Object objE = ot.c.e();
        int i11 = dVar.f14702v;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            e eVar = new e(null);
            dVar.f14702v = 1;
            objG = ku.i.g(l0VarB, eVar, dVar);
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
    @Override // sl.v
    @Nullable
    public Object b(@NotNull Achievement achievement, @NotNull nt.b<? super n<Boolean>> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f14692w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f14692w = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objG = bVar2.f14690u;
        Object objE = ot.c.e();
        int i11 = bVar2.f14692w;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            c cVar = new c(achievement, null);
            bVar2.f14689t = pt.l.a(achievement);
            bVar2.f14692w = 1;
            objG = ku.i.g(l0VarB, cVar, bVar2);
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
        String strH0 = achievement.H0();
        Intrinsics.checkNotNullExpressionValue(strH0, "getAchievementId(...)");
        return i.b(strH0);
    }

    public final String g(Achievement achievement) {
        i iVar = f14687c.get(k.a(i(achievement)));
        if (iVar != null) {
            return iVar.getId();
        }
        return null;
    }

    public final String h(com.google.android.gms.games.achievement.Achievement achievement) {
        k kVar = f14687c.r().get(i.a(f(achievement)));
        if (kVar != null) {
            return kVar.getId();
        }
        return null;
    }

    public final String i(Achievement achievement) {
        return k.b(achievement.getCodeName());
    }
}
