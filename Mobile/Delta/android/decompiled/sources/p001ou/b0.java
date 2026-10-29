package p001ou;

import kotlin.Metadata;
import mu.a;
import nu.h0;
import nu.p0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lou/b0;", "Lnu/p0;", "", "Lnu/h0;", "initialValue", "<init>", "(I)V", "delta", "", "Z", "(I)Z", "Y", "()Ljava/lang/Integer;", "value", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 extends h0<Integer> implements p0<Integer> {
    public b0(int i10) {
        super(1, Integer.MAX_VALUE, a.DROP_OLDEST);
        a(Integer.valueOf(i10));
    }

    @Override // nu.p0
    @NotNull
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(L().intValue());
        }
        return numValueOf;
    }

    public final boolean Z(int delta) {
        boolean zA;
        synchronized (this) {
            zA = a(Integer.valueOf(L().intValue() + delta));
        }
        return zA;
    }
}
