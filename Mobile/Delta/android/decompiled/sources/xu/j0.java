package xu;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Lxu/j0;", "", "<init>", "()V", "Lxu/c;", "b", "()Lxu/c;", "node", "", "a", "(Lxu/c;)V", "e", "", "vacantIndex", "d", "(ILxu/c;)V", "c", "I", "size", "", "[Lxu/c;", "array", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public c[] array = new c[8];

    public final void a(@NotNull c node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int i10 = this.size + 1;
        this.size = i10;
        c[] cVarArr = this.array;
        if (i10 == cVarArr.length) {
            c[] cVarArr2 = new c[i10 * 2];
            kotlin.collections.l.l(cVarArr, cVarArr2, 0, 0, 0, 14, null);
            this.array = cVarArr2;
        }
        d(i10, node);
    }

    @Nullable
    public final c b() {
        return this.array[1];
    }

    public final void c(int vacantIndex, c node) {
        c cVar;
        while (true) {
            int i10 = vacantIndex << 1;
            int i11 = i10 + 1;
            int i12 = this.size;
            if (i11 > i12) {
                if (i10 > i12) {
                    break;
                }
                cVar = this.array[i10];
                Intrinsics.checkNotNull(cVar);
            } else {
                cVar = this.array[i10];
                Intrinsics.checkNotNull(cVar);
                c cVar2 = this.array[i11];
                Intrinsics.checkNotNull(cVar2);
                if (Intrinsics.g(0L, cVar2.getTimeoutAt() - cVar.getTimeoutAt()) >= 0) {
                    cVar = cVar2;
                }
            }
            if (Intrinsics.g(0L, cVar.getTimeoutAt() - node.getTimeoutAt()) <= 0) {
                break;
            }
            int i13 = cVar.index;
            cVar.index = vacantIndex;
            this.array[vacantIndex] = cVar;
            vacantIndex = i13;
        }
        this.array[vacantIndex] = node;
        node.index = vacantIndex;
    }

    public final void d(int vacantIndex, c node) {
        while (true) {
            int i10 = vacantIndex >> 1;
            if (i10 == 0) {
                break;
            }
            c cVar = this.array[i10];
            Intrinsics.checkNotNull(cVar);
            if (Intrinsics.g(0L, node.getTimeoutAt() - cVar.getTimeoutAt()) <= 0) {
                break;
            }
            cVar.index = vacantIndex;
            this.array[vacantIndex] = cVar;
            vacantIndex = i10;
        }
        this.array[vacantIndex] = node;
        node.index = vacantIndex;
    }

    public final void e(@NotNull c node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int i10 = node.index;
        if (i10 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i11 = this.size;
        c cVar = this.array[i11];
        Intrinsics.checkNotNull(cVar);
        node.index = -1;
        this.array[i11] = null;
        this.size = i11 - 1;
        if (node == cVar) {
            return;
        }
        int iG = Intrinsics.g(0L, cVar.getTimeoutAt() - node.getTimeoutAt());
        if (iG == 0) {
            this.array[i10] = cVar;
            cVar.index = i10;
        } else if (iG < 0) {
            c(i10, cVar);
        } else {
            d(i10, cVar);
        }
    }
}
