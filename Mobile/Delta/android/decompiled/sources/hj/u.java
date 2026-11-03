package hj;

import android.content.Context;
import java.util.HashMap;
import kj.j0;

/* JADX INFO: loaded from: classes2.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, j> f19518a;
    public HashMap<Long, String> b;

    public class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f19519a;

        public a(String str) {
            this.f19519a = str;
        }

        @Override // hj.j
        public void a(Context context, String str) {
            ek.q.e("rbx.push", "PNS expireById() unknown type: " + this.f19519a);
        }

        @Override // hj.j
        public void c(Context context, j0 j0Var) {
            ek.q.e("rbx.push", "PNS put() unknown type: " + this.f19519a);
        }

        @Override // hj.j
        public void clear() {
            ek.q.e("rbx.push", "PNS clear() unknown type: " + this.f19519a);
        }

        @Override // hj.j
        public void d(Context context, long j10) {
            ek.q.e("rbx.push", "PNS expireToDate() unknown type: " + this.f19519a);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f19520a = new u();
    }

    public static u c() {
        return b.f19520a;
    }

    public void a() {
        this.b.clear();
        this.f19518a.clear();
        g();
    }

    public j b(String str) {
        return this.f19518a.get(str);
    }

    public j d(String str) {
        if (!this.f19518a.containsKey(str)) {
            this.f19518a.put(str, new a(str));
        }
        return this.f19518a.get(str);
    }

    public j e(String str, long j10) {
        if (!this.f19518a.containsKey(str)) {
            this.f19518a.put(str, new c(j10));
        }
        return this.f19518a.get(str);
    }

    public String f(long j10) {
        return this.b.get(Long.valueOf(j10));
    }

    public void g() {
        this.f19518a.put("FriendRequestReceived", new g());
        this.f19518a.put("FriendRequestAccepted", new f());
        this.f19518a.put("PrivateMessageReceived", new l());
    }

    public String h(long j10, String str) {
        return this.b.put(Long.valueOf(j10), str);
    }

    public void i(String str) {
        this.f19518a.remove(str);
    }

    public u() {
        this.f19518a = new HashMap<>();
        this.b = new HashMap<>();
        g();
    }
}
