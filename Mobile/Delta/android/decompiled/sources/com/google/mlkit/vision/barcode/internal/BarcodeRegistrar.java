package com.google.mlkit.vision.barcode.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.List;
import lf.c;
import lf.d;
import lf.g;
import lf.r;

/* JADX INFO: loaded from: classes2.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzcs.zzh(c.c(zzi.class).b(r.j(MlKitContext.class)).f(new g() { // from class: com.google.mlkit.vision.barcode.internal.zzc
            @Override // lf.g
            public final Object create(d dVar) {
                return new zzi((MlKitContext) dVar.a(MlKitContext.class));
            }
        }).d(), c.c(zzg.class).b(r.j(zzi.class)).b(r.j(ExecutorSelector.class)).b(r.j(MlKitContext.class)).f(new g() { // from class: com.google.mlkit.vision.barcode.internal.zzd
            @Override // lf.g
            public final Object create(d dVar) {
                return new zzg((zzi) dVar.a(zzi.class), (ExecutorSelector) dVar.a(ExecutorSelector.class), (MlKitContext) dVar.a(MlKitContext.class));
            }
        }).d());
    }
}
