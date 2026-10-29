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
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventDataJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;)V", "Lum/m$b;", "options", "Lum/m$b;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;", "selfieCaptureStateAdapter", "Lum/h;", "nullableStringAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "nullableSelfiePoseTypeAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "nullableTrackingMetadataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class SelfieCaptureStateEventDataJsonAdapter extends AbstractC11873h<SelfieCaptureStateEventData> {

    @Nullable
    private volatile Constructor<SelfieCaptureStateEventData> constructorRef;

    @NotNull
    private final AbstractC11873h<SelfiePoseType> nullableSelfiePoseTypeAdapter;

    @NotNull
    private final AbstractC11873h<String> nullableStringAdapter;

    @NotNull
    private final AbstractC11873h<TrackingMetadata> nullableTrackingMetadataAdapter;

    @NotNull
    private final AbstractC11878m.b options;

    @NotNull
    private final AbstractC11873h<SelfieCaptureState> selfieCaptureStateAdapter;

    public SelfieCaptureStateEventDataJsonAdapter(@NotNull C11888w c11888w) {
        c11888w.getClass();
        AbstractC11878m.b bVarM44343a = AbstractC11878m.b.m44343a("state", "capture_method", "pose", "metadata");
        bVarM44343a.getClass();
        this.options = bVarM44343a;
        this.selfieCaptureStateAdapter = AbstractC4112b.m20956a(c11888w, SelfieCaptureState.class, "selfieCaptureState");
        this.nullableStringAdapter = AbstractC4112b.m20956a(c11888w, String.class, "captureMethod");
        this.nullableSelfiePoseTypeAdapter = AbstractC4112b.m20956a(c11888w, SelfiePoseType.class, "pose");
        this.nullableTrackingMetadataAdapter = AbstractC4112b.m20956a(c11888w, TrackingMetadata.class, "metadata");
    }

    @NotNull
    public String toString() {
        return AbstractC4111a.m20955a("GeneratedJsonAdapter(SelfieCaptureStateEventData)", 49);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public SelfieCaptureStateEventData fromJson(@NotNull AbstractC11878m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        reader.getClass();
        reader.mo44325b();
        SelfieCaptureState selfieCaptureStateFromJson = null;
        String strFromJson = null;
        SelfiePoseType selfiePoseTypeFromJson = null;
        TrackingMetadata trackingMetadataFromJson = null;
        int i10 = -1;
        while (reader.mo44329f()) {
            int iMo44316F = reader.mo44316F(this.options);
            if (iMo44316F == -1) {
                reader.mo44320M();
                reader.mo44321P();
            } else if (iMo44316F == 0) {
                selfieCaptureStateFromJson = this.selfieCaptureStateAdapter.fromJson(reader);
                if (selfieCaptureStateFromJson == null) {
                    throw C12494c.m46811x("selfieCaptureState", "state", reader);
                }
            } else if (iMo44316F == 1) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
            } else if (iMo44316F == 2) {
                selfiePoseTypeFromJson = this.nullableSelfiePoseTypeAdapter.fromJson(reader);
            } else if (iMo44316F == 3) {
                trackingMetadataFromJson = this.nullableTrackingMetadataAdapter.fromJson(reader);
                i10 = -9;
            }
        }
        reader.mo44327d();
        if (i10 == -9) {
            if (selfieCaptureStateFromJson != null) {
                return new SelfieCaptureStateEventData(selfieCaptureStateFromJson, strFromJson, selfiePoseTypeFromJson, trackingMetadataFromJson);
            }
            throw C12494c.m46802o("selfieCaptureState", "state", reader);
        }
        Constructor<SelfieCaptureStateEventData> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = SelfieCaptureStateEventData.class.getDeclaredConstructor(SelfieCaptureState.class, String.class, SelfiePoseType.class, TrackingMetadata.class, Integer.TYPE, C12494c.f44658c);
            this.constructorRef = declaredConstructor;
            declaredConstructor.getClass();
        }
        if (selfieCaptureStateFromJson == null) {
            throw C12494c.m46802o("selfieCaptureState", "state", reader);
        }
        SelfieCaptureStateEventData selfieCaptureStateEventDataNewInstance = declaredConstructor.newInstance(selfieCaptureStateFromJson, strFromJson, selfiePoseTypeFromJson, trackingMetadataFromJson, Integer.valueOf(i10), null);
        selfieCaptureStateEventDataNewInstance.getClass();
        return selfieCaptureStateEventDataNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t writer, @Nullable SelfieCaptureStateEventData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo44374c();
        writer.mo44380n("state");
        this.selfieCaptureStateAdapter.toJson(writer, value_.getSelfieCaptureState());
        writer.mo44380n("capture_method");
        this.nullableStringAdapter.toJson(writer, value_.getCaptureMethod());
        writer.mo44380n("pose");
        this.nullableSelfiePoseTypeAdapter.toJson(writer, value_.getPose());
        writer.mo44380n("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.mo44378g();
    }
}
