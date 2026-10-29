package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.vision.barcode.ZoomSuggestionOptions;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import n9.g;

/* JADX INFO: loaded from: classes.dex */
public final class zzxk {
    private static final g zzf = new g("AutoZoom");
    final zzxm zza;
    final zzbw zzb;
    ScheduledFuture zzc;
    String zzd;
    int zze;
    private final AtomicBoolean zzg;
    private final Object zzh;
    private final ScheduledExecutorService zzi;
    private final zzbb zzj;
    private final zzwp zzk;
    private final String zzl;
    private Executor zzm;
    private float zzn;
    private float zzo;
    private long zzp;
    private long zzq;
    private boolean zzr;
    private com.google.mlkit.vision.barcode.internal.zze zzs;

    private zzxk(Context context, zzxm zzxmVar, String str) {
        zzg.zza();
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(2));
        zzbb zzbbVarZza = zzar.zza();
        zzwp zzwpVar = new zzwp(context, new SharedPrefManager(context), new zzwi(context, zzwh.zzd("scanner-auto-zoom").zzd()), "scanner-auto-zoom");
        this.zzh = new Object();
        this.zza = zzxmVar;
        this.zzg = new AtomicBoolean(false);
        this.zzb = zzbw.zzz();
        this.zzi = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        this.zzj = zzbbVarZza;
        this.zzk = zzwpVar;
        this.zzl = str;
        this.zze = 1;
        this.zzn = 1.0f;
        this.zzo = -1.0f;
        this.zzp = zzbbVarZza.zza();
    }

    public static zzxk zzd(Context context, String str) {
        return new zzxk(context, zzxm.zza, str);
    }

    public static /* synthetic */ void zzf(zzxk zzxkVar) {
        ScheduledFuture scheduledFuture;
        synchronized (zzxkVar.zzh) {
            try {
                if (zzxkVar.zze == 2 && !zzxkVar.zzg.get() && (scheduledFuture = zzxkVar.zzc) != null && !scheduledFuture.isCancelled()) {
                    if (zzxkVar.zzn > 1.0f && zzxkVar.zza() >= zzxkVar.zza.zzi()) {
                        zzf.f("AutoZoom", "Reset zoom = 1");
                        zzxkVar.zzl(1.0f, zzrc.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzg(zzxk zzxkVar, float f10) {
        synchronized (zzxkVar.zzh) {
            zzxkVar.zzn = f10;
            zzxkVar.zzr(false);
        }
    }

    private final float zzp(float f10) {
        float f11 = this.zzo;
        if (f10 < 1.0f) {
            f10 = 1.0f;
        }
        return (f11 <= 0.0f || f10 <= f11) ? f10 : f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzq(zzrc zzrcVar, float f10, float f11, zzxn zzxnVar) {
        long jConvert;
        if (this.zzd != null) {
            zzuo zzuoVar = new zzuo();
            zzuoVar.zza(this.zzl);
            String str = this.zzd;
            str.getClass();
            zzuoVar.zze(str);
            zzuoVar.zzf(Float.valueOf(f10));
            zzuoVar.zzc(Float.valueOf(f11));
            synchronized (this.zzh) {
                jConvert = TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzq, TimeUnit.NANOSECONDS);
            }
            zzuoVar.zzb(Long.valueOf(jConvert));
            if (zzxnVar != null) {
                zzup zzupVar = new zzup();
                zzupVar.zzc(Float.valueOf(zzxnVar.zzc()));
                zzupVar.zze(Float.valueOf(zzxnVar.zze()));
                zzupVar.zzb(Float.valueOf(zzxnVar.zzb()));
                zzupVar.zzd(Float.valueOf(zzxnVar.zzd()));
                zzupVar.zza(Float.valueOf(0.0f));
                zzuoVar.zzd(zzupVar.zzf());
            }
            zzwp zzwpVar = this.zzk;
            zzrd zzrdVar = new zzrd();
            zzrdVar.zzi(zzuoVar.zzh());
            zzwpVar.zzd(zzws.zzf(zzrdVar), zzrcVar);
        }
    }

    private final void zzr(boolean z10) {
        ScheduledFuture scheduledFuture;
        synchronized (this.zzh) {
            try {
                this.zzb.zzs();
                this.zzp = this.zzj.zza();
                if (z10 && (scheduledFuture = this.zzc) != null) {
                    scheduledFuture.cancel(false);
                    this.zzc = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final long zza() {
        long jConvert;
        synchronized (this.zzh) {
            jConvert = TimeUnit.MILLISECONDS.convert(this.zzj.zza() - this.zzp, TimeUnit.NANOSECONDS);
        }
        return jConvert;
    }

    public final /* synthetic */ zzet zzc(float f10) {
        com.google.mlkit.vision.barcode.internal.zze zzeVar = this.zzs;
        float fZzp = zzp(f10);
        ZoomSuggestionOptions zoomSuggestionOptions = zzeVar.zza;
        int i10 = com.google.mlkit.vision.barcode.internal.zzh.zzc;
        if (true != zoomSuggestionOptions.zzb().setZoom(fZzp)) {
            fZzp = 0.0f;
        }
        return zzej.zza(Float.valueOf(fZzp));
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0247 A[Catch: all -> 0x0199, TryCatch #0 {all -> 0x0199, blocks: (B:51:0x0188, B:53:0x0196, B:57:0x019c, B:58:0x01c8, B:60:0x01ce, B:63:0x01f7, B:65:0x0206, B:67:0x0215, B:69:0x0220, B:70:0x0245, B:72:0x0247, B:73:0x0264), top: B:82:0x0188, outer: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x0247, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi(int i10, zzxn zzxnVar) {
        float fZzf;
        synchronized (this.zzh) {
            try {
                if (this.zze != 2) {
                    return;
                }
                if (zzxnVar.zzh() && (!this.zza.zzl() || this.zza.zzb() <= 0.0f)) {
                    if (!this.zzr) {
                        zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                        float f10 = this.zzn;
                        zzq(zzrcVar, f10, f10, zzxnVar);
                        this.zzr = true;
                    }
                    g gVar = zzf;
                    Locale locale = Locale.getDefault();
                    Float fValueOf = Float.valueOf(zzxnVar.zzc());
                    Float fValueOf2 = Float.valueOf(zzxnVar.zze());
                    Float fValueOf3 = Float.valueOf(zzxnVar.zzb());
                    Float fValueOf4 = Float.valueOf(zzxnVar.zzd());
                    Float fValueOf5 = Float.valueOf(0.0f);
                    Integer numValueOf = Integer.valueOf(i10);
                    gVar.f("AutoZoom", String.format(locale, "Process PredictedArea: [%.2f, %.2f, %.2f, %.2f, %.2f], frameIndex = %d", fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, numValueOf));
                    this.zzb.zzt(numValueOf, zzxnVar);
                    Set setZzw = this.zzb.zzw();
                    if (setZzw.size() - 1 > this.zza.zzh()) {
                        Iterator it = setZzw.iterator();
                        int i11 = i10;
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            if (i11 > iIntValue) {
                                i11 = iIntValue;
                            }
                        }
                        zzf.f("AutoZoom", "Removing recent frameIndex = " + i11);
                        this.zzb.zzf(Integer.valueOf(i11));
                    }
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : this.zzb.zzu()) {
                        if (((Integer) entry.getKey()).intValue() != i10) {
                            zzxn zzxnVar2 = (zzxn) entry.getValue();
                            if (zzxnVar2.zzh() && zzxnVar.zzh()) {
                                zzxg zzxgVar = new zzxg(Math.max(zzxnVar2.zzc(), zzxnVar.zzc()), Math.max(zzxnVar2.zze(), zzxnVar.zze()), Math.min(zzxnVar2.zzb(), zzxnVar.zzb()), Math.min(zzxnVar2.zzd(), zzxnVar.zzd()), 0.0f);
                                fZzf = zzxgVar.zzf() / ((zzxnVar2.zzf() + zzxnVar.zzf()) - zzxgVar.zzf());
                            } else {
                                fZzf = 0.0f;
                            }
                            if (fZzf >= this.zza.zzd()) {
                                hashSet.add((Integer) entry.getKey());
                            }
                        }
                    }
                    if (hashSet.size() >= this.zza.zzg() || (this.zza.zzl() && this.zza.zza() <= 0.0f)) {
                        synchronized (this.zzh) {
                            try {
                                if (zza() >= this.zza.zzj()) {
                                    zzdv zzdvVarListIterator = zzcs.zzi(Float.valueOf(zzxnVar.zzc()), Float.valueOf(zzxnVar.zze()), Float.valueOf(zzxnVar.zzb()), Float.valueOf(zzxnVar.zzd())).listIterator(0);
                                    float f11 = 1.0E9f;
                                    while (zzdvVarListIterator.hasNext()) {
                                        float fZzc = (this.zza.zzc() / 2.0f) / Math.max(Math.abs(((Float) zzdvVarListIterator.next()).floatValue() - 0.5f), 0.001f);
                                        if (f11 > fZzc) {
                                            f11 = fZzc;
                                        }
                                    }
                                    float fZzp = zzp(this.zzn * f11);
                                    if (this.zza.zzk()) {
                                        float f12 = this.zzn;
                                        float f13 = (fZzp - f12) / f12;
                                        if (f13 > this.zza.zze() || f13 < (-this.zza.zzf())) {
                                            zzf.f("AutoZoom", "Going to set zoom = " + fZzp);
                                            zzl(fZzp, zzrc.SCANNER_AUTO_ZOOM_AUTO_ZOOM, zzxnVar);
                                        } else {
                                            zzf.f("AutoZoom", "Auto zoom to " + fZzp + " is filtered by threshold");
                                            this.zzp = this.zzj.zza();
                                        }
                                    } else {
                                        zzf.f("AutoZoom", "Going to set zoom = " + fZzp);
                                        zzl(fZzp, zzrc.SCANNER_AUTO_ZOOM_AUTO_ZOOM, zzxnVar);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void zzj() {
        synchronized (this.zzh) {
            try {
                if (this.zze == 4) {
                    return;
                }
                zzn(false);
                this.zzi.shutdown();
                this.zze = 4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzk(float f10) {
        synchronized (this.zzh) {
            zzaz.zzd(f10 >= 1.0f);
            this.zzo = f10;
        }
    }

    public final void zzl(float f10, zzrc zzrcVar, zzxn zzxnVar) {
        synchronized (this.zzh) {
            try {
                if (this.zzm != null && this.zzs != null && this.zze == 2) {
                    if (this.zzg.compareAndSet(false, true)) {
                        zzej.zzb(zzej.zzc(new zzxh(this, f10), this.zzm), new zzxj(this, zzrcVar, this.zzn, zzxnVar, f10), zzeu.zza());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzm() {
        synchronized (this.zzh) {
            try {
                int i10 = this.zze;
                if (i10 != 2 && i10 != 4) {
                    zzr(true);
                    this.zzc = this.zzi.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzxi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzxk.zzf(this.zza);
                        }
                    }, 500L, 500L, TimeUnit.MILLISECONDS);
                    if (this.zze == 1) {
                        this.zzd = UUID.randomUUID().toString();
                        this.zzq = this.zzj.zza();
                        this.zzr = false;
                        zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_START;
                        float f10 = this.zzn;
                        zzq(zzrcVar, f10, f10, null);
                    } else {
                        zzrc zzrcVar2 = zzrc.SCANNER_AUTO_ZOOM_RESUME;
                        float f11 = this.zzn;
                        zzq(zzrcVar2, f11, f11, null);
                    }
                    this.zze = 2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzn(boolean z10) {
        synchronized (this.zzh) {
            try {
                int i10 = this.zze;
                if (i10 != 1 && i10 != 4) {
                    zzr(true);
                    if (z10) {
                        if (!this.zzr) {
                            zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                            float f10 = this.zzn;
                            zzq(zzrcVar, f10, f10, null);
                        }
                        zzrc zzrcVar2 = zzrc.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
                        float f11 = this.zzn;
                        zzq(zzrcVar2, f11, f11, null);
                    } else {
                        zzrc zzrcVar3 = zzrc.SCANNER_AUTO_ZOOM_SCAN_FAILED;
                        float f12 = this.zzn;
                        zzq(zzrcVar3, f12, f12, null);
                    }
                    this.zzr = false;
                    this.zze = 1;
                    this.zzd = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzo(com.google.mlkit.vision.barcode.internal.zze zzeVar, Executor executor) {
        this.zzs = zzeVar;
        this.zzm = executor;
    }
}
