package com.withpersona.sdk2.inquiry.steps.ui.components;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import hn.a0;
import hn.h;
import hn.m;
import hn.t;
import hn.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.q0;
import p001kotlin.jvm.internal.Intrinsics;
import qr.x5;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponentJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0017R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0017R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponentJsonAdapter;", "Lhn/h;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lhn/w;", "moshi", "<init>", "(Lhn/w;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Lhn/m;", "reader", "a", "(Lhn/m;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lhn/t;", "writer", "value_", BuildConfig.FLAVOR, "b", "(Lhn/t;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;)V", "Lhn/m$b;", "Lhn/m$b;", "options", "Lhn/h;", "stringAdapter", BuildConfig.FLAVOR, "Lqr/x5;", "c", "listOfUiComponentAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "d", "nullableJsonLogicBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "e", "nullableClickableStackComponentStyleAdapter", BuildConfig.FLAVOR, "f", "booleanAdapter", BuildConfig.FLAVOR, "g", "longAdapter", "Ljava/lang/reflect/Constructor;", "h", "Ljava/lang/reflect/Constructor;", "constructorRef", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<ClickableStackComponent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m.b options;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h<String> stringAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<List<x5>> listOfUiComponentAdapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<ClickableStack.ClickableStackComponentStyle> nullableClickableStackComponentStyleAdapter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<Boolean> booleanAdapter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<Long> longAdapter;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile Constructor<ClickableStackComponent> constructorRef;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a("name", "children", "hidden", "disabled", "styles", "isActive", "lastValueUpdateTs");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, q0.d(), "name");
        Intrinsics.checkNotNullExpressionValue(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<List<x5>> hVarF2 = moshi.f(a0.j(List.class, x5.class), q0.d(), "children");
        Intrinsics.checkNotNullExpressionValue(hVarF2, "adapter(...)");
        this.listOfUiComponentAdapter = hVarF2;
        h<JsonLogicBoolean> hVarF3 = moshi.f(JsonLogicBoolean.class, q0.d(), "hidden");
        Intrinsics.checkNotNullExpressionValue(hVarF3, "adapter(...)");
        this.nullableJsonLogicBooleanAdapter = hVarF3;
        h<ClickableStack.ClickableStackComponentStyle> hVarF4 = moshi.f(ClickableStack.ClickableStackComponentStyle.class, q0.d(), "styles");
        Intrinsics.checkNotNullExpressionValue(hVarF4, "adapter(...)");
        this.nullableClickableStackComponentStyleAdapter = hVarF4;
        h<Boolean> hVarF5 = moshi.f(Boolean.TYPE, q0.d(), "isActive");
        Intrinsics.checkNotNullExpressionValue(hVarF5, "adapter(...)");
        this.booleanAdapter = hVarF5;
        h<Long> hVarF6 = moshi.f(Long.TYPE, q0.d(), "lastValueUpdateTs");
        Intrinsics.checkNotNullExpressionValue(hVarF6, "adapter(...)");
        this.longAdapter = hVarF6;
    }

    @Override // hn.h
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ClickableStackComponent fromJson(@NotNull m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.b();
        JsonLogicBoolean jsonLogicBooleanFromJson = null;
        Boolean boolFromJson = bool;
        Long lFromJson = 0L;
        String strFromJson = null;
        List<x5> listFromJson = null;
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyleFromJson = null;
        int i10 = -1;
        JsonLogicBoolean jsonLogicBooleanFromJson2 = null;
        while (reader.f()) {
            switch (reader.I(this.options)) {
                case -1:
                    reader.O();
                    reader.Q();
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw jn.c.x("name", "name", reader);
                    }
                    break;
                    break;
                case 1:
                    listFromJson = this.listOfUiComponentAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw jn.c.x("children", "children", reader);
                    }
                    break;
                    break;
                case 2:
                    jsonLogicBooleanFromJson = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 3:
                    jsonLogicBooleanFromJson2 = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 4:
                    clickableStackComponentStyleFromJson = this.nullableClickableStackComponentStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw jn.c.x("isActive", "isActive", reader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case 6:
                    lFromJson = this.longAdapter.fromJson(reader);
                    if (lFromJson == null) {
                        throw jn.c.x("lastValueUpdateTs", "lastValueUpdateTs", reader);
                    }
                    i10 &= -65;
                    break;
                    break;
            }
        }
        reader.d();
        if (i10 == -97) {
            if (strFromJson == null) {
                throw jn.c.o("name", "name", reader);
            }
            if (listFromJson != null) {
                return new ClickableStackComponent(strFromJson, listFromJson, jsonLogicBooleanFromJson, jsonLogicBooleanFromJson2, clickableStackComponentStyleFromJson, boolFromJson.booleanValue(), lFromJson.longValue());
            }
            throw jn.c.o("children", "children", reader);
        }
        Constructor<ClickableStackComponent> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = ClickableStackComponent.class.getDeclaredConstructor(String.class, List.class, JsonLogicBoolean.class, JsonLogicBoolean.class, ClickableStack.ClickableStackComponentStyle.class, Boolean.TYPE, Long.TYPE, Integer.TYPE, jn.c.f20816c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        if (strFromJson == null) {
            throw jn.c.o("name", "name", reader);
        }
        if (listFromJson == null) {
            throw jn.c.o("children", "children", reader);
        }
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle = clickableStackComponentStyleFromJson;
        ClickableStackComponent clickableStackComponentNewInstance = declaredConstructor.newInstance(strFromJson, listFromJson, jsonLogicBooleanFromJson, jsonLogicBooleanFromJson2, clickableStackComponentStyle, boolFromJson, lFromJson, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullExpressionValue(clickableStackComponentNewInstance, "newInstance(...)");
        return clickableStackComponentNewInstance;
    }

    @Override // hn.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(@NotNull t writer, @Nullable ClickableStackComponent value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.o("children");
        this.listOfUiComponentAdapter.toJson(writer, value_.getChildren());
        writer.o("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.o("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getDisabled());
        writer.o("styles");
        this.nullableClickableStackComponentStyleAdapter.toJson(writer, value_.getStyles());
        writer.o("isActive");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getIsActive()));
        writer.o("lastValueUpdateTs");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getLastValueUpdateTs()));
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ClickableStackComponent");
        sb2.append(')');
        return sb2.toString();
    }
}
