package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.PlayerEntity;
import ea.k;
import ga.a;
import ga.b;
import ha.p;
import o9.q;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class EventEntity extends p implements a {

    @NonNull
    public static final Parcelable.Creator<EventEntity> CREATOR = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f6249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PlayerEntity f6251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f6253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f6254n;

    public EventEntity(String str, String str2, String str3, Uri uri, String str4, k kVar, long j10, String str5, boolean z10) {
        this.f6246f = str;
        this.f6247g = str2;
        this.f6248h = str3;
        this.f6249i = uri;
        this.f6250j = str4;
        this.f6251k = new PlayerEntity(kVar);
        this.f6252l = j10;
        this.f6253m = str5;
        this.f6254n = z10;
    }

    public static boolean A3(a aVar, Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (aVar == obj) {
            return true;
        }
        a aVar2 = (a) obj;
        return q.b(aVar2.V0(), aVar.V0()) && q.b(aVar2.getName(), aVar.getName()) && q.b(aVar2.getDescription(), aVar.getDescription()) && q.b(aVar2.h(), aVar.h()) && q.b(aVar2.getIconImageUrl(), aVar.getIconImageUrl()) && q.b(aVar2.Q1(), aVar.Q1()) && q.b(Long.valueOf(aVar2.getValue()), Long.valueOf(aVar.getValue())) && q.b(aVar2.p3(), aVar.p3()) && q.b(Boolean.valueOf(aVar2.isVisible()), Boolean.valueOf(aVar.isVisible()));
    }

    public static String B3(a aVar) {
        return q.d(aVar).a("Id", aVar.V0()).a("Name", aVar.getName()).a("Description", aVar.getDescription()).a("IconImageUri", aVar.h()).a("IconImageUrl", aVar.getIconImageUrl()).a("Player", aVar.Q1()).a("Value", Long.valueOf(aVar.getValue())).a("FormattedValue", aVar.p3()).a("isVisible", Boolean.valueOf(aVar.isVisible())).toString();
    }

    public static int a(a aVar) {
        return q.c(aVar.V0(), aVar.getName(), aVar.getDescription(), aVar.h(), aVar.getIconImageUrl(), aVar.Q1(), Long.valueOf(aVar.getValue()), aVar.p3(), Boolean.valueOf(aVar.isVisible()));
    }

    @Override // ga.a
    @NonNull
    public k Q1() {
        return this.f6251k;
    }

    @Override // ga.a
    @NonNull
    public String V0() {
        return this.f6246f;
    }

    public boolean equals(Object obj) {
        return A3(this, obj);
    }

    @Override // ga.a
    @NonNull
    public String getDescription() {
        return this.f6248h;
    }

    @Override // ga.a
    @NonNull
    public String getIconImageUrl() {
        return this.f6250j;
    }

    @Override // ga.a
    @NonNull
    public String getName() {
        return this.f6247g;
    }

    @Override // ga.a
    public long getValue() {
        return this.f6252l;
    }

    @Override // ga.a
    @NonNull
    public Uri h() {
        return this.f6249i;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // ga.a
    public boolean isVisible() {
        return this.f6254n;
    }

    @Override // ga.a
    @NonNull
    public String p3() {
        return this.f6253m;
    }

    @NonNull
    public String toString() {
        return B3(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.v(parcel, 1, V0(), false);
        c.v(parcel, 2, getName(), false);
        c.v(parcel, 3, getDescription(), false);
        c.t(parcel, 4, h(), i10, false);
        c.v(parcel, 5, getIconImageUrl(), false);
        c.t(parcel, 6, Q1(), i10, false);
        c.r(parcel, 7, getValue());
        c.v(parcel, 8, p3(), false);
        c.c(parcel, 9, isVisible());
        c.b(parcel, iA);
    }
}
