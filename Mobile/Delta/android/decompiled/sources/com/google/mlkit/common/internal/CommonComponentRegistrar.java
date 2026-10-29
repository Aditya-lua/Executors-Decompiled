package com.google.mlkit.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.common.model.CustomRemoteModel;
import com.google.mlkit.common.model.RemoteModelManager;
import com.google.mlkit.common.sdkinternal.Cleaner;
import com.google.mlkit.common.sdkinternal.CloseGuard;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.MlKitThreadPool;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import java.util.List;
import lf.c;
import lf.d;
import lf.g;
import lf.r;

/* JADX INFO: loaded from: classes2.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzaf.zzi(SharedPrefManager.COMPONENT, c.c(ModelFileHelper.class).b(r.j(MlKitContext.class)).f(new g() { // from class: com.google.mlkit.common.internal.zza
            @Override // lf.g
            public final Object create(d dVar) {
                return new ModelFileHelper((MlKitContext) dVar.a(MlKitContext.class));
            }
        }).d(), c.c(MlKitThreadPool.class).f(new g() { // from class: com.google.mlkit.common.internal.zzb
            @Override // lf.g
            public final Object create(d dVar) {
                return new MlKitThreadPool();
            }
        }).d(), c.c(RemoteModelManager.class).b(r.m(RemoteModelManager.RemoteModelManagerRegistration.class)).f(new g() { // from class: com.google.mlkit.common.internal.zzc
            @Override // lf.g
            public final Object create(d dVar) {
                return new RemoteModelManager(dVar.b(RemoteModelManager.RemoteModelManagerRegistration.class));
            }
        }).d(), c.c(ExecutorSelector.class).b(r.l(MlKitThreadPool.class)).f(new g() { // from class: com.google.mlkit.common.internal.zzd
            @Override // lf.g
            public final Object create(d dVar) {
                return new ExecutorSelector(dVar.d(MlKitThreadPool.class));
            }
        }).d(), c.c(Cleaner.class).f(new g() { // from class: com.google.mlkit.common.internal.zze
            @Override // lf.g
            public final Object create(d dVar) {
                return Cleaner.create();
            }
        }).d(), c.c(CloseGuard.Factory.class).b(r.j(Cleaner.class)).f(new g() { // from class: com.google.mlkit.common.internal.zzf
            @Override // lf.g
            public final Object create(d dVar) {
                return new CloseGuard.Factory((Cleaner) dVar.a(Cleaner.class));
            }
        }).d(), c.c(com.google.mlkit.common.internal.model.zzg.class).b(r.j(MlKitContext.class)).f(new g() { // from class: com.google.mlkit.common.internal.zzg
            @Override // lf.g
            public final Object create(d dVar) {
                return new com.google.mlkit.common.internal.model.zzg((MlKitContext) dVar.a(MlKitContext.class));
            }
        }).d(), c.m(RemoteModelManager.RemoteModelManagerRegistration.class).b(r.l(com.google.mlkit.common.internal.model.zzg.class)).f(new g() { // from class: com.google.mlkit.common.internal.zzh
            @Override // lf.g
            public final Object create(d dVar) {
                return new RemoteModelManager.RemoteModelManagerRegistration(CustomRemoteModel.class, dVar.d(com.google.mlkit.common.internal.model.zzg.class));
            }
        }).d());
    }
}
