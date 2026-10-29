package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes2.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C2788a();

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Calendar f10033a;

    /* JADX INFO: renamed from: b */
    public final int f10034b;

    /* JADX INFO: renamed from: c */
    public final int f10035c;

    /* JADX INFO: renamed from: d */
    public final int f10036d;

    /* JADX INFO: renamed from: e */
    public final int f10037e;

    /* JADX INFO: renamed from: f */
    public final long f10038f;

    /* JADX INFO: renamed from: g */
    public String f10039g;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.Month$a */
    public class C2788a implements Parcelable.Creator<Month> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(@NonNull Parcel parcel) {
            return Month.m12597j(parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i10) {
            return new Month[i10];
        }
    }

    public Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM12706c = C2804p.m12706c(calendar);
        this.f10033a = calendarM12706c;
        this.f10034b = calendarM12706c.get(2);
        this.f10035c = calendarM12706c.get(1);
        this.f10036d = calendarM12706c.getMaximum(7);
        this.f10037e = calendarM12706c.getActualMaximum(5);
        this.f10038f = calendarM12706c.getTimeInMillis();
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static Month m12597j(int i10, int i11) {
        Calendar calendarM12712i = C2804p.m12712i();
        calendarM12712i.set(1, i10);
        calendarM12712i.set(2, i11);
        return new Month(calendarM12712i);
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public static Month m12598n(long j10) {
        Calendar calendarM12712i = C2804p.m12712i();
        calendarM12712i.setTimeInMillis(j10);
        return new Month(calendarM12712i);
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public static Month m12599o() {
        return new Month(C2804p.m12710g());
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull Month month) {
        return this.f10033a.compareTo(month.f10033a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f10034b == month.f10034b && this.f10035c == month.f10035c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10034b), Integer.valueOf(this.f10035c)});
    }

    /* JADX INFO: renamed from: q */
    public int m12601q(int i10) {
        int i11 = this.f10033a.get(7);
        if (i10 <= 0) {
            i10 = this.f10033a.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f10036d : i12;
    }

    /* JADX INFO: renamed from: r */
    public long m12602r(int i10) {
        Calendar calendarM12706c = C2804p.m12706c(this.f10033a);
        calendarM12706c.set(5, i10);
        return calendarM12706c.getTimeInMillis();
    }

    /* JADX INFO: renamed from: s */
    public int m12603s(long j10) {
        Calendar calendarM12706c = C2804p.m12706c(this.f10033a);
        calendarM12706c.setTimeInMillis(j10);
        return calendarM12706c.get(5);
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public String m12604u() {
        if (this.f10039g == null) {
            this.f10039g = C2791c.m12620f(this.f10033a.getTimeInMillis());
        }
        return this.f10039g;
    }

    /* JADX INFO: renamed from: v */
    public long m12605v() {
        return this.f10033a.getTimeInMillis();
    }

    @NonNull
    /* JADX INFO: renamed from: w */
    public Month m12606w(int i10) {
        Calendar calendarM12706c = C2804p.m12706c(this.f10033a);
        calendarM12706c.add(2, i10);
        return new Month(calendarM12706c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.f10035c);
        parcel.writeInt(this.f10034b);
    }

    /* JADX INFO: renamed from: x */
    public int m12607x(@NonNull Month month) {
        if (this.f10033a instanceof GregorianCalendar) {
            return ((month.f10035c - this.f10035c) * 12) + (month.f10034b - this.f10034b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}
