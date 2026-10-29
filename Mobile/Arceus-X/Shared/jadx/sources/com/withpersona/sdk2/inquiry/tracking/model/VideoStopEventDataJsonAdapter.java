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
@Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopEventDataJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopEventData;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopEventData;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopEventData;)V", "Lum/m$b;", "options", "Lum/m$b;", "nullableStringAdapter", "Lum/h;", "", "nullableIntAdapter", "", "nullableDoubleAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "nullableTrackingMetadataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class VideoStopEventDataJsonAdapter extends AbstractC11873h<VideoStopEventData> {

    @Nullable
    private volatile Constructor<VideoStopEventData> constructorRef;

    @NotNull
    private final AbstractC11873h<Double> nullableDoubleAdapter;

    @NotNull
    private final AbstractC11873h<Integer> nullableIntAdapter;

    @NotNull
    private final AbstractC11873h<String> nullableStringAdapter;

    @NotNull
    private final AbstractC11873h<TrackingMetadata> nullableTrackingMetadataAdapter;

    @NotNull
    private final AbstractC11878m.b options;

    public VideoStopEventDataJsonAdapter(@NotNull C11888w c11888w) {
        c11888w.getClass();
        AbstractC11878m.b bVarM44343a = AbstractC11878m.b.m44343a("step_name", "page_name", "capture_method", "asset_id", "elapsed_time", "chunks_length", "blob_size", "metadata");
        bVarM44343a.getClass();
        this.options = bVarM44343a;
        this.nullableStringAdapter = AbstractC4112b.m20956a(c11888w, String.class, "stepName");
        this.nullableIntAdapter = AbstractC4112b.m20956a(c11888w, Integer.class, "elapsedTime");
        this.nullableDoubleAdapter = AbstractC4112b.m20956a(c11888w, Double.class, "blobSize");
        this.nullableTrackingMetadataAdapter = AbstractC4112b.m20956a(c11888w, TrackingMetadata.class, "metadata");
    }

    @NotNull
    public String toString() {
        return AbstractC4111a.m20955a("GeneratedJsonAdapter(VideoStopEventData)", 40);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public VideoStopEventData fromJson(@NotNull AbstractC11878m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        reader.getClass();
        reader.mo44325b();
        int i10 = -1;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        Integer numFromJson = null;
        Integer numFromJson2 = null;
        Double dFromJson = null;
        TrackingMetadata trackingMetadataFromJson = null;
        while (reader.mo44329f()) {
            switch (reader.mo44316F(this.options)) {
                case -1:
                    reader.mo44320M();
                    reader.mo44321P();
                    break;
                case 0:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    numFromJson = this.nullableIntAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    numFromJson2 = this.nullableIntAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    dFromJson = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
                case 7:
                    trackingMetadataFromJson = this.nullableTrackingMetadataAdapter.fromJson(reader);
                    i10 &= -129;
                    break;
            }
        }
        reader.mo44327d();
        if (i10 == -255) {
            TrackingMetadata trackingMetadata = trackingMetadataFromJson;
            Double d10 = dFromJson;
            Integer num = numFromJson2;
            Integer num2 = numFromJson;
            String str = strFromJson4;
            return new VideoStopEventData(strFromJson, strFromJson2, strFromJson3, str, num2, num, d10, trackingMetadata);
        }
        TrackingMetadata trackingMetadata2 = trackingMetadataFromJson;
        Double d11 = dFromJson;
        Integer num3 = numFromJson2;
        Integer num4 = numFromJson;
        String str2 = strFromJson4;
        String str3 = strFromJson3;
        String str4 = strFromJson2;
        String str5 = strFromJson;
        Constructor<VideoStopEventData> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = VideoStopEventData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Integer.class, Integer.class, Double.class, TrackingMetadata.class, Integer.TYPE, C12494c.f44658c);
            this.constructorRef = declaredConstructor;
            declaredConstructor.getClass();
        }
        VideoStopEventData videoStopEventDataNewInstance = declaredConstructor.newInstance(str5, str4, str3, str2, num4, num3, d11, trackingMetadata2, Integer.valueOf(i10), null);
        videoStopEventDataNewInstance.getClass();
        return videoStopEventDataNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t writer, @Nullable VideoStopEventData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo44374c();
        writer.mo44380n("step_name");
        this.nullableStringAdapter.toJson(writer, value_.getStepName());
        writer.mo44380n("page_name");
        this.nullableStringAdapter.toJson(writer, value_.getPageName());
        writer.mo44380n("capture_method");
        this.nullableStringAdapter.toJson(writer, value_.getCaptureMethod());
        writer.mo44380n("asset_id");
        this.nullableStringAdapter.toJson(writer, value_.getAssetId());
        writer.mo44380n("elapsed_time");
        this.nullableIntAdapter.toJson(writer, value_.getElapsedTime());
        writer.mo44380n("chunks_length");
        this.nullableIntAdapter.toJson(writer, value_.getChunksLength());
        writer.mo44380n("blob_size");
        this.nullableDoubleAdapter.toJson(writer, value_.getBlobSize());
        writer.mo44380n("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.mo44378g();
    }
}
