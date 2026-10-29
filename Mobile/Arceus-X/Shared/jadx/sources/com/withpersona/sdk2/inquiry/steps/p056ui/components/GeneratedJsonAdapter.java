package com.withpersona.sdk2.inquiry.steps.p056ui.components;

import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.ClickableStack;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7702q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11866a0;
import p471um.C11888w;
import p522wm.C12494c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponentJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0017R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0017R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponentJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "a", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lum/t;", "writer", "value_", "", "b", "(Lum/t;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;)V", "Lum/m$b;", "Lum/m$b;", "options", "Lum/h;", "stringAdapter", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "c", "listOfUiComponentAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "d", "nullableJsonLogicBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "e", "nullableClickableStackComponentStyleAdapter", "", "f", "booleanAdapter", "", "g", "longAdapter", "Ljava/lang/reflect/Constructor;", "h", "Ljava/lang/reflect/Constructor;", "constructorRef", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class GeneratedJsonAdapter extends AbstractC11873h<ClickableStackComponent> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC11878m.b options;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC11873h<String> stringAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC11873h<List<UiComponent>> listOfUiComponentAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AbstractC11873h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AbstractC11873h<ClickableStack.ClickableStackComponentStyle> nullableClickableStackComponentStyleAdapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final AbstractC11873h<Boolean> booleanAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final AbstractC11873h<Long> longAdapter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public volatile Constructor<ClickableStackComponent> constructorRef;

    public GeneratedJsonAdapter(@NotNull C11888w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC11878m.b bVarM44343a = AbstractC11878m.b.m44343a("name", "children", "hidden", "disabled", "styles", "isActive", "lastValueUpdateTs");
        Intrinsics.checkNotNullExpressionValue(bVarM44343a, "of(...)");
        this.options = bVarM44343a;
        AbstractC11873h<String> abstractC11873hM44439f = moshi.m44439f(String.class, C7702q0.m31908d(), "name");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f, "adapter(...)");
        this.stringAdapter = abstractC11873hM44439f;
        AbstractC11873h<List<UiComponent>> abstractC11873hM44439f2 = moshi.m44439f(C11866a0.m44298j(List.class, UiComponent.class), C7702q0.m31908d(), "children");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f2, "adapter(...)");
        this.listOfUiComponentAdapter = abstractC11873hM44439f2;
        AbstractC11873h<JsonLogicBoolean> abstractC11873hM44439f3 = moshi.m44439f(JsonLogicBoolean.class, C7702q0.m31908d(), "hidden");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f3, "adapter(...)");
        this.nullableJsonLogicBooleanAdapter = abstractC11873hM44439f3;
        AbstractC11873h<ClickableStack.ClickableStackComponentStyle> abstractC11873hM44439f4 = moshi.m44439f(ClickableStack.ClickableStackComponentStyle.class, C7702q0.m31908d(), "styles");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f4, "adapter(...)");
        this.nullableClickableStackComponentStyleAdapter = abstractC11873hM44439f4;
        AbstractC11873h<Boolean> abstractC11873hM44439f5 = moshi.m44439f(Boolean.TYPE, C7702q0.m31908d(), "isActive");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f5, "adapter(...)");
        this.booleanAdapter = abstractC11873hM44439f5;
        AbstractC11873h<Long> abstractC11873hM44439f6 = moshi.m44439f(Long.TYPE, C7702q0.m31908d(), "lastValueUpdateTs");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f6, "adapter(...)");
        this.longAdapter = abstractC11873hM44439f6;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    @Override // p471um.AbstractC11873h
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ClickableStackComponent fromJson(@NotNull AbstractC11878m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.mo44325b();
        JsonLogicBoolean jsonLogicBooleanFromJson = null;
        Boolean boolFromJson = bool;
        Long lFromJson = 0L;
        String strFromJson = null;
        List<UiComponent> listFromJson = null;
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyleFromJson = null;
        int i10 = -1;
        JsonLogicBoolean jsonLogicBooleanFromJson2 = null;
        while (reader.mo44329f()) {
            switch (reader.mo44316F(this.options)) {
                case -1:
                    reader.mo44320M();
                    reader.mo44321P();
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw C12494c.m46811x("name", "name", reader);
                    }
                    break;
                    break;
                case 1:
                    listFromJson = this.listOfUiComponentAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw C12494c.m46811x("children", "children", reader);
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
                        throw C12494c.m46811x("isActive", "isActive", reader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case 6:
                    lFromJson = this.longAdapter.fromJson(reader);
                    if (lFromJson == null) {
                        throw C12494c.m46811x("lastValueUpdateTs", "lastValueUpdateTs", reader);
                    }
                    i10 &= -65;
                    break;
                    break;
            }
        }
        reader.mo44327d();
        if (i10 == -97) {
            if (strFromJson == null) {
                throw C12494c.m46802o("name", "name", reader);
            }
            if (listFromJson != null) {
                return new ClickableStackComponent(strFromJson, listFromJson, jsonLogicBooleanFromJson, jsonLogicBooleanFromJson2, clickableStackComponentStyleFromJson, boolFromJson.booleanValue(), lFromJson.longValue());
            }
            throw C12494c.m46802o("children", "children", reader);
        }
        Constructor<ClickableStackComponent> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = ClickableStackComponent.class.getDeclaredConstructor(String.class, List.class, JsonLogicBoolean.class, JsonLogicBoolean.class, ClickableStack.ClickableStackComponentStyle.class, Boolean.TYPE, Long.TYPE, Integer.TYPE, C12494c.f44658c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        if (strFromJson == null) {
            throw C12494c.m46802o("name", "name", reader);
        }
        if (listFromJson == null) {
            throw C12494c.m46802o("children", "children", reader);
        }
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle = clickableStackComponentStyleFromJson;
        ClickableStackComponent clickableStackComponentNewInstance = declaredConstructor.newInstance(strFromJson, listFromJson, jsonLogicBooleanFromJson, jsonLogicBooleanFromJson2, clickableStackComponentStyle, boolFromJson, lFromJson, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullExpressionValue(clickableStackComponentNewInstance, "newInstance(...)");
        return clickableStackComponentNewInstance;
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(@NotNull AbstractC11885t writer, @Nullable ClickableStackComponent value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo44374c();
        writer.mo44380n("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.mo44380n("children");
        this.listOfUiComponentAdapter.toJson(writer, value_.getChildren());
        writer.mo44380n("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.mo44380n("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getDisabled());
        writer.mo44380n("styles");
        this.nullableClickableStackComponentStyleAdapter.toJson(writer, value_.getStyles());
        writer.mo44380n("isActive");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getIsActive()));
        writer.mo44380n("lastValueUpdateTs");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getLastValueUpdateTs()));
        writer.mo44378g();
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
