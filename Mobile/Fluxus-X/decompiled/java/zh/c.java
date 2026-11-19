package zh;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39318a;
    public Bundle b;

    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
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
        return this.f39318a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f39318a);
        parcel.writeBundle(this.b);
    }

    public c(String str) {
        this(str, new Bundle());
    }

    public c(String str, Bundle bundle) {
        this.f39318a = str;
        this.b = bundle;
    }

    public c(Parcel parcel) {
        this.f39318a = parcel.readString();
        this.b = parcel.readBundle();
    }
}
