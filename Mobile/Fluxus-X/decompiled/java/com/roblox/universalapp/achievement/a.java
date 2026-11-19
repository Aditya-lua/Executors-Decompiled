package com.roblox.universalapp.achievement;

import a5.k;
import com.github.luben.zstd.BuildConfig;
import d5.n;
import dv.h;
import gm.Achievement;
import gm.LocalAchievement;
import gm.RemoteAchievement;
import gm.j;
import gm.m;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.p;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import xu.c;
import y4.f;
import y4.u;
import zt.l;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010!\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aH\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,¨\u00062"}, d2 = {"Lcom/roblox/universalapp/achievement/a;", "Lgm/b;", "Ly4/u;", "__db", "<init>", "(Ly4/u;)V", "Lgm/l;", "localAchievement", BuildConfig.FLAVOR, "e", "(Lgm/l;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "Lgm/u;", "remoteAchievements", BuildConfig.FLAVOR, "g", "(Ljava/util/List;Leu/b;)Ljava/lang/Object;", "d", "Lgm/a;", "c", "(Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "highWatermarkId", "Ldv/h;", "b", "(I)Ldv/h;", BuildConfig.FLAVOR, "codeName", "i", "(Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "codeNames", "Ljava/time/Instant;", "syncedAt", "h", "(Ljava/util/List;Ljava/time/Instant;Leu/b;)Ljava/lang/Object;", "Lgm/m;", "_value", "p", "(Lgm/m;)Ljava/lang/String;", "q", "(Ljava/lang/String;)Lgm/m;", "a", "Ly4/u;", "Ly4/f;", "Ly4/f;", "__insertAdapterOfLocalAchievementAsAchievement", "Lgm/j;", "Lgm/j;", "__converters", "__insertAdapterOfRemoteAchievementAsAchievement", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gm.b {

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
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/roblox/universalapp/achievement/a$a", "Ly4/f;", "Lgm/l;", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;", "Lg5/d;", "statement", "entity", BuildConfig.FLAVOR, "g", "(Lg5/d;Lgm/l;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0160a extends f<LocalAchievement> {
        public C0160a() {
        }

        @Override // y4.f
        public String b() {
            return "INSERT OR IGNORE INTO `achievements` (`code_name`,`created_ts`,`origin`) VALUES (?,?,?)";
        }

        @Override // y4.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(g5.d statement, LocalAchievement entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.m0(1, entity.getCodeName());
            Long lB = a.this.__converters.b(entity.getCreatedTs());
            if (lB == null) {
                statement.F(2);
            } else {
                statement.B(2, lB.longValue());
            }
            statement.m0(3, a.this.p(entity.getOrigin()));
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/roblox/universalapp/achievement/a$b", "Ly4/f;", "Lgm/u;", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;", "Lg5/d;", "statement", "entity", BuildConfig.FLAVOR, "g", "(Lg5/d;Lgm/u;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends f<RemoteAchievement> {
        public b() {
        }

        @Override // y4.f
        public String b() {
            return "INSERT OR IGNORE INTO `achievements` (`code_name`,`synced_ts`,`origin`,`created_ts`) VALUES (?,?,?,?)";
        }

        @Override // y4.f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(g5.d statement, RemoteAchievement entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.m0(1, entity.getCodeName());
            Long lB = a.this.__converters.b(entity.getSyncedTs());
            if (lB == null) {
                statement.F(2);
            } else {
                statement.B(2, lB.longValue());
            }
            statement.m0(3, a.this.p(entity.getOrigin()));
            Long lB2 = a.this.__converters.b(entity.getCreatedTs());
            if (lB2 == null) {
                statement.F(4);
            } else {
                statement.B(4, lB2.longValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.achievement.a$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/roblox/universalapp/achievement/a$c;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "Lxu/c;", "a", "()Ljava/util/List;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        public static final /* synthetic */ int[] f9788a;

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
            f9788a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.universalapp.achievement.AchievementDao_Impl$replicateRemoteAchievements$2", f = "AchievementDao_Impl.kt", l = {87}, m = "invokeSuspend", v = 1)
    public static final class e extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9789t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ List<RemoteAchievement> f9791v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<RemoteAchievement> list, eu.b<? super e> bVar) {
            super(1, bVar);
            this.f9791v = list;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return a.this.new e(this.f9791v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f9789t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                List<RemoteAchievement> list = this.f9791v;
                this.f9789t = 1;
                if (a.super.d(list, this) == objE) {
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

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public a(@NotNull u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__converters = new j();
        this.__db = __db;
        this.__insertAdapterOfLocalAchievementAsAchievement = new C0160a();
        this.__insertAdapterOfRemoteAchievementAsAchievement = new b();
    }

    public static final long u(a aVar, LocalAchievement localAchievement, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        return aVar.__insertAdapterOfLocalAchievementAsAchievement.f(_connection, localAchievement);
    }

    public static final Unit v(a aVar, List list, g5.b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        aVar.__insertAdapterOfRemoteAchievementAsAchievement.c(_connection, list);
        return Unit.f21506a;
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
    public static final Achievement w(String str, String str2, a aVar, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.m0(1, str2);
            int iC = d5.j.c(dVarW3, "Id");
            int iC2 = d5.j.c(dVarW3, "code_name");
            int iC3 = d5.j.c(dVarW3, "origin");
            int iC4 = d5.j.c(dVarW3, "created_ts");
            int iC5 = d5.j.c(dVarW3, "synced_ts");
            Achievement achievement = null;
            Long lValueOf = null;
            if (dVarW3.n3()) {
                int i10 = (int) dVarW3.getLong(iC);
                String strI2 = dVarW3.I2(iC2);
                m mVarQ = aVar.q(dVarW3.I2(iC3));
                Instant instantA = aVar.__converters.a(dVarW3.isNull(iC4) ? null : Long.valueOf(dVarW3.getLong(iC4)));
                if (instantA == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                if (!dVarW3.isNull(iC5)) {
                    lValueOf = Long.valueOf(dVarW3.getLong(iC5));
                }
                achievement = new Achievement(i10, strI2, mVarQ, instantA, aVar.__converters.a(lValueOf));
            }
            dVarW3.close();
            return achievement;
        } catch (Throwable th2) {
            dVarW3.close();
            throw th2;
        }
    }

    public static final List x(String str, a aVar, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            int iC = d5.j.c(dVarW3, "Id");
            int iC2 = d5.j.c(dVarW3, "code_name");
            int iC3 = d5.j.c(dVarW3, "origin");
            int iC4 = d5.j.c(dVarW3, "created_ts");
            int iC5 = d5.j.c(dVarW3, "synced_ts");
            ArrayList arrayList = new ArrayList();
            while (dVarW3.n3()) {
                int i10 = (int) dVarW3.getLong(iC);
                String strI2 = dVarW3.I2(iC2);
                m mVarQ = aVar.q(dVarW3.I2(iC3));
                Long lValueOf = null;
                Instant instantA = aVar.__converters.a(dVarW3.isNull(iC4) ? null : Long.valueOf(dVarW3.getLong(iC4)));
                if (instantA == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                if (!dVarW3.isNull(iC5)) {
                    lValueOf = Long.valueOf(dVarW3.getLong(iC5));
                }
                arrayList.add(new Achievement(i10, strI2, mVarQ, instantA, aVar.__converters.a(lValueOf)));
            }
            dVarW3.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarW3.close();
            throw th2;
        }
    }

    public static final Unit y(String str, a aVar, Instant instant, List list, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            Long lB = aVar.__converters.b(instant);
            if (lB == null) {
                dVarW3.F(1);
            } else {
                dVarW3.B(1, lB.longValue());
            }
            Iterator it = list.iterator();
            int i10 = 2;
            while (it.hasNext()) {
                dVarW3.m0(i10, (String) it.next());
                i10++;
            }
            dVarW3.n3();
            return Unit.f21506a;
        } finally {
            dVarW3.close();
        }
    }

    public static final List z(String str, int i10, a aVar, g5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        g5.d dVarW3 = _connection.w3(str);
        try {
            dVarW3.B(1, i10);
            int iC = d5.j.c(dVarW3, "Id");
            int iC2 = d5.j.c(dVarW3, "code_name");
            int iC3 = d5.j.c(dVarW3, "origin");
            int iC4 = d5.j.c(dVarW3, "created_ts");
            int iC5 = d5.j.c(dVarW3, "synced_ts");
            ArrayList arrayList = new ArrayList();
            while (dVarW3.n3()) {
                int i11 = (int) dVarW3.getLong(iC);
                String strI2 = dVarW3.I2(iC2);
                m mVarQ = aVar.q(dVarW3.I2(iC3));
                Long lValueOf = null;
                Instant instantA = aVar.__converters.a(dVarW3.isNull(iC4) ? null : Long.valueOf(dVarW3.getLong(iC4)));
                if (instantA == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                if (!dVarW3.isNull(iC5)) {
                    lValueOf = Long.valueOf(dVarW3.getLong(iC5));
                }
                arrayList.add(new Achievement(i11, strI2, mVarQ, instantA, aVar.__converters.a(lValueOf)));
            }
            dVarW3.close();
            return arrayList;
        } catch (Throwable th2) {
            dVarW3.close();
            throw th2;
        }
    }

    @Override // gm.b
    @NotNull
    public h<List<Achievement>> b(final int highWatermarkId) {
        final String str = "SELECT * FROM achievements where id > ? and synced_ts IS NULL";
        return k.a(this.__db, false, new String[]{"achievements"}, new Function1() { // from class: gm.f
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.roblox.universalapp.achievement.a.z(str, highWatermarkId, this, (g5.b) obj);
            }
        });
    }

    @Override // gm.b
    @Nullable
    public Object c(@NotNull eu.b<? super List<Achievement>> bVar) {
        final String str = "SELECT * FROM achievements";
        return d5.a.e(this.__db, true, false, new Function1() { // from class: gm.g
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.roblox.universalapp.achievement.a.x(str, this, (g5.b) obj);
            }
        }, bVar);
    }

    @Override // gm.b
    @Nullable
    public Object d(@NotNull List<RemoteAchievement> list, @NotNull eu.b<? super Unit> bVar) {
        Object objD = d5.a.d(this.__db, new e(list, null), bVar);
        return objD == fu.c.e() ? objD : Unit.f21506a;
    }

    @Override // gm.b
    @Nullable
    public Object e(@NotNull final LocalAchievement localAchievement, @NotNull eu.b<? super Long> bVar) {
        return d5.a.e(this.__db, false, true, new Function1() { // from class: gm.d
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(com.roblox.universalapp.achievement.a.u(this.f17782a, localAchievement, (g5.b) obj));
            }
        }, bVar);
    }

    @Override // gm.b
    @Nullable
    public Object g(@NotNull final List<RemoteAchievement> list, @NotNull eu.b<? super Unit> bVar) {
        Object objE = d5.a.e(this.__db, false, true, new Function1() { // from class: gm.h
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.roblox.universalapp.achievement.a.v(this.f17788a, list, (g5.b) obj);
            }
        }, bVar);
        return objE == fu.c.e() ? objE : Unit.f21506a;
    }

    @Override // gm.b
    @Nullable
    public Object h(@NotNull final List<String> list, @NotNull final Instant instant, @NotNull eu.b<? super Unit> bVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE achievements SET synced_ts = ");
        sb2.append("?");
        sb2.append(" WHERE code_name in (");
        n.a(sb2, list.size());
        sb2.append(") and synced_ts IS NULL");
        final String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Object objE = d5.a.e(this.__db, false, true, new Function1() { // from class: gm.c
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.roblox.universalapp.achievement.a.y(string, this, instant, list, (g5.b) obj);
            }
        }, bVar);
        return objE == fu.c.e() ? objE : Unit.f21506a;
    }

    @Override // gm.b
    @Nullable
    public Object i(@NotNull final String str, @NotNull eu.b<? super Achievement> bVar) {
        final String str2 = "SELECT * from achievements WHERE code_name = ?";
        return d5.a.e(this.__db, true, false, new Function1() { // from class: gm.e
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.roblox.universalapp.achievement.a.w(str2, str, this, (g5.b) obj);
            }
        }, bVar);
    }

    public final String p(m _value) {
        int i10 = d.f9788a[_value.ordinal()];
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
