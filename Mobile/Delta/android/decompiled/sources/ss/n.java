package ss;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    public class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m.b f31799a;
        public final /* synthetic */ g b;

        public a(m.b bVar, g gVar) {
            this.f31799a = bVar;
            this.b = gVar;
        }

        @Override // ss.n
        @NonNull
        public m a() {
            return this.f31799a.a(this.b, new s());
        }
    }

    @NonNull
    public static n b(@NonNull m.b bVar, @NonNull g gVar) {
        return new a(bVar, gVar);
    }

    @NonNull
    public abstract m a();
}
