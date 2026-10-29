package p125fb;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: renamed from: fb.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5508d {

    /* JADX INFO: renamed from: b */
    public final int f21278b;

    /* JADX INFO: renamed from: c */
    public int f21279c = -1;

    /* JADX INFO: renamed from: d */
    public int f21280d = 0;

    /* JADX INFO: renamed from: e */
    public int f21281e = 0;

    /* JADX INFO: renamed from: f */
    public int f21282f = 0;

    /* JADX INFO: renamed from: g */
    public int f21283g = 0;

    /* JADX INFO: renamed from: a */
    public IBinder f21277a = null;

    public C5508d(int i10, IBinder iBinder) {
        this.f21278b = i10;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m25170a() {
        Bundle bundle = new Bundle();
        bundle.putInt("popupLocationInfo.gravity", this.f21278b);
        bundle.putInt("popupLocationInfo.displayId", this.f21279c);
        bundle.putInt("popupLocationInfo.left", this.f21280d);
        bundle.putInt("popupLocationInfo.top", this.f21281e);
        bundle.putInt("popupLocationInfo.right", this.f21282f);
        bundle.putInt("popupLocationInfo.bottom", this.f21283g);
        return bundle;
    }
}
