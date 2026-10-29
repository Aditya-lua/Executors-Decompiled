package fk;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nu.C9579j;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: fk.e */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Lfk/e;", "", "<init>", "()V", "", "a", "(Lnt/b;)Ljava/lang/Object;", "userId", "", "c", "(J)V", "", "b", "()Z", "Lnu/c0;", "Lnu/c0;", "userIdStateFlow", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5656e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5656e f21712a = new C5656e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC9566c0<Long> userIdStateFlow = C9596r0.m37859a(-1L);

    /* JADX INFO: renamed from: fk.e$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m31665d2 = {"<anonymous>", "", "it", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.user.UserInfoStore$awaitSignedInUserId$2", m39664f = "UserInfoStore.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class a extends AbstractC10351m implements Function2<Long, InterfaceC9557b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t */
        public int f21714t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ long f21715u;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(interfaceC9557b);
            aVar.f21715u = ((Number) obj).longValue();
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l10, InterfaceC9557b<? super Boolean> interfaceC9557b) {
            return m25696q(l10.longValue(), interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            long j10 = this.f21715u;
            C10047c.m38805e();
            if (this.f21714t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return C10340b.m39658a(j10 != -1);
        }

        /* JADX INFO: renamed from: q */
        public final Object m25696q(long j10, InterfaceC9557b<? super Boolean> interfaceC9557b) {
            return ((a) create(Long.valueOf(j10), interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m25693a(@NotNull InterfaceC9557b<? super Long> interfaceC9557b) {
        return C9579j.m37803t(userIdStateFlow, new a(null), interfaceC9557b);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m25694b() {
        return userIdStateFlow.getValue().longValue() != -1;
    }

    /* JADX INFO: renamed from: c */
    public final void m25695c(long userId) {
        userIdStateFlow.setValue(Long.valueOf(userId));
    }
}
