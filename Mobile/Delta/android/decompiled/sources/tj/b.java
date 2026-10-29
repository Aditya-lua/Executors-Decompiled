package tj;

import sg.t0;
import vi.g;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public void a() {
        g.b().q("Android-AppRouter-RouteHandledByLua");
    }

    public void b() {
        g.b().q("Android-AppRouter-RouteHandledNatively");
    }

    public void c(String str, String str2) {
        g.b().q("Android-AppRouter-ErrorIncorrectParamName");
        t0.f("appRouter", "incorrectParamName", "Event:" + str + ". URL:" + str2);
    }

    public void d(String str, String str2) {
        g.b().q("Android-AppRouter-ErrorIncorrectParamValue");
        t0.f("appRouter", "incorrectParamValue", "Event:" + str + ". URL:" + str2);
    }

    public void e(String str) {
        g.b().q("Android-AppRouter-ErrorInvalidJson");
        t0.f("appRouter", "invalidJson", str);
    }

    public void f(String str, String str2) {
        g.b().q("Android-AppRouter-ErrorNoParamsFoundForEvent");
        t0.f("appRouter", "noParamsFoundForEvent", "Event:" + str + ". URL:" + str2);
    }

    public void g(String str) {
        g.b().q("Android-AppRouter-ErrorNoRoutesParsed");
        t0.f("appRouter", "noRoutesParsed", str);
    }

    public void h() {
        g.b().q("Android-AppRouter-ParseRouteCalled");
    }

    public void i() {
        g.b().q("Android-AppRouter-PostEventWithParams");
    }

    public void j() {
        g.b().q("Android-AppRouter-PostEventWithoutParams");
    }
}
