package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import p292mf.C8492c;
import p292mf.C8498f;
import p292mf.C8508o;
import p305n9.C8953m;
import sb.C11266l;

/* JADX INFO: loaded from: classes2.dex */
public class MlKitContext {
    private static final Object zza = new Object();
    private static MlKitContext zzb;
    private C8508o zzc;

    private MlKitContext() {
    }

    @NonNull
    public static MlKitContext getInstance() {
        MlKitContext mlKitContext;
        synchronized (zza) {
            C8953m.m36052q(zzb != null, "MlKitContext has not been initialized");
            mlKitContext = (MlKitContext) C8953m.m36047l(zzb);
        }
        return mlKitContext;
    }

    @NonNull
    public static MlKitContext initialize(@NonNull Context context, @NonNull List<ComponentRegistrar> list) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            try {
                C8953m.m36052q(zzb == null, "MlKitContext is already initialized");
                MlKitContext mlKitContext2 = new MlKitContext();
                zzb = mlKitContext2;
                Context contextZzc = zzc(context);
                HashMap map = new HashMap();
                for (ComponentRegistrar componentRegistrar : list) {
                    map.put(componentRegistrar.getClass(), componentRegistrar);
                }
                C8508o c8508o = new C8508o(C11266l.f39580a, new ArrayList(map.values()), C8492c.m34280q(contextZzc, Context.class, new Class[0]), C8492c.m34280q(mlKitContext2, MlKitContext.class, new Class[0]));
                mlKitContext2.zzc = c8508o;
                c8508o.m34333o(true);
                mlKitContext = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mlKitContext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            mlKitContextZzb = zzb(context, C11266l.f39580a);
        }
        return mlKitContextZzb;
    }

    @NonNull
    public static MlKitContext zzb(@NonNull Context context, @NonNull Executor executor) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            C8953m.m36052q(zzb == null, "MlKitContext is already initialized");
            MlKitContext mlKitContext2 = new MlKitContext();
            zzb = mlKitContext2;
            Context contextZzc = zzc(context);
            C8508o c8508oM34342e = C8508o.m34328l(executor).m34341d(C8498f.m34318c(contextZzc, MlKitComponentDiscoveryService.class).m34320b()).m34339b(C8492c.m34280q(contextZzc, Context.class, new Class[0])).m34339b(C8492c.m34280q(mlKitContext2, MlKitContext.class, new Class[0])).m34342e();
            mlKitContext2.zzc = c8508oM34342e;
            c8508oM34342e.m34333o(true);
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
        C8953m.m36052q(zzb == this, "MlKitContext has been deleted");
        C8953m.m36047l(this.zzc);
        return (T) this.zzc.mo34304a(cls);
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
