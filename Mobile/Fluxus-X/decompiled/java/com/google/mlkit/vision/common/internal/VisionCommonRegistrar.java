package com.google.mlkit.vision.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import of.c;
import of.d;
import of.g;
import of.r;

/* JADX INFO: loaded from: classes2.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzp.zzi(c.c(MultiFlavorDetectorCreator.class).b(r.m(MultiFlavorDetectorCreator.Registration.class)).f(new g() { // from class: com.google.mlkit.vision.common.internal.zzf
            @Override // of.g
            public final Object create(d dVar) {
                return new MultiFlavorDetectorCreator(dVar.c(MultiFlavorDetectorCreator.Registration.class));
            }
        }).d());
    }
}
