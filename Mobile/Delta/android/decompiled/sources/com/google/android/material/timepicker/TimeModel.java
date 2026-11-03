package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f8411a;
    public final b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8416g;

    public class a implements Parcelable.Creator<TimeModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i10) {
            return new TimeModel[i10];
        }
    }

    public TimeModel(int i10, int i11, int i12, int i13) {
        this.f8413d = i10;
        this.f8414e = i11;
        this.f8415f = i12;
        this.f8412c = i13;
        this.f8416g = g(i10);
        this.f8411a = new b(59);
        this.b = new b(i13 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return f(resources, charSequence, "%02d");
    }

    public static String f(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static int g(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f8413d == timeModel.f8413d && this.f8414e == timeModel.f8414e && this.f8412c == timeModel.f8412c && this.f8415f == timeModel.f8415f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8412c), Integer.valueOf(this.f8413d), Integer.valueOf(this.f8414e), Integer.valueOf(this.f8415f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8413d);
        parcel.writeInt(this.f8414e);
        parcel.writeInt(this.f8415f);
        parcel.writeInt(this.f8412c);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
