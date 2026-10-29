package i9;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends y {
    public a0(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // i9.y
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // i9.y
    public final boolean b() {
        return false;
    }
}
