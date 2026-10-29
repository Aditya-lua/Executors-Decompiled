package de;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r0 extends b0 implements s0 {
    public r0() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // de.b0
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) f0.a(parcel, Bundle.CREATOR);
        f0.b(parcel);
        d(bundle);
        return true;
    }
}
