package com.withpersona.sdk2.inquiry.tracking.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.h;
import um.m;
import um.t;
import um.w;
import wm.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventDataJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;)V", "Lum/m$b;", "options", "Lum/m$b;", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;", "nfcScanPhaseAdapter", "Lum/h;", "nullableStringAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorType;", "nullableNfcErrorTypeAdapter", "", "nullableLongAdapter", "", "nullableIntAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "nullableTrackingMetadataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NfcErrorEventDataJsonAdapter extends h<NfcErrorEventData> {

    @Nullable
    private volatile Constructor<NfcErrorEventData> constructorRef;

    @NotNull
    private final h<NfcScanPhase> nfcScanPhaseAdapter;

    @NotNull
    private final h<Integer> nullableIntAdapter;

    @NotNull
    private final h<Long> nullableLongAdapter;

    @NotNull
    private final h<NfcErrorType> nullableNfcErrorTypeAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final h<TrackingMetadata> nullableTrackingMetadataAdapter;

    @NotNull
    private final m.b options;

    public NfcErrorEventDataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b bVarA = m.b.a("phase", "category", "error_message", "error_type", "duration_ms", "auth_method", "data_group_type", "card_status_word", "metadata");
        bVarA.getClass();
        this.options = bVarA;
        this.nfcScanPhaseAdapter = b.a(wVar, NfcScanPhase.class, "phase");
        this.nullableStringAdapter = b.a(wVar, String.class, "category");
        this.nullableNfcErrorTypeAdapter = b.a(wVar, NfcErrorType.class, "errorType");
        this.nullableLongAdapter = b.a(wVar, Long.class, "durationMs");
        this.nullableIntAdapter = b.a(wVar, Integer.class, "cardStatusWord");
        this.nullableTrackingMetadataAdapter = b.a(wVar, TrackingMetadata.class, "metadata");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(NfcErrorEventData)", 39);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public NfcErrorEventData fromJson(@NotNull m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        reader.getClass();
        reader.b();
        int i10 = -1;
        NfcScanPhase nfcScanPhaseFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        NfcErrorType nfcErrorTypeFromJson = null;
        Long lFromJson = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        Integer numFromJson = null;
        TrackingMetadata trackingMetadataFromJson = null;
        while (reader.f()) {
            switch (reader.F(this.options)) {
                case -1:
                    reader.M();
                    reader.P();
                    break;
                case 0:
                    nfcScanPhaseFromJson = this.nfcScanPhaseAdapter.fromJson(reader);
                    if (nfcScanPhaseFromJson == null) {
                        throw c.x("phase", "phase", reader);
                    }
                    break;
                    break;
                case 1:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    nfcErrorTypeFromJson = this.nullableNfcErrorTypeAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    lFromJson = this.nullableLongAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
                case 7:
                    numFromJson = this.nullableIntAdapter.fromJson(reader);
                    i10 &= -129;
                    break;
                case 8:
                    trackingMetadataFromJson = this.nullableTrackingMetadataAdapter.fromJson(reader);
                    i10 &= -257;
                    break;
            }
        }
        reader.d();
        if (i10 == -511) {
            TrackingMetadata trackingMetadata = trackingMetadataFromJson;
            Integer num = numFromJson;
            String str = strFromJson4;
            String str2 = strFromJson3;
            Long l10 = lFromJson;
            NfcErrorType nfcErrorType = nfcErrorTypeFromJson;
            String str3 = strFromJson2;
            String str4 = strFromJson;
            NfcScanPhase nfcScanPhase = nfcScanPhaseFromJson;
            if (nfcScanPhase != null) {
                return new NfcErrorEventData(nfcScanPhase, str4, str3, nfcErrorType, l10, str2, str, num, trackingMetadata);
            }
            throw c.o("phase", "phase", reader);
        }
        TrackingMetadata trackingMetadata2 = trackingMetadataFromJson;
        Integer num2 = numFromJson;
        String str5 = strFromJson4;
        String str6 = strFromJson3;
        Long l11 = lFromJson;
        NfcErrorType nfcErrorType2 = nfcErrorTypeFromJson;
        String str7 = strFromJson2;
        String str8 = strFromJson;
        NfcScanPhase nfcScanPhase2 = nfcScanPhaseFromJson;
        Constructor<NfcErrorEventData> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NfcErrorEventData.class.getDeclaredConstructor(NfcScanPhase.class, String.class, String.class, NfcErrorType.class, Long.class, String.class, String.class, Integer.class, TrackingMetadata.class, Integer.TYPE, c.f34445c);
            this.constructorRef = declaredConstructor;
            declaredConstructor.getClass();
        }
        if (nfcScanPhase2 == null) {
            throw c.o("phase", "phase", reader);
        }
        NfcErrorEventData nfcErrorEventDataNewInstance = declaredConstructor.newInstance(nfcScanPhase2, str8, str7, nfcErrorType2, l11, str6, str5, num2, trackingMetadata2, Integer.valueOf(i10), null);
        nfcErrorEventDataNewInstance.getClass();
        return nfcErrorEventDataNewInstance;
    }

    @Override // um.h
    public void toJson(@NotNull t writer, @Nullable NfcErrorEventData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("phase");
        this.nfcScanPhaseAdapter.toJson(writer, value_.getPhase());
        writer.n("category");
        this.nullableStringAdapter.toJson(writer, value_.getCategory());
        writer.n("error_message");
        this.nullableStringAdapter.toJson(writer, value_.getErrorMessage());
        writer.n("error_type");
        this.nullableNfcErrorTypeAdapter.toJson(writer, value_.getErrorType());
        writer.n("duration_ms");
        this.nullableLongAdapter.toJson(writer, value_.getDurationMs());
        writer.n("auth_method");
        this.nullableStringAdapter.toJson(writer, value_.getAuthMethod());
        writer.n("data_group_type");
        this.nullableStringAdapter.toJson(writer, value_.getDataGroupType());
        writer.n("card_status_word");
        this.nullableIntAdapter.toJson(writer, value_.getCardStatusWord());
        writer.n("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.g();
    }
}
