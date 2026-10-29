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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventDataJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;)V", "Lum/m$b;", "options", "Lum/m$b;", "nullableStringAdapter", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "nullableTrackingMetadataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoErrorEventDataJsonAdapter extends h<VideoErrorEventData> {

    @Nullable
    private volatile Constructor<VideoErrorEventData> constructorRef;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final h<TrackingMetadata> nullableTrackingMetadataAdapter;

    @NotNull
    private final m.b options;

    public VideoErrorEventDataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b bVarA = m.b.a("step_name", "page_name", "capture_method", "error_name", "error_reason", "metadata");
        bVarA.getClass();
        this.options = bVarA;
        this.nullableStringAdapter = b.a(wVar, String.class, "stepName");
        this.nullableTrackingMetadataAdapter = b.a(wVar, TrackingMetadata.class, "metadata");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(VideoErrorEventData)", 41);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public VideoErrorEventData fromJson(@NotNull m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        reader.getClass();
        reader.b();
        int i10 = -1;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        TrackingMetadata trackingMetadataFromJson = null;
        while (reader.f()) {
            switch (reader.F(this.options)) {
                case -1:
                    reader.M();
                    reader.P();
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
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    trackingMetadataFromJson = this.nullableTrackingMetadataAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
            }
        }
        reader.d();
        if (i10 == -63) {
            TrackingMetadata trackingMetadata = trackingMetadataFromJson;
            String str = strFromJson5;
            String str2 = strFromJson4;
            return new VideoErrorEventData(strFromJson, strFromJson2, strFromJson3, str2, str, trackingMetadata);
        }
        TrackingMetadata trackingMetadata2 = trackingMetadataFromJson;
        String str3 = strFromJson5;
        String str4 = strFromJson4;
        String str5 = strFromJson3;
        String str6 = strFromJson2;
        String str7 = strFromJson;
        Constructor<VideoErrorEventData> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = VideoErrorEventData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, TrackingMetadata.class, Integer.TYPE, c.f34445c);
            this.constructorRef = declaredConstructor;
            declaredConstructor.getClass();
        }
        VideoErrorEventData videoErrorEventDataNewInstance = declaredConstructor.newInstance(str7, str6, str5, str4, str3, trackingMetadata2, Integer.valueOf(i10), null);
        videoErrorEventDataNewInstance.getClass();
        return videoErrorEventDataNewInstance;
    }

    @Override // um.h
    public void toJson(@NotNull t writer, @Nullable VideoErrorEventData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("step_name");
        this.nullableStringAdapter.toJson(writer, value_.getStepName());
        writer.n("page_name");
        this.nullableStringAdapter.toJson(writer, value_.getPageName());
        writer.n("capture_method");
        this.nullableStringAdapter.toJson(writer, value_.getCaptureMethod());
        writer.n("error_name");
        this.nullableStringAdapter.toJson(writer, value_.getErrorName());
        writer.n("error_reason");
        this.nullableStringAdapter.toJson(writer, value_.getErrorReason());
        writer.n("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.g();
    }
}
