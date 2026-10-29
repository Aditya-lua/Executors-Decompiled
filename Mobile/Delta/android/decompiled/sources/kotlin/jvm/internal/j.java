package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class j extends d implements i, hu.g {
    private final int arity;
    private final int flags;

    public j(int i10) {
        this(i10, d.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.d
    public hu.b computeReflected() {
        return d0.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return getName().equals(jVar.getName()) && getSignature().equals(jVar.getSignature()) && this.flags == jVar.flags && this.arity == jVar.arity && Intrinsics.c(getBoundReceiver(), jVar.getBoundReceiver()) && Intrinsics.c(getOwner(), jVar.getOwner());
        }
        if (obj instanceof hu.g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // hu.g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // hu.g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // hu.g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // hu.g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.d, hu.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        hu.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public j(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.d
    public hu.g getReflected() {
        return (hu.g) super.getReflected();
    }

    public j(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
