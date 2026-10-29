package p305n9;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p213j9.C7091d;
import p242k9.C7491a;

/* JADX INFO: renamed from: n9.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8927d0 {

    /* JADX INFO: renamed from: a */
    public final SparseIntArray f32573a = new SparseIntArray();

    /* JADX INFO: renamed from: b */
    public C7091d f32574b;

    public C8927d0(@NonNull C7091d c7091d) {
        C8953m.m36047l(c7091d);
        this.f32574b = c7091d;
    }

    /* JADX INFO: renamed from: a */
    public final int m35975a(Context context, int i10) {
        return this.f32573a.get(i10, -1);
    }

    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: b */
    public final int m35976b(@NonNull Context context, @NonNull C7491a.f fVar) {
        C8953m.m36047l(context);
        C8953m.m36047l(fVar);
        int iMo29855h = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int iM35975a = m35975a(context, minApkVersion);
        if (iM35975a != -1) {
            return iM35975a;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.f32573a.size()) {
                iMo29855h = -1;
                break;
            }
            int iKeyAt = this.f32573a.keyAt(i10);
            if (iKeyAt > minApkVersion && this.f32573a.get(iKeyAt) == 0) {
                break;
            }
            i10++;
        }
        if (iMo29855h == -1) {
            iMo29855h = this.f32574b.mo29855h(context, minApkVersion);
        }
        this.f32573a.put(minApkVersion, iMo29855h);
        return iMo29855h;
    }

    /* JADX INFO: renamed from: c */
    public final void m35977c() {
        this.f32573a.clear();
    }
}
