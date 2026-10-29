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
    public final Month f7816a;

    @NonNull
    public final Month b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final DateValidator f7817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Month f7818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7821g;

    public interface DateValidator extends Parcelable {
        boolean X0(long j10);
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
        public static final long f7822f = p.a(Month.j(1900, 0).f7835f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final long f7823g = p.a(Month.j(2100, 11).f7835f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f7824a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f7825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7826d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public DateValidator f7827e;

        public b(@NonNull CalendarConstraints calendarConstraints) {
            this.f7824a = f7822f;
            this.b = f7823g;
            this.f7827e = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.f7824a = calendarConstraints.f7816a.f7835f;
            this.b = calendarConstraints.b.f7835f;
            this.f7825c = Long.valueOf(calendarConstraints.f7818d.f7835f);
            this.f7826d = calendarConstraints.f7819e;
            this.f7827e = calendarConstraints.f7817c;
        }

        @NonNull
        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f7827e);
            Month monthN = Month.n(this.f7824a);
            Month monthN2 = Month.n(this.b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f7825c;
            return new CalendarConstraints(monthN, monthN2, dateValidator, l10 == null ? null : Month.n(l10.longValue()), this.f7826d, null);
        }

        @NonNull
        public b b(long j10) {
            this.f7825c = Long.valueOf(j10);
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
        return this.f7816a.equals(calendarConstraints.f7816a) && this.b.equals(calendarConstraints.b) && x2.b.a(this.f7818d, calendarConstraints.f7818d) && this.f7819e == calendarConstraints.f7819e && this.f7817c.equals(calendarConstraints.f7817c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7816a, this.b, this.f7818d, Integer.valueOf(this.f7819e), this.f7817c});
    }

    public Month k(Month month) {
        if (month.compareTo(this.f7816a) < 0) {
            return this.f7816a;
        }
        return month.compareTo(this.b) > 0 ? this.b : month;
    }

    public DateValidator m() {
        return this.f7817c;
    }

    @NonNull
    public Month n() {
        return this.b;
    }

    public int o() {
        return this.f7819e;
    }

    public int p() {
        return this.f7821g;
    }

    public Month q() {
        return this.f7818d;
    }

    @NonNull
    public Month r() {
        return this.f7816a;
    }

    public int s() {
        return this.f7820f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7816a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.f7818d, 0);
        parcel.writeParcelable(this.f7817c, 0);
        parcel.writeInt(this.f7819e);
    }

    public CalendarConstraints(@NonNull Month month, @NonNull Month month2, @NonNull DateValidator dateValidator, Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f7816a = month;
        this.b = month2;
        this.f7818d = month3;
        this.f7819e = i10;
        this.f7817c = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > p.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f7821g = month.x(month2) + 1;
        this.f7820f = (month2.f7832c - month.f7832c) + 1;
    }
}
