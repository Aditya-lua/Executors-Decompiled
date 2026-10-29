package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new C2869a();

    /* JADX INFO: renamed from: a */
    public final C2876b f10708a;

    /* JADX INFO: renamed from: b */
    public final C2876b f10709b;

    /* JADX INFO: renamed from: c */
    public final int f10710c;

    /* JADX INFO: renamed from: d */
    public int f10711d;

    /* JADX INFO: renamed from: e */
    public int f10712e;

    /* JADX INFO: renamed from: f */
    public int f10713f;

    /* JADX INFO: renamed from: g */
    public int f10714g;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimeModel$a */
    public class C2869a implements Parcelable.Creator<TimeModel> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i10) {
            return new TimeModel[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TimeModel(int i10, int i11, int i12, int i13) {
        this.f10711d = i10;
        this.f10712e = i11;
        this.f10713f = i12;
        this.f10710c = i13;
        this.f10714g = m13301g(i10);
        this.f10708a = new C2876b(59);
        this.f10709b = new C2876b(i13 == 1 ? 23 : 12);
    }

    /* JADX INFO: renamed from: a */
    public static String m13299a(Resources resources, CharSequence charSequence) {
        return m13300f(resources, charSequence, "%02d");
    }

    /* JADX INFO: renamed from: f */
    public static String m13300f(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m13301g(int i10) {
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
        return this.f10711d == timeModel.f10711d && this.f10712e == timeModel.f10712e && this.f10710c == timeModel.f10710c && this.f10713f == timeModel.f10713f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10710c), Integer.valueOf(this.f10711d), Integer.valueOf(this.f10712e), Integer.valueOf(this.f10713f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f10711d);
        parcel.writeInt(this.f10712e);
        parcel.writeInt(this.f10713f);
        parcel.writeInt(this.f10710c);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
