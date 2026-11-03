package ku;

import iu.k3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ou.b0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lku/w;", "E", "Liu/k3;", "Liu/p;", "Lku/k;", "cont", "<init>", "(Liu/p;)V", "Lou/b0;", "segment", "", "index", "", "e", "(Lou/b0;I)V", "a", "Liu/p;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w<E> implements k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final iu.p<k<? extends E>> cont;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@NotNull iu.p<? super k<? extends E>> pVar) {
        this.cont = pVar;
    }

    @Override // iu.k3
    public void e(@NotNull b0<?> segment, int index) {
        this.cont.e(segment, index);
    }
}
