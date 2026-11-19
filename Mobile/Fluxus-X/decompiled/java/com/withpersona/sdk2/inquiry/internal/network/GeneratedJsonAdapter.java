package com.withpersona.sdk2.inquiry.internal.network;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionData;
import hn.m;
import hn.t;
import hn.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.q0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResponseJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponseJsonAdapter;", "Lhn/h;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", "Lhn/w;", "moshi", "<init>", "(Lhn/w;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Lhn/m;", "reader", "a", "(Lhn/m;)Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;", "Lhn/t;", "writer", "value_", BuildConfig.FLAVOR, "b", "(Lhn/t;Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse;)V", "Lhn/m$b;", "Lhn/m$b;", "options", "Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;", "Lhn/h;", "inquirySessionDataAdapter", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Meta;", "c", "metaAdapter", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GeneratedJsonAdapter extends hn.h<CreateInquirySessionResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m.b options;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final hn.h<InquirySessionData> inquirySessionDataAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hn.h<CreateInquirySessionResponse.Meta> metaAdapter;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a("data", "meta");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.options = bVarA;
        hn.h<InquirySessionData> hVarF = moshi.f(InquirySessionData.class, q0.d(), "data");
        Intrinsics.checkNotNullExpressionValue(hVarF, "adapter(...)");
        this.inquirySessionDataAdapter = hVarF;
        hn.h<CreateInquirySessionResponse.Meta> hVarF2 = moshi.f(CreateInquirySessionResponse.Meta.class, q0.d(), "meta");
        Intrinsics.checkNotNullExpressionValue(hVarF2, "adapter(...)");
        this.metaAdapter = hVarF2;
    }

    @Override // hn.h
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CreateInquirySessionResponse fromJson(@NotNull m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        InquirySessionData inquirySessionDataFromJson = null;
        CreateInquirySessionResponse.Meta metaFromJson = null;
        while (reader.f()) {
            int I = reader.I(this.options);
            if (I == -1) {
                reader.O();
                reader.Q();
            } else if (I == 0) {
                inquirySessionDataFromJson = this.inquirySessionDataAdapter.fromJson(reader);
                if (inquirySessionDataFromJson == null) {
                    throw jn.c.x("data_", "data", reader);
                }
            } else if (I == 1 && (metaFromJson = this.metaAdapter.fromJson(reader)) == null) {
                throw jn.c.x("meta", "meta", reader);
            }
        }
        reader.d();
        if (inquirySessionDataFromJson == null) {
            throw jn.c.o("data_", "data", reader);
        }
        if (metaFromJson != null) {
            return new CreateInquirySessionResponse(inquirySessionDataFromJson, metaFromJson);
        }
        throw jn.c.o("meta", "meta", reader);
    }

    @Override // hn.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(@NotNull t writer, @Nullable CreateInquirySessionResponse value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o("data");
        this.inquirySessionDataAdapter.toJson(writer, value_.getData());
        writer.o("meta");
        this.metaAdapter.toJson(writer, value_.getMeta());
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CreateInquirySessionResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
