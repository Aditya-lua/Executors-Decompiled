package com.withpersona.sdk2.inquiry.network.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.f;
import sm.h;
import sm.i;
import sm.m;
import sm.t;
import sm.z;

/* JADX INFO: loaded from: classes3.dex */
@i(generateAdapter = false)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum PendingPageTextPosition {
    TOP,
    BOTTOM;

    private static final /* synthetic */ ot.a $ENTRIES = ot.b.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition$Companion;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "<init>", "()V", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Lsm/t;", "writer", "value", "", "toJson", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion extends h<PendingPageTextPosition> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // sm.h
        @z
        public void toJson(@NotNull t writer, @Nullable PendingPageTextPosition value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sm.h
        @f
        @NotNull
        public PendingPageTextPosition fromJson(@NotNull m reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            Object objA = reader.A();
            if (Intrinsics.c(objA, "start")) {
                return PendingPageTextPosition.TOP;
            }
            return Intrinsics.c(objA, "end") ? PendingPageTextPosition.BOTTOM : PendingPageTextPositionKt.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
    }

    @NotNull
    public static ot.a<PendingPageTextPosition> getEntries() {
        return $ENTRIES;
    }
}
