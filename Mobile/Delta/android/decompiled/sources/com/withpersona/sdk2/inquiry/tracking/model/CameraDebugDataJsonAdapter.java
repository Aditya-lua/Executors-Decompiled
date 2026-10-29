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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugDataJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraDebugData;)V", "Lum/m$b;", "options", "Lum/m$b;", "nullableStringAdapter", "Lum/h;", "", "nullableDoubleAdapter", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CameraDebugDataJsonAdapter extends h<CameraDebugData> {

    @Nullable
    private volatile Constructor<CameraDebugData> constructorRef;

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<Double> nullableDoubleAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options;

    public CameraDebugDataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b bVarA = m.b.a("device_type", "lens_aperture", "system_pressure_level", "is_low_light_boost_enabled", "current_iso", "current_exposure_duration", "current_zoom_factor", "auto_focus_system", "is_virtual_device", "has_flash", "is_flash_available");
        bVarA.getClass();
        this.options = bVarA;
        this.nullableStringAdapter = b.a(wVar, String.class, "deviceType");
        this.nullableDoubleAdapter = b.a(wVar, Double.class, "lensAperture");
        this.nullableBooleanAdapter = b.a(wVar, Boolean.class, "isLowLightBoostEnabled");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(CameraDebugData)", 37);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public CameraDebugData fromJson(@NotNull m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        reader.getClass();
        reader.b();
        int i10 = -1;
        String strFromJson = null;
        Double dFromJson = null;
        String strFromJson2 = null;
        Boolean boolFromJson = null;
        Double dFromJson2 = null;
        Double dFromJson3 = null;
        Double dFromJson4 = null;
        String strFromJson3 = null;
        Boolean boolFromJson2 = null;
        Boolean boolFromJson3 = null;
        Boolean boolFromJson4 = null;
        while (reader.f()) {
            switch (reader.F(this.options)) {
                case -1:
                    reader.M();
                    reader.P();
                    break;
                case 0:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -2;
                    break;
                case 1:
                    dFromJson = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    dFromJson2 = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    dFromJson3 = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    dFromJson4 = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
                case 7:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -129;
                    break;
                case 8:
                    boolFromJson2 = this.nullableBooleanAdapter.fromJson(reader);
                    i10 &= -257;
                    break;
                case 9:
                    boolFromJson3 = this.nullableBooleanAdapter.fromJson(reader);
                    i10 &= -513;
                    break;
                case 10:
                    boolFromJson4 = this.nullableBooleanAdapter.fromJson(reader);
                    i10 &= -1025;
                    break;
            }
        }
        reader.d();
        if (i10 == -2048) {
            Boolean bool = boolFromJson2;
            String str = strFromJson3;
            Double d10 = dFromJson4;
            Double d11 = dFromJson3;
            Double d12 = dFromJson2;
            Boolean bool2 = boolFromJson;
            return new CameraDebugData(strFromJson, dFromJson, strFromJson2, bool2, d12, d11, d10, str, bool, boolFromJson3, boolFromJson4);
        }
        Boolean bool3 = boolFromJson2;
        String str2 = strFromJson3;
        Double d13 = dFromJson4;
        Double d14 = dFromJson3;
        Double d15 = dFromJson2;
        Boolean bool4 = boolFromJson;
        String str3 = strFromJson2;
        Double d16 = dFromJson;
        String str4 = strFromJson;
        Constructor<CameraDebugData> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = CameraDebugData.class.getDeclaredConstructor(String.class, Double.class, String.class, Boolean.class, Double.class, Double.class, Double.class, String.class, Boolean.class, Boolean.class, Boolean.class, Integer.TYPE, c.f34445c);
            this.constructorRef = declaredConstructor;
            declaredConstructor.getClass();
        }
        CameraDebugData cameraDebugDataNewInstance = declaredConstructor.newInstance(str4, d16, str3, bool4, d15, d14, d13, str2, bool3, boolFromJson3, boolFromJson4, Integer.valueOf(i10), null);
        cameraDebugDataNewInstance.getClass();
        return cameraDebugDataNewInstance;
    }

    @Override // um.h
    public void toJson(@NotNull t writer, @Nullable CameraDebugData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("device_type");
        this.nullableStringAdapter.toJson(writer, value_.getDeviceType());
        writer.n("lens_aperture");
        this.nullableDoubleAdapter.toJson(writer, value_.getLensAperture());
        writer.n("system_pressure_level");
        this.nullableStringAdapter.toJson(writer, value_.getSystemPressureLevel());
        writer.n("is_low_light_boost_enabled");
        this.nullableBooleanAdapter.toJson(writer, value_.isLowLightBoostEnabled());
        writer.n("current_iso");
        this.nullableDoubleAdapter.toJson(writer, value_.getCurrentIso());
        writer.n("current_exposure_duration");
        this.nullableDoubleAdapter.toJson(writer, value_.getCurrentExposureDuration());
        writer.n("current_zoom_factor");
        this.nullableDoubleAdapter.toJson(writer, value_.getCurrentZoomFactor());
        writer.n("auto_focus_system");
        this.nullableStringAdapter.toJson(writer, value_.getAutoFocusSystem());
        writer.n("is_virtual_device");
        this.nullableBooleanAdapter.toJson(writer, value_.isVirtualDevice());
        writer.n("has_flash");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasFlash());
        writer.n("is_flash_available");
        this.nullableBooleanAdapter.toJson(writer, value_.isFlashAvailable());
        writer.g();
    }
}
