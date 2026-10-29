package vf;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import lf.e0;
import lf.r;
import lf.x;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xf.b<p> f33033a;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xf.b<gg.i> f33034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<g> f33035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f33036e;

    public f(final Context context, final String str, Set<g> set, xf.b<gg.i> bVar, Executor executor) {
        this(new x(new xf.b() { // from class: vf.e
            @Override // xf.b
            public final Object get() {
                return f.d(context, str);
            }
        }), set, executor, bVar, context);
    }

    public static /* synthetic */ String c(f fVar) {
        String string;
        synchronized (fVar) {
            try {
                p pVar = fVar.f33033a.get();
                List<q> listG = pVar.g();
                pVar.f();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < listG.size(); i10++) {
                    q qVar = listG.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", qVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) qVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } catch (Throwable th2) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
        return string;
    }

    public static /* synthetic */ p d(Context context, String str) {
        return new p(context, str);
    }

    public static /* synthetic */ f e(e0 e0Var, lf.d dVar) {
        return new f((Context) dVar.a(Context.class), ((ef.e) dVar.a(ef.e.class)).o(), (Set<g>) dVar.b(g.class), (xf.b<gg.i>) dVar.d(gg.i.class), (Executor) dVar.f(e0Var));
    }

    public static /* synthetic */ Void f(f fVar) {
        synchronized (fVar) {
            fVar.f33033a.get().o(System.currentTimeMillis(), fVar.f33034c.get().a());
        }
        return null;
    }

    @NonNull
    public static lf.c<f> g() {
        final e0 e0VarA = e0.a(jf.a.class, Executor.class);
        return lf.c.d(f.class, i.class, j.class).b(r.j(Context.class)).b(r.j(ef.e.class)).b(r.m(g.class)).b(r.l(gg.i.class)).b(r.k(e0VarA)).f(new lf.g() { // from class: vf.d
            @Override // lf.g
            public final Object create(lf.d dVar) {
                return f.e(e0VarA, dVar);
            }
        }).d();
    }

    @Override // vf.i
    public Task<String> a() {
        return !u2.p.a(this.b) ? sb.m.f("") : sb.m.c(this.f33036e, new Callable() { // from class: vf.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.c(this.f33030a);
            }
        });
    }

    @Override // vf.j
    @NonNull
    public synchronized j.a b(@NonNull String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        p pVar = this.f33033a.get();
        if (!pVar.m(jCurrentTimeMillis)) {
            return j.a.NONE;
        }
        pVar.k();
        return j.a.GLOBAL;
    }

    public Task<Void> h() {
        if (this.f33035d.size() > 0 && u2.p.a(this.b)) {
            return sb.m.c(this.f33036e, new Callable() { // from class: vf.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return f.f(this.f33029a);
                }
            });
        }
        return sb.m.f(null);
    }

    public f(xf.b<p> bVar, Set<g> set, Executor executor, xf.b<gg.i> bVar2, Context context) {
        this.f33033a = bVar;
        this.f33035d = set;
        this.f33036e = executor;
        this.f33034c = bVar2;
        this.b = context;
    }
}
