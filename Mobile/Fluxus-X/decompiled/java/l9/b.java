package l9;

import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class b extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @Deprecated
    public final Status f21986a;

    public b(@NonNull Status status) {
        int iC3 = status.C3();
        String strD3 = status.D3() != null ? status.D3() : BuildConfig.FLAVOR;
        StringBuilder sb2 = new StringBuilder(String.valueOf(iC3).length() + 2 + String.valueOf(strD3).length());
        sb2.append(iC3);
        sb2.append(": ");
        sb2.append(strD3);
        super(sb2.toString());
        this.f21986a = status;
    }

    @NonNull
    public Status a() {
        return this.f21986a;
    }

    public int b() {
        return this.f21986a.C3();
    }
}
