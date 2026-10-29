package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
import m9.d;
import n9.b;

/* JADX INFO: loaded from: classes.dex */
public final class AchievementRef extends d implements Achievement {
    public AchievementRef(DataHolder dataHolder, int i10) {
        super(dataHolder, i10);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public final Uri C2() {
        return n("revealed_icon_image_uri");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public final Uri H() {
        return n("unlocked_icon_image_uri");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public final String H0() {
        return j("external_achievement_id");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public final String J1() {
        b.b(g(Payload.TYPE) == 1);
        return j("formatted_total_steps");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int J2() {
        b.b(g(Payload.TYPE) == 1);
        return g("current_steps");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public final String W1() {
        b.b(g(Payload.TYPE) == 1);
        return j("formatted_current_steps");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return AchievementEntity.v3(this, obj);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public final String getDescription() {
        return j("description");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public final String getName() {
        return j("name");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public String getRevealedImageUrl() {
        return j("revealed_icon_image_url");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int getState() {
        return g("state");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int getType() {
        return g(Payload.TYPE);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public String getUnlockedImageUrl() {
        return j("unlocked_icon_image_url");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final long h1() {
        return i("last_updated_timestamp");
    }

    public final int hashCode() {
        return AchievementEntity.a(this);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final long n2() {
        return (!k("instance_xp_value") || m("instance_xp_value")) ? i("definition_xp_value") : i("instance_xp_value");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int p1() {
        b.b(g(Payload.TYPE) == 1);
        return g("total_steps");
    }

    @NonNull
    public final String toString() {
        return AchievementEntity.w3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        new AchievementEntity(this).writeToParcel(parcel, i10);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public final String zza() {
        return j("external_game_id");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final Player zzb() {
        if (m("external_player_id")) {
            return null;
        }
        return new PlayerRef(this.f24043a, this.b, null);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final float zzc() {
        if (!k("rarity_percent") || m("rarity_percent")) {
            return -1.0f;
        }
        return f("rarity_percent");
    }
}
