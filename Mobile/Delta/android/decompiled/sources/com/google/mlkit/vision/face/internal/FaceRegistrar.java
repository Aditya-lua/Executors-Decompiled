package com.google.mlkit.vision.face.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_face.zzbn;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.List;
import lf.c;
import lf.d;
import lf.g;
import lf.r;

/* JADX INFO: loaded from: classes2.dex */
public class FaceRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzbn.zzi(c.c(zze.class).b(r.j(MlKitContext.class)).f(new g() { // from class: com.google.mlkit.vision.face.internal.zzk
            @Override // lf.g
            public final Object create(d dVar) {
                return new zze((MlKitContext) dVar.a(MlKitContext.class));
            }
        }).d(), c.c(zzc.class).b(r.j(zze.class)).b(r.j(ExecutorSelector.class)).f(new g() { // from class: com.google.mlkit.vision.face.internal.zzl
            @Override // lf.g
            public final Object create(d dVar) {
                return new zzc((zze) dVar.a(zze.class), (ExecutorSelector) dVar.a(ExecutorSelector.class));
            }
        }).d());
    }
}
