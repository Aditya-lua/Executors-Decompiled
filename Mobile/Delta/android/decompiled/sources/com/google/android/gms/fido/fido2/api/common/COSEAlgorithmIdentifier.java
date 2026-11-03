package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import n9.k;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public class COSEAlgorithmIdentifier implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final com.google.android.gms.fido.fido2.api.common.a f6019a;

    public static class a extends Exception {
        public a(int i10) {
            super("Algorithm with COSE value " + i10 + " not supported");
        }
    }

    public COSEAlgorithmIdentifier(@NonNull com.google.android.gms.fido.fido2.api.common.a aVar) {
        this.f6019a = (com.google.android.gms.fido.fido2.api.common.a) m.l(aVar);
    }

    @NonNull
    public static COSEAlgorithmIdentifier a(int i10) throws a {
        com.google.android.gms.fido.fido2.api.common.a aVar;
        if (i10 != ca.b.LEGACY_RS1.a()) {
            for (ca.b bVar : ca.b.values()) {
                if (bVar.a() == i10) {
                    aVar = bVar;
                }
            }
            for (ca.a aVar2 : ca.a.values()) {
                if (aVar2.a() == i10) {
                    aVar = aVar2;
                }
            }
            throw new a(i10);
        }
        aVar = ca.b.RS1;
        return new COSEAlgorithmIdentifier(aVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.f6019a.a() == ((COSEAlgorithmIdentifier) obj).f6019a.a();
    }

    public int f() {
        return this.f6019a.a();
    }

    public int hashCode() {
        return k.c(this.f6019a);
    }

    @NonNull
    public final String toString() {
        return "COSEAlgorithmIdentifier{algorithm=" + String.valueOf(this.f6019a) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.f6019a.a());
    }
}
