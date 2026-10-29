package p333oi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: oi.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Loi/f;", "", "<init>", "()V", "", "conversationId", "", "conversationGuid", "message", "Loi/f$a;", "onFailed", "", "d", "(JLjava/lang/String;Ljava/lang/String;Loi/f$a;)V", "c", "(JLjava/lang/String;)V", "userId", "b", "(J)V", "a", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9740f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C9740f f35451a = new C9740f();

    /* JADX INFO: renamed from: oi.f$a */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Loi/f$a;", "", "", "resultType", "", "isModerated", "", "a", "(Ljava/lang/String;Z)V", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo38539a(@NotNull String resultType, boolean isModerated);
    }

    /* JADX INFO: renamed from: oi.f$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.job.JobDispatcherBridge$fetchAvatarHeadshotsAsync$1", m39664f = "JobDispatcherBridge.kt", m39665l = {48}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f35452t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ long f35453u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f35453u = j10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f35453u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f35452t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long j10 = this.f35453u;
                this.f35452t = 1;
                if (C9741g.m38541a(j10, this) == objM38805e) {
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: oi.f$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.job.JobDispatcherBridge$fetchUserAndHeadshotAsync$1", m39664f = "JobDispatcherBridge.kt", m39665l = {41}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f35454t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ long f35455u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f35455u = j10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(this.f35455u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f35454t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long j10 = this.f35455u;
                this.f35454t = 1;
                if (C9741g.m38543c(j10, this) == objM38805e) {
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: oi.f$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.job.JobDispatcherBridge$markAsReadAsync$1", m39664f = "JobDispatcherBridge.kt", m39665l = {34}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f35456t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ long f35457u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f35458v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, String str, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f35457u = j10;
            this.f35458v = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new d(this.f35457u, this.f35458v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f35456t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long j10 = this.f35457u;
                String str = this.f35458v;
                this.f35456t = 1;
                if (C9738d.m38532a(j10, str, this) == objM38805e) {
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: oi.f$e */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.job.JobDispatcherBridge$sendChatMessageAsync$1", m39664f = "JobDispatcherBridge.kt", m39665l = {20}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class e extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f35459t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ long f35460u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f35461v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ String f35462w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ a f35463x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, String str, String str2, a aVar, InterfaceC9557b<? super e> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f35460u = j10;
            this.f35461v = str;
            this.f35462w = str2;
            this.f35463x = aVar;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return new e(this.f35460u, this.f35461v, this.f35462w, this.f35463x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38533b;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f35459t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long j10 = this.f35460u;
                String str = this.f35461v;
                String str2 = this.f35462w;
                this.f35459t = 1;
                objM38533b = C9738d.m38533b(j10, str, str2, this);
                if (objM38533b == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                objM38533b = ((C7347n) obj).getValue();
            }
            a aVar = this.f35463x;
            Throwable thM30463e = C7347n.m30463e(objM38533b);
            if (thM30463e != null && (thM30463e instanceof C9739e) && aVar != null) {
                C9739e c9739e = (C9739e) thM30463e;
                aVar.mo38539a(c9739e.getResultType(), Intrinsics.m31980c("moderated", c9739e.getResultType()));
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

    /* JADX INFO: renamed from: a */
    public static final void m38535a(long userId) {
        C9737c.f35430a.m38531f(new b(userId, null));
    }

    /* JADX INFO: renamed from: b */
    public static final void m38536b(long userId) {
        C9737c.f35430a.m38531f(new c(userId, null));
    }

    /* JADX INFO: renamed from: c */
    public static final void m38537c(long conversationId, @Nullable String conversationGuid) {
        C9737c.f35430a.m38531f(new d(conversationId, conversationGuid, null));
    }

    /* JADX INFO: renamed from: d */
    public static final void m38538d(long conversationId, @Nullable String conversationGuid, @NotNull String message, @Nullable a onFailed) {
        Intrinsics.checkNotNullParameter(message, "message");
        C9737c.f35430a.m38530c(conversationGuid == null ? String.valueOf(conversationId) : conversationGuid, new e(conversationId, conversationGuid, message, onFailed, null));
    }
}
