package fa;

import android.net.Uri;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.achievement.AchievementEntity;
import ea.k;
import ea.n;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n9.d implements a {
    public c(DataHolder dataHolder, int i10) {
        super(dataHolder, i10);
    }

    @Override // fa.a
    @NonNull
    public final Uri G2() {
        return n("revealed_icon_image_uri");
    }

    @Override // fa.a
    @NonNull
    public final String I0() {
        return j("external_achievement_id");
    }

    @Override // fa.a
    @NonNull
    public final Uri K() {
        return n("unlocked_icon_image_uri");
    }

    @Override // fa.a
    @NonNull
    public final String L1() {
        o9.c.b(g(Payload.TYPE) == 1);
        return j("formatted_total_steps");
    }

    @Override // fa.a
    public final int M2() {
        o9.c.b(g(Payload.TYPE) == 1);
        return g("current_steps");
    }

    @Override // fa.a
    @NonNull
    public final String Z1() {
        o9.c.b(g(Payload.TYPE) == 1);
        return j("formatted_current_steps");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return AchievementEntity.A3(this, obj);
    }

    @Override // fa.a
    public final long g1() {
        return i("last_updated_timestamp");
    }

    @Override // fa.a
    @NonNull
    public final String getDescription() {
        return j("description");
    }

    @Override // fa.a
    @NonNull
    public final String getName() {
        return j("name");
    }

    @Override // fa.a
    @NonNull
    public String getRevealedImageUrl() {
        return j("revealed_icon_image_url");
    }

    @Override // fa.a
    public final int getState() {
        return g("state");
    }

    @Override // fa.a
    public final int getType() {
        return g(Payload.TYPE);
    }

    @Override // fa.a
    @NonNull
    public String getUnlockedImageUrl() {
        return j("unlocked_icon_image_url");
    }

    public final int hashCode() {
        return AchievementEntity.a(this);
    }

    @Override // fa.a
    public final int p1() {
        o9.c.b(g(Payload.TYPE) == 1);
        return g("total_steps");
    }

    @Override // fa.a
    public final long r2() {
        return (!k("instance_xp_value") || l("instance_xp_value")) ? i("definition_xp_value") : i("instance_xp_value");
    }

    @NonNull
    public final String toString() {
        return AchievementEntity.B3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        new AchievementEntity(this).writeToParcel(parcel, i10);
    }

    @Override // fa.a
    @NonNull
    public final String zza() {
        return j("external_game_id");
    }

    @Override // fa.a
    public final k zzb() {
        if (l("external_player_id")) {
            return null;
        }
        return new n(this.f25493a, this.b, null);
    }

    @Override // fa.a
    public final float zzc() {
        if (!k("rarity_percent") || l("rarity_percent")) {
            return -1.0f;
        }
        return f("rarity_percent");
    }
}
