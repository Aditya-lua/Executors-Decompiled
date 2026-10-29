package com.roblox.universalapp.achievement;

import com.roblox.universalapp.achievement.C3345a;
import hu.InterfaceC6567c;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041c5.C1525a;
import p041c5.C1534j;
import p041c5.C1538n;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5361d;
import p229jt.C7345l;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p535x4.AbstractC12660f;
import p535x4.AbstractC12682u;
import p594z4.C13711k;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import sl.Achievement;
import sl.C11400j;
import sl.EnumC11403m;
import sl.InterfaceC11392b;
import sl.LocalAchievement;
import sl.RemoteAchievement;

/* JADX INFO: renamed from: com.roblox.universalapp.achievement.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010!\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aH\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010-¨\u00063"}, m31665d2 = {"Lcom/roblox/universalapp/achievement/a;", "Lsl/b;", "Lx4/u;", "__db", "<init>", "(Lx4/u;)V", "Lsl/l;", "localAchievement", "", "f", "(Lsl/l;Lnt/b;)Ljava/lang/Object;", "", "Lsl/u;", "remoteAchievements", "", "e", "(Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "i", "Lsl/a;", "g", "(Lnt/b;)Ljava/lang/Object;", "", "highWatermarkId", "Lnu/h;", "c", "(I)Lnu/h;", "", "codeName", "h", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "codeNames", "Ljava/time/Instant;", "syncedAt", "d", "(Ljava/util/List;Ljava/time/Instant;Lnt/b;)Ljava/lang/Object;", "Lsl/m;", "_value", "p", "(Lsl/m;)Ljava/lang/String;", "q", "(Ljava/lang/String;)Lsl/m;", "a", "Lx4/u;", "Lx4/f;", "b", "Lx4/f;", "__insertAdapterOfLocalAchievementAsAchievement", "Lsl/j;", "Lsl/j;", "__converters", "__insertAdapterOfRemoteAchievementAsAchievement", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3345a implements InterfaceC11392b {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12682u __db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12660f<LocalAchievement> __insertAdapterOfLocalAchievementAsAchievement;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C11400j __converters;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AbstractC12660f<RemoteAchievement> __insertAdapterOfRemoteAchievementAsAchievement;

    /* JADX INFO: renamed from: com.roblox.universalapp.achievement.a$a */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"com/roblox/universalapp/achievement/a$a", "Lx4/f;", "Lsl/l;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Lsl/l;)V", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC12660f<LocalAchievement> {
        public a() {
        }

        @Override // p535x4.AbstractC12660f
        /* JADX INFO: renamed from: b */
        public String mo15958b() {
            return "INSERT OR IGNORE INTO `achievements` (`code_name`,`created_ts`,`origin`) VALUES (?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lf5/d;Ljava/lang/Object;)V */
        @Override // p535x4.AbstractC12660f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo15957a(InterfaceC5361d statement, LocalAchievement entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.mo24705k0(1, entity.getCodeName());
            Long lM42716b = C3345a.this.__converters.m42716b(entity.getCreatedTs());
            if (lM42716b == null) {
                statement.mo24700C(2);
            } else {
                statement.mo24706z(2, lM42716b.longValue());
            }
            statement.mo24705k0(3, C3345a.this.m15955p(entity.getOrigin()));
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.achievement.a$b */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"com/roblox/universalapp/achievement/a$b", "Lx4/f;", "Lsl/u;", "", "b", "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Lsl/u;)V", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC12660f<RemoteAchievement> {
        public b() {
        }

        @Override // p535x4.AbstractC12660f
        /* JADX INFO: renamed from: b */
        public String mo15958b() {
            return "INSERT OR IGNORE INTO `achievements` (`code_name`,`synced_ts`,`origin`,`created_ts`) VALUES (?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lf5/d;Ljava/lang/Object;)V */
        @Override // p535x4.AbstractC12660f
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo15957a(InterfaceC5361d statement, RemoteAchievement entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.mo24705k0(1, entity.getCodeName());
            Long lM42716b = C3345a.this.__converters.m42716b(entity.getSyncedTs());
            if (lM42716b == null) {
                statement.mo24700C(2);
            } else {
                statement.mo24706z(2, lM42716b.longValue());
            }
            statement.mo24705k0(3, C3345a.this.m15955p(entity.getOrigin()));
            Long lM42716b2 = C3345a.this.__converters.m42716b(entity.getCreatedTs());
            if (lM42716b2 == null) {
                statement.mo24700C(4);
            } else {
                statement.mo24706z(4, lM42716b2.longValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.achievement.a$c, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/roblox/universalapp/achievement/a$c;", "", "<init>", "()V", "", "Lhu/c;", "a", "()Ljava/util/List;", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.universalapp.achievement.a.c.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<InterfaceC6567c<?>> m15961a() {
            return C7699p.m31892k();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.achievement.a$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12726a;

        static {
            int[] iArr = new int[EnumC11403m.values().length];
            try {
                iArr[EnumC11403m.LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11403m.REMOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12726a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.achievement.a$e */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.achievement.AchievementDao_Impl$replicateRemoteAchievements$2", m39664f = "AchievementDao_Impl.kt", m39665l = {87}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class e extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12727t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ List<RemoteAchievement> f12729v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<RemoteAchievement> list, InterfaceC9557b<? super e> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f12729v = list;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C3345a.this.new e(this.f12729v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12727t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C3345a c3345a = C3345a.this;
                List<RemoteAchievement> list = this.f12729v;
                this.f12727t = 1;
                if (C3345a.super.mo15954i(list, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((e) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C3345a(@NotNull AbstractC12682u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__converters = new C11400j();
        this.__db = __db;
        this.__insertAdapterOfLocalAchievementAsAchievement = new a();
        this.__insertAdapterOfRemoteAchievementAsAchievement = new b();
    }

    /* JADX INFO: renamed from: u */
    public static final long m15942u(C3345a c3345a, LocalAchievement localAchievement, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        return c3345a.__insertAdapterOfLocalAchievementAsAchievement.m47173f(_connection, localAchievement);
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m15943v(C3345a c3345a, List list, InterfaceC5359b _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        c3345a.__insertAdapterOfRemoteAchievementAsAchievement.m47170c(_connection, list);
        return Unit.f29331a;
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
    /* JADX INFO: renamed from: w */
    public static final Achievement m15944w(String str, String str2, C3345a c3345a, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24705k0(1, str2);
            int iM8099c = C1534j.m8099c(interfaceC5361dMo24696r3, "Id");
            int iM8099c2 = C1534j.m8099c(interfaceC5361dMo24696r3, "code_name");
            int iM8099c3 = C1534j.m8099c(interfaceC5361dMo24696r3, "origin");
            int iM8099c4 = C1534j.m8099c(interfaceC5361dMo24696r3, "created_ts");
            int iM8099c5 = C1534j.m8099c(interfaceC5361dMo24696r3, "synced_ts");
            Achievement achievement = null;
            Long lValueOf = null;
            if (interfaceC5361dMo24696r3.mo24704g3()) {
                int i10 = (int) interfaceC5361dMo24696r3.getLong(iM8099c);
                String strMo24702E2 = interfaceC5361dMo24696r3.mo24702E2(iM8099c2);
                EnumC11403m enumC11403mM15956q = c3345a.m15956q(interfaceC5361dMo24696r3.mo24702E2(iM8099c3));
                Instant instantM42715a = c3345a.__converters.m42715a(interfaceC5361dMo24696r3.isNull(iM8099c4) ? null : Long.valueOf(interfaceC5361dMo24696r3.getLong(iM8099c4)));
                if (instantM42715a == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                if (!interfaceC5361dMo24696r3.isNull(iM8099c5)) {
                    lValueOf = Long.valueOf(interfaceC5361dMo24696r3.getLong(iM8099c5));
                }
                achievement = new Achievement(i10, strMo24702E2, enumC11403mM15956q, instantM42715a, c3345a.__converters.m42715a(lValueOf));
            }
            interfaceC5361dMo24696r3.close();
            return achievement;
        } catch (Throwable th2) {
            interfaceC5361dMo24696r3.close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: x */
    public static final List m15945x(String str, C3345a c3345a, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            int iM8099c = C1534j.m8099c(interfaceC5361dMo24696r3, "Id");
            int iM8099c2 = C1534j.m8099c(interfaceC5361dMo24696r3, "code_name");
            int iM8099c3 = C1534j.m8099c(interfaceC5361dMo24696r3, "origin");
            int iM8099c4 = C1534j.m8099c(interfaceC5361dMo24696r3, "created_ts");
            int iM8099c5 = C1534j.m8099c(interfaceC5361dMo24696r3, "synced_ts");
            ArrayList arrayList = new ArrayList();
            while (interfaceC5361dMo24696r3.mo24704g3()) {
                int i10 = (int) interfaceC5361dMo24696r3.getLong(iM8099c);
                String strMo24702E2 = interfaceC5361dMo24696r3.mo24702E2(iM8099c2);
                EnumC11403m enumC11403mM15956q = c3345a.m15956q(interfaceC5361dMo24696r3.mo24702E2(iM8099c3));
                Long lValueOf = null;
                Instant instantM42715a = c3345a.__converters.m42715a(interfaceC5361dMo24696r3.isNull(iM8099c4) ? null : Long.valueOf(interfaceC5361dMo24696r3.getLong(iM8099c4)));
                if (instantM42715a == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                if (!interfaceC5361dMo24696r3.isNull(iM8099c5)) {
                    lValueOf = Long.valueOf(interfaceC5361dMo24696r3.getLong(iM8099c5));
                }
                arrayList.add(new Achievement(i10, strMo24702E2, enumC11403mM15956q, instantM42715a, c3345a.__converters.m42715a(lValueOf)));
            }
            interfaceC5361dMo24696r3.close();
            return arrayList;
        } catch (Throwable th2) {
            interfaceC5361dMo24696r3.close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m15946y(String str, C3345a c3345a, Instant instant, List list, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            Long lM42716b = c3345a.__converters.m42716b(instant);
            if (lM42716b == null) {
                interfaceC5361dMo24696r3.mo24700C(1);
            } else {
                interfaceC5361dMo24696r3.mo24706z(1, lM42716b.longValue());
            }
            Iterator it = list.iterator();
            int i10 = 2;
            while (it.hasNext()) {
                interfaceC5361dMo24696r3.mo24705k0(i10, (String) it.next());
                i10++;
            }
            interfaceC5361dMo24696r3.mo24704g3();
            return Unit.f29331a;
        } finally {
            interfaceC5361dMo24696r3.close();
        }
    }

    /* JADX INFO: renamed from: z */
    public static final List m15947z(String str, int i10, C3345a c3345a, InterfaceC5359b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        InterfaceC5361d interfaceC5361dMo24696r3 = _connection.mo24696r3(str);
        try {
            interfaceC5361dMo24696r3.mo24706z(1, i10);
            int iM8099c = C1534j.m8099c(interfaceC5361dMo24696r3, "Id");
            int iM8099c2 = C1534j.m8099c(interfaceC5361dMo24696r3, "code_name");
            int iM8099c3 = C1534j.m8099c(interfaceC5361dMo24696r3, "origin");
            int iM8099c4 = C1534j.m8099c(interfaceC5361dMo24696r3, "created_ts");
            int iM8099c5 = C1534j.m8099c(interfaceC5361dMo24696r3, "synced_ts");
            ArrayList arrayList = new ArrayList();
            while (interfaceC5361dMo24696r3.mo24704g3()) {
                int i11 = (int) interfaceC5361dMo24696r3.getLong(iM8099c);
                String strMo24702E2 = interfaceC5361dMo24696r3.mo24702E2(iM8099c2);
                EnumC11403m enumC11403mM15956q = c3345a.m15956q(interfaceC5361dMo24696r3.mo24702E2(iM8099c3));
                Long lValueOf = null;
                Instant instantM42715a = c3345a.__converters.m42715a(interfaceC5361dMo24696r3.isNull(iM8099c4) ? null : Long.valueOf(interfaceC5361dMo24696r3.getLong(iM8099c4)));
                if (instantM42715a == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                if (!interfaceC5361dMo24696r3.isNull(iM8099c5)) {
                    lValueOf = Long.valueOf(interfaceC5361dMo24696r3.getLong(iM8099c5));
                }
                arrayList.add(new Achievement(i11, strMo24702E2, enumC11403mM15956q, instantM42715a, c3345a.__converters.m42715a(lValueOf)));
            }
            interfaceC5361dMo24696r3.close();
            return arrayList;
        } catch (Throwable th2) {
            interfaceC5361dMo24696r3.close();
            throw th2;
        }
    }

    @Override // sl.InterfaceC11392b
    @NotNull
    /* JADX INFO: renamed from: c */
    public InterfaceC9575h<List<Achievement>> mo15948c(final int highWatermarkId) {
        final String str = "SELECT * FROM achievements where id > ? and synced_ts IS NULL";
        return C13711k.m50083a(this.__db, false, new String[]{"achievements"}, new Function1() { // from class: sl.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3345a.m15947z(str, highWatermarkId, this, (InterfaceC5359b) obj);
            }
        });
    }

    @Override // sl.InterfaceC11392b
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo15949d(@NotNull final List<String> list, @NotNull final Instant instant, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE achievements SET synced_ts = ");
        sb2.append("?");
        sb2.append(" WHERE code_name in (");
        C1538n.m8111a(sb2, list.size());
        sb2.append(") and synced_ts IS NULL");
        final String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Object objM8067e = C1525a.m8067e(this.__db, false, true, new Function1() { // from class: sl.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3345a.m15946y(string, this, instant, list, (InterfaceC5359b) obj);
            }
        }, interfaceC9557b);
        return objM8067e == C10047c.m38805e() ? objM8067e : Unit.f29331a;
    }

    @Override // sl.InterfaceC11392b
    @Nullable
    /* JADX INFO: renamed from: e */
    public Object mo15950e(@NotNull final List<RemoteAchievement> list, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM8067e = C1525a.m8067e(this.__db, false, true, new Function1() { // from class: sl.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3345a.m15943v(this.f40303a, list, (InterfaceC5359b) obj);
            }
        }, interfaceC9557b);
        return objM8067e == C10047c.m38805e() ? objM8067e : Unit.f29331a;
    }

    @Override // sl.InterfaceC11392b
    @Nullable
    /* JADX INFO: renamed from: f */
    public Object mo15951f(@NotNull final LocalAchievement localAchievement, @NotNull InterfaceC9557b<? super Long> interfaceC9557b) {
        return C1525a.m8067e(this.__db, false, true, new Function1() { // from class: sl.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(C3345a.m15942u(this.f40289a, localAchievement, (InterfaceC5359b) obj));
            }
        }, interfaceC9557b);
    }

    @Override // sl.InterfaceC11392b
    @Nullable
    /* JADX INFO: renamed from: g */
    public Object mo15952g(@NotNull InterfaceC9557b<? super List<Achievement>> interfaceC9557b) {
        final String str = "SELECT * FROM achievements";
        return C1525a.m8067e(this.__db, true, false, new Function1() { // from class: sl.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3345a.m15945x(str, this, (InterfaceC5359b) obj);
            }
        }, interfaceC9557b);
    }

    @Override // sl.InterfaceC11392b
    @Nullable
    /* JADX INFO: renamed from: h */
    public Object mo15953h(@NotNull final String str, @NotNull InterfaceC9557b<? super Achievement> interfaceC9557b) {
        final String str2 = "SELECT * from achievements WHERE code_name = ?";
        return C1525a.m8067e(this.__db, true, false, new Function1() { // from class: sl.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C3345a.m15944w(str2, str, this, (InterfaceC5359b) obj);
            }
        }, interfaceC9557b);
    }

    @Override // sl.InterfaceC11392b
    @Nullable
    /* JADX INFO: renamed from: i */
    public Object mo15954i(@NotNull List<RemoteAchievement> list, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM8066d = C1525a.m8066d(this.__db, new e(list, null), interfaceC9557b);
        return objM8066d == C10047c.m38805e() ? objM8066d : Unit.f29331a;
    }

    /* JADX INFO: renamed from: p */
    public final String m15955p(EnumC11403m _value) {
        int i10 = d.f12726a[_value.ordinal()];
        if (i10 == 1) {
            return "LOCAL";
        }
        if (i10 == 2) {
            return "REMOTE";
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: q */
    public final EnumC11403m m15956q(String _value) {
        if (Intrinsics.m31980c(_value, "LOCAL")) {
            return EnumC11403m.LOCAL;
        }
        if (Intrinsics.m31980c(_value, "REMOTE")) {
            return EnumC11403m.REMOTE;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
}
