package a7;

import android.graphics.RectF;
import k6.n;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w7.f;
import w7.g;
import x6.Options;
import z6.h;
import z6.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u0018\u0010\u001eR\u0014\u0010\u0011\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010\u0012\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"¨\u0006$"}, d2 = {"La7/a;", "Lz6/c;", "Lw7/g;", "svg", "<init>", "(Lw7/g;)V", "", "value", "", "a", "(Ljava/lang/String;)V", "d", "Lx6/p;", "options", "c", "(Lx6/p;)V", "", "width", "height", "Lk6/n;", "f", "(II)Lk6/n;", "Lw7/g;", "Lw7/f;", "b", "Lw7/f;", "renderOptions", "Lz6/c$b;", "e", "()Lz6/c$b;", "(Lz6/c$b;)V", "viewBox", "", "getWidth", "()F", "getHeight", "coil-svg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements z6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g svg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public f renderOptions;

    public a(@NotNull g gVar) {
        this.svg = gVar;
    }

    @Override // z6.c
    public void a(@NotNull String value) {
        this.svg.t(value);
    }

    @Override // z6.c
    public void b(@Nullable z6.c.ViewBox viewBox) {
        if (viewBox == null) {
            throw new UnsupportedOperationException();
        }
        this.svg.s(viewBox.getLeft(), viewBox.getTop(), i.b(viewBox), i.a(viewBox));
    }

    @Override // z6.c
    public void c(@NotNull Options options) {
        String strA = z6.b.a(options);
        if (strA != null) {
            f fVar = new f();
            fVar.a(strA);
            this.renderOptions = fVar;
        }
    }

    @Override // z6.c
    public void d(@NotNull String value) {
        this.svg.r(value);
    }

    @Override // z6.c
    @Nullable
    public z6.c.ViewBox e() {
        RectF rectFG = this.svg.g();
        if (rectFG != null) {
            return new z6.c.ViewBox(rectFG.left, rectFG.top, rectFG.right, rectFG.bottom);
        }
        return null;
    }

    @Override // z6.c
    @NotNull
    public n f(int width, int height) {
        return new h(this.svg, this.renderOptions, width, height);
    }

    @Override // z6.c
    public float getHeight() {
        return this.svg.f();
    }

    @Override // z6.c
    public float getWidth() {
        return this.svg.h();
    }
}
