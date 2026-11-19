package ob;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f27145a;

    @NonNull
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Bundle f27147d;

    public c6(@NonNull String str, @NonNull String str2, Bundle bundle, long j10) {
        this.f27145a = str;
        this.b = str2;
        this.f27147d = bundle;
        this.f27146c = j10;
    }

    public static c6 a(i0 i0Var) {
        return new c6(i0Var.f27456f, i0Var.f27458h, i0Var.f27457g.D3(), i0Var.f27459i);
    }

    public final i0 b() {
        return new i0(this.f27145a, new g0(new Bundle(this.f27147d)), this.b, this.f27146c);
    }

    public final String toString() {
        String str = this.b;
        String string = this.f27147d.toString();
        int length = String.valueOf(str).length();
        String str2 = this.f27145a;
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
