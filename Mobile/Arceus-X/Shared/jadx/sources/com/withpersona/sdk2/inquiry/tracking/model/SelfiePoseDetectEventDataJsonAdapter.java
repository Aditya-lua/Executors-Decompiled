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
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventDataJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;)V", "Lum/m$b;", "options", "Lum/m$b;", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;", "selfiePoseTypeAdapter", "Lum/h;", "", "floatAdapter", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "nullableTrackingMetadataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class SelfiePoseDetectEventDataJsonAdapter extends AbstractC11873h<SelfiePoseDetectEventData> {

    @Nullable
    private volatile Constructor<SelfiePoseDetectEventData> constructorRef;

    @NotNull
    private final AbstractC11873h<Float> floatAdapter;

    @NotNull
    private final AbstractC11873h<TrackingMetadata> nullableTrackingMetadataAdapter;

    @NotNull
    private final AbstractC11878m.b options;

    @NotNull
    private final AbstractC11873h<SelfiePoseType> selfiePoseTypeAdapter;

    public SelfiePoseDetectEventDataJsonAdapter(@NotNull C11888w c11888w) {
        c11888w.getClass();
        AbstractC11878m.b bVarM44343a = AbstractC11878m.b.m44343a("intended_pose", "actual_pose", "pitch", "yaw", "roll", "metadata");
        bVarM44343a.getClass();
        this.options = bVarM44343a;
        this.selfiePoseTypeAdapter = AbstractC4112b.m20956a(c11888w, SelfiePoseType.class, "intendedPose");
        this.floatAdapter = AbstractC4112b.m20956a(c11888w, Float.TYPE, "pitch");
        this.nullableTrackingMetadataAdapter = AbstractC4112b.m20956a(c11888w, TrackingMetadata.class, "metadata");
    }

    @NotNull
    public String toString() {
        return AbstractC4111a.m20955a("GeneratedJsonAdapter(SelfiePoseDetectEventData)", 47);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public SelfiePoseDetectEventData fromJson(@NotNull AbstractC11878m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        reader.getClass();
        reader.mo44325b();
        int i10 = -1;
        SelfiePoseType selfiePoseTypeFromJson = null;
        SelfiePoseType selfiePoseTypeFromJson2 = null;
        Float fFromJson = null;
        Float fFromJson2 = null;
        Float fFromJson3 = null;
        TrackingMetadata trackingMetadataFromJson = null;
        while (reader.mo44329f()) {
            SelfiePoseType selfiePoseType = selfiePoseTypeFromJson;
            switch (reader.mo44316F(this.options)) {
                case -1:
                    reader.mo44320M();
                    reader.mo44321P();
                    break;
                case 0:
                    selfiePoseTypeFromJson = this.selfiePoseTypeAdapter.fromJson(reader);
                    if (selfiePoseTypeFromJson == null) {
                        throw C12494c.m46811x("intendedPose", "intended_pose", reader);
                    }
                    continue;
                    break;
                case 1:
                    selfiePoseTypeFromJson2 = this.selfiePoseTypeAdapter.fromJson(reader);
                    if (selfiePoseTypeFromJson2 == null) {
                        throw C12494c.m46811x("actualPose", "actual_pose", reader);
                    }
                    break;
                case 2:
                    fFromJson = this.floatAdapter.fromJson(reader);
                    if (fFromJson == null) {
                        throw C12494c.m46811x("pitch", "pitch", reader);
                    }
                    break;
                case 3:
                    fFromJson2 = this.floatAdapter.fromJson(reader);
                    if (fFromJson2 == null) {
                        throw C12494c.m46811x("yaw", "yaw", reader);
                    }
                    break;
                case 4:
                    fFromJson3 = this.floatAdapter.fromJson(reader);
                    if (fFromJson3 == null) {
                        throw C12494c.m46811x("roll", "roll", reader);
                    }
                    break;
                case 5:
                    trackingMetadataFromJson = this.nullableTrackingMetadataAdapter.fromJson(reader);
                    selfiePoseTypeFromJson = selfiePoseType;
                    i10 = -33;
                    continue;
            }
            selfiePoseTypeFromJson = selfiePoseType;
        }
        SelfiePoseType selfiePoseType2 = selfiePoseTypeFromJson;
        reader.mo44327d();
        if (i10 == -33) {
            if (selfiePoseType2 == null) {
                throw C12494c.m46802o("intendedPose", "intended_pose", reader);
            }
            if (selfiePoseTypeFromJson2 == null) {
                throw C12494c.m46802o("actualPose", "actual_pose", reader);
            }
            if (fFromJson == null) {
                throw C12494c.m46802o("pitch", "pitch", reader);
            }
            Float f10 = fFromJson2;
            float fFloatValue = fFromJson.floatValue();
            if (f10 == null) {
                throw C12494c.m46802o("yaw", "yaw", reader);
            }
            Float f11 = fFromJson3;
            float fFloatValue2 = f10.floatValue();
            if (f11 == null) {
                throw C12494c.m46802o("roll", "roll", reader);
            }
            return new SelfiePoseDetectEventData(selfiePoseType2, selfiePoseTypeFromJson2, fFloatValue, fFloatValue2, f11.floatValue(), trackingMetadataFromJson);
        }
        Float f12 = fFromJson2;
        Float f13 = fFromJson3;
        Constructor<SelfiePoseDetectEventData> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = C12494c.f44658c;
            Class cls3 = Float.TYPE;
            declaredConstructor = SelfiePoseDetectEventData.class.getDeclaredConstructor(SelfiePoseType.class, SelfiePoseType.class, cls3, cls3, cls3, TrackingMetadata.class, cls, cls2);
            this.constructorRef = declaredConstructor;
            declaredConstructor.getClass();
        }
        if (selfiePoseType2 == null) {
            throw C12494c.m46802o("intendedPose", "intended_pose", reader);
        }
        if (selfiePoseTypeFromJson2 == null) {
            throw C12494c.m46802o("actualPose", "actual_pose", reader);
        }
        if (fFromJson == null) {
            throw C12494c.m46802o("pitch", "pitch", reader);
        }
        if (f12 == null) {
            throw C12494c.m46802o("yaw", "yaw", reader);
        }
        if (f13 == null) {
            throw C12494c.m46802o("roll", "roll", reader);
        }
        SelfiePoseDetectEventData selfiePoseDetectEventDataNewInstance = declaredConstructor.newInstance(selfiePoseType2, selfiePoseTypeFromJson2, fFromJson, f12, f13, trackingMetadataFromJson, Integer.valueOf(i10), null);
        selfiePoseDetectEventDataNewInstance.getClass();
        return selfiePoseDetectEventDataNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t writer, @Nullable SelfiePoseDetectEventData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo44374c();
        writer.mo44380n("intended_pose");
        this.selfiePoseTypeAdapter.toJson(writer, value_.getIntendedPose());
        writer.mo44380n("actual_pose");
        this.selfiePoseTypeAdapter.toJson(writer, value_.getActualPose());
        writer.mo44380n("pitch");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getPitch()));
        writer.mo44380n("yaw");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getYaw()));
        writer.mo44380n("roll");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getRoll()));
        writer.mo44380n("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.mo44378g();
    }
}
