package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;", "", "<init>", "(Ljava/lang/String;I)V", "MANUAL", "AUTO", "VIDEO_UPLOAD", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public enum GovIdCaptureMethod {
    MANUAL,
    AUTO,
    VIDEO_UPLOAD;

    private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

    @NotNull
    public static InterfaceC10707a<GovIdCaptureMethod> getEntries() {
        return $ENTRIES;
    }
}
