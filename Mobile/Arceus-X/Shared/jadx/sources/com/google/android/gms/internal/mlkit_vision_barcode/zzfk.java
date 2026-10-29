package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.NonNull;
import java.io.IOException;
import p410rf.C10867c;
import p410rf.C10868d;
import p410rf.InterfaceC10872h;

/* JADX INFO: loaded from: classes.dex */
final class zzfk implements InterfaceC10872h {
    private boolean zza = false;
    private boolean zzb = false;
    private C10868d zzc;
    private final zzfg zzd;

    public zzfk(zzfg zzfgVar) {
        this.zzd = zzfgVar;
    }

    private final void zzb() {
        if (this.zza) {
            throw new C10867c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.zza = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NonNull
    public final InterfaceC10872h add(double d10) throws IOException {
        zzb();
        this.zzd.zza(this.zzc, d10, this.zzb);
        return this;
    }

    public final void zza(C10868d c10868d, boolean z10) {
        this.zza = false;
        this.zzc = c10868d;
        this.zzb = z10;
    }

    @NonNull
    public final InterfaceC10872h add(float f10) throws IOException {
        zzb();
        this.zzd.zzb(this.zzc, f10, this.zzb);
        return this;
    }

    @NonNull
    public final InterfaceC10872h add(int i10) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, i10, this.zzb);
        return this;
    }

    @NonNull
    public final InterfaceC10872h add(long j10) throws IOException {
        zzb();
        this.zzd.zze(this.zzc, j10, this.zzb);
        return this;
    }

    @Override // p410rf.InterfaceC10872h
    @NonNull
    public final InterfaceC10872h add(String str) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // p410rf.InterfaceC10872h
    @NonNull
    public final InterfaceC10872h add(boolean z10) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, z10 ? 1 : 0, this.zzb);
        return this;
    }

    @NonNull
    public final InterfaceC10872h add(@NonNull byte[] bArr) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }
}
