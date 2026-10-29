package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.zzg;
import fa.a;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class EventEntity extends zzg implements Event {

    @NonNull
    public static final Parcelable.Creator<EventEntity> CREATOR = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f6125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PlayerEntity f6127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f6129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f6130n;

    public EventEntity(String str, String str2, String str3, Uri uri, String str4, Player player, long j10, String str5, boolean z10) {
        this.f6122f = str;
        this.f6123g = str2;
        this.f6124h = str3;
        this.f6125i = uri;
        this.f6126j = str4;
        this.f6127k = new PlayerEntity(player);
        this.f6128l = j10;
        this.f6129m = str5;
        this.f6130n = z10;
    }

    public static int a(Event event) {
        return k.c(event.V0(), event.getName(), event.getDescription(), event.h(), event.getIconImageUrl(), event.O1(), Long.valueOf(event.getValue()), event.i3(), Boolean.valueOf(event.isVisible()));
    }

    public static boolean v3(Event event, Object obj) {
        if (!(obj instanceof Event)) {
            return false;
        }
        if (event == obj) {
            return true;
        }
        Event event2 = (Event) obj;
        return k.b(event2.V0(), event.V0()) && k.b(event2.getName(), event.getName()) && k.b(event2.getDescription(), event.getDescription()) && k.b(event2.h(), event.h()) && k.b(event2.getIconImageUrl(), event.getIconImageUrl()) && k.b(event2.O1(), event.O1()) && k.b(Long.valueOf(event2.getValue()), Long.valueOf(event.getValue())) && k.b(event2.i3(), event.i3()) && k.b(Boolean.valueOf(event2.isVisible()), Boolean.valueOf(event.isVisible()));
    }

    public static String w3(Event event) {
        return k.d(event).a("Id", event.V0()).a("Name", event.getName()).a("Description", event.getDescription()).a("IconImageUri", event.h()).a("IconImageUrl", event.getIconImageUrl()).a("Player", event.O1()).a("Value", Long.valueOf(event.getValue())).a("FormattedValue", event.i3()).a("isVisible", Boolean.valueOf(event.isVisible())).toString();
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public Player O1() {
        return this.f6127k;
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public String V0() {
        return this.f6122f;
    }

    public boolean equals(Object obj) {
        return v3(this, obj);
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public String getDescription() {
        return this.f6124h;
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public String getIconImageUrl() {
        return this.f6126j;
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public String getName() {
        return this.f6123g;
    }

    @Override // com.google.android.gms.games.event.Event
    public long getValue() {
        return this.f6128l;
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public Uri h() {
        return this.f6125i;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public String i3() {
        return this.f6129m;
    }

    @Override // com.google.android.gms.games.event.Event
    public boolean isVisible() {
        return this.f6130n;
    }

    @NonNull
    public String toString() {
        return w3(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.v(parcel, 1, V0(), false);
        b.v(parcel, 2, getName(), false);
        b.v(parcel, 3, getDescription(), false);
        b.t(parcel, 4, h(), i10, false);
        b.v(parcel, 5, getIconImageUrl(), false);
        b.t(parcel, 6, O1(), i10, false);
        b.r(parcel, 7, getValue());
        b.v(parcel, 8, i3(), false);
        b.c(parcel, 9, isVisible());
        b.b(parcel, iA);
    }
}
