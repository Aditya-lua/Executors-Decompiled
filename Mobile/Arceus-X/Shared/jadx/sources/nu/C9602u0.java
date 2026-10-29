package nu;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: nu.u0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Lnu/u0;", "Lnu/i;", "", "", "e", "<init>", "(Ljava/lang/Throwable;)V", "value", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "a", "Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C9602u0 implements InterfaceC9577i<Object> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Throwable e;

    public C9602u0(@NotNull Throwable th2) {
        this.e = th2;
    }

    @Override // nu.InterfaceC9577i
    @Nullable
    public Object emit(@Nullable Object obj, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
        throw this.e;
    }
}
