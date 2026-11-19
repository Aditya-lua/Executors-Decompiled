package com.withpersona.sdk2.inquiry.internal;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.q0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.ErrorLogJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/ErrorLogJsonAdapter;", "Lhn/h;", "Lcom/withpersona/sdk2/inquiry/internal/ErrorLog;", "Lhn/w;", "moshi", "<init>", "(Lhn/w;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Lhn/m;", "reader", "a", "(Lhn/m;)Lcom/withpersona/sdk2/inquiry/internal/ErrorLog;", "Lhn/t;", "writer", "value_", BuildConfig.FLAVOR, "b", "(Lhn/t;Lcom/withpersona/sdk2/inquiry/internal/ErrorLog;)V", "Lhn/m$b;", "Lhn/m$b;", "options", "Lhn/h;", "nullableStringAdapter", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GeneratedJsonAdapter extends hn.h<ErrorLog> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hn.m.b options;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final hn.h<String> nullableStringAdapter;

    public GeneratedJsonAdapter(@NotNull hn.w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        hn.m.b bVarA = hn.m.b.a("info");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.options = bVarA;
        hn.h<String> hVarF = moshi.f(String.class, q0.d(), "info");
        Intrinsics.checkNotNullExpressionValue(hVarF, "adapter(...)");
        this.nullableStringAdapter = hVarF;
    }

    @Override // hn.h
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ErrorLog fromJson(@NotNull hn.m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        String strFromJson = null;
        while (reader.f()) {
            int I = reader.I(this.options);
            if (I == -1) {
                reader.O();
                reader.Q();
            } else if (I == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.d();
        return new ErrorLog(strFromJson);
    }

    @Override // hn.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(@NotNull hn.t writer, @Nullable ErrorLog value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o("info");
        this.nullableStringAdapter.toJson(writer, value_.getInfo());
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ErrorLog");
        sb2.append(')');
        return sb2.toString();
    }
}
