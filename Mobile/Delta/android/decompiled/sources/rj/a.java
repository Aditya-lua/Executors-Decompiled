package rj;

import android.os.AsyncTask;
import androidx.annotation.NonNull;
import com.roblox.client.routing.model.RouteModel;
import ek.n;
import ek.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import jg.u;
import oh.g;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dv.c f30733a;
    public rj.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f30734c;

    /* JADX INFO: renamed from: rj.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0535a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30735a;

        static {
            int[] iArr = new int[rj.c.values().length];
            f30735a = iArr;
            try {
                iArr[rj.c.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30735a[rj.c.GAME_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30736a = new a(dv.c.d(), new rj.b(), AsyncTask.THREAD_POOL_EXECUTOR);
    }

    public static class c extends AsyncTask<String, Void, List<d>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public dv.c f30737a;
        public rj.b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Executor f30738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f30739d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f30740e;

        /* JADX INFO: renamed from: rj.a$c$a, reason: collision with other inner class name */
        public class RunnableC0536a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f30741a;

            public RunnableC0536a(List list) {
                this.f30741a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                String strC;
                for (d dVar : this.f30741a) {
                    q.h("AppRouter", "Trying to post event: " + dVar.a().b());
                    g gVarB = g.b(dVar.a().b());
                    int i10 = C0535a.f30735a[dVar.a().ordinal()];
                    if (i10 == 1) {
                        String str = dVar.a().d()[0];
                        if (!dVar.b().containsKey(str)) {
                            c.this.b.c(dVar.a().b(), c.this.f30739d);
                            return;
                        } else {
                            try {
                                strC = g.c(Long.valueOf(dVar.b().get(str)).longValue());
                            } catch (NumberFormatException unused) {
                                c.this.b.d(dVar.a().b(), c.this.f30739d);
                                return;
                            }
                        }
                    } else if (i10 != 2) {
                        strC = null;
                    } else {
                        String str2 = dVar.a().d()[0];
                        if (!dVar.b().containsKey(str2)) {
                            c.this.b.c(dVar.a().b(), c.this.f30739d);
                            return;
                        } else {
                            try {
                                strC = String.valueOf(Long.valueOf(dVar.b().get(str2)).longValue());
                            } catch (NumberFormatException unused2) {
                                c.this.b.d(dVar.a().b(), c.this.f30739d);
                                return;
                            }
                        }
                    }
                    if (strC != null) {
                        gVarB.i(strC);
                        c.this.b.i();
                    } else {
                        c.this.b.j();
                    }
                    c.this.f30737a.j(gVarB);
                }
            }
        }

        public c(dv.c cVar, rj.b bVar, Executor executor) {
            this.f30737a = cVar;
            this.b = bVar;
            this.f30738c = executor;
        }

        public final List<d> d(List<String> list, HashMap<String, String> map) {
            d dVar;
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                try {
                    rj.c cVarValueOf = rj.c.valueOf(list.get(i10).toUpperCase());
                    if (i10 != list.size() - 1) {
                        dVar = new d(cVarValueOf);
                    } else {
                        if (cVarValueOf.c() != map.size()) {
                            q.h("AppRouter", "Incorrect number of parameters. Stop building routes.");
                            this.b.f(cVarValueOf.b(), this.f30739d);
                            return arrayList;
                        }
                        dVar = new d(cVarValueOf, map);
                    }
                    arrayList.add(dVar);
                } catch (IllegalArgumentException unused) {
                    q.h("AppRouter", "AppTarget not recognized. Stop building routes.");
                }
            }
            return arrayList;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<d> doInBackground(String... strArr) {
            this.b.h();
            RouteModel routeModelI = i(strArr[0]);
            if (routeModelI == null) {
                return Collections.EMPTY_LIST;
            }
            q.b("AppRouter", "defaultActionHandler: " + routeModelI.default_action_handler + ". action: " + routeModelI.default_action);
            if (!n(routeModelI)) {
                this.b.a();
                q.b("AppRouter", "Should be handled by Lua.");
                return Collections.EMPTY_LIST;
            }
            this.b.b();
            String str = routeModelI.default_action;
            this.f30739d = str;
            List<d> listJ = j(str);
            if (listJ.size() == 0) {
                this.b.g(this.f30739d);
            }
            return listJ;
        }

        public final String f(String str) {
            int iIndexOf = str.indexOf(47);
            if (iIndexOf == -1) {
                return null;
            }
            return str.substring(0, iIndexOf);
        }

        public final List<String> g(String str) {
            ArrayList arrayList = new ArrayList(Arrays.asList(str.split("/")));
            if (arrayList.size() != 0) {
                arrayList.remove(0);
                if (arrayList.size() != 0) {
                    String[] strArrSplit = ((String) arrayList.get(arrayList.size() - 1)).split("\\?");
                    if (strArrSplit.length != 0) {
                        arrayList.remove(arrayList.size() - 1);
                        arrayList.add(strArrSplit[0]);
                        return arrayList;
                    }
                }
            }
            return arrayList;
        }

        public HashMap<String, String> h(String str) {
            String str2;
            String[] strArrSplit = str.split("\\?");
            HashMap<String, String> map = new HashMap<>();
            if (strArrSplit.length >= 2 && (str2 = strArrSplit[1]) != null) {
                for (String str3 : str2.split("&")) {
                    if (str3 != null) {
                        String[] strArrSplit2 = str3.split("=");
                        if (strArrSplit2.length == 2) {
                            map.put(strArrSplit2[0], strArrSplit2[1]);
                        }
                    }
                }
            }
            return map;
        }

        public final RouteModel i(String str) {
            try {
                return (RouteModel) n.a(str, RouteModel.class);
            } catch (u unused) {
                q.h("AppRouter", "Invalid json string.");
                this.b.e(str);
                return null;
            }
        }

        public final List<d> j(String str) {
            ArrayList arrayList = new ArrayList();
            String strM = m(str);
            q.b("AppRouter", "Path: " + strM);
            if (strM != null) {
                this.f30740e = f(strM);
                q.b("AppRouter", "ActionType: " + this.f30740e);
                List<String> listG = g(strM);
                q.b("AppRouter", "Actions: " + listG);
                if (listG.size() != 0) {
                    return d(listG, h(strM));
                }
            }
            return arrayList;
        }

        public final void k(List<d> list) {
            this.f30738c.execute(new RunnableC0536a(list));
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<d> list) {
            super.onPostExecute(list);
            k(list);
        }

        public final String m(String str) {
            int iIndexOf = str.indexOf("://");
            if (iIndexOf == -1) {
                return null;
            }
            return str.substring(iIndexOf + 3);
        }

        public final boolean n(@NonNull RouteModel routeModel) {
            String str = routeModel.android_default_action_handler;
            return str != null ? "native".equals(str) : "native".equals(routeModel.default_action_handler);
        }
    }

    public a(dv.c cVar, rj.b bVar, Executor executor) {
        this.f30733a = cVar;
        this.b = bVar;
        this.f30734c = executor;
    }

    public static a a() {
        return b.f30736a;
    }

    public void b(String str) {
        new c(this.f30733a, this.b, this.f30734c).executeOnExecutor(this.f30734c, str);
    }
}
