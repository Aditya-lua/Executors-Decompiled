package z6;

import com.appsflyer.sdk_base.referrer.Payload;
import k6.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.Options;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0002\u0015\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\r\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Lz6/c;", "", "", "value", "", "a", "(Ljava/lang/String;)V", "d", "Lx6/p;", "options", "c", "(Lx6/p;)V", "", "width", "height", "Lk6/n;", "f", "(II)Lk6/n;", "Lz6/c$b;", "e", "()Lz6/c$b;", "b", "(Lz6/c$b;)V", "viewBox", "", "getWidth", "()F", "getHeight", "coil-svg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lz6/c$a;", "", "Lxu/g;", Payload.SOURCE, "Lz6/c;", "a", "(Lxu/g;)Lz6/c;", "b", "coil-svg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f37310a;

        @NotNull
        public static final a b = C0677a.f37309c;

        /* JADX INFO: renamed from: z6.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0677a implements a, kotlin.jvm.internal.h {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0677a f37309c = new C0677a();

            @Override // z6.c.a
            public final c a(xu.g gVar) {
                return a7.b.a(gVar);
            }

            @Override // kotlin.jvm.internal.h
            public final jt.b<?> b() {
                return new k(1, a7.b.class, "parseSvg", "parseSvg(Lokio/BufferedSource;)Lcoil3/svg/Svg;", 1);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof a) && (obj instanceof kotlin.jvm.internal.h)) {
                    return Intrinsics.c(b(), ((kotlin.jvm.internal.h) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        /* JADX INFO: renamed from: z6.c$a$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lz6/c$a$b;", "", "<init>", "()V", "Lz6/c$a;", "DEFAULT", "Lz6/c$a;", "coil-svg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ Companion f37310a = new Companion();
        }

        @NotNull
        c a(@NotNull xu.g source);
    }

    /* JADX INFO: renamed from: z6.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lz6/c$b;", "", "", "left", "top", "right", "bottom", "<init>", "(FFFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "d", "c", "coil-svg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ViewBox {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final float left;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final float top;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final float right;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final float bottom;

        public ViewBox(float f10, float f11, float f12, float f13) {
            this.left = f10;
            this.top = f11;
            this.right = f12;
            this.bottom = f13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getBottom() {
            return this.bottom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getLeft() {
            return this.left;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getRight() {
            return this.right;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getTop() {
            return this.top;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewBox)) {
                return false;
            }
            ViewBox viewBox = (ViewBox) other;
            return Float.compare(this.left, viewBox.left) == 0 && Float.compare(this.top, viewBox.top) == 0 && Float.compare(this.right, viewBox.right) == 0 && Float.compare(this.bottom, viewBox.bottom) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
        }

        @NotNull
        public String toString() {
            return "ViewBox(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ')';
        }
    }

    void a(@NotNull String value);

    void b(@Nullable ViewBox viewBox);

    void c(@NotNull Options options);

    void d(@NotNull String value);

    @Nullable
    ViewBox e();

    @NotNull
    n f(int width, int height);

    float getHeight();

    float getWidth();
}
