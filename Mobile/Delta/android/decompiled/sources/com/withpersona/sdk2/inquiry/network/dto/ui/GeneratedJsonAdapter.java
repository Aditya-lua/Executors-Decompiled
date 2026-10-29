package com.withpersona.sdk2.inquiry.network.dto.ui;

import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.h;
import um.m;
import um.t;
import um.w;
import wm.c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributesJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributesJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;)V", "Lum/m$b;", "options", "Lum/m$b;", "stringAdapter", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "nullableButtonTypeAdapter", "nullableStringAdapter", "", "nullableIntAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "nullableJsonLogicBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<BasicButtonAttributes> {

    @Nullable
    private volatile Constructor<BasicButtonAttributes> constructorRef;

    @NotNull
    private final h<Button.ButtonType> nullableButtonTypeAdapter;

    @NotNull
    private final h<Integer> nullableIntAdapter;

    @NotNull
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options;

    @NotNull
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a(Text.type, "buttonType", "autoSubmitCountdownText", "autoSubmitIntervalSeconds", "hidden", "disabled");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, q0.d(), Text.type);
        Intrinsics.checkNotNullExpressionValue(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<Button.ButtonType> hVarF2 = moshi.f(Button.ButtonType.class, q0.d(), "buttonType");
        Intrinsics.checkNotNullExpressionValue(hVarF2, "adapter(...)");
        this.nullableButtonTypeAdapter = hVarF2;
        h<String> hVarF3 = moshi.f(String.class, q0.d(), "autoSubmitCountdownText");
        Intrinsics.checkNotNullExpressionValue(hVarF3, "adapter(...)");
        this.nullableStringAdapter = hVarF3;
        h<Integer> hVarF4 = moshi.f(Integer.class, q0.d(), "autoSubmitIntervalSeconds");
        Intrinsics.checkNotNullExpressionValue(hVarF4, "adapter(...)");
        this.nullableIntAdapter = hVarF4;
        h<JsonLogicBoolean> hVarF5 = moshi.f(JsonLogicBoolean.class, q0.d(), "hidden");
        Intrinsics.checkNotNullExpressionValue(hVarF5, "adapter(...)");
        this.nullableJsonLogicBooleanAdapter = hVarF5;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("BasicButtonAttributes");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public BasicButtonAttributes fromJson(@NotNull m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        int i10 = -1;
        String strFromJson = null;
        Button.ButtonType buttonTypeFromJson = null;
        String strFromJson2 = null;
        Integer numFromJson = null;
        JsonLogicBoolean jsonLogicBooleanFromJson = null;
        JsonLogicBoolean jsonLogicBooleanFromJson2 = null;
        while (reader.f()) {
            switch (reader.F(this.options)) {
                case -1:
                    reader.M();
                    reader.P();
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw c.x(Text.type, Text.type, reader);
                    }
                    break;
                    break;
                case 1:
                    buttonTypeFromJson = this.nullableButtonTypeAdapter.fromJson(reader);
                    break;
                case 2:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    numFromJson = this.nullableIntAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    jsonLogicBooleanFromJson = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    jsonLogicBooleanFromJson2 = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
            }
        }
        reader.d();
        if (i10 == -61) {
            JsonLogicBoolean jsonLogicBoolean = jsonLogicBooleanFromJson2;
            JsonLogicBoolean jsonLogicBoolean2 = jsonLogicBooleanFromJson;
            Integer num = numFromJson;
            String str = strFromJson2;
            Button.ButtonType buttonType = buttonTypeFromJson;
            String str2 = strFromJson;
            if (str2 != null) {
                return new BasicButtonAttributes(str2, buttonType, str, num, jsonLogicBoolean2, jsonLogicBoolean);
            }
            throw c.o(Text.type, Text.type, reader);
        }
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBooleanFromJson2;
        JsonLogicBoolean jsonLogicBoolean4 = jsonLogicBooleanFromJson;
        Integer num2 = numFromJson;
        String str3 = strFromJson2;
        Button.ButtonType buttonType2 = buttonTypeFromJson;
        String str4 = strFromJson;
        Constructor<BasicButtonAttributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = BasicButtonAttributes.class.getDeclaredConstructor(String.class, Button.ButtonType.class, String.class, Integer.class, JsonLogicBoolean.class, JsonLogicBoolean.class, Integer.TYPE, c.f34445c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        if (str4 == null) {
            throw c.o(Text.type, Text.type, reader);
        }
        BasicButtonAttributes basicButtonAttributesNewInstance = declaredConstructor.newInstance(str4, buttonType2, str3, num2, jsonLogicBoolean4, jsonLogicBoolean3, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullExpressionValue(basicButtonAttributesNewInstance, "newInstance(...)");
        return basicButtonAttributesNewInstance;
    }

    @Override // um.h
    public void toJson(@NotNull t writer, @Nullable BasicButtonAttributes value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n(Text.type);
        this.stringAdapter.toJson(writer, value_.getText());
        writer.n("buttonType");
        this.nullableButtonTypeAdapter.toJson(writer, value_.getButtonType());
        writer.n("autoSubmitCountdownText");
        this.nullableStringAdapter.toJson(writer, value_.getAutoSubmitCountdownText());
        writer.n("autoSubmitIntervalSeconds");
        this.nullableIntAdapter.toJson(writer, value_.getAutoSubmitIntervalSeconds());
        writer.n("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.n("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getDisabled());
        writer.g();
    }
}
