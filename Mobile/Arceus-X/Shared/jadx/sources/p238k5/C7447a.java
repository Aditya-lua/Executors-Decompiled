package p238k5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p301n5.C8884a;

/* JADX INFO: renamed from: k5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7447a {

    /* JADX INFO: renamed from: d */
    public static volatile C7447a f28724d;

    /* JADX INFO: renamed from: e */
    public static final Object f28725e = new Object();

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Context f28728c;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Set<Class<? extends InterfaceC7448b<?>>> f28727b = new HashSet();

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Map<Class<?>, Object> f28726a = new HashMap();

    public C7447a(@NonNull Context context) {
        this.f28728c = context.getApplicationContext();
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static C7447a m30961e(@NonNull Context context) {
        if (f28724d == null) {
            synchronized (f28725e) {
                try {
                    if (f28724d == null) {
                        f28724d = new C7447a(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f28724d;
    }

    /* JADX INFO: renamed from: a */
    public void m30962a(Bundle bundle) {
        String string = this.f28728c.getString(C7449c.f28729a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC7448b.class.isAssignableFrom(cls)) {
                            this.f28727b.add((Class<? extends InterfaceC7448b<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends InterfaceC7448b<?>>> it = this.f28727b.iterator();
                while (it.hasNext()) {
                    m30965d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new C7450d(e10);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m30963b(@NonNull Class<? extends InitializationProvider> cls) {
        try {
            try {
                C8884a.m35746c("Startup");
                m30962a(this.f28728c.getPackageManager().getProviderInfo(new ComponentName(this.f28728c, cls), 128).metaData);
                C8884a.m35749f();
            } catch (PackageManager.NameNotFoundException e10) {
                throw new C7450d(e10);
            }
        } catch (Throwable th2) {
            C8884a.m35749f();
            throw th2;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public <T> T m30964c(@NonNull Class<? extends InterfaceC7448b<?>> cls) {
        T t8;
        synchronized (f28725e) {
            try {
                t8 = (T) this.f28726a.get(cls);
                if (t8 == null) {
                    t8 = (T) m30965d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t8;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public final <T> T m30965d(@NonNull Class<? extends InterfaceC7448b<?>> cls, @NonNull Set<Class<?>> set) {
        T t8;
        if (C8884a.m35751h()) {
            try {
                C8884a.m35746c(cls.getSimpleName());
            } catch (Throwable th2) {
                C8884a.m35749f();
                throw th2;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f28726a.containsKey(cls)) {
            t8 = (T) this.f28726a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC7448b<?> interfaceC7448bNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends InterfaceC7448b<?>>> listDependencies = interfaceC7448bNewInstance.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends InterfaceC7448b<?>> cls2 : listDependencies) {
                        if (!this.f28726a.containsKey(cls2)) {
                            m30965d(cls2, set);
                        }
                    }
                }
                t8 = (T) interfaceC7448bNewInstance.create(this.f28728c);
                set.remove(cls);
                this.f28726a.put(cls, t8);
            } catch (Throwable th3) {
                throw new C7450d(th3);
            }
        }
        C8884a.m35749f();
        return t8;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public <T> T m30966f(@NonNull Class<? extends InterfaceC7448b<T>> cls) {
        return (T) m30964c(cls);
    }

    /* JADX INFO: renamed from: g */
    public boolean m30967g(@NonNull Class<? extends InterfaceC7448b<?>> cls) {
        return this.f28727b.contains(cls);
    }
}
