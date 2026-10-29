package nu;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p617ou.AbstractC10054d;

/* JADX INFO: renamed from: nu.j0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"Lnu/j0;", "Lou/d;", "Lnu/h0;", "<init>", "()V", "flow", "", "c", "(Lnu/h0;)Z", "", "Lnt/b;", "", "d", "(Lnu/h0;)[Lnt/b;", "", "a", "J", "index", "b", "Lnt/b;", "cont", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C9580j0 extends AbstractC10054d<C9576h0<?>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long index = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public InterfaceC9557b<? super Unit> cont;

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Z */
    @Override // p617ou.AbstractC10054d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo37810a(@NotNull C9576h0<?> flow) {
        if (this.index >= 0) {
            return false;
        }
        this.index = flow.m37751X();
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;)[Lnt/b; */
    @Override // p617ou.AbstractC10054d
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC9557b<Unit>[] mo37811b(@NotNull C9576h0<?> flow) {
        long j10 = this.index;
        this.index = -1L;
        this.cont = null;
        return flow.m37750W(j10);
    }
}
