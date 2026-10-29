package com.withpersona.sdk2.inquiry.selfie.network;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import kotlin.Metadata;
import kotlin.collections.C7702q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11888w;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.network.SelfiePoseStateResponse_SelfiePoseStateJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018¨\u0006\u001f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse_SelfiePoseStateJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse$SelfiePoseState;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "a", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse$SelfiePoseState;", "Lum/t;", "writer", "value_", "", "b", "(Lum/t;Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse$SelfiePoseState;)V", "Lum/m$b;", "Lum/m$b;", "options", "", "Lum/h;", "nullableIntAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "c", "nullableSelfiePoseAdapter", "d", "nullableStringAdapter", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class GeneratedJsonAdapter extends AbstractC11873h<SelfiePoseStateResponse.SelfiePoseState> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC11878m.b options;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC11873h<Integer> nullableIntAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC11873h<NextStep.Selfie.SelfiePose> nullableSelfiePoseAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AbstractC11873h<String> nullableStringAdapter;

    public GeneratedJsonAdapter(@NotNull C11888w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC11878m.b bVarM44343a = AbstractC11878m.b.m44343a("index", "pose", "token");
        Intrinsics.checkNotNullExpressionValue(bVarM44343a, "of(...)");
        this.options = bVarM44343a;
        AbstractC11873h<Integer> abstractC11873hM44439f = moshi.m44439f(Integer.class, C7702q0.m31908d(), "index");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f, "adapter(...)");
        this.nullableIntAdapter = abstractC11873hM44439f;
        AbstractC11873h<NextStep.Selfie.SelfiePose> abstractC11873hM44439f2 = moshi.m44439f(NextStep.Selfie.SelfiePose.class, C7702q0.m31908d(), "pose");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f2, "adapter(...)");
        this.nullableSelfiePoseAdapter = abstractC11873hM44439f2;
        AbstractC11873h<String> abstractC11873hM44439f3 = moshi.m44439f(String.class, C7702q0.m31908d(), "token");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f3, "adapter(...)");
        this.nullableStringAdapter = abstractC11873hM44439f3;
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    @Override // p471um.AbstractC11873h
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SelfiePoseStateResponse.SelfiePoseState fromJson(@NotNull AbstractC11878m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.mo44325b();
        Integer numFromJson = null;
        NextStep.Selfie.SelfiePose selfiePoseFromJson = null;
        String strFromJson = null;
        while (reader.mo44329f()) {
            int iMo44316F = reader.mo44316F(this.options);
            if (iMo44316F == -1) {
                reader.mo44320M();
                reader.mo44321P();
            } else if (iMo44316F == 0) {
                numFromJson = this.nullableIntAdapter.fromJson(reader);
            } else if (iMo44316F == 1) {
                selfiePoseFromJson = this.nullableSelfiePoseAdapter.fromJson(reader);
            } else if (iMo44316F == 2) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.mo44327d();
        return new SelfiePoseStateResponse.SelfiePoseState(numFromJson, selfiePoseFromJson, strFromJson);
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(@NotNull AbstractC11885t writer, @Nullable SelfiePoseStateResponse.SelfiePoseState value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo44374c();
        writer.mo44380n("index");
        this.nullableIntAdapter.toJson(writer, value_.getIndex());
        writer.mo44380n("pose");
        this.nullableSelfiePoseAdapter.toJson(writer, value_.getPose());
        writer.mo44380n("token");
        this.nullableStringAdapter.toJson(writer, value_.getToken());
        writer.mo44378g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(61);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SelfiePoseStateResponse.SelfiePoseState");
        sb2.append(')');
        return sb2.toString();
    }
}
