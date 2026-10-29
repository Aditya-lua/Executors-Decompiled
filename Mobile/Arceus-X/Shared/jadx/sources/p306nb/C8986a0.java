package p306nb;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzbe;
import java.util.Iterator;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8986a0 {

    /* JADX INFO: renamed from: a */
    public final String f32660a;

    /* JADX INFO: renamed from: b */
    public final String f32661b;

    /* JADX INFO: renamed from: c */
    public final String f32662c;

    /* JADX INFO: renamed from: d */
    public final long f32663d;

    /* JADX INFO: renamed from: e */
    public final long f32664e;

    /* JADX INFO: renamed from: f */
    public final zzbe f32665f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8986a0(C9094g7 c9094g7, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        zzbe zzbeVar;
        C8953m.m36041f(str2);
        C8953m.m36041f(str3);
        this.f32660a = str2;
        this.f32661b = str3;
        this.f32662c = true == TextUtils.isEmpty(str) ? null : str;
        this.f32663d = j10;
        this.f32664e = j11;
        if (j11 != 0 && j11 > j10) {
            c9094g7.mo36321a().m37006r().m36912b("Event created with reverse previous/current timestamps. appId", C9348w5.m36998x(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbeVar = new zzbe(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c9094g7.mo36321a().m37003o().m36911a("Param name can't be null");
                    it.remove();
                } else {
                    Object objM36974s = c9094g7.m36308C().m36974s(next, bundle2.get(next));
                    if (objM36974s == null) {
                        c9094g7.mo36321a().m37006r().m36912b("Param value can't be null", c9094g7.m36309D().m36621b(next));
                        it.remove();
                    } else {
                        c9094g7.m36308C().m36934A(bundle2, next, objM36974s);
                    }
                }
            }
            zzbeVar = new zzbe(bundle2);
        }
        this.f32665f = zzbeVar;
    }

    /* JADX INFO: renamed from: a */
    public final C8986a0 m36087a(C9094g7 c9094g7, long j10) {
        return new C8986a0(c9094g7, this.f32662c, this.f32660a, this.f32661b, this.f32663d, j10, this.f32665f);
    }

    public final String toString() {
        String string = this.f32665f.toString();
        String str = this.f32660a;
        int length = String.valueOf(str).length();
        String str2 = this.f32661b;
        StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        sb2.append("Event{appId='");
        sb2.append(str);
        sb2.append("', name='");
        sb2.append(str2);
        sb2.append("', params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    public C8986a0(C9094g7 c9094g7, String str, String str2, String str3, long j10, long j11, zzbe zzbeVar) {
        C8953m.m36041f(str2);
        C8953m.m36041f(str3);
        C8953m.m36047l(zzbeVar);
        this.f32660a = str2;
        this.f32661b = str3;
        this.f32662c = true == TextUtils.isEmpty(str) ? null : str;
        this.f32663d = j10;
        this.f32664e = j11;
        if (j11 != 0 && j11 > j10) {
            c9094g7.mo36321a().m37006r().m36913c("Event created with reverse previous/current timestamps. appId, name", C9348w5.m36998x(str2), C9348w5.m36998x(str3));
        }
        this.f32665f = zzbeVar;
    }
}
