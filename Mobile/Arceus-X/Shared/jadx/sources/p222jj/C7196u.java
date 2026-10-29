package p222jj;

import android.content.Context;
import java.util.HashMap;
import p151gk.C6124q;
import p294mj.InterfaceC8549j0;

/* JADX INFO: renamed from: jj.u */
/* JADX INFO: loaded from: classes2.dex */
public class C7196u {

    /* JADX INFO: renamed from: a */
    public HashMap<String, InterfaceC7185j> f27881a;

    /* JADX INFO: renamed from: b */
    public HashMap<Long, String> f27882b;

    /* JADX INFO: renamed from: jj.u$a */
    public class a implements InterfaceC7185j {

        /* JADX INFO: renamed from: a */
        public String f27883a;

        public a(String str) {
            this.f27883a = str;
        }

        @Override // p222jj.InterfaceC7185j
        /* JADX INFO: renamed from: a */
        public void mo29979a(Context context, String str) {
            C6124q.m27060e("rbx.push", "PNS expireById() unknown type: " + this.f27883a);
        }

        @Override // p222jj.InterfaceC7185j
        /* JADX INFO: renamed from: c */
        public void mo29980c(Context context, long j10) {
            C6124q.m27060e("rbx.push", "PNS expireToDate() unknown type: " + this.f27883a);
        }

        @Override // p222jj.InterfaceC7185j
        public void clear() {
            C6124q.m27060e("rbx.push", "PNS clear() unknown type: " + this.f27883a);
        }

        @Override // p222jj.InterfaceC7185j
        /* JADX INFO: renamed from: d */
        public void mo29981d(Context context, InterfaceC8549j0 interfaceC8549j0) {
            C6124q.m27060e("rbx.push", "PNS put() unknown type: " + this.f27883a);
        }
    }

    /* JADX INFO: renamed from: jj.u$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C7196u f27885a = new C7196u();
    }

    /* JADX INFO: renamed from: c */
    public static C7196u m30108c() {
        return b.f27885a;
    }

    /* JADX INFO: renamed from: a */
    public void m30109a() {
        this.f27882b.clear();
        this.f27881a.clear();
        m30114g();
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC7185j m30110b(String str) {
        return this.f27881a.get(str);
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC7185j m30111d(String str) {
        if (!this.f27881a.containsKey(str)) {
            this.f27881a.put(str, new a(str));
        }
        return this.f27881a.get(str);
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC7185j m30112e(String str, long j10) {
        if (!this.f27881a.containsKey(str)) {
            this.f27881a.put(str, new C7178c(j10));
        }
        return this.f27881a.get(str);
    }

    /* JADX INFO: renamed from: f */
    public String m30113f(long j10) {
        return this.f27882b.get(Long.valueOf(j10));
    }

    /* JADX INFO: renamed from: g */
    public void m30114g() {
        this.f27881a.put("FriendRequestReceived", new C7182g());
        this.f27881a.put("FriendRequestAccepted", new C7181f());
        this.f27881a.put("PrivateMessageReceived", new C7187l());
    }

    /* JADX INFO: renamed from: h */
    public String m30115h(long j10, String str) {
        return this.f27882b.put(Long.valueOf(j10), str);
    }

    /* JADX INFO: renamed from: i */
    public void m30116i(String str) {
        this.f27881a.remove(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7196u() {
        this.f27881a = new HashMap<>();
        this.f27882b = new HashMap<>();
        m30114g();
    }
}
