package p405r9;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p242k9.InterfaceC7498h;
import p305n9.C8953m;

/* JADX INFO: renamed from: r9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10800d {

    /* JADX INFO: renamed from: a */
    public final List f38489a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10797a f38490b;

    /* JADX INFO: renamed from: c */
    public final Executor f38491c;

    /* JADX INFO: renamed from: r9.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final List f38492a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public InterfaceC10797a f38493b;

        /* JADX INFO: renamed from: c */
        public Executor f38494c;

        @NonNull
        /* JADX INFO: renamed from: a */
        public a m41168a(@NonNull InterfaceC7498h interfaceC7498h) {
            this.f38492a.add(interfaceC7498h);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C10800d m41169b() {
            return new C10800d(this.f38492a, this.f38493b, this.f38494c, true, null);
        }
    }

    public /* synthetic */ C10800d(List list, InterfaceC10797a interfaceC10797a, Executor executor, boolean z10, C10803g c10803g) {
        C8953m.m36048m(list, "APIs must not be null.");
        C8953m.m36037b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            C8953m.m36048m(interfaceC10797a, "Listener must not be null when listener executor is set.");
        }
        this.f38489a = list;
        this.f38490b = interfaceC10797a;
        this.f38491c = executor;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static a m41164d() {
        return new a();
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public List<InterfaceC7498h> m41165a() {
        return this.f38489a;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC10797a m41166b() {
        return this.f38490b;
    }

    /* JADX INFO: renamed from: c */
    public Executor m41167c() {
        return this.f38491c;
    }
}
