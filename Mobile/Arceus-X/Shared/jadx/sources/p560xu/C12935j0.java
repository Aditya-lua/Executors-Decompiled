package p560xu;

import kotlin.Metadata;
import kotlin.collections.C7691l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xu.j0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, m31665d2 = {"Lxu/j0;", "", "<init>", "()V", "Lxu/c;", "b", "()Lxu/c;", "node", "", "a", "(Lxu/c;)V", "e", "", "vacantIndex", "d", "(ILxu/c;)V", "c", "I", "size", "", "[Lxu/c;", "array", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12935j0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public C12920c[] array = new C12920c[8];

    /* JADX INFO: renamed from: a */
    public final void m48152a(@NotNull C12920c node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int i10 = this.size + 1;
        this.size = i10;
        C12920c[] c12920cArr = this.array;
        if (i10 == c12920cArr.length) {
            C12920c[] c12920cArr2 = new C12920c[i10 * 2];
            C7691l.m31817l(c12920cArr, c12920cArr2, 0, 0, 0, 14, null);
            this.array = c12920cArr2;
        }
        m48155d(i10, node);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final C12920c m48153b() {
        return this.array[1];
    }

    /* JADX INFO: renamed from: c */
    public final void m48154c(int vacantIndex, C12920c node) {
        C12920c c12920c;
        while (true) {
            int i10 = vacantIndex << 1;
            int i11 = i10 + 1;
            int i12 = this.size;
            if (i11 > i12) {
                if (i10 > i12) {
                    break;
                }
                c12920c = this.array[i10];
                Intrinsics.checkNotNull(c12920c);
            } else {
                c12920c = this.array[i10];
                Intrinsics.checkNotNull(c12920c);
                C12920c c12920c2 = this.array[i11];
                Intrinsics.checkNotNull(c12920c2);
                if (Intrinsics.m31984g(0L, c12920c2.getTimeoutAt() - c12920c.getTimeoutAt()) >= 0) {
                    c12920c = c12920c2;
                }
            }
            if (Intrinsics.m31984g(0L, c12920c.getTimeoutAt() - node.getTimeoutAt()) <= 0) {
                break;
            }
            int i13 = c12920c.index;
            c12920c.index = vacantIndex;
            this.array[vacantIndex] = c12920c;
            vacantIndex = i13;
        }
        this.array[vacantIndex] = node;
        node.index = vacantIndex;
    }

    /* JADX INFO: renamed from: d */
    public final void m48155d(int vacantIndex, C12920c node) {
        while (true) {
            int i10 = vacantIndex >> 1;
            if (i10 == 0) {
                break;
            }
            C12920c c12920c = this.array[i10];
            Intrinsics.checkNotNull(c12920c);
            if (Intrinsics.m31984g(0L, node.getTimeoutAt() - c12920c.getTimeoutAt()) <= 0) {
                break;
            }
            c12920c.index = vacantIndex;
            this.array[vacantIndex] = c12920c;
            vacantIndex = i10;
        }
        this.array[vacantIndex] = node;
        node.index = vacantIndex;
    }

    /* JADX INFO: renamed from: e */
    public final void m48156e(@NotNull C12920c node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int i10 = node.index;
        if (i10 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i11 = this.size;
        C12920c c12920c = this.array[i11];
        Intrinsics.checkNotNull(c12920c);
        node.index = -1;
        this.array[i11] = null;
        this.size = i11 - 1;
        if (node == c12920c) {
            return;
        }
        int iM31984g = Intrinsics.m31984g(0L, c12920c.getTimeoutAt() - node.getTimeoutAt());
        if (iM31984g == 0) {
            this.array[i10] = c12920c;
            c12920c.index = i10;
        } else if (iM31984g < 0) {
            m48154c(i10, c12920c);
        } else {
            m48155d(i10, c12920c);
        }
    }
}
