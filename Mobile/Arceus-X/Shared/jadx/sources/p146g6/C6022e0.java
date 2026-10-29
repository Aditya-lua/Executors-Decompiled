package p146g6;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1126a;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import ne.InterfaceFutureC9440x;
import p095e6.InterfaceC4845a;
import p120f6.C5390j0;
import p120f6.C5406o1;
import p120f6.InterfaceC5393k0;
import p161h6.InterfaceC6292b;
import p536x5.AbstractC12732w;
import p536x5.C12708k;
import p536x5.C12728u;
import p536x5.InterfaceC12710l;

/* JADX INFO: renamed from: g6.e0 */
/* JADX INFO: loaded from: classes.dex */
public class C6022e0 implements InterfaceC12710l {

    /* JADX INFO: renamed from: d */
    public static final String f23295d = AbstractC12732w.m47443i("WMFgUpdater");

    /* JADX INFO: renamed from: a */
    public final InterfaceC6292b f23296a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4845a f23297b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5393k0 f23298c;

    @SuppressLint({"LambdaLast"})
    public C6022e0(WorkDatabase workDatabase, InterfaceC4845a interfaceC4845a, InterfaceC6292b interfaceC6292b) {
        this.f23297b = interfaceC4845a;
        this.f23296a = interfaceC6292b;
        this.f23298c = workDatabase.mo6350c0();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Void m26800b(C6022e0 c6022e0, UUID uuid, C12708k c12708k, Context context) {
        c6022e0.getClass();
        String string = uuid.toString();
        C5390j0 c5390j0Mo24787k = c6022e0.f23298c.mo24787k(string);
        if (c5390j0Mo24787k == null || c5390j0Mo24787k.state.m47391b()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        c6022e0.f23297b.mo23403a(string, c12708k);
        context.startService(C1126a.m6411c(context, C5406o1.m24872a(c5390j0Mo24787k), c12708k));
        return null;
    }

    @Override // p536x5.InterfaceC12710l
    /* JADX INFO: renamed from: a */
    public InterfaceFutureC9440x<Void> mo26801a(final Context context, final UUID uuid, final C12708k c12708k) {
        return C12728u.m47429f(this.f23296a.mo27572c(), "setForegroundAsync", new Function0() { // from class: g6.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6022e0.m26800b(this.f23289a, uuid, c12708k, context);
            }
        });
    }
}
