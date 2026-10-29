package us;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    public class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m.b f32609a;
        public final /* synthetic */ g b;

        public a(m.b bVar, g gVar) {
            this.f32609a = bVar;
            this.b = gVar;
        }

        @Override // us.n
        @NonNull
        public m a() {
            return this.f32609a.b(this.b, new s());
        }
    }

    @NonNull
    public static n b(@NonNull m.b bVar, @NonNull g gVar) {
        return new a(bVar, gVar);
    }

    @NonNull
    public abstract m a();
}
