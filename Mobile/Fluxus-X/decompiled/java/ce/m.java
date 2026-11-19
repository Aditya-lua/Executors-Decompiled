package ce;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements de.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final de.y0 f4994a;

    public m(de.y0 y0Var) {
        this.f4994a = y0Var;
    }

    @Override // de.y0
    public final /* bridge */ /* synthetic */ Object zza() {
        String string;
        Context contextA = ((k) this.f4994a).a();
        try {
            Bundle bundle = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), Barcode.FORMAT_ITF).metaData;
            if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                return new File(contextA.getExternalFilesDir(null), string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
