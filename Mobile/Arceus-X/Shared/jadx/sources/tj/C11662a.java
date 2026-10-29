package tj;

import android.os.AsyncTask;
import androidx.annotation.NonNull;
import com.roblox.client.routing.model.RouteModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kg.C7605u;
import p138fv.C5840c;
import p151gk.C6121n;
import p151gk.C6124q;
import ph.C10258g;

/* JADX INFO: renamed from: tj.a */
/* JADX INFO: loaded from: classes2.dex */
public class C11662a {

    /* JADX INFO: renamed from: a */
    public C5840c f41224a;

    /* JADX INFO: renamed from: b */
    public C11663b f41225b;

    /* JADX INFO: renamed from: c */
    public Executor f41226c;

    /* JADX INFO: renamed from: tj.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41227a;

        static {
            int[] iArr = new int[EnumC11664c.values().length];
            f41227a = iArr;
            try {
                iArr[EnumC11664c.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41227a[EnumC11664c.GAME_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: tj.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C11662a f41228a = new C11662a(C5840c.m26204d(), new C11663b(), AsyncTask.THREAD_POOL_EXECUTOR);
    }

    /* JADX INFO: renamed from: tj.a$c */
    public static class c extends AsyncTask<String, Void, List<C11665d>> {

        /* JADX INFO: renamed from: a */
        public C5840c f41229a;

        /* JADX INFO: renamed from: b */
        public C11663b f41230b;

        /* JADX INFO: renamed from: c */
        public Executor f41231c;

        /* JADX INFO: renamed from: d */
        public String f41232d;

        /* JADX INFO: renamed from: e */
        public String f41233e;

        /* JADX INFO: renamed from: tj.a$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ List f41234a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(List list) {
                this.f41234a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                String strM39410c;
                for (C11665d c11665d : this.f41234a) {
                    C6124q.m27063h("AppRouter", "Trying to post event: " + c11665d.m43809a().m43806b());
                    C10258g c10258gM39409b = C10258g.m39409b(c11665d.m43809a().m43806b());
                    int i10 = a.f41227a[c11665d.m43809a().ordinal()];
                    if (i10 == 1) {
                        String str = c11665d.m43809a().m43808d()[0];
                        if (!c11665d.m43810b().containsKey(str)) {
                            c.this.f41230b.m43797c(c11665d.m43809a().m43806b(), c.this.f41232d);
                            return;
                        } else {
                            try {
                                strM39410c = C10258g.m39410c(Long.valueOf(c11665d.m43810b().get(str)).longValue());
                            } catch (NumberFormatException unused) {
                                c.this.f41230b.m43798d(c11665d.m43809a().m43806b(), c.this.f41232d);
                                return;
                            }
                        }
                    } else if (i10 != 2) {
                        strM39410c = null;
                    } else {
                        String str2 = c11665d.m43809a().m43808d()[0];
                        if (!c11665d.m43810b().containsKey(str2)) {
                            c.this.f41230b.m43797c(c11665d.m43809a().m43806b(), c.this.f41232d);
                            return;
                        } else {
                            try {
                                strM39410c = String.valueOf(Long.valueOf(c11665d.m43810b().get(str2)).longValue());
                            } catch (NumberFormatException unused2) {
                                c.this.f41230b.m43798d(c11665d.m43809a().m43806b(), c.this.f41232d);
                                return;
                            }
                        }
                    }
                    if (strM39410c != null) {
                        c10258gM39409b.m39416i(strM39410c);
                        c.this.f41230b.m43803i();
                    } else {
                        c.this.f41230b.m43804j();
                    }
                    c.this.f41229a.m26211j(c10258gM39409b);
                }
            }
        }

        public c(C5840c c5840c, C11663b c11663b, Executor executor) {
            this.f41229a = c5840c;
            this.f41230b = c11663b;
            this.f41231c = executor;
        }

        /* JADX INFO: renamed from: d */
        public final List<C11665d> m43784d(List<String> list, HashMap<String, String> map) {
            C11665d c11665d;
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                try {
                    EnumC11664c enumC11664cValueOf = EnumC11664c.valueOf(list.get(i10).toUpperCase());
                    if (i10 != list.size() - 1) {
                        c11665d = new C11665d(enumC11664cValueOf);
                    } else {
                        if (enumC11664cValueOf.m43807c() != map.size()) {
                            C6124q.m27063h("AppRouter", "Incorrect number of parameters. Stop building routes.");
                            this.f41230b.m43800f(enumC11664cValueOf.m43806b(), this.f41232d);
                            return arrayList;
                        }
                        c11665d = new C11665d(enumC11664cValueOf, map);
                    }
                    arrayList.add(c11665d);
                } catch (IllegalArgumentException unused) {
                    C6124q.m27063h("AppRouter", "AppTarget not recognized. Stop building routes.");
                }
            }
            return arrayList;
        }

        /* JADX DEBUG: Method merged with bridge method: doInBackground([Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<C11665d> doInBackground(String... strArr) {
            this.f41230b.m43802h();
            RouteModel routeModelM43789i = m43789i(strArr[0]);
            if (routeModelM43789i == null) {
                return Collections.EMPTY_LIST;
            }
            C6124q.m27057b("AppRouter", "defaultActionHandler: " + routeModelM43789i.default_action_handler + ". action: " + routeModelM43789i.default_action);
            if (!m43794n(routeModelM43789i)) {
                this.f41230b.m43795a();
                C6124q.m27057b("AppRouter", "Should be handled by Lua.");
                return Collections.EMPTY_LIST;
            }
            this.f41230b.m43796b();
            String str = routeModelM43789i.default_action;
            this.f41232d = str;
            List<C11665d> listM43790j = m43790j(str);
            if (listM43790j.size() == 0) {
                this.f41230b.m43801g(this.f41232d);
            }
            return listM43790j;
        }

        /* JADX INFO: renamed from: f */
        public final String m43786f(String str) {
            int iIndexOf = str.indexOf(47);
            if (iIndexOf == -1) {
                return null;
            }
            return str.substring(0, iIndexOf);
        }

        /* JADX INFO: renamed from: g */
        public final List<String> m43787g(String str) {
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

        /* JADX INFO: renamed from: h */
        public HashMap<String, String> m43788h(String str) {
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

        /* JADX INFO: renamed from: i */
        public final RouteModel m43789i(String str) {
            try {
                return (RouteModel) C6121n.m27044a(str, RouteModel.class);
            } catch (C7605u unused) {
                C6124q.m27063h("AppRouter", "Invalid json string.");
                this.f41230b.m43799e(str);
                return null;
            }
        }

        /* JADX INFO: renamed from: j */
        public final List<C11665d> m43790j(String str) {
            ArrayList arrayList = new ArrayList();
            String strM43793m = m43793m(str);
            C6124q.m27057b("AppRouter", "Path: " + strM43793m);
            if (strM43793m != null) {
                this.f41233e = m43786f(strM43793m);
                C6124q.m27057b("AppRouter", "ActionType: " + this.f41233e);
                List<String> listM43787g = m43787g(strM43793m);
                C6124q.m27057b("AppRouter", "Actions: " + listM43787g);
                if (listM43787g.size() != 0) {
                    return m43784d(listM43787g, m43788h(strM43793m));
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: k */
        public final void m43791k(List<C11665d> list) {
            this.f41231c.execute(new a(list));
        }

        /* JADX DEBUG: Method merged with bridge method: onPostExecute(Ljava/lang/Object;)V */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<C11665d> list) {
            super.onPostExecute(list);
            m43791k(list);
        }

        /* JADX INFO: renamed from: m */
        public final String m43793m(String str) {
            int iIndexOf = str.indexOf("://");
            if (iIndexOf == -1) {
                return null;
            }
            return str.substring(iIndexOf + 3);
        }

        /* JADX INFO: renamed from: n */
        public final boolean m43794n(@NonNull RouteModel routeModel) {
            String str = routeModel.android_default_action_handler;
            return str != null ? "native".equals(str) : "native".equals(routeModel.default_action_handler);
        }
    }

    public C11662a(C5840c c5840c, C11663b c11663b, Executor executor) {
        this.f41224a = c5840c;
        this.f41225b = c11663b;
        this.f41226c = executor;
    }

    /* JADX INFO: renamed from: a */
    public static C11662a m43778a() {
        return b.f41228a;
    }

    /* JADX INFO: renamed from: b */
    public void m43779b(String str) {
        new c(this.f41224a, this.f41225b, this.f41226c).executeOnExecutor(this.f41226c, str);
    }
}
