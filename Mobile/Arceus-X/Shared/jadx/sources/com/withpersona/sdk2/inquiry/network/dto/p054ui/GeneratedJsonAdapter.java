package com.withpersona.sdk2.inquiry.network.dto.p054ui;

import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.C7702q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11888w;
import p522wm.C12494c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributesJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributesJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;)V", "Lum/m$b;", "options", "Lum/m$b;", "stringAdapter", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "nullableButtonTypeAdapter", "nullableStringAdapter", "", "nullableIntAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "nullableJsonLogicBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class GeneratedJsonAdapter extends AbstractC11873h<BasicButtonAttributes> {

    @Nullable
    private volatile Constructor<BasicButtonAttributes> constructorRef;

    @NotNull
    private final AbstractC11873h<Button.ButtonType> nullableButtonTypeAdapter;

    @NotNull
    private final AbstractC11873h<Integer> nullableIntAdapter;

    @NotNull
    private final AbstractC11873h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    @NotNull
    private final AbstractC11873h<String> nullableStringAdapter;

    @NotNull
    private final AbstractC11878m.b options;

    @NotNull
    private final AbstractC11873h<String> stringAdapter;

    public GeneratedJsonAdapter(@NotNull C11888w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC11878m.b bVarM44343a = AbstractC11878m.b.m44343a(Text.type, "buttonType", "autoSubmitCountdownText", "autoSubmitIntervalSeconds", "hidden", "disabled");
        Intrinsics.checkNotNullExpressionValue(bVarM44343a, "of(...)");
        this.options = bVarM44343a;
        AbstractC11873h<String> abstractC11873hM44439f = moshi.m44439f(String.class, C7702q0.m31908d(), Text.type);
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f, "adapter(...)");
        this.stringAdapter = abstractC11873hM44439f;
        AbstractC11873h<Button.ButtonType> abstractC11873hM44439f2 = moshi.m44439f(Button.ButtonType.class, C7702q0.m31908d(), "buttonType");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f2, "adapter(...)");
        this.nullableButtonTypeAdapter = abstractC11873hM44439f2;
        AbstractC11873h<String> abstractC11873hM44439f3 = moshi.m44439f(String.class, C7702q0.m31908d(), "autoSubmitCountdownText");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f3, "adapter(...)");
        this.nullableStringAdapter = abstractC11873hM44439f3;
        AbstractC11873h<Integer> abstractC11873hM44439f4 = moshi.m44439f(Integer.class, C7702q0.m31908d(), "autoSubmitIntervalSeconds");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f4, "adapter(...)");
        this.nullableIntAdapter = abstractC11873hM44439f4;
        AbstractC11873h<JsonLogicBoolean> abstractC11873hM44439f5 = moshi.m44439f(JsonLogicBoolean.class, C7702q0.m31908d(), "hidden");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f5, "adapter(...)");
        this.nullableJsonLogicBooleanAdapter = abstractC11873hM44439f5;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("BasicButtonAttributes");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public BasicButtonAttributes fromJson(@NotNull AbstractC11878m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.mo44325b();
        int i10 = -1;
        String strFromJson = null;
        Button.ButtonType buttonTypeFromJson = null;
        String strFromJson2 = null;
        Integer numFromJson = null;
        JsonLogicBoolean jsonLogicBooleanFromJson = null;
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
                        throw C12494c.m46811x(Text.type, Text.type, reader);
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
        reader.mo44327d();
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
            throw C12494c.m46802o(Text.type, Text.type, reader);
        }
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBooleanFromJson2;
        JsonLogicBoolean jsonLogicBoolean4 = jsonLogicBooleanFromJson;
        Integer num2 = numFromJson;
        String str3 = strFromJson2;
        Button.ButtonType buttonType2 = buttonTypeFromJson;
        String str4 = strFromJson;
        Constructor<BasicButtonAttributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = BasicButtonAttributes.class.getDeclaredConstructor(String.class, Button.ButtonType.class, String.class, Integer.class, JsonLogicBoolean.class, JsonLogicBoolean.class, Integer.TYPE, C12494c.f44658c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        if (str4 == null) {
            throw C12494c.m46802o(Text.type, Text.type, reader);
        }
        BasicButtonAttributes basicButtonAttributesNewInstance = declaredConstructor.newInstance(str4, buttonType2, str3, num2, jsonLogicBoolean4, jsonLogicBoolean3, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullExpressionValue(basicButtonAttributesNewInstance, "newInstance(...)");
        return basicButtonAttributesNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t writer, @Nullable BasicButtonAttributes value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo44374c();
        writer.mo44380n(Text.type);
        this.stringAdapter.toJson(writer, value_.getText());
        writer.mo44380n("buttonType");
        this.nullableButtonTypeAdapter.toJson(writer, value_.getButtonType());
        writer.mo44380n("autoSubmitCountdownText");
        this.nullableStringAdapter.toJson(writer, value_.getAutoSubmitCountdownText());
        writer.mo44380n("autoSubmitIntervalSeconds");
        this.nullableIntAdapter.toJson(writer, value_.getAutoSubmitIntervalSeconds());
        writer.mo44380n("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.mo44380n("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getDisabled());
        writer.mo44378g();
    }
}
