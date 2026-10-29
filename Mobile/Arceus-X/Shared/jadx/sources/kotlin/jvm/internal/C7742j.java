package kotlin.jvm.internal;

import hu.InterfaceC6566b;
import hu.InterfaceC6571g;

/* JADX INFO: renamed from: kotlin.jvm.internal.j */
/* JADX INFO: loaded from: classes2.dex */
public class C7742j extends AbstractC7730d implements InterfaceC7740i, InterfaceC6571g {
    private final int arity;
    private final int flags;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7742j(int i10) {
        this(i10, AbstractC7730d.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC7730d
    public InterfaceC6566b computeReflected() {
        return C7731d0.m32001a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7742j) {
            C7742j c7742j = (C7742j) obj;
            return getName().equals(c7742j.getName()) && getSignature().equals(c7742j.getSignature()) && this.flags == c7742j.flags && this.arity == c7742j.arity && Intrinsics.m31980c(getBoundReceiver(), c7742j.getBoundReceiver()) && Intrinsics.m31980c(getOwner(), c7742j.getOwner());
        }
        if (obj instanceof InterfaceC6571g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7740i
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // hu.InterfaceC6571g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // hu.InterfaceC6571g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // hu.InterfaceC6571g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // hu.InterfaceC6571g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC7730d, hu.InterfaceC6566b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC6566b interfaceC6566bCompute = compute();
        if (interfaceC6566bCompute != this) {
            return interfaceC6566bCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7742j(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getReflected()Lhu/b; */
    @Override // kotlin.jvm.internal.AbstractC7730d
    public InterfaceC6571g getReflected() {
        return (InterfaceC6571g) super.getReflected();
    }

    public C7742j(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
