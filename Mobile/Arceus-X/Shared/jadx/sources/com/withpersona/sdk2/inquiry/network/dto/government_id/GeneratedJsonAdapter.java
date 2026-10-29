package com.withpersona.sdk2.inquiry.network.dto.government_id;

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

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.government_id.IdJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/IdJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;)V", "Lum/m$b;", "options", "Lum/m$b;", "stringAdapter", "Lum/h;", "", "listOfStringAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "nullableIdIconAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "nullableListOfCapturePageConfigAdapter", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class GeneratedJsonAdapter extends AbstractC11873h<Id> {

    @NotNull
    private final AbstractC11873h<List<String>> listOfStringAdapter;

    @NotNull
    private final AbstractC11873h<Id.IdIcon> nullableIdIconAdapter;

    @NotNull
    private final AbstractC11873h<List<CapturePageConfig>> nullableListOfCapturePageConfigAdapter;

    @NotNull
    private final AbstractC11878m.b options;

    @NotNull
    private final AbstractC11873h<String> stringAdapter;

    public GeneratedJsonAdapter(@NotNull C11888w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC11878m.b bVarM44343a = AbstractC11878m.b.m44343a("class", "requiresSides", "icon", "capturePageConfigs");
        Intrinsics.checkNotNullExpressionValue(bVarM44343a, "of(...)");
        this.options = bVarM44343a;
        AbstractC11873h<String> abstractC11873hM44439f = moshi.m44439f(String.class, C7702q0.m31908d(), "class");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f, "adapter(...)");
        this.stringAdapter = abstractC11873hM44439f;
        AbstractC11873h<List<String>> abstractC11873hM44439f2 = moshi.m44439f(C11866a0.m44298j(List.class, String.class), C7702q0.m31908d(), "requiresSides");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f2, "adapter(...)");
        this.listOfStringAdapter = abstractC11873hM44439f2;
        AbstractC11873h<Id.IdIcon> abstractC11873hM44439f3 = moshi.m44439f(Id.IdIcon.class, C7702q0.m31908d(), "icon");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f3, "adapter(...)");
        this.nullableIdIconAdapter = abstractC11873hM44439f3;
        AbstractC11873h<List<CapturePageConfig>> abstractC11873hM44439f4 = moshi.m44439f(C11866a0.m44298j(List.class, CapturePageConfig.class), C7702q0.m31908d(), "capturePageConfigs");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f4, "adapter(...)");
        this.nullableListOfCapturePageConfigAdapter = abstractC11873hM44439f4;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Id");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public Id fromJson(@NotNull AbstractC11878m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.mo44325b();
        String strFromJson = null;
        List<String> listFromJson = null;
        Id.IdIcon idIconFromJson = null;
        List<CapturePageConfig> listFromJson2 = null;
        while (reader.mo44329f()) {
            int iMo44316F = reader.mo44316F(this.options);
            if (iMo44316F == -1) {
                reader.mo44320M();
                reader.mo44321P();
            } else if (iMo44316F == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw C12494c.m46811x("class_", "class", reader);
                }
            } else if (iMo44316F == 1) {
                listFromJson = this.listOfStringAdapter.fromJson(reader);
                if (listFromJson == null) {
                    throw C12494c.m46811x("requiresSides", "requiresSides", reader);
                }
            } else if (iMo44316F == 2) {
                idIconFromJson = this.nullableIdIconAdapter.fromJson(reader);
            } else if (iMo44316F == 3) {
                listFromJson2 = this.nullableListOfCapturePageConfigAdapter.fromJson(reader);
            }
        }
        reader.mo44327d();
        if (strFromJson == null) {
            throw C12494c.m46802o("class_", "class", reader);
        }
        if (listFromJson != null) {
            return new Id(strFromJson, listFromJson, idIconFromJson, listFromJson2);
        }
        throw C12494c.m46802o("requiresSides", "requiresSides", reader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t writer, @Nullable Id value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo44374c();
        writer.mo44380n("class");
        this.stringAdapter.toJson(writer, value_.getClass());
        writer.mo44380n("requiresSides");
        this.listOfStringAdapter.toJson(writer, value_.getRequiresSides());
        writer.mo44380n("icon");
        this.nullableIdIconAdapter.toJson(writer, value_.getIcon());
        writer.mo44380n("capturePageConfigs");
        this.nullableListOfCapturePageConfigAdapter.toJson(writer, value_.getCapturePageConfigs());
        writer.mo44378g();
    }
}
