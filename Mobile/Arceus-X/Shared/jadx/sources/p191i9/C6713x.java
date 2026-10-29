package p191i9;

import android.os.Bundle;

/* JADX INFO: renamed from: i9.x */
/* JADX INFO: loaded from: classes.dex */
public final class C6713x extends AbstractC6714y {
    public C6713x(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // p191i9.AbstractC6714y
    /* JADX INFO: renamed from: a */
    public final void mo28777a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m28810d(null);
        } else {
            m28809c(new C6715z(4, "Invalid response to one way request", null));
        }
    }

    @Override // p191i9.AbstractC6714y
    /* JADX INFO: renamed from: b */
    public final boolean mo28778b() {
        return true;
    }
}
