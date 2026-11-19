package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f8262a;
    public final b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8267g;

    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(int i10, int i11, int i12, int i13) {
        this.f8264d = i10;
        this.f8265e = i11;
        this.f8266f = i12;
        this.f8263c = i13;
        this.f8267g = g(i10);
        this.f8262a = new b(59);
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
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f8264d == eVar.f8264d && this.f8265e == eVar.f8265e && this.f8263c == eVar.f8263c && this.f8266f == eVar.f8266f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8263c), Integer.valueOf(this.f8264d), Integer.valueOf(this.f8265e), Integer.valueOf(this.f8266f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8264d);
        parcel.writeInt(this.f8265e);
        parcel.writeInt(this.f8266f);
        parcel.writeInt(this.f8263c);
    }

    public e(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
