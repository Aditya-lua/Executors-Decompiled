package fb;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17114c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17115d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17116e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17117f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17118g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f17113a = null;

    public d(int i10, IBinder iBinder) {
        this.b = i10;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("popupLocationInfo.gravity", this.b);
        bundle.putInt("popupLocationInfo.displayId", this.f17114c);
        bundle.putInt("popupLocationInfo.left", this.f17115d);
        bundle.putInt("popupLocationInfo.top", this.f17116e);
        bundle.putInt("popupLocationInfo.right", this.f17117f);
        bundle.putInt("popupLocationInfo.bottom", this.f17118g);
        return bundle;
    }
}
