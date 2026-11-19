package gb;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17607c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17608d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17609e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17610f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17611g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f17606a = null;

    public d(int i10, IBinder iBinder) {
        this.b = i10;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("popupLocationInfo.gravity", this.b);
        bundle.putInt("popupLocationInfo.displayId", this.f17607c);
        bundle.putInt("popupLocationInfo.left", this.f17608d);
        bundle.putInt("popupLocationInfo.top", this.f17609e);
        bundle.putInt("popupLocationInfo.right", this.f17610f);
        bundle.putInt("popupLocationInfo.bottom", this.f17611g);
        return bundle;
    }
}
