package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
import p290m9.AbstractC8473d;
import p305n9.C8920b;

/* JADX INFO: loaded from: classes.dex */
public final class AchievementRef extends AbstractC8473d implements Achievement {
    public AchievementRef(DataHolder dataHolder, int i10) {
        super(dataHolder, i10);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    /* JADX INFO: renamed from: C2 */
    public final Uri mo9414C2() {
        return m34264n("revealed_icon_image_uri");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    /* JADX INFO: renamed from: H */
    public final Uri mo9415H() {
        return m34264n("unlocked_icon_image_uri");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    /* JADX INFO: renamed from: H0 */
    public final String mo9416H0() {
        return m34261j("external_achievement_id");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    /* JADX INFO: renamed from: J1 */
    public final String mo9417J1() {
        C8920b.m35956b(m34259g(Payload.TYPE) == 1);
        return m34261j("formatted_total_steps");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* JADX INFO: renamed from: J2 */
    public final int mo9418J2() {
        C8920b.m35956b(m34259g(Payload.TYPE) == 1);
        return m34259g("current_steps");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    /* JADX INFO: renamed from: W1 */
    public final String mo9419W1() {
        C8920b.m35956b(m34259g(Payload.TYPE) == 1);
        return m34261j("formatted_current_steps");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return AchievementEntity.m9424v3(this, obj);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public final String getDescription() {
        return m34261j("description");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public final String getName() {
        return m34261j("name");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public String getRevealedImageUrl() {
        return m34261j("revealed_icon_image_url");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int getState() {
        return m34259g("state");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int getType() {
        return m34259g(Payload.TYPE);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public String getUnlockedImageUrl() {
        return m34261j("unlocked_icon_image_url");
    }

    public final int hashCode() {
        return AchievementEntity.m9423a(this);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* JADX INFO: renamed from: i1 */
    public final long mo9420i1() {
        return m34260i("last_updated_timestamp");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* JADX INFO: renamed from: n2 */
    public final long mo9421n2() {
        return (!m34262k("instance_xp_value") || m34263m("instance_xp_value")) ? m34260i("definition_xp_value") : m34260i("instance_xp_value");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    /* JADX INFO: renamed from: q1 */
    public final int mo9422q1() {
        C8920b.m35956b(m34259g(Payload.TYPE) == 1);
        return m34259g("total_steps");
    }

    @NonNull
    public final String toString() {
        return AchievementEntity.m9425w3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        new AchievementEntity(this).writeToParcel(parcel, i10);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    @NonNull
    public final String zza() {
        return m34261j("external_game_id");
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final Player zzb() {
        if (m34263m("external_player_id")) {
            return null;
        }
        return new PlayerRef(this.f31185a, this.f31186b, null);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final float zzc() {
        if (!m34262k("rarity_percent") || m34263m("rarity_percent")) {
            return -1.0f;
        }
        return m34258f("rarity_percent");
    }
}
