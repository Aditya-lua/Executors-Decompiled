package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements hu.b, Serializable {
    public static final Object NO_RECEIVER = a.f22553a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient hu.b reflected;
    private final String signature;

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22553a = new a();
    }

    public d() {
        this(NO_RECEIVER);
    }

    @Override // hu.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // hu.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public hu.b compute() {
        hu.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        hu.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    public abstract hu.b computeReflected();

    @Override // hu.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // hu.b
    public String getName() {
        return this.name;
    }

    public hu.f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? d0.c(cls) : d0.b(cls);
    }

    @Override // hu.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public hu.b getReflected() {
        hu.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new yt.b();
    }

    @Override // hu.b
    public hu.m getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // hu.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // hu.b
    public hu.o getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // hu.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // hu.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // hu.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // hu.b
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
