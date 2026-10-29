package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;
import p325o9.C9718b;

/* JADX INFO: renamed from: com.google.firebase.messaging.n0 */
/* JADX INFO: loaded from: classes2.dex */
public class C3011n0 implements Parcelable.Creator<RemoteMessage> {
    /* JADX INFO: renamed from: c */
    public static void m14630c(RemoteMessage remoteMessage, Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38462f(parcel, 2, remoteMessage.f11207f, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        Bundle bundleM38428b = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            if (C9717a.m38440n(iM38447u) != 2) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                bundleM38428b = C9717a.m38428b(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new RemoteMessage(bundleM38428b);
    }

    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteMessage[] newArray(int i10) {
        return new RemoteMessage[i10];
    }
}
