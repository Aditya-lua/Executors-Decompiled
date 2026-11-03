package xk;

import hv.y;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public class l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35761a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OkHttpClient f35762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hv.e.a f35763d;

    public l(String str, String str2) {
        this.b = str;
        this.f35761a = str2 == null ? c() : str2;
    }

    public T a(Class<T> cls) {
        try {
            return (T) b(d(this.b, this.f35761a)).b(cls);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return (T) b(d(this.b, c())).b(cls);
        }
    }

    public y b(String str) {
        y.b bVar = new y.b();
        bVar.c(str);
        bVar.g(this.f35762c);
        hv.e.a aVar = this.f35763d;
        if (aVar != null) {
            bVar.a(aVar);
        }
        bVar.b(iv.a.f());
        return bVar.e();
    }

    public String c() {
        return "roblox.com";
    }

    public String d(String str, String str2) {
        return "https://" + str + "." + str2;
    }

    public l<T> e(hv.e.a aVar) {
        this.f35763d = aVar;
        return this;
    }

    public l<T> f(OkHttpClient okHttpClient) {
        this.f35762c = okHttpClient;
        return this;
    }
}
