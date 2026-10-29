package p0;

import android.util.Size;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparator<Size> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28060a;

    public e() {
        this(false);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Size size, Size size2) {
        int iSignum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        return this.f28060a ? iSignum * (-1) : iSignum;
    }

    public e(boolean z10) {
        this.f28060a = z10;
    }
}
