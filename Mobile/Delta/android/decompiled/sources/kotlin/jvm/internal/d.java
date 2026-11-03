package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements fu.b, Serializable {
    public static final Object NO_RECEIVER = a.f23008a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient fu.b reflected;
    private final String signature;

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23008a = new a();
    }

    public d() {
        this(NO_RECEIVER);
    }

    @Override // fu.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // fu.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public fu.b compute() {
        fu.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        fu.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    public abstract fu.b computeReflected();

    @Override // fu.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // fu.b
    public String getName() {
        return this.name;
    }

    public fu.f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? d0.c(cls) : d0.b(cls);
    }

    @Override // fu.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public fu.b getReflected() {
        fu.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new wt.b();
    }

    @Override // fu.b
    public fu.m getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // fu.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // fu.b
    public fu.o getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // fu.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // fu.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // fu.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // fu.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public d(Object obj) {
        this(obj, null, null, null, false);
    }

    public d(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
