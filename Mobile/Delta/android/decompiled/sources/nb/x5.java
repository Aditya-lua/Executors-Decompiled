package nb;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;

/* JADX INFO: loaded from: classes.dex */
public final class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f26088a;

    @NonNull
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Bundle f26090d;

    public x5(@NonNull String str, @NonNull String str2, Bundle bundle, long j10) {
        this.f26088a = str;
        this.b = str2;
        this.f26090d = bundle;
        this.f26089c = j10;
    }

    public static x5 a(zzbg zzbgVar) {
        return new x5(zzbgVar.f7422f, zzbgVar.f7424h, zzbgVar.f7423g.y3(), zzbgVar.f7425i);
    }

    public final zzbg b() {
        return new zzbg(this.f26088a, new zzbe(new Bundle(this.f26090d)), this.b, this.f26089c);
    }

    public final String toString() {
        String str = this.b;
        String string = this.f26090d.toString();
        int length = String.valueOf(str).length();
        String str2 = this.f26088a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(string);
        return sb2.toString();
    }
}
