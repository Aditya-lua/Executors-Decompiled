package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.zzg;
import p124fa.C5495a;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class EventEntity extends zzg implements Event {

    @NonNull
    public static final Parcelable.Creator<EventEntity> CREATOR = new C5495a();

    /* JADX INFO: renamed from: f */
    public final String f7838f;

    /* JADX INFO: renamed from: g */
    public final String f7839g;

    /* JADX INFO: renamed from: h */
    public final String f7840h;

    /* JADX INFO: renamed from: i */
    public final Uri f7841i;

    /* JADX INFO: renamed from: j */
    public final String f7842j;

    /* JADX INFO: renamed from: k */
    public final PlayerEntity f7843k;

    /* JADX INFO: renamed from: l */
    public final long f7844l;

    /* JADX INFO: renamed from: m */
    public final String f7845m;

    /* JADX INFO: renamed from: n */
    public final boolean f7846n;

    public EventEntity(String str, String str2, String str3, Uri uri, String str4, Player player, long j10, String str5, boolean z10) {
        this.f7838f = str;
        this.f7839g = str2;
        this.f7840h = str3;
        this.f7841i = uri;
        this.f7842j = str4;
        this.f7843k = new PlayerEntity(player);
        this.f7844l = j10;
        this.f7845m = str5;
        this.f7846n = z10;
    }

    /* JADX INFO: renamed from: a */
    public static int m9430a(Event event) {
        return C8947k.m36027c(event.mo9427V0(), event.getName(), event.getDescription(), event.mo9428h(), event.getIconImageUrl(), event.mo9426O1(), Long.valueOf(event.getValue()), event.mo9429i3(), Boolean.valueOf(event.isVisible()));
    }

    /* JADX INFO: renamed from: v3 */
    public static boolean m9431v3(Event event, Object obj) {
        if (!(obj instanceof Event)) {
            return false;
        }
        if (event == obj) {
            return true;
        }
        Event event2 = (Event) obj;
        return C8947k.m36026b(event2.mo9427V0(), event.mo9427V0()) && C8947k.m36026b(event2.getName(), event.getName()) && C8947k.m36026b(event2.getDescription(), event.getDescription()) && C8947k.m36026b(event2.mo9428h(), event.mo9428h()) && C8947k.m36026b(event2.getIconImageUrl(), event.getIconImageUrl()) && C8947k.m36026b(event2.mo9426O1(), event.mo9426O1()) && C8947k.m36026b(Long.valueOf(event2.getValue()), Long.valueOf(event.getValue())) && C8947k.m36026b(event2.mo9429i3(), event.mo9429i3()) && C8947k.m36026b(Boolean.valueOf(event2.isVisible()), Boolean.valueOf(event.isVisible()));
    }

    /* JADX INFO: renamed from: w3 */
    public static String m9432w3(Event event) {
        return C8947k.m36028d(event).m36029a("Id", event.mo9427V0()).m36029a("Name", event.getName()).m36029a("Description", event.getDescription()).m36029a("IconImageUri", event.mo9428h()).m36029a("IconImageUrl", event.getIconImageUrl()).m36029a("Player", event.mo9426O1()).m36029a("Value", Long.valueOf(event.getValue())).m36029a("FormattedValue", event.mo9429i3()).m36029a("isVisible", Boolean.valueOf(event.isVisible())).toString();
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    /* JADX INFO: renamed from: O1 */
    public Player mo9426O1() {
        return this.f7843k;
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    /* JADX INFO: renamed from: V0 */
    public String mo9427V0() {
        return this.f7838f;
    }

    public boolean equals(Object obj) {
        return m9431v3(this, obj);
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public String getDescription() {
        return this.f7840h;
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public String getIconImageUrl() {
        return this.f7842j;
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    public String getName() {
        return this.f7839g;
    }

    @Override // com.google.android.gms.games.event.Event
    public long getValue() {
        return this.f7844l;
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    /* JADX INFO: renamed from: h */
    public Uri mo9428h() {
        return this.f7841i;
    }

    public int hashCode() {
        return m9430a(this);
    }

    @Override // com.google.android.gms.games.event.Event
    @NonNull
    /* JADX INFO: renamed from: i3 */
    public String mo9429i3() {
        return this.f7845m;
    }

    @Override // com.google.android.gms.games.event.Event
    public boolean isVisible() {
        return this.f7846n;
    }

    @NonNull
    public String toString() {
        return m9432w3(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, mo9427V0(), false);
        C9718b.m38478v(parcel, 2, getName(), false);
        C9718b.m38478v(parcel, 3, getDescription(), false);
        C9718b.m38476t(parcel, 4, mo9428h(), i10, false);
        C9718b.m38478v(parcel, 5, getIconImageUrl(), false);
        C9718b.m38476t(parcel, 6, mo9426O1(), i10, false);
        C9718b.m38474r(parcel, 7, getValue());
        C9718b.m38478v(parcel, 8, mo9429i3(), false);
        C9718b.m38459c(parcel, 9, isVisible());
        C9718b.m38458b(parcel, iM38457a);
    }
}
