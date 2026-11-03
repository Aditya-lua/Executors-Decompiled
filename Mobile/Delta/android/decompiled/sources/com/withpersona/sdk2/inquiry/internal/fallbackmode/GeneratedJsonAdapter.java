package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.a0;
import sm.m;
import sm.t;
import sm.w;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService_StaticTemplateJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_StaticTemplateJsonAdapter;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "Lsm/w;", "moshi", "<init>", "(Lsm/w;)V", "", "toString", "()Ljava/lang/String;", "Lsm/m;", "reader", "a", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;", "Lsm/t;", "writer", "value_", "", "b", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StaticTemplate;)V", "Lsm/m$b;", "Lsm/m$b;", "options", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "Lsm/h;", "listOfNextStepAdapter", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GeneratedJsonAdapter extends sm.h<FallbackModeService.StaticTemplate> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m.b options;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final sm.h<List<NextStep>> listOfNextStepAdapter;

    public GeneratedJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a("steps");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.options = bVarA;
        sm.h<List<NextStep>> hVarF = moshi.f(a0.j(List.class, NextStep.class), q0.d(), "steps");
        Intrinsics.checkNotNullExpressionValue(hVarF, "adapter(...)");
        this.listOfNextStepAdapter = hVarF;
    }

    @Override // sm.h
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FallbackModeService.StaticTemplate fromJson(@NotNull m reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.b();
        List<NextStep> listFromJson = null;
        while (reader.f()) {
            int iF = reader.F(this.options);
            if (iF == -1) {
                reader.M();
                reader.P();
            } else if (iF == 0 && (listFromJson = this.listOfNextStepAdapter.fromJson(reader)) == null) {
                throw um.c.x("steps", "steps", reader);
            }
        }
        reader.d();
        if (listFromJson != null) {
            return new FallbackModeService.StaticTemplate(listFromJson);
        }
        throw um.c.o("steps", "steps", reader);
    }

    @Override // sm.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(@NotNull t writer, @Nullable FallbackModeService.StaticTemplate value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("steps");
        this.listOfNextStepAdapter.toJson(writer, value_.a());
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("FallbackModeService.StaticTemplate");
        sb2.append(')');
        return sb2.toString();
    }
}
