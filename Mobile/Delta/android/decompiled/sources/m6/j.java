package m6;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Lm6/j;", "", "", "isFlipped", "", "rotationDegrees", "<init>", "(ZI)V", "a", "Z", "b", "()Z", "I", "()I", "c", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final j f23987d = new j(false, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isFlipped;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int rotationDegrees;

    public j(boolean z10, int i10) {
        this.isFlipped = z10;
        this.rotationDegrees = i10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsFlipped() {
        return this.isFlipped;
    }
}
