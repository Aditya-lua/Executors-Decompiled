package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0124a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final n f7736a;

    @NonNull
    public final n b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final c f7737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f7738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7741g;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    public class C0124a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(@NonNull Parcel parcel) {
            return new a((n) parcel.readParcelable(n.class.getClassLoader()), (n) parcel.readParcelable(n.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (n) parcel.readParcelable(n.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f7742f = u.a(n.k(1900, 0).f7817f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final long f7743g = u.a(n.k(2100, 11).f7817f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f7744a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f7745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7746d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f7747e;

        public b(@NonNull a aVar) {
            this.f7744a = f7742f;
            this.b = f7743g;
            this.f7747e = f.a(Long.MIN_VALUE);
            this.f7744a = aVar.f7736a.f7817f;
            this.b = aVar.b.f7817f;
            this.f7745c = Long.valueOf(aVar.f7738d.f7817f);
            this.f7746d = aVar.f7739e;
            this.f7747e = aVar.f7737c;
        }

        @NonNull
        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f7747e);
            n nVarO = n.o(this.f7744a);
            n nVarO2 = n.o(this.b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f7745c;
            return new a(nVarO, nVarO2, cVar, l10 == null ? null : n.o(l10.longValue()), this.f7746d, null);
        }

        @NonNull
        public b b(long j10) {
            this.f7745c = Long.valueOf(j10);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean X0(long j10);
    }

    public /* synthetic */ a(n nVar, n nVar2, c cVar, n nVar3, int i10, C0124a c0124a) {
        this(nVar, nVar2, cVar, nVar3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7736a.equals(aVar.f7736a) && this.b.equals(aVar.b) && x2.b.a(this.f7738d, aVar.f7738d) && this.f7739e == aVar.f7739e && this.f7737c.equals(aVar.f7737c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7736a, this.b, this.f7738d, Integer.valueOf(this.f7739e), this.f7737c});
    }

    public n k(n nVar) {
        if (nVar.compareTo(this.f7736a) < 0) {
            return this.f7736a;
        }
        return nVar.compareTo(this.b) > 0 ? this.b : nVar;
    }

    public c l() {
        return this.f7737c;
    }

    @NonNull
    public n n() {
        return this.b;
    }

    public int o() {
        return this.f7739e;
    }

    public int p() {
        return this.f7741g;
    }

    public n q() {
        return this.f7738d;
    }

    @NonNull
    public n r() {
        return this.f7736a;
    }

    public int s() {
        return this.f7740f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7736a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.f7738d, 0);
        parcel.writeParcelable(this.f7737c, 0);
        parcel.writeInt(this.f7739e);
    }

    public a(@NonNull n nVar, @NonNull n nVar2, @NonNull c cVar, n nVar3, int i10) {
        Objects.requireNonNull(nVar, "start cannot be null");
        Objects.requireNonNull(nVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f7736a = nVar;
        this.b = nVar2;
        this.f7738d = nVar3;
        this.f7739e = i10;
        this.f7737c = cVar;
        if (nVar3 != null && nVar.compareTo(nVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (nVar3 != null && nVar3.compareTo(nVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > u.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f7741g = nVar.x(nVar2) + 1;
        this.f7740f = (nVar2.f7814c - nVar.f7814c) + 1;
    }
}
