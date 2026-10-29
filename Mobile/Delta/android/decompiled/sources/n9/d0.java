package n9;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseIntArray f25249a = new SparseIntArray();
    public j9.d b;

    public d0(@NonNull j9.d dVar) {
        m.l(dVar);
        this.b = dVar;
    }

    public final int a(Context context, int i10) {
        return this.f25249a.get(i10, -1);
    }

    @ResultIgnorabilityUnspecified
    public final int b(@NonNull Context context, @NonNull k9.a.f fVar) {
        m.l(context);
        m.l(fVar);
        int iH = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int iA = a(context, minApkVersion);
        if (iA != -1) {
            return iA;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.f25249a.size()) {
                iH = -1;
                break;
            }
            int iKeyAt = this.f25249a.keyAt(i10);
            if (iKeyAt > minApkVersion && this.f25249a.get(iKeyAt) == 0) {
                break;
            }
            i10++;
        }
        if (iH == -1) {
            iH = this.b.h(context, minApkVersion);
        }
        this.f25249a.put(minApkVersion, iH);
        return iH;
    }

    public final void c() {
        this.f25249a.clear();
    }
}
