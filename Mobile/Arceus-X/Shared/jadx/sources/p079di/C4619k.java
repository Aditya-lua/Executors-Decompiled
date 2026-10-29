package p079di;

import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.gms.tasks.Task;
import ie.AbstractC6790q;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p073da.C4498b;
import p073da.InterfaceC4497a;
import p099ea.C4892a;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p477ut.C11958c;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;
import sl.Achievement;
import sl.InterfaceC11412v;
import sl.RemoteAchievement;
import vu.C12264b;

/* JADX INFO: renamed from: di.k */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\bH\u0096@¢\u0006\u0004\b\u0007\u0010\u000eJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0013*\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u0013\u0010\u0017\u001a\u00020\u0010*\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"Ldi/k;", "Lsl/v;", "Lda/a;", "achievementsClient", "<init>", "(Lda/a;)V", "Lsl/a;", "a", "Ljt/n;", "", "b", "(Lsl/a;Lnt/b;)Ljava/lang/Object;", "", "Lsl/u;", "(Lnt/b;)Ljava/lang/Object;", "Lcom/google/android/gms/games/achievement/Achievement;", "Ldi/l;", "h", "(Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;", "Ldi/j;", "g", "(Lsl/a;)Ljava/lang/String;", "f", "i", "Lda/a;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4619k implements InterfaceC11412v {

    /* JADX INFO: renamed from: c */
    public static final AbstractC6790q<C4620l, C4618j> f18949c = new AbstractC6790q.a().mo29043f(C4620l.m22822a(C4620l.m22823b("AchievementOneNameManyFaces")), C4618j.m22806a(C4618j.m22807b("CgkIyM-UotMBEAIQAg"))).mo29043f(C4620l.m22822a(C4610b.m22765c().getRobloxId()), C4618j.m22806a(C4610b.m22765c().getPlayId())).mo29043f(C4620l.m22822a(C4610b.m22764b().getRobloxId()), C4618j.m22806a(C4610b.m22764b().getPlayId())).mo29043f(C4620l.m22822a(C4610b.m22766d().getRobloxId()), C4618j.m22806a(C4610b.m22766d().getPlayId())).mo29043f(C4620l.m22822a(C4620l.m22823b("AchievementMarathon")), C4618j.m22806a(C4618j.m22807b("CgkIyM-UotMBEAIQBg"))).mo29043f(C4620l.m22822a(C4620l.m22823b("AchievementFoursCompany")), C4618j.m22806a(C4618j.m22807b("CgkIyM-UotMBEAIQBw"))).mo29043f(C4620l.m22822a(C4620l.m22823b("AchievementPollster")), C4618j.m22806a(C4618j.m22807b("CgkIyM-UotMBEAIQCA"))).mo29043f(C4620l.m22822a(C4620l.m22823b("AchievementScout")), C4618j.m22806a(C4618j.m22807b("CgkIyM-UotMBEAIQCQ"))).mo29043f(C4620l.m22822a(C4620l.m22823b("AchievementExplorer")), C4618j.m22806a(C4618j.m22807b("CgkIyM-UotMBEAIQCg"))).mo29043f(C4620l.m22822a(C4620l.m22823b("AchievementTrailblazer")), C4618j.m22806a(C4618j.m22807b("CgkIyM-UotMBEAIQCw"))).mo29043f(C4620l.m22822a(C4620l.m22823b("AchievementStrengthInNumbers")), C4618j.m22806a(C4618j.m22807b("CgkIyM-UotMBEAIQDA"))).mo29041a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4497a achievementsClient;

    /* JADX INFO: renamed from: di.k$b */
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository", m39664f = "PlayStoreRemoteAchievementRepository.kt", m39665l = {43}, m39666m = "grantAchievement-gIAlu-s", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f18951t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f18952u;

        /* JADX INFO: renamed from: w */
        public int f18954w;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f18952u = obj;
            this.f18954w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objMo22817b = C4619k.this.mo22817b(null, this);
            return objMo22817b == C10047c.m38805e() ? objMo22817b : C7347n.m30459a(objMo22817b);
        }
    }

    /* JADX INFO: renamed from: di.k$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Ljt/n;", "", "<anonymous>", "(Lku/p0;)Ljt/n;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository$grantAchievement$2", m39664f = "PlayStoreRemoteAchievementRepository.kt", m39665l = {46}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C7347n<? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f18955t;

        /* JADX INFO: renamed from: u */
        public Object f18956u;

        /* JADX INFO: renamed from: v */
        public int f18957v;

        /* JADX INFO: renamed from: w */
        public int f18958w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f18959x;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ Achievement f18961z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Achievement achievement, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f18961z = achievement;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            c cVar = C4619k.this.new c(this.f18961z, interfaceC9557b);
            cVar.f18959x = obj;
            return cVar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<? extends Boolean>> interfaceC9557b) {
            return invoke2(interfaceC7906p0, (InterfaceC9557b<? super C7347n<Boolean>>) interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM30460b;
            InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f18959x;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f18958w;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C4619k c4619k = C4619k.this;
                    Achievement achievement = this.f18961z;
                    C7347n.Companion companion = C7347n.INSTANCE;
                    String strM22819g = c4619k.m22819g(achievement);
                    C4618j c4618jM22806a = strM22819g != null ? C4618j.m22806a(strM22819g) : null;
                    if (c4618jM22806a == null) {
                        throw new IllegalStateException((achievement.getCodeName() + " has no mapping to Play store achievement").toString());
                    }
                    String id2 = c4618jM22806a.getId();
                    Task<Void> taskMo22456b = c4619k.achievementsClient.mo22456b(id2);
                    Intrinsics.checkNotNullExpressionValue(taskMo22456b, "unlockImmediate(...)");
                    this.f18959x = C10350l.m39676a(interfaceC7906p0);
                    this.f18955t = C10350l.m39676a(interfaceC7906p0);
                    this.f18956u = C10350l.m39676a(id2);
                    this.f18957v = 0;
                    this.f18958w = 1;
                    if (C12264b.m45512a(taskMo22456b, this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                objM30460b = C7347n.m30460b(C10340b.m39658a(true));
            } catch (Throwable th2) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
            Throwable thM30463e = C7347n.m30463e(objM30460b);
            if (thM30463e != null) {
                try {
                    Log.w("rbx.achievements.playgames", "Unable to grant achievement", thM30463e);
                    objM30460b = C7347n.m30460b(C10340b.m39658a(false));
                } catch (Throwable th3) {
                    C7347n.Companion companion3 = C7347n.INSTANCE;
                    objM30460b = C7347n.m30460b(C7348o.m30469a(th3));
                }
            }
            return C7347n.m30459a(objM30460b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<Boolean>> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: di.k$d */
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository", m39664f = "PlayStoreRemoteAchievementRepository.kt", m39665l = {57}, m39666m = "listGrantedAchievements-IoAF18A", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f18962t;

        /* JADX INFO: renamed from: v */
        public int f18964v;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f18962t = obj;
            this.f18964v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objMo22816a = C4619k.this.mo22816a(this);
            return objMo22816a == C10047c.m38805e() ? objMo22816a : C7347n.m30459a(objMo22816a);
        }
    }

    /* JADX INFO: renamed from: di.k$e */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"Lku/p0;", "Ljt/n;", "", "Lsl/u;", "<anonymous>", "(Lku/p0;)Ljt/n;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.googleplaygames.PlayStoreRemoteAchievementRepository$listGrantedAchievements$2", m39664f = "PlayStoreRemoteAchievementRepository.kt", m39665l = {59}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C7347n<? extends List<? extends RemoteAchievement>>>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f18965t;

        /* JADX INFO: renamed from: u */
        public Object f18966u;

        /* JADX INFO: renamed from: v */
        public int f18967v;

        /* JADX INFO: renamed from: w */
        public int f18968w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f18969x;

        public e(InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            e eVar = C4619k.this.new e(interfaceC9557b);
            eVar.f18969x = obj;
            return eVar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<? extends List<? extends RemoteAchievement>>> interfaceC9557b) {
            return invoke2(interfaceC7906p0, (InterfaceC9557b<? super C7347n<? extends List<RemoteAchievement>>>) interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM30460b;
            Throwable thM30463e;
            C4619k c4619k;
            List arrayList;
            InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f18969x;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f18968w;
            int i11 = 0;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C4619k c4619k2 = C4619k.this;
                    C7347n.Companion companion = C7347n.INSTANCE;
                    Task<C4498b<C4892a>> taskMo22455a = c4619k2.achievementsClient.mo22455a(false);
                    Intrinsics.checkNotNullExpressionValue(taskMo22455a, "load(...)");
                    this.f18969x = C10350l.m39676a(interfaceC7906p0);
                    this.f18965t = c4619k2;
                    this.f18966u = C10350l.m39676a(interfaceC7906p0);
                    this.f18967v = 0;
                    this.f18968w = 1;
                    Object objM45512a = C12264b.m45512a(taskMo22455a, this);
                    if (objM45512a == objM38805e) {
                        return objM38805e;
                    }
                    c4619k = c4619k2;
                    obj = objM45512a;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4619k = (C4619k) this.f18965t;
                    C7348o.m30470b(obj);
                }
                C4892a c4892a = (C4892a) ((C4498b) obj).m22457a();
                if (c4892a != null) {
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        for (com.google.android.gms.games.achievement.Achievement achievement : c4892a) {
                            com.google.android.gms.games.achievement.Achievement achievement2 = achievement;
                            Intrinsics.checkNotNull(achievement2);
                            if (c4619k.m22820h(achievement2) != null && achievement2.getState() == 0) {
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
                            String strM22820h = c4619k.m22820h(achievement3);
                            if (strM22820h != null) {
                                String id2 = C4620l.m22822a(strM22820h).getId();
                                Instant instantOfEpochMilli = Instant.ofEpochMilli(achievement3.mo9420i1());
                                Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                                remoteAchievement = new RemoteAchievement(id2, instantOfEpochMilli);
                            }
                            if (remoteAchievement != null) {
                                arrayList.add(remoteAchievement);
                            }
                            C7347n.Companion companion2 = C7347n.INSTANCE;
                            objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                            thM30463e = C7347n.m30463e(objM30460b);
                            if (thM30463e != null) {
                                Log.w("rbx.achievements.playgames", "Unable to list Google Play Games Achievements", thM30463e);
                                objM30460b = C7347n.m30460b(C7699p.m31892k());
                            }
                            return C7347n.m30459a(objM30460b);
                        }
                        C11958c.m44629a(c4892a, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            C11958c.m44629a(c4892a, th2);
                            throw th3;
                        }
                    }
                } else {
                    arrayList = C7699p.m31892k();
                }
                objM30460b = C7347n.m30460b(arrayList);
            } catch (Throwable th4) {
                C7347n.Companion companion3 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th4));
            }
            thM30463e = C7347n.m30463e(objM30460b);
            if (thM30463e != null) {
                Log.w("rbx.achievements.playgames", "Unable to list Google Play Games Achievements", thM30463e);
                objM30460b = C7347n.m30460b(C7699p.m31892k());
            }
            return C7347n.m30459a(objM30460b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C7347n<? extends List<RemoteAchievement>>> interfaceC9557b) {
            return ((e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C4619k(@NotNull InterfaceC4497a achievementsClient) {
        Intrinsics.checkNotNullParameter(achievementsClient, "achievementsClient");
        this.achievementsClient = achievementsClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sl.InterfaceC11412v
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo22816a(@NotNull InterfaceC9557b<? super C7347n<? extends List<RemoteAchievement>>> interfaceC9557b) {
        d dVar;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i10 = dVar.f18964v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f18964v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        Object objM32684g = dVar.f18962t;
        Object objM38805e = C10047c.m38805e();
        int i11 = dVar.f18964v;
        if (i11 == 0) {
            C7348o.m30470b(objM32684g);
            AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
            e eVar = new e(null);
            dVar.f18964v = 1;
            objM32684g = C7872i.m32684g(abstractC7888l0M32644b, eVar, dVar);
            if (objM32684g == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM32684g);
        }
        return ((C7347n) objM32684g).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sl.InterfaceC11412v
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo22817b(@NotNull Achievement achievement, @NotNull InterfaceC9557b<? super C7347n<Boolean>> interfaceC9557b) {
        b bVar;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f18954w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f18954w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object objM32684g = bVar.f18952u;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f18954w;
        if (i11 == 0) {
            C7348o.m30470b(objM32684g);
            AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
            c cVar = new c(achievement, null);
            bVar.f18951t = C10350l.m39676a(achievement);
            bVar.f18954w = 1;
            objM32684g = C7872i.m32684g(abstractC7888l0M32644b, cVar, bVar);
            if (objM32684g == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM32684g);
        }
        return ((C7347n) objM32684g).getValue();
    }

    /* JADX INFO: renamed from: f */
    public final String m22818f(com.google.android.gms.games.achievement.Achievement achievement) {
        String strMo9416H0 = achievement.mo9416H0();
        Intrinsics.checkNotNullExpressionValue(strMo9416H0, "getAchievementId(...)");
        return C4618j.m22807b(strMo9416H0);
    }

    /* JADX INFO: renamed from: g */
    public final String m22819g(Achievement achievement) {
        C4618j c4618j = f18949c.get(C4620l.m22822a(m22821i(achievement)));
        if (c4618j != null) {
            return c4618j.getId();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final String m22820h(com.google.android.gms.games.achievement.Achievement achievement) {
        C4620l c4620l = f18949c.mo29027r().get(C4618j.m22806a(m22818f(achievement)));
        if (c4620l != null) {
            return c4620l.getId();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final String m22821i(Achievement achievement) {
        return C4620l.m22823b(achievement.getCodeName());
    }
}
