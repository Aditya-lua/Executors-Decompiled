package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.NonNull;
import java.io.IOException;
import qf.c;
import qf.d;
import qf.h;

/* JADX INFO: loaded from: classes.dex */
final class zzfk implements h {
    private boolean zza = false;
    private boolean zzb = false;
    private d zzc;
    private final zzfg zzd;

    public zzfk(zzfg zzfgVar) {
        this.zzd = zzfgVar;
    }

    private final void zzb() {
        if (this.zza) {
            throw new c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.zza = true;
    }

    @NonNull
    public final h add(double d10) throws IOException {
        zzb();
        this.zzd.zza(this.zzc, d10, this.zzb);
        return this;
    }

    public final void zza(d dVar, boolean z10) {
        this.zza = false;
        this.zzc = dVar;
        this.zzb = z10;
    }

    @NonNull
    public final h add(float f10) throws IOException {
        zzb();
        this.zzd.zzb(this.zzc, f10, this.zzb);
        return this;
    }

    @NonNull
    public final h add(int i10) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, i10, this.zzb);
        return this;
    }

    @NonNull
    public final h add(long j10) throws IOException {
        zzb();
        this.zzd.zze(this.zzc, j10, this.zzb);
        return this;
    }

    @Override // qf.h
    @NonNull
    public final h add(String str) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // qf.h
    @NonNull
    public final h add(boolean z10) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, z10 ? 1 : 0, this.zzb);
        return this;
    }

    @NonNull
    public final h add(@NonNull byte[] bArr) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }
}
