package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.EnumC1579a;
import ca.EnumC1581b;
import p305n9.C8947k;
import p305n9.C8953m;

/* JADX INFO: loaded from: classes.dex */
public class COSEAlgorithmIdentifier implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new C1936g();

    /* JADX INFO: renamed from: a */
    @NonNull
    public final InterfaceC1930a f7643a;

    /* JADX INFO: renamed from: com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$a */
    public static class C1924a extends Exception {
        public C1924a(int i10) {
            super("Algorithm with COSE value " + i10 + " not supported");
        }
    }

    public COSEAlgorithmIdentifier(@NonNull InterfaceC1930a interfaceC1930a) {
        this.f7643a = (InterfaceC1930a) C8953m.m36047l(interfaceC1930a);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static COSEAlgorithmIdentifier m9295a(int i10) throws C1924a {
        InterfaceC1930a interfaceC1930a;
        if (i10 != EnumC1581b.LEGACY_RS1.mo8185a()) {
            for (EnumC1581b enumC1581b : EnumC1581b.values()) {
                if (enumC1581b.mo8185a() == i10) {
                    interfaceC1930a = enumC1581b;
                }
            }
            for (EnumC1579a enumC1579a : EnumC1579a.values()) {
                if (enumC1579a.mo8185a() == i10) {
                    interfaceC1930a = enumC1579a;
                }
            }
            throw new C1924a(i10);
        }
        interfaceC1930a = EnumC1581b.RS1;
        return new COSEAlgorithmIdentifier(interfaceC1930a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.f7643a.mo8185a() == ((COSEAlgorithmIdentifier) obj).f7643a.mo8185a();
    }

    /* JADX INFO: renamed from: f */
    public int m9296f() {
        return this.f7643a.mo8185a();
    }

    public int hashCode() {
        return C8947k.m36027c(this.f7643a);
    }

    @NonNull
    public final String toString() {
        return "COSEAlgorithmIdentifier{algorithm=" + String.valueOf(this.f7643a) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.f7643a.mo8185a());
    }
}
