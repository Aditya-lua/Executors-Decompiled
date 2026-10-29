package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x extends d implements hu.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22567a;

    public x() {
        this.f22567a = false;
    }

    @Override // kotlin.jvm.internal.d
    public hu.b compute() {
        return this.f22567a ? this : super.compute();
    }

    @Override // kotlin.jvm.internal.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public hu.l getReflected() {
        if (this.f22567a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (hu.l) super.getReflected();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return getOwner().equals(xVar.getOwner()) && getName().equals(xVar.getName()) && getSignature().equals(xVar.getSignature()) && Intrinsics.c(getBoundReceiver(), xVar.getBoundReceiver());
        }
        if (obj instanceof hu.l) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        hu.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public x(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f22567a = (i10 & 2) == 2;
    }
}
