package xq;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H ¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048 X \u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, d2 = {"Lxq/a;", "", "<init>", "()V", "", "position", "", "positionOffset", "", "b", "(IF)V", "selectedPosition", "nextPosition", "c", "(IIF)V", "d", "(I)V", "a", "I", "lastLeftPosition", "lastRightPosition", "()I", "pageCount", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int lastLeftPosition = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int lastRightPosition = -1;

    public abstract int a();

    public final void b(int position, float positionOffset) {
        int i10;
        float f10 = position + positionOffset;
        float fA = a() - 1;
        int i11 = (int) f10;
        int i12 = i11 + 1;
        if (i11 < 0) {
            i11 = -1;
        }
        if (i12 > fA) {
            i12 = -1;
        }
        c(i11, i12, f10 % 1);
        int i13 = this.lastLeftPosition;
        if (i13 != -1) {
            if (i11 != -1 && i11 > i13) {
                Iterator<Integer> it = kotlin.ranges.d.q(i13, i11).iterator();
                while (it.hasNext()) {
                    d(((e0) it).nextInt());
                }
            }
            if (i12 != -1 && i12 < (i10 = this.lastRightPosition)) {
                d(i10);
                Iterator<Integer> it2 = new IntRange(i12 + 1, this.lastRightPosition).iterator();
                while (it2.hasNext()) {
                    d(((e0) it2).nextInt());
                }
            }
        }
        this.lastLeftPosition = i11;
        this.lastRightPosition = i12;
    }

    public abstract void c(int selectedPosition, int nextPosition, float positionOffset);

    public abstract void d(int position);
}
