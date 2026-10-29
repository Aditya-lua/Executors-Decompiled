package com.google.android.gms.internal.mlkit_common;

import com.appsflyer.sdk_base.referrer.Payload;
import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzgr implements InterfaceC10869e {
    static final zzgr zza = new zzgr();
    private static final C10868d zzb;
    private static final C10868d zzc;
    private static final C10868d zzd;
    private static final C10868d zze;
    private static final C10868d zzf;
    private static final C10868d zzg;
    private static final C10868d zzh;
    private static final C10868d zzi;
    private static final C10868d zzj;

    static {
        C10868d.b bVarM41320a = C10868d.m41320a("name");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = bVarM41320a.m41325b(zzayVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("version");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzayVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a(Payload.SOURCE);
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzayVar3.zzb()).m41324a();
        C10868d.b bVarM41320a4 = C10868d.m41320a("uri");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = bVarM41320a4.m41325b(zzayVar4.zzb()).m41324a();
        C10868d.b bVarM41320a5 = C10868d.m41320a("hash");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        zzf = bVarM41320a5.m41325b(zzayVar5.zzb()).m41324a();
        C10868d.b bVarM41320a6 = C10868d.m41320a("modelType");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        zzg = bVarM41320a6.m41325b(zzayVar6.zzb()).m41324a();
        C10868d.b bVarM41320a7 = C10868d.m41320a("size");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        zzh = bVarM41320a7.m41325b(zzayVar7.zzb()).m41324a();
        C10868d.b bVarM41320a8 = C10868d.m41320a("hasLabelMap");
        zzay zzayVar8 = new zzay();
        zzayVar8.zza(8);
        zzi = bVarM41320a8.m41325b(zzayVar8.zzb()).m41324a();
        C10868d.b bVarM41320a9 = C10868d.m41320a("isManifestModel");
        zzay zzayVar9 = new zzay();
        zzayVar9.zza(9);
        zzj = bVarM41320a9.m41325b(zzayVar9.zzb()).m41324a();
    }

    private zzgr() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        zznh zznhVar = (zznh) obj;
        InterfaceC10870f interfaceC10870f2 = interfaceC10870f;
        interfaceC10870f2.add(zzb, zznhVar.zzd());
        interfaceC10870f2.add(zzc, (Object) null);
        interfaceC10870f2.add(zzd, zznhVar.zzb());
        interfaceC10870f2.add(zze, (Object) null);
        interfaceC10870f2.add(zzf, zznhVar.zzc());
        interfaceC10870f2.add(zzg, zznhVar.zza());
        interfaceC10870f2.add(zzh, (Object) null);
        interfaceC10870f2.add(zzi, (Object) null);
        interfaceC10870f2.add(zzj, (Object) null);
    }
}
