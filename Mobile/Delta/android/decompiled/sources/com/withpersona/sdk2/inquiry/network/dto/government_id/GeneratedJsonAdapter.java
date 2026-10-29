package com.withpersona.sdk2.inquiry.network.dto.government_id;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.a0;
import um.h;
import um.m;
import um.t;
import um.w;
import wm.c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.government_id.IdJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/IdJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;)V", "Lum/m$b;", "options", "Lum/m$b;", "stringAdapter", "Lum/h;", "", "listOfStringAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "nullableIdIconAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "nullableListOfCapturePageConfigAdapter", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<Id> {

    @NotNull
    private final h<List<String>> listOfStringAdapter;

    @NotNull
    private final h<Id.IdIcon> nullableIdIconAdapter;

    @NotNull
    private final h<List<CapturePageConfig>> nullableListOfCapturePageConfigAdapter;

    @NotNull
    private final m.b options;

    @NotNull
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a("class", "requiresSides", "icon", "capturePageConfigs");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, q0.d(), "class");
        Intrinsics.checkNotNullExpressionValue(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<List<String>> hVarF2 = moshi.f(a0.j(List.class, String.class), q0.d(), "requiresSides");
        Intrinsics.checkNotNullExpressionValue(hVarF2, "adapter(...)");
        this.listOfStringAdapter = hVarF2;
        h<Id.IdIcon> hVarF3 = moshi.f(Id.IdIcon.class, q0.d(), "icon");
        Intrinsics.checkNotNullExpressionValue(hVarF3, "adapter(...)");
        this.nullableIdIconAdapter = hVarF3;
        h<List<CapturePageConfig>> hVarF4 = moshi.f(a0.j(List.class, CapturePageConfig.class), q0.d(), "capturePageConfigs");
        Intrinsics.checkNotNullExpressionValue(hVarF4, "adapter(...)");
        this.nullableListOfCapturePageConfigAdapter = hVarF4;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Id");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public Id fromJson(@NotNull m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        String strFromJson = null;
        List<String> listFromJson = null;
        Id.IdIcon idIconFromJson = null;
        List<CapturePageConfig> listFromJson2 = null;
        while (reader.f()) {
            int iF = reader.F(this.options);
            if (iF == -1) {
                reader.M();
                reader.P();
            } else if (iF == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw c.x("class_", "class", reader);
                }
            } else if (iF == 1) {
                listFromJson = this.listOfStringAdapter.fromJson(reader);
                if (listFromJson == null) {
                    throw c.x("requiresSides", "requiresSides", reader);
                }
            } else if (iF == 2) {
                idIconFromJson = this.nullableIdIconAdapter.fromJson(reader);
            } else if (iF == 3) {
                listFromJson2 = this.nullableListOfCapturePageConfigAdapter.fromJson(reader);
            }
        }
        reader.d();
        if (strFromJson == null) {
            throw c.o("class_", "class", reader);
        }
        if (listFromJson != null) {
            return new Id(strFromJson, listFromJson, idIconFromJson, listFromJson2);
        }
        throw c.o("requiresSides", "requiresSides", reader);
    }

    @Override // um.h
    public void toJson(@NotNull t writer, @Nullable Id value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("class");
        this.stringAdapter.toJson(writer, value_.getClass());
        writer.n("requiresSides");
        this.listOfStringAdapter.toJson(writer, value_.getRequiresSides());
        writer.n("icon");
        this.nullableIdIconAdapter.toJson(writer, value_.getIcon());
        writer.n("capturePageConfigs");
        this.nullableListOfCapturePageConfigAdapter.toJson(writer, value_.getCapturePageConfigs());
        writer.g();
    }
}
