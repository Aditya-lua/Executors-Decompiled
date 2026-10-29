package us;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: us.n */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11948n {

    /* JADX INFO: renamed from: us.n$a */
    public class a extends AbstractC11948n {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC11947m.b f42370a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C11941g f42371b;

        public a(InterfaceC11947m.b bVar, C11941g c11941g) {
            this.f42370a = bVar;
            this.f42371b = c11941g;
        }

        @Override // us.AbstractC11948n
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC11947m mo44602a() {
            return this.f42370a.mo44599b(this.f42371b, new C11953s());
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static AbstractC11948n m44601b(@NonNull InterfaceC11947m.b bVar, @NonNull C11941g c11941g) {
        return new a(bVar, c11941g);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public abstract InterfaceC11947m mo44602a();
}
