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
    public final String f6195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f6198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PlayerEntity f6200k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6201l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f6202m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f6203n;

    public EventEntity(String str, String str2, String str3, Uri uri, String str4, Player player, long j10, String str5, boolean z10) {
        this.f6195f = str;
        this.f6196g = str2;
        this.f6197h = str3;
        this.f6198i = uri;
        this.f6199j = str4;
        this.f6200k = new PlayerEntity(player);
        this.f6201l = j10;
        this.f6202m = str5;
        this.f6203n = z10;
    }

    public static int a(Event event) {
        return k.c(event.R0(), event.getName(), event.getDescription(), event.h(), event.getIconImageUrl(), event.N1(), Long.valueOf(event.getValue()), event.k3(), Boolean.valueOf(event.isVisible()));
    }

    public static boolean v3(Event event, Object obj) {
        if (!(obj instanceof Event)) {
            return false;
        }
        if (event == obj) {
            return true;
        }
        Event event2 = (Event) obj;
        return k.b(event2.R0(), event.R0()) && k.b(event2.getName(), event.getName()) && k.b(event2.getDescription(), event.getDescription()) && k.b(event2.h(), event.h()) && k.b(event2.getIconImageUrl(), event.getIconImageUrl()) && k.b(event2.N1(), event.N1()) && k.b(Long.valueOf(event2.getValue()), Long.valueOf(event.getValue())) && k.b(event2.k3(), event.k3()) && k.b(Boolean.valueOf(event2.isVisible()), Boolean.valueOf(event.isVisible()));
    }

    public static String w3(Event event) {
        return k.d(event).a("Id", event.R0()).a("Name", event.getName()).a("Description", event.getDescription()).a("IconImageUri", event.h()).a("IconImageUrl", event.getIconImageUrl()).a("Player", event.N1()).a("Value", Long.valueOf(event.getValue())).a("FormattedValue", event.k3()).a("isVisible", Boolean.valueOf(event.isVisible())).toString();
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public Player N1() {
        return this.f6200k;
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public String R0() {
        return this.f6195f;
    }

    public boolean equals(Object obj) {
        return v3(this, obj);
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public String getDescription() {
        return this.f6197h;
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public String getIconImageUrl() {
        return this.f6199j;
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public String getName() {
        return this.f6196g;
    }

    @Override // com.google.android.gms.games.event.Event
    public long getValue() {
        return this.f6201l;
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public Uri h() {
        return this.f6198i;
    }

    public int hashCode() {
        return a(this);
    }

    @Override // com.google.android.gms.games.event.Event
    public boolean isVisible() {
        return this.f6203n;
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public String k3() {
        return this.f6202m;
    }

    @NonNull
    public String toString() {
        return w3(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.v(parcel, 1, R0(), false);
        b.v(parcel, 2, getName(), false);
        b.v(parcel, 3, getDescription(), false);
        b.t(parcel, 4, h(), i10, false);
        b.v(parcel, 5, getIconImageUrl(), false);
        b.t(parcel, 6, N1(), i10, false);
        b.r(parcel, 7, getValue());
        b.v(parcel, 8, k3(), false);
        b.c(parcel, 9, isVisible());
        b.b(parcel, iA);
    }
}
