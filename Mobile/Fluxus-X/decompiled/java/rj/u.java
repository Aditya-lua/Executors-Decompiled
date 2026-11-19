package rj;

import android.content.Context;
import java.util.HashMap;
import uj.j0;

/* JADX INFO: loaded from: classes2.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, j> f30769a;
    public HashMap<Long, String> b;

    public class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30770a;

        public a(String str) {
            this.f30770a = str;
        }

        @Override // rj.j
        public void a(Context context, String str) {
            ok.q.e("rbx.push", "PNS expireById() unknown type: " + this.f30770a);
        }

        @Override // rj.j
        public void c(Context context, j0 j0Var) {
            ok.q.e("rbx.push", "PNS put() unknown type: " + this.f30770a);
        }

        @Override // rj.j
        public void clear() {
            ok.q.e("rbx.push", "PNS clear() unknown type: " + this.f30770a);
        }

        @Override // rj.j
        public void d(Context context, long j10) {
            ok.q.e("rbx.push", "PNS expireToDate() unknown type: " + this.f30770a);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f30771a = new u();
    }

    public static u c() {
        return b.f30771a;
    }

    public void a() {
        this.b.clear();
        this.f30769a.clear();
        g();
    }

    public j b(String str) {
        return this.f30769a.get(str);
    }

    public j d(String str) {
        if (!this.f30769a.containsKey(str)) {
            this.f30769a.put(str, new a(str));
        }
        return this.f30769a.get(str);
    }

    public j e(String str, long j10) {
        if (!this.f30769a.containsKey(str)) {
            this.f30769a.put(str, new c(j10));
        }
        return this.f30769a.get(str);
    }

    public String f(long j10) {
        return this.b.get(Long.valueOf(j10));
    }

    public void g() {
        this.f30769a.put("FriendRequestReceived", new g());
        this.f30769a.put("FriendRequestAccepted", new f());
        this.f30769a.put("PrivateMessageReceived", new l());
    }

    public String h(long j10, String str) {
        return this.b.put(Long.valueOf(j10), str);
    }

    public void i(String str) {
        this.f30769a.remove(str);
    }

    public u() {
        this.f30769a = new HashMap<>();
        this.b = new HashMap<>();
        g();
    }
}
