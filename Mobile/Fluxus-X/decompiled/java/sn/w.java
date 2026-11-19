package sn;

import com.withpersona.sdk2.inquiry.tracking.model.CameraInfoEventData;
import com.withpersona.sdk2.inquiry.tracking.model.CameraSize;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsn/v;", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "a", "(Lsn/v;)Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "camera_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31730a;

        static {
            int[] iArr = new int[v.b.values().length];
            try {
                iArr[v.b.User.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.b.Environment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.b.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31730a = iArr;
        }
    }

    @NotNull
    public static final CameraInfoEventData a(@NotNull v vVar) {
        String str;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        int i10 = a.f31730a[vVar.getFacingMode().ordinal()];
        if (i10 == 1) {
            str = "Front";
        } else if (i10 == 2) {
            str = "Back";
        } else {
            if (i10 != 3) {
                throw new zt.l();
            }
            str = "Unspecified";
        }
        return new CameraInfoEventData(vVar.getLabel(), str, new CameraSize(Integer.valueOf(vVar.getSize().getWidth()), Integer.valueOf(vVar.getSize().getHeight())), Double.valueOf(vVar.getFrameRate()), Double.valueOf(vVar.a()), null, null, 96, null);
    }
}
