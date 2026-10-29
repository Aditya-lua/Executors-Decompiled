package gp;

import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import java.util.Set;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: gp.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C6191k implements InterfaceC5830d<Set<JsonAdapterBinding<?>>> {

    /* JADX INFO: renamed from: gp.k$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C6191k f23601a = new C6191k();
    }

    /* JADX INFO: renamed from: a */
    public static C6191k m27276a() {
        return a.f23601a;
    }

    /* JADX INFO: renamed from: c */
    public static Set<JsonAdapterBinding<?>> m27277c() {
        return (Set) C5834h.m26194e(C3707f.m18754g());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<JsonAdapterBinding<?>> get() {
        return m27277c();
    }
}
