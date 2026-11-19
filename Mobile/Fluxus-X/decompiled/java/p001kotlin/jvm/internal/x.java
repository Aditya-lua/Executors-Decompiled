package p001kotlin.jvm.internal;

import xu.b;
import xu.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x extends d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21590a;

    public x() {
        this.f21590a = false;
    }

    @Override // p001kotlin.jvm.internal.d
    public b compute() {
        return this.f21590a ? this : super.compute();
    }

    @Override // p001kotlin.jvm.internal.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public l getReflected() {
        if (this.f21590a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (l) super.getReflected();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return getOwner().equals(xVar.getOwner()) && getName().equals(xVar.getName()) && getSignature().equals(xVar.getSignature()) && Intrinsics.c(getBoundReceiver(), xVar.getBoundReceiver());
        }
        if (obj instanceof l) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public x(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f21590a = (i10 & 2) == 2;
    }
}
