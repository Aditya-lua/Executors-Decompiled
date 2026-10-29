package p306nb;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;

/* JADX INFO: renamed from: nb.x5 */
/* JADX INFO: loaded from: classes.dex */
public final class C9364x5 {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final String f33631a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final String f33632b;

    /* JADX INFO: renamed from: c */
    public final long f33633c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Bundle f33634d;

    public C9364x5(@NonNull String str, @NonNull String str2, Bundle bundle, long j10) {
        this.f33631a = str;
        this.f33632b = str2;
        this.f33634d = bundle;
        this.f33633c = j10;
    }

    /* JADX INFO: renamed from: a */
    public static C9364x5 m37027a(zzbg zzbgVar) {
        return new C9364x5(zzbgVar.f9502f, zzbgVar.f9504h, zzbgVar.f9503g.m11882y3(), zzbgVar.f9505i);
    }

    /* JADX INFO: renamed from: b */
    public final zzbg m37028b() {
        return new zzbg(this.f33631a, new zzbe(new Bundle(this.f33634d)), this.f33632b, this.f33633c);
    }

    public final String toString() {
        String str = this.f33632b;
        String string = this.f33634d.toString();
        int length = String.valueOf(str).length();
        String str2 = this.f33631a;
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
