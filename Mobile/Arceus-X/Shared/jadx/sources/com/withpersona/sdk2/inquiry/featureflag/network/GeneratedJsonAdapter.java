package com.withpersona.sdk2.inquiry.featureflag.network;

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

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagResponseJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponseJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "a", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "Lum/t;", "writer", "value_", "", "b", "(Lum/t;Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;)V", "Lum/m$b;", "Lum/m$b;", "options", "", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse$FeatureFlagDataResponse;", "Lum/h;", "listOfFeatureFlagDataResponseAdapter", "feature-flag_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class GeneratedJsonAdapter extends AbstractC11873h<FeatureFlagResponse> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC11878m.b options;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC11873h<List<FeatureFlagResponse.FeatureFlagDataResponse>> listOfFeatureFlagDataResponseAdapter;

    public GeneratedJsonAdapter(@NotNull C11888w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC11878m.b bVarM44343a = AbstractC11878m.b.m44343a("data");
        Intrinsics.checkNotNullExpressionValue(bVarM44343a, "of(...)");
        this.options = bVarM44343a;
        AbstractC11873h<List<FeatureFlagResponse.FeatureFlagDataResponse>> abstractC11873hM44439f = moshi.m44439f(C11866a0.m44298j(List.class, FeatureFlagResponse.FeatureFlagDataResponse.class), C7702q0.m31908d(), "data");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f, "adapter(...)");
        this.listOfFeatureFlagDataResponseAdapter = abstractC11873hM44439f;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    @Override // p471um.AbstractC11873h
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FeatureFlagResponse fromJson(@NotNull AbstractC11878m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.mo44325b();
        List<FeatureFlagResponse.FeatureFlagDataResponse> listFromJson = null;
        while (reader.mo44329f()) {
            int iMo44316F = reader.mo44316F(this.options);
            if (iMo44316F == -1) {
                reader.mo44320M();
                reader.mo44321P();
            } else if (iMo44316F == 0 && (listFromJson = this.listOfFeatureFlagDataResponseAdapter.fromJson(reader)) == null) {
                throw C12494c.m46811x("data_", "data", reader);
            }
        }
        reader.mo44327d();
        if (listFromJson != null) {
            return new FeatureFlagResponse(listFromJson);
        }
        throw C12494c.m46802o("data_", "data", reader);
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(@NotNull AbstractC11885t writer, @Nullable FeatureFlagResponse value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo44374c();
        writer.mo44380n("data");
        this.listOfFeatureFlagDataResponseAdapter.toJson(writer, value_.m16913a());
        writer.mo44378g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("FeatureFlagResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
