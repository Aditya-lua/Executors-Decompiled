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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigDataJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;)V", "Lum/m$b;", "options", "Lum/m$b;", "nullableStringAdapter", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/UiFramework;", "nullableUiFrameworkAdapter", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InquiryConfigDataJsonAdapter extends h<InquiryConfigData> {

    @Nullable
    private volatile Constructor<InquiryConfigData> constructorRef;

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final h<UiFramework> nullableUiFrameworkAdapter;

    @NotNull
    private final m.b options;

    public InquiryConfigDataJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b bVarA = m.b.a("template_id", "template_version", "environment", "environment_id", "organization_id", "ui_framework", "theme_set_id", "has_account_id", "has_fields", "has_inquiry_id", "has_one_time_link_code", "has_redirect_uri", "has_reference_id", "has_session_token", "has_theme");
        bVarA.getClass();
        this.options = bVarA;
        this.nullableStringAdapter = b.a(wVar, String.class, "templateId");
        this.nullableUiFrameworkAdapter = b.a(wVar, UiFramework.class, "uiFramework");
        this.nullableBooleanAdapter = b.a(wVar, Boolean.class, "hasAccountId");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(InquiryConfigData)", 39);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public InquiryConfigData fromJson(@NotNull m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        int i10;
        reader.getClass();
        reader.b();
        int i11 = -1;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        UiFramework uiFrameworkFromJson = null;
        String strFromJson6 = null;
        Boolean boolFromJson = null;
        Boolean boolFromJson2 = null;
        Boolean boolFromJson3 = null;
        Boolean boolFromJson4 = null;
        Boolean boolFromJson5 = null;
        Boolean boolFromJson6 = null;
        Boolean boolFromJson7 = null;
        Boolean boolFromJson8 = null;
        while (reader.f()) {
            switch (reader.F(this.options)) {
                case -1:
                    reader.M();
                    reader.P();
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
                    uiFrameworkFromJson = this.nullableUiFrameworkAdapter.fromJson(reader);
                    break;
                case 6:
                    i10 = -65;
                    strFromJson6 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    i10 = -129;
                    boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 8:
                    i10 = -257;
                    boolFromJson2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 9:
                    i10 = -513;
                    boolFromJson3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 10:
                    i10 = -1025;
                    boolFromJson4 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 11:
                    i10 = -2049;
                    boolFromJson5 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 12:
                    i10 = -4097;
                    boolFromJson6 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 13:
                    i10 = -8193;
                    boolFromJson7 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 14:
                    i10 = -16385;
                    boolFromJson8 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                default:
                    continue;
            }
            i11 &= i10;
        }
        reader.d();
        if (i11 == -32768) {
            Boolean bool = boolFromJson2;
            Boolean bool2 = boolFromJson;
            String str = strFromJson6;
            UiFramework uiFramework = uiFrameworkFromJson;
            String str2 = strFromJson5;
            String str3 = strFromJson4;
            return new InquiryConfigData(strFromJson, strFromJson2, strFromJson3, str3, str2, uiFramework, str, bool2, bool, boolFromJson3, boolFromJson4, boolFromJson5, boolFromJson6, boolFromJson7, boolFromJson8);
        }
        Boolean bool3 = boolFromJson2;
        Boolean bool4 = boolFromJson;
        String str4 = strFromJson6;
        UiFramework uiFramework2 = uiFrameworkFromJson;
        String str5 = strFromJson5;
        String str6 = strFromJson4;
        String str7 = strFromJson3;
        String str8 = strFromJson2;
        String str9 = strFromJson;
        Constructor<InquiryConfigData> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = InquiryConfigData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, UiFramework.class, String.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Integer.TYPE, c.f34445c);
            this.constructorRef = declaredConstructor;
            declaredConstructor.getClass();
        }
        InquiryConfigData inquiryConfigDataNewInstance = declaredConstructor.newInstance(str9, str8, str7, str6, str5, uiFramework2, str4, bool4, bool3, boolFromJson3, boolFromJson4, boolFromJson5, boolFromJson6, boolFromJson7, boolFromJson8, Integer.valueOf(i11), null);
        inquiryConfigDataNewInstance.getClass();
        return inquiryConfigDataNewInstance;
    }

    @Override // um.h
    public void toJson(@NotNull t writer, @Nullable InquiryConfigData value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("template_id");
        this.nullableStringAdapter.toJson(writer, value_.getTemplateId());
        writer.n("template_version");
        this.nullableStringAdapter.toJson(writer, value_.getTemplateVersion());
        writer.n("environment");
        this.nullableStringAdapter.toJson(writer, value_.getEnvironment());
        writer.n("environment_id");
        this.nullableStringAdapter.toJson(writer, value_.getEnvironmentId());
        writer.n("organization_id");
        this.nullableStringAdapter.toJson(writer, value_.getOrganizationId());
        writer.n("ui_framework");
        this.nullableUiFrameworkAdapter.toJson(writer, value_.getUiFramework());
        writer.n("theme_set_id");
        this.nullableStringAdapter.toJson(writer, value_.getThemeSetId());
        writer.n("has_account_id");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasAccountId());
        writer.n("has_fields");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasFields());
        writer.n("has_inquiry_id");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasInquiryId());
        writer.n("has_one_time_link_code");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasOneTimeLinkCode());
        writer.n("has_redirect_uri");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasRedirectUri());
        writer.n("has_reference_id");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasReferenceId());
        writer.n("has_session_token");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasSessionToken());
        writer.n("has_theme");
        this.nullableBooleanAdapter.toJson(writer, value_.getHasTheme());
        writer.g();
    }
}
