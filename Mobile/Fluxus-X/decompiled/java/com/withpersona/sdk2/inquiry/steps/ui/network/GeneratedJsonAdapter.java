package com.withpersona.sdk2.inquiry.steps.ui.network;

import com.github.luben.zstd.BuildConfig;
import hn.a0;
import hn.h;
import hn.m;
import hn.t;
import hn.w;
import java.util.List;
import jn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.q0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.network.MetaJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/network/MetaJsonAdapter;", "Lhn/h;", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Meta;", "Lhn/w;", "moshi", "<init>", "(Lhn/w;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Lhn/m;", "reader", "a", "(Lhn/m;)Lcom/withpersona/sdk2/inquiry/steps/ui/network/Meta;", "Lhn/t;", "writer", "value_", BuildConfig.FLAVOR, "b", "(Lhn/t;Lcom/withpersona/sdk2/inquiry/steps/ui/network/Meta;)V", "Lhn/m$b;", "Lhn/m$b;", "options", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;", "Lhn/h;", "listOfSuggestionAdapter", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<Meta> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m.b options;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h<List<Suggestion>> listOfSuggestionAdapter;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a("predictions");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.options = bVarA;
        h<List<Suggestion>> hVarF = moshi.f(a0.j(List.class, Suggestion.class), q0.d(), "predictions");
        Intrinsics.checkNotNullExpressionValue(hVarF, "adapter(...)");
        this.listOfSuggestionAdapter = hVarF;
    }

    @Override // hn.h
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Meta fromJson(@NotNull m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        List<Suggestion> listFromJson = null;
        while (reader.f()) {
            int I = reader.I(this.options);
            if (I == -1) {
                reader.O();
                reader.Q();
            } else if (I == 0 && (listFromJson = this.listOfSuggestionAdapter.fromJson(reader)) == null) {
                throw c.x("predictions", "predictions", reader);
            }
        }
        reader.d();
        if (listFromJson != null) {
            return new Meta(listFromJson);
        }
        throw c.o("predictions", "predictions", reader);
    }

    @Override // hn.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(@NotNull t writer, @Nullable Meta value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o("predictions");
        this.listOfSuggestionAdapter.toJson(writer, value_.a());
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Meta");
        sb2.append(')');
        return sb2.toString();
    }
}
