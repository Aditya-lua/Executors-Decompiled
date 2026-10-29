package wn;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0012"}, d2 = {"Lwn/a;", "", "<init>", "()V", "Lwn/c;", "T", "Ljava/lang/Class;", "clazz", "defaultFactory", "Lwn/a$a;", "c", "(Ljava/lang/Class;Lwn/c;)Lwn/a$a;", "Lwn/b;", "b", "()Lwn/b;", "Lwn/b;", "advancedCustomizationsManager", "a", "inquiry-advanced-customizations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f34452a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static final b advancedCustomizationsManager = null;

    /* JADX INFO: renamed from: wn.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lwn/a$a;", "Lwn/c;", "T", "", "Ljava/lang/Class;", "clazz", "default", "<init>", "(Ljava/lang/Class;Lwn/c;)V", "Lwn/d;", "viewControllerVersion", "a", "(Lwn/d;)Lwn/c;", "Ljava/lang/Class;", "b", "Lwn/c;", "inquiry-advanced-customizations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0631a<T extends c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Class<T> clazz;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final T default;

        public C0631a(@NotNull Class<T> clazz, @NotNull T t8) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(t8, "default");
            this.clazz = clazz;
            this.default = t8;
        }

        @NotNull
        public final T a(@NotNull d viewControllerVersion) {
            Intrinsics.checkNotNullParameter(viewControllerVersion, "viewControllerVersion");
            b bVar = a.advancedCustomizationsManager;
            T t8 = bVar != null ? (T) bVar.a(viewControllerVersion) : null;
            return (t8 == null || !this.clazz.isAssignableFrom(t8.getClass())) ? this.default : t8;
        }
    }

    static {
        a aVar = new a();
        f34452a = aVar;
        aVar.b();
    }

    public final b b() {
        try {
            Object objNewInstance = Class.forName("com.withpersona.sdk2.inquiry.advancedCustomizations.impl.RealCustomizationsManager").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof b) {
                return (b) objNewInstance;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @NotNull
    public final <T extends c> C0631a<T> c(@NotNull Class<T> clazz, @NotNull T defaultFactory) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
        return new C0631a<>(clazz, defaultFactory);
    }
}
