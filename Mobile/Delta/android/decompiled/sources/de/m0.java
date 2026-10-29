package de;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m0 extends b0 implements n0 {
    public m0() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // de.b0
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Bundle bundle = (Bundle) f0.a(parcel, Bundle.CREATOR);
            f0.b(parcel);
            C1(bundle);
            return true;
        }
        if (i10 == 3) {
            Bundle bundle2 = (Bundle) f0.a(parcel, Bundle.CREATOR);
            f0.b(parcel);
            b(bundle2);
            return true;
        }
        if (i10 == 4) {
            Bundle bundle3 = (Bundle) f0.a(parcel, Bundle.CREATOR);
            f0.b(parcel);
            I1(bundle3);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) f0.a(parcel, Bundle.CREATOR);
        f0.b(parcel);
        d(bundle4);
        return true;
    }
}
