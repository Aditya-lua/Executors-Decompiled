package l5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.startup.InitializationProvider;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f21888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f21889e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Context f21891c;

    @NonNull
    public final Set<Class<? extends b<?>>> b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Map<Class<?>, Object> f21890a = new HashMap();

    public a(@NonNull Context context) {
        this.f21891c = context.getApplicationContext();
    }

    @NonNull
    public static a e(@NonNull Context context) {
        if (f21888d == null) {
            synchronized (f21889e) {
                try {
                    if (f21888d == null) {
                        f21888d = new a(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f21888d;
    }

    public void a(Bundle bundle) {
        String string = this.f21891c.getString(c.f21892a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.b.add((Class<? extends b<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends b<?>>> it = this.b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new d(e10);
            }
        }
    }

    public void b(@NonNull Class<? extends InitializationProvider> cls) {
        try {
            try {
                o5.a.c("Startup");
                a(this.f21891c.getPackageManager().getProviderInfo(new ComponentName(this.f21891c, cls), Barcode.FORMAT_ITF).metaData);
                o5.a.f();
            } catch (PackageManager.NameNotFoundException e10) {
                throw new d(e10);
            }
        } catch (Throwable th2) {
            o5.a.f();
            throw th2;
        }
    }

    @NonNull
    public <T> T c(@NonNull Class<? extends b<?>> cls) {
        T t8;
        synchronized (f21889e) {
            try {
                t8 = (T) this.f21890a.get(cls);
                if (t8 == null) {
                    t8 = (T) d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t8;
    }

    @NonNull
    public final <T> T d(@NonNull Class<? extends b<?>> cls, @NonNull Set<Class<?>> set) {
        T t8;
        if (o5.a.h()) {
            try {
                o5.a.c(cls.getSimpleName());
            } catch (Throwable th2) {
                o5.a.f();
                throw th2;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f21890a.containsKey(cls)) {
            t8 = (T) this.f21890a.get(cls);
        } else {
            set.add(cls);
            try {
                b<?> bVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends b<?>>> listA = bVarNewInstance.a();
                if (!listA.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : listA) {
                        if (!this.f21890a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t8 = (T) bVarNewInstance.create(this.f21891c);
                set.remove(cls);
                this.f21890a.put(cls, t8);
            } catch (Throwable th3) {
                throw new d(th3);
            }
        }
        o5.a.f();
        return t8;
    }

    @NonNull
    public <T> T f(@NonNull Class<? extends b<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(@NonNull Class<? extends b<?>> cls) {
        return this.b.contains(cls);
    }
}
