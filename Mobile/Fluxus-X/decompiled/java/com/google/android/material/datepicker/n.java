package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Comparable<n>, Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Calendar f7813a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f7818g;

    public class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(@NonNull Parcel parcel) {
            return n.k(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    public n(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = u.c(calendar);
        this.f7813a = calendarC;
        this.b = calendarC.get(2);
        this.f7814c = calendarC.get(1);
        this.f7815d = calendarC.getMaximum(7);
        this.f7816e = calendarC.getActualMaximum(5);
        this.f7817f = calendarC.getTimeInMillis();
    }

    @NonNull
    public static n k(int i10, int i11) {
        Calendar calendarI = u.i();
        calendarI.set(1, i10);
        calendarI.set(2, i11);
        return new n(calendarI);
    }

    @NonNull
    public static n o(long j10) {
        Calendar calendarI = u.i();
        calendarI.setTimeInMillis(j10);
        return new n(calendarI);
    }

    @NonNull
    public static n p() {
        return new n(u.g());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull n nVar) {
        return this.f7813a.compareTo(nVar.f7813a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.b == nVar.b && this.f7814c == nVar.f7814c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.f7814c)});
    }

    public int q(int i10) {
        int i11 = this.f7813a.get(7);
        if (i10 <= 0) {
            i10 = this.f7813a.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f7815d : i12;
    }

    public long r(int i10) {
        Calendar calendarC = u.c(this.f7813a);
        calendarC.set(5, i10);
        return calendarC.getTimeInMillis();
    }

    public int s(long j10) {
        Calendar calendarC = u.c(this.f7813a);
        calendarC.setTimeInMillis(j10);
        return calendarC.get(5);
    }

    @NonNull
    public String u() {
        if (this.f7818g == null) {
            this.f7818g = e.f(this.f7813a.getTimeInMillis());
        }
        return this.f7818g;
    }

    public long v() {
        return this.f7813a.getTimeInMillis();
    }

    @NonNull
    public n w(int i10) {
        Calendar calendarC = u.c(this.f7813a);
        calendarC.add(2, i10);
        return new n(calendarC);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.f7814c);
        parcel.writeInt(this.b);
    }

    public int x(@NonNull n nVar) {
        if (this.f7813a instanceof GregorianCalendar) {
            return ((nVar.f7814c - this.f7814c) * 12) + (nVar.b - this.b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}
