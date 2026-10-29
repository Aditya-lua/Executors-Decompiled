package com.withpersona.sdk2.camera;

import com.withpersona.sdk2.inquiry.tracking.model.CameraInfoEventData;
import com.withpersona.sdk2.inquiry.tracking.model.CameraSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;

/* JADX INFO: renamed from: com.withpersona.sdk2.camera.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/camera/CameraProperties;", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "a", "(Lcom/withpersona/sdk2/camera/CameraProperties;)Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "camera_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3403c {

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.c$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12924a;

        static {
            int[] iArr = new int[CameraProperties.EnumC3397b.values().length];
            try {
                iArr[CameraProperties.EnumC3397b.User.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraProperties.EnumC3397b.Environment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CameraProperties.EnumC3397b.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12924a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final CameraInfoEventData m16209a(@NotNull CameraProperties cameraProperties) {
        String str;
        Intrinsics.checkNotNullParameter(cameraProperties, "<this>");
        int i10 = a.f12924a[cameraProperties.getFacingMode().ordinal()];
        if (i10 == 1) {
            str = "Front";
        } else if (i10 == 2) {
            str = "Back";
        } else {
            if (i10 != 3) {
                throw new C7345l();
            }
            str = "Unspecified";
        }
        return new CameraInfoEventData(cameraProperties.getLabel(), str, new CameraSize(Integer.valueOf(cameraProperties.getSize().getWidth()), Integer.valueOf(cameraProperties.getSize().getHeight())), Double.valueOf(cameraProperties.getFrameRate()), Double.valueOf(cameraProperties.m16170a()), null, null, 96, null);
    }
}
