package j9;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends a0 {
    public c0(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // j9.a0
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // j9.a0
    public final boolean b() {
        return false;
    }
}
