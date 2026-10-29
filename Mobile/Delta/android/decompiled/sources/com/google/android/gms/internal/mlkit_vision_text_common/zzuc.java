package com.google.android.gms.internal.mlkit_vision_text_common;

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
import u2.f;
import u2.j;

/* JADX INFO: loaded from: classes.dex */
public final class zzuc {
    private static zzbk zza;
    private static final zzbm zzb = zzbm.zzc("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
    private final String zzc;
    private final String zzd;
    private final zzts zze;
    private final SharedPrefManager zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzuc(Context context, final SharedPrefManager sharedPrefManager, zzts zztsVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = CommonUtils.getAppVersion(context);
        this.zzf = sharedPrefManager;
        this.zze = zztsVar;
        zzuo.zza();
        this.zzi = str;
        this.zzg = MLTaskExecutor.getInstance().scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzty
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        Objects.requireNonNull(sharedPrefManager);
        this.zzh = mLTaskExecutor.scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sharedPrefManager.getMlSdkInstanceId();
            }
        });
        zzbm zzbmVar = zzb;
        this.zzj = zzbmVar.containsKey(str) ? DynamiteModule.c(context, (String) zzbmVar.get(str)) : -1;
    }

    public static long zza(List list, double d10) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d10 / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    @NonNull
    private static synchronized zzbk zzi() {
        try {
            zzbk zzbkVar = zza;
            if (zzbkVar != null) {
                return zzbkVar;
            }
            j jVarA = f.a(Resources.getSystem().getConfiguration());
            zzbh zzbhVar = new zzbh();
            for (int i10 = 0; i10 < jVarA.f(); i10++) {
                zzbhVar.zza(CommonUtils.languageTagFromLocale(jVarA.c(i10)));
            }
            zzbk zzbkVarZzb = zzbhVar.zzb();
            zza = zzbkVarZzb;
            return zzbkVarZzb;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return n9.j.a().b(this.zzi);
    }

    private final boolean zzk(zzov zzovVar, long j10, long j11) {
        return this.zzk.get(zzovVar) == null || j10 - ((Long) this.zzk.get(zzovVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    public final /* synthetic */ String zzb() {
        return n9.j.a().b(this.zzi);
    }

    public final /* synthetic */ void zzc(zztr zztrVar, zzov zzovVar, String str) {
        zztrVar.zzb(zzovVar);
        String strZzd = zztrVar.zzd();
        zzsr zzsrVar = new zzsr();
        zzsrVar.zzb(this.zzc);
        zzsrVar.zzc(this.zzd);
        zzsrVar.zzh(zzi());
        zzsrVar.zzg(Boolean.TRUE);
        zzsrVar.zzl(strZzd);
        zzsrVar.zzj(str);
        zzsrVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.getMlSdkInstanceId());
        zzsrVar.zzd(10);
        zzsrVar.zzk(Integer.valueOf(this.zzj));
        zztrVar.zzc(zzsrVar);
        this.zze.zza(zztrVar);
    }

    public final void zzd(zztr zztrVar, zzov zzovVar) {
        zze(zztrVar, zzovVar, zzj());
    }

    public final void zze(final zztr zztrVar, final zzov zzovVar, final String str) {
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zztrVar, zzovVar, str);
            }
        });
    }

    public final void zzf(zzub zzubVar, zzov zzovVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzovVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzovVar, Long.valueOf(jElapsedRealtime));
            zze(zzubVar.zza(), zzovVar, zzj());
        }
    }

    public final /* synthetic */ void zzg(zzov zzovVar, com.google.mlkit.vision.text.internal.zzr zzrVar) {
        zzbp zzbpVar = (zzbp) this.zzl.get(zzovVar);
        if (zzbpVar != null) {
            for (Object obj : zzbpVar.zzo()) {
                ArrayList arrayList = new ArrayList(zzbpVar.zzc(obj));
                Collections.sort(arrayList);
                zznu zznuVar = new zznu();
                int size = arrayList.size();
                int i10 = 0;
                long jLongValue = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    jLongValue += ((Long) obj2).longValue();
                }
                zznuVar.zza(Long.valueOf(jLongValue / ((long) arrayList.size())));
                zznuVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zznuVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zznuVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zznuVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zznuVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zze(zzrVar.zza(obj, arrayList.size(), zznuVar.zzg()), zzovVar, zzj());
            }
            this.zzl.remove(zzovVar);
        }
    }

    public final /* synthetic */ void zzh(final zzov zzovVar, Object obj, long j10, final com.google.mlkit.vision.text.internal.zzr zzrVar) {
        if (!this.zzl.containsKey(zzovVar)) {
            this.zzl.put(zzovVar, zzao.zzp());
        }
        ((zzbp) this.zzl.get(zzovVar)).zzm(obj, Long.valueOf(j10));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzovVar, jElapsedRealtime, 30L)) {
            this.zzk.put(zzovVar, Long.valueOf(jElapsedRealtime));
            MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg(zzovVar, zzrVar);
                }
            });
        }
    }
}
