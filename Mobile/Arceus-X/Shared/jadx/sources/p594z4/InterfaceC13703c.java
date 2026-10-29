package p594z4;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p535x4.InterfaceC12663g0;

/* JADX INFO: renamed from: z4.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0010JB\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m31665d2 = {"Lz4/c;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "R", "", "isReadOnly", "Lkotlin/Function2;", "Lx4/g0;", "Lnt/b;", "", "block", "n3", "(ZLkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "", "close", "()V", "a", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC13703c extends AutoCloseable {

    /* JADX INFO: renamed from: z4.c$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Lz4/c$a;", "", "", "result", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends Throwable {
        @Nullable
        /* JADX INFO: renamed from: a */
        public final Object m50064a() {
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    void close();

    @Nullable
    /* JADX INFO: renamed from: n3 */
    <R> Object mo50063n3(boolean z10, @NotNull Function2<? super InterfaceC12663g0, ? super InterfaceC9557b<? super R>, ? extends Object> function2, @NotNull InterfaceC9557b<? super R> interfaceC9557b);
}
