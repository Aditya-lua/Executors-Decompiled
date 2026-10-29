package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes2.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Calendar f7831a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f7836g;

    public class a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(@NonNull Parcel parcel) {
            return Month.j(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i10) {
            return new Month[i10];
        }
    }

    public Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = p.c(calendar);
        this.f7831a = calendarC;
        this.b = calendarC.get(2);
        this.f7832c = calendarC.get(1);
        this.f7833d = calendarC.getMaximum(7);
        this.f7834e = calendarC.getActualMaximum(5);
        this.f7835f = calendarC.getTimeInMillis();
    }

    @NonNull
    public static Month j(int i10, int i11) {
        Calendar calendarI = p.i();
        calendarI.set(1, i10);
        calendarI.set(2, i11);
        return new Month(calendarI);
    }

    @NonNull
    public static Month n(long j10) {
        Calendar calendarI = p.i();
        calendarI.setTimeInMillis(j10);
        return new Month(calendarI);
    }

    @NonNull
    public static Month o() {
        return new Month(p.g());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull Month month) {
        return this.f7831a.compareTo(month.f7831a);
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
        return this.b == month.b && this.f7832c == month.f7832c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.f7832c)});
    }

    public int q(int i10) {
        int i11 = this.f7831a.get(7);
        if (i10 <= 0) {
            i10 = this.f7831a.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f7833d : i12;
    }

    public long r(int i10) {
        Calendar calendarC = p.c(this.f7831a);
        calendarC.set(5, i10);
        return calendarC.getTimeInMillis();
    }

    public int s(long j10) {
        Calendar calendarC = p.c(this.f7831a);
        calendarC.setTimeInMillis(j10);
        return calendarC.get(5);
    }

    @NonNull
    public String u() {
        if (this.f7836g == null) {
            this.f7836g = c.f(this.f7831a.getTimeInMillis());
        }
        return this.f7836g;
    }

    public long v() {
        return this.f7831a.getTimeInMillis();
    }

    @NonNull
    public Month w(int i10) {
        Calendar calendarC = p.c(this.f7831a);
        calendarC.add(2, i10);
        return new Month(calendarC);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.f7832c);
        parcel.writeInt(this.b);
    }

    public int x(@NonNull Month month) {
        if (this.f7831a instanceof GregorianCalendar) {
            return ((month.f7832c - this.f7832c) * 12) + (month.b - this.b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}
