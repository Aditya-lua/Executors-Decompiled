package p146g6;

import android.content.Context;
import androidx.work.C1116b;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import ne.InterfaceFutureC9440x;
import p120f6.C5369c0;
import p120f6.C5390j0;
import p161h6.InterfaceC6292b;
import p536x5.AbstractC12732w;
import p536x5.C12717o0;
import p536x5.C12728u;
import p536x5.InterfaceC12703h0;

/* JADX INFO: renamed from: g6.g0 */
/* JADX INFO: loaded from: classes.dex */
public class C6026g0 implements InterfaceC12703h0 {

    /* JADX INFO: renamed from: c */
    public static final String f23307c = AbstractC12732w.m47443i("WorkProgressUpdater");

    /* JADX INFO: renamed from: a */
    public final WorkDatabase f23308a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6292b f23309b;

    public C6026g0(WorkDatabase workDatabase, InterfaceC6292b interfaceC6292b) {
        this.f23308a = workDatabase;
        this.f23309b = interfaceC6292b;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Void m26802b(C6026g0 c6026g0, UUID uuid, C1116b c1116b) {
        c6026g0.getClass();
        String string = uuid.toString();
        AbstractC12732w abstractC12732wM47441e = AbstractC12732w.m47441e();
        String str = f23307c;
        abstractC12732wM47441e.mo47444a(str, "Updating progress for " + uuid + " (" + c1116b + ")");
        c6026g0.f23308a.m47272i();
        try {
            C5390j0 c5390j0Mo24787k = c6026g0.f23308a.mo6350c0().mo24787k(string);
            if (c5390j0Mo24787k == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (c5390j0Mo24787k.state == C12717o0.c.RUNNING) {
                c6026g0.f23308a.mo6349b0().mo24724b(new C5369c0(string, c1116b));
            } else {
                AbstractC12732w.m47441e().mo47451k(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
            }
            c6026g0.f23308a.m47267V();
            c6026g0.f23308a.m47275p();
            return null;
        } catch (Throwable th2) {
            try {
                AbstractC12732w.m47441e().mo47447d(f23307c, "Error updating Worker progress", th2);
                throw th2;
            } catch (Throwable th3) {
                c6026g0.f23308a.m47275p();
                throw th3;
            }
        }
    }

    @Override // p536x5.InterfaceC12703h0
    /* JADX INFO: renamed from: a */
    public InterfaceFutureC9440x<Void> mo26803a(Context context, final UUID uuid, final C1116b c1116b) {
        return C12728u.m47429f(this.f23309b.mo27572c(), "updateProgress", new Function0() { // from class: g6.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6026g0.m26802b(this.f23302a, uuid, c1116b);
            }
        });
    }
}
