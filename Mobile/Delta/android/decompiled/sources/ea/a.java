package ea;

import androidx.annotation.NonNull;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.achievement.Achievement;
import com.google.android.gms.games.achievement.AchievementRef;

/* JADX INFO: loaded from: classes.dex */
public class a extends m9.a<Achievement> {
    public a(@NonNull DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // m9.b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Achievement get(int i10) {
        return new AchievementRef(this.f24041a, i10);
    }
}
