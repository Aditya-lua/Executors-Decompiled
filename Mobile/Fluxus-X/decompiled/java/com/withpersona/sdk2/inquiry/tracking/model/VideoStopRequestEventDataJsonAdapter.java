package com.withpersona.sdk2.inquiry.tracking.model;

import com.github.luben.zstd.BuildConfig;
import hn.h;
import hn.m;
import hn.t;
import hn.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import jn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopRequestEventDataJsonAdapter;", "Lhn/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopRequestEventData;", "Lhn/w;", "moshi", "<init>", "(Lhn/w;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Lhn/m;", "reader", "fromJson", "(Lhn/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopRequestEventData;", "Lhn/t;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "(Lhn/t;Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopRequestEventData;)V", "Lhn/m$b;", "options", "Lhn/m$b;", "nullableStringAdapter", "Lhn/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "nullableTrackingMetadataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoStopRequestEventDataJsonAdapter extends h<VideoStopRequestEventData> {

    @Nullable
    private volatile Constructor<VideoStopRequestEventData> constructorRef;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final h<TrackingMetadata> nullableTrackingMetadataAdapter;

    @NotNull
    private final m.b options;

    public VideoStopRequestEventDataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b bVarA = m.b.a("step_name", "page_name", "capture_method", "metadata");
        bVarA.getClass();
        this.options = bVarA;
        this.nullableStringAdapter = b.a(wVar, String.class, "stepName");
        this.nullableTrackingMetadataAdapter = b.a(wVar, TrackingMetadata.class, "metadata");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(VideoStopRequestEventData)", 47);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // hn.h
    @NotNull
    public VideoStopRequestEventData fromJson(@NotNull m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        reader.getClass();
        reader.b();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        TrackingMetadata trackingMetadataFromJson = null;
        int i10 = -1;
        while (reader.f()) {
            int I = reader.I(this.options);
            if (I == -1) {
                reader.O();
                reader.Q();
            } else if (I == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
            } else if (I == 1) {
                strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                i10 &= -3;
            } else if (I == 2) {
                strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                i10 &= -5;
            } else if (I == 3) {
                trackingMetadataFromJson = this.nullableTrackingMetadataAdapter.fromJson(reader);
                i10 &= -9;
            }
        }
        reader.d();
        if (i10 == -15) {
            return new VideoStopRequestEventData(strFromJson, strFromJson2, strFromJson3, trackingMetadataFromJson);
        }
        Constructor<VideoStopRequestEventData> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = VideoStopRequestEventData.class.getDeclaredConstructor(String.class, String.class, String.class, TrackingMetadata.class, Integer.TYPE, c.f20816c);
            this.constructorRef = declaredConstructor;
            declaredConstructor.getClass();
        }
        VideoStopRequestEventData videoStopRequestEventDataNewInstance = declaredConstructor.newInstance(strFromJson, strFromJson2, strFromJson3, trackingMetadataFromJson, Integer.valueOf(i10), null);
        videoStopRequestEventDataNewInstance.getClass();
        return videoStopRequestEventDataNewInstance;
    }

    @Override // hn.h
    public void toJson(@NotNull t writer, @Nullable VideoStopRequestEventData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o("step_name");
        this.nullableStringAdapter.toJson(writer, value_.getStepName());
        writer.o("page_name");
        this.nullableStringAdapter.toJson(writer, value_.getPageName());
        writer.o("capture_method");
        this.nullableStringAdapter.toJson(writer, value_.getCaptureMethod());
        writer.o("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.g();
    }
}
