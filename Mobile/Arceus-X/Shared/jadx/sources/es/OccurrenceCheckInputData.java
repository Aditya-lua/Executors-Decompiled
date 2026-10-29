package es;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: es.c, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m31665d2 = {"Les/c;", "", "", "operationData", "", "", "mappingOperation", "operationDefault", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class OccurrenceCheckInputData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Object> operationData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Map<String, Object> mappingOperation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final Object operationDefault;

    public OccurrenceCheckInputData(@NotNull List<? extends Object> operationData, @NotNull Map<String, ? extends Object> mappingOperation, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(operationData, "operationData");
        Intrinsics.checkNotNullParameter(mappingOperation, "mappingOperation");
        this.operationData = operationData;
        this.mappingOperation = mappingOperation;
        this.operationDefault = obj;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m24159a() {
        return this.mappingOperation;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<Object> m24160b() {
        return this.operationData;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getOperationDefault() {
        return this.operationDefault;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OccurrenceCheckInputData)) {
            return false;
        }
        OccurrenceCheckInputData occurrenceCheckInputData = (OccurrenceCheckInputData) other;
        return Intrinsics.m31980c(this.operationData, occurrenceCheckInputData.operationData) && Intrinsics.m31980c(this.mappingOperation, occurrenceCheckInputData.mappingOperation) && Intrinsics.m31980c(this.operationDefault, occurrenceCheckInputData.operationDefault);
    }

    public int hashCode() {
        int iHashCode = ((this.operationData.hashCode() * 31) + this.mappingOperation.hashCode()) * 31;
        Object obj = this.operationDefault;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public String toString() {
        return "OccurrenceCheckInputData(operationData=" + this.operationData + ", mappingOperation=" + this.mappingOperation + ", operationDefault=" + this.operationDefault + ")";
    }
}
