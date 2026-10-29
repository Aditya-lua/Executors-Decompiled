package com.roblox.client.feature;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class FeatureState implements Parcelable {
    public static final Parcelable.Creator<FeatureState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9032a;
    public Bundle b;

    public class a implements Parcelable.Creator<FeatureState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FeatureState createFromParcel(Parcel parcel) {
            return new FeatureState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FeatureState[] newArray(int i10) {
            return new FeatureState[i10];
        }
    }

    public Bundle a() {
        if (this.b == null) {
            this.b = new Bundle();
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long f(String str, long j10) {
        return a().getLong(str, j10);
    }

    public void g(String str, long j10) {
        a().putLong(str, j10);
    }

    public String getName() {
        return this.f9032a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9032a);
        parcel.writeBundle(this.b);
    }

    public FeatureState(String str) {
        this(str, new Bundle());
    }

    public FeatureState(String str, Bundle bundle) {
        this.f9032a = str;
        this.b = bundle;
    }

    public FeatureState(Parcel parcel) {
        this.f9032a = parcel.readString();
        this.b = parcel.readBundle();
    }
}
