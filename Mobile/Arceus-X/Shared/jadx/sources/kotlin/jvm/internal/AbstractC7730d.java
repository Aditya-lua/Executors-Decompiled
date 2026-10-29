package kotlin.jvm.internal;

import hu.EnumC6579o;
import hu.InterfaceC6566b;
import hu.InterfaceC6570f;
import hu.InterfaceC6577m;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import yt.C13451b;

/* JADX INFO: renamed from: kotlin.jvm.internal.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7730d implements InterfaceC6566b, Serializable {
    public static final Object NO_RECEIVER = a.f29426a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC6566b reflected;
    private final String signature;

    /* JADX INFO: renamed from: kotlin.jvm.internal.d$a */
    public static class a implements Serializable {

        /* JADX INFO: renamed from: a */
        public static final a f29426a = new a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC7730d() {
        this(NO_RECEIVER);
    }

    @Override // hu.InterfaceC6566b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // hu.InterfaceC6566b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC6566b compute() {
        InterfaceC6566b interfaceC6566b = this.reflected;
        if (interfaceC6566b != null) {
            return interfaceC6566b;
        }
        InterfaceC6566b interfaceC6566bComputeReflected = computeReflected();
        this.reflected = interfaceC6566bComputeReflected;
        return interfaceC6566bComputeReflected;
    }

    public abstract InterfaceC6566b computeReflected();

    @Override // hu.InterfaceC6565a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // hu.InterfaceC6566b
    public String getName() {
        return this.name;
    }

    public InterfaceC6570f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? C7731d0.m32003c(cls) : C7731d0.m32002b(cls);
    }

    @Override // hu.InterfaceC6566b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public InterfaceC6566b getReflected() {
        InterfaceC6566b interfaceC6566bCompute = compute();
        if (interfaceC6566bCompute != this) {
            return interfaceC6566bCompute;
        }
        throw new C13451b();
    }

    @Override // hu.InterfaceC6566b
    public InterfaceC6577m getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // hu.InterfaceC6566b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // hu.InterfaceC6566b
    public EnumC6579o getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // hu.InterfaceC6566b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // hu.InterfaceC6566b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // hu.InterfaceC6566b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // hu.InterfaceC6566b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC7730d(Object obj) {
        this(obj, null, null, null, false);
    }

    public AbstractC7730d(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
