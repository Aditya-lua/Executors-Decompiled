package p607zk;

import okhttp3.OkHttpClient;
import p231jv.C7397y;
import p231jv.InterfaceC7377e;
import p257kv.C7949a;

/* JADX INFO: renamed from: zk.l */
/* JADX INFO: loaded from: classes2.dex */
public class C13832l<T> {

    /* JADX INFO: renamed from: a */
    public String f48456a;

    /* JADX INFO: renamed from: b */
    public String f48457b;

    /* JADX INFO: renamed from: c */
    public OkHttpClient f48458c;

    /* JADX INFO: renamed from: d */
    public InterfaceC7377e.a f48459d;

    public C13832l(String str, String str2) {
        this.f48457b = str;
        this.f48456a = str2 == null ? m50325c() : str2;
    }

    /* JADX INFO: renamed from: a */
    public T m50323a(Class<T> cls) {
        try {
            return (T) m50324b(m50326d(this.f48457b, this.f48456a)).m30660b(cls);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return (T) m50324b(m50326d(this.f48457b, m50325c())).m30660b(cls);
        }
    }

    /* JADX INFO: renamed from: b */
    public C7397y m50324b(String str) {
        C7397y.b bVar = new C7397y.b();
        bVar.m30672c(str);
        bVar.m30676g(this.f48458c);
        InterfaceC7377e.a aVar = this.f48459d;
        if (aVar != null) {
            bVar.m30670a(aVar);
        }
        bVar.m30671b(C7949a.m32945f());
        return bVar.m30674e();
    }

    /* JADX INFO: renamed from: c */
    public String m50325c() {
        return "roblox.com";
    }

    /* JADX INFO: renamed from: d */
    public String m50326d(String str, String str2) {
        return "https://" + str + "." + str2;
    }

    /* JADX INFO: renamed from: e */
    public C13832l<T> m50327e(InterfaceC7377e.a aVar) {
        this.f48459d = aVar;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C13832l<T> m50328f(OkHttpClient okHttpClient) {
        this.f48458c = okHttpClient;
        return this;
    }
}
