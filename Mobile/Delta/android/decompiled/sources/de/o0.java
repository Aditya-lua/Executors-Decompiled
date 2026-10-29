package de;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends a implements q0 {
    public o0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // de.q0
    public final void f1(Bundle bundle, s0 s0Var) {
        Parcel parcelR2 = r2();
        f0.c(parcelR2, bundle);
        parcelR2.writeStrongBinder(s0Var);
        s2(2, parcelR2);
    }
}
