package com.google.mlkit.vision.barcode.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.List;
import p292mf.C8492c;
import p292mf.C8511r;
import p292mf.InterfaceC8494d;
import p292mf.InterfaceC8500g;

/* JADX INFO: loaded from: classes2.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzcs.zzh(C8492c.m34274c(zzi.class).m34291b(C8511r.m34359j(MlKitContext.class)).m34295f(new InterfaceC8500g() { // from class: com.google.mlkit.vision.barcode.internal.zzc
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return new zzi((MlKitContext) interfaceC8494d.mo34304a(MlKitContext.class));
            }
        }).m34293d(), C8492c.m34274c(zzg.class).m34291b(C8511r.m34359j(zzi.class)).m34291b(C8511r.m34359j(ExecutorSelector.class)).m34291b(C8511r.m34359j(MlKitContext.class)).m34295f(new InterfaceC8500g() { // from class: com.google.mlkit.vision.barcode.internal.zzd
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return new zzg((zzi) interfaceC8494d.mo34304a(zzi.class), (ExecutorSelector) interfaceC8494d.mo34304a(ExecutorSelector.class), (MlKitContext) interfaceC8494d.mo34304a(MlKitContext.class));
            }
        }).m34293d());
    }
}
