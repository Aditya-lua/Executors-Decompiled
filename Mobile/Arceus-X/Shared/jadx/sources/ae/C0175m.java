package ae;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import be.InterfaceC1376y0;
import java.io.File;

/* JADX INFO: renamed from: ae.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C0175m implements InterfaceC1376y0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1376y0 f567a;

    public C0175m(InterfaceC1376y0 interfaceC1376y0) {
        this.f567a = interfaceC1376y0;
    }

    @Override // be.InterfaceC1376y0
    public final /* bridge */ /* synthetic */ Object zza() {
        String string;
        Context contextM527a = ((C0171k) this.f567a).m527a();
        try {
            Bundle bundle = contextM527a.getPackageManager().getApplicationInfo(contextM527a.getPackageName(), 128).metaData;
            if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                return new File(contextM527a.getExternalFilesDir(null), string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
