package fk;

import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nu.c0;
import nu.j;
import nu.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.f;
import pt.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"Lfk/e;", "", "<init>", "()V", "", "a", "(Lnt/b;)Ljava/lang/Object;", "userId", "", "c", "(J)V", "", "b", "()Z", "Lnu/c0;", "Lnu/c0;", "userIdStateFlow", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f16798a = new e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final c0<Long> userIdStateFlow = r0.a(-1L);

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.user.UserInfoStore$awaitSignedInUserId$2", f = "UserInfoStore.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<Long, nt.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f16799t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ long f16800u;

        public a(nt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            a aVar = new a(bVar);
            aVar.f16800u = ((Number) obj).longValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l10, nt.b<? super Boolean> bVar) {
            return q(l10.longValue(), bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            long j10 = this.f16800u;
            ot.c.e();
            if (this.f16799t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return pt.b.a(j10 != -1);
        }

        public final Object q(long j10, nt.b<? super Boolean> bVar) {
            return ((a) create(Long.valueOf(j10), bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Nullable
    public final Object a(@NotNull nt.b<? super Long> bVar) {
        return j.t(userIdStateFlow, new a(null), bVar);
    }

    public final boolean b() {
        return userIdStateFlow.getValue().longValue() != -1;
    }

    public final void c(long userId) {
        userIdStateFlow.setValue(Long.valueOf(userId));
    }
}
