package kotlin.jvm.internal;

import hu.InterfaceC6566b;
import hu.InterfaceC6576l;

/* JADX INFO: renamed from: kotlin.jvm.internal.x */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7757x extends AbstractC7730d implements InterfaceC6576l {

    /* JADX INFO: renamed from: a */
    public final boolean f29444a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC7757x() {
        this.f29444a = false;
    }

    @Override // kotlin.jvm.internal.AbstractC7730d
    public InterfaceC6566b compute() {
        return this.f29444a ? this : super.compute();
    }

    /* JADX DEBUG: Method merged with bridge method: getReflected()Lhu/b; */
    @Override // kotlin.jvm.internal.AbstractC7730d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC6576l getReflected() {
        if (this.f29444a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (InterfaceC6576l) super.getReflected();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7757x) {
            AbstractC7757x abstractC7757x = (AbstractC7757x) obj;
            return getOwner().equals(abstractC7757x.getOwner()) && getName().equals(abstractC7757x.getName()) && getSignature().equals(abstractC7757x.getSignature()) && Intrinsics.m31980c(getBoundReceiver(), abstractC7757x.getBoundReceiver());
        }
        if (obj instanceof InterfaceC6576l) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        InterfaceC6566b interfaceC6566bCompute = compute();
        if (interfaceC6566bCompute != this) {
            return interfaceC6566bCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public AbstractC7757x(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f29444a = (i10 & 2) == 2;
    }
}
