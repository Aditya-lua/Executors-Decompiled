package com.google.mlkit.vision.text.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.List;
import p292mf.C8492c;
import p292mf.C8511r;
import p292mf.InterfaceC8494d;
import p292mf.InterfaceC8500g;

/* JADX INFO: loaded from: classes2.dex */
public class TextRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzbk.zzi(C8492c.m34274c(zzp.class).m34291b(C8511r.m34359j(MlKitContext.class)).m34295f(new InterfaceC8500g() { // from class: com.google.mlkit.vision.text.internal.zzs
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return new zzp((MlKitContext) interfaceC8494d.mo34304a(MlKitContext.class));
            }
        }).m34293d(), C8492c.m34274c(zzo.class).m34291b(C8511r.m34359j(zzp.class)).m34291b(C8511r.m34359j(ExecutorSelector.class)).m34295f(new InterfaceC8500g() { // from class: com.google.mlkit.vision.text.internal.zzt
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return new zzo((zzp) interfaceC8494d.mo34304a(zzp.class), (ExecutorSelector) interfaceC8494d.mo34304a(ExecutorSelector.class));
            }
        }).m34293d());
    }
}
