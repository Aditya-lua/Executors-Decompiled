package com.google.android.gms.internal.mlkit_vision_face;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzgh implements e {
    static final zzgh zza = new zzgh();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;

    static {
        d.b bVarA = d.a("imageFormat");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = bVarA.b(zzcqVar.zzb()).a();
        d.b bVarA2 = d.a("originalImageSize");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = bVarA2.b(zzcqVar2.zzb()).a();
        d.b bVarA3 = d.a("compressedImageSize");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = bVarA3.b(zzcqVar3.zzb()).a();
        d.b bVarA4 = d.a("isOdmlImage");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = bVarA4.b(zzcqVar4.zzb()).a();
    }

    private zzgh() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzkh zzkhVar = (zzkh) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzkhVar.zza());
        fVar2.add(zzc, zzkhVar.zzb());
        fVar2.add(zzd, (Object) null);
        fVar2.add(zze, (Object) null);
    }
}
