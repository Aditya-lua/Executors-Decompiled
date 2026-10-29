package p272lh;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mh.NotificationId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: lh.i */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00042\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013À\u0006\u0003"}, m31665d2 = {"Llh/i;", "", "", "notificationId", "", "c", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "", "Lmh/b;", "notificationIds", "", "e", "([Lmh/b;Lnt/b;)Ljava/lang/Object;", "b", "", "maxRowsCount", "d", "(ILnt/b;)Ljava/lang/Object;", "a", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC8145i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f30205a;

    /* JADX INFO: renamed from: lh.i$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Llh/i$a;", "", "<init>", "()V", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f30205a = new Companion();
    }

    /* JADX INFO: renamed from: lh.i$b */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "com.roblox.client.db.dao.NotificationIdDao$safeInsertNotificationIds$2", m39664f = "NotificationIdDao.kt", m39665l = {23}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10351m implements Function1<InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f30206t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ NotificationId[] f30208v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NotificationId[] notificationIdArr, InterfaceC9557b<? super b> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f30208v = notificationIdArr;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return InterfaceC8145i.this.new b(this.f30208v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f30206t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC8145i interfaceC8145i = InterfaceC8145i.this;
                NotificationId[] notificationIdArr = this.f30208v;
                NotificationId[] notificationIdArr2 = (NotificationId[]) Arrays.copyOf(notificationIdArr, notificationIdArr.length);
                this.f30206t = 1;
                if (interfaceC8145i.mo33391e(notificationIdArr2, this) == objM38805e) {
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
            return ((b) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ Object m33387a(InterfaceC8145i interfaceC8145i, NotificationId[] notificationIdArr, InterfaceC9557b<? super Boolean> interfaceC9557b) {
        return C8144h.m33385b("NotificationIdDao", interfaceC8145i.new b(notificationIdArr, null), interfaceC9557b);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    default Object mo33388b(@NotNull NotificationId[] notificationIdArr, @NotNull InterfaceC9557b<? super Boolean> interfaceC9557b) {
        return m33387a(this, notificationIdArr, interfaceC9557b);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    Object mo33389c(@NotNull String str, @NotNull InterfaceC9557b<? super Boolean> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: d */
    Object mo33390d(int i10, @NotNull InterfaceC9557b<? super Integer> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: e */
    Object mo33391e(@NotNull NotificationId[] notificationIdArr, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);
}
