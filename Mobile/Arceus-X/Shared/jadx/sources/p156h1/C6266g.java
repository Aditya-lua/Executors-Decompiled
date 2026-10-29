package p156h1;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p115f1.AbstractC5297u;
import p115f1.C5285q;
import p115f1.C5288r;
import p115f1.C5294t;
import p140g0.C5931r1;
import p297n1.C8862e;

/* JADX INFO: renamed from: h1.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000b"}, m31665d2 = {"Lh1/g;", "Lh1/f;", "Lf1/u;", "outputOptions", "<init>", "(Lf1/u;)V", "", "a", "()J", "Lf1/u;", "b", "camera-video_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C6266g implements InterfaceC6265f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC5297u outputOptions;

    public C6266g(@NotNull AbstractC5297u outputOptions) {
        Intrinsics.checkNotNullParameter(outputOptions, "outputOptions");
        this.outputOptions = outputOptions;
    }

    @Override // p156h1.InterfaceC6265f
    /* JADX INFO: renamed from: a */
    public long mo27516a() {
        try {
            AbstractC5297u abstractC5297u = this.outputOptions;
            if (abstractC5297u instanceof C5288r) {
                File parentFile = ((C5288r) abstractC5297u).m24433d().getParentFile();
                Intrinsics.checkNotNull(parentFile);
                return C8862e.m35582b(parentFile);
            }
            if (abstractC5297u instanceof C5294t) {
                Uri uriM24573d = ((C5294t) abstractC5297u).m24573d();
                Intrinsics.checkNotNullExpressionValue(uriM24573d, "getCollectionUri(...)");
                return C8862e.m35584d(uriM24573d);
            }
            if (abstractC5297u instanceof C5285q) {
                return Long.MAX_VALUE;
            }
            throw new AssertionError("Unknown OutputOptions: " + this.outputOptions);
        } catch (RuntimeException e10) {
            C5931r1.m26573m("OutputStorageImpl", "Fail to access the available bytes.", e10);
            return Long.MAX_VALUE;
        }
    }
}
