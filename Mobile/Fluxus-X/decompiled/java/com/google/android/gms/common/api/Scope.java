package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import l9.y;
import o9.s;
import p9.a;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6106g;

    public Scope(int i10, String str) {
        s.g(str, "scopeUri must not be null or empty");
        this.f6105f = i10;
        this.f6106g = str;
    }

    @NonNull
    public String A3() {
        return this.f6106g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f6106g.equals(((Scope) obj).f6106g);
        }
        return false;
    }

    public int hashCode() {
        return this.f6106g.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f6106g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f6105f;
        int iA = c.a(parcel);
        c.n(parcel, 1, i11);
        c.v(parcel, 2, A3(), false);
        c.b(parcel, iA);
    }

    public Scope(@NonNull String str) {
        this(1, str);
    }
}
