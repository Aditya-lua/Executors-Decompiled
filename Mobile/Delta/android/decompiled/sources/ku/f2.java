package ku;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t¨\u0006\u0011"}, d2 = {"Lku/f2;", "Lku/j2;", "Lku/a0;", "Lku/d2;", "parent", "<init>", "(Lku/d2;)V", "", "e", "()Z", "T0", "c", "Z", "g0", "handlesException", "h0", "onCancelComplete", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f2 extends j2 implements a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean handlesException;

    public f2(@Nullable d2 d2Var) {
        super(true);
        q0(d2Var);
        this.handlesException = T0();
    }

    public final boolean T0() {
        j2 j2VarV;
        u uVarK0 = k0();
        v vVar = uVarK0 instanceof v ? (v) uVarK0 : null;
        if (vVar != null && (j2VarV = vVar.v()) != null) {
            while (!j2VarV.getHandlesException()) {
                u uVarK1 = j2VarV.k0();
                v vVar2 = uVarK1 instanceof v ? (v) uVarK1 : null;
                if (vVar2 == null || (j2VarV = vVar2.v()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // ku.a0
    public boolean e() {
        return w0(Unit.f22483a);
    }

    @Override // ku.j2
    /* JADX INFO: renamed from: g0, reason: from getter */
    public boolean getHandlesException() {
        return this.handlesException;
    }

    @Override // ku.j2
    public boolean h0() {
        return true;
    }
}
