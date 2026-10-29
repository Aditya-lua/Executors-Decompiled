package com.google.android.gms.internal.mlkit_vision_common;

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
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p305n9.C8944j;
import p456u2.C11777f;
import p456u2.C11781j;

/* JADX INFO: loaded from: classes.dex */
public final class zzmj {
    private static zzp zza;
    private static final zzr zzb = zzr.zzc("optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID);
    private final String zzc;
    private final String zzd;
    private final zzmc zze;
    private final SharedPrefManager zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzmj(Context context, final SharedPrefManager sharedPrefManager, zzmc zzmcVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = CommonUtils.getAppVersion(context);
        this.zzf = sharedPrefManager;
        this.zze = zzmcVar;
        zzmw.zza();
        this.zzi = str;
        this.zzg = MLTaskExecutor.getInstance().scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza();
            }
        });
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        sharedPrefManager.getClass();
        this.zzh = mLTaskExecutor.scheduleCallable(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sharedPrefManager.getMlSdkInstanceId();
            }
        });
        zzr zzrVar = zzb;
        this.zzj = zzrVar.containsKey(str) ? DynamiteModule.m9234c(context, (String) zzrVar.get(str)) : -1;
    }

    @NonNull
    private static synchronized zzp zzd() {
        try {
            zzp zzpVar = zza;
            if (zzpVar != null) {
                return zzpVar;
            }
            C11781j c11781jM44061a = C11777f.m44061a(Resources.getSystem().getConfiguration());
            zzm zzmVar = new zzm();
            for (int i10 = 0; i10 < c11781jM44061a.m44074f(); i10++) {
                zzmVar.zzb(CommonUtils.languageTagFromLocale(c11781jM44061a.m44072c(i10)));
            }
            zzp zzpVarZzc = zzmVar.zzc();
            zza = zzpVarZzc;
            return zzpVarZzc;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final /* synthetic */ String zza() {
        return C8944j.m36020a().m36021b(this.zzi);
    }

    public final /* synthetic */ void zzb(zzmb zzmbVar, zziv zzivVar, String str) {
        zzmbVar.zza(zzivVar);
        String strZzc = zzmbVar.zzc();
        zzky zzkyVar = new zzky();
        zzkyVar.zzb(this.zzc);
        zzkyVar.zzc(this.zzd);
        zzkyVar.zzh(zzd());
        zzkyVar.zzg(Boolean.TRUE);
        zzkyVar.zzl(strZzc);
        zzkyVar.zzj(str);
        zzkyVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.getMlSdkInstanceId());
        zzkyVar.zzd(10);
        zzkyVar.zzk(Integer.valueOf(this.zzj));
        zzmbVar.zzb(zzkyVar);
        this.zze.zza(zzmbVar);
    }

    public final void zzc(zzmt zzmtVar, final zziv zzivVar) {
        zzii zziiVar;
        zzio zzioVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzk.get(zzivVar) != null && jElapsedRealtime - ((Long) this.zzk.get(zzivVar)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.zzk.put(zzivVar, Long.valueOf(jElapsedRealtime));
        int i10 = zzmtVar.zza;
        int i11 = zzmtVar.zzb;
        int i12 = zzmtVar.zzc;
        int i13 = zzmtVar.zzd;
        int i14 = zzmtVar.zze;
        long j10 = zzmtVar.zzf;
        int i15 = zzmtVar.zzg;
        zzin zzinVar = new zzin();
        if (i10 == -1) {
            zziiVar = zzii.BITMAP;
        } else if (i10 == 35) {
            zziiVar = zzii.YUV_420_888;
        } else if (i10 == 842094169) {
            zziiVar = zzii.YV12;
        } else if (i10 != 16) {
            zziiVar = i10 != 17 ? zzii.UNKNOWN_FORMAT : zzii.NV21;
        } else {
            zziiVar = zzii.NV16;
        }
        zzinVar.zzd(zziiVar);
        if (i11 == 1) {
            zzioVar = zzio.BITMAP;
        } else if (i11 == 2) {
            zzioVar = zzio.BYTEARRAY;
        } else if (i11 != 3) {
            zzioVar = i11 != 4 ? zzio.ANDROID_MEDIA_IMAGE : zzio.FILEPATH;
        } else {
            zzioVar = zzio.BYTEBUFFER;
        }
        zzinVar.zzf(zzioVar);
        zzinVar.zzc(Integer.valueOf(i12));
        zzinVar.zze(Integer.valueOf(i13));
        zzinVar.zzg(Integer.valueOf(i14));
        zzinVar.zzb(Long.valueOf(j10));
        zzinVar.zzh(Integer.valueOf(i15));
        zziq zziqVarZzj = zzinVar.zzj();
        zziw zziwVar = new zziw();
        zziwVar.zzd(zziqVarZzj);
        final zzmb zzmbVarZze = zzmk.zze(zziwVar);
        final String strM36021b = this.zzg.isSuccessful() ? (String) this.zzg.getResult() : C8944j.m36020a().m36021b(this.zzi);
        MLTaskExecutor.workerThreadExecutor().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmi
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzmbVarZze, zzivVar, strM36021b);
            }
        });
    }
}
