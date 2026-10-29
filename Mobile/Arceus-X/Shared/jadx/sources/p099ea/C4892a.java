package p099ea;

import androidx.annotation.NonNull;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.achievement.Achievement;
import com.google.android.gms.games.achievement.AchievementRef;
import p290m9.AbstractC8470a;

/* JADX INFO: renamed from: ea.a */
/* JADX INFO: loaded from: classes.dex */
public class C4892a extends AbstractC8470a<Achievement> {
    public C4892a(@NonNull DataHolder dataHolder) {
        super(dataHolder);
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // p290m9.InterfaceC8471b
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Achievement get(int i10) {
        return new AchievementRef(this.f31182a, i10);
    }
}
