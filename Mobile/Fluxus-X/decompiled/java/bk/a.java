package bk;

import android.os.AsyncTask;
import androidx.annotation.NonNull;
import com.roblox.client.routing.model.RouteModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import lg.u;
import ok.n;
import ok.q;
import yh.g;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mw.c f4434a;
    public bk.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f4435c;

    /* JADX INFO: renamed from: bk.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0083a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4436a;

        static {
            int[] iArr = new int[bk.c.values().length];
            f4436a = iArr;
            try {
                iArr[bk.c.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4436a[bk.c.GAME_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4437a = new a(mw.c.d(), new bk.b(), AsyncTask.THREAD_POOL_EXECUTOR);
    }

    public static class c extends AsyncTask<String, Void, List<d>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public mw.c f4438a;
        public bk.b b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Executor f4439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f4440d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f4441e;

        /* JADX INFO: renamed from: bk.a$c$a, reason: collision with other inner class name */
        public class RunnableC0084a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f4442a;

            public RunnableC0084a(List list) {
                this.f4442a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                String strC;
                for (d dVar : this.f4442a) {
                    q.h("AppRouter", "Trying to post event: " + dVar.a().b());
                    g gVarB = g.b(dVar.a().b());
                    int i10 = C0083a.f4436a[dVar.a().ordinal()];
                    if (i10 == 1) {
                        String str = dVar.a().d()[0];
                        if (!dVar.b().containsKey(str)) {
                            c.this.b.c(dVar.a().b(), c.this.f4440d);
                            return;
                        } else {
                            try {
                                strC = g.c(Long.valueOf(dVar.b().get(str)).longValue());
                            } catch (NumberFormatException unused) {
                                c.this.b.d(dVar.a().b(), c.this.f4440d);
                                return;
                            }
                        }
                    } else if (i10 != 2) {
                        strC = null;
                    } else {
                        String str2 = dVar.a().d()[0];
                        if (!dVar.b().containsKey(str2)) {
                            c.this.b.c(dVar.a().b(), c.this.f4440d);
                            return;
                        } else {
                            try {
                                strC = String.valueOf(Long.valueOf(dVar.b().get(str2)).longValue());
                            } catch (NumberFormatException unused2) {
                                c.this.b.d(dVar.a().b(), c.this.f4440d);
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
                    c.this.f4438a.j(gVarB);
                }
            }
        }

        public c(mw.c cVar, bk.b bVar, Executor executor) {
            this.f4438a = cVar;
            this.b = bVar;
            this.f4439c = executor;
        }

        public final List<d> d(List<String> list, HashMap<String, String> map) {
            d dVar;
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                try {
                    bk.c cVarValueOf = bk.c.valueOf(list.get(i10).toUpperCase());
                    if (i10 != list.size() - 1) {
                        dVar = new d(cVarValueOf);
                    } else {
                        if (cVarValueOf.c() != map.size()) {
                            q.h("AppRouter", "Incorrect number of parameters. Stop building routes.");
                            this.b.f(cVarValueOf.b(), this.f4440d);
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
            this.f4440d = str;
            List<d> listJ = j(str);
            if (listJ.size() == 0) {
                this.b.g(this.f4440d);
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
                this.f4441e = f(strM);
                q.b("AppRouter", "ActionType: " + this.f4441e);
                List<String> listG = g(strM);
                q.b("AppRouter", "Actions: " + listG);
                if (listG.size() != 0) {
                    return d(listG, h(strM));
                }
            }
            return arrayList;
        }

        public final void k(List<d> list) {
            this.f4439c.execute(new RunnableC0084a(list));
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

    public a(mw.c cVar, bk.b bVar, Executor executor) {
        this.f4434a = cVar;
        this.b = bVar;
        this.f4435c = executor;
    }

    public static a a() {
        return b.f4437a;
    }

    public void b(String str) {
        new c(this.f4434a, this.b, this.f4435c).executeOnExecutor(this.f4435c, str);
    }
}
