package lh;

import android.os.Parcel;
import android.os.Parcelable;
import bh.a1;

/* JADX INFO: loaded from: classes2.dex */
public class d implements lh.a {
    public static final Parcelable.Creator<d> CREATOR = new a();

    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // lh.a
    public String getUrl() {
        return a1.q();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
    }
}
