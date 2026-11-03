package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x extends d implements fu.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23022a;

    public x() {
        this.f23022a = false;
    }

    @Override // kotlin.jvm.internal.d
    public fu.b compute() {
        return this.f23022a ? this : super.compute();
    }

    @Override // kotlin.jvm.internal.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public fu.l getReflected() {
        if (this.f23022a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (fu.l) super.getReflected();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return getOwner().equals(xVar.getOwner()) && getName().equals(xVar.getName()) && getSignature().equals(xVar.getSignature()) && Intrinsics.c(getBoundReceiver(), xVar.getBoundReceiver());
        }
        if (obj instanceof fu.l) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        fu.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public x(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f23022a = (i10 & 2) == 2;
    }
}
