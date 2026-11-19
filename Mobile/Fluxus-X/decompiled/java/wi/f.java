package wi;

import av.p0;
import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import gu.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lwi/f;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "conversationId", BuildConfig.FLAVOR, "conversationGuid", "message", "Lwi/f$a;", "onFailed", BuildConfig.FLAVOR, "d", "(JLjava/lang/String;Ljava/lang/String;Lwi/f$a;)V", "c", "(JLjava/lang/String;)V", "userId", "b", "(J)V", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f35828a = new f();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lwi/f$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "resultType", BuildConfig.FLAVOR, "isModerated", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;Z)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void a(@NotNull String resultType, boolean isModerated);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.job.JobDispatcherBridge$fetchAvatarHeadshotsAsync$1", f = "JobDispatcherBridge.kt", l = {48}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35829t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f35830u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f35830u = j10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new b(this.f35830u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f35829t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f35830u;
                this.f35829t = 1;
                if (g.a(j10, this) == objE) {
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
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.job.JobDispatcherBridge$fetchUserAndHeadshotAsync$1", f = "JobDispatcherBridge.kt", l = {RequestError.NO_DEV_KEY}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35831t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f35832u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f35832u = j10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(this.f35832u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f35831t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f35832u;
                this.f35831t = 1;
                if (g.c(j10, this) == objE) {
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
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.job.JobDispatcherBridge$markAsReadAsync$1", f = "JobDispatcherBridge.kt", l = {34}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35833t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f35834u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f35835v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, String str, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f35834u = j10;
            this.f35835v = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new d(this.f35834u, this.f35835v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f35833t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f35834u;
                String str = this.f35835v;
                this.f35833t = 1;
                if (wi.d.a(j10, str, this) == objE) {
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
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.job.JobDispatcherBridge$sendChatMessageAsync$1", f = "JobDispatcherBridge.kt", l = {20}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35836t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f35837u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f35838v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f35839w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ a f35840x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, String str, String str2, a aVar, eu.b<? super e> bVar) {
            super(1, bVar);
            this.f35837u = j10;
            this.f35838v = str;
            this.f35839w = str2;
            this.f35840x = aVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return new e(this.f35837u, this.f35838v, this.f35839w, this.f35840x, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objE = fu.c.e();
            int i10 = this.f35836t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f35837u;
                String str = this.f35838v;
                String str2 = this.f35839w;
                this.f35836t = 1;
                objB = wi.d.b(j10, str, str2, this);
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
            a aVar = this.f35840x;
            Throwable thE = n.e(objB);
            if (thE != null && (thE instanceof wi.e) && aVar != null) {
                wi.e eVar = (wi.e) thE;
                aVar.a(eVar.getResultType(), Intrinsics.c("moderated", eVar.getResultType()));
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public static final void a(long userId) {
        wi.c.f35808a.f(new b(userId, null));
    }

    public static final void b(long userId) {
        wi.c.f35808a.f(new c(userId, null));
    }

    public static final void c(long conversationId, @Nullable String conversationGuid) {
        wi.c.f35808a.f(new d(conversationId, conversationGuid, null));
    }

    public static final void d(long conversationId, @Nullable String conversationGuid, @NotNull String message, @Nullable a onFailed) {
        Intrinsics.checkNotNullParameter(message, "message");
        wi.c.f35808a.c(conversationGuid == null ? String.valueOf(conversationId) : conversationGuid, new e(conversationId, conversationGuid, message, onFailed, null));
    }
}
