package com.withpersona.sdk2.inquiry.tracking.model;

import androidx.core.app.NotificationCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11888w;
import p522wm.C12494c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventDataJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;)V", "Lum/m$b;", "options", "Lum/m$b;", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;", "nfcScanPhaseAdapter", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanStatus;", "nfcScanStatusAdapter", "", "nullableLongAdapter", "nullableStringAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "nullableTrackingMetadataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class NfcScanEventDataJsonAdapter extends AbstractC11873h<NfcScanEventData> {

    @Nullable
    private volatile Constructor<NfcScanEventData> constructorRef;

    @NotNull
    private final AbstractC11873h<NfcScanPhase> nfcScanPhaseAdapter;

    @NotNull
    private final AbstractC11873h<NfcScanStatus> nfcScanStatusAdapter;

    @NotNull
    private final AbstractC11873h<Long> nullableLongAdapter;

    @NotNull
    private final AbstractC11873h<String> nullableStringAdapter;

    @NotNull
    private final AbstractC11873h<TrackingMetadata> nullableTrackingMetadataAdapter;

    @NotNull
    private final AbstractC11878m.b options;

    public NfcScanEventDataJsonAdapter(@NotNull C11888w c11888w) {
        c11888w.getClass();
        AbstractC11878m.b bVarM44343a = AbstractC11878m.b.m44343a("phase", NotificationCompat.CATEGORY_STATUS, "duration_ms", "auth_method", "chip_auth_status", "data_group_type", "metadata");
        bVarM44343a.getClass();
        this.options = bVarM44343a;
        this.nfcScanPhaseAdapter = AbstractC4112b.m20956a(c11888w, NfcScanPhase.class, "phase");
        this.nfcScanStatusAdapter = AbstractC4112b.m20956a(c11888w, NfcScanStatus.class, NotificationCompat.CATEGORY_STATUS);
        this.nullableLongAdapter = AbstractC4112b.m20956a(c11888w, Long.class, "durationMs");
        this.nullableStringAdapter = AbstractC4112b.m20956a(c11888w, String.class, "authMethod");
        this.nullableTrackingMetadataAdapter = AbstractC4112b.m20956a(c11888w, TrackingMetadata.class, "metadata");
    }

    @NotNull
    public String toString() {
        return AbstractC4111a.m20955a("GeneratedJsonAdapter(NfcScanEventData)", 38);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public NfcScanEventData fromJson(@NotNull AbstractC11878m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        reader.getClass();
        reader.mo44325b();
        int i10 = -1;
        NfcScanPhase nfcScanPhaseFromJson = null;
        NfcScanStatus nfcScanStatusFromJson = null;
        Long lFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        TrackingMetadata trackingMetadataFromJson = null;
        while (reader.mo44329f()) {
            switch (reader.mo44316F(this.options)) {
                case -1:
                    reader.mo44320M();
                    reader.mo44321P();
                    break;
                case 0:
                    nfcScanPhaseFromJson = this.nfcScanPhaseAdapter.fromJson(reader);
                    if (nfcScanPhaseFromJson == null) {
                        throw C12494c.m46811x("phase", "phase", reader);
                    }
                    break;
                    break;
                case 1:
                    nfcScanStatusFromJson = this.nfcScanStatusAdapter.fromJson(reader);
                    if (nfcScanStatusFromJson == null) {
                        throw C12494c.m46811x(NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, reader);
                    }
                    break;
                    break;
                case 2:
                    lFromJson = this.nullableLongAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    trackingMetadataFromJson = this.nullableTrackingMetadataAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
            }
        }
        reader.mo44327d();
        if (i10 == -125) {
            TrackingMetadata trackingMetadata = trackingMetadataFromJson;
            String str = strFromJson3;
            String str2 = strFromJson2;
            String str3 = strFromJson;
            Long l10 = lFromJson;
            NfcScanStatus nfcScanStatus = nfcScanStatusFromJson;
            NfcScanPhase nfcScanPhase = nfcScanPhaseFromJson;
            if (nfcScanPhase == null) {
                throw C12494c.m46802o("phase", "phase", reader);
            }
            if (nfcScanStatus != null) {
                return new NfcScanEventData(nfcScanPhase, nfcScanStatus, l10, str3, str2, str, trackingMetadata);
            }
            throw C12494c.m46802o(NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, reader);
        }
        TrackingMetadata trackingMetadata2 = trackingMetadataFromJson;
        String str4 = strFromJson3;
        String str5 = strFromJson2;
        String str6 = strFromJson;
        Long l11 = lFromJson;
        NfcScanStatus nfcScanStatus2 = nfcScanStatusFromJson;
        NfcScanPhase nfcScanPhase2 = nfcScanPhaseFromJson;
        Constructor<NfcScanEventData> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NfcScanEventData.class.getDeclaredConstructor(NfcScanPhase.class, NfcScanStatus.class, Long.class, String.class, String.class, String.class, TrackingMetadata.class, Integer.TYPE, C12494c.f44658c);
            this.constructorRef = declaredConstructor;
            declaredConstructor.getClass();
        }
        Constructor<NfcScanEventData> constructor = declaredConstructor;
        if (nfcScanPhase2 == null) {
            throw C12494c.m46802o("phase", "phase", reader);
        }
        if (nfcScanStatus2 == null) {
            throw C12494c.m46802o(NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, reader);
        }
        NfcScanEventData nfcScanEventDataNewInstance = constructor.newInstance(nfcScanPhase2, nfcScanStatus2, l11, str6, str5, str4, trackingMetadata2, Integer.valueOf(i10), null);
        nfcScanEventDataNewInstance.getClass();
        return nfcScanEventDataNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t writer, @Nullable NfcScanEventData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo44374c();
        writer.mo44380n("phase");
        this.nfcScanPhaseAdapter.toJson(writer, value_.getPhase());
        writer.mo44380n(NotificationCompat.CATEGORY_STATUS);
        this.nfcScanStatusAdapter.toJson(writer, value_.getStatus());
        writer.mo44380n("duration_ms");
        this.nullableLongAdapter.toJson(writer, value_.getDurationMs());
        writer.mo44380n("auth_method");
        this.nullableStringAdapter.toJson(writer, value_.getAuthMethod());
        writer.mo44380n("chip_auth_status");
        this.nullableStringAdapter.toJson(writer, value_.getChipAuthStatus());
        writer.mo44380n("data_group_type");
        this.nullableStringAdapter.toJson(writer, value_.getDataGroupType());
        writer.mo44380n("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.mo44378g();
    }
}
