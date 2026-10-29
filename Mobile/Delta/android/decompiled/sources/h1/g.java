package h1;

import android.net.Uri;
import f1.q;
import f1.r;
import f1.t;
import f1.u;
import g0.r1;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lh1/g;", "Lh1/f;", "Lf1/u;", "outputOptions", "<init>", "(Lf1/u;)V", "", "a", "()J", "Lf1/u;", "b", "camera-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final u outputOptions;

    public g(@NotNull u outputOptions) {
        Intrinsics.checkNotNullParameter(outputOptions, "outputOptions");
        this.outputOptions = outputOptions;
    }

    @Override // h1.f
    public long a() {
        try {
            u uVar = this.outputOptions;
            if (uVar instanceof r) {
                File parentFile = ((r) uVar).d().getParentFile();
                Intrinsics.checkNotNull(parentFile);
                return n1.e.b(parentFile);
            }
            if (uVar instanceof t) {
                Uri uriD = ((t) uVar).d();
                Intrinsics.checkNotNullExpressionValue(uriD, "getCollectionUri(...)");
                return n1.e.d(uriD);
            }
            if (uVar instanceof q) {
                return Long.MAX_VALUE;
            }
            throw new AssertionError("Unknown OutputOptions: " + this.outputOptions);
        } catch (RuntimeException e10) {
            r1.m("OutputStorageImpl", "Fail to access the available bytes.", e10);
            return Long.MAX_VALUE;
        }
    }
}
