package z6;

import android.graphics.Canvas;
import k6.n;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010#¨\u0006%"}, d2 = {"Lz6/h;", "Lk6/n;", "Lw7/g;", "svg", "Lw7/f;", "renderOptions", "", "width", "height", "<init>", "(Lw7/g;Lw7/f;II)V", "Landroid/graphics/Canvas;", "Lcoil3/Canvas;", "canvas", "", "b", "(Landroid/graphics/Canvas;)V", "a", "Lw7/g;", "getSvg", "()Lw7/g;", "Lw7/f;", "getRenderOptions", "()Lw7/f;", "c", "I", "getWidth", "()I", "d", "getHeight", "", "i", "()J", "size", "", "()Z", "shareable", "coil-svg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final w7.g svg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final w7.f renderOptions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int width;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int height;

    public h(@NotNull w7.g gVar, @Nullable w7.f fVar, int i10, int i11) {
        this.svg = gVar;
        this.renderOptions = fVar;
        this.width = i10;
        this.height = i11;
    }

    @Override // k6.n
    /* JADX INFO: renamed from: a */
    public boolean getShareable() {
        return true;
    }

    @Override // k6.n
    public void b(@NotNull Canvas canvas) {
        this.svg.o(canvas, this.renderOptions);
    }

    @Override // k6.n
    public int getHeight() {
        return this.height;
    }

    @Override // k6.n
    public int getWidth() {
        return this.width;
    }

    @Override // k6.n
    public long i() {
        return 2048L;
    }
}
