package com.google.android.gms.internal.mlkit_common;

import com.appsflyer.sdk_base.referrer.Payload;
import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzgr implements e {
    static final zzgr zza = new zzgr();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;
    private static final d zzi;
    private static final d zzj;

    static {
        d.b bVarA = d.a("name");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = bVarA.b(zzayVar.zzb()).a();
        d.b bVarA2 = d.a("version");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = bVarA2.b(zzayVar2.zzb()).a();
        d.b bVarA3 = d.a(Payload.SOURCE);
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = bVarA3.b(zzayVar3.zzb()).a();
        d.b bVarA4 = d.a("uri");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = bVarA4.b(zzayVar4.zzb()).a();
        d.b bVarA5 = d.a("hash");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        zzf = bVarA5.b(zzayVar5.zzb()).a();
        d.b bVarA6 = d.a("modelType");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        zzg = bVarA6.b(zzayVar6.zzb()).a();
        d.b bVarA7 = d.a("size");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        zzh = bVarA7.b(zzayVar7.zzb()).a();
        d.b bVarA8 = d.a("hasLabelMap");
        zzay zzayVar8 = new zzay();
        zzayVar8.zza(8);
        zzi = bVarA8.b(zzayVar8.zzb()).a();
        d.b bVarA9 = d.a("isManifestModel");
        zzay zzayVar9 = new zzay();
        zzayVar9.zza(9);
        zzj = bVarA9.b(zzayVar9.zzb()).a();
    }

    private zzgr() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zznh zznhVar = (zznh) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zznhVar.zzd());
        fVar2.add(zzc, (Object) null);
        fVar2.add(zzd, zznhVar.zzb());
        fVar2.add(zze, (Object) null);
        fVar2.add(zzf, zznhVar.zzc());
        fVar2.add(zzg, zznhVar.zza());
        fVar2.add(zzh, (Object) null);
        fVar2.add(zzi, (Object) null);
        fVar2.add(zzj, (Object) null);
    }
}
