package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "SHUTTER", "FLASH", "RETAKE_PHOTO", "CONTINUE", "CAPTURE_TIPS", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum GovIdCaptureButtonType {
    SHUTTER,
    FLASH,
    RETAKE_PHOTO,
    CONTINUE,
    CAPTURE_TIPS;

    private static final /* synthetic */ qt.a $ENTRIES = qt.b.a(values());

    @NotNull
    public static qt.a<GovIdCaptureButtonType> getEntries() {
        return $ENTRIES;
    }
}
