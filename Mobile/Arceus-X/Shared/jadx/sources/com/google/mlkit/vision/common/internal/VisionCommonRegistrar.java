package com.google.mlkit.vision.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p292mf.C8492c;
import p292mf.C8511r;
import p292mf.InterfaceC8494d;
import p292mf.InterfaceC8500g;

/* JADX INFO: loaded from: classes2.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzp.zzi(C8492c.m34274c(MultiFlavorDetectorCreator.class).m34291b(C8511r.m34362m(MultiFlavorDetectorCreator.Registration.class)).m34295f(new InterfaceC8500g() { // from class: com.google.mlkit.vision.common.internal.zzf
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return new MultiFlavorDetectorCreator(interfaceC8494d.m34307d(MultiFlavorDetectorCreator.Registration.class));
            }
        }).m34293d());
    }
}
