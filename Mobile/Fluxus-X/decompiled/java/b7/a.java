package b7;

import a7.h;
import a7.i;
import android.graphics.RectF;
import com.github.luben.zstd.BuildConfig;
import l6.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import x7.f;
import x7.g;
import y6.Options;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019R(\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u0016\u0010\u001eR\u0014\u0010\u0011\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010\u0012\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lb7/a;", "La7/c;", "Lx7/g;", "svg", "<init>", "(Lx7/g;)V", BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "b", "(Ljava/lang/String;)V", "c", "Ly6/p;", "options", "e", "(Ly6/p;)V", BuildConfig.FLAVOR, "width", "height", "Ll6/n;", "f", "(II)Ll6/n;", "a", "Lx7/g;", "Lx7/f;", "Lx7/f;", "renderOptions", "La7/c$b;", "d", "()La7/c$b;", "(La7/c$b;)V", "viewBox", BuildConfig.FLAVOR, "getWidth", "()F", "getHeight", "coil-svg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements a7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g svg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public f renderOptions;

    public a(@NotNull g gVar) {
        this.svg = gVar;
    }

    @Override // a7.c
    public void a(@Nullable a7.c.ViewBox viewBox) {
        if (viewBox == null) {
            throw new UnsupportedOperationException();
        }
        this.svg.s(viewBox.getLeft(), viewBox.getTop(), i.b(viewBox), i.a(viewBox));
    }

    @Override // a7.c
    public void b(@NotNull String value) {
        this.svg.t(value);
    }

    @Override // a7.c
    public void c(@NotNull String value) {
        this.svg.r(value);
    }

    @Override // a7.c
    @Nullable
    public a7.c.ViewBox d() {
        RectF rectFG = this.svg.g();
        if (rectFG != null) {
            return new a7.c.ViewBox(rectFG.left, rectFG.top, rectFG.right, rectFG.bottom);
        }
        return null;
    }

    @Override // a7.c
    public void e(@NotNull Options options) {
        String strA = a7.b.a(options);
        if (strA != null) {
            f fVar = new f();
            fVar.a(strA);
            this.renderOptions = fVar;
        }
    }

    @Override // a7.c
    @NotNull
    public n f(int width, int height) {
        return new h(this.svg, this.renderOptions, width, height);
    }

    @Override // a7.c
    public float getHeight() {
        return this.svg.f();
    }

    @Override // a7.c
    public float getWidth() {
        return this.svg.h();
    }
}
