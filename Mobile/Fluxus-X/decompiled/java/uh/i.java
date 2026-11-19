package uh;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import vh.NotificationId;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00042\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Luh/i;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "notificationId", BuildConfig.FLAVOR, "c", "(Ljava/lang/String;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "Lvh/b;", "notificationIds", BuildConfig.FLAVOR, "b", "([Lvh/b;Leu/b;)Ljava/lang/Object;", "e", BuildConfig.FLAVOR, "maxRowsCount", "a", "(ILeu/b;)Ljava/lang/Object;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f33316a;

    /* JADX INFO: renamed from: uh.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luh/i$a;", BuildConfig.FLAVOR, "<init>", "()V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f33316a = new Companion();
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.db.dao.NotificationIdDao$safeInsertNotificationIds$2", f = "NotificationIdDao.kt", l = {23}, m = "invokeSuspend", v = 1)
    public static final class b extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33317t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ NotificationId[] f33319v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NotificationId[] notificationIdArr, eu.b<? super b> bVar) {
            super(1, bVar);
            this.f33319v = notificationIdArr;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return i.this.new b(this.f33319v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33317t;
            if (i10 == 0) {
                o.b(obj);
                i iVar = i.this;
                NotificationId[] notificationIdArr = this.f33319v;
                NotificationId[] notificationIdArr2 = (NotificationId[]) Arrays.copyOf(notificationIdArr, notificationIdArr.length);
                this.f33317t = 1;
                if (iVar.b(notificationIdArr2, this) == objE) {
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

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    static /* synthetic */ Object d(i iVar, NotificationId[] notificationIdArr, eu.b<? super Boolean> bVar) {
        return h.b("NotificationIdDao", iVar.new b(notificationIdArr, null), bVar);
    }

    @Nullable
    Object a(int i10, @NotNull eu.b<? super Integer> bVar);

    @Nullable
    Object b(@NotNull NotificationId[] notificationIdArr, @NotNull eu.b<? super Unit> bVar);

    @Nullable
    Object c(@NotNull String str, @NotNull eu.b<? super Boolean> bVar);

    @Nullable
    default Object e(@NotNull NotificationId[] notificationIdArr, @NotNull eu.b<? super Boolean> bVar) {
        return d(this, notificationIdArr, bVar);
    }
}
