package com.google.mlkit.vision.face.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_face.zzbn;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.List;
import p292mf.C8492c;
import p292mf.C8511r;
import p292mf.InterfaceC8494d;
import p292mf.InterfaceC8500g;

/* JADX INFO: loaded from: classes2.dex */
public class FaceRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzbn.zzi(C8492c.m34274c(zze.class).m34291b(C8511r.m34359j(MlKitContext.class)).m34295f(new InterfaceC8500g() { // from class: com.google.mlkit.vision.face.internal.zzk
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return new zze((MlKitContext) interfaceC8494d.mo34304a(MlKitContext.class));
            }
        }).m34293d(), C8492c.m34274c(zzc.class).m34291b(C8511r.m34359j(zze.class)).m34291b(C8511r.m34359j(ExecutorSelector.class)).m34295f(new InterfaceC8500g() { // from class: com.google.mlkit.vision.face.internal.zzl
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return new zzc((zze) interfaceC8494d.mo34304a(zze.class), (ExecutorSelector) interfaceC8494d.mo34304a(ExecutorSelector.class));
            }
        }).m34293d());
    }
}
