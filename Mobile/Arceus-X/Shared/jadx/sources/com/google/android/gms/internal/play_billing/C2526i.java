package com.google.android.gms.internal.play_billing;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2526i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f9044a = 0;

    static {
        C2526i.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m11466a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m11467b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX INFO: renamed from: c */
    public static void m11468c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface.asBinder());
    }
}
