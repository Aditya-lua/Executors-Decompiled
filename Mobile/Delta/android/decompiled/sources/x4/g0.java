package x4;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u000fJH\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lx4/g0;", "Lx4/m;", "R", "Lx4/g0$a;", Payload.TYPE, "Lkotlin/Function2;", "Lx4/f0;", "Lnt/b;", "", "block", "c", "(Lx4/g0$a;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "", "b", "(Lnt/b;)Ljava/lang/Object;", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface g0 extends m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lx4/g0$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        DEFERRED,
        IMMEDIATE,
        EXCLUSIVE;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ qt.a f34742e = qt.b.a(a());
    }

    @Nullable
    Object b(@NotNull nt.b<? super Boolean> bVar);

    @Nullable
    <R> Object c(@NotNull a aVar, @NotNull Function2<? super f0<R>, ? super nt.b<? super R>, ? extends Object> function2, @NotNull nt.b<? super R> bVar);
}
