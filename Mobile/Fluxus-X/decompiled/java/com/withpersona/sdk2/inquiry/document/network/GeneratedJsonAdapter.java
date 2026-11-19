package com.withpersona.sdk2.inquiry.document.network;

import com.github.luben.zstd.BuildConfig;
import hn.a0;
import hn.m;
import hn.t;
import hn.w;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.q0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.CreateDocumentResponseJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponseJsonAdapter;", "Lhn/h;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "Lhn/w;", "moshi", "<init>", "(Lhn/w;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Lhn/m;", "reader", "a", "(Lhn/m;)Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;", "Lhn/t;", "writer", "value_", BuildConfig.FLAVOR, "b", "(Lhn/t;Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;)V", "Lhn/m$b;", "Lhn/m$b;", "options", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse$Data;", "Lhn/h;", "dataAdapter", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "c", "nullableListOfDocumentFileDataAdapter", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GeneratedJsonAdapter extends hn.h<CreateDocumentResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m.b options;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final hn.h<CreateDocumentResponse.Data> dataAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hn.h<List<DocumentFileData>> nullableListOfDocumentFileDataAdapter;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a("data", "included");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.options = bVarA;
        hn.h<CreateDocumentResponse.Data> hVarF = moshi.f(CreateDocumentResponse.Data.class, q0.d(), "data");
        Intrinsics.checkNotNullExpressionValue(hVarF, "adapter(...)");
        this.dataAdapter = hVarF;
        hn.h<List<DocumentFileData>> hVarF2 = moshi.f(a0.j(List.class, DocumentFileData.class), q0.d(), "included");
        Intrinsics.checkNotNullExpressionValue(hVarF2, "adapter(...)");
        this.nullableListOfDocumentFileDataAdapter = hVarF2;
    }

    @Override // hn.h
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CreateDocumentResponse fromJson(@NotNull m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        CreateDocumentResponse.Data dataFromJson = null;
        List<DocumentFileData> listFromJson = null;
        while (reader.f()) {
            int I = reader.I(this.options);
            if (I == -1) {
                reader.O();
                reader.Q();
            } else if (I == 0) {
                dataFromJson = this.dataAdapter.fromJson(reader);
                if (dataFromJson == null) {
                    throw jn.c.x("data_", "data", reader);
                }
            } else if (I == 1) {
                listFromJson = this.nullableListOfDocumentFileDataAdapter.fromJson(reader);
            }
        }
        reader.d();
        if (dataFromJson != null) {
            return new CreateDocumentResponse(dataFromJson, listFromJson);
        }
        throw jn.c.o("data_", "data", reader);
    }

    @Override // hn.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(@NotNull t writer, @Nullable CreateDocumentResponse value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o("data");
        this.dataAdapter.toJson(writer, value_.getData());
        writer.o("included");
        this.nullableListOfDocumentFileDataAdapter.toJson(writer, value_.b());
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CreateDocumentResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
