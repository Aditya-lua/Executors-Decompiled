package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p305n9.C8944j;
import p456u2.C11777f;
import p456u2.C11781j;

/* JADX INFO: loaded from: classes.dex */
public final class zzwp {
    private static zzcs zza;
    private static final zzcu zzb = zzcu.zzc("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
    private final String zzc;
    private final String zzd;
    private final zzwf zze;
    private final SharedPrefManager zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzwp(Context context, final SharedPrefManager sharedPrefManager, zzwf zzwfVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = CommonUtils.getAppVersion(context);
        this.zzf = sharedPrefManager;
        this.zze = zzwfVar;
        zzxb.zza();
        this.zzi = str;
        this.zzg = MLTaskExecutor.getInstance().scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        Objects.requireNonNull(sharedPrefManager);
        this.zzh = mLTaskExecutor.scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sharedPrefManager.getMlSdkInstanceId();
            }
        });
        zzcu zzcuVar = zzb;
        this.zzj = zzcuVar.containsKey(str) ? DynamiteModule.m9234c(context, (String) zzcuVar.get(str)) : -1;
    }

    public static long zza(List list, double d10) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d10 / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    @NonNull
    private static synchronized zzcs zzi() {
        try {
            zzcs zzcsVar = zza;
            if (zzcsVar != null) {
                return zzcsVar;
            }
            C11781j c11781jM44061a = C11777f.m44061a(Resources.getSystem().getConfiguration());
            zzcp zzcpVar = new zzcp();
            for (int i10 = 0; i10 < c11781jM44061a.m44074f(); i10++) {
                zzcpVar.zzd(CommonUtils.languageTagFromLocale(c11781jM44061a.m44072c(i10)));
            }
            zzcs zzcsVarZzf = zzcpVar.zzf();
            zza = zzcsVarZzf;
            return zzcsVarZzf;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return C8944j.m36020a().m36021b(this.zzi);
    }

    private final boolean zzk(zzrc zzrcVar, long j10, long j11) {
        return this.zzk.get(zzrcVar) == null || j10 - ((Long) this.zzk.get(zzrcVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    public final /* synthetic */ String zzb() {
        return C8944j.m36020a().m36021b(this.zzi);
    }

    public final /* synthetic */ void zzc(zzwe zzweVar, zzrc zzrcVar, String str) {
        zzweVar.zzb(zzrcVar);
        String strZzd = zzweVar.zzd();
        zzvb zzvbVar = new zzvb();
        zzvbVar.zzb(this.zzc);
        zzvbVar.zzc(this.zzd);
        zzvbVar.zzh(zzi());
        zzvbVar.zzg(Boolean.TRUE);
        zzvbVar.zzl(strZzd);
        zzvbVar.zzj(str);
        zzvbVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.getMlSdkInstanceId());
        zzvbVar.zzd(10);
        zzvbVar.zzk(Integer.valueOf(this.zzj));
        zzweVar.zzc(zzvbVar);
        this.zze.zza(zzweVar);
    }

    public final void zzd(zzwe zzweVar, zzrc zzrcVar) {
        zze(zzweVar, zzrcVar, zzj());
    }

    public final void zze(final zzwe zzweVar, final zzrc zzrcVar, final String str) {
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zzweVar, zzrcVar, str);
            }
        });
    }

    public final void zzf(zzwo zzwoVar, zzrc zzrcVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzrcVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzrcVar, Long.valueOf(jElapsedRealtime));
            zze(zzwoVar.zza(), zzrcVar, zzj());
        }
    }

    public final /* synthetic */ void zzg(zzrc zzrcVar, com.google.mlkit.vision.barcode.internal.zzk zzkVar) {
        zzcy zzcyVar = (zzcy) this.zzl.get(zzrcVar);
        if (zzcyVar != null) {
            for (Object obj : zzcyVar.zzw()) {
                ArrayList arrayList = new ArrayList(zzcyVar.zze(obj));
                Collections.sort(arrayList);
                zzqb zzqbVar = new zzqb();
                int size = arrayList.size();
                int i10 = 0;
                long jLongValue = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    jLongValue += ((Long) obj2).longValue();
                }
                zzqbVar.zza(Long.valueOf(jLongValue / ((long) arrayList.size())));
                zzqbVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zzqbVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zzqbVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zzqbVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zzqbVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zze(zzkVar.zza(obj, arrayList.size(), zzqbVar.zzg()), zzrcVar, zzj());
            }
            this.zzl.remove(zzrcVar);
        }
    }

    public final /* synthetic */ void zzh(final zzrc zzrcVar, Object obj, long j10, final com.google.mlkit.vision.barcode.internal.zzk zzkVar) {
        if (!this.zzl.containsKey(zzrcVar)) {
            this.zzl.put(zzrcVar, zzbw.zzz());
        }
        ((zzcy) this.zzl.get(zzrcVar)).zzt(obj, Long.valueOf(j10));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzrcVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzrcVar, Long.valueOf(jElapsedRealtime));
            MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg(zzrcVar, zzkVar);
                }
            });
        }
    }
}
