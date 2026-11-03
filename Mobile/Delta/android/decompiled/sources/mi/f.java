package mi;

import gt.n;
import gt.o;
import iu.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lmi/f;", "", "<init>", "()V", "", "conversationId", "", "conversationGuid", "message", "Lmi/f$a;", "onFailed", "", "d", "(JLjava/lang/String;Ljava/lang/String;Lmi/f$a;)V", "c", "(JLjava/lang/String;)V", "userId", "b", "(J)V", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f24822a = new f();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lmi/f$a;", "", "", "resultType", "", "isModerated", "", "a", "(Ljava/lang/String;Z)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void a(@NotNull String resultType, boolean isModerated);
    }

    @nt.f(c = "com.roblox.client.job.JobDispatcherBridge$fetchAvatarHeadshotsAsync$1", f = "JobDispatcherBridge.kt", l = {48}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24823t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f24824u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f24824u = j10;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new b(this.f24824u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f24823t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f24824u;
                this.f24823t = 1;
                if (g.a(j10, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.client.job.JobDispatcherBridge$fetchUserAndHeadshotAsync$1", f = "JobDispatcherBridge.kt", l = {41}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24825t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f24826u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f24826u = j10;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new c(this.f24826u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f24825t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f24826u;
                this.f24825t = 1;
                if (g.c(j10, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.client.job.JobDispatcherBridge$markAsReadAsync$1", f = "JobDispatcherBridge.kt", l = {34}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24827t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f24828u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f24829v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, String str, lt.b<? super d> bVar) {
            super(2, bVar);
            this.f24828u = j10;
            this.f24829v = str;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new d(this.f24828u, this.f24829v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f24827t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f24828u;
                String str = this.f24829v;
                this.f24827t = 1;
                if (mi.d.a(j10, str, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.client.job.JobDispatcherBridge$sendChatMessageAsync$1", f = "JobDispatcherBridge.kt", l = {20}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e extends m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24830t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f24831u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f24832v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f24833w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ a f24834x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, String str, String str2, a aVar, lt.b<? super e> bVar) {
            super(1, bVar);
            this.f24831u = j10;
            this.f24832v = str;
            this.f24833w = str2;
            this.f24834x = aVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return new e(this.f24831u, this.f24832v, this.f24833w, this.f24834x, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objE = mt.c.e();
            int i10 = this.f24830t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f24831u;
                String str = this.f24832v;
                String str2 = this.f24833w;
                this.f24830t = 1;
                objB = mi.d.b(j10, str, str2, this);
                if (objB == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                objB = ((n) obj).getValue();
            }
            a aVar = this.f24834x;
            Throwable thE = n.e(objB);
            if (thE != null && (thE instanceof mi.e) && aVar != null) {
                mi.e eVar = (mi.e) thE;
                aVar.a(eVar.getResultType(), Intrinsics.c("moderated", eVar.getResultType()));
            }
            return Unit.f22938a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    public static final void a(long userId) {
        mi.c.f24802a.f(new b(userId, null));
    }

    public static final void b(long userId) {
        mi.c.f24802a.f(new c(userId, null));
    }

    public static final void c(long conversationId, @Nullable String conversationGuid) {
        mi.c.f24802a.f(new d(conversationId, conversationGuid, null));
    }

    public static final void d(long conversationId, @Nullable String conversationGuid, @NotNull String message, @Nullable a onFailed) {
        Intrinsics.checkNotNullParameter(message, "message");
        mi.c.f24802a.c(conversationGuid == null ? String.valueOf(conversationId) : conversationGuid, new e(conversationId, conversationGuid, message, onFailed, null));
    }
}
