package oi;

import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Loi/f;", "", "<init>", "()V", "", "conversationId", "", "conversationGuid", "message", "Loi/f$a;", "onFailed", "", "d", "(JLjava/lang/String;Ljava/lang/String;Loi/f$a;)V", "c", "(JLjava/lang/String;)V", "userId", "b", "(J)V", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f27393a = new f();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Loi/f$a;", "", "", "resultType", "", "isModerated", "", "a", "(Ljava/lang/String;Z)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void a(@NotNull String resultType, boolean isModerated);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.job.JobDispatcherBridge$fetchAvatarHeadshotsAsync$1", f = "JobDispatcherBridge.kt", l = {48}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27394t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f27395u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f27395u = j10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f27395u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f27394t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f27395u;
                this.f27394t = 1;
                if (g.a(j10, this) == objE) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.job.JobDispatcherBridge$fetchUserAndHeadshotAsync$1", f = "JobDispatcherBridge.kt", l = {41}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27396t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f27397u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f27397u = j10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(this.f27397u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f27396t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f27397u;
                this.f27396t = 1;
                if (g.c(j10, this) == objE) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.job.JobDispatcherBridge$markAsReadAsync$1", f = "JobDispatcherBridge.kt", l = {34}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27398t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f27399u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f27400v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, String str, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f27399u = j10;
            this.f27400v = str;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new d(this.f27399u, this.f27400v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f27398t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f27399u;
                String str = this.f27400v;
                this.f27398t = 1;
                if (oi.d.a(j10, str, this) == objE) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.roblox.client.job.JobDispatcherBridge$sendChatMessageAsync$1", f = "JobDispatcherBridge.kt", l = {20}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function1<nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f27401t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f27402u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f27403v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f27404w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ a f27405x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, String str, String str2, a aVar, nt.b<? super e> bVar) {
            super(1, bVar);
            this.f27402u = j10;
            this.f27403v = str;
            this.f27404w = str2;
            this.f27405x = aVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(nt.b<?> bVar) {
            return new e(this.f27402u, this.f27403v, this.f27404w, this.f27405x, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objE = ot.c.e();
            int i10 = this.f27401t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f27402u;
                String str = this.f27403v;
                String str2 = this.f27404w;
                this.f27401t = 1;
                objB = oi.d.b(j10, str, str2, this);
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
            a aVar = this.f27405x;
            Throwable thE = n.e(objB);
            if (thE != null && (thE instanceof oi.e) && aVar != null) {
                oi.e eVar = (oi.e) thE;
                aVar.a(eVar.getResultType(), Intrinsics.c("moderated", eVar.getResultType()));
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nt.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public static final void a(long userId) {
        oi.c.f27373a.f(new b(userId, null));
    }

    public static final void b(long userId) {
        oi.c.f27373a.f(new c(userId, null));
    }

    public static final void c(long conversationId, @Nullable String conversationGuid) {
        oi.c.f27373a.f(new d(conversationId, conversationGuid, null));
    }

    public static final void d(long conversationId, @Nullable String conversationGuid, @NotNull String message, @Nullable a onFailed) {
        Intrinsics.checkNotNullParameter(message, "message");
        oi.c.f27373a.c(conversationGuid == null ? String.valueOf(conversationId) : conversationGuid, new e(conversationId, conversationGuid, message, onFailed, null));
    }
}
