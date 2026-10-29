package nb;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzbe;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25314a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f25316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f25317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzbe f25318f;

    public a0(g7 g7Var, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        zzbe zzbeVar;
        n9.m.f(str2);
        n9.m.f(str3);
        this.f25314a = str2;
        this.b = str3;
        this.f25315c = true == TextUtils.isEmpty(str) ? null : str;
        this.f25316d = j10;
        this.f25317e = j11;
        if (j11 != 0 && j11 > j10) {
            g7Var.a().r().b("Event created with reverse previous/current timestamps. appId", w5.x(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbeVar = new zzbe(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    g7Var.a().o().a("Param name can't be null");
                    it.remove();
                } else {
                    Object objS = g7Var.C().s(next, bundle2.get(next));
                    if (objS == null) {
                        g7Var.a().r().b("Param value can't be null", g7Var.D().b(next));
                        it.remove();
                    } else {
                        g7Var.C().A(bundle2, next, objS);
                    }
                }
            }
            zzbeVar = new zzbe(bundle2);
        }
        this.f25318f = zzbeVar;
    }

    public final a0 a(g7 g7Var, long j10) {
        return new a0(g7Var, this.f25315c, this.f25314a, this.b, this.f25316d, j10, this.f25318f);
    }

    public final String toString() {
        String string = this.f25318f.toString();
        String str = this.f25314a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
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

    public a0(g7 g7Var, String str, String str2, String str3, long j10, long j11, zzbe zzbeVar) {
        n9.m.f(str2);
        n9.m.f(str3);
        n9.m.l(zzbeVar);
        this.f25314a = str2;
        this.b = str3;
        this.f25315c = true == TextUtils.isEmpty(str) ? null : str;
        this.f25316d = j10;
        this.f25317e = j11;
        if (j11 != 0 && j11 > j10) {
            g7Var.a().r().c("Event created with reverse previous/current timestamps. appId, name", w5.x(str2), w5.x(str3));
        }
        this.f25318f = zzbeVar;
    }
}
