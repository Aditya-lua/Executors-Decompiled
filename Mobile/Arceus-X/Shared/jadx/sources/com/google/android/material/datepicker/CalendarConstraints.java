package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Objects;
import p533x2.C12632b;

/* JADX INFO: loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C2784a();

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Month f10015a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Month f10016b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final DateValidator f10017c;

    /* JADX INFO: renamed from: d */
    public Month f10018d;

    /* JADX INFO: renamed from: e */
    public final int f10019e;

    /* JADX INFO: renamed from: f */
    public final int f10020f;

    /* JADX INFO: renamed from: g */
    public final int f10021g;

    public interface DateValidator extends Parcelable {
        /* JADX INFO: renamed from: X0 */
        boolean mo12567X0(long j10);
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    public class C2784a implements Parcelable.Creator<CalendarConstraints> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.CalendarConstraints$b */
    public static final class C2785b {

        /* JADX INFO: renamed from: f */
        public static final long f10022f = C2804p.m12704a(Month.m12597j(1900, 0).f10038f);

        /* JADX INFO: renamed from: g */
        public static final long f10023g = C2804p.m12704a(Month.m12597j(2100, 11).f10038f);

        /* JADX INFO: renamed from: a */
        public long f10024a;

        /* JADX INFO: renamed from: b */
        public long f10025b;

        /* JADX INFO: renamed from: c */
        public Long f10026c;

        /* JADX INFO: renamed from: d */
        public int f10027d;

        /* JADX INFO: renamed from: e */
        public DateValidator f10028e;

        public C2785b(@NonNull CalendarConstraints calendarConstraints) {
            this.f10024a = f10022f;
            this.f10025b = f10023g;
            this.f10028e = DateValidatorPointForward.m12581a(Long.MIN_VALUE);
            this.f10024a = calendarConstraints.f10015a.f10038f;
            this.f10025b = calendarConstraints.f10016b.f10038f;
            this.f10026c = Long.valueOf(calendarConstraints.f10018d.f10038f);
            this.f10027d = calendarConstraints.f10019e;
            this.f10028e = calendarConstraints.f10017c;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public CalendarConstraints m12570a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f10028e);
            Month monthM12598n = Month.m12598n(this.f10024a);
            Month monthM12598n2 = Month.m12598n(this.f10025b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f10026c;
            return new CalendarConstraints(monthM12598n, monthM12598n2, dateValidator, l10 == null ? null : Month.m12598n(l10.longValue()), this.f10027d, null);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C2785b m12571b(long j10) {
            this.f10026c = Long.valueOf(j10);
            return this;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
      (r1v0 com.google.android.material.datepicker.Month)
      (r2v0 com.google.android.material.datepicker.Month)
      (r3v0 com.google.android.material.datepicker.CalendarConstraints$DateValidator)
      (r4v0 com.google.android.material.datepicker.Month)
      (r5v0 int)
     A[MD:(com.google.android.material.datepicker.Month, com.google.android.material.datepicker.Month, com.google.android.material.datepicker.CalendarConstraints$DateValidator, com.google.android.material.datepicker.Month, int):void (m)] (LINE:1) call: com.google.android.material.datepicker.CalendarConstraints.<init>(com.google.android.material.datepicker.Month, com.google.android.material.datepicker.Month, com.google.android.material.datepicker.CalendarConstraints$DateValidator, com.google.android.material.datepicker.Month, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10, C2784a c2784a) {
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
        return this.f10015a.equals(calendarConstraints.f10015a) && this.f10016b.equals(calendarConstraints.f10016b) && C12632b.m47060a(this.f10018d, calendarConstraints.f10018d) && this.f10019e == calendarConstraints.f10019e && this.f10017c.equals(calendarConstraints.f10017c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10015a, this.f10016b, this.f10018d, Integer.valueOf(this.f10019e), this.f10017c});
    }

    /* JADX INFO: renamed from: k */
    public Month m12559k(Month month) {
        if (month.compareTo(this.f10015a) < 0) {
            return this.f10015a;
        }
        return month.compareTo(this.f10016b) > 0 ? this.f10016b : month;
    }

    /* JADX INFO: renamed from: m */
    public DateValidator m12560m() {
        return this.f10017c;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public Month m12561n() {
        return this.f10016b;
    }

    /* JADX INFO: renamed from: o */
    public int m12562o() {
        return this.f10019e;
    }

    /* JADX INFO: renamed from: p */
    public int m12563p() {
        return this.f10021g;
    }

    /* JADX INFO: renamed from: q */
    public Month m12564q() {
        return this.f10018d;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public Month m12565r() {
        return this.f10015a;
    }

    /* JADX INFO: renamed from: s */
    public int m12566s() {
        return this.f10020f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f10015a, 0);
        parcel.writeParcelable(this.f10016b, 0);
        parcel.writeParcelable(this.f10018d, 0);
        parcel.writeParcelable(this.f10017c, 0);
        parcel.writeInt(this.f10019e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CalendarConstraints(@NonNull Month month, @NonNull Month month2, @NonNull DateValidator dateValidator, Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f10015a = month;
        this.f10016b = month2;
        this.f10018d = month3;
        this.f10019e = i10;
        this.f10017c = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > C2804p.m12712i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f10021g = month.m12607x(month2) + 1;
        this.f10020f = (month2.f10035c - month.f10035c) + 1;
    }
}
