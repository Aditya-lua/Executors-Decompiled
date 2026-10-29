package p361po;

import com.withpersona.sdk2.camera.ImageIdMetadata;
import com.withpersona.sdk2.inquiry.governmentid.network.AutocaptureState;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: po.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "newFrame", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;Lcom/withpersona/sdk2/camera/ImageIdMetadata;)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;)Z", "government-id_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10301a {
    /* JADX INFO: renamed from: a */
    public static final boolean m39575a(@NotNull AutocaptureState autocaptureState) {
        Intrinsics.checkNotNullParameter(autocaptureState, "<this>");
        if (autocaptureState.m17712f().size() < 3) {
            return false;
        }
        Iterator<T> it = autocaptureState.m17712f().iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((ImageIdMetadata) it.next()).getTextOnImage().length();
        }
        double size = ((double) length) / ((double) autocaptureState.m17712f().size());
        double length2 = 0.0d;
        for (ImageIdMetadata imageIdMetadata : autocaptureState.m17712f()) {
            length2 += (((double) imageIdMetadata.getTextOnImage().length()) - size) * (((double) imageIdMetadata.getTextOnImage().length()) - size);
        }
        return Math.sqrt(length2 / ((double) autocaptureState.m17712f().size())) / size < 0.05d;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final AutocaptureState m39576b(@NotNull AutocaptureState autocaptureState, @NotNull ImageIdMetadata newFrame) {
        Intrinsics.checkNotNullParameter(autocaptureState, "<this>");
        Intrinsics.checkNotNullParameter(newFrame, "newFrame");
        return autocaptureState.m17711a(CollectionsKt.m31726x0(CollectionsKt.m31683I0(autocaptureState.m17712f(), 2), newFrame));
    }
}
