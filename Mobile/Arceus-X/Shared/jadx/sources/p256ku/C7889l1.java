package p256ku;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ku.l1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Lku/l1;", "Lku/y1;", "", "isActive", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "a", "Z", "b", "()Z", "Lku/o2;", "d", "()Lku/o2;", "list", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7889l1 implements InterfaceC7943y1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isActive;

    public C7889l1(boolean z10) {
        this.isActive = z10;
    }

    @Override // p256ku.InterfaceC7943y1
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }

    @Override // p256ku.InterfaceC7943y1
    @Nullable
    /* JADX INFO: renamed from: d */
    public C7904o2 getList() {
        return null;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(getIsActive() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
