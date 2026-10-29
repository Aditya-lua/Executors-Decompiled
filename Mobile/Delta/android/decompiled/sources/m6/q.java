package m6;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"Lm6/j;", "", "b", "(Lm6/j;)Z", "isSwapped", "a", "isRotated", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {
    public static final boolean a(@NotNull j jVar) {
        return jVar.getRotationDegrees() > 0;
    }

    public static final boolean b(@NotNull j jVar) {
        return jVar.getRotationDegrees() == 90 || jVar.getRotationDegrees() == 270;
    }
}
