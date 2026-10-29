package com.roblox.client.feature;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class FeatureState implements Parcelable {
    public static final Parcelable.Creator<FeatureState> CREATOR = new C3185a();

    /* JADX INFO: renamed from: a */
    public String f11794a;

    /* JADX INFO: renamed from: b */
    public Bundle f11795b;

    /* JADX INFO: renamed from: com.roblox.client.feature.FeatureState$a */
    public class C3185a implements Parcelable.Creator<FeatureState> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FeatureState createFromParcel(Parcel parcel) {
            return new FeatureState(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FeatureState[] newArray(int i10) {
            return new FeatureState[i10];
        }
    }

    /* JADX INFO: renamed from: a */
    public Bundle m15118a() {
        if (this.f11795b == null) {
            this.f11795b = new Bundle();
        }
        return this.f11795b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public long m15119f(String str, long j10) {
        return m15118a().getLong(str, j10);
    }

    /* JADX INFO: renamed from: g */
    public void m15120g(String str, long j10) {
        m15118a().putLong(str, j10);
    }

    public String getName() {
        return this.f11794a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11794a);
        parcel.writeBundle(this.f11795b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public FeatureState(String str) {
        this(str, new Bundle());
    }

    public FeatureState(String str, Bundle bundle) {
        this.f11794a = str;
        this.f11795b = bundle;
    }

    public FeatureState(Parcel parcel) {
        this.f11794a = parcel.readString();
        this.f11795b = parcel.readBundle();
    }
}
