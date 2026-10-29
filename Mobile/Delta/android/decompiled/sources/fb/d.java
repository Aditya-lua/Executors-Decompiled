package fb;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16518c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16519d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16520e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16521f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16522g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f16517a = null;

    public d(int i10, IBinder iBinder) {
        this.b = i10;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("popupLocationInfo.gravity", this.b);
        bundle.putInt("popupLocationInfo.displayId", this.f16518c);
        bundle.putInt("popupLocationInfo.left", this.f16519d);
        bundle.putInt("popupLocationInfo.top", this.f16520e);
        bundle.putInt("popupLocationInfo.right", this.f16521f);
        bundle.putInt("popupLocationInfo.bottom", this.f16522g);
        return bundle;
    }
}
