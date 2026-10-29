package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.fido.fido2.api.common.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1936g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return COSEAlgorithmIdentifier.m9295a(parcel.readInt());
        } catch (COSEAlgorithmIdentifier.C1924a e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new COSEAlgorithmIdentifier[i10];
    }
}
