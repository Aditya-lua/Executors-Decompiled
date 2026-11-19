package ob;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27173a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f27175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f27176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f27177f;

    public d0(l7 l7Var, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        g0 g0Var;
        o9.s.f(str2);
        o9.s.f(str3);
        this.f27173a = str2;
        this.b = str3;
        this.f27174c = true == TextUtils.isEmpty(str) ? null : str;
        this.f27175d = j10;
        this.f27176e = j11;
        if (j11 != 0 && j11 > j10) {
            l7Var.a().r().b("Event created with reverse previous/current timestamps. appId", b6.x(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            g0Var = new g0(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    l7Var.a().o().a("Param name can't be null");
                    it.remove();
                } else {
                    Object objS = l7Var.C().s(next, bundle2.get(next));
                    if (objS == null) {
                        l7Var.a().r().b("Param value can't be null", l7Var.D().b(next));
                        it.remove();
                    } else {
                        l7Var.C().A(bundle2, next, objS);
                    }
                }
            }
            g0Var = new g0(bundle2);
        }
        this.f27177f = g0Var;
    }

    public final d0 a(l7 l7Var, long j10) {
        return new d0(l7Var, this.f27174c, this.f27173a, this.b, this.f27175d, j10, this.f27177f);
    }

    public final String toString() {
        String string = this.f27177f.toString();
        String str = this.f27173a;
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

    public d0(l7 l7Var, String str, String str2, String str3, long j10, long j11, g0 g0Var) {
        o9.s.f(str2);
        o9.s.f(str3);
        o9.s.l(g0Var);
        this.f27173a = str2;
        this.b = str3;
        this.f27174c = true == TextUtils.isEmpty(str) ? null : str;
        this.f27175d = j10;
        this.f27176e = j11;
        if (j11 != 0 && j11 > j10) {
            l7Var.a().r().c("Event created with reverse previous/current timestamps. appId, name", b6.x(str2), b6.x(str3));
        }
        this.f27177f = g0Var;
    }
}
