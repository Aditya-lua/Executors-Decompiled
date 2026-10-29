package com.withpersona.sdk2.inquiry.tracking.model;

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
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventDataJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;)V", "Lum/m$b;", "options", "Lum/m$b;", "nullableStringAdapter", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;", "nullableCameraSizeAdapter", "", "nullableDoubleAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;", "nullableCameraDebugDataAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "nullableTrackingMetadataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class CameraInfoEventDataJsonAdapter extends AbstractC11873h<CameraInfoEventData> {

    @Nullable
    private volatile Constructor<CameraInfoEventData> constructorRef;

    @NotNull
    private final AbstractC11873h<CameraDebugData> nullableCameraDebugDataAdapter;

    @NotNull
    private final AbstractC11873h<CameraSize> nullableCameraSizeAdapter;

    @NotNull
    private final AbstractC11873h<Double> nullableDoubleAdapter;

    @NotNull
    private final AbstractC11873h<String> nullableStringAdapter;

    @NotNull
    private final AbstractC11873h<TrackingMetadata> nullableTrackingMetadataAdapter;

    @NotNull
    private final AbstractC11878m.b options;

    public CameraInfoEventDataJsonAdapter(@NotNull C11888w c11888w) {
        c11888w.getClass();
        AbstractC11878m.b bVarM44343a = AbstractC11878m.b.m44343a("label", "position", "size", "frame_rate", "aspect_ratio", "debug_data", "metadata");
        bVarM44343a.getClass();
        this.options = bVarM44343a;
        this.nullableStringAdapter = AbstractC4112b.m20956a(c11888w, String.class, "label");
        this.nullableCameraSizeAdapter = AbstractC4112b.m20956a(c11888w, CameraSize.class, "size");
        this.nullableDoubleAdapter = AbstractC4112b.m20956a(c11888w, Double.class, "frameRate");
        this.nullableCameraDebugDataAdapter = AbstractC4112b.m20956a(c11888w, CameraDebugData.class, "debugData");
        this.nullableTrackingMetadataAdapter = AbstractC4112b.m20956a(c11888w, TrackingMetadata.class, "metadata");
    }

    @NotNull
    public String toString() {
        return AbstractC4111a.m20955a("GeneratedJsonAdapter(CameraInfoEventData)", 41);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public CameraInfoEventData fromJson(@NotNull AbstractC11878m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        reader.getClass();
        reader.mo44325b();
        int i10 = -1;
        String strFromJson = null;
        String strFromJson2 = null;
        CameraSize cameraSizeFromJson = null;
        Double dFromJson = null;
        Double dFromJson2 = null;
        CameraDebugData cameraDebugDataFromJson = null;
        TrackingMetadata trackingMetadataFromJson = null;
        while (reader.mo44329f()) {
            switch (reader.mo44316F(this.options)) {
                case -1:
                    reader.mo44320M();
                    reader.mo44321P();
                    break;
                case 0:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -2;
                    break;
                case 1:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    cameraSizeFromJson = this.nullableCameraSizeAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    dFromJson = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    dFromJson2 = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    cameraDebugDataFromJson = this.nullableCameraDebugDataAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    trackingMetadataFromJson = this.nullableTrackingMetadataAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
            }
        }
        reader.mo44327d();
        if (i10 == -128) {
            TrackingMetadata trackingMetadata = trackingMetadataFromJson;
            CameraDebugData cameraDebugData = cameraDebugDataFromJson;
            Double d10 = dFromJson2;
            Double d11 = dFromJson;
            return new CameraInfoEventData(strFromJson, strFromJson2, cameraSizeFromJson, d11, d10, cameraDebugData, trackingMetadata);
        }
        TrackingMetadata trackingMetadata2 = trackingMetadataFromJson;
        CameraDebugData cameraDebugData2 = cameraDebugDataFromJson;
        Double d12 = dFromJson2;
        Double d13 = dFromJson;
        CameraSize cameraSize = cameraSizeFromJson;
        String str = strFromJson2;
        String str2 = strFromJson;
        Constructor<CameraInfoEventData> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = CameraInfoEventData.class.getDeclaredConstructor(String.class, String.class, CameraSize.class, Double.class, Double.class, CameraDebugData.class, TrackingMetadata.class, Integer.TYPE, C12494c.f44658c);
            this.constructorRef = declaredConstructor;
            declaredConstructor.getClass();
        }
        CameraInfoEventData cameraInfoEventDataNewInstance = declaredConstructor.newInstance(str2, str, cameraSize, d13, d12, cameraDebugData2, trackingMetadata2, Integer.valueOf(i10), null);
        cameraInfoEventDataNewInstance.getClass();
        return cameraInfoEventDataNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t writer, @Nullable CameraInfoEventData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo44374c();
        writer.mo44380n("label");
        this.nullableStringAdapter.toJson(writer, value_.getLabel());
        writer.mo44380n("position");
        this.nullableStringAdapter.toJson(writer, value_.getPosition());
        writer.mo44380n("size");
        this.nullableCameraSizeAdapter.toJson(writer, value_.getSize());
        writer.mo44380n("frame_rate");
        this.nullableDoubleAdapter.toJson(writer, value_.getFrameRate());
        writer.mo44380n("aspect_ratio");
        this.nullableDoubleAdapter.toJson(writer, value_.getAspectRatio());
        writer.mo44380n("debug_data");
        this.nullableCameraDebugDataAdapter.toJson(writer, value_.getDebugData());
        writer.mo44380n("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.mo44378g();
    }
}
