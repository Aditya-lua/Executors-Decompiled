package wf;

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
import org.json.JSONArray;
import org.json.JSONObject;
import p128ff.C5590e;
import p171hg.InterfaceC6404i;
import p247kf.InterfaceC7579a;
import p292mf.C8492c;
import p292mf.C8497e0;
import p292mf.C8511r;
import p292mf.C8517x;
import p292mf.InterfaceC8494d;
import p292mf.InterfaceC8500g;
import p456u2.C11787p;
import p575yf.InterfaceC13188b;
import sb.C11268m;

/* JADX INFO: renamed from: wf.f */
/* JADX INFO: loaded from: classes2.dex */
public class C12407f implements InterfaceC12410i, InterfaceC12411j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13188b<C12417p> f44375a;

    /* JADX INFO: renamed from: b */
    public final Context f44376b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13188b<InterfaceC6404i> f44377c;

    /* JADX INFO: renamed from: d */
    public final Set<InterfaceC12408g> f44378d;

    /* JADX INFO: renamed from: e */
    public final Executor f44379e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12407f(final Context context, final String str, Set<InterfaceC12408g> set, InterfaceC13188b<InterfaceC6404i> interfaceC13188b, Executor executor) {
        this(new C8517x(new InterfaceC13188b() { // from class: wf.e
            @Override // p575yf.InterfaceC13188b
            public final Object get() {
                return C12407f.m46483d(context, str);
            }
        }), set, executor, interfaceC13188b, context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m46482c(C12407f c12407f) {
        String string;
        synchronized (c12407f) {
            try {
                C12417p c12417p = c12407f.f44375a.get();
                List<AbstractC12418q> listM46500g = c12417p.m46500g();
                c12417p.m46499f();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < listM46500g.size(); i10++) {
                    AbstractC12418q abstractC12418q = listM46500g.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", abstractC12418q.mo46481c());
                    jSONObject.put("dates", new JSONArray((Collection) abstractC12418q.mo46480b()));
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 android.content.Context), (r2v0 java.lang.String) A[MD:(android.content.Context, java.lang.String):void (m)] call: wf.p.<init>(android.content.Context, java.lang.String):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C12417p m46483d(Context context, String str) {
        return new C12417p(context, str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
      (wrap android.content.Context:0x0008: CHECK_CAST (android.content.Context) (wrap java.lang.Object:0x0004: INVOKE (r7v0 mf.d), (wrap java.lang.Class:0x0002: CONST_CLASS  A[WRAPPED] android.content.Context.class) INTERFACE call: mf.d.a(java.lang.Class):java.lang.Object A[MD:<T>:(java.lang.Class<T>):T (m), WRAPPED]))
      (wrap java.lang.String:0x0012: INVOKE 
      (wrap ff.e:0x0010: CHECK_CAST (ff.e) (wrap java.lang.Object:0x000c: INVOKE (r7v0 mf.d), (wrap java.lang.Class:0x000a: CONST_CLASS  A[WRAPPED] ff.e.class) INTERFACE call: mf.d.a(java.lang.Class):java.lang.Object A[MD:<T>:(java.lang.Class<T>):T (m), WRAPPED]))
     VIRTUAL call: ff.e.o():java.lang.String A[MD:():java.lang.String (m), WRAPPED])
      (wrap java.util.Set<wf.g>:?: CAST (java.util.Set<wf.g>) (wrap java.util.Set:0x0018: INVOKE (r7v0 mf.d), (wrap java.lang.Class:0x0016: CONST_CLASS  A[WRAPPED] wf.g.class) INTERFACE call: mf.d.d(java.lang.Class):java.util.Set A[MD:<T>:(java.lang.Class<T>):java.util.Set<T> (m), WRAPPED]))
      (wrap yf.b<hg.i>:?: CAST (yf.b<hg.i>) (wrap yf.b:0x001e: INVOKE (r7v0 mf.d), (wrap java.lang.Class:0x001c: CONST_CLASS  A[WRAPPED] hg.i.class) INTERFACE call: mf.d.g(java.lang.Class):yf.b A[MD:<T>:(java.lang.Class<T>):yf.b<T> (m), WRAPPED]))
      (wrap java.util.concurrent.Executor:0x0027: CHECK_CAST (java.util.concurrent.Executor) (wrap java.lang.Object:0x0022: INVOKE (r7v0 mf.d), (r6v0 mf.e0) INTERFACE call: mf.d.f(mf.e0):java.lang.Object A[MD:<T>:(mf.e0<T>):T (m), WRAPPED]))
     A[MD:(android.content.Context, java.lang.String, java.util.Set<wf.g>, yf.b<hg.i>, java.util.concurrent.Executor):void (m)] call: wf.f.<init>(android.content.Context, java.lang.String, java.util.Set, yf.b, java.util.concurrent.Executor):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C12407f m46484e(C8497e0 c8497e0, InterfaceC8494d interfaceC8494d) {
        return new C12407f((Context) interfaceC8494d.mo34304a(Context.class), ((C5590e) interfaceC8494d.mo34304a(C5590e.class)).m25271o(), (Set<InterfaceC12408g>) interfaceC8494d.m34307d(InterfaceC12408g.class), (InterfaceC13188b<InterfaceC6404i>) interfaceC8494d.mo34310g(InterfaceC6404i.class), (Executor) interfaceC8494d.mo34309f(c8497e0));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Void m46485f(C12407f c12407f) {
        synchronized (c12407f) {
            c12407f.f44375a.get().m46508o(System.currentTimeMillis(), c12407f.f44377c.get().mo27980a());
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static C8492c<C12407f> m46486g() {
        final C8497e0 c8497e0M34315a = C8497e0.m34315a(InterfaceC7579a.class, Executor.class);
        return C8492c.m34275d(C12407f.class, InterfaceC12410i.class, InterfaceC12411j.class).m34291b(C8511r.m34359j(Context.class)).m34291b(C8511r.m34359j(C5590e.class)).m34291b(C8511r.m34362m(InterfaceC12408g.class)).m34291b(C8511r.m34361l(InterfaceC6404i.class)).m34291b(C8511r.m34360k(c8497e0M34315a)).m34295f(new InterfaceC8500g() { // from class: wf.d
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return C12407f.m46484e(c8497e0M34315a, interfaceC8494d);
            }
        }).m34293d();
    }

    @Override // wf.InterfaceC12410i
    /* JADX INFO: renamed from: a */
    public Task<String> mo46487a() {
        return !C11787p.m44085a(this.f44376b) ? C11268m.m42336f("") : C11268m.m42333c(this.f44379e, new Callable() { // from class: wf.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C12407f.m46482c(this.f44371a);
            }
        });
    }

    @Override // wf.InterfaceC12411j
    @NonNull
    /* JADX INFO: renamed from: b */
    public synchronized InterfaceC12411j.a mo46488b(@NonNull String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C12417p c12417p = this.f44375a.get();
        if (!c12417p.m46506m(jCurrentTimeMillis)) {
            return InterfaceC12411j.a.NONE;
        }
        c12417p.m46504k();
        return InterfaceC12411j.a.GLOBAL;
    }

    /* JADX INFO: renamed from: h */
    public Task<Void> m46489h() {
        if (this.f44378d.size() > 0 && C11787p.m44085a(this.f44376b)) {
            return C11268m.m42333c(this.f44379e, new Callable() { // from class: wf.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C12407f.m46485f(this.f44370a);
                }
            });
        }
        return C11268m.m42336f(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12407f(InterfaceC13188b<C12417p> interfaceC13188b, Set<InterfaceC12408g> set, Executor executor, InterfaceC13188b<InterfaceC6404i> interfaceC13188b2, Context context) {
        this.f44375a = interfaceC13188b;
        this.f44378d = set;
        this.f44379e = executor;
        this.f44377c = interfaceC13188b2;
        this.f44376b = context;
    }
}
