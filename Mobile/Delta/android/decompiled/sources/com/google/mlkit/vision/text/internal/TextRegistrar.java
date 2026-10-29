package com.google.mlkit.vision.text.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.List;
import lf.c;
import lf.d;
import lf.g;
import lf.r;

/* JADX INFO: loaded from: classes2.dex */
public class TextRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzbk.zzi(c.c(zzp.class).b(r.j(MlKitContext.class)).f(new g() { // from class: com.google.mlkit.vision.text.internal.zzs
            @Override // lf.g
            public final Object create(d dVar) {
                return new zzp((MlKitContext) dVar.a(MlKitContext.class));
            }
        }).d(), c.c(zzo.class).b(r.j(zzp.class)).b(r.j(ExecutorSelector.class)).f(new g() { // from class: com.google.mlkit.vision.text.internal.zzt
            @Override // lf.g
            public final Object create(d dVar) {
                return new zzo((zzp) dVar.a(zzp.class), (ExecutorSelector) dVar.a(ExecutorSelector.class));
            }
        }).d());
    }
}
