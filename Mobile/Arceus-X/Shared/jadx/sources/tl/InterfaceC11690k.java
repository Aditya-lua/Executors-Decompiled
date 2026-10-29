package tl;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p494vl.EnumC12230c;
import p494vl.NativeAdsProgressData;

/* JADX INFO: renamed from: tl.k */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, m31665d2 = {"Ltl/k;", "", "Lvl/c;", NotificationCompat.CATEGORY_STATUS, "", "watchDuration", "", "c", "(Lvl/c;F)V", "", "gmaAdType", "", "isEndCardVisible", "d", "(Ljava/lang/String;Z)V", "Lvl/b;", "progressData", "a", "(Lvl/b;)V", "reasonKey", "description", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC11690k {
    /* JADX INFO: renamed from: a */
    void mo43370a(@NotNull NativeAdsProgressData progressData);

    /* JADX INFO: renamed from: b */
    void mo43371b(@NotNull String reasonKey, @NotNull String description);

    /* JADX INFO: renamed from: c */
    void mo43372c(@NotNull EnumC12230c status, float watchDuration);

    /* JADX INFO: renamed from: d */
    void mo43373d(@Nullable String gmaAdType, boolean isEndCardVisible);
}
