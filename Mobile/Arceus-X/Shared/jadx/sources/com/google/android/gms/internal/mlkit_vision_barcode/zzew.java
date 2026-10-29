package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes.dex */
final class zzew extends zzef implements RunnableFuture {
    private volatile zzer zzc;

    public zzew(zzxh zzxhVar) {
        this.zzc = new zzev(this, zzxhVar);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzer zzerVar = this.zzc;
        if (zzerVar != null) {
            zzerVar.run();
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz
    public final String zzf() {
        zzer zzerVar = this.zzc;
        if (zzerVar == null) {
            return super.zzf();
        }
        return "task=[" + zzerVar.toString() + "]";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdz
    public final void zzm() {
        zzer zzerVar;
        if (zzp() && (zzerVar = this.zzc) != null) {
            zzerVar.zze();
        }
        this.zzc = null;
    }
}
