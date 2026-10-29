package com.withpersona.sdk2.inquiry.network.dto;

import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
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

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep_Ui_ConfigJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Ui_ConfigJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;)V", "Lum/m$b;", "options", "Lum/m$b;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "nullableListOfUiComponentConfigAdapter", "Lum/h;", "", "nullableBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "nullableLocalizationsAdapter", "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "nullableListOfUiComponentErrorAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class GeneratedJsonAdapter extends AbstractC11873h<NextStep.C3793Ui.Config> {

    @Nullable
    private volatile Constructor<NextStep.C3793Ui.Config> constructorRef;

    @NotNull
    private final AbstractC11873h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final AbstractC11873h<List<UiComponentConfig>> nullableListOfUiComponentConfigAdapter;

    @NotNull
    private final AbstractC11873h<List<UiComponentError>> nullableListOfUiComponentErrorAdapter;

    @NotNull
    private final AbstractC11873h<NextStep.C3793Ui.Localizations> nullableLocalizationsAdapter;

    @NotNull
    private final AbstractC11873h<String> nullableStringAdapter;

    @NotNull
    private final AbstractC11878m.b options;

    public GeneratedJsonAdapter(@NotNull C11888w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC11878m.b bVarM44343a = AbstractC11878m.b.m44343a("components", "backStepEnabled", "cancelButtonEnabled", "terminal", "localizations", "serverComponentErrors", "webviewUrl");
        Intrinsics.checkNotNullExpressionValue(bVarM44343a, "of(...)");
        this.options = bVarM44343a;
        AbstractC11873h<List<UiComponentConfig>> abstractC11873hM44439f = moshi.m44439f(C11866a0.m44298j(List.class, UiComponentConfig.class), C7702q0.m31908d(), "components");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f, "adapter(...)");
        this.nullableListOfUiComponentConfigAdapter = abstractC11873hM44439f;
        AbstractC11873h<Boolean> abstractC11873hM44439f2 = moshi.m44439f(Boolean.class, C7702q0.m31908d(), "backStepEnabled");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f2, "adapter(...)");
        this.nullableBooleanAdapter = abstractC11873hM44439f2;
        AbstractC11873h<NextStep.C3793Ui.Localizations> abstractC11873hM44439f3 = moshi.m44439f(NextStep.C3793Ui.Localizations.class, C7702q0.m31908d(), "localizations");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f3, "adapter(...)");
        this.nullableLocalizationsAdapter = abstractC11873hM44439f3;
        AbstractC11873h<List<UiComponentError>> abstractC11873hM44439f4 = moshi.m44439f(C11866a0.m44298j(List.class, UiComponentError.class), C7702q0.m31908d(), "serverComponentErrors");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f4, "adapter(...)");
        this.nullableListOfUiComponentErrorAdapter = abstractC11873hM44439f4;
        AbstractC11873h<String> abstractC11873hM44439f5 = moshi.m44439f(String.class, C7702q0.m31908d(), "webviewUrl");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f5, "adapter(...)");
        this.nullableStringAdapter = abstractC11873hM44439f5;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("NextStep.Ui.Config");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public NextStep.C3793Ui.Config fromJson(@NotNull AbstractC11878m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.mo44325b();
        int i10 = -1;
        List<UiComponentConfig> listFromJson = null;
        Boolean boolFromJson = null;
        Boolean boolFromJson2 = null;
        Boolean boolFromJson3 = null;
        NextStep.C3793Ui.Localizations localizationsFromJson = null;
        List<UiComponentError> listFromJson2 = null;
        String strFromJson = null;
        while (reader.mo44329f()) {
            switch (reader.mo44316F(this.options)) {
                case -1:
                    reader.mo44320M();
                    reader.mo44321P();
                    break;
                case 0:
                    listFromJson = this.nullableListOfUiComponentConfigAdapter.fromJson(reader);
                    break;
                case 1:
                    boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    boolFromJson2 = this.nullableBooleanAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    boolFromJson3 = this.nullableBooleanAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    localizationsFromJson = this.nullableLocalizationsAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    listFromJson2 = this.nullableListOfUiComponentErrorAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
            }
        }
        reader.mo44327d();
        if (i10 == -127) {
            String str = strFromJson;
            List<UiComponentError> list = listFromJson2;
            NextStep.C3793Ui.Localizations localizations = localizationsFromJson;
            Boolean bool = boolFromJson3;
            return new NextStep.C3793Ui.Config(listFromJson, boolFromJson, boolFromJson2, bool, localizations, list, str);
        }
        String str2 = strFromJson;
        List<UiComponentError> list2 = listFromJson2;
        NextStep.C3793Ui.Localizations localizations2 = localizationsFromJson;
        Boolean bool2 = boolFromJson3;
        Boolean bool3 = boolFromJson2;
        Boolean bool4 = boolFromJson;
        List<UiComponentConfig> list3 = listFromJson;
        Constructor<NextStep.C3793Ui.Config> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.C3793Ui.Config.class.getDeclaredConstructor(List.class, Boolean.class, Boolean.class, Boolean.class, NextStep.C3793Ui.Localizations.class, List.class, String.class, Integer.TYPE, C12494c.f44658c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        NextStep.C3793Ui.Config configNewInstance = declaredConstructor.newInstance(list3, bool4, bool3, bool2, localizations2, list2, str2, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullExpressionValue(configNewInstance, "newInstance(...)");
        return configNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t writer, @Nullable NextStep.C3793Ui.Config value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo44374c();
        writer.mo44380n("components");
        this.nullableListOfUiComponentConfigAdapter.toJson(writer, value_.getComponents());
        writer.mo44380n("backStepEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getBackStepEnabled());
        writer.mo44380n("cancelButtonEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getCancelButtonEnabled());
        writer.mo44380n("terminal");
        this.nullableBooleanAdapter.toJson(writer, value_.getTerminal());
        writer.mo44380n("localizations");
        this.nullableLocalizationsAdapter.toJson(writer, value_.getLocalizations());
        writer.mo44380n("serverComponentErrors");
        this.nullableListOfUiComponentErrorAdapter.toJson(writer, value_.getServerComponentErrors());
        writer.mo44380n("webviewUrl");
        this.nullableStringAdapter.toJson(writer, value_.getWebviewUrl());
        writer.mo44378g();
    }
}
