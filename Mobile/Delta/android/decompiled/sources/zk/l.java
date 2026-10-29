package zk;

import jv.y;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public class l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37638a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OkHttpClient f37639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public jv.e.a f37640d;

    public l(String str, String str2) {
        this.b = str;
        this.f37638a = str2 == null ? c() : str2;
    }

    public T a(Class<T> cls) {
        try {
            return (T) b(d(this.b, this.f37638a)).b(cls);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return (T) b(d(this.b, c())).b(cls);
        }
    }

    public y b(String str) {
        y.b bVar = new y.b();
        bVar.c(str);
        bVar.g(this.f37639c);
        jv.e.a aVar = this.f37640d;
        if (aVar != null) {
            bVar.a(aVar);
        }
        bVar.b(kv.a.f());
        return bVar.e();
    }

    public String c() {
        return "roblox.com";
    }

    public String d(String str, String str2) {
        return "https://" + str + "." + str2;
    }

    public l<T> e(jv.e.a aVar) {
        this.f37640d = aVar;
        return this;
    }

    public l<T> f(OkHttpClient okHttpClient) {
        this.f37639c = okHttpClient;
        return this;
    }
}
