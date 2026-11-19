package nk;

import com.github.luben.zstd.BuildConfig;
import dv.c0;
import dv.j;
import dv.r0;
import gu.f;
import gu.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"Lnk/e;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "a", "(Leu/b;)Ljava/lang/Object;", "userId", BuildConfig.FLAVOR, "c", "(J)V", BuildConfig.FLAVOR, "b", "()Z", "Ldv/c0;", "Ldv/c0;", "userIdStateFlow", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f25810a = new e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final c0<Long> userIdStateFlow = r0.a(-1L);

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "it", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.user.UserInfoStore$awaitSignedInUserId$2", f = "UserInfoStore.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<Long, eu.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f25811t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ long f25812u;

        public a(eu.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            a aVar = new a(bVar);
            aVar.f25812u = ((Number) obj).longValue();
            return aVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l10, eu.b<? super Boolean> bVar) {
            return m(l10.longValue(), bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            long j10 = this.f25812u;
            fu.c.e();
            if (this.f25811t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return gu.b.a(j10 != -1);
        }

        public final Object m(long j10, eu.b<? super Boolean> bVar) {
            return ((a) create(Long.valueOf(j10), bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Nullable
    public final Object a(@NotNull eu.b<? super Long> bVar) {
        return j.u(userIdStateFlow, new a(null), bVar);
    }

    public final boolean b() {
        return userIdStateFlow.getValue().longValue() != -1;
    }

    public final void c(long userId) {
        userIdStateFlow.setValue(Long.valueOf(userId));
    }
}
