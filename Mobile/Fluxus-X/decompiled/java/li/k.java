package li;

import android.util.Log;
import av.g1;
import av.l0;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.Task;
import gm.Achievement;
import gm.RemoteAchievement;
import gm.v;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import ke.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.p;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\nJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0013*\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0013\u0010\u0017\u001a\u00020\u0010*\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u0019"}, d2 = {"Lli/k;", "Lgm/v;", "Lea/a;", "achievementsClient", "<init>", "(Lea/a;)V", "Lgm/a;", "a", "Lzt/n;", BuildConfig.FLAVOR, "(Lgm/a;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "Lgm/u;", "b", "(Leu/b;)Ljava/lang/Object;", "Lfa/a;", "Lli/l;", "h", "(Lfa/a;)Ljava/lang/String;", "Lli/j;", "g", "(Lgm/a;)Ljava/lang/String;", "f", "i", "Lea/a;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q<l, j> f22223c = new q.a().f(l.a(l.b("AchievementOneNameManyFaces")), j.a(j.b("CgkIyM-UotMBEAIQAg"))).f(l.a(li.b.c().getRobloxId()), j.a(li.b.c().getPlayId())).f(l.a(li.b.b().getRobloxId()), j.a(li.b.b().getPlayId())).f(l.a(li.b.d().getRobloxId()), j.a(li.b.d().getPlayId())).f(l.a(l.b("AchievementMarathon")), j.a(j.b("CgkIyM-UotMBEAIQBg"))).f(l.a(l.b("AchievementFoursCompany")), j.a(j.b("CgkIyM-UotMBEAIQBw"))).f(l.a(l.b("AchievementPollster")), j.a(j.b("CgkIyM-UotMBEAIQCA"))).f(l.a(l.b("AchievementScout")), j.a(j.b("CgkIyM-UotMBEAIQCQ"))).f(l.a(l.b("AchievementExplorer")), j.a(j.b("CgkIyM-UotMBEAIQCg"))).f(l.a(l.b("AchievementTrailblazer")), j.a(j.b("CgkIyM-UotMBEAIQCw"))).f(l.a(l.b("AchievementStrengthInNumbers")), j.a(j.b("CgkIyM-UotMBEAIQDA"))).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ea.a achievementsClient;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository", f = "PlayStoreRemoteAchievementRepository.kt", l = {43}, m = "grantAchievement-gIAlu-s", v = 1)
    public static final class b extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f22225t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f22226u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f22228w;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22226u = obj;
            this.f22228w |= Integer.MIN_VALUE;
            Object objA = k.this.a(null, this);
            return objA == fu.c.e() ? objA : n.a(objA);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lzt/n;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Lzt/n;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository$grantAchievement$2", f = "PlayStoreRemoteAchievementRepository.kt", l = {46}, m = "invokeSuspend", v = 1)
    public static final class c extends gu.m implements Function2<p0, eu.b<? super n<? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f22229t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f22230u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f22231v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f22232w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f22233x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Achievement f22235z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Achievement achievement, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f22235z = achievement;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = k.this.new c(this.f22235z, bVar);
            cVar.f22233x = obj;
            return cVar;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, eu.b<? super n<Boolean>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            p0 p0Var = (p0) this.f22233x;
            Object objE = fu.c.e();
            int i10 = this.f22232w;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    k kVar = k.this;
                    Achievement achievement = this.f22235z;
                    n.Companion companion = n.INSTANCE;
                    String strG = kVar.g(achievement);
                    j jVarA = strG != null ? j.a(strG) : null;
                    if (jVarA == null) {
                        throw new IllegalStateException((achievement.getCodeName() + " has no mapping to Play store achievement").toString());
                    }
                    String id2 = jVarA.getId();
                    Task<Void> taskB = kVar.achievementsClient.b(id2);
                    Intrinsics.checkNotNullExpressionValue(taskB, "unlockImmediate(...)");
                    this.f22233x = gu.l.a(p0Var);
                    this.f22229t = gu.l.a(p0Var);
                    this.f22230u = gu.l.a(id2);
                    this.f22231v = 0;
                    this.f22232w = 1;
                    if (lv.b.a(taskB, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                objB = n.b(gu.b.a(true));
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                objB = n.b(o.a(th2));
            }
            Throwable thE = n.e(objB);
            if (thE != null) {
                try {
                    Log.w("rbx.achievements.playgames", "Unable to grant achievement", thE);
                    objB = n.b(gu.b.a(false));
                } catch (Throwable th3) {
                    n.Companion companion3 = n.INSTANCE;
                    objB = n.b(o.a(th3));
                }
            }
            return n.a(objB);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, eu.b<? super n<? extends Boolean>> bVar) {
            return invoke2(p0Var, (eu.b<? super n<Boolean>>) bVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository", f = "PlayStoreRemoteAchievementRepository.kt", l = {57}, m = "listGrantedAchievements-IoAF18A", v = 1)
    public static final class d extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f22236t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f22238v;

        public d(eu.b<? super d> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22236t = obj;
            this.f22238v |= Integer.MIN_VALUE;
            Object objB = k.this.b(this);
            return objB == fu.c.e() ? objB : n.a(objB);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lav/p0;", "Lzt/n;", BuildConfig.FLAVOR, "Lgm/u;", "<anonymous>", "(Lav/p0;)Lzt/n;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository$listGrantedAchievements$2", f = "PlayStoreRemoteAchievementRepository.kt", l = {59}, m = "invokeSuspend", v = 1)
    public static final class e extends gu.m implements Function2<p0, eu.b<? super n<? extends List<? extends RemoteAchievement>>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f22239t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f22240u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f22241v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f22242w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f22243x;

        public e(eu.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            e eVar = k.this.new e(bVar);
            eVar.f22243x = obj;
            return eVar;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, eu.b<? super n<? extends List<RemoteAchievement>>> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Throwable thE;
            k kVar;
            List arrayList;
            p0 p0Var = (p0) this.f22243x;
            Object objE = fu.c.e();
            int i10 = this.f22242w;
            int i11 = 0;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    k kVar2 = k.this;
                    n.Companion companion = n.INSTANCE;
                    Task<ea.b<fa.b>> taskA = kVar2.achievementsClient.a(false);
                    Intrinsics.checkNotNullExpressionValue(taskA, "load(...)");
                    this.f22243x = gu.l.a(p0Var);
                    this.f22239t = kVar2;
                    this.f22240u = gu.l.a(p0Var);
                    this.f22241v = 0;
                    this.f22242w = 1;
                    Object objA = lv.b.a(taskA, this);
                    if (objA == objE) {
                        return objE;
                    }
                    kVar = kVar2;
                    obj = objA;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = (k) this.f22239t;
                    o.b(obj);
                }
                fa.b bVar = (fa.b) ((ea.b) obj).a();
                if (bVar != null) {
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        for (fa.a aVar : bVar) {
                            fa.a aVar2 = aVar;
                            Intrinsics.checkNotNull(aVar2);
                            if (kVar.h(aVar2) != null && aVar2.getState() == 0) {
                                arrayList2.add(aVar);
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
                            fa.a aVar3 = (fa.a) obj2;
                            Intrinsics.checkNotNull(aVar3);
                            String strH = kVar.h(aVar3);
                            if (strH != null) {
                                String id2 = l.a(strH).getId();
                                Instant instantOfEpochMilli = Instant.ofEpochMilli(aVar3.g1());
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
                        lu.c.a(bVar, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            lu.c.a(bVar, th2);
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

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, eu.b<? super n<? extends List<? extends RemoteAchievement>>> bVar) {
            return invoke2(p0Var, (eu.b<? super n<? extends List<RemoteAchievement>>>) bVar);
        }
    }

    public k(@NotNull ea.a achievementsClient) {
        Intrinsics.checkNotNullParameter(achievementsClient, "achievementsClient");
        this.achievementsClient = achievementsClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gm.v
    @Nullable
    public Object a(@NotNull Achievement achievement, @NotNull eu.b<? super n<Boolean>> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f22228w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f22228w = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objG = bVar2.f22226u;
        Object objE = fu.c.e();
        int i11 = bVar2.f22228w;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            c cVar = new c(achievement, null);
            bVar2.f22225t = gu.l.a(achievement);
            bVar2.f22228w = 1;
            objG = av.i.g(l0VarB, cVar, bVar2);
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
    @Override // gm.v
    @Nullable
    public Object b(@NotNull eu.b<? super n<? extends List<RemoteAchievement>>> bVar) {
        d dVar;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f22238v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f22238v = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object objG = dVar.f22236t;
        Object objE = fu.c.e();
        int i11 = dVar.f22238v;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            e eVar = new e(null);
            dVar.f22238v = 1;
            objG = av.i.g(l0VarB, eVar, dVar);
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

    public final String f(fa.a aVar) {
        String strI0 = aVar.I0();
        Intrinsics.checkNotNullExpressionValue(strI0, "getAchievementId(...)");
        return j.b(strI0);
    }

    public final String g(Achievement achievement) {
        j jVar = f22223c.get(l.a(i(achievement)));
        if (jVar != null) {
            return jVar.getId();
        }
        return null;
    }

    public final String h(fa.a aVar) {
        l lVar = f22223c.r().get(j.a(f(aVar)));
        if (lVar != null) {
            return lVar.getId();
        }
        return null;
    }

    public final String i(Achievement achievement) {
        return l.b(achievement.getCodeName());
    }
}
