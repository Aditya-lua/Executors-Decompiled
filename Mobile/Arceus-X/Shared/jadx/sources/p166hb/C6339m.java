package p166hb;

import android.content.Context;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzl;
import java.util.HashMap;
import java.util.Map;
import lb.AbstractC8101d;
import lb.InterfaceC8102e;
import p268l9.C8048k;

/* JADX INFO: renamed from: hb.m */
/* JADX INFO: loaded from: classes.dex */
public final class C6339m {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6344r<InterfaceC6332f> f24077a;

    /* JADX INFO: renamed from: b */
    public final Context f24078b;

    /* JADX INFO: renamed from: c */
    public boolean f24079c = false;

    /* JADX INFO: renamed from: d */
    public final Map<C8048k.a<InterfaceC8102e>, BinderC6338l> f24080d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final Map<C8048k.a, BinderC6336j> f24081e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final Map<C8048k.a<AbstractC8101d>, BinderC6335i> f24082f = new HashMap();

    public C6339m(Context context, InterfaceC6344r<InterfaceC6332f> interfaceC6344r) {
        this.f24078b = context;
        this.f24077a = interfaceC6344r;
    }

    /* JADX DEBUG: Class process forced to load method for inline: hb.v.g(hb.v):void */
    /* JADX INFO: renamed from: a */
    public final void m27646a(boolean z10) {
        ((C6347u) this.f24077a).f24085a.checkConnected();
        ((C6347u) this.f24077a).m27653a().mo27639q2(z10);
        this.f24079c = z10;
    }

    /* JADX INFO: renamed from: b */
    public final void m27647b() {
        synchronized (this.f24080d) {
            try {
                for (BinderC6338l binderC6338l : this.f24080d.values()) {
                    if (binderC6338l != null) {
                        ((C6347u) this.f24077a).m27653a().mo27640w(zzbc.m9571a(binderC6338l, null));
                    }
                }
                this.f24080d.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f24082f) {
            try {
                for (BinderC6335i binderC6335i : this.f24082f.values()) {
                    if (binderC6335i != null) {
                        ((C6347u) this.f24077a).m27653a().mo27640w(zzbc.m9572v3(binderC6335i, null));
                    }
                }
                this.f24082f.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (this.f24081e) {
            try {
                for (BinderC6336j binderC6336j : this.f24081e.values()) {
                    if (binderC6336j != null) {
                        ((C6347u) this.f24077a).m27653a().mo27638U(new zzl(2, null, binderC6336j, null));
                    }
                }
                this.f24081e.clear();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m27648c() {
        if (this.f24079c) {
            m27646a(false);
        }
    }
}
