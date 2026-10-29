package com.withpersona.sdk2.inquiry.network.dto.selfie;

import kotlin.Metadata;
import kotlin.collections.C7702q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11888w;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfigJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfigJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;)V", "Lum/m$b;", "options", "Lum/m$b;", "nullableStringAdapter", "Lum/h;", "", "nullableBooleanAdapter", "", "nullableLongAdapter", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class GeneratedJsonAdapter extends AbstractC11873h<PoseConfig> {

    @NotNull
    private final AbstractC11873h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final AbstractC11873h<Long> nullableLongAdapter;

    @NotNull
    private final AbstractC11873h<String> nullableStringAdapter;

    @NotNull
    private final AbstractC11878m.b options;

    public GeneratedJsonAdapter(@NotNull C11888w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        AbstractC11878m.b bVarM44343a = AbstractC11878m.b.m44343a("pose", "allowReview", "manualCaptureEnabled", "manualCaptureDelayMs", "autoCaptureEnabled");
        Intrinsics.checkNotNullExpressionValue(bVarM44343a, "of(...)");
        this.options = bVarM44343a;
        AbstractC11873h<String> abstractC11873hM44439f = moshi.m44439f(String.class, C7702q0.m31908d(), "pose");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f, "adapter(...)");
        this.nullableStringAdapter = abstractC11873hM44439f;
        AbstractC11873h<Boolean> abstractC11873hM44439f2 = moshi.m44439f(Boolean.class, C7702q0.m31908d(), "allowReview");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f2, "adapter(...)");
        this.nullableBooleanAdapter = abstractC11873hM44439f2;
        AbstractC11873h<Long> abstractC11873hM44439f3 = moshi.m44439f(Long.class, C7702q0.m31908d(), "manualCaptureDelayMs");
        Intrinsics.checkNotNullExpressionValue(abstractC11873hM44439f3, "adapter(...)");
        this.nullableLongAdapter = abstractC11873hM44439f3;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("PoseConfig");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public PoseConfig fromJson(@NotNull AbstractC11878m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.mo44325b();
        String strFromJson = null;
        Boolean boolFromJson = null;
        Boolean boolFromJson2 = null;
        Long lFromJson = null;
        Boolean boolFromJson3 = null;
        while (reader.mo44329f()) {
            int iMo44316F = reader.mo44316F(this.options);
            if (iMo44316F == -1) {
                reader.mo44320M();
                reader.mo44321P();
            } else if (iMo44316F == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
            } else if (iMo44316F == 1) {
                boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
            } else if (iMo44316F == 2) {
                boolFromJson2 = this.nullableBooleanAdapter.fromJson(reader);
            } else if (iMo44316F == 3) {
                lFromJson = this.nullableLongAdapter.fromJson(reader);
            } else if (iMo44316F == 4) {
                boolFromJson3 = this.nullableBooleanAdapter.fromJson(reader);
            }
        }
        reader.mo44327d();
        return new PoseConfig(strFromJson, boolFromJson, boolFromJson2, lFromJson, boolFromJson3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t writer, @Nullable PoseConfig value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo44374c();
        writer.mo44380n("pose");
        this.nullableStringAdapter.toJson(writer, value_.getPose());
        writer.mo44380n("allowReview");
        this.nullableBooleanAdapter.toJson(writer, value_.getAllowReview());
        writer.mo44380n("manualCaptureEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getManualCaptureEnabled());
        writer.mo44380n("manualCaptureDelayMs");
        this.nullableLongAdapter.toJson(writer, value_.getManualCaptureDelayMs());
        writer.mo44380n("autoCaptureEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getAutoCaptureEnabled());
        writer.mo44378g();
    }
}
