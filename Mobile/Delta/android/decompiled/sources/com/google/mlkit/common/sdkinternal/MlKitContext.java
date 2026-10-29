package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import lf.c;
import lf.f;
import lf.o;
import n9.m;
import sb.l;

/* JADX INFO: loaded from: classes2.dex */
public class MlKitContext {
    private static final Object zza = new Object();
    private static MlKitContext zzb;
    private o zzc;

    private MlKitContext() {
    }

    @NonNull
    public static MlKitContext getInstance() {
        MlKitContext mlKitContext;
        synchronized (zza) {
            m.q(zzb != null, "MlKitContext has not been initialized");
            mlKitContext = (MlKitContext) m.l(zzb);
        }
        return mlKitContext;
    }

    @NonNull
    public static MlKitContext initialize(@NonNull Context context, @NonNull List<ComponentRegistrar> list) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            try {
                m.q(zzb == null, "MlKitContext is already initialized");
                MlKitContext mlKitContext2 = new MlKitContext();
                zzb = mlKitContext2;
                Context contextZzc = zzc(context);
                HashMap map = new HashMap();
                for (ComponentRegistrar componentRegistrar : list) {
                    map.put(componentRegistrar.getClass(), componentRegistrar);
                }
                o oVar = new o(l.f30589a, new ArrayList(map.values()), c.q(contextZzc, Context.class, new Class[0]), c.q(mlKitContext2, MlKitContext.class, new Class[0]));
                mlKitContext2.zzc = oVar;
                oVar.o(true);
                mlKitContext = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mlKitContext;
    }

    @NonNull
    public static MlKitContext initializeIfNeeded(@NonNull Context context) {
        MlKitContext mlKitContextZza;
        synchronized (zza) {
            mlKitContextZza = zzb;
            if (mlKitContextZza == null) {
                mlKitContextZza = zza(context);
            }
        }
        return mlKitContextZza;
    }

    @NonNull
    public static MlKitContext zza(@NonNull Context context) {
        MlKitContext mlKitContextZzb;
        synchronized (zza) {
            mlKitContextZzb = zzb(context, l.f30589a);
        }
        return mlKitContextZzb;
    }

    @NonNull
    public static MlKitContext zzb(@NonNull Context context, @NonNull Executor executor) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            m.q(zzb == null, "MlKitContext is already initialized");
            MlKitContext mlKitContext2 = new MlKitContext();
            zzb = mlKitContext2;
            Context contextZzc = zzc(context);
            o oVarE = o.l(executor).d(f.c(contextZzc, MlKitComponentDiscoveryService.class).b()).b(c.q(contextZzc, Context.class, new Class[0])).b(c.q(mlKitContext2, MlKitContext.class, new Class[0])).e();
            mlKitContext2.zzc = oVarE;
            oVarE.o(true);
            mlKitContext = zzb;
        }
        return mlKitContext;
    }

    private static Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @NonNull
    public <T> T get(@NonNull Class<T> cls) {
        m.q(zzb == this, "MlKitContext has been deleted");
        m.l(this.zzc);
        return (T) this.zzc.a(cls);
    }

    @NonNull
    public Context getApplicationContext() {
        return (Context) get(Context.class);
    }

    @NonNull
    public static MlKitContext initializeIfNeeded(@NonNull Context context, @NonNull List<ComponentRegistrar> list) {
        MlKitContext mlKitContextInitialize;
        synchronized (zza) {
            mlKitContextInitialize = zzb;
            if (mlKitContextInitialize == null) {
                mlKitContextInitialize = initialize(context, list);
            }
        }
        return mlKitContextInitialize;
    }

    @NonNull
    public static MlKitContext initializeIfNeeded(@NonNull Context context, @NonNull Executor executor) {
        MlKitContext mlKitContextZzb;
        synchronized (zza) {
            mlKitContextZzb = zzb;
            if (mlKitContextZzb == null) {
                mlKitContextZzb = zzb(context, executor);
            }
        }
        return mlKitContextZzb;
    }
}
