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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventDataJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;)V", "Lum/m$b;", "options", "Lum/m$b;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;", "selfieCaptureStateAdapter", "Lum/h;", "nullableStringAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "nullableSelfiePoseTypeAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "nullableTrackingMetadataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelfieCaptureStateEventDataJsonAdapter extends h<SelfieCaptureStateEventData> {

    @Nullable
    private volatile Constructor<SelfieCaptureStateEventData> constructorRef;

    @NotNull
    private final h<SelfiePoseType> nullableSelfiePoseTypeAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final h<TrackingMetadata> nullableTrackingMetadataAdapter;

    @NotNull
    private final m.b options;

    @NotNull
    private final h<SelfieCaptureState> selfieCaptureStateAdapter;

    public SelfieCaptureStateEventDataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b bVarA = m.b.a("state", "capture_method", "pose", "metadata");
        bVarA.getClass();
        this.options = bVarA;
        this.selfieCaptureStateAdapter = b.a(wVar, SelfieCaptureState.class, "selfieCaptureState");
        this.nullableStringAdapter = b.a(wVar, String.class, "captureMethod");
        this.nullableSelfiePoseTypeAdapter = b.a(wVar, SelfiePoseType.class, "pose");
        this.nullableTrackingMetadataAdapter = b.a(wVar, TrackingMetadata.class, "metadata");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(SelfieCaptureStateEventData)", 49);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public SelfieCaptureStateEventData fromJson(@NotNull m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        reader.getClass();
        reader.b();
        SelfieCaptureState selfieCaptureStateFromJson = null;
        String strFromJson = null;
        SelfiePoseType selfiePoseTypeFromJson = null;
        TrackingMetadata trackingMetadataFromJson = null;
        int i10 = -1;
        while (reader.f()) {
            int iF = reader.F(this.options);
            if (iF == -1) {
                reader.M();
                reader.P();
            } else if (iF == 0) {
                selfieCaptureStateFromJson = this.selfieCaptureStateAdapter.fromJson(reader);
                if (selfieCaptureStateFromJson == null) {
                    throw c.x("selfieCaptureState", "state", reader);
                }
            } else if (iF == 1) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
            } else if (iF == 2) {
                selfiePoseTypeFromJson = this.nullableSelfiePoseTypeAdapter.fromJson(reader);
            } else if (iF == 3) {
                trackingMetadataFromJson = this.nullableTrackingMetadataAdapter.fromJson(reader);
                i10 = -9;
            }
        }
        reader.d();
        if (i10 == -9) {
            if (selfieCaptureStateFromJson != null) {
                return new SelfieCaptureStateEventData(selfieCaptureStateFromJson, strFromJson, selfiePoseTypeFromJson, trackingMetadataFromJson);
            }
            throw c.o("selfieCaptureState", "state", reader);
        }
        Constructor<SelfieCaptureStateEventData> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = SelfieCaptureStateEventData.class.getDeclaredConstructor(SelfieCaptureState.class, String.class, SelfiePoseType.class, TrackingMetadata.class, Integer.TYPE, c.f34445c);
            this.constructorRef = declaredConstructor;
            declaredConstructor.getClass();
        }
        if (selfieCaptureStateFromJson == null) {
            throw c.o("selfieCaptureState", "state", reader);
        }
        SelfieCaptureStateEventData selfieCaptureStateEventDataNewInstance = declaredConstructor.newInstance(selfieCaptureStateFromJson, strFromJson, selfiePoseTypeFromJson, trackingMetadataFromJson, Integer.valueOf(i10), null);
        selfieCaptureStateEventDataNewInstance.getClass();
        return selfieCaptureStateEventDataNewInstance;
    }

    @Override // um.h
    public void toJson(@NotNull t writer, @Nullable SelfieCaptureStateEventData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("state");
        this.selfieCaptureStateAdapter.toJson(writer, value_.getSelfieCaptureState());
        writer.n("capture_method");
        this.nullableStringAdapter.toJson(writer, value_.getCaptureMethod());
        writer.n("pose");
        this.nullableSelfiePoseTypeAdapter.toJson(writer, value_.getPose());
        writer.n("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.g();
    }
}
