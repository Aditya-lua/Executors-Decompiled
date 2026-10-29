package com.withpersona.sdk2.inquiry.tracking.model;

import com.appsflyer.sdk_base.referrer.Payload;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventDataJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;)V", "Lum/m$b;", "options", "Lum/m$b;", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureButtonType;", "govIdCaptureButtonTypeAdapter", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "nullableTrackingMetadataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GovernmentIdButtonEventDataJsonAdapter extends h<GovernmentIdButtonEventData> {

    @Nullable
    private volatile Constructor<GovernmentIdButtonEventData> constructorRef;

    @NotNull
    private final h<GovIdCaptureButtonType> govIdCaptureButtonTypeAdapter;

    @NotNull
    private final h<TrackingMetadata> nullableTrackingMetadataAdapter;

    @NotNull
    private final m.b options;

    public GovernmentIdButtonEventDataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b bVarA = m.b.a(Payload.TYPE, "metadata");
        bVarA.getClass();
        this.options = bVarA;
        this.govIdCaptureButtonTypeAdapter = b.a(wVar, GovIdCaptureButtonType.class, "govIdCaptureButtonType");
        this.nullableTrackingMetadataAdapter = b.a(wVar, TrackingMetadata.class, "metadata");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(GovernmentIdButtonEventData)", 49);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public GovernmentIdButtonEventData fromJson(@NotNull m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        reader.getClass();
        reader.b();
        GovIdCaptureButtonType govIdCaptureButtonTypeFromJson = null;
        TrackingMetadata trackingMetadataFromJson = null;
        int i10 = -1;
        while (reader.f()) {
            int iF = reader.F(this.options);
            if (iF == -1) {
                reader.M();
                reader.P();
            } else if (iF == 0) {
                govIdCaptureButtonTypeFromJson = this.govIdCaptureButtonTypeAdapter.fromJson(reader);
                if (govIdCaptureButtonTypeFromJson == null) {
                    throw c.x("govIdCaptureButtonType", Payload.TYPE, reader);
                }
            } else if (iF == 1) {
                trackingMetadataFromJson = this.nullableTrackingMetadataAdapter.fromJson(reader);
                i10 = -3;
            }
        }
        reader.d();
        if (i10 == -3) {
            if (govIdCaptureButtonTypeFromJson != null) {
                return new GovernmentIdButtonEventData(govIdCaptureButtonTypeFromJson, trackingMetadataFromJson);
            }
            throw c.o("govIdCaptureButtonType", Payload.TYPE, reader);
        }
        Constructor<GovernmentIdButtonEventData> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = GovernmentIdButtonEventData.class.getDeclaredConstructor(GovIdCaptureButtonType.class, TrackingMetadata.class, Integer.TYPE, c.f34445c);
            this.constructorRef = declaredConstructor;
            declaredConstructor.getClass();
        }
        if (govIdCaptureButtonTypeFromJson == null) {
            throw c.o("govIdCaptureButtonType", Payload.TYPE, reader);
        }
        GovernmentIdButtonEventData governmentIdButtonEventDataNewInstance = declaredConstructor.newInstance(govIdCaptureButtonTypeFromJson, trackingMetadataFromJson, Integer.valueOf(i10), null);
        governmentIdButtonEventDataNewInstance.getClass();
        return governmentIdButtonEventDataNewInstance;
    }

    @Override // um.h
    public void toJson(@NotNull t writer, @Nullable GovernmentIdButtonEventData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n(Payload.TYPE);
        this.govIdCaptureButtonTypeAdapter.toJson(writer, value_.getGovIdCaptureButtonType());
        writer.n("metadata");
        this.nullableTrackingMetadataAdapter.toJson(writer, value_.getMetadata());
        writer.g();
    }
}
