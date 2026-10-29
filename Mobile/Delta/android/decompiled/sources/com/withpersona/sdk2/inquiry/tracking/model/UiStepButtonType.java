package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "Action", "Complete", "Submit", "Cancel", "ClickableStack", "ReusablePersona", "Nfc", "Mdoc", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum UiStepButtonType {
    Action,
    Complete,
    Submit,
    Cancel,
    ClickableStack,
    ReusablePersona,
    Nfc,
    Mdoc;

    private static final /* synthetic */ qt.a $ENTRIES = qt.b.a(values());

    @NotNull
    public static qt.a<UiStepButtonType> getEntries() {
        return $ENTRIES;
    }
}
