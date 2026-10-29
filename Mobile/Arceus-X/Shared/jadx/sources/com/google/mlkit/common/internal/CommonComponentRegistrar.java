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
import p292mf.C8492c;
import p292mf.C8511r;
import p292mf.InterfaceC8494d;
import p292mf.InterfaceC8500g;

/* JADX INFO: loaded from: classes2.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int zza = 0;

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        return zzaf.zzi(SharedPrefManager.COMPONENT, C8492c.m34274c(ModelFileHelper.class).m34291b(C8511r.m34359j(MlKitContext.class)).m34295f(new InterfaceC8500g() { // from class: com.google.mlkit.common.internal.zza
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return new ModelFileHelper((MlKitContext) interfaceC8494d.mo34304a(MlKitContext.class));
            }
        }).m34293d(), C8492c.m34274c(MlKitThreadPool.class).m34295f(new InterfaceC8500g() { // from class: com.google.mlkit.common.internal.zzb
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return new MlKitThreadPool();
            }
        }).m34293d(), C8492c.m34274c(RemoteModelManager.class).m34291b(C8511r.m34362m(RemoteModelManager.RemoteModelManagerRegistration.class)).m34295f(new InterfaceC8500g() { // from class: com.google.mlkit.common.internal.zzc
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return new RemoteModelManager(interfaceC8494d.m34307d(RemoteModelManager.RemoteModelManagerRegistration.class));
            }
        }).m34293d(), C8492c.m34274c(ExecutorSelector.class).m34291b(C8511r.m34361l(MlKitThreadPool.class)).m34295f(new InterfaceC8500g() { // from class: com.google.mlkit.common.internal.zzd
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return new ExecutorSelector(interfaceC8494d.mo34310g(MlKitThreadPool.class));
            }
        }).m34293d(), C8492c.m34274c(Cleaner.class).m34295f(new InterfaceC8500g() { // from class: com.google.mlkit.common.internal.zze
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return Cleaner.create();
            }
        }).m34293d(), C8492c.m34274c(CloseGuard.Factory.class).m34291b(C8511r.m34359j(Cleaner.class)).m34295f(new InterfaceC8500g() { // from class: com.google.mlkit.common.internal.zzf
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return new CloseGuard.Factory((Cleaner) interfaceC8494d.mo34304a(Cleaner.class));
            }
        }).m34293d(), C8492c.m34274c(com.google.mlkit.common.internal.model.zzg.class).m34291b(C8511r.m34359j(MlKitContext.class)).m34295f(new InterfaceC8500g() { // from class: com.google.mlkit.common.internal.zzg
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return new com.google.mlkit.common.internal.model.zzg((MlKitContext) interfaceC8494d.mo34304a(MlKitContext.class));
            }
        }).m34293d(), C8492c.m34279m(RemoteModelManager.RemoteModelManagerRegistration.class).m34291b(C8511r.m34361l(com.google.mlkit.common.internal.model.zzg.class)).m34295f(new InterfaceC8500g() { // from class: com.google.mlkit.common.internal.zzh
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return new RemoteModelManager.RemoteModelManagerRegistration(CustomRemoteModel.class, interfaceC8494d.mo34310g(com.google.mlkit.common.internal.model.zzg.class));
            }
        }).m34293d());
    }
}
