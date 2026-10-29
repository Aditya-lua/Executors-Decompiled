package fn;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fn.b, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lfn/b;", "", "Ljt/n;", "Lgn/a;", "result", "", "isActiveAnalyzer", "<init>", "(Ljava/lang/Object;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "Z", "()Z", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AnalyzerResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Object result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean isActiveAnalyzer;

    public AnalyzerResult(@NotNull Object obj, boolean z10) {
        this.result = obj;
        this.isActiveAnalyzer = z10;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsActiveAnalyzer() {
        return this.isActiveAnalyzer;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyzerResult)) {
            return false;
        }
        AnalyzerResult analyzerResult = (AnalyzerResult) other;
        return jt.n.d(this.result, analyzerResult.result) && this.isActiveAnalyzer == analyzerResult.isActiveAnalyzer;
    }

    public int hashCode() {
        return (jt.n.f(this.result) * 31) + Boolean.hashCode(this.isActiveAnalyzer);
    }

    @NotNull
    public String toString() {
        return "AnalyzerResult(result=" + jt.n.i(this.result) + ", isActiveAnalyzer=" + this.isActiveAnalyzer + ")";
    }
}
