package p085ds;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ds.b, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\u0010\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R!\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m31665d2 = {"Lds/b;", "", "", "operationData", "", "", "mappingOperation", "operationDefault", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class ArrayOperationInputData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final List<Object> operationData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final Map<String, Object> mappingOperation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final Object operationDefault;

    public ArrayOperationInputData(@Nullable List<? extends Object> list, @Nullable Map<String, ? extends Object> map, @Nullable Object obj) {
        this.operationData = list;
        this.mappingOperation = map;
        this.operationDefault = obj;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m22973a() {
        return this.mappingOperation;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final List<Object> m22974b() {
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
        if (!(other instanceof ArrayOperationInputData)) {
            return false;
        }
        ArrayOperationInputData arrayOperationInputData = (ArrayOperationInputData) other;
        return Intrinsics.m31980c(this.operationData, arrayOperationInputData.operationData) && Intrinsics.m31980c(this.mappingOperation, arrayOperationInputData.mappingOperation) && Intrinsics.m31980c(this.operationDefault, arrayOperationInputData.operationDefault);
    }

    public int hashCode() {
        List<Object> list = this.operationData;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, Object> map = this.mappingOperation;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Object obj = this.operationDefault;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ArrayOperationInputData(operationData=" + this.operationData + ", mappingOperation=" + this.mappingOperation + ", operationDefault=" + this.operationDefault + ")";
    }
}
