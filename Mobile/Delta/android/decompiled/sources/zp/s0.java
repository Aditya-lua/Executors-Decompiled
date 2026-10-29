package zp;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lzp/s0;", "", "", "minFaceRatio", "maxFaceRatio", "<init>", "(DD)V", "a", "D", "b", "()D", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double minFaceRatio;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final double maxFaceRatio;

    public s0(double d10, double d11) {
        this.minFaceRatio = d10;
        this.maxFaceRatio = d11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getMaxFaceRatio() {
        return this.maxFaceRatio;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getMinFaceRatio() {
        return this.minFaceRatio;
    }
}
