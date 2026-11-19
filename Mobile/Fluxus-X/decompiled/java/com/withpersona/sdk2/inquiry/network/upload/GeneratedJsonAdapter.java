package com.withpersona.sdk2.inquiry.network.upload;

import com.github.luben.zstd.BuildConfig;
import hn.h;
import hn.m;
import hn.t;
import hn.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.q0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.upload.UploadResponseJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponseJsonAdapter;", "Lhn/h;", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;", "Lhn/w;", "moshi", "<init>", "(Lhn/w;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Lhn/m;", "reader", "fromJson", "(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;", "Lhn/t;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;)V", "Lhn/m$b;", "options", "Lhn/m$b;", "nullableStringAdapter", "Lhn/h;", BuildConfig.FLAVOR, "nullableBooleanAdapter", BuildConfig.FLAVOR, "nullableLongAdapter", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<UploadResponse> {

    @NotNull
    private final h<Boolean> nullableBooleanAdapter;

    @NotNull
    private final h<Long> nullableLongAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a("fileKey", "fileName", "fileEncrypted", "fileContentType", "fileByteSize");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, q0.d(), "fileKey");
        Intrinsics.checkNotNullExpressionValue(hVarF, "adapter(...)");
        this.nullableStringAdapter = hVarF;
        h<Boolean> hVarF2 = moshi.f(Boolean.class, q0.d(), "fileEncrypted");
        Intrinsics.checkNotNullExpressionValue(hVarF2, "adapter(...)");
        this.nullableBooleanAdapter = hVarF2;
        h<Long> hVarF3 = moshi.f(Long.class, q0.d(), "fileByteSize");
        Intrinsics.checkNotNullExpressionValue(hVarF3, "adapter(...)");
        this.nullableLongAdapter = hVarF3;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("UploadResponse");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // hn.h
    @NotNull
    public UploadResponse fromJson(@NotNull m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        String strFromJson = null;
        String strFromJson2 = null;
        Boolean boolFromJson = null;
        String strFromJson3 = null;
        Long lFromJson = null;
        while (reader.f()) {
            int I = reader.I(this.options);
            if (I == -1) {
                reader.O();
                reader.Q();
            } else if (I == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
            } else if (I == 1) {
                strFromJson2 = this.nullableStringAdapter.fromJson(reader);
            } else if (I == 2) {
                boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
            } else if (I == 3) {
                strFromJson3 = this.nullableStringAdapter.fromJson(reader);
            } else if (I == 4) {
                lFromJson = this.nullableLongAdapter.fromJson(reader);
            }
        }
        reader.d();
        return new UploadResponse(strFromJson, strFromJson2, boolFromJson, strFromJson3, lFromJson);
    }

    @Override // hn.h
    public void toJson(@NotNull t writer, @Nullable UploadResponse value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o("fileKey");
        this.nullableStringAdapter.toJson(writer, value_.getFileKey());
        writer.o("fileName");
        this.nullableStringAdapter.toJson(writer, value_.getFileName());
        writer.o("fileEncrypted");
        this.nullableBooleanAdapter.toJson(writer, value_.getFileEncrypted());
        writer.o("fileContentType");
        this.nullableStringAdapter.toJson(writer, value_.getFileContentType());
        writer.o("fileByteSize");
        this.nullableLongAdapter.toJson(writer, value_.getFileByteSize());
        writer.g();
    }
}
