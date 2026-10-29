package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2419z1 extends BinderC2238p0 implements InterfaceC1963a2 {
    public AbstractBinderC2419z1() {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2238p0
    /* JADX INFO: renamed from: r2 */
    public final boolean mo9842r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        zze();
        return true;
    }
}
