package us;

import androidx.annotation.NonNull;
import at.C1169b;
import at.InterfaceC1168a;
import p500vs.C12260c;
import p587ys.AbstractC13445a;
import p587ys.AbstractC13448d;
import p587ys.C13449e;
import p614zs.AbstractC14042a;

/* JADX INFO: renamed from: us.g */
/* JADX INFO: loaded from: classes3.dex */
public class C11941g {

    /* JADX INFO: renamed from: a */
    public final C12260c f42348a;

    /* JADX INFO: renamed from: b */
    public final AbstractC13445a f42349b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1168a f42350c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC11937c f42351d;

    /* JADX INFO: renamed from: e */
    public final AbstractC14042a f42352e;

    /* JADX INFO: renamed from: f */
    public final AbstractC13448d f42353f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC11945k f42354g;

    /* JADX INFO: renamed from: us.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public C12260c f42355a;

        /* JADX INFO: renamed from: b */
        public AbstractC13445a f42356b;

        /* JADX INFO: renamed from: c */
        public InterfaceC1168a f42357c;

        /* JADX INFO: renamed from: d */
        public InterfaceC11937c f42358d;

        /* JADX INFO: renamed from: e */
        public AbstractC14042a f42359e;

        /* JADX INFO: renamed from: f */
        public AbstractC13448d f42360f;

        /* JADX INFO: renamed from: g */
        public InterfaceC11945k f42361g;

        @NonNull
        /* JADX INFO: renamed from: h */
        public C11941g m44579h(@NonNull C12260c c12260c, @NonNull InterfaceC11945k interfaceC11945k) {
            this.f42355a = c12260c;
            this.f42361g = interfaceC11945k;
            if (this.f42356b == null) {
                this.f42356b = AbstractC13445a.m49047a();
            }
            if (this.f42357c == null) {
                this.f42357c = new C1169b();
            }
            if (this.f42358d == null) {
                this.f42358d = new C11938d();
            }
            if (this.f42359e == null) {
                this.f42359e = AbstractC14042a.m50731a();
            }
            if (this.f42360f == null) {
                this.f42360f = new C13449e();
            }
            return new C11941g(this);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public AbstractC14042a m44567a() {
        return this.f42352e;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public InterfaceC11937c m44568b() {
        return this.f42351d;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public InterfaceC11945k m44569c() {
        return this.f42354g;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public InterfaceC1168a m44570d() {
        return this.f42350c;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public C12260c m44571e() {
        return this.f42348a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C11941g(@NonNull a aVar) {
        this.f42348a = aVar.f42355a;
        this.f42349b = aVar.f42356b;
        this.f42350c = aVar.f42357c;
        this.f42351d = aVar.f42358d;
        this.f42352e = aVar.f42359e;
        this.f42353f = aVar.f42360f;
        this.f42354g = aVar.f42361g;
    }
}
