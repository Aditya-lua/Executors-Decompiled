package wd;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends a implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wd.f
    public final void z0(String str, Bundle bundle, h hVar) {
        Parcel parcelR2 = r2();
        parcelR2.writeString(str);
        int i10 = c.f34165a;
        parcelR2.writeInt(1);
        bundle.writeToParcel(parcelR2, 0);
        parcelR2.writeStrongBinder(hVar);
        s2(2, parcelR2);
    }
}
