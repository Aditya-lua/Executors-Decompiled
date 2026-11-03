package ae;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements be.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.y0 f447a;

    public m(be.y0 y0Var) {
        this.f447a = y0Var;
    }

    @Override // be.y0
    public final /* bridge */ /* synthetic */ Object zza() {
        String string;
        Context contextA = ((k) this.f447a).a();
        try {
            Bundle bundle = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128).metaData;
            if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                return new File(contextA.getExternalFilesDir(null), string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
