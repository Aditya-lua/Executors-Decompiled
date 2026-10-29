package com.roblox.universalapp.achievement;

import c5.n;
import hu.c;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jt.l;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sl.Achievement;
import sl.LocalAchievement;
import sl.RemoteAchievement;
import sl.j;
import sl.m;
import x4.f;
import x4.u;
import z4.k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010!\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aH\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010-¨\u00063"}, d2 = {"Lcom/roblox/universalapp/achievement/a;", "Lsl/b;", "Lx4/u;", "__db", "<init>", "(Lx4/u;)V", "Lsl/l;", "localAchievement", "", "f", "(Lsl/l;Lnt/b;)Ljava/lang/Object;", "", "Lsl/u;", "remoteAchievements", "", "e", "(Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "i", "Lsl/a;", "g", "(Lnt/b;)Ljava/lang/Object;", "", "highWatermarkId", "Lnu/h;", "c", "(I)Lnu/h;", "", "codeName", "h", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "codeNames", "Ljava/time/Instant;", "syncedAt", "d", "(Ljava/util/List;Ljava/time/Instant;Lnt/b;)Ljava/lang/Object;", "Lsl/m;", "_value", "p", "(Lsl/m;)Ljava/lang/String;", "q", "(Ljava/lang/String;)Lsl/m;", "a", "Lx4/u;", "Lx4/f;", "b", "Lx4/f;", "__insertAdapterOfLocalAchievementAsAchievement", "Lsl/j;", "Lsl/j;", "__converters", "__insertAdapterOfRemoteAchievementAsAchievement", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements sl.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final u __db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final f<LocalAchievement> __insertAdapterOfLocalAchievementAsAchievement;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j __converters;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f<RemoteAchievement> __insertAdapterOfRemoteAchievementAsAchievement;

    /* JADX INFO: renamed from: com.roblox.universalapp.achievement.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/roblox/universalapp/achievement/a$a", "Lx4/f;", "Lsl/l;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Lsl/l;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0154a extends f<LocalAchievement> {
        public C0154a() {
        }

        @Override // x4.f
        public String b() {
            return "INSERT OR IGNORE INTO `achievements` (`code_name`,`created_ts`,`origin`) VALUES (?,?,?)";
        }

        @Override // x4.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, LocalAchievement entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.k0(1, entity.getCodeName());
            Long lB = a.this.__converters.b(entity.getCreatedTs());
            if (lB == null) {
                statement.C(2);
            } else {
                statement.z(2, lB.longValue());
            }
            statement.k0(3, a.this.p(entity.getOrigin()));
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/roblox/universalapp/achievement/a$b", "Lx4/f;", "Lsl/u;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Lsl/u;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends f<RemoteAchievement> {
        public b() {
        }

        @Override // x4.f
        public String b() {
            return "INSERT OR IGNORE INTO `achievements` (`code_name`,`synced_ts`,`origin`,`created_ts`) VALUES (?,?,?,?)";
        }

        @Override // x4.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, RemoteAchievement entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.k0(1, entity.getCodeName());
            Long lB = a.this.__converters.b(entity.getSyncedTs());
            if (lB == null) {
                statement.C(2);
            } else {
                statement.z(2, lB.longValue());
            }
            statement.k0(3, a.this.p(entity.getOrigin()));
            Long lB2 = a.this.__converters.b(entity.getCreatedTs());
            if (lB2 == null) {
                statement.C(4);
            } else {
                statement.z(4, lB2.longValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.achievement.a$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/roblox/universalapp/achievement/a$c;", "", "<init>", "()V", "", "Lhu/c;", "a", "()Ljava/util/List;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<c<?>> a() {
            return p.k();
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9770a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.REMOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9770a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.roblox.universalapp.achievement.AchievementDao_Impl$replicateRemoteAchievements$2", f = "AchievementDao_Impl.kt", l = {87}, m = "invokeSuspend", v = 1)
    public static final class e extends pt.m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9771t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ List<RemoteAchievement> f9773v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<RemoteAchievement> list, nt.b<? super e> bVar) {
            super(1, bVar);
            this.f9773v = list;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return a.this.new e(this.f9773v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f9771t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                List<RemoteAchievement> list = this.f9773v;
                this.f9771t = 1;
                if (a.super.i(list, this) == objE) {
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

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public a(@NotNull u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__converters = new j();
        this.__db = __db;
        this.__insertAdapterOfLocalAchievementAsAchievement = new C0154a();
        this.__insertAdapterOfRemoteAchievementAsAchievement = new b();
    }

    public static final long u(a aVar, LocalAchievement localAchievement, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        return aVar.__insertAdapterOfLocalAchievementAsAchievement.f(_connection, localAchievement);
    }

    public static final Unit v(a aVar, List list, f5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        aVar.__insertAdapterOfRemoteAchievementAsAchievement.c(_connection, list);
        return Unit.f22483a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Achievement w(String str, String str2, a aVar, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.k0(1, str2);
            int iC = c5.j.c(dVarR3, "Id");
            int iC2 = c5.j.c(dVarR3, "code_name");
            int iC3 = c5.j.c(dVarR3, "origin");
            int iC4 = c5.j.c(dVarR3, "created_ts");
            int iC5 = c5.j.c(dVarR3, "synced_ts");
            Achievement achievement = null;
            Long lValueOf = null;
            if (dVarR3.g3()) {
                int i10 = (int) dVarR3.getLong(iC);
                String strE2 = dVarR3.E2(iC2);
                m mVarQ = aVar.q(dVarR3.E2(iC3));
                Instant instantA = aVar.__converters.a(dVarR3.isNull(iC4) ? null : Long.valueOf(dVarR3.getLong(iC4)));
                if (instantA == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                if (!dVarR3.isNull(iC5)) {
                    lValueOf = Long.valueOf(dVarR3.getLong(iC5));
                }
                achievement = new Achievement(i10, strE2, mVarQ, instantA, aVar.__converters.a(lValueOf));
            }
            dVarR3.close();
            return achievement;
        } catch (Throwable th2) {
            dVarR3.close();
            throw th2;
        }
    }

    public static final List x(String str, a aVar, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            int iC = c5.j.c(dVarR3, "Id");
            int iC2 = c5.j.c(dVarR3, "code_name");
            int iC3 = c5.j.c(dVarR3, "origin");
            int iC4 = c5.j.c(dVarR3, "created_ts");
            int iC5 = c5.j.c(dVarR3, "synced_ts");
            ArrayList arrayList = new ArrayList();
            while (dVarR3.g3()) {
                int i10 = (int) dVarR3.getLong(iC);
                String strE2 = dVarR3.E2(iC2);
                m mVarQ = aVar.q(dVarR3.E2(iC3));
                Long lValueOf = null;
                Instant instantA = aVar.__converters.a(dVarR3.isNull(iC4) ? null : Long.valueOf(dVarR3.getLong(iC4)));
                if (instantA == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                if (!dVarR3.isNull(iC5)) {
                    lValueOf = Long.valueOf(dVarR3.getLong(iC5));
                }
                arrayList.add(new Achievement(i10, strE2, mVarQ, instantA, aVar.__converters.a(lValueOf)));
            }
            dVarR3.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarR3.close();
            throw th2;
        }
    }

    public static final Unit y(String str, a aVar, Instant instant, List list, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            Long lB = aVar.__converters.b(instant);
            if (lB == null) {
                dVarR3.C(1);
            } else {
                dVarR3.z(1, lB.longValue());
            }
            Iterator it = list.iterator();
            int i10 = 2;
            while (it.hasNext()) {
                dVarR3.k0(i10, (String) it.next());
                i10++;
            }
            dVarR3.g3();
            return Unit.f22483a;
        } finally {
            dVarR3.close();
        }
    }

    public static final List z(String str, int i10, a aVar, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d dVarR3 = _connection.r3(str);
        try {
            dVarR3.z(1, i10);
            int iC = c5.j.c(dVarR3, "Id");
            int iC2 = c5.j.c(dVarR3, "code_name");
            int iC3 = c5.j.c(dVarR3, "origin");
            int iC4 = c5.j.c(dVarR3, "created_ts");
            int iC5 = c5.j.c(dVarR3, "synced_ts");
            ArrayList arrayList = new ArrayList();
            while (dVarR3.g3()) {
                int i11 = (int) dVarR3.getLong(iC);
                String strE2 = dVarR3.E2(iC2);
                m mVarQ = aVar.q(dVarR3.E2(iC3));
                Long lValueOf = null;
                Instant instantA = aVar.__converters.a(dVarR3.isNull(iC4) ? null : Long.valueOf(dVarR3.getLong(iC4)));
                if (instantA == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                if (!dVarR3.isNull(iC5)) {
                    lValueOf = Long.valueOf(dVarR3.getLong(iC5));
                }
                arrayList.add(new Achievement(i11, strE2, mVarQ, instantA, aVar.__converters.a(lValueOf)));
            }
            dVarR3.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarR3.close();
            throw th2;
        }
    }

    @Override // sl.b
    @NotNull
    public h<List<Achievement>> c(final int highWatermarkId) {
        final String str = "SELECT * FROM achievements where id > ? and synced_ts IS NULL";
        return k.a(this.__db, false, new String[]{"achievements"}, new Function1() { // from class: sl.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.roblox.universalapp.achievement.a.z(str, highWatermarkId, this, (f5.b) obj);
            }
        });
    }

    @Override // sl.b
    @Nullable
    public Object d(@NotNull final List<String> list, @NotNull final Instant instant, @NotNull nt.b<? super Unit> bVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE achievements SET synced_ts = ");
        sb2.append("?");
        sb2.append(" WHERE code_name in (");
        n.a(sb2, list.size());
        sb2.append(") and synced_ts IS NULL");
        final String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Object objE = c5.a.e(this.__db, false, true, new Function1() { // from class: sl.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.roblox.universalapp.achievement.a.y(string, this, instant, list, (f5.b) obj);
            }
        }, bVar);
        return objE == ot.c.e() ? objE : Unit.f22483a;
    }

    @Override // sl.b
    @Nullable
    public Object e(@NotNull final List<RemoteAchievement> list, @NotNull nt.b<? super Unit> bVar) {
        Object objE = c5.a.e(this.__db, false, true, new Function1() { // from class: sl.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.roblox.universalapp.achievement.a.v(this.f31167a, list, (f5.b) obj);
            }
        }, bVar);
        return objE == ot.c.e() ? objE : Unit.f22483a;
    }

    @Override // sl.b
    @Nullable
    public Object f(@NotNull final LocalAchievement localAchievement, @NotNull nt.b<? super Long> bVar) {
        return c5.a.e(this.__db, false, true, new Function1() { // from class: sl.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(com.roblox.universalapp.achievement.a.u(this.f31158a, localAchievement, (f5.b) obj));
            }
        }, bVar);
    }

    @Override // sl.b
    @Nullable
    public Object g(@NotNull nt.b<? super List<Achievement>> bVar) {
        final String str = "SELECT * FROM achievements";
        return c5.a.e(this.__db, true, false, new Function1() { // from class: sl.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.roblox.universalapp.achievement.a.x(str, this, (f5.b) obj);
            }
        }, bVar);
    }

    @Override // sl.b
    @Nullable
    public Object h(@NotNull final String str, @NotNull nt.b<? super Achievement> bVar) {
        final String str2 = "SELECT * from achievements WHERE code_name = ?";
        return c5.a.e(this.__db, true, false, new Function1() { // from class: sl.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.roblox.universalapp.achievement.a.w(str2, str, this, (f5.b) obj);
            }
        }, bVar);
    }

    @Override // sl.b
    @Nullable
    public Object i(@NotNull List<RemoteAchievement> list, @NotNull nt.b<? super Unit> bVar) {
        Object objD = c5.a.d(this.__db, new e(list, null), bVar);
        return objD == ot.c.e() ? objD : Unit.f22483a;
    }

    public final String p(m _value) {
        int i10 = d.f9770a[_value.ordinal()];
        if (i10 == 1) {
            return "LOCAL";
        }
        if (i10 == 2) {
            return "REMOTE";
        }
        throw new l();
    }

    public final m q(String _value) {
        if (Intrinsics.c(_value, "LOCAL")) {
            return m.LOCAL;
        }
        if (Intrinsics.c(_value, "REMOTE")) {
            return m.REMOTE;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
}
