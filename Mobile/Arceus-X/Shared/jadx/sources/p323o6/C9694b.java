package p323o6;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p239k6.C7482v;
import p239k6.InterfaceC7479s;
import p287m6.EnumC8432f;
import p315nt.InterfaceC9557b;
import p537x6.Options;

/* JADX INFO: renamed from: o6.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lo6/b;", "Lo6/j;", "Landroid/graphics/Bitmap;", "data", "Lx6/p;", "options", "<init>", "(Landroid/graphics/Bitmap;Lx6/p;)V", "Lo6/i;", "a", "(Lnt/b;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "b", "Lx6/p;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9694b implements InterfaceC9702j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Bitmap data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    /* JADX INFO: renamed from: o6.b$a */
    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Lo6/b$a;", "Lo6/j$a;", "Landroid/graphics/Bitmap;", "<init>", "()V", "data", "Lx6/p;", "options", "Lk6/s;", "imageLoader", "Lo6/j;", "b", "(Landroid/graphics/Bitmap;Lx6/p;Lk6/s;)Lo6/j;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC9702j.a<Bitmap> {
        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lx6/p;Lk6/s;)Lo6/j; */
        @Override // p323o6.InterfaceC9702j.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC9702j mo38311a(@NotNull Bitmap data, @NotNull Options options, @NotNull InterfaceC7479s imageLoader) {
            return new C9694b(data, options);
        }
    }

    public C9694b(@NotNull Bitmap bitmap, @NotNull Options options) {
        this.data = bitmap;
        this.options = options;
    }

    @Override // p323o6.InterfaceC9702j
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo38310a(@NotNull InterfaceC9557b<? super InterfaceC9701i> interfaceC9557b) {
        return new ImageFetchResult(C7482v.m31088c(new BitmapDrawable(this.options.getContext().getResources(), this.data)), false, EnumC8432f.MEMORY);
    }
}
