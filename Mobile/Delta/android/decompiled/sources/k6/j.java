package k6;

import android.graphics.Bitmap;
import kotlin.Metadata;
import m6.DecodeResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.ErrorResult;
import x6.ImageRequest;
import x6.Options;
import x6.SuccessResult;
import y6.Size;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00072\u00020\u0001:\u00027:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J1\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J'\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b'\u0010(J1\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020,H\u0016¢\u0006\u0004\b/\u0010.J\u001f\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b4\u00103J\u0017\u00105\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u0010\bJ\u001f\u00107\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lk6/j;", "Lx6/g$d;", "<init>", "()V", "Lx6/g;", "request", "", "a", "(Lx6/g;)V", "Ly6/i;", "sizeResolver", "n", "(Lx6/g;Ly6/i;)V", "Ly6/g;", "size", "m", "(Lx6/g;Ly6/g;)V", "", "input", "l", "(Lx6/g;Ljava/lang/Object;)V", "output", "k", "j", "", "i", "(Lx6/g;Ljava/lang/String;)V", "Lo6/j;", "fetcher", "Lx6/p;", "options", "h", "(Lx6/g;Lo6/j;Lx6/p;)V", "Lo6/i;", "result", "g", "(Lx6/g;Lo6/j;Lx6/p;Lo6/i;)V", "Lm6/i;", "decoder", "f", "(Lx6/g;Lm6/i;Lx6/p;)V", "Lm6/g;", "e", "(Lx6/g;Lm6/i;Lx6/p;Lm6/g;)V", "Landroid/graphics/Bitmap;", "p", "(Lx6/g;Landroid/graphics/Bitmap;)V", "o", "Ld7/d;", "transition", "r", "(Lx6/g;Ld7/d;)V", "q", "d", "Lx6/e;", "c", "(Lx6/g;Lx6/e;)V", "Lx6/t;", "b", "(Lx6/g;Lx6/t;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class j implements ImageRequest.d {

    @NotNull
    public static final j b = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"k6/j$a", "Lk6/j;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends j {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lk6/j$c;", "", "Lx6/g;", "request", "Lk6/j;", "a", "(Lx6/g;)Lk6/j;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f22204a;

        @NotNull
        public static final c b = new c() { // from class: k6.k
            @Override // k6.j.c
            public final j a(ImageRequest imageRequest) {
                return j.c.b(imageRequest);
            }
        };

        /* JADX INFO: renamed from: k6.j$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lk6/j$c$a;", "", "<init>", "()V", "Lk6/j$c;", "NONE", "Lk6/j$c;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ Companion f22204a = new Companion();
        }

        static j b(ImageRequest imageRequest) {
            return j.b;
        }

        @NotNull
        j a(@NotNull ImageRequest request);
    }

    @Override // x6.ImageRequest.d
    public void a(@NotNull ImageRequest request) {
    }

    @Override // x6.ImageRequest.d
    public void b(@NotNull ImageRequest request, @NotNull SuccessResult result) {
    }

    @Override // x6.ImageRequest.d
    public void c(@NotNull ImageRequest request, @NotNull ErrorResult result) {
    }

    @Override // x6.ImageRequest.d
    public void d(@NotNull ImageRequest request) {
    }

    public void e(@NotNull ImageRequest request, @NotNull m6.i decoder, @NotNull Options options, @Nullable DecodeResult result) {
    }

    public void f(@NotNull ImageRequest request, @NotNull m6.i decoder, @NotNull Options options) {
    }

    public void g(@NotNull ImageRequest request, @NotNull o6.j fetcher, @NotNull Options options, @Nullable o6.i result) {
    }

    public void h(@NotNull ImageRequest request, @NotNull o6.j fetcher, @NotNull Options options) {
    }

    public void i(@NotNull ImageRequest request, @Nullable String output) {
    }

    public void j(@NotNull ImageRequest request, @NotNull Object input) {
    }

    public void k(@NotNull ImageRequest request, @NotNull Object output) {
    }

    public void l(@NotNull ImageRequest request, @NotNull Object input) {
    }

    public void m(@NotNull ImageRequest request, @NotNull Size size) {
    }

    public void n(@NotNull ImageRequest request, @NotNull y6.i sizeResolver) {
    }

    public void o(@NotNull ImageRequest request, @NotNull Bitmap output) {
    }

    public void p(@NotNull ImageRequest request, @NotNull Bitmap input) {
    }

    public void q(@NotNull ImageRequest request, @NotNull d7.d transition) {
    }

    public void r(@NotNull ImageRequest request, @NotNull d7.d transition) {
    }
}
