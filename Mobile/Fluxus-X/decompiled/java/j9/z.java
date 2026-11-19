package j9;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class z extends a0 {
    public z(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // j9.a0
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new b0(4, "Invalid response to one way request", null));
        }
    }

    @Override // j9.a0
    public final boolean b() {
        return true;
    }
}
