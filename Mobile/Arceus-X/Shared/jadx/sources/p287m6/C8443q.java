package p287m6;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: m6.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, m31665d2 = {"Lm6/j;", "", "b", "(Lm6/j;)Z", "isSwapped", "a", "isRotated", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8443q {
    /* JADX INFO: renamed from: a */
    public static final boolean m34211a(@NotNull C8436j c8436j) {
        return c8436j.getRotationDegrees() > 0;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m34212b(@NotNull C8436j c8436j) {
        return c8436j.getRotationDegrees() == 90 || c8436j.getRotationDegrees() == 270;
    }
}
