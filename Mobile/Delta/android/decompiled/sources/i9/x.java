package i9;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class x extends y {
    public x(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // i9.y
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new z(4, "Invalid response to one way request", null));
        }
    }

    @Override // i9.y
    public final boolean b() {
        return true;
    }
}
