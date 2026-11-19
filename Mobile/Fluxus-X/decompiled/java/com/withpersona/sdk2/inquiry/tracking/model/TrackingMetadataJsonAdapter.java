package com.withpersona.sdk2.inquiry.tracking.model;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import hn.a0;
import hn.h;
import hn.m;
import hn.t;
import hn.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import jn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.q0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadataJsonAdapter;", "Lhn/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "Lhn/w;", "moshi", "<init>", "(Lhn/w;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Lhn/m;", "reader", "fromJson", "(Lhn/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "Lhn/t;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "(Lhn/t;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "Lhn/m$b;", "options", "Lhn/m$b;", "nullableStringAdapter", "Lhn/h;", BuildConfig.FLAVOR, "nullableBooleanAdapter", BuildConfig.FLAVOR, "nullableDoubleAdapter", BuildConfig.FLAVOR, "nullableLongAdapter", BuildConfig.FLAVOR, "nullableMapOfStringBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrackingMetadataJsonAdapter extends h<TrackingMetadata> {

    @Nullable
    private volatile Constructor<TrackingMetadata> constructorRef;

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<Double> nullableDoubleAdapter;

    @NotNull
    private final h<Long> nullableLongAdapter;

    @NotNull
    private final h<Map<String, Boolean>> nullableMapOfStringBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options;

    public TrackingMetadataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b bVarA = m.b.a("sdk", "sdk_version", "app_version", "app_namespace", Payload.DEVICE_MODEL, "is_simulator", "os_version", "connection_type", "cellular_technology", "thermal_state", "system_available_memory_mb", "battery_level", "is_low_power_mode", "app_memory_usage_mb", "is_charging", "is_backgrounded", "locale", "timezone", "feature_flags");
        bVarA.getClass();
        this.options = bVarA;
        this.nullableStringAdapter = b.a(wVar, String.class, "sdk");
        this.nullableBooleanAdapter = b.a(wVar, Boolean.class, "isSimulator");
        this.nullableDoubleAdapter = b.a(wVar, Double.class, "systemAvailableMemoryMb");
        this.nullableLongAdapter = b.a(wVar, Long.class, "appMemoryUsageMb");
        h<Map<String, Boolean>> hVarF = wVar.f(a0.j(Map.class, String.class, Boolean.class), q0.d(), "featureFlags");
        hVarF.getClass();
        this.nullableMapOfStringBooleanAdapter = hVarF;
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(TrackingMetadata)", 38);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // hn.h
    @NotNull
    public TrackingMetadata fromJson(@NotNull m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        int i10;
        reader.getClass();
        reader.b();
        int i11 = -1;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        Boolean boolFromJson = null;
        String strFromJson6 = null;
        String strFromJson7 = null;
        String strFromJson8 = null;
        String strFromJson9 = null;
        Double dFromJson = null;
        Double dFromJson2 = null;
        Boolean boolFromJson2 = null;
        Long lFromJson = null;
        Boolean boolFromJson3 = null;
        Boolean boolFromJson4 = null;
        String strFromJson10 = null;
        String strFromJson11 = null;
        Map<String, Boolean> mapFromJson = null;
        while (reader.f()) {
            switch (reader.I(this.options)) {
                case -1:
                    reader.O();
                    reader.Q();
                    continue;
                case 0:
                    i10 = -2;
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    i10 = -3;
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    i10 = -5;
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    i10 = -9;
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    i10 = -17;
                    strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    i10 = -33;
                    boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 6:
                    i10 = -65;
                    strFromJson6 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    i10 = -129;
                    strFromJson7 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    i10 = -257;
                    strFromJson8 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    i10 = -513;
                    strFromJson9 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 10:
                    i10 = -1025;
                    dFromJson = this.nullableDoubleAdapter.fromJson(reader);
                    break;
                case 11:
                    i10 = -2049;
                    dFromJson2 = this.nullableDoubleAdapter.fromJson(reader);
                    break;
                case 12:
                    i10 = -4097;
                    boolFromJson2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 13:
                    i10 = -8193;
                    lFromJson = this.nullableLongAdapter.fromJson(reader);
                    break;
                case 14:
                    i10 = -16385;
                    boolFromJson3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 15:
                    i10 = -32769;
                    boolFromJson4 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 16:
                    i10 = -65537;
                    strFromJson10 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 17:
                    i10 = -131073;
                    strFromJson11 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case MlKitException.UNSUPPORTED /* 18 */:
                    i10 = -262145;
                    mapFromJson = this.nullableMapOfStringBooleanAdapter.fromJson(reader);
                    break;
                default:
                    continue;
            }
            i11 &= i10;
        }
        reader.d();
        if (i11 == -524288) {
            String str = strFromJson8;
            String str2 = strFromJson7;
            String str3 = strFromJson6;
            Boolean bool = boolFromJson;
            String str4 = strFromJson5;
            String str5 = strFromJson4;
            return new TrackingMetadata(strFromJson, strFromJson2, strFromJson3, str5, str4, bool, str3, str2, str, strFromJson9, dFromJson, dFromJson2, boolFromJson2, lFromJson, boolFromJson3, boolFromJson4, strFromJson10, strFromJson11, mapFromJson);
        }
        String str6 = strFromJson8;
        String str7 = strFromJson7;
        String str8 = strFromJson6;
        Boolean bool2 = boolFromJson;
        String str9 = strFromJson5;
        String str10 = strFromJson4;
        String str11 = strFromJson3;
        String str12 = strFromJson2;
        String str13 = strFromJson;
        Constructor<TrackingMetadata> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = TrackingMetadata.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, Boolean.class, String.class, String.class, String.class, String.class, Double.class, Double.class, Boolean.class, Long.class, Boolean.class, Boolean.class, String.class, String.class, Map.class, Integer.TYPE, c.f20816c);
            this.constructorRef = declaredConstructor;
            declaredConstructor.getClass();
        }
        TrackingMetadata trackingMetadataNewInstance = declaredConstructor.newInstance(str13, str12, str11, str10, str9, bool2, str8, str7, str6, strFromJson9, dFromJson, dFromJson2, boolFromJson2, lFromJson, boolFromJson3, boolFromJson4, strFromJson10, strFromJson11, mapFromJson, Integer.valueOf(i11), null);
        trackingMetadataNewInstance.getClass();
        return trackingMetadataNewInstance;
    }

    @Override // hn.h
    public void toJson(@NotNull t writer, @Nullable TrackingMetadata value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o("sdk");
        this.nullableStringAdapter.toJson(writer, value_.getSdk());
        writer.o("sdk_version");
        this.nullableStringAdapter.toJson(writer, value_.getSdkVersion());
        writer.o("app_version");
        this.nullableStringAdapter.toJson(writer, value_.getAppVersion());
        writer.o("app_namespace");
        this.nullableStringAdapter.toJson(writer, value_.getAppNamespace());
        writer.o(Payload.DEVICE_MODEL);
        this.nullableStringAdapter.toJson(writer, value_.getDeviceModel());
        writer.o("is_simulator");
        this.nullableBooleanAdapter.toJson(writer, value_.isSimulator());
        writer.o("os_version");
        this.nullableStringAdapter.toJson(writer, value_.getOsVersion());
        writer.o("connection_type");
        this.nullableStringAdapter.toJson(writer, value_.getConnectionType());
        writer.o("cellular_technology");
        this.nullableStringAdapter.toJson(writer, value_.getCellularTechnology());
        writer.o("thermal_state");
        this.nullableStringAdapter.toJson(writer, value_.getThermalState());
        writer.o("system_available_memory_mb");
        this.nullableDoubleAdapter.toJson(writer, value_.getSystemAvailableMemoryMb());
        writer.o("battery_level");
        this.nullableDoubleAdapter.toJson(writer, value_.getBatteryLevel());
        writer.o("is_low_power_mode");
        this.nullableBooleanAdapter.toJson(writer, value_.isLowPowerMode());
        writer.o("app_memory_usage_mb");
        this.nullableLongAdapter.toJson(writer, value_.getAppMemoryUsageMb());
        writer.o("is_charging");
        this.nullableBooleanAdapter.toJson(writer, value_.isCharging());
        writer.o("is_backgrounded");
        this.nullableBooleanAdapter.toJson(writer, value_.isBackgrounded());
        writer.o("locale");
        this.nullableStringAdapter.toJson(writer, value_.getLocale());
        writer.o("timezone");
        this.nullableStringAdapter.toJson(writer, value_.getTimezone());
        writer.o("feature_flags");
        this.nullableMapOfStringBooleanAdapter.toJson(writer, value_.getFeatureFlags());
        writer.g();
    }
}
