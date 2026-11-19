package gl;

import com.roblox.platform.http.interfaces.InterfaceBuilder;
import mv.d0;
import sw.e;
import sw.y;

/* JADX INFO: loaded from: classes2.dex */
public class a<T> implements InterfaceBuilder<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17765a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f17766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e.a f17767d;

    public a(String str, String str2) {
        this.b = str;
        this.f17765a = str2 == null ? b() : str2;
    }

    public y a(String str) {
        y.b bVar = new y.b();
        bVar.c(str);
        bVar.g(this.f17766c);
        e.a aVar = this.f17767d;
        if (aVar != null) {
            bVar.a(aVar);
        }
        bVar.b(tw.a.f());
        return bVar.e();
    }

    public String b() {
        return "roblox.com";
    }

    @Override // com.roblox.platform.http.interfaces.InterfaceBuilder
    public T build(Class<T> cls) {
        try {
            return (T) a(c(this.b, this.f17765a)).b(cls);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return (T) a(c(this.b, b())).b(cls);
        }
    }

    public String c(String str, String str2) {
        return "https://" + str + "." + str2;
    }

    public a<T> d(e.a aVar) {
        this.f17767d = aVar;
        return this;
    }

    public a<T> e(d0 d0Var) {
        this.f17766c = d0Var;
        return this;
    }
}
