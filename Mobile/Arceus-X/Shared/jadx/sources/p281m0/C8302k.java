package p281m0;

import android.graphics.Bitmap;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.util.Objects;
import p347p0.C10091g;
import p531x0.AbstractC12578b0;
import p531x0.InterfaceC12576a0;

/* JADX INFO: renamed from: m0.k */
/* JADX INFO: loaded from: classes.dex */
public class C8302k implements InterfaceC12576a0<b, AbstractC12578b0<byte[]>> {

    /* JADX INFO: renamed from: m0.k$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static boolean m33753a(Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    /* JADX INFO: renamed from: m0.k$b */
    public static abstract class b {
        /* JADX INFO: renamed from: c */
        public static b m33754c(AbstractC12578b0<Bitmap> abstractC12578b0, int i10) {
            return new C8272a(abstractC12578b0, i10);
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo33659a();

        /* JADX INFO: renamed from: b */
        public abstract AbstractC12578b0<Bitmap> mo33660b();
    }

    /* JADX INFO: renamed from: b */
    public static int m33751b(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 34 || !a.m33753a(bitmap)) ? 256 : 4101;
    }

    /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p531x0.InterfaceC12576a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC12578b0<byte[]> apply(b bVar) {
        AbstractC12578b0<Bitmap> abstractC12578b0Mo33660b = bVar.mo33660b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        abstractC12578b0Mo33660b.mo46929c().compress(Bitmap.CompressFormat.JPEG, bVar.mo33659a(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C10091g c10091gMo46930d = abstractC12578b0Mo33660b.mo46930d();
        Objects.requireNonNull(c10091gMo46930d);
        return AbstractC12578b0.m46938m(byteArray, c10091gMo46930d, m33751b(abstractC12578b0Mo33660b.mo46929c()), abstractC12578b0Mo33660b.mo46934h(), abstractC12578b0Mo33660b.mo46928b(), abstractC12578b0Mo33660b.mo46932f(), abstractC12578b0Mo33660b.mo46933g(), abstractC12578b0Mo33660b.mo46927a());
    }
}
