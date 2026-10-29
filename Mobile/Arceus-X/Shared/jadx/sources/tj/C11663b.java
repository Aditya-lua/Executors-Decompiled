package tj;

import sg.C11356t0;
import vi.C12216g;

/* JADX INFO: renamed from: tj.b */
/* JADX INFO: loaded from: classes2.dex */
public class C11663b {
    /* JADX INFO: renamed from: a */
    public void m43795a() {
        C12216g.m45228b().m45278q("Android-AppRouter-RouteHandledByLua");
    }

    /* JADX INFO: renamed from: b */
    public void m43796b() {
        C12216g.m45228b().m45278q("Android-AppRouter-RouteHandledNatively");
    }

    /* JADX INFO: renamed from: c */
    public void m43797c(String str, String str2) {
        C12216g.m45228b().m45278q("Android-AppRouter-ErrorIncorrectParamName");
        C11356t0.m42536f("appRouter", "incorrectParamName", "Event:" + str + ". URL:" + str2);
    }

    /* JADX INFO: renamed from: d */
    public void m43798d(String str, String str2) {
        C12216g.m45228b().m45278q("Android-AppRouter-ErrorIncorrectParamValue");
        C11356t0.m42536f("appRouter", "incorrectParamValue", "Event:" + str + ". URL:" + str2);
    }

    /* JADX INFO: renamed from: e */
    public void m43799e(String str) {
        C12216g.m45228b().m45278q("Android-AppRouter-ErrorInvalidJson");
        C11356t0.m42536f("appRouter", "invalidJson", str);
    }

    /* JADX INFO: renamed from: f */
    public void m43800f(String str, String str2) {
        C12216g.m45228b().m45278q("Android-AppRouter-ErrorNoParamsFoundForEvent");
        C11356t0.m42536f("appRouter", "noParamsFoundForEvent", "Event:" + str + ". URL:" + str2);
    }

    /* JADX INFO: renamed from: g */
    public void m43801g(String str) {
        C12216g.m45228b().m45278q("Android-AppRouter-ErrorNoRoutesParsed");
        C11356t0.m42536f("appRouter", "noRoutesParsed", str);
    }

    /* JADX INFO: renamed from: h */
    public void m43802h() {
        C12216g.m45228b().m45278q("Android-AppRouter-ParseRouteCalled");
    }

    /* JADX INFO: renamed from: i */
    public void m43803i() {
        C12216g.m45228b().m45278q("Android-AppRouter-PostEventWithParams");
    }

    /* JADX INFO: renamed from: j */
    public void m43804j() {
        C12216g.m45228b().m45278q("Android-AppRouter-PostEventWithoutParams");
    }
}
