package p596z6;

import android.graphics.Canvas;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p239k6.InterfaceC7474n;
import p509w7.C12318f;
import p509w7.C12319g;

/* JADX INFO: renamed from: z6.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010#¨\u0006%"}, m31665d2 = {"Lz6/h;", "Lk6/n;", "Lw7/g;", "svg", "Lw7/f;", "renderOptions", "", "width", "height", "<init>", "(Lw7/g;Lw7/f;II)V", "Landroid/graphics/Canvas;", "Lcoil3/Canvas;", "canvas", "", "b", "(Landroid/graphics/Canvas;)V", "a", "Lw7/g;", "getSvg", "()Lw7/g;", "Lw7/f;", "getRenderOptions", "()Lw7/f;", "c", "I", "getWidth", "()I", "d", "getHeight", "", "i", "()J", "size", "", "()Z", "shareable", "coil-svg_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13730h implements InterfaceC7474n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C12319g svg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final C12318f renderOptions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int width;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int height;

    public C13730h(@NotNull C12319g c12319g, @Nullable C12318f c12318f, int i10, int i11) {
        this.svg = c12319g;
        this.renderOptions = c12318f;
        this.width = i10;
        this.height = i11;
    }

    @Override // p239k6.InterfaceC7474n
    /* JADX INFO: renamed from: a */
    public boolean getShareable() {
        return true;
    }

    @Override // p239k6.InterfaceC7474n
    /* JADX INFO: renamed from: b */
    public void mo30969b(@NotNull Canvas canvas) {
        this.svg.m45854o(canvas, this.renderOptions);
    }

    @Override // p239k6.InterfaceC7474n
    public int getHeight() {
        return this.height;
    }

    @Override // p239k6.InterfaceC7474n
    public int getWidth() {
        return this.width;
    }

    @Override // p239k6.InterfaceC7474n
    /* JADX INFO: renamed from: i */
    public long mo30971i() {
        return 2048L;
    }
}
