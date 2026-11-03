package kh;

import gt.o;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import lh.NotificationId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00042\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lkh/i;", "", "", "notificationId", "", "e", "(Ljava/lang/String;Llt/b;)Ljava/lang/Object;", "", "Llh/b;", "notificationIds", "", "a", "([Llh/b;Llt/b;)Ljava/lang/Object;", "b", "", "maxRowsCount", "d", "(ILlt/b;)Ljava/lang/Object;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f22700a;

    /* JADX INFO: renamed from: kh.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkh/i$a;", "", "<init>", "()V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f22700a = new Companion();
    }

    @nt.f(c = "com.roblox.client.db.dao.NotificationIdDao$safeInsertNotificationIds$2", f = "NotificationIdDao.kt", l = {23}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends nt.m implements Function1<lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22701t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ NotificationId[] f22703v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NotificationId[] notificationIdArr, lt.b<? super b> bVar) {
            super(1, bVar);
            this.f22703v = notificationIdArr;
        }

        @Override // nt.a
        public final lt.b<Unit> create(lt.b<?> bVar) {
            return i.this.new b(this.f22703v, bVar);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f22701t;
            if (i10 == 0) {
                o.b(obj);
                i iVar = i.this;
                NotificationId[] notificationIdArr = this.f22703v;
                NotificationId[] notificationIdArr2 = (NotificationId[]) Arrays.copyOf(notificationIdArr, notificationIdArr.length);
                this.f22701t = 1;
                if (iVar.a(notificationIdArr2, this) == objE) {
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

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lt.b<? super Unit> bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    static /* synthetic */ Object c(i iVar, NotificationId[] notificationIdArr, lt.b<? super Boolean> bVar) {
        return h.b("NotificationIdDao", iVar.new b(notificationIdArr, null), bVar);
    }

    @Nullable
    Object a(@NotNull NotificationId[] notificationIdArr, @NotNull lt.b<? super Unit> bVar);

    @Nullable
    default Object b(@NotNull NotificationId[] notificationIdArr, @NotNull lt.b<? super Boolean> bVar) {
        return c(this, notificationIdArr, bVar);
    }

    @Nullable
    Object d(int i10, @NotNull lt.b<? super Integer> bVar);

    @Nullable
    Object e(@NotNull String str, @NotNull lt.b<? super Boolean> bVar);
}
