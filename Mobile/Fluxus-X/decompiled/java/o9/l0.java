package o9;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseIntArray f26994a = new SparseIntArray();
    public k9.f b;

    public l0(@NonNull k9.f fVar) {
        s.l(fVar);
        this.b = fVar;
    }

    public final int a(Context context, int i10) {
        return this.f26994a.get(i10, -1);
    }

    @ResultIgnorabilityUnspecified
    public final int b(@NonNull Context context, @NonNull l9.a.f fVar) {
        s.l(context);
        s.l(fVar);
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
            if (i10 >= this.f26994a.size()) {
                iH = -1;
                break;
            }
            int iKeyAt = this.f26994a.keyAt(i10);
            if (iKeyAt > minApkVersion && this.f26994a.get(iKeyAt) == 0) {
                break;
            }
            i10++;
        }
        if (iH == -1) {
            iH = this.b.h(context, minApkVersion);
        }
        this.f26994a.put(minApkVersion, iH);
        return iH;
    }

    public final void c() {
        this.f26994a.clear();
    }
}
