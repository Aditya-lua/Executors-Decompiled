package p347p0;

import android.util.Size;
import java.util.Comparator;

/* JADX INFO: renamed from: p0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10089e implements Comparator<Size> {

    /* JADX INFO: renamed from: a */
    public boolean f36326a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10089e() {
        this(false);
    }

    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Size size, Size size2) {
        int iSignum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        return this.f36326a ? iSignum * (-1) : iSignum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10089e(boolean z10) {
        this.f36326a = z10;
    }
}
