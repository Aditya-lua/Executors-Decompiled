package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import hn.a0;
import hn.h;
import hn.m;
import hn.t;
import hn.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import jn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.q0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.components.HorizontalStack_AttributesJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack_AttributesJsonAdapter;", "Lhn/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$Attributes;", "Lhn/w;", "moshi", "<init>", "(Lhn/w;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Lhn/m;", "reader", "fromJson", "(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$Attributes;", "Lhn/t;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/HorizontalStack$Attributes;)V", "Lhn/m$b;", "options", "Lhn/m$b;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "nullableListOfUiComponentConfigAdapter", "Lhn/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "nullableJsonLogicBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<HorizontalStack.Attributes> {

    @Nullable
    private volatile Constructor<HorizontalStack.Attributes> constructorRef;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<List<UiComponentConfig>> nullableListOfUiComponentConfigAdapter;

    @NotNull
    private final m.b options;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a("children", "hidden");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.options = bVarA;
        h<List<UiComponentConfig>> hVarF = moshi.f(a0.j(List.class, UiComponentConfig.class), q0.d(), "children");
        Intrinsics.checkNotNullExpressionValue(hVarF, "adapter(...)");
        this.nullableListOfUiComponentConfigAdapter = hVarF;
        h<JsonLogicBoolean> hVarF2 = moshi.f(JsonLogicBoolean.class, q0.d(), "hidden");
        Intrinsics.checkNotNullExpressionValue(hVarF2, "adapter(...)");
        this.nullableJsonLogicBooleanAdapter = hVarF2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("HorizontalStack.Attributes");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // hn.h
    @NotNull
    public HorizontalStack.Attributes fromJson(@NotNull m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        List<UiComponentConfig> listFromJson = null;
        JsonLogicBoolean jsonLogicBooleanFromJson = null;
        int i10 = -1;
        while (reader.f()) {
            int I = reader.I(this.options);
            if (I == -1) {
                reader.O();
                reader.Q();
            } else if (I == 0) {
                listFromJson = this.nullableListOfUiComponentConfigAdapter.fromJson(reader);
            } else if (I == 1) {
                jsonLogicBooleanFromJson = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                i10 = -3;
            }
        }
        reader.d();
        if (i10 == -3) {
            return new HorizontalStack.Attributes(listFromJson, jsonLogicBooleanFromJson);
        }
        Constructor<HorizontalStack.Attributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = HorizontalStack.Attributes.class.getDeclaredConstructor(List.class, JsonLogicBoolean.class, Integer.TYPE, c.f20816c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        HorizontalStack.Attributes attributesNewInstance = declaredConstructor.newInstance(listFromJson, jsonLogicBooleanFromJson, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullExpressionValue(attributesNewInstance, "newInstance(...)");
        return attributesNewInstance;
    }

    @Override // hn.h
    public void toJson(@NotNull t writer, @Nullable HorizontalStack.Attributes value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o("children");
        this.nullableListOfUiComponentConfigAdapter.toJson(writer, value_.getChildren());
        writer.o("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.g();
    }
}
