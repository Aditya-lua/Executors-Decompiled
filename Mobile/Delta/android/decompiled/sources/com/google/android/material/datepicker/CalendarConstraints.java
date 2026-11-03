package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Month f7890a;

    @NonNull
    public final Month b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final DateValidator f7891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Month f7892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7895g;

    public interface DateValidator extends Parcelable {
        boolean T0(long j10);
    }

    public class a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f7896f = p.a(Month.j(1900, 0).f7909f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final long f7897g = p.a(Month.j(2100, 11).f7909f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f7898a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f7899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7900d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public DateValidator f7901e;

        public b(@NonNull CalendarConstraints calendarConstraints) {
            this.f7898a = f7896f;
            this.b = f7897g;
            this.f7901e = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.f7898a = calendarConstraints.f7890a.f7909f;
            this.b = calendarConstraints.b.f7909f;
            this.f7899c = Long.valueOf(calendarConstraints.f7892d.f7909f);
            this.f7900d = calendarConstraints.f7893e;
            this.f7901e = calendarConstraints.f7891c;
        }

        @NonNull
        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f7901e);
            Month monthN = Month.n(this.f7898a);
            Month monthN2 = Month.n(this.b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f7899c;
            return new CalendarConstraints(monthN, monthN2, dateValidator, l10 == null ? null : Month.n(l10.longValue()), this.f7900d, null);
        }

        @NonNull
        public b b(long j10) {
            this.f7899c = Long.valueOf(j10);
            return this;
        }
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10, a aVar) {
        this(month, month2, dateValidator, month3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f7890a.equals(calendarConstraints.f7890a) && this.b.equals(calendarConstraints.b) && x2.b.a(this.f7892d, calendarConstraints.f7892d) && this.f7893e == calendarConstraints.f7893e && this.f7891c.equals(calendarConstraints.f7891c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7890a, this.b, this.f7892d, Integer.valueOf(this.f7893e), this.f7891c});
    }

    public Month k(Month month) {
        if (month.compareTo(this.f7890a) < 0) {
            return this.f7890a;
        }
        return month.compareTo(this.b) > 0 ? this.b : month;
    }

    public DateValidator m() {
        return this.f7891c;
    }

    @NonNull
    public Month n() {
        return this.b;
    }

    public int o() {
        return this.f7893e;
    }

    public int p() {
        return this.f7895g;
    }

    public Month q() {
        return this.f7892d;
    }

    @NonNull
    public Month r() {
        return this.f7890a;
    }

    public int s() {
        return this.f7894f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7890a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.f7892d, 0);
        parcel.writeParcelable(this.f7891c, 0);
        parcel.writeInt(this.f7893e);
    }

    public CalendarConstraints(@NonNull Month month, @NonNull Month month2, @NonNull DateValidator dateValidator, Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f7890a = month;
        this.b = month2;
        this.f7892d = month3;
        this.f7893e = i10;
        this.f7891c = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > p.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f7895g = month.y(month2) + 1;
        this.f7894f = (month2.f7906c - month.f7906c) + 1;
    }
}
