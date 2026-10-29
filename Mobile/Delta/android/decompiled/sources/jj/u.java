package jj;

import android.content.Context;
import java.util.HashMap;
import mj.j0;

/* JADX INFO: loaded from: classes2.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, j> f21510a;
    public HashMap<Long, String> b;

    public class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f21511a;

        public a(String str) {
            this.f21511a = str;
        }

        @Override // jj.j
        public void a(Context context, String str) {
            gk.p.e("rbx.push", "PNS expireById() unknown type: " + this.f21511a);
        }

        @Override // jj.j
        public void c(Context context, long j10) {
            gk.p.e("rbx.push", "PNS expireToDate() unknown type: " + this.f21511a);
        }

        @Override // jj.j
        public void clear() {
            gk.p.e("rbx.push", "PNS clear() unknown type: " + this.f21511a);
        }

        @Override // jj.j
        public void d(Context context, j0 j0Var) {
            gk.p.e("rbx.push", "PNS put() unknown type: " + this.f21511a);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f21512a = new u();
    }

    public static u c() {
        return b.f21512a;
    }

    public void a() {
        this.b.clear();
        this.f21510a.clear();
        g();
    }

    public j b(String str) {
        return this.f21510a.get(str);
    }

    public j d(String str) {
        if (!this.f21510a.containsKey(str)) {
            this.f21510a.put(str, new a(str));
        }
        return this.f21510a.get(str);
    }

    public j e(String str, long j10) {
        if (!this.f21510a.containsKey(str)) {
            this.f21510a.put(str, new c(j10));
        }
        return this.f21510a.get(str);
    }

    public String f(long j10) {
        return this.b.get(Long.valueOf(j10));
    }

    public void g() {
        this.f21510a.put("FriendRequestReceived", new g());
        this.f21510a.put("FriendRequestAccepted", new f());
        this.f21510a.put("PrivateMessageReceived", new l());
    }

    public String h(long j10, String str) {
        return this.b.put(Long.valueOf(j10), str);
    }

    public void i(String str) {
        this.f21510a.remove(str);
    }

    public u() {
        this.f21510a = new HashMap<>();
        this.b = new HashMap<>();
        g();
    }
}
